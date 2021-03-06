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
        // thatch block
        this.add(b(THATCH) + p(THATCH_BLOCK), generic2x2(THATCH, THATCH_BLOCK, 1));
        this.add(b(WHEAT) + p(WHEAT) + "_from_" + p(THATCH_BLOCK), shapeless(THATCH_BLOCK, WHEAT, 4).group(p(WHEAT)));

        // thatch
        this.add(b(THATCH) + p(THATCH), generic2x1(WHEAT, THATCH, 2));
        this.add(b(WHEAT) + p(WHEAT) + "_from_" + p(THATCH), shapeless(THATCH, WHEAT, 1).group(p(WHEAT)));
    }

    public String b(String folder) {
        return "%s/".formatted(folder);
    }

    public String b(ItemConvertible item) {
        return b(p(item));
    }

    public String p(ItemConvertible item) {
        return Registry.ITEM.getId(item.asItem()).getPath();
    }
}
