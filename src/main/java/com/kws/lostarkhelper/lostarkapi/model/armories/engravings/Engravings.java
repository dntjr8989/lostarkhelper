package com.kws.lostarkhelper.lostarkapi.model.armories.engravings;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class Engravings {

    private final List<Engraving> engravings;
    private final List<EngravingEffect> effects;
    private final List<EngravingArkPassiveEffect> arkPassiveEffects;

    @JsonCreator
    public Engravings(@JsonProperty("Engravings") List<Engraving> engravings,
                      @JsonProperty("Effects") List<EngravingEffect> effects,
                      @JsonProperty("ArkPassiveEffects") List<EngravingArkPassiveEffect> arkPassiveEffects) {
        this.engravings = engravings;
        this.effects = effects;
        this.arkPassiveEffects = arkPassiveEffects;
    }
}
