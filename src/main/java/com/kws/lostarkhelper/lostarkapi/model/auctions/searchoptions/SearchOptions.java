package com.kws.lostarkhelper.lostarkapi.model.auctions.searchoptions;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class SearchOptions {
    private final String maxItemLevel;
    private final List<Integer> itemGradeQualities;
    private final List<SkillOption> skillOptions;
    private final List<EtcOption> etcOptions;
    private final List<Category> categories;
    private final List<String> itemGrades;
    private final List<Integer> itemTiers;
    private final List<String> classes;

    @JsonCreator
    public SearchOptions(@JsonProperty("MaxItemLevel") String maxItemLevel,
                         @JsonProperty("ItemGradeQualities") List<Integer> itemGradeQualities,
                         @JsonProperty("SkillOptions") List<SkillOption> skillOptions,
                         @JsonProperty("EtcOptions") List<EtcOption> etcOptions,
                         @JsonProperty("Categories") List<Category> categories,
                         @JsonProperty("ItemGrades") List<String> itemGrades,
                         @JsonProperty("ItemTiers") List<Integer> itemTiers,
                         @JsonProperty("Classes") List<String> classes) {
        this.maxItemLevel = maxItemLevel;
        this.itemGradeQualities = itemGradeQualities;
        this.skillOptions = skillOptions;
        this.etcOptions = etcOptions;
        this.categories = categories;
        this.itemGrades = itemGrades;
        this.itemTiers = itemTiers;
        this.classes = classes;
    }
}
