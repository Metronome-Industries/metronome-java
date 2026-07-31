// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1.settings

import com.google.errorprone.annotations.MustBeClosed
import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.models.v1.settings.billingproviders.BillingProviderCreateParams
import com.metronome.api.models.v1.settings.billingproviders.BillingProviderCreateResponse
import com.metronome.api.models.v1.settings.billingproviders.BillingProviderListParams
import com.metronome.api.models.v1.settings.billingproviders.BillingProviderListResponse
import java.util.function.Consumer

/**
 * Use these endpoints to configure a billing API key, a webhook secret, or invoice finalization
 * behavior.
 */
interface BillingProviderService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BillingProviderService

    /**
     * Set up account-level configuration for a billing provider. Once configured, individual
     * contracts across customers can be mapped to this configuration using the returned
     * delivery_method_id.
     */
    fun create(params: BillingProviderCreateParams): BillingProviderCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BillingProviderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillingProviderCreateResponse

    /**
     * Lists all configured billing providers and their delivery method configurations for your
     * account. Returns provider details, delivery method IDs, and configuration settings needed for
     * mapping individual customer contracts to billing integrations.
     */
    fun list(): BillingProviderListResponse = list(BillingProviderListParams.none())

    /** @see list */
    fun list(
        params: BillingProviderListParams = BillingProviderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BillingProviderListResponse

    /** @see list */
    fun list(
        params: BillingProviderListParams = BillingProviderListParams.none()
    ): BillingProviderListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): BillingProviderListResponse =
        list(BillingProviderListParams.none(), requestOptions)

    /**
     * A view of [BillingProviderService] that provides access to raw HTTP responses for each
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
        ): BillingProviderService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/setUpBillingProvider`, but is otherwise the
         * same as [BillingProviderService.create].
         */
        @MustBeClosed
        fun create(
            params: BillingProviderCreateParams
        ): HttpResponseFor<BillingProviderCreateResponse> = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BillingProviderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillingProviderCreateResponse>

        /**
         * Returns a raw HTTP response for `post /v1/listConfiguredBillingProviders`, but is
         * otherwise the same as [BillingProviderService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<BillingProviderListResponse> =
            list(BillingProviderListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: BillingProviderListParams = BillingProviderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BillingProviderListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: BillingProviderListParams = BillingProviderListParams.none()
        ): HttpResponseFor<BillingProviderListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BillingProviderListResponse> =
            list(BillingProviderListParams.none(), requestOptions)
    }
}
