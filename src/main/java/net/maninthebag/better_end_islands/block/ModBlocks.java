package net.maninthebag.better_end_islands.block;

import net.maninthebag.better_end_islands.item.ModItems;
import net.minecraft.block.Block;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.maninthebag.better_end_islands.BetterEndIslands;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {
    public static final Block TEST_BLOCK = registerBlock("test_block", Block::new, Block.Settings.create().strength(4.0f).requiresTool());

    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        final Identifier identifier = Identifier.of(BetterEndIslands.MOD_ID, name);
        final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK, identifier);

        final Block block = Blocks.register(registryKey, factory, settings);
        Items.register(block);
        return block;
    }

    public static void registerModBlocks() {
        BetterEndIslands.LOGGER.info("Registering Mod Blocks for " + BetterEndIslands.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(TEST_BLOCK);
        });
    }
}
