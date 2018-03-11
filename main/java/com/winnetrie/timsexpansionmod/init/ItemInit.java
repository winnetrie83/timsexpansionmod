package com.winnetrie.timsexpansionmod.init;

import java.util.ArrayList;
import java.util.List;

import com.winnetrie.timsexpansionmod.items.ItemBase;
import com.winnetrie.timsexpansionmod.items.ItemClayballColored;
import com.winnetrie.timsexpansionmod.items.ItemTerracottaBrickColored;
import com.winnetrie.timsexpansionmod.items.ItemTerracottaBucket;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class ItemInit {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	
	public static final Item BUCKET_CAST = new ItemBase("bucket_cast");
	public static final Item CLAY_BUCKET = new ItemBase("clay_bucket");
	
	public static final Item TERRACOTTA_BUCKET_EMPTY = (new ItemTerracottaBucket("terracotta_bucket_empty",Blocks.AIR)).setMaxStackSize(16);
	public static final Item TERRACOTTA_BUCKET_WATER = (new ItemTerracottaBucket("terracotta_bucket_water",Blocks.WATER)).setContainerItem(TERRACOTTA_BUCKET_EMPTY);
	public static final Item TERRACOTTA_BUCKET_LAVA = (new ItemTerracottaBucket("terracotta_bucket_lava",Blocks.LAVA)).setContainerItem(TERRACOTTA_BUCKET_EMPTY);
	
	public static final Item CLAYBALL_COLORED = new ItemClayballColored("clayball_colored");
	public static final Item TERRACOTTA_BRICK_COLORED = new ItemTerracottaBrickColored("colored_brick");

	
}
