package net.moddingplayground.ranched.impl.block;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.moddingplayground.ranched.api.block.RanchedBlocks;

public class RanchedBlocksImpl implements RanchedBlocks, ModInitializer {
    @Override
    public void onInitialize() {

        FlammableBlockRegistry flamReg = FlammableBlockRegistry.getDefaultInstance();
        flamReg.add(THATCH_BLOCK,30, 60);
        flamReg.add(THATCH,30, 60);

        CompostingChanceRegistry compReg = CompostingChanceRegistry.INSTANCE;
        compReg.add(THATCH_BLOCK, 0.5F);
        compReg.add(THATCH, 0.25F);
    }
}
