package com.momo.morecows.item;

import com.momo.morecows.init.ModCreativeTab;
import com.momo.morecows.item.food.ItemCheese;
import com.momo.morecows.item.food.ItemDrinkBase;
import com.momo.morecows.item.food.ItemRottenCheese;
import com.momo.morecows.item.weapon.ItemMilkBall;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();

	public static final Item LAVA_WHEAT = new ItemBase("lava_wheat").setCreativeTab(ModCreativeTab.MORECOWS_TAB);
	public static final Item WATER_WHEAT = new ItemBase("water_wheat").setCreativeTab(ModCreativeTab.MORECOWS_TAB);
	public static final Item CONDENSED_LAVA_WHEAT = new ItemBase("condensed_lava_wheat").setCreativeTab(ModCreativeTab.MORECOWS_TAB);
	public static final Item CONDENSED_WATER_WHEAT = new ItemBase("condensed_water_wheat").setCreativeTab(ModCreativeTab.MORECOWS_TAB);
	public static final Item CONDENSED_MUSHROOM_WHEAT = new ItemBase("condensed_mushroom_wheat").setCreativeTab(ModCreativeTab.MORECOWS_TAB);
	public static final Item CONDENSED_BEETROOT_WHEAT = new ItemBase("condensed_beetroot_wheat").setCreativeTab(ModCreativeTab.MORECOWS_TAB);
	public static final Item CONDENSED_ROTTEN_WHEAT = new ItemBase("condensed_rotten_wheat").setCreativeTab(ModCreativeTab.MORECOWS_TAB);
	public static final Item CONDENSED_BONE_WHEAT = new ItemBase("condensed_bone_wheat").setCreativeTab(ModCreativeTab.MORECOWS_TAB);
	public static final Item GOLDEN_WHEAT = new ItemBase("golden_wheat").setCreativeTab(ModCreativeTab.MORECOWS_TAB);

	public static final Item ROTTEN_MILK = new ItemDrinkBase("rotten_milk").setCreativeTab(ModCreativeTab.MORECOWS_TAB);
	public static final Item CHEESE = new ItemCheese("cheese", 4,4.0F, false);
	public static final Item ROTTEN_CHEESE = new ItemRottenCheese("rotten_cheese", 3, 1.0F, false);
	public static final Item CREAMER = new ItemBase("creamer").setCreativeTab(ModCreativeTab.MORECOWS_TAB);
	public static final Item ROTTEN_CREAMER = new ItemBase("rotten_creamer").setCreativeTab(ModCreativeTab.MORECOWS_TAB);

	public static final Item MILK_BALL = new ItemMilkBall("milk_ball").setCreativeTab(ModCreativeTab.MORECOWS_TAB);


	/*
	WOOD(0, 59, 2.0F, 0.0F, 15),
    STONE(1, 131, 4.0F, 1.0F, 5),
    IRON(2, 250, 6.0F, 2.0F, 14),
    DIAMOND(3, 1561, 8.0F, 3.0F, 10),
    GOLD(0, 32, 12.0F, 0.0F, 22);

    harvestLevel, maxUses, efficiency, damage, enchantability
	*/

	//Tool Material
//	public static final Item BLOOD_IRON_INGOT = new ItemBase("blood_iron_ingot");
//
//    public static final Item.ToolMaterial TOOL_MATERIAL_BLOOD =
//			EnumHelper.addToolMaterial("material_blood", 3, 512, 3.0F, 4F, 20).setRepairItem(new ItemStack( ModItems.BLOOD_IRON_INGOT));
//
//	public static final ItemKinshipSword KINSHIP_SWORD = new ItemKinshipSword("kinship_sword", TOOL_MATERIAL_BLOOD);

	//Armor
//    LEATHER("leather", 5, new int[]{1, 2, 3, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F),
//    CHAIN("chainmail", 15, new int[]{1, 4, 5, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F),
//    IRON("iron", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F),
//    GOLD("gold", 7, new int[]{1, 3, 5, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F),
//    DIAMOND("diamond", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	//Note that if you want to set a mod thing as repair material, define them before the material, otherwise it will be empty.

//    public static final ItemArmor.ArmorMaterial moroonArmorMaterial = EnumHelper.addArmorMaterial(
//            "idlframewok:armor_moroon", "idlframewok:armor_moroon", 80, new int[] {3, 6, 8, 3}, 2, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 2)
//            .setRepairItem(new ItemStack(Items.QUARTZ));
//

//	Food
//	static PotionEffect eff = new PotionEffect(MobEffects.LEVITATION, TICK_PER_SECOND * 60, 0);
//	public static final ItemFoodBase FIGHT_BREAD = (ItemFoodBase) new ItemFoodBase("war_bread", 10, 10, false).
//			setPotionEffect(eff, 1.0f).
//			setAlwaysEdible();
//    public static final ItemFoodBase MEMORY_BREAD = new ItemFoodBase("memory_bread", 3, 0.6f, false).SetXP(10);
//




	//Armor
//	public static final ItemHelmSniper helmetSniper = (ItemHelmSniper) new ItemHelmSniper("helmet_sniper", moroonArmorMaterialSniper, 1, EntityEquipmentSlot.HEAD);
//
//	public static final ItemArmorBase[] MOR_GENERAL_ARMOR =
//			{        new ItemArmorBase("mor_armor_1", moroonArmorMaterial, 1, EntityEquipmentSlot.HEAD)
//					,new ItemArmorBase("mor_armor_2", moroonArmorMaterial, 1, EntityEquipmentSlot.CHEST)
//					,new ItemArmorBase("mor_armor_3", moroonArmorMaterial, 1, EntityEquipmentSlot.LEGS)
//					,new ItemArmorBase("mor_armor_4", moroonArmorMaterial, 1, EntityEquipmentSlot.FEET)
//			};

	//public static final ItemSkillDecodeItem skillDecodeItem = (ItemSkillDecodeItem) new ItemSkillDecodeItem("skill_decode_item").setRarity(EnumRarity.RARE);

	//Package Example
//	public static final ItemPackage RANDOM_SKILL = (ItemPackage) new ItemPackage("random_skill", new Item[]{
//			Items.BLAZE_ROD, Items.PAPER
//	}).setMaxStackSize(1);
}
