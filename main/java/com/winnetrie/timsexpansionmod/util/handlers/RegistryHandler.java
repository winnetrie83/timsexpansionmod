package com.winnetrie.timsexpansionmod.util.handlers;

import com.winnetrie.timsexpansionmod.init.BlockInit;
import com.winnetrie.timsexpansionmod.init.ItemInit;
import com.winnetrie.timsexpansionmod.util.IHasModel;
import com.winnetrie.timsexpansionmod.util.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.OreDictionary.OreRegisterEvent;
import net.minecraftforge.registries.IForgeRegistryModifiable;

@EventBusSubscriber
public class RegistryHandler {
	
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event ) {
		
		event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
		
		ItemBlock item = new ItemSlab(BlockInit.TERRACOTTA_SLABS_HALF_A, (BlockSlab)BlockInit.TERRACOTTA_SLABS_HALF_A, (BlockSlab)BlockInit.TERRACOTTA_SLABS_DOUBLE_A);
		item.setRegistryName(BlockInit.TERRACOTTA_SLABS_HALF_A.getRegistryName());
		event.getRegistry().register(item);
		
		ItemBlock item2 = new ItemSlab(BlockInit.TERRACOTTA_SLABS_HALF_B, (BlockSlab)BlockInit.TERRACOTTA_SLABS_HALF_B, (BlockSlab)BlockInit.TERRACOTTA_SLABS_DOUBLE_B);
		item2.setRegistryName(BlockInit.TERRACOTTA_SLABS_HALF_B.getRegistryName());
		event.getRegistry().register(item2);
		
		ItemBlock item3 = new ItemSlab(BlockInit.TERRACOTTA_BRICK_SLABS_HALF_A, (BlockSlab)BlockInit.TERRACOTTA_BRICK_SLABS_HALF_A, (BlockSlab)BlockInit.TERRACOTTA_BRICK_SLABS_DOUBLE_A);
		item3.setRegistryName(BlockInit.TERRACOTTA_BRICK_SLABS_HALF_A.getRegistryName());
		event.getRegistry().register(item3);
		
		ItemBlock item4 = new ItemSlab(BlockInit.TERRACOTTA_BRICK_SLABS_HALF_B, (BlockSlab)BlockInit.TERRACOTTA_BRICK_SLABS_HALF_B, (BlockSlab)BlockInit.TERRACOTTA_BRICK_SLABS_DOUBLE_B);
		item4.setRegistryName(BlockInit.TERRACOTTA_BRICK_SLABS_HALF_B.getRegistryName());
		event.getRegistry().register(item4);
		
		ItemBlock item5 = new ItemSlab(BlockInit.BRICKS_COLORED_SLABS_HALF_A, (BlockSlab)BlockInit.BRICKS_COLORED_SLABS_HALF_A, (BlockSlab)BlockInit.BRICKS_COLORED_SLABS_DOUBLE_A);
		item5.setRegistryName(BlockInit.BRICKS_COLORED_SLABS_HALF_A.getRegistryName());
		event.getRegistry().register(item5);
		
		ItemBlock item6 = new ItemSlab(BlockInit.BRICKS_COLORED_SLABS_HALF_B, (BlockSlab)BlockInit.BRICKS_COLORED_SLABS_HALF_B, (BlockSlab)BlockInit.BRICKS_COLORED_SLABS_DOUBLE_B);
		item6.setRegistryName(BlockInit.BRICKS_COLORED_SLABS_HALF_B.getRegistryName());
		event.getRegistry().register(item6);
		
		ItemBlock item7 = new ItemSlab(BlockInit.CONCRETE_SLABS_HALF_A, (BlockSlab)BlockInit.CONCRETE_SLABS_HALF_A, (BlockSlab)BlockInit.CONCRETE_SLABS_DOUBLE_A);
		item7.setRegistryName(BlockInit.CONCRETE_SLABS_HALF_A.getRegistryName());
		event.getRegistry().register(item7);
		
		ItemBlock item8 = new ItemSlab(BlockInit.CONCRETE_SLABS_HALF_B, (BlockSlab)BlockInit.CONCRETE_SLABS_HALF_B, (BlockSlab)BlockInit.CONCRETE_SLABS_DOUBLE_B);
		item8.setRegistryName(BlockInit.CONCRETE_SLABS_HALF_B.getRegistryName());
		event.getRegistry().register(item8);
		
		ItemBlock item9 = new ItemSlab(BlockInit.STONEHALFSLABS_A, (BlockSlab)BlockInit.STONEHALFSLABS_A, (BlockSlab)BlockInit.STONEDOUBLESLABS_A);
		item9.setRegistryName(BlockInit.STONEHALFSLABS_A.getRegistryName());
		event.getRegistry().register(item9);
		
		ItemBlock item10 = new ItemSlab(BlockInit.DEMONITE_HALFSLABS, (BlockSlab)BlockInit.DEMONITE_HALFSLABS, (BlockSlab)BlockInit.DEMONITE_DOUBLESLABS);
		item10.setRegistryName(BlockInit.DEMONITE_HALFSLABS.getRegistryName());
		event.getRegistry().register(item10);
		
		//OreDictionary.registerOre("cobblestone", new ItemStack(BlockInit.LIMESTONE_COBBLE,1,0));
	}
	
	
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event ) {
		
		event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
		registerTileEntities();
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event ) {
		
		for(Item item : ItemInit.ITEMS) {
			
			if(item instanceof IHasModel) {
				
				((IHasModel)item).registerModels();
			}
		}
		
		for(Block block : BlockInit.BLOCKS) {
			
			if(block instanceof IHasModel) {
				
				((IHasModel)block).registerModels();
			}
		}
		
	}
	
	public static void registerTileEntities() {
		
		//GameRegistry.registerTileEntity(tileEntityClass, Reference.MODID + "");
		
	}
	@SubscribeEvent
	public static void registerRecipes(RegistryEvent.Register<IRecipe> event) {
		
		//IForgeRegistryModifiable recipe = (IForgeRegistryModifiable) event.getRegistry();
		
		//recipe.remove(new ResourceLocation("minecraft:wooden_button"));
		
		//GameRegistry.addShapedRecipe(new ResourceLocation("minecraft:wooden_button"), 
				 //new ResourceLocation("buttons"), 
				 //ItemStack.EMPTY, 
				 //new Object[] {"B", 'B', new ItemStack(Blocks.PLANKS)});
	}
	

}





