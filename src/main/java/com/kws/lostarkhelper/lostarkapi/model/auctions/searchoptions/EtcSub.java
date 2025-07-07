package com.kws.lostarkhelper.lostarkapi.model.auctions.searchoptions;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class EtcSub {
    private final Integer value;
    private final String text;
    private final String className;
    private final List<Integer> categorys;
    private final List<Integer> tiers;
    private final List<EtcValue> etcValues;

    @JsonCreator
    public EtcSub(@JsonProperty("Value") Integer value,
                  @JsonProperty("Text") String text,
                  @JsonProperty("Class") String className,
                  @JsonProperty("Categorys") List<Integer> categorys,
                  @JsonProperty("Tiers") List<Integer> tiers,
                  @JsonProperty("EtcValues") List<EtcValue> etcValues) {
        this.value = value;
        this.text = text;
        this.className = className;
        this.categorys = categorys;
        this.tiers = tiers;
        this.etcValues = etcValues;
    }
}
