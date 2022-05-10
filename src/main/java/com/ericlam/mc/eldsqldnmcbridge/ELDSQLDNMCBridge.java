package com.ericlam.mc.eldsqldnmcbridge;

import chu77.eldependenci.sql.SQLInstallation;
import com.dragonite.mc.dnmc.core.main.DragoniteMC;
import com.dragonite.mc.dnmc.core.managers.SQLDataSource;
import com.ericlam.mc.eld.ELDBukkitPlugin;
import com.ericlam.mc.eld.ManagerProvider;
import com.ericlam.mc.eld.ServiceCollection;
import com.ericlam.mc.eld.annotations.ELDPlugin;
import org.hibernate.dialect.MySQL8Dialect;

@ELDPlugin(
        lifeCycle = BridgeLifeCycle.class,
        registry = BridgeRegistry.class
)
public class ELDSQLDNMCBridge extends ELDBukkitPlugin {

    @Override
    protected void manageProvider(ManagerProvider provider) {
    }

    @Override
    protected void bindServices(ServiceCollection collection) {
        SQLInstallation sqlInstallation = collection.getInstallation(SQLInstallation.class);
        SQLDataSource sqlDataSource = DragoniteMC.getAPI().getSQLDataSource();
        sqlInstallation.injectDataSource(sqlDataSource.getDataSource(), MySQL8Dialect.class);
    }
}
