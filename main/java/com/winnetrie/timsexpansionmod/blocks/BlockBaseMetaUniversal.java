package com.winnetrie.timsexpansionmod.blocks;

import com.winnetrie.timsexpansionmod.init.BlockInit;
import com.winnetrie.timsexpansionmod.init.ItemInit;
import com.winnetrie.timsexpansionmod.util.ItemBlockMeta;
import com.winnetrie.timsexpansionmod.util.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBaseMetaUniversal extends Block{
	
	public BlockBaseMetaUniversal(String name, Material material) {
		
		super(material);
		setUnlocalizedName(name);
		setRegistryName(Reference.PREFIX + name);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlockMeta(this).setRegistryName(this.getRegistryName()));
	}

}
