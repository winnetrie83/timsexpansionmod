package com.winnetrie.timsexpansionmod.util.handlers;

import com.winnetrie.timsexpansionmod.init.BlockInit;
import com.winnetrie.timsexpansionmod.init.ItemInit;
import com.winnetrie.timsexpansionmod.util.Reference;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler {
	
	public static void registerCrafting () {
		
		//adding recipes for 16 colored bricked terracotta stairs
		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "white_bricked_terracotta_stairs"), 
									 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
									 new ItemStack(BlockInit.BRICKED_TERRACOTTA_STAIRS_WHITE,4), 
									 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.BRICKED_TERRACOTTA,1,0)});
		
		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "orange_bricked_terracotta_stairs"), 
		                             new ResourceLocation(Reference.MODID + ":" + "stairs"), 
		                             new ItemStack(BlockInit.BRICKED_TERRACOTTA_STAIRS_ORANGE,4), 
		                             new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.BRICKED_TERRACOTTA,1,1)});
		
		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "magenta_bricked_terracotta_stairs"), 
                                     new ResourceLocation(Reference.MODID + ":" + "stairs"), 
                                     new ItemStack(BlockInit.BRICKED_TERRACOTTA_STAIRS_MAGENTA,4), 
                                     new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.BRICKED_TERRACOTTA,1,2)});
		
		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "light_blue_bricked_terracotta_stairs"), 
				 					 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
				 					 new ItemStack(BlockInit.BRICKED_TERRACOTTA_STAIRS_LIGHT_BLUE,4), 
				 					 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.BRICKED_TERRACOTTA,1,3)});

		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "yellow_bricked_terracotta_stairs"), 
                					 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
                					 new ItemStack(BlockInit.BRICKED_TERRACOTTA_STAIRS_YELLOW,4), 
                					 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.BRICKED_TERRACOTTA,1,4)});

		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "lime_bricked_terracotta_stairs"), 
                					 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
                					 new ItemStack(BlockInit.BRICKED_TERRACOTTA_STAIRS_LIME,4), 
                					 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.BRICKED_TERRACOTTA,1,5)});
		
		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "pink_bricked_terracotta_stairs"), 
                					 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
                					 new ItemStack(BlockInit.BRICKED_TERRACOTTA_STAIRS_PINK,4), 
                					 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.BRICKED_TERRACOTTA,1,6)});

		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "gray_bricked_terracotta_stairs"), 
				 					 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
				 					 new ItemStack(BlockInit.BRICKED_TERRACOTTA_STAIRS_GRAY,4), 
				 					 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.BRICKED_TERRACOTTA,1,7)});

		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "silver_bricked_terracotta_stairs"), 
				 					 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
				 					 new ItemStack(BlockInit.BRICKED_TERRACOTTA_STAIRS_SILVER,4), 
				 					 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.BRICKED_TERRACOTTA,1,8)});

		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "cyan_bricked_terracotta_stairs"), 
				 					 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
				 					 new ItemStack(BlockInit.BRICKED_TERRACOTTA_STAIRS_CYAN,4), 
				 					 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.BRICKED_TERRACOTTA,1,9)});
		
		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "purple_bricked_terracotta_stairs"), 
                					 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
                					 new ItemStack(BlockInit.BRICKED_TERRACOTTA_STAIRS_PURPLE,4), 
                					 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.BRICKED_TERRACOTTA,1,10)});

		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "blue_bricked_terracotta_stairs"), 
				 					 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
				 					 new ItemStack(BlockInit.BRICKED_TERRACOTTA_STAIRS_BLUE,4), 
				 					 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.BRICKED_TERRACOTTA,1,11)});

		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "brown_bricked_terracotta_stairs"), 
				 					 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
				 					 new ItemStack(BlockInit.BRICKED_TERRACOTTA_STAIRS_BROWN,4), 
				 					 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.BRICKED_TERRACOTTA,1,12)});

		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "green_bricked_terracotta_stairs"), 
				 					 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
				 					 new ItemStack(BlockInit.BRICKED_TERRACOTTA_STAIRS_GREEN,4), 
				 					 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.BRICKED_TERRACOTTA,1,13)});

		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "red_bricked_terracotta_stairs"), 
									 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
									 new ItemStack(BlockInit.BRICKED_TERRACOTTA_STAIRS_RED,4), 
									 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.BRICKED_TERRACOTTA,1,14)});

		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "black_bricked_terracotta_stairs"), 
									 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
									 new ItemStack(BlockInit.BRICKED_TERRACOTTA_STAIRS_BLACK,4), 
									 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.BRICKED_TERRACOTTA,1,15)});
		
		//adding recipes for 16 colored slabbed terracotta stairs
		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "white_slabbed_terracotta_stairs"), 
									 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
									 new ItemStack(BlockInit.SLABBED_TERRACOTTA_STAIRS_WHITE,4), 
									 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.SLABBED_TERRACOTTA,1,0)});
				
		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "orange_slabbed_terracotta_stairs"), 
				                     new ResourceLocation(Reference.MODID + ":" + "stairs"), 
				                     new ItemStack(BlockInit.SLABBED_TERRACOTTA_STAIRS_ORANGE,4), 
				                     new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.SLABBED_TERRACOTTA,1,1)});
				
		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "magenta_slabbed_terracotta_stairs"), 
		                             new ResourceLocation(Reference.MODID + ":" + "stairs"), 
		                             new ItemStack(BlockInit.SLABBED_TERRACOTTA_STAIRS_MAGENTA,4), 
		                             new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.SLABBED_TERRACOTTA,1,2)});
				
		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "light_blue_slabbed_terracotta_stairs"), 
						 			 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
						 			 new ItemStack(BlockInit.SLABBED_TERRACOTTA_STAIRS_LIGHT_BLUE,4), 
						 			 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.SLABBED_TERRACOTTA,1,3)});

		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "yellow_slabbed_terracotta_stairs"), 
		                			 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
		                			 new ItemStack(BlockInit.SLABBED_TERRACOTTA_STAIRS_YELLOW,4), 
		                			 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.SLABBED_TERRACOTTA,1,4)});

		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "lime_slabbed_terracotta_stairs"), 
		                			 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
		                			 new ItemStack(BlockInit.SLABBED_TERRACOTTA_STAIRS_LIME,4), 
		                			 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.SLABBED_TERRACOTTA,1,5)});
				
		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "pink_slabbed_terracotta_stairs"), 
		                			 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
		                			 new ItemStack(BlockInit.SLABBED_TERRACOTTA_STAIRS_PINK,4), 
		                			 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.SLABBED_TERRACOTTA,1,6)});

		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "gray_slabbed_terracotta_stairs"), 
						 			 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
						 			 new ItemStack(BlockInit.SLABBED_TERRACOTTA_STAIRS_GRAY,4), 
						 			 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.SLABBED_TERRACOTTA,1,7)});

		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "silver_slabbed_terracotta_stairs"), 
						 			 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
						 			 new ItemStack(BlockInit.SLABBED_TERRACOTTA_STAIRS_SILVER,4), 
						 			 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.SLABBED_TERRACOTTA,1,8)});

		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "cyan_slabbed_terracotta_stairs"), 
						 			 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
						 			 new ItemStack(BlockInit.SLABBED_TERRACOTTA_STAIRS_CYAN,4), 
						 			 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.SLABBED_TERRACOTTA,1,9)});
				
		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "purple_slabbed_terracotta_stairs"), 
		                			 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
		                			 new ItemStack(BlockInit.SLABBED_TERRACOTTA_STAIRS_PURPLE,4), 
		                			 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.SLABBED_TERRACOTTA,1,10)});

		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "blue_slabbed_terracotta_stairs"), 
						 			 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
						 			 new ItemStack(BlockInit.SLABBED_TERRACOTTA_STAIRS_BLUE,4), 
						 			 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.SLABBED_TERRACOTTA,1,11)});

		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "brown_slabbed_terracotta_stairs"), 
						 			 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
						 			 new ItemStack(BlockInit.SLABBED_TERRACOTTA_STAIRS_BROWN,4), 
						 			 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.SLABBED_TERRACOTTA,1,12)});

		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "green_slabbed_terracotta_stairs"), 
						 			 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
						 			 new ItemStack(BlockInit.SLABBED_TERRACOTTA_STAIRS_GREEN,4), 
						 			 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.SLABBED_TERRACOTTA,1,13)});

		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "red_slabbed_terracotta_stairs"), 
									 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
									 new ItemStack(BlockInit.SLABBED_TERRACOTTA_STAIRS_RED,4), 
									 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.SLABBED_TERRACOTTA,1,14)});

		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "black_slabbed_terracotta_stairs"), 
									 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
									 new ItemStack(BlockInit.SLABBED_TERRACOTTA_STAIRS_BLACK,4), 
									 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(BlockInit.SLABBED_TERRACOTTA,1,15)});
		
		//adding recipes for 16 colored terracotta stairs
		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "white_terracotta_stairs"), 
									 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
									 new ItemStack(BlockInit.TERRACOTTA_STAIRS_WHITE,4), 
									 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,0)});
						
		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "orange_terracotta_stairs"), 
						             new ResourceLocation(Reference.MODID + ":" + "stairs"), 
						             new ItemStack(BlockInit.TERRACOTTA_STAIRS_ORANGE,4), 
						             new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,1)});
						
		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "magenta_terracotta_stairs"), 
				                     new ResourceLocation(Reference.MODID + ":" + "stairs"), 
				                     new ItemStack(BlockInit.TERRACOTTA_STAIRS_MAGENTA,4), 
				                     new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,2)});
						
		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "light_blue_terracotta_stairs"), 
								 	 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
								 	 new ItemStack(BlockInit.TERRACOTTA_STAIRS_LIGHT_BLUE,4), 
								 	 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,3)});

		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "yellow_terracotta_stairs"), 
				                	 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
				                	 new ItemStack(BlockInit.TERRACOTTA_STAIRS_YELLOW,4), 
				                	 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,4)});

		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "lime_terracotta_stairs"), 
				                	 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
				                	 new ItemStack(BlockInit.TERRACOTTA_STAIRS_LIME,4), 
				                	 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,5)});
						
		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "pink_terracotta_stairs"), 
				                	 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
				                	 new ItemStack(BlockInit.TERRACOTTA_STAIRS_PINK,4), 
				                	 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,6)});

		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "gray_terracotta_stairs"), 
								 	 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
								 	 new ItemStack(BlockInit.TERRACOTTA_STAIRS_GRAY,4), 
								 	 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,7)});

		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "silver_terracotta_stairs"), 
								 	 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
								 	 new ItemStack(BlockInit.TERRACOTTA_STAIRS_SILVER,4), 
								 	 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,8)});

		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "cyan_terracotta_stairs"), 
								 	 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
								 	 new ItemStack(BlockInit.TERRACOTTA_STAIRS_CYAN,4), 
								 	 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,9)});
						
		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "purple_terracotta_stairs"), 
				                	 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
				                	 new ItemStack(BlockInit.TERRACOTTA_STAIRS_PURPLE,4), 
				                	 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,10)});

		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "blue_terracotta_stairs"), 
								 	 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
								 	 new ItemStack(BlockInit.TERRACOTTA_STAIRS_BLUE,4), 
								 	 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,11)});

		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "brown_terracotta_stairs"), 
								 	 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
								 	 new ItemStack(BlockInit.TERRACOTTA_STAIRS_BROWN,4), 
								 	 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,12)});

		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "green_terracotta_stairs"), 
								 	 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
								 	 new ItemStack(BlockInit.TERRACOTTA_STAIRS_GREEN,4), 
								 	 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,13)});

		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "red_terracotta_stairs"), 
									 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
									 new ItemStack(BlockInit.TERRACOTTA_STAIRS_RED,4), 
									 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,14)});

		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "black_terracotta_stairs"), 
									 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
									 new ItemStack(BlockInit.TERRACOTTA_STAIRS_BLACK,4), 
									 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(Blocks.STAINED_HARDENED_CLAY,1,15)});
		
		//adding recipes for 16 colored concrete stairs
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "white_concrete_stairs"), 
											 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
											 new ItemStack(BlockInit.CONCRETE_STAIRS_WHITE,4), 
											 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(Blocks.CONCRETE,1,0)});
								
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "orange_concrete_stairs"), 
								             new ResourceLocation(Reference.MODID + ":" + "stairs"), 
								             new ItemStack(BlockInit.CONCRETE_STAIRS_ORANGE,4), 
								             new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(Blocks.CONCRETE,1,1)});
								
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "magenta_concrete_stairs"), 
						                     new ResourceLocation(Reference.MODID + ":" + "stairs"), 
						                     new ItemStack(BlockInit.CONCRETE_STAIRS_MAGENTA,4), 
						                     new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(Blocks.CONCRETE,1,2)});
								
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "light_blue_concretea_stairs"), 
										 	 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
										 	 new ItemStack(BlockInit.CONCRETE_STAIRS_LIGHT_BLUE,4), 
										 	 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(Blocks.CONCRETE,1,3)});

				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "yellow_concrete_stairs"), 
						                	 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
						                	 new ItemStack(BlockInit.CONCRETE_STAIRS_YELLOW,4), 
						                	 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(Blocks.CONCRETE,1,4)});

				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "lime_concrete_stairs"), 
						                	 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
						                	 new ItemStack(BlockInit.CONCRETE_STAIRS_LIME,4), 
						                	 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(Blocks.CONCRETE,1,5)});
								
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "pink_concrete_stairs"), 
						                	 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
						                	 new ItemStack(BlockInit.CONCRETE_STAIRS_PINK,4), 
						                	 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(Blocks.CONCRETE,1,6)});

				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "gray_concrete_stairs"), 
										 	 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
										 	 new ItemStack(BlockInit.CONCRETE_STAIRS_GRAY,4), 
										 	 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(Blocks.CONCRETE,1,7)});

				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "silver_concrete_stairs"), 
										 	 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
										 	 new ItemStack(BlockInit.CONCRETE_STAIRS_SILVER,4), 
										 	 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(Blocks.CONCRETE,1,8)});

				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "cyan_concrete_stairs"), 
										 	 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
										 	 new ItemStack(BlockInit.CONCRETE_STAIRS_CYAN,4), 
										 	 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(Blocks.CONCRETE,1,9)});
								
				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "purple_concrete_stairs"), 
						                	 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
						                	 new ItemStack(BlockInit.CONCRETE_STAIRS_PURPLE,4), 
						                	 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(Blocks.CONCRETE,1,10)});

				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "blue_concrete_stairs"), 
										 	 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
										 	 new ItemStack(BlockInit.CONCRETE_STAIRS_BLUE,4), 
										 	 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(Blocks.CONCRETE,1,11)});

				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "brown_concrete_stairs"), 
										 	 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
										 	 new ItemStack(BlockInit.CONCRETE_STAIRS_BROWN,4), 
										 	 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(Blocks.CONCRETE,1,12)});

				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "green_concrete_stairs"), 
										 	 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
										 	 new ItemStack(BlockInit.CONCRETE_STAIRS_GREEN,4), 
										 	 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(Blocks.CONCRETE,1,13)});

				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "red_concrete_stairs"), 
											 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
											 new ItemStack(BlockInit.CONCRETE_STAIRS_RED,4), 
											 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(Blocks.CONCRETE,1,14)});

				GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "black_concrete_stairs"), 
											 new ResourceLocation(Reference.MODID + ":" + "stairs"), 
											 new ItemStack(BlockInit.CONCRETE_STAIRS_BLACK,4), 
											 new Object[] {"B  ","BB ", "BBB", 'B', new ItemStack(Blocks.CONCRETE,1,15)});
		
		
		//adding recipe for clay bucket
		GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + "clay_bucket"), 
									 new ResourceLocation(Reference.MODID + ":" + "buckets"), 
									 new ItemStack(ItemInit.CLAY_BUCKET), 
									 new Object[] {"B B","B B", "BBB", 'B', new ItemStack(Items.CLAY_BALL)});
		
		for(int i=0; i<16; i++) {
			//adding recipe for 16 colored bricked terracotta blocks
			GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + EnumDyeColor.values()[i].name().toLowerCase() + "_bricked_terracotta"), 
										 new ResourceLocation(Reference.MODID + ":" + "terracottablocks"), 
										 new ItemStack(BlockInit.BRICKED_TERRACOTTA, 1, i), 
										 new Object[] {"BB","BB",'B', new ItemStack(ItemInit.TERRACOTTA_BRICK_COLORED, 1, i)});
			
			//adding recipe for 16 colored clayblocks
			GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + EnumDyeColor.values()[i].name().toLowerCase() + "_colored_clayblock"), 
					 					 new ResourceLocation(Reference.MODID + ":" + "clayblocks"), 
					 					 new ItemStack(BlockInit.COLORED_CLAY, 1, i), 
					 					 new Object[] {"BB","BB",'B', new ItemStack(ItemInit.CLAYBALL_COLORED, 1, i)});
			
			//adding recipe for 16 colored clayballs
			GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + EnumDyeColor.values()[i].name().toLowerCase() + "_colored_clayball"), 
					 					 new ResourceLocation(Reference.MODID + ":" + "clayballs"), 
					 					 new ItemStack(ItemInit.CLAYBALL_COLORED, 4, i), 
					 					 new Object[] {"B",'B', new ItemStack(BlockInit.COLORED_CLAY, 1, i)});
		}
		for(int i=0; i<8; i++) {
			
			//adding recipe for 16 colored slabbed terracotta blocks
			GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + EnumDyeColor.values()[i].name().toLowerCase() + "_slabbed_terracotta"), 
										 new ResourceLocation(Reference.MODID + ":" + "terracottablocks"), 
										 new ItemStack(BlockInit.SLABBED_TERRACOTTA, 2, i), 
										 new Object[] {"BB","BB",'B', new ItemStack(BlockInit.TERRACOTTA_SLABS_HALF_A, 1, i)});
			GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + EnumDyeColor.values()[i+8].name().toLowerCase() + "_slabbed_terracotta"), 
										 new ResourceLocation(Reference.MODID + ":" + "terracottablocks"), 
										 new ItemStack(BlockInit.SLABBED_TERRACOTTA, 2, i+8), 
										 new Object[] {"BB","BB",'B', new ItemStack(BlockInit.TERRACOTTA_SLABS_HALF_B, 1, i)});
			
			//adding recipe for 16 colored terracotta slabs
			GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + EnumDyeColor.values()[i].name().toLowerCase() + "_terracotta_slab"), 
										 new ResourceLocation(Reference.MODID + ":" + "slabs"), 
										 new ItemStack(BlockInit.TERRACOTTA_SLABS_HALF_A, 6, i), 
										 new Object[] {"BBB",'B', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, i)});
			GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + EnumDyeColor.values()[i+8].name().toLowerCase() + "_terracotta_slab"), 
										 new ResourceLocation(Reference.MODID + ":" + "slabs"), 
										 new ItemStack(BlockInit.TERRACOTTA_SLABS_HALF_B, 6, i), 
										 new Object[] {"BBB",'B', new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, i+8)});
			
			//adding recipe for 16 colored bricked slabs
			GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + EnumDyeColor.values()[i].name().toLowerCase() + "_bricked_slab"), 
										 new ResourceLocation(Reference.MODID + ":" + "slabs"), 
										 new ItemStack(BlockInit.BRICKED_TERRACOTTA_SLABS_HALF_A, 6, i), 
										 new Object[] {"BBB",'B', new ItemStack(BlockInit.BRICKED_TERRACOTTA, 1, i)});
			GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + EnumDyeColor.values()[i+8].name().toLowerCase() + "_bricked_slab"), 
										 new ResourceLocation(Reference.MODID + ":" + "slabs"), 
										 new ItemStack(BlockInit.BRICKED_TERRACOTTA_SLABS_HALF_B, 6, i), 
										 new Object[] {"BBB",'B', new ItemStack(BlockInit.BRICKED_TERRACOTTA, 1, i+8)});
			
			//adding recipe for 16 colored slabbed terracotta slabs
			GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + EnumDyeColor.values()[i].name().toLowerCase() + "_slabbed_terracotta_slab"), 
										 new ResourceLocation(Reference.MODID + ":" + "slabs"), 
										 new ItemStack(BlockInit.SLABBED_TERRACOTTA_SLABS_HALF_A, 6, i), 
										 new Object[] {"BBB",'B', new ItemStack(BlockInit.SLABBED_TERRACOTTA, 1, i)});
			GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + EnumDyeColor.values()[i+8].name().toLowerCase() + "_slabbed_terracotta_slab"), 
										 new ResourceLocation(Reference.MODID + ":" + "slabs"), 
										 new ItemStack(BlockInit.SLABBED_TERRACOTTA_SLABS_HALF_B, 6, i), 
										 new Object[] {"BBB",'B', new ItemStack(BlockInit.SLABBED_TERRACOTTA, 1, i+8)});
			
			//adding recipe for 16 colored terracotta slabs
			GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + EnumDyeColor.values()[i].name().toLowerCase() + "_concrete_slab"), 
										 new ResourceLocation(Reference.MODID + ":" + "slabs"), 
										 new ItemStack(BlockInit.CONCRETE_SLABS_HALF_A, 6, i), 
										 new Object[] {"BBB",'B', new ItemStack(Blocks.CONCRETE, 1, i)});
			GameRegistry.addShapedRecipe(new ResourceLocation(Reference.MODID + ":" + EnumDyeColor.values()[i+8].name().toLowerCase() + "_concrete_slab"), 
										 new ResourceLocation(Reference.MODID + ":" + "slabs"), 
										 new ItemStack(BlockInit.CONCRETE_SLABS_HALF_B, 6, i), 
										 new Object[] {"BBB",'B', new ItemStack(Blocks.CONCRETE, 1, i+8)});
			
		}
				
	}
	
	public static void registerSmelting() {
		
		//param1 = input,  param2 = output; param3 = xp(float)
		GameRegistry.addSmelting(new ItemStack(ItemInit.CLAY_BUCKET), new ItemStack(ItemInit.TERRACOTTA_BUCKET_EMPTY), 1.0F);
		
		for(int i=0; i<16; i++) {
			GameRegistry.addSmelting(new ItemStack(ItemInit.CLAYBALL_COLORED, 1, i), new ItemStack(ItemInit.TERRACOTTA_BRICK_COLORED, 1, i), 1.0F);
			GameRegistry.addSmelting(new ItemStack(BlockInit.COLORED_CLAY, 1, i), new ItemStack(Blocks.STAINED_HARDENED_CLAY, 1, i), 4.0F);
		}
		
	}

}
