// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1

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
import com.metronome.api.models.v1.customfields.CustomFieldAddKeyParams
import com.metronome.api.models.v1.customfields.CustomFieldDeleteValuesParams
import com.metronome.api.models.v1.customfields.CustomFieldListKeysPage
import com.metronome.api.models.v1.customfields.CustomFieldListKeysPageResponse
import com.metronome.api.models.v1.customfields.CustomFieldListKeysParams
import com.metronome.api.models.v1.customfields.CustomFieldRemoveKeyParams
import com.metronome.api.models.v1.customfields.CustomFieldSetValuesParams
import java.util.function.Consumer

class CustomFieldServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CustomFieldService {

    private val withRawResponse: CustomFieldService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CustomFieldService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomFieldService =
        CustomFieldServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun addKey(params: CustomFieldAddKeyParams, requestOptions: RequestOptions) {
        // post /v1/customFields/addKey
        withRawResponse().addKey(params, requestOptions)
    }

    override fun deleteValues(
        params: CustomFieldDeleteValuesParams,
        requestOptions: RequestOptions,
    ) {
        // post /v1/customFields/deleteValues
        withRawResponse().deleteValues(params, requestOptions)
    }

    override fun listKeys(
        params: CustomFieldListKeysParams,
        requestOptions: RequestOptions,
    ): CustomFieldListKeysPage =
        // post /v1/customFields/listKeys
        withRawResponse().listKeys(params, requestOptions).parse()

    override fun removeKey(params: CustomFieldRemoveKeyParams, requestOptions: RequestOptions) {
        // post /v1/customFields/removeKey
        withRawResponse().removeKey(params, requestOptions)
    }

    override fun setValues(params: CustomFieldSetValuesParams, requestOptions: RequestOptions) {
        // post /v1/customFields/setValues
        withRawResponse().setValues(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CustomFieldService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CustomFieldService.WithRawResponse =
            CustomFieldServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val addKeyHandler: Handler<Void?> = emptyHandler()

        override fun addKey(
            params: CustomFieldAddKeyParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "customFields", "addKey")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { addKeyHandler.handle(it) }
            }
        }

        private val deleteValuesHandler: Handler<Void?> = emptyHandler()

        override fun deleteValues(
            params: CustomFieldDeleteValuesParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "customFields", "deleteValues")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteValuesHandler.handle(it) }
            }
        }

        private val listKeysHandler: Handler<CustomFieldListKeysPageResponse> =
            jsonHandler<CustomFieldListKeysPageResponse>(clientOptions.jsonMapper)

        override fun listKeys(
            params: CustomFieldListKeysParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CustomFieldListKeysPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "customFields", "listKeys")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listKeysHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        CustomFieldListKeysPage.builder()
                            .service(CustomFieldServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val removeKeyHandler: Handler<Void?> = emptyHandler()

        override fun removeKey(
            params: CustomFieldRemoveKeyParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "customFields", "removeKey")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { removeKeyHandler.handle(it) }
            }
        }

        private val setValuesHandler: Handler<Void?> = emptyHandler()

        override fun setValues(
            params: CustomFieldSetValuesParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "customFields", "setValues")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { setValuesHandler.handle(it) }
            }
        }
    }
}
