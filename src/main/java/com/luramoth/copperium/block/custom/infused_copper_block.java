package com.luramoth.copperium.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;

import javax.annotation.Nullable;

// conductable pathing: prioritise going in the same direction
// if cant continue in the same direction, pick a random available direction
// if infused block is found, dump all power into it
//
// infused block: fill up power with any recieved by conductables
// if there is excess power, dump it into adjacent infused block, if there isent one, discard excess power

public class infused_copper_block extends Block {
    public static final IntegerProperty POWER = IntegerProperty.create("power", 0, 14);

    public infused_copper_block(Properties p_i48440_1_) {
        super(p_i48440_1_);
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(POWER);
        super.fillStateContainer(builder);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext useContext) {
        return this.getDefaultState().with(POWER, 0);
    }
}
