package net.shadowfacts.tutorial.item;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import net.shadowfacts.tutorial.TutorialMod;
import net.shadowfacts.tutorial.item.tool.*;

public class ModItems {

	public static ItemOre ingotCopper = new ItemOre("ingot_copper", "ingotCopper");
	public static ItemCorn corn = new ItemCorn();
	public static ItemCornSeed cornSeed = new ItemCornSeed();
	public static ItemSword copperSword = new ItemSword(TutorialMod.copperToolMaterial, "copper_sword");
	public static ItemPickaxe copperPickaxe = new ItemPickaxe(TutorialMod.copperToolMaterial, "copper_pickaxe");
	public static ItemShovel copperShovel = new ItemShovel(TutorialMod.copperToolMaterial, "copper_shovel");
	public static ItemAxe copperAxe = new ItemAxe(TutorialMod.copperToolMaterial, "copper_axe");
	public static ItemHoe copperHoe = new ItemHoe(TutorialMod.copperToolMaterial, "copper_hoe");
	public static ItemArmor copperHelmet = new ItemArmor(TutorialMod.copperArmorMaterial, EntityEquipmentSlot.HEAD, "copper_helmet");
	public static ItemArmor copperChestplate = new ItemArmor(TutorialMod.copperArmorMaterial, EntityEquipmentSlot.CHEST, "copper_chestplate");
	public static ItemArmor copperLeggings = new ItemArmor(TutorialMod.copperArmorMaterial, EntityEquipmentSlot.LEGS, "copper_leggings");
	public static ItemArmor copperBoots = new ItemArmor(TutorialMod.copperArmorMaterial, EntityEquipmentSlot.FEET, "copper_boots");

	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(
				ingotCopper,
				corn,
				cornSeed,
				copperSword,
				copperPickaxe,
				copperShovel,
				copperAxe,
				copperHoe,
				copperHelmet,
				copperChestplate,
				copperLeggings,
				copperBoots
		);
	}

	public static void registerModels() {
		ingotCopper.registerItemModel();
		corn.registerItemModel();
		cornSeed.registerItemModel();
		copperSword.registerItemModel();
		copperPickaxe.registerItemModel();
		copperShovel.registerItemModel();
		copperAxe.registerItemModel();
		copperHoe.registerItemModel();
		copperHelmet.registerItemModel();
		copperChestplate.registerItemModel();
		copperLeggings.registerItemModel();
		copperBoots.registerItemModel();
	}

}
