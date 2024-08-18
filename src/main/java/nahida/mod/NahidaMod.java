package nahida.mod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import nahida.mod.Item.ModFuelRegistry;
import nahida.mod.Item.ModItemGroups;
//import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
//import net.minecraft.registry.Registry;
import nahida.mod.Item.ModItems;
import nahida.mod.blocks.ModBlocks;
import nahida.mod.enchant.SmeltingEnchantment;
import nahida.mod.sounds.ModSounds;
import nahida.mod.util.ModCustomTrades;
import nahida.mod.world.gen.ModWorldGeneration;

public class NahidaMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "nahidamod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("面料世界你好！");
		LOGGER.info("こんにちはファブリックワールド!");
		LOGGER.info("Halo dunia Kain!");
		LOGGER.info("Initializing the register of custom items/block of " + NahidaMod.MOD_ID );
		ModItems.RegisterModItems();
		ModItemGroups.RegisterItemGroups();
		ModBlocks.registerModBlocks();
		LOGGER.info("Initializing the register of fuel intances of " + NahidaMod.MOD_ID );
		ModFuelRegistry.registerFuel(ModItems.BURNING_PAPER, 200);
		LOGGER.info("Initializing the register of custom trades of " + NahidaMod.MOD_ID );
		ModCustomTrades.registerCustomTrades();
		LOGGER.info("Initializing the register of custom sound of " + NahidaMod.MOD_ID );
		ModSounds.registerSounds();
		LOGGER.info("Initializing the register of custom enchat (Smelting) of " + NahidaMod.MOD_ID );
		SmeltingEnchantment.registerSmeltingEnchantment();
		LOGGER.info("Initializing the register of custom ore generatio of " + NahidaMod.MOD_ID );
		ModWorldGeneration.generateModWorldGen();
		
	}
}