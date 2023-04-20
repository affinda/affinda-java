package com.affinda.api.client;

import com.affinda.api.client.models.Enum3;
import com.affinda.api.client.models.IndexRequestBody;
import com.affinda.api.client.models.Invoice;
import com.affinda.api.client.models.InvoiceRequestBody;
import com.affinda.api.client.models.JobDescription;
import com.affinda.api.client.models.JobDescriptionData;
import com.affinda.api.client.models.JobDescriptionDataUpdate;
import com.affinda.api.client.models.JobDescriptionRequestBody;
import com.affinda.api.client.models.JobDescriptionSearch;
import com.affinda.api.client.models.JobDescriptionSearchConfig;
import com.affinda.api.client.models.JobDescriptionSearchDetail;
import com.affinda.api.client.models.JobDescriptionSearchEmbed;
import com.affinda.api.client.models.JobDescriptionSearchParameters;
import com.affinda.api.client.models.OccupationGroup;
import com.affinda.api.client.models.Paths14R8PdgV2IndexNameDocumentsPostResponses201ContentApplicationJsonSchema;
import com.affinda.api.client.models.Paths14VxierV2ResumesGetResponses200ContentApplicationJsonSchema;
import com.affinda.api.client.models.Paths15O3Zn5V2JobDescriptionSearchEmbedPostRequestbodyContentApplicationJsonSchema;
import com.affinda.api.client.models.Paths18Iqsr4V2IndexGetResponses200ContentApplicationJsonSchema;
import com.affinda.api.client.models.Paths1D957B5V2RedactedResumesGetResponses200ContentApplicationJsonSchema;
import com.affinda.api.client.models.Paths1Sikw07V2IndexPostResponses201ContentApplicationJsonSchema;
import com.affinda.api.client.models.Paths23Ubd8V2ResumeSearchEmbedPostRequestbodyContentApplicationJsonSchema;
import com.affinda.api.client.models.PathsAf7Nd4V2IndexNameDocumentsGetResponses200ContentApplicationJsonSchema;
import com.affinda.api.client.models.PathsChbpqfV2JobDescriptionsGetResponses200ContentApplicationJsonSchema;
import com.affinda.api.client.models.PathsGfm23QV2InvoicesGetResponses200ContentApplicationJsonSchema;
import com.affinda.api.client.models.PathsMda0LlV2ResthookSubscriptionsGetResponses200ContentApplicationJsonSchema;
import com.affinda.api.client.models.PathsYg099PV2IndexNameDocumentsPostRequestbodyContentApplicationJsonSchema;
import com.affinda.api.client.models.RedactedResume;
import com.affinda.api.client.models.RedactedResumeRequestBody;
import com.affinda.api.client.models.Region;
import com.affinda.api.client.models.RequestErrorException;
import com.affinda.api.client.models.ResthookSubscription;
import com.affinda.api.client.models.ResthookSubscriptionCreate;
import com.affinda.api.client.models.ResthookSubscriptionUpdate;
import com.affinda.api.client.models.Resume;
import com.affinda.api.client.models.ResumeData;
import com.affinda.api.client.models.ResumeRequestBody;
import com.affinda.api.client.models.ResumeSearch;
import com.affinda.api.client.models.ResumeSearchConfig;
import com.affinda.api.client.models.ResumeSearchDetail;
import com.affinda.api.client.models.ResumeSearchEmbed;
import com.affinda.api.client.models.ResumeSearchMatch;
import com.affinda.api.client.models.ResumeSearchParameters;
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
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the AffindaAPI type. */
public final class AffindaAPI {
    /** The proxy service used to perform REST calls. */
    private final AffindaAPIService service;

    /** region - server parameter. */
    private final Region region;

    /**
     * Gets region - server parameter.
     *
     * @return the region value.
     */
    public Region getRegion() {
        return this.region;
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
     * @param region region - server parameter.
     */
    AffindaAPI(Region region) {
        this(
                new HttpPipelineBuilder()
                        .policies(new UserAgentPolicy(), new RetryPolicy(), new CookiePolicy())
                        .build(),
                JacksonAdapter.createDefaultSerializerAdapter(),
                region);
    }

    /**
     * Initializes an instance of AffindaAPI client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param region region - server parameter.
     */
    AffindaAPI(HttpPipeline httpPipeline, Region region) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), region);
    }

    /**
     * Initializes an instance of AffindaAPI client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param region region - server parameter.
     */
    AffindaAPI(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, Region region) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.region = region;
        this.service = RestProxy.create(AffindaAPIService.class, this.httpPipeline, this.getSerializerAdapter());
    }

    /** The interface defining all the services for AffindaAPI to be used by the proxy service to perform REST calls. */
    @Host("https://{region}.affinda.com")
    @ServiceInterface(name = "AffindaAPI")
    public interface AffindaAPIService {
        @Get("/v2/resumes")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Paths14VxierV2ResumesGetResponses200ContentApplicationJsonSchema>> getAllResumes(
                @HostParam("region") Region region,
                @QueryParam("offset") Integer offset,
                @QueryParam("limit") Integer limit,
                @HeaderParam("Accept") String accept);

        @Post("/v2/resumes")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Resume>> createResume(
                @HostParam("region") Region region,
                @BodyParam("application/json") ResumeRequestBody body,
                @HeaderParam("Accept") String accept);

        @Get("/v2/resumes/{identifier}")
        @ExpectedResponses({200, 200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401, 404})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Resume>> getResume(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @QueryParam("format") String format,
                @HeaderParam("Accept") String accept);

        @Patch("/v2/resumes/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<ResumeData>> updateResumeData(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @BodyParam("application/json") ResumeData body,
                @HeaderParam("Accept") String accept);

        @Delete("/v2/resumes/{identifier}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Void>> deleteResume(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Get("/v2/redacted_resumes")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Paths1D957B5V2RedactedResumesGetResponses200ContentApplicationJsonSchema>> getAllRedactedResumes(
                @HostParam("region") Region region,
                @QueryParam("offset") Integer offset,
                @QueryParam("limit") Integer limit,
                @HeaderParam("Accept") String accept);

        @Post("/v2/redacted_resumes")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<RedactedResume>> createRedactedResume(
                @HostParam("region") Region region,
                @BodyParam("application/json") RedactedResumeRequestBody body,
                @HeaderParam("Accept") String accept);

        @Get("/v2/redacted_resumes/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<RedactedResume>> getRedactedResume(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Delete("/v2/redacted_resumes/{identifier}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Void>> deleteRedactedResume(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Get("/v2/invoices")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<PathsGfm23QV2InvoicesGetResponses200ContentApplicationJsonSchema>> getAllInvoices(
                @HostParam("region") Region region,
                @QueryParam("offset") Integer offset,
                @QueryParam("limit") Integer limit,
                @HeaderParam("Accept") String accept);

        @Post("/v2/invoices")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Invoice>> createInvoice(
                @HostParam("region") Region region,
                @BodyParam("application/json") InvoiceRequestBody body,
                @HeaderParam("Accept") String accept);

        @Get("/v2/invoices/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Invoice>> getInvoice(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Delete("/v2/invoices/{identifier}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Void>> deleteInvoice(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Get("/v2/job_descriptions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<PathsChbpqfV2JobDescriptionsGetResponses200ContentApplicationJsonSchema>> getAllJobDescriptions(
                @HostParam("region") Region region,
                @QueryParam("offset") Integer offset,
                @QueryParam("limit") Integer limit,
                @HeaderParam("Accept") String accept);

        @Post("/v2/job_descriptions")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<JobDescription>> createJobDescription(
                @HostParam("region") Region region,
                @BodyParam("application/json") JobDescriptionRequestBody body,
                @HeaderParam("Accept") String accept);

        @Get("/v2/job_descriptions/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<JobDescription>> getJobDescription(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Patch("/v2/job_descriptions/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<JobDescriptionData>> updateJobDescriptionData(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @BodyParam("application/json") JobDescriptionDataUpdate body,
                @HeaderParam("Accept") String accept);

        @Delete("/v2/job_descriptions/{identifier}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Void>> deleteJobDescription(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Post("/v2/job_description_search")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<JobDescriptionSearch>> createJobDescriptionSearch(
                @HostParam("region") Region region,
                @QueryParam("offset") Integer offset,
                @QueryParam("limit") Integer limit,
                @BodyParam("application/json") JobDescriptionSearchParameters body,
                @HeaderParam("Accept") String accept);

        @Post("/v2/job_description_search/details/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<JobDescriptionSearchDetail>> getJobDescriptionSearchDetail(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @BodyParam("application/json") JobDescriptionSearchParameters body,
                @HeaderParam("Accept") String accept);

        @Get("/v2/job_description_search/config")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<JobDescriptionSearchConfig>> getJobDescriptionSearchConfig(
                @HostParam("region") Region region, @HeaderParam("Accept") String accept);

        @Patch("/v2/job_description_search/config")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<JobDescriptionSearchConfig>> updateJobDescriptionSearchConfig(
                @HostParam("region") Region region,
                @BodyParam("application/json") JobDescriptionSearchConfig body,
                @HeaderParam("Accept") String accept);

        @Post("/v2/job_description_search/embed")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<JobDescriptionSearchEmbed>> createJobDescriptionSearchEmbedUrl(
                @HostParam("region") Region region,
                @BodyParam("application/json")
                        Paths15O3Zn5V2JobDescriptionSearchEmbedPostRequestbodyContentApplicationJsonSchema body,
                @HeaderParam("Accept") String accept);

        @Post("/v2/resume_search")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<ResumeSearch>> createResumeSearch(
                @HostParam("region") Region region,
                @QueryParam("offset") Integer offset,
                @QueryParam("limit") Integer limit,
                @BodyParam("application/json") ResumeSearchParameters body,
                @HeaderParam("Accept") String accept);

        @Post("/v2/resume_search/details/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<ResumeSearchDetail>> getResumeSearchDetail(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @BodyParam("application/json") ResumeSearchParameters body,
                @HeaderParam("Accept") String accept);

        @Get("/v2/resume_search/match")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<ResumeSearchMatch>> getResumeSearchMatch(
                @HostParam("region") Region region,
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

        @Get("/v2/resume_search/config")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<ResumeSearchConfig>> getResumeSearchConfig(
                @HostParam("region") Region region, @HeaderParam("Accept") String accept);

        @Patch("/v2/resume_search/config")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<ResumeSearchConfig>> updateResumeSearchConfig(
                @HostParam("region") Region region,
                @BodyParam("application/json") ResumeSearchConfig body,
                @HeaderParam("Accept") String accept);

        @Post("/v2/resume_search/embed")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<ResumeSearchEmbed>> createResumeSearchEmbedUrl(
                @HostParam("region") Region region,
                @BodyParam("application/json")
                        Paths23Ubd8V2ResumeSearchEmbedPostRequestbodyContentApplicationJsonSchema body,
                @HeaderParam("Accept") String accept);

        @Get("/v2/resume_search/suggestion_job_title")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<List<String>>> getResumeSearchSuggestionJobTitle(
                @HostParam("region") Region region,
                @QueryParam(value = "job_titles", multipleQueryParams = true) List<String> jobTitles,
                @HeaderParam("Accept") String accept);

        @Get("/v2/resume_search/suggestion_skill")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<List<String>>> getResumeSearchSuggestionSkill(
                @HostParam("region") Region region,
                @QueryParam(value = "skills", multipleQueryParams = true) List<String> skills,
                @HeaderParam("Accept") String accept);

        @Get("/v2/index")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Paths18Iqsr4V2IndexGetResponses200ContentApplicationJsonSchema>> getAllIndexes(
                @HostParam("region") Region region,
                @QueryParam("offset") Integer offset,
                @QueryParam("limit") Integer limit,
                @QueryParam("document_type") Enum3 documentType,
                @HeaderParam("Accept") String accept);

        @Post("/v2/index")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Paths1Sikw07V2IndexPostResponses201ContentApplicationJsonSchema>> createIndex(
                @HostParam("region") Region region,
                @BodyParam("application/json") IndexRequestBody body,
                @HeaderParam("Accept") String accept);

        @Delete("/v2/index/{name}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Void>> deleteIndex(
                @HostParam("region") Region region,
                @PathParam("name") String name,
                @HeaderParam("Accept") String accept);

        @Get("/v2/index/{name}/documents")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<PathsAf7Nd4V2IndexNameDocumentsGetResponses200ContentApplicationJsonSchema>> getAllIndexDocuments(
                @HostParam("region") Region region,
                @PathParam("name") String name,
                @HeaderParam("Accept") String accept);

        @Post("/v2/index/{name}/documents")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Paths14R8PdgV2IndexNameDocumentsPostResponses201ContentApplicationJsonSchema>>
                createIndexDocument(
                        @HostParam("region") Region region,
                        @PathParam("name") String name,
                        @BodyParam("application/json")
                                PathsYg099PV2IndexNameDocumentsPostRequestbodyContentApplicationJsonSchema body,
                        @HeaderParam("Accept") String accept);

        @Delete("/v2/index/{name}/documents/{identifier}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Void>> deleteIndexDocument(
                @HostParam("region") Region region,
                @PathParam("name") String name,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Get("/v2/occupation_groups")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<List<OccupationGroup>>> listOccupationGroups(
                @HostParam("region") Region region, @HeaderParam("Accept") String accept);

        @Get("/v2/resthook_subscriptions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<PathsMda0LlV2ResthookSubscriptionsGetResponses200ContentApplicationJsonSchema>>
                getAllResthookSubscriptions(
                        @HostParam("region") Region region,
                        @QueryParam("offset") Integer offset,
                        @QueryParam("limit") Integer limit,
                        @HeaderParam("Accept") String accept);

        @Post("/v2/resthook_subscriptions")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<ResthookSubscription>> createResthookSubscription(
                @HostParam("region") Region region,
                @BodyParam("application/json") ResthookSubscriptionCreate body,
                @HeaderParam("Accept") String accept);

        @Get("/v2/resthook_subscriptions/{id}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<ResthookSubscription>> getResthookSubscription(
                @HostParam("region") Region region, @PathParam("id") int id, @HeaderParam("Accept") String accept);

        @Patch("/v2/resthook_subscriptions/{id}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<ResthookSubscription>> updateResthookSubscription(
                @HostParam("region") Region region,
                @PathParam("id") int id,
                @BodyParam("application/json") ResthookSubscriptionUpdate body,
                @HeaderParam("Accept") String accept);

        @Delete("/v2/resthook_subscriptions/{id}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Void>> deleteResthookSubscription(
                @HostParam("region") Region region, @PathParam("id") int id, @HeaderParam("Accept") String accept);

        @Post("/v2/resthook_subscriptions/activate")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<ResthookSubscription>> activateResthookSubscription(
                @HostParam("region") Region region,
                @HeaderParam("X-Hook-Secret") String xHookSecret,
                @HeaderParam("Accept") String accept);
    }

    /**
     * Returns all the resume summaries for that user, limited to 300 per page.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Paths14VxierV2ResumesGetResponses200ContentApplicationJsonSchema>>
            getAllResumesWithResponseAsync(Integer offset, Integer limit) {
        final String accept = "application/json";
        return service.getAllResumes(this.getRegion(), offset, limit, accept);
    }

    /**
     * Returns all the resume summaries for that user, limited to 300 per page.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Paths14VxierV2ResumesGetResponses200ContentApplicationJsonSchema> getAllResumesAsync(
            Integer offset, Integer limit) {
        return getAllResumesWithResponseAsync(offset, limit)
                .flatMap(
                        (Response<Paths14VxierV2ResumesGetResponses200ContentApplicationJsonSchema> res) -> {
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Paths14VxierV2ResumesGetResponses200ContentApplicationJsonSchema getAllResumes(
            Integer offset, Integer limit) {
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Resume>> createResumeWithResponseAsync(ResumeRequestBody body) {
        final String accept = "application/json";
        return service.createResume(this.getRegion(), body, accept);
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Resume> createResumeAsync(ResumeRequestBody body) {
        return createResumeWithResponseAsync(body)
                .flatMap(
                        (Response<Resume> res) -> {
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Resume createResume(ResumeRequestBody body) {
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401, 404.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Resume>> getResumeWithResponseAsync(String identifier, String format) {
        final String accept = "application/json, application/xml";
        return service.getResume(this.getRegion(), identifier, format, accept);
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401, 404.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Resume> getResumeAsync(String identifier, String format) {
        return getResumeWithResponseAsync(identifier, format)
                .flatMap(
                        (Response<Resume> res) -> {
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401, 404.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Resume getResume(String identifier, String format) {
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a JSON-encoded string of the `ResumeData` object along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ResumeData>> updateResumeDataWithResponseAsync(String identifier, ResumeData body) {
        final String accept = "application/json";
        return service.updateResumeData(this.getRegion(), identifier, body, accept);
    }

    /**
     * Update data of a parsed resume. The `identifier` is the unique ID returned after POST-ing the resume via the
     * [/resumes](#post-/resumes) endpoint.
     *
     * @param identifier Resume identifier.
     * @param body Resume data to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a JSON-encoded string of the `ResumeData` object on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ResumeData> updateResumeDataAsync(String identifier, ResumeData body) {
        return updateResumeDataWithResponseAsync(identifier, body)
                .flatMap(
                        (Response<ResumeData> res) -> {
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a JSON-encoded string of the `ResumeData` object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ResumeData updateResumeData(String identifier, ResumeData body) {
        return updateResumeDataAsync(identifier, body).block();
    }

    /**
     * Deletes the specified resume from the database.
     *
     * @param identifier Resume identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteResumeWithResponseAsync(String identifier) {
        final String accept = "application/json";
        return service.deleteResume(this.getRegion(), identifier, accept);
    }

    /**
     * Deletes the specified resume from the database.
     *
     * @param identifier Resume identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteResumeAsync(String identifier) {
        return deleteResumeWithResponseAsync(identifier).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the specified resume from the database.
     *
     * @param identifier Resume identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteResume(String identifier) {
        deleteResumeAsync(identifier).block();
    }

    /**
     * Returns all the redacted resume information for that resume.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Paths1D957B5V2RedactedResumesGetResponses200ContentApplicationJsonSchema>>
            getAllRedactedResumesWithResponseAsync(Integer offset, Integer limit) {
        final String accept = "application/json";
        return service.getAllRedactedResumes(this.getRegion(), offset, limit, accept);
    }

    /**
     * Returns all the redacted resume information for that resume.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Paths1D957B5V2RedactedResumesGetResponses200ContentApplicationJsonSchema> getAllRedactedResumesAsync(
            Integer offset, Integer limit) {
        return getAllRedactedResumesWithResponseAsync(offset, limit)
                .flatMap(
                        (Response<Paths1D957B5V2RedactedResumesGetResponses200ContentApplicationJsonSchema> res) -> {
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Paths1D957B5V2RedactedResumesGetResponses200ContentApplicationJsonSchema getAllRedactedResumes(
            Integer offset, Integer limit) {
        return getAllRedactedResumesAsync(offset, limit).block();
    }

    /**
     * Uploads a resume for redacting.
     *
     * @param body Resume to upload, either via fileupload or URL to a file.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RedactedResume>> createRedactedResumeWithResponseAsync(RedactedResumeRequestBody body) {
        final String accept = "application/json";
        return service.createRedactedResume(this.getRegion(), body, accept);
    }

    /**
     * Uploads a resume for redacting.
     *
     * @param body Resume to upload, either via fileupload or URL to a file.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RedactedResume> createRedactedResumeAsync(RedactedResumeRequestBody body) {
        return createRedactedResumeWithResponseAsync(body)
                .flatMap(
                        (Response<RedactedResume> res) -> {
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RedactedResume createRedactedResume(RedactedResumeRequestBody body) {
        return createRedactedResumeAsync(body).block();
    }

    /**
     * Returns all the redaction results for that resume if processing is completed. The `identifier` is the unique ID
     * returned after POST-ing the resume via the [/redacted_resumes](#post-/redacted_resumes) endpoint.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RedactedResume>> getRedactedResumeWithResponseAsync(String identifier) {
        final String accept = "application/json";
        return service.getRedactedResume(this.getRegion(), identifier, accept);
    }

    /**
     * Returns all the redaction results for that resume if processing is completed. The `identifier` is the unique ID
     * returned after POST-ing the resume via the [/redacted_resumes](#post-/redacted_resumes) endpoint.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RedactedResume> getRedactedResumeAsync(String identifier) {
        return getRedactedResumeWithResponseAsync(identifier)
                .flatMap(
                        (Response<RedactedResume> res) -> {
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RedactedResume getRedactedResume(String identifier) {
        return getRedactedResumeAsync(identifier).block();
    }

    /**
     * Deletes the specified resume from the database.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteRedactedResumeWithResponseAsync(String identifier) {
        final String accept = "application/json";
        return service.deleteRedactedResume(this.getRegion(), identifier, accept);
    }

    /**
     * Deletes the specified resume from the database.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteRedactedResumeAsync(String identifier) {
        return deleteRedactedResumeWithResponseAsync(identifier).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the specified resume from the database.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteRedactedResume(String identifier) {
        deleteRedactedResumeAsync(identifier).block();
    }

    /**
     * Returns all the invoice summaries for that user, limited to 300 per page.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PathsGfm23QV2InvoicesGetResponses200ContentApplicationJsonSchema>>
            getAllInvoicesWithResponseAsync(Integer offset, Integer limit) {
        final String accept = "application/json";
        return service.getAllInvoices(this.getRegion(), offset, limit, accept);
    }

    /**
     * Returns all the invoice summaries for that user, limited to 300 per page.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PathsGfm23QV2InvoicesGetResponses200ContentApplicationJsonSchema> getAllInvoicesAsync(
            Integer offset, Integer limit) {
        return getAllInvoicesWithResponseAsync(offset, limit)
                .flatMap(
                        (Response<PathsGfm23QV2InvoicesGetResponses200ContentApplicationJsonSchema> res) -> {
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PathsGfm23QV2InvoicesGetResponses200ContentApplicationJsonSchema getAllInvoices(
            Integer offset, Integer limit) {
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Invoice>> createInvoiceWithResponseAsync(InvoiceRequestBody body) {
        final String accept = "application/json";
        return service.createInvoice(this.getRegion(), body, accept);
    }

    /**
     * Uploads an invoice for parsing. When successful, returns an `identifier` in the response for subsequent use with
     * the [/invoices/{identifier}](#get-/invoices/-identifier-) endpoint to check processing status and retrieve
     * results.
     *
     * @param body Invoice to upload, either via fileupload or URL to a file.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Invoice> createInvoiceAsync(InvoiceRequestBody body) {
        return createInvoiceWithResponseAsync(body)
                .flatMap(
                        (Response<Invoice> res) -> {
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Invoice createInvoice(InvoiceRequestBody body) {
        return createInvoiceAsync(body).block();
    }

    /**
     * Returns all the parse results for that invoice if processing is completed. The `identifier` is the unique ID
     * returned after POST-ing the invoice via the [/invoices](#post-/invoices) endpoint.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Invoice>> getInvoiceWithResponseAsync(String identifier) {
        final String accept = "application/json";
        return service.getInvoice(this.getRegion(), identifier, accept);
    }

    /**
     * Returns all the parse results for that invoice if processing is completed. The `identifier` is the unique ID
     * returned after POST-ing the invoice via the [/invoices](#post-/invoices) endpoint.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Invoice> getInvoiceAsync(String identifier) {
        return getInvoiceWithResponseAsync(identifier)
                .flatMap(
                        (Response<Invoice> res) -> {
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Invoice getInvoice(String identifier) {
        return getInvoiceAsync(identifier).block();
    }

    /**
     * Delete the specified invoice from the database. Note, any invoices deleted from the database will no longer be
     * used in any tailored customer models.
     *
     * @param identifier Invoice identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteInvoiceWithResponseAsync(String identifier) {
        final String accept = "application/json";
        return service.deleteInvoice(this.getRegion(), identifier, accept);
    }

    /**
     * Delete the specified invoice from the database. Note, any invoices deleted from the database will no longer be
     * used in any tailored customer models.
     *
     * @param identifier Invoice identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteInvoiceAsync(String identifier) {
        return deleteInvoiceWithResponseAsync(identifier).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Delete the specified invoice from the database. Note, any invoices deleted from the database will no longer be
     * used in any tailored customer models.
     *
     * @param identifier Invoice identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteInvoice(String identifier) {
        deleteInvoiceAsync(identifier).block();
    }

    /**
     * Returns all the job descriptions for that user, limited to 300 per page.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PathsChbpqfV2JobDescriptionsGetResponses200ContentApplicationJsonSchema>>
            getAllJobDescriptionsWithResponseAsync(Integer offset, Integer limit) {
        final String accept = "application/json";
        return service.getAllJobDescriptions(this.getRegion(), offset, limit, accept);
    }

    /**
     * Returns all the job descriptions for that user, limited to 300 per page.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PathsChbpqfV2JobDescriptionsGetResponses200ContentApplicationJsonSchema> getAllJobDescriptionsAsync(
            Integer offset, Integer limit) {
        return getAllJobDescriptionsWithResponseAsync(offset, limit)
                .flatMap(
                        (Response<PathsChbpqfV2JobDescriptionsGetResponses200ContentApplicationJsonSchema> res) -> {
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PathsChbpqfV2JobDescriptionsGetResponses200ContentApplicationJsonSchema getAllJobDescriptions(
            Integer offset, Integer limit) {
        return getAllJobDescriptionsAsync(offset, limit).block();
    }

    /**
     * Uploads a job description for parsing. When successful, returns an `identifier` in the response for subsequent
     * use with the [/job_descriptions/{identifier}](#get-/job_descriptions/-identifier-) endpoint to check processing
     * status and retrieve results. Job Descriptions can be uploaded as a file or a URL. In addition, data can be added
     * directly if users want to upload directly without parsing any resume file. For uploading resume data, the `data`
     * argument provided must be a JSON-encoded string. Data uploads will not impact upon parsing credits.
     *
     * @param body Job Description to upload, either via fileupload or URL to a file.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<JobDescription>> createJobDescriptionWithResponseAsync(JobDescriptionRequestBody body) {
        final String accept = "application/json";
        return service.createJobDescription(this.getRegion(), body, accept);
    }

    /**
     * Uploads a job description for parsing. When successful, returns an `identifier` in the response for subsequent
     * use with the [/job_descriptions/{identifier}](#get-/job_descriptions/-identifier-) endpoint to check processing
     * status and retrieve results. Job Descriptions can be uploaded as a file or a URL. In addition, data can be added
     * directly if users want to upload directly without parsing any resume file. For uploading resume data, the `data`
     * argument provided must be a JSON-encoded string. Data uploads will not impact upon parsing credits.
     *
     * @param body Job Description to upload, either via fileupload or URL to a file.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<JobDescription> createJobDescriptionAsync(JobDescriptionRequestBody body) {
        return createJobDescriptionWithResponseAsync(body)
                .flatMap(
                        (Response<JobDescription> res) -> {
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
     * status and retrieve results. Job Descriptions can be uploaded as a file or a URL. In addition, data can be added
     * directly if users want to upload directly without parsing any resume file. For uploading resume data, the `data`
     * argument provided must be a JSON-encoded string. Data uploads will not impact upon parsing credits.
     *
     * @param body Job Description to upload, either via fileupload or URL to a file.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public JobDescription createJobDescription(JobDescriptionRequestBody body) {
        return createJobDescriptionAsync(body).block();
    }

    /**
     * Returns all the results for that job description if processing is completed. The `identifier` is the unique ID
     * returned after POST-ing the resume via the [/job_descriptions](#post-/job_descriptions) endpoint.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<JobDescription>> getJobDescriptionWithResponseAsync(String identifier) {
        final String accept = "application/json";
        return service.getJobDescription(this.getRegion(), identifier, accept);
    }

    /**
     * Returns all the results for that job description if processing is completed. The `identifier` is the unique ID
     * returned after POST-ing the resume via the [/job_descriptions](#post-/job_descriptions) endpoint.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<JobDescription> getJobDescriptionAsync(String identifier) {
        return getJobDescriptionWithResponseAsync(identifier)
                .flatMap(
                        (Response<JobDescription> res) -> {
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public JobDescription getJobDescription(String identifier) {
        return getJobDescriptionAsync(identifier).block();
    }

    /**
     * Update data of a job description. The `identifier` is the unique ID returned after POST-ing the job description
     * via the [/job_descriptions](#post-/job_descriptions) endpoint.
     *
     * @param identifier Job description identifier.
     * @param body Job description data to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<JobDescriptionData>> updateJobDescriptionDataWithResponseAsync(
            String identifier, JobDescriptionDataUpdate body) {
        final String accept = "application/json";
        return service.updateJobDescriptionData(this.getRegion(), identifier, body, accept);
    }

    /**
     * Update data of a job description. The `identifier` is the unique ID returned after POST-ing the job description
     * via the [/job_descriptions](#post-/job_descriptions) endpoint.
     *
     * @param identifier Job description identifier.
     * @param body Job description data to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<JobDescriptionData> updateJobDescriptionDataAsync(String identifier, JobDescriptionDataUpdate body) {
        return updateJobDescriptionDataWithResponseAsync(identifier, body)
                .flatMap(
                        (Response<JobDescriptionData> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Update data of a job description. The `identifier` is the unique ID returned after POST-ing the job description
     * via the [/job_descriptions](#post-/job_descriptions) endpoint.
     *
     * @param identifier Job description identifier.
     * @param body Job description data to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public JobDescriptionData updateJobDescriptionData(String identifier, JobDescriptionDataUpdate body) {
        return updateJobDescriptionDataAsync(identifier, body).block();
    }

    /**
     * Deletes the specified job description from the database.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteJobDescriptionWithResponseAsync(String identifier) {
        final String accept = "application/json";
        return service.deleteJobDescription(this.getRegion(), identifier, accept);
    }

    /**
     * Deletes the specified job description from the database.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteJobDescriptionAsync(String identifier) {
        return deleteJobDescriptionWithResponseAsync(identifier).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the specified job description from the database.
     *
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteJobDescription(String identifier) {
        deleteJobDescriptionAsync(identifier).block();
    }

    /**
     * Searches through parsed job descriptions. You can search with custom criterias or a resume.
     *
     * @param body Search parameters.
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<JobDescriptionSearch>> createJobDescriptionSearchWithResponseAsync(
            JobDescriptionSearchParameters body, Integer offset, Integer limit) {
        final String accept = "application/json";
        return service.createJobDescriptionSearch(this.getRegion(), offset, limit, body, accept);
    }

    /**
     * Searches through parsed job descriptions. You can search with custom criterias or a resume.
     *
     * @param body Search parameters.
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<JobDescriptionSearch> createJobDescriptionSearchAsync(
            JobDescriptionSearchParameters body, Integer offset, Integer limit) {
        return createJobDescriptionSearchWithResponseAsync(body, offset, limit)
                .flatMap(
                        (Response<JobDescriptionSearch> res) -> {
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public JobDescriptionSearch createJobDescriptionSearch(
            JobDescriptionSearchParameters body, Integer offset, Integer limit) {
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<JobDescriptionSearchDetail>> getJobDescriptionSearchDetailWithResponseAsync(
            String identifier, JobDescriptionSearchParameters body) {
        final String accept = "application/json";
        return service.getJobDescriptionSearchDetail(this.getRegion(), identifier, body, accept);
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<JobDescriptionSearchDetail> getJobDescriptionSearchDetailAsync(
            String identifier, JobDescriptionSearchParameters body) {
        return getJobDescriptionSearchDetailWithResponseAsync(identifier, body)
                .flatMap(
                        (Response<JobDescriptionSearchDetail> res) -> {
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public JobDescriptionSearchDetail getJobDescriptionSearchDetail(
            String identifier, JobDescriptionSearchParameters body) {
        return getJobDescriptionSearchDetailAsync(identifier, body).block();
    }

    /**
     * Return configurations such as which fields can be displayed in the logged in user's embeddable job description
     * search tool, what are their weights, what is the maximum number of results that can be returned, etc.
     *
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<JobDescriptionSearchConfig>> getJobDescriptionSearchConfigWithResponseAsync() {
        final String accept = "application/json";
        return service.getJobDescriptionSearchConfig(this.getRegion(), accept);
    }

    /**
     * Return configurations such as which fields can be displayed in the logged in user's embeddable job description
     * search tool, what are their weights, what is the maximum number of results that can be returned, etc.
     *
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<JobDescriptionSearchConfig> getJobDescriptionSearchConfigAsync() {
        return getJobDescriptionSearchConfigWithResponseAsync()
                .flatMap(
                        (Response<JobDescriptionSearchConfig> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Return configurations such as which fields can be displayed in the logged in user's embeddable job description
     * search tool, what are their weights, what is the maximum number of results that can be returned, etc.
     *
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public JobDescriptionSearchConfig getJobDescriptionSearchConfig() {
        return getJobDescriptionSearchConfigAsync().block();
    }

    /**
     * Update configurations such as which fields can be displayed in the logged in user's embeddable job description
     * search tool, what are their weights, what is the maximum number of results that can be returned, etc.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<JobDescriptionSearchConfig>> updateJobDescriptionSearchConfigWithResponseAsync(
            JobDescriptionSearchConfig body) {
        final String accept = "application/json";
        return service.updateJobDescriptionSearchConfig(this.getRegion(), body, accept);
    }

    /**
     * Update configurations such as which fields can be displayed in the logged in user's embeddable job description
     * search tool, what are their weights, what is the maximum number of results that can be returned, etc.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<JobDescriptionSearchConfig> updateJobDescriptionSearchConfigAsync(JobDescriptionSearchConfig body) {
        return updateJobDescriptionSearchConfigWithResponseAsync(body)
                .flatMap(
                        (Response<JobDescriptionSearchConfig> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Update configurations such as which fields can be displayed in the logged in user's embeddable job description
     * search tool, what are their weights, what is the maximum number of results that can be returned, etc.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public JobDescriptionSearchConfig updateJobDescriptionSearchConfig(JobDescriptionSearchConfig body) {
        return updateJobDescriptionSearchConfigAsync(body).block();
    }

    /**
     * Create and return a signed URL of the job description search tool which then can be embedded on a web page. An
     * optional parameter `config_override` can be passed to override the user-level configurations of the embeddable
     * search tool.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<JobDescriptionSearchEmbed>> createJobDescriptionSearchEmbedUrlWithResponseAsync(
            Paths15O3Zn5V2JobDescriptionSearchEmbedPostRequestbodyContentApplicationJsonSchema body) {
        final String accept = "application/json";
        return service.createJobDescriptionSearchEmbedUrl(this.getRegion(), body, accept);
    }

    /**
     * Create and return a signed URL of the job description search tool which then can be embedded on a web page. An
     * optional parameter `config_override` can be passed to override the user-level configurations of the embeddable
     * search tool.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<JobDescriptionSearchEmbed> createJobDescriptionSearchEmbedUrlAsync(
            Paths15O3Zn5V2JobDescriptionSearchEmbedPostRequestbodyContentApplicationJsonSchema body) {
        return createJobDescriptionSearchEmbedUrlWithResponseAsync(body)
                .flatMap(
                        (Response<JobDescriptionSearchEmbed> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Create and return a signed URL of the job description search tool which then can be embedded on a web page. An
     * optional parameter `config_override` can be passed to override the user-level configurations of the embeddable
     * search tool.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public JobDescriptionSearchEmbed createJobDescriptionSearchEmbedUrl(
            Paths15O3Zn5V2JobDescriptionSearchEmbedPostRequestbodyContentApplicationJsonSchema body) {
        return createJobDescriptionSearchEmbedUrlAsync(body).block();
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ResumeSearch>> createResumeSearchWithResponseAsync(
            ResumeSearchParameters body, Integer offset, Integer limit) {
        final String accept = "application/json";
        return service.createResumeSearch(this.getRegion(), offset, limit, body, accept);
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ResumeSearch> createResumeSearchAsync(ResumeSearchParameters body, Integer offset, Integer limit) {
        return createResumeSearchWithResponseAsync(body, offset, limit)
                .flatMap(
                        (Response<ResumeSearch> res) -> {
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ResumeSearch createResumeSearch(ResumeSearchParameters body, Integer offset, Integer limit) {
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ResumeSearchDetail>> getResumeSearchDetailWithResponseAsync(
            String identifier, ResumeSearchParameters body) {
        final String accept = "application/json";
        return service.getResumeSearchDetail(this.getRegion(), identifier, body, accept);
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ResumeSearchDetail> getResumeSearchDetailAsync(String identifier, ResumeSearchParameters body) {
        return getResumeSearchDetailWithResponseAsync(identifier, body)
                .flatMap(
                        (Response<ResumeSearchDetail> res) -> {
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ResumeSearchDetail getResumeSearchDetail(String identifier, ResumeSearchParameters body) {
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the matching score between a resume and a job description along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ResumeSearchMatch>> getResumeSearchMatchWithResponseAsync(
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
                this.getRegion(),
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the matching score between a resume and a job description on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ResumeSearchMatch> getResumeSearchMatchAsync(
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
                        (Response<ResumeSearchMatch> res) -> {
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the matching score between a resume and a job description.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ResumeSearchMatch getResumeSearchMatch(
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
     * Return configurations such as which fields can be displayed in the logged in user's embeddable resume search
     * tool, what are their weights, what is the maximum number of results that can be returned, etc.
     *
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ResumeSearchConfig>> getResumeSearchConfigWithResponseAsync() {
        final String accept = "application/json";
        return service.getResumeSearchConfig(this.getRegion(), accept);
    }

    /**
     * Return configurations such as which fields can be displayed in the logged in user's embeddable resume search
     * tool, what are their weights, what is the maximum number of results that can be returned, etc.
     *
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ResumeSearchConfig> getResumeSearchConfigAsync() {
        return getResumeSearchConfigWithResponseAsync()
                .flatMap(
                        (Response<ResumeSearchConfig> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Return configurations such as which fields can be displayed in the logged in user's embeddable resume search
     * tool, what are their weights, what is the maximum number of results that can be returned, etc.
     *
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ResumeSearchConfig getResumeSearchConfig() {
        return getResumeSearchConfigAsync().block();
    }

    /**
     * Update configurations such as which fields can be displayed in the logged in user's embeddable resume search
     * tool, what are their weights, what is the maximum number of results that can be returned, etc.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ResumeSearchConfig>> updateResumeSearchConfigWithResponseAsync(ResumeSearchConfig body) {
        final String accept = "application/json";
        return service.updateResumeSearchConfig(this.getRegion(), body, accept);
    }

    /**
     * Update configurations such as which fields can be displayed in the logged in user's embeddable resume search
     * tool, what are their weights, what is the maximum number of results that can be returned, etc.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ResumeSearchConfig> updateResumeSearchConfigAsync(ResumeSearchConfig body) {
        return updateResumeSearchConfigWithResponseAsync(body)
                .flatMap(
                        (Response<ResumeSearchConfig> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Update configurations such as which fields can be displayed in the logged in user's embeddable resume search
     * tool, what are their weights, what is the maximum number of results that can be returned, etc.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ResumeSearchConfig updateResumeSearchConfig(ResumeSearchConfig body) {
        return updateResumeSearchConfigAsync(body).block();
    }

    /**
     * Create and return a signed URL of the resume search tool which then can be embedded on a web page. An optional
     * parameter `config_override` can be passed to override the user-level configurations of the embeddable resume
     * search tool.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ResumeSearchEmbed>> createResumeSearchEmbedUrlWithResponseAsync(
            Paths23Ubd8V2ResumeSearchEmbedPostRequestbodyContentApplicationJsonSchema body) {
        final String accept = "application/json";
        return service.createResumeSearchEmbedUrl(this.getRegion(), body, accept);
    }

    /**
     * Create and return a signed URL of the resume search tool which then can be embedded on a web page. An optional
     * parameter `config_override` can be passed to override the user-level configurations of the embeddable resume
     * search tool.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ResumeSearchEmbed> createResumeSearchEmbedUrlAsync(
            Paths23Ubd8V2ResumeSearchEmbedPostRequestbodyContentApplicationJsonSchema body) {
        return createResumeSearchEmbedUrlWithResponseAsync(body)
                .flatMap(
                        (Response<ResumeSearchEmbed> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Create and return a signed URL of the resume search tool which then can be embedded on a web page. An optional
     * parameter `config_override` can be passed to override the user-level configurations of the embeddable resume
     * search tool.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ResumeSearchEmbed createResumeSearchEmbedUrl(
            Paths23Ubd8V2ResumeSearchEmbedPostRequestbodyContentApplicationJsonSchema body) {
        return createResumeSearchEmbedUrlAsync(body).block();
    }

    /**
     * Provided one or more job titles, get related suggestions for your search.
     *
     * @param jobTitles Job title to query suggestions for.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Get200ApplicationJsonItemsItem along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<List<String>>> getResumeSearchSuggestionJobTitleWithResponseAsync(List<String> jobTitles) {
        final String accept = "application/json";
        List<String> jobTitlesConverted =
                Optional.ofNullable(jobTitles)
                        .map(Collection::stream)
                        .orElseGet(Stream::empty)
                        .map((item) -> Objects.toString(item, ""))
                        .collect(Collectors.toList());
        return service.getResumeSearchSuggestionJobTitle(this.getRegion(), jobTitlesConverted, accept);
    }

    /**
     * Provided one or more job titles, get related suggestions for your search.
     *
     * @param jobTitles Job title to query suggestions for.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Get200ApplicationJsonItemsItem on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<List<String>> getResumeSearchSuggestionJobTitleAsync(List<String> jobTitles) {
        return getResumeSearchSuggestionJobTitleWithResponseAsync(jobTitles)
                .flatMap(
                        (Response<List<String>> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Provided one or more job titles, get related suggestions for your search.
     *
     * @param jobTitles Job title to query suggestions for.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Get200ApplicationJsonItemsItem.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<String> getResumeSearchSuggestionJobTitle(List<String> jobTitles) {
        return getResumeSearchSuggestionJobTitleAsync(jobTitles).block();
    }

    /**
     * Provided one or more skills, get related suggestions for your search.
     *
     * @param skills Skill to query suggestions for.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of String along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<List<String>>> getResumeSearchSuggestionSkillWithResponseAsync(List<String> skills) {
        final String accept = "application/json";
        List<String> skillsConverted =
                Optional.ofNullable(skills)
                        .map(Collection::stream)
                        .orElseGet(Stream::empty)
                        .map((item) -> Objects.toString(item, ""))
                        .collect(Collectors.toList());
        return service.getResumeSearchSuggestionSkill(this.getRegion(), skillsConverted, accept);
    }

    /**
     * Provided one or more skills, get related suggestions for your search.
     *
     * @param skills Skill to query suggestions for.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of String on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<List<String>> getResumeSearchSuggestionSkillAsync(List<String> skills) {
        return getResumeSearchSuggestionSkillWithResponseAsync(skills)
                .flatMap(
                        (Response<List<String>> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Provided one or more skills, get related suggestions for your search.
     *
     * @param skills Skill to query suggestions for.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of String.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<String> getResumeSearchSuggestionSkill(List<String> skills) {
        return getResumeSearchSuggestionSkillAsync(skills).block();
    }

    /**
     * Returns all the indexes.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @param documentType Filter indices by a document type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Paths18Iqsr4V2IndexGetResponses200ContentApplicationJsonSchema>>
            getAllIndexesWithResponseAsync(Integer offset, Integer limit, Enum3 documentType) {
        final String accept = "application/json";
        return service.getAllIndexes(this.getRegion(), offset, limit, documentType, accept);
    }

    /**
     * Returns all the indexes.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @param documentType Filter indices by a document type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Paths18Iqsr4V2IndexGetResponses200ContentApplicationJsonSchema> getAllIndexesAsync(
            Integer offset, Integer limit, Enum3 documentType) {
        return getAllIndexesWithResponseAsync(offset, limit, documentType)
                .flatMap(
                        (Response<Paths18Iqsr4V2IndexGetResponses200ContentApplicationJsonSchema> res) -> {
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
     * @param documentType Filter indices by a document type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Paths18Iqsr4V2IndexGetResponses200ContentApplicationJsonSchema getAllIndexes(
            Integer offset, Integer limit, Enum3 documentType) {
        return getAllIndexesAsync(offset, limit, documentType).block();
    }

    /**
     * Create an index for the search tool.
     *
     * @param body Index to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Paths1Sikw07V2IndexPostResponses201ContentApplicationJsonSchema>> createIndexWithResponseAsync(
            IndexRequestBody body) {
        final String accept = "application/json";
        return service.createIndex(this.getRegion(), body, accept);
    }

    /**
     * Create an index for the search tool.
     *
     * @param body Index to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Paths1Sikw07V2IndexPostResponses201ContentApplicationJsonSchema> createIndexAsync(
            IndexRequestBody body) {
        return createIndexWithResponseAsync(body)
                .flatMap(
                        (Response<Paths1Sikw07V2IndexPostResponses201ContentApplicationJsonSchema> res) -> {
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Paths1Sikw07V2IndexPostResponses201ContentApplicationJsonSchema createIndex(IndexRequestBody body) {
        return createIndexAsync(body).block();
    }

    /**
     * Deletes the specified index from the database.
     *
     * @param name Index name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteIndexWithResponseAsync(String name) {
        final String accept = "application/json";
        return service.deleteIndex(this.getRegion(), name, accept);
    }

    /**
     * Deletes the specified index from the database.
     *
     * @param name Index name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteIndexAsync(String name) {
        return deleteIndexWithResponseAsync(name).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the specified index from the database.
     *
     * @param name Index name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteIndex(String name) {
        deleteIndexAsync(name).block();
    }

    /**
     * Returns all the indexed documents for that index.
     *
     * @param name Index name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PathsAf7Nd4V2IndexNameDocumentsGetResponses200ContentApplicationJsonSchema>>
            getAllIndexDocumentsWithResponseAsync(String name) {
        final String accept = "application/json";
        return service.getAllIndexDocuments(this.getRegion(), name, accept);
    }

    /**
     * Returns all the indexed documents for that index.
     *
     * @param name Index name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PathsAf7Nd4V2IndexNameDocumentsGetResponses200ContentApplicationJsonSchema> getAllIndexDocumentsAsync(
            String name) {
        return getAllIndexDocumentsWithResponseAsync(name)
                .flatMap(
                        (Response<PathsAf7Nd4V2IndexNameDocumentsGetResponses200ContentApplicationJsonSchema> res) -> {
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PathsAf7Nd4V2IndexNameDocumentsGetResponses200ContentApplicationJsonSchema getAllIndexDocuments(
            String name) {
        return getAllIndexDocumentsAsync(name).block();
    }

    /**
     * Create an indexed document for the search tool.
     *
     * @param name Index name.
     * @param body Document to index.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Paths14R8PdgV2IndexNameDocumentsPostResponses201ContentApplicationJsonSchema>>
            createIndexDocumentWithResponseAsync(
                    String name, PathsYg099PV2IndexNameDocumentsPostRequestbodyContentApplicationJsonSchema body) {
        final String accept = "application/json";
        return service.createIndexDocument(this.getRegion(), name, body, accept);
    }

    /**
     * Create an indexed document for the search tool.
     *
     * @param name Index name.
     * @param body Document to index.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Paths14R8PdgV2IndexNameDocumentsPostResponses201ContentApplicationJsonSchema> createIndexDocumentAsync(
            String name, PathsYg099PV2IndexNameDocumentsPostRequestbodyContentApplicationJsonSchema body) {
        return createIndexDocumentWithResponseAsync(name, body)
                .flatMap(
                        (Response<Paths14R8PdgV2IndexNameDocumentsPostResponses201ContentApplicationJsonSchema>
                                        res) -> {
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Paths14R8PdgV2IndexNameDocumentsPostResponses201ContentApplicationJsonSchema createIndexDocument(
            String name, PathsYg099PV2IndexNameDocumentsPostRequestbodyContentApplicationJsonSchema body) {
        return createIndexDocumentAsync(name, body).block();
    }

    /**
     * Delete the specified indexed document from the database.
     *
     * @param name Index name.
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteIndexDocumentWithResponseAsync(String name, String identifier) {
        final String accept = "application/json";
        return service.deleteIndexDocument(this.getRegion(), name, identifier, accept);
    }

    /**
     * Delete the specified indexed document from the database.
     *
     * @param name Index name.
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteIndexDocumentAsync(String name, String identifier) {
        return deleteIndexDocumentWithResponseAsync(name, identifier).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Delete the specified indexed document from the database.
     *
     * @param name Index name.
     * @param identifier Document identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteIndexDocument(String name, String identifier) {
        deleteIndexDocumentAsync(name, identifier).block();
    }

    /**
     * Returns the list of searchable occupation groups.
     *
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of OccupationGroup along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<List<OccupationGroup>>> listOccupationGroupsWithResponseAsync() {
        final String accept = "application/json";
        return service.listOccupationGroups(this.getRegion(), accept);
    }

    /**
     * Returns the list of searchable occupation groups.
     *
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of OccupationGroup on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<List<OccupationGroup>> listOccupationGroupsAsync() {
        return listOccupationGroupsWithResponseAsync()
                .flatMap(
                        (Response<List<OccupationGroup>> res) -> {
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of OccupationGroup.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<OccupationGroup> listOccupationGroups() {
        return listOccupationGroupsAsync().block();
    }

    /**
     * Returns your resthook subscriptions.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PathsMda0LlV2ResthookSubscriptionsGetResponses200ContentApplicationJsonSchema>>
            getAllResthookSubscriptionsWithResponseAsync(Integer offset, Integer limit) {
        final String accept = "application/json";
        return service.getAllResthookSubscriptions(this.getRegion(), offset, limit, accept);
    }

    /**
     * Returns your resthook subscriptions.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PathsMda0LlV2ResthookSubscriptionsGetResponses200ContentApplicationJsonSchema>
            getAllResthookSubscriptionsAsync(Integer offset, Integer limit) {
        return getAllResthookSubscriptionsWithResponseAsync(offset, limit)
                .flatMap(
                        (Response<PathsMda0LlV2ResthookSubscriptionsGetResponses200ContentApplicationJsonSchema>
                                        res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Returns your resthook subscriptions.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PathsMda0LlV2ResthookSubscriptionsGetResponses200ContentApplicationJsonSchema getAllResthookSubscriptions(
            Integer offset, Integer limit) {
        return getAllResthookSubscriptionsAsync(offset, limit).block();
    }

    /**
     * After a subscription is sucessfully created, we'll send a POST request to your target URL with a `X-Hook-Secret`
     * header. You need to response to this request with a 200 status code to confirm your subscribe intention. Then,
     * you need to use the `X-Hook-Secret` to activate the subscription using the
     * [/resthook_subscriptions/activate](#post-/v3/resthook_subscriptions/activate) endpoint. For more information, see
     * our help article here - [How do I create a
     * webhook?](https://help.affinda.com/hc/en-au/articles/11474095148569-How-do-I-create-a-webhook).
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ResthookSubscription>> createResthookSubscriptionWithResponseAsync(
            ResthookSubscriptionCreate body) {
        final String accept = "application/json";
        return service.createResthookSubscription(this.getRegion(), body, accept);
    }

    /**
     * After a subscription is sucessfully created, we'll send a POST request to your target URL with a `X-Hook-Secret`
     * header. You need to response to this request with a 200 status code to confirm your subscribe intention. Then,
     * you need to use the `X-Hook-Secret` to activate the subscription using the
     * [/resthook_subscriptions/activate](#post-/v3/resthook_subscriptions/activate) endpoint. For more information, see
     * our help article here - [How do I create a
     * webhook?](https://help.affinda.com/hc/en-au/articles/11474095148569-How-do-I-create-a-webhook).
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ResthookSubscription> createResthookSubscriptionAsync(ResthookSubscriptionCreate body) {
        return createResthookSubscriptionWithResponseAsync(body)
                .flatMap(
                        (Response<ResthookSubscription> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * After a subscription is sucessfully created, we'll send a POST request to your target URL with a `X-Hook-Secret`
     * header. You need to response to this request with a 200 status code to confirm your subscribe intention. Then,
     * you need to use the `X-Hook-Secret` to activate the subscription using the
     * [/resthook_subscriptions/activate](#post-/v3/resthook_subscriptions/activate) endpoint. For more information, see
     * our help article here - [How do I create a
     * webhook?](https://help.affinda.com/hc/en-au/articles/11474095148569-How-do-I-create-a-webhook).
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ResthookSubscription createResthookSubscription(ResthookSubscriptionCreate body) {
        return createResthookSubscriptionAsync(body).block();
    }

    /**
     * Return a specific resthook subscription.
     *
     * @param id Resthook subscription's ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ResthookSubscription>> getResthookSubscriptionWithResponseAsync(int id) {
        final String accept = "application/json";
        return service.getResthookSubscription(this.getRegion(), id, accept);
    }

    /**
     * Return a specific resthook subscription.
     *
     * @param id Resthook subscription's ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ResthookSubscription> getResthookSubscriptionAsync(int id) {
        return getResthookSubscriptionWithResponseAsync(id)
                .flatMap(
                        (Response<ResthookSubscription> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Return a specific resthook subscription.
     *
     * @param id Resthook subscription's ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ResthookSubscription getResthookSubscription(int id) {
        return getResthookSubscriptionAsync(id).block();
    }

    /**
     * Update data of a resthook subscription.
     *
     * @param id ResthookSubscription's ID.
     * @param body ResthookSubscription data to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ResthookSubscription>> updateResthookSubscriptionWithResponseAsync(
            int id, ResthookSubscriptionUpdate body) {
        final String accept = "application/json";
        return service.updateResthookSubscription(this.getRegion(), id, body, accept);
    }

    /**
     * Update data of a resthook subscription.
     *
     * @param id ResthookSubscription's ID.
     * @param body ResthookSubscription data to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ResthookSubscription> updateResthookSubscriptionAsync(int id, ResthookSubscriptionUpdate body) {
        return updateResthookSubscriptionWithResponseAsync(id, body)
                .flatMap(
                        (Response<ResthookSubscription> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Update data of a resthook subscription.
     *
     * @param id ResthookSubscription's ID.
     * @param body ResthookSubscription data to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ResthookSubscription updateResthookSubscription(int id, ResthookSubscriptionUpdate body) {
        return updateResthookSubscriptionAsync(id, body).block();
    }

    /**
     * Deletes the specified resthook subscription from the database.
     *
     * @param id ResthookSubscription's ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteResthookSubscriptionWithResponseAsync(int id) {
        final String accept = "application/json";
        return service.deleteResthookSubscription(this.getRegion(), id, accept);
    }

    /**
     * Deletes the specified resthook subscription from the database.
     *
     * @param id ResthookSubscription's ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteResthookSubscriptionAsync(int id) {
        return deleteResthookSubscriptionWithResponseAsync(id).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the specified resthook subscription from the database.
     *
     * @param id ResthookSubscription's ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteResthookSubscription(int id) {
        deleteResthookSubscriptionAsync(id).block();
    }

    /**
     * After creating a subscription, we'll send a POST request to your target URL with a `X-Hook-Secret` header. You
     * should response to this with a 200 status code, and use the value of the `X-Hook-Secret` header that you received
     * to activate the subscription using this endpoint.
     *
     * @param xHookSecret The secret received when creating a subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ResthookSubscription>> activateResthookSubscriptionWithResponseAsync(String xHookSecret) {
        final String accept = "application/json";
        return service.activateResthookSubscription(this.getRegion(), xHookSecret, accept);
    }

    /**
     * After creating a subscription, we'll send a POST request to your target URL with a `X-Hook-Secret` header. You
     * should response to this with a 200 status code, and use the value of the `X-Hook-Secret` header that you received
     * to activate the subscription using this endpoint.
     *
     * @param xHookSecret The secret received when creating a subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ResthookSubscription> activateResthookSubscriptionAsync(String xHookSecret) {
        return activateResthookSubscriptionWithResponseAsync(xHookSecret)
                .flatMap(
                        (Response<ResthookSubscription> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * After creating a subscription, we'll send a POST request to your target URL with a `X-Hook-Secret` header. You
     * should response to this with a 200 status code, and use the value of the `X-Hook-Secret` header that you received
     * to activate the subscription using this endpoint.
     *
     * @param xHookSecret The secret received when creating a subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ResthookSubscription activateResthookSubscription(String xHookSecret) {
        return activateResthookSubscriptionAsync(xHookSecret).block();
    }
}
