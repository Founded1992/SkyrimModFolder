package com.nerdycus.tamrielalive.util;

import com.nerdycus.tamrielalive.init.RefBlock;
import com.nerdycus.tamrielalive.init.RefItem;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(Side.CLIENT)
public class ModelRegistryHandler 
{
	
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event)
	{
		
		registerModel(RefItem.GENERIC_ITEM);
		registerModel(Item.getItemFromBlock(RefBlock.GENERIC_BLOCK));
		
	}
	
	private static void registerModel(Item item)
	{
		
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		
	}
}
