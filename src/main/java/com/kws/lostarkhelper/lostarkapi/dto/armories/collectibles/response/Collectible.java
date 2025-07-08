package com.kws.lostarkhelper.lostarkapi.dto.armories.collectibles.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class Collectible {
    private final String type;
    private final String icon;
    private final Integer point;
    private final Integer maxPoint;
    private final List<CollectiblePoint> collectiblePoints;

    @JsonCreator
    public Collectible(@JsonProperty("Type") String type,
                       @JsonProperty("Icon") String icon,
                       @JsonProperty("Point") Integer point,
                       @JsonProperty("MaxPoint") Integer maxPoint,
                       @JsonProperty("CollectiblePoints") List<CollectiblePoint> collectiblePoints) {
        this.type = type;
        this.icon = icon;
        this.point = point;
        this.maxPoint = maxPoint;
        this.collectiblePoints = collectiblePoints;
    }
}
