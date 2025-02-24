// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.customers

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.handlers.emptyHandler
import com.metronome.api.core.handlers.errorHandler
import com.metronome.api.core.handlers.jsonHandler
import com.metronome.api.core.handlers.withErrorHandler
import com.metronome.api.core.http.HttpMethod
import com.metronome.api.core.http.HttpRequest
import com.metronome.api.core.http.HttpResponse.Handler
import com.metronome.api.core.json
import com.metronome.api.core.prepareAsync
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.CustomerBillingConfigCreateParams
import com.metronome.api.models.CustomerBillingConfigDeleteParams
import com.metronome.api.models.CustomerBillingConfigRetrieveParams
import com.metronome.api.models.CustomerBillingConfigRetrieveResponse
import java.util.concurrent.CompletableFuture

class BillingConfigServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BillingConfigServiceAsync {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /** Set the billing configuration for a given customer. */
    override fun create(
        params: CustomerBillingConfigCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "customers",
                    params.getPathParam(0),
                    "billing-config",
                    params.getPathParam(1),
                )
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response -> response.use { createHandler.handle(it) } }
    }

    private val retrieveHandler: Handler<CustomerBillingConfigRetrieveResponse> =
        jsonHandler<CustomerBillingConfigRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Fetch the billing configuration for the given customer. */
    override fun retrieve(
        params: CustomerBillingConfigRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CustomerBillingConfigRetrieveResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "customers",
                    params.getPathParam(0),
                    "billing-config",
                    params.getPathParam(1),
                )
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /**
     * Delete the billing configuration for a given customer. Note: this is unsupported for Azure
     * and AWS Marketplace customers.
     */
    override fun delete(
        params: CustomerBillingConfigDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments(
                    "customers",
                    params.getPathParam(0),
                    "billing-config",
                    params.getPathParam(1),
                )
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response -> response.use { deleteHandler.handle(it) } }
    }
}
