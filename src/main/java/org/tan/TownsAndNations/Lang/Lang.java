package org.tan.TownsAndNations.Lang;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.YamlConfiguration;
import org.tan.TownsAndNations.TownsAndNations;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public enum Lang {
    WELCOME,
    LANGUAGE_SUCCESSFULLY_LOADED,
    PLUGIN_STRING,
    PLAYER_NO_TOWN,
    PLAYER_NO_PERMISSION,
    BASIC_LEVEL_UP,
    CHUNK_BELONGS_TO,
    NOT_ENOUGH_ARGS_ERROR,
    TOO_MANY_ARGS_ERROR,
    SYNTAX_ERROR,
    SYNTAX_ERROR_AMOUNT,
    CORRECT_SYNTAX_INFO,
    TOWN_CREATE_SUCCESS_BROADCAST,
    CLAIM_CHUNK_COMMAND_DESC,
    CHUNK_ALREADY_CLAIMED_WARNING,
    MAX_CHUNK_LIMIT_REACHED,
    CHUNK_NOT_ADJACENT,
    CHUNK_CLAIMED_SUCCESS,
    CUSTOM_VILLAGER_CREATED_SUCCESS,
    TOWN_INVITE_COMMAND_DESC,
    PLAYER_NOT_FOUND,
    INVITATION_SENT_SUCCESS,
    INVITATION_RECEIVED_1,
    INVITATION_RECEIVED_2,
    TOWN_ACCEPT_INVITE_DESC,
    TOWN_INVITATION_NO_INVITATION,
    GUI_TOWN_MEMBERS_ROLE_MEMBER_LIST_INFO,
    GUI_TOWN_MEMBERS_ROLE_MEMBER_LIST_INFO_DESC,
    GUI_TOWN_MEMBERS_ROLE_MEMBER_LIST_INFO_DESC1,
    GUI_TOWN_MEMBERS_ROLE_MANAGE_PERMISSION,
    GUI_TOWN_MEMBERS_ROLE_CHANGE_NAME,
    GUI_TOWN_MEMBERS_ROLE_PAY_TAXES,
    GUI_TOWN_MEMBERS_ROLE_NOT_PAY_TAXES,
    GUI_TOWN_MEMBERS_ROLE_TAXES_DESC1,
    TOWN_INVITATION_ACCEPTED_MEMBER_SIDE,
    TOWN_INVITATION_ACCEPTED_TOWN_SIDE,
    TOWN_DIPLOMATIC_INVITATION_RECEIVED_1,
    TOWN_DIPLOMATIC_INVITATION_RECEIVED_2,
    TOWN_ACCEPT_RELATION_DESC,
    TOWN_RELATION_NO_INVITATION,
    TOWN_RELATION_ACCEPTED_MEMBER_SIDE,
    TOWN_RELATION_ACCEPTED_TOWN_SIDE,
    ADD_MONEY_COMMAND_SUCCESS,
    TOWN_GUI_COMMAND_DESC,
    PAY_COMMAND_DESC,
    PAY_INVALID_SYNTAX,
    PAY_MINIMUM_REQUIRED,
    PAY_CONFIRMED_SENDER,
    PAY_CONFIRMED_RECEIVER,
    BAL_COMMAND_DESC,
    BAL_AMOUNT,
    UNCLAIM_CHUNK_COMMAND_DESC,
    UNCLAIMED_CHUNK_SUCCESS,
    UNCLAIMED_CHUNK_NOT_RIGHT_TOWN,
    UNKNOWN_DEBUG_COMMAND,
    TOWN_LIST_DEBUG,
    TOWN_NEXT_KEY_MESSAGE,
    COMMAND_GENERIC_SUCCESS,
    PLAYER_NOT_ENOUGH_MONEY,
    PLAYER_NOT_ENOUGH_MONEY_EXTENDED,
    PLAYER_NEED_1_OR_ABOVE,
    TOWN_NOT_ENOUGH_MONEY,
    TOWN_NOT_ENOUGH_MONEY_EXTENDED,
    PLAYER_WRITE_TOWN_NAME_IN_CHAT,
    PLAYER_SEND_MONEY_TO_TOWN,
    NPC_GOLDSMITH,
    GUI_WARNING_STILL_IN_DEV,
    GUI_BACK_ARROW,
    GUI_QUIT_ARROW,
    GUI_NEXT_PAGE,
    GUI_PREVIOUS_PAGE,
    GUI_LEFT_CLICK_TO_INTERACT,
    GUI_KINGDOM_ICON,
    GUI_KINGDOM_ICON_DESC1,
    GUI_REGION_ICON,
    GUI_REGION_ICON_DESC1,
    GUI_TOWN_ICON,
    GUI_KINGDOM_ICON_DESC1_NO_TOWN,
    GUI_KINGDOM_ICON_DESC1_HAVE_TOWN,
    GUI_PROFILE_ICON,
    GUI_PROFILE_ICON_DESC1,
    GUI_PLAYER_PROFILE,
    GUI_PLAYER_PROFILE_DESC1,
    GUI_PLAYER_PROFILE_DESC2,
    GUI_PLAYER_PROFILE_DESC3,
    GUI_PLAYER_PROFILE_NO_TOWN,
    GUI_YOUR_PROFILE,
    GUI_YOUR_BALANCE,
    GUI_YOUR_BALANCE_DESC1,
    GUI_YOUR_PVE_KILLS,
    GUI_YOUR_PVE_KILLS_DESC1,
    GUI_YOUR_CURRENT_TIME_ALIVE,
    GUI_YOUR_CURRENT_TIME_ALIVE_DESC1,
    GUI_YOUR_CURRENT_MURDER,
    GUI_YOUR_CURRENT_MURDER_DESC1,
    GUI_NO_TOWN_CREATE_NEW_TOWN,
    GUI_NO_TOWN_CREATE_NEW_TOWN_DESC1,
    GUI_NO_TOWN_JOIN_A_TOWN,
    GUI_NO_TOWN_JOIN_A_TOWN_DESC1,
    GUI_TOWN_INFO_DESC1,
    GUI_TOWN_INFO_DESC2,
    GUI_TOWN_INFO_DESC3,
    GUI_TOWN_INFO_DESC4,
    GUI_TOWN_TREASURY_ICON,
    GUI_TOWN_TREASURY_ICON_DESC1,
    GUI_TOWN_MEMBERS_ICON,
    GUI_TOWN_MEMBERS_ICON_DESC1,
    GUI_CLAIM_ICON,
    GUI_CLAIM_ICON_DESC1,
    GUI_OTHER_TOWN_ICON,
    GUI_OTHER_TOWN_ICON_DESC1,
    GUI_RELATION_ICON,
    GUI_RELATION_ICON_DESC1,
    GUI_TOWN_LEVEL_ICON,
    GUI_TOWN_LEVEL_ICON_DESC1,
    GUI_TOWN_SETTINGS_ICON,
    GUI_TOWN_SETTINGS_ICON_DESC1,
    GUI_TREASURY_STORAGE,
    GUI_TREASURY_STORAGE_DESC1,
    GUI_TREASURY_STORAGE_DESC2,
    GUI_TREASURY_SPENDING,
    GUI_TREASURY_SPENDING_DESC1,
    GUI_TREASURY_SPENDING_DESC2,
    GUI_TREASURY_SPENDING_DESC3,
    GUI_TREASURY_LOWER_TAX,
    GUI_TREASURY_LOWER_TAX_DESC1,
    GUI_TREASURY_CANT_TAX_LESS,
    GUI_TREASURY_INCREASE_TAX,
    GUI_TREASURY_INCREASE_TAX_DESC1,
    GUI_TREASURY_FLAT_TAX,
    GUI_TREASURY_FLAT_TAX_DESC1,
    GUI_TREASURY_TAX_HISTORY,
    GUI_TREASURY_SALARY_HISTORY,
    GUI_TREASURY_SALARY_HISTORY_DESC1,
    GUI_TREASURY_CHUNK_SPENDING_HISTORY,
    GUI_TREASURY_CHUNK_SPENDING_HISTORY_DESC1,
    GUI_TREASURY_CHUNK_SPENDING_HISTORY_DESC2,
    GUI_TREASURY_CHUNK_SPENDING_HISTORY_DESC3,
    GUI_TREASURY_MISCELLANEOUS_SPENDING,
    GUI_TREASURY_MISCELLANEOUS_SPENDING_DESC1,
    GUI_TREASURY_DONATION,
    WRITE_IN_CHAT_AMOUNT_OF_MONEY_FOR_TOWN_DONATION,
    GUI_TREASURY_DONATION_DESC1,
    GUI_TREASURY_DONATION_HISTORY,
    GUI_TOWN_LEVEL_INFO,
    GUI_TOWN_LEVEL_UP,
    GUI_TOWN_LEVEL_UP_DESC1,
    GUI_TOWN_LEVEL_UP_DESC2,
    GUI_TOWN_LEVEL_UP_DESC3,
    GUI_TOWN_LEVEL_UP_DESC4,
    GUI_TOWN_LEVEL_UP_CHUNK_CAP,
    GUI_TOWN_LEVEL_UP_CHUNK_CAP_DESC1,
    GUI_TOWN_LEVEL_UP_CHUNK_CAP_DESC2,
    GUI_TOWN_LEVEL_UP_CHUNK_CAP_DESC3,
    GUI_TOWN_LEVEL_UP_CHUNK_CAP_DESC4,
    GUI_TOWN_LEVEL_UP_PLAYER_CAP,
    GUI_TOWN_LEVEL_UP_PLAYER_CAP_DESC1,
    GUI_TOWN_LEVEL_UP_PLAYER_CAP_DESC2,
    GUI_TOWN_LEVEL_UP_PLAYER_CAP_DESC3,
    GUI_TOWN_LEVEL_UP_PLAYER_CAP_DESC4,
    GUI_TOWN_SETTINGS_LEAVE_TOWN,
    GUI_TOWN_SETTINGS_LEAVE_TOWN_DESC1,
    GUI_TOWN_SETTINGS_LEAVE_TOWN_DESC2,
    GUI_TOWN_SETTINGS_DELETE_TOWN,
    GUI_TOWN_SETTINGS_DELETE_TOWN_DESC1,
    GUI_TOWN_SETTINGS_DELETE_TOWN_DESC2,
    GUI_TOWN_SETTINGS_TRANSFER_OWNERSHIP,
    GUI_TOWN_SETTINGS_TRANSFER_OWNERSHIP_DESC1,
    GUI_TOWN_SETTINGS_TRANSFER_OWNERSHIP_DESC2,
    GUI_TOWN_RELATION_WAR,
    GUI_TOWN_RELATION_WAR_DESC1,
    GUI_TOWN_RELATION_EMBARGO,
    GUI_TOWN_RELATION_EMBARGO_DESC1,
    GUI_TOWN_RELATION_NAP,
    GUI_TOWN_RELATION_NAP_DESC1,
    GUI_TOWN_RELATION_ALLIANCE,
    GUI_TOWN_RELATION_ALLIANCE_DESC1,
    GUI_TOWN_RELATION_ADD_TOWN,
    GUI_TOWN_RELATION_REMOVE_TOWN,
    GUI_TOWN_CHANGED_RELATION_RESUME,
    GUI_TOWN_INFO_DESC_1,
    GUI_TOWN_INFO_DESC_2,
    GUI_TOWN_INFO_DESC_3,
    GUI_TOWN_INFO_TOWN_RELATION,
    GUI_TOWN_RELATION_NEUTRAL,
    GUI_TOWN_CLAIM_SETTINGS_DOOR,
    GUI_TOWN_CLAIM_SETTINGS_DOOR_DESC1,
    GUI_TOWN_CLAIM_SETTINGS_CHEST,
    GUI_TOWN_CLAIM_SETTINGS_CHEST_DESC1,
    GUI_TOWN_CLAIM_SETTINGS_BUILD,
    GUI_TOWN_CLAIM_SETTINGS_BUILD_DESC1,
    GUI_TOWN_CLAIM_SETTINGS_BREAK,
    GUI_TOWN_CLAIM_SETTINGS_BREAK_DESC1,
    CHAT_CANT_LEAVE_TOWN_IF_LEADER,
    CHAT_CANT_DISBAND_TOWN_IF_NOT_LEADER,
    CHAT_PLAYER_LEFT_THE_TOWN,
    CHAT_PLAYER_TOWN_SUCCESSFULLY_DELETED,
    GUI_TOWN_MEMBER_DESC1,
    GUI_TOWN_MEMBER_DESC2,
    GUI_TOWN_MEMBER_DESC3,
    GUI_TOWN_MEMBERS_MANAGE_ROLES,
    GUI_TOWN_MEMBERS_ADD_NEW_ROLES,
    GUI_TOWN_MEMBERS_ADD_NEW_ROLES_DESC1,
    GUI_TOWN_MEMBERS_ROLE_NAME,
    GUI_TOWN_MEMBERS_ROLE_NAME_DESC1,
    GUI_TOWN_MEMBER_CANT_KICK_LEADER,
    GUI_TOWN_MEMBER_CANT_KICK_YOURSELF,
    GUI_TOWN_MEMBER_KICKED_SUCCESS,
    GUI_TOWN_MEMBER_KICKED_SUCCESS_PLAYER,
    INVITATION_ERROR_PLAYER_ALREADY_IN_TOWN,
    INVITATION_ERROR_PLAYER_ALREADY_HAVE_TOWN,
    INVITATION_ERROR_PLAYER_TOWN_FULL,
    GUI_TOWN_MEMBERS_ROLE_NO_ITEM_SHOWED,
    GUI_TOWN_MEMBERS_ROLE_CHANGED_ICON_SUCCESS,
    GUI_TOWN_MEMBERS_CHANGE_ROLE_PRIORITY,
    GUI_TOWN_MEMBERS_CHANGE_ROLE_PRIORITY_DESC1,
    GUI_TOWN_MEMBERS_ROLE_PRIORITY_1,
    GUI_TOWN_MEMBERS_ROLE_PRIORITY_2,
    GUI_TOWN_MEMBERS_ROLE_PRIORITY_3,
    GUI_TOWN_MEMBERS_ROLE_PRIORITY_4,
    GUI_TOWN_MEMBERS_ROLE_PRIORITY_5,
    GUI_TOWN_MEMBERS_ROLE_PRIORITY_DESC1,
    GUI_TOWN_MEMBERS_ROLE_PRIORITY_DESC2,
    GUI_TOWN_MEMBERS_ROLE_SET_DEFAULT_IS_DEFAULT,
    GUI_TOWN_MEMBERS_ROLE_SET_DEFAULT_IS_NOT_DEFAULT,
    GUI_TOWN_MEMBERS_ROLE_SET_DEFAULT1,
    GUI_TOWN_MEMBERS_ROLE_SET_DEFAULT2,
    GUI_TOWN_MEMBERS_ROLE_SET_DEFAULT_ALREADY_DEFAULT,
    GUI_TOWN_MEMBERS_ROLE_DELETE,
    GUI_TOWN_MEMBERS_ROLE_DELETE_ERROR_NOT_EMPTY,
    WRITE_IN_CHAT_NEW_ROLE_NAME,
    NOT_TOWN_LEADER_ERROR,
    GUI_TOWN_SETTINGS_TRANSFER_OWNERSHIP_TO_SPECIFIC_PLAYER_DESC1,
    GUI_TOWN_SETTINGS_TRANSFER_OWNERSHIP_TO_SPECIFIC_PLAYER_DESC2,
    GUI_TOWN_SETTINGS_TRANSFER_OWNERSHIP_TO_SPECIFIC_PLAYER_SUCCESS,
    TRANSACTION_HISTORY,
    TOWN_RANK_CAP_REACHED,
    GUI_TOWN_MEMBERS_ROLE_PRIORITY_MANAGE_TAXES,
    GUI_TOWN_MEMBERS_ROLE_PRIORITY_PROMOTE_RANK_PLAYER,
    GUI_TOWN_MEMBERS_ROLE_PRIORITY_DERANK_RANK_PLAYER,
    GUI_TOWN_MEMBERS_ROLE_PRIORITY_CLAIM_CHUNK,
    GUI_TOWN_MEMBERS_ROLE_PRIORITY_UNCLAIM_CHUNK,
    GUI_TOWN_MEMBERS_ROLE_PRIORITY_UPGRADE_TOWN,
    GUI_TOWN_MEMBERS_ROLE_PRIORITY_INVITE_PLAYER,
    GUI_TOWN_MEMBERS_ROLE_PRIORITY_KICK_PLAYER,
    GUI_TOWN_MEMBERS_ROLE_PRIORITY_CREATE_RANK,
    GUI_TOWN_MEMBERS_ROLE_PRIORITY_DELETE_RANK,
    GUI_TOWN_MEMBERS_ROLE_PRIORITY_MODIFY_RANK,
    GUI_TOWN_MEMBERS_ROLE_PRIORITY_MANAGE_CLAIM_SETTINGS,
    GUI_TOWN_MEMBERS_ROLE_PRIORITY_MANAGE_TOWN_RELATION,
    GUI_TOWN_MEMBERS_ROLE_HAS_PERMISSION,
    GUI_TOWN_MEMBERS_ROLE_NO_PERMISSION,
    TOWN_BROADCAST_PLAYER_LEAVE_THE_TOWN,
    ITEM_RARE_STONE,
    ITEM_RARE_WOOD,
    ITEM_RARE_CROP,
    RARE_ITEM_DESC_1,
    VILLAGER_GOLDSMITH,
    VILLAGER_BOTANIST,
    VILLAGER_COOK,
    RARE_ITEM_NO_ITEM_IN_HANDS,
    RARE_ITEM_WRONG_ITEM,
    RARE_ITEM_SELLING_SUCCESS,
    DAILY_TAXES_SUCCESS_LOG,
    CHUNK_ENTER_WILDERNESS,
    CHUNK_ENTER_TOWN,
    CHUNK_ENTER_TOWN_AT_WAR,
    CHUNK_INTRUSION_ALERT;


    private static final Map<Lang, String> translations = new HashMap<>();

    public static void loadTranslations(String filename) {

        File langFolder = new File(TownsAndNations.getPlugin().getDataFolder(), "lang");

        if (!langFolder.exists()) {
            langFolder.mkdir();
        }

        File file = new File(langFolder, filename);

        TownsAndNations.getPlugin().saveResource("lang/" + filename, false);


        YamlConfiguration config = YamlConfiguration.loadConfiguration(file);


        for (Lang key : Lang.values()) {

            String message = config.getString("language." + key.name());
            if (message != null) {
                translations.put(key, message);
            }
        }
        TownsAndNations.getPluginLogger().info(LANGUAGE_SUCCESSFULLY_LOADED.getTranslation());


    }

    public String getTranslation() {
        String translation = translations.get(this);
        if (translation != null) {
            return ChatColor.translateAlternateColorCodes('§', translation);
        }
        return null;
    }

    public String getTranslation(Object... placeholders) {
        String translation = translations.get(this);
        if (translation != null) {
            translation = ChatColor.translateAlternateColorCodes('§', translation);
            for (int i = 0; i < placeholders.length; i++) {
                translation = translation.replace("{" + i + "}", placeholders[i].toString());
            }
        }
        return translation;
    }


}