package net.maninthebag.better_end_islands.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.maninthebag.better_end_islands.world.ModPlacedFeatures;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModTreeGeneration {
    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.END_HIGHLANDS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.CHORUS_TREE_PLACED_KEY);
    }
}
