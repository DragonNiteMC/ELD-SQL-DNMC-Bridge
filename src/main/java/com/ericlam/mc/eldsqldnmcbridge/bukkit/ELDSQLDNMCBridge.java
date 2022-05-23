package com.ericlam.mc.eldsqldnmcbridge.bukkit;

import chu77.eldependenci.sql.SQLInstallation;
import com.dragonnite.mc.dnmc.core.main.DragonNiteMC;
import com.dragonnite.mc.dnmc.core.managers.SQLDataSource;
import com.ericlam.mc.eld.BukkitManagerProvider;
import com.ericlam.mc.eld.ELDBukkit;
import com.ericlam.mc.eld.ELDBukkitPlugin;
import com.ericlam.mc.eld.ServiceCollection;
import org.hibernate.dialect.MySQL8Dialect;

@ELDBukkit(
        lifeCycle = BridgeLifeCycle.class,
        registry = BridgeRegistry.class
)
public class ELDSQLDNMCBridge extends ELDBukkitPlugin {


    @Override
    public void bindServices(ServiceCollection collection) {
        SQLInstallation sqlInstallation = collection.getInstallation(SQLInstallation.class);
        SQLDataSource sqlDataSource = DragonNiteMC.getAPI().getSQLDataSource();
        sqlInstallation.injectDataSource(sqlDataSource.getDataSource(), MySQL8Dialect.class);
    }

    @Override
    protected void manageProvider(BukkitManagerProvider bukkitManagerProvider) {

    }
}
