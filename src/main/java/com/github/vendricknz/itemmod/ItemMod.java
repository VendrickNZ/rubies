package com.github.vendricknz.itemmod;

import com.github.vendricknz.itemmod.registry.ModBlocks;
import com.github.vendricknz.itemmod.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class ItemMod implements ModInitializer {
    public static final String MOD_ID = "itemmod";

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MOD_ID, "general"), () -> new ItemStack(ModItems.RUBY));

    public static final ItemGroup OTHER_GROUP = FabricItemGroupBuilder.create(
            new Identifier(MOD_ID, "other")).icon(() -> new ItemStack(Blocks.ENCHANTING_TABLE))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(ModBlocks.RUBY_BLOCK));
                stacks.add(new ItemStack(Items.APPLE));
                stacks.add(new ItemStack(ModItems.RUBY));
                stacks.add(new ItemStack(Blocks.OBSIDIAN));
            })
            .build();

    @Override
    public void onInitialize()  {
        ModItems.registerItems();
        ModBlocks.registerBlocks();
    }
}
