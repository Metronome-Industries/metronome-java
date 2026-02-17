// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1.customers

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
import com.metronome.api.core.prepare
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.V1CustomerBillingConfigCreateParams
import com.metronome.api.models.V1CustomerBillingConfigDeleteParams
import com.metronome.api.models.V1CustomerBillingConfigRetrieveParams
import com.metronome.api.models.V1CustomerBillingConfigRetrieveResponse

class BillingConfigServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BillingConfigService {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /**
     * Set the billing configuration for a given customer. This is a Plans (deprecated) endpoint.
     * New clients should implement using Contracts.
     */
    override fun create(
        params: V1CustomerBillingConfigCreateParams,
        requestOptions: RequestOptions,
    ) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "v1",
                    "customers",
                    params.getPathParam(0),
                    "billing-config",
                    params.getPathParam(1),
                )
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        response.use { createHandler.handle(it) }
    }

    private val retrieveHandler: Handler<V1CustomerBillingConfigRetrieveResponse> =
        jsonHandler<V1CustomerBillingConfigRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Fetch the billing configuration for the given customer. This is a Plans (deprecated)
     * endpoint. New clients should implement using Contracts.
     */
    override fun retrieve(
        params: V1CustomerBillingConfigRetrieveParams,
        requestOptions: RequestOptions,
    ): V1CustomerBillingConfigRetrieveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "v1",
                    "customers",
                    params.getPathParam(0),
                    "billing-config",
                    params.getPathParam(1),
                )
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /**
     * Delete the billing configuration for a given customer. Note: this is unsupported for Azure
     * and AWS Marketplace customers. This is a Plans (deprecated) endpoint. New clients should
     * implement using Contracts.
     */
    override fun delete(
        params: V1CustomerBillingConfigDeleteParams,
        requestOptions: RequestOptions,
    ) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments(
                    "v1",
                    "customers",
                    params.getPathParam(0),
                    "billing-config",
                    params.getPathParam(1),
                )
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        response.use { deleteHandler.handle(it) }
    }
}
