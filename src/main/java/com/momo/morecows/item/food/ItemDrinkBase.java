package com.momo.morecows.item.food;

import com.momo.morecows.item.ItemBase;
import com.momo.morecows.util.IHasModel;
import javafx.scene.effect.Effect;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemDrinkBase extends ItemBase implements IHasModel
{
    public ItemDrinkBase(String name)
    {
        super(name);
        setMaxStackSize(1);
    }

    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
    {
        if (!worldIn.isRemote)
        {
            entityLiving.addPotionEffect(new PotionEffect(MobEffects.HUNGER, 30*20, 1, false, true));
        }

        if (entityLiving instanceof EntityPlayerMP)
        {
            EntityPlayerMP entityplayermp = (EntityPlayerMP)entityLiving;
            CriteriaTriggers.CONSUME_ITEM.trigger(entityplayermp, stack);
            entityplayermp.addStat(StatList.getObjectUseStats(this));
        }

        if (entityLiving instanceof EntityPlayer && !((EntityPlayer)entityLiving).capabilities.isCreativeMode)
        {
            stack.shrink(1);
        }

        return stack.isEmpty() ? new ItemStack(Items.BUCKET) : stack;
    }

    public int getMaxItemUseDuration(ItemStack stack)
    {
        return 32;
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack stack)
    {
        return EnumAction.DRINK;
    }

    @Override
    public net.minecraftforge.common.capabilities.ICapabilityProvider initCapabilities(ItemStack stack, net.minecraft.nbt.NBTTagCompound nbt) {
        return new net.minecraftforge.fluids.capability.wrappers.FluidBucketWrapper(stack);
    }

    /**
     * Called when the equipped item is right clicked.
     */
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
        playerIn.setActiveHand(handIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
    }

}
