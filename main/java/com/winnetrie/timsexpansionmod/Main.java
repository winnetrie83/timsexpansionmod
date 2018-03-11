package com.winnetrie.timsexpansionmod;

import java.io.File;

import org.apache.logging.log4j.Logger;

import com.winnetrie.timsexpansionmod.proxy.CommonProxy;
import com.winnetrie.timsexpansionmod.util.ConfigHandler;
import com.winnetrie.timsexpansionmod.util.Reference;
import com.winnetrie.timsexpansionmod.util.handlers.RecipeHandler;
import com.winnetrie.timsexpansionmod.world.ModWorldGenerator;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION , dependencies="after:biomesoplenty")
public class Main
{
    

	@Instance()
	public static Main instance;
	
	private static File configDir;
	public static File getConfigDir() {

        return configDir;

    }
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
    

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	configDir = new File(event.getModConfigurationDirectory() + "/" + Reference.MODID);
        configDir.mkdirs();
        ConfigHandler.init(new File(configDir.getPath(), Reference.MODID + ".cfg"));
        
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        RecipeHandler.registerCrafting();
        RecipeHandler.registerSmelting();
        GameRegistry.registerWorldGenerator(new ModWorldGenerator(), 10);

    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        
    }
}
