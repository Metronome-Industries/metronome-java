// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1.settings

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
import com.metronome.api.models.v1.settings.billingproviders.BillingProviderCreateParams
import com.metronome.api.models.v1.settings.billingproviders.BillingProviderCreateResponse
import com.metronome.api.models.v1.settings.billingproviders.BillingProviderListParams
import com.metronome.api.models.v1.settings.billingproviders.BillingProviderListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Use these endpoints to configure a billing API key, a webhook secret, or invoice finalization
 * behavior.
 */
class BillingProviderServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : BillingProviderServiceAsync {

    private val withRawResponse: BillingProviderServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BillingProviderServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): BillingProviderServiceAsync =
        BillingProviderServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: BillingProviderCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillingProviderCreateResponse> =
        // post /v1/setUpBillingProvider
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: BillingProviderListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BillingProviderListResponse> =
        // post /v1/listConfiguredBillingProviders
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BillingProviderServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BillingProviderServiceAsync.WithRawResponse =
            BillingProviderServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<BillingProviderCreateResponse> =
            jsonHandler<BillingProviderCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: BillingProviderCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillingProviderCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "setUpBillingProvider")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<BillingProviderListResponse> =
            jsonHandler<BillingProviderListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: BillingProviderListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BillingProviderListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "listConfiguredBillingProviders")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
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
