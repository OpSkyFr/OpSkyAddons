package fr.dinnerwolph.opskyaddons;

import fr.dinnerwolph.api.player.SkyPlayer;
import fr.dinnerwolph.api.utils.ScoreboardSign;
import fr.dinnerwolph.opskyaddons.commands.HubCommand;
import fr.dinnerwolph.opskyaddons.listeners.ListenerManager;
import fr.dinnerwolph.opskyaddons.runnable.ScoreBoardTask;
import org.bukkit.Achievement;
import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_12_R1.CraftServer;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

/**
 * @author Dinnerwolph
 */

public class OpSkyAddons extends JavaPlugin {

    private static OpSkyAddons instance;
    public HashMap<SkyPlayer, ScoreboardSign> signHashMap = new HashMap();

    @Override
    public void onEnable() {
        instance = this;
        new ListenerManager();
        getCommand("spawn").setExecutor(new HubCommand());
        new ScoreBoardTask().runTaskTimer(this, 15 * 20L, 15 * 20L);

    }

    public static OpSkyAddons getInstance() {
        return instance;
    }
}
