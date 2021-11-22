package com.github.vendricknz.rubymod.registry;

import com.github.vendricknz.rubymod.RubyMod;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    //Items
    public static final Item RUBY = new Item(new Item.Settings().group(RubyMod.ITEM_GROUP));
    public static final Item RAW_RUBY = new Item(new Item.Settings().group(RubyMod.ITEM_GROUP));
    //Block Items
    public static final BlockItem BLOCK_OF_RUBY = new BlockItem(ModBlocks.BLOCK_OF_RUBY, new Item.Settings().group(RubyMod.ITEM_GROUP));
    public static final BlockItem RUBY_ORE = new BlockItem(ModBlocks.RUBY_ORE, new Item.Settings().group(RubyMod.ITEM_GROUP));




    public static void registerItems()  {
        Registry.register(Registry.ITEM, new Identifier(RubyMod.MOD_ID, "ruby"), RUBY);
        Registry.register(Registry.ITEM, new Identifier(RubyMod.MOD_ID, "block_of_ruby"), BLOCK_OF_RUBY);
        Registry.register(Registry.ITEM, new Identifier(RubyMod.MOD_ID, "ruby_ore"), RUBY_ORE);
        Registry.register(Registry.ITEM, new Identifier(RubyMod.MOD_ID, "raw_ruby"), RAW_RUBY);
    }
}
