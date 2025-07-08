package com.kws.lostarkhelper.lostarkapi.dto.armories.basicStats.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class BasicStats {
    private final String characterImage;
    private final Integer expeditionLevel;
    private final String pvpGradeName;
    private final Integer townLevel;
    private final String townName;
    private final String title;
    private final String guildMemberGrade;
    private final String guildName;
    private final Integer usingSkillPoint;
    private final Integer totalSkillPoint;
    private final List<Stat> stats;
    private final List<Tendency> tendencies;
    private final String combatPower;
    private final Decoration decorations;
    private final String serverName;
    private final String characterName;
    private final Integer characterLevel;
    private final String characterClassName;
    private final String itemAvgLevel;

    @JsonCreator

    public BasicStats(@JsonProperty("CharacterImage") String characterImage,
                      @JsonProperty("ExpeditionLevel") Integer expeditionLevel,
                      @JsonProperty("PvpGradeName") String pvpGradeName,
                      @JsonProperty("TownLevel") Integer townLevel,
                      @JsonProperty("TownName") String townName,
                      @JsonProperty("Title") String title,
                      @JsonProperty("GuildMemberGrade") String guildMemberGrade,
                      @JsonProperty("GuildName") String guildName,
                      @JsonProperty("UsingSkillPoint") Integer usingSkillPoint,
                      @JsonProperty("TotalSkillPoint") Integer totalSkillPoint,
                      @JsonProperty("Stats") List<Stat> stats,
                      @JsonProperty("Tendencies") List<Tendency> tendencies,
                      @JsonProperty("CombatPower") String combatPower,
                      @JsonProperty("Decorations") Decoration decorations,
                      @JsonProperty("ServerName") String serverName,
                      @JsonProperty("CharacterName") String characterName,
                      @JsonProperty("CharacterLevel") Integer characterLevel,
                      @JsonProperty("CharacterClassName") String characterClassName,
                      @JsonProperty("ItemAvgLevel") String itemAvgLevel) {
        this.characterImage = characterImage;
        this.expeditionLevel = expeditionLevel;
        this.pvpGradeName = pvpGradeName;
        this.townLevel = townLevel;
        this.townName = townName;
        this.title = title;
        this.guildMemberGrade = guildMemberGrade;
        this.guildName = guildName;
        this.usingSkillPoint = usingSkillPoint;
        this.totalSkillPoint = totalSkillPoint;
        this.stats = stats;
        this.tendencies = tendencies;
        this.combatPower = combatPower;
        this.decorations = decorations;
        this.serverName = serverName;
        this.characterName = characterName;
        this.characterLevel = characterLevel;
        this.characterClassName = characterClassName;
        this.itemAvgLevel = itemAvgLevel;
    }
}
