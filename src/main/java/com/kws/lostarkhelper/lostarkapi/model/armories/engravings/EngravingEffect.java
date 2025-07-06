package com.kws.lostarkhelper.lostarkapi.model.armories.engravings;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class EngravingEffect {

    private final String icon;
    private final String name;
    private final String description;

    @JsonCreator
    public EngravingEffect(@JsonProperty("Icon") String icon,
                  @JsonProperty("Name") String name,
                  @JsonProperty("Description") String description) {
        this.icon = icon;
        this.name = name;
        this.description = description;
    }
}
