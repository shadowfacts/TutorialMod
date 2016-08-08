package net.shadowfacts.tutorial.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	public static ItemBase ingotCopper;
	public static ItemBase corn;
	public static ItemCornSeed cornSeed;

	public static void init() {
		ingotCopper = register(new ItemOre("ingotCopper", "ingotCopper"));
		corn = register(new ItemOre("corn", "cropCorn"));
		cornSeed = register(new ItemCornSeed());
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
