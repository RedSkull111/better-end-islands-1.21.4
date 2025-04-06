package net.maninthebag.better_end_islands.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.maninthebag.better_end_islands.BetterEndIslands;
import net.maninthebag.better_end_islands.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.PLANKS).setReplace(false)
                .add(ModBlocks.CHORUS_PLANKS.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN).setReplace(false)
                .add(ModBlocks.CHORUS_LOG.asItem());

        getOrCreateTagBuilder(ItemTags.STONE_TOOL_MATERIALS).setReplace(false)
                .add(Blocks.END_STONE.asItem());
    }
}
