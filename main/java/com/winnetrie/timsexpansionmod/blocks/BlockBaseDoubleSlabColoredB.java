package com.winnetrie.timsexpansionmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockBaseDoubleSlabColoredB extends BlockBaseSlabColoredB{
	
	private final Block singleSlab;

	
	public BlockBaseDoubleSlabColoredB(String name, IBlockState state, Block singleSlabReference) {
		super(name, state);
		this.singleSlab = singleSlabReference;
		
		
		// TODO Auto-generated constructor stub
	}

	@Override
    public Item getHalfSlabReference()
    {
        return Item.getItemFromBlock(this.singleSlab);
    }

	@Override
	public boolean isDouble()
    {
        return true;
    }

    /**
     * Get the geometry of the queried face at the given position and state. This is used to decide whether things like
     * buttons are allowed to be placed on the face, or how glass panes connect to the face, among other things.
     * <p>
     * Common values are {@code SOLID}, which is the default, and {@code UNDEFINED}, which represents something that
     * does not fit the other descriptions and will generally cause other things not to connect to the face.
     * 
     * @return an approximation of the form of the given face
     */
    public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face)
    {
        return BlockFaceShape.SOLID;
    }

}
