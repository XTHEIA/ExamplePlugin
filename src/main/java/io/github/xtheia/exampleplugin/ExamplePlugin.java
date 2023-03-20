package io.github.xtheia.exampleplugin;

import org.bukkit.Server;
import org.bukkit.inventory.ItemFactory;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;

public final class ExamplePlugin extends JavaPlugin
{
	public static ExamplePlugin Instance;
	public static Server Server;
	public static BukkitScheduler Scheduler;
	public static ItemFactory ItemFactory;
	
	
	@Override
	public void onLoad()
	{
		// on plugin load
	}
	
	@Override
	public void onEnable()
	{
		// on plugin enable
		Instance = this;
		Server = getServer();
		Scheduler = Server.getScheduler();
		ItemFactory = Server.getItemFactory();
		
		Server.getPluginManager().registerEvents(new ServerEventListener(), this);
	}
	
	@Override
	public void onDisable()
	{
		// on plugin shutdown
	}
}
