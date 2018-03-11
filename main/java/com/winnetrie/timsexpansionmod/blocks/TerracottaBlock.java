package com.winnetrie.timsexpansionmod.blocks;

import com.winnetrie.timsexpansionmod.util.IMetaBlock;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class TerracottaBlock extends BlockBaseMetaColored implements IMetaBlock{
	
	public static final PropertyEnum<EnumDyeColor> COLOR = PropertyEnum.<EnumDyeColor>create("color", EnumDyeColor.class);
	private static final MapColor[] MAP_COLORS = new MapColor[] {MapColor.WHITE_STAINED_HARDENED_CLAY, 
																 MapColor.ORANGE_STAINED_HARDENED_CLAY, 
																 MapColor.MAGENTA_STAINED_HARDENED_CLAY, 
																 MapColor.LIGHT_BLUE_STAINED_HARDENED_CLAY, 
																 MapColor.YELLOW_STAINED_HARDENED_CLAY, 
																 MapColor.LIME_STAINED_HARDENED_CLAY, 
																 MapColor.PINK_STAINED_HARDENED_CLAY, 
																 MapColor.GRAY_STAINED_HARDENED_CLAY, 
																 MapColor.SILVER_STAINED_HARDENED_CLAY, 
																 MapColor.CYAN_STAINED_HARDENED_CLAY, 
																 MapColor.PURPLE_STAINED_HARDENED_CLAY, 
																 MapColor.BLUE_STAINED_HARDENED_CLAY, 
																 MapColor.BROWN_STAINED_HARDENED_CLAY, 
																 MapColor.GREEN_STAINED_HARDENED_CLAY, 
																 MapColor.RED_STAINED_HARDENED_CLAY, 
																 MapColor.BLACK_STAINED_HARDENED_CLAY};
	
	private final Block modelBlock;
    
	
	public TerracottaBlock(String name, IBlockState modelState) {
		super(name, modelState.getMaterial());
		
		this.modelBlock = modelState.getBlock();
		this.setSoundType(SoundType.STONE);
        this.setHarvestLevel(this.modelBlock.getHarvestTool(modelState), this.modelBlock.getHarvestLevel(modelState));
		setLightLevel(0.0F);
		
		this.setDefaultState(this.blockState.getBaseState().withProperty(COLOR, EnumDyeColor.WHITE));
	}
	
    /**
     * Gets the metadata of the item this Block can drop. This method is called when the block gets destroyed. It
     * returns the metadata of the dropped item based on the old metadata of the block.
     */
	
	@Override
    public int damageDropped(IBlockState state)
    {
        return ((EnumDyeColor)state.getValue(COLOR)).getMetadata();
    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
	@Override
    public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
    {
        for (EnumDyeColor enumdyecolor : EnumDyeColor.values())
        {
            items.add(new ItemStack(this, 1, enumdyecolor.getMetadata()));
        }
    }

    /**
     * Get the MapColor for this Block and the given BlockState
     */
	@Override
    public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos)
    {
		return MAP_COLORS[((EnumDyeColor)state.getValue(COLOR)).getMetadata()];
    }

    /**
     * Convert the given metadata into a BlockState for this Block
     */
	@Override
    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(COLOR, EnumDyeColor.byMetadata(meta));
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
	@Override
    public int getMetaFromState(IBlockState state)
    {
        return ((EnumDyeColor)state.getValue(COLOR)).getMetadata();
    }

	@Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {COLOR});
    }

	@Override
	public String getSpecialName(ItemStack stack) {
		
		return EnumDyeColor.values()[stack.getMetadata()].name().toLowerCase();

	}

}
