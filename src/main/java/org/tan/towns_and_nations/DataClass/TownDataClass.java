package org.tan.towns_and_nations.DataClass;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.tan.towns_and_nations.storage.TownDataStorage;

import java.util.*;
import java.util.ArrayList;
import java.util.Date;

public class TownDataClass {

    private String TownId;
    private String TownName;
    private String UuidLeader;
    private String Description;
    public boolean open;
    public String DateCreated;
    private String Overlord;
    private String townIconMaterialCode;
    private final ArrayList<String> townPlayerListId = new ArrayList<String>();
    private TownRelationClass relations;
    private ClaimedChunkSettings chunkSettings;


    public TownDataClass( String townId, String townName, String uuidLeader){
        this.TownId = townId;
        this.UuidLeader = uuidLeader;
        this.TownName = townName;
        this.Description = "Description";
        this.open = false;
        this.DateCreated = new Date().toString();
        this.Overlord = Bukkit.getPlayer(UUID.fromString(uuidLeader)).toString();
        this.townIconMaterialCode = null;

        this.townPlayerListId.add(uuidLeader);

        this.relations = new TownRelationClass();
        this.chunkSettings = new ClaimedChunkSettings();
    }

    public String getTownId() {
        return this.TownId;
    }

    public void setTownId(String townId) {
        this.TownId = townId;
    }

    public void setTownName(String townName) {
        this.TownName = townName;
    }

    public String getTownName(){
        return this.TownName;
    }

    public String getUuidLeader() {
        return this.UuidLeader;
    }

    public void setUuidLeader(String uuidLeader) {
        this.UuidLeader = uuidLeader;
    }

    public String getDescription() {
        return this.Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public boolean isOpen() {
        return this.open;
    }

    public void setOpen(boolean openValue) {
        this.open = openValue;
    }

    public String getDateCreated() {
        return this.DateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.DateCreated = dateCreated;
    }

    public String getOverlord() {
        return this.Overlord;
    }

    public void setOverlord(String overlord) {
        this.Overlord = overlord;
    }

    public ItemStack getTownIconItemStack() {
        if(this.townIconMaterialCode == null){
            return null;
        }
        else
            return new ItemStack(Material.getMaterial(this.townIconMaterialCode));

    }
    public boolean isPlayerIn(Player player){
        String uuid = player.getUniqueId().toString();
        for (String townPlayerUUID : this.townPlayerListId) {
            if(uuid.equals(townPlayerUUID)){
                return true;
            }
        }
        return false;
    }

    public void setTownIconMaterialCode(Material material) {
        this.townIconMaterialCode = material.name();
    }

    public void addPlayer(String playerUUID){
        townPlayerListId.add(playerUUID);
        TownDataStorage.saveStats();
    }

    public void removePlayer(String playerUUID){
        townPlayerListId.remove(playerUUID);
        TownDataStorage.saveStats();
    }

    public ArrayList<String> getPlayerList(){
        return townPlayerListId;
    }

    public TownRelationClass getRelations(){
        return relations;
    }

    public void addTownRelations(String relation,String townId){
        this.relations.addRelation(relation,townId);
    }
    public void removeTownRelations(String relation, String townId) {
        this.relations.removeRelation(relation,townId);
    }
}
