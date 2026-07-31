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
import com.metronome.api.models.v1.packages.PackageArchiveParams
import com.metronome.api.models.v1.packages.PackageArchiveResponse
import com.metronome.api.models.v1.packages.PackageCreateParams
import com.metronome.api.models.v1.packages.PackageCreateResponse
import com.metronome.api.models.v1.packages.PackageListContractsOnPackagePage
import com.metronome.api.models.v1.packages.PackageListContractsOnPackagePageResponse
import com.metronome.api.models.v1.packages.PackageListContractsOnPackageParams
import com.metronome.api.models.v1.packages.PackageListPage
import com.metronome.api.models.v1.packages.PackageListPageResponse
import com.metronome.api.models.v1.packages.PackageListParams
import com.metronome.api.models.v1.packages.PackageRetrieveParams
import com.metronome.api.models.v1.packages.PackageRetrieveResponse
import java.util.function.Consumer

class PackageServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PackageService {

    private val withRawResponse: PackageService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PackageService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PackageService =
        PackageServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: PackageCreateParams,
        requestOptions: RequestOptions,
    ): PackageCreateResponse =
        // post /v1/packages/create
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: PackageRetrieveParams,
        requestOptions: RequestOptions,
    ): PackageRetrieveResponse =
        // post /v1/packages/get
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: PackageListParams, requestOptions: RequestOptions): PackageListPage =
        // post /v1/packages/list
        withRawResponse().list(params, requestOptions).parse()

    override fun archive(
        params: PackageArchiveParams,
        requestOptions: RequestOptions,
    ): PackageArchiveResponse =
        // post /v1/packages/archive
        withRawResponse().archive(params, requestOptions).parse()

    override fun listContractsOnPackage(
        params: PackageListContractsOnPackageParams,
        requestOptions: RequestOptions,
    ): PackageListContractsOnPackagePage =
        // post /v1/packages/listContractsOnPackage
        withRawResponse().listContractsOnPackage(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PackageService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PackageService.WithRawResponse =
            PackageServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<PackageCreateResponse> =
            jsonHandler<PackageCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: PackageCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PackageCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "packages", "create")
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

        private val retrieveHandler: Handler<PackageRetrieveResponse> =
            jsonHandler<PackageRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: PackageRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PackageRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "packages", "get")
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

        private val listHandler: Handler<PackageListPageResponse> =
            jsonHandler<PackageListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PackageListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PackageListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "packages", "list")
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
                        PackageListPage.builder()
                            .service(PackageServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val archiveHandler: Handler<PackageArchiveResponse> =
            jsonHandler<PackageArchiveResponse>(clientOptions.jsonMapper)

        override fun archive(
            params: PackageArchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PackageArchiveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "packages", "archive")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { archiveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listContractsOnPackageHandler:
            Handler<PackageListContractsOnPackagePageResponse> =
            jsonHandler<PackageListContractsOnPackagePageResponse>(clientOptions.jsonMapper)

        override fun listContractsOnPackage(
            params: PackageListContractsOnPackageParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PackageListContractsOnPackagePage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "packages", "listContractsOnPackage")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listContractsOnPackageHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        PackageListContractsOnPackagePage.builder()
                            .service(PackageServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
