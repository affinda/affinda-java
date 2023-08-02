// package com.affinda.api.sample;

// import com.affinda.api.client.AffindaAPI;
// import com.affinda.api.client.AffindaAPIBuilder;
// import com.affinda.api.client.AffindaTokenCredential;
// import com.affinda.api.client.models.Document;
// import com.affinda.api.client.models.Invoice;
// import com.affinda.api.client.models.PathsOxm5M7V3DocumentsGetResponses200ContentApplicationJsonSchema;
// import com.azure.core.credential.TokenCredential;
// import com.azure.core.exception.HttpResponseException;

// public class run {
//     public static void main(String[] args) {
//         TokenCredential credential;
//         credential = new AffindaTokenCredential("<APIKey>");
//         AffindaAPI client = new AffindaAPIBuilder().credential(credential).buildClient();
//         try {
//             PathsOxm5M7V3DocumentsGetResponses200ContentApplicationJsonSchema all_docs = client.getAllDocuments(
//                     0, 2, null, null, null, null, null, null, null, null, null, null, false, true, null, null
//                 );
//             for (Document document : all_docs.getResults()) {
//                 if (document.getClass() == Invoice.class) {
//                     System.out.println(document.getMeta().getIdentifier());
//                 }
//             }
//         } catch (HttpResponseException e) {
//             System.out.println(e.getMessage());
//         }
//     }
// }
