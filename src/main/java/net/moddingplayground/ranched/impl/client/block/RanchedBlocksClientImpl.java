package net.moddingplayground.ranched.impl.client.block;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.moddingplayground.ranched.api.block.RanchedBlocks;

@Environment(EnvType.CLIENT)
public final class RanchedBlocksClientImpl implements RanchedBlocks, ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap layers = BlockRenderLayerMap.INSTANCE;
        layers.putBlocks(RenderLayer.getCutout(),
            THATCH
        );
    }
}
