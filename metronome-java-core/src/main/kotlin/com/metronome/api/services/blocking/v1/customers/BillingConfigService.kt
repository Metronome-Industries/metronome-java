// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1.customers

import com.google.errorprone.annotations.MustBeClosed
import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponse
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.models.v1.customers.billingconfig.BillingConfigCreateParams
import com.metronome.api.models.v1.customers.billingconfig.BillingConfigDeleteParams
import com.metronome.api.models.v1.customers.billingconfig.BillingConfigRetrieveParams
import com.metronome.api.models.v1.customers.billingconfig.BillingConfigRetrieveResponse
import java.util.function.Consumer

/**
 * [Customers](https://docs.metronome.com/provisioning/create-customers/) in Metronome represent
 * your users for all billing and reporting. Use these endpoints to create, retrieve, update, and
 * archive customers and their billing configuration.
 */
interface BillingConfigService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BillingConfigService

    /**
     * Set the billing configuration for a given customer. This is a Plans (deprecated) endpoint.
     * New clients should implement using Contracts.
     */
    fun create(params: BillingConfigCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BillingConfigCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Fetch the billing configuration for the given customer. This is a Plans (deprecated)
     * endpoint. New clients should implement using Contracts.
     */
    fun retrieve(params: BillingConfigRetrieveParams): BillingConfigRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BillingConfigRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillingConfigRetrieveResponse

    /**
     * Delete the billing configuration for a given customer. Note: this is unsupported for Azure
     * and AWS Marketplace customers. This is a Plans (deprecated) endpoint. New clients should
     * implement using Contracts.
     */
    fun delete(params: BillingConfigDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: BillingConfigDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [BillingConfigService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BillingConfigService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /v1/customers/{customer_id}/billing-config/{billing_provider_type}`, but is otherwise the
         * same as [BillingConfigService.create].
         */
        @MustBeClosed
        fun create(params: BillingConfigCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BillingConfigCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/customers/{customer_id}/billing-config/{billing_provider_type}`, but is otherwise the
         * same as [BillingConfigService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: BillingConfigRetrieveParams
        ): HttpResponseFor<BillingConfigRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BillingConfigRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillingConfigRetrieveResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /v1/customers/{customer_id}/billing-config/{billing_provider_type}`, but is otherwise the
         * same as [BillingConfigService.delete].
         */
        @MustBeClosed
        fun delete(params: BillingConfigDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: BillingConfigDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
