package com.fish.fire.auth;

import java.io.IOException;

import com.google.api.client.auth.oauth2.Credential;

public interface Authorization {

    Credential authorize() throws IOException;
}
