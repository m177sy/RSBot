package com.cruxster.api.skills;

/**
 * Created by mills on 30/08/2017.
 */
public enum osSkills {

    ATTACK("Attack", 0),
    DEFENSE("Defense", 1),
    STRENGTH("Strength", 2),
    HITPOINTS("Hitpoints", 3),
    RANGE("Range", 4),
    PRAYER("Prayer", 5),
    MAGIC("Magic", 6),
    COOKING("Cooking", 7),
    WOODCUTTING("Woodcutting", 8),
    FLETCHING("Fletching", 9),
    FISHING("Fishing", 10),
    FIREMAKING("Firemaking", 11),
    CRAFTING("Crafting", 12),
    SMITHING("Smithing", 13),
    MINING("Mining", 14),
    HERBLORE("Herblore", 15),
    AGILITY("Agility", 16),
    THIEVING("Thieving", 17),
    SLAYER("Slayer", 18),
    FARMING("Farming", 19),
    RUNECRAFTING("Runecrafting", 20),
    HUNTER("Hunter", 21),
    CONSTRUCTION("Construction", 22);

    private String name;
    private int id;

    private osSkills(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }


}
