package com.nerdycus.tamrielalive;

import org.apache.logging.log4j.Logger;

import com.nerdycus.tamrielalive.proxy.IProxy;
import com.nerdycus.tamrielalive.tabs.ItemTab;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid=TamrielAlive.MODID, name=TamrielAlive.NAME,version=TamrielAlive.VERSION,acceptedMinecraftVersions=TamrielAlive.MC_VERSION)
public class TamrielAlive 
{
	
	public static final String MODID = "tamrielalive";
	public static final String NAME = "Tamriel Alive";
	public static final String VERSION = "INDEV.0.1";
	public static final String MC_VERSION = "[1.12]";
	
	public static final String CLIENT = "com.nerdycus.tamrielalive.proxy.ClientProxy";
	public static final String SERVER = "com.nerdycus.tamrielalive.proxy.ServerProxy";
	
	@SidedProxy(clientSide=TamrielAlive.CLIENT, serverSide=TamrielAlive.SERVER)
	public static IProxy proxy;
	
	public static Logger logger;
	
	//---//
	
	public static final ItemTab ITEM_TAB = new ItemTab("tabTamrielAliveItems");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
		logger = event.getModLog();
		logger.info(TamrielAlive.NAME+" beginning preinitialization.");
		proxy.preInit(event);
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		
		logger.info(TamrielAlive.NAME+" beginning initialization.");
		proxy.init(event);
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
		logger.info(TamrielAlive.NAME+" beginning postinitialization.");
		proxy.postInit(event);
		
	}
}
