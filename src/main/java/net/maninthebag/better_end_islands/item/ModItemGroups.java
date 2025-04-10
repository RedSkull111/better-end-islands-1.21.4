package net.maninthebag.better_end_islands.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.maninthebag.better_end_islands.BetterEndIslands;
import net.maninthebag.better_end_islands.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup BETTER_END_ISLANDS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(BetterEndIslands.MOD_ID, "better_end_islands_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.CHORUS_LOG))
                    .displayName(Text.translatable("itemgroup.better_end_islands.better_end_islands_group"))
                    .entries((displayContext, entries) -> {
                        //Chorus Wood
                        entries.add(ModBlocks.CHORUS_LOG);
                        entries.add(ModBlocks.CHORUS_WOOD);

                        entries.add(ModBlocks.STRIPPED_CHORUS_LOG);
                        entries.add(ModBlocks.STRIPPED_CHORUS_WOOD);

                        entries.add(ModBlocks.CHORUS_PLANKS);

                        entries.add(ModBlocks.CHORUS_STAIRS);
                        entries.add(ModBlocks.CHORUS_SLAB);
                        entries.add(ModBlocks.CHORUS_FENCE);

                        entries.add(ModBlocks.CHORUS_FENCE_GATE);
                        entries.add(ModBlocks.CHORUS_DOOR);
                        entries.add(ModBlocks.CHORUS_TRAPDOOR);

                        entries.add(ModBlocks.CHORUS_PRESSURE_PLATE);
                        entries.add(ModBlocks.CHORUS_BUTTON);

                        //Bloodwood Wood
                        entries.add(ModBlocks.BLOODWOOD_LOG);
                        entries.add(ModBlocks.BLOODWOOD_WOOD);

                        entries.add(ModBlocks.STRIPPED_BLOODWOOD_LOG);
                        entries.add(ModBlocks.STRIPPED_BLOODWOOD_WOOD);

                        //Leaves
                        entries.add(ModBlocks.CHORUS_LEAVES);

                        //Saplings
                        entries.add(ModBlocks.CHORUS_SAPLING);

                        //Ores
                        entries.add(ModBlocks.ENDERITE_ORE);

                        //Tests
                        entries.add(ModBlocks.TEST_BLOCK);

                        entries.add(ModItems.TEST_ITEM);
                    }).build());

    public static void registerItemGroups() {
        BetterEndIslands.LOGGER.info("Registering Item Groups for " + BetterEndIslands.MOD_ID);
    }
}
