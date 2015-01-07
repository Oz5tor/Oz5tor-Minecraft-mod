package com.oz5tor.blocks;

import com.oz5tor.lib.RefStrings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.registry.GameRegistry;

public class compressedstone {
	public static void mainRegistry(){
		initializeBlock();
		registerBlock();
	}
	
	public static Block ComStone;
	
	public static void initializeBlock(){
		ComStone = new ComStone(Material.ground).setBlockName("ComStone").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":comstone");
	}
	public static void registerBlock (){
		GameRegistry.registerBlock(ComStone, ComStone.getUnlocalizedName());
	}

}
