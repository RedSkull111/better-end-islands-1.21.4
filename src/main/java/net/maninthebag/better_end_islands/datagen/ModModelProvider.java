package net.maninthebag.better_end_islands.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.maninthebag.better_end_islands.block.ModBlockFamilies;
import net.maninthebag.better_end_islands.block.ModBlocks;
import net.maninthebag.better_end_islands.item.ModItems;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import net.minecraft.client.data.TexturedModel;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        //Chorus Wood
        blockStateModelGenerator.registerLog(ModBlocks.CHORUS_LOG).log(ModBlocks.CHORUS_LOG).wood(ModBlocks.CHORUS_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_CHORUS_LOG).log(ModBlocks.STRIPPED_CHORUS_LOG).wood(ModBlocks.STRIPPED_CHORUS_WOOD);

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHORUS_PLANKS).family(ModBlockFamilies.CHORUS_FAMILY);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHORUS_LEAVES);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.CHORUS_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);

        //Bloodwood Wood
        blockStateModelGenerator.registerLog(ModBlocks.BLOODWOOD_LOG).log(ModBlocks.BLOODWOOD_LOG).wood(ModBlocks.BLOODWOOD_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_BLOODWOOD_LOG).log(ModBlocks.STRIPPED_BLOODWOOD_LOG).wood(ModBlocks.STRIPPED_BLOODWOOD_WOOD);

        //Ores
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ENDERITE_ORE);

        //Test Block
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TEST_BLOCK);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.TEST_ITEM, Models.GENERATED);

        itemModelGenerator.register(ModBlocks.CHORUS_SAPLING.asItem(), Models.GENERATED);
    }
}
