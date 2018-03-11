package com.winnetrie.timsexpansionmod.util;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigHandler {
	
	public static boolean enable_limestone_gen ;
	public static boolean enable_marblestone_gen;
	
	public static boolean enable_demonite_gen;
	public static boolean enable_feliron_ore_gen;
	
	public static int limestone_gen_chance;
	public static int marblestone_gen_chance;
	public static int demonite_gen_chance;
	public static int feliron_ore_gen_chance;
	
	
	public static Configuration config;
	
	public static void init(File file) {
		
		config = new Configuration(file);
		syncConfig();
		
	}
	
	public static void syncConfig() {
		
		String category = "ORE & STONE GEN";
		config.addCustomCategoryComment(category, "Ore & stone generators");
		enable_limestone_gen = config.getBoolean("Enable Limestone gen?", category, true, "true for generating limestone in the world");
		enable_marblestone_gen = config.getBoolean("Enable Marblestone gen", category, true, "true for generating marblestone in the world");
		
		enable_demonite_gen = config.getBoolean("Enable Demonite gen?", category, true, "true for generating demonite in the nether");
		enable_feliron_ore_gen = config.getBoolean("Enable Feliron Ore gen?", category, true, "true for generating felrion ore in the nether");
		
		
		category = "ORE GEN SETTINGS";
		config.addCustomCategoryComment(category, "Ore & stone generating chance settings");
		limestone_gen_chance = config.getInt("Limestone generation chance", category, 25, 1, 50, "increase for more limestone generation");
		marblestone_gen_chance = config.getInt("Marblestone generation chance", category, 25, 1, 50, "increase for more marblestone generation");
		
		demonite_gen_chance = config.getInt("Demonite generation chance", category, 25, 1, 50, "increase for more demonite generation");
		feliron_ore_gen_chance = config.getInt("Feliron Ore generation chance", category, 25, 1, 50, "increase for more feliron ore generation");
		
		
	}

}
