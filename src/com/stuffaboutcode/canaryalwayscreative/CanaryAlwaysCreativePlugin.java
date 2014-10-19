package com.stuffaboutcode.canaryalwayscreative;

import com.stuffaboutcode.canaryalwayscreative.CanaryAlwaysCreativeListener;
import net.canarymod.Canary;
import net.canarymod.plugin.Plugin;

public class CanaryAlwaysCreativePlugin extends Plugin {

	@Override
	public boolean enable() {
		getLogman().info("Enabling " + getName() + " Version " + getVersion()); 
		getLogman().info("Authored by "+ getAuthor());
		
		//register the listener
		Canary.hooks().registerListener(new CanaryAlwaysCreativeListener(this), this);
		return true;
	}

	@Override
	public void disable() {
		Canary.hooks().unregisterPluginListeners(this);
		getLogman().info("AlwaysCreative disabled");
	}
	
}
