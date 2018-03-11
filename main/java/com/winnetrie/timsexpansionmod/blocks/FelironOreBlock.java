package com.winnetrie.timsexpansionmod.blocks;

import java.util.Random;

import com.winnetrie.timsexpansionmod.Main;
import com.winnetrie.timsexpansionmod.init.BlockInit;
import com.winnetrie.timsexpansionmod.util.BlockMapColors;
import com.winnetrie.timsexpansionmod.util.IHasModel;
import com.winnetrie.timsexpansionmod.util.IMetaBlock;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class FelironOreBlock extends BlockBase{

	public FelironOreBlock(String name, Material material) {
		super(name, material);
		
		this.setSoundType(SoundType.STONE);
		this.setHardness(30F);
		this.setResistance(20F);
		this.setHarvestLevel("pickaxe", 3);
		setLightLevel(0.0F);
				
	}
	
	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "normal");
		
	}
	
    @Override
    public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos){
    	
        return MapColor.GREEN_STAINED_HARDENED_CLAY;
    	
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune){
    	
        return Item.getItemFromBlock(this);
    }
}
