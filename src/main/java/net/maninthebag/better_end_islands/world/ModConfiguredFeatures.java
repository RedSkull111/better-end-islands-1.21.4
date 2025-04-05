package net.maninthebag.better_end_islands.world;

import net.maninthebag.better_end_islands.BetterEndIslands;
import net.maninthebag.better_end_islands.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.MegaJungleTrunkPlacer;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> CHORUS_KEY = registryKey("chorus");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        register(context, CHORUS_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.CHORUS_LOG),
                new MegaJungleTrunkPlacer(10,2,19),
                BlockStateProvider.of(ModBlocks.CHORUS_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
                new TwoLayersFeatureSize(1, 1,2)).build());
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registryKey(String name) {
        return  RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(BetterEndIslands.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
