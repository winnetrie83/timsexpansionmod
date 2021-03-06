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

public class DemoniteBlock extends BlockBaseMetaUniversal implements IHasModel, IMetaBlock{

	public static final PropertyEnum<DemoniteBlock.EnumType> VARIANT = PropertyEnum.<DemoniteBlock.EnumType>create("variant", DemoniteBlock.EnumType.class);
	
	public DemoniteBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(30.0F);
		setResistance(20.0F);
		this.setHarvestLevel("pickaxe", 3);
		setLightLevel(0.0F);
		
		
		this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, DemoniteBlock.EnumType.RAW));
		
	}

	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "variant=raw");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 1, "variant=brick");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 2, "variant=cracked");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 3, "variant=carved");
		
		
	}

    /**
     * Get the MapColor for this Block and the given BlockState
     */
    @Override
    public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos)
    {
        return ((DemoniteBlock.EnumType)state.getValue(VARIANT)).getMapColor();
    	
    	//return BlockMapColors.LIME;
    }

    /**
     * Get the Item that this Block should drop when harvested.
     */
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(this);
    }

    /**
     * Gets the metadata of the item this Block can drop. This method is called when the block gets destroyed. It
     * returns the metadata of the dropped item based on the old metadata of the block.
     */
    @Override
    public int damageDropped(IBlockState state)
    {
        return ((DemoniteBlock.EnumType)state.getValue(VARIANT)).getMetadata();
    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @Override
    public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
    {
        for (DemoniteBlock.EnumType enumtype : DemoniteBlock.EnumType.values())
        {
            items.add(new ItemStack(this, 1, enumtype.getMetadata()));
        }
    }

    /**
     * Convert the given metadata into a BlockState for this Block
     */
    @Override
    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(VARIANT, DemoniteBlock.EnumType.byMetadata(meta));
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    @Override
    public int getMetaFromState(IBlockState state)
    {
        return ((DemoniteBlock.EnumType)state.getValue(VARIANT)).getMetadata();
    }

    @Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {VARIANT});
    }

    public static enum EnumType implements IStringSerializable
    {
        RAW(0, MapColor.GREEN_STAINED_HARDENED_CLAY, "raw"),
        BRICK(1, MapColor.GREEN_STAINED_HARDENED_CLAY, "brick"),
        CRACKED(2, MapColor.GREEN_STAINED_HARDENED_CLAY, "cracked"),
        CARVED(3, MapColor.GREEN_STAINED_HARDENED_CLAY, "carved");

        /** Array of the Block's BlockStates */
        private static final DemoniteBlock.EnumType[] META_LOOKUP = new DemoniteBlock.EnumType[values().length];
        /** The BlockState's metadata. */
        private final int meta;
        /** The EnumType's name. */
        private final String name;
        private final String unlocalizedName;
        private final MapColor mapColor;
        

        private EnumType(int p_i46383_3_, MapColor p_i46383_4_, String p_i46383_5_)
        {
            this(p_i46383_3_, p_i46383_4_, p_i46383_5_, p_i46383_5_);
        }

        private EnumType(int p_i46384_3_, MapColor p_i46384_4_, String p_i46384_5_, String p_i46384_6_)
        {
            this.meta = p_i46384_3_;
            this.name = p_i46384_5_;
            this.unlocalizedName = p_i46384_6_;
            this.mapColor = p_i46384_4_;
            
        }

        /**
         * Returns the EnumType's metadata value.
         */
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

        /**
         * Returns an EnumType for the BlockState from a metadata value.
         */
        public static DemoniteBlock.EnumType byMetadata(int meta)
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
            for (DemoniteBlock.EnumType enumtype : values())
            {
                META_LOOKUP[enumtype.getMetadata()] = enumtype;
            }
        }
    }

	@Override
	public String getSpecialName(ItemStack stack) {
		
		return DemoniteBlock.EnumType.values()[stack.getMetadata()].name().toLowerCase();
	}


}
