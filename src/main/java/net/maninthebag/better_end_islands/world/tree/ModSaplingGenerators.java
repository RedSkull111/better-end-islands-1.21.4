package net.maninthebag.better_end_islands.world.tree;

import net.maninthebag.better_end_islands.BetterEndIslands;
import net.maninthebag.better_end_islands.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;
import net.minecraft.world.gen.feature.TreeConfiguredFeatures;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator CHORUS_TREE = new SaplingGenerator(BetterEndIslands.MOD_ID + ":chorus_tree",
            Optional.empty(), Optional.of(ModConfiguredFeatures.CHORUS_TREE_KEY), Optional.empty());
}
