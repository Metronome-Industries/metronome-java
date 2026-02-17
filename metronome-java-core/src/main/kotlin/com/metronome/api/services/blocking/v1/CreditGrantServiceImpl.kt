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
import com.metronome.api.models.v1.creditgrants.CreditGrantCreateParams
import com.metronome.api.models.v1.creditgrants.CreditGrantCreateResponse
import com.metronome.api.models.v1.creditgrants.CreditGrantEditParams
import com.metronome.api.models.v1.creditgrants.CreditGrantEditResponse
import com.metronome.api.models.v1.creditgrants.CreditGrantListEntriesPage
import com.metronome.api.models.v1.creditgrants.CreditGrantListEntriesPageResponse
import com.metronome.api.models.v1.creditgrants.CreditGrantListEntriesParams
import com.metronome.api.models.v1.creditgrants.CreditGrantListPage
import com.metronome.api.models.v1.creditgrants.CreditGrantListPageResponse
import com.metronome.api.models.v1.creditgrants.CreditGrantListParams
import com.metronome.api.models.v1.creditgrants.CreditGrantVoidParams
import com.metronome.api.models.v1.creditgrants.CreditGrantVoidResponse
import java.util.function.Consumer

class CreditGrantServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CreditGrantService {

    private val withRawResponse: CreditGrantService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CreditGrantService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CreditGrantService =
        CreditGrantServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: CreditGrantCreateParams,
        requestOptions: RequestOptions,
    ): CreditGrantCreateResponse =
        // post /v1/credits/createGrant
        withRawResponse().create(params, requestOptions).parse()

    override fun list(
        params: CreditGrantListParams,
        requestOptions: RequestOptions,
    ): CreditGrantListPage =
        // post /v1/credits/listGrants
        withRawResponse().list(params, requestOptions).parse()

    override fun edit(
        params: CreditGrantEditParams,
        requestOptions: RequestOptions,
    ): CreditGrantEditResponse =
        // post /v1/credits/editGrant
        withRawResponse().edit(params, requestOptions).parse()

    override fun listEntries(
        params: CreditGrantListEntriesParams,
        requestOptions: RequestOptions,
    ): CreditGrantListEntriesPage =
        // post /v1/credits/listEntries
        withRawResponse().listEntries(params, requestOptions).parse()

    override fun void_(
        params: CreditGrantVoidParams,
        requestOptions: RequestOptions,
    ): CreditGrantVoidResponse =
        // post /v1/credits/voidGrant
        withRawResponse().void_(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CreditGrantService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CreditGrantService.WithRawResponse =
            CreditGrantServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<CreditGrantCreateResponse> =
            jsonHandler<CreditGrantCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: CreditGrantCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditGrantCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "credits", "createGrant")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<CreditGrantListPageResponse> =
            jsonHandler<CreditGrantListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CreditGrantListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditGrantListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "credits", "listGrants")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        CreditGrantListPage.builder()
                            .service(CreditGrantServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val editHandler: Handler<CreditGrantEditResponse> =
            jsonHandler<CreditGrantEditResponse>(clientOptions.jsonMapper)

        override fun edit(
            params: CreditGrantEditParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditGrantEditResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "credits", "editGrant")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { editHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listEntriesHandler: Handler<CreditGrantListEntriesPageResponse> =
            jsonHandler<CreditGrantListEntriesPageResponse>(clientOptions.jsonMapper)

        override fun listEntries(
            params: CreditGrantListEntriesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditGrantListEntriesPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "credits", "listEntries")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listEntriesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        CreditGrantListEntriesPage.builder()
                            .service(CreditGrantServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val voidHandler: Handler<CreditGrantVoidResponse> =
            jsonHandler<CreditGrantVoidResponse>(clientOptions.jsonMapper)

        override fun void_(
            params: CreditGrantVoidParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CreditGrantVoidResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "credits", "voidGrant")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { voidHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
