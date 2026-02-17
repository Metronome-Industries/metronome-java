// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1

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
import com.metronome.api.models.V1SettingUpsertAvalaraCredentialsParams
import com.metronome.api.models.V1SettingUpsertAvalaraCredentialsResponse
import com.metronome.api.services.async.v1.settings.BillingProviderServiceAsync
import com.metronome.api.services.async.v1.settings.BillingProviderServiceAsyncImpl
import java.util.concurrent.CompletableFuture

class SettingServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SettingServiceAsync {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val billingProviders: BillingProviderServiceAsync by lazy {
        BillingProviderServiceAsyncImpl(clientOptions)
    }

    override fun billingProviders(): BillingProviderServiceAsync = billingProviders

    private val upsertAvalaraCredentialsHandler:
        Handler<V1SettingUpsertAvalaraCredentialsResponse> =
        jsonHandler<V1SettingUpsertAvalaraCredentialsResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Set the Avalara credentials for some specified `delivery_method_ids`, which can be found in
     * the `/listConfiguredBillingProviders` response. This maps the Avalara credentials to the
     * appropriate billing entity. These credentials are only used for PLG Invoicing today.
     */
    override fun upsertAvalaraCredentials(
        params: V1SettingUpsertAvalaraCredentialsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V1SettingUpsertAvalaraCredentialsResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "upsertAvalaraCredentials")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { upsertAvalaraCredentialsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}
