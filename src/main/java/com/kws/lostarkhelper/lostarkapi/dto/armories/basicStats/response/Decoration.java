package com.kws.lostarkhelper.lostarkapi.dto.armories.basicStats.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class Decoration {
    private final String symbol;
    private final List<String> emblems;

    @JsonCreator
    public Decoration(@JsonProperty("Symbol") String symbol,
                       @JsonProperty("Emblems") List<String> emblems) {
        this.symbol = symbol;
        this.emblems = emblems;
    }
}
