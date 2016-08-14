package net.shadowfacts.tutorial.item.tool;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;
import net.shadowfacts.tutorial.TutorialMod;
import net.shadowfacts.tutorial.item.ItemModelProvider;

public class ItemShovel extends ItemSpade implements ItemModelProvider {

	private String name;

	public ItemShovel(ToolMaterial material, String name) {
		super(material);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
	}

	@Override
	public void registerItemModel(Item item) {
		TutorialMod.proxy.registerItemRenderer(this, 0, name);
	}

}
