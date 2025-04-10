package org.leralix.tan.storage.stored;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.bukkit.Location;
import org.leralix.lib.position.Vector3D;
import org.leralix.tan.dataclass.Landmark;
import org.leralix.tan.TownsAndNations;

import java.io.*;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class LandmarkStorage {

    private Map<String, Landmark> landMarkMap;
    private int newLandmarkID;


    private static LandmarkStorage instance;

    private LandmarkStorage() {
        landMarkMap = new HashMap<>();
        newLandmarkID = 1;
        load();
    }

    public static LandmarkStorage getInstance(){
        if(instance == null) {
            instance = new LandmarkStorage();
        }
        return instance;
    }

    public static void setInstance(LandmarkStorage mockLandmarkStorage) {
        instance = mockLandmarkStorage;
    }

    public Landmark get(String landmarkID){
        return landMarkMap.get(landmarkID);
    }

    public Landmark addLandmark(Location position){
        Vector3D vector3D = new Vector3D(position);
        String landmarkID = "L" + newLandmarkID;
        Landmark landmark = new Landmark(landmarkID,vector3D);
        landMarkMap.put(landmarkID, landmark);
        newLandmarkID++;
        NewClaimedChunkStorage.getInstance().claimLandmarkChunk(position.getChunk(), landmarkID);
        save();
        return landmark;
    }

    public boolean vectorAlreadyFilled(Vector3D vector3D){
        for(Landmark landmark : getAll()){
            if(landmark.getPosition().equals(vector3D))
                return true;
        }
        return false;
    }

    public Collection<Landmark> getAll(){
        return landMarkMap.values();
    }

    public void generateAllResources(){
        for (Landmark landmark : getAll()) {
            landmark.generateResources();
        }
    }

    public void load(){

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        File file = new File(TownsAndNations.getPlugin().getDataFolder().getAbsolutePath() + "/TAN - Landmarks.json");
        if (file.exists()){
            Reader reader;
            try {
                reader = new FileReader(file);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            Type type = new TypeToken<HashMap<String, Landmark>>() {}.getType();
            landMarkMap = gson.fromJson(reader, type);

            int ID = 0;
            for (String ids: landMarkMap.keySet()) {
                int newID =  Integer.parseInt(ids.substring(1));
                if(newID > ID)
                    ID = newID;
            }
            newLandmarkID = ID+1;
        }
    }

    public void save() {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        File file = new File(TownsAndNations.getPlugin().getDataFolder().getAbsolutePath() + "/TAN - Landmarks.json");
        file.getParentFile().mkdir();

        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Writer writer;
        try {
            writer = new FileWriter(file, false);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        gson.toJson(landMarkMap, writer);
        try {
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public Map<String, Landmark> getLandMarkMap() {
        return landMarkMap;
    }

}
