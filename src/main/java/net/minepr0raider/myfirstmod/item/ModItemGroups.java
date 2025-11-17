package net.minepr0raider.myfirstmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minepr0raider.myfirstmod.MyFirstMod;
import net.minepr0raider.myfirstmod.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup PINK_GARNET_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(MyFirstMod.MOD_ID, "pink_garnet_items"), FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.PINK_GARNET))
            .displayName(Text.translatable("itemgroup.myfirstmod.pink_garnet_items"))
            .entries((displayContext, entries) -> {
                entries.add(ModItems.PINK_GARNET);
                entries.add(ModItems.RAW_PINK_GARNET);
            }).build());

    public static final ItemGroup PINK_GARNET_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(MyFirstMod.MOD_ID, "pink_garnet_blocks"), FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModBlocks.PINK_GARNET_BLOCK))
            .displayName(Text.translatable("itemgroup.myfirstmod.pink_garnet_blocks"))
            .entries((displayContext, entries) -> {
                entries.add(ModBlocks.PINK_GARNET_BLOCK);
                entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
            }).build());

    public static final ItemGroup LEMON_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(MyFirstMod.MOD_ID, "lemon_items"), FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.LEMON))
            .displayName(Text.translatable("itemgroup.myfirstmod.lemon_items"))
            .entries((displayContext, entries) -> {
                entries.add(ModItems.LEMON);
                entries.add(ModBlocks.LEMON_BLOCK);
            }).build());

    public static void registerItemsGroups() {
        MyFirstMod.LOGGER.info("Registering Item Groups for " + MyFirstMod.MOD_ID);
    }
}
