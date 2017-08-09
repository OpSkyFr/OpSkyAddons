package fr.dinnerwolph.opskyaddons.listeners.world;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

/**
 * @author Dinnerwolph
 */

public class Block implements Listener {

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        if (event.getBlock().getWorld().equals(Bukkit.getWorld("world")))
            if (!event.getPlayer().isOp())
                event.setCancelled(true);
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        if (event.getBlock().getWorld().equals(Bukkit.getWorld("world")))
            if (!event.getPlayer().isOp())
                event.setCancelled(true);
    }
}
