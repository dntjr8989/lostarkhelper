package com.kws.lostarkhelper.lostarkapi.dto.armories.arkpassive.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class ArkPassiveEffect {
    private final String name;
    private final String description;
    private final String icon;
    private final String tooltip;

    @JsonCreator
    public ArkPassiveEffect(@JsonProperty("Name") String name,
                            @JsonProperty("Description") String description,
                            @JsonProperty("Icon") String icon,
                            @JsonProperty("ToolTip") String tooltip) {
        this.name = name;
        this.description = description;
        this.icon = icon;
        this.tooltip = tooltip;
    }
}
