package com.affinda.api.client;

import com.affinda.api.client.models.RequestError;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.rest.Response;
import com.azure.core.util.serializer.SerializerAdapter;
import java.net.URL;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** The interface for AffindaAPI class. */
public interface AffindaAPI {
    /**
     * Gets The numbers of documents to return, defaults to 300.
     *
     * @return the limit value.
     */
    int getLimit();

    /**
     * Gets The number of documents to skip before starting to collect the result set.
     *
     * @return the offset value.
     */
    int getOffset();

    /**
     * Gets server parameter.
     *
     * @return the host value.
     */
    String getHost();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    SerializerAdapter getSerializerAdapter();

    /**
     * Returns all the resume summaries for that user, limited to 300 per page.
     *
     * @throws com.affinda.api.client.models.RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Object>> getAllResumesWithResponseAsync();

    /**
     * Returns all the resume summaries for that user, limited to 300 per page.
     *
     * @throws com.affinda.api.client.models.RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Object> getAllResumesAsync();

    /**
     * Returns all the resume summaries for that user, limited to 300 per page.
     *
     * @throws com.affinda.api.client.models.RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Object getAllResumes();

    /**
     * Uploads a resume for parsing. When successful, returns an `identifier` in the response for subsequent use with
     * the [/resumes/{identifier}](#operation/getResume) endpoint to check processing status and retrieve results.
     *
     * @param file File as binary data blob.
     * @param contentLength The contentLength parameter.
     * @param identifier Unique identifier for the resume. If creating a document and left blank, one will be
     *     automatically generated.
     * @param fileName Optional filename of the file.
     * @param url URL to file to download and process.
     * @param wait If "true" (default), will return a response only after processing has completed. If "false", will
     *     return an empty data object which can be polled at the GET endpoint until processing is complete.
     * @param resumeLanguage Language code in ISO 639-1 format. Must specify zh-cn or zh-tw for Chinese.
     * @param expiryTime The date/time in ISO-8601 format when the resume will be automatically deleted. Defaults to no
     *     expiry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.affinda.api.client.models.RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Object>> createResumeWithResponseAsync(
            Flux<ByteBuffer> file,
            Long contentLength,
            String identifier,
            String fileName,
            URL url,
            String wait,
            String resumeLanguage,
            String expiryTime);

    /**
     * Uploads a resume for parsing. When successful, returns an `identifier` in the response for subsequent use with
     * the [/resumes/{identifier}](#operation/getResume) endpoint to check processing status and retrieve results.
     *
     * @param file File as binary data blob.
     * @param contentLength The contentLength parameter.
     * @param identifier Unique identifier for the resume. If creating a document and left blank, one will be
     *     automatically generated.
     * @param fileName Optional filename of the file.
     * @param url URL to file to download and process.
     * @param wait If "true" (default), will return a response only after processing has completed. If "false", will
     *     return an empty data object which can be polled at the GET endpoint until processing is complete.
     * @param resumeLanguage Language code in ISO 639-1 format. Must specify zh-cn or zh-tw for Chinese.
     * @param expiryTime The date/time in ISO-8601 format when the resume will be automatically deleted. Defaults to no
     *     expiry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.affinda.api.client.models.RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Object> createResumeAsync(
            Flux<ByteBuffer> file,
            Long contentLength,
            String identifier,
            String fileName,
            URL url,
            String wait,
            String resumeLanguage,
            String expiryTime);

    /**
     * Uploads a resume for parsing. When successful, returns an `identifier` in the response for subsequent use with
     * the [/resumes/{identifier}](#operation/getResume) endpoint to check processing status and retrieve results.
     *
     * @param file File as binary data blob.
     * @param contentLength The contentLength parameter.
     * @param identifier Unique identifier for the resume. If creating a document and left blank, one will be
     *     automatically generated.
     * @param fileName Optional filename of the file.
     * @param url URL to file to download and process.
     * @param wait If "true" (default), will return a response only after processing has completed. If "false", will
     *     return an empty data object which can be polled at the GET endpoint until processing is complete.
     * @param resumeLanguage Language code in ISO 639-1 format. Must specify zh-cn or zh-tw for Chinese.
     * @param expiryTime The date/time in ISO-8601 format when the resume will be automatically deleted. Defaults to no
     *     expiry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.affinda.api.client.models.RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Object createResume(
            Flux<ByteBuffer> file,
            Long contentLength,
            String identifier,
            String fileName,
            URL url,
            String wait,
            String resumeLanguage,
            String expiryTime);

    /**
     * Returns all the parse results for that resume if processing is completed. The `identifier` is the unique ID
     * returned after POST-ing the resume via the [/resumes](#operation/createResume) endpoint.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.affinda.api.client.models.RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Object>> getResumeWithResponseAsync(String identifier);

    /**
     * Returns all the parse results for that resume if processing is completed. The `identifier` is the unique ID
     * returned after POST-ing the resume via the [/resumes](#operation/createResume) endpoint.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.affinda.api.client.models.RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Object> getResumeAsync(String identifier);

    /**
     * Returns all the parse results for that resume if processing is completed. The `identifier` is the unique ID
     * returned after POST-ing the resume via the [/resumes](#operation/createResume) endpoint.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.affinda.api.client.models.RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Object getResume(String identifier);

    /**
     * Deletes the specified resume from the database.
     *
     * @param identifier Resume identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.affinda.api.client.models.RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<RequestError>> deleteResumeWithResponseAsync(String identifier);

    /**
     * Deletes the specified resume from the database.
     *
     * @param identifier Resume identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.affinda.api.client.models.RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<RequestError> deleteResumeAsync(String identifier);

    /**
     * Deletes the specified resume from the database.
     *
     * @param identifier Resume identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.affinda.api.client.models.RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RequestError deleteResume(String identifier);

    /**
     * Returns all the redacted resume information for that resume.
     *
     * @throws com.affinda.api.client.models.RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Object>> getAllRedactedResumesWithResponseAsync();

    /**
     * Returns all the redacted resume information for that resume.
     *
     * @throws com.affinda.api.client.models.RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Object> getAllRedactedResumesAsync();

    /**
     * Returns all the redacted resume information for that resume.
     *
     * @throws com.affinda.api.client.models.RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Object getAllRedactedResumes();

    /**
     * Uploads a resume for redacting.
     *
     * @param file File as binary data blob.
     * @param contentLength The contentLength parameter.
     * @param identifier Unique identifier for the resume. If creating a document and left blank, one will be
     *     automatically generated.
     * @param fileName Optional filename of the file.
     * @param url URL to file to download and process.
     * @param resumeLanguage Language code in ISO 639-1 format. Must specify zh-cn or zh-tw for Chinese.
     * @param wait If "true" (default), will return a response only after processing has completed. If "false", will
     *     return an empty data object which can be polled at the GET endpoint until processing is complete.
     * @param redactHeadshot Whether to redact headshot.
     * @param redactPersonalDetails Whether to redact personal details (e.g. name, address).
     * @param redactWorkDetails Whether to redact work details (e.g. company names).
     * @param redactEducationDetails Whether to redact education details (e.g. university names).
     * @param redactReferees Whether to redact referee details.
     * @param redactLocations Whether to redact location names.
     * @param redactDates Whether to redact dates.
     * @param expiryTime The date/time in ISO-8601 format when the resume will be automatically deleted. Defaults to no
     *     expiry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.affinda.api.client.models.RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Object>> createRedactedResumeWithResponseAsync(
            Flux<ByteBuffer> file,
            Long contentLength,
            String identifier,
            String fileName,
            URL url,
            String resumeLanguage,
            String wait,
            String redactHeadshot,
            String redactPersonalDetails,
            String redactWorkDetails,
            String redactEducationDetails,
            String redactReferees,
            String redactLocations,
            String redactDates,
            String expiryTime);

    /**
     * Uploads a resume for redacting.
     *
     * @param file File as binary data blob.
     * @param contentLength The contentLength parameter.
     * @param identifier Unique identifier for the resume. If creating a document and left blank, one will be
     *     automatically generated.
     * @param fileName Optional filename of the file.
     * @param url URL to file to download and process.
     * @param resumeLanguage Language code in ISO 639-1 format. Must specify zh-cn or zh-tw for Chinese.
     * @param wait If "true" (default), will return a response only after processing has completed. If "false", will
     *     return an empty data object which can be polled at the GET endpoint until processing is complete.
     * @param redactHeadshot Whether to redact headshot.
     * @param redactPersonalDetails Whether to redact personal details (e.g. name, address).
     * @param redactWorkDetails Whether to redact work details (e.g. company names).
     * @param redactEducationDetails Whether to redact education details (e.g. university names).
     * @param redactReferees Whether to redact referee details.
     * @param redactLocations Whether to redact location names.
     * @param redactDates Whether to redact dates.
     * @param expiryTime The date/time in ISO-8601 format when the resume will be automatically deleted. Defaults to no
     *     expiry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.affinda.api.client.models.RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Object> createRedactedResumeAsync(
            Flux<ByteBuffer> file,
            Long contentLength,
            String identifier,
            String fileName,
            URL url,
            String resumeLanguage,
            String wait,
            String redactHeadshot,
            String redactPersonalDetails,
            String redactWorkDetails,
            String redactEducationDetails,
            String redactReferees,
            String redactLocations,
            String redactDates,
            String expiryTime);

    /**
     * Uploads a resume for redacting.
     *
     * @param file File as binary data blob.
     * @param contentLength The contentLength parameter.
     * @param identifier Unique identifier for the resume. If creating a document and left blank, one will be
     *     automatically generated.
     * @param fileName Optional filename of the file.
     * @param url URL to file to download and process.
     * @param resumeLanguage Language code in ISO 639-1 format. Must specify zh-cn or zh-tw for Chinese.
     * @param wait If "true" (default), will return a response only after processing has completed. If "false", will
     *     return an empty data object which can be polled at the GET endpoint until processing is complete.
     * @param redactHeadshot Whether to redact headshot.
     * @param redactPersonalDetails Whether to redact personal details (e.g. name, address).
     * @param redactWorkDetails Whether to redact work details (e.g. company names).
     * @param redactEducationDetails Whether to redact education details (e.g. university names).
     * @param redactReferees Whether to redact referee details.
     * @param redactLocations Whether to redact location names.
     * @param redactDates Whether to redact dates.
     * @param expiryTime The date/time in ISO-8601 format when the resume will be automatically deleted. Defaults to no
     *     expiry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.affinda.api.client.models.RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Object createRedactedResume(
            Flux<ByteBuffer> file,
            Long contentLength,
            String identifier,
            String fileName,
            URL url,
            String resumeLanguage,
            String wait,
            String redactHeadshot,
            String redactPersonalDetails,
            String redactWorkDetails,
            String redactEducationDetails,
            String redactReferees,
            String redactLocations,
            String redactDates,
            String expiryTime);

    /**
     * Returns all the redaction results for that resume if processing is completed. The `identifier` is the unique ID
     * returned after POST-ing the resume via the [/redacted_resumes](#operation/createRedactedResume) endpoint.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.affinda.api.client.models.RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Object>> getRedactedResumeWithResponseAsync(String identifier);

    /**
     * Returns all the redaction results for that resume if processing is completed. The `identifier` is the unique ID
     * returned after POST-ing the resume via the [/redacted_resumes](#operation/createRedactedResume) endpoint.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.affinda.api.client.models.RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Object> getRedactedResumeAsync(String identifier);

    /**
     * Returns all the redaction results for that resume if processing is completed. The `identifier` is the unique ID
     * returned after POST-ing the resume via the [/redacted_resumes](#operation/createRedactedResume) endpoint.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.affinda.api.client.models.RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Object getRedactedResume(String identifier);

    /**
     * Deletes the specified resume from the database.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.affinda.api.client.models.RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<RequestError>> deleteRedactedResumeWithResponseAsync(String identifier);

    /**
     * Deletes the specified resume from the database.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.affinda.api.client.models.RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<RequestError> deleteRedactedResumeAsync(String identifier);

    /**
     * Deletes the specified resume from the database.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.affinda.api.client.models.RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RequestError deleteRedactedResume(String identifier);

    /**
     * Returns all the resume formats.
     *
     * @throws com.affinda.api.client.models.RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Object>> getAllResumeFormatsWithResponseAsync();

    /**
     * Returns all the resume formats.
     *
     * @throws com.affinda.api.client.models.RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Object> getAllResumeFormatsAsync();

    /**
     * Returns all the resume formats.
     *
     * @throws com.affinda.api.client.models.RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Object getAllResumeFormats();

    /**
     * Returns all the reformatted resume information for that resume.
     *
     * @throws com.affinda.api.client.models.RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Object>> getAllReformattedResumesWithResponseAsync();

    /**
     * Returns all the reformatted resume information for that resume.
     *
     * @throws com.affinda.api.client.models.RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Object> getAllReformattedResumesAsync();

    /**
     * Returns all the reformatted resume information for that resume.
     *
     * @throws com.affinda.api.client.models.RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Object getAllReformattedResumes();

    /**
     * Uploads a resume for reformatting.
     *
     * @param resumeFormat Identifier of the format used.
     * @param file File as binary data blob.
     * @param contentLength The contentLength parameter.
     * @param identifier Unique identifier for the resume. If creating a document and left blank, one will be
     *     automatically generated.
     * @param fileName Optional filename of the file.
     * @param url URL to file to download and process.
     * @param resumeLanguage Language code in ISO 639-1 format. Must specify zh-cn or zh-tw for Chinese.
     * @param wait If "true" (default), will return a response only after processing has completed. If "false", will
     *     return an empty data object which can be polled at the GET endpoint until processing is complete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.affinda.api.client.models.RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Object>> createReformattedResumeWithResponseAsync(
            String resumeFormat,
            Flux<ByteBuffer> file,
            Long contentLength,
            String identifier,
            String fileName,
            URL url,
            String resumeLanguage,
            String wait);

    /**
     * Uploads a resume for reformatting.
     *
     * @param resumeFormat Identifier of the format used.
     * @param file File as binary data blob.
     * @param contentLength The contentLength parameter.
     * @param identifier Unique identifier for the resume. If creating a document and left blank, one will be
     *     automatically generated.
     * @param fileName Optional filename of the file.
     * @param url URL to file to download and process.
     * @param resumeLanguage Language code in ISO 639-1 format. Must specify zh-cn or zh-tw for Chinese.
     * @param wait If "true" (default), will return a response only after processing has completed. If "false", will
     *     return an empty data object which can be polled at the GET endpoint until processing is complete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.affinda.api.client.models.RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Object> createReformattedResumeAsync(
            String resumeFormat,
            Flux<ByteBuffer> file,
            Long contentLength,
            String identifier,
            String fileName,
            URL url,
            String resumeLanguage,
            String wait);

    /**
     * Uploads a resume for reformatting.
     *
     * @param resumeFormat Identifier of the format used.
     * @param file File as binary data blob.
     * @param contentLength The contentLength parameter.
     * @param identifier Unique identifier for the resume. If creating a document and left blank, one will be
     *     automatically generated.
     * @param fileName Optional filename of the file.
     * @param url URL to file to download and process.
     * @param resumeLanguage Language code in ISO 639-1 format. Must specify zh-cn or zh-tw for Chinese.
     * @param wait If "true" (default), will return a response only after processing has completed. If "false", will
     *     return an empty data object which can be polled at the GET endpoint until processing is complete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.affinda.api.client.models.RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Object createReformattedResume(
            String resumeFormat,
            Flux<ByteBuffer> file,
            Long contentLength,
            String identifier,
            String fileName,
            URL url,
            String resumeLanguage,
            String wait);

    /**
     * Returns all the reformatting results for that resume if processing is completed. The `identifier` is the unique
     * ID returned after POST-ing the resume via the [/reformatted_resumes](#operation/createReformattedResume)
     * endpoint.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.affinda.api.client.models.RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Object>> getReformattedResumeWithResponseAsync(String identifier);

    /**
     * Returns all the reformatting results for that resume if processing is completed. The `identifier` is the unique
     * ID returned after POST-ing the resume via the [/reformatted_resumes](#operation/createReformattedResume)
     * endpoint.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.affinda.api.client.models.RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Object> getReformattedResumeAsync(String identifier);

    /**
     * Returns all the reformatting results for that resume if processing is completed. The `identifier` is the unique
     * ID returned after POST-ing the resume via the [/reformatted_resumes](#operation/createReformattedResume)
     * endpoint.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.affinda.api.client.models.RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Object getReformattedResume(String identifier);

    /**
     * Deletes the specified resume from the database.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.affinda.api.client.models.RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<RequestError>> deleteReformattedResumeWithResponseAsync(String identifier);

    /**
     * Deletes the specified resume from the database.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.affinda.api.client.models.RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<RequestError> deleteReformattedResumeAsync(String identifier);

    /**
     * Deletes the specified resume from the database.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.affinda.api.client.models.RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RequestError deleteReformattedResume(String identifier);
}
