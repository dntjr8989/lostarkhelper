package com.kws.lostarkhelper.lostarkapi.dto.auctions.activeauctions.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class RequestAuctionItems {
    private final Integer itemLevelMin;
    private final Integer itemLevelMax;
    private final Integer itemGradeQuality;
    private final Integer itemUpgradeLevel;
    private final Integer itemTradeAllowCount;
    private final List<SearchDetailOption> skillOptions;
    private final List<SearchDetailOption> etcOptions;
    private final SortEnum sort;
    private final Integer categoryCode;
    private final String characterClass;
    private final Integer itemTier;
    private final String itemGrade;
    private final String itemName;
    private final Integer pageNo;
    private final SortConditionEnum sortCondition;

    @JsonCreator
    public RequestAuctionItems(@JsonProperty("ItemLevelMin") Integer itemLevelMin,
                               @JsonProperty("ItemLevelMax") Integer itemLevelMax,
                               @JsonProperty("ItemGradeQuality") Integer itemGradeQuality,
                               @JsonProperty("ItemUpgradeLevel") Integer itemUpgradeLevel,
                               @JsonProperty("ItemTradeAllowCount") Integer itemTradeAllowCount,
                               @JsonProperty("SkillOptions") List<SearchDetailOption> skillOptions,
                               @JsonProperty("EtcOptions") List<SearchDetailOption> etcOptions,
                               @JsonProperty("Sort") SortEnum sort,
                               @JsonProperty("CategoryCode") Integer categoryCode,
                               @JsonProperty("CharacterClass") String characterClass,
                               @JsonProperty("ItemTier") Integer itemTier,
                               @JsonProperty("ItemGrade") String itemGrade,
                               @JsonProperty("ItemName") String itemName,
                               @JsonProperty("PageNo") Integer pageNo,
                               @JsonProperty("SortCondition") SortConditionEnum sortCondition) {
        this.itemLevelMin = itemLevelMin;
        this.itemLevelMax = itemLevelMax;
        this.itemGradeQuality = itemGradeQuality;
        this.itemUpgradeLevel = itemUpgradeLevel;
        this.itemTradeAllowCount = itemTradeAllowCount;
        this.skillOptions = skillOptions;
        this.etcOptions = etcOptions;
        this.sort = sort;
        this.categoryCode = categoryCode;
        this.characterClass = characterClass;
        this.itemTier = itemTier;
        this.itemGrade = itemGrade;
        this.itemName = itemName;
        this.pageNo = pageNo;
        this.sortCondition = sortCondition;
    }

    @Override
    public String toString() {
        return "RequestAuctionItems{" +
                "itemLevelMin=" + itemLevelMin +
                ", itemLevelMax=" + itemLevelMax +
                ", itemGradeQuality=" + itemGradeQuality +
                ", itemUpgradeLevel=" + itemUpgradeLevel +
                ", itemTradeAllowCount=" + itemTradeAllowCount +
                ", skillOptions=" + skillOptions +
                ", etcOptions=" + etcOptions +
                ", sort=" + sort +
                ", categoryCode=" + categoryCode +
                ", characterClass='" + characterClass + '\'' +
                ", itemTier=" + itemTier +
                ", itemGrade='" + itemGrade + '\'' +
                ", itemName='" + itemName + '\'' +
                ", pageNo=" + pageNo +
                ", sortCondition=" + sortCondition +
                '}';
    }
}
