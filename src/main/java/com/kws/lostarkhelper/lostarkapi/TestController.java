package com.kws.lostarkhelper.lostarkapi;

import com.kws.lostarkhelper.lostarkapi.model.armories.arkpassive.ArkPassive;
import com.kws.lostarkhelper.lostarkapi.model.armories.avatars.Avatar;
import com.kws.lostarkhelper.lostarkapi.model.armories.basicStats.BasicStats;
import com.kws.lostarkhelper.lostarkapi.model.armories.cards.Cards;
import com.kws.lostarkhelper.lostarkapi.model.armories.collectibles.Collectible;
import com.kws.lostarkhelper.lostarkapi.model.armories.combatSkills.CombatSkill;
import com.kws.lostarkhelper.lostarkapi.model.armories.gems.Gems;
import com.kws.lostarkhelper.lostarkapi.model.auctions.searchoptions.SearchOptions;
import com.kws.lostarkhelper.lostarkapi.model.characters.CharacterInfo;
import com.kws.lostarkhelper.lostarkapi.model.armories.items.Item;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public List<Item> getSummaryOfItems(@PathVariable("characterName") String characterName){
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
}
