package fr.dinnerwolph.opskyaddons.listeners.player;

import fr.dinnerwolph.opskyaddons.configs.ConfigLoc;
import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerTeleportEvent;

/**
 * @author Dinnerwolph
 */

public class Move implements Listener {

    @EventHandler
    public void onPlayerMoove(PlayerMoveEvent event) {
        Location location = event.getTo();
        if (location.getWorld().getName().equalsIgnoreCase("world") && location.getY() < 50) {
            event.getPlayer().teleport(ConfigLoc.spawn, PlayerTeleportEvent.TeleportCause.PLUGIN);
        }
    }
}
