package net.maninthebag.better_end_islands.world.dimension;

import net.maninthebag.better_end_islands.BetterEndIslands;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionOptions;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.dimension.DimensionTypes;

import java.util.OptionalLong;

public class ModDimensions {
    public static final RegistryKey<DimensionOptions> END_ISLANDS_KEY = RegistryKey.of(RegistryKeys.DIMENSION, Identifier.of(BetterEndIslands.MOD_ID, "end_islands"));
    public static final RegistryKey<World> END_ISLANDS_LEVEL_KEY = RegistryKey.of(RegistryKeys.WORLD, Identifier.of(BetterEndIslands.MOD_ID, "end_islands"));
    public static final RegistryKey<DimensionType> END_ISLANDS_DIM_TYPE = RegistryKey.of(RegistryKeys.DIMENSION_TYPE, Identifier.of(BetterEndIslands.MOD_ID, "end_islands_type"));

    public static void bootstrapType(Registerable<DimensionType> context) {
        context.register(END_ISLANDS_DIM_TYPE, new DimensionType(
                OptionalLong.of(6000),
                false,
                false,
                false,
                false,
                1.0,
                false,
                false,
                0,
                256,
                256,
                BlockTags.INFINIBURN_END,
                DimensionTypes.THE_END_ID,
                0.0f,
                new DimensionType.MonsterSettings(false, false, UniformIntProvider.create(0, 0), 0)));
    }
}
