// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.async

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.CreditTypeListParams
import com.metronome.api.models.CreditTypeListResponse
import java.util.concurrent.CompletableFuture

interface CreditTypeServiceAsync {

    /** List all pricing units (known in the API by the legacy term "credit types"). */
    @JvmOverloads
    fun list(
        params: CreditTypeListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CreditTypeListResponse>
}
