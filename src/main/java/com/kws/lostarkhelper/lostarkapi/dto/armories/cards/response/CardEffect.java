package com.kws.lostarkhelper.lostarkapi.dto.armories.cards.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class CardEffect {

    private final Integer index;
    private final List<Integer> cardSlots;
    private final List<CardItem> cardItems;

    @JsonCreator
    public CardEffect(@JsonProperty("Index") Integer index,
                      @JsonProperty("CardSlots") List<Integer> cardSlots,
                      @JsonProperty("Items") List<CardItem> cardItems
    ) {
        this.index = index;
        this.cardSlots = cardSlots;
        this.cardItems = cardItems;
    }
}
