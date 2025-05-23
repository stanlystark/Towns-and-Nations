package org.leralix.tan.commands.admin;

import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;
import org.leralix.lib.commands.SubCommand;
import org.leralix.lib.utils.config.ConfigTag;
import org.leralix.lib.utils.config.ConfigUtil;
import org.leralix.tan.TownsAndNations;
import org.leralix.tan.storage.ClaimBlacklistStorage;
import org.leralix.tan.storage.MobChunkSpawnStorage;
import org.leralix.tan.storage.legacy.UpgradeStorage;
import org.leralix.tan.utils.TanChatUtils;
import org.leralix.tan.lang.Lang;

import java.util.Collections;
import java.util.List;

public class ReloadCommand extends SubCommand {
    @Override
    public String getName() {
        return "reload";
    }


    @Override
    public String getDescription() {
        return Lang.ADMIN_RELOAD_COMMAND.get();
    }
    public int getArguments(){ return 1;}


    @Override
    public String getSyntax() {
        return "/tanadmin reload";
    }

    @Override
    public List<String> getTabCompleteSuggestions(CommandSender player, String lowerCase, String[] args){
        return Collections.emptyList();
    }
    @Override
    public void perform(CommandSender player, String[] args){
        if (args.length == 1){
            Plugin plugin = TownsAndNations.getPlugin();
            ConfigUtil.addCustomConfig(plugin,"config.yml", ConfigTag.MAIN);
            ConfigUtil.addCustomConfig(plugin,"townUpgrades.yml", ConfigTag.UPGRADE);

            UpgradeStorage.init();
            MobChunkSpawnStorage.init();
            ClaimBlacklistStorage.init();

            player.sendMessage(TanChatUtils.getTANString() + Lang.RELOAD_SUCCESS.get(player));
        }else{
            player.sendMessage(TanChatUtils.getTANString() + Lang.TOO_MANY_ARGS_ERROR.get(player));
            player.sendMessage(TanChatUtils.getTANString() + Lang.CORRECT_SYNTAX_INFO.get(getSyntax()));
        }
    }

}
