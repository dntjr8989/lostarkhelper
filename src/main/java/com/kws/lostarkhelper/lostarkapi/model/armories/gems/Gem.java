package com.kws.lostarkhelper.lostarkapi.model.armories.gems;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class Gem {
    private final Integer slot;
    private final String name;
    private final String icon;
    private final Integer level;
    private final String grade;
    private final String tooltip;

    @JsonCreator
    public Gem(@JsonProperty("Slot") Integer slot,
               @JsonProperty("Name") String name,
               @JsonProperty("Icon") String icon,
               @JsonProperty("Level") Integer level,
               @JsonProperty("Grade") String grade,
               @JsonProperty("Tooltip") String tooltip) {
        this.slot = slot;
        this.name = name;
        this.icon = icon;
        this.level = level;
        this.grade = grade;
        this.tooltip = tooltip;
    }
}
