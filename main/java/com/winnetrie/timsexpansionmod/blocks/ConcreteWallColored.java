package com.winnetrie.timsexpansionmod.blocks;

import com.winnetrie.timsexpansionmod.Main;
import com.winnetrie.timsexpansionmod.util.IHasModel;
import com.winnetrie.timsexpansionmod.util.IMetaBlock;

import net.minecraft.block.Block;
import net.minecraft.block.BlockWall;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class ConcreteWallColored extends BlockBaseWall implements IHasModel, IMetaBlock{
	
	public static final PropertyEnum<ConcreteWallColored.EnumType> COLOR = PropertyEnum.<ConcreteWallColored.EnumType>create("color", ConcreteWallColored.EnumType.class);
	private static final MapColor[] MAP_COLORS = new MapColor[] {
			 MapColor.SNOW, 
			 MapColor.ADOBE, 
			 MapColor.MAGENTA, 
			 MapColor.LIGHT_BLUE, 
			 MapColor.YELLOW, 
			 MapColor.LIME, 
			 MapColor.PINK, 
			 MapColor.GRAY, 
			 MapColor.SILVER, 
			 MapColor.CYAN, 
			 MapColor.PURPLE, 
			 MapColor.BLUE, 
			 MapColor.BROWN, 
			 MapColor.GREEN, 
			 MapColor.RED, 
			 MapColor.BLACK};
	
	private final Block modelBlock;

	public ConcreteWallColored(String name, IBlockState state) {
		super(name, state);
		
		this.setDefaultState(this.blockState.getBaseState().withProperty(UP, Boolean.valueOf(false)).withProperty(NORTH, Boolean.valueOf(false)).withProperty(EAST, Boolean.valueOf(false)).withProperty(SOUTH, Boolean.valueOf(false)).withProperty(WEST, Boolean.valueOf(false)).withProperty(COLOR, ConcreteWallColored.EnumType.WHITE));
        this.modelBlock = state.getBlock();
        this.setHardness(this.modelBlock.getBlockHardness(state, null, null));
        this.setResistance(this.modelBlock.getExplosionResistance(null));
        this.setSoundType(this.modelBlock.getSoundType());
        this.setHarvestLevel(this.modelBlock.getHarvestTool(state), this.modelBlock.getHarvestLevel(state));
		setLightLevel(0.0F);
		
	}
	
	   /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
	@Override
    public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
    {
        for (ConcreteWallColored.EnumType blockwall$enumtype : ConcreteWallColored.EnumType.values())
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
        return ((ConcreteWallColored.EnumType)state.getValue(COLOR)).getMetadata();
    }
    
    @Override
    public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos)
    {
    	return MAP_COLORS[(state.getValue(COLOR)).getMetadata()];
    }
    
    /**
     * Convert the given metadata into a BlockState for this Block
     */
    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(COLOR, ConcreteWallColored.EnumType.byMetadata(meta));
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    @Override
    public int getMetaFromState(IBlockState state)
    {
        return ((ConcreteWallColored.EnumType)state.getValue(COLOR)).getMetadata();
    }

    @Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {UP, NORTH, EAST, WEST, SOUTH, COLOR});
    }

	@Override
	public String getSpecialName(ItemStack stack) {
		
		return ConcreteWallColored.EnumType.values()[stack.getMetadata()].name().toLowerCase();
	}

	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "color=white");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 1, "color=orange");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 2, "color=magenta");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 3, "color=light_blue");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 4, "color=yellow");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 5, "color=lime");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 6, "color=pink");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 7, "color=gray");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 8, "color=silver");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 9, "color=cyan");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 10, "color=purple");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 11, "color=blue");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 12, "color=brown");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 13, "color=green");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 14, "color=red");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 15, "color=black");
		
	}
	
    public static enum EnumType implements IStringSerializable
    {
        WHITE(0, "white", "white"),
        ORANGE(1, "orange", "orange"),
        MAGENTA(2, "magenta", "magenta"),
        LIGHT_BLUE(3, "light_blue", "light_blue"),
        YELLOW(4, "yellow", "yellow"),
        LIME(5, "lime", "lime"),
        PINK(6, "pink", "pink"),
        GRAY(7, "gray", "gray"),
        SILVER(8, "silver", "silver"),
        CYAN(9, "cyan", "cyan"),
        PURPLE(10, "purple", "purple"),
        BLUE(11, "blue", "blue"),
        BROWN(12, "brown", "brown"),
        GREEN(13, "green", "green"),
        RED(14, "red", "red"),
        BLACK(15, "black", "black");

        private static final ConcreteWallColored.EnumType[] META_LOOKUP = new ConcreteWallColored.EnumType[values().length];
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

        public static ConcreteWallColored.EnumType byMetadata(int meta)
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
            for (ConcreteWallColored.EnumType blockwall$enumtype : values())
            {
                META_LOOKUP[blockwall$enumtype.getMetadata()] = blockwall$enumtype;
            }
        }
    }

}
