package net.shadowfacts.tutorial.item.tool;

import net.shadowfacts.tutorial.TutorialMod;

public class ItemPickaxe extends net.minecraft.item.ItemPickaxe {

	private String name;

	public ItemPickaxe(ToolMaterial material, String name) {
		super(material);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
	}

	public void registerItemModel() {
		TutorialMod.proxy.registerItemRenderer(this, 0, name);
	}

}
