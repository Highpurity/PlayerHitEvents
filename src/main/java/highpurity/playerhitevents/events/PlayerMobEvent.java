package highpurity.playerhitevents.events;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class PlayerMobEvent implements Listener {

    @EventHandler
    public void onPlayerMobEvent(EntityDamageByEntityEvent e){
        if(e.getDamager().getType() == EntityType.PLAYER){
            if(!e.getEntity().isDead()){
                var entity = e.getEntity();
                var playername = e.getDamager().getName();
                var player = e.getDamager();

                //Bukkit.broadcastMessage(ChatColor.GREEN + playername + ChatColor.WHITE + ChatColor.RED +"❤");
            }
        }
    }

}
