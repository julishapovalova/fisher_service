package com.fish.fire.search;

import java.io.IOException;

import com.google.api.services.youtube.YouTube;
import com.google.api.services.youtube.model.SearchListResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class SearchService implements Search {

    private final YouTube youtubeService;

    @Override
    public SearchListResponse search(String keyword, long maxResult) throws IOException {
        YouTube.Search.List request = youtubeService.search()
                                                    .list("snippet");

        SearchListResponse response = request.setMaxResults(maxResult)
                                             .setQ(keyword)
                                             .execute();

        return response;
    }
}
