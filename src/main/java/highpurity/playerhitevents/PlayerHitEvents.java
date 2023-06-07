package highpurity.playerhitevents;

import highpurity.playerhitevents.events.PlayerMobEvent;
import highpurity.playerhitevents.events.PlayerPlayerEvent;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class PlayerHitEvents extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getServer().getPluginManager().registerEvents(new PlayerPlayerEvent(), this);
        getServer().getPluginManager().registerEvents(new PlayerMobEvent(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
