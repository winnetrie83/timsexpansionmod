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

public class LimeStoneBlock extends BlockBaseMetaUniversal implements IHasModel, IMetaBlock{

	public static final PropertyEnum<LimeStoneBlock.EnumType> VARIANT = PropertyEnum.<LimeStoneBlock.EnumType>create("variant", LimeStoneBlock.EnumType.class);
	
	public LimeStoneBlock(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		
		this.setHarvestLevel("pickaxe", 0);
		setLightLevel(0.0F);
		
		
		this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, LimeStoneBlock.EnumType.RAW));
		
	}

	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "variant=raw");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 1, "variant=brick");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 2, "variant=mossy_brick");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 3, "variant=cracked");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 4, "variant=carved");
		
		
	}

    /**
     * Get the MapColor for this Block and the given BlockState
     */
    @Override
    public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos)
    {
        return ((LimeStoneBlock.EnumType)state.getValue(VARIANT)).getMapColor();
    	
    	//return BlockMapColors.LIME;
    }

    /**
     * Get the Item that this Block should drop when harvested.
     */
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return state.getValue(VARIANT).getMetadata() == 0 ? (new ItemStack(BlockInit.LIMESTONE_COBBLE, 1, 0)).getItem() : Item.getItemFromBlock(this);
    }

    /**
     * Gets the metadata of the item this Block can drop. This method is called when the block gets destroyed. It
     * returns the metadata of the dropped item based on the old metadata of the block.
     */
    @Override
    public int damageDropped(IBlockState state)
    {
        return ((LimeStoneBlock.EnumType)state.getValue(VARIANT)).getMetadata();
    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @Override
    public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
    {
        for (LimeStoneBlock.EnumType enumtype : LimeStoneBlock.EnumType.values())
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
        return this.getDefaultState().withProperty(VARIANT, LimeStoneBlock.EnumType.byMetadata(meta));
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    @Override
    public int getMetaFromState(IBlockState state)
    {
        return ((LimeStoneBlock.EnumType)state.getValue(VARIANT)).getMetadata();
    }

    @Override
    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {VARIANT});
    }

    public static enum EnumType implements IStringSerializable
    {
        RAW(0, BlockMapColors.LIME, "raw"),
        BRICK(1, BlockMapColors.LIME, "brick"),
        MOSSY_BRICK(2, BlockMapColors.LIME, "mossy_brick"),
        CRACKED(3, BlockMapColors.LIME, "cracked"),
        CARVED(4, BlockMapColors.LIME, "carved");

        /** Array of the Block's BlockStates */
        private static final LimeStoneBlock.EnumType[] META_LOOKUP = new LimeStoneBlock.EnumType[values().length];
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
        public static LimeStoneBlock.EnumType byMetadata(int meta)
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
            for (LimeStoneBlock.EnumType enumtype : values())
            {
                META_LOOKUP[enumtype.getMetadata()] = enumtype;
            }
        }
    }

	@Override
	public String getSpecialName(ItemStack stack) {
		
		return LimeStoneBlock.EnumType.values()[stack.getMetadata()].name().toLowerCase();
	}


}
