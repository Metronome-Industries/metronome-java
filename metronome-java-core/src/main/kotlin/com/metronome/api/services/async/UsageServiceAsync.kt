// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.async

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.UsageIngestParams
import com.metronome.api.models.UsageListParams
import com.metronome.api.models.UsageListResponse
import com.metronome.api.models.UsageListWithGroupsPageAsync
import com.metronome.api.models.UsageListWithGroupsParams
import java.util.concurrent.CompletableFuture

interface UsageServiceAsync {

    /**
     * Fetch aggregated usage data for multiple customers and billable-metrics, broken into
     * intervals of the specified length.
     */
    @JvmOverloads
    fun list(
        params: UsageListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<UsageListResponse>

    /**
     * Send usage events to Metronome. The body of this request is expected to be a JSON array of
     * between 1 and 100 usage events. Compressed request bodies are supported with a
     * `Content-Encoding: gzip` header. See
     * [Getting usage into Metronome](https://docs.metronome.com/getting-usage-data-into-metronome/overview)
     * to learn more about usage events.
     */
    @JvmOverloads
    fun ingest(
        params: UsageIngestParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Void>

    /**
     * Fetch aggregated usage data for the specified customer, billable-metric, and optional group,
     * broken into intervals of the specified length.
     */
    @JvmOverloads
    fun listWithGroups(
        params: UsageListWithGroupsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<UsageListWithGroupsPageAsync>
}
