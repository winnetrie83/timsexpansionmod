package com.winnetrie.timsexpansionmod.blocks;

import java.util.Random;

import javax.annotation.Nullable;

import com.winnetrie.timsexpansionmod.Main;
import com.winnetrie.timsexpansionmod.init.BlockInit;
import com.winnetrie.timsexpansionmod.init.ItemInit;
import com.winnetrie.timsexpansionmod.util.BlockMapColors;
import com.winnetrie.timsexpansionmod.util.IHasModel;
import com.winnetrie.timsexpansionmod.util.IMetaBlock;
import com.winnetrie.timsexpansionmod.util.ItemBlockMeta;
import com.winnetrie.timsexpansionmod.util.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStainedHardenedClay;
import net.minecraft.block.BlockStoneSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public abstract class StoneSlabsA extends BlockSlab implements IMetaBlock, IHasModel
{
    public static final PropertyEnum<StoneSlabsA.EnumType> VARIANT = PropertyEnum.<StoneSlabsA.EnumType>create("variant", StoneSlabsA.EnumType.class);
    
    
    

    public StoneSlabsA(String name, Material material)
    {
        super(material);
        IBlockState iblockstate = this.blockState.getBaseState().withProperty(VARIANT, StoneSlabsA.EnumType.LIMESTONE_RAW);   
        if(!this.isDouble()){

        	iblockstate = iblockstate.withProperty(HALF, EnumBlockHalf.BOTTOM).withProperty(VARIANT, StoneSlabsA.EnumType.LIMESTONE_RAW);
		}

        this.setDefaultState(iblockstate);
        setUnlocalizedName(name);
		setRegistryName(Reference.PREFIX + name);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		this.setHarvestLevel("pickaxe", 0);
        setResistance(5.0F);
        setSoundType(SoundType.STONE);
		setLightLevel(0.0F);
		this.useNeighborBrightness = true;
		
		BlockInit.BLOCKS.add(this);

    }
    
    @Override
    public float getBlockHardness(IBlockState blockState, World worldIn, BlockPos pos){
    	
    	
    	float hardness = 0.0F;
    	if ((blockState.getBlock() != Blocks.AIR) && (blockState.getBlock() != null) && (blockState.getBlock() instanceof StoneSlabsA)) {
    		
    		switch(getMetaFromState(blockState)) {
    		
    		case 0 : hardness = 1.5F; break;
    		case 1 : hardness = 1.75F; break;
    		case 2 : hardness = 1.75F; break;
    		case 3 : hardness = 2.00F; break;
    		case 4 : hardness = 1.5F; break;
    		case 5 : hardness = 1.75F; break;
    		case 6 : hardness = 0.0F; break;
    		case 7 : hardness = 0.0F; break;
    		case 8 : hardness = 1.5F; break;
    		case 9 : hardness = 1.75F; break;
    		case 10 : hardness = 1.75F; break;
    		case 11 : hardness = 2.00F; break;
    		case 12 : hardness = 1.5F; break;
    		case 13 : hardness = 1.75F; break;
    		case 14 : hardness = 0.0F;  break;
    		case 15 : hardness = 0.0F; break;
    		
    		}
    		
    	}	
        return hardness;
    }
    
    
    @Override
    public void registerModels() {
		
    	if (!isDouble()) {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "half=bottom,variant=limestone_raw");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 1, "half=bottom,variant=marblestone_raw");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 2, "half=bottom,variant=limestone_cobble");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 3, "half=bottom,variant=marblestone_cobble");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 4, "half=bottom,variant=limestone_brick");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 5, "half=bottom,variant=marblestone_brick");
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
        return new ItemStack(this.getHalfSlabReference(), 1, ((StoneSlabsA.EnumType)state.getValue(VARIANT)).getMetadata());
    }

    /**
     * Returns the slab block name with the type associated with it
     */
    @Override
    public String getUnlocalizedName(int meta)
    {
        return super.getUnlocalizedName() + "." + StoneSlabsA.EnumType.byMetadata(meta).getUnlocalizedName();
    }

    @Override
    public IProperty<?> getVariantProperty()
    {
        return VARIANT;
    }

    @Override
    public Comparable<?> getTypeForItem(ItemStack stack)
    {
        return StoneSlabsA.EnumType.byMetadata(stack.getMetadata() & 7);
    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @Override
    public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
    {
        for (StoneSlabsA.EnumType blockstoneslab$enumtype : StoneSlabsA.EnumType.values())
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
        IBlockState iblockstate = this.getDefaultState().withProperty(VARIANT, StoneSlabsA.EnumType.values()[meta & 7]);

        if (!this.isDouble())

        {
            iblockstate = iblockstate.withProperty(HALF, (meta & 8) == 0 ? BlockSlab.EnumBlockHalf.BOTTOM : BlockSlab.EnumBlockHalf.TOP);
        }

        return iblockstate;
    }

    @Override
    public int getMetaFromState(IBlockState state)
    {
        int i = state.getValue(VARIANT).getMetadata();
        if (!this.isDouble() && state.getValue(HALF) == BlockSlab.EnumBlockHalf.TOP)
        {
            i |= 8;
        }
        return i;
    }

    @Override
    protected BlockStateContainer createBlockState()
    {
        return this.isDouble() ? new BlockStateContainer(this, new IProperty[] { VARIANT}) : new BlockStateContainer(this, new IProperty[] {HALF, VARIANT});
    }

    /**
     * Gets the metadata of the item this Block can drop. This method is called when the block gets destroyed. It
     * returns the metadata of the dropped item based on the old metadata of the block.
     */
    @Override
    public int damageDropped(IBlockState state)
    {
        return ((StoneSlabsA.EnumType)state.getValue(VARIANT)).getMetadata();
    }

    /**
     * Get the MapColor for this Block and the given BlockState
     */
    @Override
    public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos)
    {
        
    	MapColor mapcolor = null;
    	int meta = getMetaFromState(state);
    	if (meta > 7) {
    		meta = meta-8;
    		if ((meta == 0) || (meta == 2) || (meta == 4) ) {
    			
    			mapcolor = BlockMapColors.LIME;
    		}
    		else if ((meta == 1) || (meta == 3) || (meta == 5) ) {
    			
    			mapcolor = BlockMapColors.MARBLE;
    		}
    		else {mapcolor = MapColor.BLACK;}
    	}
        
    	return mapcolor;
    }

    @Override
	public String getSpecialName(ItemStack stack) {
		
		return EnumType.values()[stack.getMetadata()].name().toLowerCase();

	}
    
    public static enum EnumType implements IStringSerializable
    {
        LIMESTONE_RAW(0,  "limestone_raw", "limestone_raw"),
        MARBLESTONE_RAW(1,  "marblestone_raw", "marblestone_raw"),
        LIMESTONE_COBBLE(2,  "limestone_cobble", "limestone_cobble"),
        MARBLESTONE_COBBLE(3,  "marblestone_cobble", "marblestone_cobble"),
        LIMESTONE_BRICK(4,  "limestone_brick", "limestone_brick"),
        MARBLESTONE_BRICK(5,  "marblestone_brick", "marblestone_brick");

        private static final StoneSlabsA.EnumType[] META_LOOKUP = new StoneSlabsA.EnumType[values().length];
        private final int meta;
        private final String name;
        private final String unlocalizedName;

        private EnumType(int p_i46381_3_, String p_i46381_5_)
        {
            this(p_i46381_3_,  p_i46381_5_, p_i46381_5_);
        }

        private EnumType(int p_i46382_3_,  String p_i46382_5_, String p_i46382_6_)
        {
            this.meta = p_i46382_3_;
            this.name = p_i46382_5_;
            this.unlocalizedName = p_i46382_6_;
        }

        public int getMetadata()
        {
            return this.meta;
        }

        

        public String toString()
        {
            return this.name;
        }

        public static StoneSlabsA.EnumType byMetadata(int meta)
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
            for (StoneSlabsA.EnumType blockstoneslab$enumtype : values())
            {
                META_LOOKUP[blockstoneslab$enumtype.getMetadata()] = blockstoneslab$enumtype;
            }
        }
    }
}