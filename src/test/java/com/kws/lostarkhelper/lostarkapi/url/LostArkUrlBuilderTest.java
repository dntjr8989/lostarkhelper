package com.kws.lostarkhelper.lostarkapi.url;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LostArkUrlBuilderTest {

    @Test
    @DisplayName("Armories URL 생성 테스트")
    void makeArmoriesUrl() {

        String url = new LostArkUrlBuilder<>(ArmoriesUrl.GET_SUMMARY_ARKPASSIVE)
                .param("characterName", "testName")
                .build();

        assertEquals("/armories/characters/testName/arkpassive", url);

    }

    @Test
    @DisplayName("Auctions URL 생성 테스트")
    void makeAuctionsUrl() {
        String url = new LostArkUrlBuilder<>(AuctionsUrl.GET_SEARCH_OPTIONS_FOR_AUCTION_HOUSE)
                .build();

        assertEquals("/auctions/options", url);

    }

    @Test
    @DisplayName("Character URL 생성 테스트")
    void makeCharacterUrl() {
        String url = new LostArkUrlBuilder<>(CharactersUrl.GET_CHARACTER_SIBLINGS)
                .param("characterName", "testName")
                .build();

        assertEquals("/characters/testName/siblings", url);

    }

    @Test
    @DisplayName("GameContent URL 생성 테스트")
    void makeGameContentsUrl() {
        String url = new LostArkUrlBuilder<>(GameContentsUrl.GET_LIST_OF_CALENDER_THIS_WEEK)
                .build();

        assertEquals("/gamecontents/calendar", url);


    }

    @Test
    @DisplayName("Market URL 생성 테스트")
    void makeMarketsUrl() {
        String url = new LostArkUrlBuilder<>(MarketsUrl.GET_MARKET_ITEM_BY_ID)
                .param("itemId", "testItemId")
                .build();

        assertEquals("/markets/items/testItemId", url);

    }
}