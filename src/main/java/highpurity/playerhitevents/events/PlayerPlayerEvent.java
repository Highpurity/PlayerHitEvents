package highpurity.playerhitevents.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
public class PlayerPlayerEvent implements Listener {

    @EventHandler
    public void onEntityDamage(EntityDamageByEntityEvent e) {

        if(e.getEntity() instanceof LivingEntity){
            if(e.getDamager().getType() == EntityType.PLAYER){
                if(e.getEntity().getType() == EntityType.PLAYER){

                    LivingEntity damager = (LivingEntity) e.getDamager();
                    LivingEntity entity = (LivingEntity) e.getEntity();

                    var damhealth = damager.getHealth();
                    var dammax = damager.getMaxHealth();

                    var enthealth = entity.getHealth();
                    var entmax = entity.getMaxHealth();

                    Bukkit.broadcastMessage("");
        }

            }
        }



    }
}
