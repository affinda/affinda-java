package com.affinda.api.sample;

import com.affinda.api.client.AffindaAPI;
import com.affinda.api.client.AffindaAPIBuilder;
import com.affinda.api.client.AffindaTokenCredential;
import com.affinda.api.client.models.User;
import com.azure.core.credential.TokenCredential;
import com.azure.core.exception.HttpResponseException;


public class create_user {
    public static void main(String[] args) {
        String apiKey = "YOUR API KEY";
        TokenCredential credential;
        credential = new AffindaTokenCredential(apiKey);
        AffindaAPI client = new AffindaAPIBuilder().credential(credential).buildClient();
        try {
            String username = "testuser";
            String email = "testuser@affinda.com";
            User user = new User().setUsername(username).setEmail(email);
            Object created_user = client.createUser(user);

            System.out.print(created_user);
        } catch (HttpResponseException e) {
            System.out.println(e.getMessage());
        }
    }
}
