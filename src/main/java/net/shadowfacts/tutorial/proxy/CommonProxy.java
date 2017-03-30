package net.shadowfacts.tutorial.proxy;

import net.minecraft.item.Item;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;

public class CommonProxy {

	public void registerItemRenderer(Item item, int meta, String id) {

	}

	public String localize(String unlocalized, Object... args) {
		return I18n.translateToLocalFormatted(unlocalized, args);
	}

	public void registerRenderers() {
	}

}
