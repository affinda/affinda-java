package com.affinda.api.client;

import com.azure.core.credential.AccessToken;
import com.azure.core.credential.TokenCredential;
import com.azure.core.credential.TokenRequestContext;
import reactor.core.publisher.Mono;

public class AffindaTokenCredential implements TokenCredential {
    private final AccessToken APIToken;

    /**
     * Creates an instance of the AffindaTokenCredneital.
     */
    public AffindaTokenCredential(String APIKey) {
        this.APIToken = new AccessToken(APIKey, null);
    }

    public AccessToken getAPIToken() {
        return APIToken;
    }

    /**
     * Just returns the API token
     *
     * @param request the details of the token request
     * @return a Publisher that emits a single access token
     */
    @Override
    public Mono<AccessToken> getToken(TokenRequestContext request) {
        return Mono.just(this.getAPIToken());
    }
}
