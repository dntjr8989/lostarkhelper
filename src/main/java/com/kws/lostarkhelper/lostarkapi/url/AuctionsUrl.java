package com.kws.lostarkhelper.lostarkapi.url;

public enum AuctionsUrl implements LostArkUrl{

    GET_SEARCH_OPTIONS_FOR_AUCTION_HOUSE("/options"),
    POST_ALL_ACTIVE_AUCTIONS_WITH_SEARCH_OPTIONS("/items")
    ;

    private final static String PREFIX = "/auctions";
    private final String url;

    AuctionsUrl(String url) {
        this.url = PREFIX + url;
    }

    @Override
    public String url(){
        return this.url;
    }
}
