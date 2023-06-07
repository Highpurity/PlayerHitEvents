package highpurity.playerhitevents.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
public class PlayerPlayerEvent implements Listener {

    @EventHandler
    public void onEntityDamage(EntityDamageByEntityEvent e) {

        if(e.getDamager().getType() == EntityType.PLAYER){
            if(e.getEntity().getType() == EntityType.PLAYER){
                Bukkit.broadcastMessage("test");
            }
        }



    }
}
