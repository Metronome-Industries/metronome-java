// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1.customers

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponse
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.models.v1.customers.billingconfig.BillingConfigCreateParams
import com.metronome.api.models.v1.customers.billingconfig.BillingConfigDeleteParams
import com.metronome.api.models.v1.customers.billingconfig.BillingConfigRetrieveParams
import com.metronome.api.models.v1.customers.billingconfig.BillingConfigRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BillingConfigServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BillingConfigServiceAsync

    /**
     * Set the billing configuration for a given customer. This is a Plans (deprecated) endpoint.
     * New clients should implement using Contracts.
     */
    fun create(params: BillingConfigCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BillingConfigCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Fetch the billing configuration for the given customer. This is a Plans (deprecated)
     * endpoint. New clients should implement using Contracts.
     */
    fun retrieve(
        params: BillingConfigRetrieveParams
    ): CompletableFuture<BillingConfigRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BillingConfigRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillingConfigRetrieveResponse>

    /**
     * Delete the billing configuration for a given customer. Note: this is unsupported for Azure
     * and AWS Marketplace customers. This is a Plans (deprecated) endpoint. New clients should
     * implement using Contracts.
     */
    fun delete(params: BillingConfigDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: BillingConfigDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [BillingConfigServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BillingConfigServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /v1/customers/{customer_id}/billing-config/{billing_provider_type}`, but is otherwise the
         * same as [BillingConfigServiceAsync.create].
         */
        fun create(params: BillingConfigCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: BillingConfigCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get
         * /v1/customers/{customer_id}/billing-config/{billing_provider_type}`, but is otherwise the
         * same as [BillingConfigServiceAsync.retrieve].
         */
        fun retrieve(
            params: BillingConfigRetrieveParams
        ): CompletableFuture<HttpResponseFor<BillingConfigRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: BillingConfigRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillingConfigRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `delete
         * /v1/customers/{customer_id}/billing-config/{billing_provider_type}`, but is otherwise the
         * same as [BillingConfigServiceAsync.delete].
         */
        fun delete(params: BillingConfigDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: BillingConfigDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
