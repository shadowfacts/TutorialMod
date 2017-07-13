package net.shadowfacts.tutorial.item.tool;

import net.shadowfacts.tutorial.TutorialMod;

public class ItemSword extends net.minecraft.item.ItemSword {

	private String name;

	public ItemSword(ToolMaterial material, String name) {
		super(material);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
	}

	public void registerItemModel() {
		TutorialMod.proxy.registerItemRenderer(this, 0, name);
	}

}
