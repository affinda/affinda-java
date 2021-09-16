package com.affinda.api.sample;

import com.affinda.api.client.AffindaAPI;
import com.affinda.api.client.AffindaAPIBuilder;
import com.azure.core.credential.AccessToken;
import com.azure.core.credential.TokenCredential;
import com.azure.core.credential.TokenRequestContext;
import com.azure.core.exception.HttpResponseException;
import reactor.core.publisher.Mono;


class AffindaTokenCredential implements TokenCredential {
    private final AccessToken APIToken;

    /**
     * Creates an instance of the AffindaTokenCredneital.
     */
    AffindaTokenCredential(String APIKey) {
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

public class run {
    public static void main(String[] args) {
        TokenCredential credential;
        credential = new AffindaTokenCredential("REPLACE_TOKEN");
        AffindaAPI client = new AffindaAPIBuilder().credential(credential).clientOptions(null).buildClient();
        try {
            Object all_resumes = client.getAllResumes();
            System.out.print(all_resumes);
        } catch (HttpResponseException e) {
            System.out.println(e.getMessage());
        }
    }
}
