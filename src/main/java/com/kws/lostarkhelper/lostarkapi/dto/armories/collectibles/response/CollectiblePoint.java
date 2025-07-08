package com.kws.lostarkhelper.lostarkapi.dto.armories.collectibles.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class CollectiblePoint {

    private final String pointName;
    private final Integer point;
    private final Integer maxPoint;

    @JsonCreator
    public CollectiblePoint(@JsonProperty("PointName") String pointName,
                            @JsonProperty("Point") Integer point,
                            @JsonProperty("MaxPoint") Integer maxPoint) {
        this.pointName = pointName;
        this.point = point;
        this.maxPoint = maxPoint;
    }
}
