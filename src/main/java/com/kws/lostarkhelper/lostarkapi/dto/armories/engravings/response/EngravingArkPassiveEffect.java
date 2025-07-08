package com.kws.lostarkhelper.lostarkapi.dto.armories.engravings.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class EngravingArkPassiveEffect {

    private final Integer abilityStoneLevel;
    private final String grade;
    private final Integer level;
    private final String name;
    private final String description;

    @JsonCreator
    public EngravingArkPassiveEffect(@JsonProperty("AbilityStoneLevel") Integer abilityStoneLevel,
                            @JsonProperty("Grade") String grade,
                            @JsonProperty("Level") Integer level,
                            @JsonProperty("Name") String name,
                            @JsonProperty("Description") String description) {
        this.abilityStoneLevel = abilityStoneLevel;
        this.grade = grade;
        this.level = level;
        this.name = name;
        this.description = description;
    }
}
