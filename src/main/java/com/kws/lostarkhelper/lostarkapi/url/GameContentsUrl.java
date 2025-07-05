package com.kws.lostarkhelper.lostarkapi.url;

public enum GameContentsUrl implements LostArkUrl{

    GET_LIST_OF_CALENDER_THIS_WEEK("/calendar")
    ;
    private final static String PREFIX = "/gamecontents";
    private final String url;

    GameContentsUrl(String url) {
        this.url = PREFIX + url;
    }

    @Override
    public String url(){
        return this.url;
    }
}
