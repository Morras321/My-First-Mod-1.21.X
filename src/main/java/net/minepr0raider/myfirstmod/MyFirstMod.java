package net.minepr0raider.myfirstmod;

import net.fabricmc.api.ModInitializer;

import net.minepr0raider.myfirstmod.block.ModBlocks;
import net.minepr0raider.myfirstmod.item.ModItemGroups;
import net.minepr0raider.myfirstmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyFirstMod implements ModInitializer {
	public static final String MOD_ID = "myfirstmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItemGroups.registerItemsGroups();

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
	}
}