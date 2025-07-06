package com.kws.lostarkhelper.lostarkapi;

import com.kws.lostarkhelper.lostarkapi.dto.CharacterInfo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
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
}
