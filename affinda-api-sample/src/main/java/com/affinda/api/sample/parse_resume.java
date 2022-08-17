package com.affinda.api.sample;

import java.io.*;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.affinda.api.client.AffindaAPI;
import com.affinda.api.client.AffindaAPIBuilder;
import com.affinda.api.client.AffindaTokenCredential;
import com.affinda.api.client.models.ResumeRequestBody;
import com.azure.core.credential.TokenCredential;
import com.azure.core.exception.HttpResponseException;

import reactor.core.publisher.Flux;

public class parse_resume {
    public static void main(String[] args) {
        String apiKey = "YOUR API KEY";
        TokenCredential credential;
        credential = new AffindaTokenCredential(apiKey);
        AffindaAPI client = new AffindaAPIBuilder().credential(credential).buildClient();
        try {
            // Download pdf from URL and save it as flux byte buffer
            // String sampleResumeURL = "https://api.affinda.com/static/sample_resumes/example.pdf";
            // try (InputStream in = new URL(sampleResumeURL).openStream();) {
            //     Flux<ByteBuffer> resume = Flux.just(ByteBuffer.wrap(in.readAllBytes()));
            //     // Create resume request body and parse resume
            //     ResumeRequestBody resumeRequestBody = new ResumeRequestBody();
            //     resumeRequestBody.setFile(resume);
            //     resumeRequestBody.setFileName("example.pdf");
            //     Object parsed_resume = client.createResume(resumeRequestBody);
            //     System.out.println(parsed_resume);
            // }

            // Altrernatively, read local file from path as flux byte buffer
            Flux<ByteBuffer> file = Flux.just(ByteBuffer.wrap(Files.readAllBytes(Paths.get("/path/to/file.pdf"))));
            ResumeRequestBody body = new ResumeRequestBody().setFile(file);
            Object parsed_resume = client.createResume(body);
            System.out.print(parsed_resume);
        } catch (HttpResponseException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
