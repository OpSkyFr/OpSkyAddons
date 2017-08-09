package fr.dinnerwolph.opskyaddons.commands;

import fr.dinnerwolph.api.command.SkyCommand;
import fr.dinnerwolph.opskyaddons.configs.ConfigLoc;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;

/**
 * @author Dinnerwolph
 */

public class HubCommand extends SkyCommand {

    @Override
    public boolean execute(Player player, Command command, String label, String[] args) {
        player.teleport(ConfigLoc.spawn);
        return true;
    }
}
