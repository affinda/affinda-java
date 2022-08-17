package com.affinda.api.sample;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.affinda.api.client.AffindaAPI;
import com.affinda.api.client.AffindaAPIBuilder;
import com.affinda.api.client.AffindaTokenCredential;
import com.affinda.api.client.models.InvoiceRequestBody;
import com.azure.core.credential.TokenCredential;
import com.azure.core.exception.HttpResponseException;

import reactor.core.publisher.Flux;

public class parse_invoice {
    public static void main(String[] args) {
        String apiKey = "YOUR API KEY";
        TokenCredential credential;
        credential = new AffindaTokenCredential(apiKey);
        AffindaAPI client = new AffindaAPIBuilder().credential(credential).buildClient();
        try {
            // Read file path as flux byte buffer
            Flux<ByteBuffer> file = Flux.just(ByteBuffer.wrap(Files.readAllBytes(Paths.get("/path/to/file.pdf"))));
            InvoiceRequestBody body = new InvoiceRequestBody().setFile(file);
            Object parsed_invoice = client.createInvoice(body);

            System.out.print(parsed_invoice);
        } catch (HttpResponseException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
