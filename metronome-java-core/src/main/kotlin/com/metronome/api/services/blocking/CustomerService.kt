// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.blocking

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.CustomerArchiveParams
import com.metronome.api.models.CustomerArchiveResponse
import com.metronome.api.models.CustomerCreateParams
import com.metronome.api.models.CustomerCreateResponse
import com.metronome.api.models.CustomerListBillableMetricsPage
import com.metronome.api.models.CustomerListBillableMetricsParams
import com.metronome.api.models.CustomerListCostsPage
import com.metronome.api.models.CustomerListCostsParams
import com.metronome.api.models.CustomerListPage
import com.metronome.api.models.CustomerListParams
import com.metronome.api.models.CustomerRetrieveParams
import com.metronome.api.models.CustomerRetrieveResponse
import com.metronome.api.models.CustomerSetIngestAliasesParams
import com.metronome.api.models.CustomerSetNameParams
import com.metronome.api.models.CustomerSetNameResponse
import com.metronome.api.models.CustomerUpdateConfigParams
import com.metronome.api.services.blocking.customers.AlertService
import com.metronome.api.services.blocking.customers.BillingConfigService
import com.metronome.api.services.blocking.customers.CommitService
import com.metronome.api.services.blocking.customers.CreditService
import com.metronome.api.services.blocking.customers.InvoiceService
import com.metronome.api.services.blocking.customers.NamedScheduleService
import com.metronome.api.services.blocking.customers.PlanService

interface CustomerService {

    fun alerts(): AlertService

    fun plans(): PlanService

    fun invoices(): InvoiceService

    fun billingConfig(): BillingConfigService

    fun commits(): CommitService

    fun credits(): CreditService

    fun namedSchedules(): NamedScheduleService

    /** Create a new customer */
    @JvmOverloads
    fun create(
        params: CustomerCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerCreateResponse

    /** Get a customer by Metronome ID. */
    @JvmOverloads
    fun retrieve(
        params: CustomerRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerRetrieveResponse

    /** List all customers. */
    @JvmOverloads
    fun list(
        params: CustomerListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerListPage

    /** Archive a customer */
    @JvmOverloads
    fun archive(
        params: CustomerArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerArchiveResponse

    /** Get all billable metrics for a given customer. */
    @JvmOverloads
    fun listBillableMetrics(
        params: CustomerListBillableMetricsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerListBillableMetricsPage

    /**
     * Fetch daily pending costs for the specified customer, broken down by credit type and line
     * items. Note: this is not supported for customers whose plan includes a UNIQUE-type billable
     * metric.
     */
    @JvmOverloads
    fun listCosts(
        params: CustomerListCostsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerListCostsPage

    /**
     * Sets the ingest aliases for a customer. Ingest aliases can be used in the `customer_id` field
     * when sending usage events to Metronome. This call is idempotent. It fully replaces the set of
     * ingest aliases for the given customer.
     */
    @JvmOverloads
    fun setIngestAliases(
        params: CustomerSetIngestAliasesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Updates the specified customer's name. */
    @JvmOverloads
    fun setName(
        params: CustomerSetNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomerSetNameResponse

    /** Updates the specified customer's config. */
    @JvmOverloads
    fun updateConfig(
        params: CustomerUpdateConfigParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )
}
