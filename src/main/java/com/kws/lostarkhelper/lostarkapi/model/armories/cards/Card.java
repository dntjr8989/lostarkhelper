package com.kws.lostarkhelper.lostarkapi.model.armories.cards;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class Card {

    private final Integer slot;
    private final String name;
    private final String icon;
    private final Integer awakeCount;
    private final Integer awakeTotal;
    private final String grade;
    private final String tooltip;

    @JsonCreator
    public Card(@JsonProperty("Slot") Integer slot,
                @JsonProperty("Name") String name,
                @JsonProperty("Icon") String icon,
                @JsonProperty("AwakeCount") Integer awakeCount,
                @JsonProperty("AwakeTotal") Integer awakeTotal,
                @JsonProperty("Grade") String grade,
                @JsonProperty("Tooltip") String tooltip) {
        this.slot = slot;
        this.name = name;
        this.icon = icon;
        this.awakeCount = awakeCount;
        this.awakeTotal = awakeTotal;
        this.grade = grade;
        this.tooltip = tooltip;
    }
}
