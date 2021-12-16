package dev.kolind.keygui.Main;


import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.prefs.BackingStoreException;

public class RollGUI {

    public static Inventory RollGUI = Bukkit.createInventory(null, 27, "Eyes on the money");

    public static boolean roll(Player player) {

        ItemStack unFocusedBackgound = new ItemStack(Material.GRAY_STAINED_GLASS, 1);
        ItemStack FocusedBackgound = new ItemStack(Material.LIGHT_GRAY_STAINED_GLASS, 1);

        RollGUI.setItem(0, unFocusedBackgound);
        RollGUI.setItem(1, unFocusedBackgound);
        RollGUI.setItem(2, unFocusedBackgound);
        RollGUI.setItem(3, unFocusedBackgound);
        RollGUI.setItem(3, unFocusedBackgound);
        RollGUI.setItem(4, unFocusedBackgound);
        RollGUI.setItem(5, unFocusedBackgound);
        RollGUI.setItem(6, unFocusedBackgound);
        RollGUI.setItem(7, unFocusedBackgound);
        RollGUI.setItem(8, unFocusedBackgound);
        //Next row
        RollGUI.setItem(9, FocusedBackgound);
        RollGUI.setItem(10, FocusedBackgound);
        RollGUI.setItem(11, FocusedBackgound);
        RollGUI.setItem(12, FocusedBackgound);
        RollGUI.setItem(13, FocusedBackgound);
        RollGUI.setItem(14, FocusedBackgound);
        RollGUI.setItem(15, FocusedBackgound);
        RollGUI.setItem(16, FocusedBackgound);
        RollGUI.setItem(17, FocusedBackgound);
        //Next row
        RollGUI.setItem(18, unFocusedBackgound);
        RollGUI.setItem(19, unFocusedBackgound);
        RollGUI.setItem(20, unFocusedBackgound);
        RollGUI.setItem(21, unFocusedBackgound);
        RollGUI.setItem(22, unFocusedBackgound);
        RollGUI.setItem(23, unFocusedBackgound);
        RollGUI.setItem(24, unFocusedBackgound);
        RollGUI.setItem(25, unFocusedBackgound);
        RollGUI.setItem(26, unFocusedBackgound);


        player.openInventory(RollGUI);

        return true;
    }
}
