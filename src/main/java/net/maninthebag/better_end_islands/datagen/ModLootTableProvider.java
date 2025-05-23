package net.maninthebag.better_end_islands.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.maninthebag.better_end_islands.block.ModBlocks;
import net.maninthebag.better_end_islands.item.ModItems;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        //Chorus Wood
        addDrop(ModBlocks.CHORUS_LOG);
        addDrop(ModBlocks.CHORUS_WOOD);

        addDrop(ModBlocks.CHORUS_LEAVES, leavesDrops(ModBlocks.CHORUS_LEAVES, ModBlocks.CHORUS_SAPLING, 0.0625f));

        addDrop(ModBlocks.CHORUS_PLANKS);

        addDrop(ModBlocks.CHORUS_STAIRS);
        addDrop(ModBlocks.CHORUS_SLAB);
        addDrop(ModBlocks.CHORUS_FENCE);

        addDrop(ModBlocks.CHORUS_FENCE_GATE);
        addDrop(ModBlocks.CHORUS_DOOR);
        addDrop(ModBlocks.CHORUS_TRAPDOOR);

        addDrop(ModBlocks.CHORUS_PRESSURE_PLATE);
        doorDrops(ModBlocks.CHORUS_DOOR);

        addDrop(ModBlocks.STRIPPED_CHORUS_LOG);
        addDrop(ModBlocks.STRIPPED_CHORUS_WOOD);

        addDrop(ModBlocks.CHORUS_PLANKS);
        addDrop(ModBlocks.CHORUS_SAPLING);

        //Bloodwood Wood
        addDrop(ModBlocks.BLOODWOOD_LOG);
        addDrop(ModBlocks.BLOODWOOD_WOOD);

        addDrop(ModBlocks.STRIPPED_BLOODWOOD_LOG);
        addDrop(ModBlocks.STRIPPED_BLOODWOOD_WOOD);

        //Ores
        addDrop(ModBlocks.ENDERITE_ORE);

        //Test
        addDrop(ModBlocks.TEST_BLOCK, ModItems.TEST_ITEM);
    }
}
