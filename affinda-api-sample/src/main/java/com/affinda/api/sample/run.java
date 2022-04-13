package com.affinda.api.sample;

import com.affinda.api.client.AffindaAPI;
import com.affinda.api.client.AffindaAPIBuilder;
import com.affinda.api.client.AffindaTokenCredential;
import com.azure.core.credential.TokenCredential;
import com.azure.core.exception.HttpResponseException;


public class run {
    public static void main(String[] args) {
        TokenCredential credential;
        credential = new AffindaTokenCredential("");
        AffindaAPI client = new AffindaAPIBuilder().credential(credential).buildClient();
        try {
            Object all_resumes = client.getAllResumes(0,500);
            System.out.print(all_resumes);
        } catch (HttpResponseException e) {
            System.out.println(e.getMessage());
        }
    }
}
