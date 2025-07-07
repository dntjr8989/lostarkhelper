package com.kws.lostarkhelper.lostarkapi.model.auctions.searchoptions;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class SkillOption {

    private final Integer value;
    private final String className;
    private final String text;
    private final Boolean isSkillGroup;
    private final List<TripodOption> tripods;

    @JsonCreator
    public SkillOption(@JsonProperty("Value") Integer value,
                       @JsonProperty("Class") String className,
                       @JsonProperty("Text") String text,
                       @JsonProperty("IsSkillGroup") Boolean isSkillGroup,
                       @JsonProperty("Tripods") List<TripodOption> tripods) {
        this.value = value;
        this.className = className;
        this.text = text;
        this.isSkillGroup = isSkillGroup;
        this.tripods = tripods;
    }
}
