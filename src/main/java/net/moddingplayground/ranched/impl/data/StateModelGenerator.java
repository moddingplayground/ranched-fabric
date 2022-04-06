package net.moddingplayground.ranched.impl.data;

import net.moddingplayground.frame.api.toymaker.v0.generator.model.block.AbstractStateModelGenerator;

import static net.moddingplayground.ranched.api.block.RanchedBlocks.*;

public class StateModelGenerator extends AbstractStateModelGenerator {
    public StateModelGenerator(String modId) {
        super(modId);
    }

    @Override
    public void generate() {
        this.cubeAlls(
            THATCH_BLOCK
        );
    }
}
