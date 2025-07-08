package com.kws.lostarkhelper.lostarkapi.dto.auctions.searchoptions.response;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class Category {

    private final List<Sub> subs;
    private final Integer code;
    private final String codeName;

    @JsonCreator
    public Category(@JsonProperty("Subs") List<Sub> subs,
                    @JsonProperty("Code") Integer code,
                    @JsonProperty("CodeName") String codeName) {
        this.subs = subs;
        this.code = code;
        this.codeName = codeName;
    }
}
