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
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.TEST_ITEM))
                    .displayName(Text.translatable("itemgroup.better_end_islands.better_end_islands_group"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.TEST_ITEM);
                        entries.add(ModBlocks.TEST_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        BetterEndIslands.LOGGER.info("Registering Item Groups for " + BetterEndIslands.MOD_ID);
    }
}
