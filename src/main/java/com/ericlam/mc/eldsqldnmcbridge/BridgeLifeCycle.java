package com.ericlam.mc.eldsqldnmcbridge;

import com.ericlam.mc.eld.ELDLifeCycle;
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
