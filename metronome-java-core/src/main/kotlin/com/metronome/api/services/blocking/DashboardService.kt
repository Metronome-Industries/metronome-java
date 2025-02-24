// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.blocking

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.DashboardGetEmbeddableUrlParams
import com.metronome.api.models.DashboardGetEmbeddableUrlResponse

interface DashboardService {

    /**
     * Retrieve an embeddable dashboard url for a customer. The dashboard can be embedded using an
     * iframe in a website. This will show information such as usage data and customer invoices.
     */
    @JvmOverloads
    fun getEmbeddableUrl(
        params: DashboardGetEmbeddableUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DashboardGetEmbeddableUrlResponse
}
