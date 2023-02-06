package com.affinda.api.sample;

import java.io.*;

import com.affinda.api.client.AffindaAPI;
import com.affinda.api.client.AffindaAPIBuilder;
import com.affinda.api.client.AffindaTokenCredential;
import com.affinda.api.client.models.Document;
import com.azure.core.credential.TokenCredential;
import com.azure.core.exception.HttpResponseException;

public class document_as_invoice {
    public static void main(String[] args) {
        TokenCredential credential;
        credential = new AffindaTokenCredential("");
        AffindaAPI client = new AffindaAPIBuilder().credential(credential).buildClient();
        try {
            Object parsed_invoice = client.getDocument("YOUR INVOICE IDENTIFIER").asInvoice();

            System.out.print(parsed_invoice);
        } catch (HttpResponseException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
