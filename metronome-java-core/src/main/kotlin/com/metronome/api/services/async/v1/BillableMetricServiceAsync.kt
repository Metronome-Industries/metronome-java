// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.models.Id
import com.metronome.api.models.v1.billablemetrics.BillableMetricArchiveParams
import com.metronome.api.models.v1.billablemetrics.BillableMetricArchiveResponse
import com.metronome.api.models.v1.billablemetrics.BillableMetricCreateParams
import com.metronome.api.models.v1.billablemetrics.BillableMetricCreateResponse
import com.metronome.api.models.v1.billablemetrics.BillableMetricListPageAsync
import com.metronome.api.models.v1.billablemetrics.BillableMetricListParams
import com.metronome.api.models.v1.billablemetrics.BillableMetricRetrieveParams
import com.metronome.api.models.v1.billablemetrics.BillableMetricRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * [Billable
 * metrics](https://docs.metronome.com/understanding-metronome/how-metronome-works#billable-metrics)
 * in Metronome represent the various consumption components that Metronome meters and aggregates.
 */
interface BillableMetricServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BillableMetricServiceAsync

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
    fun create(
        params: BillableMetricCreateParams
    ): CompletableFuture<BillableMetricCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BillableMetricCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillableMetricCreateResponse>

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
    fun retrieve(
        params: BillableMetricRetrieveParams
    ): CompletableFuture<BillableMetricRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BillableMetricRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillableMetricRetrieveResponse>

    /**
     * Retrieves all billable metrics with their complete configurations. Use this for programmatic
     * discovery and management of billable metrics, such as associating metrics to products and
     * auditing for orphaned or archived metrics. Important: Archived metrics are excluded by
     * default; use `include_archived`=`true` parameter to include them.
     */
    fun list(): CompletableFuture<BillableMetricListPageAsync> =
        list(BillableMetricListParams.none())

    /** @see list */
    fun list(
        params: BillableMetricListParams = BillableMetricListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillableMetricListPageAsync>

    /** @see list */
    fun list(
        params: BillableMetricListParams = BillableMetricListParams.none()
    ): CompletableFuture<BillableMetricListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<BillableMetricListPageAsync> =
        list(BillableMetricListParams.none(), requestOptions)

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
    fun archive(
        params: BillableMetricArchiveParams
    ): CompletableFuture<BillableMetricArchiveResponse> = archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: BillableMetricArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillableMetricArchiveResponse>

    /** @see archive */
    fun archive(
        id: Id,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillableMetricArchiveResponse> =
        archive(BillableMetricArchiveParams.builder().id(id).build(), requestOptions)

    /** @see archive */
    fun archive(id: Id): CompletableFuture<BillableMetricArchiveResponse> =
        archive(id, RequestOptions.none())

    /**
     * A view of [BillableMetricServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BillableMetricServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/billable-metrics/create`, but is otherwise the
         * same as [BillableMetricServiceAsync.create].
         */
        fun create(
            params: BillableMetricCreateParams
        ): CompletableFuture<HttpResponseFor<BillableMetricCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: BillableMetricCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillableMetricCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/billable-metrics/{billable_metric_id}`, but is
         * otherwise the same as [BillableMetricServiceAsync.retrieve].
         */
        fun retrieve(
            params: BillableMetricRetrieveParams
        ): CompletableFuture<HttpResponseFor<BillableMetricRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: BillableMetricRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillableMetricRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/billable-metrics`, but is otherwise the same as
         * [BillableMetricServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<BillableMetricListPageAsync>> =
            list(BillableMetricListParams.none())

        /** @see list */
        fun list(
            params: BillableMetricListParams = BillableMetricListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillableMetricListPageAsync>>

        /** @see list */
        fun list(
            params: BillableMetricListParams = BillableMetricListParams.none()
        ): CompletableFuture<HttpResponseFor<BillableMetricListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BillableMetricListPageAsync>> =
            list(BillableMetricListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/billable-metrics/archive`, but is otherwise the
         * same as [BillableMetricServiceAsync.archive].
         */
        fun archive(
            params: BillableMetricArchiveParams
        ): CompletableFuture<HttpResponseFor<BillableMetricArchiveResponse>> =
            archive(params, RequestOptions.none())

        /** @see archive */
        fun archive(
            params: BillableMetricArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillableMetricArchiveResponse>>

        /** @see archive */
        fun archive(
            id: Id,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillableMetricArchiveResponse>> =
            archive(BillableMetricArchiveParams.builder().id(id).build(), requestOptions)

        /** @see archive */
        fun archive(id: Id): CompletableFuture<HttpResponseFor<BillableMetricArchiveResponse>> =
            archive(id, RequestOptions.none())
    }
}
