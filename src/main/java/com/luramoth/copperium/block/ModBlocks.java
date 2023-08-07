package com.luramoth.copperium.block;

import com.luramoth.copperium.Copperium;
import com.luramoth.copperium.item.ModItemGroup;
import com.luramoth.copperium.item.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Copperium.MOD_ID);

    /////////////////// BLOCKS
    public static final RegistryObject<Block> COPPER_BLOCK = registerBlock("copper_block",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                    .harvestLevel(0)
                    .hardnessAndResistance(5f)));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlock(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlock(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().group(ModItemGroup.COPPERIUM)));
    }
}
