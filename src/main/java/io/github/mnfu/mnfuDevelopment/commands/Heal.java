package io.github.mnfu.mnfuDevelopment.commands;

import io.github.mnfu.mnfuDevelopment.CommandBase;
import io.github.mnfu.mnfuDevelopment.Msg;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Heal {
    public Heal() {
        String permission = "mnfuDevelopment.heal";
        new CommandBase("heal",0,1,true) {
            @Override
            public boolean onCommand(CommandSender sender, String[] arguments) {
                setDescription("Heals a player");
                if(arguments.length == 0) {
                    Player player = (Player) sender;
                    player.setHealth(20d);
                    Msg.send(sender, "&aYou have been healed");
                }
                else{
                    String playerName = arguments[0];
                    Player target = Bukkit.getServer().getPlayerExact(playerName);
                    if(target == null) {
                        Msg.send(sender, "&aThis player is not online");
                    }
                    else{
                        target.setHealth(20d);
                        if(sender.getName().equals(target.getName())) {
                            Msg.send(target, "&aYou have been healed");
                        }
                        else {
                            Msg.send(target, "&aYou have been healed");
                            Msg.send(sender, "&a" + target.getName() + " has been healed");
                        }
                    }
                }
                return true;
            }
            @Override
            public String getUsage() {
                return "/heal <playername>";
            }
            @Override
            public String getPermission() {
                return permission;
            }
        }.enableDelay(2);
    }
}
