package org.leralix.tan.dataclass.chunk;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.chat.hover.content.Text;
import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.leralix.tan.dataclass.PlayerData;
import org.leralix.tan.dataclass.territory.TerritoryData;
import org.leralix.tan.lang.Lang;
import org.leralix.tan.enums.ChunkPermissionType;
import org.leralix.tan.utils.config.ConfigTag;
import org.leralix.tan.utils.config.ConfigUtil;

public class WildernessChunk extends ClaimedChunk2 {


    public WildernessChunk(Chunk chunk) {
        super(chunk, "wilderness");
    }

    @Override
    public boolean canPlayerDo(Player player, ChunkPermissionType permissionType, Location location) {
        if(ConfigUtil.getCustomConfig(ConfigTag.MAIN).getBoolean("wildernessRules." + permissionType,true))
            return true;
        else {
            player.sendMessage(Lang.WILDERNESS_NO_PERMISSION.get());
            return false;
        }
    }

    @Override
    public void unclaimChunk(Player player) {
        //No need to unclaim wilderness chunks
    }

    @Override
    public void playerEnterClaimedArea(Player player) {
        //No need to notify player entered a wilderness chunk
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public boolean canEntitySpawn(EntityType entityType) {
        return true;
    }

    @Override
    public TextComponent getMapIcon(PlayerData playerData) {
        TextComponent textComponent = new TextComponent("⬜");
        textComponent.setColor(ChatColor.WHITE);
        textComponent.setHoverEvent(new HoverEvent(
            HoverEvent.Action.SHOW_TEXT,
            new Text("x : " + super.getX() + " z : " + super.getZ() + "\n" +
                    Lang.WILDERNESS.get() + "\n" +
                    Lang.LEFT_CLICK_TO_CLAIM.get())));
        return textComponent;
    }

    @Override
    public boolean canPlayerClaim(Player player, TerritoryData townData) {
        return true;
    }

    @Override
    public boolean isClaimed() {
        return false;
    }

    @Override
    public boolean canBeOverClaimed(TerritoryData territoryData) {
        return false;
    }

    @Override
    public boolean canExplosionGrief() {
        return true;
    }
}
