package com.kws.lostarkhelper.lostarkapi.dto.auctions.activeauctions.response;

public enum ItemOptionTypeEnum {
    None("None"),
    SKILL("SKILL"),
    STAT("STAT"),
    ABILITY_ENGRAVE("ABILITY_ENGRAVE"),
    BRACELET_SPECIAL_EFFECTS("BRACELET_SPECIAL_EFFECTS"),
    GEM_SKILL_DAMAGE("GEM_SKILL_DAMAGE"),
    GEM_SKILL_COOLDOWN_REDUCTION("GEM_SKILL_COOLDOWN_REDUCTION"),
    GEM_SKILL_SUPPORT("GEM_SKILL_SUPPORT"),
    ACCESSORY_UPGRADE("ACCESSORY_UPGRADE"),
    ARK_PASSIVE("ARK_PASSIVE"),
    BRACELET_RANDOM_SLOT("BRACELET_RANDOM_SLOT")
    ;

    private final String type;

    ItemOptionTypeEnum(String type) {
        this.type = type;
    }

    public String type(){
        return this.type;
    }
}
