package com.ericlam.mc.eldsqldnmcbridge.bungee;

import chu77.eldependenci.sql.SQLInstallation;
import com.ericlam.mc.bungee.dnmc.SQLDataSource;
import com.ericlam.mc.bungee.dnmc.main.DragoniteMC;
import com.ericlam.mc.eld.BungeeManageProvider;
import com.ericlam.mc.eld.ELDBungee;
import com.ericlam.mc.eld.ELDBungeePlugin;
import com.ericlam.mc.eld.ServiceCollection;
import org.hibernate.dialect.MySQL8Dialect;

@ELDBungee(
        lifeCycle = BridgeLifeCycle.class,
        registry = BridgeRegistry.class
)
public class ELDSQLDNMCBridge extends ELDBungeePlugin {

    @Override
    protected void manageProvider(BungeeManageProvider bungeeManageProvider) {

    }

    @Override
    public void bindServices(ServiceCollection collection) {
        SQLInstallation sqlInstallation = collection.getInstallation(SQLInstallation.class);
        SQLDataSource sqlDataSource = DragoniteMC.getAPI().getSQLDataSource();
        sqlInstallation.injectDataSource(sqlDataSource.getDataSource(), MySQL8Dialect.class);
    }
}
