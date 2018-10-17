package com.nerdycus.tamrielalive.blocks;

import com.nerdycus.tamrielalive.TamrielAlive;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class GenericBlock extends Block
{
	
	public GenericBlock(Material material, String unlocalizedName, String registryName)
	{
		
		this(material,SoundType.STONE,unlocalizedName,registryName);
		
	}
	
	public GenericBlock(Material material, SoundType sound, String unlocalizedName, String registryName)
	{
		
		super(material);
		setUnlocalizedName(TamrielAlive.MODID+"."+unlocalizedName);
		setRegistryName(registryName);
		setCreativeTab(TamrielAlive.ITEM_TAB);
		setSoundType(sound);
		
	}
}
