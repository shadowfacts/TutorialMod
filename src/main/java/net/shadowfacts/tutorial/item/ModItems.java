package net.shadowfacts.tutorial.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	public static ItemBase ingotCopper;

	public static void init() {
		ingotCopper = register(new ItemBase("ingotCopper").setCreativeTab(CreativeTabs.tabMaterials));
	}

	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);

		if (item instanceof ItemBase) {
			((ItemBase)item).registerItemModel();
		}

		return item;
	}

}
