package com.kws.lostarkhelper.lostarkapi.dto.auctions.searchoptions.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class EtcOption {

    private final Integer value;
    private final String text;
    private final List<Integer> tiers;
    private final List<EtcSub> etcSubs;

    @JsonCreator
    public EtcOption(@JsonProperty("Value") Integer value,
                     @JsonProperty("Text") String text,
                     @JsonProperty("Tiers") List<Integer> tiers,
                     @JsonProperty("EtcSubs") List<EtcSub> etcSubs) {
        this.value = value;
        this.text = text;
        this.tiers = tiers;
        this.etcSubs = etcSubs;
    }
}
