package com.kws.lostarkhelper.lostarkapi.dto.auctions.searchoptions.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class TripodOption {

    private final Integer value;
    private final String text;
    private final Boolean isGem;
    private final List<Integer> tiers;

    @JsonCreator
    public TripodOption(@JsonProperty("Value") Integer value,
                        @JsonProperty("Text") String text,
                        @JsonProperty("IsGem") Boolean isGem,
                        @JsonProperty("Tiers") List<Integer> tiers) {
        this.value = value;
        this.text = text;
        this.isGem = isGem;
        this.tiers = tiers;
    }
}
