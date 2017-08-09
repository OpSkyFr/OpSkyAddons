package fr.dinnerwolph.opskyaddons.runnable;

import fr.dinnerwolph.api.Api;
import fr.dinnerwolph.api.player.SkyPlayer;
import fr.dinnerwolph.api.utils.MathsUtils;
import fr.dinnerwolph.api.utils.ScoreboardSign;
import fr.dinnerwolph.opskyaddons.OpSkyAddons;
import org.bukkit.scheduler.BukkitRunnable;

/**
 * @author Dinnerwolph
 */

public class ScoreBoardTask extends BukkitRunnable {

    @Override
    public void run() {
        for (SkyPlayer skyPlayer : OpSkyAddons.getInstance().signHashMap.keySet()) {
            ScoreboardSign scoreboardSign = OpSkyAddons.getInstance().signHashMap.get(skyPlayer);
            scoreboardSign.setLine(3, "§6OpCoins: §e" + MathsUtils.format(Api.getSkyPlayer(skyPlayer).getOpCoins()) + "§a $");
        }
    }
}
