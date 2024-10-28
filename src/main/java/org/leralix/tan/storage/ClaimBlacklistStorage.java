package org.leralix.tan.storage;

import org.bukkit.Chunk;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.leralix.tan.utils.config.ConfigTag;
import org.leralix.tan.utils.config.ConfigUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ClaimBlacklistStorage {

    private static List<BlacklistInstance> blacklist;

    public static void init() {
        blacklist = new ArrayList<>();
        FileConfiguration config = ConfigUtil.getCustomConfig(ConfigTag.MAIN);
        for (Object item : config.getList("claimBlacklist")) {
            if (item instanceof Map<?, ?> map) {
                String name = (String) map.get("name");
                List<Integer> coordinates = (List<Integer>) map.get("coordinate");
                if (name != null && coordinates != null && coordinates.size() == 4) {
                    blacklist.add(new BlacklistInstance(name, coordinates));
                }
            }
        }
        System.out.println("ClaimBlacklistStorage initialized with " + blacklist.size() + " blacklisted areas.");
    }

    public static boolean cannotBeClaimed(Chunk chunk) {
        for(BlacklistInstance instance : blacklist) {
            if(instance.isChunkInArea(chunk)) {
                return true;
            }
        }
        return false;
    }

}
