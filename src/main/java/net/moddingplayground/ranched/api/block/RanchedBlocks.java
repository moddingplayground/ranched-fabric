package net.moddingplayground.ranched.api.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.CarpetBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.moddingplayground.ranched.api.item.RanchedItemGroups;

import java.util.Optional;
import java.util.function.BiFunction;

import static net.moddingplayground.ranched.api.Ranched.*;

public interface RanchedBlocks {
    Block THATCH_BLOCK = register("thatch_block", new Block(
        FabricBlockSettings.of(Material.SOLID_ORGANIC, MapColor.YELLOW)
                           .strength(0.1F).sounds(BlockSoundGroup.MOSS_BLOCK)
    ));

    Block THATCH = register("thatch", new CarpetBlock(FabricBlockSettings.copyOf(THATCH_BLOCK)));

    private static Block register(String id, Block block, BiFunction<Block, Item.Settings, Item> item) {
        Identifier idtf = new Identifier(MOD_ID, id);
        Optional.ofNullable(item)
                .map(f -> f.apply(block, new FabricItemSettings().group(RanchedItemGroups.ALL)))
                .ifPresent(i -> Registry.register(Registry.ITEM, idtf, i));
        return Registry.register(Registry.BLOCK, idtf, block);
    }

    private static Block register(String id, Block block) {
        return register(id, block, BlockItem::new);
    }
}
