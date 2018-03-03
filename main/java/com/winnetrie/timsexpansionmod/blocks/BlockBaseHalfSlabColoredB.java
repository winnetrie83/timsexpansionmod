package com.winnetrie.timsexpansionmod.blocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockBaseHalfSlabColoredB extends BlockBaseSlabColoredB{
	
	public BlockBaseHalfSlabColoredB(String name, IBlockState state) {
		super(name, state);
		
		
	}
	
	@Override
    public Item getHalfSlabReference()
    {
    	return Item.getItemFromBlock(this);
    }


	@Override
	public boolean isDouble()
    {
        return false;
    }

	

}