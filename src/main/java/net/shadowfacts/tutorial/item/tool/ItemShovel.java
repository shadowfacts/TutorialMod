package net.shadowfacts.tutorial.item.tool;

import net.minecraft.item.ItemSpade;
import net.shadowfacts.tutorial.TutorialMod;

public class ItemShovel extends ItemSpade {

	private String name;

	public ItemShovel(ToolMaterial material, String name) {
		super(material);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
	}

	public void registerItemModel() {
		TutorialMod.proxy.registerItemRenderer(this, 0, name);
	}

}
