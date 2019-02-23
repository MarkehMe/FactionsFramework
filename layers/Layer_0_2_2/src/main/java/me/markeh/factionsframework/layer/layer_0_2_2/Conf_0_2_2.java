package me.markeh.factionsframework.layer.layer_0_2_2;

import com.massivecraft.factions.Conf;
import me.markeh.factionsframework.layer.ConfLayer;
import org.bukkit.ChatColor;

public class Conf_0_2_2 extends ConfLayer {

    @Override
    public String getPrefixLeader() {
        return Conf.prefixAdmin;
    }

    @Override
    public String getPrefixOfficer() {
        return Conf.prefixMod;
    }

    @Override
    public String getPrefixMember() {
        return "+"; // TODO: maybe put into our own config or leave blank
    }

    @Override
    public String getPrefixRecruit() {
        return "-"; // TODO: maybe put into our own config or leave blank
    }

    @Override
    public ChatColor getColorMember() {
        return Conf.colorMember;
    }

    @Override
    public ChatColor getColorAlly() {
        return Conf.colorAlly;
    }

    @Override
    public ChatColor getColorNeutral() {
        return Conf.colorNeutral;
    }

    @Override
    public ChatColor getColorTruce() {
        return Conf.colorTruce;
    }

    @Override
    public ChatColor getColorEnemy() {
        return Conf.colorEnemy;
    }

}