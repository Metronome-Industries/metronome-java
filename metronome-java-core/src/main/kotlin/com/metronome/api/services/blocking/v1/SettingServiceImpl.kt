// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1

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
import com.metronome.api.core.prepare
import com.metronome.api.models.v1.settings.SettingUpsertAvalaraCredentialsParams
import com.metronome.api.models.v1.settings.SettingUpsertAvalaraCredentialsResponse
import com.metronome.api.services.blocking.v1.settings.BillingProviderService
import com.metronome.api.services.blocking.v1.settings.BillingProviderServiceImpl
import java.util.function.Consumer

class SettingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SettingService {

    private val withRawResponse: SettingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val billingProviders: BillingProviderService by lazy {
        BillingProviderServiceImpl(clientOptions)
    }

    override fun withRawResponse(): SettingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SettingService =
        SettingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun billingProviders(): BillingProviderService = billingProviders

    override fun upsertAvalaraCredentials(
        params: SettingUpsertAvalaraCredentialsParams,
        requestOptions: RequestOptions,
    ): SettingUpsertAvalaraCredentialsResponse =
        // post /v1/upsertAvalaraCredentials
        withRawResponse().upsertAvalaraCredentials(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SettingService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val billingProviders: BillingProviderService.WithRawResponse by lazy {
            BillingProviderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SettingService.WithRawResponse =
            SettingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun billingProviders(): BillingProviderService.WithRawResponse = billingProviders

        private val upsertAvalaraCredentialsHandler:
            Handler<SettingUpsertAvalaraCredentialsResponse> =
            jsonHandler<SettingUpsertAvalaraCredentialsResponse>(clientOptions.jsonMapper)

        override fun upsertAvalaraCredentials(
            params: SettingUpsertAvalaraCredentialsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SettingUpsertAvalaraCredentialsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "upsertAvalaraCredentials")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
