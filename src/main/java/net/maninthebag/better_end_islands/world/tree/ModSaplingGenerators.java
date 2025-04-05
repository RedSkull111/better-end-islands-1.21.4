package net.maninthebag.better_end_islands.world.tree;

import net.maninthebag.better_end_islands.BetterEndIslands;
import net.maninthebag.better_end_islands.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator CHORUS = new SaplingGenerator(BetterEndIslands.MOD_ID + ":chorus",
            Optional.empty(), Optional.of(ModConfiguredFeatures.CHORUS_KEY), Optional.empty());
}
