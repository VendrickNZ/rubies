package com.github.vendricknz.rubymod.registry;

import com.github.vendricknz.rubymod.RubyMod;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    //Items
    public static final Item RUBY = new Item(new Item.Settings().group(RubyMod.ITEM_GROUP));
    public static final Item RUBY_ORE = new Item(new Item.Settings().group(RubyMod.ITEM_GROUP));
    //Block Items
    public static final BlockItem RUBY_BLOCK = new BlockItem(ModBlocks.RUBY_BLOCK, new Item.Settings().group(RubyMod.ITEM_GROUP));



    public static void registerItems()  {
        Registry.register(Registry.ITEM, new Identifier(RubyMod.MOD_ID, "ruby"), RUBY);
        Registry.register(Registry.ITEM, new Identifier(RubyMod.MOD_ID, "ruby_block"), RUBY_BLOCK);
        Registry.register(Registry.ITEM, new Identifier(RubyMod.MOD_ID, "ruby_ore"), RUBY_ORE);

    }
}
