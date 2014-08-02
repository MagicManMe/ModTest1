package com.MagicManMe.ModTest1;

import com.MagicManMe.ModTest1.proxy.IProxy;
import com.MagicManMe.ModTest1.reference.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.MOD_VERSION)
public class ModTest1 {
	@Mod.Instance("ModTest1")
	public static ModTest1 instance;
	
	@SidedProxy(clientSide = "com.MagicManMe.ModTest1.proxy.ClientProxy", serverSide = "com.MagicManMe.ModTest1.proxy.ServerProxy")
	public static IProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
