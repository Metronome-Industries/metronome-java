// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.blocking.customers

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.CustomerInvoiceListParams
import com.metronome.api.models.CustomerInvoiceListResponse
import com.metronome.api.models.CustomerInvoiceRetrieveParams
import com.metronome.api.models.CustomerInvoiceRetrieveResponse

interface InvoiceService {

    /** Fetch a specific invoice for a given customer. */
    @JvmOverloads
    fun retrieve(
        params: CustomerInvoiceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CustomerInvoiceRetrieveResponse

    /**
     * List all invoices for a given customer, optionally filtered by status, date range, and/or
     * credit type.
     */
    @JvmOverloads
    fun list(
        params: CustomerInvoiceListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CustomerInvoiceListResponse
}
