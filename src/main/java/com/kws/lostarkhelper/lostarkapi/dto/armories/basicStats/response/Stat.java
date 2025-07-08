package com.kws.lostarkhelper.lostarkapi.dto.armories.basicStats.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class Stat {
    private final String type;
    private final String value;
    private final List<String> tooltip;

    @JsonCreator
    public Stat(@JsonProperty("Type") String type,
                @JsonProperty("Value") String value,
                @JsonProperty("Tooltip") List<String> tooltip) {
        this.type = type;
        this.value = value;
        this.tooltip = tooltip;
    }
}
