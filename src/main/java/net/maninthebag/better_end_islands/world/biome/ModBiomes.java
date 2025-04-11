package net.maninthebag.better_end_islands.world.biome;

import net.maninthebag.better_end_islands.BetterEndIslands;
import net.maninthebag.better_end_islands.world.ModPlacedFeatures;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.sound.MusicType;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;

public class ModBiomes {
    public static final RegistryKey<Biome> CHORUS_JUNGLE = RegistryKey.of(RegistryKeys.BIOME, Identifier.of(BetterEndIslands.MOD_ID, "chorus_jungle"));

    public static void bootstrap(Registerable<Biome> context) {
        context.register(CHORUS_JUNGLE, chorusJungle(context));
    }

    public static void globalOverworldGeneration(GenerationSettings.LookupBackedBuilder builder) {

    }

    public static Biome chorusJungle(Registerable<Biome> context) {
        SpawnSettings.Builder spawnBuilder = new SpawnSettings.Builder();

        GenerationSettings.LookupBackedBuilder biomeBuilder =
                new GenerationSettings.LookupBackedBuilder(context.getRegistryLookup(RegistryKeys.PLACED_FEATURE),
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER));

        globalOverworldGeneration(biomeBuilder);

        biomeBuilder.feature(GenerationStep.Feature.VEGETAL_DECORATION, VegetationPlacedFeatures.TREES_JUNGLE);

        return new Biome.Builder()
                .precipitation(false)
                .downfall(0.0f)
                .temperature(0.2f)
                .generationSettings(biomeBuilder.build())
                .spawnSettings(spawnBuilder.build())
                .effects(new BiomeEffects.Builder()
                        .waterColor(0x572382)
                        .waterFogColor(0x572382)
                        .skyColor(0x0f031a)
                        .grassColor(0x572382)
                        .foliageColor(0x9d42ad)
                        .fogColor(0x0f031a).build())
                .build();

    }
}
