package com.fish.fire.search;

import java.io.IOException;

import com.google.api.services.youtube.model.SearchListResponse;

public interface Search {

    SearchListResponse search(String keyword, long maxResult) throws IOException;
}
