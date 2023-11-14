package com.nealjan.chromakeyblocks;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nealjan.chromakeyblocks.block.ModBlocks;
import com.nealjan.chromakeyblocks.item.ModItemGroups;
import com.nealjan.chromakeyblocks.item.ModItems;

public class NealjansChromaKeyBlocks implements ModInitializer {

	public static final String MOD_ID = "nealjans-chroma-key-blocks";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
        ModItemGroups.registerItemGroups();
        ModBlocks.registerModBlocks();

	}
}