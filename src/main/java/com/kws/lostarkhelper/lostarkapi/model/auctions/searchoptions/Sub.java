package com.kws.lostarkhelper.lostarkapi.model.auctions.searchoptions;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class Sub {

    private final Integer code;
    private final String codeName;

    @JsonCreator
    public Sub(@JsonProperty("Code") Integer code,
               @JsonProperty("CodeName") String codeName) {
        this.code = code;
        this.codeName = codeName;
    }
}
