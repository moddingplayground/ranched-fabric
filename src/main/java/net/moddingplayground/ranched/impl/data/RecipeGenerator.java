package net.moddingplayground.ranched.impl.data;

import net.minecraft.item.ItemConvertible;
import net.minecraft.util.registry.Registry;
import net.moddingplayground.frame.api.toymaker.v0.generator.recipe.AbstractRecipeGenerator;

import static net.minecraft.item.Items.*;
import static net.moddingplayground.ranched.api.block.RanchedBlocks.*;

public class RecipeGenerator extends AbstractRecipeGenerator {
    public RecipeGenerator(String modId) {
        super(modId);
    }

    @Override
    public void generate() {
        String thatch = path(THATCH);
        String thatch_block = path(THATCH_BLOCK);
        this.add(baseFolder(thatch) + thatch, generic2x2(THATCH, THATCH_BLOCK, 1));
        this.add(baseFolder(thatch) + thatch + "_undo", shapeless(THATCH_BLOCK, WHEAT, 4));
        this.add(baseFolder(thatch) + thatch_block, generic2x1(WHEAT, THATCH, 2));
        this.add(baseFolder(thatch) + thatch_block + "_undo", shapeless(THATCH, WHEAT, 1));
    }

    public String baseFolder(String folder) {
        return "%s/".formatted(folder);
    }

    public String path(ItemConvertible item) {
        return Registry.ITEM.getId(item.asItem()).getPath();
    }
}
