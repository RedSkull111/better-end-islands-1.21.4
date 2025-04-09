package net.maninthebag.better_end_islands.block;

import net.minecraft.data.family.BlockFamily;

public class ModBlockFamilies {
    public static final BlockFamily CHORUS_FAMILY =
            new BlockFamily.Builder(ModBlocks.CHORUS_PLANKS)
                    .stairs(ModBlocks.CHORUS_STAIRS)
                    .slab(ModBlocks.CHORUS_SLAB)
                    .fence(ModBlocks.CHORUS_FENCE)
                    .fenceGate(ModBlocks.CHORUS_FENCE_GATE)
                    .door(ModBlocks.CHORUS_DOOR)
                    .trapdoor(ModBlocks.CHORUS_TRAPDOOR)
                    .pressurePlate(ModBlocks.CHORUS_PRESSURE_PLATE)
                    .button(ModBlocks.CHORUS_BUTTON)
                    .build();
}
