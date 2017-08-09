package fr.dinnerwolph.opskyaddons.configs;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;

/**
 * @author Dinnerwolph
 */

public class ConfigLoc {

    public static World world = Bukkit.getWorld("world");
    public static Location spawn = new Location(world, -3.5, 114, 0.5, 90, 0);
    public static Location presureplate = new Location(world, -4, 112, -27);
    public static Location tutoriel = new Location(world, -475, 156.5, 36);
}
