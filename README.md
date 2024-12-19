# Metronome Java API Library

<!-- x-release-please-start-version -->

[![Maven Central](https://img.shields.io/maven-central/v/com.metronome.api/metronome-java)](https://central.sonatype.com/artifact/com.metronome.api/metronome-java/0.0.1-alpha.0)

<!-- x-release-please-end -->

The Metronome Java SDK provides convenient access to the Metronome REST API from applications written in Java. It includes helper classes with helpful types and documentation for every request and response property.

The Metronome Java SDK is similar to the Metronome Kotlin SDK but with minor differences that make it more ergonomic for use in Java, such as `Optional` instead of nullable values, `Stream` instead of `Sequence`, and `CompletableFuture` instead of suspend functions.

It is generated with [Stainless](https://www.stainlessapi.com/).

## Documentation

The REST API documentation can be found on [docs.metronome.com](https://docs.metronome.com).

---

## Getting started

### Install dependencies

#### Gradle

<!-- x-release-please-start-version -->

```kotlin
implementation("com.metronome.api:metronome-java:0.0.1-alpha.0")
```

#### Maven

```xml
<dependency>
    <groupId>com.metronome.api</groupId>
    <artifactId>metronome-java</artifactId>
    <version>0.0.1-alpha.0</version>
</dependency>
```

<!-- x-release-please-end -->

### Configure the client

Use `MetronomeOkHttpClient.builder()` to configure the client. At a minimum you need to set `.bearerToken()`:

```java
import com.metronome.api.client.MetronomeClient;
import com.metronome.api.client.okhttp.MetronomeOkHttpClient;

MetronomeClient client = MetronomeOkHttpClient.builder()
    .bearerToken("My Bearer Token")
    .build();
```

Alternately, set the environment with `METRONOME_BEARER_TOKEN` or `METRONOME_WEBHOOK_SECRET`, and use `MetronomeOkHttpClient.fromEnv()` to read from the environment.

```java
import com.metronome.api.client.MetronomeClient;
import com.metronome.api.client.okhttp.MetronomeOkHttpClient;

MetronomeClient client = MetronomeOkHttpClient.fromEnv();

// Note: you can also call fromEnv() from the client builder, for example if you need to set additional properties
MetronomeClient client = MetronomeOkHttpClient.builder()
    .fromEnv()
    // ... set properties on the builder
    .build();
```

| Property      | Environment variable       | Required | Default value |
| ------------- | -------------------------- | -------- | ------------- |
| bearerToken   | `METRONOME_BEARER_TOKEN`   | true     | —             |
| webhookSecret | `METRONOME_WEBHOOK_SECRET` | false    | —             |

Read the documentation for more configuration options.

---

### Example: creating a resource

To create a new usage, first use the `UsageIngestParams` builder to specify attributes, then pass that to the `ingest` method of the `usage` service.

```java
import com.metronome.api.models.UsageIngestParams;
import java.util.List;

UsageIngestParams params = UsageIngestParams.builder()
    .usage(List.of(UsageIngestParams.Usage.builder()
        .customerId("team@example.com")
        .eventType("heartbeat")
        .timestamp("2021-01-01T00:00:00Z")
        .transactionId("2021-01-01T00:00:00Z_cluster42")
        .build()))
    .build();
client.usage().ingest(params)
```

### Example: listing resources

The Metronome API provides a `list` method to get a paginated list of products. You can retrieve the first page by:

```java
import com.metronome.api.models.ContractProductListPage;
import com.metronome.api.models.ContractProductListResponse;

ContractProductListPage page = client.contracts().products().list();
for (ContractProductListResponse product : page.data()) {
    System.out.println(product);
}
```

Use the `ContractProductListParams` builder to set parameters:

```java
import com.metronome.api.models.ContractProductListPage;
import com.metronome.api.models.ContractProductListParams;

ContractProductListParams params = ContractProductListParams.builder()
    .limit(1L)
    .nextPage("next_page")
    .archiveFilter(ContractProductListParams.ArchiveFilter.ARCHIVED)
    .build();
ContractProductListPage page1 = client.contracts().products().list(params);

// Using the `from` method of the builder you can reuse previous params values:
ContractProductListPage page2 = client.contracts().products().list(ContractProductListParams.builder()
    .from(params)
    .nextPage("abc123...")
    .build());

// Or easily get params for the next page by using the helper `getNextPageParams`:
ContractProductListPage page3 = client.contracts().products().list(params.getNextPageParams(page2));
```

See [Pagination](#pagination) below for more information on transparently working with lists of objects without worrying about fetching each page.

---

## Requests

### Parameters and bodies

To make a request to the Metronome API, you generally build an instance of the appropriate `Params` class.

In [Example: creating a resource](#example-creating-a-resource) above, we used the `ContractCreateParams.builder()` to pass to the `create` method of the `contracts` service.

Sometimes, the API may support other properties that are not yet supported in the Java SDK types. In that case, you can attach them using the `putAdditionalProperty` method.

```java
import com.metronome.api.core.JsonValue;
import com.metronome.api.models.ContractCreateParams;

ContractCreateParams params = ContractCreateParams.builder()
    // ... normal properties
    .putAdditionalProperty("secret_param", JsonValue.from("4242"))
    .build();
```

## Responses

### Response validation

When receiving a response, the Metronome Java SDK will deserialize it into instances of the typed model classes. In rare cases, the API may return a response property that doesn't match the expected Java type. If you directly access the mistaken property, the SDK will throw an unchecked `MetronomeInvalidDataException` at runtime. If you would prefer to check in advance that that response is completely well-typed, call `.validate()` on the returned model.

```java
import com.metronome.api.models.ContractCreateResponse;

ContractCreateResponse contract = client.contracts().create().validate();
```

### Response properties as JSON

In rare cases, you may want to access the underlying JSON value for a response property rather than using the typed version provided by this SDK. Each model property has a corresponding JSON version, with an underscore before the method name, which returns a `JsonField` value.

```java
import com.metronome.api.core.JsonField;
import java.util.Optional;

JsonField field = responseObj._field();

if (field.isMissing()) {
  // Value was not specified in the JSON response
} else if (field.isNull()) {
  // Value was provided as a literal null
} else {
  // See if value was provided as a string
  Optional<String> jsonString = field.asString();

  // If the value given by the API did not match the shape that the SDK expects
  // you can deserialise into a custom type
  MyClass myObj = responseObj._field().asUnknown().orElseThrow().convert(MyClass.class);
}
```

### Additional model properties

Sometimes, the server response may include additional properties that are not yet available in this library's types. You can access them using the model's `_additionalProperties` method:

```java
import com.metronome.api.core.JsonValue;

JsonValue secret = baseUsageFilter._additionalProperties().get("secret_field");
```

---

## Pagination

For methods that return a paginated list of results, this library provides convenient ways access the results either one page at a time, or item-by-item across all pages.

### Auto-pagination

To iterate through all results across all pages, you can use `autoPager`, which automatically handles fetching more pages for you:

### Synchronous

```java
import com.metronome.api.models.ContractProductListPage;
import com.metronome.api.models.ContractProductListResponse;

// As an Iterable:
ContractProductListPage page = client.contracts().products().list(params);
for (ContractProductListResponse product : page.autoPager()) {
    System.out.println(product);
};

// As a Stream:
client.contracts().products().list(params).autoPager().stream()
    .limit(50)
    .forEach(product -> System.out.println(product));
```

### Asynchronous

```java
// Using forEach, which returns CompletableFuture<Void>:
asyncClient.contracts().products().list(params).autoPager()
    .forEach(product -> System.out.println(product), executor);
```

### Manual pagination

If none of the above helpers meet your needs, you can also manually request pages one-by-one. A page of results has a `data()` method to fetch the list of objects, as well as top-level `response` and other methods to fetch top-level data about the page. It also has methods `hasNextPage`, `getNextPage`, and `getNextPageParams` methods to help with pagination.

```java
import com.metronome.api.models.ContractProductListPage;
import com.metronome.api.models.ContractProductListResponse;

ContractProductListPage page = client.contracts().products().list(params);
while (page != null) {
    for (ContractProductListResponse product : page.data()) {
        System.out.println(product);
    }

    page = page.getNextPage().orElse(null);
}
```

---

## Error handling

This library throws exceptions in a single hierarchy for easy handling:

- **`MetronomeException`** - Base exception for all exceptions

- **`MetronomeServiceException`** - HTTP errors with a well-formed response body we were able to parse. The exception message and the `.debuggingRequestId()` will be set by the server.

  | 400    | BadRequestException           |
  | ------ | ----------------------------- |
  | 401    | AuthenticationException       |
  | 403    | PermissionDeniedException     |
  | 404    | NotFoundException             |
  | 422    | UnprocessableEntityException  |
  | 429    | RateLimitException            |
  | 5xx    | InternalServerException       |
  | others | UnexpectedStatusCodeException |

- **`MetronomeIoException`** - I/O networking errors
- **`MetronomeInvalidDataException`** - any other exceptions on the client side, e.g.:
  - We failed to serialize the request body
  - We failed to parse the response body (has access to response code and body)

## Network options

### Retries

Requests that experience certain errors are automatically retried 2 times by default, with a short exponential backoff. Connection errors (for example, due to a network connectivity problem), 408 Request Timeout, 409 Conflict, 429 Rate Limit, and >=500 Internal errors will all be retried by default. You can provide a `maxRetries` on the client builder to configure this:

```java
import com.metronome.api.client.MetronomeClient;
import com.metronome.api.client.okhttp.MetronomeOkHttpClient;

MetronomeClient client = MetronomeOkHttpClient.builder()
    .fromEnv()
    .maxRetries(4)
    .build();
```

### Timeouts

Requests time out after 1 minute by default. You can configure this on the client builder:

```java
import com.metronome.api.client.MetronomeClient;
import com.metronome.api.client.okhttp.MetronomeOkHttpClient;
import java.time.Duration;

MetronomeClient client = MetronomeOkHttpClient.builder()
    .fromEnv()
    .timeout(Duration.ofSeconds(30))
    .build();
```

### Proxies

Requests can be routed through a proxy. You can configure this on the client builder:

```java
import com.metronome.api.client.MetronomeClient;
import com.metronome.api.client.okhttp.MetronomeOkHttpClient;
import java.net.InetSocketAddress;
import java.net.Proxy;

MetronomeClient client = MetronomeOkHttpClient.builder()
    .fromEnv()
    .proxy(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("example.com", 8080)))
    .build();
```

## Making custom/undocumented requests

This library is typed for convenient access to the documented API. If you need to access undocumented params or response properties, the library can still be used.

### Undocumented request params

To make requests using undocumented parameters, you can provide or override parameters on the params object while building it.

```kotlin
FooCreateParams address = FooCreateParams.builder()
    .id("my_id")
    .putAdditionalProperty("secret_prop", JsonValue.from("hello"))
    .build();
```

### Undocumented response properties

To access undocumented response properties, you can use `res._additionalProperties()` on a response object to get a map of untyped fields of type `Map<String, JsonValue>`. You can then access fields like `._additionalProperties().get("secret_prop").asString()` or use other helpers defined on the `JsonValue` class to extract it to a desired type.

## Logging

We use the standard [OkHttp logging interceptor](https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor).

You can enable logging by setting the environment variable `METRONOME_LOG` to `info`.

```sh
$ export METRONOME_LOG=info
```

Or to `debug` for more verbose logging.

```sh
$ export METRONOME_LOG=debug
```

## Semantic versioning

This package generally follows [SemVer](https://semver.org/spec/v2.0.0.html) conventions, though certain backwards-incompatible changes may be released as minor versions:

1. Changes to library internals which are technically public but not intended or documented for external use. _(Please open a GitHub issue to let us know if you are relying on such internals)_.
2. Changes that we do not expect to impact the vast majority of users in practice.

We take backwards-compatibility seriously and work hard to ensure you can rely on a smooth upgrade experience.

We are keen for your feedback; please open an [issue](https://www.github.com/Metronome-Industries/metronome-java/issues) with questions, bugs, or suggestions.

## Requirements

This library requires Java 8 or later.
