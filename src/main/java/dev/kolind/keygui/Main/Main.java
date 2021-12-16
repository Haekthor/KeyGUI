package dev.kolind.keygui.Main;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;

public class Main extends JavaPlugin implements CommandExecutor {

    Roll roll = new Roll(this);

    @Override
    public void onEnable() {
        PluginManager pm = Bukkit.getPluginManager();

        this.getCommand("roll").setExecutor(new Roll(this));
    }


    @Override
    public void onDisable() {

    }


}
