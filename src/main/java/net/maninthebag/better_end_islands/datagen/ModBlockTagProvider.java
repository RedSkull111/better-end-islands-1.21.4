package net.maninthebag.better_end_islands.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.maninthebag.better_end_islands.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    private static final TagKey<Block> CHORUS_LOGS = TagKey.of(RegistryKeys.BLOCK, Identifier.of("better_end_islands:chorus_logs"));
    private static final TagKey<Block> BLOODWOOD_LOGS = TagKey.of(RegistryKeys.BLOCK, Identifier.of("better_end_islands:chorus_logs"));

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        //Logs
        getOrCreateTagBuilder(CHORUS_LOGS).setReplace(false)
                .add(ModBlocks.CHORUS_LOG)
                .add(ModBlocks.CHORUS_WOOD)
                .add(ModBlocks.STRIPPED_CHORUS_LOG)
                .add(ModBlocks.STRIPPED_CHORUS_WOOD);

        getOrCreateTagBuilder(BLOODWOOD_LOGS).setReplace(false)
                .add(ModBlocks.BLOODWOOD_LOG)
                .add(ModBlocks.BLOODWOOD_WOOD)
                .add(ModBlocks.STRIPPED_BLOODWOOD_LOG)
                .add(ModBlocks.STRIPPED_BLOODWOOD_WOOD);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN).setReplace(false)
                .addTags(CHORUS_LOGS,BLOODWOOD_LOGS);

        //Mining

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL).setReplace(false)
                .add(ModBlocks.TEST_BLOCK);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).setReplace(false)
                .add(ModBlocks.TEST_BLOCK)
                .add(ModBlocks.ENDERITE_ORE);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE).setReplace(false)
                .addTags(CHORUS_LOGS,BLOODWOOD_LOGS);

        //Misc

        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS).setReplace(false)
                .add(ModBlocks.CHORUS_SLAB);

        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS).setReplace(false)
                .add(ModBlocks.CHORUS_STAIRS);

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES).setReplace(false)
                .add(ModBlocks.CHORUS_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES).setReplace(false)
                .add(ModBlocks.CHORUS_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS).setReplace(false)
                .add(ModBlocks.CHORUS_DOOR);

        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS).setReplace(false)
                .add(ModBlocks.CHORUS_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES).setReplace(false)
                .add(ModBlocks.CHORUS_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS).setReplace(false)
                .add(ModBlocks.CHORUS_BUTTON);
    }
}
