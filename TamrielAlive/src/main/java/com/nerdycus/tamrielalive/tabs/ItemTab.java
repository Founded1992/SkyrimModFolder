package com.nerdycus.tamrielalive.tabs;

import com.nerdycus.tamrielalive.TamrielAlive;
import com.nerdycus.tamrielalive.init.RefItem;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemTab extends CreativeTabs
{
	
	public ItemTab(String name)
	{
		
		super(TamrielAlive.MODID+"."+name);
		
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public ItemStack getTabIconItem()
	{
		
		return new ItemStack(RefItem.GENERIC_ITEM);
		
	}
	
}
