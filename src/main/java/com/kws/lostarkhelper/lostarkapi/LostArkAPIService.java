package com.kws.lostarkhelper.lostarkapi;

import com.kws.lostarkhelper.lostarkapi.dto.CharacterInfo;
import com.kws.lostarkhelper.lostarkapi.url.CharactersUrl;
import com.kws.lostarkhelper.lostarkapi.url.LostArkUrlBuilder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class LostArkAPIService {

    private final RestClient lostArkRestClient;

    public List<CharacterInfo> getCharacterSiblingsAPI(String characterName){

        log.info("LostArkAPIService.getCharacterSiblingsAPI start");

        String url = new LostArkUrlBuilder<>(CharactersUrl.GET_CHARACTER_SIBLINGS)
                .param("characterName", characterName)
                .build();
        log.info("url : {}", url);

        return lostArkRestClient.get()
                .uri(url)
                .retrieve()
                .onStatus(HttpStatusCode::is4xxClientError, (req,res)->{
                  log.error("4xx Error");
                })
                .onStatus(HttpStatusCode::is5xxServerError, (req,res)->{
                    log.error("5xx Error");
                })
                .body(new ParameterizedTypeReference<List<CharacterInfo>>() {
                });
    }
}
