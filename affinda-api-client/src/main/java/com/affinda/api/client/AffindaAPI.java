package com.affinda.api.client;

import com.affinda.api.client.models.Annotation;
import com.affinda.api.client.models.AnnotationBatchUpdate;
import com.affinda.api.client.models.AnnotationCreate;
import com.affinda.api.client.models.AnnotationUpdate;
import com.affinda.api.client.models.ApiUserCreate;
import com.affinda.api.client.models.ApiUserUpdate;
import com.affinda.api.client.models.ApiUserWithKey;
import com.affinda.api.client.models.ApiUserWithoutKey;
import com.affinda.api.client.models.BatchAddTagRequest;
import com.affinda.api.client.models.BatchRemoveTagRequest;
import com.affinda.api.client.models.CollectionField;
import com.affinda.api.client.models.DataField;
import com.affinda.api.client.models.DataFieldCreate;
import com.affinda.api.client.models.DataPoint;
import com.affinda.api.client.models.DataPointChoice;
import com.affinda.api.client.models.DataPointChoiceCreate;
import com.affinda.api.client.models.DataPointChoiceReplaceRequest;
import com.affinda.api.client.models.DataPointChoiceReplaceResponse;
import com.affinda.api.client.models.DataPointChoiceUpdate;
import com.affinda.api.client.models.DataPointCreate;
import com.affinda.api.client.models.DataPointUpdate;
import com.affinda.api.client.models.DateRange;
import com.affinda.api.client.models.Document;
import com.affinda.api.client.models.DocumentCollection;
import com.affinda.api.client.models.DocumentCollectionCreate;
import com.affinda.api.client.models.DocumentCollectionUpdate;
import com.affinda.api.client.models.DocumentCreate;
import com.affinda.api.client.models.DocumentEditRequest;
import com.affinda.api.client.models.DocumentFormat;
import com.affinda.api.client.models.DocumentState;
import com.affinda.api.client.models.DocumentUpdate;
import com.affinda.api.client.models.Enum19;
import com.affinda.api.client.models.Extractor;
import com.affinda.api.client.models.ExtractorCreate;
import com.affinda.api.client.models.ExtractorUpdate;
import com.affinda.api.client.models.IndexRequestBody;
import com.affinda.api.client.models.Invitation;
import com.affinda.api.client.models.InvitationCreate;
import com.affinda.api.client.models.InvitationResponse;
import com.affinda.api.client.models.InvitationStatus;
import com.affinda.api.client.models.InvitationUpdate;
import com.affinda.api.client.models.JobDescriptionSearch;
import com.affinda.api.client.models.JobDescriptionSearchConfig;
import com.affinda.api.client.models.JobDescriptionSearchDetail;
import com.affinda.api.client.models.JobDescriptionSearchEmbed;
import com.affinda.api.client.models.JobDescriptionSearchParameters;
import com.affinda.api.client.models.Meta;
import com.affinda.api.client.models.OccupationGroup;
import com.affinda.api.client.models.Organization;
import com.affinda.api.client.models.OrganizationCreate;
import com.affinda.api.client.models.OrganizationMembership;
import com.affinda.api.client.models.OrganizationMembershipUpdate;
import com.affinda.api.client.models.OrganizationRole;
import com.affinda.api.client.models.Paths18Wh2VcV3InvitationsGetResponses200ContentApplicationJsonSchema;
import com.affinda.api.client.models.Paths1Czpnk1V3ResumeSearchEmbedPostRequestbodyContentApplicationJsonSchema;
import com.affinda.api.client.models.Paths1D5Zg6MV3AnnotationsGetResponses200ContentApplicationJsonSchema;
import com.affinda.api.client.models.Paths1TvfqeiV3IndexPostResponses201ContentApplicationJsonSchema;
import com.affinda.api.client.models.Paths26Civ0V3ApiUsersGetResponses200ContentApplicationJsonSchema;
import com.affinda.api.client.models.PathsCl024WV3IndexNameDocumentsPostRequestbodyContentApplicationJsonSchema;
import com.affinda.api.client.models.PathsDvrcp3V3IndexGetResponses200ContentApplicationJsonSchema;
import com.affinda.api.client.models.PathsFte27NV3IndexNameDocumentsPostResponses201ContentApplicationJsonSchema;
import com.affinda.api.client.models.PathsM3DzbgV3JobDescriptionSearchEmbedPostRequestbodyContentApplicationJsonSchema;
import com.affinda.api.client.models.PathsMnwxgV3DataPointChoicesGetResponses200ContentApplicationJsonSchema;
import com.affinda.api.client.models.PathsO7SnenV3IndexNameDocumentsGetResponses200ContentApplicationJsonSchema;
import com.affinda.api.client.models.PathsOxm5M7V3DocumentsGetResponses200ContentApplicationJsonSchema;
import com.affinda.api.client.models.PathsQ5Os5RV3OrganizationMembershipsGetResponses200ContentApplicationJsonSchema;
import com.affinda.api.client.models.PathsVz5Kj2V3ResthookSubscriptionsGetResponses200ContentApplicationJsonSchema;
import com.affinda.api.client.models.PathsZ1JuagV3WorkspaceMembershipsGetResponses200ContentApplicationJsonSchema;
import com.affinda.api.client.models.Region;
import com.affinda.api.client.models.RequestErrorException;
import com.affinda.api.client.models.ResthookSubscription;
import com.affinda.api.client.models.ResthookSubscriptionCreate;
import com.affinda.api.client.models.ResthookSubscriptionUpdate;
import com.affinda.api.client.models.ResumeSearch;
import com.affinda.api.client.models.ResumeSearchConfig;
import com.affinda.api.client.models.ResumeSearchDetail;
import com.affinda.api.client.models.ResumeSearchEmbed;
import com.affinda.api.client.models.ResumeSearchMatch;
import com.affinda.api.client.models.ResumeSearchParameters;
import com.affinda.api.client.models.Tag;
import com.affinda.api.client.models.TagCreate;
import com.affinda.api.client.models.TagUpdate;
import com.affinda.api.client.models.UsageByCollection;
import com.affinda.api.client.models.UsageByWorkspace;
import com.affinda.api.client.models.ValidationToolConfig;
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
        @Get("/v3/workspaces")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<List<Workspace>>> getAllWorkspaces(
                @HostParam("region") Region region,
                @QueryParam("organization") String organization,
                @QueryParam("name") String name,
                @HeaderParam("Accept") String accept);

        @Post("/v3/workspaces")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Workspace>> createWorkspace(
                @HostParam("region") Region region,
                @BodyParam("application/json") WorkspaceCreate body,
                @HeaderParam("Accept") String accept);

        @Get("/v3/workspaces/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Workspace>> getWorkspace(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Patch("/v3/workspaces/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Workspace>> updateWorkspace(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @BodyParam("application/json") WorkspaceUpdate body,
                @HeaderParam("Accept") String accept);

        @Delete("/v3/workspaces/{identifier}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Void>> deleteWorkspace(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Get("/v3/workspaces/{identifier}/usage")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<List<UsageByWorkspace>>> getUsageByWorkspace(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @QueryParam("start") String start,
                @QueryParam("end") String end,
                @HeaderParam("Accept") String accept);

        @Get("/v3/workspace_memberships")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<PathsZ1JuagV3WorkspaceMembershipsGetResponses200ContentApplicationJsonSchema>>
                getAllWorkspaceMemberships(
                        @HostParam("region") Region region,
                        @QueryParam("offset") Integer offset,
                        @QueryParam("limit") Integer limit,
                        @QueryParam("workspace") String workspace,
                        @QueryParam("user") String user,
                        @HeaderParam("Accept") String accept);

        @Post("/v3/workspace_memberships")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<WorkspaceMembership>> createWorkspaceMembership(
                @HostParam("region") Region region,
                @BodyParam("application/json") WorkspaceMembershipCreate body,
                @HeaderParam("Accept") String accept);

        @Get("/v3/workspace_memberships/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<WorkspaceMembership>> getWorkspaceMembership(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Delete("/v3/workspace_memberships/{identifier}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Void>> deleteWorkspaceMembership(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Get("/v3/collections")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<List<DocumentCollection>>> getAllCollections(
                @HostParam("region") Region region,
                @QueryParam("workspace") String workspace,
                @HeaderParam("Accept") String accept);

        @Post("/v3/collections")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<DocumentCollection>> createCollection(
                @HostParam("region") Region region,
                @BodyParam("application/json") DocumentCollectionCreate body,
                @HeaderParam("Accept") String accept);

        @Get("/v3/collections/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<DocumentCollection>> getCollection(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Patch("/v3/collections/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<DocumentCollection>> updateCollection(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @BodyParam("application/json") DocumentCollectionUpdate body,
                @HeaderParam("Accept") String accept);

        @Delete("/v3/collections/{identifier}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Void>> deleteCollection(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Post("/v3/collections/{identifier}/create_data_field")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<DataField>> createDataFieldForCollection(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @BodyParam("application/json") DataFieldCreate body,
                @HeaderParam("Accept") String accept);

        @Get("/v3/collections/{identifier}/fields/{datapoint_identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<CollectionField>> getDataFieldForCollection(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @PathParam("datapoint_identifier") String datapointIdentifier,
                @HeaderParam("Accept") String accept);

        @Patch("/v3/collections/{identifier}/fields/{datapoint_identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<CollectionField>> updateDataFieldForCollection(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @PathParam("datapoint_identifier") String datapointIdentifier,
                @BodyParam("application/json") CollectionField body,
                @HeaderParam("Accept") String accept);

        @Get("/v3/collections/{identifier}/usage")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<List<UsageByCollection>>> getUsageByCollection(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @QueryParam("start") String start,
                @QueryParam("end") String end,
                @HeaderParam("Accept") String accept);

        @Get("/v3/documents")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<PathsOxm5M7V3DocumentsGetResponses200ContentApplicationJsonSchema>> getAllDocuments(
                @HostParam("region") Region region,
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
                @QueryParam("exclude") String exclude,
                @QueryParam("in_review") Boolean inReview,
                @QueryParam("failed") Boolean failed,
                @QueryParam("ready") Boolean ready,
                @QueryParam("validatable") Boolean validatable,
                @QueryParam("has_challenges") Boolean hasChallenges,
                @QueryParam("custom_identifier") String customIdentifier,
                @HeaderParam("Accept") String accept);

        @Post("/v3/documents")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Document>> createDocument(
                @HostParam("region") Region region,
                @BodyParam("application/json") DocumentCreate body,
                @HeaderParam("Accept") String accept);

        @Get("/v3/documents/{identifier}")
        @ExpectedResponses({200, 200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Document>> getDocument(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @QueryParam("format") DocumentFormat format,
                @HeaderParam("Accept") String accept);

        @Patch("/v3/documents/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Document>> updateDocument(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @BodyParam("application/json") DocumentUpdate body,
                @HeaderParam("Accept") String accept);

        @Delete("/v3/documents/{identifier}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Void>> deleteDocument(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Post("/v3/documents/{identifier}/update_data")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Document>> updateDocumentData(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @BodyParam("application/json") Object body,
                @HeaderParam("Accept") String accept);

        @Post("/v3/documents/batch_add_tag")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Void>> batchAddTag(
                @HostParam("region") Region region,
                @BodyParam("application/json") BatchAddTagRequest body,
                @HeaderParam("Accept") String accept);

        @Post("/v3/documents/batch_remove_tag")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Void>> batchRemoveTag(
                @HostParam("region") Region region,
                @BodyParam("application/json") BatchRemoveTagRequest body,
                @HeaderParam("Accept") String accept);

        @Post("/v3/validate/{identifier}/split")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<List<Meta>>> editDocumentPages(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @BodyParam("application/json") DocumentEditRequest body,
                @HeaderParam("Accept") String accept);

        @Get("/v3/extractors")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<List<Extractor>>> getAllExtractors(
                @HostParam("region") Region region,
                @QueryParam("organization") String organization,
                @QueryParam("include_public_extractors") Boolean includePublicExtractors,
                @QueryParam("name") String name,
                @QueryParam("validatable") Boolean validatable,
                @HeaderParam("Accept") String accept);

        @Post("/v3/extractors")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Extractor>> createExtractor(
                @HostParam("region") Region region,
                @BodyParam("application/json") ExtractorCreate body,
                @HeaderParam("Accept") String accept);

        @Get("/v3/extractors/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Extractor>> getExtractor(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Patch("/v3/extractors/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Extractor>> updateExtractor(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @BodyParam("application/json") ExtractorUpdate body,
                @HeaderParam("Accept") String accept);

        @Delete("/v3/extractors/{identifier}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Void>> deleteExtractor(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Get("/v3/data_points")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<List<DataPoint>>> getAllDataPoints(
                @HostParam("region") Region region,
                @QueryParam("offset") Integer offset,
                @QueryParam("limit") Integer limit,
                @QueryParam("organization") String organization,
                @QueryParam("include_public") Boolean includePublic,
                @QueryParam("extractor") String extractor,
                @QueryParam("slug") String slug,
                @QueryParam("description") String description,
                @QueryParam("annotation_content_type") String annotationContentType,
                @QueryParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Post("/v3/data_points")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<DataPoint>> createDataPoint(
                @HostParam("region") Region region,
                @BodyParam("application/json") DataPointCreate body,
                @HeaderParam("Accept") String accept);

        @Get("/v3/data_points/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<DataPoint>> getDataPoint(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Patch("/v3/data_points/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<DataPoint>> updateDataPoint(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @BodyParam("application/json") DataPointUpdate body,
                @HeaderParam("Accept") String accept);

        @Delete("/v3/data_points/{identifier}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Void>> deleteDataPoint(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Get("/v3/data_point_choices")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<PathsMnwxgV3DataPointChoicesGetResponses200ContentApplicationJsonSchema>> getDataPointChoices(
                @HostParam("region") Region region,
                @QueryParam("offset") Integer offset,
                @QueryParam("limit") Integer limit,
                @QueryParam("data_point") String dataPoint,
                @QueryParam("collection") String collection,
                @QueryParam("search") String search,
                @HeaderParam("Accept") String accept);

        @Post("/v3/data_point_choices")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<DataPointChoice>> createDataPointChoice(
                @HostParam("region") Region region,
                @BodyParam("application/json") DataPointChoiceCreate body,
                @HeaderParam("Accept") String accept);

        @Get("/v3/data_point_choices/{id}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<DataPointChoice>> getDataPointChoice(
                @HostParam("region") Region region, @PathParam("id") int id, @HeaderParam("Accept") String accept);

        @Patch("/v3/data_point_choices/{id}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<DataPointChoice>> updateDataPointChoice(
                @HostParam("region") Region region,
                @PathParam("id") int id,
                @BodyParam("application/json") DataPointChoiceUpdate body,
                @HeaderParam("Accept") String accept);

        @Delete("/v3/data_point_choices/{id}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Void>> deleteDataPointChoice(
                @HostParam("region") Region region, @PathParam("id") int id, @HeaderParam("Accept") String accept);

        @Post("/v3/data_point_choices/replace")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<DataPointChoiceReplaceResponse>> replaceDataPointChoices(
                @HostParam("region") Region region,
                @BodyParam("application/json") DataPointChoiceReplaceRequest body,
                @HeaderParam("Accept") String accept);

        @Get("/v3/annotations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Paths1D5Zg6MV3AnnotationsGetResponses200ContentApplicationJsonSchema>> getAllAnnotations(
                @HostParam("region") Region region,
                @QueryParam("document") String document,
                @HeaderParam("Accept") String accept);

        @Post("/v3/annotations")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Annotation>> createAnnotation(
                @HostParam("region") Region region,
                @BodyParam("application/json") AnnotationCreate body,
                @HeaderParam("Accept") String accept);

        @Get("/v3/annotations/{id}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Annotation>> getAnnotation(
                @HostParam("region") Region region, @PathParam("id") int id, @HeaderParam("Accept") String accept);

        @Patch("/v3/annotations/{id}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Annotation>> updateAnnotation(
                @HostParam("region") Region region,
                @PathParam("id") int id,
                @BodyParam("application/json") AnnotationUpdate body,
                @HeaderParam("Accept") String accept);

        @Delete("/v3/annotations/{id}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Void>> deleteAnnotation(
                @HostParam("region") Region region, @PathParam("id") int id, @HeaderParam("Accept") String accept);

        @Post("/v3/annotations/batch_create")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<List<Annotation>>> batchCreateAnnotations(
                @HostParam("region") Region region,
                @BodyParam("application/json") List<AnnotationCreate> body,
                @HeaderParam("Accept") String accept);

        @Post("/v3/annotations/batch_update")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<List<Annotation>>> batchUpdateAnnotations(
                @HostParam("region") Region region,
                @BodyParam("application/json") List<AnnotationBatchUpdate> body,
                @HeaderParam("Accept") String accept);

        @Post("/v3/annotations/batch_delete")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Void>> batchDeleteAnnotations(
                @HostParam("region") Region region,
                @BodyParam("application/json") List<Integer> body,
                @HeaderParam("Accept") String accept);

        @Get("/v3/tags")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<List<Tag>>> getAllTags(
                @HostParam("region") Region region,
                @QueryParam("limit") Integer limit,
                @QueryParam("offset") Integer offset,
                @QueryParam("workspace") String workspace,
                @HeaderParam("Accept") String accept);

        @Post("/v3/tags")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Tag>> createTag(
                @HostParam("region") Region region,
                @BodyParam("application/json") TagCreate body,
                @HeaderParam("Accept") String accept);

        @Get("/v3/tags/{id}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Tag>> getTag(
                @HostParam("region") Region region, @PathParam("id") int id, @HeaderParam("Accept") String accept);

        @Patch("/v3/tags/{id}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Tag>> updateTag(
                @HostParam("region") Region region,
                @PathParam("id") int id,
                @BodyParam("application/json") TagUpdate body,
                @HeaderParam("Accept") String accept);

        @Delete("/v3/tags/{id}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Void>> deleteTag(
                @HostParam("region") Region region, @PathParam("id") int id, @HeaderParam("Accept") String accept);

        @Get("/v3/organizations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<List<Organization>>> getAllOrganizations(
                @HostParam("region") Region region, @HeaderParam("Accept") String accept);

        @Post("/v3/organizations")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Organization>> createOrganization(
                @HostParam("region") Region region,
                @BodyParam("application/json") OrganizationCreate body,
                @HeaderParam("Accept") String accept);

        @Get("/v3/organizations/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Organization>> getOrganization(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        // @Multipart not supported by RestProxy
        @Patch("/v3/organizations/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Organization>> updateOrganization(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @BodyParam("multipart/form-data") String name,
                @BodyParam("multipart/form-data") Flux<ByteBuffer> avatar,
                @HeaderParam("Content-Length") Long contentLength,
                @BodyParam("multipart/form-data") String resthookSignatureKey,
                @BodyParam("multipart/form-data") ValidationToolConfig validationToolConfig,
                @HeaderParam("Accept") String accept);

        @Delete("/v3/organizations/{identifier}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Void>> deleteOrganization(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Get("/v3/organization_memberships")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<PathsQ5Os5RV3OrganizationMembershipsGetResponses200ContentApplicationJsonSchema>>
                getAllOrganizationMemberships(
                        @HostParam("region") Region region,
                        @QueryParam("offset") Integer offset,
                        @QueryParam("limit") Integer limit,
                        @QueryParam("organization") String organization,
                        @QueryParam("role") OrganizationRole role,
                        @HeaderParam("Accept") String accept);

        @Get("/v3/organization_memberships/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<OrganizationMembership>> getOrganizationMembership(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Patch("/v3/organization_memberships/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<OrganizationMembership>> updateOrganizationMembership(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @BodyParam("application/json") OrganizationMembershipUpdate body,
                @HeaderParam("Accept") String accept);

        @Delete("/v3/organization_memberships/{identifier}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Void>> deleteOrganizationMembership(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Get("/v3/invitations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Paths18Wh2VcV3InvitationsGetResponses200ContentApplicationJsonSchema>> getAllInvitations(
                @HostParam("region") Region region,
                @QueryParam("offset") Integer offset,
                @QueryParam("limit") Integer limit,
                @QueryParam("organization") String organization,
                @QueryParam("status") InvitationStatus status,
                @QueryParam("role") OrganizationRole role,
                @HeaderParam("Accept") String accept);

        @Post("/v3/invitations")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Invitation>> createInvitation(
                @HostParam("region") Region region,
                @BodyParam("application/json") InvitationCreate body,
                @HeaderParam("Accept") String accept);

        @Get("/v3/invitations/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Invitation>> getInvitation(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Patch("/v3/invitations/{identifier}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Invitation>> updateInvitation(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @BodyParam("application/json") InvitationUpdate body,
                @HeaderParam("Accept") String accept);

        @Delete("/v3/invitations/{identifier}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Void>> deleteInvitation(
                @HostParam("region") Region region,
                @PathParam("identifier") String identifier,
                @HeaderParam("Accept") String accept);

        @Get("/v3/invitations/token/{token}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Invitation>> getInvitationByToken(
                @HostParam("region") Region region,
                @PathParam("token") String token,
                @HeaderParam("Accept") String accept);

        @Patch("/v3/invitations/token/{token}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Invitation>> respondToInvitation(
                @HostParam("region") Region region,
                @PathParam("token") String token,
                @BodyParam("application/json") InvitationResponse body,
                @HeaderParam("Accept") String accept);

        @Get("/v3/api_users")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Paths26Civ0V3ApiUsersGetResponses200ContentApplicationJsonSchema>> getAllApiUsers(
                @HostParam("region") Region region,
                @QueryParam("organization") String organization,
                @HeaderParam("Accept") String accept);

        @Post("/v3/api_users")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<ApiUserWithKey>> createApiUser(
                @HostParam("region") Region region,
                @BodyParam("application/json") ApiUserCreate body,
                @HeaderParam("Accept") String accept);

        @Get("/v3/api_users/{id}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<ApiUserWithoutKey>> getApiUser(
                @HostParam("region") Region region, @PathParam("id") int id, @HeaderParam("Accept") String accept);

        @Patch("/v3/api_users/{id}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<ApiUserWithoutKey>> updateApiUser(
                @HostParam("region") Region region,
                @PathParam("id") int id,
                @BodyParam("application/json") ApiUserUpdate body,
                @HeaderParam("Accept") String accept);

        @Delete("/v3/api_users/{id}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Void>> deleteApiUser(
                @HostParam("region") Region region, @PathParam("id") int id, @HeaderParam("Accept") String accept);

        @Post("/v3/api_users/{id}/regenerate_api_key")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<ApiUserWithKey>> regenerateApiKeyForApiUser(
                @HostParam("region") Region region, @PathParam("id") int id, @HeaderParam("Accept") String accept);

        @Get("/v3/resthook_subscriptions")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<PathsVz5Kj2V3ResthookSubscriptionsGetResponses200ContentApplicationJsonSchema>>
                getAllResthookSubscriptions(
                        @HostParam("region") Region region,
                        @QueryParam("offset") Integer offset,
                        @QueryParam("limit") Integer limit,
                        @HeaderParam("Accept") String accept);

        @Post("/v3/resthook_subscriptions")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<ResthookSubscription>> createResthookSubscription(
                @HostParam("region") Region region,
                @BodyParam("application/json") ResthookSubscriptionCreate body,
                @HeaderParam("Accept") String accept);

        @Get("/v3/resthook_subscriptions/{id}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<ResthookSubscription>> getResthookSubscription(
                @HostParam("region") Region region, @PathParam("id") int id, @HeaderParam("Accept") String accept);

        @Patch("/v3/resthook_subscriptions/{id}")
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

        @Delete("/v3/resthook_subscriptions/{id}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Void>> deleteResthookSubscription(
                @HostParam("region") Region region, @PathParam("id") int id, @HeaderParam("Accept") String accept);

        @Post("/v3/resthook_subscriptions/activate")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<ResthookSubscription>> activateResthookSubscription(
                @HostParam("region") Region region,
                @HeaderParam("X-Hook-Secret") String xHookSecret,
                @HeaderParam("Accept") String accept);

        @Get("/v3/occupation_groups")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<List<OccupationGroup>>> listOccupationGroups(
                @HostParam("region") Region region, @HeaderParam("Accept") String accept);

        @Post("/v3/job_description_search")
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

        @Post("/v3/job_description_search/details/{identifier}")
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

        @Get("/v3/job_description_search/config")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<JobDescriptionSearchConfig>> getJobDescriptionSearchConfig(
                @HostParam("region") Region region, @HeaderParam("Accept") String accept);

        @Patch("/v3/job_description_search/config")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<JobDescriptionSearchConfig>> updateJobDescriptionSearchConfig(
                @HostParam("region") Region region,
                @BodyParam("application/json") JobDescriptionSearchConfig body,
                @HeaderParam("Accept") String accept);

        @Post("/v3/job_description_search/embed")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<JobDescriptionSearchEmbed>> createJobDescriptionSearchEmbedUrl(
                @HostParam("region") Region region,
                @BodyParam("application/json")
                        PathsM3DzbgV3JobDescriptionSearchEmbedPostRequestbodyContentApplicationJsonSchema body,
                @HeaderParam("Accept") String accept);

        @Get("/v3/index")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<PathsDvrcp3V3IndexGetResponses200ContentApplicationJsonSchema>> getAllIndexes(
                @HostParam("region") Region region,
                @QueryParam("offset") Integer offset,
                @QueryParam("limit") Integer limit,
                @QueryParam("document_type") Enum19 documentType,
                @HeaderParam("Accept") String accept);

        @Post("/v3/index")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Paths1TvfqeiV3IndexPostResponses201ContentApplicationJsonSchema>> createIndex(
                @HostParam("region") Region region,
                @BodyParam("application/json") IndexRequestBody body,
                @HeaderParam("Accept") String accept);

        @Delete("/v3/index/{name}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<Void>> deleteIndex(
                @HostParam("region") Region region,
                @PathParam("name") String name,
                @HeaderParam("Accept") String accept);

        @Get("/v3/index/{name}/documents")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<PathsO7SnenV3IndexNameDocumentsGetResponses200ContentApplicationJsonSchema>> getAllIndexDocuments(
                @HostParam("region") Region region,
                @PathParam("name") String name,
                @HeaderParam("Accept") String accept);

        @Post("/v3/index/{name}/documents")
        @ExpectedResponses({201})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<PathsFte27NV3IndexNameDocumentsPostResponses201ContentApplicationJsonSchema>> createIndexDocument(
                @HostParam("region") Region region,
                @PathParam("name") String name,
                @BodyParam("application/json")
                        PathsCl024WV3IndexNameDocumentsPostRequestbodyContentApplicationJsonSchema body,
                @HeaderParam("Accept") String accept);

        @Delete("/v3/index/{name}/documents/{identifier}")
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

        @Post("/v3/resume_search")
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

        @Post("/v3/resume_search/details/{identifier}")
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

        @Get("/v3/resume_search/match")
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

        @Get("/v3/resume_search/config")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<ResumeSearchConfig>> getResumeSearchConfig(
                @HostParam("region") Region region, @HeaderParam("Accept") String accept);

        @Patch("/v3/resume_search/config")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<ResumeSearchConfig>> updateResumeSearchConfig(
                @HostParam("region") Region region,
                @BodyParam("application/json") ResumeSearchConfig body,
                @HeaderParam("Accept") String accept);

        @Post("/v3/resume_search/embed")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<ResumeSearchEmbed>> createResumeSearchEmbedUrl(
                @HostParam("region") Region region,
                @BodyParam("application/json")
                        Paths1Czpnk1V3ResumeSearchEmbedPostRequestbodyContentApplicationJsonSchema body,
                @HeaderParam("Accept") String accept);

        @Get("/v3/resume_search/suggestion_job_title")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<List<String>>> getResumeSearchSuggestionJobTitle(
                @HostParam("region") Region region,
                @QueryParam(value = "job_titles", multipleQueryParams = true) List<String> jobTitles,
                @HeaderParam("Accept") String accept);

        @Get("/v3/resume_search/suggestion_skill")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(
                value = RequestErrorException.class,
                code = {400, 401})
        @UnexpectedResponseExceptionType(RequestErrorException.class)
        Mono<Response<List<String>>> getResumeSearchSuggestionSkill(
                @HostParam("region") Region region,
                @QueryParam(value = "skills", multipleQueryParams = true) List<String> skills,
                @HeaderParam("Accept") String accept);
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
        return service.getAllWorkspaces(this.getRegion(), organization, name, accept);
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
        return service.createWorkspace(this.getRegion(), body, accept);
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
        return service.getWorkspace(this.getRegion(), identifier, accept);
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
        return service.updateWorkspace(this.getRegion(), identifier, body, accept);
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
        return service.deleteWorkspace(this.getRegion(), identifier, accept);
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
     * Return monthly credits consumption of a workspace.
     *
     * @param identifier Workspace's identifier.
     * @param start Start date of the period to retrieve. Format: YYYY-MM.
     * @param end End date of the period to retrieve. Format: YYYY-MM.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return monthly credits consumption along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<List<UsageByWorkspace>>> getUsageByWorkspaceWithResponseAsync(
            String identifier, String start, String end) {
        final String accept = "application/json";
        return service.getUsageByWorkspace(this.getRegion(), identifier, start, end, accept);
    }

    /**
     * Return monthly credits consumption of a workspace.
     *
     * @param identifier Workspace's identifier.
     * @param start Start date of the period to retrieve. Format: YYYY-MM.
     * @param end End date of the period to retrieve. Format: YYYY-MM.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return monthly credits consumption on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<List<UsageByWorkspace>> getUsageByWorkspaceAsync(String identifier, String start, String end) {
        return getUsageByWorkspaceWithResponseAsync(identifier, start, end)
                .flatMap(
                        (Response<List<UsageByWorkspace>> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Return monthly credits consumption of a workspace.
     *
     * @param identifier Workspace's identifier.
     * @param start Start date of the period to retrieve. Format: YYYY-MM.
     * @param end End date of the period to retrieve. Format: YYYY-MM.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return monthly credits consumption.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<UsageByWorkspace> getUsageByWorkspace(String identifier, String start, String end) {
        return getUsageByWorkspaceAsync(identifier, start, end).block();
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
    public Mono<Response<PathsZ1JuagV3WorkspaceMembershipsGetResponses200ContentApplicationJsonSchema>>
            getAllWorkspaceMembershipsWithResponseAsync(Integer offset, Integer limit, String workspace, String user) {
        final String accept = "application/json";
        return service.getAllWorkspaceMemberships(this.getRegion(), offset, limit, workspace, user, accept);
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
    public Mono<PathsZ1JuagV3WorkspaceMembershipsGetResponses200ContentApplicationJsonSchema>
            getAllWorkspaceMembershipsAsync(Integer offset, Integer limit, String workspace, String user) {
        return getAllWorkspaceMembershipsWithResponseAsync(offset, limit, workspace, user)
                .flatMap(
                        (Response<PathsZ1JuagV3WorkspaceMembershipsGetResponses200ContentApplicationJsonSchema>
                                        res) -> {
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
    public PathsZ1JuagV3WorkspaceMembershipsGetResponses200ContentApplicationJsonSchema getAllWorkspaceMemberships(
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
        return service.createWorkspaceMembership(this.getRegion(), body, accept);
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
        return service.getWorkspaceMembership(this.getRegion(), identifier, accept);
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
        return service.deleteWorkspaceMembership(this.getRegion(), identifier, accept);
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
        return service.getAllCollections(this.getRegion(), workspace, accept);
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
        return service.createCollection(this.getRegion(), body, accept);
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
        return service.getCollection(this.getRegion(), identifier, accept);
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
    public Mono<Response<DocumentCollection>> updateCollectionWithResponseAsync(
            String identifier, DocumentCollectionUpdate body) {
        final String accept = "application/json";
        return service.updateCollection(this.getRegion(), identifier, body, accept);
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
    public Mono<DocumentCollection> updateCollectionAsync(String identifier, DocumentCollectionUpdate body) {
        return updateCollectionWithResponseAsync(identifier, body)
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
    public DocumentCollection updateCollection(String identifier, DocumentCollectionUpdate body) {
        return updateCollectionAsync(identifier, body).block();
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
        return service.deleteCollection(this.getRegion(), identifier, accept);
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
     * Create data field for a collection along with a new data point.
     *
     * @param identifier Collection's identifier.
     * @param body The data field and data point to be created.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DataField>> createDataFieldForCollectionWithResponseAsync(
            String identifier, DataFieldCreate body) {
        final String accept = "application/json";
        return service.createDataFieldForCollection(this.getRegion(), identifier, body, accept);
    }

    /**
     * Create data field for a collection along with a new data point.
     *
     * @param identifier Collection's identifier.
     * @param body The data field and data point to be created.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DataField> createDataFieldForCollectionAsync(String identifier, DataFieldCreate body) {
        return createDataFieldForCollectionWithResponseAsync(identifier, body)
                .flatMap(
                        (Response<DataField> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Create data field for a collection along with a new data point.
     *
     * @param identifier Collection's identifier.
     * @param body The data field and data point to be created.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DataField createDataFieldForCollection(String identifier, DataFieldCreate body) {
        return createDataFieldForCollectionAsync(identifier, body).block();
    }

    /**
     * Get a data field for a collection assosciated with a data point.
     *
     * @param identifier Collection's identifier.
     * @param datapointIdentifier Datapoint's identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a data field for a collection assosciated with a data point along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CollectionField>> getDataFieldForCollectionWithResponseAsync(
            String identifier, String datapointIdentifier) {
        final String accept = "application/json";
        return service.getDataFieldForCollection(this.getRegion(), identifier, datapointIdentifier, accept);
    }

    /**
     * Get a data field for a collection assosciated with a data point.
     *
     * @param identifier Collection's identifier.
     * @param datapointIdentifier Datapoint's identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a data field for a collection assosciated with a data point on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CollectionField> getDataFieldForCollectionAsync(String identifier, String datapointIdentifier) {
        return getDataFieldForCollectionWithResponseAsync(identifier, datapointIdentifier)
                .flatMap(
                        (Response<CollectionField> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Get a data field for a collection assosciated with a data point.
     *
     * @param identifier Collection's identifier.
     * @param datapointIdentifier Datapoint's identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a data field for a collection assosciated with a data point.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CollectionField getDataFieldForCollection(String identifier, String datapointIdentifier) {
        return getDataFieldForCollectionAsync(identifier, datapointIdentifier).block();
    }

    /**
     * Update data field for a collection assosciated with a data point.
     *
     * @param identifier Collection's identifier.
     * @param datapointIdentifier Datapoint's identifier.
     * @param body Data field properties to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CollectionField>> updateDataFieldForCollectionWithResponseAsync(
            String identifier, String datapointIdentifier, CollectionField body) {
        final String accept = "application/json";
        return service.updateDataFieldForCollection(this.getRegion(), identifier, datapointIdentifier, body, accept);
    }

    /**
     * Update data field for a collection assosciated with a data point.
     *
     * @param identifier Collection's identifier.
     * @param datapointIdentifier Datapoint's identifier.
     * @param body Data field properties to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CollectionField> updateDataFieldForCollectionAsync(
            String identifier, String datapointIdentifier, CollectionField body) {
        return updateDataFieldForCollectionWithResponseAsync(identifier, datapointIdentifier, body)
                .flatMap(
                        (Response<CollectionField> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Update data field for a collection assosciated with a data point.
     *
     * @param identifier Collection's identifier.
     * @param datapointIdentifier Datapoint's identifier.
     * @param body Data field properties to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CollectionField updateDataFieldForCollection(
            String identifier, String datapointIdentifier, CollectionField body) {
        return updateDataFieldForCollectionAsync(identifier, datapointIdentifier, body).block();
    }

    /**
     * Return monthly credits consumption of a collection.
     *
     * @param identifier Collection's identifier.
     * @param start Start date of the period to retrieve. Format: YYYY-MM.
     * @param end End date of the period to retrieve. Format: YYYY-MM.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return monthly credits consumption along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<List<UsageByCollection>>> getUsageByCollectionWithResponseAsync(
            String identifier, String start, String end) {
        final String accept = "application/json";
        return service.getUsageByCollection(this.getRegion(), identifier, start, end, accept);
    }

    /**
     * Return monthly credits consumption of a collection.
     *
     * @param identifier Collection's identifier.
     * @param start Start date of the period to retrieve. Format: YYYY-MM.
     * @param end End date of the period to retrieve. Format: YYYY-MM.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return monthly credits consumption on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<List<UsageByCollection>> getUsageByCollectionAsync(String identifier, String start, String end) {
        return getUsageByCollectionWithResponseAsync(identifier, start, end)
                .flatMap(
                        (Response<List<UsageByCollection>> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Return monthly credits consumption of a collection.
     *
     * @param identifier Collection's identifier.
     * @param start Start date of the period to retrieve. Format: YYYY-MM.
     * @param end End date of the period to retrieve. Format: YYYY-MM.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return monthly credits consumption.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<UsageByCollection> getUsageByCollection(String identifier, String start, String end) {
        return getUsageByCollectionAsync(identifier, start, end).block();
    }

    /**
     * Returns all the document summaries for that user, limited to 300 per page.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @param workspace Filter by workspace.
     * @param collection Filter by collection.
     * @param state Filter by the document's state.
     * @param tags Filter by tag's IDs.
     * @param createdDt Filter by created datetime.
     * @param search Partial, case-insensitive match with file name or tag name.
     * @param ordering Sort the result set. A "-" at the beginning denotes DESC sort, e.g. -created_dt. Sort by multiple
     *     fields is supported. Supported values include: 'file_name', 'extractor', 'created_dt', 'validated_dt',
     *     'archived_dt' and 'parsed__&lt;dataPointSlug&gt;'.
     * @param includeData By default, this endpoint returns only the meta data of the documents. Set this to `true` will
     *     return a summary of the data that was parsed. If you want to retrieve the full set of data for a document,
     *     use the `GET /documents/{identifier}` endpoint.
     * @param exclude Exclude some documents from the result.
     * @param inReview Exclude documents that are currently being reviewed.
     * @param failed Filter by failed status.
     * @param ready Filter by ready status.
     * @param validatable Filter for validatable documents.
     * @param hasChallenges Filter for documents with challenges.
     * @param customIdentifier Filter for documents with this custom identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PathsOxm5M7V3DocumentsGetResponses200ContentApplicationJsonSchema>>
            getAllDocumentsWithResponseAsync(
                    Integer offset,
                    Integer limit,
                    String workspace,
                    String collection,
                    DocumentState state,
                    List<Integer> tags,
                    DateRange createdDt,
                    String search,
                    List<String> ordering,
                    Boolean includeData,
                    List<String> exclude,
                    Boolean inReview,
                    Boolean failed,
                    Boolean ready,
                    Boolean validatable,
                    Boolean hasChallenges,
                    String customIdentifier) {
        final String accept = "application/json";
        String tagsConverted =
                JacksonAdapter.createDefaultSerializerAdapter().serializeList(tags, CollectionFormat.CSV);
        String orderingConverted =
                JacksonAdapter.createDefaultSerializerAdapter().serializeList(ordering, CollectionFormat.CSV);
        String excludeConverted =
                JacksonAdapter.createDefaultSerializerAdapter().serializeList(exclude, CollectionFormat.CSV);
        return service.getAllDocuments(
                this.getRegion(),
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
                excludeConverted,
                inReview,
                failed,
                ready,
                validatable,
                hasChallenges,
                customIdentifier,
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
     * @param tags Filter by tag's IDs.
     * @param createdDt Filter by created datetime.
     * @param search Partial, case-insensitive match with file name or tag name.
     * @param ordering Sort the result set. A "-" at the beginning denotes DESC sort, e.g. -created_dt. Sort by multiple
     *     fields is supported. Supported values include: 'file_name', 'extractor', 'created_dt', 'validated_dt',
     *     'archived_dt' and 'parsed__&lt;dataPointSlug&gt;'.
     * @param includeData By default, this endpoint returns only the meta data of the documents. Set this to `true` will
     *     return a summary of the data that was parsed. If you want to retrieve the full set of data for a document,
     *     use the `GET /documents/{identifier}` endpoint.
     * @param exclude Exclude some documents from the result.
     * @param inReview Exclude documents that are currently being reviewed.
     * @param failed Filter by failed status.
     * @param ready Filter by ready status.
     * @param validatable Filter for validatable documents.
     * @param hasChallenges Filter for documents with challenges.
     * @param customIdentifier Filter for documents with this custom identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PathsOxm5M7V3DocumentsGetResponses200ContentApplicationJsonSchema> getAllDocumentsAsync(
            Integer offset,
            Integer limit,
            String workspace,
            String collection,
            DocumentState state,
            List<Integer> tags,
            DateRange createdDt,
            String search,
            List<String> ordering,
            Boolean includeData,
            List<String> exclude,
            Boolean inReview,
            Boolean failed,
            Boolean ready,
            Boolean validatable,
            Boolean hasChallenges,
            String customIdentifier) {
        return getAllDocumentsWithResponseAsync(
                        offset,
                        limit,
                        workspace,
                        collection,
                        state,
                        tags,
                        createdDt,
                        search,
                        ordering,
                        includeData,
                        exclude,
                        inReview,
                        failed,
                        ready,
                        validatable,
                        hasChallenges,
                        customIdentifier)
                .flatMap(
                        (Response<PathsOxm5M7V3DocumentsGetResponses200ContentApplicationJsonSchema> res) -> {
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
     * @param tags Filter by tag's IDs.
     * @param createdDt Filter by created datetime.
     * @param search Partial, case-insensitive match with file name or tag name.
     * @param ordering Sort the result set. A "-" at the beginning denotes DESC sort, e.g. -created_dt. Sort by multiple
     *     fields is supported. Supported values include: 'file_name', 'extractor', 'created_dt', 'validated_dt',
     *     'archived_dt' and 'parsed__&lt;dataPointSlug&gt;'.
     * @param includeData By default, this endpoint returns only the meta data of the documents. Set this to `true` will
     *     return a summary of the data that was parsed. If you want to retrieve the full set of data for a document,
     *     use the `GET /documents/{identifier}` endpoint.
     * @param exclude Exclude some documents from the result.
     * @param inReview Exclude documents that are currently being reviewed.
     * @param failed Filter by failed status.
     * @param ready Filter by ready status.
     * @param validatable Filter for validatable documents.
     * @param hasChallenges Filter for documents with challenges.
     * @param customIdentifier Filter for documents with this custom identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PathsOxm5M7V3DocumentsGetResponses200ContentApplicationJsonSchema getAllDocuments(
            Integer offset,
            Integer limit,
            String workspace,
            String collection,
            DocumentState state,
            List<Integer> tags,
            DateRange createdDt,
            String search,
            List<String> ordering,
            Boolean includeData,
            List<String> exclude,
            Boolean inReview,
            Boolean failed,
            Boolean ready,
            Boolean validatable,
            Boolean hasChallenges,
            String customIdentifier) {
        return getAllDocumentsAsync(
                        offset,
                        limit,
                        workspace,
                        collection,
                        state,
                        tags,
                        createdDt,
                        search,
                        ordering,
                        includeData,
                        exclude,
                        inReview,
                        failed,
                        ready,
                        validatable,
                        hasChallenges,
                        customIdentifier)
                .block();
    }

    /**
     * Uploads a document for parsing. When successful, returns an `identifier` in the response for subsequent use with
     * the [/documents/{identifier}](#get-/v3/documents/-identifier-) endpoint to check processing status and retrieve
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
        return service.createDocument(this.getRegion(), body, accept);
    }

    /**
     * Uploads a document for parsing. When successful, returns an `identifier` in the response for subsequent use with
     * the [/documents/{identifier}](#get-/v3/documents/-identifier-) endpoint to check processing status and retrieve
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
     * the [/documents/{identifier}](#get-/v3/documents/-identifier-) endpoint to check processing status and retrieve
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
     * @param format Specify which format you want the response to be. Default is "json".
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Document>> getDocumentWithResponseAsync(String identifier, DocumentFormat format) {
        final String accept = "application/json, application/xml";
        return service.getDocument(this.getRegion(), identifier, format, accept);
    }

    /**
     * Return a specific document.
     *
     * @param identifier Document's identifier.
     * @param format Specify which format you want the response to be. Default is "json".
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Document> getDocumentAsync(String identifier, DocumentFormat format) {
        return getDocumentWithResponseAsync(identifier, format)
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
     * @param format Specify which format you want the response to be. Default is "json".
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Document getDocument(String identifier, DocumentFormat format) {
        return getDocumentAsync(identifier, format).block();
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
    public Mono<Response<Document>> updateDocumentWithResponseAsync(String identifier, DocumentUpdate body) {
        final String accept = "application/json";
        return service.updateDocument(this.getRegion(), identifier, body, accept);
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
    public Mono<Document> updateDocumentAsync(String identifier, DocumentUpdate body) {
        return updateDocumentWithResponseAsync(identifier, body)
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
    public Document updateDocument(String identifier, DocumentUpdate body) {
        return updateDocumentAsync(identifier, body).block();
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
        return service.deleteDocument(this.getRegion(), identifier, accept);
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
     * Update data of a document. Only applicable for resumes and job descriptions. For other document types, please use
     * the `PATCH /annotations/{id}` endpoint or the `POST /annotations/batch_update` endpoint.
     *
     * @param identifier Resume or Job Description identifier.
     * @param body Resume data to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Document>> updateDocumentDataWithResponseAsync(String identifier, Object body) {
        final String accept = "application/json";
        return service.updateDocumentData(this.getRegion(), identifier, body, accept);
    }

    /**
     * Update data of a document. Only applicable for resumes and job descriptions. For other document types, please use
     * the `PATCH /annotations/{id}` endpoint or the `POST /annotations/batch_update` endpoint.
     *
     * @param identifier Resume or Job Description identifier.
     * @param body Resume data to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Document> updateDocumentDataAsync(String identifier, Object body) {
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
     * Update data of a document. Only applicable for resumes and job descriptions. For other document types, please use
     * the `PATCH /annotations/{id}` endpoint or the `POST /annotations/batch_update` endpoint.
     *
     * @param identifier Resume or Job Description identifier.
     * @param body Resume data to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Document updateDocumentData(String identifier, Object body) {
        return updateDocumentDataAsync(identifier, body).block();
    }

    /**
     * Add a tag to documents. Tags are used to group documents together. Tags can be used to filter documents.
     *
     * @param body Specify the tag and the documents to tag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> batchAddTagWithResponseAsync(BatchAddTagRequest body) {
        final String accept = "application/json";
        return service.batchAddTag(this.getRegion(), body, accept);
    }

    /**
     * Add a tag to documents. Tags are used to group documents together. Tags can be used to filter documents.
     *
     * @param body Specify the tag and the documents to tag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> batchAddTagAsync(BatchAddTagRequest body) {
        return batchAddTagWithResponseAsync(body).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Add a tag to documents. Tags are used to group documents together. Tags can be used to filter documents.
     *
     * @param body Specify the tag and the documents to tag.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void batchAddTag(BatchAddTagRequest body) {
        batchAddTagAsync(body).block();
    }

    /**
     * Remove a tag from documents.
     *
     * @param body Specify the tag and the documents to remove the tag from.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> batchRemoveTagWithResponseAsync(BatchRemoveTagRequest body) {
        final String accept = "application/json";
        return service.batchRemoveTag(this.getRegion(), body, accept);
    }

    /**
     * Remove a tag from documents.
     *
     * @param body Specify the tag and the documents to remove the tag from.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> batchRemoveTagAsync(BatchRemoveTagRequest body) {
        return batchRemoveTagWithResponseAsync(body).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Remove a tag from documents.
     *
     * @param body Specify the tag and the documents to remove the tag from.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void batchRemoveTag(BatchRemoveTagRequest body) {
        batchRemoveTagAsync(body).block();
    }

    /**
     * Split / merge / rotate / delete pages of a document. Documents with multiple pages can be splitted into multiple
     * documents, or merged into one document. Each page can also be rotated. Edit operations will trigger re-parsing of
     * the documents involved.
     *
     * @param identifier Document's identifier.
     * @param body Describe how the pages should be edited.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Meta along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<List<Meta>>> editDocumentPagesWithResponseAsync(String identifier, DocumentEditRequest body) {
        final String accept = "application/json";
        return service.editDocumentPages(this.getRegion(), identifier, body, accept);
    }

    /**
     * Split / merge / rotate / delete pages of a document. Documents with multiple pages can be splitted into multiple
     * documents, or merged into one document. Each page can also be rotated. Edit operations will trigger re-parsing of
     * the documents involved.
     *
     * @param identifier Document's identifier.
     * @param body Describe how the pages should be edited.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Meta on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<List<Meta>> editDocumentPagesAsync(String identifier, DocumentEditRequest body) {
        return editDocumentPagesWithResponseAsync(identifier, body)
                .flatMap(
                        (Response<List<Meta>> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Split / merge / rotate / delete pages of a document. Documents with multiple pages can be splitted into multiple
     * documents, or merged into one document. Each page can also be rotated. Edit operations will trigger re-parsing of
     * the documents involved.
     *
     * @param identifier Document's identifier.
     * @param body Describe how the pages should be edited.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Meta.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<Meta> editDocumentPages(String identifier, DocumentEditRequest body) {
        return editDocumentPagesAsync(identifier, body).block();
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
                this.getRegion(), organization, includePublicExtractors, name, validatable, accept);
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
        return service.createExtractor(this.getRegion(), body, accept);
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
     * @param identifier Extractor's identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Extractor>> getExtractorWithResponseAsync(String identifier) {
        final String accept = "application/json";
        return service.getExtractor(this.getRegion(), identifier, accept);
    }

    /**
     * Return a specific extractor.
     *
     * @param identifier Extractor's identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Extractor> getExtractorAsync(String identifier) {
        return getExtractorWithResponseAsync(identifier)
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
     * @param identifier Extractor's identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Extractor getExtractor(String identifier) {
        return getExtractorAsync(identifier).block();
    }

    /**
     * Update data of an extractor.
     *
     * @param identifier Extractor's identifier.
     * @param body Extractor data to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Extractor>> updateExtractorWithResponseAsync(String identifier, ExtractorUpdate body) {
        final String accept = "application/json";
        return service.updateExtractor(this.getRegion(), identifier, body, accept);
    }

    /**
     * Update data of an extractor.
     *
     * @param identifier Extractor's identifier.
     * @param body Extractor data to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Extractor> updateExtractorAsync(String identifier, ExtractorUpdate body) {
        return updateExtractorWithResponseAsync(identifier, body)
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
     * @param identifier Extractor's identifier.
     * @param body Extractor data to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Extractor updateExtractor(String identifier, ExtractorUpdate body) {
        return updateExtractorAsync(identifier, body).block();
    }

    /**
     * Deletes the specified extractor from the database.
     *
     * @param identifier Extractor's identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteExtractorWithResponseAsync(String identifier) {
        final String accept = "application/json";
        return service.deleteExtractor(this.getRegion(), identifier, accept);
    }

    /**
     * Deletes the specified extractor from the database.
     *
     * @param identifier Extractor's identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteExtractorAsync(String identifier) {
        return deleteExtractorWithResponseAsync(identifier).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the specified extractor from the database.
     *
     * @param identifier Extractor's identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteExtractor(String identifier) {
        deleteExtractorAsync(identifier).block();
    }

    /**
     * Returns your custom data points as well as Affinda's off-the-shelf data points.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @param organization Filter by organization.
     * @param includePublic Allows you to include public data points in the response when you're filtering by
     *     organization.
     * @param extractor Filter by extractor.
     * @param slug Filter by slug.
     * @param description Filter by description.
     * @param annotationContentType Filter by annotation content type, e.g. text, integer, float, date, etc.
     * @param identifier Filter by specific identifiers.
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
            Boolean includePublic,
            String extractor,
            String slug,
            String description,
            String annotationContentType,
            List<String> identifier) {
        final String accept = "application/json";
        String identifierConverted =
                JacksonAdapter.createDefaultSerializerAdapter().serializeList(identifier, CollectionFormat.CSV);
        return service.getAllDataPoints(
                this.getRegion(),
                offset,
                limit,
                organization,
                includePublic,
                extractor,
                slug,
                description,
                annotationContentType,
                identifierConverted,
                accept);
    }

    /**
     * Returns your custom data points as well as Affinda's off-the-shelf data points.
     *
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @param organization Filter by organization.
     * @param includePublic Allows you to include public data points in the response when you're filtering by
     *     organization.
     * @param extractor Filter by extractor.
     * @param slug Filter by slug.
     * @param description Filter by description.
     * @param annotationContentType Filter by annotation content type, e.g. text, integer, float, date, etc.
     * @param identifier Filter by specific identifiers.
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
            Boolean includePublic,
            String extractor,
            String slug,
            String description,
            String annotationContentType,
            List<String> identifier) {
        return getAllDataPointsWithResponseAsync(
                        offset,
                        limit,
                        organization,
                        includePublic,
                        extractor,
                        slug,
                        description,
                        annotationContentType,
                        identifier)
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
     * @param includePublic Allows you to include public data points in the response when you're filtering by
     *     organization.
     * @param extractor Filter by extractor.
     * @param slug Filter by slug.
     * @param description Filter by description.
     * @param annotationContentType Filter by annotation content type, e.g. text, integer, float, date, etc.
     * @param identifier Filter by specific identifiers.
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
            Boolean includePublic,
            String extractor,
            String slug,
            String description,
            String annotationContentType,
            List<String> identifier) {
        return getAllDataPointsAsync(
                        offset,
                        limit,
                        organization,
                        includePublic,
                        extractor,
                        slug,
                        description,
                        annotationContentType,
                        identifier)
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
        return service.createDataPoint(this.getRegion(), body, accept);
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
        return service.getDataPoint(this.getRegion(), identifier, accept);
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
    public Mono<Response<DataPoint>> updateDataPointWithResponseAsync(String identifier, DataPointUpdate body) {
        final String accept = "application/json";
        return service.updateDataPoint(this.getRegion(), identifier, body, accept);
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
    public Mono<DataPoint> updateDataPointAsync(String identifier, DataPointUpdate body) {
        return updateDataPointWithResponseAsync(identifier, body)
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
    public DataPoint updateDataPoint(String identifier, DataPointUpdate body) {
        return updateDataPointAsync(identifier, body).block();
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
        return service.deleteDataPoint(this.getRegion(), identifier, accept);
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
     * Returns available choices for a specific enum data point.
     *
     * @param dataPoint The data point to get choices for.
     * @param collection The collection to get choices for.
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @param search Filter choices by searching for a substring.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PathsMnwxgV3DataPointChoicesGetResponses200ContentApplicationJsonSchema>>
            getDataPointChoicesWithResponseAsync(
                    String dataPoint, String collection, Integer offset, Integer limit, String search) {
        final String accept = "application/json";
        return service.getDataPointChoices(this.getRegion(), offset, limit, dataPoint, collection, search, accept);
    }

    /**
     * Returns available choices for a specific enum data point.
     *
     * @param dataPoint The data point to get choices for.
     * @param collection The collection to get choices for.
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @param search Filter choices by searching for a substring.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PathsMnwxgV3DataPointChoicesGetResponses200ContentApplicationJsonSchema> getDataPointChoicesAsync(
            String dataPoint, String collection, Integer offset, Integer limit, String search) {
        return getDataPointChoicesWithResponseAsync(dataPoint, collection, offset, limit, search)
                .flatMap(
                        (Response<PathsMnwxgV3DataPointChoicesGetResponses200ContentApplicationJsonSchema> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Returns available choices for a specific enum data point.
     *
     * @param dataPoint The data point to get choices for.
     * @param collection The collection to get choices for.
     * @param offset The number of documents to skip before starting to collect the result set.
     * @param limit The numbers of results to return.
     * @param search Filter choices by searching for a substring.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PathsMnwxgV3DataPointChoicesGetResponses200ContentApplicationJsonSchema getDataPointChoices(
            String dataPoint, String collection, Integer offset, Integer limit, String search) {
        return getDataPointChoicesAsync(dataPoint, collection, offset, limit, search).block();
    }

    /**
     * Create a custom data point choice.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DataPointChoice>> createDataPointChoiceWithResponseAsync(DataPointChoiceCreate body) {
        final String accept = "application/json";
        return service.createDataPointChoice(this.getRegion(), body, accept);
    }

    /**
     * Create a custom data point choice.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DataPointChoice> createDataPointChoiceAsync(DataPointChoiceCreate body) {
        return createDataPointChoiceWithResponseAsync(body)
                .flatMap(
                        (Response<DataPointChoice> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Create a custom data point choice.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DataPointChoice createDataPointChoice(DataPointChoiceCreate body) {
        return createDataPointChoiceAsync(body).block();
    }

    /**
     * Return a specific data point choice.
     *
     * @param id Data point choice's ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DataPointChoice>> getDataPointChoiceWithResponseAsync(int id) {
        final String accept = "application/json";
        return service.getDataPointChoice(this.getRegion(), id, accept);
    }

    /**
     * Return a specific data point choice.
     *
     * @param id Data point choice's ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DataPointChoice> getDataPointChoiceAsync(int id) {
        return getDataPointChoiceWithResponseAsync(id)
                .flatMap(
                        (Response<DataPointChoice> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Return a specific data point choice.
     *
     * @param id Data point choice's ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DataPointChoice getDataPointChoice(int id) {
        return getDataPointChoiceAsync(id).block();
    }

    /**
     * Update data of a data point choice.
     *
     * @param id Data point choice's ID.
     * @param body Data point choice to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DataPointChoice>> updateDataPointChoiceWithResponseAsync(int id, DataPointChoiceUpdate body) {
        final String accept = "application/json";
        return service.updateDataPointChoice(this.getRegion(), id, body, accept);
    }

    /**
     * Update data of a data point choice.
     *
     * @param id Data point choice's ID.
     * @param body Data point choice to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DataPointChoice> updateDataPointChoiceAsync(int id, DataPointChoiceUpdate body) {
        return updateDataPointChoiceWithResponseAsync(id, body)
                .flatMap(
                        (Response<DataPointChoice> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Update data of a data point choice.
     *
     * @param id Data point choice's ID.
     * @param body Data point choice to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DataPointChoice updateDataPointChoice(int id, DataPointChoiceUpdate body) {
        return updateDataPointChoiceAsync(id, body).block();
    }

    /**
     * Deletes the specified data point choice from the database.
     *
     * @param id Data point choice's ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteDataPointChoiceWithResponseAsync(int id) {
        final String accept = "application/json";
        return service.deleteDataPointChoice(this.getRegion(), id, accept);
    }

    /**
     * Deletes the specified data point choice from the database.
     *
     * @param id Data point choice's ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteDataPointChoiceAsync(int id) {
        return deleteDataPointChoiceWithResponseAsync(id).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the specified data point choice from the database.
     *
     * @param id Data point choice's ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteDataPointChoice(int id) {
        deleteDataPointChoiceAsync(id).block();
    }

    /**
     * Replace choices of a data point. Existing choices and incoming choices are matched base on their `value`. New
     * `value` will be created, existing `value` will be updated, and `value` not in incoming choices will be deleted.
     *
     * @param body Request body for replacing choices of a data point. Either `collection` or `organization` is
     *     required.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<DataPointChoiceReplaceResponse>> replaceDataPointChoicesWithResponseAsync(
            DataPointChoiceReplaceRequest body) {
        final String accept = "application/json";
        return service.replaceDataPointChoices(this.getRegion(), body, accept);
    }

    /**
     * Replace choices of a data point. Existing choices and incoming choices are matched base on their `value`. New
     * `value` will be created, existing `value` will be updated, and `value` not in incoming choices will be deleted.
     *
     * @param body Request body for replacing choices of a data point. Either `collection` or `organization` is
     *     required.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<DataPointChoiceReplaceResponse> replaceDataPointChoicesAsync(DataPointChoiceReplaceRequest body) {
        return replaceDataPointChoicesWithResponseAsync(body)
                .flatMap(
                        (Response<DataPointChoiceReplaceResponse> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Replace choices of a data point. Existing choices and incoming choices are matched base on their `value`. New
     * `value` will be created, existing `value` will be updated, and `value` not in incoming choices will be deleted.
     *
     * @param body Request body for replacing choices of a data point. Either `collection` or `organization` is
     *     required.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DataPointChoiceReplaceResponse replaceDataPointChoices(DataPointChoiceReplaceRequest body) {
        return replaceDataPointChoicesAsync(body).block();
    }

    /**
     * Returns your annotations.
     *
     * @param document Filter by document.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Paths1D5Zg6MV3AnnotationsGetResponses200ContentApplicationJsonSchema>>
            getAllAnnotationsWithResponseAsync(String document) {
        final String accept = "application/json";
        return service.getAllAnnotations(this.getRegion(), document, accept);
    }

    /**
     * Returns your annotations.
     *
     * @param document Filter by document.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Paths1D5Zg6MV3AnnotationsGetResponses200ContentApplicationJsonSchema> getAllAnnotationsAsync(
            String document) {
        return getAllAnnotationsWithResponseAsync(document)
                .flatMap(
                        (Response<Paths1D5Zg6MV3AnnotationsGetResponses200ContentApplicationJsonSchema> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Returns your annotations.
     *
     * @param document Filter by document.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Paths1D5Zg6MV3AnnotationsGetResponses200ContentApplicationJsonSchema getAllAnnotations(String document) {
        return getAllAnnotationsAsync(document).block();
    }

    /**
     * Create a annotation.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Annotation>> createAnnotationWithResponseAsync(AnnotationCreate body) {
        final String accept = "application/json";
        return service.createAnnotation(this.getRegion(), body, accept);
    }

    /**
     * Create a annotation.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Annotation> createAnnotationAsync(AnnotationCreate body) {
        return createAnnotationWithResponseAsync(body)
                .flatMap(
                        (Response<Annotation> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Create a annotation.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Annotation createAnnotation(AnnotationCreate body) {
        return createAnnotationAsync(body).block();
    }

    /**
     * Return a specific annotation.
     *
     * @param id Annotation's ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Annotation>> getAnnotationWithResponseAsync(int id) {
        final String accept = "application/json";
        return service.getAnnotation(this.getRegion(), id, accept);
    }

    /**
     * Return a specific annotation.
     *
     * @param id Annotation's ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Annotation> getAnnotationAsync(int id) {
        return getAnnotationWithResponseAsync(id)
                .flatMap(
                        (Response<Annotation> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Return a specific annotation.
     *
     * @param id Annotation's ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Annotation getAnnotation(int id) {
        return getAnnotationAsync(id).block();
    }

    /**
     * Update data of an annotation.
     *
     * @param id Annotation's ID.
     * @param body Annotation data to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Annotation>> updateAnnotationWithResponseAsync(int id, AnnotationUpdate body) {
        final String accept = "application/json";
        return service.updateAnnotation(this.getRegion(), id, body, accept);
    }

    /**
     * Update data of an annotation.
     *
     * @param id Annotation's ID.
     * @param body Annotation data to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Annotation> updateAnnotationAsync(int id, AnnotationUpdate body) {
        return updateAnnotationWithResponseAsync(id, body)
                .flatMap(
                        (Response<Annotation> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Update data of an annotation.
     *
     * @param id Annotation's ID.
     * @param body Annotation data to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Annotation updateAnnotation(int id, AnnotationUpdate body) {
        return updateAnnotationAsync(id, body).block();
    }

    /**
     * Deletes the specified annotation from the database.
     *
     * @param id Annotation's ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteAnnotationWithResponseAsync(int id) {
        final String accept = "application/json";
        return service.deleteAnnotation(this.getRegion(), id, accept);
    }

    /**
     * Deletes the specified annotation from the database.
     *
     * @param id Annotation's ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAnnotationAsync(int id) {
        return deleteAnnotationWithResponseAsync(id).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the specified annotation from the database.
     *
     * @param id Annotation's ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteAnnotation(int id) {
        deleteAnnotationAsync(id).block();
    }

    /**
     * Batch create annotations.
     *
     * @param body Array of AnnotationCreate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Annotation along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<List<Annotation>>> batchCreateAnnotationsWithResponseAsync(List<AnnotationCreate> body) {
        final String accept = "application/json";
        return service.batchCreateAnnotations(this.getRegion(), body, accept);
    }

    /**
     * Batch create annotations.
     *
     * @param body Array of AnnotationCreate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Annotation on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<List<Annotation>> batchCreateAnnotationsAsync(List<AnnotationCreate> body) {
        return batchCreateAnnotationsWithResponseAsync(body)
                .flatMap(
                        (Response<List<Annotation>> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Batch create annotations.
     *
     * @param body Array of AnnotationCreate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Annotation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<Annotation> batchCreateAnnotations(List<AnnotationCreate> body) {
        return batchCreateAnnotationsAsync(body).block();
    }

    /**
     * Batch update annotations.
     *
     * @param body Array of AnnotationBatchUpdate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Annotation along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<List<Annotation>>> batchUpdateAnnotationsWithResponseAsync(List<AnnotationBatchUpdate> body) {
        final String accept = "application/json";
        return service.batchUpdateAnnotations(this.getRegion(), body, accept);
    }

    /**
     * Batch update annotations.
     *
     * @param body Array of AnnotationBatchUpdate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Annotation on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<List<Annotation>> batchUpdateAnnotationsAsync(List<AnnotationBatchUpdate> body) {
        return batchUpdateAnnotationsWithResponseAsync(body)
                .flatMap(
                        (Response<List<Annotation>> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Batch update annotations.
     *
     * @param body Array of AnnotationBatchUpdate.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return array of Annotation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<Annotation> batchUpdateAnnotations(List<AnnotationBatchUpdate> body) {
        return batchUpdateAnnotationsAsync(body).block();
    }

    /**
     * Batch delete annotations.
     *
     * @param body Array of annotation IDs to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> batchDeleteAnnotationsWithResponseAsync(List<Integer> body) {
        final String accept = "application/json";
        return service.batchDeleteAnnotations(this.getRegion(), body, accept);
    }

    /**
     * Batch delete annotations.
     *
     * @param body Array of annotation IDs to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> batchDeleteAnnotationsAsync(List<Integer> body) {
        return batchDeleteAnnotationsWithResponseAsync(body).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Batch delete annotations.
     *
     * @param body Array of annotation IDs to be deleted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void batchDeleteAnnotations(List<Integer> body) {
        batchDeleteAnnotationsAsync(body).block();
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
        return service.getAllTags(this.getRegion(), limit, offset, workspace, accept);
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
        return service.createTag(this.getRegion(), body, accept);
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
        return service.getTag(this.getRegion(), id, accept);
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
    public Mono<Response<Tag>> updateTagWithResponseAsync(int id, TagUpdate body) {
        final String accept = "application/json";
        return service.updateTag(this.getRegion(), id, body, accept);
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
    public Mono<Tag> updateTagAsync(int id, TagUpdate body) {
        return updateTagWithResponseAsync(id, body)
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
    public Tag updateTag(int id, TagUpdate body) {
        return updateTagAsync(id, body).block();
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
        return service.deleteTag(this.getRegion(), id, accept);
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
        return service.getAllOrganizations(this.getRegion(), accept);
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
        return service.createOrganization(this.getRegion(), body, accept);
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
        return service.getOrganization(this.getRegion(), identifier, accept);
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
     * @param validationToolConfig Configuration of the embeddable validation tool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Organization>> updateOrganizationWithResponseAsync(
            String identifier,
            String name,
            Flux<ByteBuffer> avatar,
            Long contentLength,
            String resthookSignatureKey,
            ValidationToolConfig validationToolConfig) {
        final String accept = "application/json";
        return service.updateOrganization(
                this.getRegion(),
                identifier,
                name,
                avatar,
                contentLength,
                resthookSignatureKey,
                validationToolConfig,
                accept);
    }

    /**
     * Update the detail of an organization.
     *
     * @param identifier Organization identifier.
     * @param name The name parameter.
     * @param avatar Upload avatar for the organization.
     * @param contentLength The contentLength parameter.
     * @param resthookSignatureKey Used to sign webhook payloads so you can verify their integrity.
     * @param validationToolConfig Configuration of the embeddable validation tool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Organization> updateOrganizationAsync(
            String identifier,
            String name,
            Flux<ByteBuffer> avatar,
            Long contentLength,
            String resthookSignatureKey,
            ValidationToolConfig validationToolConfig) {
        return updateOrganizationWithResponseAsync(
                        identifier, name, avatar, contentLength, resthookSignatureKey, validationToolConfig)
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
     * @param validationToolConfig Configuration of the embeddable validation tool.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Organization updateOrganization(
            String identifier,
            String name,
            Flux<ByteBuffer> avatar,
            Long contentLength,
            String resthookSignatureKey,
            ValidationToolConfig validationToolConfig) {
        return updateOrganizationAsync(
                        identifier, name, avatar, contentLength, resthookSignatureKey, validationToolConfig)
                .block();
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
        return service.deleteOrganization(this.getRegion(), identifier, accept);
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
    public Mono<Response<PathsQ5Os5RV3OrganizationMembershipsGetResponses200ContentApplicationJsonSchema>>
            getAllOrganizationMembershipsWithResponseAsync(
                    Integer offset, Integer limit, String organization, OrganizationRole role) {
        final String accept = "application/json";
        return service.getAllOrganizationMemberships(this.getRegion(), offset, limit, organization, role, accept);
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
    public Mono<PathsQ5Os5RV3OrganizationMembershipsGetResponses200ContentApplicationJsonSchema>
            getAllOrganizationMembershipsAsync(
                    Integer offset, Integer limit, String organization, OrganizationRole role) {
        return getAllOrganizationMembershipsWithResponseAsync(offset, limit, organization, role)
                .flatMap(
                        (Response<PathsQ5Os5RV3OrganizationMembershipsGetResponses200ContentApplicationJsonSchema>
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
    public PathsQ5Os5RV3OrganizationMembershipsGetResponses200ContentApplicationJsonSchema
            getAllOrganizationMemberships(Integer offset, Integer limit, String organization, OrganizationRole role) {
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
        return service.getOrganizationMembership(this.getRegion(), identifier, accept);
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
        return service.updateOrganizationMembership(this.getRegion(), identifier, body, accept);
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
        return service.deleteOrganizationMembership(this.getRegion(), identifier, accept);
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
    public Mono<Response<Paths18Wh2VcV3InvitationsGetResponses200ContentApplicationJsonSchema>>
            getAllInvitationsWithResponseAsync(
                    Integer offset,
                    Integer limit,
                    String organization,
                    InvitationStatus status,
                    OrganizationRole role) {
        final String accept = "application/json";
        return service.getAllInvitations(this.getRegion(), offset, limit, organization, status, role, accept);
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
    public Mono<Paths18Wh2VcV3InvitationsGetResponses200ContentApplicationJsonSchema> getAllInvitationsAsync(
            Integer offset, Integer limit, String organization, InvitationStatus status, OrganizationRole role) {
        return getAllInvitationsWithResponseAsync(offset, limit, organization, status, role)
                .flatMap(
                        (Response<Paths18Wh2VcV3InvitationsGetResponses200ContentApplicationJsonSchema> res) -> {
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
    public Paths18Wh2VcV3InvitationsGetResponses200ContentApplicationJsonSchema getAllInvitations(
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
        return service.createInvitation(this.getRegion(), body, accept);
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
        return service.getInvitation(this.getRegion(), identifier, accept);
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
        return service.updateInvitation(this.getRegion(), identifier, body, accept);
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
        return service.deleteInvitation(this.getRegion(), identifier, accept);
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
        return service.getInvitationByToken(this.getRegion(), token, accept);
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
    public Mono<Response<Invitation>> respondToInvitationWithResponseAsync(String token, InvitationResponse body) {
        final String accept = "application/json";
        return service.respondToInvitation(this.getRegion(), token, body, accept);
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
    public Mono<Invitation> respondToInvitationAsync(String token, InvitationResponse body) {
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
    public Invitation respondToInvitation(String token, InvitationResponse body) {
        return respondToInvitationAsync(token, body).block();
    }

    /**
     * Returns your API users.
     *
     * @param organization Filter by organization.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Paths26Civ0V3ApiUsersGetResponses200ContentApplicationJsonSchema>>
            getAllApiUsersWithResponseAsync(String organization) {
        final String accept = "application/json";
        return service.getAllApiUsers(this.getRegion(), organization, accept);
    }

    /**
     * Returns your API users.
     *
     * @param organization Filter by organization.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Paths26Civ0V3ApiUsersGetResponses200ContentApplicationJsonSchema> getAllApiUsersAsync(
            String organization) {
        return getAllApiUsersWithResponseAsync(organization)
                .flatMap(
                        (Response<Paths26Civ0V3ApiUsersGetResponses200ContentApplicationJsonSchema> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Returns your API users.
     *
     * @param organization Filter by organization.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Paths26Civ0V3ApiUsersGetResponses200ContentApplicationJsonSchema getAllApiUsers(String organization) {
        return getAllApiUsersAsync(organization).block();
    }

    /**
     * Create an API user.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ApiUserWithKey>> createApiUserWithResponseAsync(ApiUserCreate body) {
        final String accept = "application/json";
        return service.createApiUser(this.getRegion(), body, accept);
    }

    /**
     * Create an API user.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ApiUserWithKey> createApiUserAsync(ApiUserCreate body) {
        return createApiUserWithResponseAsync(body)
                .flatMap(
                        (Response<ApiUserWithKey> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Create an API user.
     *
     * @param body The body parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiUserWithKey createApiUser(ApiUserCreate body) {
        return createApiUserAsync(body).block();
    }

    /**
     * Return a specific API user.
     *
     * @param id API user's ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ApiUserWithoutKey>> getApiUserWithResponseAsync(int id) {
        final String accept = "application/json";
        return service.getApiUser(this.getRegion(), id, accept);
    }

    /**
     * Return a specific API user.
     *
     * @param id API user's ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ApiUserWithoutKey> getApiUserAsync(int id) {
        return getApiUserWithResponseAsync(id)
                .flatMap(
                        (Response<ApiUserWithoutKey> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Return a specific API user.
     *
     * @param id API user's ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiUserWithoutKey getApiUser(int id) {
        return getApiUserAsync(id).block();
    }

    /**
     * Update data of an API user.
     *
     * @param id API user's ID.
     * @param body API user to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ApiUserWithoutKey>> updateApiUserWithResponseAsync(int id, ApiUserUpdate body) {
        final String accept = "application/json";
        return service.updateApiUser(this.getRegion(), id, body, accept);
    }

    /**
     * Update data of an API user.
     *
     * @param id API user's ID.
     * @param body API user to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ApiUserWithoutKey> updateApiUserAsync(int id, ApiUserUpdate body) {
        return updateApiUserWithResponseAsync(id, body)
                .flatMap(
                        (Response<ApiUserWithoutKey> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Update data of an API user.
     *
     * @param id API user's ID.
     * @param body API user to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiUserWithoutKey updateApiUser(int id, ApiUserUpdate body) {
        return updateApiUserAsync(id, body).block();
    }

    /**
     * Deletes the specified API user from the database.
     *
     * @param id API user's ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteApiUserWithResponseAsync(int id) {
        final String accept = "application/json";
        return service.deleteApiUser(this.getRegion(), id, accept);
    }

    /**
     * Deletes the specified API user from the database.
     *
     * @param id API user's ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteApiUserAsync(int id) {
        return deleteApiUserWithResponseAsync(id).flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the specified API user from the database.
     *
     * @param id API user's ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteApiUser(int id) {
        deleteApiUserAsync(id).block();
    }

    /**
     * Regenerate API key for an API user.
     *
     * @param id API user's ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ApiUserWithKey>> regenerateApiKeyForApiUserWithResponseAsync(int id) {
        final String accept = "application/json";
        return service.regenerateApiKeyForApiUser(this.getRegion(), id, accept);
    }

    /**
     * Regenerate API key for an API user.
     *
     * @param id API user's ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ApiUserWithKey> regenerateApiKeyForApiUserAsync(int id) {
        return regenerateApiKeyForApiUserWithResponseAsync(id)
                .flatMap(
                        (Response<ApiUserWithKey> res) -> {
                            if (res.getValue() != null) {
                                return Mono.just(res.getValue());
                            } else {
                                return Mono.empty();
                            }
                        });
    }

    /**
     * Regenerate API key for an API user.
     *
     * @param id API user's ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RequestErrorException thrown if the request is rejected by server.
     * @throws RequestErrorException thrown if the request is rejected by server on status code 400, 401.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ApiUserWithKey regenerateApiKeyForApiUser(int id) {
        return regenerateApiKeyForApiUserAsync(id).block();
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
    public Mono<Response<PathsVz5Kj2V3ResthookSubscriptionsGetResponses200ContentApplicationJsonSchema>>
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
    public Mono<PathsVz5Kj2V3ResthookSubscriptionsGetResponses200ContentApplicationJsonSchema>
            getAllResthookSubscriptionsAsync(Integer offset, Integer limit) {
        return getAllResthookSubscriptionsWithResponseAsync(offset, limit)
                .flatMap(
                        (Response<PathsVz5Kj2V3ResthookSubscriptionsGetResponses200ContentApplicationJsonSchema>
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
    public PathsVz5Kj2V3ResthookSubscriptionsGetResponses200ContentApplicationJsonSchema getAllResthookSubscriptions(
            Integer offset, Integer limit) {
        return getAllResthookSubscriptionsAsync(offset, limit).block();
    }

    /**
     * After a subscription is successfully created, we'll send a POST request to your target URL with a `X-Hook-Secret`
     * header. &lt;br /&gt; You need to response to this request with a 200 status code to confirm your subscribe
     * intention. &lt;br /&gt; Then, you need to use the `X-Hook-Secret` to activate the subscription using the
     * [/resthook_subscriptions/activate](#post-/v3/resthook_subscriptions/activate) endpoint. &lt;br /&gt; For more
     * information and detailed instructions, [see our webhooks documentation
     * here.](https://docs.affinda.com/docs/webhooks).
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
     * After a subscription is successfully created, we'll send a POST request to your target URL with a `X-Hook-Secret`
     * header. &lt;br /&gt; You need to response to this request with a 200 status code to confirm your subscribe
     * intention. &lt;br /&gt; Then, you need to use the `X-Hook-Secret` to activate the subscription using the
     * [/resthook_subscriptions/activate](#post-/v3/resthook_subscriptions/activate) endpoint. &lt;br /&gt; For more
     * information and detailed instructions, [see our webhooks documentation
     * here.](https://docs.affinda.com/docs/webhooks).
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
     * After a subscription is successfully created, we'll send a POST request to your target URL with a `X-Hook-Secret`
     * header. &lt;br /&gt; You need to response to this request with a 200 status code to confirm your subscribe
     * intention. &lt;br /&gt; Then, you need to use the `X-Hook-Secret` to activate the subscription using the
     * [/resthook_subscriptions/activate](#post-/v3/resthook_subscriptions/activate) endpoint. &lt;br /&gt; For more
     * information and detailed instructions, [see our webhooks documentation
     * here.](https://docs.affinda.com/docs/webhooks).
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
     * After creating a subscription, we'll send a POST request to your target URL with a `X-Hook-Secret` header. &lt;br
     * /&gt; You should response to this with a 200 status code, and use the value of the `X-Hook-Secret` header that
     * you received to activate the subscription using this endpoint.
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
     * After creating a subscription, we'll send a POST request to your target URL with a `X-Hook-Secret` header. &lt;br
     * /&gt; You should response to this with a 200 status code, and use the value of the `X-Hook-Secret` header that
     * you received to activate the subscription using this endpoint.
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
     * After creating a subscription, we'll send a POST request to your target URL with a `X-Hook-Secret` header. &lt;br
     * /&gt; You should response to this with a 200 status code, and use the value of the `X-Hook-Secret` header that
     * you received to activate the subscription using this endpoint.
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
            PathsM3DzbgV3JobDescriptionSearchEmbedPostRequestbodyContentApplicationJsonSchema body) {
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
            PathsM3DzbgV3JobDescriptionSearchEmbedPostRequestbodyContentApplicationJsonSchema body) {
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
            PathsM3DzbgV3JobDescriptionSearchEmbedPostRequestbodyContentApplicationJsonSchema body) {
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
    public Mono<Response<PathsDvrcp3V3IndexGetResponses200ContentApplicationJsonSchema>> getAllIndexesWithResponseAsync(
            Integer offset, Integer limit, Enum19 documentType) {
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
    public Mono<PathsDvrcp3V3IndexGetResponses200ContentApplicationJsonSchema> getAllIndexesAsync(
            Integer offset, Integer limit, Enum19 documentType) {
        return getAllIndexesWithResponseAsync(offset, limit, documentType)
                .flatMap(
                        (Response<PathsDvrcp3V3IndexGetResponses200ContentApplicationJsonSchema> res) -> {
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
    public PathsDvrcp3V3IndexGetResponses200ContentApplicationJsonSchema getAllIndexes(
            Integer offset, Integer limit, Enum19 documentType) {
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
    public Mono<Response<Paths1TvfqeiV3IndexPostResponses201ContentApplicationJsonSchema>> createIndexWithResponseAsync(
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
    public Mono<Paths1TvfqeiV3IndexPostResponses201ContentApplicationJsonSchema> createIndexAsync(
            IndexRequestBody body) {
        return createIndexWithResponseAsync(body)
                .flatMap(
                        (Response<Paths1TvfqeiV3IndexPostResponses201ContentApplicationJsonSchema> res) -> {
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
    public Paths1TvfqeiV3IndexPostResponses201ContentApplicationJsonSchema createIndex(IndexRequestBody body) {
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
    public Mono<Response<PathsO7SnenV3IndexNameDocumentsGetResponses200ContentApplicationJsonSchema>>
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
    public Mono<PathsO7SnenV3IndexNameDocumentsGetResponses200ContentApplicationJsonSchema> getAllIndexDocumentsAsync(
            String name) {
        return getAllIndexDocumentsWithResponseAsync(name)
                .flatMap(
                        (Response<PathsO7SnenV3IndexNameDocumentsGetResponses200ContentApplicationJsonSchema> res) -> {
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
    public PathsO7SnenV3IndexNameDocumentsGetResponses200ContentApplicationJsonSchema getAllIndexDocuments(
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
    public Mono<Response<PathsFte27NV3IndexNameDocumentsPostResponses201ContentApplicationJsonSchema>>
            createIndexDocumentWithResponseAsync(
                    String name, PathsCl024WV3IndexNameDocumentsPostRequestbodyContentApplicationJsonSchema body) {
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
    public Mono<PathsFte27NV3IndexNameDocumentsPostResponses201ContentApplicationJsonSchema> createIndexDocumentAsync(
            String name, PathsCl024WV3IndexNameDocumentsPostRequestbodyContentApplicationJsonSchema body) {
        return createIndexDocumentWithResponseAsync(name, body)
                .flatMap(
                        (Response<PathsFte27NV3IndexNameDocumentsPostResponses201ContentApplicationJsonSchema> res) -> {
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
    public PathsFte27NV3IndexNameDocumentsPostResponses201ContentApplicationJsonSchema createIndexDocument(
            String name, PathsCl024WV3IndexNameDocumentsPostRequestbodyContentApplicationJsonSchema body) {
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
            Paths1Czpnk1V3ResumeSearchEmbedPostRequestbodyContentApplicationJsonSchema body) {
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
            Paths1Czpnk1V3ResumeSearchEmbedPostRequestbodyContentApplicationJsonSchema body) {
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
            Paths1Czpnk1V3ResumeSearchEmbedPostRequestbodyContentApplicationJsonSchema body) {
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
}
