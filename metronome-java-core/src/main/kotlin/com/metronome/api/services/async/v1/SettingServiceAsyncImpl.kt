// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
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
import com.metronome.api.models.v1.settings.SettingUpsertAvalaraCredentialsParams
import com.metronome.api.models.v1.settings.SettingUpsertAvalaraCredentialsResponse
import com.metronome.api.services.async.v1.settings.BillingProviderServiceAsync
import com.metronome.api.services.async.v1.settings.BillingProviderServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class SettingServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SettingServiceAsync {

    private val withRawResponse: SettingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val billingProviders: BillingProviderServiceAsync by lazy {
        BillingProviderServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): SettingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SettingServiceAsync =
        SettingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun billingProviders(): BillingProviderServiceAsync = billingProviders

    override fun upsertAvalaraCredentials(
        params: SettingUpsertAvalaraCredentialsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SettingUpsertAvalaraCredentialsResponse> =
        // post /v1/upsertAvalaraCredentials
        withRawResponse().upsertAvalaraCredentials(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SettingServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val billingProviders: BillingProviderServiceAsync.WithRawResponse by lazy {
            BillingProviderServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SettingServiceAsync.WithRawResponse =
            SettingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun billingProviders(): BillingProviderServiceAsync.WithRawResponse =
            billingProviders

        private val upsertAvalaraCredentialsHandler:
            Handler<SettingUpsertAvalaraCredentialsResponse> =
            jsonHandler<SettingUpsertAvalaraCredentialsResponse>(clientOptions.jsonMapper)

        override fun upsertAvalaraCredentials(
            params: SettingUpsertAvalaraCredentialsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SettingUpsertAvalaraCredentialsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "upsertAvalaraCredentials")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { upsertAvalaraCredentialsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
