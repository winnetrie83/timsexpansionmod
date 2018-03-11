package com.winnetrie.timsexpansionmod.items;

import com.winnetrie.timsexpansionmod.Main;
import com.winnetrie.timsexpansionmod.init.ItemInit;
import com.winnetrie.timsexpansionmod.util.IHasModel;
import com.winnetrie.timsexpansionmod.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel{
	
	public ItemBase (String name) {
		
		setUnlocalizedName(name);
		setRegistryName(Reference.PREFIX + name);
		setCreativeTab(CreativeTabs.MISC);
		
		ItemInit.ITEMS.add(this);
		
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
