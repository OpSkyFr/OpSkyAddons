package fr.dinnerwolph.opskyaddons.listeners.world;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

/**
 * @author Dinnerwolph
 */

public class Spawn implements Listener {

    @EventHandler
    public void onCreatureSpawn(CreatureSpawnEvent event) {
        if (event.getEntity().getLocation().getWorld().getName().equalsIgnoreCase("world"))
            event.setCancelled(true);
    }
}
