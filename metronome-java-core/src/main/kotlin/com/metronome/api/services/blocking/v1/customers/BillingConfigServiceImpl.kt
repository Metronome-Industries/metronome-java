// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1.customers

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
import com.metronome.api.models.v1.customers.billingconfig.BillingConfigCreateParams
import com.metronome.api.models.v1.customers.billingconfig.BillingConfigDeleteParams
import com.metronome.api.models.v1.customers.billingconfig.BillingConfigRetrieveParams
import com.metronome.api.models.v1.customers.billingconfig.BillingConfigRetrieveResponse
import java.util.function.Consumer

class BillingConfigServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BillingConfigService {

    private val withRawResponse: BillingConfigService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BillingConfigService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BillingConfigService =
        BillingConfigServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: BillingConfigCreateParams, requestOptions: RequestOptions) {
        // post /v1/customers/{customer_id}/billing-config/{billing_provider_type}
        withRawResponse().create(params, requestOptions)
    }

    override fun retrieve(
        params: BillingConfigRetrieveParams,
        requestOptions: RequestOptions,
    ): BillingConfigRetrieveResponse =
        // get /v1/customers/{customer_id}/billing-config/{billing_provider_type}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun delete(params: BillingConfigDeleteParams, requestOptions: RequestOptions) {
        // delete /v1/customers/{customer_id}/billing-config/{billing_provider_type}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BillingConfigService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BillingConfigService.WithRawResponse =
            BillingConfigServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Void?> = emptyHandler()

        override fun create(
            params: BillingConfigCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "customers",
                        params._pathParam(0),
                        "billing-config",
                        params._pathParam(1),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { createHandler.handle(it) }
            }
        }

        private val retrieveHandler: Handler<BillingConfigRetrieveResponse> =
            jsonHandler<BillingConfigRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: BillingConfigRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BillingConfigRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "customers",
                        params._pathParam(0),
                        "billing-config",
                        params._pathParam(1),
                    )
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: BillingConfigDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "customers",
                        params._pathParam(0),
                        "billing-config",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }
    }
}
