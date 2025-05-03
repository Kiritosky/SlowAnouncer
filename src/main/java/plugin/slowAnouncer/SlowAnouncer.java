package plugin.slowAnouncer;

import command.WerbungCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class SlowAnouncer extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("SlowAnouncer Plugin aktiviert!");

        getCommand("werbung").setExecutor(new WerbungCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info("SlowAnouncer Plugin deaktiviert!");
    }
}