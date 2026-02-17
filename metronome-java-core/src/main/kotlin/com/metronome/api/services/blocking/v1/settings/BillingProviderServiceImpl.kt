// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1.settings

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.handlers.errorHandler
import com.metronome.api.core.handlers.jsonHandler
import com.metronome.api.core.handlers.withErrorHandler
import com.metronome.api.core.http.HttpMethod
import com.metronome.api.core.http.HttpRequest
import com.metronome.api.core.http.HttpResponse.Handler
import com.metronome.api.core.json
import com.metronome.api.core.prepare
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.V1SettingBillingProviderCreateParams
import com.metronome.api.models.V1SettingBillingProviderCreateResponse
import com.metronome.api.models.V1SettingBillingProviderListPage
import com.metronome.api.models.V1SettingBillingProviderListParams

class BillingProviderServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BillingProviderService {

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
    ): V1SettingBillingProviderCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "setUpBillingProvider")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<V1SettingBillingProviderListPage.Response> =
        jsonHandler<V1SettingBillingProviderListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Lists all configured billing providers and their delivery method configurations for your
     * account. Returns provider details, delivery method IDs, and configuration settings needed for
     * mapping individual customer contracts to billing integrations.
     */
    override fun list(
        params: V1SettingBillingProviderListParams,
        requestOptions: RequestOptions,
    ): V1SettingBillingProviderListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "listConfiguredBillingProviders")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
            .let { V1SettingBillingProviderListPage.of(this, params, it) }
    }
}
