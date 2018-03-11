package com.winnetrie.timsexpansionmod.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import net.minecraft.block.material.MapColor;

public final class MapColorUtil {
	
	private MapColorUtil(){}
	
	public static int getNextMapColor(){
		//Will only be -1 if array is full
		int out = -1;
		
		for(int i = 0; i < MapColor.COLORS.length; i++){
			if(MapColor.COLORS[i] != null){
				continue;
			}
			out = i;
			break;
		}
		
		return out;
	}
	
	public static MapColor newMapColor(int index, int color){
		Constructor<MapColor> constr;
		try{
			constr = MapColor.class.getDeclaredConstructor(int.class, int.class);
		}catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
			return null;
		}
		
		constr.setAccessible(true);
		
		try {
			return constr.newInstance(index, color);
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
			return null;
		}
	}
}