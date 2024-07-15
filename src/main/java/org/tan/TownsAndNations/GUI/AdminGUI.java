package org.tan.TownsAndNations.GUI;

import dev.triumphteam.gui.builder.item.ItemBuilder;
import dev.triumphteam.gui.guis.Gui;
import dev.triumphteam.gui.guis.GuiItem;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitScheduler;
import org.jetbrains.annotations.NotNull;
import org.tan.TownsAndNations.DataClass.*;
import org.tan.TownsAndNations.DataClass.newChunkData.ClaimedChunk2;
import org.tan.TownsAndNations.DataClass.newChunkData.LandmarkClaimedChunk;
import org.tan.TownsAndNations.DataClass.territoryData.RegionData;
import org.tan.TownsAndNations.DataClass.territoryData.TownData;
import org.tan.TownsAndNations.Lang.Lang;
import org.tan.TownsAndNations.TownsAndNations;
import org.tan.TownsAndNations.enums.ChatCategory;
import org.tan.TownsAndNations.enums.MessageKey;
import org.tan.TownsAndNations.enums.SoundEnum;
import org.tan.TownsAndNations.storage.DataStorage.*;
import org.tan.TownsAndNations.storage.PlayerChatListenerStorage;
import org.tan.TownsAndNations.utils.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static org.tan.TownsAndNations.enums.ChatCategory.*;
import static org.tan.TownsAndNations.enums.SoundEnum.GOOD;
import static org.tan.TownsAndNations.utils.ChatUtils.getTANString;
import static org.tan.TownsAndNations.utils.TownUtil.deleteTown;

public class AdminGUI implements IGUI{
    public static void OpenMainMenu(Player player){

        Gui gui = IGUI.createChestGui("Main menu - Admin",3);

        ItemStack regionHead = HeadUtils.makeSkull(Lang.GUI_REGION_ICON.get(),"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNDljMTgzMmU0ZWY1YzRhZDljNTE5ZDE5NGIxOTg1MDMwZDI1NzkxNDMzNGFhZjI3NDVjOWRmZDYxMWQ2ZDYxZCJ9fX0=");
        ItemStack townHead = HeadUtils.makeSkull(Lang.GUI_TOWN_ICON.get(),"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNjNkMDJjZGMwNzViYjFjYzVmNmZlM2M3NzExYWU0OTc3ZTM4YjkxMGQ1MGVkNjAyM2RmNzM5MTNlNWU3ZmNmZiJ9fX0=",
                Lang.ADMIN_GUI_TOWN_DESC.get());
        ItemStack playerHead = HeadUtils.createCustomItemStack(Material.PLAYER_HEAD,
                Lang.GUI_TOWN_CHUNK_PLAYER.get(),
                Lang.ADMIN_GUI_PLAYER_DESC.get());
        ItemStack landmark = HeadUtils.makeSkull(Lang.ADMIN_GUI_LANDMARK_ICON.get(), "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZmQ3NjFjYzE2NTYyYzg4ZDJmYmU0MGFkMzg1MDJiYzNiNGE4Nzg1OTg4N2RiYzM1ZjI3MmUzMGQ4MDcwZWVlYyJ9fX0=",
                Lang.ADMIN_GUI_LANDMARK_DESC1.get());

        GuiItem _region = ItemBuilder.from(regionHead).asGuiItem(event -> {
            event.setCancelled(true);
            OpenRegionDebugMenu(player, 0);
        });

        GuiItem _town = ItemBuilder.from(townHead).asGuiItem(event -> {
            event.setCancelled(true);
            OpenTownMenuDebug(player, 0);
        });

        GuiItem _player = ItemBuilder.from(playerHead).asGuiItem(event -> {
            event.setCancelled(true);
            OpenPlayerMenu(player, 0);
        });

        GuiItem _landmark = ItemBuilder.from(landmark).asGuiItem(event -> {
            event.setCancelled(true);
            OpenLandmarks(player, 0);
        });


        gui.setItem(12,_region);
        gui.setItem(14,_town);
        gui.setItem(16,_player);
        gui.setItem(17,_landmark);
        gui.setItem(3,1, IGUI.CreateBackArrow(player,p -> player.closeInventory()));

        gui.open(player);
    }

    private static void OpenLandmarks(Player player, int page) {

        Gui gui = IGUI.createChestGui("Landmarks - Admin", 6);

        ArrayList<GuiItem> guiItems = new ArrayList<>();

        for(Landmark landmark : LandmarkStorage.getList()){
            ItemStack icon = landmark.getIcon();
            HeadUtils.addLore(icon,
                    "",
                    Lang.SPECIFIC_LANDMARK_ICON_SWITCH_REWARD.get(),
                    Lang.GUI_GENERIC_RIGHT_CLICK_TO_DELETE.get(),
                    Lang.GUI_GENERIC_SHIFT_CLICK_TO_TELEPORT.get());

            GuiItem item = ItemBuilder.from(icon).asGuiItem(event -> {
                event.setCancelled(true);
                if(event.isLeftClick() && !event.isShiftClick()){
                    ItemStack itemOnCursor = player.getItemOnCursor();
                    if(itemOnCursor.getType() != Material.AIR){
                        player.sendMessage(getTANString() + Lang.ADMIN_GUI_LANDMARK_REWARD_SET.get(itemOnCursor.getAmount(), itemOnCursor.getType().name()));
                        landmark.setReward(itemOnCursor);
                        OpenLandmarks(player, page);
                        SoundUtil.playSound(player, SoundEnum.GOOD);
                        return;
                    }
                }
                else if(event.isRightClick()){
                    landmark.deleteLandmark();
                    OpenLandmarks(player, page);
                    return;
                }
                else if(event.isShiftClick()){
                    new BukkitRunnable(){
                        @Override
                        public void run() {
                            player.closeInventory();
                            player.teleport(landmark.getLocation());
                        }
                    }.runTaskLater(TownsAndNations.getPlugin(), 1L);


                    SoundUtil.playSound(player, SoundEnum.GOOD);
                    return;
                }
            });
            guiItems.add(item);

        }
        GuiUtil.createIterator(gui, guiItems, page, player, p -> OpenMainMenu(player),
                p -> OpenLandmarks(player, page + 1),
                p -> OpenLandmarks(player, page - 1));

        ItemStack createLandmark = HeadUtils.makeSkull(Lang.ADMIN_GUI_CREATE_LANDMARK.get(),"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWZmMzE0MzFkNjQ1ODdmZjZlZjk4YzA2NzU4MTA2ODFmOGMxM2JmOTZmNTFkOWNiMDdlZDc4NTJiMmZmZDEifX19");

        GuiItem _createLandmark = ItemBuilder.from(createLandmark).asGuiItem(event -> {
            event.setCancelled(true);


            ClaimedChunk2 claimedChunk = NewClaimedChunkStorage.get(player.getLocation().getBlock().getChunk());

            if(claimedChunk != null) {
                if (claimedChunk instanceof LandmarkClaimedChunk) {
                    player.sendMessage(getTANString() + Lang.ADMIN_CHUNK_ALREADY_LANDMARK.get());
                    return;
                }
            }
            LandmarkStorage.addLandmark(player.getLocation());
            OpenLandmarks(player,page);
        });
        gui.setItem(6, 4, _createLandmark);
        gui.open(player);
    }

    private static void OpenRegionDebugMenu(Player player, int page) {

        Gui gui = IGUI.createChestGui("Region - Admin",6);

        ArrayList<GuiItem> guiItems = new ArrayList<>();

        for (RegionData regionData : RegionDataStorage.getAllRegions()){

            ItemStack regionIcon = HeadUtils.getRegionIcon(regionData);
            HeadUtils.addLore(regionIcon, Lang.ADMIN_GUI_REGION_DESC.get());
            GuiItem _region = ItemBuilder.from(regionIcon).asGuiItem(event -> {
                event.setCancelled(true);
                OpenSpecificRegionMenu(player, regionData);
            });
            guiItems.add(_region);
        }

        GuiUtil.createIterator(gui, guiItems, page, player, p -> OpenMainMenu(player),
                p -> OpenRegionDebugMenu(player, page + 1),
                p -> OpenRegionDebugMenu(player, page - 1));
        gui.open(player);
    }

    private static void OpenSpecificRegionMenu(Player player, RegionData regionData) {
        Gui gui = IGUI.createChestGui("Region - Admin",3);


        ItemStack changeRegionName = HeadUtils.createCustomItemStack(Material.NAME_TAG,
                Lang.ADMIN_GUI_CHANGE_TOWN_NAME.get(),
                Lang.ADMIN_GUI_CHANGE_TOWN_NAME_DESC1.get(regionData.getName()));
        ItemStack changeRegionDescription = HeadUtils.createCustomItemStack(Material.WRITABLE_BOOK,
                Lang.ADMIN_GUI_CHANGE_TOWN_DESCRIPTION.get(),
                Lang.ADMIN_GUI_CHANGE_TOWN_DESCRIPTION_DESC1.get(regionData.getDescription()));
        ItemStack changeTownLeader = HeadUtils.createCustomItemStack(Material.PLAYER_HEAD,
                Lang.ADMIN_GUI_CHANGE_REGION_LEADER.get(),
                Lang.ADMIN_GUI_CHANGE_REGION_LEADER_DESC1.get(regionData.getLeaderData().getName(),regionData.getCapital().getName()));
        ItemStack deleteRegion = HeadUtils.createCustomItemStack(Material.BARRIER,
                Lang.ADMIN_GUI_DELETE_TOWN.get(),
                Lang.ADMIN_GUI_DELETE_TOWN_DESC1.get(regionData.getName()));

        GuiItem _changeRegionName = ItemBuilder.from(changeRegionName).asGuiItem(event -> {

            player.sendMessage(ChatUtils.getTANString() + Lang.GUI_TOWN_SETTINGS_CHANGE_MESSAGE_IN_CHAT.get());
            Map<MessageKey, String> data = new HashMap<>();

            data.put(MessageKey.REGION_ID,regionData.getID());
            data.put(MessageKey.COST,Integer.toString(0));

            PlayerChatListenerStorage.addPlayer(CHANGE_REGION_NAME,player,data);
            player.closeInventory();

        });
        GuiItem _changeRegionDescription = ItemBuilder.from(changeRegionDescription).asGuiItem(event -> {
            player.sendMessage(ChatUtils.getTANString() + Lang.GUI_TOWN_SETTINGS_CHANGE_MESSAGE_IN_CHAT.get());
            player.sendMessage(getTANString() + Lang.WRITE_CANCEL_TO_CANCEL.get(Lang.CANCEL_WORD.get()));
            player.closeInventory();


            Map<MessageKey, String> data = new HashMap<>();
            data.put(MessageKey.REGION_ID,regionData.getID());
            PlayerChatListenerStorage.addPlayer(CHANGE_REGION_DESCRIPTION,player,data);
            event.setCancelled(true);
        });

        GuiItem _changeTownLeader = ItemBuilder.from(changeTownLeader).asGuiItem(event -> {

            event.setCancelled(true);
            OpenRegionDebugChangeOwnershipPlayerSelect(player, regionData,0);

        });

        GuiItem _deleteRegion = ItemBuilder.from(deleteRegion).asGuiItem(event -> {
            event.setCancelled(true);
            RegionDataStorage.deleteRegion(player, regionData);

            player.closeInventory();
            player.sendMessage(ChatUtils.getTANString() + Lang.CHAT_PLAYER_TOWN_SUCCESSFULLY_DELETED.get());
        });

        gui.setItem(2,2, _changeRegionName);
        gui.setItem(2,4, _changeRegionDescription);
        gui.setItem(2,6, _changeTownLeader);
        gui.setItem(2,8, _deleteRegion);

        gui.setItem(3,1, IGUI.CreateBackArrow(player,p -> OpenRegionDebugMenu(player, 0)));
        gui.open(player);
    }

    private static void OpenRegionDebugChangeOwnershipPlayerSelect(Player player, RegionData regionData, int page) {
        Gui gui = IGUI.createChestGui("Region", 6);
        PlayerData playerData = PlayerDataStorage.get(player);

        ArrayList<GuiItem> guiItems = new ArrayList<>();
        for(String playerID : regionData.getPlayerList()){

            PlayerData iteratePlayerData = PlayerDataStorage.get(playerID);
            ItemStack switchPlayerIcon = HeadUtils.getPlayerHead(Bukkit.getOfflinePlayer(UUID.fromString(playerID)));

            GuiItem _switchPlayer = ItemBuilder.from(switchPlayerIcon).asGuiItem(event -> {
                event.setCancelled(true);
                FileUtil.addLineToHistory(Lang.HISTORY_REGION_CAPITAL_CHANGED.get(player.getName(), regionData.getCapital().getName(), playerData.getTown().getName() ));
                regionData.setLeaderID(iteratePlayerData.getID());

                regionData.broadcastMessageWithSound(Lang.GUI_REGION_SETTINGS_REGION_CHANGE_LEADER_BROADCAST.get(iteratePlayerData.getName()),GOOD);

                if(!regionData.getCapital().getID().equals(iteratePlayerData.getTown().getID())){
                    regionData.broadcastMessage(Lang.GUI_REGION_SETTINGS_REGION_CHANGE_CAPITAL_BROADCAST.get(iteratePlayerData.getTown().getName()));
                    regionData.setCapital(iteratePlayerData.getTownId());
                }
                OpenSpecificRegionMenu(player, regionData);
            });
            guiItems.add(_switchPlayer);

        }

        GuiUtil.createIterator(gui,guiItems,page, player,
                p -> OpenSpecificRegionMenu(player, regionData),
                p -> OpenRegionDebugChangeOwnershipPlayerSelect(player, regionData,page + 1),
                p -> OpenRegionDebugChangeOwnershipPlayerSelect(player, regionData,page - 1));


        gui.open(player);

    }

    public static void OpenTownMenuDebug(Player player, int page){


        Gui gui = IGUI.createChestGui("Town - Admin",6);
        ArrayList<GuiItem> guiItems = new ArrayList<>();
        for (TownData townData : TownDataStorage.getTownMap().values()) {
            ItemStack townIcon = HeadUtils.getTownIconWithInformations(townData);
            HeadUtils.addLore(townIcon,
                    "",
                    Lang.ADMIN_GUI_LEFT_CLICK_TO_MANAGE_TOWN.get()
            );

            GuiItem _townIteration = ItemBuilder.from(townIcon).asGuiItem(event -> {
                event.setCancelled(true);
                OpenSpecificTownMenu(player, townData);
            });
            guiItems.add(_townIteration);
        }

        GuiUtil.createIterator(gui, guiItems, 0, player, p -> OpenMainMenu(player),
                p -> OpenTownMenuDebug(player, page + 1),
                p -> OpenTownMenuDebug(player, page - 1));


        ItemStack createTown = HeadUtils.makeSkull(Lang.ADMIN_GUI_CREATE_TOWN.get(),"eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNWZmMzE0MzFkNjQ1ODdmZjZlZjk4YzA2NzU4MTA2ODFmOGMxM2JmOTZmNTFkOWNiMDdlZDc4NTJiMmZmZDEifX19",
                Lang.ADMIN_GUI_CREATE_TOWN_DESC1.get());


        GuiItem _createTown = ItemBuilder.from(createTown).asGuiItem(event -> {
            event.setCancelled(true);
            player.sendMessage(ChatUtils.getTANString() + Lang.GUI_TOWN_SETTINGS_CHANGE_MESSAGE_IN_CHAT.get());
            player.sendMessage(getTANString() + Lang.WRITE_CANCEL_TO_CANCEL.get(Lang.CANCEL_WORD.get()));
            player.closeInventory();

            PlayerChatListenerStorage.addPlayer(ChatCategory.CREATE_ADMIN_TOWN,player);
        });


        gui.setItem(6,5 , _createTown);
        gui.open(player);



    }

    public static void OpenSpecificTownMenu(Player player, @NotNull TownData townData) {


        Gui gui = IGUI.createChestGui("Town - Admin",3);


        ItemStack changeTownName = HeadUtils.createCustomItemStack(Material.NAME_TAG,
                Lang.ADMIN_GUI_CHANGE_TOWN_NAME.get(),
                Lang.ADMIN_GUI_CHANGE_TOWN_NAME_DESC1.get(townData.getName()));
        ItemStack changeTownDescription = HeadUtils.createCustomItemStack(Material.WRITABLE_BOOK,
                Lang.ADMIN_GUI_CHANGE_TOWN_DESCRIPTION.get(),
                Lang.ADMIN_GUI_CHANGE_TOWN_DESCRIPTION_DESC1.get(townData.getDescription()));
        ItemStack changeTownLeader = HeadUtils.createCustomItemStack(Material.PLAYER_HEAD,
                Lang.ADMIN_GUI_CHANGE_TOWN_LEADER.get(),
                Lang.ADMIN_GUI_CHANGE_TOWN_LEADER_DESC1.get(townData.getLeaderName()));
        ItemStack deleteTown = HeadUtils.createCustomItemStack(Material.BARRIER,
                Lang.ADMIN_GUI_DELETE_TOWN.get(),
                Lang.ADMIN_GUI_DELETE_TOWN_DESC1.get(townData.getName()));

        GuiItem _changeTownName = ItemBuilder.from(changeTownName).asGuiItem(event -> {

            player.sendMessage(ChatUtils.getTANString() + Lang.GUI_TOWN_SETTINGS_CHANGE_MESSAGE_IN_CHAT.get());
            player.sendMessage(getTANString() + Lang.WRITE_CANCEL_TO_CANCEL.get(Lang.CANCEL_WORD.get()));
            player.closeInventory();

            Map<MessageKey, String> data = new HashMap<>();

            data.put(MessageKey.TOWN_ID,townData.getID());
            data.put(MessageKey.COST,Integer.toString(0));
            PlayerChatListenerStorage.addPlayer(CHANGE_TOWN_NAME,player,data);



        });
        GuiItem _changeTownDescription = ItemBuilder.from(changeTownDescription).asGuiItem(event -> {
            player.sendMessage(ChatUtils.getTANString() + Lang.GUI_TOWN_SETTINGS_CHANGE_MESSAGE_IN_CHAT.get());
            player.sendMessage(getTANString() + Lang.WRITE_CANCEL_TO_CANCEL.get(Lang.CANCEL_WORD.get()));
            player.closeInventory();

            Map<MessageKey, String> data = new HashMap<>();
            data.put(MessageKey.TOWN_ID,townData.getID());
            PlayerChatListenerStorage.addPlayer(CHANGE_TOWN_DESCRIPTION,player,data);

            event.setCancelled(true);
        });

        GuiItem _changeTownLeader = ItemBuilder.from(changeTownLeader).asGuiItem(event -> {
            event.setCancelled(true);
            OpenTownDebugChangeOwnershipPlayerSelect(player, townData);
        });
        GuiItem _deleteTown = ItemBuilder.from(deleteTown).asGuiItem(event -> {
            event.setCancelled(true);
            if(townData.isRegionalCapital()){
                player.sendMessage(getTANString() + Lang.ADMIN_GUI_CANT_DELETE_REGIONAL_CAPITAL.get());
                return;
            }
            deleteTown(player, townData);

            player.closeInventory();
            player.sendMessage(ChatUtils.getTANString() + Lang.CHAT_PLAYER_TOWN_SUCCESSFULLY_DELETED.get());
        });

        gui.setItem(2,2, _changeTownName);
        gui.setItem(2,4, _changeTownDescription);
        gui.setItem(2,6, _changeTownLeader);
        gui.setItem(2,8, _deleteTown);

        gui.setItem(3,1, IGUI.CreateBackArrow(player,p -> OpenTownMenuDebug(player, 0)));

        gui.open(player);
    }

    private static void OpenTownDebugChangeOwnershipPlayerSelect(Player player, TownData townData) {

        Gui gui = IGUI.createChestGui("Town",3);

        int i = 0;
        for (String playerUUID : townData.getPlayerList()){
            OfflinePlayer townPlayer = Bukkit.getServer().getOfflinePlayer(UUID.fromString(playerUUID));

            ItemStack playerHead = HeadUtils.getPlayerHead(townPlayer,
                    Lang.GUI_TOWN_SETTINGS_TRANSFER_OWNERSHIP_TO_SPECIFIC_PLAYER_DESC1.get(townPlayer.getName()),
                    Lang.GUI_TOWN_SETTINGS_TRANSFER_OWNERSHIP_TO_SPECIFIC_PLAYER_DESC2.get());

            GuiItem _playerHead = ItemBuilder.from(playerHead).asGuiItem(event -> {
                event.setCancelled(true);
                FileUtil.addLineToHistory(Lang.HISTORY_TOWN_LEADER_CHANGED.get(player.getName(),townData.getLeaderData(),townPlayer.getName()));
                townData.setLeaderID(townPlayer.getUniqueId().toString());
                player.sendMessage(getTANString() + Lang.GUI_TOWN_SETTINGS_TRANSFER_OWNERSHIP_TO_SPECIFIC_PLAYER_SUCCESS.get(townPlayer.getName()));
                OpenSpecificTownMenu(player, townData);
            });

            gui.setItem(i, _playerHead);

            i = i+1;
        }

        gui.setItem(3,1, IGUI.CreateBackArrow(player,p -> OpenSpecificTownMenu(player, townData)));
        gui.open(player);
    }

    public static void OpenPlayerMenu(Player player, int page) {

        Gui gui = IGUI.createChestGui("Player - Admin",6);

        ArrayList<GuiItem> guiItems = new ArrayList<>();
        for (PlayerData playerData : PlayerDataStorage.getLists()) {

            OfflinePlayer offlinePlayer = Bukkit.getOfflinePlayer(UUID.fromString(playerData.getID()));
            ItemStack playerHead = HeadUtils.getPlayerHeadInformation(offlinePlayer);

            GuiItem _playerHead = ItemBuilder.from(playerHead).asGuiItem(event -> {
                event.setCancelled(true);
                OpenSpecificPlayerMenu(player, playerData);
            });
            guiItems.add(_playerHead);
        }
        GuiUtil.createIterator(gui, guiItems, page, player, p -> OpenMainMenu(player),
                p -> OpenPlayerMenu(player, page + 1),
                p -> OpenPlayerMenu(player, page - 1));
        gui.open(player);
    }

    private static void OpenSpecificPlayerMenu(Player player, PlayerData playerData) {

        Gui gui = IGUI.createChestGui("Player - Admin",3);

        ItemStack playerHead = HeadUtils.getPlayerHeadInformation(Bukkit.getOfflinePlayer(UUID.fromString(playerData.getID())));

        if(playerData.haveTown()){
            ItemStack removePlayerTown = HeadUtils.createCustomItemStack(Material.SPRUCE_DOOR,
                    Lang.ADMIN_GUI_TOWN_PLAYER_TOWN.get(playerData.getTown().getName()),
                    Lang.ADMIN_GUI_TOWN_PLAYER_TOWN_DESC1.get(),
                    Lang.ADMIN_GUI_TOWN_PLAYER_TOWN_DESC2.get());


            GuiItem _removePlayerTown = ItemBuilder.from(removePlayerTown).asGuiItem(event -> {
                event.setCancelled(true);
                TownData townData = playerData.getTown();

                if(playerData.isTownLeader()){
                    player.sendMessage(getTANString() + Lang.GUI_TOWN_MEMBER_CANT_KICK_LEADER.get());
                    return;
                }
                townData.removePlayer(playerData);

                player.sendMessage(getTANString() + Lang.ADMIN_GUI_TOWN_PLAYER_LEAVE_TOWN_SUCCESS.get(playerData.getName(),townData.getName()));
                OpenSpecificPlayerMenu(player, playerData);
            });
            gui.setItem(2,2, _removePlayerTown);
        }
        else{
            ItemStack addPlayerTown = HeadUtils.createCustomItemStack(Material.SPRUCE_DOOR, "Add player to town", "Add player to town");

            GuiItem _addPlayerTown = ItemBuilder.from(addPlayerTown).asGuiItem(event -> {
                event.setCancelled(true);
                SetPlayerTown(player, playerData, 0);
            });
            gui.setItem(2,2, _addPlayerTown);
        }


        GuiItem _playerHead = ItemBuilder.from(playerHead).asGuiItem(event -> {
            event.setCancelled(true);
        });

        gui.setItem(1,5, _playerHead);
        gui.setItem(3,1, IGUI.CreateBackArrow(player,p -> OpenPlayerMenu(player,0)));

        gui.open(player);
    }

    private static void SetPlayerTown(Player player, PlayerData playerData, int page) {

        Gui gui = IGUI.createChestGui("Town - Admin", 6);

        ArrayList<GuiItem> guiItems = new ArrayList<>();


        for (TownData townData : TownDataStorage.getTownMap().values()) {
            ItemStack townIcon = HeadUtils.getTownIconWithInformations(townData);
            HeadUtils.addLore(townIcon,
                    "",
                    Lang.ADMIN_GUI_LEFT_CLICK_TO_MANAGE_TOWN.get()
            );
            GuiItem _townIteration = ItemBuilder.from(townIcon).asGuiItem(event -> {
                event.setCancelled(true);
                townData.addPlayer(playerData);
                OpenSpecificPlayerMenu(player, playerData);
            });
            guiItems.add(_townIteration);
        }

        GuiUtil.createIterator(gui, guiItems, page, player,
                p -> OpenSpecificPlayerMenu(player, playerData),
                p -> SetPlayerTown(player, playerData, page + 1),
                p -> SetPlayerTown(player, playerData, page - 1)
        );
        gui.open(player);

    }
}
