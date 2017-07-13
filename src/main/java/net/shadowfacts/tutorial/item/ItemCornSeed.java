package net.shadowfacts.tutorial.item;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;
import net.shadowfacts.tutorial.TutorialMod;
import net.shadowfacts.tutorial.block.ModBlocks;

public class ItemCornSeed extends ItemSeeds {

	public ItemCornSeed() {
		super(ModBlocks.cropCorn, Blocks.FARMLAND);
		setUnlocalizedName("corn_seed");
		setRegistryName("corn_seed");

		setCreativeTab(TutorialMod.creativeTab);
	}

	public void registerItemModel() {
		TutorialMod.proxy.registerItemRenderer(this, 0, "corn_seed");
	}

}
