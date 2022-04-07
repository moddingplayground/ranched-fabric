package net.moddingplayground.ranched.api.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.moddingplayground.ranched.api.block.RanchedBlocks;

import static net.moddingplayground.ranched.api.Ranched.*;

public interface RanchedItemGroups {
    ItemGroup ALL = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "item_group"), () -> new ItemStack(RanchedBlocks.THATCH_BLOCK));
}
