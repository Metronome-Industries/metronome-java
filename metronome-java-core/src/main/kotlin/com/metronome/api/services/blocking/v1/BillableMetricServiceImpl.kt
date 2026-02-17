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
import com.metronome.api.models.V1BillableMetricArchiveParams
import com.metronome.api.models.V1BillableMetricArchiveResponse
import com.metronome.api.models.V1BillableMetricCreateParams
import com.metronome.api.models.V1BillableMetricCreateResponse
import com.metronome.api.models.V1BillableMetricListPage
import com.metronome.api.models.V1BillableMetricListParams
import com.metronome.api.models.V1BillableMetricRetrieveParams
import com.metronome.api.models.V1BillableMetricRetrieveResponse

class BillableMetricServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BillableMetricService {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<V1BillableMetricCreateResponse> =
        jsonHandler<V1BillableMetricCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Create billable metrics programmatically with this endpoint—an essential step in configuring
     * your pricing and packaging in Metronome.
     *
     * A billable metric is a customizable query that filters and aggregates events from your event
     * stream. These metrics are continuously tracked as usage data enters Metronome through the
     * ingestion pipeline. The ingestion process transforms raw usage data into actionable pricing
     * metrics, enabling accurate metering and billing for your products.
     *
     * ### Use this endpoint to:
     * - Create individual or multiple billable metrics as part of a setup workflow.
     * - Automate the entire pricing configuration process, from metric creation to customer
     *   contract setup.
     * - Define metrics using either standard filtering/aggregation or a custom SQL query.
     *
     * ### Key response fields:
     * - The ID of the billable metric that was created
     * - The created billable metric will be available to be used in Products, usage endpoints, and
     *   alerts.
     *
     * ### Usage guidelines:
     * - Metrics defined using standard filtering and aggregation are Streaming billable metrics,
     *   which have been optimized for ultra low latency and high throughput workflows.
     * - Use SQL billable metrics if you require more flexible aggregation options.
     */
    override fun create(
        params: V1BillableMetricCreateParams,
        requestOptions: RequestOptions,
    ): V1BillableMetricCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "billable-metrics", "create")
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

    private val retrieveHandler: Handler<V1BillableMetricRetrieveResponse> =
        jsonHandler<V1BillableMetricRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Retrieves the complete configuration for a specific billable metric by its ID. Use this to
     * review billable metric setup before associating it with products. Returns the metric's
     * `name`, `event_type_filter`, `property_filters`, `aggregation_type`, `aggregation_key`,
     * `group_keys`, `custom fields`, and `SQL query` (if it's a SQL billable metric).
     *
     * Important:
     * - Archived billable metrics will include an `archived_at` timestamp; they no longer process
     *   new usage events but remain accessible for historical reference.
     */
    override fun retrieve(
        params: V1BillableMetricRetrieveParams,
        requestOptions: RequestOptions,
    ): V1BillableMetricRetrieveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "billable-metrics", params.getPathParam(0))
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

    private val listHandler: Handler<V1BillableMetricListPage.Response> =
        jsonHandler<V1BillableMetricListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Retrieves all billable metrics with their complete configurations. Use this for programmatic
     * discovery and management of billable metrics, such as associating metrics to products and
     * auditing for orphaned or archived metrics. Important: Archived metrics are excluded by
     * default; use `include_archived`=`true` parameter to include them.
     */
    override fun list(
        params: V1BillableMetricListParams,
        requestOptions: RequestOptions,
    ): V1BillableMetricListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "billable-metrics")
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
            .let { V1BillableMetricListPage.of(this, params, it) }
    }

    private val archiveHandler: Handler<V1BillableMetricArchiveResponse> =
        jsonHandler<V1BillableMetricArchiveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Use this endpoint to retire billable metrics that are no longer used. After a billable metric
     * is archived, that billable metric can no longer be used in any new Products to define how
     * that product should be metered. If you archive a billable metric that is already associated
     * with a Product, the Product will continue to function as usual, metering based on the
     * definition of the archived billable metric.
     *
     * Archived billable metrics will be returned on the `getBillableMetric` and
     * `listBillableMetrics` endpoints with a populated `archived_at` field.
     */
    override fun archive(
        params: V1BillableMetricArchiveParams,
        requestOptions: RequestOptions,
    ): V1BillableMetricArchiveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "billable-metrics", "archive")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { archiveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
