package com.winnetrie.timsexpansionmod.util.handlers;

import com.winnetrie.timsexpansionmod.init.BlockInit;
import com.winnetrie.timsexpansionmod.init.ItemInit;
import com.winnetrie.timsexpansionmod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

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
		
		ItemBlock item3 = new ItemSlab(BlockInit.SLABBED_TERRACOTTA_SLABS_HALF_A, (BlockSlab)BlockInit.SLABBED_TERRACOTTA_SLABS_HALF_A, (BlockSlab)BlockInit.SLABBED_TERRACOTTA_SLABS_DOUBLE_A);
		item3.setRegistryName(BlockInit.SLABBED_TERRACOTTA_SLABS_HALF_A.getRegistryName());
		event.getRegistry().register(item3);
		
		ItemBlock item4 = new ItemSlab(BlockInit.SLABBED_TERRACOTTA_SLABS_HALF_B, (BlockSlab)BlockInit.SLABBED_TERRACOTTA_SLABS_HALF_B, (BlockSlab)BlockInit.SLABBED_TERRACOTTA_SLABS_DOUBLE_B);
		item4.setRegistryName(BlockInit.SLABBED_TERRACOTTA_SLABS_HALF_B.getRegistryName());
		event.getRegistry().register(item4);
		
		ItemBlock item5 = new ItemSlab(BlockInit.BRICKED_TERRACOTTA_SLABS_HALF_A, (BlockSlab)BlockInit.BRICKED_TERRACOTTA_SLABS_HALF_A, (BlockSlab)BlockInit.BRICKED_TERRACOTTA_SLABS_DOUBLE_A);
		item5.setRegistryName(BlockInit.BRICKED_TERRACOTTA_SLABS_HALF_A.getRegistryName());
		event.getRegistry().register(item5);
		
		ItemBlock item6 = new ItemSlab(BlockInit.BRICKED_TERRACOTTA_SLABS_HALF_B, (BlockSlab)BlockInit.BRICKED_TERRACOTTA_SLABS_HALF_B, (BlockSlab)BlockInit.BRICKED_TERRACOTTA_SLABS_DOUBLE_B);
		item6.setRegistryName(BlockInit.BRICKED_TERRACOTTA_SLABS_HALF_B.getRegistryName());
		event.getRegistry().register(item6);
		
		ItemBlock item7 = new ItemSlab(BlockInit.CONCRETE_SLABS_HALF_A, (BlockSlab)BlockInit.CONCRETE_SLABS_HALF_A, (BlockSlab)BlockInit.CONCRETE_SLABS_DOUBLE_A);
		item7.setRegistryName(BlockInit.CONCRETE_SLABS_HALF_A.getRegistryName());
		event.getRegistry().register(item7);
		
		ItemBlock item8 = new ItemSlab(BlockInit.CONCRETE_SLABS_HALF_B, (BlockSlab)BlockInit.CONCRETE_SLABS_HALF_B, (BlockSlab)BlockInit.CONCRETE_SLABS_DOUBLE_B);
		item8.setRegistryName(BlockInit.CONCRETE_SLABS_HALF_B.getRegistryName());
		event.getRegistry().register(item8);
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
	

}





