package me.william278.huskhomes2.commands;

import me.william278.huskhomes2.HuskHomes;
import me.william278.huskhomes2.MessageManager;
import me.william278.huskhomes2.teleport.TeleportManager;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RtpCommand extends CommandBase {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (HuskHomes.settings.doRtpCommand()) {
                if (p.getWorld().getEnvironment() == World.Environment.NORMAL) {
                    TeleportManager.queueRandomTeleport(p);
                } else {
                    MessageManager.sendMessage(p, "error_rtp_invalid_dimension");
                }
            } else {
                MessageManager.sendMessage(p, "error_command_disabled");
            }
            return true;
        }
        return false;
    }
}