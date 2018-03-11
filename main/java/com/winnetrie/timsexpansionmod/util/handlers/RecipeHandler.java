package com.winnetrie.timsexpansionmod.util.handlers;

import java.util.Iterator;
import java.util.Map;

import com.winnetrie.timsexpansionmod.blocks.LimeStoneBlock;
import com.winnetrie.timsexpansionmod.blocks.LimeStoneCobble;
import com.winnetrie.timsexpansionmod.blocks.MarbleStoneBlock;
import com.winnetrie.timsexpansionmod.blocks.MarbleStoneCobble;
import com.winnetrie.timsexpansionmod.blocks.StoneSlabsA;
import com.winnetrie.timsexpansionmod.init.BlockInit;
import com.winnetrie.timsexpansionmod.init.ItemInit;
import com.winnetrie.timsexpansionmod.util.RecipeGenerator;
import com.winnetrie.timsexpansionmod.util.Reference;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler {
	
	public static void registerCrafting () {
		/*
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.DEMONITE, 1, 3), 
				new Object[] {"BB", "BB", 'B', new ItemStack(BlockInit.DEMONITE_HALFSLABS, 1, 1)});
		
		
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.LIMESTONE_COBBLE_STAIRS, 6), 
				new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.LIMESTONE_COBBLE,1,0)});
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.LIMESTONE_BRICK_STAIRS, 6), 
				new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.LIMESTONE,1,1)});
		
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.STONEHALFSLABS_A, 6, 0), 
				new Object[] {"BBB", 'B', new ItemStack(BlockInit.LIMESTONE, 1, 0)});
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.STONEHALFSLABS_A, 6, 2), 
				new Object[] {"BBB", 'B', new ItemStack(BlockInit.LIMESTONE_COBBLE, 1, 0)});
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.STONEHALFSLABS_A, 6, 4), 
				new Object[] {"BBB", 'B', new ItemStack(BlockInit.LIMESTONE, 1, 1)});
		
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.LIMESTONE, 4, 1), 
				new Object[] {"BB", "BB", 'B', new ItemStack(BlockInit.LIMESTONE, 1, 0)});
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.LIMESTONE, 1, 4), 
				new Object[] {"B", "B", 'B', new ItemStack(BlockInit.STONEHALFSLABS_A, 1, 4)});
		
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.LIMESTONE_COBBLE, 1, 1), 
				new Object[] {"BV", 'B', new ItemStack(BlockInit.LIMESTONE_COBBLE, 1, 0), 'V', new ItemStack(Blocks.VINE)});
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.LIMESTONE, 1, 2), 
				new Object[] {"BV", 'B', new ItemStack(BlockInit.LIMESTONE, 1, 1), 'V', new ItemStack(Blocks.VINE)});
		
		
		
		
		
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.MARBLESTONE_COBBLE_STAIRS), 
				new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.MARBLESTONE_COBBLE,1,0)});
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.MARBLESTONE_BRICK_STAIRS), 
				new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.MARBLESTONE,1,1)});
		
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.STONEHALFSLABS_A, 6, 1), 
				new Object[] {"BBB", 'B', new ItemStack(BlockInit.MARBLESTONE, 1, 0)});
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.STONEHALFSLABS_A, 6, 3), 
				new Object[] {"BBB", 'B', new ItemStack(BlockInit.MARBLESTONE_COBBLE, 1, 0)});
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.STONEHALFSLABS_A, 6, 5), 
				new Object[] {"BBB", 'B', new ItemStack(BlockInit.MARBLESTONE, 1, 1)});
		
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.MARBLESTONE, 4, 1), 
				new Object[] {"BB", "BB", 'B', new ItemStack(BlockInit.MARBLESTONE, 1, 0)});
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.MARBLESTONE, 1, 4), 
				new Object[] {"B", "B", 'B', new ItemStack(BlockInit.STONEHALFSLABS_A, 1, 5)});
		
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.MARBLESTONE_COBBLE, 1, 1), 
				new Object[] {"BV", 'B', new ItemStack(BlockInit.MARBLESTONE_COBBLE, 1, 0), 'V', new ItemStack(Blocks.VINE)});
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.MARBLESTONE, 1, 2), 
				new Object[] {"BV", 'B', new ItemStack(BlockInit.MARBLESTONE, 1, 1), 'V', new ItemStack(Blocks.VINE)});
		
		
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.DEMONITE, 4, 1), 
				new Object[] {"BB", "BB", 'B', new ItemStack(BlockInit.DEMONITE, 1, 0)});
		
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.DEMONITE_HALFSLABS, 6, 0), 
				new Object[] {"BBB", 'B', new ItemStack(BlockInit.DEMONITE, 1, 0)});
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.DEMONITE_HALFSLABS, 6, 1), 
				new Object[] {"BBB", 'B', new ItemStack(BlockInit.DEMONITE, 1, 1)});
		
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.DEMONITE_BRICK_STAIRS, 6), 
				new Object[] {"B  ", "BB ", "BBB", 'B', new ItemStack(BlockInit.DEMONITE, 1, 1)});
		
		
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.STONEHALFSLABS_A, 6, StoneSlabsA.EnumType.LIMESTONE_RAW.getMetadata()), 
				new Object[] {"B","B", "B", 'B', new ItemStack(BlockInit.LIMESTONE, 1, LimeStoneBlock.EnumType.RAW.getMetadata())});
		
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.STONEHALFSLABS_A, 6, StoneSlabsA.EnumType.LIMESTONE_COBBLE.getMetadata()), 
				new Object[] {"B","B", "B", 'B', new ItemStack(BlockInit.LIMESTONE_COBBLE, 1, LimeStoneCobble.EnumType.NORMAL.getMetadata())});
		
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.STONEHALFSLABS_A, 6, StoneSlabsA.EnumType.LIMESTONE_BRICK.getMetadata()), 
				new Object[] {"B","B", "B", 'B', new ItemStack(BlockInit.LIMESTONE, 1, LimeStoneBlock.EnumType.BRICK.getMetadata())});
		
		
		
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.STONEHALFSLABS_A, 6, StoneSlabsA.EnumType.MARBLESTONE_RAW.getMetadata()), 
				new Object[] {"B","B", "B", 'B', new ItemStack(BlockInit.MARBLESTONE, 1, MarbleStoneBlock.EnumType.RAW.getMetadata())});
		
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.STONEHALFSLABS_A, 6, StoneSlabsA.EnumType.MARBLESTONE_COBBLE.getMetadata()), 
				new Object[] {"B","B", "B", 'B', new ItemStack(BlockInit.MARBLESTONE_COBBLE, 1, MarbleStoneCobble.EnumType.NORMAL.getMetadata())});
		
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.STONEHALFSLABS_A, 6, StoneSlabsA.EnumType.MARBLESTONE_BRICK.getMetadata()), 
				new Object[] {"B","B", "B", 'B', new ItemStack(BlockInit.MARBLESTONE, 1, MarbleStoneBlock.EnumType.BRICK.getMetadata())});
		
		
		
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.LIMESTONE_COBBLE_STAIRS, 6), 
				new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.LIMESTONE_COBBLE, 1, LimeStoneCobble.EnumType.NORMAL.getMetadata())});
		
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.LIMESTONE_BRICK_STAIRS, 6), 
				new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.LIMESTONE_COBBLE, 1, LimeStoneBlock.EnumType.BRICK.getMetadata())});
		
		
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.MARBLESTONE_COBBLE_STAIRS, 6), 
				new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.MARBLESTONE_COBBLE, 1, MarbleStoneCobble.EnumType.NORMAL.getMetadata())});
		
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.MARBLESTONE_BRICK_STAIRS, 6), 
				new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.MARBLESTONE_COBBLE, 1, MarbleStoneBlock.EnumType.BRICK.getMetadata())});
		
		
		for(int i=0; i<16; i++) {
		//RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.COLORED_CLAY,8,i), new Object[] {"BBB","BCB","BBB",'B', new ItemStack(Blocks.CLAY), 'C', new ItemStack(Items.DYE,1,15-i)});
			
			//RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.TERRACOTTA_BRICK,4,i), new Object[] {"BB","BB",'B', new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,i)});
			
			//RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.TERRACOTTA_BRICK_WALL,6,i), new Object[] {"BBB","BBB",'B', new ItemStack(BlockInit.TERRACOTTA_BRICK,1,i)});
			
			
			
			//RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.BRICKS_COLORED,1,i), new Object[] {"BB","BB",'B', new ItemStack(ItemInit.TERRACOTTA_BRICK_COLORED,1,i)});
			
			//RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.BRICKS_COLORED_WALL,6,i), new Object[] {"BBB","BBB",'B', new ItemStack(BlockInit.BRICKS_COLORED,1,i)});
			
			
		}	
		
		for(int i=0; i<8; i++) {
			
			//RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.BRICKS_COLORED_SLABS_HALF_A,6,i), new Object[] {"BBB",'B', new ItemStack(BlockInit.BRICKS_COLORED,1,i)});
			//RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.BRICKS_COLORED_SLABS_HALF_B,6,i), new Object[] {"BBB",'B', new ItemStack(BlockInit.BRICKS_COLORED,1,i+8)});
			
			//RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.TERRACOTTA_BRICK_SLABS_HALF_A,6,i), new Object[] {"BBB",'B', new ItemStack(BlockInit.TERRACOTTA_BRICK,1,i)});
			//RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.TERRACOTTA_BRICK_SLABS_HALF_B,6,i), new Object[] {"BBB",'B', new ItemStack(BlockInit.TERRACOTTA_BRICK,1,i+8)});
			
			
			//RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.TERRACOTTA_CARVED,1,i), new Object[] {"B","B",'B', new ItemStack(BlockInit.TERRACOTTA_BRICK_SLABS_HALF_A,1,i)});
			//RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.TERRACOTTA_CARVED,1,i+8), new Object[] {"B","B",'B', new ItemStack(BlockInit.TERRACOTTA_BRICK_SLABS_HALF_B,1,i)});
		}
		
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.TERRACOTTA_BRICK_STAIRS_WHITE,4), new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.TERRACOTTA_BRICK,1,0)});
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.TERRACOTTA_BRICK_STAIRS_ORANGE,4), new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.TERRACOTTA_BRICK,1,1)});
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.TERRACOTTA_BRICK_STAIRS_MAGENTA,4), new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.TERRACOTTA_BRICK,1,2)});
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.TERRACOTTA_BRICK_STAIRS_LIGHT_BLUE,4), new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.TERRACOTTA_BRICK,1,3)});
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.TERRACOTTA_BRICK_STAIRS_YELLOW,4), new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.TERRACOTTA_BRICK,1,4)});
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.TERRACOTTA_BRICK_STAIRS_LIME,4), new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.TERRACOTTA_BRICK,1,5)});
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.TERRACOTTA_BRICK_STAIRS_PINK,4), new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.TERRACOTTA_BRICK,1,6)});
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.TERRACOTTA_BRICK_STAIRS_GRAY,4), new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.TERRACOTTA_BRICK,1,7)});
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.TERRACOTTA_BRICK_STAIRS_SILVER,4), new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.TERRACOTTA_BRICK,1,8)});
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.TERRACOTTA_BRICK_STAIRS_CYAN,4), new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.TERRACOTTA_BRICK,1,9)});
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.TERRACOTTA_BRICK_STAIRS_PURPLE,4), new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.TERRACOTTA_BRICK,1,10)});
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.TERRACOTTA_BRICK_STAIRS_BLUE,4), new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.TERRACOTTA_BRICK,1,11)});
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.TERRACOTTA_BRICK_STAIRS_BROWN,4), new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.TERRACOTTA_BRICK,1,12)});
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.TERRACOTTA_BRICK_STAIRS_GREEN,4), new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.TERRACOTTA_BRICK,1,13)});
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.TERRACOTTA_BRICK_STAIRS_RED,4), new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.TERRACOTTA_BRICK,1,14)});
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.TERRACOTTA_BRICK_STAIRS_BLACK,4), new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.TERRACOTTA_BRICK,1,15)});
		
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.BRICKS_STAIRS_WHITE,4), new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.BRICKS_COLORED,1,0)});
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.BRICKS_STAIRS_ORANGE,4), new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.BRICKS_COLORED,1,1)});
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.BRICKS_STAIRS_MAGENTA,4), new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.BRICKS_COLORED,1,2)});
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.BRICKS_STAIRS_LIGHT_BLUE,4), new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.BRICKS_COLORED,1,3)});
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.BRICKS_STAIRS_YELLOW,4), new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.BRICKS_COLORED,1,4)});
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.BRICKS_STAIRS_LIME,4), new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.BRICKS_COLORED,1,5)});
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.BRICKS_STAIRS_PINK,4), new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.BRICKS_COLORED,1,6)});
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.BRICKS_STAIRS_GRAY,4), new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.BRICKS_COLORED,1,7)});
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.BRICKS_STAIRS_SILVER,4), new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.BRICKS_COLORED,1,8)});
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.BRICKS_STAIRS_CYAN,4), new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.BRICKS_COLORED,1,9)});
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.BRICKS_STAIRS_PURPLE,4), new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.BRICKS_COLORED,1,10)});
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.BRICKS_STAIRS_BLUE,4), new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.BRICKS_COLORED,1,11)});
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.BRICKS_STAIRS_BROWN,4), new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.BRICKS_COLORED,1,12)});
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.BRICKS_STAIRS_GREEN,4), new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.BRICKS_COLORED,1,13)});
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.BRICKS_STAIRS_RED,4), new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.BRICKS_COLORED,1,14)});
		RecipeGenerator.addShapedRecipe(new ItemStack(BlockInit.BRICKS_STAIRS_BLACK,4), new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.BRICKS_COLORED,1,15)});
		*/
	}
	
	public static void registerSmelting() {
		
		//param1 = input,  param2 = output; param3 = xp(float)
		GameRegistry.addSmelting(new ItemStack(ItemInit.CLAY_BUCKET), new ItemStack(ItemInit.TERRACOTTA_BUCKET_EMPTY), 0.5F);
		GameRegistry.addSmelting(new ItemStack(BlockInit.LIMESTONE_COBBLE, 1, LimeStoneCobble.EnumType.NORMAL.getMetadata()), new ItemStack(BlockInit.LIMESTONE, 1, LimeStoneBlock.EnumType.RAW.getMetadata()), 0.1F);
		GameRegistry.addSmelting(new ItemStack(BlockInit.MARBLESTONE_COBBLE, 1, MarbleStoneCobble.EnumType.NORMAL.getMetadata()), new ItemStack(BlockInit.MARBLESTONE, 1 , MarbleStoneBlock.EnumType.RAW.getMetadata()), 0.1F);
		GameRegistry.addSmelting(new ItemStack(BlockInit.LIMESTONE, 1, LimeStoneBlock.EnumType.BRICK.getMetadata()), new ItemStack(BlockInit.LIMESTONE, 1, LimeStoneBlock.EnumType.CRACKED.getMetadata()), 0.1F);
		GameRegistry.addSmelting(new ItemStack(BlockInit.MARBLESTONE, 1, MarbleStoneBlock.EnumType.BRICK.getMetadata()), new ItemStack(BlockInit.MARBLESTONE, 1, MarbleStoneBlock.EnumType.CRACKED.getMetadata()), 0.1F);
		//GameRegistry.addSmelting(new ItemStack(), new ItemStack(), F);
		//GameRegistry.addSmelting(new ItemStack(), new ItemStack(), F);
		
		for(int i=0; i<16; i++) {
			GameRegistry.addSmelting(new ItemStack(ItemInit.CLAYBALL_COLORED, 1, i), new ItemStack(ItemInit.TERRACOTTA_BRICK_COLORED, 1, i), 0.3F);
			GameRegistry.addSmelting(new ItemStack(BlockInit.COLORED_CLAY, 1, i), new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, i), 0.35F);
			
			GameRegistry.addSmelting(new ItemStack(BlockInit.TERRACOTTA_BRICK, 1, i), new ItemStack(BlockInit.TERRACOTTA_CRACKED, 1, i), 0.1F);
		}
		
		//removeSmelting(new ItemStack(Blocks.STONE));
		
	}
	
	
	
	public static void removeSmelting(ItemStack stack) {
		
		ItemStack result = null;
		Map<ItemStack, ItemStack> recipes = FurnaceRecipes.instance().getSmeltingList();
		Iterator<ItemStack> iterator = recipes.keySet().iterator();
		
		while (iterator.hasNext()) {
			
			ItemStack recipe = iterator.next();
			result = recipes.get(recipe);
			
			if (ItemStack.areItemsEqual(stack, result)){
				
				iterator.remove();
			}
			
		}
		
	}

}
