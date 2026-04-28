// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1.contracts

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
import com.metronome.api.core.prepare
import com.metronome.api.models.v1.contracts.namedschedules.NamedScheduleRetrieveParams
import com.metronome.api.models.v1.contracts.namedschedules.NamedScheduleRetrieveResponse
import com.metronome.api.models.v1.contracts.namedschedules.NamedScheduleUpdateParams
import java.util.function.Consumer

/**
 * Named schedules are used for storing custom data that can change over time. Named schedules are
 * often used in custom pricing logic.
 */
class NamedScheduleServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    NamedScheduleService {

    private val withRawResponse: NamedScheduleService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): NamedScheduleService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NamedScheduleService =
        NamedScheduleServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: NamedScheduleRetrieveParams,
        requestOptions: RequestOptions,
    ): NamedScheduleRetrieveResponse =
        // post /v1/contract-pricing/rate-cards/getNamedSchedule
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: NamedScheduleUpdateParams, requestOptions: RequestOptions) {
        // post /v1/contract-pricing/rate-cards/updateNamedSchedule
        withRawResponse().update(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NamedScheduleService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NamedScheduleService.WithRawResponse =
            NamedScheduleServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<NamedScheduleRetrieveResponse> =
            jsonHandler<NamedScheduleRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: NamedScheduleRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NamedScheduleRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contract-pricing", "rate-cards", "getNamedSchedule")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<Void?> = emptyHandler()

        override fun update(
            params: NamedScheduleUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "contract-pricing", "rate-cards", "updateNamedSchedule")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateHandler.handle(it) }
            }
        }
    }
}
