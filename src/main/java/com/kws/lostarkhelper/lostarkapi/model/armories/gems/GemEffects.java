package com.kws.lostarkhelper.lostarkapi.model.armories.gems;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class GemEffects {

    private final String description;
    private final List<GemSkill> skills;

    @JsonCreator
    public GemEffects(@JsonProperty("Description") String description,
                     @JsonProperty("Skills") List<GemSkill> skills) {
        this.description = description;
        this.skills = skills;
    }
}
