package com.fish.fire.search;

import java.io.IOException;

import com.google.api.services.youtube.model.SearchListResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@RequestMapping("player")
@AllArgsConstructor
@Slf4j
public class SearchController {

    private final Search searchService;

    @GetMapping("fire")
    public RedirectView fire() {
        return new RedirectView("https://youtu.be/r32LcBqiv7I?t=34");
    }

    @GetMapping("/search")
    public String search(@RequestParam(name = "keyword", required = false, defaultValue = "MAMBO ITALIANO") String keyword) throws IOException {
        SearchListResponse searchListResponse = searchService.search(keyword, 1L);
        return searchListResponse.toString();
    }
}
