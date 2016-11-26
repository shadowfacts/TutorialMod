package net.shadowfacts.tutorial.block;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import net.shadowfacts.tutorial.TutorialMod;
import net.shadowfacts.tutorial.item.ModItems;

public class BlockCropCorn extends BlockCrops {

	public BlockCropCorn() {
		setUnlocalizedName("crop_corn");
		setRegistryName("crop_corn");

		setCreativeTab(TutorialMod.creativeTab);
	}

	@Override
	protected Item getSeed() {
		return ModItems.cornSeed;
	}

	@Override
	protected Item getCrop() {
		return ModItems.corn;
	}

}
