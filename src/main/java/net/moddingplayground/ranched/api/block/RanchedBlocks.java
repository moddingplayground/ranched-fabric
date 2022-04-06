package net.moddingplayground.ranched.api.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CarpetBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.moddingplayground.ranched.api.item.RanchedItemGroups;

import java.util.function.BiFunction;

import static net.moddingplayground.ranched.api.Ranched.*;

public interface RanchedBlocks {

    Block THATCH_BLOCK = register("thatch_block", new Block(FabricBlockSettings.copyOf(Blocks.MOSS_BLOCK)));
    Block THATCH = register("thatch", new CarpetBlock(FabricBlockSettings.copyOf(Blocks.MOSS_CARPET)));

    private static Block register(String id, Block block, BiFunction<Block, Item.Settings, Item> item) {
        Identifier identifier = new Identifier(MOD_ID, id);
        if (item != null) Registry.register(Registry.ITEM, identifier, item.apply(block, new FabricItemSettings().group(RanchedItemGroups.ALL)));
        return Registry.register(Registry.BLOCK, identifier, block);
    }

    private static Block register(String id, Block block) {
        return register(id, block, BlockItem::new);
    }
}
