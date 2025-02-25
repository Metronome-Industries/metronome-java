// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.blocking

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.PricingUnitListPage
import com.metronome.api.models.PricingUnitListParams

interface PricingUnitService {

    /** List all pricing units (known in the API by the legacy term "credit types"). */
    @JvmOverloads
    fun list(
        params: PricingUnitListParams = PricingUnitListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PricingUnitListPage

    /** List all pricing units (known in the API by the legacy term "credit types"). */
    fun list(requestOptions: RequestOptions): PricingUnitListPage =
        list(PricingUnitListParams.none(), requestOptions)
}
