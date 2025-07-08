package com.kws.lostarkhelper.lostarkapi.dto.armories.combatSkills.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class CombatSkill {
    private final String name;
    private final String icon;
    private final Integer level;
    private final String type;
    private final Integer skillType;
    private final List<Tripod> tripods;
    private final Rune rune;
    private final String tooltip;

    @JsonCreator
    public CombatSkill(@JsonProperty("Name") String name,
                       @JsonProperty("Icon") String icon,
                       @JsonProperty("Level") Integer level,
                       @JsonProperty("Type") String type,
                       @JsonProperty("SkillType") Integer skillType,
                       @JsonProperty("Tripods") List<Tripod> tripods,
                       @JsonProperty("Rune") Rune rune,
                       @JsonProperty("Tooltip") String tooltip) {
        this.name = name;
        this.icon = icon;
        this.level = level;
        this.type = type;
        this.skillType = skillType;
        this.tripods = tripods;
        this.rune = rune;
        this.tooltip = tooltip;
    }
}
