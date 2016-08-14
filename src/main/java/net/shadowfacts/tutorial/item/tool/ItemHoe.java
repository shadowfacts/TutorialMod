package net.shadowfacts.tutorial.item.tool;

import net.minecraft.item.Item;
import net.shadowfacts.tutorial.TutorialMod;
import net.shadowfacts.tutorial.item.ItemModelProvider;

public class ItemHoe extends net.minecraft.item.ItemHoe implements ItemModelProvider {

	private String name;

	public ItemHoe(ToolMaterial material, String name) {
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
