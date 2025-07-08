package com.kws.lostarkhelper.lostarkapi.dto.auctions.activeauctions.request;

import lombok.Getter;

@Getter
public enum SortConditionEnum {

    ASC("ASC"),
    DESC("DESC")
    ;

    private final String sortCondition;

    SortConditionEnum(String sortCondition) {
        this.sortCondition = sortCondition;
    }

    public String sortCondition(){
        return this.sortCondition;
    }
}
