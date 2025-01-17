package com.grinderwolf.swm.plugin.log;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class Logging {

    public static final String COMMAND_PREFIX = ChatColor.YELLOW + ChatColor.BOLD.toString() + "GC " + ChatColor.GRAY + ">> ";
    private static final String CONSOLE_PREFIX = ChatColor.YELLOW + "[GC] ";


    public static void success(String message) {
        Bukkit.getConsoleSender().sendMessage(CONSOLE_PREFIX + ChatColor.GREEN + message);
    }

    public static void info(String message) {
        Bukkit.getConsoleSender().sendMessage(CONSOLE_PREFIX + ChatColor.GRAY + message);
    }

    public static void warning(String message) {
        Bukkit.getConsoleSender().sendMessage(CONSOLE_PREFIX + ChatColor.YELLOW + message);
    }

    public static void error(String message) {
        Bukkit.getConsoleSender().sendMessage(CONSOLE_PREFIX + ChatColor.RED + message);
    }
}
