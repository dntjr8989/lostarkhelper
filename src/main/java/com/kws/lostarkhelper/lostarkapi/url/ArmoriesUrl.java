package com.kws.lostarkhelper.lostarkapi.url;

public enum ArmoriesUrl {

    GET_SUMMARY_PROFILE_INFO("/{characterName}"),
    GET_SUMMARY_BASIC_STATS("/{characterName}/profiles"),
    GET_SUMMARY_ITEMS("/{characterName}/equipment"),
    GET_SUMMARY_AVATARS("/{characterName}/avatars"),
    GET_SUMMARY_COMBAT_SKILL("/{characterName}/combat-skills"),
    GET_SUMMARY_ENGRAVINGS("/{characterName}/engravings"),
    GET_SUMMARY_CARDS("/{characterName}/cards"),
    GET_SUMMARY_GEMS("/{characterName}/gems"),
    GET_SUMMARY_PROVING_GROUNDS("/{characterName}/colosseums"),
    GET_SUMMARY_COLLECTIBLES("/{characterName}/collectibles"),
    GET_SUMMARY_ARKPASSIVE("/{characterName}/arkpassive")
    ;

    private static final String PREFIX = "/armories/characters";
    private final String url;

    ArmoriesUrl(String url) {
        this.url = PREFIX + url;
    }

    public String url() {
        return this.url;
    }
}
