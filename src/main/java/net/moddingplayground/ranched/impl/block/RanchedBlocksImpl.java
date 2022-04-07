package net.moddingplayground.ranched.impl.block;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.moddingplayground.ranched.api.block.RanchedBlocks;

public final class RanchedBlocksImpl implements RanchedBlocks, ModInitializer {
    @Override
    public void onInitialize() {
        FlammableBlockRegistry flammables = FlammableBlockRegistry.getDefaultInstance();
        flammables.add(THATCH_BLOCK,30, 60);
        flammables.add(THATCH,30, 60);

        CompostingChanceRegistry compostables = CompostingChanceRegistry.INSTANCE;
        compostables.add(THATCH_BLOCK, 0.5F);
        compostables.add(THATCH, 0.25F);
    }
}
