package com.affinda.api.client;

import com.affinda.api.client.models.IndexRequestBody;
import com.affinda.api.client.models.InvoiceRequestBody;
import com.affinda.api.client.models.JobDescriptionRequestBody;
import com.affinda.api.client.models.JobDescriptionSearchParameters;
import com.affinda.api.client.models.Paths2T1Oc0ResumeSearchEmbedPostRequestbodyContentApplicationJsonSchema;
import com.affinda.api.client.models.PathsGpptmIndexNameDocumentsPostRequestbodyContentApplicationJsonSchema;
import com.affinda.api.client.models.RedactedResumeRequestBody;
import com.affinda.api.client.models.RequestError;
import com.affinda.api.client.models.RequestErrorException;
import com.affinda.api.client.models.ResumeData;
import com.affinda.api.client.models.ResumeRequestBody;
import com.affinda.api.client.models.ResumeSearchConfig;
import com.affinda.api.client.models.ResumeSearchParameters;
import com.affinda.api.client.models.User;
import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
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
        @ExpectedResponses({200, 400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> getAllResumes(
                @HostParam("$host") String host,
                @QueryParam("offset") Integer offset,
                @QueryParam("limit") Integer limit,
                @HeaderParam("Accept") String accept);

        @Post("/resumes")
        @ExpectedResponses({200, 201, 400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> createResume(
                @HostParam("$host") String host,
                @BodyParam("application/json") ResumeRequestBody body,
                @HeaderParam("Accept") String accept);

        @Get("/resumes/{identifier}")
        @ExpectedResponses({200, 400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> getResume(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @QueryParam("format") String format,
                @HeaderParam("Accept") String accept);

        @Patch("/resumes/{identifier}")
        @ExpectedResponses({200, 400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> updateResumeData(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @BodyParam("application/json") ResumeData body,
                @HeaderParam("Accept") String accept);

        @Delete("/resumes/{identifier}")
        @ExpectedResponses({204, 400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<RequestError>> deleteResume(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Get("/redacted_resumes")
        @ExpectedResponses({200, 400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> getAllRedactedResumes(
                @HostParam("$host") String host,
                @QueryParam("offset") Integer offset,
                @QueryParam("limit") Integer limit,
                @HeaderParam("Accept") String accept);

        @Post("/redacted_resumes")
        @ExpectedResponses({200, 201, 400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> createRedactedResume(
                @HostParam("$host") String host,
                @BodyParam("application/json") RedactedResumeRequestBody body,
                @HeaderParam("Accept") String accept);

        @Get("/redacted_resumes/{identifier}")
        @ExpectedResponses({200, 400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> getRedactedResume(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Delete("/redacted_resumes/{identifier}")
        @ExpectedResponses({204, 400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<RequestError>> deleteRedactedResume(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Post("/resume_search")
        @ExpectedResponses({201, 400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> createResumeSearch(
                @HostParam("$host") String host,
                @QueryParam("offset") Integer offset,
                @QueryParam("limit") Integer limit,
                @BodyParam("application/json") ResumeSearchParameters body,
                @HeaderParam("Accept") String accept);

        @Post("/resume_search/details/{identifier}")
        @ExpectedResponses({200, 400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> getResumeSearchDetail(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @BodyParam("application/json") ResumeSearchParameters body,
                @HeaderParam("Accept") String accept);

        @Get("/resume_search/match")
        @ExpectedResponses({200, 400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> getResumeSearchMatch(
                @HostParam("$host") String host,
                @QueryParam("resume") String resume,
                @QueryParam("job_description") String jobDescription,
                @QueryParam("index") String index,
                @QueryParam("search_expression") String searchExpression,
                @QueryParam("job_titles_weight") Float jobTitlesWeight,
                @QueryParam("years_experience_weight") Float yearsExperienceWeight,
                @QueryParam("locations_weight") Float locationsWeight,
                @QueryParam("languages_weight") Float languagesWeight,
                @QueryParam("skills_weight") Float skillsWeight,
                @QueryParam("education_weight") Float educationWeight,
                @QueryParam("search_expression_weight") Float searchExpressionWeight,
                @QueryParam("soc_codes_weight") Float socCodesWeight,
                @QueryParam("management_level_weight") Float managementLevelWeight,
                @HeaderParam("Accept") String accept);

        @Get("/resume_search/config")
        @ExpectedResponses({200, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> getResumeSearchConfig(
                @HostParam("$host") String host, @HeaderParam("Accept") String accept);

        @Patch("/resume_search/config")
        @ExpectedResponses({200, 400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> updateResumeSearchConfig(
                @HostParam("$host") String host,
                @BodyParam("application/json") ResumeSearchConfig body,
                @HeaderParam("Accept") String accept);

        @Post("/resume_search/embed")
        @ExpectedResponses({200, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> createResumeSearchEmbedUrl(
                @HostParam("$host") String host,
                @BodyParam("application/json")
                        Paths2T1Oc0ResumeSearchEmbedPostRequestbodyContentApplicationJsonSchema body,
                @HeaderParam("Accept") String accept);

        @Get("/job_descriptions")
        @ExpectedResponses({200, 400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> getAllJobDescriptions(
                @HostParam("$host") String host,
                @QueryParam("offset") Integer offset,
                @QueryParam("limit") Integer limit,
                @HeaderParam("Accept") String accept);

        @Post("/job_descriptions")
        @ExpectedResponses({200, 201, 400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> createJobDescription(
                @HostParam("$host") String host,
                @BodyParam("application/json") JobDescriptionRequestBody body,
                @HeaderParam("Accept") String accept);

        @Get("/job_descriptions/{identifier}")
        @ExpectedResponses({200, 400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> getJobDescription(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Delete("/job_descriptions/{identifier}")
        @ExpectedResponses({204, 400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<RequestError>> deleteJobDescription(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Post("/job_description_search")
        @ExpectedResponses({201, 400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> createJobDescriptionSearch(
                @HostParam("$host") String host,
                @QueryParam("offset") Integer offset,
                @QueryParam("limit") Integer limit,
                @BodyParam("application/json") JobDescriptionSearchParameters body,
                @HeaderParam("Accept") String accept);

        @Post("/job_description_search/details/{identifier}")
        @ExpectedResponses({200, 400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> getJobDescriptionSearchDetail(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @BodyParam("application/json") JobDescriptionSearchParameters body,
                @HeaderParam("Accept") String accept);

        @Get("/index")
        @ExpectedResponses({200, 400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> getAllIndexes(
                @HostParam("$host") String host,
                @QueryParam("offset") Integer offset,
                @QueryParam("limit") Integer limit,
                @HeaderParam("Accept") String accept);

        @Post("/index")
        @ExpectedResponses({201, 400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> createIndex(
                @HostParam("$host") String host,
                @BodyParam("application/json") IndexRequestBody body,
                @HeaderParam("Accept") String accept);

        @Delete("/index/{name}")
        @ExpectedResponses({204, 400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<RequestError>> deleteIndex(
                @HostParam("$host") String host, @PathParam("name") String name, @HeaderParam("Accept") String accept);

        @Get("/index/{name}/documents")
        @ExpectedResponses({200, 400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> getAllIndexDocuments(
                @HostParam("$host") String host, @PathParam("name") String name, @HeaderParam("Accept") String accept);

        @Post("/index/{name}/documents")
        @ExpectedResponses({201, 400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> createIndexDocument(
                @HostParam("$host") String host,
                @PathParam("name") String name,
                @BodyParam("application/json")
                        PathsGpptmIndexNameDocumentsPostRequestbodyContentApplicationJsonSchema body,
                @HeaderParam("Accept") String accept);

        @Delete("/index/{name}/documents/{identifier}")
        @ExpectedResponses({204, 400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<RequestError>> deleteIndexDocument(
                @HostParam("$host") String host,
                @PathParam("name") String name,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Get("/invoices")
        @ExpectedResponses({200, 400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> getAllInvoices(
                @HostParam("$host") String host,
                @QueryParam("offset") Integer offset,
                @QueryParam("limit") Integer limit,
                @HeaderParam("Accept") String accept);

        @Post("/invoices")
        @ExpectedResponses({200, 201, 400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> createInvoice(
                @HostParam("$host") String host,
                @BodyParam("application/json") InvoiceRequestBody body,
                @HeaderParam("Accept") String accept);

        @Get("/invoices/{identifier}")
        @ExpectedResponses({200, 400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> getInvoice(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Delete("/invoices/{identifier}")
        @ExpectedResponses({204, 400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<RequestError>> deleteInvoice(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Get("/occupation_groups")
        @ExpectedResponses({200, 400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> listOccupationGroups(
                @HostParam("$host") String host, @HeaderParam("Accept") String accept);

        @Get("/users")
        @ExpectedResponses({200, 400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> getAllUsers(
                @HostParam("$host") String host,
                @QueryParam("offset") Integer offset,
                @QueryParam("limit") Integer limit,
                @HeaderParam("Accept") String accept);

        @Post("/users")
        @ExpectedResponses({201, 400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> createUser(
                @HostParam("$host") String host,
                @BodyParam("application/json") User body,
                @HeaderParam("Accept") String accept);
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
     * the [/resumes/{identifier}](#get-/resumes/-identifier-) endpoint to check processing status and retrieve
     * results.&lt;br/&gt; Resumes can be uploaded as a file or a URL. In addition, data can be added directly if users
     * want to upload directly without parsing any resume file. For uploading resume data, the `data` argument provided
     * must be a JSON-encoded string. Data uploads will not impact upon parsing credits.
     *
     * @param body Resume to upload, either via file upload or URL to a file.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> createResumeWithResponseAsync(ResumeRequestBody body) {
        final String accept = "application/json";
        return service.createResume(this.getHost(), body, accept);
    }

    /**
     * Uploads a resume for parsing. When successful, returns an `identifier` in the response for subsequent use with
     * the [/resumes/{identifier}](#get-/resumes/-identifier-) endpoint to check processing status and retrieve
     * results.&lt;br/&gt; Resumes can be uploaded as a file or a URL. In addition, data can be added directly if users
     * want to upload directly without parsing any resume file. For uploading resume data, the `data` argument provided
     * must be a JSON-encoded string. Data uploads will not impact upon parsing credits.
     *
     * @param body Resume to upload, either via file upload or URL to a file.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> createResumeAsync(ResumeRequestBody body) {
        return createResumeWithResponseAsync(body)
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
     * the [/resumes/{identifier}](#get-/resumes/-identifier-) endpoint to check processing status and retrieve
     * results.&lt;br/&gt; Resumes can be uploaded as a file or a URL. In addition, data can be added directly if users
     * want to upload directly without parsing any resume file. For uploading resume data, the `data` argument provided
     * must be a JSON-encoded string. Data uploads will not impact upon parsing credits.
     *
     * @param body Resume to upload, either via file upload or URL to a file.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object createResume(ResumeRequestBody body) {
        return createResumeAsync(body).block();
    }

    /**
     * Returns all the parse results for that resume if processing is completed. The `identifier` is the unique ID
     * returned after POST-ing the resume via the [/resumes](#post-/resumes) endpoint.
     *
     * @param identifier Document identifier.
     * @param format Set this to "hr-xml" to get the response in HR-XML format. Currently the only supported value for
     *     this parameter is "hr-xml".
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> getResumeWithResponseAsync(String identifier, String format) {
        final String accept = "application/json";
        return service.getResume(this.getHost(), identifier, format, accept);
    }

    /**
     * Returns all the parse results for that resume if processing is completed. The `identifier` is the unique ID
     * returned after POST-ing the resume via the [/resumes](#post-/resumes) endpoint.
     *
     * @param identifier Document identifier.
     * @param format Set this to "hr-xml" to get the response in HR-XML format. Currently the only supported value for
     *     this parameter is "hr-xml".
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getResumeAsync(String identifier, String format) {
        return getResumeWithResponseAsync(identifier, format)
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
     * returned after POST-ing the resume via the [/resumes](#post-/resumes) endpoint.
     *
     * @param identifier Document identifier.
     * @param format Set this to "hr-xml" to get the response in HR-XML format. Currently the only supported value for
     *     this parameter is "hr-xml".
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object getResume(String identifier, String format) {
        return getResumeAsync(identifier, format).block();
    }

    /**
     * Update data of a parsed resume. The `identifier` is the unique ID returned after POST-ing the resume via the
     * [/resumes](#post-/resumes) endpoint.
     *
     * @param identifier Resume identifier.
     * @param body Resume data to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a JSON-encoded string of the `ResumeData` object along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> updateResumeDataWithResponseAsync(String identifier, ResumeData body) {
        final String accept = "application/json";
        return service.updateResumeData(this.getHost(), identifier, body, accept);
    }

    /**
     * Update data of a parsed resume. The `identifier` is the unique ID returned after POST-ing the resume via the
     * [/resumes](#post-/resumes) endpoint.
     *
     * @param identifier Resume identifier.
     * @param body Resume data to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a JSON-encoded string of the `ResumeData` object on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> updateResumeDataAsync(String identifier, ResumeData body) {
        return updateResumeDataWithResponseAsync(identifier, body)
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
     * Update data of a parsed resume. The `identifier` is the unique ID returned after POST-ing the resume via the
     * [/resumes](#post-/resumes) endpoint.
     *
     * @param identifier Resume identifier.
     * @param body Resume data to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a JSON-encoded string of the `ResumeData` object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object updateResumeData(String identifier, ResumeData body) {
        return updateResumeDataAsync(identifier, body).block();
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
     * @param body Resume to upload, either via fileupload or URL to a file.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> createRedactedResumeWithResponseAsync(RedactedResumeRequestBody body) {
        final String accept = "application/json";
        return service.createRedactedResume(this.getHost(), body, accept);
    }

    /**
     * Uploads a resume for redacting.
     *
     * @param body Resume to upload, either via fileupload or URL to a file.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> createRedactedResumeAsync(RedactedResumeRequestBody body) {
        return createRedactedResumeWithResponseAsync(body)
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
     * @param body Resume to upload, either via fileupload or URL to a file.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object createRedactedResume(RedactedResumeRequestBody body) {
        return createRedactedResumeAsync(body).block();
    }

    /**
     * Returns all the redaction results for that resume if processing is completed. The `identifier` is the unique ID
     * returned after POST-ing the resume via the [/redacted_resumes](#post-/redacted_resumes) endpoint.
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
     * returned after POST-ing the resume via the [/redacted_resumes](#post-/redacted_resumes) endpoint.
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
     * returned after POST-ing the resume via the [/redacted_resumes](#post-/redacted_resumes) endpoint.
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
     * Searches through parsed resumes. Users have 3 options to create a search:&lt;br /&gt;&lt;br /&gt; 1. Match to a
     * job description - a parsed job description is used to find candidates that suit it&lt;br /&gt; 2. Match to a
     * resume - a parsed resume is used to find other candidates that have similar attributes&lt;br /&gt; 3. Search
     * using custom criteria&lt;br /&gt;&lt;br /&gt; Users should only populate 1 of jobDescription, resume or the
     * custom criteria.
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
     * Searches through parsed resumes. Users have 3 options to create a search:&lt;br /&gt;&lt;br /&gt; 1. Match to a
     * job description - a parsed job description is used to find candidates that suit it&lt;br /&gt; 2. Match to a
     * resume - a parsed resume is used to find other candidates that have similar attributes&lt;br /&gt; 3. Search
     * using custom criteria&lt;br /&gt;&lt;br /&gt; Users should only populate 1 of jobDescription, resume or the
     * custom criteria.
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
     * Searches through parsed resumes. Users have 3 options to create a search:&lt;br /&gt;&lt;br /&gt; 1. Match to a
     * job description - a parsed job description is used to find candidates that suit it&lt;br /&gt; 2. Match to a
     * resume - a parsed resume is used to find other candidates that have similar attributes&lt;br /&gt; 3. Search
     * using custom criteria&lt;br /&gt;&lt;br /&gt; Users should only populate 1 of jobDescription, resume or the
     * custom criteria.
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
     * This contains more detailed information about the matching score of the search criteria, or which search criteria
     * is missing in this resume. The `identifier` is the unique ID returned via the
     * [/resume_search](#post-/resume_search) endpoint.
     *
     * @param identifier Resume identifier.
     * @param body Search parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> getResumeSearchDetailWithResponseAsync(
            String identifier, ResumeSearchParameters body) {
        final String accept = "application/json";
        return service.getResumeSearchDetail(this.getHost(), identifier, body, accept);
    }

    /**
     * This contains more detailed information about the matching score of the search criteria, or which search criteria
     * is missing in this resume. The `identifier` is the unique ID returned via the
     * [/resume_search](#post-/resume_search) endpoint.
     *
     * @param identifier Resume identifier.
     * @param body Search parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getResumeSearchDetailAsync(String identifier, ResumeSearchParameters body) {
        return getResumeSearchDetailWithResponseAsync(identifier, body)
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
     * This contains more detailed information about the matching score of the search criteria, or which search criteria
     * is missing in this resume. The `identifier` is the unique ID returned via the
     * [/resume_search](#post-/resume_search) endpoint.
     *
     * @param identifier Resume identifier.
     * @param body Search parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object getResumeSearchDetail(String identifier, ResumeSearchParameters body) {
        return getResumeSearchDetailAsync(identifier, body).block();
    }

    /**
     * Get the matching score between a resume and a job description. The score ranges between 0 and 1, with 0 being not
     * a match at all, and 1 being perfect match.&lt;br/&gt; Note, this score will not directly match the score returned
     * from POST [/resume_search/details/{identifier}](#post-/resume_search/details/-identifier-).
     *
     * @param resume Identify the resume to match.
     * @param jobDescription Identify the job description to match.
     * @param index Optionally, specify an index to search in. If not specified, will search in all indexes.
     * @param searchExpression Add keywords to the search criteria.
     * @param jobTitlesWeight How important is this criteria to the matching score, range from 0 to 1.
     * @param yearsExperienceWeight How important is this criteria to the matching score, range from 0 to 1.
     * @param locationsWeight How important is this criteria to the matching score, range from 0 to 1.
     * @param languagesWeight How important is this criteria to the matching score, range from 0 to 1.
     * @param skillsWeight How important is this criteria to the matching score, range from 0 to 1.
     * @param educationWeight How important is this criteria to the matching score, range from 0 to 1.
     * @param searchExpressionWeight How important is this criteria to the matching score, range from 0 to 1.
     * @param socCodesWeight How important is this criteria to the matching score, range from 0 to 1.
     * @param managementLevelWeight How important is this criteria to the matching score, range from 0 to 1.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the matching score between a resume and a job description along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> getResumeSearchMatchWithResponseAsync(
            String resume,
            String jobDescription,
            String index,
            String searchExpression,
            Float jobTitlesWeight,
            Float yearsExperienceWeight,
            Float locationsWeight,
            Float languagesWeight,
            Float skillsWeight,
            Float educationWeight,
            Float searchExpressionWeight,
            Float socCodesWeight,
            Float managementLevelWeight) {
        final String accept = "application/json";
        return service.getResumeSearchMatch(
                this.getHost(),
                resume,
                jobDescription,
                index,
                searchExpression,
                jobTitlesWeight,
                yearsExperienceWeight,
                locationsWeight,
                languagesWeight,
                skillsWeight,
                educationWeight,
                searchExpressionWeight,
                socCodesWeight,
                managementLevelWeight,
                accept);
    }

    /**
     * Get the matching score between a resume and a job description. The score ranges between 0 and 1, with 0 being not
     * a match at all, and 1 being perfect match.&lt;br/&gt; Note, this score will not directly match the score returned
     * from POST [/resume_search/details/{identifier}](#post-/resume_search/details/-identifier-).
     *
     * @param resume Identify the resume to match.
     * @param jobDescription Identify the job description to match.
     * @param index Optionally, specify an index to search in. If not specified, will search in all indexes.
     * @param searchExpression Add keywords to the search criteria.
     * @param jobTitlesWeight How important is this criteria to the matching score, range from 0 to 1.
     * @param yearsExperienceWeight How important is this criteria to the matching score, range from 0 to 1.
     * @param locationsWeight How important is this criteria to the matching score, range from 0 to 1.
     * @param languagesWeight How important is this criteria to the matching score, range from 0 to 1.
     * @param skillsWeight How important is this criteria to the matching score, range from 0 to 1.
     * @param educationWeight How important is this criteria to the matching score, range from 0 to 1.
     * @param searchExpressionWeight How important is this criteria to the matching score, range from 0 to 1.
     * @param socCodesWeight How important is this criteria to the matching score, range from 0 to 1.
     * @param managementLevelWeight How important is this criteria to the matching score, range from 0 to 1.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the matching score between a resume and a job description on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getResumeSearchMatchAsync(
            String resume,
            String jobDescription,
            String index,
            String searchExpression,
            Float jobTitlesWeight,
            Float yearsExperienceWeight,
            Float locationsWeight,
            Float languagesWeight,
            Float skillsWeight,
            Float educationWeight,
            Float searchExpressionWeight,
            Float socCodesWeight,
            Float managementLevelWeight) {
        return getResumeSearchMatchWithResponseAsync(
                        resume,
                        jobDescription,
                        index,
                        searchExpression,
                        jobTitlesWeight,
                        yearsExperienceWeight,
                        locationsWeight,
                        languagesWeight,
                        skillsWeight,
                        educationWeight,
                        searchExpressionWeight,
                        socCodesWeight,
                        managementLevelWeight)
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
     * Get the matching score between a resume and a job description. The score ranges between 0 and 1, with 0 being not
     * a match at all, and 1 being perfect match.&lt;br/&gt; Note, this score will not directly match the score returned
     * from POST [/resume_search/details/{identifier}](#post-/resume_search/details/-identifier-).
     *
     * @param resume Identify the resume to match.
     * @param jobDescription Identify the job description to match.
     * @param index Optionally, specify an index to search in. If not specified, will search in all indexes.
     * @param searchExpression Add keywords to the search criteria.
     * @param jobTitlesWeight How important is this criteria to the matching score, range from 0 to 1.
     * @param yearsExperienceWeight How important is this criteria to the matching score, range from 0 to 1.
     * @param locationsWeight How important is this criteria to the matching score, range from 0 to 1.
     * @param languagesWeight How important is this criteria to the matching score, range from 0 to 1.
     * @param skillsWeight How important is this criteria to the matching score, range from 0 to 1.
     * @param educationWeight How important is this criteria to the matching score, range from 0 to 1.
     * @param searchExpressionWeight How important is this criteria to the matching score, range from 0 to 1.
     * @param socCodesWeight How important is this criteria to the matching score, range from 0 to 1.
     * @param managementLevelWeight How important is this criteria to the matching score, range from 0 to 1.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the matching score between a resume and a job description.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object getResumeSearchMatch(
            String resume,
            String jobDescription,
            String index,
            String searchExpression,
            Float jobTitlesWeight,
            Float yearsExperienceWeight,
            Float locationsWeight,
            Float languagesWeight,
            Float skillsWeight,
            Float educationWeight,
            Float searchExpressionWeight,
            Float socCodesWeight,
            Float managementLevelWeight) {
        return getResumeSearchMatchAsync(
                        resume,
                        jobDescription,
                        index,
                        searchExpression,
                        jobTitlesWeight,
                        yearsExperienceWeight,
                        locationsWeight,
                        languagesWeight,
                        skillsWeight,
                        educationWeight,
                        searchExpressionWeight,
                        socCodesWeight,
                        managementLevelWeight)
                .block();
    }

    /**
     * Return configurations such as which fields can be displayed in the logged in user's embedable search tool, what
     * are their weights, what is the maximum number of results that can be returned, etc.
     *
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> getResumeSearchConfigWithResponseAsync() {
        final String accept = "application/json";
        return service.getResumeSearchConfig(this.getHost(), accept);
    }

    /**
     * Return configurations such as which fields can be displayed in the logged in user's embedable search tool, what
     * are their weights, what is the maximum number of results that can be returned, etc.
     *
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getResumeSearchConfigAsync() {
        return getResumeSearchConfigWithResponseAsync()
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
     * Return configurations such as which fields can be displayed in the logged in user's embedable search tool, what
     * are their weights, what is the maximum number of results that can be returned, etc.
     *
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object getResumeSearchConfig() {
        return getResumeSearchConfigAsync().block();
    }

    /**
     * Update configurations such as which fields can be displayed in the logged in user's embedable search tool, what
     * are their weights, what is the maximum number of results that can be returned, etc.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> updateResumeSearchConfigWithResponseAsync(ResumeSearchConfig body) {
        final String accept = "application/json";
        return service.updateResumeSearchConfig(this.getHost(), body, accept);
    }

    /**
     * Update configurations such as which fields can be displayed in the logged in user's embedable search tool, what
     * are their weights, what is the maximum number of results that can be returned, etc.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> updateResumeSearchConfigAsync(ResumeSearchConfig body) {
        return updateResumeSearchConfigWithResponseAsync(body)
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
     * Update configurations such as which fields can be displayed in the logged in user's embedable search tool, what
     * are their weights, what is the maximum number of results that can be returned, etc.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object updateResumeSearchConfig(ResumeSearchConfig body) {
        return updateResumeSearchConfigAsync(body).block();
    }

    /**
     * Create and return a signed URL of the resume search tool which then can be embedded on a web page. An optional
     * parameter `config_override` can be passed to override the user-level configurations of the embedable search tool.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> createResumeSearchEmbedUrlWithResponseAsync(
            Paths2T1Oc0ResumeSearchEmbedPostRequestbodyContentApplicationJsonSchema body) {
        final String accept = "application/json";
        return service.createResumeSearchEmbedUrl(this.getHost(), body, accept);
    }

    /**
     * Create and return a signed URL of the resume search tool which then can be embedded on a web page. An optional
     * parameter `config_override` can be passed to override the user-level configurations of the embedable search tool.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> createResumeSearchEmbedUrlAsync(
            Paths2T1Oc0ResumeSearchEmbedPostRequestbodyContentApplicationJsonSchema body) {
        return createResumeSearchEmbedUrlWithResponseAsync(body)
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
     * Create and return a signed URL of the resume search tool which then can be embedded on a web page. An optional
     * parameter `config_override` can be passed to override the user-level configurations of the embedable search tool.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object createResumeSearchEmbedUrl(
            Paths2T1Oc0ResumeSearchEmbedPostRequestbodyContentApplicationJsonSchema body) {
        return createResumeSearchEmbedUrlAsync(body).block();
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
     * use with the [/job_descriptions/{identifier}](#get-/job_descriptions/-identifier-) endpoint to check processing
     * status and retrieve results. Job Descriptions can be uploaded as a file or a URL.
     *
     * @param body Job Description to upload, either via fileupload or URL to a file.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> createJobDescriptionWithResponseAsync(JobDescriptionRequestBody body) {
        final String accept = "application/json";
        return service.createJobDescription(this.getHost(), body, accept);
    }

    /**
     * Uploads a job description for parsing. When successful, returns an `identifier` in the response for subsequent
     * use with the [/job_descriptions/{identifier}](#get-/job_descriptions/-identifier-) endpoint to check processing
     * status and retrieve results. Job Descriptions can be uploaded as a file or a URL.
     *
     * @param body Job Description to upload, either via fileupload or URL to a file.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> createJobDescriptionAsync(JobDescriptionRequestBody body) {
        return createJobDescriptionWithResponseAsync(body)
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
     * use with the [/job_descriptions/{identifier}](#get-/job_descriptions/-identifier-) endpoint to check processing
     * status and retrieve results. Job Descriptions can be uploaded as a file or a URL.
     *
     * @param body Job Description to upload, either via fileupload or URL to a file.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object createJobDescription(JobDescriptionRequestBody body) {
        return createJobDescriptionAsync(body).block();
    }

    /**
     * Returns all the results for that job description if processing is completed. The `identifier` is the unique ID
     * returned after POST-ing the resume via the [/job_descriptions](#post-/job_descriptions) endpoint.
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
     * returned after POST-ing the resume via the [/job_descriptions](#post-/job_descriptions) endpoint.
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
     * returned after POST-ing the resume via the [/job_descriptions](#post-/job_descriptions) endpoint.
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
     * Searches through parsed job descriptions. You can search with custom criterias or a resume.
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
    public Mono<Response<Object>> createJobDescriptionSearchWithResponseAsync(
            JobDescriptionSearchParameters body, Integer offset, Integer limit) {
        final String accept = "application/json";
        return service.createJobDescriptionSearch(this.getHost(), offset, limit, body, accept);
    }

    /**
     * Searches through parsed job descriptions. You can search with custom criterias or a resume.
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
    public Mono<Object> createJobDescriptionSearchAsync(
            JobDescriptionSearchParameters body, Integer offset, Integer limit) {
        return createJobDescriptionSearchWithResponseAsync(body, offset, limit)
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
     * Searches through parsed job descriptions. You can search with custom criterias or a resume.
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
    public Object createJobDescriptionSearch(JobDescriptionSearchParameters body, Integer offset, Integer limit) {
        return createJobDescriptionSearchAsync(body, offset, limit).block();
    }

    /**
     * This contains more detailed information about the matching score of the search criteria, or which search criteria
     * is missing in this job description. The `identifier` is the unique ID returned via the
     * [/job_description_search](#post-/job_description_search) endpoint.
     *
     * @param identifier Job Description identifier.
     * @param body Search parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> getJobDescriptionSearchDetailWithResponseAsync(
            String identifier, JobDescriptionSearchParameters body) {
        final String accept = "application/json";
        return service.getJobDescriptionSearchDetail(this.getHost(), identifier, body, accept);
    }

    /**
     * This contains more detailed information about the matching score of the search criteria, or which search criteria
     * is missing in this job description. The `identifier` is the unique ID returned via the
     * [/job_description_search](#post-/job_description_search) endpoint.
     *
     * @param identifier Job Description identifier.
     * @param body Search parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getJobDescriptionSearchDetailAsync(String identifier, JobDescriptionSearchParameters body) {
        return getJobDescriptionSearchDetailWithResponseAsync(identifier, body)
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
     * This contains more detailed information about the matching score of the search criteria, or which search criteria
     * is missing in this job description. The `identifier` is the unique ID returned via the
     * [/job_description_search](#post-/job_description_search) endpoint.
     *
     * @param identifier Job Description identifier.
     * @param body Search parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object getJobDescriptionSearchDetail(String identifier, JobDescriptionSearchParameters body) {
        return getJobDescriptionSearchDetailAsync(identifier, body).block();
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
     * @param body Index to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> createIndexWithResponseAsync(IndexRequestBody body) {
        final String accept = "application/json";
        return service.createIndex(this.getHost(), body, accept);
    }

    /**
     * Create an index for the search tool.
     *
     * @param body Index to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> createIndexAsync(IndexRequestBody body) {
        return createIndexWithResponseAsync(body)
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
     * @param body Index to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object createIndex(IndexRequestBody body) {
        return createIndexAsync(body).block();
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
     * the [/invoices/{identifier}](#get-/invoices/-identifier-) endpoint to check processing status and retrieve
     * results.
     *
     * @param body Invoice to upload, either via fileupload or URL to a file.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> createInvoiceWithResponseAsync(InvoiceRequestBody body) {
        final String accept = "application/json";
        return service.createInvoice(this.getHost(), body, accept);
    }

    /**
     * Uploads an invoice for parsing. When successful, returns an `identifier` in the response for subsequent use with
     * the [/invoices/{identifier}](#get-/invoices/-identifier-) endpoint to check processing status and retrieve
     * results.
     *
     * @param body Invoice to upload, either via fileupload or URL to a file.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> createInvoiceAsync(InvoiceRequestBody body) {
        return createInvoiceWithResponseAsync(body)
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
     * the [/invoices/{identifier}](#get-/invoices/-identifier-) endpoint to check processing status and retrieve
     * results.
     *
     * @param body Invoice to upload, either via fileupload or URL to a file.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object createInvoice(InvoiceRequestBody body) {
        return createInvoiceAsync(body).block();
    }

    /**
     * Returns all the parse results for that invoice if processing is completed. The `identifier` is the unique ID
     * returned after POST-ing the invoice via the [/invoices](#post-/invoices) endpoint.
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
     * returned after POST-ing the invoice via the [/invoices](#post-/invoices) endpoint.
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
     * returned after POST-ing the invoice via the [/invoices](#post-/invoices) endpoint.
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
     * Delete the specified invoice from the database. Note, any invoices deleted from the database will no longer be
     * used in any tailored customer models.
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
     * Delete the specified invoice from the database. Note, any invoices deleted from the database will no longer be
     * used in any tailored customer models.
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
     * Delete the specified invoice from the database. Note, any invoices deleted from the database will no longer be
     * used in any tailored customer models.
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
     * Returns the list of searchable occupation groups.
     *
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of OccupationGroup along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> listOccupationGroupsWithResponseAsync() {
        final String accept = "application/json";
        return service.listOccupationGroups(this.getHost(), accept);
    }

    /**
     * Returns the list of searchable occupation groups.
     *
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of OccupationGroup on successful completion of {@link Mono}.
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
     * Returns the list of searchable occupation groups.
     *
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of OccupationGroup.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object listOccupationGroups() {
        return listOccupationGroupsAsync().block();
    }

    /**
     * Returns all the users.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> getAllUsersWithResponseAsync(Integer offset, Integer limit) {
        final String accept = "application/json";
        return service.getAllUsers(this.getHost(), offset, limit, accept);
    }

    /**
     * Returns all the users.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> getAllUsersAsync(Integer offset, Integer limit) {
        return getAllUsersWithResponseAsync(offset, limit)
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
     * Returns all the users.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object getAllUsers(Integer offset, Integer limit) {
        return getAllUsersAsync(offset, limit).block();
    }

    /**
     * Create an user as part of your account.
     *
     * @param body User to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> createUserWithResponseAsync(User body) {
        final String accept = "application/json";
        return service.createUser(this.getHost(), body, accept);
    }

    /**
     * Create an user as part of your account.
     *
     * @param body User to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Object> createUserAsync(User body) {
        return createUserWithResponseAsync(body)
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
     * Create an user as part of your account.
     *
     * @param body User to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Object createUser(User body) {
        return createUserAsync(body).block();
    }
}
