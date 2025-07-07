package com.kws.lostarkhelper.lostarkapi;

import com.kws.lostarkhelper.lostarkapi.model.armories.arkpassive.ArkPassive;
import com.kws.lostarkhelper.lostarkapi.model.armories.avatars.Avatar;
import com.kws.lostarkhelper.lostarkapi.model.armories.basicStats.BasicStats;
import com.kws.lostarkhelper.lostarkapi.model.armories.cards.Cards;
import com.kws.lostarkhelper.lostarkapi.model.armories.collectibles.Collectible;
import com.kws.lostarkhelper.lostarkapi.model.armories.combatSkills.CombatSkill;
import com.kws.lostarkhelper.lostarkapi.model.armories.engravings.Engravings;
import com.kws.lostarkhelper.lostarkapi.model.armories.gems.Gems;
import com.kws.lostarkhelper.lostarkapi.model.auctions.searchoptions.SearchOptions;
import com.kws.lostarkhelper.lostarkapi.model.characters.CharacterInfo;
import com.kws.lostarkhelper.lostarkapi.model.armories.items.Item;
import com.kws.lostarkhelper.lostarkapi.url.ArmoriesUrl;
import com.kws.lostarkhelper.lostarkapi.url.AuctionsUrl;
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

    //Characters API
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

    //Armories API
    public BasicStats getSummaryOfBasicStatsAPI(String characterName){
        log.info("LostArkAPIService.getSummaryOfBasicStatsAPI start");

        String url = new LostArkUrlBuilder<>(ArmoriesUrl.GET_SUMMARY_BASIC_STATS)
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
                .body(BasicStats.class);
    }

    public List<Item> getSummaryOfItemsAPI(String characterName) {

        log.info("LostArkAPIService.getItemsAPI start");

        String url = new LostArkUrlBuilder<>(ArmoriesUrl.GET_SUMMARY_ITEMS)
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
                .body(new ParameterizedTypeReference<List<Item>>() {
                });
    }

    public List<Avatar> getSummaryOfAvatarsAPI(String characterName){

        log.info("LostArkAPIService.getSummaryOfAvatarsAPI start");

        String url = new LostArkUrlBuilder<>(ArmoriesUrl.GET_SUMMARY_ITEMS)
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
                .body(new ParameterizedTypeReference<List<Avatar>>() {
                });

    }

    public List<CombatSkill> getSummaryOfCombatSkills(String characterName){
        log.info("LostArkAPIService.getSummaryOfCombatSkills start");

        String url = new LostArkUrlBuilder<>(ArmoriesUrl.GET_SUMMARY_COMBAT_SKILL)
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
                .body(new ParameterizedTypeReference<List<CombatSkill>>() {
                });

    }

    public Engravings getSummaryOfEngravingsAPI(String characterName){
        log.info("LostArkAPIService.getSummaryOfEngravingsAPI start");

        String url = new LostArkUrlBuilder<>(ArmoriesUrl.GET_SUMMARY_ENGRAVINGS)
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
                .body(Engravings.class);
    }

    public Cards getSummaryOfCardsAPI(String characterName){
        log.info("LostArkAPIService.getSummaryOfCardsAPI start");

        String url = new LostArkUrlBuilder<>(ArmoriesUrl.GET_SUMMARY_CARDS)
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
                .body(Cards.class);
    }

    public Gems getSummaryOfGemsAPI(String characterName) {
        log.info("LostArkAPIService.getSummaryOfGemsAPI start");

        String url = new LostArkUrlBuilder<>(ArmoriesUrl.GET_SUMMARY_GEMS)
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
                .body(Gems.class);
    }

    public List<Collectible> getSummaryOfCollectiblesAPI(String characterName) {

        log.info("LostArkAPIService.getSummaryOfCollectiblesAPI start");

        String url = new LostArkUrlBuilder<>(ArmoriesUrl.GET_SUMMARY_COLLECTIBLES)
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
                .body(new ParameterizedTypeReference<List<Collectible>>() {
                });
    }

    public ArkPassive getSummaryOfArkPassiveAPI(String characterName) {
        log.info("LostArkAPIService.getSummaryOfArkPassiveAPI start");

        String url = new LostArkUrlBuilder<>(ArmoriesUrl.GET_SUMMARY_ARKPASSIVE)
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
                .body(ArkPassive.class);
    }

    //Auctions API
    public SearchOptions getSearchOptionsForAuctionHouseAPI(){
        log.info("LostArkAPIService.getSearchOptionsForAuctionHouseAPI start");

        String url = new LostArkUrlBuilder<>(AuctionsUrl.GET_SEARCH_OPTIONS_FOR_AUCTION_HOUSE)
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
                .body(SearchOptions.class);
    }
}
