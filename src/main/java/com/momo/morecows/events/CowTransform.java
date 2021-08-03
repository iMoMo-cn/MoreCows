package com.momo.morecows.events;

import com.momo.morecows.IdlFramework;
import com.momo.morecows.entity.creatures.misc.EntityBeefroot;
import com.momo.morecows.entity.creatures.misc.EntityLavaCow;
import com.momo.morecows.entity.creatures.misc.EntityModCow;
import com.momo.morecows.entity.creatures.misc.EntityWaterCow;
import com.momo.morecows.item.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = IdlFramework.MODID)
public class CowTransform  {

    @SubscribeEvent
    public static void selTransform(PlayerInteractEvent.EntityInteractSpecific evt){
        EntityPlayer player= evt.getEntityPlayer();
        Entity target = evt.getTarget();
        EnumHand hand = evt.getHand();
        ItemStack itemstack = player.getHeldItem(hand);

        if(target instanceof EntityCow && !((EntityCow) target).isChild() && !target.world.isRemote)
        {
            if (!(target instanceof EntityModCow) && !(target instanceof EntityMooshroom))
            {
                //lava cow
                if (itemstack.getItem() == ModItems.CONDENSED_LAVA_WHEAT) {

                    if (!player.capabilities.isCreativeMode) { itemstack.shrink(1); }

                    transform(target, new EntityLavaCow(target.world));
                }

                //water cow
                if (itemstack.getItem() == ModItems.CONDENSED_WATER_WHEAT) {

                    if (!player.capabilities.isCreativeMode) { itemstack.shrink(1); }

                    transform(target, new EntityWaterCow(target.world));
                }

                //mooshroom
                if (itemstack.getItem() == ModItems.CONDENSED_MUSHROOM_WHEAT) {

                    if (!player.capabilities.isCreativeMode) { itemstack.shrink(1); }

                    transform(target, new EntityMooshroom(target.world));
                }

                //beefroot
                if (itemstack.getItem() == ModItems.CONDENSED_BEETROOT_WHEAT) {

                    if (!player.capabilities.isCreativeMode) { itemstack.shrink(1); }

                    transform(target, new EntityBeefroot(target.world));
                }
            }
        }
    }

    private static void transform(Entity target, EntityCow newborn)
    {
        newborn.setLocationAndAngles(target.posX, target.posY, target.posZ, target.rotationYaw, target.rotationPitch);
        newborn.setHealth(((EntityCow) target).getHealth());
        newborn.renderYawOffset = ((EntityCow) target).renderYawOffset;

        if (target.hasCustomName())
        {
            newborn.setCustomNameTag(target.getCustomNameTag());
        }

        target.playSound(SoundEvents.BLOCK_DISPENSER_LAUNCH, 1.0F, 1.0F);
        ((net.minecraft.world.WorldServer)target.world).spawnParticle(EnumParticleTypes.EXPLOSION_LARGE, false, target.posX, target.posY + (double)(target.height / 2.0F), target.posZ, 1, 0.0D, 0.0D, 0.0D, 0.0D);

        target.world.spawnEntity(newborn);
        target.setDead();
    }
}
