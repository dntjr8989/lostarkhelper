package com.kws.lostarkhelper.lostarkapi.url;

public enum MarketsUrl {

    GET_SEARCH_OPTIONS_FOR_MARKET("/options"),
    GET_MARKET_ITEM_BY_ID("/items/{itemId}"),
    POST_ALL_ACTIVE_MARKET_ITEMS_WITH_SEARCH_OPTIONS("/items")
    ;

    private final static String PREFIX = "/markets";
    private final String url;

    MarketsUrl(String url) {
        this.url = PREFIX + url;
    }

    public String url(){
        return this.url;
    }
}
