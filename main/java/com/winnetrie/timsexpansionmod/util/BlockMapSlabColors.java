package com.winnetrie.timsexpansionmod.util;

import com.winnetrie.timsexpansionmod.blocks.BlockBaseSlabColoredA;

import net.minecraft.block.material.MapColor;
import net.minecraft.util.text.TextFormatting;

public class BlockMapSlabColors {
	
	public static enum TerracottaColorsA {
		
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
		
		private static final BlockMapSlabColors.TerracottaColorsA[] META_LOOKUP = new BlockMapSlabColors.TerracottaColorsA[values().length];
		
		private final int meta;
        private final MapColor mapColor;
		
		private TerracottaColorsA(int meta, MapColor mapcolor) {
			
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


        public static BlockMapSlabColors.TerracottaColorsA byMetadata(int meta)
        {
            if (meta < 0 || meta >= META_LOOKUP.length)
            {
                meta = 0;
            }

            return META_LOOKUP[meta];
        }

        

        static
        {
            for (BlockMapSlabColors.TerracottaColorsA terracottacolors : values())
            {
                META_LOOKUP[terracottacolors.getMetadata()] = terracottacolors;
            }
        }
    
		
	}
	
public static enum TerracottaColorsB {
		
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
		
		private static final BlockMapSlabColors.TerracottaColorsB[] META_LOOKUP = new BlockMapSlabColors.TerracottaColorsB[values().length];
		
		private final int meta;
        private final MapColor mapColor;
		
		private TerracottaColorsB(int meta, MapColor mapcolor) {
			
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


        public static BlockMapSlabColors.TerracottaColorsB byMetadata(int meta)
        {
            if (meta < 0 || meta >= META_LOOKUP.length)
            {
                meta = 0;
            }

            return META_LOOKUP[meta];
        }

        

        static
        {
            for (BlockMapSlabColors.TerracottaColorsB terracottacolors : values())
            {
                META_LOOKUP[terracottacolors.getMetadata()] = terracottacolors;
            }
        }
    
		
	}
	
	public static enum ConcreteColorsA {
		
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
		
		private static final BlockMapSlabColors.ConcreteColorsA[] META_LOOKUP = new BlockMapSlabColors.ConcreteColorsA[values().length];
		
		private final int meta;
        private final MapColor mapColor;
		
		private ConcreteColorsA(int meta, MapColor mapcolor) {
			
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


        public static BlockMapSlabColors.ConcreteColorsA byMetadata(int meta)
        {
            if (meta < 0 || meta >= META_LOOKUP.length)
            {
                meta = 0;
            }

            return META_LOOKUP[meta];
        }

        

        static
        {
            for (BlockMapSlabColors.ConcreteColorsA terracottacolors : values())
            {
                META_LOOKUP[terracottacolors.getMetadata()] = terracottacolors;
            }
        }
    
		
	}

}
