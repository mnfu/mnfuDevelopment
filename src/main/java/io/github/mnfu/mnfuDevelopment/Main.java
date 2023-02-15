package io.github.mnfu.mnfuDevelopment;

import io.github.mnfu.mnfuDevelopment.commands.Feed;
import io.github.mnfu.mnfuDevelopment.commands.Heal;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    private static Main instance;

    @Override
    public void onEnable() {
        instance = this;
        new Heal();
        new Feed();
    }

    @Override
    public void onDisable() {
    }

    public static Main getInstance() {
        return instance;
    }
}