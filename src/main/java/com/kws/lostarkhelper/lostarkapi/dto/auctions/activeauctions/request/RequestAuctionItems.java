package com.kws.lostarkhelper.lostarkapi.dto.auctions.activeauctions.request;

import lombok.Getter;

import java.util.List;

@Getter
public class RequestAuctionItems {
    private final Integer ItemLevelMin;
    private final Integer ItemLevelMax;
    private final Integer ItemGradeQuality;
    private final Integer ItemUpgradeLevel;
    private final Integer ItemTradeAllowCount;
    private final List<SearchDetailOption> SkillOptions;
    private final List<SearchDetailOption> EtcOptions;
    private final SortEnum Sort;
    private final Integer CategoryCode;
    private final String CharacterClass;
    private final Integer ItemTier;
    private final String ItemGrade;
    private final String ItemName;
    private final Integer PageNo;
    private final SortConditionEnum SortCondition;

    public RequestAuctionItems(Integer itemLevelMin, Integer itemLevelMax, Integer itemGradeQuality, Integer itemUpgradeLevel, Integer itemTradeAllowCount, List<SearchDetailOption> skillOptions, List<SearchDetailOption> etcOptions, SortEnum sort, Integer categoryCode, String characterClass, Integer itemTier, String itemGrade, String itemName, Integer pageNo, SortConditionEnum sortCondition) {
        ItemLevelMin = itemLevelMin;
        ItemLevelMax = itemLevelMax;
        ItemGradeQuality = itemGradeQuality;
        ItemUpgradeLevel = itemUpgradeLevel;
        ItemTradeAllowCount = itemTradeAllowCount;
        SkillOptions = skillOptions;
        EtcOptions = etcOptions;
        Sort = sort;
        CategoryCode = categoryCode;
        CharacterClass = characterClass;
        ItemTier = itemTier;
        ItemGrade = itemGrade;
        ItemName = itemName;
        PageNo = pageNo;
        SortCondition = sortCondition;
    }
}
