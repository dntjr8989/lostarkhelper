package com.kws.lostarkhelper.lostarkapi.model.armories.arkpassive;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class ArkPassive {

    private final Boolean isArkPassive;
    private final List<ArkPassivePoint> points;
    private final List<ArkPassiveEffect> effects;

    @JsonCreator
    public ArkPassive(@JsonProperty("IsArkPassive") Boolean isArkPassive,
                      @JsonProperty("Points") List<ArkPassivePoint> points,
                      @JsonProperty("Effects") List<ArkPassiveEffect> effects) {
        this.isArkPassive = isArkPassive;
        this.points = points;
        this.effects = effects;
    }
}
