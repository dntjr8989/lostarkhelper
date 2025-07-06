package com.kws.lostarkhelper.lostarkapi.model.armories.basicStats;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class Tendency {
    private final String type;
    private final Integer point;
    private final Integer maxPoint;

    @JsonCreator
    public Tendency(@JsonProperty("Type") String type,
                    @JsonProperty("Point") Integer point,
                    @JsonProperty("MaxPoint") Integer maxPoint) {
        this.type = type;
        this.point = point;
        this.maxPoint = maxPoint;
    }
}
