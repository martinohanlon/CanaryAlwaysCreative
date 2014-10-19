package com.stuffaboutcode.canaryalwayscreative;

import net.canarymod.api.GameMode;
import net.canarymod.api.world.World;
import net.canarymod.hook.HookHandler;
import net.canarymod.hook.system.LoadWorldHook;
import net.canarymod.plugin.PluginListener;

public class CanaryAlwaysCreativeListener implements PluginListener {
	
	CanaryAlwaysCreativePlugin plugin;
	
	// Class constructor
	public CanaryAlwaysCreativeListener(CanaryAlwaysCreativePlugin plugin) {
		this.plugin = plugin;
	}
	
	@HookHandler
	public void worldLoaded(LoadWorldHook worldHook) {
		World loadedWorld = worldHook.getWorld();
		loadedWorld.setGameMode(GameMode.CREATIVE);
		plugin.getLogman().info("World [" + loadedWorld.getName() + "] made creative");
	}

}
