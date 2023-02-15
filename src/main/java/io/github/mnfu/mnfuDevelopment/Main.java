package io.github.mnfu.mnfuDevelopment;

import org.bukkit.plugin.java.JavaPlugin;
import static io.github.mnfu.mnfuDevelopment.commands.CommandInitializer.initializeCommands;

public class Main extends JavaPlugin {
    private static Main instance;

    @Override
    public void onEnable() {
        instance = this;
        initializeCommands();
    }

    @Override
    public void onDisable() {
    }

    public static Main getInstance() {
        return instance;
    }
}