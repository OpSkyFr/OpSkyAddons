package fr.dinnerwolph.opskyaddons.listeners.player;

import fr.dinnerwolph.api.Api;
import fr.dinnerwolph.api.player.SkyPlayer;
import fr.dinnerwolph.opskyaddons.OpSkyAddons;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

/**
 * @author Dinnerwolph
 */

public class Quit implements Listener {

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        event.setQuitMessage(null);
        SkyPlayer player = Api.getSkyPlayer(event.getPlayer());
        OpSkyAddons.getInstance().signHashMap.remove(player);
    }
}
