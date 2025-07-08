package com.kws.lostarkhelper.lostarkapi.dto.auctions.activeauctions.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class AuctionItem {

    private final String name;
    private final String grade;
    private final Integer tier;
    private final Integer level;
    private final String icon;
    private final Integer gradeQuality;
    private final AuctionInfo auctionInfo;
    private final List<ItemOption> options;

    @JsonCreator
    public AuctionItem(@JsonProperty("Name") String name,
                       @JsonProperty("Grade") String grade,
                       @JsonProperty("Tier") Integer tier,
                       @JsonProperty("Level") Integer level,
                       @JsonProperty("Icon") String icon,
                       @JsonProperty("GradeQuality") Integer gradeQuality,
                       @JsonProperty("AuctionInfo") AuctionInfo auctionInfo,
                       @JsonProperty("Options") List<ItemOption> options) {
        this.name = name;
        this.grade = grade;
        this.tier = tier;
        this.level = level;
        this.icon = icon;
        this.gradeQuality = gradeQuality;
        this.auctionInfo = auctionInfo;
        this.options = options;
    }
}
