package io.github.xtheia.exampleplugin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public final class ServerEventListener implements Listener
{
	private static final ExamplePlugin plugin = ExamplePlugin.Instance;
	
	@EventHandler
	private void onPlayerInteract(PlayerInteractEvent playerInteractEvent)
	{
		var player = playerInteractEvent.getPlayer();
		var item = playerInteractEvent.getItem();
		
		if (item != null)
		{
			player.sendMessage("You interacted with item " + item.getType());
		}
	}
	
}
