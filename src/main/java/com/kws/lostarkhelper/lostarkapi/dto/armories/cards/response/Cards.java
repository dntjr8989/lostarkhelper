package com.kws.lostarkhelper.lostarkapi.dto.armories.cards.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class Cards {

    private final List<Card> cards;
    private final List<CardEffect> effects;

    @JsonCreator
    public Cards(
            @JsonProperty("Cards") List<Card> cards,
            @JsonProperty("Effects") List<CardEffect> effects) {
        this.cards = cards;
        this.effects = effects;
    }
}
