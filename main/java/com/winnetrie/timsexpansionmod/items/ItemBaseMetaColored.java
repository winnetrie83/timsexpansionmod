package com.winnetrie.timsexpansionmod.items;

import com.winnetrie.timsexpansionmod.Main;
import com.winnetrie.timsexpansionmod.init.ItemInit;
import com.winnetrie.timsexpansionmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBaseMetaColored extends Item implements IHasModel{
	
	public ItemBaseMetaColored (String name) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MISC);
		
		ItemInit.ITEMS.add(this);
		
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "color=white");
		Main.proxy.registerItemRenderer(this, 1, "color=orange");
		Main.proxy.registerItemRenderer(this, 2, "color=magenta");
		Main.proxy.registerItemRenderer(this, 3, "color=light_blue");
		Main.proxy.registerItemRenderer(this, 4, "color=yellow");
		Main.proxy.registerItemRenderer(this, 5, "color=lime");
		Main.proxy.registerItemRenderer(this, 6, "color=pink");
		Main.proxy.registerItemRenderer(this, 7, "color=gray");
		Main.proxy.registerItemRenderer(this, 8, "color=silver");
		Main.proxy.registerItemRenderer(this, 9, "color=cyan");
		Main.proxy.registerItemRenderer(this, 10, "color=purple");
		Main.proxy.registerItemRenderer(this, 11, "color=blue");
		Main.proxy.registerItemRenderer(this, 12, "color=brown");
		Main.proxy.registerItemRenderer(this, 13, "color=green");
		Main.proxy.registerItemRenderer(this, 14, "color=red");
		Main.proxy.registerItemRenderer(this, 15, "color=black");
		
	}

}
