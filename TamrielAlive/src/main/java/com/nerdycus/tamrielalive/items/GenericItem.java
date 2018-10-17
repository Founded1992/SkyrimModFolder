package com.nerdycus.tamrielalive.items;

import com.nerdycus.tamrielalive.TamrielAlive;

import net.minecraft.item.Item;

public class GenericItem extends Item
{
	
	public GenericItem(String unlocalizedName, String registryName)
	{
		
		setUnlocalizedName(TamrielAlive.MODID+"."+unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(TamrielAlive.ITEM_TAB);
		
	}
}
