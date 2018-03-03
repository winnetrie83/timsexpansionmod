package com.winnetrie.timsexpansionmod.init;

import java.util.ArrayList;
import java.util.List;

import com.winnetrie.timsexpansionmod.blocks.BlockBase;
import com.winnetrie.timsexpansionmod.blocks.BlockBaseDoubleSlabColoredA;
import com.winnetrie.timsexpansionmod.blocks.BlockBaseDoubleSlabColoredB;
import com.winnetrie.timsexpansionmod.blocks.BlockBaseHalfSlabColoredA;
import com.winnetrie.timsexpansionmod.blocks.BlockBaseHalfSlabColoredB;
import com.winnetrie.timsexpansionmod.blocks.BlockBaseSlabColoredA;
import com.winnetrie.timsexpansionmod.blocks.BlockBaseStairs;
import com.winnetrie.timsexpansionmod.blocks.BlockColoredClay;
import com.winnetrie.timsexpansionmod.blocks.BrickedTerracottaBlock;
import com.winnetrie.timsexpansionmod.blocks.SlabbedTerracottaBlock;
import com.winnetrie.timsexpansionmod.util.ItemBlockMeta;
import com.winnetrie.timsexpansionmod.init.ItemInit;

import net.minecraft.block.Block;
import net.minecraft.block.BlockColored;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSlab;

public class BlockInit {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	
	
	
	public static final Block DEMONITE = new BlockBase("demonite", Material.ROCK);
	public static final Block BRICKED_TERRACOTTA = (new BrickedTerracottaBlock("bricked_terracotta", Blocks.BRICK_BLOCK.getDefaultState()));
	public static final Block SLABBED_TERRACOTTA = (new SlabbedTerracottaBlock("slabbed_terracotta", Blocks.STAINED_HARDENED_CLAY.getDefaultState()));
	public static final Block COLORED_CLAY = new BlockColoredClay("colored_clay", Material.CLAY);
	
	//SLABS
	public static final Block TERRACOTTA_SLABS_HALF_A = new BlockBaseHalfSlabColoredA("terracotta_halfslab_a", Blocks.STAINED_HARDENED_CLAY.getDefaultState());
	public static final Block TERRACOTTA_SLABS_DOUBLE_A = new BlockBaseDoubleSlabColoredA("terracotta_doubleslab_a", Blocks.STAINED_HARDENED_CLAY.getDefaultState(), TERRACOTTA_SLABS_HALF_A);
	public static final Block TERRACOTTA_SLABS_HALF_B = new BlockBaseHalfSlabColoredB("terracotta_halfslab_b", Blocks.STAINED_HARDENED_CLAY.getDefaultState());
	public static final Block TERRACOTTA_SLABS_DOUBLE_B = new BlockBaseDoubleSlabColoredB("terracotta_doubleslab_b", Blocks.STAINED_HARDENED_CLAY.getDefaultState(), TERRACOTTA_SLABS_HALF_B);
	
	public static final Block SLABBED_TERRACOTTA_SLABS_HALF_A = new BlockBaseHalfSlabColoredA("slabbed_terracotta_halfslab_a", SLABBED_TERRACOTTA.getDefaultState());
	public static final Block SLABBED_TERRACOTTA_SLABS_DOUBLE_A = new BlockBaseDoubleSlabColoredA("slabbed_terracotta_doubleslab_a", SLABBED_TERRACOTTA.getDefaultState(), SLABBED_TERRACOTTA_SLABS_HALF_A);
	public static final Block SLABBED_TERRACOTTA_SLABS_HALF_B = new BlockBaseHalfSlabColoredB("slabbed_terracotta_halfslab_b", SLABBED_TERRACOTTA.getDefaultState());
	public static final Block SLABBED_TERRACOTTA_SLABS_DOUBLE_B = new BlockBaseDoubleSlabColoredB("slabbed_terracotta_doubleslab_b", SLABBED_TERRACOTTA.getDefaultState(), SLABBED_TERRACOTTA_SLABS_HALF_B);
	
	public static final Block BRICKED_TERRACOTTA_SLABS_HALF_A = new BlockBaseHalfSlabColoredA("bricked_halfslab_a", BRICKED_TERRACOTTA.getDefaultState());
	public static final Block BRICKED_TERRACOTTA_SLABS_DOUBLE_A = new BlockBaseDoubleSlabColoredA("bricked_doubleslab_a", BRICKED_TERRACOTTA.getDefaultState(), BRICKED_TERRACOTTA_SLABS_HALF_A);
	public static final Block BRICKED_TERRACOTTA_SLABS_HALF_B = new BlockBaseHalfSlabColoredB("bricked_halfslab_b", BRICKED_TERRACOTTA.getDefaultState());
	public static final Block BRICKED_TERRACOTTA_SLABS_DOUBLE_B = new BlockBaseDoubleSlabColoredB("bricked_doubleslab_b", BRICKED_TERRACOTTA.getDefaultState(), BRICKED_TERRACOTTA_SLABS_HALF_B);
	
	public static final Block CONCRETE_SLABS_HALF_A = new BlockBaseHalfSlabColoredA("concrete_halfslab_a", Blocks.CONCRETE.getDefaultState());
	public static final Block CONCRETE_SLABS_DOUBLE_A = new BlockBaseDoubleSlabColoredA("concrete_doubleslab_a", Blocks.CONCRETE.getDefaultState(), CONCRETE_SLABS_HALF_A);
	public static final Block CONCRETE_SLABS_HALF_B = new BlockBaseHalfSlabColoredB("concrete_halfslab_b", Blocks.CONCRETE.getDefaultState());
	public static final Block CONCRETE_SLABS_DOUBLE_B = new BlockBaseDoubleSlabColoredB("concrete_doubleslab_b", Blocks.CONCRETE.getDefaultState(), CONCRETE_SLABS_HALF_B);
	
	
	
	//STAIRS
	public static final Block TERRACOTTA_STAIRS_WHITE = new BlockBaseStairs("terracotta_stairs_white", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.WHITE));
	public static final Block TERRACOTTA_STAIRS_ORANGE = new BlockBaseStairs("terracotta_stairs_orange", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.ORANGE));
	public static final Block TERRACOTTA_STAIRS_MAGENTA = new BlockBaseStairs("terracotta_stairs_magenta", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.MAGENTA));
	public static final Block TERRACOTTA_STAIRS_LIGHT_BLUE = new BlockBaseStairs("terracotta_stairs_light_blue", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.LIGHT_BLUE));
	public static final Block TERRACOTTA_STAIRS_YELLOW = new BlockBaseStairs("terracotta_stairs_yellow", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.YELLOW));
	public static final Block TERRACOTTA_STAIRS_LIME = new BlockBaseStairs("terracotta_stairs_lime", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.LIME));
	public static final Block TERRACOTTA_STAIRS_PINK = new BlockBaseStairs("terracotta_stairs_pink", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.PINK));
	public static final Block TERRACOTTA_STAIRS_GRAY = new BlockBaseStairs("terracotta_stairs_gray", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.GRAY));
	public static final Block TERRACOTTA_STAIRS_SILVER = new BlockBaseStairs("terracotta_stairs_silver", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.SILVER));
	public static final Block TERRACOTTA_STAIRS_CYAN = new BlockBaseStairs("terracotta_stairs_cyan", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.CYAN));
	public static final Block TERRACOTTA_STAIRS_PURPLE = new BlockBaseStairs("terracotta_stairs_purple", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.PURPLE));
	public static final Block TERRACOTTA_STAIRS_BLUE = new BlockBaseStairs("terracotta_stairs_blue", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BLUE));
	public static final Block TERRACOTTA_STAIRS_BROWN = new BlockBaseStairs("terracotta_stairs_brown", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BROWN));
	public static final Block TERRACOTTA_STAIRS_GREEN = new BlockBaseStairs("terracotta_stairs_green", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.GREEN));
	public static final Block TERRACOTTA_STAIRS_RED = new BlockBaseStairs("terracotta_stairs_red", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.RED));
	public static final Block TERRACOTTA_STAIRS_BLACK = new BlockBaseStairs("terracotta_stairs_black", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BLACK));
	
	public static final Block SLABBED_TERRACOTTA_STAIRS_WHITE = new BlockBaseStairs("slabbed_terracotta_stairs_white", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.WHITE));
	public static final Block SLABBED_TERRACOTTA_STAIRS_ORANGE = new BlockBaseStairs("slabbed_terracotta_stairs_orange", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.ORANGE));
	public static final Block SLABBED_TERRACOTTA_STAIRS_MAGENTA = new BlockBaseStairs("slabbed_terracotta_stairs_magenta", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.MAGENTA));
	public static final Block SLABBED_TERRACOTTA_STAIRS_LIGHT_BLUE = new BlockBaseStairs("slabbed_terracotta_stairs_light_blue", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.LIGHT_BLUE));
	public static final Block SLABBED_TERRACOTTA_STAIRS_YELLOW = new BlockBaseStairs("slabbed_terracotta_stairs_yellow", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.YELLOW));
	public static final Block SLABBED_TERRACOTTA_STAIRS_LIME = new BlockBaseStairs("slabbed_terracotta_stairs_lime", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.LIME));
	public static final Block SLABBED_TERRACOTTA_STAIRS_PINK = new BlockBaseStairs("slabbed_terracotta_stairs_pink", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.PINK));
	public static final Block SLABBED_TERRACOTTA_STAIRS_GRAY = new BlockBaseStairs("slabbed_terracotta_stairs_gray", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.GRAY));
	public static final Block SLABBED_TERRACOTTA_STAIRS_SILVER = new BlockBaseStairs("slabbed_terracotta_stairs_silver", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.SILVER));
	public static final Block SLABBED_TERRACOTTA_STAIRS_CYAN = new BlockBaseStairs("slabbed_terracotta_stairs_cyan", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.CYAN));
	public static final Block SLABBED_TERRACOTTA_STAIRS_PURPLE = new BlockBaseStairs("slabbed_terracotta_stairs_purple", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.PURPLE));
	public static final Block SLABBED_TERRACOTTA_STAIRS_BLUE = new BlockBaseStairs("slabbed_terracotta_stairs_blue", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BLUE));
	public static final Block SLABBED_TERRACOTTA_STAIRS_BROWN = new BlockBaseStairs("slabbed_terracotta_stairs_brown", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BROWN));
	public static final Block SLABBED_TERRACOTTA_STAIRS_GREEN = new BlockBaseStairs("slabbed_terracotta_stairs_green", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.GREEN));
	public static final Block SLABBED_TERRACOTTA_STAIRS_RED = new BlockBaseStairs("slabbed_terracotta_stairs_red", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.RED));
	public static final Block SLABBED_TERRACOTTA_STAIRS_BLACK = new BlockBaseStairs("slabbed_terracotta_stairs_black", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BLACK));
	
	public static final Block BRICKED_TERRACOTTA_STAIRS_WHITE = new BlockBaseStairs("bricked_stairs_white", BRICKED_TERRACOTTA.getDefaultState().withProperty(BrickedTerracottaBlock.COLOR, EnumDyeColor.WHITE));
	public static final Block BRICKED_TERRACOTTA_STAIRS_ORANGE = new BlockBaseStairs("bricked_stairs_orange", BRICKED_TERRACOTTA.getDefaultState().withProperty(BrickedTerracottaBlock.COLOR, EnumDyeColor.ORANGE));
	public static final Block BRICKED_TERRACOTTA_STAIRS_MAGENTA = new BlockBaseStairs("bricked_stairs_magenta", BRICKED_TERRACOTTA.getDefaultState().withProperty(BrickedTerracottaBlock.COLOR, EnumDyeColor.MAGENTA));
	public static final Block BRICKED_TERRACOTTA_STAIRS_LIGHT_BLUE = new BlockBaseStairs("bricked_stairs_light_blue", BRICKED_TERRACOTTA.getDefaultState().withProperty(BrickedTerracottaBlock.COLOR, EnumDyeColor.LIGHT_BLUE));
	public static final Block BRICKED_TERRACOTTA_STAIRS_YELLOW = new BlockBaseStairs("bricked_stairs_yellow", BRICKED_TERRACOTTA.getDefaultState().withProperty(BrickedTerracottaBlock.COLOR, EnumDyeColor.YELLOW));
	public static final Block BRICKED_TERRACOTTA_STAIRS_LIME = new BlockBaseStairs("bricked_stairs_lime", BRICKED_TERRACOTTA.getDefaultState().withProperty(BrickedTerracottaBlock.COLOR, EnumDyeColor.LIME));
	public static final Block BRICKED_TERRACOTTA_STAIRS_PINK = new BlockBaseStairs("bricked_stairs_pink", BRICKED_TERRACOTTA.getDefaultState().withProperty(BrickedTerracottaBlock.COLOR, EnumDyeColor.PINK));
	public static final Block BRICKED_TERRACOTTA_STAIRS_GRAY = new BlockBaseStairs("bricked_stairs_gray", BRICKED_TERRACOTTA.getDefaultState().withProperty(BrickedTerracottaBlock.COLOR, EnumDyeColor.GRAY));
	public static final Block BRICKED_TERRACOTTA_STAIRS_SILVER = new BlockBaseStairs("bricked_stairs_silver", BRICKED_TERRACOTTA.getDefaultState().withProperty(BrickedTerracottaBlock.COLOR, EnumDyeColor.SILVER));
	public static final Block BRICKED_TERRACOTTA_STAIRS_CYAN = new BlockBaseStairs("bricked_stairs_cyan", BRICKED_TERRACOTTA.getDefaultState().withProperty(BrickedTerracottaBlock.COLOR, EnumDyeColor.CYAN));
	public static final Block BRICKED_TERRACOTTA_STAIRS_PURPLE = new BlockBaseStairs("bricked_stairs_purple", BRICKED_TERRACOTTA.getDefaultState().withProperty(BrickedTerracottaBlock.COLOR, EnumDyeColor.PURPLE));
	public static final Block BRICKED_TERRACOTTA_STAIRS_BLUE = new BlockBaseStairs("bricked_stairs_blue", BRICKED_TERRACOTTA.getDefaultState().withProperty(BrickedTerracottaBlock.COLOR, EnumDyeColor.BLUE));
	public static final Block BRICKED_TERRACOTTA_STAIRS_BROWN = new BlockBaseStairs("bricked_stairs_brown", BRICKED_TERRACOTTA.getDefaultState().withProperty(BrickedTerracottaBlock.COLOR, EnumDyeColor.BROWN));
	public static final Block BRICKED_TERRACOTTA_STAIRS_GREEN = new BlockBaseStairs("bricked_stairs_green", BRICKED_TERRACOTTA.getDefaultState().withProperty(BrickedTerracottaBlock.COLOR, EnumDyeColor.GREEN));
	public static final Block BRICKED_TERRACOTTA_STAIRS_RED = new BlockBaseStairs("bricked_stairs_red", BRICKED_TERRACOTTA.getDefaultState().withProperty(BrickedTerracottaBlock.COLOR, EnumDyeColor.RED));
	public static final Block BRICKED_TERRACOTTA_STAIRS_BLACK = new BlockBaseStairs("bricked_stairs_black", BRICKED_TERRACOTTA.getDefaultState().withProperty(BrickedTerracottaBlock.COLOR, EnumDyeColor.BLACK));
	
	public static final Block CONCRETE_STAIRS_WHITE = new BlockBaseStairs("concrete_stairs_white", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.WHITE));
	public static final Block CONCRETE_STAIRS_ORANGE = new BlockBaseStairs("concrete_stairs_orange", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.ORANGE));
	public static final Block CONCRETE_STAIRS_MAGENTA = new BlockBaseStairs("concrete_stairs_magenta", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.MAGENTA));
	public static final Block CONCRETE_STAIRS_LIGHT_BLUE = new BlockBaseStairs("concrete_stairs_light_blue", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.LIGHT_BLUE));
	public static final Block CONCRETE_STAIRS_YELLOW = new BlockBaseStairs("concrete_stairs_yellow", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.YELLOW));
	public static final Block CONCRETE_STAIRS_LIME = new BlockBaseStairs("concrete_stairs_lime", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.LIME));
	public static final Block CONCRETE_STAIRS_PINK = new BlockBaseStairs("concrete_stairs_pink", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.PINK));
	public static final Block CONCRETE_STAIRS_GRAY = new BlockBaseStairs("concrete_stairs_gray", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.GRAY));
	public static final Block CONCRETE_STAIRS_SILVER = new BlockBaseStairs("concrete_stairs_silver", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.SILVER));
	public static final Block CONCRETE_STAIRS_CYAN = new BlockBaseStairs("concrete_stairs_cyan", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.CYAN));
	public static final Block CONCRETE_STAIRS_PURPLE = new BlockBaseStairs("concrete_stairs_purple", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.PURPLE));
	public static final Block CONCRETE_STAIRS_BLUE = new BlockBaseStairs("concrete_stairs_blue", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BLUE));
	public static final Block CONCRETE_STAIRS_BROWN = new BlockBaseStairs("concrete_stairs_brown", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BROWN));
	public static final Block CONCRETE_STAIRS_GREEN = new BlockBaseStairs("concrete_stairs_green", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.GREEN));
	public static final Block CONCRETE_STAIRS_RED = new BlockBaseStairs("concrete_stairs_red", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.RED));
	public static final Block CONCRETE_STAIRS_BLACK = new BlockBaseStairs("concrete_stairs_black", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BLACK));
	
	//public static final Block 

}
