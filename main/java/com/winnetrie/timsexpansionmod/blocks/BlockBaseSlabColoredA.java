package com.winnetrie.timsexpansionmod.blocks;

import java.util.Random;

import com.winnetrie.timsexpansionmod.Main;
import com.winnetrie.timsexpansionmod.init.BlockInit;
import com.winnetrie.timsexpansionmod.init.ItemInit;
import com.winnetrie.timsexpansionmod.util.IHasModel;
import com.winnetrie.timsexpansionmod.util.IMetaBlock;
import com.winnetrie.timsexpansionmod.util.ItemBlockMeta;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStoneSlab;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public abstract class BlockBaseSlabColoredA extends BlockSlab implements IMetaBlock, IHasModel
{
    public static final PropertyEnum<BlockBaseSlabColoredA.EnumType> COLOR = PropertyEnum.<BlockBaseSlabColoredA.EnumType>create("color", BlockBaseSlabColoredA.EnumType.class);
    
    private final Block modelBlock;
    

    public BlockBaseSlabColoredA(String name, IBlockState state)
    {
        super(state.getMaterial());
        this.modelBlock = state.getBlock();
        IBlockState iblockstate = this.blockState.getBaseState().withProperty(COLOR, BlockBaseSlabColoredA.EnumType.WHITE);

        
        
        if(!this.isDouble()){

        	iblockstate = iblockstate.withProperty(HALF, EnumBlockHalf.BOTTOM).withProperty(COLOR, BlockBaseSlabColoredA.EnumType.WHITE);

		}

        this.setDefaultState(iblockstate);
        setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		this.setHardness(this.modelBlock.getBlockHardness(state, null, null));
        this.setResistance(this.modelBlock.getExplosionResistance(null));
        this.setSoundType(this.modelBlock.getSoundType());
        this.setHarvestLevel(this.modelBlock.getHarvestTool(state), this.modelBlock.getHarvestLevel(state));
		setLightLevel(0.0F);
		this.useNeighborBrightness = true;
		
		BlockInit.BLOCKS.add(this);
		
		
		
		
		

    }
    @Override
    public void registerModels() {
		
    	if (!isDouble()) {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "color=white,half=bottom");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 1, "color=orange,half=bottom");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 2, "color=magenta,half=bottom");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 3, "color=light_blue,half=bottom");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 4, "color=yellow,half=bottom");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 5, "color=lime,half=bottom");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 6, "color=pink,half=bottom");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 7, "color=gray,half=bottom");
    	}
		
	}

    /**
     * Get the Item that this Block should drop when harvested.
     */
    public abstract Item getHalfSlabReference();
    
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return this.getHalfSlabReference();
    }

    @Override
    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
    {
        return new ItemStack(this.getHalfSlabReference(), 1, ((BlockBaseSlabColoredA.EnumType)state.getValue(COLOR)).getMetadata());
    }

    /**
     * Returns the slab block name with the type associated with it
     */
    @Override
    public String getUnlocalizedName(int meta)
    {
        return super.getUnlocalizedName() + "." + BlockBaseSlabColoredA.EnumType.byMetadata(meta).getUnlocalizedName();
    }

    @Override
    public IProperty<?> getVariantProperty()
    {
        return COLOR;
    }

    @Override
    public Comparable<?> getTypeForItem(ItemStack stack)
    {
        return BlockBaseSlabColoredA.EnumType.byMetadata(stack.getMetadata() & 7);
    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @Override
    public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
    {
        for (BlockBaseSlabColoredA.EnumType blockstoneslab$enumtype : BlockBaseSlabColoredA.EnumType.values())
        {
        	items.add(new ItemStack(this, 1, blockstoneslab$enumtype.getMetadata()));
        }
    }

    /**
     * Convert the given metadata into a BlockState for this Block
     */
    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        IBlockState iblockstate = this.getDefaultState().withProperty(COLOR, BlockBaseSlabColoredA.EnumType.values()[meta & 7]);

        if (!this.isDouble())

        {
            iblockstate = iblockstate.withProperty(HALF, (meta & 8) == 0 ? BlockSlab.EnumBlockHalf.BOTTOM : BlockSlab.EnumBlockHalf.TOP);
        }

        return iblockstate;
    }

    @Override
    public int getMetaFromState(IBlockState state)
    {
        int i = state.getValue(COLOR).getMetadata();
        if (!this.isDouble() && state.getValue(HALF) == BlockSlab.EnumBlockHalf.TOP)
        {
            i |= 8;
        }
        return i;
    }

    @Override
    protected BlockStateContainer createBlockState()
    {
        return this.isDouble() ? new BlockStateContainer(this, new IProperty[] { COLOR}) : new BlockStateContainer(this, new IProperty[] {HALF, COLOR});
    }

    /**
     * Gets the metadata of the item this Block can drop. This method is called when the block gets destroyed. It
     * returns the metadata of the dropped item based on the old metadata of the block.
     */
    @Override
    public int damageDropped(IBlockState state)
    {
        return ((BlockBaseSlabColoredA.EnumType)state.getValue(COLOR)).getMetadata();
    }

    /**
     * Get the MapColor for this Block and the given BlockState
     */
    @Override
    public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos)
    {
        return ((BlockBaseSlabColoredA.EnumType)state.getValue(COLOR)).getMapColor();
    }

    @Override
	public String getSpecialName(ItemStack stack) {
		
		return EnumType.values()[stack.getMetadata()].name().toLowerCase();

	}
    
    public static enum EnumType implements IStringSerializable
    {
        WHITE(0, MapColor.WHITE_STAINED_HARDENED_CLAY, "white", "white"),
        ORANGE(1, MapColor.ORANGE_STAINED_HARDENED_CLAY, "orange", "orange"),
        MAGENTA(2, MapColor.MAGENTA_STAINED_HARDENED_CLAY, "magenta", "magenta"),
        LIGHT_BLUE(3, MapColor.LIGHT_BLUE_STAINED_HARDENED_CLAY, "light_blue", "light_blue"),
        YELLOW(4, MapColor.YELLOW_STAINED_HARDENED_CLAY, "yellow", "yellow"),
        LIME(5, MapColor.LIME_STAINED_HARDENED_CLAY, "lime", "lime"),
        PINK(6, MapColor.PINK_STAINED_HARDENED_CLAY, "pink", "pink"),
        GRAY(7, MapColor.GRAY_STAINED_HARDENED_CLAY, "gray", "gray");

        private static final BlockBaseSlabColoredA.EnumType[] META_LOOKUP = new BlockBaseSlabColoredA.EnumType[values().length];
        private final int meta;
        private final MapColor mapColor;
        private final String name;
        private final String unlocalizedName;

        private EnumType(int p_i46381_3_, MapColor p_i46381_4_, String p_i46381_5_)
        {
            this(p_i46381_3_, p_i46381_4_, p_i46381_5_, p_i46381_5_);
        }

        private EnumType(int p_i46382_3_, MapColor p_i46382_4_, String p_i46382_5_, String p_i46382_6_)
        {
            this.meta = p_i46382_3_;
            this.mapColor = p_i46382_4_;
            this.name = p_i46382_5_;
            this.unlocalizedName = p_i46382_6_;
        }

        public int getMetadata()
        {
            return this.meta;
        }

        public MapColor getMapColor()
        {
            return this.mapColor;
        }

        public String toString()
        {
            return this.name;
        }

        public static BlockBaseSlabColoredA.EnumType byMetadata(int meta)
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
            for (BlockBaseSlabColoredA.EnumType blockstoneslab$enumtype : values())
            {
                META_LOOKUP[blockstoneslab$enumtype.getMetadata()] = blockstoneslab$enumtype;
            }
        }
    }
}