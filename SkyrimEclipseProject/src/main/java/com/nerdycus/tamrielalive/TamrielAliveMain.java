package com.nerdycus.tamrielalive;

import org.apache.logging.log4j.Logger;

import com.nerdycus.tamrielalive.proxy.IProxy;
//import com.nerdycus.tamrielalive.proxy.ServerProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=TamrielAliveMain.MODID, name=TamrielAliveMain.NAME, version=TamrielAliveMain.VERSION, acceptedMinecraftVersions=TamrielAliveMain.MC_VERSION)
public class TamrielAliveMain 
{
	
	public static final String MODID="tamrielalive";
	public static final String NAME="Tamriel Alive";
	public static final String VERSION="Indev.0.0";
	public static final String MC_VERSION="[1.12]";
	
	public static final String CLIENT="com.nerdycus.tamrielalive.proxy.ClientProxy";
	public static final String SERVER="com.nerdycus.tamrielalive.proxy.ServerProxy";
	
	@SidedProxy(clientSide=TamrielAliveMain.CLIENT,serverSide=TamrielAliveMain.SERVER)
	public static IProxy proxy;
	
	public static Logger logger; //a debugging tool which logs information
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
		logger = event.getModLog();
		logger.info("TutorialMod.NAME "+"beginning preinitialization.");
		proxy.preInit(event);
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		
		logger.info("TutorialMod.NAME "+"beginning initialization.");
		proxy.init(event);
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
		logger.info("TutorialMod.NAME "+"beginning postinitialization.");
		proxy.postInit(event);
		
	}
}
