package com.winnetrie.timsexpansionmod.util;

import java.lang.reflect.Constructor;

import com.winnetrie.timsexpansionmod.blocks.BlockBaseSlabColoredA;

import net.minecraft.block.material.MapColor;
import net.minecraft.util.text.TextFormatting;

public class BlockMapColors {
	
	public static final MapColor LIME = MapColorUtil.newMapColor(MapColorUtil.getNextMapColor(), 15391689);
	public static final MapColor MARBLE = MapColorUtil.newMapColor(MapColorUtil.getNextMapColor(), 11113834);


	
	public static enum TerracottaColors {
		
		WHITE(0, MapColor.WHITE_STAINED_HARDENED_CLAY),
	    ORANGE(1, MapColor.ORANGE_STAINED_HARDENED_CLAY),
	    MAGENTA(2, MapColor.MAGENTA_STAINED_HARDENED_CLAY),
	    LIGHT_BLUE(3, MapColor.LIGHT_BLUE_STAINED_HARDENED_CLAY),
	    YELLOW(4, MapColor.YELLOW_STAINED_HARDENED_CLAY),
	    LIME(5, MapColor.LIME_STAINED_HARDENED_CLAY),
	    PINK(6, MapColor.PINK_STAINED_HARDENED_CLAY),
	    GRAY(7, MapColor.GRAY_STAINED_HARDENED_CLAY),
	    SILVER(8, MapColor.SILVER_STAINED_HARDENED_CLAY),
	    CYAN(9, MapColor.CYAN_STAINED_HARDENED_CLAY),
	    PURPLE(10, MapColor.PURPLE_STAINED_HARDENED_CLAY),
	    BLUE(11, MapColor.BLUE_STAINED_HARDENED_CLAY),
	    BROWN(12, MapColor.BROWN_STAINED_HARDENED_CLAY),
	    GREEN(13, MapColor.GREEN_STAINED_HARDENED_CLAY),
	    RED(14, MapColor.RED_STAINED_HARDENED_CLAY),
	    BLACK(15, MapColor.BLACK_STAINED_HARDENED_CLAY);
		
		private static final BlockMapColors.TerracottaColors[] META_LOOKUP = new BlockMapColors.TerracottaColors[values().length];
		
		private final int meta;
        private final MapColor mapColor;
		
		private TerracottaColors(int meta, MapColor mapcolor) {
			
			this.meta = meta;
            this.mapColor = mapcolor;
			
		}
		
		public int getMetadata()
        {
            return this.meta;
        }

        public MapColor getMapColor()
        {
            return this.mapColor;
        }


        public static BlockMapColors.TerracottaColors byMetadata(int meta)
        {
            if (meta < 0 || meta >= META_LOOKUP.length)
            {
                meta = 0;
            }

            return META_LOOKUP[meta];
        }

        

        static
        {
            for (BlockMapColors.TerracottaColors terracottacolors : values())
            {
                META_LOOKUP[terracottacolors.getMetadata()] = terracottacolors;
            }
        }
    
		
	}
	
	public static enum ConcreteColors {
		
		WHITE(0, MapColor.SNOW),
	    ORANGE(1, MapColor.ADOBE),
	    MAGENTA(2, MapColor.MAGENTA),
	    LIGHT_BLUE(3, MapColor.LIGHT_BLUE),
	    YELLOW(4, MapColor.YELLOW),
	    LIME(5, MapColor.LIME),
	    PINK(6, MapColor.PINK),
	    GRAY(7, MapColor.GRAY),
	    SILVER(8, MapColor.SILVER),
	    CYAN(9, MapColor.CYAN),
	    PURPLE(10, MapColor.PURPLE),
	    BLUE(11, MapColor.BLUE),
	    BROWN(12, MapColor.BROWN),
	    GREEN(13, MapColor.GREEN),
	    RED(14, MapColor.RED),
	    BLACK(15, MapColor.BLACK);
		
		private static final BlockMapColors.ConcreteColors[] META_LOOKUP = new BlockMapColors.ConcreteColors[values().length];
		
		private final int meta;
        private final MapColor mapColor;
		
		private ConcreteColors(int meta, MapColor mapcolor) {
			
			this.meta = meta;
            this.mapColor = mapcolor;
			
		}
		
		public int getMetadata()
        {
            return this.meta;
        }

        public MapColor getMapColor()
        {
            return this.mapColor;
        }


        public static BlockMapColors.ConcreteColors byMetadata(int meta)
        {
            if (meta < 0 || meta >= META_LOOKUP.length)
            {
                meta = 0;
            }

            return META_LOOKUP[meta];
        }

        

        static
        {
            for (BlockMapColors.ConcreteColors terracottacolors : values())
            {
                META_LOOKUP[terracottacolors.getMetadata()] = terracottacolors;
            }
        }
    
		
	}

	

}
