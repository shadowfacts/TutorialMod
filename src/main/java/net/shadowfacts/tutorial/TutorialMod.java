package net.shadowfacts.tutorial;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.shadowfacts.tutorial.block.ModBlocks;
import net.shadowfacts.tutorial.client.TutorialTab;
import net.shadowfacts.tutorial.item.ModItems;
import net.shadowfacts.tutorial.proxy.CommonProxy;
import net.shadowfacts.tutorial.recipe.ModRecipes;
import net.shadowfacts.tutorial.world.ModWorldGen;

@Mod(modid = TutorialMod.modId, name = TutorialMod.name, version = TutorialMod.version)
public class TutorialMod {

	public static final String modId = "tutorial";
	public static final String name = "Tutorial Mod";
	public static final String version = "1.0.0";

	@Mod.Instance(modId)
	public static TutorialMod instance;

	@SidedProxy(serverSide = "net.shadowfacts.tutorial.proxy.CommonProxy", clientSide = "net.shadowfacts.tutorial.proxy.ClientProxy")
	public static CommonProxy proxy;

	public static final TutorialTab creativeTab = new TutorialTab();
	public static final Item.ToolMaterial copperToolMaterial = EnumHelper.addToolMaterial("COPPER", 2, 500, 6, 2, 14);
	public static final ItemArmor.ArmorMaterial copperArmorMaterial = EnumHelper.addArmorMaterial("COPPER", modId + ":copper", 15, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModBlocks.init();
		ModItems.init();
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new ModGuiHandler());
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		ModRecipes.init();
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

}