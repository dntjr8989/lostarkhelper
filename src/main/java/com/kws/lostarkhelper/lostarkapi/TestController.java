package com.kws.lostarkhelper.lostarkapi;

import com.kws.lostarkhelper.lostarkapi.dto.armories.arkpassive.response.ArkPassive;
import com.kws.lostarkhelper.lostarkapi.dto.armories.avatars.response.Avatar;
import com.kws.lostarkhelper.lostarkapi.dto.armories.basicStats.response.BasicStats;
import com.kws.lostarkhelper.lostarkapi.dto.armories.cards.response.Cards;
import com.kws.lostarkhelper.lostarkapi.dto.armories.collectibles.response.Collectible;
import com.kws.lostarkhelper.lostarkapi.dto.armories.combatSkills.response.CombatSkill;
import com.kws.lostarkhelper.lostarkapi.dto.armories.gems.response.Gems;
import com.kws.lostarkhelper.lostarkapi.dto.armories.items.response.ArmoryEquipMent;
import com.kws.lostarkhelper.lostarkapi.dto.auctions.activeauctions.request.RequestAuctionItems;
import com.kws.lostarkhelper.lostarkapi.dto.auctions.activeauctions.response.Auction;
import com.kws.lostarkhelper.lostarkapi.dto.auctions.searchoptions.response.SearchOptions;
import com.kws.lostarkhelper.lostarkapi.dto.characters.response.CharacterInfo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
@Slf4j
public class TestController {

    private final LostArkAPIService lostArkAPIService;

    @GetMapping("/character/{characterName}")
    public List<CharacterInfo> getCharacterSiblings(@PathVariable("characterName") String characterName){
        log.info("test Controller.getCharacterSiblings() start ====== characterName {}", characterName);
        return this.lostArkAPIService.getCharacterSiblingsAPI(characterName);
    }

    @GetMapping("/armories/profile/characters/{characterName}")
    public BasicStats getSummaryOfBasicStats(@PathVariable("characterName") String characterName){
        return this.lostArkAPIService.getSummaryOfBasicStatsAPI(characterName);
    }

    @GetMapping("/armories/items/characters/{characterName}")
    public List<ArmoryEquipMent> getSummaryOfItems(@PathVariable("characterName") String characterName){
        return this.lostArkAPIService.getSummaryOfItemsAPI(characterName);
    }

    @GetMapping("/armories/avatars/characters/{characterName}")
    public List<Avatar> getSummaryOfAvatars(@PathVariable("characterName") String characterName){
        return this.lostArkAPIService.getSummaryOfAvatarsAPI(characterName);
    }

    @GetMapping("/armories/combatSkills/characters/{characterName}")
    public List<CombatSkill> getSummaryOfCombatSkills(@PathVariable("characterName") String characterName){
        return this.lostArkAPIService.getSummaryOfCombatSkills(characterName);
    }

    @GetMapping("/armories/cards/characters/{characterName}")
    public Cards getSummaryOfCards(@PathVariable("characterName") String characterName){
        return this.lostArkAPIService.getSummaryOfCardsAPI(characterName);
    }

    @GetMapping("/armories/gems/characters/{characterName}")
    public Gems getSummaryOfGems(@PathVariable("characterName") String characterName){
        return this.lostArkAPIService.getSummaryOfGemsAPI(characterName);
    }

    @GetMapping("/armories/collectibles/characters/{characterName}")
    public List<Collectible> getSummaryOfCollectibles(@PathVariable("characterName") String characterName){
        return this.lostArkAPIService.getSummaryOfCollectiblesAPI(characterName);
    }

    @GetMapping("/armories/arkpassive/characters/{characterName}")
    public ArkPassive getSummaryOfArkPassive(@PathVariable("characterName") String characterName){
        return this.lostArkAPIService.getSummaryOfArkPassiveAPI(characterName);
    }

    @GetMapping("/auctions/options")
    public SearchOptions getSearchOptionsForAuctionHouse(){
        return this.lostArkAPIService.getSearchOptionsForAuctionHouseAPI();
    }

    @PostMapping("/auctions/items")
    public Auction getAllActiveAuctionWithSearchOptions(@RequestBody RequestAuctionItems requestAuctionItems){
        return this.lostArkAPIService.getAllActiveAuctionWithSearchOptionsAPI(requestAuctionItems);
    }
}
