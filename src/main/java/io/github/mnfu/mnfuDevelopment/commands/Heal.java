package io.github.mnfu.mnfuDevelopment.commands;

import io.github.mnfu.mnfuDevelopment.CommandBase;
import io.github.mnfu.mnfuDevelopment.Msg;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Heal {
    public Heal() {
        new CommandBase("heal", true) {
            @Override
            public boolean onCommand(CommandSender sender, String[] arguments) {
                Player player = (Player) sender;
                player.setHealth(20d);
                Msg.send(sender, "&a" + player.getName() + " has been healed");
                return true;
            }

            @Override
            public String getUsage() {
                return "/heal";
            }
        }.enableDelay(2);
    }
}
