package fr.dinnerwolph.opskyaddons.listeners.player;

import fr.dinnerwolph.api.Api;
import fr.dinnerwolph.api.player.SkyPlayer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

/**
 * @author Dinnerwolph
 */

public class Chat implements Listener {

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        SkyPlayer player = Api.getSkyPlayer(event.getPlayer());
        event.setFormat(player.getGroup().getPrefix() + player.getDisplayName() + ": " + event.getMessage());
    }
}
