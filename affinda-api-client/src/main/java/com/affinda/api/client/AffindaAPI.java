package com.affinda.api.client;

import com.affinda.api.client.models.DataPoint;
import com.affinda.api.client.models.DataPointCreate;
import com.affinda.api.client.models.DataPointUpdate;
import com.affinda.api.client.models.DateRange;
import com.affinda.api.client.models.Document;
import com.affinda.api.client.models.DocumentCollection;
import com.affinda.api.client.models.DocumentCollectionCreate;
import com.affinda.api.client.models.DocumentCollectionUpdate;
import com.affinda.api.client.models.DocumentCreate;
import com.affinda.api.client.models.DocumentState;
import com.affinda.api.client.models.DocumentUpdate;
import com.affinda.api.client.models.Enum2;
import com.affinda.api.client.models.Extractor;
import com.affinda.api.client.models.ExtractorCreate;
import com.affinda.api.client.models.ExtractorUpdate;
import com.affinda.api.client.models.Get8ItemsItem;
import com.affinda.api.client.models.GetAllDocumentsResults;
import com.affinda.api.client.models.GetAllInvoicesResults;
import com.affinda.api.client.models.GetAllJobDescriptionsResults;
import com.affinda.api.client.models.IndexRequestBody;
import com.affinda.api.client.models.Invitation;
import com.affinda.api.client.models.InvitationCreate;
import com.affinda.api.client.models.InvitationStatus;
import com.affinda.api.client.models.InvitationUpdate;
import com.affinda.api.client.models.Invoice;
import com.affinda.api.client.models.InvoiceRequestBody;
import com.affinda.api.client.models.JobDescription;
import com.affinda.api.client.models.JobDescriptionRequestBody;
import com.affinda.api.client.models.JobDescriptionSearch;
import com.affinda.api.client.models.JobDescriptionSearchConfig;
import com.affinda.api.client.models.JobDescriptionSearchDetail;
import com.affinda.api.client.models.JobDescriptionSearchEmbed;
import com.affinda.api.client.models.JobDescriptionSearchParameters;
import com.affinda.api.client.models.OccupationGroup;
import com.affinda.api.client.models.Organization;
import com.affinda.api.client.models.OrganizationCreate;
import com.affinda.api.client.models.OrganizationMembership;
import com.affinda.api.client.models.OrganizationMembershipUpdate;
import com.affinda.api.client.models.OrganizationRole;
import com.affinda.api.client.models.Paths1Mc0Je6IndexPostResponses201ContentApplicationJsonSchema;
import com.affinda.api.client.models.Paths2T1Oc0ResumeSearchEmbedPostRequestbodyContentApplicationJsonSchema;
import com.affinda.api.client.models.Paths6Pypg5IndexGetResponses200ContentApplicationJsonSchema;
import com.affinda.api.client.models.PathsAdr1YhWorkspaceMembershipsGetResponses200ContentApplicationJsonSchema;
import com.affinda.api.client.models.PathsCkdzu3OrganizationMembershipsGetResponses200ContentApplicationJsonSchema;
import com.affinda.api.client.models.PathsCoo0XpIndexNameDocumentsPostResponses201ContentApplicationJsonSchema;
import com.affinda.api.client.models.PathsFqn8P8JobDescriptionSearchEmbedPostRequestbodyContentApplicationJsonSchema;
import com.affinda.api.client.models.PathsGpptmIndexNameDocumentsPostRequestbodyContentApplicationJsonSchema;
import com.affinda.api.client.models.PathsRvverlIndexNameDocumentsGetResponses200ContentApplicationJsonSchema;
import com.affinda.api.client.models.PathsW51LnrInvitationsTokenPatchRequestbodyContentApplicationJsonSchema;
import com.affinda.api.client.models.PathsWjaaeuUsersGetResponses200ContentApplicationJsonSchema;
import com.affinda.api.client.models.PathsZt2JhiInvitationsGetResponses200ContentApplicationJsonSchema;
import com.affinda.api.client.models.RedactedResume;
import com.affinda.api.client.models.RedactedResumeRequestBody;
import com.affinda.api.client.models.RequestErrorException;
import com.affinda.api.client.models.Resume;
import com.affinda.api.client.models.ResumeData;
import com.affinda.api.client.models.ResumeRequestBody;
import com.affinda.api.client.models.ResumeSearch;
import com.affinda.api.client.models.ResumeSearchConfig;
import com.affinda.api.client.models.ResumeSearchDetail;
import com.affinda.api.client.models.ResumeSearchEmbed;
import com.affinda.api.client.models.ResumeSearchMatch;
import com.affinda.api.client.models.ResumeSearchParameters;
import com.affinda.api.client.models.Tag;
import com.affinda.api.client.models.TagCreate;
import com.affinda.api.client.models.TagUpdate;
import com.affinda.api.client.models.UserCreateRequest;
import com.affinda.api.client.models.UserCreateResponse;
import com.affinda.api.client.models.Workspace;
import com.affinda.api.client.models.WorkspaceCreate;
import com.affinda.api.client.models.WorkspaceMembership;
import com.affinda.api.client.models.WorkspaceMembershipCreate;
import com.affinda.api.client.models.WorkspaceUpdate;
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
import com.azure.core.util.serializer.CollectionFormat;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
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
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<GetAllDocumentsResults>> getAllResumes(
                @HostParam("$host") String host,
                @QueryParam("offset") Integer offset,
                @QueryParam("limit") Integer limit,
                @HeaderParam("Accept") String accept);

        @Post("/resumes")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Resume>> createResume(
                @HostParam("$host") String host,
                @BodyParam("application/json") ResumeRequestBody body,
                @HeaderParam("Accept") String accept);

        @Get("/resumes/{identifier}")
        @ExpectedResponses({200, 200, 400, 400, 401, 401, 404, 404})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Object>> getResume(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @QueryParam("format") String format,
                @HeaderParam("Accept") String accept);

        @Patch("/resumes/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<ResumeData>> updateResumeData(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @BodyParam("application/json") ResumeData body,
                @HeaderParam("Accept") String accept);

        @Delete("/resumes/{identifier}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Void>> deleteResume(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Get("/redacted_resumes")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<GetAllDocumentsResults>> getAllRedactedResumes(
                @HostParam("$host") String host,
                @QueryParam("offset") Integer offset,
                @QueryParam("limit") Integer limit,
                @HeaderParam("Accept") String accept);

        @Post("/redacted_resumes")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<RedactedResume>> createRedactedResume(
                @HostParam("$host") String host,
                @BodyParam("application/json") RedactedResumeRequestBody body,
                @HeaderParam("Accept") String accept);

        @Get("/redacted_resumes/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<RedactedResume>> getRedactedResume(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Delete("/redacted_resumes/{identifier}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Void>> deleteRedactedResume(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Post("/resume_search")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<ResumeSearch>> createResumeSearch(
                @HostParam("$host") String host,
                @QueryParam("offset") Integer offset,
                @QueryParam("limit") Integer limit,
                @BodyParam("application/json") ResumeSearchParameters body,
                @HeaderParam("Accept") String accept);

        @Post("/resume_search/details/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<ResumeSearchDetail>> getResumeSearchDetail(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @BodyParam("application/json") ResumeSearchParameters body,
                @HeaderParam("Accept") String accept);

        @Get("/resume_search/match")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<ResumeSearchMatch>> getResumeSearchMatch(
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
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<ResumeSearchConfig>> getResumeSearchConfig(
                @HostParam("$host") String host, @HeaderParam("Accept") String accept);

        @Patch("/resume_search/config")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<ResumeSearchConfig>> updateResumeSearchConfig(
                @HostParam("$host") String host,
                @BodyParam("application/json") ResumeSearchConfig body,
                @HeaderParam("Accept") String accept);

        @Post("/resume_search/embed")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<ResumeSearchEmbed>> createResumeSearchEmbedUrl(
                @HostParam("$host") String host,
                @BodyParam("application/json")
                        Paths2T1Oc0ResumeSearchEmbedPostRequestbodyContentApplicationJsonSchema body,
                @HeaderParam("Accept") String accept);

        @Get("/resume_search/suggestion_job_title")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<List<String>>> getResumeSearchSuggestionJobTitle(
                @HostParam("$host") String host,
                @QueryParam(value = "job_titles", multipleQueryParams = true) List<String> jobTitles,
                @HeaderParam("Accept") String accept);

        @Get("/resume_search/suggestion_skill")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<List<String>>> getResumeSearchSuggestionSkill(
                @HostParam("$host") String host,
                @QueryParam(value = "skills", multipleQueryParams = true) List<String> skills,
                @HeaderParam("Accept") String accept);

        @Get("/job_descriptions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<GetAllJobDescriptionsResults>> getAllJobDescriptions(
                @HostParam("$host") String host,
                @QueryParam("offset") Integer offset,
                @QueryParam("limit") Integer limit,
                @HeaderParam("Accept") String accept);

        @Post("/job_descriptions")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<JobDescription>> createJobDescription(
                @HostParam("$host") String host,
                @BodyParam("application/json") JobDescriptionRequestBody body,
                @HeaderParam("Accept") String accept);

        @Get("/job_descriptions/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<JobDescription>> getJobDescription(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Delete("/job_descriptions/{identifier}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Void>> deleteJobDescription(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Post("/job_description_search")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<JobDescriptionSearch>> createJobDescriptionSearch(
                @HostParam("$host") String host,
                @QueryParam("offset") Integer offset,
                @QueryParam("limit") Integer limit,
                @BodyParam("application/json") JobDescriptionSearchParameters body,
                @HeaderParam("Accept") String accept);

        @Post("/job_description_search/details/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<JobDescriptionSearchDetail>> getJobDescriptionSearchDetail(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @BodyParam("application/json") JobDescriptionSearchParameters body,
                @HeaderParam("Accept") String accept);

        @Get("/job_description_search/config")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<JobDescriptionSearchConfig>> getJobDescriptionSearchConfig(
                @HostParam("$host") String host, @HeaderParam("Accept") String accept);

        @Patch("/job_description_search/config")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<JobDescriptionSearchConfig>> updateJobDescriptionSearchConfig(
                @HostParam("$host") String host,
                @BodyParam("application/json") JobDescriptionSearchConfig body,
                @HeaderParam("Accept") String accept);

        @Post("/job_description_search/embed")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<JobDescriptionSearchEmbed>> createJobDescriptionSearchEmbedUrl(
                @HostParam("$host") String host,
                @BodyParam("application/json")
                        PathsFqn8P8JobDescriptionSearchEmbedPostRequestbodyContentApplicationJsonSchema body,
                @HeaderParam("Accept") String accept);

        @Get("/index")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Paths6Pypg5IndexGetResponses200ContentApplicationJsonSchema>> getAllIndexes(
                @HostParam("$host") String host,
                @QueryParam("offset") Integer offset,
                @QueryParam("limit") Integer limit,
                @QueryParam("document_type") Enum2 documentType,
                @HeaderParam("Accept") String accept);

        @Post("/index")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Paths1Mc0Je6IndexPostResponses201ContentApplicationJsonSchema>> createIndex(
                @HostParam("$host") String host,
                @BodyParam("application/json") IndexRequestBody body,
                @HeaderParam("Accept") String accept);

        @Delete("/index/{name}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Void>> deleteIndex(
                @HostParam("$host") String host, @PathParam("name") String name, @HeaderParam("Accept") String accept);

        @Get("/index/{name}/documents")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<PathsRvverlIndexNameDocumentsGetResponses200ContentApplicationJsonSchema>> getAllIndexDocuments(
                @HostParam("$host") String host, @PathParam("name") String name, @HeaderParam("Accept") String accept);

        @Post("/index/{name}/documents")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<PathsCoo0XpIndexNameDocumentsPostResponses201ContentApplicationJsonSchema>> createIndexDocument(
                @HostParam("$host") String host,
                @PathParam("name") String name,
                @BodyParam("application/json")
                        PathsGpptmIndexNameDocumentsPostRequestbodyContentApplicationJsonSchema body,
                @HeaderParam("Accept") String accept);

        @Delete("/index/{name}/documents/{identifier}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Void>> deleteIndexDocument(
                @HostParam("$host") String host,
                @PathParam("name") String name,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Get("/invoices")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<GetAllInvoicesResults>> getAllInvoices(
                @HostParam("$host") String host,
                @QueryParam("offset") Integer offset,
                @QueryParam("limit") Integer limit,
                @HeaderParam("Accept") String accept);

        @Post("/invoices")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Invoice>> createInvoice(
                @HostParam("$host") String host,
                @BodyParam("application/json") InvoiceRequestBody body,
                @HeaderParam("Accept") String accept);

        @Get("/invoices/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Invoice>> getInvoice(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Delete("/invoices/{identifier}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Void>> deleteInvoice(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Get("/occupation_groups")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<List<OccupationGroup>>> listOccupationGroups(
                @HostParam("$host") String host, @HeaderParam("Accept") String accept);

        @Get("/users")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<PathsWjaaeuUsersGetResponses200ContentApplicationJsonSchema>> getAllUsers(
                @HostParam("$host") String host,
                @QueryParam("offset") Integer offset,
                @QueryParam("limit") Integer limit,
                @HeaderParam("Accept") String accept);

        @Post("/users")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<UserCreateResponse>> createUser(
                @HostParam("$host") String host,
                @BodyParam("application/json") UserCreateRequest body,
                @HeaderParam("Accept") String accept);

        @Get("/organizations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<List<Organization>>> getAllOrganizations(
                @HostParam("$host") String host, @HeaderParam("Accept") String accept);

        @Post("/organizations")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Organization>> createOrganization(
                @HostParam("$host") String host,
                @BodyParam("application/json") OrganizationCreate body,
                @HeaderParam("Accept") String accept);

        @Get("/organizations/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Organization>> getOrganization(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        // @Multipart not supported by RestProxy
        @Patch("/organizations/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Organization>> updateOrganization(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @BodyParam("multipart/form-data") String name,
                @BodyParam("multipart/form-data") Flux<ByteBuffer> avatar,
                @HeaderParam("Content-Length") Long contentLength,
                @BodyParam("multipart/form-data") String resthookSignatureKey,
                @HeaderParam("Accept") String accept);

        @Delete("/organizations/{identifier}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Void>> deleteOrganization(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Get("/organization_memberships")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<PathsCkdzu3OrganizationMembershipsGetResponses200ContentApplicationJsonSchema>>
                getAllOrganizationMemberships(
                        @HostParam("$host") String host,
                        @QueryParam("offset") Integer offset,
                        @QueryParam("limit") Integer limit,
                        @QueryParam("organization") String organization,
                        @QueryParam("role") OrganizationRole role,
                        @HeaderParam("Accept") String accept);

        @Get("/organization_memberships/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<OrganizationMembership>> getOrganizationMembership(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Patch("/organization_memberships/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<OrganizationMembership>> updateOrganizationMembership(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @BodyParam("application/json") OrganizationMembershipUpdate body,
                @HeaderParam("Accept") String accept);

        @Delete("/organization_memberships/{identifier}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Void>> deleteOrganizationMembership(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Get("/invitations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<PathsZt2JhiInvitationsGetResponses200ContentApplicationJsonSchema>> getAllInvitations(
                @HostParam("$host") String host,
                @QueryParam("offset") Integer offset,
                @QueryParam("limit") Integer limit,
                @QueryParam("organization") String organization,
                @QueryParam("status") InvitationStatus status,
                @QueryParam("role") OrganizationRole role,
                @HeaderParam("Accept") String accept);

        @Post("/invitations")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Invitation>> createInvitation(
                @HostParam("$host") String host,
                @BodyParam("application/json") InvitationCreate body,
                @HeaderParam("Accept") String accept);

        @Get("/invitations/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Invitation>> getInvitation(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Patch("/invitations/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Invitation>> updateInvitation(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @BodyParam("application/json") InvitationUpdate body,
                @HeaderParam("Accept") String accept);

        @Delete("/invitations/{identifier}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Void>> deleteInvitation(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Get("/invitations/token/{token}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Invitation>> getInvitationByToken(
                @HostParam("$host") String host,
                @PathParam("token") String token,
                @HeaderParam("Accept") String accept);

        @Patch("/invitations/token/{token}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Invitation>> respondToInvitation(
                @HostParam("$host") String host,
                @PathParam("token") String token,
                @BodyParam("application/json")
                        PathsW51LnrInvitationsTokenPatchRequestbodyContentApplicationJsonSchema body,
                @HeaderParam("Accept") String accept);

        @Get("/extractors")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<List<Extractor>>> getAllExtractors(
                @HostParam("$host") String host,
                @QueryParam("organization") String organization,
                @QueryParam("include_public_extractors") Boolean includePublicExtractors,
                @QueryParam("name") String name,
                @QueryParam("validatable") Boolean validatable,
                @HeaderParam("Accept") String accept);

        @Post("/extractors")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Extractor>> createExtractor(
                @HostParam("$host") String host,
                @BodyParam("application/json") ExtractorCreate body,
                @HeaderParam("Accept") String accept);

        @Get("/extractors/{id}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Extractor>> getExtractor(
                @HostParam("$host") String host, @PathParam("id") int id, @HeaderParam("Accept") String accept);

        @Patch("/extractors/{id}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Extractor>> updateExtractorData(
                @HostParam("$host") String host,
                @PathParam("id") int id,
                @BodyParam("application/json") ExtractorUpdate body,
                @HeaderParam("Accept") String accept);

        @Delete("/extractors/{id}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Void>> deleteExtractor(
                @HostParam("$host") String host, @PathParam("id") int id, @HeaderParam("Accept") String accept);

        @Get("/data_points")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<List<DataPoint>>> getAllDataPoints(
                @HostParam("$host") String host,
                @QueryParam("offset") Integer offset,
                @QueryParam("limit") Integer limit,
                @QueryParam("organization") String organization,
                @QueryParam("extractor") Integer extractor,
                @QueryParam("slug") String slug,
                @QueryParam("description") String description,
                @QueryParam("annotation_content_type") String annotationContentType,
                @HeaderParam("Accept") String accept);

        @Post("/data_points")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<DataPoint>> createDataPoint(
                @HostParam("$host") String host,
                @BodyParam("application/json") DataPointCreate body,
                @HeaderParam("Accept") String accept);

        @Get("/data_points/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<DataPoint>> getDataPoint(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Patch("/data_points/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<DataPoint>> updateDataPointData(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @BodyParam("application/json") DataPointUpdate body,
                @HeaderParam("Accept") String accept);

        @Delete("/data_points/{identifier}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Void>> deleteDataPoint(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Get("/workspaces")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<List<Workspace>>> getAllWorkspaces(
                @HostParam("$host") String host,
                @QueryParam("organization") String organization,
                @QueryParam("name") String name,
                @HeaderParam("Accept") String accept);

        @Post("/workspaces")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Workspace>> createWorkspace(
                @HostParam("$host") String host,
                @BodyParam("application/json") WorkspaceCreate body,
                @HeaderParam("Accept") String accept);

        @Get("/workspaces/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Workspace>> getWorkspace(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Patch("/workspaces/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Workspace>> updateWorkspace(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @BodyParam("application/json") WorkspaceUpdate body,
                @HeaderParam("Accept") String accept);

        @Delete("/workspaces/{identifier}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Void>> deleteWorkspace(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Get("/workspace_memberships")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<PathsAdr1YhWorkspaceMembershipsGetResponses200ContentApplicationJsonSchema>>
                getAllWorkspaceMemberships(
                        @HostParam("$host") String host,
                        @QueryParam("offset") Integer offset,
                        @QueryParam("limit") Integer limit,
                        @QueryParam("workspace") String workspace,
                        @QueryParam("user") String user,
                        @HeaderParam("Accept") String accept);

        @Post("/workspace_memberships")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<WorkspaceMembership>> createWorkspaceMembership(
                @HostParam("$host") String host,
                @BodyParam("application/json") WorkspaceMembershipCreate body,
                @HeaderParam("Accept") String accept);

        @Get("/workspace_memberships/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<WorkspaceMembership>> getWorkspaceMembership(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Delete("/workspace_memberships/{identifier}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Void>> deleteWorkspaceMembership(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Get("/collections")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<List<DocumentCollection>>> getAllCollections(
                @HostParam("$host") String host,
                @QueryParam("workspace") String workspace,
                @HeaderParam("Accept") String accept);

        @Post("/collections")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<DocumentCollection>> createCollection(
                @HostParam("$host") String host,
                @BodyParam("application/json") DocumentCollectionCreate body,
                @HeaderParam("Accept") String accept);

        @Get("/collections/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<DocumentCollection>> getCollection(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Patch("/collections/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<DocumentCollection>> updateCollectionData(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @BodyParam("application/json") DocumentCollectionUpdate body,
                @HeaderParam("Accept") String accept);

        @Delete("/collections/{identifier}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Void>> deleteCollection(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Get("/documents")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<GetAllDocumentsResults>> getAllDocuments(
                @HostParam("$host") String host,
                @QueryParam("offset") Integer offset,
                @QueryParam("limit") Integer limit,
                @QueryParam("workspace") String workspace,
                @QueryParam("collection") String collection,
                @QueryParam("state") DocumentState state,
                @QueryParam("tags") String tags,
                @QueryParam("created_dt") DateRange createdDt,
                @QueryParam("search") String search,
                @QueryParam("ordering") String ordering,
                @QueryParam("include_data") Boolean includeData,
                @HeaderParam("Accept") String accept);

        @Post("/documents")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Document>> createDocument(
                @HostParam("$host") String host,
                @BodyParam("application/json") DocumentCreate body,
                @HeaderParam("Accept") String accept);

        @Get("/documents/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Document>> getDocument(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Patch("/documents/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Document>> updateDocumentData(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @BodyParam("application/json") DocumentUpdate body,
                @HeaderParam("Accept") String accept);

        @Delete("/documents/{identifier}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Void>> deleteDocument(
                @HostParam("$host") String host,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Get("/tags")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<List<Tag>>> getAllTags(
                @HostParam("$host") String host,
                @QueryParam("limit") Integer limit,
                @QueryParam("offset") Integer offset,
                @QueryParam("workspace") String workspace,
                @HeaderParam("Accept") String accept);

        @Post("/tags")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Tag>> createTag(
                @HostParam("$host") String host,
                @BodyParam("application/json") TagCreate body,
                @HeaderParam("Accept") String accept);

        @Get("/tags/{id}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Tag>> getTag(
                @HostParam("$host") String host, @PathParam("id") int id, @HeaderParam("Accept") String accept);

        @Patch("/tags/{id}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Tag>> updateTagData(
                @HostParam("$host") String host,
                @PathParam("id") int id,
                @BodyParam("application/json") TagUpdate body,
                @HeaderParam("Accept") String accept);

        @Delete("/tags/{id}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Void>> deleteTag(
                @HostParam("$host") String host, @PathParam("id") int id, @HeaderParam("Accept") String accept);
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
    public Mono<Response<GetAllDocumentsResults>> getAllResumesWithResponseAsync(Integer offset, Integer limit) {
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<GetAllDocumentsResults> getAllResumesAsync(Integer offset, Integer limit) {
        return getAllResumesWithResponseAsync(offset, limit)
                .flatMap(
                        (Response<GetAllDocumentsResults> res) -> {
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
    public GetAllDocumentsResults getAllResumes(Integer offset, Integer limit) {
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
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Object>> getResumeWithResponseAsync(String identifier, String format) {
        final String accept = "application/json, application/xml";
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a JSON-encoded string of the `ResumeData` object along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ResumeData>> updateResumeDataWithResponseAsync(String identifier, ResumeData body) {
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
        return service.deleteResume(this.getHost(), identifier, accept);
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
    public Mono<Response<GetAllDocumentsResults>> getAllRedactedResumesWithResponseAsync(
            Integer offset, Integer limit) {
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<GetAllDocumentsResults> getAllRedactedResumesAsync(Integer offset, Integer limit) {
        return getAllRedactedResumesWithResponseAsync(offset, limit)
                .flatMap(
                        (Response<GetAllDocumentsResults> res) -> {
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
    public GetAllDocumentsResults getAllRedactedResumes(Integer offset, Integer limit) {
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
        return service.createRedactedResume(this.getHost(), body, accept);
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
        return service.getRedactedResume(this.getHost(), identifier, accept);
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
        return service.deleteRedactedResume(this.getHost(), identifier, accept);
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
        return service.getResumeSearchConfig(this.getHost(), accept);
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
        return service.updateResumeSearchConfig(this.getHost(), body, accept);
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
            Paths2T1Oc0ResumeSearchEmbedPostRequestbodyContentApplicationJsonSchema body) {
        final String accept = "application/json";
        return service.createResumeSearchEmbedUrl(this.getHost(), body, accept);
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
            Paths2T1Oc0ResumeSearchEmbedPostRequestbodyContentApplicationJsonSchema body) {
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
            Paths2T1Oc0ResumeSearchEmbedPostRequestbodyContentApplicationJsonSchema body) {
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
        return service.getResumeSearchSuggestionJobTitle(this.getHost(), jobTitlesConverted, accept);
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
        return service.getResumeSearchSuggestionSkill(this.getHost(), skillsConverted, accept);
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
    public Mono<Response<GetAllJobDescriptionsResults>> getAllJobDescriptionsWithResponseAsync(
            Integer offset, Integer limit) {
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<GetAllJobDescriptionsResults> getAllJobDescriptionsAsync(Integer offset, Integer limit) {
        return getAllJobDescriptionsWithResponseAsync(offset, limit)
                .flatMap(
                        (Response<GetAllJobDescriptionsResults> res) -> {
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
    public GetAllJobDescriptionsResults getAllJobDescriptions(Integer offset, Integer limit) {
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<JobDescription>> createJobDescriptionWithResponseAsync(JobDescriptionRequestBody body) {
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
     * status and retrieve results. Job Descriptions can be uploaded as a file or a URL.
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
        return service.getJobDescription(this.getHost(), identifier, accept);
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
        return service.deleteJobDescription(this.getHost(), identifier, accept);
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
        return service.getJobDescriptionSearchConfig(this.getHost(), accept);
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
        return service.updateJobDescriptionSearchConfig(this.getHost(), body, accept);
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
            PathsFqn8P8JobDescriptionSearchEmbedPostRequestbodyContentApplicationJsonSchema body) {
        final String accept = "application/json";
        return service.createJobDescriptionSearchEmbedUrl(this.getHost(), body, accept);
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
            PathsFqn8P8JobDescriptionSearchEmbedPostRequestbodyContentApplicationJsonSchema body) {
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
            PathsFqn8P8JobDescriptionSearchEmbedPostRequestbodyContentApplicationJsonSchema body) {
        return createJobDescriptionSearchEmbedUrlAsync(body).block();
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
    public Mono<Response<Paths6Pypg5IndexGetResponses200ContentApplicationJsonSchema>> getAllIndexesWithResponseAsync(
            Integer offset, Integer limit, Enum2 documentType) {
        final String accept = "application/json";
        return service.getAllIndexes(this.getHost(), offset, limit, documentType, accept);
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
    public Mono<Paths6Pypg5IndexGetResponses200ContentApplicationJsonSchema> getAllIndexesAsync(
            Integer offset, Integer limit, Enum2 documentType) {
        return getAllIndexesWithResponseAsync(offset, limit, documentType)
                .flatMap(
                        (Response<Paths6Pypg5IndexGetResponses200ContentApplicationJsonSchema> res) -> {
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
    public Paths6Pypg5IndexGetResponses200ContentApplicationJsonSchema getAllIndexes(
            Integer offset, Integer limit, Enum2 documentType) {
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
    public Mono<Response<Paths1Mc0Je6IndexPostResponses201ContentApplicationJsonSchema>> createIndexWithResponseAsync(
            IndexRequestBody body) {
        final String accept = "application/json";
        return service.createIndex(this.getHost(), body, accept);
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
    public Mono<Paths1Mc0Je6IndexPostResponses201ContentApplicationJsonSchema> createIndexAsync(IndexRequestBody body) {
        return createIndexWithResponseAsync(body)
                .flatMap(
                        (Response<Paths1Mc0Je6IndexPostResponses201ContentApplicationJsonSchema> res) -> {
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
    public Paths1Mc0Je6IndexPostResponses201ContentApplicationJsonSchema createIndex(IndexRequestBody body) {
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
        return service.deleteIndex(this.getHost(), name, accept);
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
    public Mono<Response<PathsRvverlIndexNameDocumentsGetResponses200ContentApplicationJsonSchema>>
            getAllIndexDocumentsWithResponseAsync(String name) {
        final String accept = "application/json";
        return service.getAllIndexDocuments(this.getHost(), name, accept);
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
    public Mono<PathsRvverlIndexNameDocumentsGetResponses200ContentApplicationJsonSchema> getAllIndexDocumentsAsync(
            String name) {
        return getAllIndexDocumentsWithResponseAsync(name)
                .flatMap(
                        (Response<PathsRvverlIndexNameDocumentsGetResponses200ContentApplicationJsonSchema> res) -> {
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
    public PathsRvverlIndexNameDocumentsGetResponses200ContentApplicationJsonSchema getAllIndexDocuments(String name) {
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
    public Mono<Response<PathsCoo0XpIndexNameDocumentsPostResponses201ContentApplicationJsonSchema>>
            createIndexDocumentWithResponseAsync(
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PathsCoo0XpIndexNameDocumentsPostResponses201ContentApplicationJsonSchema> createIndexDocumentAsync(
            String name, PathsGpptmIndexNameDocumentsPostRequestbodyContentApplicationJsonSchema body) {
        return createIndexDocumentWithResponseAsync(name, body)
                .flatMap(
                        (Response<PathsCoo0XpIndexNameDocumentsPostResponses201ContentApplicationJsonSchema> res) -> {
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
    public PathsCoo0XpIndexNameDocumentsPostResponses201ContentApplicationJsonSchema createIndexDocument(
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteIndexDocumentWithResponseAsync(String name, String identifier) {
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
    public Mono<Response<GetAllInvoicesResults>> getAllInvoicesWithResponseAsync(Integer offset, Integer limit) {
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<GetAllInvoicesResults> getAllInvoicesAsync(Integer offset, Integer limit) {
        return getAllInvoicesWithResponseAsync(offset, limit)
                .flatMap(
                        (Response<GetAllInvoicesResults> res) -> {
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
    public GetAllInvoicesResults getAllInvoices(Integer offset, Integer limit) {
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
        return service.getInvoice(this.getHost(), identifier, accept);
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
        return service.deleteInvoice(this.getHost(), identifier, accept);
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
        return service.listOccupationGroups(this.getHost(), accept);
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
     * Returns all the users.
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
    public Mono<Response<PathsWjaaeuUsersGetResponses200ContentApplicationJsonSchema>> getAllUsersWithResponseAsync(
            Integer offset, Integer limit) {
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PathsWjaaeuUsersGetResponses200ContentApplicationJsonSchema> getAllUsersAsync(
            Integer offset, Integer limit) {
        return getAllUsersWithResponseAsync(offset, limit)
                .flatMap(
                        (Response<PathsWjaaeuUsersGetResponses200ContentApplicationJsonSchema> res) -> {
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PathsWjaaeuUsersGetResponses200ContentApplicationJsonSchema getAllUsers(Integer offset, Integer limit) {
        return getAllUsersAsync(offset, limit).block();
    }

    /**
     * Create an user as part of your account.
     *
     * @param body User to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<UserCreateResponse>> createUserWithResponseAsync(UserCreateRequest body) {
        final String accept = "application/json";
        return service.createUser(this.getHost(), body, accept);
    }

    /**
     * Create an user as part of your account.
     *
     * @param body User to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<UserCreateResponse> createUserAsync(UserCreateRequest body) {
        return createUserWithResponseAsync(body)
                .flatMap(
                        (Response<UserCreateResponse> res) -> {
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
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public UserCreateResponse createUser(UserCreateRequest body) {
        return createUserAsync(body).block();
    }

    /**
     * Returns all the organizations.
     *
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Organization along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<List<Organization>>> getAllOrganizationsWithResponseAsync() {
        final String accept = "application/json";
        return service.getAllOrganizations(this.getHost(), accept);
    }

    /**
     * Returns all the organizations.
     *
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Organization on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<List<Organization>> getAllOrganizationsAsync() {
        return getAllOrganizationsWithResponseAsync()
                .flatMap(
                        (Response<List<Organization>> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Returns all the organizations.
     *
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Organization.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<Organization> getAllOrganizations() {
        return getAllOrganizationsAsync().block();
    }

    /**
     * Create a new organization.
     *
     * @param body Organization to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Organization>> createOrganizationWithResponseAsync(OrganizationCreate body) {
        final String accept = "application/json";
        return service.createOrganization(this.getHost(), body, accept);
    }

    /**
     * Create a new organization.
     *
     * @param body Organization to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Organization> createOrganizationAsync(OrganizationCreate body) {
        return createOrganizationWithResponseAsync(body)
                .flatMap(
                        (Response<Organization> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Create a new organization.
     *
     * @param body Organization to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Organization createOrganization(OrganizationCreate body) {
        return createOrganizationAsync(body).block();
    }

    /**
     * Get detail of an organization.
     *
     * @param identifier Organization identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return detail of an organization along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Organization>> getOrganizationWithResponseAsync(String identifier) {
        final String accept = "application/json";
        return service.getOrganization(this.getHost(), identifier, accept);
    }

    /**
     * Get detail of an organization.
     *
     * @param identifier Organization identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return detail of an organization on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Organization> getOrganizationAsync(String identifier) {
        return getOrganizationWithResponseAsync(identifier)
                .flatMap(
                        (Response<Organization> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Get detail of an organization.
     *
     * @param identifier Organization identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return detail of an organization.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Organization getOrganization(String identifier) {
        return getOrganizationAsync(identifier).block();
    }

    /**
     * Update the detail of an organization.
     *
     * @param identifier Organization identifier.
     * @param name The name parameter.
     * @param avatar Upload avatar for the organization.
     * @param contentLength The contentLength parameter.
     * @param resthookSignatureKey Used to sign webhook payloads so you can verify their integrity.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Organization>> updateOrganizationWithResponseAsync(
            String identifier, String name, Flux<ByteBuffer> avatar, Long contentLength, String resthookSignatureKey) {
        final String accept = "application/json";
        return service.updateOrganization(
                this.getHost(), identifier, name, avatar, contentLength, resthookSignatureKey, accept);
    }

    /**
     * Update the detail of an organization.
     *
     * @param identifier Organization identifier.
     * @param name The name parameter.
     * @param avatar Upload avatar for the organization.
     * @param contentLength The contentLength parameter.
     * @param resthookSignatureKey Used to sign webhook payloads so you can verify their integrity.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Organization> updateOrganizationAsync(
            String identifier, String name, Flux<ByteBuffer> avatar, Long contentLength, String resthookSignatureKey) {
        return updateOrganizationWithResponseAsync(identifier, name, avatar, contentLength, resthookSignatureKey)
                .flatMap(
                        (Response<Organization> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Update the detail of an organization.
     *
     * @param identifier Organization identifier.
     * @param name The name parameter.
     * @param avatar Upload avatar for the organization.
     * @param contentLength The contentLength parameter.
     * @param resthookSignatureKey Used to sign webhook payloads so you can verify their integrity.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Organization updateOrganization(
            String identifier, String name, Flux<ByteBuffer> avatar, Long contentLength, String resthookSignatureKey) {
        return updateOrganizationAsync(identifier, name, avatar, contentLength, resthookSignatureKey).block();
    }

    /**
     * Delete the specified organization from the database.
     *
     * @param identifier Organization identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteOrganizationWithResponseAsync(String identifier) {
        final String accept = "application/json";
        return service.deleteOrganization(this.getHost(), identifier, accept);
    }

    /**
     * Delete the specified organization from the database.
     *
     * @param identifier Organization identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteOrganizationAsync(String identifier) {
        return deleteOrganizationWithResponseAsync(identifier).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Delete the specified organization from the database.
     *
     * @param identifier Organization identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteOrganization(String identifier) {
        deleteOrganizationAsync(identifier).block();
    }

    /**
     * Returns all the organization memberships.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @param organization Filter by organization.
     * @param role Filter by role.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PathsCkdzu3OrganizationMembershipsGetResponses200ContentApplicationJsonSchema>>
            getAllOrganizationMembershipsWithResponseAsync(
                    Integer offset, Integer limit, String organization, OrganizationRole role) {
        final String accept = "application/json";
        return service.getAllOrganizationMemberships(this.getHost(), offset, limit, organization, role, accept);
    }

    /**
     * Returns all the organization memberships.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @param organization Filter by organization.
     * @param role Filter by role.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PathsCkdzu3OrganizationMembershipsGetResponses200ContentApplicationJsonSchema>
            getAllOrganizationMembershipsAsync(
                    Integer offset, Integer limit, String organization, OrganizationRole role) {
        return getAllOrganizationMembershipsWithResponseAsync(offset, limit, organization, role)
                .flatMap(
                        (Response<PathsCkdzu3OrganizationMembershipsGetResponses200ContentApplicationJsonSchema>
                                        res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Returns all the organization memberships.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @param organization Filter by organization.
     * @param role Filter by role.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PathsCkdzu3OrganizationMembershipsGetResponses200ContentApplicationJsonSchema getAllOrganizationMemberships(
            Integer offset, Integer limit, String organization, OrganizationRole role) {
        return getAllOrganizationMembershipsAsync(offset, limit, organization, role).block();
    }

    /**
     * Get detail of an organization membership.
     *
     * @param identifier Membership identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return detail of an organization membership along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<OrganizationMembership>> getOrganizationMembershipWithResponseAsync(String identifier) {
        final String accept = "application/json";
        return service.getOrganizationMembership(this.getHost(), identifier, accept);
    }

    /**
     * Get detail of an organization membership.
     *
     * @param identifier Membership identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return detail of an organization membership on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<OrganizationMembership> getOrganizationMembershipAsync(String identifier) {
        return getOrganizationMembershipWithResponseAsync(identifier)
                .flatMap(
                        (Response<OrganizationMembership> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Get detail of an organization membership.
     *
     * @param identifier Membership identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return detail of an organization membership.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public OrganizationMembership getOrganizationMembership(String identifier) {
        return getOrganizationMembershipAsync(identifier).block();
    }

    /**
     * The admin users can use this endpoint to update the role of the members within their organization.
     *
     * @param identifier Membership identifier.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<OrganizationMembership>> updateOrganizationMembershipWithResponseAsync(
            String identifier, OrganizationMembershipUpdate body) {
        final String accept = "application/json";
        return service.updateOrganizationMembership(this.getHost(), identifier, body, accept);
    }

    /**
     * The admin users can use this endpoint to update the role of the members within their organization.
     *
     * @param identifier Membership identifier.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<OrganizationMembership> updateOrganizationMembershipAsync(
            String identifier, OrganizationMembershipUpdate body) {
        return updateOrganizationMembershipWithResponseAsync(identifier, body)
                .flatMap(
                        (Response<OrganizationMembership> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * The admin users can use this endpoint to update the role of the members within their organization.
     *
     * @param identifier Membership identifier.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public OrganizationMembership updateOrganizationMembership(String identifier, OrganizationMembershipUpdate body) {
        return updateOrganizationMembershipAsync(identifier, body).block();
    }

    /**
     * The admin users can use this endpoint to remove member from their organization. Other users can also use this to
     * leave their organization.
     *
     * @param identifier Membership identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteOrganizationMembershipWithResponseAsync(String identifier) {
        final String accept = "application/json";
        return service.deleteOrganizationMembership(this.getHost(), identifier, accept);
    }

    /**
     * The admin users can use this endpoint to remove member from their organization. Other users can also use this to
     * leave their organization.
     *
     * @param identifier Membership identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteOrganizationMembershipAsync(String identifier) {
        return deleteOrganizationMembershipWithResponseAsync(identifier).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * The admin users can use this endpoint to remove member from their organization. Other users can also use this to
     * leave their organization.
     *
     * @param identifier Membership identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteOrganizationMembership(String identifier) {
        deleteOrganizationMembershipAsync(identifier).block();
    }

    /**
     * Get list of all invitations you created or sent to you.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @param organization Filter by organization.
     * @param status Filter by status.
     * @param role Filter by role.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of all invitations you created or sent to you along with {@link Response} on successful completion
     *     of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PathsZt2JhiInvitationsGetResponses200ContentApplicationJsonSchema>>
            getAllInvitationsWithResponseAsync(
                    Integer offset,
                    Integer limit,
                    String organization,
                    InvitationStatus status,
                    OrganizationRole role) {
        final String accept = "application/json";
        return service.getAllInvitations(this.getHost(), offset, limit, organization, status, role, accept);
    }

    /**
     * Get list of all invitations you created or sent to you.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @param organization Filter by organization.
     * @param status Filter by status.
     * @param role Filter by role.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of all invitations you created or sent to you on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PathsZt2JhiInvitationsGetResponses200ContentApplicationJsonSchema> getAllInvitationsAsync(
            Integer offset, Integer limit, String organization, InvitationStatus status, OrganizationRole role) {
        return getAllInvitationsWithResponseAsync(offset, limit, organization, status, role)
                .flatMap(
                        (Response<PathsZt2JhiInvitationsGetResponses200ContentApplicationJsonSchema> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Get list of all invitations you created or sent to you.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @param organization Filter by organization.
     * @param status Filter by status.
     * @param role Filter by role.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of all invitations you created or sent to you.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PathsZt2JhiInvitationsGetResponses200ContentApplicationJsonSchema getAllInvitations(
            Integer offset, Integer limit, String organization, InvitationStatus status, OrganizationRole role) {
        return getAllInvitationsAsync(offset, limit, organization, status, role).block();
    }

    /**
     * Create a new invitation.
     *
     * @param body Invitation to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Invitation>> createInvitationWithResponseAsync(InvitationCreate body) {
        final String accept = "application/json";
        return service.createInvitation(this.getHost(), body, accept);
    }

    /**
     * Create a new invitation.
     *
     * @param body Invitation to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Invitation> createInvitationAsync(InvitationCreate body) {
        return createInvitationWithResponseAsync(body)
                .flatMap(
                        (Response<Invitation> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Create a new invitation.
     *
     * @param body Invitation to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Invitation createInvitation(InvitationCreate body) {
        return createInvitationAsync(body).block();
    }

    /**
     * Get detail of an invitation.
     *
     * @param identifier Invitation identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return detail of an invitation along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Invitation>> getInvitationWithResponseAsync(String identifier) {
        final String accept = "application/json";
        return service.getInvitation(this.getHost(), identifier, accept);
    }

    /**
     * Get detail of an invitation.
     *
     * @param identifier Invitation identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return detail of an invitation on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Invitation> getInvitationAsync(String identifier) {
        return getInvitationWithResponseAsync(identifier)
                .flatMap(
                        (Response<Invitation> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Get detail of an invitation.
     *
     * @param identifier Invitation identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return detail of an invitation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Invitation getInvitation(String identifier) {
        return getInvitationAsync(identifier).block();
    }

    /**
     * Update the detail of an invitation.
     *
     * @param identifier Invitation identifier.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Invitation>> updateInvitationWithResponseAsync(String identifier, InvitationUpdate body) {
        final String accept = "application/json";
        return service.updateInvitation(this.getHost(), identifier, body, accept);
    }

    /**
     * Update the detail of an invitation.
     *
     * @param identifier Invitation identifier.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Invitation> updateInvitationAsync(String identifier, InvitationUpdate body) {
        return updateInvitationWithResponseAsync(identifier, body)
                .flatMap(
                        (Response<Invitation> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Update the detail of an invitation.
     *
     * @param identifier Invitation identifier.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Invitation updateInvitation(String identifier, InvitationUpdate body) {
        return updateInvitationAsync(identifier, body).block();
    }

    /**
     * Delete the specified invitation from the database.
     *
     * @param identifier Invitation identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteInvitationWithResponseAsync(String identifier) {
        final String accept = "application/json";
        return service.deleteInvitation(this.getHost(), identifier, accept);
    }

    /**
     * Delete the specified invitation from the database.
     *
     * @param identifier Invitation identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteInvitationAsync(String identifier) {
        return deleteInvitationWithResponseAsync(identifier).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Delete the specified invitation from the database.
     *
     * @param identifier Invitation identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteInvitation(String identifier) {
        deleteInvitationAsync(identifier).block();
    }

    /**
     * Get detail of an invitation using a secret token. This allows users who have not registered/logged in to view the
     * invitation.
     *
     * @param token Invitation token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return detail of an invitation using a secret token along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Invitation>> getInvitationByTokenWithResponseAsync(String token) {
        final String accept = "application/json";
        return service.getInvitationByToken(this.getHost(), token, accept);
    }

    /**
     * Get detail of an invitation using a secret token. This allows users who have not registered/logged in to view the
     * invitation.
     *
     * @param token Invitation token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return detail of an invitation using a secret token on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Invitation> getInvitationByTokenAsync(String token) {
        return getInvitationByTokenWithResponseAsync(token)
                .flatMap(
                        (Response<Invitation> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Get detail of an invitation using a secret token. This allows users who have not registered/logged in to view the
     * invitation.
     *
     * @param token Invitation token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return detail of an invitation using a secret token.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Invitation getInvitationByToken(String token) {
        return getInvitationByTokenAsync(token).block();
    }

    /**
     * Choose to accept or decline an invitation.
     *
     * @param token Invitation token.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Invitation>> respondToInvitationWithResponseAsync(
            String token, PathsW51LnrInvitationsTokenPatchRequestbodyContentApplicationJsonSchema body) {
        final String accept = "application/json";
        return service.respondToInvitation(this.getHost(), token, body, accept);
    }

    /**
     * Choose to accept or decline an invitation.
     *
     * @param token Invitation token.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Invitation> respondToInvitationAsync(
            String token, PathsW51LnrInvitationsTokenPatchRequestbodyContentApplicationJsonSchema body) {
        return respondToInvitationWithResponseAsync(token, body)
                .flatMap(
                        (Response<Invitation> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Choose to accept or decline an invitation.
     *
     * @param token Invitation token.
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Invitation respondToInvitation(
            String token, PathsW51LnrInvitationsTokenPatchRequestbodyContentApplicationJsonSchema body) {
        return respondToInvitationAsync(token, body).block();
    }

    /**
     * Returns your custom extractors as well as Affinda's off-the-shelf extractors.
     *
     * @param organization Filter by organization.
     * @param includePublicExtractors Whether to include Affinda's off-the-shelf extractors.
     * @param name Filter by name.
     * @param validatable Filter by validatable.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Extractor along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<List<Extractor>>> getAllExtractorsWithResponseAsync(
            String organization, Boolean includePublicExtractors, String name, Boolean validatable) {
        final String accept = "application/json";
        return service.getAllExtractors(
                this.getHost(), organization, includePublicExtractors, name, validatable, accept);
    }

    /**
     * Returns your custom extractors as well as Affinda's off-the-shelf extractors.
     *
     * @param organization Filter by organization.
     * @param includePublicExtractors Whether to include Affinda's off-the-shelf extractors.
     * @param name Filter by name.
     * @param validatable Filter by validatable.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Extractor on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<List<Extractor>> getAllExtractorsAsync(
            String organization, Boolean includePublicExtractors, String name, Boolean validatable) {
        return getAllExtractorsWithResponseAsync(organization, includePublicExtractors, name, validatable)
                .flatMap(
                        (Response<List<Extractor>> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Returns your custom extractors as well as Affinda's off-the-shelf extractors.
     *
     * @param organization Filter by organization.
     * @param includePublicExtractors Whether to include Affinda's off-the-shelf extractors.
     * @param name Filter by name.
     * @param validatable Filter by validatable.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Extractor.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<Extractor> getAllExtractors(
            String organization, Boolean includePublicExtractors, String name, Boolean validatable) {
        return getAllExtractorsAsync(organization, includePublicExtractors, name, validatable).block();
    }

    /**
     * Create a custom extractor.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Extractor>> createExtractorWithResponseAsync(ExtractorCreate body) {
        final String accept = "application/json";
        return service.createExtractor(this.getHost(), body, accept);
    }

    /**
     * Create a custom extractor.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Extractor> createExtractorAsync(ExtractorCreate body) {
        return createExtractorWithResponseAsync(body)
                .flatMap(
                        (Response<Extractor> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Create a custom extractor.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Extractor createExtractor(ExtractorCreate body) {
        return createExtractorAsync(body).block();
    }

    /**
     * Return a specific extractor.
     *
     * @param id Extractor's ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Extractor>> getExtractorWithResponseAsync(int id) {
        final String accept = "application/json";
        return service.getExtractor(this.getHost(), id, accept);
    }

    /**
     * Return a specific extractor.
     *
     * @param id Extractor's ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Extractor> getExtractorAsync(int id) {
        return getExtractorWithResponseAsync(id)
                .flatMap(
                        (Response<Extractor> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Return a specific extractor.
     *
     * @param id Extractor's ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Extractor getExtractor(int id) {
        return getExtractorAsync(id).block();
    }

    /**
     * Update data of an extractor.
     *
     * @param id Extractor's ID.
     * @param body Extractor data to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Extractor>> updateExtractorDataWithResponseAsync(int id, ExtractorUpdate body) {
        final String accept = "application/json";
        return service.updateExtractorData(this.getHost(), id, body, accept);
    }

    /**
     * Update data of an extractor.
     *
     * @param id Extractor's ID.
     * @param body Extractor data to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Extractor> updateExtractorDataAsync(int id, ExtractorUpdate body) {
        return updateExtractorDataWithResponseAsync(id, body)
                .flatMap(
                        (Response<Extractor> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Update data of an extractor.
     *
     * @param id Extractor's ID.
     * @param body Extractor data to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Extractor updateExtractorData(int id, ExtractorUpdate body) {
        return updateExtractorDataAsync(id, body).block();
    }

    /**
     * Deletes the specified extractor from the database.
     *
     * @param id Extractor's ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteExtractorWithResponseAsync(int id) {
        final String accept = "application/json";
        return service.deleteExtractor(this.getHost(), id, accept);
    }

    /**
     * Deletes the specified extractor from the database.
     *
     * @param id Extractor's ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteExtractorAsync(int id) {
        return deleteExtractorWithResponseAsync(id).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the specified extractor from the database.
     *
     * @param id Extractor's ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteExtractor(int id) {
        deleteExtractorAsync(id).block();
    }

    /**
     * Returns your custom data points as well as Affinda's off-the-shelf data points.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @param organization Filter by organization.
     * @param extractor Filter by extractor.
     * @param slug Filter by slug.
     * @param description Filter by description.
     * @param annotationContentType Filter by annotation content type, e.g. text, integer, float, date, etc.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of DataPoint along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<List<DataPoint>>> getAllDataPointsWithResponseAsync(
            Integer offset,
            Integer limit,
            String organization,
            Integer extractor,
            String slug,
            String description,
            String annotationContentType) {
        final String accept = "application/json";
        return service.getAllDataPoints(
                this.getHost(),
                offset,
                limit,
                organization,
                extractor,
                slug,
                description,
                annotationContentType,
                accept);
    }

    /**
     * Returns your custom data points as well as Affinda's off-the-shelf data points.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @param organization Filter by organization.
     * @param extractor Filter by extractor.
     * @param slug Filter by slug.
     * @param description Filter by description.
     * @param annotationContentType Filter by annotation content type, e.g. text, integer, float, date, etc.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of DataPoint on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<List<DataPoint>> getAllDataPointsAsync(
            Integer offset,
            Integer limit,
            String organization,
            Integer extractor,
            String slug,
            String description,
            String annotationContentType) {
        return getAllDataPointsWithResponseAsync(
                        offset, limit, organization, extractor, slug, description, annotationContentType)
                .flatMap(
                        (Response<List<DataPoint>> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Returns your custom data points as well as Affinda's off-the-shelf data points.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @param organization Filter by organization.
     * @param extractor Filter by extractor.
     * @param slug Filter by slug.
     * @param description Filter by description.
     * @param annotationContentType Filter by annotation content type, e.g. text, integer, float, date, etc.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of DataPoint.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<DataPoint> getAllDataPoints(
            Integer offset,
            Integer limit,
            String organization,
            Integer extractor,
            String slug,
            String description,
            String annotationContentType) {
        return getAllDataPointsAsync(offset, limit, organization, extractor, slug, description, annotationContentType)
                .block();
    }

    /**
     * Create a custom data point.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DataPoint>> createDataPointWithResponseAsync(DataPointCreate body) {
        final String accept = "application/json";
        return service.createDataPoint(this.getHost(), body, accept);
    }

    /**
     * Create a custom data point.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DataPoint> createDataPointAsync(DataPointCreate body) {
        return createDataPointWithResponseAsync(body)
                .flatMap(
                        (Response<DataPoint> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Create a custom data point.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DataPoint createDataPoint(DataPointCreate body) {
        return createDataPointAsync(body).block();
    }

    /**
     * Return a specific data point.
     *
     * @param identifier Data point's identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DataPoint>> getDataPointWithResponseAsync(String identifier) {
        final String accept = "application/json";
        return service.getDataPoint(this.getHost(), identifier, accept);
    }

    /**
     * Return a specific data point.
     *
     * @param identifier Data point's identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DataPoint> getDataPointAsync(String identifier) {
        return getDataPointWithResponseAsync(identifier)
                .flatMap(
                        (Response<DataPoint> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Return a specific data point.
     *
     * @param identifier Data point's identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DataPoint getDataPoint(String identifier) {
        return getDataPointAsync(identifier).block();
    }

    /**
     * Update data of a data point.
     *
     * @param identifier DataPoint's identifier.
     * @param body Data point to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DataPoint>> updateDataPointDataWithResponseAsync(String identifier, DataPointUpdate body) {
        final String accept = "application/json";
        return service.updateDataPointData(this.getHost(), identifier, body, accept);
    }

    /**
     * Update data of a data point.
     *
     * @param identifier DataPoint's identifier.
     * @param body Data point to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DataPoint> updateDataPointDataAsync(String identifier, DataPointUpdate body) {
        return updateDataPointDataWithResponseAsync(identifier, body)
                .flatMap(
                        (Response<DataPoint> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Update data of a data point.
     *
     * @param identifier DataPoint's identifier.
     * @param body Data point to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DataPoint updateDataPointData(String identifier, DataPointUpdate body) {
        return updateDataPointDataAsync(identifier, body).block();
    }

    /**
     * Deletes the specified data point from the database.
     *
     * @param identifier DataPoint's identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteDataPointWithResponseAsync(String identifier) {
        final String accept = "application/json";
        return service.deleteDataPoint(this.getHost(), identifier, accept);
    }

    /**
     * Deletes the specified data point from the database.
     *
     * @param identifier DataPoint's identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteDataPointAsync(String identifier) {
        return deleteDataPointWithResponseAsync(identifier).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the specified data point from the database.
     *
     * @param identifier DataPoint's identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteDataPoint(String identifier) {
        deleteDataPointAsync(identifier).block();
    }

    /**
     * Returns your workspaces.
     *
     * @param organization Filter by organization.
     * @param name Filter by name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Workspace along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<List<Workspace>>> getAllWorkspacesWithResponseAsync(String organization, String name) {
        final String accept = "application/json";
        return service.getAllWorkspaces(this.getHost(), organization, name, accept);
    }

    /**
     * Returns your workspaces.
     *
     * @param organization Filter by organization.
     * @param name Filter by name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Workspace on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<List<Workspace>> getAllWorkspacesAsync(String organization, String name) {
        return getAllWorkspacesWithResponseAsync(organization, name)
                .flatMap(
                        (Response<List<Workspace>> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Returns your workspaces.
     *
     * @param organization Filter by organization.
     * @param name Filter by name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Workspace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<Workspace> getAllWorkspaces(String organization, String name) {
        return getAllWorkspacesAsync(organization, name).block();
    }

    /**
     * Create a workspace.
     *
     * @param body Workspace to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Workspace>> createWorkspaceWithResponseAsync(WorkspaceCreate body) {
        final String accept = "application/json";
        return service.createWorkspace(this.getHost(), body, accept);
    }

    /**
     * Create a workspace.
     *
     * @param body Workspace to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Workspace> createWorkspaceAsync(WorkspaceCreate body) {
        return createWorkspaceWithResponseAsync(body)
                .flatMap(
                        (Response<Workspace> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Create a workspace.
     *
     * @param body Workspace to create.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Workspace createWorkspace(WorkspaceCreate body) {
        return createWorkspaceAsync(body).block();
    }

    /**
     * Return a specific workspace.
     *
     * @param identifier Workspace's identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Workspace>> getWorkspaceWithResponseAsync(String identifier) {
        final String accept = "application/json";
        return service.getWorkspace(this.getHost(), identifier, accept);
    }

    /**
     * Return a specific workspace.
     *
     * @param identifier Workspace's identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Workspace> getWorkspaceAsync(String identifier) {
        return getWorkspaceWithResponseAsync(identifier)
                .flatMap(
                        (Response<Workspace> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Return a specific workspace.
     *
     * @param identifier Workspace's identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Workspace getWorkspace(String identifier) {
        return getWorkspaceAsync(identifier).block();
    }

    /**
     * Update a workspace.
     *
     * @param identifier Workspace's identifier.
     * @param body Workspace data to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Workspace>> updateWorkspaceWithResponseAsync(String identifier, WorkspaceUpdate body) {
        final String accept = "application/json";
        return service.updateWorkspace(this.getHost(), identifier, body, accept);
    }

    /**
     * Update a workspace.
     *
     * @param identifier Workspace's identifier.
     * @param body Workspace data to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Workspace> updateWorkspaceAsync(String identifier, WorkspaceUpdate body) {
        return updateWorkspaceWithResponseAsync(identifier, body)
                .flatMap(
                        (Response<Workspace> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Update a workspace.
     *
     * @param identifier Workspace's identifier.
     * @param body Workspace data to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Workspace updateWorkspace(String identifier, WorkspaceUpdate body) {
        return updateWorkspaceAsync(identifier, body).block();
    }

    /**
     * Deletes the specified workspace from the database.
     *
     * @param identifier Workspace's identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWorkspaceWithResponseAsync(String identifier) {
        final String accept = "application/json";
        return service.deleteWorkspace(this.getHost(), identifier, accept);
    }

    /**
     * Deletes the specified workspace from the database.
     *
     * @param identifier Workspace's identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteWorkspaceAsync(String identifier) {
        return deleteWorkspaceWithResponseAsync(identifier).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the specified workspace from the database.
     *
     * @param identifier Workspace's identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteWorkspace(String identifier) {
        deleteWorkspaceAsync(identifier).block();
    }

    /**
     * Returns the memberships of your workspaces.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @param workspace Filter by workspace.
     * @param user Partial text match on user's email, case-insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PathsAdr1YhWorkspaceMembershipsGetResponses200ContentApplicationJsonSchema>>
            getAllWorkspaceMembershipsWithResponseAsync(Integer offset, Integer limit, String workspace, String user) {
        final String accept = "application/json";
        return service.getAllWorkspaceMemberships(this.getHost(), offset, limit, workspace, user, accept);
    }

    /**
     * Returns the memberships of your workspaces.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @param workspace Filter by workspace.
     * @param user Partial text match on user's email, case-insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PathsAdr1YhWorkspaceMembershipsGetResponses200ContentApplicationJsonSchema>
            getAllWorkspaceMembershipsAsync(Integer offset, Integer limit, String workspace, String user) {
        return getAllWorkspaceMembershipsWithResponseAsync(offset, limit, workspace, user)
                .flatMap(
                        (Response<PathsAdr1YhWorkspaceMembershipsGetResponses200ContentApplicationJsonSchema> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Returns the memberships of your workspaces.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @param workspace Filter by workspace.
     * @param user Partial text match on user's email, case-insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PathsAdr1YhWorkspaceMembershipsGetResponses200ContentApplicationJsonSchema getAllWorkspaceMemberships(
            Integer offset, Integer limit, String workspace, String user) {
        return getAllWorkspaceMembershipsAsync(offset, limit, workspace, user).block();
    }

    /**
     * Create a workspace membership.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<WorkspaceMembership>> createWorkspaceMembershipWithResponseAsync(
            WorkspaceMembershipCreate body) {
        final String accept = "application/json";
        return service.createWorkspaceMembership(this.getHost(), body, accept);
    }

    /**
     * Create a workspace membership.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<WorkspaceMembership> createWorkspaceMembershipAsync(WorkspaceMembershipCreate body) {
        return createWorkspaceMembershipWithResponseAsync(body)
                .flatMap(
                        (Response<WorkspaceMembership> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Create a workspace membership.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public WorkspaceMembership createWorkspaceMembership(WorkspaceMembershipCreate body) {
        return createWorkspaceMembershipAsync(body).block();
    }

    /**
     * Return a specific workspace membership.
     *
     * @param identifier Workspace membership's identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<WorkspaceMembership>> getWorkspaceMembershipWithResponseAsync(String identifier) {
        final String accept = "application/json";
        return service.getWorkspaceMembership(this.getHost(), identifier, accept);
    }

    /**
     * Return a specific workspace membership.
     *
     * @param identifier Workspace membership's identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<WorkspaceMembership> getWorkspaceMembershipAsync(String identifier) {
        return getWorkspaceMembershipWithResponseAsync(identifier)
                .flatMap(
                        (Response<WorkspaceMembership> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Return a specific workspace membership.
     *
     * @param identifier Workspace membership's identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public WorkspaceMembership getWorkspaceMembership(String identifier) {
        return getWorkspaceMembershipAsync(identifier).block();
    }

    /**
     * Remove an user from a workspace.
     *
     * @param identifier Workspace membership's identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWorkspaceMembershipWithResponseAsync(String identifier) {
        final String accept = "application/json";
        return service.deleteWorkspaceMembership(this.getHost(), identifier, accept);
    }

    /**
     * Remove an user from a workspace.
     *
     * @param identifier Workspace membership's identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteWorkspaceMembershipAsync(String identifier) {
        return deleteWorkspaceMembershipWithResponseAsync(identifier).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Remove an user from a workspace.
     *
     * @param identifier Workspace membership's identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteWorkspaceMembership(String identifier) {
        deleteWorkspaceMembershipAsync(identifier).block();
    }

    /**
     * Returns your collections.
     *
     * @param workspace Filter by workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of DocumentCollection along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<List<DocumentCollection>>> getAllCollectionsWithResponseAsync(String workspace) {
        final String accept = "application/json";
        return service.getAllCollections(this.getHost(), workspace, accept);
    }

    /**
     * Returns your collections.
     *
     * @param workspace Filter by workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of DocumentCollection on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<List<DocumentCollection>> getAllCollectionsAsync(String workspace) {
        return getAllCollectionsWithResponseAsync(workspace)
                .flatMap(
                        (Response<List<DocumentCollection>> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Returns your collections.
     *
     * @param workspace Filter by workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of DocumentCollection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<DocumentCollection> getAllCollections(String workspace) {
        return getAllCollectionsAsync(workspace).block();
    }

    /**
     * Create a collection.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DocumentCollection>> createCollectionWithResponseAsync(DocumentCollectionCreate body) {
        final String accept = "application/json";
        return service.createCollection(this.getHost(), body, accept);
    }

    /**
     * Create a collection.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DocumentCollection> createCollectionAsync(DocumentCollectionCreate body) {
        return createCollectionWithResponseAsync(body)
                .flatMap(
                        (Response<DocumentCollection> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Create a collection.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DocumentCollection createCollection(DocumentCollectionCreate body) {
        return createCollectionAsync(body).block();
    }

    /**
     * Return a specific collection.
     *
     * @param identifier Collection's identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DocumentCollection>> getCollectionWithResponseAsync(String identifier) {
        final String accept = "application/json";
        return service.getCollection(this.getHost(), identifier, accept);
    }

    /**
     * Return a specific collection.
     *
     * @param identifier Collection's identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DocumentCollection> getCollectionAsync(String identifier) {
        return getCollectionWithResponseAsync(identifier)
                .flatMap(
                        (Response<DocumentCollection> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Return a specific collection.
     *
     * @param identifier Collection's identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DocumentCollection getCollection(String identifier) {
        return getCollectionAsync(identifier).block();
    }

    /**
     * Update data of a collection.
     *
     * @param identifier Collection's identifier.
     * @param body Collection data to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DocumentCollection>> updateCollectionDataWithResponseAsync(
            String identifier, DocumentCollectionUpdate body) {
        final String accept = "application/json";
        return service.updateCollectionData(this.getHost(), identifier, body, accept);
    }

    /**
     * Update data of a collection.
     *
     * @param identifier Collection's identifier.
     * @param body Collection data to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DocumentCollection> updateCollectionDataAsync(String identifier, DocumentCollectionUpdate body) {
        return updateCollectionDataWithResponseAsync(identifier, body)
                .flatMap(
                        (Response<DocumentCollection> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Update data of a collection.
     *
     * @param identifier Collection's identifier.
     * @param body Collection data to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DocumentCollection updateCollectionData(String identifier, DocumentCollectionUpdate body) {
        return updateCollectionDataAsync(identifier, body).block();
    }

    /**
     * Deletes the specified collection from the database.
     *
     * @param identifier Collection's identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteCollectionWithResponseAsync(String identifier) {
        final String accept = "application/json";
        return service.deleteCollection(this.getHost(), identifier, accept);
    }

    /**
     * Deletes the specified collection from the database.
     *
     * @param identifier Collection's identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteCollectionAsync(String identifier) {
        return deleteCollectionWithResponseAsync(identifier).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the specified collection from the database.
     *
     * @param identifier Collection's identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteCollection(String identifier) {
        deleteCollectionAsync(identifier).block();
    }

    /**
     * Returns all the document summaries for that user, limited to 300 per page.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @param workspace Filter by workspace.
     * @param collection Filter by collection.
     * @param state Filter by the document's state.
     * @param tags Filter by tags.
     * @param createdDt Filter by created datetime.
     * @param search Partial, case-insensitive match with file name or tag name.
     * @param ordering Sort the result set. A "-" at the beginning denotes DESC sort, e.g. -created_dt. Sort by multiple
     *     fields is supported.
     * @param includeData By default, this endpoint returns only the meta data of the documents. Set this to `true` will
     *     return the detailed data that was parsed, at a performance cost.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<GetAllDocumentsResults>> getAllDocumentsWithResponseAsync(
            Integer offset,
            Integer limit,
            String workspace,
            String collection,
            DocumentState state,
            List<Integer> tags,
            DateRange createdDt,
            String search,
            List<Get8ItemsItem> ordering,
            Boolean includeData) {
        final String accept = "application/json";
        String tagsConverted =
                JacksonAdapter.createDefaultSerializerAdapter().serializeList(tags, CollectionFormat.CSV);
        String orderingConverted =
                JacksonAdapter.createDefaultSerializerAdapter().serializeList(ordering, CollectionFormat.CSV);
        return service.getAllDocuments(
                this.getHost(),
                offset,
                limit,
                workspace,
                collection,
                state,
                tagsConverted,
                createdDt,
                search,
                orderingConverted,
                includeData,
                accept);
    }

    /**
     * Returns all the document summaries for that user, limited to 300 per page.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @param workspace Filter by workspace.
     * @param collection Filter by collection.
     * @param state Filter by the document's state.
     * @param tags Filter by tags.
     * @param createdDt Filter by created datetime.
     * @param search Partial, case-insensitive match with file name or tag name.
     * @param ordering Sort the result set. A "-" at the beginning denotes DESC sort, e.g. -created_dt. Sort by multiple
     *     fields is supported.
     * @param includeData By default, this endpoint returns only the meta data of the documents. Set this to `true` will
     *     return the detailed data that was parsed, at a performance cost.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<GetAllDocumentsResults> getAllDocumentsAsync(
            Integer offset,
            Integer limit,
            String workspace,
            String collection,
            DocumentState state,
            List<Integer> tags,
            DateRange createdDt,
            String search,
            List<Get8ItemsItem> ordering,
            Boolean includeData) {
        return getAllDocumentsWithResponseAsync(
                        offset, limit, workspace, collection, state, tags, createdDt, search, ordering, includeData)
                .flatMap(
                        (Response<GetAllDocumentsResults> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Returns all the document summaries for that user, limited to 300 per page.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @param workspace Filter by workspace.
     * @param collection Filter by collection.
     * @param state Filter by the document's state.
     * @param tags Filter by tags.
     * @param createdDt Filter by created datetime.
     * @param search Partial, case-insensitive match with file name or tag name.
     * @param ordering Sort the result set. A "-" at the beginning denotes DESC sort, e.g. -created_dt. Sort by multiple
     *     fields is supported.
     * @param includeData By default, this endpoint returns only the meta data of the documents. Set this to `true` will
     *     return the detailed data that was parsed, at a performance cost.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public GetAllDocumentsResults getAllDocuments(
            Integer offset,
            Integer limit,
            String workspace,
            String collection,
            DocumentState state,
            List<Integer> tags,
            DateRange createdDt,
            String search,
            List<Get8ItemsItem> ordering,
            Boolean includeData) {
        return getAllDocumentsAsync(
                        offset, limit, workspace, collection, state, tags, createdDt, search, ordering, includeData)
                .block();
    }

    /**
     * Uploads a document for parsing. When successful, returns an `identifier` in the response for subsequent use with
     * the [/documents/{identifier}](#get-/documents/-identifier-) endpoint to check processing status and retrieve
     * results.&lt;br/&gt;.
     *
     * @param body Document to upload, either via file upload or URL to a file.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Document>> createDocumentWithResponseAsync(DocumentCreate body) {
        final String accept = "application/json";
        return service.createDocument(this.getHost(), body, accept);
    }

    /**
     * Uploads a document for parsing. When successful, returns an `identifier` in the response for subsequent use with
     * the [/documents/{identifier}](#get-/documents/-identifier-) endpoint to check processing status and retrieve
     * results.&lt;br/&gt;.
     *
     * @param body Document to upload, either via file upload or URL to a file.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Document> createDocumentAsync(DocumentCreate body) {
        return createDocumentWithResponseAsync(body)
                .flatMap(
                        (Response<Document> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Uploads a document for parsing. When successful, returns an `identifier` in the response for subsequent use with
     * the [/documents/{identifier}](#get-/documents/-identifier-) endpoint to check processing status and retrieve
     * results.&lt;br/&gt;.
     *
     * @param body Document to upload, either via file upload or URL to a file.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Document createDocument(DocumentCreate body) {
        return createDocumentAsync(body).block();
    }

    /**
     * Return a specific document.
     *
     * @param identifier Document's identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Document>> getDocumentWithResponseAsync(String identifier) {
        final String accept = "application/json";
        return service.getDocument(this.getHost(), identifier, accept);
    }

    /**
     * Return a specific document.
     *
     * @param identifier Document's identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Document> getDocumentAsync(String identifier) {
        return getDocumentWithResponseAsync(identifier)
                .flatMap(
                        (Response<Document> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Return a specific document.
     *
     * @param identifier Document's identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Document getDocument(String identifier) {
        return getDocumentAsync(identifier).block();
    }

    /**
     * Update file name, expiry time, or move to another collection, etc.
     *
     * @param identifier Document's identifier.
     * @param body Document data to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Document>> updateDocumentDataWithResponseAsync(String identifier, DocumentUpdate body) {
        final String accept = "application/json";
        return service.updateDocumentData(this.getHost(), identifier, body, accept);
    }

    /**
     * Update file name, expiry time, or move to another collection, etc.
     *
     * @param identifier Document's identifier.
     * @param body Document data to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Document> updateDocumentDataAsync(String identifier, DocumentUpdate body) {
        return updateDocumentDataWithResponseAsync(identifier, body)
                .flatMap(
                        (Response<Document> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Update file name, expiry time, or move to another collection, etc.
     *
     * @param identifier Document's identifier.
     * @param body Document data to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Document updateDocumentData(String identifier, DocumentUpdate body) {
        return updateDocumentDataAsync(identifier, body).block();
    }

    /**
     * Deletes the specified document from the database.
     *
     * @param identifier Document's identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteDocumentWithResponseAsync(String identifier) {
        final String accept = "application/json";
        return service.deleteDocument(this.getHost(), identifier, accept);
    }

    /**
     * Deletes the specified document from the database.
     *
     * @param identifier Document's identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteDocumentAsync(String identifier) {
        return deleteDocumentWithResponseAsync(identifier).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the specified document from the database.
     *
     * @param identifier Document's identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteDocument(String identifier) {
        deleteDocumentAsync(identifier).block();
    }

    /**
     * Returns your tags.
     *
     * @param limit The numbers of results to return.
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param workspace Filter by workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Tag along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<List<Tag>>> getAllTagsWithResponseAsync(Integer limit, Integer offset, String workspace) {
        final String accept = "application/json";
        return service.getAllTags(this.getHost(), limit, offset, workspace, accept);
    }

    /**
     * Returns your tags.
     *
     * @param limit The numbers of results to return.
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param workspace Filter by workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Tag on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<List<Tag>> getAllTagsAsync(Integer limit, Integer offset, String workspace) {
        return getAllTagsWithResponseAsync(limit, offset, workspace)
                .flatMap(
                        (Response<List<Tag>> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Returns your tags.
     *
     * @param limit The numbers of results to return.
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param workspace Filter by workspace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Tag.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<Tag> getAllTags(Integer limit, Integer offset, String workspace) {
        return getAllTagsAsync(limit, offset, workspace).block();
    }

    /**
     * Create a tag.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Tag>> createTagWithResponseAsync(TagCreate body) {
        final String accept = "application/json";
        return service.createTag(this.getHost(), body, accept);
    }

    /**
     * Create a tag.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Tag> createTagAsync(TagCreate body) {
        return createTagWithResponseAsync(body)
                .flatMap(
                        (Response<Tag> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Create a tag.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Tag createTag(TagCreate body) {
        return createTagAsync(body).block();
    }

    /**
     * Return a specific tag.
     *
     * @param id Tag's ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Tag>> getTagWithResponseAsync(int id) {
        final String accept = "application/json";
        return service.getTag(this.getHost(), id, accept);
    }

    /**
     * Return a specific tag.
     *
     * @param id Tag's ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Tag> getTagAsync(int id) {
        return getTagWithResponseAsync(id)
                .flatMap(
                        (Response<Tag> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Return a specific tag.
     *
     * @param id Tag's ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Tag getTag(int id) {
        return getTagAsync(id).block();
    }

    /**
     * Update data of an tag.
     *
     * @param id Tag's ID.
     * @param body Tag data to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Tag>> updateTagDataWithResponseAsync(int id, TagUpdate body) {
        final String accept = "application/json";
        return service.updateTagData(this.getHost(), id, body, accept);
    }

    /**
     * Update data of an tag.
     *
     * @param id Tag's ID.
     * @param body Tag data to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Tag> updateTagDataAsync(int id, TagUpdate body) {
        return updateTagDataWithResponseAsync(id, body)
                .flatMap(
                        (Response<Tag> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Update data of an tag.
     *
     * @param id Tag's ID.
     * @param body Tag data to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Tag updateTagData(int id, TagUpdate body) {
        return updateTagDataAsync(id, body).block();
    }

    /**
     * Deletes the specified tag from the database.
     *
     * @param id Tag's ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteTagWithResponseAsync(int id) {
        final String accept = "application/json";
        return service.deleteTag(this.getHost(), id, accept);
    }

    /**
     * Deletes the specified tag from the database.
     *
     * @param id Tag's ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteTagAsync(int id) {
        return deleteTagWithResponseAsync(id).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the specified tag from the database.
     *
     * @param id Tag's ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteTag(int id) {
        deleteTagAsync(id).block();
    }
}
