package com.luramoth.copperium;

import com.luramoth.copperium.item.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup COPPERIUM = new ItemGroup("copperium") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.COAL_DUST.get());
        }
    };
}
