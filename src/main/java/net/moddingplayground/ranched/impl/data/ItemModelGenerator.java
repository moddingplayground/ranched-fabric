package net.moddingplayground.ranched.impl.data;

import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.moddingplayground.frame.api.toymaker.v0.generator.model.item.AbstractItemModelGenerator;

import static net.moddingplayground.ranched.api.Ranched.*;

public class ItemModelGenerator extends AbstractItemModelGenerator {
    public ItemModelGenerator(String modId) {
        super(modId);
    }

    @Override
    public void generate() {
        for (Block block : Registry.BLOCK) {
            if (block.asItem() == Items.AIR) continue;
            Identifier id = Registry.BLOCK.getId(block);
            if (id.getNamespace().equals(MOD_ID)) {
                if (!this.map.containsKey(id)) this.block(block);
            }
        }
    }

}
