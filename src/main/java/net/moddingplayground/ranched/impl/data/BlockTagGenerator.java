package net.moddingplayground.ranched.impl.data;

import net.minecraft.block.Block;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.registry.Registry;
import net.moddingplayground.frame.api.toymaker.v0.generator.tag.AbstractTagGenerator;
import net.moddingplayground.ranched.api.tag.RanchedBlockTags;

import static net.minecraft.block.Blocks.*;
import static net.moddingplayground.ranched.api.block.RanchedBlocks.*;

public class BlockTagGenerator extends AbstractTagGenerator<Block>{
    public BlockTagGenerator(String modId) {
        super(modId, Registry.BLOCK);
    }

    @Override
    public void generate() {
        this.add(RanchedBlockTags.ALLOW_ANIMAL_SLEEPING,
            GRASS_BLOCK,
            PODZOL,
            HAY_BLOCK,
            MYCELIUM,
            MOSS_BLOCK,
            THATCH_BLOCK,
            THATCH
        );

        this.add(RanchedBlockTags.PREFER_ANIMAL_SLEEPING,
            THATCH_BLOCK,
            THATCH
        );

        this.add(BlockTags.HOE_MINEABLE,
            THATCH_BLOCK,
            THATCH
        );
    }
}
