package com.cruxster.api.skills;

import org.powerbot.script.rt4.ClientContext;



/**
 * Created by mills on 29/08/2017.
 */
public class skillTracker {

    private int skill;
    private int startLvl;
    private long startXp;
    private long startTime;
    private ClientContext ctx = null;

    public skillTracker(ClientContext ctx, int skill, long startTime){
        startLvl = ctx.skills.level(skill);
        startXp = ctx.skills.experience(skill);
        this.skill = skill;
        this.ctx = ctx;
        this.startTime = startTime;
    }

    public int getLevel() {
        return ctx.skills.level(skill);
    }

    public int getLevelGain() {
        return getLevel() - startLvl;
    }

    public long getExp() {
        return ctx.skills.experience(skill);
    }

    public long getExpGain() {
        return getExp() - startXp;
    }

    public long getExpToLevel() {
        return ctx.skills.experienceAt(getLevel() + 1) - getExp();
    }

    public double getPercentToLevel() {
        return ((ctx.skills.experience(skill) - ctx.skills.experienceAt(getLevel())) / (ctx.skills.experienceAt(getLevel() + 1) - ctx.skills.experienceAt(getLevel()))) * 100;
    }


}
