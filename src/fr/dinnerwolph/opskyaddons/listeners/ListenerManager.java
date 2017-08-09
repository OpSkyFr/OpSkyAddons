package fr.dinnerwolph.opskyaddons.listeners;

import fr.dinnerwolph.opskyaddons.OpSkyAddons;
import fr.dinnerwolph.opskyaddons.listeners.player.*;
import fr.dinnerwolph.opskyaddons.listeners.world.Block;
import fr.dinnerwolph.opskyaddons.listeners.world.Spawn;
import org.bukkit.plugin.PluginManager;

/**
 * @author Dinnerwolph
 */

public class ListenerManager {

    private OpSkyAddons plugin = OpSkyAddons.getInstance();

    public ListenerManager() {
        PluginManager pluginManager = plugin.getServer().getPluginManager();
        pluginManager.registerEvents(new Block(), plugin);
        pluginManager.registerEvents(new Chat(), plugin);
        pluginManager.registerEvents(new Damage(), plugin);
        pluginManager.registerEvents(new Join(), plugin);
        pluginManager.registerEvents(new Quit(), plugin);
        pluginManager.registerEvents(new Interact(), plugin);
        pluginManager.registerEvents(new Spawn(), plugin);
        pluginManager.registerEvents(new Move(), plugin);
    }
}
