package com.fish.fire.search;

import java.io.IOException;

import com.fish.fire.auth.Authorization;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.services.youtube.YouTube;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("/youtube.properties")
public class SearchConfiguration {

    @Bean
    public YouTube youTube(NetHttpTransport httpTransport,
                           JsonFactory jsonFactory,
                           Authorization authorizationController,
                           @Value("${youtube.application.name}") String applicationName) throws IOException {

        return new YouTube.Builder(httpTransport,
                                   jsonFactory,
                                   authorizationController.authorize())
                .setApplicationName(applicationName)
                .build();
    }

    @Bean
    public Search search(YouTube youTube) {
        return new SearchService(youTube);
    }
}
