package com.luramoth.copperium.item;

import com.luramoth.copperium.Copperium;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS
            = DeferredRegister.create(ForgeRegistries.ITEMS, Copperium.MOD_ID);

    //////////////////// ITEMS
    // coal dust
    public static final RegistryObject<Item> COAL_DUST = ITEMS.register("coaldust",
            () -> new Item(new Item.Properties().group(ModItemGroup.COPPERIUM)));

    // copper ingot
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copperingot",
            () -> new Item(new Item.Properties().group(ModItemGroup.COPPERIUM)));

    // Infused Copper Ingot
    public static final RegistryObject<Item> INFUSED_COPPER_INGOT = ITEMS.register("infusedcopperingot",
            () -> new Item(new Item.Properties().group(ModItemGroup.COPPERIUM)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
