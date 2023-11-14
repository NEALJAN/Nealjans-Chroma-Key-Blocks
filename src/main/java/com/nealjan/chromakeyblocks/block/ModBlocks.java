package com.nealjan.chromakeyblocks.block;

import com.nealjan.chromakeyblocks.NealjansChromaKeyBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block CHROMA_GREEN = registerBlock("chroma_green", 
        new Block(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE).luminance(1).emissiveLighting(Blocks::always)));

    public static final Block CHROMA_BLUE = registerBlock("chroma_blue", 
        new Block(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE).luminance(1).emissiveLighting(Blocks::always)));

    public static final Block CHROMA_RED = registerBlock("chroma_red", 
        new Block(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE).luminance(1).emissiveLighting(Blocks::always)));

    public static final Block CHROMA_YELLOW = registerBlock("chroma_yellow", 
        new Block(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE).luminance(1).emissiveLighting(Blocks::always)));

    public static final Block UNSHADED_WHITE = registerBlock("unshaded_white", 
        new Block(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE).luminance(1).emissiveLighting(Blocks::always)));

    public static final Block UNSHADED_BLACK = registerBlock("unshaded_black", 
        new Block(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE).luminance(1).emissiveLighting(Blocks::always)));

    //dings
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(NealjansChromaKeyBlocks.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(NealjansChromaKeyBlocks.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        NealjansChromaKeyBlocks.LOGGER.info("Registering ModBlocks for " + NealjansChromaKeyBlocks.MOD_ID);
    }
}
