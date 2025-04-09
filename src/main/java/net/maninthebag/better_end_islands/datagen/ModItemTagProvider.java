package net.maninthebag.better_end_islands.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.maninthebag.better_end_islands.BetterEndIslands;
import net.maninthebag.better_end_islands.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    private static final TagKey<Item> CHORUS_LOGS = TagKey.of(RegistryKeys.ITEM, Identifier.of("better_end_islands:chorus_logs"));
    private static final TagKey<Item> BLOODWOOD_LOGS = TagKey.of(RegistryKeys.ITEM, Identifier.of("better_end_islands:chorus_logs"));

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.PLANKS).setReplace(false)
                .add(ModBlocks.CHORUS_PLANKS.asItem());

        //Logs
        getOrCreateTagBuilder(CHORUS_LOGS).setReplace(false)
                .add(ModBlocks.CHORUS_LOG.asItem())
                .add(ModBlocks.CHORUS_WOOD.asItem())
                .add(ModBlocks.STRIPPED_CHORUS_LOG.asItem())
                .add(ModBlocks.STRIPPED_CHORUS_WOOD.asItem());

        getOrCreateTagBuilder(BLOODWOOD_LOGS).setReplace(false)
                .add(ModBlocks.BLOODWOOD_LOG.asItem())
                .add(ModBlocks.BLOODWOOD_WOOD.asItem())
                .add(ModBlocks.STRIPPED_BLOODWOOD_LOG.asItem())
                .add(ModBlocks.STRIPPED_BLOODWOOD_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN).setReplace(false)
                .addTags(CHORUS_LOGS,BLOODWOOD_LOGS);

        //Crafting

        getOrCreateTagBuilder(ItemTags.STONE_TOOL_MATERIALS).setReplace(false)
                .add(Blocks.END_STONE.asItem());

        //Misc

        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS).setReplace(false)
                .add(ModBlocks.CHORUS_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS).setReplace(false)
                .add(ModBlocks.CHORUS_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_FENCES).setReplace(false)
                .add(ModBlocks.CHORUS_FENCE.asItem());

        getOrCreateTagBuilder(ItemTags.FENCE_GATES).setReplace(false)
                .add(ModBlocks.CHORUS_FENCE_GATE.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_DOORS).setReplace(false)
                .add(ModBlocks.CHORUS_DOOR.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS).setReplace(false)
                .add(ModBlocks.CHORUS_TRAPDOOR.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES).setReplace(false)
                .add(ModBlocks.CHORUS_PRESSURE_PLATE.asItem());

        getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS).setReplace(false)
                .add(ModBlocks.CHORUS_BUTTON.asItem());
    }
}
