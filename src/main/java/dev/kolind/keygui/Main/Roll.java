package dev.kolind.keygui.Main;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Arrays;

public class Roll implements CommandExecutor {

    RollGUI rollGUI = new RollGUI();

    Main plugin;

    public Roll(Main plugin){
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {return false;}
        Player player = (Player) sender;

        String lCommand = command.toString().toLowerCase();
        
        Bukkit.broadcastMessage("Executed " + lCommand + Arrays.stream(args).toArray().toString());
        RollGUI.roll(player);
        Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
            @Override
            public void run() {
                Bukkit.broadcastMessage("This message is shown immediately and then repeated every second");
            }
        }, 0L, 20L);

        return true;
    }
}
