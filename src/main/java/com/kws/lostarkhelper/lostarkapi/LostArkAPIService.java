package com.kws.lostarkhelper.lostarkapi;

import com.kws.lostarkhelper.lostarkapi.dto.armories.arkpassive.response.ArkPassive;
import com.kws.lostarkhelper.lostarkapi.dto.armories.avatars.response.Avatar;
import com.kws.lostarkhelper.lostarkapi.dto.armories.basicStats.response.BasicStats;
import com.kws.lostarkhelper.lostarkapi.dto.armories.cards.response.Cards;
import com.kws.lostarkhelper.lostarkapi.dto.armories.collectibles.response.Collectible;
import com.kws.lostarkhelper.lostarkapi.dto.armories.combatSkills.response.CombatSkill;
import com.kws.lostarkhelper.lostarkapi.dto.armories.engravings.response.Engravings;
import com.kws.lostarkhelper.lostarkapi.dto.armories.gems.response.Gems;
import com.kws.lostarkhelper.lostarkapi.dto.auctions.activeauctions.request.RequestAuctionItems;
import com.kws.lostarkhelper.lostarkapi.dto.auctions.activeauctions.response.Auction;
import com.kws.lostarkhelper.lostarkapi.dto.auctions.activeauctions.response.AuctionInfo;
import com.kws.lostarkhelper.lostarkapi.dto.auctions.searchoptions.response.SearchOptions;
import com.kws.lostarkhelper.lostarkapi.dto.characters.response.CharacterInfo;
import com.kws.lostarkhelper.lostarkapi.dto.armories.items.response.ArmoryEquipMent;
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

    public List<ArmoryEquipMent> getSummaryOfItemsAPI(String characterName) {

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
                .body(new ParameterizedTypeReference<List<ArmoryEquipMent>>() {
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

    public Auction getAllActiveAuctionWithSearchOptionsAPI(RequestAuctionItems requestAuctionItems){
        log.info("LostArkAPIService.getAllActiveAuctionWithSearchOptionsAPI start");

        String url = new LostArkUrlBuilder<>(AuctionsUrl.POST_ALL_ACTIVE_AUCTIONS_WITH_SEARCH_OPTIONS)
                .build();
        log.info("url : {}", url);

        return lostArkRestClient.post()
                .uri(url)
                .body(requestAuctionItems)
                .retrieve()
                .onStatus(HttpStatusCode::is4xxClientError, (req,res)->{
                    log.error("4xx Error");
                })
                .onStatus(HttpStatusCode::is5xxServerError, (req,res)->{
                    log.error("5xx Error");
                })
                .body(Auction.class);
    }
}
