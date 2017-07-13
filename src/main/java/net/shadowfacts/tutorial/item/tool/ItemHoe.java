package net.shadowfacts.tutorial.item.tool;

import net.shadowfacts.tutorial.TutorialMod;

public class ItemHoe extends net.minecraft.item.ItemHoe {

	private String name;

	public ItemHoe(ToolMaterial material, String name) {
		super(material);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
	}

	public void registerItemModel() {
		TutorialMod.proxy.registerItemRenderer(this, 0, name);
	}

}
