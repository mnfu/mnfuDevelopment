package io.github.mnfu.mnfuDevelopment.commands;

import io.github.mnfu.mnfuDevelopment.CommandBase;
import io.github.mnfu.mnfuDevelopment.Msg;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Feed {
    public Feed() {
        new CommandBase("feed", 0, 1, true) {
            @Override
            public boolean onCommand(CommandSender sender, String[] arguments) {
                Player player = (Player) sender;
                player.setFoodLevel(20);
                Msg.send(sender, "&a" + player.getName() + " has been fed");
                return true;
            }

            @Override
            public String getUsage() {
                return "/feed";
            }
        }.enableDelay(2);
    }
}
