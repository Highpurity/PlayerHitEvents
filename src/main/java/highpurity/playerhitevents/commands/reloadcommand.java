package highpurity.playerhitevents.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import java.util.Scanner;

public class reloadcommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {

        Scanner scanner = new Scanner(System.in);

        if(sender.hasPermission("playerhitevents.dev")){

            sender.sendMessage(ChatColor.RED + "Are you sure you'd like to reload? Type 'yes' to continue");
            var response = scanner.nextLine();
            if(response.equalsIgnoreCase("yes")){
                sender.sendMessage(ChatColor.DARK_AQUA + "Reloading Plugins...");
                Bukkit.reload();
                sender.sendMessage(ChatColor.GREEN + "Reload Completed!");
            }

        }

        Bukkit.reload();


        return true;
    }
}
