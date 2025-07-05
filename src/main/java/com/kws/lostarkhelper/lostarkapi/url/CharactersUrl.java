package com.kws.lostarkhelper.lostarkapi.url;

public enum CharactersUrl {

    GET_CHARACTER_SIBLINGS("/{characterName}/siblings") //
    ;

    private final static String PREFIX = "/characters";
    private final String url;

    CharactersUrl(String url) {
        this.url = PREFIX + url;
    }

    public String url(){
        return this.url;
    }
}
