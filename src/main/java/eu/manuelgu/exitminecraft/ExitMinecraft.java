package eu.manuelgu.exitminecraft;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class ExitMinecraft extends JavaPlugin implements CommandExecutor {

    @Override
    public void onEnable() {
        getCommand("exit").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
        if (!(cs instanceof Player)) {
            System.out.println("Well, there should be another way to exit the console for you.");
            return true;
        }
        Bukkit.getPlayer(cs.getName()).kickPlayer("This was not a terminal, but anyways!");
        return true;
    }

}
