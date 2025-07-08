package com.kws.lostarkhelper.lostarkapi.dto.armories.gems.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class GemSkill {
    private final Integer gemSlot;
    private final String name;
    private final List<String> description;

    @JsonCreator
    public GemSkill(@JsonProperty("GemSlot") Integer gemSlot,
                    @JsonProperty("Name") String name,
                    @JsonProperty("Description") List<String> description) {
        this.gemSlot = gemSlot;
        this.name = name;
        this.description = description;
    }
}
