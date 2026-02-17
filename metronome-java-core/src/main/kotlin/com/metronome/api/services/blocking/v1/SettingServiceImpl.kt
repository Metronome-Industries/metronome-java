// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1

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
import com.metronome.api.models.V1SettingUpsertAvalaraCredentialsParams
import com.metronome.api.models.V1SettingUpsertAvalaraCredentialsResponse
import com.metronome.api.services.blocking.v1.settings.BillingProviderService
import com.metronome.api.services.blocking.v1.settings.BillingProviderServiceImpl

class SettingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SettingService {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val billingProviders: BillingProviderService by lazy {
        BillingProviderServiceImpl(clientOptions)
    }

    override fun billingProviders(): BillingProviderService = billingProviders

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
    ): V1SettingUpsertAvalaraCredentialsResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "upsertAvalaraCredentials")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { upsertAvalaraCredentialsHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
