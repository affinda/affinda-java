package com.affinda.api.client;

import com.affinda.api.client.models.PathsGpptmIndexNameDocumentsPostRequestbodyContentApplicationJsonSchema;
import com.affinda.api.client.models.RequestError;
import com.affinda.api.client.models.RequestErrorException;
import com.affinda.api.client.models.ResumeSearchParameters;
import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the AffindaAPI type. */
public final class AffindaAPI {
    /** The proxy service used to perform REST calls. */
    private final AffindaAPIService service;

    /** server parameter. */
    private final String host;

    /**
     * Gets server parameter.
     *
     * @return the host value.
     */
    public String getHost() {
        return this.host;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /**
     * Initializes an instance of AffindaAPI client.
     *
     * @param host server parameter.
     */
    AffindaAPI(String host) {
        this(
                new HttpPipelineBuilder()
                        .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                        .build(),
                JacksonAdapter.createDefaultSerializerAdapter(),
                host);
    }

    /**
     * Initializes an instance of AffindaAPI client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param host server parameter.
     */
    AffindaAPI(HttpPipeline httpPipeline, String host) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), host);
    }

    /**
     * Initializes an instance of AffindaAPI client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param host server parameter.
     */
    AffindaAPI(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, String host) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.host = host;
        this.service = RestProxy.create(AffindaAPIService.class, this.httpPipeline, this.getSerializerAdapter());
    }

    /** The interface defining all the services for AffindaAPI to be used by the proxy service to perform REST calls. */
    @Host("{$host}")
    @ServiceInterface(name = "AffindaAPI")
    public interface AffindaAPIService {
        @Get("/resumes")
        @ExpectedResponses({200, 400, 401, 404})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> getAllResumes(
                @HostParam("$host") String host,
                @QueryParam("offset") Integer offset,
                @QueryParam("limit") Integer limit,
                @HeaderParam("Accept") String accept);

        // @Multipart not supported by RestProxy
        @Post("/resumes")
        @ExpectedResponses({200, 201, 400, 401, 404})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> createResume(
                @HostParam("$host") String host,
                @BodyParam("multipart/form-data") Flux<ByteBuffer> file,
                @HeaderParam("Content-Length") Long contentLength,
                @BodyParam("multipart/form-data") String identifier,
                @BodyParam("multipart/form-data") String fileName,
                @BodyParam("multipart/form-data") String url,
                @BodyParam("multipart/form-data") String wait,
                @BodyParam("multipart/form-data") String language,
                @BodyParam("multipart/form-data") String expiryTime,
                @HeaderParam("Accept") String accept);

        @Get("/resumes/{identifier}")
        @ExpectedResponses({200, 400, 401, 404})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> getResume(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Delete("/resumes/{identifier}")
        @ExpectedResponses({204, 400, 401, 404})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<RequestError>> deleteResume(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Get("/redacted_resumes")
        @ExpectedResponses({200, 400, 401, 404})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> getAllRedactedResumes(
                @HostParam("$host") String host,
                @QueryParam("offset") Integer offset,
                @QueryParam("limit") Integer limit,
                @HeaderParam("Accept") String accept);

        // @Multipart not supported by RestProxy
        @Post("/redacted_resumes")
        @ExpectedResponses({200, 201, 400, 401, 404})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> createRedactedResume(
                @HostParam("$host") String host,
                @BodyParam("multipart/form-data") Flux<ByteBuffer> file,
                @HeaderParam("Content-Length") Long contentLength,
                @BodyParam("multipart/form-data") String identifier,
                @BodyParam("multipart/form-data") String fileName,
                @BodyParam("multipart/form-data") String url,
                @BodyParam("multipart/form-data") String language,
                @BodyParam("multipart/form-data") String wait,
                @BodyParam("multipart/form-data") String redactHeadshot,
                @BodyParam("multipart/form-data") String redactPersonalDetails,
                @BodyParam("multipart/form-data") String redactWorkDetails,
                @BodyParam("multipart/form-data") String redactEducationDetails,
                @BodyParam("multipart/form-data") String redactReferees,
                @BodyParam("multipart/form-data") String redactLocations,
                @BodyParam("multipart/form-data") String redactDates,
                @BodyParam("multipart/form-data") String redactGender,
                @BodyParam("multipart/form-data") String expiryTime,
                @HeaderParam("Accept") String accept);

        @Get("/redacted_resumes/{identifier}")
        @ExpectedResponses({200, 400, 401, 404})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> getRedactedResume(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Delete("/redacted_resumes/{identifier}")
        @ExpectedResponses({204, 400, 401, 404})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<RequestError>> deleteRedactedResume(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Get("/resume_formats")
        @ExpectedResponses({200, 400, 401, 404})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> getAllResumeFormats(
                @HostParam("$host") String host,
                @QueryParam("offset") Integer offset,
                @QueryParam("limit") Integer limit,
                @HeaderParam("Accept") String accept);

        @Get("/reformatted_resumes")
        @ExpectedResponses({200, 400, 401, 404})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> getAllReformattedResumes(
                @HostParam("$host") String host,
                @QueryParam("offset") Integer offset,
                @QueryParam("limit") Integer limit,
                @HeaderParam("Accept") String accept);

        // @Multipart not supported by RestProxy
        @Post("/reformatted_resumes")
        @ExpectedResponses({200, 201, 400, 401, 404})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> createReformattedResume(
                @HostParam("$host") String host,
                @BodyParam("multipart/form-data") Flux<ByteBuffer> file,
                @HeaderParam("Content-Length") Long contentLength,
                @BodyParam("multipart/form-data") String identifier,
                @BodyParam("multipart/form-data") String fileName,
                @BodyParam("multipart/form-data") String url,
                @BodyParam("multipart/form-data") String language,
                @BodyParam("multipart/form-data") String resumeFormat,
                @BodyParam("multipart/form-data") String wait,
                @HeaderParam("Accept") String accept);

        @Get("/reformatted_resumes/{identifier}")
        @ExpectedResponses({200, 400, 401, 404})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> getReformattedResume(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Delete("/reformatted_resumes/{identifier}")
        @ExpectedResponses({204, 400, 401, 404})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<RequestError>> deleteReformattedResume(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Post("/resume_search")
        @ExpectedResponses({201, 400, 401, 404})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> createResumeSearch(
                @HostParam("$host") String host,
                @QueryParam("offset") Integer offset,
                @QueryParam("limit") Integer limit,
                @BodyParam("application/json") ResumeSearchParameters body,
                @HeaderParam("Accept") String accept);

        @Get("/job_descriptions")
        @ExpectedResponses({200, 400, 401, 404})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> getAllJobDescriptions(
                @HostParam("$host") String host,
                @QueryParam("offset") Integer offset,
                @QueryParam("limit") Integer limit,
                @HeaderParam("Accept") String accept);

        // @Multipart not supported by RestProxy
        @Post("/job_descriptions")
        @ExpectedResponses({200, 201, 400, 401, 404})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> createJobDescription(
                @HostParam("$host") String host,
                @BodyParam("multipart/form-data") Flux<ByteBuffer> file,
                @HeaderParam("Content-Length") Long contentLength,
                @BodyParam("multipart/form-data") String identifier,
                @BodyParam("multipart/form-data") String fileName,
                @BodyParam("multipart/form-data") String url,
                @BodyParam("multipart/form-data") String wait,
                @BodyParam("multipart/form-data") String language,
                @BodyParam("multipart/form-data") String expiryTime,
                @HeaderParam("Accept") String accept);

        @Get("/job_descriptions/{identifier}")
        @ExpectedResponses({200, 400, 401, 404})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> getJobDescription(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Delete("/job_descriptions/{identifier}")
        @ExpectedResponses({204, 400, 401, 404})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<RequestError>> deleteJobDescription(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Get("/index")
        @ExpectedResponses({200, 400, 401, 404})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> getAllIndexes(
                @HostParam("$host") String host,
                @QueryParam("offset") Integer offset,
                @QueryParam("limit") Integer limit,
                @HeaderParam("Accept") String accept);

        // @Multipart not supported by RestProxy
        @Post("/index")
        @ExpectedResponses({201, 400, 401, 404})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> createIndex(
                @HostParam("$host") String host,
                @BodyParam("multipart/form-data") String name,
                @HeaderParam("Accept") String accept);

        @Delete("/index/{name}")
        @ExpectedResponses({204, 400, 401, 404})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<RequestError>> deleteIndex(
                @HostParam("$host") String host, @PathParam("name") String name, @HeaderParam("Accept") String accept);

        @Get("/index/{name}/documents")
        @ExpectedResponses({200, 400, 401, 404})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> getAllIndexDocuments(
                @HostParam("$host") String host, @PathParam("name") String name, @HeaderParam("Accept") String accept);

        @Post("/index/{name}/documents")
        @ExpectedResponses({201, 400, 401, 404})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> createIndexDocument(
                @HostParam("$host") String host,
                @PathParam("name") String name,
                @BodyParam("application/json")
                        PathsGpptmIndexNameDocumentsPostRequestbodyContentApplicationJsonSchema body,
                @HeaderParam("Accept") String accept);

        @Delete("/index/{name}/documents/{identifier}")
        @ExpectedResponses({204, 400, 401, 404})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<RequestError>> deleteIndexDocument(
                @HostParam("$host") String host,
                @PathParam("name") String name,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Get("/invoices")
        @ExpectedResponses({200, 400, 401, 404})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> getAllInvoices(
                @HostParam("$host") String host,
                @QueryParam("offset") Integer offset,
                @QueryParam("limit") Integer limit,
                @HeaderParam("Accept") String accept);

        // @Multipart not supported by RestProxy
        @Post("/invoices")
        @ExpectedResponses({200, 201, 400, 401, 404})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> createInvoice(
                @HostParam("$host") String host,
                @BodyParam("multipart/form-data") Flux<ByteBuffer> file,
                @HeaderParam("Content-Length") Long contentLength,
                @BodyParam("multipart/form-data") String identifier,
                @BodyParam("multipart/form-data") String fileName,
                @BodyParam("multipart/form-data") String url,
                @BodyParam("multipart/form-data") String wait,
                @BodyParam("multipart/form-data") String language,
                @BodyParam("multipart/form-data") String expiryTime,
                @HeaderParam("Accept") String accept);

        @Get("/invoices/{identifier}")
        @ExpectedResponses({200, 400, 401, 404})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> getInvoice(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Delete("/invoices/{identifier}")
        @ExpectedResponses({204, 400, 401, 404})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<RequestError>> deleteInvoice(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Get("/occupation_groups")
        @ExpectedResponses({201, 400, 401, 404})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> listOccupationGroups(
                @HostParam("$host") String host, @HeaderParam("Accept") String accept);
    }

    /**
     * Returns all the resume summaries for that user, limited to 300 per page.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> getAllResumesWithResponseAsync(Integer offset, Integer limit) {
        final String accept = "application/json";
        return service.getAllResumes(this.getHost(), offset, limit, accept);
    }

    /**
     * Returns all the resume summaries for that user, limited to 300 per page.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getAllResumesAsync(Integer offset, Integer limit) {
        return getAllResumesWithResponseAsync(offset, limit)
                .flatMap(
                        (Response<Object> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Returns all the resume summaries for that user, limited to 300 per page.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object getAllResumes(Integer offset, Integer limit) {
        return getAllResumesAsync(offset, limit).block();
    }

    /**
     * Uploads a resume for parsing. When successful, returns an `identifier` in the response for subsequent use with
     * the [/resumes/{identifier}](#operation/getResume) endpoint to check processing status and retrieve results.
     *
     * @param file File as binary data blob. Supported formats: PDF, DOC, DOCX, TXT, RTF, HTML, PNG, JPG.
     * @param contentLength The contentLength parameter.
     * @param identifier Unique identifier for the document. If creating a document and left blank, one will be
     *     automatically generated.
     * @param fileName Optional filename of the file.
     * @param url URL to file to download and process.
     * @param wait If "true" (default), will return a response only after processing has completed. If "false", will
     *     return an empty data object which can be polled at the GET endpoint until processing is complete.
     * @param language Language code in ISO 639-1 format. Must specify zh-cn or zh-tw for Chinese.
     * @param expiryTime The date/time in ISO-8601 format when the document will be automatically deleted. Defaults to
     *     no expiry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> createResumeWithResponseAsync(
            Flux<ByteBuffer> file,
            Long contentLength,
            String identifier,
            String fileName,
            String url,
            String wait,
            String language,
            String expiryTime) {
        final String accept = "application/json";
        return service.createResume(
                this.getHost(), file, contentLength, identifier, fileName, url, wait, language, expiryTime, accept);
    }

    /**
     * Uploads a resume for parsing. When successful, returns an `identifier` in the response for subsequent use with
     * the [/resumes/{identifier}](#operation/getResume) endpoint to check processing status and retrieve results.
     *
     * @param file File as binary data blob. Supported formats: PDF, DOC, DOCX, TXT, RTF, HTML, PNG, JPG.
     * @param contentLength The contentLength parameter.
     * @param identifier Unique identifier for the document. If creating a document and left blank, one will be
     *     automatically generated.
     * @param fileName Optional filename of the file.
     * @param url URL to file to download and process.
     * @param wait If "true" (default), will return a response only after processing has completed. If "false", will
     *     return an empty data object which can be polled at the GET endpoint until processing is complete.
     * @param language Language code in ISO 639-1 format. Must specify zh-cn or zh-tw for Chinese.
     * @param expiryTime The date/time in ISO-8601 format when the document will be automatically deleted. Defaults to
     *     no expiry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> createResumeAsync(
            Flux<ByteBuffer> file,
            Long contentLength,
            String identifier,
            String fileName,
            String url,
            String wait,
            String language,
            String expiryTime) {
        return createResumeWithResponseAsync(file, contentLength, identifier, fileName, url, wait, language, expiryTime)
                .flatMap(
                        (Response<Object> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Uploads a resume for parsing. When successful, returns an `identifier` in the response for subsequent use with
     * the [/resumes/{identifier}](#operation/getResume) endpoint to check processing status and retrieve results.
     *
     * @param file File as binary data blob. Supported formats: PDF, DOC, DOCX, TXT, RTF, HTML, PNG, JPG.
     * @param contentLength The contentLength parameter.
     * @param identifier Unique identifier for the document. If creating a document and left blank, one will be
     *     automatically generated.
     * @param fileName Optional filename of the file.
     * @param url URL to file to download and process.
     * @param wait If "true" (default), will return a response only after processing has completed. If "false", will
     *     return an empty data object which can be polled at the GET endpoint until processing is complete.
     * @param language Language code in ISO 639-1 format. Must specify zh-cn or zh-tw for Chinese.
     * @param expiryTime The date/time in ISO-8601 format when the document will be automatically deleted. Defaults to
     *     no expiry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object createResume(
            Flux<ByteBuffer> file,
            Long contentLength,
            String identifier,
            String fileName,
            String url,
            String wait,
            String language,
            String expiryTime) {
        return createResumeAsync(file, contentLength, identifier, fileName, url, wait, language, expiryTime).block();
    }

    /**
     * Returns all the parse results for that resume if processing is completed. The `identifier` is the unique ID
     * returned after POST-ing the resume via the [/resumes](#operation/createResume) endpoint.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> getResumeWithResponseAsync(String identifier) {
        final String accept = "application/json";
        return service.getResume(this.getHost(), identifier, accept);
    }

    /**
     * Returns all the parse results for that resume if processing is completed. The `identifier` is the unique ID
     * returned after POST-ing the resume via the [/resumes](#operation/createResume) endpoint.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getResumeAsync(String identifier) {
        return getResumeWithResponseAsync(identifier)
                .flatMap(
                        (Response<Object> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Returns all the parse results for that resume if processing is completed. The `identifier` is the unique ID
     * returned after POST-ing the resume via the [/resumes](#operation/createResume) endpoint.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object getResume(String identifier) {
        return getResumeAsync(identifier).block();
    }

    /**
     * Deletes the specified resume from the database.
     *
     * @param identifier Resume identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RequestError>> deleteResumeWithResponseAsync(String identifier) {
        final String accept = "application/json";
        return service.deleteResume(this.getHost(), identifier, accept);
    }

    /**
     * Deletes the specified resume from the database.
     *
     * @param identifier Resume identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RequestError> deleteResumeAsync(String identifier) {
        return deleteResumeWithResponseAsync(identifier)
                .flatMap(
                        (Response<RequestError> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Deletes the specified resume from the database.
     *
     * @param identifier Resume identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RequestError deleteResume(String identifier) {
        return deleteResumeAsync(identifier).block();
    }

    /**
     * Returns all the redacted resume information for that resume.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> getAllRedactedResumesWithResponseAsync(Integer offset, Integer limit) {
        final String accept = "application/json";
        return service.getAllRedactedResumes(this.getHost(), offset, limit, accept);
    }

    /**
     * Returns all the redacted resume information for that resume.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getAllRedactedResumesAsync(Integer offset, Integer limit) {
        return getAllRedactedResumesWithResponseAsync(offset, limit)
                .flatMap(
                        (Response<Object> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Returns all the redacted resume information for that resume.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object getAllRedactedResumes(Integer offset, Integer limit) {
        return getAllRedactedResumesAsync(offset, limit).block();
    }

    /**
     * Uploads a resume for redacting.
     *
     * @param file File as binary data blob. Supported formats: PDF, DOC, DOCX, TXT, RTF, HTML, PNG, JPG.
     * @param contentLength The contentLength parameter.
     * @param identifier Unique identifier for the document. If creating a document and left blank, one will be
     *     automatically generated.
     * @param fileName Optional filename of the file.
     * @param url URL to file to download and process.
     * @param language Language code in ISO 639-1 format. Must specify zh-cn or zh-tw for Chinese.
     * @param wait If "true" (default), will return a response only after processing has completed. If "false", will
     *     return an empty data object which can be polled at the GET endpoint until processing is complete.
     * @param redactHeadshot Whether to redact headshot.
     * @param redactPersonalDetails Whether to redact personal details (e.g. name, address).
     * @param redactWorkDetails Whether to redact work details (e.g. company names).
     * @param redactEducationDetails Whether to redact education details (e.g. university names).
     * @param redactReferees Whether to redact referee details.
     * @param redactLocations Whether to redact location names.
     * @param redactDates Whether to redact dates.
     * @param redactGender Whether to redact gender.
     * @param expiryTime The date/time in ISO-8601 format when the document will be automatically deleted. Defaults to
     *     no expiry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> createRedactedResumeWithResponseAsync(
            Flux<ByteBuffer> file,
            Long contentLength,
            String identifier,
            String fileName,
            String url,
            String language,
            String wait,
            String redactHeadshot,
            String redactPersonalDetails,
            String redactWorkDetails,
            String redactEducationDetails,
            String redactReferees,
            String redactLocations,
            String redactDates,
            String redactGender,
            String expiryTime) {
        final String accept = "application/json";
        return service.createRedactedResume(
                this.getHost(),
                file,
                contentLength,
                identifier,
                fileName,
                url,
                language,
                wait,
                redactHeadshot,
                redactPersonalDetails,
                redactWorkDetails,
                redactEducationDetails,
                redactReferees,
                redactLocations,
                redactDates,
                redactGender,
                expiryTime,
                accept);
    }

    /**
     * Uploads a resume for redacting.
     *
     * @param file File as binary data blob. Supported formats: PDF, DOC, DOCX, TXT, RTF, HTML, PNG, JPG.
     * @param contentLength The contentLength parameter.
     * @param identifier Unique identifier for the document. If creating a document and left blank, one will be
     *     automatically generated.
     * @param fileName Optional filename of the file.
     * @param url URL to file to download and process.
     * @param language Language code in ISO 639-1 format. Must specify zh-cn or zh-tw for Chinese.
     * @param wait If "true" (default), will return a response only after processing has completed. If "false", will
     *     return an empty data object which can be polled at the GET endpoint until processing is complete.
     * @param redactHeadshot Whether to redact headshot.
     * @param redactPersonalDetails Whether to redact personal details (e.g. name, address).
     * @param redactWorkDetails Whether to redact work details (e.g. company names).
     * @param redactEducationDetails Whether to redact education details (e.g. university names).
     * @param redactReferees Whether to redact referee details.
     * @param redactLocations Whether to redact location names.
     * @param redactDates Whether to redact dates.
     * @param redactGender Whether to redact gender.
     * @param expiryTime The date/time in ISO-8601 format when the document will be automatically deleted. Defaults to
     *     no expiry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> createRedactedResumeAsync(
            Flux<ByteBuffer> file,
            Long contentLength,
            String identifier,
            String fileName,
            String url,
            String language,
            String wait,
            String redactHeadshot,
            String redactPersonalDetails,
            String redactWorkDetails,
            String redactEducationDetails,
            String redactReferees,
            String redactLocations,
            String redactDates,
            String redactGender,
            String expiryTime) {
        return createRedactedResumeWithResponseAsync(
                        file,
                        contentLength,
                        identifier,
                        fileName,
                        url,
                        language,
                        wait,
                        redactHeadshot,
                        redactPersonalDetails,
                        redactWorkDetails,
                        redactEducationDetails,
                        redactReferees,
                        redactLocations,
                        redactDates,
                        redactGender,
                        expiryTime)
                .flatMap(
                        (Response<Object> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Uploads a resume for redacting.
     *
     * @param file File as binary data blob. Supported formats: PDF, DOC, DOCX, TXT, RTF, HTML, PNG, JPG.
     * @param contentLength The contentLength parameter.
     * @param identifier Unique identifier for the document. If creating a document and left blank, one will be
     *     automatically generated.
     * @param fileName Optional filename of the file.
     * @param url URL to file to download and process.
     * @param language Language code in ISO 639-1 format. Must specify zh-cn or zh-tw for Chinese.
     * @param wait If "true" (default), will return a response only after processing has completed. If "false", will
     *     return an empty data object which can be polled at the GET endpoint until processing is complete.
     * @param redactHeadshot Whether to redact headshot.
     * @param redactPersonalDetails Whether to redact personal details (e.g. name, address).
     * @param redactWorkDetails Whether to redact work details (e.g. company names).
     * @param redactEducationDetails Whether to redact education details (e.g. university names).
     * @param redactReferees Whether to redact referee details.
     * @param redactLocations Whether to redact location names.
     * @param redactDates Whether to redact dates.
     * @param redactGender Whether to redact gender.
     * @param expiryTime The date/time in ISO-8601 format when the document will be automatically deleted. Defaults to
     *     no expiry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object createRedactedResume(
            Flux<ByteBuffer> file,
            Long contentLength,
            String identifier,
            String fileName,
            String url,
            String language,
            String wait,
            String redactHeadshot,
            String redactPersonalDetails,
            String redactWorkDetails,
            String redactEducationDetails,
            String redactReferees,
            String redactLocations,
            String redactDates,
            String redactGender,
            String expiryTime) {
        return createRedactedResumeAsync(
                        file,
                        contentLength,
                        identifier,
                        fileName,
                        url,
                        language,
                        wait,
                        redactHeadshot,
                        redactPersonalDetails,
                        redactWorkDetails,
                        redactEducationDetails,
                        redactReferees,
                        redactLocations,
                        redactDates,
                        redactGender,
                        expiryTime)
                .block();
    }

    /**
     * Returns all the redaction results for that resume if processing is completed. The `identifier` is the unique ID
     * returned after POST-ing the resume via the [/redacted_resumes](#operation/createRedactedResume) endpoint.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> getRedactedResumeWithResponseAsync(String identifier) {
        final String accept = "application/json";
        return service.getRedactedResume(this.getHost(), identifier, accept);
    }

    /**
     * Returns all the redaction results for that resume if processing is completed. The `identifier` is the unique ID
     * returned after POST-ing the resume via the [/redacted_resumes](#operation/createRedactedResume) endpoint.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getRedactedResumeAsync(String identifier) {
        return getRedactedResumeWithResponseAsync(identifier)
                .flatMap(
                        (Response<Object> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Returns all the redaction results for that resume if processing is completed. The `identifier` is the unique ID
     * returned after POST-ing the resume via the [/redacted_resumes](#operation/createRedactedResume) endpoint.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object getRedactedResume(String identifier) {
        return getRedactedResumeAsync(identifier).block();
    }

    /**
     * Deletes the specified resume from the database.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RequestError>> deleteRedactedResumeWithResponseAsync(String identifier) {
        final String accept = "application/json";
        return service.deleteRedactedResume(this.getHost(), identifier, accept);
    }

    /**
     * Deletes the specified resume from the database.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RequestError> deleteRedactedResumeAsync(String identifier) {
        return deleteRedactedResumeWithResponseAsync(identifier)
                .flatMap(
                        (Response<RequestError> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Deletes the specified resume from the database.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RequestError deleteRedactedResume(String identifier) {
        return deleteRedactedResumeAsync(identifier).block();
    }

    /**
     * Returns all the resume formats.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> getAllResumeFormatsWithResponseAsync(Integer offset, Integer limit) {
        final String accept = "application/json";
        return service.getAllResumeFormats(this.getHost(), offset, limit, accept);
    }

    /**
     * Returns all the resume formats.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getAllResumeFormatsAsync(Integer offset, Integer limit) {
        return getAllResumeFormatsWithResponseAsync(offset, limit)
                .flatMap(
                        (Response<Object> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Returns all the resume formats.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object getAllResumeFormats(Integer offset, Integer limit) {
        return getAllResumeFormatsAsync(offset, limit).block();
    }

    /**
     * Returns all the reformatted resume information for that resume.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> getAllReformattedResumesWithResponseAsync(Integer offset, Integer limit) {
        final String accept = "application/json";
        return service.getAllReformattedResumes(this.getHost(), offset, limit, accept);
    }

    /**
     * Returns all the reformatted resume information for that resume.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getAllReformattedResumesAsync(Integer offset, Integer limit) {
        return getAllReformattedResumesWithResponseAsync(offset, limit)
                .flatMap(
                        (Response<Object> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Returns all the reformatted resume information for that resume.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object getAllReformattedResumes(Integer offset, Integer limit) {
        return getAllReformattedResumesAsync(offset, limit).block();
    }

    /**
     * Upload a resume for reformatting.
     *
     * @param resumeFormat Identifier of the format used.
     * @param file File as binary data blob. Supported formats: PDF, DOC, DOCX, TXT, RTF, HTML, PNG, JPG.
     * @param contentLength The contentLength parameter.
     * @param identifier Unique identifier for the document. If creating a document and left blank, one will be
     *     automatically generated.
     * @param fileName Optional filename of the file.
     * @param url URL to file to download and process.
     * @param language Language code in ISO 639-1 format. Must specify zh-cn or zh-tw for Chinese.
     * @param wait If "true" (default), will return a response only after processing has completed. If "false", will
     *     return an empty data object which can be polled at the GET endpoint until processing is complete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> createReformattedResumeWithResponseAsync(
            String resumeFormat,
            Flux<ByteBuffer> file,
            Long contentLength,
            String identifier,
            String fileName,
            String url,
            String language,
            String wait) {
        final String accept = "application/json";
        return service.createReformattedResume(
                this.getHost(), file, contentLength, identifier, fileName, url, language, resumeFormat, wait, accept);
    }

    /**
     * Upload a resume for reformatting.
     *
     * @param resumeFormat Identifier of the format used.
     * @param file File as binary data blob. Supported formats: PDF, DOC, DOCX, TXT, RTF, HTML, PNG, JPG.
     * @param contentLength The contentLength parameter.
     * @param identifier Unique identifier for the document. If creating a document and left blank, one will be
     *     automatically generated.
     * @param fileName Optional filename of the file.
     * @param url URL to file to download and process.
     * @param language Language code in ISO 639-1 format. Must specify zh-cn or zh-tw for Chinese.
     * @param wait If "true" (default), will return a response only after processing has completed. If "false", will
     *     return an empty data object which can be polled at the GET endpoint until processing is complete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> createReformattedResumeAsync(
            String resumeFormat,
            Flux<ByteBuffer> file,
            Long contentLength,
            String identifier,
            String fileName,
            String url,
            String language,
            String wait) {
        return createReformattedResumeWithResponseAsync(
                        resumeFormat, file, contentLength, identifier, fileName, url, language, wait)
                .flatMap(
                        (Response<Object> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Upload a resume for reformatting.
     *
     * @param resumeFormat Identifier of the format used.
     * @param file File as binary data blob. Supported formats: PDF, DOC, DOCX, TXT, RTF, HTML, PNG, JPG.
     * @param contentLength The contentLength parameter.
     * @param identifier Unique identifier for the document. If creating a document and left blank, one will be
     *     automatically generated.
     * @param fileName Optional filename of the file.
     * @param url URL to file to download and process.
     * @param language Language code in ISO 639-1 format. Must specify zh-cn or zh-tw for Chinese.
     * @param wait If "true" (default), will return a response only after processing has completed. If "false", will
     *     return an empty data object which can be polled at the GET endpoint until processing is complete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object createReformattedResume(
            String resumeFormat,
            Flux<ByteBuffer> file,
            Long contentLength,
            String identifier,
            String fileName,
            String url,
            String language,
            String wait) {
        return createReformattedResumeAsync(
                        resumeFormat, file, contentLength, identifier, fileName, url, language, wait)
                .block();
    }

    /**
     * Returns all the reformatting results for that resume if processing is completed. The `identifier` is the unique
     * ID returned after POST-ing the resume via the [/reformatted_resumes](#operation/createReformattedResume)
     * endpoint.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> getReformattedResumeWithResponseAsync(String identifier) {
        final String accept = "application/json";
        return service.getReformattedResume(this.getHost(), identifier, accept);
    }

    /**
     * Returns all the reformatting results for that resume if processing is completed. The `identifier` is the unique
     * ID returned after POST-ing the resume via the [/reformatted_resumes](#operation/createReformattedResume)
     * endpoint.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getReformattedResumeAsync(String identifier) {
        return getReformattedResumeWithResponseAsync(identifier)
                .flatMap(
                        (Response<Object> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Returns all the reformatting results for that resume if processing is completed. The `identifier` is the unique
     * ID returned after POST-ing the resume via the [/reformatted_resumes](#operation/createReformattedResume)
     * endpoint.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object getReformattedResume(String identifier) {
        return getReformattedResumeAsync(identifier).block();
    }

    /**
     * Delete the specified resume from the database.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RequestError>> deleteReformattedResumeWithResponseAsync(String identifier) {
        final String accept = "application/json";
        return service.deleteReformattedResume(this.getHost(), identifier, accept);
    }

    /**
     * Delete the specified resume from the database.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RequestError> deleteReformattedResumeAsync(String identifier) {
        return deleteReformattedResumeWithResponseAsync(identifier)
                .flatMap(
                        (Response<RequestError> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Delete the specified resume from the database.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RequestError deleteReformattedResume(String identifier) {
        return deleteReformattedResumeAsync(identifier).block();
    }

    /**
     * Searches through parsed resumes.
     *
     * @param body Search parameters.
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> createResumeSearchWithResponseAsync(
            ResumeSearchParameters body, Integer offset, Integer limit) {
        final String accept = "application/json";
        return service.createResumeSearch(this.getHost(), offset, limit, body, accept);
    }

    /**
     * Searches through parsed resumes.
     *
     * @param body Search parameters.
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> createResumeSearchAsync(ResumeSearchParameters body, Integer offset, Integer limit) {
        return createResumeSearchWithResponseAsync(body, offset, limit)
                .flatMap(
                        (Response<Object> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Searches through parsed resumes.
     *
     * @param body Search parameters.
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object createResumeSearch(ResumeSearchParameters body, Integer offset, Integer limit) {
        return createResumeSearchAsync(body, offset, limit).block();
    }

    /**
     * Returns all the job descriptions for that user, limited to 300 per page.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> getAllJobDescriptionsWithResponseAsync(Integer offset, Integer limit) {
        final String accept = "application/json";
        return service.getAllJobDescriptions(this.getHost(), offset, limit, accept);
    }

    /**
     * Returns all the job descriptions for that user, limited to 300 per page.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getAllJobDescriptionsAsync(Integer offset, Integer limit) {
        return getAllJobDescriptionsWithResponseAsync(offset, limit)
                .flatMap(
                        (Response<Object> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Returns all the job descriptions for that user, limited to 300 per page.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object getAllJobDescriptions(Integer offset, Integer limit) {
        return getAllJobDescriptionsAsync(offset, limit).block();
    }

    /**
     * Uploads a job description for parsing. When successful, returns an `identifier` in the response for subsequent
     * use with the [/job_descriptions/{identifier}](#operation/getResume) endpoint to check processing status and
     * retrieve results.
     *
     * @param file File as binary data blob. Supported formats: PDF, DOC, DOCX, TXT, RTF, HTML, PNG, JPG.
     * @param contentLength The contentLength parameter.
     * @param identifier Unique identifier for the document. If creating a document and left blank, one will be
     *     automatically generated.
     * @param fileName Optional filename of the file.
     * @param url URL to file to download and process.
     * @param wait If "true" (default), will return a response only after processing has completed. If "false", will
     *     return an empty data object which can be polled at the GET endpoint until processing is complete.
     * @param language Language code in ISO 639-1 format. Must specify zh-cn or zh-tw for Chinese.
     * @param expiryTime The date/time in ISO-8601 format when the document will be automatically deleted. Defaults to
     *     no expiry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> createJobDescriptionWithResponseAsync(
            Flux<ByteBuffer> file,
            Long contentLength,
            String identifier,
            String fileName,
            String url,
            String wait,
            String language,
            String expiryTime) {
        final String accept = "application/json";
        return service.createJobDescription(
                this.getHost(), file, contentLength, identifier, fileName, url, wait, language, expiryTime, accept);
    }

    /**
     * Uploads a job description for parsing. When successful, returns an `identifier` in the response for subsequent
     * use with the [/job_descriptions/{identifier}](#operation/getResume) endpoint to check processing status and
     * retrieve results.
     *
     * @param file File as binary data blob. Supported formats: PDF, DOC, DOCX, TXT, RTF, HTML, PNG, JPG.
     * @param contentLength The contentLength parameter.
     * @param identifier Unique identifier for the document. If creating a document and left blank, one will be
     *     automatically generated.
     * @param fileName Optional filename of the file.
     * @param url URL to file to download and process.
     * @param wait If "true" (default), will return a response only after processing has completed. If "false", will
     *     return an empty data object which can be polled at the GET endpoint until processing is complete.
     * @param language Language code in ISO 639-1 format. Must specify zh-cn or zh-tw for Chinese.
     * @param expiryTime The date/time in ISO-8601 format when the document will be automatically deleted. Defaults to
     *     no expiry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> createJobDescriptionAsync(
            Flux<ByteBuffer> file,
            Long contentLength,
            String identifier,
            String fileName,
            String url,
            String wait,
            String language,
            String expiryTime) {
        return createJobDescriptionWithResponseAsync(
                        file, contentLength, identifier, fileName, url, wait, language, expiryTime)
                .flatMap(
                        (Response<Object> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Uploads a job description for parsing. When successful, returns an `identifier` in the response for subsequent
     * use with the [/job_descriptions/{identifier}](#operation/getResume) endpoint to check processing status and
     * retrieve results.
     *
     * @param file File as binary data blob. Supported formats: PDF, DOC, DOCX, TXT, RTF, HTML, PNG, JPG.
     * @param contentLength The contentLength parameter.
     * @param identifier Unique identifier for the document. If creating a document and left blank, one will be
     *     automatically generated.
     * @param fileName Optional filename of the file.
     * @param url URL to file to download and process.
     * @param wait If "true" (default), will return a response only after processing has completed. If "false", will
     *     return an empty data object which can be polled at the GET endpoint until processing is complete.
     * @param language Language code in ISO 639-1 format. Must specify zh-cn or zh-tw for Chinese.
     * @param expiryTime The date/time in ISO-8601 format when the document will be automatically deleted. Defaults to
     *     no expiry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object createJobDescription(
            Flux<ByteBuffer> file,
            Long contentLength,
            String identifier,
            String fileName,
            String url,
            String wait,
            String language,
            String expiryTime) {
        return createJobDescriptionAsync(file, contentLength, identifier, fileName, url, wait, language, expiryTime)
                .block();
    }

    /**
     * Returns all the results for that job description if processing is completed. The `identifier` is the unique ID
     * returned after POST-ing the resume via the [/job_descriptions](#operation/createJobDescription) endpoint.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> getJobDescriptionWithResponseAsync(String identifier) {
        final String accept = "application/json";
        return service.getJobDescription(this.getHost(), identifier, accept);
    }

    /**
     * Returns all the results for that job description if processing is completed. The `identifier` is the unique ID
     * returned after POST-ing the resume via the [/job_descriptions](#operation/createJobDescription) endpoint.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getJobDescriptionAsync(String identifier) {
        return getJobDescriptionWithResponseAsync(identifier)
                .flatMap(
                        (Response<Object> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Returns all the results for that job description if processing is completed. The `identifier` is the unique ID
     * returned after POST-ing the resume via the [/job_descriptions](#operation/createJobDescription) endpoint.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object getJobDescription(String identifier) {
        return getJobDescriptionAsync(identifier).block();
    }

    /**
     * Deletes the specified job description from the database.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RequestError>> deleteJobDescriptionWithResponseAsync(String identifier) {
        final String accept = "application/json";
        return service.deleteJobDescription(this.getHost(), identifier, accept);
    }

    /**
     * Deletes the specified job description from the database.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RequestError> deleteJobDescriptionAsync(String identifier) {
        return deleteJobDescriptionWithResponseAsync(identifier)
                .flatMap(
                        (Response<RequestError> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Deletes the specified job description from the database.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RequestError deleteJobDescription(String identifier) {
        return deleteJobDescriptionAsync(identifier).block();
    }

    /**
     * Returns all the indexes.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> getAllIndexesWithResponseAsync(Integer offset, Integer limit) {
        final String accept = "application/json";
        return service.getAllIndexes(this.getHost(), offset, limit, accept);
    }

    /**
     * Returns all the indexes.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getAllIndexesAsync(Integer offset, Integer limit) {
        return getAllIndexesWithResponseAsync(offset, limit)
                .flatMap(
                        (Response<Object> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Returns all the indexes.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object getAllIndexes(Integer offset, Integer limit) {
        return getAllIndexesAsync(offset, limit).block();
    }

    /**
     * Create an index for the search tool.
     *
     * @param name The name parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> createIndexWithResponseAsync(String name) {
        final String accept = "application/json";
        return service.createIndex(this.getHost(), name, accept);
    }

    /**
     * Create an index for the search tool.
     *
     * @param name The name parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> createIndexAsync(String name) {
        return createIndexWithResponseAsync(name)
                .flatMap(
                        (Response<Object> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Create an index for the search tool.
     *
     * @param name The name parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object createIndex(String name) {
        return createIndexAsync(name).block();
    }

    /**
     * Deletes the specified index from the database.
     *
     * @param name Index name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RequestError>> deleteIndexWithResponseAsync(String name) {
        final String accept = "application/json";
        return service.deleteIndex(this.getHost(), name, accept);
    }

    /**
     * Deletes the specified index from the database.
     *
     * @param name Index name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RequestError> deleteIndexAsync(String name) {
        return deleteIndexWithResponseAsync(name)
                .flatMap(
                        (Response<RequestError> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Deletes the specified index from the database.
     *
     * @param name Index name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RequestError deleteIndex(String name) {
        return deleteIndexAsync(name).block();
    }

    /**
     * Returns all the indexed documents for that index.
     *
     * @param name Index name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> getAllIndexDocumentsWithResponseAsync(String name) {
        final String accept = "application/json";
        return service.getAllIndexDocuments(this.getHost(), name, accept);
    }

    /**
     * Returns all the indexed documents for that index.
     *
     * @param name Index name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getAllIndexDocumentsAsync(String name) {
        return getAllIndexDocumentsWithResponseAsync(name)
                .flatMap(
                        (Response<Object> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Returns all the indexed documents for that index.
     *
     * @param name Index name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object getAllIndexDocuments(String name) {
        return getAllIndexDocumentsAsync(name).block();
    }

    /**
     * Create an indexed document for the search tool.
     *
     * @param name Index name.
     * @param body Document to index.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> createIndexDocumentWithResponseAsync(
            String name, PathsGpptmIndexNameDocumentsPostRequestbodyContentApplicationJsonSchema body) {
        final String accept = "application/json";
        return service.createIndexDocument(this.getHost(), name, body, accept);
    }

    /**
     * Create an indexed document for the search tool.
     *
     * @param name Index name.
     * @param body Document to index.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> createIndexDocumentAsync(
            String name, PathsGpptmIndexNameDocumentsPostRequestbodyContentApplicationJsonSchema body) {
        return createIndexDocumentWithResponseAsync(name, body)
                .flatMap(
                        (Response<Object> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Create an indexed document for the search tool.
     *
     * @param name Index name.
     * @param body Document to index.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object createIndexDocument(
            String name, PathsGpptmIndexNameDocumentsPostRequestbodyContentApplicationJsonSchema body) {
        return createIndexDocumentAsync(name, body).block();
    }

    /**
     * Delete the specified indexed document from the database.
     *
     * @param name Index name.
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RequestError>> deleteIndexDocumentWithResponseAsync(String name, String identifier) {
        final String accept = "application/json";
        return service.deleteIndexDocument(this.getHost(), name, identifier, accept);
    }

    /**
     * Delete the specified indexed document from the database.
     *
     * @param name Index name.
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RequestError> deleteIndexDocumentAsync(String name, String identifier) {
        return deleteIndexDocumentWithResponseAsync(name, identifier)
                .flatMap(
                        (Response<RequestError> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Delete the specified indexed document from the database.
     *
     * @param name Index name.
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RequestError deleteIndexDocument(String name, String identifier) {
        return deleteIndexDocumentAsync(name, identifier).block();
    }

    /**
     * Returns all the invoice summaries for that user, limited to 300 per page.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> getAllInvoicesWithResponseAsync(Integer offset, Integer limit) {
        final String accept = "application/json";
        return service.getAllInvoices(this.getHost(), offset, limit, accept);
    }

    /**
     * Returns all the invoice summaries for that user, limited to 300 per page.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getAllInvoicesAsync(Integer offset, Integer limit) {
        return getAllInvoicesWithResponseAsync(offset, limit)
                .flatMap(
                        (Response<Object> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Returns all the invoice summaries for that user, limited to 300 per page.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object getAllInvoices(Integer offset, Integer limit) {
        return getAllInvoicesAsync(offset, limit).block();
    }

    /**
     * Uploads an invoice for parsing. When successful, returns an `identifier` in the response for subsequent use with
     * the [/invoices/{identifier}](#operation/getInvoice) endpoint to check processing status and retrieve results.
     *
     * @param file File as binary data blob. Supported formats: PDF, DOC, DOCX, TXT, RTF, HTML, PNG, JPG.
     * @param contentLength The contentLength parameter.
     * @param identifier Unique identifier for the document. If creating a document and left blank, one will be
     *     automatically generated.
     * @param fileName Optional filename of the file.
     * @param url URL to file to download and process.
     * @param wait If "true" (default), will return a response only after processing has completed. If "false", will
     *     return an empty data object which can be polled at the GET endpoint until processing is complete.
     * @param language Language code in ISO 639-1 format. Must specify zh-cn or zh-tw for Chinese.
     * @param expiryTime The date/time in ISO-8601 format when the document will be automatically deleted. Defaults to
     *     no expiry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> createInvoiceWithResponseAsync(
            Flux<ByteBuffer> file,
            Long contentLength,
            String identifier,
            String fileName,
            String url,
            String wait,
            String language,
            String expiryTime) {
        final String accept = "application/json";
        return service.createInvoice(
                this.getHost(), file, contentLength, identifier, fileName, url, wait, language, expiryTime, accept);
    }

    /**
     * Uploads an invoice for parsing. When successful, returns an `identifier` in the response for subsequent use with
     * the [/invoices/{identifier}](#operation/getInvoice) endpoint to check processing status and retrieve results.
     *
     * @param file File as binary data blob. Supported formats: PDF, DOC, DOCX, TXT, RTF, HTML, PNG, JPG.
     * @param contentLength The contentLength parameter.
     * @param identifier Unique identifier for the document. If creating a document and left blank, one will be
     *     automatically generated.
     * @param fileName Optional filename of the file.
     * @param url URL to file to download and process.
     * @param wait If "true" (default), will return a response only after processing has completed. If "false", will
     *     return an empty data object which can be polled at the GET endpoint until processing is complete.
     * @param language Language code in ISO 639-1 format. Must specify zh-cn or zh-tw for Chinese.
     * @param expiryTime The date/time in ISO-8601 format when the document will be automatically deleted. Defaults to
     *     no expiry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> createInvoiceAsync(
            Flux<ByteBuffer> file,
            Long contentLength,
            String identifier,
            String fileName,
            String url,
            String wait,
            String language,
            String expiryTime) {
        return createInvoiceWithResponseAsync(
                        file, contentLength, identifier, fileName, url, wait, language, expiryTime)
                .flatMap(
                        (Response<Object> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Uploads an invoice for parsing. When successful, returns an `identifier` in the response for subsequent use with
     * the [/invoices/{identifier}](#operation/getInvoice) endpoint to check processing status and retrieve results.
     *
     * @param file File as binary data blob. Supported formats: PDF, DOC, DOCX, TXT, RTF, HTML, PNG, JPG.
     * @param contentLength The contentLength parameter.
     * @param identifier Unique identifier for the document. If creating a document and left blank, one will be
     *     automatically generated.
     * @param fileName Optional filename of the file.
     * @param url URL to file to download and process.
     * @param wait If "true" (default), will return a response only after processing has completed. If "false", will
     *     return an empty data object which can be polled at the GET endpoint until processing is complete.
     * @param language Language code in ISO 639-1 format. Must specify zh-cn or zh-tw for Chinese.
     * @param expiryTime The date/time in ISO-8601 format when the document will be automatically deleted. Defaults to
     *     no expiry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object createInvoice(
            Flux<ByteBuffer> file,
            Long contentLength,
            String identifier,
            String fileName,
            String url,
            String wait,
            String language,
            String expiryTime) {
        return createInvoiceAsync(file, contentLength, identifier, fileName, url, wait, language, expiryTime).block();
    }

    /**
     * Returns all the parse results for that invoice if processing is completed. The `identifier` is the unique ID
     * returned after POST-ing the invoice via the [/invoices](#operation/createInvoice) endpoint.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> getInvoiceWithResponseAsync(String identifier) {
        final String accept = "application/json";
        return service.getInvoice(this.getHost(), identifier, accept);
    }

    /**
     * Returns all the parse results for that invoice if processing is completed. The `identifier` is the unique ID
     * returned after POST-ing the invoice via the [/invoices](#operation/createInvoice) endpoint.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getInvoiceAsync(String identifier) {
        return getInvoiceWithResponseAsync(identifier)
                .flatMap(
                        (Response<Object> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Returns all the parse results for that invoice if processing is completed. The `identifier` is the unique ID
     * returned after POST-ing the invoice via the [/invoices](#operation/createInvoice) endpoint.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object getInvoice(String identifier) {
        return getInvoiceAsync(identifier).block();
    }

    /**
     * Delete the specified invoice from the database.
     *
     * @param identifier Invoice identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RequestError>> deleteInvoiceWithResponseAsync(String identifier) {
        final String accept = "application/json";
        return service.deleteInvoice(this.getHost(), identifier, accept);
    }

    /**
     * Delete the specified invoice from the database.
     *
     * @param identifier Invoice identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RequestError> deleteInvoiceAsync(String identifier) {
        return deleteInvoiceWithResponseAsync(identifier)
                .flatMap(
                        (Response<RequestError> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Delete the specified invoice from the database.
     *
     * @param identifier Invoice identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RequestError deleteInvoice(String identifier) {
        return deleteInvoiceAsync(identifier).block();
    }

    /**
     * TODO TODO TODO.
     *
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> listOccupationGroupsWithResponseAsync() {
        final String accept = "application/json";
        return service.listOccupationGroups(this.getHost(), accept);
    }

    /**
     * TODO TODO TODO.
     *
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> listOccupationGroupsAsync() {
        return listOccupationGroupsWithResponseAsync()
                .flatMap(
                        (Response<Object> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * TODO TODO TODO.
     *
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object listOccupationGroups() {
        return listOccupationGroupsAsync().block();
    }
}
