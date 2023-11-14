package com.nealjan.chromakeyblocks.item;

import com.nealjan.chromakeyblocks.NealjansChromaKeyBlocks;
import com.nealjan.chromakeyblocks.block.ModBlocks;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup CHROMA_KEY_BLOCKS = Registry.register(Registries.ITEM_GROUP,
    new Identifier(NealjansChromaKeyBlocks.MOD_ID, "chroma_key_blocks"), 
        FabricItemGroup.builder().displayName(Text.translatable("itemgroup.chroma_key_blocks"))
            .icon(() -> new ItemStack(ModBlocks.CHROMA_GREEN)).entries((displayContext, entries) -> {

                entries.add(ModBlocks.CHROMA_GREEN);
                entries.add(ModBlocks.CHROMA_BLUE);
                entries.add(ModBlocks.CHROMA_RED);
                entries.add(ModBlocks.CHROMA_YELLOW);
                entries.add(ModBlocks.UNSHADED_WHITE);
                entries.add(ModBlocks.UNSHADED_BLACK);

            }).build());

    public static void registerItemGroups() {
        //simply exists ig
    }
    
}
