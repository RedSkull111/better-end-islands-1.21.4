package net.maninthebag.better_end_islands;

import net.fabricmc.api.ModInitializer;

import net.maninthebag.better_end_islands.block.ModBlocks;
import net.maninthebag.better_end_islands.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterEndIslands implements ModInitializer {
	public static final String MOD_ID = "better_end_islands";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}