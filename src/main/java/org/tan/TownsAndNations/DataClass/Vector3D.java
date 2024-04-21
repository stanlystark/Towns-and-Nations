package org.tan.TownsAndNations.DataClass;

import java.util.UUID;

public class Vector3D {
    private int x;
    private int y;
    private int z;
    private String worldID;

    public Vector3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D(int x, int y, int z, String worldID) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.worldID = worldID;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    public UUID getWorldID(){
        return UUID.fromString(worldID);
    }
    @Override
    public String toString(){
        return "[" + this.x + ", " + this.y + ", " + this.z + "]";
    }
}
