package net.moddingplayground.ranched.impl.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.moddingplayground.frame.api.util.InitializationLogger;
import net.moddingplayground.ranched.api.Ranched;
import net.moddingplayground.ranched.api.block.RanchedBlocks;

@Environment(EnvType.CLIENT)
public class RanchedClientImpl implements Ranched, ClientModInitializer {
    private final InitializationLogger initializer;

    public RanchedClientImpl() {
        this.initializer = new InitializationLogger(LOGGER, MOD_NAME, EnvType.CLIENT);
    }

    @Override
    public void onInitializeClient() {
        this.initializer.start();

        BlockRenderLayerMap.INSTANCE.putBlocks(
            RenderLayer.getCutout(),

            RanchedBlocks.THATCH
        );
        this.initializer.finish();
    }
}
