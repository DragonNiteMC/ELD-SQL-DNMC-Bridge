package com.ericlam.mc.eldsqldnmcbridge.bukkit;

import com.ericlam.mc.eld.bukkit.ELDLifeCycle;
import org.bukkit.plugin.java.JavaPlugin;

public class BridgeLifeCycle implements ELDLifeCycle {


    @Override
    public void onEnable(JavaPlugin plugin) {
        plugin.getLogger().info("The Bridge between ELDependenci-SQL and DragonNiteMC-Core is connected.");
    }

    @Override
    public void onDisable(JavaPlugin plugin) {

    }
}
