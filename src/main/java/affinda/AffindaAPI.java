package affinda;

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
import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import java.net.URL;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the AffindaAPI type. */
public final class AffindaAPI {
    /** The proxy service used to perform REST calls. */
    private final AffindaAPIService service;

    /** The numbers of documents to return, defaults to 300. */
    private final int limit;

    /**
     * Gets The numbers of documents to return, defaults to 300.
     *
     * @return the limit value.
     */
    public int getLimit() {
        return this.limit;
    }

    /** The number of documents to skip before starting to collect the result set. */
    private final int offset;

    /**
     * Gets The number of documents to skip before starting to collect the result set.
     *
     * @return the offset value.
     */
    public int getOffset() {
        return this.offset;
    }

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
     * @param limit The numbers of documents to return, defaults to 300.
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param host server parameter.
     */
    AffindaAPI(int limit, int offset, String host) {
        this(
                new HttpPipelineBuilder()
                        .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                        .build(),
                JacksonAdapter.createDefaultSerializerAdapter(),
                limit,
                offset,
                host);
    }

    /**
     * Initializes an instance of AffindaAPI client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param limit The numbers of documents to return, defaults to 300.
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param host server parameter.
     */
    AffindaAPI(HttpPipeline httpPipeline, int limit, int offset, String host) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), limit, offset, host);
    }

    /**
     * Initializes an instance of AffindaAPI client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param limit The numbers of documents to return, defaults to 300.
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param host server parameter.
     */
    AffindaAPI(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, int limit, int offset, String host) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.limit = limit;
        this.offset = offset;
        this.host = host;
        this.service = RestProxy.create(AffindaAPIService.class, this.httpPipeline, this.getSerializerAdapter());
    }

    /** The interface defining all the services for AffindaAPI to be used by the proxy service to perform REST calls. */
    @Host("{$host}")
    @ServiceInterface(name = "AffindaAPI")
    private interface AffindaAPIService {
        @Get("/resumes")
        @ExpectedResponses({200, 401})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Object>> getAllResumes(
                @HostParam("$host") String host,
                @QueryParam("limit") Integer limit,
                @QueryParam("offset") Integer offset,
                @HeaderParam("Accept") String accept);

        // @Multipart not supported by RestProxy
        @Post("/resumes")
        @ExpectedResponses({201, 400, 401, 404})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Object>> createResume(
                @HostParam("$host") String host,
                @BodyParam("multipart/form-data") Flux<ByteBuffer> file,
                @HeaderParam("Content-Length") Long contentLength,
                @BodyParam("multipart/form-data") String identifier,
                @BodyParam("multipart/form-data") String fileName,
                @BodyParam("multipart/form-data") URL url,
                @BodyParam("multipart/form-data") Boolean wait,
                @BodyParam("multipart/form-data") String resumeLanguage,
                @BodyParam("multipart/form-data") String expiryTime,
                @HeaderParam("Accept") String accept);

        @Get("/resumes/{identifier}")
        @ExpectedResponses({200, 401, 404})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Object>> getResume(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Delete("/resumes/{identifier}")
        @ExpectedResponses({204, 401, 404})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Object>> deleteResume(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Get("/redacted_resumes")
        @ExpectedResponses({200, 401, 404})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Object>> getAllRedactedResumes(
                @HostParam("$host") String host,
                @QueryParam("limit") Integer limit,
                @QueryParam("offset") Integer offset,
                @HeaderParam("Accept") String accept);

        // @Multipart not supported by RestProxy
        @Post("/redacted_resumes")
        @ExpectedResponses({201, 400, 401, 404})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Object>> createRedactedResume(
                @HostParam("$host") String host,
                @BodyParam("multipart/form-data") Flux<ByteBuffer> file,
                @HeaderParam("Content-Length") Long contentLength,
                @BodyParam("multipart/form-data") String identifier,
                @BodyParam("multipart/form-data") String fileName,
                @BodyParam("multipart/form-data") URL url,
                @BodyParam("multipart/form-data") String resumeLanguage,
                @BodyParam("multipart/form-data") Boolean redactHeadshot,
                @BodyParam("multipart/form-data") Boolean redactPersonalDetails,
                @BodyParam("multipart/form-data") Boolean redactWorkDetails,
                @BodyParam("multipart/form-data") Boolean redactEducationDetails,
                @BodyParam("multipart/form-data") Boolean redactReferees,
                @BodyParam("multipart/form-data") Boolean redactLocations,
                @BodyParam("multipart/form-data") Boolean redactDates,
                @BodyParam("multipart/form-data") String expiryTime,
                @HeaderParam("Accept") String accept);

        @Get("/redacted_resumes/{identifier}")
        @ExpectedResponses({200, 401, 404})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Object>> getRedactedResume(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Delete("/redacted_resumes/{identifier}")
        @ExpectedResponses({204, 401, 404})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Object>> deleteRedactedResume(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Get("/resume_formats")
        @ExpectedResponses({200, 401, 404})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Object>> getAllResumeFormats(
                @HostParam("$host") String host,
                @QueryParam("limit") Integer limit,
                @QueryParam("offset") Integer offset,
                @HeaderParam("Accept") String accept);

        @Get("/reformatted_resumes")
        @ExpectedResponses({200, 401, 404})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Object>> getAllReformattedResumes(
                @HostParam("$host") String host,
                @QueryParam("limit") Integer limit,
                @QueryParam("offset") Integer offset,
                @HeaderParam("Accept") String accept);

        // @Multipart not supported by RestProxy
        @Post("/reformatted_resumes")
        @ExpectedResponses({201, 400, 401, 404})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Object>> createReformattedResume(
                @HostParam("$host") String host,
                @BodyParam("multipart/form-data") Flux<ByteBuffer> file,
                @HeaderParam("Content-Length") Long contentLength,
                @BodyParam("multipart/form-data") String identifier,
                @BodyParam("multipart/form-data") String fileName,
                @BodyParam("multipart/form-data") URL url,
                @BodyParam("multipart/form-data") String resumeLanguage,
                @BodyParam("multipart/form-data") String resumeFormat,
                @HeaderParam("Accept") String accept);

        @Get("/reformatted_resumes/{identifier}")
        @ExpectedResponses({200, 401, 404})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Object>> getReformattedResume(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Delete("/reformatted_resumes/{identifier}")
        @ExpectedResponses({204, 401, 404})
        @UnexpectedResponseExceptionType(HttpResponseException.class)
        Mono<Response<Object>> deleteReformattedResume(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);
    }

    /**
     * Returns all the resume summaries for that user, limited to 300 per page.
     *
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> getAllResumesWithResponseAsync() {
        final String accept = "application/json";
        return service.getAllResumes(this.getHost(), this.getLimit(), this.getOffset(), accept);
    }

    /**
     * Returns all the resume summaries for that user, limited to 300 per page.
     *
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getAllResumesAsync() {
        return getAllResumesWithResponseAsync()
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
     * @param file File as binary data blob.
     * @param contentLength The contentLength parameter.
     * @param identifier Unique identifier for the resume. If creating a document and left blank, one will be
     *     automatically generated.
     * @param fileName Optional filename of the file.
     * @param url URL to file to download and process.
     * @param wait If true (default), will return a response only after resume processing has completed. If False, will
     *     return an identifier, which can be polled at the GET endpoint until processing is complete.
     * @param resumeLanguage Language code in ISO 639-1 format. Must specify zh-cn or zh-tw for Chinese.
     * @param expiryTime The date/time in ISO-8601 format when the resume will be automatically deleted. Defaults to no
     *     expiry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> createResumeWithResponseAsync(
            Flux<ByteBuffer> file,
            Long contentLength,
            String identifier,
            String fileName,
            URL url,
            Boolean wait,
            String resumeLanguage,
            String expiryTime) {
        final String accept = "application/json";
        return service.createResume(
                this.getHost(),
                file,
                contentLength,
                identifier,
                fileName,
                url,
                wait,
                resumeLanguage,
                expiryTime,
                accept);
    }

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
     * @param wait If true (default), will return a response only after resume processing has completed. If False, will
     *     return an identifier, which can be polled at the GET endpoint until processing is complete.
     * @param resumeLanguage Language code in ISO 639-1 format. Must specify zh-cn or zh-tw for Chinese.
     * @param expiryTime The date/time in ISO-8601 format when the resume will be automatically deleted. Defaults to no
     *     expiry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> createResumeAsync(
            Flux<ByteBuffer> file,
            Long contentLength,
            String identifier,
            String fileName,
            URL url,
            Boolean wait,
            String resumeLanguage,
            String expiryTime) {
        return createResumeWithResponseAsync(
                        file, contentLength, identifier, fileName, url, wait, resumeLanguage, expiryTime)
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
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
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
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
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
     * Deletes the specified resume from the database.
     *
     * @param identifier Resume identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> deleteResumeWithResponseAsync(String identifier) {
        final String accept = "application/json";
        return service.deleteResume(this.getHost(), identifier, accept);
    }

    /**
     * Deletes the specified resume from the database.
     *
     * @param identifier Resume identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> deleteResumeAsync(String identifier) {
        return deleteResumeWithResponseAsync(identifier)
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
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> getAllRedactedResumesWithResponseAsync() {
        final String accept = "application/json";
        return service.getAllRedactedResumes(this.getHost(), this.getLimit(), this.getOffset(), accept);
    }

    /**
     * Returns all the redacted resume information for that resume.
     *
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getAllRedactedResumesAsync() {
        return getAllRedactedResumesWithResponseAsync()
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
     * Uploads a resume for redacting. When successful, returns an `identifier` in the response for subsequent use with
     * the [/redacted_resumes/{identifier}](#operation/getRedactedResume) endpoint to check processing status and
     * retrieve results.
     *
     * @param file File as binary data blob.
     * @param contentLength The contentLength parameter.
     * @param identifier Unique identifier for the resume. If creating a document and left blank, one will be
     *     automatically generated.
     * @param fileName Optional filename of the file.
     * @param url URL to file to download and process.
     * @param resumeLanguage Language code in ISO 639-1 format. Must specify zh-cn or zh-tw for Chinese.
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
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> createRedactedResumeWithResponseAsync(
            Flux<ByteBuffer> file,
            Long contentLength,
            String identifier,
            String fileName,
            URL url,
            String resumeLanguage,
            Boolean redactHeadshot,
            Boolean redactPersonalDetails,
            Boolean redactWorkDetails,
            Boolean redactEducationDetails,
            Boolean redactReferees,
            Boolean redactLocations,
            Boolean redactDates,
            String expiryTime) {
        final String accept = "application/json";
        return service.createRedactedResume(
                this.getHost(),
                file,
                contentLength,
                identifier,
                fileName,
                url,
                resumeLanguage,
                redactHeadshot,
                redactPersonalDetails,
                redactWorkDetails,
                redactEducationDetails,
                redactReferees,
                redactLocations,
                redactDates,
                expiryTime,
                accept);
    }

    /**
     * Uploads a resume for redacting. When successful, returns an `identifier` in the response for subsequent use with
     * the [/redacted_resumes/{identifier}](#operation/getRedactedResume) endpoint to check processing status and
     * retrieve results.
     *
     * @param file File as binary data blob.
     * @param contentLength The contentLength parameter.
     * @param identifier Unique identifier for the resume. If creating a document and left blank, one will be
     *     automatically generated.
     * @param fileName Optional filename of the file.
     * @param url URL to file to download and process.
     * @param resumeLanguage Language code in ISO 639-1 format. Must specify zh-cn or zh-tw for Chinese.
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
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> createRedactedResumeAsync(
            Flux<ByteBuffer> file,
            Long contentLength,
            String identifier,
            String fileName,
            URL url,
            String resumeLanguage,
            Boolean redactHeadshot,
            Boolean redactPersonalDetails,
            Boolean redactWorkDetails,
            Boolean redactEducationDetails,
            Boolean redactReferees,
            Boolean redactLocations,
            Boolean redactDates,
            String expiryTime) {
        return createRedactedResumeWithResponseAsync(
                        file,
                        contentLength,
                        identifier,
                        fileName,
                        url,
                        resumeLanguage,
                        redactHeadshot,
                        redactPersonalDetails,
                        redactWorkDetails,
                        redactEducationDetails,
                        redactReferees,
                        redactLocations,
                        redactDates,
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
     * Returns all the redaction results for that resume if processing is completed. The `identifier` is the unique ID
     * returned after POST-ing the resume via the [/redacted_resumes](#operation/createRedactedResume) endpoint.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
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
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
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
     * Deletes the specified resume from the database.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> deleteRedactedResumeWithResponseAsync(String identifier) {
        final String accept = "application/json";
        return service.deleteRedactedResume(this.getHost(), identifier, accept);
    }

    /**
     * Deletes the specified resume from the database.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> deleteRedactedResumeAsync(String identifier) {
        return deleteRedactedResumeWithResponseAsync(identifier)
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
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> getAllResumeFormatsWithResponseAsync() {
        final String accept = "application/json";
        return service.getAllResumeFormats(this.getHost(), this.getLimit(), this.getOffset(), accept);
    }

    /**
     * Returns all the resume formats.
     *
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getAllResumeFormatsAsync() {
        return getAllResumeFormatsWithResponseAsync()
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
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> getAllReformattedResumesWithResponseAsync() {
        final String accept = "application/json";
        return service.getAllReformattedResumes(this.getHost(), this.getLimit(), this.getOffset(), accept);
    }

    /**
     * Returns all the reformatted resume information for that resume.
     *
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getAllReformattedResumesAsync() {
        return getAllReformattedResumesWithResponseAsync()
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
     * Uploads a resume for reformatting. When successful, returns an `identifier` in the response for subsequent use
     * with the [/reformatted_resumes/{identifier}](#operation/getReformattedResume) endpoint to check processing status
     * and retrieve results.
     *
     * @param resumeFormat Identifier of the format used.
     * @param file File as binary data blob.
     * @param contentLength The contentLength parameter.
     * @param identifier Unique identifier for the resume. If creating a document and left blank, one will be
     *     automatically generated.
     * @param fileName Optional filename of the file.
     * @param url URL to file to download and process.
     * @param resumeLanguage Language code in ISO 639-1 format. Must specify zh-cn or zh-tw for Chinese.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> createReformattedResumeWithResponseAsync(
            String resumeFormat,
            Flux<ByteBuffer> file,
            Long contentLength,
            String identifier,
            String fileName,
            URL url,
            String resumeLanguage) {
        final String accept = "application/json";
        return service.createReformattedResume(
                this.getHost(), file, contentLength, identifier, fileName, url, resumeLanguage, resumeFormat, accept);
    }

    /**
     * Uploads a resume for reformatting. When successful, returns an `identifier` in the response for subsequent use
     * with the [/reformatted_resumes/{identifier}](#operation/getReformattedResume) endpoint to check processing status
     * and retrieve results.
     *
     * @param resumeFormat Identifier of the format used.
     * @param file File as binary data blob.
     * @param contentLength The contentLength parameter.
     * @param identifier Unique identifier for the resume. If creating a document and left blank, one will be
     *     automatically generated.
     * @param fileName Optional filename of the file.
     * @param url URL to file to download and process.
     * @param resumeLanguage Language code in ISO 639-1 format. Must specify zh-cn or zh-tw for Chinese.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> createReformattedResumeAsync(
            String resumeFormat,
            Flux<ByteBuffer> file,
            Long contentLength,
            String identifier,
            String fileName,
            URL url,
            String resumeLanguage) {
        return createReformattedResumeWithResponseAsync(
                        resumeFormat, file, contentLength, identifier, fileName, url, resumeLanguage)
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
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
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
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
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
     * Deletes the specified resume from the database.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> deleteReformattedResumeWithResponseAsync(String identifier) {
        final String accept = "application/json";
        return service.deleteReformattedResume(this.getHost(), identifier, accept);
    }

    /**
     * Deletes the specified resume from the database.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> deleteReformattedResumeAsync(String identifier) {
        return deleteReformattedResumeWithResponseAsync(identifier)
                .flatMap(
                        (Response<Object> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }
}
