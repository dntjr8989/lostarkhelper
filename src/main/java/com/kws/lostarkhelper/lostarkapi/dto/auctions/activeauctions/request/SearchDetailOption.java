package com.kws.lostarkhelper.lostarkapi.dto.auctions.activeauctions.request;

import lombok.Getter;

@Getter
public class SearchDetailOption {
    private final Integer FirstOption;
    private final Integer SecondOption;
    private final Integer MinValue;
    private final Integer MaxValue;

    public SearchDetailOption(Integer firstOption, Integer secondOption, Integer minValue, Integer maxValue) {
        FirstOption = firstOption;
        SecondOption = secondOption;
        MinValue = minValue;
        MaxValue = maxValue;
    }
}
