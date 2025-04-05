package net.maninthebag.better_end_islands.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.maninthebag.better_end_islands.BetterEndIslands;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {

    public static final Item TEST_ITEM = registerItem("test_item", Item::new, new Item.Settings());

    private static Item registerItem(String name, Function<Item.Settings,Item> factory, Item.Settings settings) {
        final RegistryKey<Item> registryKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(BetterEndIslands.MOD_ID, name));
        return Items.register(registryKey, factory, settings);
    }
    
    public static void registerModItems() {
        BetterEndIslands.LOGGER.info("Registering Mod Items for " + BetterEndIslands.MOD_ID);
    }
}
