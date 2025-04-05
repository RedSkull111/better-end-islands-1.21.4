package net.maninthebag.better_end_islands.block;

import net.maninthebag.better_end_islands.item.ModItems;
import net.maninthebag.better_end_islands.world.tree.ModSaplingGenerators;
import net.minecraft.block.*;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.maninthebag.better_end_islands.BetterEndIslands;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {
    public static final Block TEST_BLOCK = registerBlock("test_block", Block::new, Block.Settings.create().strength(4.0f).requiresTool());

    //Chorus Wood
    public static final Block CHORUS_LOG = registerBlock("chorus_log", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_LOG));
    public static final Block CHORUS_WOOD = registerBlock("chorus_wood", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_WOOD));

    public static final Block STRIPPED_CHORUS_LOG = registerBlock("stripped_chorus_log", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG));
    public static final Block STRIPPED_CHORUS_WOOD = registerBlock("stripped_chorus_wood", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD));

    public static final Block CHORUS_PLANKS = registerBlock("chorus_planks", Block::new, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS));

    public static final Block CHORUS_LEAVES = registerBlock("chorus_leaves", LeavesBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_LEAVES));

    public static final Block CHORUS_SAPLING = registerBlock("chorus_sapling", settings -> new SaplingBlock(ModSaplingGenerators.CHORUS,settings),AbstractBlock.Settings.copy(Blocks.OAK_SAPLING));

    private static Block registerBlock(String name, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        final Identifier identifier = Identifier.of(BetterEndIslands.MOD_ID, name);
        final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK, identifier);

        final Block block = Blocks.register(registryKey, factory, settings);
        Items.register(block);
        return block;
    }

    public static void registerModBlocks() {
        BetterEndIslands.LOGGER.info("Registering Mod Blocks for " + BetterEndIslands.MOD_ID);
    }
}
