package com.nerdycus.tamrielalive.item;

import com.nerdycus.tamrielalive.TamrielAliveMain;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBasic extends Item
{

	public ItemBasic(String unlocalizedName,String registryName)
	{
		
		setUnlocalizedName(TamrielAliveMain.MODID+"."+unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(CreativeTabs.MISC);
		
	}
	
}
