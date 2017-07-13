package net.shadowfacts.tutorial.block;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;
import net.shadowfacts.tutorial.block.counter.BlockCounter;
import net.shadowfacts.tutorial.block.pedestal.BlockPedestal;

public class ModBlocks {

	public static BlockOre oreCopper = new BlockOre("ore_copper", "oreCopper");
	public static BlockCropCorn cropCorn = new BlockCropCorn();
	public static BlockPedestal pedestal = new BlockPedestal();
	public static BlockCounter counter = new BlockCounter();

	public static void register(IForgeRegistry<Block> registry) {
		registry.registerAll(
				oreCopper,
				cropCorn,
				pedestal,
				counter
		);

		GameRegistry.registerTileEntity(pedestal.getTileEntityClass(), pedestal.getRegistryName().toString());
		GameRegistry.registerTileEntity(counter.getTileEntityClass(), counter.getRegistryName().toString());
	}

	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
		registry.registerAll(
				oreCopper.createItemBlock(),
				pedestal.createItemBlock(),
				counter.createItemBlock()
		);
	}

	public static void registerModels() {
		oreCopper.registerItemModel(Item.getItemFromBlock(oreCopper));
		pedestal.registerItemModel(Item.getItemFromBlock(pedestal));
		counter.registerItemModel(Item.getItemFromBlock(counter));
	}

}
