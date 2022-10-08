# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]
### Fixed
- Document meta pages without images should be nullable

### Security
- Bumped package versions for patch reasons

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

