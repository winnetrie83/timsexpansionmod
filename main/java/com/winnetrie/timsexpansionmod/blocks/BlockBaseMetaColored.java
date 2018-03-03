package com.winnetrie.timsexpansionmod.blocks;

import com.winnetrie.timsexpansionmod.Main;
import com.winnetrie.timsexpansionmod.init.BlockInit;
import com.winnetrie.timsexpansionmod.init.ItemInit;
import com.winnetrie.timsexpansionmod.util.IHasModel;
import com.winnetrie.timsexpansionmod.util.ItemBlockMeta;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBaseMetaColored extends Block implements IHasModel{

	public BlockBaseMetaColored(String name, Material material) {
		
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlockMeta(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "color=white");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 1, "color=orange");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 2, "color=magenta");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 3, "color=light_blue");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 4, "color=yellow");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 5, "color=lime");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 6, "color=pink");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 7, "color=gray");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 8, "color=silver");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 9, "color=cyan");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 10, "color=purple");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 11, "color=blue");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 12, "color=brown");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 13, "color=green");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 14, "color=red");
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 15, "color=black");
		
		
	}
	
	

}
