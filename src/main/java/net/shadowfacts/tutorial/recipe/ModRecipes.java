package net.shadowfacts.tutorial.recipe;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.shadowfacts.tutorial.block.ModBlocks;
import net.shadowfacts.tutorial.item.ModItems;

public class ModRecipes {

	public static void init() {
//		Ore Dict
		ModBlocks.oreCopper.initOreDict();
		ModItems.ingotCopper.initOreDict();
		ModItems.corn.initOreDict();

//		Smelting
		GameRegistry.addSmelting(ModBlocks.oreCopper, new ItemStack(ModItems.ingotCopper), 0.7f);
	}

}
