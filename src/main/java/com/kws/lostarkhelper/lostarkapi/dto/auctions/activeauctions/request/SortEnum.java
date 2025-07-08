package com.kws.lostarkhelper.lostarkapi.dto.auctions.activeauctions.request;

import lombok.Getter;

@Getter
public enum SortEnum {
    BIDSTART_PRICE("BIDSTART_PRICE"),
    BUY_PRICE("BUY_PRICE"),
    EXPIREDATE("EXPIREDATE"),
    ITEM_GRADE("ITEM_GRADE"),
    ITEM_LEVEL("ITEM_LEVEL"),
    ITEM_QUALITY("ITEM_QUALITY");

    private final String sort;

    SortEnum(String sort) {
        this.sort = sort;
    }
}
