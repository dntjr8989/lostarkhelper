package com.kws.lostarkhelper.lostarkapi.model.armories.avatars;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class Avatar {
    private final String type;
    private final String name;
    private final String icon;
    private final String grade;
    private final Boolean isSet;
    private final Boolean isInner;
    private final String tooltip;

    @JsonCreator
    public Avatar(@JsonProperty("Type") String type,
                  @JsonProperty("Name") String name,
                  @JsonProperty("Icon") String icon,
                  @JsonProperty("Grade") String grade,
                  @JsonProperty("IsSet") Boolean isSet,
                  @JsonProperty("IsInner") Boolean isInner,
                  @JsonProperty("Tooltip") String tooltip) {
        this.type = type;
        this.name = name;
        this.icon = icon;
        this.grade = grade;
        this.isSet = isSet;
        this.isInner = isInner;
        this.tooltip = tooltip;
    }
}
