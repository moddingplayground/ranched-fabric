package net.moddingplayground.ranched.api.item;

import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.moddingplayground.frame.api.tabbeditemgroups.v0.TabbedItemGroup;
import net.moddingplayground.frame.api.util.GUIIcon;
import net.moddingplayground.ranched.api.block.RanchedBlocks;

import static net.moddingplayground.ranched.api.Ranched.*;

public interface RanchedItemGroups {
    TabbedItemGroup ALL = TabbedItemGroup.builder()
                                         .build(new Identifier(MOD_ID, "item_group"), t -> GUIIcon.of(() -> new ItemStack(RanchedBlocks.THATCH_BLOCK)));
}

