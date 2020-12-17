package me.volcifire.helloworld;

import org.bukkit.plugin.java.JavaPlugin;
import me.volcifire.helloworld.commands.HelloCommand;

public class Main extends JavaPlugin {
  
  @Override
  public void onEnable() {
    new HelloCommand(this);
  }
  
}
