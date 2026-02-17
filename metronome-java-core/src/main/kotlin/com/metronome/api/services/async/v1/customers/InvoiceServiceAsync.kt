// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.async.v1.customers

import com.google.errorprone.annotations.MustBeClosed
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponse
import com.metronome.api.models.V1CustomerInvoiceAddChargeParams
import com.metronome.api.models.V1CustomerInvoiceAddChargeResponse
import com.metronome.api.models.V1CustomerInvoiceListBreakdownsPageAsync
import com.metronome.api.models.V1CustomerInvoiceListBreakdownsParams
import com.metronome.api.models.V1CustomerInvoiceListPageAsync
import com.metronome.api.models.V1CustomerInvoiceListParams
import com.metronome.api.models.V1CustomerInvoiceRetrieveParams
import com.metronome.api.models.V1CustomerInvoiceRetrievePdfParams
import com.metronome.api.models.V1CustomerInvoiceRetrieveResponse
import java.util.concurrent.CompletableFuture

interface InvoiceServiceAsync {

    /**
     * Retrieve detailed information for a specific invoice by its unique identifier. This endpoint
     * returns comprehensive invoice data including line items, applied credits, totals, and billing
     * period details for both finalized and draft invoices.
     *
     * ### Use this endpoint to:
     * - Display historical invoice details in customer-facing dashboards or billing portals.
     * - Retrieve current month draft invoices to show customers their month-to-date spend.
     * - Access finalized invoices for historical billing records and payment reconciliation.
     * - Validate customer pricing and credit applications for customer support queries.
     *
     * ### Key response fields:
     *
     * Invoice status (DRAFT, FINALIZED, VOID) Billing period start and end dates Total amount and
     * amount due after credits Detailed line items broken down by:
     * - Customer and contract information
     * - Invoice line item type
     * - Product/service name and ID
     * - Quantity consumed
     * - Unit and total price
     * - Time period for usage-based charges
     * - Applied credits or prepaid commitments
     *
     * ### Usage guidelines:
     * - Draft invoices update in real-time as usage is reported and may change before finalization
     * - The response includes both usage-based line items (e.g., API calls, data processed) and
     *   scheduled charges (e.g., monthly subscriptions, commitment fees)
     * - Credit and commitment applications are shown as separate line items with negative amounts
     * - For voided invoices, the response will indicate VOID status but retain all original line
     *   item details
     */
    @JvmOverloads
    fun retrieve(
        params: V1CustomerInvoiceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1CustomerInvoiceRetrieveResponse>

    /**
     * Retrieves a paginated list of invoices for a specific customer, with flexible filtering
     * options to narrow results by status, date range, credit type, and more. This endpoint
     * provides a comprehensive view of a customer's billing history and current charges, supporting
     * both real-time billing dashboards and historical reporting needs.
     *
     * ### Use this endpoint to:
     * - Display historical invoice details in customer-facing dashboards or billing portals.
     * - Retrieve current month draft invoices to show customers their month-to-date spend.
     * - Access finalized invoices for historical billing records and payment reconciliation.
     * - Validate customer pricing and credit applications for customer support queries.
     * - Generate financial reports by filtering invoices within specific date ranges
     *
     * ### Key response fields:
     *
     * Array of invoice objects containing:
     * - Invoice ID and status (DRAFT, FINALIZED, VOID)
     * - Invoice type (USAGE, SCHEDULED)
     * - Billing period start and end dates
     * - Issue date and due date
     * - Total amount, subtotal, and amount due
     * - Applied credits summary
     * - Contract ID reference
     * - External billing provider status (if integrated with Stripe, etc.)
     * - Pagination metadata `next_page` cursor
     *
     * ### Usage guidelines:
     * - The endpoint returns invoice summaries; use the Get Invoice endpoint for detailed line
     *   items
     * - Draft invoices are continuously updated as new usage is reported and will show real-time
     *   spend
     * - Results are ordered by creation date descending by default (newest first)
     * - When filtering by date range, the filter applies to the billing period, not the issue date
     * - For customers with many invoices, implement pagination to ensure all results are retrieved
     *   External billing provider statuses (like Stripe payment status) are included when
     *   applicable
     * - Voided invoices are included in results by default unless filtered out by status
     */
    @JvmOverloads
    fun list(
        params: V1CustomerInvoiceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1CustomerInvoiceListPageAsync>

    /**
     * Add a one time charge to the specified invoice. This is a Plans (deprecated) endpoint. New
     * clients should implement using Contracts.
     */
    @JvmOverloads
    fun addCharge(
        params: V1CustomerInvoiceAddChargeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1CustomerInvoiceAddChargeResponse>

    /**
     * Retrieve granular time-series breakdowns of invoice data at hourly or daily intervals. This
     * endpoint transforms standard invoices into detailed timelines, enabling you to track usage
     * patterns, identify consumption spikes, and provide customers with transparency into their
     * billing details throughout the billing period.
     *
     * ### Use this endpoint to:
     * - Build usage analytics dashboards showing daily or hourly consumption trends
     * - Identify peak usage periods for capacity planning and cost optimization
     * - Generate detailed billing reports for finance teams and customer success
     * - Troubleshoot billing disputes by examining usage patterns at specific times
     * - Power real-time cost monitoring and alerting systems
     *
     * ### Key response fields:
     *
     * An array of BreakdownInvoice objects, each containing:
     * - All standard invoice fields (ID, customer, commit, line items, totals, status)
     * - Line items with quantities and costs for that specific period
     * - `breakdown_start_timestamp`: Start of the specific time window
     * - `breakdown_end_timestamp`: End of the specific time window
     * - `next_page`: Pagination cursor for large result sets
     *
     * ### Usage guidelines:
     * - Time granularity: Set `window_size` to hour or day based on your analysis needs
     * - Response limits: Daily breakdowns return up to 35 days; hourly breakdowns return up to 24
     *   hours per request
     * - Date filtering: Use `starting_on` and `ending_before` to focus on specific periods
     * - Performance: For large date ranges, use pagination to retrieve all data efficiently
     * - Backdated usage: If usage events arrive after invoice finalization, breakdowns will reflect
     *   the updated usage
     * - Zero quantity filtering: Use `skip_zero_qty_line_items=true` to exclude periods with no
     *   usage
     */
    @JvmOverloads
    fun listBreakdowns(
        params: V1CustomerInvoiceListBreakdownsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1CustomerInvoiceListBreakdownsPageAsync>

    /**
     * Retrieve a PDF version of a specific invoice by its unique identifier. This endpoint
     * generates a professionally formatted invoice document suitable for sharing with customers,
     * accounting teams, or for record-keeping purposes.
     *
     * ### Use this endpoint to:
     * - Provide customers with downloadable or emailable copies of their invoices
     * - Support accounting and finance teams with official billing documents
     * - Maintain accurate records of billing transactions for audits and compliance
     *
     * ### Key response details:
     * - The response is a binary PDF file representing the full invoice
     * - The PDF includes all standard invoice information such as line items, totals, billing
     *   period, and customer details
     * - The document is formatted for clarity and professionalism, suitable for official use
     *
     * ### Usage guidelines:
     * - Ensure the `invoice_id` corresponds to an existing invoice for the specified `customer_id`
     * - The PDF is generated on-demand; frequent requests for the same invoice may impact
     *   performance
     * - Use appropriate headers to handle the binary response in your application (e.g., setting
     *   `Content-Type: application/pdf`)
     */
    @JvmOverloads
    @MustBeClosed
    fun retrievePdf(
        params: V1CustomerInvoiceRetrievePdfParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>
}
