package com.kws.lostarkhelper.lostarkapi.dto.armories.engravings.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class Engraving {

    private final Integer slot;
    private final String name;
    private final String icon;
    private final String tooltip;

    @JsonCreator
    public Engraving(@JsonProperty("Slot") Integer slot,
                     @JsonProperty("Name") String name,
                     @JsonProperty("Icon") String icon,
                     @JsonProperty("Tooltip") String tooltip) {
        this.slot = slot;
        this.name = name;
        this.icon = icon;
        this.tooltip = tooltip;
    }
}
