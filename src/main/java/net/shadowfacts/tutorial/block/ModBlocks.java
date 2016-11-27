package net.shadowfacts.tutorial.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.shadowfacts.tutorial.block.counter.BlockCounter;
import net.shadowfacts.tutorial.block.pedestal.BlockPedestal;
import net.shadowfacts.tutorial.item.ItemModelProvider;
import net.shadowfacts.tutorial.item.ItemOreDict;

public class ModBlocks {

	public static BlockOre oreCopper;
	public static BlockCropCorn cropCorn;
	public static BlockPedestal pedestal;
	public static BlockCounter counter;

	public static void init() {
		oreCopper = register(new BlockOre("ore_copper", "oreCopper"));
		cropCorn = register(new BlockCropCorn(), null);
		pedestal = register(new BlockPedestal());
		counter = register(new BlockCounter());
	}

	private static <T extends Block> T register(T block, ItemBlock itemBlock) {
		GameRegistry.register(block);
		if (itemBlock != null) {
			GameRegistry.register(itemBlock);

			if (block instanceof ItemModelProvider) {
				((ItemModelProvider)block).registerItemModel(itemBlock);
			}
			if (block instanceof ItemOreDict) {
				((ItemOreDict)block).initOreDict();
			} else if (itemBlock instanceof ItemOreDict) {
				((ItemOreDict)itemBlock).initOreDict();
			}
		}

		if (block instanceof BlockTileEntity) {
			GameRegistry.registerTileEntity(((BlockTileEntity<?>)block).getTileEntityClass(), block.getRegistryName().toString());
		}

		return block;
	}

	private static <T extends Block> T register(T block) {
		ItemBlock itemBlock = new ItemBlock(block);
		itemBlock.setRegistryName(block.getRegistryName());
		return register(block, itemBlock);
	}

}
