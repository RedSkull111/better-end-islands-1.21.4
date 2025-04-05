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

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(CHORUS_LOGS).setReplace(false)
                .add(ModBlocks.CHORUS_LOG)
                .add(ModBlocks.CHORUS_WOOD)
                .add(ModBlocks.STRIPPED_CHORUS_LOG)
                .add(ModBlocks.STRIPPED_CHORUS_WOOD);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN).setReplace(false)
                .addTag(CHORUS_LOGS);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL).setReplace(false)
                .add(ModBlocks.TEST_BLOCK);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).setReplace(false)
                .add(ModBlocks.TEST_BLOCK);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE).setReplace(false)
                .addTag(CHORUS_LOGS);
    }
}
