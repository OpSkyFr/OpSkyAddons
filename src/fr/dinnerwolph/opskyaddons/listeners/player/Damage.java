package fr.dinnerwolph.opskyaddons.listeners.player;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

/**
 * @author Dinnerwolph
 */

public class Damage implements Listener {

    @EventHandler
    public void onDamage(EntityDamageEvent event) {
        if (event.getEntity().getWorld().equals(Bukkit.getWorld("world")) && event.getEntity().getLocation().getX() < 50)
            event.setCancelled(true);
    }
}
