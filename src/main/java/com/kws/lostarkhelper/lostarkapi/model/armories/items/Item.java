package com.kws.lostarkhelper.lostarkapi.model.armories.items;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class Item {

    private final String type;
    private final String name;
    private final String icon;
    private final String grade;
    private final String tooltip;

    @JsonCreator
    public Item(@JsonProperty("Type") String type,
                 @JsonProperty("Name") String name,
                 @JsonProperty("Icon") String icon,
                 @JsonProperty("Grade") String grade,
                 @JsonProperty("Tooltip") String tooltip) {
        this.type = type;
        this.name = name;
        this.icon = icon;
        this.grade = grade;
        this.tooltip = tooltip;
    }
}
