package me.zuhaz.noitemrename;

import me.zuhaz.noitemrename.Listeners.PreventRenaming;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoItemRename extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Plugin Enabled");
        getServer().getPluginManager().registerEvents(new PreventRenaming(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin Disabled");
    }
}