package net.moddingplayground.ranched.api.tag;

import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static net.moddingplayground.ranched.api.Ranched.*;

public interface RanchedBlockTags {
    TagKey<Block> ALLOW_ANIMAL_SLEEPING = register("allow_animal_sleeping");
    TagKey<Block> PREFER_ANIMAL_SLEEPING = register("prefer_animal_sleeping");

    private static TagKey<Block> register(String id) {
        return TagKey.of(Registry.BLOCK_KEY, new Identifier(MOD_ID, id));
    }
}

