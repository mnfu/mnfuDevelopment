package io.github.mnfu.mnfuDevelopment.commands;

import org.bukkit.Bukkit;
public class CommandInitializer {
    public static void initializeCommands() {
        Bukkit.getLogger().info("[mnfuDevelopment] Command initialization started");
        long start = System.currentTimeMillis();
        new Feed();
        new Heal();
        long end = System.currentTimeMillis();
        Bukkit.getLogger().info("[mnfuDevelopment] Command initialization finished (" + (end-start) + "ms)");
    }
}
