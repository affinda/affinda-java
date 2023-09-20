# Java Client Library for Affinda Resume Parser API

![affinda logo](https://api.affinda.com/static/documentation/affinda_logo_light.png)
[![license](https://img.shields.io/github/license/affinda/affinda-java)](https://choosealicense.com/licenses/mit/)

Generated using [autorest](https://github.com/Azure/autorest) and [autorest.java](https://github.com/Azure/autorest.java).
[![Open in Visual Studio Code](https://open.vscode.dev/badges/open-in-vscode.svg)](https://open.vscode.dev/affinda/affinda-java)

## Installation

### Maven

```xml
<dependencies>
  <dependency>
    <groupId>com.affinda.api</groupId>
    <artifactId>affinda-api-client</artifactId>
    <version>3.6.1</version>
  </dependency>
</dependencies>
```

### Gradle

```
repositories {
    mavenCentral()
}

dependencies {
    implementation("com.affinda.api:affinda-api-client:<version>")
}
```

## API Version Compatibility

The Affinda API is currently on `v3`, with breaking changes meant the release of new versions of the client library.
Please see below for which versions are compatible with which API version.

| Affinda API version | `affinda-java` versions |
| ------------------- | ----------------------- |
| v2                  | 0.1.0 - 2.x.x           |
| v3                  | \>= 3.x.x               |
