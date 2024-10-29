// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.async.customers

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.CustomerInvoiceAddChargeParams
import com.metronome.api.models.CustomerInvoiceAddChargeResponse
import com.metronome.api.models.CustomerInvoiceListBreakdownsPageAsync
import com.metronome.api.models.CustomerInvoiceListBreakdownsParams
import com.metronome.api.models.CustomerInvoiceListPageAsync
import com.metronome.api.models.CustomerInvoiceListParams
import com.metronome.api.models.CustomerInvoiceRetrieveParams
import com.metronome.api.models.CustomerInvoiceRetrieveResponse
import java.util.concurrent.CompletableFuture

interface InvoiceServiceAsync {

    /** Fetch a specific invoice for a given customer. */
    @JvmOverloads
    fun retrieve(
        params: CustomerInvoiceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CustomerInvoiceRetrieveResponse>

    /**
     * List all invoices for a given customer, optionally filtered by status, date range, and/or
     * credit type.
     */
    @JvmOverloads
    fun list(
        params: CustomerInvoiceListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CustomerInvoiceListPageAsync>

    /** Add a one time charge to the specified invoice */
    @JvmOverloads
    fun addCharge(
        params: CustomerInvoiceAddChargeParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CustomerInvoiceAddChargeResponse>

    /**
     * List daily or hourly breakdown invoices for a given customer, optionally filtered by status,
     * date range, and/or credit type.
     */
    @JvmOverloads
    fun listBreakdowns(
        params: CustomerInvoiceListBreakdownsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CustomerInvoiceListBreakdownsPageAsync>
}
