package com.winnetrie.timsexpansionmod.blocks;

import com.winnetrie.timsexpansionmod.init.BlockInit;
import com.winnetrie.timsexpansionmod.init.ItemInit;
import com.winnetrie.timsexpansionmod.util.ItemBlockMeta;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class DemoniteHalfSlab extends DemoniteSlabs{
	
	public DemoniteHalfSlab(String name, Material material) {
		super(name, material);
		
		
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
