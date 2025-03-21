package org.leralix.tan.listeners;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.metadata.MetadataValue;
import org.leralix.tan.dataclass.Landmark;
import org.leralix.tan.dataclass.PlayerData;
import org.leralix.tan.storage.stored.LandmarkStorage;
import org.leralix.tan.storage.stored.PlayerDataStorage;
import org.leralix.tan.gui.PlayerGUI;
import org.leralix.tan.lang.Lang;

public class LandmarkChestListener implements Listener {
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        Block clickedBlock = event.getClickedBlock();

        if (clickedBlock != null &&
                (event.getAction() == Action.RIGHT_CLICK_BLOCK) &&
                clickedBlock.getType() == Material.CHEST &&
                clickedBlock.hasMetadata("LandmarkChest")){
                    event.setCancelled(true);
                    PlayerData playerData = PlayerDataStorage.getInstance().get(player);
                    for (MetadataValue value : clickedBlock.getMetadata("LandmarkChest")) {
                        String customData = value.asString();
                        Landmark landmark = LandmarkStorage.get(customData);
                        if(!playerData.hasTown()){
                            player.sendMessage(Lang.PLAYER_NO_TOWN.get());
                            return;
                        }
                        PlayerGUI.dispatchLandmarkGui(player, landmark);
                    }
                }


    }

}
