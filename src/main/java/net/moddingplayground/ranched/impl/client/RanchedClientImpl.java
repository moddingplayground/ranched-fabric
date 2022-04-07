package net.moddingplayground.ranched.impl.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.moddingplayground.frame.api.util.InitializationLogger;
import net.moddingplayground.ranched.api.Ranched;

@Environment(EnvType.CLIENT)
public final class RanchedClientImpl implements Ranched, ClientModInitializer {
    private final InitializationLogger initializer;

    public RanchedClientImpl() {
        this.initializer = new InitializationLogger(LOGGER, MOD_NAME, EnvType.CLIENT);
    }

    @Override
    public void onInitializeClient() {
        this.initializer.start();

        //

        this.initializer.finish();
    }
}
