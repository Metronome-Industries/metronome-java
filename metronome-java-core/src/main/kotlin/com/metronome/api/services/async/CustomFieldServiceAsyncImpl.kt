// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpMethod
import com.metronome.api.core.http.HttpRequest
import com.metronome.api.core.http.HttpResponse.Handler
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.CustomFieldAddKeyParams
import com.metronome.api.models.CustomFieldDeleteValuesParams
import com.metronome.api.models.CustomFieldListKeysParams
import com.metronome.api.models.CustomFieldListKeysResponse
import com.metronome.api.models.CustomFieldRemoveKeyParams
import com.metronome.api.models.CustomFieldSetValuesParams
import com.metronome.api.services.emptyHandler
import com.metronome.api.services.errorHandler
import com.metronome.api.services.json
import com.metronome.api.services.jsonHandler
import com.metronome.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class CustomFieldServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : CustomFieldServiceAsync {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val addKeyHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /**
     * Add a key to the allow list for a given entity. There is a 100 character limit on custom
     * field keys.
     */
    override fun addKey(
        params: CustomFieldAddKeyParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Void> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("customFields", "addKey")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response.use { addKeyHandler.handle(it) }
        }
    }

    private val deleteValuesHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /** Deletes one or more custom fields on an instance of a Metronome entity. */
    override fun deleteValues(
        params: CustomFieldDeleteValuesParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Void> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("customFields", "deleteValues")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response.use { deleteValuesHandler.handle(it) }
        }
    }

    private val listKeysHandler: Handler<CustomFieldListKeysResponse> =
        jsonHandler<CustomFieldListKeysResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List all active custom field keys, optionally filtered by entity type. */
    override fun listKeys(
        params: CustomFieldListKeysParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CustomFieldListKeysResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("customFields", "listKeys")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listKeysHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val removeKeyHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /** Remove a key from the allow list for a given entity. */
    override fun removeKey(
        params: CustomFieldRemoveKeyParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Void> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("customFields", "removeKey")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response.use { removeKeyHandler.handle(it) }
        }
    }

    private val setValuesHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /**
     * Sets one or more custom fields on an instance of a Metronome entity. If a key/value pair
     * passed in this request matches one already set on the entity, its value will be overwritten.
     * Any key/value pairs that exist on the entity that do not match those passed in this request
     * will remain untouched. This endpoint is transactional and will update all key/value pairs or
     * no key/value pairs. Partial updates are not supported. There is a 200 character limit on
     * custom field values.
     */
    override fun setValues(
        params: CustomFieldSetValuesParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Void> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("customFields", "setValues")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response.use { setValuesHandler.handle(it) }
        }
    }
}
