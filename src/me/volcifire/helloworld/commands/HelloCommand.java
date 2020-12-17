package me.volcifire.helloworld.commands;

import me.volcifire.helloworld.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HelloCommand implements CommandExecutor {
  private Main plugin;
  
  public HelloCommand(Main plugin) {
    this.plugin = plugin;
    
    plugin.getCommand("hello").setExecutor(this);
  }
  
  @Override
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    if (!(sender instanceof Player)) {
      // command can only be run by a player in the server (not console).
      sender.sendMessage("Only players may execute this command!");
      return true;
    }
    
    // If we were doing multiple commands in the same class,
    // a check such as this would be necessary.
    // if (cmd.getName().equalsIgnoreCase("hello")) {}
    
    // Now that we've verified the sender to be a player, we can cast to new var.
    Player player = (Player) sender;
    
    if (player.hasPermission("hello.use")) {
      player.sendMessage("hi!");
      return true;
    } else {
      player.sendMessage("You do not have permission to run this command!");
    }
    
    return false;
  }
  
}
