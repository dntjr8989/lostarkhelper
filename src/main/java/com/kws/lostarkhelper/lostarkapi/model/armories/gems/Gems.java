package com.kws.lostarkhelper.lostarkapi.model.armories.gems;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class Gems {

    private final List<Gem> gems;
    private final GemEffects gemEffects;

    @JsonCreator
    public Gems(@JsonProperty("Gems") List<Gem> gems,
                @JsonProperty("Effects") GemEffects gemEffects) {
        this.gems = gems;
        this.gemEffects = gemEffects;
    }
}
