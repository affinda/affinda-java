# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

## [3.5.0] - 2023-06-09
### Added
- Ability to post/patch languages for resumes in v2
- Add `include_public` parameter to /data_points endpoint
- Add `base_extractor` parameter to collection creation endpoint

### Changed
- Make `extractor` a non required field (internal use)

## [3.4.0] - 2023-06-07
### Added
- Add `Organization.validationToolConfig` for configuration of the embeddable validation tool
- Phone number details to Resume Candidate info
- Add some filters to `GET /documents` endpoint: `failed`, `ready`, `validatable`
- Custom fields to Job Descriptions
- Add custom data to job description search results
- Add international_country_code to phone number details
- Endpoints for add/remove tag for documents
- Identifier field in DocumentUpdate model
- Allow setting `region_bias` when uploading document
- rawText field to JobDescription Model
- Required fields for resthook subscriptions
- Add `fieldsLayout` to `Collection` schema

### Changed
- Provide additional filters for data point choices, and allow data point choices to be specified for any existing text field.
- Allow custom resume fields to be nullable
- Allow custom job description fields to be nullable
- Make "pdf" property in SearchResults nullable
- Nest line item table rows correctly.
- Nest line item table rows correctly.

### Removed
- Remove `include_child` filter from `/data_points` endpoint

### Fixed
- Update python_requires to be PEP compliant

### Deprecated
- Deprecate `Collection.fields` in favor of `Collection.fieldsLayout`

## [3.3.1] - 2023-04-20
### Added
- Add `whitelistIngestAddresses` to Workspace

### Fixed
- Make search config action fields required
- Allow rejectDuplicates to be null

### Changed
- rawText is now not nullable
- OccupationGroupSearchResult.children is now optional

### Security
- Bump jackson-databind version due to CVE-2022-42003

## [3.3.0] - 2023-03-28
### Added
- Adding group annotation content type
- Add rejectDuplicates setting to workspace
- Add `hideToolbar` to resume & JD search config
- Add ExtractorConfig object to Collection

## [3.2.0] - 2023-03-20
### Fixed
- fixed - Use OccupationGroupResult for v3 SearchAndMatch detail
- Fixed return type for InvoiceData.currencyCode

### Changed
- Don't require Field.slug

### Added
- Add redactedText field to ResumeData

## [3.1.0] - 2023-03-15
### Fixed
- Fixed type and path of data_point and data_point_choices
- Fixed missing data field on base Document type
- Fixed search and match return types
- fixed document error return types
- Ensure list endpoints have 'results' and 'count' properties required

### Changed
- Minor re-ordering of API spec paths
- Change Document API tag from Document API - Upload Documents to Document API - Document

## [3.0.1] - 2023-03-10
### Fixed
- Fixed resume search response object

## [3.0.0] - 2023-03-09
### Added
- Add resthook subscription endpoints
- Add link to affinda help docs for resthook creation

### Changed
- Remove extractor's `id` field, use `identifier` field instead

### Removed
- Remove extractor's `id` field
- Removed v2 endpoints

## [1.1.0] - 2023-02-06
### Added
- Add document.collection.extractor.identifier to DocumentMeta
- Add cell to valid content types
- Add EU API server to api docs
- Add latitude and longtitude to Location
- Add expectedremuneration, jobtitle, language, skill and yearsexperience to AnnotationContentType
- re-add DataPoint.simlarTo
- Add `exclude` parameter to /documents query
- add ingest email to Workspace and Collection

### Changed
- Updated endpoints for old v2 and newer v3 to point to the correct places.
- Changed Document top level structure to more closely resemble api v2 with top level keys of meta, data and error
- ResumeSearchParamaters.resume, ResumeSearchParameters.jobdescription, JobDescriptionSearchParameters.resume, DataPoint.organization

### Fixed
- Fixed various nullable fields not being nullable, and vice versa

### Removed
- Master/child accounts endpoints

### Deprecated
- Remove create_user example as endpoint is deprecated

### Security
- Updated jackson-databind to 2.13.4 due to CVE-2022-42004

## [1.0.0] - 2023-01-13
### Added
- Added endpoints: Organization, Membership, Invitation, tags
- Added name, organization to DataPoint, change id to identifier
- Add new objects schemas Organization, OrganizationMembership, Invitation

### Changed
- Identifier instead of id as URL param
- Update data point filters
- Allow unlimited nesting in field config
- Change document state from "export" to "archive"

### Fixed
- Collection identifier should be nullable
- Don't paginate extractors endpoint
- Fix avatar uploads
- Allow writing resthookSignatureKey

## [0.8.0] - 2023-01-12
* Yanked as this was a breaking release, see newer release for more info

## [0.7.0] - 2023-01-10
### Added
- Add rectangles to Annotation, add position to referee, add actions to JobDescriptionSearchConfig

## [0.6.0] - 2023-01-09
### Changed
- Allowing a few more fields in ResumeData to be null

### Fixed
- Bump version to force new release

## [0.5.0] - 2022-11-21
### Fixed
- Document meta pages without images should be nullable
- Small fixes for accreditiation and education return objects
- Various nullable fields in the API spec

### Security
- Bumped package versions for patch reasons

### Added
- Add reject_duplicates to document upload endpoint
- XML 404 response schema
- CustomData to resume search spec
- suggest skills and job titles endpoints

### Changed
- Update spec to allow XML content-type return from resumes, make totalYearsExperience nullable
- Allow additonalproperties for custom data upload (resumes) and search

## [0.4.2] - 2022-09-23
### Changed
- Update API spec to match API response.

## [0.4.1] - 2022-09-23
### Fixed
- Change casing of some invoice properties
- Update nullable property for various fields

## [0.4.0] - 2022-09-20
### Added
- Reverse match functionality - search job descriptions with a resume, or with a set of parameters.
- Add job description search config and embed endpoints
- Update index endpoint with document type parameter

### Changed
- Update types of objects for some endpoints using AllOf attributes for better client library generation
- Changed and updated tag order to better match documentation needs

## [0.3.1] - 2022-08-18
### Changed
- Updated dependencies

## [0.3.0] - 2022-08-18
### Changed
- Updated dependencies
- Update modelerfour version to latest

### Added
- Job Description from API spec
- Resume search
- Prediction confidence
- Review URL in the invoice response that allows embedding of the Affinda Invoice Review UI
- Ability to update resume data in the search system
- New endpoint for creating and managing users within a master account
- Ability to find other candidates that have similar attributes to a resume
- Endpoint to get the matching score between a resume and a job description
- Reverse Match endpoint

### Fixed
- Make expiry time native date time

### Deprecated
- Depreciated resume_formats and reformatted_resumes endpoints

## [0.2.0] - 2021-10-06
### Added
- Invoices endpoint

### Removed
- Removed 'url' format from url strings in api spec

## [0.1.0] - 2021-04-01
### Added
- First beta build
