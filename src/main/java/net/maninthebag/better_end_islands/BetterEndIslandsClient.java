package net.maninthebag.better_end_islands;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.maninthebag.better_end_islands.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class BetterEndIslandsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), ModBlocks.CHORUS_SAPLING);
    }
}
