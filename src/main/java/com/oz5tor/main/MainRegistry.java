package com.oz5tor.main;
import com.oz5tor.blocks.ComStone;
import com.oz5tor.blocks.compressedstone;
import com.oz5tor.items.ObsidianStick;
import com.oz5tor.lib.RefStrings;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod (modid = RefStrings.MODID , name = RefStrings.NAME, version = RefStrings.VERSION)
public class MainRegistry {
 
	@SidedProxy(clientSide = RefStrings.CLIENTSIDE, serverSide = RefStrings.SERVERSIDE)
	public static ServerProxy proxy;
	
 @EventHandler
 public static void PreLoad(FMLPreInitializationEvent PreEvent) {
	 ObsidianStick.mainRegistry();
	 compressedstone.mainRegistry();
	 proxy.registerRenderInfo(); 
 }
 @EventHandler
 public static void Load(FMLInitializationEvent Event) {
	 
 }
 @EventHandler
 public static void PostLoad(FMLPostInitializationEvent PostEvent) {
	 
 }
}
