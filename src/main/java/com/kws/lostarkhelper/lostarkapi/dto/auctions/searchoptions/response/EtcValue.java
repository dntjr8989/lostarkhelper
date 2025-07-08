package com.kws.lostarkhelper.lostarkapi.dto.auctions.searchoptions.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class EtcValue {

    private final String displayValue;
    private final Integer value;
    private final Boolean isPercentage;

    @JsonCreator
    public EtcValue(@JsonProperty("DisplayValue") String displayValue,
                    @JsonProperty("Value") Integer value,
                    @JsonProperty("IsPercentage") Boolean isPercentage) {
        this.displayValue = displayValue;
        this.value = value;
        this.isPercentage = isPercentage;
    }
}
