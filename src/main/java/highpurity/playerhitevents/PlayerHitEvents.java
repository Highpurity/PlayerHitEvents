package highpurity.playerhitevents;

import highpurity.playerhitevents.events.PlayerPlayerEvent;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class PlayerHitEvents extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getServer().getPluginManager().registerEvents(new PlayerPlayerEvent(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
