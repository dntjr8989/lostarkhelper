package com.kws.lostarkhelper.lostarkapi.dto.auctions.activeauctions.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class AuctionInfo {
    private final Integer startPrice;
    private final Integer buyPrice;
    private final Integer bidPrice;
    private final String endDate;
    private final Integer bidCount;
    private final Integer bidStartPrice;
    private final Boolean isCompetitive;
    private final Integer tradeAllowCount;
    private final Integer upgradeLevel;

    @JsonCreator
    public AuctionInfo(@JsonProperty("StartPrice") Integer startPrice,
                       @JsonProperty("BuyPrice") Integer buyPrice,
                       @JsonProperty("BidPrice") Integer bidPrice,
                       @JsonProperty("EndDate") String endDate,
                       @JsonProperty("BidCount") Integer bidCount,
                       @JsonProperty("BidStartPrice") Integer bidStartPrice,
                       @JsonProperty("IsCompetitive") Boolean isCompetitive,
                       @JsonProperty("TradeAllowCount")Integer tradeAllowCount,
                       @JsonProperty("UpgradeLevel") Integer upgradeLevel) {
        this.startPrice = startPrice;
        this.buyPrice = buyPrice;
        this.bidPrice = bidPrice;
        this.endDate = endDate;
        this.bidCount = bidCount;
        this.bidStartPrice = bidStartPrice;
        this.isCompetitive = isCompetitive;
        this.tradeAllowCount = tradeAllowCount;
        this.upgradeLevel = upgradeLevel;
    }
}
