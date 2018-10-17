package com.nerdycus.tamrielalive.util;

import com.nerdycus.tamrielalive.items.GenericItem;
import com.nerdycus.tamrielalive.init.RefBlock;
import com.nerdycus.tamrielalive.blocks.GenericBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler 
{
	
	@SubscribeEvent
	public static void registerBlocks(Register<Block> event)
	{
		
		final Block[] blocks = 
			{
					
					new GenericBlock(Material.ROCK,"genericBlock","generic_block")
					
			};
		
		event.getRegistry().registerAll(blocks);
		
	}
	
	@SubscribeEvent
	public static void registerItems(Register<Item> event)
	{
		
		final Item[] items = 
			{
					
					new GenericItem("genericItem","generic_item")
					
			};
		
		final Item[] itemBlocks =
			{
					
					new ItemBlock(RefBlock.GENERIC_BLOCK).setRegistryName(RefBlock.GENERIC_BLOCK.getRegistryName())
					
			};
		
		event.getRegistry().registerAll(items);
		event.getRegistry().registerAll(itemBlocks);
		
	}
	
}
