package com.kws.lostarkhelper.lostarkapi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class LostArkRestClientConfig {

    @Value("${lostark.api.jwt}")
    private String lostArkJwt;

    @Bean
    public RestClient lostArkRestClient(){
        return RestClient.builder()
                .baseUrl("https://developer-lostark.game.onstove.com")
                .defaultHeader("Authorization", "bearer " + lostArkJwt)
                .build();
    }
}
