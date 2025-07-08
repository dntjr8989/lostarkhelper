package com.kws.lostarkhelper.lostarkapi.dto.auctions.activeauctions.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class SearchDetailOption {
    private final Integer firstOption;
    private final Integer secondOption;
    private final Integer minValue;
    private final Integer maxValue;

    @JsonCreator

    public SearchDetailOption(@JsonProperty("FirstOption") Integer firstOption,
                              @JsonProperty("SecondOption") Integer secondOption,
                              @JsonProperty("MinValue") Integer minValue,
                              @JsonProperty("MaxValue") Integer maxValue) {
        this.firstOption = firstOption;
        this.secondOption = secondOption;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }
}
