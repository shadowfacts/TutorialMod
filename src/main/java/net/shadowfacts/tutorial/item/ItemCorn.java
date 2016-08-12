package net.shadowfacts.tutorial.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.oredict.OreDictionary;
import net.shadowfacts.tutorial.TutorialMod;

public class ItemCorn extends ItemFood implements ItemModelProvider, ItemOreDict {

	public ItemCorn() {
		super(3, 0.6f, false);
		setUnlocalizedName("corn");
		setRegistryName("corn");
		setCreativeTab(TutorialMod.creativeTab);
	}

	@Override
	public void registerItemModel(Item item) {
		TutorialMod.proxy.registerItemRenderer(this, 0, "corn");
	}

	@Override
	public void initOreDict() {
		OreDictionary.registerOre("cropCorn", this);
	}

}
