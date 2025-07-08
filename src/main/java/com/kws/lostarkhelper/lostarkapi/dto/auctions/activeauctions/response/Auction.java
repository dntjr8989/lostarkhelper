package com.kws.lostarkhelper.lostarkapi.dto.auctions.activeauctions.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class Auction {
    private final Integer pageNo;
    private final Integer pageSize;
    private final Integer totalCount;
    private final List<AuctionItem> items;

    @JsonCreator
    public Auction(@JsonProperty("PageNo") Integer pageNo,
                   @JsonProperty("PageSize") Integer pageSize,
                   @JsonProperty("TotalCount") Integer totalCount,
                   @JsonProperty("Items") List<AuctionItem> items) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        this.items = items;
    }
}
