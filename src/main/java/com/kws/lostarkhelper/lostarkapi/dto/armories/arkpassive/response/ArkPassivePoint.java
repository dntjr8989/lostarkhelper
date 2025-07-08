package com.kws.lostarkhelper.lostarkapi.dto.armories.arkpassive.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class ArkPassivePoint {

    private final String name;
    private final Integer value;
    private final String tooltip;
    private final String description;

    @JsonCreator
    public ArkPassivePoint(@JsonProperty("Name") String name,
                           @JsonProperty("Value") Integer value,
                           @JsonProperty("Tooltip") String tooltip,
                           @JsonProperty("Description") String description) {
        this.name = name;
        this.value = value;
        this.tooltip = tooltip;
        this.description = description;
    }
}
