package io.github.mnfu.mnfuDevelopment;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import static io.github.mnfu.mnfuDevelopment.commands.CommandInitializer.initializeCommands;

public class Main extends JavaPlugin {
    private static Main instance;

    @Override
    public void onEnable() {
        long start = System.currentTimeMillis();
        instance = this;
        initializeCommands();
        long end = System.currentTimeMillis();
        Bukkit.getLogger().info("[mnfuDevelopment] Plugin initialization finished (took " + (end-start) + "ms)");
    }

    @Override
    public void onDisable() {
    }

    public static Main getInstance() {
        return instance;
    }
}