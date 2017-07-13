package net.shadowfacts.tutorial.item;

import net.minecraftforge.oredict.OreDictionary;

public class ItemOre extends ItemBase {

	private String oreName;

	public ItemOre(String name, String oreName) {
		super(name);

		this.oreName = oreName;
	}

	public void initOreDict() {
		OreDictionary.registerOre(oreName, this);
	}

}
