package net.shadowfacts.tutorial.item;

import net.minecraft.item.ItemFood;
import net.minecraftforge.oredict.OreDictionary;
import net.shadowfacts.tutorial.TutorialMod;

public class ItemCorn extends ItemFood {

	public ItemCorn() {
		super(3, 0.6f, false);
		setUnlocalizedName("corn");
		setRegistryName("corn");
		setCreativeTab(TutorialMod.creativeTab);
	}

	public void registerItemModel() {
		TutorialMod.proxy.registerItemRenderer(this, 0, "corn");
	}

	public void initOreDict() {
		OreDictionary.registerOre("cropCorn", this);
	}

}
