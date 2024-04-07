package org.tan.TownsAndNations.storage.Invitation;

import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TownInviteDataStorage {

    private static final Map<String, ArrayList<String>> townInviteList = new HashMap<>();

    public static void addInvitation(String playerUUID, String townId){
        if(townInviteList.get(playerUUID) == null){
            ArrayList<String> list = new ArrayList<>();
            list.add(townId);
            townInviteList.put(playerUUID, list);
        }
        else{
            townInviteList.get(playerUUID).add(townId);
        }
    }


    public static void removeInvitation(String playerUUID,String townId){
        if(townInviteList.containsKey(playerUUID)){
            townInviteList.get(playerUUID).remove(townId);
        }
    }
    public static void removeInvitation(Player player, String townId){
        removeInvitation(player.getUniqueId().toString(),townId);
    }

    public static boolean isInvited(String playerUUID,String townID){
        return townInviteList.get(playerUUID).contains(townID);
    }

}
