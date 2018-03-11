package com.winnetrie.timsexpansionmod.blocks;

import javax.annotation.Nullable;

import com.winnetrie.timsexpansionmod.Main;
import com.winnetrie.timsexpansionmod.util.BlockMapColors;
import com.winnetrie.timsexpansionmod.util.IHasModel;
import com.winnetrie.timsexpansionmod.util.IMetaBlock;

import net.minecraft.block.Block;
import net.minecraft.block.BlockWall;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class MarbleStoneWall extends BlockBaseWall implements IHasModel, IMetaBlock{
	
	public static final PropertyEnum<MarbleStoneWall.EnumType> VARIANT = PropertyEnum.<MarbleStoneWall.EnumType>create("variant", MarbleStoneWall.EnumType.class);
	
	
	

	public MarbleStoneWall(String name, IBlockState state) {
		super(name, state);
		
		this.setDefaultState(this.blockState.getBaseState().withProperty(UP, Boolean.valueOf(false)).withProperty(NORTH, Boolean.valueOf(false)).withProperty(EAST, Boolean.valueOf(false)).withProperty(SOUTH, Boolean.valueOf(false)).withProperty(WEST, Boolean.valueOf(false)).withProperty(VARIANT, MarbleStoneWall.EnumType.COBBLE));
		this.setHarvestLevel("pickaxe", 0);
        setResistance(5.0F);
        setSoundType(SoundType.STONE);
		setLightLevel(0.0F);
		
	}
	
	@Override
    public float getBlockHardness(IBlockState blockState, World worldIn, BlockPos pos){
    	
    	
    	float hardness = 0.0F;
    	if ((blockState.getBlock() != Blocks.AIR) && (blockState.getBlock() != null) && (blockState.getBlock() instanceof MarbleStoneWall)) {
    		
    		switch(getMetaFromState(blockState)) {
    		
    		case 0 : hardness = 2.0F; break;
    		case 1 : hardness = 2.0F; break;
    		case 2 : hardness = 1.75F; break;
    		case 3 : hardness = 1.75F; break;
    		}
    	}	
        return hardness;
    }
	

	   /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
	@Override
    public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
    {
        for (MarbleStoneWall.EnumType blockwall$enumtype : MarbleStoneWall.EnumType.values())
        {
            items.add(new ItemStack(this, 1, blockwall$enumtype.getMetadata()));
        }
    }

    /**
     * Gets the metadata of the item this Block can drop. This method is called when the block gets destroyed. It
     * returns the metadata of the dropped item based on the old metadata of the block.
     */
    @Override
    public int damageDropped(IBlockState state)
    {
        return ((MarbleStoneWall.EnumType)state.getValue(VARIANT)).getMetadata();
    }
    
    @Override
    public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos)
    {
    	return BlockMapColors.MARBLE;
    }
    
    /**
     * Convert the given metadata into a BlockState for this Block
     */
    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(VARIANT, MarbleStoneWall.EnumType.byMetadata(meta));
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    @Override
    public int getMetaFromState(IBlockState state)
    {
        return ((MarbleStoneWall.EnumType)state.getValue(VARIANT)).getMetadata();
    }

    @Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {UP, NORTH, EAST, WEST, SOUTH, VARIANT});
    }

	@Override
	public String getSpecialName(ItemStack stack) {
		
		return MarbleStoneWall.EnumType.values()[stack.getMetadata()].name().toLowerCase();
	}

	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "variant=cobble");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 1, "variant=mossy_cobble");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 2, "variant=brick");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 3, "variant=mossy_brick");
		
	}
	
    public static enum EnumType implements IStringSerializable
    {
    	COBBLE(0, "cobble", "cobble"),
        MOSSY_COBBLE(1, "mossy_cobble", "mossy_brick"),
        BRICK(2, "brick", "brick"),
        MOSSY_BRICK(3, "mossy_brick", "mossy_brick");

        private static final MarbleStoneWall.EnumType[] META_LOOKUP = new MarbleStoneWall.EnumType[values().length];
        private final int meta;
        private final String name;
        private final String unlocalizedName;

        private EnumType(int meta, String name, String unlocalizedName)
        {
            this.meta = meta;
            this.name = name;
            this.unlocalizedName = unlocalizedName;
        }

        public int getMetadata()
        {
            return this.meta;
        }

        public String toString()
        {
            return this.name;
        }

        public static MarbleStoneWall.EnumType byMetadata(int meta)
        {
            if (meta < 0 || meta >= META_LOOKUP.length)
            {
                meta = 0;
            }

            return META_LOOKUP[meta];
        }

        public String getName()
        {
            return this.name;
        }

        public String getUnlocalizedName()
        {
            return this.unlocalizedName;
        }

        static
        {
            for (MarbleStoneWall.EnumType blockwall$enumtype : values())
            {
                META_LOOKUP[blockwall$enumtype.getMetadata()] = blockwall$enumtype;
            }
        }
    }

}
