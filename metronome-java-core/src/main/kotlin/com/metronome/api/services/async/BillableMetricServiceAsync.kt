// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.async

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.BillableMetricArchiveParams
import com.metronome.api.models.BillableMetricArchiveResponse
import com.metronome.api.models.BillableMetricCreateParams
import com.metronome.api.models.BillableMetricCreateResponse
import com.metronome.api.models.BillableMetricListPageAsync
import com.metronome.api.models.BillableMetricListParams
import com.metronome.api.models.BillableMetricRetrieveParams
import com.metronome.api.models.BillableMetricRetrieveResponse
import java.util.concurrent.CompletableFuture

interface BillableMetricServiceAsync {

    /** Creates a new Billable Metric. */
    @JvmOverloads
    fun create(
        params: BillableMetricCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillableMetricCreateResponse>

    /** Get a billable metric. */
    @JvmOverloads
    fun retrieve(
        params: BillableMetricRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillableMetricRetrieveResponse>

    /** List all billable metrics. */
    @JvmOverloads
    fun list(
        params: BillableMetricListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillableMetricListPageAsync>

    /** Archive an existing billable metric. */
    @JvmOverloads
    fun archive(
        params: BillableMetricArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillableMetricArchiveResponse>
}
