package com.kws.lostarkhelper.lostarkapi.dto.auctions.activeauctions.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class ItemOption {

    private final ItemOptionTypeEnum type;
    private final String optionName;
    private final String optionNameTripod;
    private final Double value;
    private final Boolean isPenalty;
    private final String className;
    private final Boolean isValuePercentage;

    @JsonCreator
    public ItemOption(@JsonProperty("Type") ItemOptionTypeEnum type,
                      @JsonProperty("OptionName") String optionName,
                      @JsonProperty("OptionNameTripod") String optionNameTripod,
                      @JsonProperty("Value") Double value,
                      @JsonProperty("IsPenalty") Boolean isPenalty,
                      @JsonProperty("ClassName") String className,
                      @JsonProperty("IsValuePercentage") Boolean isValuePercentage) {
        this.type = type;
        this.optionName = optionName;
        this.optionNameTripod = optionNameTripod;
        this.value = value;
        this.isPenalty = isPenalty;
        this.className = className;
        this.isValuePercentage = isValuePercentage;
    }
}
