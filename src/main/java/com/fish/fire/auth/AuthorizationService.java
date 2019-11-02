package com.fish.fire.auth;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Collections;
import java.util.List;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import static com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets.load;

@Slf4j
@AllArgsConstructor
public class AuthorizationService implements Authorization {

    private static final String clientSecrets = "/client_secrets.json";
    private final List<String> scopes= Collections.singletonList("https://www.googleapis.com/auth/youtube.readonly");

    private final JsonFactory jsonFactory;
    private final NetHttpTransport httpTransport;

    @Override
    public Credential authorize() throws IOException {
        // Load client secrets.
        Reader clientSecretReader = new InputStreamReader(AuthorizationService.class.getResourceAsStream(clientSecrets));
        GoogleClientSecrets clientSecrets = load(jsonFactory, clientSecretReader);
        // Build flow and trigger user authorization request.
        GoogleAuthorizationCodeFlow flow =
                new GoogleAuthorizationCodeFlow.Builder(httpTransport, jsonFactory, clientSecrets, scopes)
                        .build();

        return new AuthorizationCodeInstalledApp(flow, new LocalServerReceiver()).authorize("user");
    }
}
