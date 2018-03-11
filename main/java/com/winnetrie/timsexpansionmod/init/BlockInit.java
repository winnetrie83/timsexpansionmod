package com.winnetrie.timsexpansionmod.init;

import java.util.ArrayList;
import java.util.List;

import com.winnetrie.timsexpansionmod.blocks.BlockBase;
import com.winnetrie.timsexpansionmod.blocks.BlockBaseDoubleSlabColoredA;
import com.winnetrie.timsexpansionmod.blocks.BlockBaseDoubleSlabColoredB;
import com.winnetrie.timsexpansionmod.blocks.BlockBaseHalfSlabColoredA;
import com.winnetrie.timsexpansionmod.blocks.BlockBaseHalfSlabColoredB;
import com.winnetrie.timsexpansionmod.blocks.BlockBaseStairs;
import com.winnetrie.timsexpansionmod.blocks.BlockColoredClay;
import com.winnetrie.timsexpansionmod.blocks.BrickedTerracottaBlock;
import com.winnetrie.timsexpansionmod.blocks.LimeStoneCobble;
import com.winnetrie.timsexpansionmod.blocks.LimeStoneWall;
import com.winnetrie.timsexpansionmod.blocks.MarbleStoneBlock;
import com.winnetrie.timsexpansionmod.blocks.MarbleStoneCobble;
import com.winnetrie.timsexpansionmod.blocks.MarbleStoneWall;
import com.winnetrie.timsexpansionmod.blocks.StoneDoubleSlabA;
import com.winnetrie.timsexpansionmod.blocks.StoneHalfSlabA;
import com.winnetrie.timsexpansionmod.blocks.ConcreteWallColored;
import com.winnetrie.timsexpansionmod.blocks.DemoniteBlock;
import com.winnetrie.timsexpansionmod.blocks.DemoniteDoubleSlab;
import com.winnetrie.timsexpansionmod.blocks.DemoniteHalfSlab;
import com.winnetrie.timsexpansionmod.blocks.DemoniteWall;
import com.winnetrie.timsexpansionmod.blocks.FelironOreBlock;
import com.winnetrie.timsexpansionmod.blocks.LimeStoneBlock;
import com.winnetrie.timsexpansionmod.blocks.TerracottaBlock;
import com.winnetrie.timsexpansionmod.blocks.TerracottaWallColored;

import net.minecraft.block.Block;
import net.minecraft.block.BlockColored;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumDyeColor;
import net.minecraftforge.oredict.OreDictionary;

public class BlockInit {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	
	
	public static final Block FELIRON_ORE = (new FelironOreBlock("feliron_ore", Material.ROCK));
	public static final Block DEMONITE = (new DemoniteBlock("demonite", Material.ROCK));
	public static final Block BRICKS_COLORED = (new BrickedTerracottaBlock("bricks_colored", Blocks.BRICK_BLOCK.getDefaultState())).setHardness(2.0F).setResistance(10.0F);
	public static final Block TERRACOTTA_BRICK = (new TerracottaBlock("terracotta_brick", Blocks.STAINED_HARDENED_CLAY.getDefaultState())).setHardness(1.25F).setResistance(7.0F);
	public static final Block TERRACOTTA_CRACKED = (new TerracottaBlock("terracotta_cracked", Blocks.STAINED_HARDENED_CLAY.getDefaultState())).setHardness(1.25F).setResistance(7.0F);
	public static final Block TERRACOTTA_CARVED = (new TerracottaBlock("terracotta_carved", Blocks.STAINED_HARDENED_CLAY.getDefaultState())).setHardness(1.25F).setResistance(7.0F);
	
	public static final Block COLORED_CLAY = new BlockColoredClay("colored_clay", Material.CLAY);
	
	public static final Block LIMESTONE_COBBLE = (new LimeStoneCobble("limestone_cobble", Material.ROCK)).setHardness(1.75F).setResistance(5.0F); 
	public static final Block MARBLESTONE_COBBLE = (new MarbleStoneCobble("marblestone_cobble", Material.ROCK)).setHardness(2.0F).setResistance(5.0F); 
	
	public static final Block LIMESTONE = (new LimeStoneBlock("limestone", Material.ROCK)).setHardness(1.50F).setResistance(5.0F);
	public static final Block MARBLESTONE = (new MarbleStoneBlock("marblestone", Material.ROCK)).setHardness(1.75F).setResistance(5.0F);
	
	public static final Block STONEHALFSLABS_A = (new StoneHalfSlabA("halfslab_stones_a", Material.ROCK));
	public static final Block STONEDOUBLESLABS_A = (new StoneDoubleSlabA("doubleslab_stones_a", Material.ROCK, STONEHALFSLABS_A));
	
	public static final Block LIMESTONE_COBBLE_STAIRS = (new BlockBaseStairs("limestone_cobble_stairs", BlockInit.LIMESTONE_COBBLE.getDefaultState().withProperty(LimeStoneCobble.VARIANT, LimeStoneCobble.EnumType.NORMAL))).setHardness(1.75F).setResistance(5.0F);
	public static final Block LIMESTONE_BRICK_STAIRS = (new BlockBaseStairs("limestone_brick_stairs", BlockInit.LIMESTONE.getDefaultState().withProperty(LimeStoneBlock.VARIANT, LimeStoneBlock.EnumType.RAW))).setHardness(1.50F).setResistance(5.0F);
	
	public static final Block MARBLESTONE_COBBLE_STAIRS = (new BlockBaseStairs("marblestone_cobble_stairs", BlockInit.MARBLESTONE_COBBLE.getDefaultState().withProperty(MarbleStoneCobble.VARIANT, MarbleStoneCobble.EnumType.NORMAL))).setHardness(2.0F).setResistance(5.0F);
	public static final Block MARBLESTONE_BRICK_STAIRS = (new BlockBaseStairs("marblestone_brick_stairs", BlockInit.MARBLESTONE.getDefaultState().withProperty(MarbleStoneBlock.VARIANT, MarbleStoneBlock.EnumType.RAW))).setHardness(1.75F).setResistance(5.0F);
	
	public static final Block DEMONITE_BRICK_STAIRS = (new BlockBaseStairs("demonite_brick_stairs", BlockInit.DEMONITE.getDefaultState()));
	public static final Block DEMONITE_HALFSLABS = (new DemoniteHalfSlab("demonite_halfslab", Material.ROCK));
	public static final Block DEMONITE_DOUBLESLABS = (new DemoniteDoubleSlab("demonite_doubleslab", Material.ROCK, DEMONITE_HALFSLABS));
	
	public static final Block LIMESTONEWALL = (new LimeStoneWall("limestone_wall", BlockInit.LIMESTONE.getDefaultState()));
	public static final Block MARBLESTONEWALL = (new MarbleStoneWall("marblestone_wall", BlockInit.MARBLESTONE.getDefaultState()));
	public static final Block DEMONITEWALL = (new DemoniteWall("demonite_wall", BlockInit.DEMONITE.getDefaultState()));
	
	//SLABS
	public static final Block TERRACOTTA_SLABS_HALF_A = (new BlockBaseHalfSlabColoredA("terracotta_halfslab_a", Blocks.STAINED_HARDENED_CLAY.getDefaultState())).setHardness(1.25F).setResistance(7.0F);
	public static final Block TERRACOTTA_SLABS_DOUBLE_A = (new BlockBaseDoubleSlabColoredA("terracotta_doubleslab_a", Blocks.STAINED_HARDENED_CLAY.getDefaultState(), TERRACOTTA_SLABS_HALF_A)).setHardness(1.25F).setResistance(7.0F);
	public static final Block TERRACOTTA_SLABS_HALF_B = (new BlockBaseHalfSlabColoredB("terracotta_halfslab_b", Blocks.STAINED_HARDENED_CLAY.getDefaultState())).setHardness(1.25F).setResistance(7.0F);
	public static final Block TERRACOTTA_SLABS_DOUBLE_B = (new BlockBaseDoubleSlabColoredB("terracotta_doubleslab_b", Blocks.STAINED_HARDENED_CLAY.getDefaultState(), TERRACOTTA_SLABS_HALF_B)).setHardness(1.25F).setResistance(7.0F);
	
	public static final Block TERRACOTTA_BRICK_SLABS_HALF_A = (new BlockBaseHalfSlabColoredA("terracotta_brick_halfslab_a", TERRACOTTA_BRICK.getDefaultState())).setHardness(1.25F).setResistance(7.0F);
	public static final Block TERRACOTTA_BRICK_SLABS_DOUBLE_A = (new BlockBaseDoubleSlabColoredA("terracotta_brick_doubleslab_a", TERRACOTTA_BRICK.getDefaultState(), TERRACOTTA_BRICK_SLABS_HALF_A)).setHardness(1.25F).setResistance(7.0F);
	public static final Block TERRACOTTA_BRICK_SLABS_HALF_B = (new BlockBaseHalfSlabColoredB("terracotta_brick_halfslab_b", TERRACOTTA_BRICK.getDefaultState())).setHardness(1.25F).setResistance(7.0F);
	public static final Block TERRACOTTA_BRICK_SLABS_DOUBLE_B = (new BlockBaseDoubleSlabColoredB("terracotta_brick_doubleslab_b", TERRACOTTA_BRICK.getDefaultState(), TERRACOTTA_BRICK_SLABS_HALF_B)).setHardness(1.25F).setResistance(7.0F);
	
	public static final Block BRICKS_COLORED_SLABS_HALF_A = (new BlockBaseHalfSlabColoredA("bricks_colored_halfslab_a", BRICKS_COLORED.getDefaultState())).setHardness(2.0F).setResistance(10.0F);
	public static final Block BRICKS_COLORED_SLABS_DOUBLE_A = (new BlockBaseDoubleSlabColoredA("bricks_colored_doubleslab_a", BRICKS_COLORED.getDefaultState(), BRICKS_COLORED_SLABS_HALF_A)).setHardness(2.0F).setResistance(10.0F);
	public static final Block BRICKS_COLORED_SLABS_HALF_B = (new BlockBaseHalfSlabColoredB("bricks_colored_halfslab_b", BRICKS_COLORED.getDefaultState())).setHardness(2.0F).setResistance(10.0F);
	public static final Block BRICKS_COLORED_SLABS_DOUBLE_B = (new BlockBaseDoubleSlabColoredB("bricks_colored_doubleslab_b", BRICKS_COLORED.getDefaultState(), BRICKS_COLORED_SLABS_HALF_B)).setHardness(2.0F).setResistance(10.0F);
	
	public static final Block CONCRETE_SLABS_HALF_A = (new BlockBaseHalfSlabColoredA("concrete_halfslab_a", Blocks.CONCRETE.getDefaultState())).setHardness(1.8F);
	public static final Block CONCRETE_SLABS_DOUBLE_A = (new BlockBaseDoubleSlabColoredA("concrete_doubleslab_a", Blocks.CONCRETE.getDefaultState(), CONCRETE_SLABS_HALF_A)).setHardness(1.8F);
	public static final Block CONCRETE_SLABS_HALF_B = (new BlockBaseHalfSlabColoredB("concrete_halfslab_b", Blocks.CONCRETE.getDefaultState())).setHardness(1.8F);
	public static final Block CONCRETE_SLABS_DOUBLE_B = (new BlockBaseDoubleSlabColoredB("concrete_doubleslab_b", Blocks.CONCRETE.getDefaultState(), CONCRETE_SLABS_HALF_B)).setHardness(1.8F);
	
	
	
	//STAIRS
	public static final Block TERRACOTTA_STAIRS_WHITE = (new BlockBaseStairs("terracotta_stairs_white", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.WHITE))).setHardness(1.25F).setResistance(7.0F);
	public static final Block TERRACOTTA_STAIRS_ORANGE = (new BlockBaseStairs("terracotta_stairs_orange", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.ORANGE))).setHardness(1.25F).setResistance(7.0F);
	public static final Block TERRACOTTA_STAIRS_MAGENTA = (new BlockBaseStairs("terracotta_stairs_magenta", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.MAGENTA))).setHardness(1.25F).setResistance(7.0F);
	public static final Block TERRACOTTA_STAIRS_LIGHT_BLUE = (new BlockBaseStairs("terracotta_stairs_light_blue", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.LIGHT_BLUE))).setHardness(1.25F).setResistance(7.0F);
	public static final Block TERRACOTTA_STAIRS_YELLOW = (new BlockBaseStairs("terracotta_stairs_yellow", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.YELLOW))).setHardness(1.25F).setResistance(7.0F);
	public static final Block TERRACOTTA_STAIRS_LIME = (new BlockBaseStairs("terracotta_stairs_lime", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.LIME))).setHardness(1.25F).setResistance(7.0F);
	public static final Block TERRACOTTA_STAIRS_PINK = (new BlockBaseStairs("terracotta_stairs_pink", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.PINK))).setHardness(1.25F).setResistance(7.0F);
	public static final Block TERRACOTTA_STAIRS_GRAY = (new BlockBaseStairs("terracotta_stairs_gray", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.GRAY))).setHardness(1.25F).setResistance(7.0F);
	public static final Block TERRACOTTA_STAIRS_SILVER = (new BlockBaseStairs("terracotta_stairs_silver", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.SILVER))).setHardness(1.25F).setResistance(7.0F);
	public static final Block TERRACOTTA_STAIRS_CYAN = (new BlockBaseStairs("terracotta_stairs_cyan", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.CYAN))).setHardness(1.25F).setResistance(7.0F);
	public static final Block TERRACOTTA_STAIRS_PURPLE = (new BlockBaseStairs("terracotta_stairs_purple", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.PURPLE))).setHardness(1.25F).setResistance(7.0F);
	public static final Block TERRACOTTA_STAIRS_BLUE = (new BlockBaseStairs("terracotta_stairs_blue", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BLUE))).setHardness(1.25F).setResistance(7.0F);
	public static final Block TERRACOTTA_STAIRS_BROWN = (new BlockBaseStairs("terracotta_stairs_brown", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BROWN))).setHardness(1.25F).setResistance(7.0F);
	public static final Block TERRACOTTA_STAIRS_GREEN = (new BlockBaseStairs("terracotta_stairs_green", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.GREEN))).setHardness(1.25F).setResistance(7.0F);
	public static final Block TERRACOTTA_STAIRS_RED = (new BlockBaseStairs("terracotta_stairs_red", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.RED))).setHardness(1.25F).setResistance(7.0F);
	public static final Block TERRACOTTA_STAIRS_BLACK = (new BlockBaseStairs("terracotta_stairs_black", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BLACK))).setHardness(1.25F).setResistance(7.0F);
	
	public static final Block TERRACOTTA_BRICK_STAIRS_WHITE = (new BlockBaseStairs("terracotta_brick_stairs_white", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.WHITE))).setHardness(1.25F).setResistance(7.0F);
	public static final Block TERRACOTTA_BRICK_STAIRS_ORANGE = (new BlockBaseStairs("terracotta_brick_stairs_orange", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.ORANGE))).setHardness(1.25F).setResistance(7.0F);
	public static final Block TERRACOTTA_BRICK_STAIRS_MAGENTA = (new BlockBaseStairs("terracotta_brick_stairs_magenta", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.MAGENTA))).setHardness(1.25F).setResistance(7.0F);
	public static final Block TERRACOTTA_BRICK_STAIRS_LIGHT_BLUE = (new BlockBaseStairs("terracotta_brick_stairs_light_blue", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.LIGHT_BLUE))).setHardness(1.25F).setResistance(7.0F);
	public static final Block TERRACOTTA_BRICK_STAIRS_YELLOW = (new BlockBaseStairs("terracotta_brick_stairs_yellow", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.YELLOW))).setHardness(1.25F).setResistance(7.0F);
	public static final Block TERRACOTTA_BRICK_STAIRS_LIME = (new BlockBaseStairs("terracotta_brick_stairs_lime", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.LIME))).setHardness(1.25F).setResistance(7.0F);
	public static final Block TERRACOTTA_BRICK_STAIRS_PINK = (new BlockBaseStairs("terracotta_brick_stairs_pink", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.PINK))).setHardness(1.25F).setResistance(7.0F);
	public static final Block TERRACOTTA_BRICK_STAIRS_GRAY = (new BlockBaseStairs("terracotta_brick_stairs_gray", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.GRAY))).setHardness(1.25F).setResistance(7.0F);
	public static final Block TERRACOTTA_BRICK_STAIRS_SILVER = (new BlockBaseStairs("terracotta_brick_stairs_silver", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.SILVER))).setHardness(1.25F).setResistance(7.0F);
	public static final Block TERRACOTTA_BRICK_STAIRS_CYAN = (new BlockBaseStairs("terracotta_brick_stairs_cyan", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.CYAN))).setHardness(1.25F).setResistance(7.0F);
	public static final Block TERRACOTTA_BRICK_STAIRS_PURPLE = (new BlockBaseStairs("terracotta_brick_stairs_purple", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.PURPLE))).setHardness(1.25F).setResistance(7.0F);
	public static final Block TERRACOTTA_BRICK_STAIRS_BLUE = (new BlockBaseStairs("terracotta_brick_stairs_blue", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BLUE))).setHardness(1.25F).setResistance(7.0F);
	public static final Block TERRACOTTA_BRICK_STAIRS_BROWN = (new BlockBaseStairs("terracotta_brick_stairs_brown", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BROWN))).setHardness(1.25F).setResistance(7.0F);
	public static final Block TERRACOTTA_BRICK_STAIRS_GREEN = (new BlockBaseStairs("terracotta_brick_stairs_green", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.GREEN))).setHardness(1.25F).setResistance(7.0F);
	public static final Block TERRACOTTA_BRICK_STAIRS_RED = (new BlockBaseStairs("terracotta_brick_stairs_red", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.RED))).setHardness(1.25F).setResistance(7.0F);
	public static final Block TERRACOTTA_BRICK_STAIRS_BLACK = (new BlockBaseStairs("terracotta_brick_stairs_black", Blocks.STAINED_HARDENED_CLAY.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BLACK))).setHardness(1.25F).setResistance(7.0F);
	
	public static final Block BRICKS_STAIRS_WHITE = (new BlockBaseStairs("bricks_colored_stairs_white", BRICKS_COLORED.getDefaultState().withProperty(BrickedTerracottaBlock.COLOR, EnumDyeColor.WHITE))).setHardness(2.0F).setResistance(10.0F);
	public static final Block BRICKS_STAIRS_ORANGE = (new BlockBaseStairs("bricks_colored_stairs_orange", BRICKS_COLORED.getDefaultState().withProperty(BrickedTerracottaBlock.COLOR, EnumDyeColor.ORANGE))).setHardness(2.0F).setResistance(10.0F);
	public static final Block BRICKS_STAIRS_MAGENTA = (new BlockBaseStairs("bricks_colored_stairs_magenta", BRICKS_COLORED.getDefaultState().withProperty(BrickedTerracottaBlock.COLOR, EnumDyeColor.MAGENTA))).setHardness(2.0F).setResistance(10.0F);
	public static final Block BRICKS_STAIRS_LIGHT_BLUE = (new BlockBaseStairs("bricks_colored_stairs_light_blue", BRICKS_COLORED.getDefaultState().withProperty(BrickedTerracottaBlock.COLOR, EnumDyeColor.LIGHT_BLUE))).setHardness(2.0F).setResistance(10.0F);
	public static final Block BRICKS_STAIRS_YELLOW = (new BlockBaseStairs("bricks_colored_stairs_yellow", BRICKS_COLORED.getDefaultState().withProperty(BrickedTerracottaBlock.COLOR, EnumDyeColor.YELLOW))).setHardness(2.0F).setResistance(10.0F);
	public static final Block BRICKS_STAIRS_LIME = (new BlockBaseStairs("bricks_colored_stairs_lime", BRICKS_COLORED.getDefaultState().withProperty(BrickedTerracottaBlock.COLOR, EnumDyeColor.LIME))).setHardness(2.0F).setResistance(10.0F);
	public static final Block BRICKS_STAIRS_PINK = (new BlockBaseStairs("bricks_colored_stairs_pink", BRICKS_COLORED.getDefaultState().withProperty(BrickedTerracottaBlock.COLOR, EnumDyeColor.PINK))).setHardness(2.0F).setResistance(10.0F);
	public static final Block BRICKS_STAIRS_GRAY = (new BlockBaseStairs("bricks_colored_stairs_gray", BRICKS_COLORED.getDefaultState().withProperty(BrickedTerracottaBlock.COLOR, EnumDyeColor.GRAY))).setHardness(2.0F).setResistance(10.0F);
	public static final Block BRICKS_STAIRS_SILVER = (new BlockBaseStairs("bricks_colored_stairs_silver", BRICKS_COLORED.getDefaultState().withProperty(BrickedTerracottaBlock.COLOR, EnumDyeColor.SILVER))).setHardness(2.0F).setResistance(10.0F);
	public static final Block BRICKS_STAIRS_CYAN = (new BlockBaseStairs("bricks_colored_stairs_cyan", BRICKS_COLORED.getDefaultState().withProperty(BrickedTerracottaBlock.COLOR, EnumDyeColor.CYAN))).setHardness(2.0F).setResistance(10.0F);
	public static final Block BRICKS_STAIRS_PURPLE = (new BlockBaseStairs("bricks_colored_stairs_purple", BRICKS_COLORED.getDefaultState().withProperty(BrickedTerracottaBlock.COLOR, EnumDyeColor.PURPLE))).setHardness(2.0F).setResistance(10.0F);
	public static final Block BRICKS_STAIRS_BLUE = (new BlockBaseStairs("bricks_colored_stairs_blue", BRICKS_COLORED.getDefaultState().withProperty(BrickedTerracottaBlock.COLOR, EnumDyeColor.BLUE))).setHardness(2.0F).setResistance(10.0F);
	public static final Block BRICKS_STAIRS_BROWN = (new BlockBaseStairs("bricks_colored_stairs_brown", BRICKS_COLORED.getDefaultState().withProperty(BrickedTerracottaBlock.COLOR, EnumDyeColor.BROWN))).setHardness(2.0F).setResistance(10.0F);
	public static final Block BRICKS_STAIRS_GREEN = (new BlockBaseStairs("bricks_colored_stairs_green", BRICKS_COLORED.getDefaultState().withProperty(BrickedTerracottaBlock.COLOR, EnumDyeColor.GREEN))).setHardness(2.0F).setResistance(10.0F);
	public static final Block BRICKS_STAIRS_RED = (new BlockBaseStairs("bricks_colored_stairs_red", BRICKS_COLORED.getDefaultState().withProperty(BrickedTerracottaBlock.COLOR, EnumDyeColor.RED))).setHardness(2.0F).setResistance(10.0F);
	public static final Block BRICKS_STAIRS_BLACK = (new BlockBaseStairs("bricks_colored_stairs_black", BRICKS_COLORED.getDefaultState().withProperty(BrickedTerracottaBlock.COLOR, EnumDyeColor.BLACK))).setHardness(2.0F).setResistance(10.0F);
	
	public static final Block CONCRETE_STAIRS_WHITE = (new BlockBaseStairs("concrete_stairs_white", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.WHITE))).setHardness(1.8F);
	public static final Block CONCRETE_STAIRS_ORANGE = (new BlockBaseStairs("concrete_stairs_orange", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.ORANGE))).setHardness(1.8F);
	public static final Block CONCRETE_STAIRS_MAGENTA = (new BlockBaseStairs("concrete_stairs_magenta", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.MAGENTA))).setHardness(1.8F);
	public static final Block CONCRETE_STAIRS_LIGHT_BLUE = (new BlockBaseStairs("concrete_stairs_light_blue", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.LIGHT_BLUE))).setHardness(1.8F);
	public static final Block CONCRETE_STAIRS_YELLOW = (new BlockBaseStairs("concrete_stairs_yellow", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.YELLOW))).setHardness(1.8F);
	public static final Block CONCRETE_STAIRS_LIME = (new BlockBaseStairs("concrete_stairs_lime", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.LIME))).setHardness(1.8F);
	public static final Block CONCRETE_STAIRS_PINK = (new BlockBaseStairs("concrete_stairs_pink", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.PINK))).setHardness(1.8F);
	public static final Block CONCRETE_STAIRS_GRAY = (new BlockBaseStairs("concrete_stairs_gray", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.GRAY))).setHardness(1.8F);
	public static final Block CONCRETE_STAIRS_SILVER = (new BlockBaseStairs("concrete_stairs_silver", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.SILVER))).setHardness(1.8F);
	public static final Block CONCRETE_STAIRS_CYAN = (new BlockBaseStairs("concrete_stairs_cyan", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.CYAN))).setHardness(1.8F);
	public static final Block CONCRETE_STAIRS_PURPLE = (new BlockBaseStairs("concrete_stairs_purple", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.PURPLE))).setHardness(1.8F);
	public static final Block CONCRETE_STAIRS_BLUE = (new BlockBaseStairs("concrete_stairs_blue", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BLUE))).setHardness(1.8F);
	public static final Block CONCRETE_STAIRS_BROWN = (new BlockBaseStairs("concrete_stairs_brown", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BROWN))).setHardness(1.8F);
	public static final Block CONCRETE_STAIRS_GREEN = (new BlockBaseStairs("concrete_stairs_green", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.GREEN))).setHardness(1.8F);
	public static final Block CONCRETE_STAIRS_RED = (new BlockBaseStairs("concrete_stairs_red", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.RED))).setHardness(1.8F);
	public static final Block CONCRETE_STAIRS_BLACK = (new BlockBaseStairs("concrete_stairs_black", Blocks.CONCRETE.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BLACK))).setHardness(1.8F);
	
	public static final Block TERRACOTTA_WALL = (new TerracottaWallColored("terracotta_wall", Blocks.STAINED_HARDENED_CLAY.getDefaultState())).setHardness(1.25F).setResistance(7.0F);
	public static final Block TERRACOTTA_BRICK_WALL = (new TerracottaWallColored("terracotta_brick_wall", Blocks.STAINED_HARDENED_CLAY.getDefaultState())).setHardness(1.25F).setResistance(7.0F);
	public static final Block BRICKS_COLORED_WALL = (new TerracottaWallColored("bricks_colored_wall", BRICKS_COLORED.getDefaultState())).setHardness(2.0F).setResistance(10.0F);
	public static final Block CONCRETE_WALL = (new ConcreteWallColored("concrete_wall", Blocks.CONCRETE.getDefaultState())).setHardness(1.8F);
	
	
	
	
	//public static final Block 

}
