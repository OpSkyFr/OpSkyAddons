package fr.dinnerwolph.opskyaddons.listeners.player;

import fr.dinnerwolph.api.Api;
import fr.dinnerwolph.api.player.SkyPlayer;
import fr.dinnerwolph.api.utils.MathsUtils;
import fr.dinnerwolph.api.utils.ScoreboardSign;
import fr.dinnerwolph.opskyaddons.OpSkyAddons;
import fr.dinnerwolph.opskyaddons.utils.Utils;
import net.minecraft.server.v1_12_R1.PacketPlayOutScoreboardScore;
import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * @author Dinnerwolph
 */

public class Join implements Listener {


    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        SkyPlayer player = Api.getSkyPlayer(event.getPlayer());
        if (player.getGroupId() < 95) {
            player.kickPlayer("§cServeur en maintenance");
            event.setJoinMessage("");
            return;
        }
        player.setGameMode(GameMode.SURVIVAL);
        ScoreboardSign scoreboardSign = new ScoreboardSign(player, "§bOpSky");
        scoreboardSign.create();
        scoreboardSign.setLine(1, "§aGrade:" + player.getGroup().getGroupName());
        scoreboardSign.setLine(2, " ");
        scoreboardSign.setLine(3, "§6OpCoins: §e" + MathsUtils.format(Api.getSkyPlayer(player).getOpCoins()) + " §a$");
        scoreboardSign.setLine(4, "§a");
        OpSkyAddons.getInstance().signHashMap.put(player, scoreboardSign);
        if (player.getGroupId() > 0)
            event.setJoinMessage(player.getGroup().getPrefix() + "§7" + player.getDisplayName() + " a rejoint le serveur.");
        else
            event.setJoinMessage(null);
        Utils.updateRank(player);
    }
}
