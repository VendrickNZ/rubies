package com.github.vendricknz.rubymod;

import com.github.vendricknz.rubymod.registry.ModBlocks;
import com.github.vendricknz.rubymod.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class RubyMod implements ModInitializer {
    public static final String MOD_ID = "rubymod";

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "general"), () -> new ItemStack(ModItems.RUBY));

    @Override
    public void onInitialize()  {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
}
