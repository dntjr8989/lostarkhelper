package com.kws.lostarkhelper.lostarkapi.model.armories.cards;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class CardItem {
    private final String name;
    private final String description;

    @JsonCreator
    public CardItem(@JsonProperty("Name") String name,
                    @JsonProperty("Description") String description) {
        this.name = name;
        this.description = description;
    }
}
