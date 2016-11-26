package net.shadowfacts.tutorial.item;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.shadowfacts.tutorial.TutorialMod;
import net.shadowfacts.tutorial.item.tool.*;

public class ModItems {

	public static ItemBase ingotCopper;
	public static ItemCorn corn;
	public static ItemCornSeed cornSeed;
	public static ItemSword copperSword;
	public static ItemPickaxe copperPickaxe;
	public static ItemShovel copperShovel;
	public static ItemAxe copperAxe;
	public static ItemHoe copperHoe;
	public static ItemArmor copperHelmet;
	public static ItemArmor copperChestplate;
	public static ItemArmor copperLeggings;
	public static ItemArmor copperBoots;

	public static void init() {
		ingotCopper = register(new ItemOre("ingot_copper", "ingot_copper"));
		corn = register(new ItemCorn());
		cornSeed = register(new ItemCornSeed());
		copperSword = register(new ItemSword(TutorialMod.copperToolMaterial, "copper_sword"));
		copperPickaxe = register(new ItemPickaxe(TutorialMod.copperToolMaterial, "copper_pickaxe"));
		copperShovel = register(new ItemShovel(TutorialMod.copperToolMaterial, "copper_shovel"));
		copperAxe = register(new ItemAxe(TutorialMod.copperToolMaterial, "copper_axe"));
		copperHoe = register(new ItemHoe(TutorialMod.copperToolMaterial, "copper_hoe"));
		copperHelmet = register(new ItemArmor(TutorialMod.copperArmorMaterial, EntityEquipmentSlot.HEAD, "copper_helmet"));
		copperChestplate = register(new ItemArmor(TutorialMod.copperArmorMaterial, EntityEquipmentSlot.CHEST, "copper_chestplate"));
		copperLeggings = register(new ItemArmor(TutorialMod.copperArmorMaterial, EntityEquipmentSlot.LEGS, "copper_leggings"));
		copperBoots = register(new ItemArmor(TutorialMod.copperArmorMaterial, EntityEquipmentSlot.FEET, "copper_boots"));
	}

	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);

		if (item instanceof ItemModelProvider) {
			((ItemModelProvider)item).registerItemModel(item);
		}
		if (item instanceof ItemOreDict) {
			((ItemOreDict)item).initOreDict();
		}

		return item;
	}

}
