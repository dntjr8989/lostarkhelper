package com.kws.lostarkhelper.lostarkapi;

import org.springframework.web.client.RestClient;

public class LostArkAPI {
    private final RestClient restClient;

    public LostArkAPI(){


        this.restClient = RestClient.builder()
                .baseUrl("https://developer-lostark.game.onstove.com")
                .defaultHeader("Authorization", "{jwt 토큰}")
                .build();

    }

    public void callAPI(){
        System.out.println(restClient.get()
                .uri("/characters/모코콩모코콩모코콩/siblings")
                .retrieve()
                .body(String.class)
        );
    }
}
