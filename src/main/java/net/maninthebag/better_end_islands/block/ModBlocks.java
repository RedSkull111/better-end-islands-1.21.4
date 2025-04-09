package net.maninthebag.better_end_islands.block;

import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
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

import java.util.Map;
import java.util.function.Function;

public class ModBlocks {
    public static final Block TEST_BLOCK = registerBlock("test_block", Block::new, Block.Settings.create().strength(4.0f).requiresTool());

    private static final Map<String, WoodType> VALUES = new Object2ObjectArrayMap<>();

    //Chorus Wood
    public static final WoodType CHORUS = registerWoodType(new WoodType("chorus", BlockSetType.OAK));

    public static final Block CHORUS_LOG = registerBlock("chorus_log", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_LOG));
    public static final Block CHORUS_WOOD = registerBlock("chorus_wood", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_WOOD));

    public static final Block STRIPPED_CHORUS_LOG = registerBlock("stripped_chorus_log", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG));
    public static final Block STRIPPED_CHORUS_WOOD = registerBlock("stripped_chorus_wood", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD));

    public static final Block CHORUS_PLANKS = registerBlock("chorus_planks", Block::new, AbstractBlock.Settings.copy(Blocks.OAK_PLANKS));

    public static final Block CHORUS_STAIRS = registerBlock("chorus_stairs", settings -> new StairsBlock(CHORUS_PLANKS.getDefaultState(), settings), AbstractBlock.Settings.copy(Blocks.OAK_STAIRS));
    public static final Block CHORUS_SLAB = registerBlock("chorus_slab", SlabBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_SLAB));
    public static final Block CHORUS_FENCE = registerBlock("chorus_fence", FenceBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_FENCE));

    public static final Block CHORUS_FENCE_GATE = registerBlock("chorus_fence_gate", settings -> new FenceGateBlock(CHORUS,settings), AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE));
    public static final Block CHORUS_DOOR = registerBlock("chorus_door", settings -> new DoorBlock(BlockSetType.OAK, settings), AbstractBlock.Settings.copy(Blocks.OAK_DOOR));
    public static final Block CHORUS_TRAPDOOR = registerBlock("chorus_trapdoor", settings -> new TrapdoorBlock(BlockSetType.OAK, settings), AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR));

    public static final Block CHORUS_PRESSURE_PLATE = registerBlock("chorus_pressure_plate", settings -> new PressurePlateBlock(BlockSetType.OAK, settings), AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE));
    public static final Block CHORUS_BUTTON = registerBlock("chorus_button", settings -> new ButtonBlock(BlockSetType.OAK, 10, settings), AbstractBlock.Settings.copy(Blocks.OAK_BUTTON));

    public static final Block CHORUS_LEAVES = registerBlock("chorus_leaves", LeavesBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_LEAVES));

    public static final Block CHORUS_SAPLING = registerBlock("chorus_sapling", settings -> new SaplingBlock(ModSaplingGenerators.CHORUS_TREE,settings),AbstractBlock.Settings.copy(Blocks.DARK_OAK_SAPLING));

    //BloodWood Wood
    public static final Block BLOODWOOD_LOG = registerBlock("bloodwood_log", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_LOG));
    public static final Block BLOODWOOD_WOOD = registerBlock("bloodwood_wood", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.OAK_WOOD));

    public static final Block STRIPPED_BLOODWOOD_LOG = registerBlock("stripped_bloodwood_log", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG));
    public static final Block STRIPPED_BLOODWOOD_WOOD = registerBlock("stripped_bloodwood_wood", PillarBlock::new, AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD));

    //Ores
    public static final Block ENDERITE_ORE = registerBlock("enderite_ore", Block::new, AbstractBlock.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE).strength(4f).requiresTool());

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

    private static WoodType registerWoodType(WoodType type) {
        VALUES.put(type.name(),type);
        return type;
    }
}
