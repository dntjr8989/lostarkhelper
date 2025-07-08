package com.kws.lostarkhelper.lostarkapi.dto.armories.items.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class ArmoryEquipMent {

    private final String type;
    private final String name;
    private final String icon;
    private final String grade;
    private final String tooltip;

    @JsonCreator
    public ArmoryEquipMent(@JsonProperty("Type") String type,
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
