package net.maninthebag.better_end_islands.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.maninthebag.better_end_islands.block.ModBlocks;
import net.maninthebag.better_end_islands.item.ModItems;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLanguageProvider extends FabricLanguageProvider {
    public ModLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us",registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {

        //Chorus Wood
        translationBuilder.add(ModBlocks.CHORUS_LOG, "Chorus Log");
        translationBuilder.add(ModBlocks.CHORUS_WOOD, "Chorus Wood");

        translationBuilder.add(ModBlocks.STRIPPED_CHORUS_LOG, "Stripped Chorus Log");
        translationBuilder.add(ModBlocks.STRIPPED_CHORUS_WOOD, "Stripped Chorus Wood");

        translationBuilder.add(ModBlocks.CHORUS_PLANKS, "Chorus Planks");

        translationBuilder.add(ModBlocks.CHORUS_STAIRS, "Chorus Stairs");
        translationBuilder.add(ModBlocks.CHORUS_SLAB, "Chorus Slab");
        translationBuilder.add(ModBlocks.CHORUS_FENCE, "Chorus Fence");

        translationBuilder.add(ModBlocks.CHORUS_FENCE_GATE, "Chorus Fence Gate");
        translationBuilder.add(ModBlocks.CHORUS_DOOR, "Chorus Door");
        translationBuilder.add(ModBlocks.CHORUS_TRAPDOOR, "Chorus Trapdoor");

        translationBuilder.add(ModBlocks.CHORUS_PRESSURE_PLATE, "Chorus Pressure Plate");
        translationBuilder.add(ModBlocks.CHORUS_BUTTON, "Chorus Button");

        translationBuilder.add(ModBlocks.CHORUS_LEAVES, "Chorus Leaves");
        translationBuilder.add(ModBlocks.CHORUS_SAPLING, "Chorus Sapling");

        //Bloodwood Wood
        translationBuilder.add(ModBlocks.BLOODWOOD_LOG, "Bloodwood Log");
        translationBuilder.add(ModBlocks.BLOODWOOD_WOOD, "Bloodwood Wood");

        translationBuilder.add(ModBlocks.STRIPPED_BLOODWOOD_LOG, "Stripped Bloodwood Log");
        translationBuilder.add(ModBlocks.STRIPPED_BLOODWOOD_WOOD, "Stripped Bloodwood Wood");

        //Ores
        translationBuilder.add(ModBlocks.ENDERITE_ORE, "Enderite Ore");

        //Item Groups
        translationBuilder.add("itemgroup.better_end_islands.better_end_islands_group", "Better End Islands");

        //Test
        translationBuilder.add(ModItems.TEST_ITEM, "Test Item");
        translationBuilder.add(ModBlocks.TEST_BLOCK, "Test Block");
    }
}
