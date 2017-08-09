package fr.dinnerwolph.opskyaddons.listeners.player;

import fr.dinnerwolph.opskyaddons.configs.ConfigLoc;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerTeleportEvent;

/**
 * @author Dinnerwolph
 */

public class Interact implements Listener {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        try {
            Player player = event.getPlayer();
            if (event.getClickedBlock().getType() == null || event.getItem().getType() == null) return;
            if (event.getClickedBlock().getType() == Material.GOLD_PLATE && event.getClickedBlock().getLocation().equals(ConfigLoc.presureplate)) {
                player.teleport(ConfigLoc.tutoriel, PlayerTeleportEvent.TeleportCause.PLUGIN);
            }
        } catch (NullPointerException e) {
            //nothing
        }
    }
}
