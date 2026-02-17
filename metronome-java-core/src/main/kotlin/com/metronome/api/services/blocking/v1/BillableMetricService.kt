// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.blocking.v1

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.V1BillableMetricArchiveParams
import com.metronome.api.models.V1BillableMetricArchiveResponse
import com.metronome.api.models.V1BillableMetricCreateParams
import com.metronome.api.models.V1BillableMetricCreateResponse
import com.metronome.api.models.V1BillableMetricListPage
import com.metronome.api.models.V1BillableMetricListParams
import com.metronome.api.models.V1BillableMetricRetrieveParams
import com.metronome.api.models.V1BillableMetricRetrieveResponse

interface BillableMetricService {

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
    @JvmOverloads
    fun create(
        params: V1BillableMetricCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1BillableMetricCreateResponse

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
    @JvmOverloads
    fun retrieve(
        params: V1BillableMetricRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1BillableMetricRetrieveResponse

    /**
     * Retrieves all billable metrics with their complete configurations. Use this for programmatic
     * discovery and management of billable metrics, such as associating metrics to products and
     * auditing for orphaned or archived metrics. Important: Archived metrics are excluded by
     * default; use `include_archived`=`true` parameter to include them.
     */
    @JvmOverloads
    fun list(
        params: V1BillableMetricListParams = V1BillableMetricListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1BillableMetricListPage

    /**
     * Retrieves all billable metrics with their complete configurations. Use this for programmatic
     * discovery and management of billable metrics, such as associating metrics to products and
     * auditing for orphaned or archived metrics. Important: Archived metrics are excluded by
     * default; use `include_archived`=`true` parameter to include them.
     */
    fun list(requestOptions: RequestOptions): V1BillableMetricListPage =
        list(V1BillableMetricListParams.none(), requestOptions)

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
    @JvmOverloads
    fun archive(
        params: V1BillableMetricArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1BillableMetricArchiveResponse
}
