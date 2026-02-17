// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1.settings

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.models.v1.settings.billingproviders.BillingProviderCreateParams
import com.metronome.api.models.v1.settings.billingproviders.BillingProviderCreateResponse
import com.metronome.api.models.v1.settings.billingproviders.BillingProviderListParams
import com.metronome.api.models.v1.settings.billingproviders.BillingProviderListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BillingProviderServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BillingProviderServiceAsync

    /**
     * Set up account-level configuration for a billing provider. Once configured, individual
     * contracts across customers can be mapped to this configuration using the returned
     * delivery_method_id.
     */
    fun create(
        params: BillingProviderCreateParams
    ): CompletableFuture<BillingProviderCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BillingProviderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillingProviderCreateResponse>

    /**
     * Lists all configured billing providers and their delivery method configurations for your
     * account. Returns provider details, delivery method IDs, and configuration settings needed for
     * mapping individual customer contracts to billing integrations.
     */
    fun list(): CompletableFuture<BillingProviderListResponse> =
        list(BillingProviderListParams.none())

    /** @see list */
    fun list(
        params: BillingProviderListParams = BillingProviderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BillingProviderListResponse>

    /** @see list */
    fun list(
        params: BillingProviderListParams = BillingProviderListParams.none()
    ): CompletableFuture<BillingProviderListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<BillingProviderListResponse> =
        list(BillingProviderListParams.none(), requestOptions)

    /**
     * A view of [BillingProviderServiceAsync] that provides access to raw HTTP responses for each
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
        ): BillingProviderServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/setUpBillingProvider`, but is otherwise the
         * same as [BillingProviderServiceAsync.create].
         */
        fun create(
            params: BillingProviderCreateParams
        ): CompletableFuture<HttpResponseFor<BillingProviderCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: BillingProviderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillingProviderCreateResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/listConfiguredBillingProviders`, but is
         * otherwise the same as [BillingProviderServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<BillingProviderListResponse>> =
            list(BillingProviderListParams.none())

        /** @see list */
        fun list(
            params: BillingProviderListParams = BillingProviderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BillingProviderListResponse>>

        /** @see list */
        fun list(
            params: BillingProviderListParams = BillingProviderListParams.none()
        ): CompletableFuture<HttpResponseFor<BillingProviderListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BillingProviderListResponse>> =
            list(BillingProviderListParams.none(), requestOptions)
    }
}
