package highpurity.playerhitevents.events;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
public class PlayerPlayerEvent implements Listener {

    @EventHandler
    public void onEntityDamage(EntityDamageByEntityEvent e) {

        var damager = e.getDamager().toString();

        Bukkit.broadcastMessage(damager);

    }
}
