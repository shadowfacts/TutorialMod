package net.shadowfacts.tutorial.client;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.shadowfacts.tutorial.TutorialMod;
import net.shadowfacts.tutorial.item.ModItems;

public class TutorialTab extends CreativeTabs {

	public TutorialTab() {
		super(TutorialMod.modId);
		setBackgroundImageName("tutorialmod.png");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.ingotCopper);
	}

	@Override
	public boolean hasSearchBar() {
		return true;
	}

}
