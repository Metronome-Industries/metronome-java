// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.handlers.emptyHandler
import com.metronome.api.core.handlers.errorBodyHandler
import com.metronome.api.core.handlers.errorHandler
import com.metronome.api.core.handlers.jsonHandler
import com.metronome.api.core.http.HttpMethod
import com.metronome.api.core.http.HttpRequest
import com.metronome.api.core.http.HttpResponse
import com.metronome.api.core.http.HttpResponse.Handler
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.core.http.json
import com.metronome.api.core.http.parseable
import com.metronome.api.core.prepareAsync
import com.metronome.api.models.v1.customfields.CustomFieldAddKeyParams
import com.metronome.api.models.v1.customfields.CustomFieldDeleteValuesParams
import com.metronome.api.models.v1.customfields.CustomFieldListKeysPageAsync
import com.metronome.api.models.v1.customfields.CustomFieldListKeysPageResponse
import com.metronome.api.models.v1.customfields.CustomFieldListKeysParams
import com.metronome.api.models.v1.customfields.CustomFieldRemoveKeyParams
import com.metronome.api.models.v1.customfields.CustomFieldSetValuesParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class CustomFieldServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CustomFieldServiceAsync {

    private val withRawResponse: CustomFieldServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CustomFieldServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomFieldServiceAsync =
        CustomFieldServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun addKey(
        params: CustomFieldAddKeyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /v1/customFields/addKey
        withRawResponse().addKey(params, requestOptions).thenAccept {}

    override fun deleteValues(
        params: CustomFieldDeleteValuesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /v1/customFields/deleteValues
        withRawResponse().deleteValues(params, requestOptions).thenAccept {}

    override fun listKeys(
        params: CustomFieldListKeysParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomFieldListKeysPageAsync> =
        // post /v1/customFields/listKeys
        withRawResponse().listKeys(params, requestOptions).thenApply { it.parse() }

    override fun removeKey(
        params: CustomFieldRemoveKeyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /v1/customFields/removeKey
        withRawResponse().removeKey(params, requestOptions).thenAccept {}

    override fun setValues(
        params: CustomFieldSetValuesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /v1/customFields/setValues
        withRawResponse().setValues(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CustomFieldServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CustomFieldServiceAsync.WithRawResponse =
            CustomFieldServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val addKeyHandler: Handler<Void?> = emptyHandler()

        override fun addKey(
            params: CustomFieldAddKeyParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "customFields", "addKey")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { addKeyHandler.handle(it) }
                    }
                }
        }

        private val deleteValuesHandler: Handler<Void?> = emptyHandler()

        override fun deleteValues(
            params: CustomFieldDeleteValuesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "customFields", "deleteValues")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteValuesHandler.handle(it) }
                    }
                }
        }

        private val listKeysHandler: Handler<CustomFieldListKeysPageResponse> =
            jsonHandler<CustomFieldListKeysPageResponse>(clientOptions.jsonMapper)

        override fun listKeys(
            params: CustomFieldListKeysParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CustomFieldListKeysPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "customFields", "listKeys")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listKeysHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                CustomFieldListKeysPageAsync.builder()
                                    .service(CustomFieldServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val removeKeyHandler: Handler<Void?> = emptyHandler()

        override fun removeKey(
            params: CustomFieldRemoveKeyParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "customFields", "removeKey")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { removeKeyHandler.handle(it) }
                    }
                }
        }

        private val setValuesHandler: Handler<Void?> = emptyHandler()

        override fun setValues(
            params: CustomFieldSetValuesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "customFields", "setValues")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { setValuesHandler.handle(it) }
                    }
                }
        }
    }
}
