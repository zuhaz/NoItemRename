package me.zuhaz.noitemrename.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareAnvilEvent;

public class PreventRenaming implements Listener {

    @SuppressWarnings("removal")
    @EventHandler
    public static void onAnvilRename(PrepareAnvilEvent event) {
        if(event.getInventory().getRenameText() != null && !event.getInventory().getRenameText().isEmpty()) {
            event.setResult(null);
        }
    }
}