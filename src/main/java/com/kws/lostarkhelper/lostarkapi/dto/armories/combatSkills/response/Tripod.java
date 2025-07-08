package com.kws.lostarkhelper.lostarkapi.dto.armories.combatSkills.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class Tripod {

    private final Integer tier;
    private final Integer slot;
    private final String name;
    private final String icon;
    private final Boolean isSelected;
    private final String tooltip;

    @JsonCreator
    public Tripod(@JsonProperty("Tier") Integer tier,
                  @JsonProperty("Slot") Integer slot,
                  @JsonProperty("Name") String name,
                  @JsonProperty("Icon") String icon,
                  @JsonProperty("IsSelected") Boolean isSelected,
                  @JsonProperty("Tooltip") String tooltip) {
        this.tier = tier;
        this.slot = slot;
        this.name = name;
        this.icon = icon;
        this.isSelected = isSelected;
        this.tooltip = tooltip;
    }
}
