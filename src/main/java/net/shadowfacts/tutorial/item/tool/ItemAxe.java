package net.shadowfacts.tutorial.item.tool;

import net.minecraft.item.Item;
import net.shadowfacts.tutorial.TutorialMod;
import net.shadowfacts.tutorial.item.ItemModelProvider;

public class ItemAxe extends net.minecraft.item.ItemAxe implements ItemModelProvider {

	private String name;

	public ItemAxe(ToolMaterial material, String name) {
		super(material, 8f, -3.1f);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
	}

	@Override
	public void registerItemModel(Item item) {
		TutorialMod.proxy.registerItemRenderer(this, 0, name);
	}

}
