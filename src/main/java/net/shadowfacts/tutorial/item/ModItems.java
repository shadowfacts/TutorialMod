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
		ingotCopper = register(new ItemOre("ingotCopper", "ingotCopper"));
		corn = register(new ItemCorn());
		cornSeed = register(new ItemCornSeed());
		copperSword = register(new ItemSword(TutorialMod.copperToolMaterial, "copperSword"));
		copperPickaxe = register(new ItemPickaxe(TutorialMod.copperToolMaterial, "copperPickaxe"));
		copperShovel = register(new ItemShovel(TutorialMod.copperToolMaterial, "copperShovel"));
		copperAxe = register(new ItemAxe(TutorialMod.copperToolMaterial, "copperAxe"));
		copperHoe = register(new ItemHoe(TutorialMod.copperToolMaterial, "copperHoe"));
		copperHelmet = register(new ItemArmor(TutorialMod.copperArmorMaterial, EntityEquipmentSlot.HEAD, "copperHelmet"));
		copperChestplate = register(new ItemArmor(TutorialMod.copperArmorMaterial, EntityEquipmentSlot.CHEST, "copperChestplate"));
		copperLeggings = register(new ItemArmor(TutorialMod.copperArmorMaterial, EntityEquipmentSlot.LEGS, "copperLeggings"));
		copperBoots = register(new ItemArmor(TutorialMod.copperArmorMaterial, EntityEquipmentSlot.FEET, "copperBoots"));
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
