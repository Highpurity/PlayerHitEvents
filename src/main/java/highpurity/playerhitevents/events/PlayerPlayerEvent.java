package highpurity.playerhitevents.events;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
public class PlayerPlayerEvent implements Listener {

    @Override
    public void onEntityDamage(EntityDamageByEntityEvent e) {

        var damager = e.getDamager().toString();

        Bukkit.broadcastMessage(damager);

    }
}
