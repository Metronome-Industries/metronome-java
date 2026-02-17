// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1.settings

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.handlers.errorHandler
import com.metronome.api.core.handlers.jsonHandler
import com.metronome.api.core.handlers.withErrorHandler
import com.metronome.api.core.http.HttpMethod
import com.metronome.api.core.http.HttpRequest
import com.metronome.api.core.http.HttpResponse.Handler
import com.metronome.api.core.json
import com.metronome.api.core.prepareAsync
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.V1SettingBillingProviderCreateParams
import com.metronome.api.models.V1SettingBillingProviderCreateResponse
import com.metronome.api.models.V1SettingBillingProviderListPageAsync
import com.metronome.api.models.V1SettingBillingProviderListParams
import java.util.concurrent.CompletableFuture

class BillingProviderServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : BillingProviderServiceAsync {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<V1SettingBillingProviderCreateResponse> =
        jsonHandler<V1SettingBillingProviderCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Set up account-level configuration for a billing provider. Once configured, individual
     * contracts across customers can be mapped to this configuration using the returned
     * delivery_method_id.
     */
    override fun create(
        params: V1SettingBillingProviderCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1SettingBillingProviderCreateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "setUpBillingProvider")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val listHandler: Handler<V1SettingBillingProviderListPageAsync.Response> =
        jsonHandler<V1SettingBillingProviderListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Lists all configured billing providers and their delivery method configurations for your
     * account. Returns provider details, delivery method IDs, and configuration settings needed for
     * mapping individual customer contracts to billing integrations.
     */
    override fun list(
        params: V1SettingBillingProviderListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1SettingBillingProviderListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "listConfiguredBillingProviders")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
                    .let { V1SettingBillingProviderListPageAsync.of(this, params, it) }
            }
    }
}
