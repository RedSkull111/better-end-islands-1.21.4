package net.maninthebag.better_end_islands;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.maninthebag.better_end_islands.block.ModBlocks;
import net.maninthebag.better_end_islands.item.ModItemGroups;
import net.maninthebag.better_end_islands.item.ModItems;
import net.minecraft.block.FireBlock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterEndIslands implements ModInitializer {
	public static final String MOD_ID = "better_end_islands";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();

		ModBlocks.registerModBlocks();

		StrippableBlockRegistry.register(ModBlocks.CHORUS_LOG, ModBlocks.STRIPPED_CHORUS_LOG);
		StrippableBlockRegistry.register(ModBlocks.CHORUS_WOOD, ModBlocks.STRIPPED_CHORUS_WOOD);
	}
}