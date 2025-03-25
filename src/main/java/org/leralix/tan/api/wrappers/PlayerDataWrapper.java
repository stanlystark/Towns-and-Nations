package org.leralix.tan.api.wrappers;

import org.leralix.tan.dataclass.PlayerData;
import org.leralix.tan.dataclass.PropertyData;
import org.leralix.tan.dataclass.territory.TownData;
import org.leralix.tan.storage.stored.TownDataStorage;
import org.tan.api.interfaces.TanPlayer;
import org.tan.api.interfaces.TanProperty;
import org.tan.api.interfaces.TanRegion;
import org.tan.api.interfaces.TanTown;

import java.util.*;

public class PlayerDataWrapper implements TanPlayer {

    private final PlayerData playerData;

    private PlayerDataWrapper(PlayerData playerData){
        this.playerData = playerData;
    }

    public static TanPlayer of(PlayerData playerData) {
        if(playerData == null){
            return null;
        }
        return new PlayerDataWrapper(playerData);
    }

    @Override
    public String getNameStored() {
        return playerData.getNameStored();
    }

    @Override
    public void setNameStored(String s) {
        playerData.setNameStored(s);
    }

    @Override
    public UUID getUUID() {
        return playerData.getUUID();
    }

    @Override
    public boolean hasTown() {
        return playerData.hasTown();
    }

    @Override
    public Optional<TanTown> getTown() {
        return Optional.ofNullable(TownDataWrapper.of(playerData.getTown()));
    }

    @Override
    public boolean hasRegion() {
        return playerData.hasRegion();
    }

    @Override
    public TanRegion getRegion() {
        return RegionDataWrapper.of(playerData.getRegion());
    }

    @Override
    public Collection<TanProperty> getPropertiesOwned() {
        return playerData.getProperties().stream()
                .map(PropertyDataWrapper::of)
                .map(p -> (TanProperty) p)
                .toList();
    }

    @Override
    public Collection<TanProperty> getPropertiesRented() {
        List<TanProperty> properties = new ArrayList<>();

        for(TownData town : TownDataStorage.getInstance().getAll()){
            for(PropertyData property : town.getProperties()){
                PlayerData renter = property.getRenter();
                if(renter == null){
                    continue;
                }
                if(getUUID().equals(renter.getUUID())){
                    properties.add(PropertyDataWrapper.of(property));
                }
            }
        }
        return properties;
    }

    @Override
    public Collection<TanProperty> getPropertiesForSale() {
        List<TanProperty> properties = new ArrayList<>();
        for(TownData town : TownDataStorage.getInstance().getAll()){
            for(PropertyData property : town.getProperties()){
                PlayerData owner = property.getOwner();
                if(getUUID().equals(owner.getUUID()) && property.isForSale()){
                    properties.add(PropertyDataWrapper.of(property));
                }
            }
        }
        return properties;
    }
}
