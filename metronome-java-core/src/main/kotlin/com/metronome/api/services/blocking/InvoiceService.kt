// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.blocking

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.InvoiceRegenerateParams
import com.metronome.api.models.InvoiceRegenerateResponse
import com.metronome.api.models.InvoiceVoidParams
import com.metronome.api.models.InvoiceVoidResponse

interface InvoiceService {

    /** Regenerate a voided contract invoice */
    @JvmOverloads
    fun regenerate(
        params: InvoiceRegenerateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvoiceRegenerateResponse

    /** Void an invoice */
    @JvmOverloads
    fun void_(
        params: InvoiceVoidParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InvoiceVoidResponse
}
