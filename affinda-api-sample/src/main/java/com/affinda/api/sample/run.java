package com.affinda.api.sample;

import com.affinda.api.client.AffindaAPI;
import com.affinda.api.client.implementation.AffindaAPIImplBuilder;
import com.azure.core.credential.AccessToken;
import com.azure.core.credential.TokenCredential;
import com.azure.core.credential.TokenRequestContext;
import reactor.core.publisher.Mono;


class AffindaTokenCredential implements TokenCredential {
    private final AccessToken APIToken;

    /**
     * Creates an instance of the AffindaTokenCredneital.
     *
     */
    AffindaTokenCredential(String APIKey) {
        this.APIToken = new AccessToken(APIKey, null);
    }

    public AccessToken getAPIToken() {
        return APIToken;
    }

    /**
     * Asynchronously get a token for a given resource/audience.
     * <p>
     * This method is called automatically by Azure SDK client libraries.
     * You may call this method directly, but you must also handle token
     * caching and token refreshing.
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
        credential = new AffindaTokenCredential("");
        AffindaAPI client = new AffindaAPIImplBuilder().buildClient();
        Object all_resumes = client.getAllResumes();
        System.out.print(all_resumes);
//        credential(new DefaultAzureCredentialBuilder().build())
//        System.out.println(client.getHost());
//        client.getAllRedactedResumesAsync();
    }

}
