package com.kws.lostarkhelper.lostarkapi.model.characters;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class CharacterInfo {

    private final String serverName;
    private final String characterName;
    private final Integer characterLevel;
    private final String characterClassName;
    private final String itemAvgLevel;

    @JsonCreator
    public CharacterInfo(@JsonProperty("ServerName") String serverName,
                         @JsonProperty("CharacterName") String characterName,
                         @JsonProperty("CharacterLevel") Integer characterLevel,
                         @JsonProperty("CharacterClassName") String characterClassName,
                         @JsonProperty("ItemAvgLevel") String itemAvgLevel){
        this.serverName = serverName;
        this.characterName = characterName;
        this.characterLevel = characterLevel;
        this.characterClassName = characterClassName;
        this.itemAvgLevel = itemAvgLevel;
    }
}

