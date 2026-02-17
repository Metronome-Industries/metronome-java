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
import com.metronome.api.core.http.parseable
import com.metronome.api.core.prepare
import com.metronome.api.models.v1.auditlogs.AuditLogListPage
import com.metronome.api.models.v1.auditlogs.AuditLogListPageResponse
import com.metronome.api.models.v1.auditlogs.AuditLogListParams
import java.util.function.Consumer

class AuditLogServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AuditLogService {

    private val withRawResponse: AuditLogService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AuditLogService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AuditLogService =
        AuditLogServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: AuditLogListParams,
        requestOptions: RequestOptions,
    ): AuditLogListPage =
        // get /v1/auditLogs
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AuditLogService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AuditLogService.WithRawResponse =
            AuditLogServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<AuditLogListPageResponse> =
            jsonHandler<AuditLogListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AuditLogListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AuditLogListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "auditLogs")
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
                        AuditLogListPage.builder()
                            .service(AuditLogServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
