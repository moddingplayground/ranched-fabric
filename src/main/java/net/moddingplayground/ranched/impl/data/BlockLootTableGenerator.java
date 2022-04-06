package net.moddingplayground.ranched.impl.data;

import net.minecraft.block.Block;
import net.moddingplayground.frame.api.toymaker.v0.generator.loot.AbstractBlockLootTableGenerator;

import static net.moddingplayground.ranched.api.block.RanchedBlocks.*;

public class BlockLootTableGenerator extends AbstractBlockLootTableGenerator {

    public BlockLootTableGenerator(String modId) {
        super(modId);
    }

    @Override
    public void generate() {
        this.adds(
            THATCH_BLOCK,
            THATCH
        );
    }

    public void adds(Block... blocks) {
        for (Block block : blocks) this.add(block);
    }
}
