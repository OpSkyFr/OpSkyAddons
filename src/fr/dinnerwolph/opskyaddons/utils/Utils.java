package fr.dinnerwolph.opskyaddons.utils;

import fr.dinnerwolph.api.Api;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

/**
 * @author Dinnerwolph
 */

public class Utils {

    public static void updateRank(Player player) {
        Scoreboard scoreboard = Bukkit.getScoreboardManager().getMainScoreboard();
        int groupId = Api.getSkyPlayer(player).getGroupId();
        int scoreboardId = Api.getInstance().getGroups(groupId).getScopeboardId();
        Team team = scoreboard.getTeam(scoreboardId + "");
        if (team == null) {
            team = scoreboard.registerNewTeam(scoreboardId + "");
            if (Api.getSkyPlayer(player).getGroupId() == 0)
                team.setPrefix("§7");
            else {
                team.setPrefix(Api.getInstance().getGroups(Api.getSkyPlayer(player).getGroupId()).getPrefix());
                team.setSuffix(Api.getInstance().getGroups(Api.getSkyPlayer(player).getGroupId()).getSufffix());
            }
        } else {
            team.setPrefix(Api.getInstance().getGroups(Api.getSkyPlayer(player).getGroupId()).getPrefix());
            team.setSuffix(Api.getInstance().getGroups(Api.getSkyPlayer(player).getGroupId()).getSufffix());
        }
        team.addPlayer(player);
    }
}
