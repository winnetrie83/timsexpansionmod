package com.winnetrie.timsexpansionmod.world;

import java.util.Random;
import com.google.common.base.Predicate;
import com.winnetrie.timsexpansionmod.blocks.DemoniteBlock;
import com.winnetrie.timsexpansionmod.init.BlockInit;
import com.winnetrie.timsexpansionmod.util.ConfigHandler;

import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGenerator implements IWorldGenerator{
	public ModWorldGenerator() {}

	
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider){
		
		//System.out.println("WE ARE CURRENTLY IN THIS DIMENSION: " + world.provider.getDimension());
		
  
		switch (world.provider.getDimension()){ 
		
		case -1: 
			generateNether(world, random, chunkX, chunkZ);
			break;
		case 0: 
			generateOverworld(world, random, chunkX, chunkZ);
			//System.out.println("OVERWORLD GENERATOR");
			break;
		case 3: 
			generateEnd(world, random, chunkX, chunkZ);
		}
	}

	public void generateNether(World world, Random rand, int x, int z){
	
		if (ConfigHandler.enable_demonite_gen == true){
			
			generateOre(BlockInit.DEMONITE.getDefaultState(), world, rand, 0, x, z, 33, 66, ConfigHandler.demonite_gen_chance, 1, 256, BlockMatcher.forBlock(Blocks.NETHERRACK));
			if ( ConfigHandler.enable_feliron_ore_gen == true){
				
				generateOre(BlockInit.FELIRON_ORE.getDefaultState(), world, rand, 0, x, z, 4, 8, ConfigHandler.feliron_ore_gen_chance, 1, 256, BlockMatcher.forBlock((BlockInit.DEMONITE.getDefaultState().withProperty(DemoniteBlock.VARIANT, DemoniteBlock.EnumType.RAW)).getBlock()));
			}
		}
  
	}


	public void generateOverworld(World world, Random rand, int x, int z){
		
		int XX = x * 16;
		int ZZ = z * 16;
		BlockPos pos = new BlockPos(XX, 70, ZZ);
		Biome biome = world.getBiome(pos);
		
		if (ConfigHandler.enable_limestone_gen == true) {
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.RIVER)) {
				generateOre(BlockInit.LIMESTONE.getDefaultState(), world, rand, 0, x, z, 25, 33, ConfigHandler.limestone_gen_chance * 2, 45, 65, BlockMatcher.forBlock(Blocks.STONE));
			}
			if (BiomeDictionary.hasType(biome, BiomeDictionary.Type.OCEAN)) {
				generateOre(BlockInit.LIMESTONE.getDefaultState(), world, rand, 0, x, z, 15, 33, ConfigHandler.limestone_gen_chance, 10, 50, BlockMatcher.forBlock(Blocks.STONE));
			}
		}
		if ((ConfigHandler.enable_marblestone_gen == true) && (BiomeDictionary.hasType(biome, BiomeDictionary.Type.HILLS)) || (BiomeDictionary.hasType(biome, BiomeDictionary.Type.MOUNTAIN))) {
			generateOre(BlockInit.MARBLESTONE.getDefaultState(), world, rand, 0, x, z, 25, 33, ConfigHandler.marblestone_gen_chance, 65, 256, BlockMatcher.forBlock(Blocks.STONE));
		}
	}


	public void generateEnd(World world, Random rand, int x, int z) {}


	public void generateOre(IBlockState state, World world, Random random, int meta, int chunkX, int chunkZ, int minVienSize, int maxVienSize, int chance, int minY, int maxY, Predicate<IBlockState> generatedIn){
  
		int vienSize = minVienSize + random.nextInt(maxVienSize - minVienSize);
		int heightRange = maxY - minY + 1;
		WorldGenMinable gen = new WorldGenMinable(state, vienSize, generatedIn);
		for (int i = 0; i < chance; i++) {
			int xRand = chunkX * 16 + random.nextInt(16);
			int yRand = random.nextInt(heightRange) + minY;
			int zRand = chunkZ * 16 + random.nextInt(16);
    
			BlockPos pos = new BlockPos(xRand, yRand, zRand);
			gen.generate(world, random, pos);
		}
	}

/*
	public void generateSingleOre(IBlockState iBlockState, World world, Random random, int meta, int chunkX, int chunkZ, int chance, int minY, int maxY, BlockMatcher blockMatcher){
  
		int heightRange = maxY - minY + 1;
		WorldGenSingleMinable gen = new WorldGenSingleMinable(iBlockState, meta, blockMatcher);
		for (int i = 0; i < chance; i++) {
			int xRand = chunkX * 16 + random.nextInt(16);
			int yRand = random.nextInt(heightRange) + minY;
			int zRand = chunkZ * 16 + random.nextInt(16);
			BlockPos pos = new BlockPos(xRand, yRand, zRand);
			gen.func_180709_b(world, random, pos);
		}
	}
	*/
}
