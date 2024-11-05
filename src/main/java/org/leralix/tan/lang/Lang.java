package org.leralix.tan.lang;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.YamlConfiguration;
import org.leralix.tan.TownsAndNations;
import org.leralix.tan.utils.config.ConfigTag;
import org.leralix.tan.utils.config.ConfigUtil;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public enum Lang {
    WELCOME,
    LANGUAGE_SUCCESSFULLY_LOADED,
    PLUGIN_STRING,
    PLUGIN_DEBUG_STRING,
    NEWSLETTER_STRING,
    PLAYER_NO_TOWN,
    TOWN_NO_REGION,
    PLAYER_NOT_LEADER_OF_REGION,
    PLAYER_NO_PERMISSION,
    PLAYER_NO_PERMISSION_RANK_DIFFERENCE,
    PLAYER_ACTION_NO_PERMISSION,
    BASIC_LEVEL_UP,
    WAIT_BEFORE_ANOTHER_TELEPORTATION,
    TELEPORTATION_CANCELLED,
    TELEPORTATION_IN_X_SECONDS,
    TELEPORTATION_IN_X_SECONDS_NOT_MOVE,
    CHUNK_BELONGS_TO,
    NOT_ENOUGH_ARGS_ERROR,
    TOO_MANY_ARGS_ERROR,
    SYNTAX_ERROR,
    SYNTAX_ERROR_AMOUNT,
    CORRECT_SYNTAX_INFO,
    MESSAGE_TOO_LONG,
    ECONOMY_EXISTS,
    CANCELLED_ACTION,
    CANCEL_WORD,
    WRITE_CANCEL_TO_CANCEL,
    PLAYER_ASK_TO_JOIN_TOWN,
    PLAYER_ASK_TO_JOIN_TOWN_PLAYER_SIDE,
    PLAYER_REMOVE_ASK_TO_JOIN_TOWN_PLAYER_SIDE,
    PLAYER_TOWN_NOT_RECRUITING,
    TOWN_CREATE_SUCCESS_BROADCAST,
    GUI_REGION_KICK_TOWN_BROADCAST,
    CLAIM_CHUNK_COMMAND_DESC,
    CHUNK_ALREADY_CLAIMED_WARNING,
    CANNOT_CLAIM_LANDMARK,
    MAX_CHUNK_LIMIT_REACHED,
    CHUNK_NOT_ADJACENT,
    CHUNK_CLAIMED_SUCCESS_REGION,
    CHUNK_CLAIMED_SUCCESS,
    SELL_RARE_ITEM_COMMAND_DESC,
    NO_ITEM_IN_HAND,
    NOT_RARE_ITEM_IN_HAND,
    CUSTOM_VILLAGER_CREATED_SUCCESS,
    TOWN_INVITE_COMMAND_DESC,
    PLAYER_NOT_FOUND,
    TOWN_NOT_ENOUGH_LEVEL,
    CHAT_SCOPE_TOWN_MESSAGE,
    CHAT_SCOPE_REGION_MESSAGE,
    CHAT_SCOPE_ALLIANCE_MESSAGE,
    NEW_VERSION_AVAILABLE,
    NEW_VERSION_AVAILABLE_2,
    HELP_DESC,
    CLICK_TO_GO_NEXT_PAGE,
    CLICK_TO_GO_PREVIOUS_PAGE,
    PAGE_NUMBER,
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
    TOWN_DIPLOMATIC_INVITATION_ALREADY_HAVE_RELATION,
    TOWN_DIPLOMATIC_INVITATION_SENT_SUCCESS,
    TOWN_ACCEPTED_REGION_DIPLOMATIC_INVITATION,
    REGION_DIPLOMATIC_INVITATION_RECEIVED_1,
    REGION_DIPLOMATIC_INVITATION_RECEIVED_2,
    TOWN_ACCEPT_RELATION_DESC,
    TOWN_RELATION_NO_INVITATION,
    TOWN_RELATION_ACCEPTED_MEMBER_SIDE,
    TOWN_RELATION_ACCEPTED_TOWN_SIDE,
    TOWN_AUTO_CLAIM_DESC,
    AUTO_CLAIM_ON_FOR,
    AUTO_CLAIM_OFF,
    TOWN_CHAT_COMMAND_DESC,
    CHAT_CHANGED,
    TOWN_CHAT_ALREADY_IN_CHAT,
    CHAT_SCOPE_NOT_FOUND,
    ADD_MONEY_COMMAND_SUCCESS,
    TOWN_GUI_COMMAND_DESC,
    OPEN_NEWSLETTER_DESC,
    PAY_COMMAND_DESC,
    PAY_MINIMUM_REQUIRED,
    PAY_CONFIRMED_SENDER,
    PAY_CONFIRMED_RECEIVER,
    PAY_SELF_ERROR,
    BAL_COMMAND_DESC,
    BAL_AMOUNT,
    UNCLAIM_CHUNK_COMMAND_DESC,
    UNCLAIMED_CHUNK_SUCCESS_TOWN,
    UNCLAIMED_CHUNK_SUCCESS_REGION,
    DEBUG_UNCLAIMED_CHUNK_SUCCESS_TOWN,
    DEBUG_UNCLAIMED_CHUNK_SUCCESS_REGION,
    UNCLAIMED_CHUNK_NOT_RIGHT_TOWN,
    UNCLAIMED_CHUNK_NOT_RIGHT_REGION,
    PROPERTY_IN_CHUNK,
    MAP_COMMAND_DESC,
    COMMAND_GENERIC_SUCCESS,
    ADMIN_UNCLAIM_CHUNK_NOT_CLAIMED,
    ADMIN_ADD_MONEY_TO_PLAYER,
    ADMIN_SET_PLAYER_MONEY_BALANCE,
    ADMIN_SPAWN_CUSTOM_VILLAGER,
    ADMIN_SPAWN_RARE_ITEM,
    ADMIN_UNCLAIM_DESC,
    ADMIN_OPEN_GUI,
    ADMIN_RELOAD_COMMAND,
    ADMIN_SUDO_COMMAND,
    DEBUG_CHAT_STORAGE,
    DEBUG_SAVE_ALL_DATA,
    DEBUG_CREATE_BACKUP,
    DEBUG_GET_COLOR_CODE,
    DEBUG_SKIP_DAY,
    DEBUG_PLAY_SOUND,
    SUDO_PLAYER_ADDED,
    SUDO_PLAYER_REMOVED,
    PLAYER_NOT_ENOUGH_MONEY,
    PLAYER_NOT_ENOUGH_MONEY_EXTENDED,
    PLAYER_PAY_AT_EMBARGO_ERROR,
    PLAYER_NEED_1_OR_ABOVE,
    TOWN_NOT_ENOUGH_MONEY,
    TOWN_NOT_ENOUGH_MONEY_EXTENDED,
    REGION_NOT_ENOUGH_MONEY,
    REGION_NOT_ENOUGH_MONEY_EXTENDED,
    NAME_ALREADY_USED,
    PLAYER_WRITE_TOWN_NAME_IN_CHAT,
    PLAYER_WRITE_QUANTITY_IN_CHAT,
    TOWN_RETRIEVE_MONEY_SUCCESS,
    PLAYER_SEND_MONEY_SUCCESS,
    PLAYER_RIGHT_CLICK_2_POINTS_TO_CREATE_PROPERTY,
    PLAYER_FIRST_POINT_SET,
    PLAYER_SECOND_POINT_SET,
    PLAYER_PLACE_SIGN,
    PLAYER_PROPERTY_SIGN_TOO_FAR,
    PLAYER_PROPERTY_CREATED,
    PROPERTY_DELETED,
    SET_SPAWN_COMMAND_DESC,
    SPAWN_SET_SUCCESS,
    SPAWN_COMMAND_DESC,
    SPAWN_TELEPORTED,
    SPAWN_NOT_SET,
    SPAWN_NOT_UNLOCKED,
    RELATION_NEUTRAL_NAME,
    RELATION_CITY_NAME,
    RELATION_OVERLORD_NAME,
    RELATION_VASSAL_NAME,
    RELATION_ALLIANCE_NAME,
    RELATION_NON_AGGRESSION_NAME,
    RELATION_EMBARGO_NAME,
    RELATION_HOSTILE_NAME,
    GUI_GENERIC_CLICK_TO_OPEN,
    GUI_GENERIC_CLICK_TO_DELETE,
    GUI_GENERIC_CLICK_TO_RENAME,
    GUI_GENERIC_RIGHT_CLICK_TO_DELETE,
    GUI_GENERIC_SHIFT_CLICK_TO_TELEPORT,
    GUI_GENERIC_CLICK_TO_SWITCH_SCOPE,
    GUI_WARNING_STILL_IN_DEV,
    GUI_BACK_ARROW,
    GUI_QUIT_ARROW,
    GUI_NEXT_PAGE,
    GUI_PREVIOUS_PAGE,
    GUI_LEFT_CLICK_TO_INTERACT,
    LEFT_CLICK_TO_CLAIM,
    GUI_INCREASE_1_DESC,
    GUI_INCREASE_10_DESC,
    GUI_DECREASE_1_DESC,
    GUI_DECREASE_10_DESC,
    GUI_KINGDOM_ICON,
    GUI_KINGDOM_ICON_DESC1,
    GUI_REGION_ICON,
    GUI_REGION_ICON_DESC1_REGION,
    GUI_REGION_ICON_DESC1_NO_REGION,
    GUI_TOWN_ICON,
    GUI_TOWN_ICON_DESC1_HAVE_TOWN,
    GUI_TOWN_ICON_DESC1_NO_TOWN,
    GUI_PROFILE_ICON_DESC1,
    GUI_PLAYER_PROFILE_DESC1,
    GUI_PLAYER_PROFILE_DESC2,
    GUI_PLAYER_PROFILE_DESC3,
    GUI_PLAYER_PROFILE_NO_TOWN,
    GUI_YOUR_PROFILE,
    GUI_YOUR_BALANCE,
    GUI_YOUR_BALANCE_DESC1,
    GUI_PLAYER_MANAGE_PROPERTIES,
    GUI_PLAYER_MANAGE_PROPERTIES_DESC1,
    GUI_PLAYER_NEWSLETTER,
    GUI_PLAYER_NEWSLETTER_DESC1,
    GUI_NO_TOWN_CREATE_NEW_TOWN,
    GUI_NO_TOWN_CREATE_NEW_TOWN_DESC1,
    GUI_NO_TOWN_JOIN_A_TOWN,
    GUI_NO_TOWN_JOIN_A_TOWN_DESC1,
    GUI_TOWN_INFO_DESC0,
    GUI_TOWN_INFO_DESC1,
    GUI_TOWN_INFO_DESC2,
    GUI_TOWN_INFO_DESC3,
    GUI_TOWN_INFO_DESC4,
    GUI_TOWN_INFO_DESC5_REGION,
    GUI_TOWN_INFO_DESC5_NO_REGION,
    GUI_TOWN_INFO_CHANGE_ICON,
    GUI_TOWN_TREASURY_ICON,
    GUI_TOWN_TREASURY_ICON_DESC1,
    GUI_TOWN_MEMBERS_ICON,
    GUI_TOWN_MEMBERS_ICON_DESC1,
    GUI_CLAIM_ICON,
    GUI_CLAIM_ICON_DESC1,
    GUI_OTHER_TOWN_ICON,
    GUI_OTHER_TOWN_ICON_DESC1,
    GUI_OTHER_REGION_ICON,
    GUI_OTHER_REGION_ICON_DESC1,
    GUI_RELATION_ICON,
    GUI_RELATION_ICON_DESC1,
    GUI_TOWN_LEVEL_ICON,
    GUI_TOWN_LEVEL_ICON_DESC1,
    GUI_TOWN_SETTINGS_ICON,
    GUI_TOWN_SETTINGS_ICON_DESC1,
    GUI_TOWN_PROPERTIES_ICON,
    GUI_TOWN_PROPERTIES_ICON_DESC1,
    GUI_ATTACK_ICON,
    GUI_ATTACK_ICON_DESC1,
    GUI_ATTACK_NOT_MAIN_ATTACKER,
    ATTACK_SUCCESSFULLY_CANCELLED,
    ATTACK_WILL_NOT_TRIGGER_IF_NOT_APPROVED,
    GUI_TREASURY_STORAGE,
    GUI_TREASURY_STORAGE_DESC1,
    GUI_TREASURY_STORAGE_DESC2,
    GUI_TREASURY_SPENDING,
    GUI_TREASURY_SPENDING_DESC1,
    GUI_TREASURY_SPENDING_DESC2,
    GUI_TREASURY_SPENDING_DESC3,
    GUI_TREASURY_SPENDING_DESC4,
    GUI_TREASURY_LOWER_TAX,
    GUI_TREASURY_CANT_TAX_LESS,
    GUI_TREASURY_INCREASE_TAX,
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
    WRITE_IN_CHAT_AMOUNT_OF_MONEY_FOR_DONATION,
    GUI_TOWN_TREASURY_DONATION_DESC1,
    GUI_REGION_TREASURY_DONATION_DESC1,
    GUI_TREASURY_DONATION_HISTORY,
    GUI_TREASURY_RETRIEVE_GOLD,
    GUI_TREASURY_RETRIEVE_GOLD_DESC1,
    LEVEL_LOCKED,
    GUI_TOWN_LEVEL_INFO,
    GUI_TOWN_LEVEL_UP,
    GUI_TOWN_LEVEL_UP_DESC1,
    GUI_TOWN_LEVEL_UP_DESC2,
    GUI_TOWN_LEVEL_UP_UNI,
    GUI_TOWN_LEVEL_UP_UNI_DESC1,
    GUI_TOWN_LEVEL_UP_UNI_DESC2,
    GUI_TOWN_LEVEL_UP_UNI_DESC2_MAX_LEVEL,
    GUI_TOWN_LEVEL_UP_UNI_DESC3,
    GUI_TOWN_LEVEL_UP_UNI_DESC3_1,
    GUI_TOWN_LEVEL_UP_UNI_DESC3_2,
    GUI_TOWN_LEVEL_UP_UNI_DESC4,
    GUI_TOWN_LEVEL_UP_UNI_DESC4_1,
    GUI_TOWN_LEVEL_UP_UNI_DESC4_2,
    GUI_TOWN_LEVEL_UP_UNI_DESC5,
    TOWN_LEVEL_BONUS_RECAP,
    TOWN_UPGRADE_MAX_LEVEL,
    GUI_TOWN_LEVEL_UP_UNI_REQ_NOT_MET,
    GUI_TOWN_SETTINGS_LEAVE_TOWN,
    GUI_TOWN_SETTINGS_LEAVE_TOWN_DESC1,
    GUI_TOWN_SETTINGS_LEAVE_TOWN_DESC2,
    GUI_TOWN_SETTINGS_DELETE_TOWN,
    GUI_TOWN_SETTINGS_DELETE_TOWN_DESC1,
    GUI_TOWN_SETTINGS_DELETE_TOWN_DESC2,
    GUI_TOWN_SETTINGS_TRANSFER_OWNERSHIP,
    GUI_TOWN_SETTINGS_TRANSFER_OWNERSHIP_DESC1,
    GUI_TOWN_SETTINGS_TRANSFER_OWNERSHIP_DESC2,
    GUI_TOWN_RELATION_HOSTILE,
    GUI_TOWN_RELATION_HOSTILE_DESC1,
    GUI_TOWN_RELATION_EMBARGO,
    GUI_TOWN_RELATION_EMBARGO_DESC1,
    GUI_TOWN_RELATION_NAP,
    GUI_TOWN_RELATION_NAP_DESC1,
    GUI_TOWN_RELATION_ALLIANCE,
    GUI_TOWN_RELATION_ALLIANCE_DESC1,
    GUI_TOWN_RELATION_DIPLOMACY_PROPOSAL,
    GUI_TOWN_RELATION_DIPLOMACY_PROPOSAL_DESC1,
    GUI_TOWN_RELATION_DIPLOMACY_PROPOSAL_DESC2,
    GUI_TOWN_RELATION_ADD_TOWN,
    GUI_TOWN_RELATION_REMOVE_TOWN,
    BROADCAST_RELATION_IMPROVE,
    BROADCAST_RELATION_WORSEN,
    GUI_TOWN_INFO_TOWN_RELATION,
    GUI_TOWN_INFO_IS_RECRUITING,
    GUI_TOWN_INFO_IS_NOT_RECRUITING,
    GUI_TOWN_INFO_LEFT_CLICK_TO_JOIN,
    GUI_TOWN_INFO_RIGHT_CLICK_TO_CANCEL,
    GUI_PLAYER_ASK_JOIN_PROFILE_DESC1,
    GUI_PLAYER_ASK_JOIN_PROFILE_DESC2,
    GUI_PLAYER_ASK_JOIN_PROFILE_DESC3,
    GUI_TOWN_RELATION_NEUTRAL,
    GUI_TOWN_ATTACK_TOWN_DESC1,
    GUI_TOWN_ATTACK_TOWN_DESC2,
    GUI_TOWN_ATTACK_TOWN_EXECUTED,
    GUI_TOWN_ATTACK_FINISHED,
    GUI_TOWN_ATTACK_TOWN_INFO,
    GUI_TOWN_CLAIM_SETTINGS_DOOR,
    GUI_TOWN_CLAIM_SETTINGS_CHEST,
    GUI_TOWN_CLAIM_SETTINGS_BUILD,
    GUI_TOWN_CLAIM_SETTINGS_BREAK,
    GUI_TOWN_CLAIM_SETTINGS_ATTACK_PASSIVE_MOBS,
    GUI_TOWN_CLAIM_SETTINGS_BUTTON,
    GUI_TOWN_CLAIM_SETTINGS_REDSTONE,
    GUI_TOWN_CLAIM_SETTINGS_FURNACE,
    GUI_TOWN_CLAIM_SETTINGS_INTERACT_ITEM_FRAME,
    GUI_TOWN_CLAIM_SETTINGS_INTERACT_ARMOR_STAND,
    GUI_TOWN_CLAIM_SETTINGS_DECORATIVE_BLOCK,
    GUI_TOWN_CLAIM_SETTINGS_MUSIC_BLOCK,
    GUI_TOWN_CLAIM_SETTINGS_LEAD,
    GUI_TOWN_CLAIM_SETTINGS_SHEARS,
    GUI_TOWN_CLAIM_SETTINGS_PLACE_BOAT,
    GUI_TOWN_CLAIM_SETTINGS_PLACE_VEHICLE,
    GUI_TOWN_CLAIM_SETTINGS_GATHER_BERRIES,
    GUI_TOWN_CLAIM_SETTINGS_USE_BONE_MEAL,
    GUI_TOWN_CLAIM_SETTINGS_DESC1,
    GUI_TOWN_CHUNK_PLAYER,
    GUI_TOWN_CHUNK_PLAYER_DESC1,
    GUI_TOWN_CHUNK_MOB,
    GUI_TOWN_CHUNK_MOB_DESC1,
    GUI_TOWN_CHUNK_MOB_SETTINGS_STATUS_ACTIVATED,
    GUI_TOWN_CHUNK_MOB_SETTINGS_STATUS_DEACTIVATED,
    GUI_TOWN_CHUNK_MOB_SETTINGS_STATUS_LOCKED,
    GUI_TOWN_CHUNK_MOB_SETTINGS_STATUS_LOCKED2,
    CHAT_CANT_LEAVE_TOWN_IF_LEADER,
    CHAT_CANT_DISBAND_TOWN_IF_NOT_LEADER,
    CHAT_PLAYER_LEFT_THE_TOWN,
    CHAT_PLAYER_TOWN_SUCCESSFULLY_DELETED,
    CHAT_PLAYER_REGION_SUCCESSFULLY_DELETED,
    GUI_TOWN_MEMBER_DESC1,
    GUI_TOWN_MEMBER_DESC2,
    GUI_TOWN_MEMBER_DESC3,
    GUI_TOWN_MEMBERS_MANAGE_ROLES,
    GUI_TOWN_MEMBERS_MANAGE_APPLICATION,
    GUI_TOWN_MEMBERS_MANAGE_APPLICATION_DESC1,
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
    INVITATION_TOWN_FULL,
    GUI_TOWN_MEMBERS_ROLE_NO_ITEM_SHOWED,
    GUI_TOWN_MEMBERS_ROLE_CHANGED_ICON_SUCCESS,
    GUI_TOWN_MEMBERS_ROLE_PRIORITY_X,
    GUI_TOWN_MEMBERS_ROLE_PRIORITY_DESC1,
    GUI_TOWN_MEMBERS_ROLE_PRIORITY_DESC2,
    GUI_TOWN_MEMBERS_ROLE_SET_DEFAULT_IS_DEFAULT,
    GUI_TOWN_MEMBERS_ROLE_SET_DEFAULT_IS_NOT_DEFAULT,
    GUI_TOWN_MEMBERS_ROLE_SET_DEFAULT1,
    GUI_TOWN_MEMBERS_ROLE_SET_DEFAULT2,
    GUI_TOWN_MEMBERS_ROLE_SALARY,
    GUI_TOWN_MEMBERS_ROLE_SALARY_DESC1,
    GUI_TOWN_MEMBERS_ROLE_SET_DEFAULT_ALREADY_DEFAULT,
    GUI_TOWN_MEMBERS_ROLE_DELETE,
    GUI_TOWN_MEMBERS_ROLE_DELETE_ERROR_NOT_EMPTY,
    GUI_TOWN_MEMBERS_ROLE_DELETE_ERROR_DEFAULT,
    WRITE_IN_CHAT_NEW_ROLE_NAME,
    NOT_TOWN_LEADER_ERROR,
    GUI_TOWN_SETTINGS_TRANSFER_OWNERSHIP_TO_SPECIFIC_PLAYER_DESC1,
    GUI_TOWN_SETTINGS_TRANSFER_OWNERSHIP_TO_SPECIFIC_PLAYER_DESC2,
    GUI_TOWN_SETTINGS_TRANSFER_OWNERSHIP_TO_SPECIFIC_PLAYER_SUCCESS,
    GUI_REGION_SETTINGS_REGION_CHANGE_OWNERSHIP_SUCCESS,
    GUI_REGION_SETTINGS_REGION_CHANGE_LEADER_BROADCAST,
    GUI_REGION_SETTINGS_REGION_CHANGE_CAPITAL_BROADCAST,
    GUI_TOWN_SETTINGS_CHANGE_TOWN_MESSAGE,
    GUI_TOWN_SETTINGS_CHANGE_TOWN_MESSAGE_DESC1,
    GUI_TOWN_SETTINGS_CHANGE_MESSAGE_IN_CHAT,
    CHANGE_MESSAGE_SUCCESS,
    GUI_TOWN_SETTINGS_CHANGE_TOWN_APPLICATION,
    GUI_TOWN_SETTINGS_CHANGE_TOWN_APPLICATION_ACCEPT,
    GUI_TOWN_SETTINGS_CHANGE_TOWN_APPLICATION_NOT_ACCEPT,
    GUI_TOWN_SETTINGS_CHANGE_TOWN_APPLICATION_CLICK_TO_SWITCH,
    GUI_TOWN_SETTINGS_CHANGE_TOWN_NAME,
    GUI_TOWN_SETTINGS_CHANGE_TOWN_NAME_DESC1,
    GUI_TOWN_SETTINGS_CHANGE_TOWN_NAME_DESC2,
    GUI_TOWN_SETTINGS_CHANGE_TOWN_NAME_DESC3,
    GUI_TOWN_SETTINGS_WRITE_NEW_NAME_IN_CHAT,
    GUI_TOWN_SETTINGS_QUIT_REGION,
    GUI_TOWN_SETTINGS_QUIT_REGION_DESC1_REGION,
    GUI_TOWN_SETTINGS_NEW_TOWN_NAME_HISTORY,
    GUI_TOWN_SETTINGS_CHANGE_CHUNK_COLOR,
    GUI_TOWN_SETTINGS_CHANGE_CHUNK_COLOR_DESC1,
    GUI_TOWN_SETTINGS_CHANGE_CHUNK_COLOR_DESC2,
    GUI_TOWN_SETTINGS_CHANGE_CHUNK_COLOR_DESC3,
    GUI_TOWN_SETTINGS_CHANGE_TAG,
    GUI_TOWN_SETTINGS_CHANGE_TAG_DESC1,
    GUI_TOWN_SETTINGS_CHANGE_TAG_DESC2,
    GUI_TOWN_SETTINGS_WRITE_NEW_COLOR_IN_CHAT,
    GUI_TOWN_SETTINGS_WRITE_NEW_COLOR_IN_CHAT_SUCCESS,
    GUI_TOWN_SETTINGS_WRITE_NEW_COLOR_IN_CHAT_ERROR,
    GUI_TOWN_SETTINGS_NEW_TOWN_COLOR_HISTORY,
    ADMIN_GUI_REGION_DESC,
    ADMIN_GUI_TOWN_DESC,
    ADMIN_GUI_PLAYER_DESC,
    ADMIN_GUI_LEFT_CLICK_TO_MANAGE_TOWN,
    ADMIN_GUI_CHANGE_TOWN_NAME,
    ADMIN_GUI_CHANGE_TOWN_NAME_DESC1,
    ADMIN_GUI_CHANGE_TOWN_NAME_DESC2,
    ADMIN_GUI_CHANGE_TOWN_DESCRIPTION,
    ADMIN_GUI_CHANGE_TOWN_DESCRIPTION_DESC1,
    ADMIN_GUI_CHANGE_REGION_LEADER,
    ADMIN_GUI_CHANGE_REGION_LEADER_DESC1,
    ADMIN_GUI_CHANGE_TOWN_LEADER,
    ADMIN_GUI_CHANGE_TOWN_LEADER_DESC1,
    ADMIN_GUI_CREATE_TOWN,
    ADMIN_GUI_CREATE_TOWN_DESC1,
    ADMIN_GUI_DELETE_TOWN,
    ADMIN_GUI_DELETE_TOWN_DESC1,
    ADMIN_GUI_TOWN_PLAYER_TOWN,
    ADMIN_GUI_TOWN_PLAYER_TOWN_DESC1,
    ADMIN_GUI_TOWN_PLAYER_TOWN_DESC2,
    ADMIN_GUI_TOWN_PLAYER_LEAVE_TOWN_SUCCESS,
    ADMIN_GUI_LANDMARK_ICON,
    ADMIN_GUI_LANDMARK_DESC1,
    ADMIN_GUI_WAR_ICON,
    ADMIN_GUI_WAR_DESC1,
    ADMIN_GUI_CREATE_LANDMARK,
    LANDMARK_ALREADY_IN_POSITION,
    GUI_LANDMARK_LEFT_CLICK_TO_CLAIM,
    GUI_LANDMARK_TOWN_FULL,
    GUI_LANDMARK_CLAIMED,
    GUI_LANDMARK_REMOVED,
    CANNOT_DO_IN_LANDMARK,
    CANNOT_UNCLAIM_LANDMARK_CHUNK,
    ADMIN_CHUNK_ALREADY_LANDMARK,
    ADMIN_GUI_CHANGE_LANDMARK_NAME,
    ADMIN_GUI_CHANGE_LANDMARK_NAME_DESC1,
    ADMIN_GUI_CHANGE_LANDMARK_NAME_DESC2,
    ADMIN_GUI_DELETE_LANDMARK,
    ADMIN_GUI_DELETE_LANDMARK_DESC1,
    CLICK_TO_OPEN_LANDMARK_MENU,
    TRANSACTION_HISTORY,
    DONATION_SINGLE_LINE_1,
    DONATION_SINGLE_LINE_2,
    TAX_SINGLE_LINE,
    HISTORY_NEGATIVE_SINGLE_LINE,
    TAX_SINGLE_LINE_NOT_ENOUGH,
    CHUNK_HISTORY_DESC1,
    CHUNK_HISTORY_DESC2,
    MISCELLANEOUS_HISTORY_DESC1,
    MISCELLANEOUS_HISTORY_DESC2,
    TOTAL_TAX_LINE,
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
    GUI_TOWN_MEMBERS_ROLE_PRIORITY_MANAGE_MOB_SPAWN,
    GUI_TOWN_MEMBERS_ROLE_PRIORITY_CREATE_PROPERTY,
    GUI_TOWN_MEMBERS_ROLE_PRIORITY_MANAGE_PROPERTY,
    GUI_TOWN_MEMBERS_ROLE_PRIORITY_TOWN_ADMINISTRATOR,
    GUI_TOWN_MEMBERS_ROLE_HAS_PERMISSION,
    GUI_TOWN_MEMBERS_ROLE_NO_PERMISSION,
    GUI_TOWN_MEMBERS_ROLE_SALARY_ERROR_LOWER,
    TOWN_BROADCAST_PLAYER_LEAVE_THE_TOWN,
    WARNING_OTHER_TOWN_HAS_BEEN_DELETED,
    ITEM_RARE_STONE,
    ITEM_RARE_WOOD,
    ITEM_RARE_CROP,
    ITEM_RARE_SOUL,
    ITEM_RARE_FISH,
    RARE_ITEM_DESC_1,
    VILLAGER_GOLDSMITH,
    VILLAGER_BOTANIST,
    VILLAGER_COOK,
    VILLAGER_WIZARD,
    VILLAGER_FISHERMAN,
    RARE_ITEM_NO_ITEM_IN_HANDS,
    RARE_ITEM_WRONG_ITEM,
    RARE_ITEM_SELLING_SUCCESS,
    WILDERNESS,
    PLAYER_ENTER_TOWN_CHUNK,
    PLAYER_ENTER_REGION_CHUNK,
    PLAYER_ENTER_LANDMARK_CHUNK,
    CHUNK_ENTER_TOWN_AT_WAR,
    CHUNK_INTRUSION_ALERT,
    WILDERNESS_NO_PERMISSION,
    HISTORY_TOWN_CREATED,
    HISTORY_TOWN_DELETED,
    HISTORY_REGION_CREATED,
    HISTORY_REGION_DELETED,
    HISTORY_TOWN_LEADER_CHANGED,
    HISTORY_REGION_CAPITAL_CHANGED,
    HISTORY_TOWN_NAME_CHANGED,
    HISTORY_REGION_NAME_CHANGED,
    HISTORY_TOWN_MESSAGE_CHANGED,
    HISTORY_REGION_MESSAGE_CHANGED,
    HISTORY_ADMIN_GIVE_MONEY,
    HISTORY_ADMIN_SET_MONEY,
    HISTORY_ADMIN_SUMMON_RARE_ITEM,
    HISTORY_SUDO_MODE,
    HISTORY_SUDO_MODE_REMOVED,
    NO_TOWN,
    NO_REGION,
    NO_KINGDOM,
    PLAYER_NOT_ONLINE,
    PLAYER_ONLY_LEADER_CAN_PERFORM_ACTION,
    CHUNK_NOT_CLAIMED,
    LEADER_NOT_ONLINE,
    GUI_REGION_CREATE,
    GUI_REGION_CREATE_DESC1,
    GUI_REGION_CREATE_DESC2,
    GUI_REGION_BROWSE,
    GUI_REGION_BROWSE_DESC1,
    GUI_REGION_BROWSE_DESC2,
    WRITE_IN_CHAT_NEW_REGION_NAME,
    REGION_CREATE_SUCCESS_BROADCAST,
    GUI_REGION_INFO_DESC0,
    GUI_REGION_INFO_DESC1,
    GUI_REGION_INFO_DESC2,
    GUI_REGION_INFO_DESC3,
    GUI_REGION_INFO_DESC4,
    GUI_REGION_INFO_DESC5,
    GUI_REGION_TOWN_LIST,
    GUI_REGION_TOWN_LIST_DESC1,
    GUI_HIERARCHY_MENU,
    GUI_HIERARCHY_MENU_DESC1,
    GUI_MANAGE_LAWS,
    GUI_MANAGE_LAWS_DESC1,
    GUI_REGION_CHANGE_CAPITAL,
    GUI_REGION_CHANGE_CAPITAL_DESC1,
    GUI_REGION_CHANGE_CAPITAL_DESC2,
    GUI_REGION_DELETE,
    GUI_REGION_DELETE_DESC1,
    GUI_REGION_DELETE_DESC2,
    GUI_REGION_DELETE_DESC3,
    GUI_NEED_TO_BE_LEADER_OF_REGION,
    GUI_REGION_CHANGE_DESCRIPTION,
    GUI_REGION_CHANGE_DESCRIPTION_DESC1,
    GUI_REGION_CHANGE_DESCRIPTION_DESC2,
    GUI_INVITE_TOWN_TO_REGION,
    GUI_KICK_TOWN_TO_REGION,
    GUI_REGION_INVITE_TOWN_DESC1,
    GUI_REGION_KICK_TOWN_DESC1,
    GUI_COLLECT_LANDMARK,
    GUI_COLLECT_LANDMARK_DESC1,
    GUI_COLLECT_LANDMARK_DESC2,
    GUI_LANDMARK_REWARD_COLLECTED,
    GUI_REMOVE_LANDMARK,

    SPECIFIC_LANDMARK_ICON_DEFAULT_NAME,
    SPECIFIC_LANDMARK_ICON_DESC1,
    SPECIFIC_LANDMARK_ICON_DESC2_NO_OWNER,
    SPECIFIC_LANDMARK_ICON_DESC2_OWNER,
    SPECIFIC_LANDMARK_ICON_SWITCH_REWARD,
    ADMIN_GUI_LANDMARK_REWARD_SET,

    CANT_KICK_REGIONAL_CAPITAL,
    ADMIN_GUI_CANT_DELETE_REGIONAL_CAPITAL,
    PLAYER_PROPERTY_CAP_REACHED,
    PLAYER_ALREADY_IN_SCOPE,
    POSITION_NEED_TO_BE_IN_CLAIMED_CHUNK,
    POSITION_NEED_TO_BE_IN_PLAYER_TOWN,
    MESSAGE_NOT_RIGHT_SIZE,
    NO_TRADE_ALLOWED_EMBARGO,
    NO_LEADER,
    TOWN_HAVE_NO_LEADER,
    TOWN_DIPLOMATIC_INVITATION_NO_LEADER,
    PLAYER_PROPERTY_TOO_BIG,
    POSITION_NOT_IN_CLAIMED_CHUNK,
    LANDMARK_ALREADY_CLAIMED,
    INTERACTION_TOO_FAR_ERROR,
    DISPLAY_COORDINATES,
    GUI_BASIC_NAME,
    LEFT_CLICK_TO_SELECT,
    LEFT_CLICK_TO_AUTHORIZE,
    LEFT_CLICK_TO_MODIFY,
    LEFT_CLICK_TO_ACCEPT,
    RIGHT_CLICK_TO_REFUSE,
    GUI_PLAYER_NEW_PROPERTY,
    GUI_PROPERTY_DESCRIPTION,
    GUI_PROPERTY_STRUCTURE_OWNER,
    GUI_PROPERTY_OWNER,
    GUI_PROPERTY_FOR_SALE,
    GUI_PROPERTY_RENTED_BY,
    GUI_PROPERTY_FOR_RENT,
    GUI_PROPERTY_NOT_FOR_RENT,
    GUI_PROPERTY_NOT_FOR_SALE,
    PROPERTY_NOT_FOR_SALE_OR_RENT,
    PROPERTY_RENTED_BY,
    PROPERTY_BELONGS_TO,
    PROPERTY_ALREADY_RENTED,
    CLICK_TO_OPEN_PROPERTY_MENU,
    GUI_PROPERTY_DELETE_PROPERTY,
    GUI_PROPERTY_DELETE_PROPERTY_DESC1,
    GUI_PROPERTY_AUTHORIZE_PLAYER,
    PLAYER_REMOVED_FROM_PROPERTY,
    PLAYER_ADDED_TO_PROPERTY,
    GUI_PROPERTY_PLAYER_LIST,
    GUI_PROPERTY_PLAYER_LIST_DESC1,
    GUI_PROPERTY_RIGHT_CLICK_TO_EXPEL_RENTER,
    PROPERTY_RENTER_EXPELLED_OWNER_SIDE,
    PROPERTY_RENTER_EXPELLED_RENTER_SIDE,
    GUI_PROPERTY_STOP_RENTING_PROPERTY,
    GUI_PROPERTY_STOP_RENTING_PROPERTY_DESC1,
    PROPERTY_RENTER_LEAVE_RENTER_SIDE,
    PROPERTY_RENTER_LEAVE_OWNER_SIDE,
    PROPERTY_SOLD_EX_OWNER,
    PROPERTY_SOLD_NEW_OWNER,
    CONFIRM_RENT,
    CONFIRM_RENT_DESC1,
    CONFIRM_RENT_DESC2,
    CANCEL_RENT,
    CONFIRM_SALE,
    CONFIRM_SALE_DESC1,
    CONFIRM_SALE_DESC2,
    CANCEL_SALE,
    GUI_PROPERTY_DRAWN_BOX,
    GUI_PROPERTY_DRAWN_BOX_DESC1,
    GUI_PROPERTY_CHANGE_NAME,
    GUI_PROPERTY_CHANGE_NAME_DESC1,
    GUI_PROPERTY_CHANGE_DESCRIPTION,
    GUI_PROPERTY_CHANGE_DESCRIPTION_DESC1,
    GUI_ATTACK_ADD_TIME,
    GUI_ATTACK_REMOVE_TIME,
    GUI_LEFT_CLICK_FOR_1_MINUTE,
    GUI_SHIFT_CLICK_FOR_1_HOUR,
    GUI_ATTACK_SET_TO_START_IN,
    GUI_CONFIRM_ATTACK,
    GUI_CONFIRM_ATTACK_DESC1,
    SELL_PROPERTY,
    RENT_PROPERTY,
    OVERLORD_GUI,
    CANNOT_HAVE_OVERLORD,
    NO_OVERLORD,
    GUI_OVERLORD_INFO,
    GUI_OVERLORD_DECLARE_INDEPENDENCE,
    GUI_OVERLORD_DECLARE_INDEPENDENCE_DESC1,
    GUI_CONFIRM_DECLARE_INDEPENDENCE,
    TERRITORY_NO_OVERLORD,
    CANNOT_DECLARE_INDEPENDENCE_BECAUSE_CAPITAL,
    BROWSE_OVERLORD_INVITATION,
    BROWSE_OVERLORD_INVITATION_DESC1,
    GUI_OVERLORD_DONATE,
    GUI_OVERLORD_DONATE_DESC1,
    VASSAL_GUI,
    VASSAL_GUI_DESC1,

    CANNOT_HAVE_VASSAL,

    GUI_BUYING_PRICE,
    GUI_RENTING_PRICE,
    GUI_LEFT_CLICK_TO_SWITCH_SALE,
    GUI_RIGHT_CLICK_TO_CHANGE_PRICE,
    SIGN_NAME,
    SIGN_PLAYER,
    SIGN_FOR_SALE,
    SIGN_SALE_PRICE,
    SIGN_RENT,
    SIGN_RENT_PRICE,
    SIGN_RENTED_BY,
    SIGN_NOT_FOR_SALE,
    BASIC_ATTACK_NAME,
    ATTACK_ICON_DESC_1,
    ATTACK_ICON_DESC_2,
    ATTACK_ICON_DESC_3,
    ATTACK_ICON_DESC_4,
    ATTACK_ICON_DESC_5,
    ATTACK_ICON_DESC_6,
    ATTACK_ICON_DESC_7,
    ATTACK_ICON_DESC_8,
    ATTACK_ICON_DESC_ADMIN_APPROVED,
    ATTACK_ICON_DESC_ADMIN_NOT_APPROVED,
    GUI_TOWN_ATTACK_ALREADY_ATTACKING,
    TITLE_ATTACK,
    PLAYER_WON_ATTACK,
    PLAYER_LOST_ATTACK,
    WAR_ATTACKER_WON_ANNOUNCEMENT,
    WAR_DEFENDER_WON_ANNOUNCEMENT,
    GENERIC_CONFIRM_ACTION,
    GENERIC_CANCEL_ACTION,
    GENERIC_CANCEL_ACTION_DESC1,
    GUI_CONFIRM_PLAYER_LEAVE_TOWN,
    GUI_CONFIRM_PLAYER_DELETE_TOWN,
    TOWN_BROADCAST_TOWN_LEFT_REGION,
    REGION_BROADCAST_TOWN_LEFT_REGION,
    GUI_CONFIRM_TOWN_LEAVE_REGION,
    GUI_CONFIRM_CHANGE_TOWN_LEADER,
    CONFIRM_PLAYER_KICKED,
    GUI_CONFIRM_DELETE_REGION,
    GUI_CONFIRM_CHANGE_LEADER,
    NO_WAR_GOAL_SELECTED,
    NO_WAR_GOAL_SELECTED_DESC,
    CONQUER_WAR_GOAL,
    CONQUER_WAR_GOAL_DESC,
    GUI_CONQUER_ADD_CHUNK,
    GUI_CONQUER_REMOVE_CHUNK,
    GUI_CONQUER_CHUNK_INFO,
    GUI_CONQUER_CHUNK_CURRENT_DESC,
    SUBJUGATE_WAR_GOAL,
    SUBJUGATE_WAR_GOAL_DESC,
    GUI_WARGOAL_SUBJUGATE_CANNOT_BE_USED,
    GUI_WARGOAL_SUBJUGATE_WAR_GOAL_RESULT,
    LIBERATE_SUBJECT_WAR_GOAL,
    LIBERATE_SUBJECT_WAR_GOAL_DESC,
    GUI_SELECT_TERRITORY_TO_LIBERATE,
    GUI_SELECTED_TERRITORY_TO_LIBERATE,
    GUI_WARGOAL_LIBERATE_CANNOT_BE_USED,
    GUI_WARGOAL_LIBERATE_WAR_GOAL_RESULT,
    GUI_WARGOAL_NOT_COMPLETED,
    WARGOAL_SUBJUGATE_SUCCESS,
    WARGOAL_LIBERATE_SUCCESS,
    WARGOAL_CONQUER_SUCCESS_WINNING_SIDE,
    WARGOAL_CONQUER_SUCCESS_LOOSING_SIDE,
    GUI_CANCEL_ATTACK,
    GUI_RENAME_ATTACK,
    GUI_QUIT_WAR,
    GUI_QUIT_WAR_DESC1,
    TERRITORY_NO_LONGER_INVOLVED_IN_WAR_MESSAGE,
    SUBMIT_TO_REQUESTS,
    SUBMIT_TO_REQUEST_DESC1,
    SUBMIT_TO_REQUEST_DESC2,
    DEFENSIVE_SIDE_HAS_SURRENDER,
    GUI_JOIN_ATTACKING_SIDE,
    GUI_JOIN_ATTACKING_SIDE_DESC1,
    GUI_JOIN_DEFENDING_SIDE,
    GUI_JOIN_DEFENDING_SIDE_DESC1,
    GUI_WAR_GOAL_INFO,
    BROWSE_ALL_NAME,
    BROWSE_TOWNS_NAME,
    BROWSE_REGIONS_NAME,
    MAIN_ATTACKER_NAME,
    MAIN_DEFENDER_NAME,
    OTHER_ATTACKER_NAME,
    OTHER_DEFENDER_NAME,
    NEUTRAL_NAME,
    GUI_ATTACKING_SIDE_ICON,
    GUI_ATTACKING_SIDE_ICON_DESC1,
    GUI_DEFENDING_SIDE_ICON,
    GUI_DEFENDING_SIDE_ICON_DESC1,
    GUI_ICON_LIST,
    BROADCAST_PLAYER_TOWN_DELETED,
    BROADCAST_PLAYER_REGION_DELETED,
    MAP_CLAIM_TYPE,
    MAP_TOWN,
    MAP_REGION,
    RELOAD_SUCCESS,
    DIPLOMATIC_RELATION,
    DIPLOMATIC_RELATION_DESC1,
    DIPLOMATIC_RELATION_DESC2,
    NEWSLETTER_GREETING,
    CLICK_TO_OPEN_NEWSLETTER,
    NEWSLETTER_PLAYER_APPLICATION,
    NEWSLETTER_PLAYER_APPLICATION_DESC1,
    NEWSLETTER_PLAYER_APPLICATION_DESC2,
    NEWSLETTER_DIPLOMACY_PROPOSAL,
    NEWSLETTER_DIPLOMACY_PROPOSAL_DESC1,
    NEWSLETTER_DIPLOMACY_PROPOSAL_DESC2,
    NEWSLETTER_JOIN_REGION_PROPOSAL,
    NEWSLETTER_JOIN_REGION_PROPOSAL_DESC1,
    NEWSLETTER_JOIN_REGION_PROPOSAL_DESC2,
    NEWSLETTER_SHOW_ALL,
    NEWSLETTER_SHOW_ONLY_UNREAD,
    NEWSLETTER_RIGHT_CLICK_TO_MARK_AS_READ,
    NEWSLETTER_SUBJUGATE_PROPOSAL,
    NEWSLETTER_SUBJUGATE_PROPOSAL_DESC1,
    NEWSLETTER_SUBJUGATE_PROPOSAL_DESC2,
    CHUNK_IS_BLACKLISTED;


    private static final Map<Lang, String> translations = new HashMap<>();

    public static void loadTranslations(String fileTag) {

        File langFolder = new File(TownsAndNations.getPlugin().getDataFolder(), "lang");

        if (!langFolder.exists()) {
            langFolder.mkdir();
        }

        File specificLangFolder = new File(langFolder, fileTag);
        if(!specificLangFolder.exists()) {
            specificLangFolder.mkdir();
        }

        File file = new File(specificLangFolder, "main.yml");

        boolean replace = ConfigUtil.getCustomConfig(ConfigTag.LANG).getBoolean("autoUpdateLangFiles",true);


        if(!file.exists() || replace) {
            TownsAndNations.getPlugin().saveResource("lang/" + fileTag + "/main.yml", true);
        }

        YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
        for (Lang key : Lang.values()) {
            String message = config.getString("language." + key.name());
            if (message != null) {
                translations.put(key, message);
            }
        }
    }

    public String get() {
        String translation = translations.get(this);
        if (translation != null) {
            return ChatColor.translateAlternateColorCodes('§', translation);
        }
        return "Message not found for " + this.name() + " in this language file.";
    }

    public String get(Object... placeholders) {
        String translation = translations.get(this);
        if (translation != null) {
            translation = ChatColor.translateAlternateColorCodes('§', translation);
            for (int i = 0; i < placeholders.length; i++) {
                String val = placeholders[i] == null ? "null" : placeholders[i].toString();
                translation = translation.replace("{" + i + "}",val);
            }
            return translation;
        }
        return "Message not found for " + this.name() + " in this language file.";
    }
}