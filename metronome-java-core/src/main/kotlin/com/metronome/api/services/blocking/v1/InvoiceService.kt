// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.blocking.v1

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.V1InvoiceRegenerateParams
import com.metronome.api.models.V1InvoiceRegenerateResponse
import com.metronome.api.models.V1InvoiceVoidParams
import com.metronome.api.models.V1InvoiceVoidResponse

interface InvoiceService {

    /**
     * This endpoint regenerates a voided invoice and recalculates the invoice based on up-to-date
     * rates, available balances, and other fees regardless of the billing period.
     *
     * ### Use this endpoint to:
     *
     * Recalculate an invoice with updated rate terms, available balance, and fees to correct
     * billing disputes or discrepancies
     *
     * ### Key response fields:
     *
     * The regenerated invoice id, which is distinct from the previously voided invoice.
     *
     * ### Usage guidelines:
     *
     * If an invoice is attached to a contract with a billing provider on it, the regenerated
     * invoice will be distributed based on the configuration.
     */
    @JvmOverloads
    fun regenerate(
        params: V1InvoiceRegenerateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1InvoiceRegenerateResponse

    /**
     * Permanently cancels an invoice by setting its status to voided, preventing collection and
     * removing it from customer billing. Use this to correct billing errors, cancel incorrect
     * charges, or handle disputed invoices that should not be collected. Returns the voided invoice
     * ID with the status change applied immediately to stop any payment processing.
     */
    @JvmOverloads
    fun void_(
        params: V1InvoiceVoidParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1InvoiceVoidResponse
}
