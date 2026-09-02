// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.models.Id
import com.metronome.api.models.v1.pricingunits.PricingUnitArchiveParams
import com.metronome.api.models.v1.pricingunits.PricingUnitArchiveResponse
import com.metronome.api.models.v1.pricingunits.PricingUnitCreateParams
import com.metronome.api.models.v1.pricingunits.PricingUnitCreateResponse
import com.metronome.api.models.v1.pricingunits.PricingUnitListPageAsync
import com.metronome.api.models.v1.pricingunits.PricingUnitListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Use these endpoints to configure a billing API key, a webhook secret, or invoice finalization
 * behavior.
 */
interface PricingUnitServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PricingUnitServiceAsync

    /**
     * Create a custom pricing unit. Custom pricing units can be used to charge for usage in a
     * non-fiat pricing unit, for example AI credits.
     */
    fun create(params: PricingUnitCreateParams): CompletableFuture<PricingUnitCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PricingUnitCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PricingUnitCreateResponse>

    /**
     * List all pricing units. All fiat currency types (for example, USD or GBP) will be included,
     * as well as any custom pricing units that were configured. Custom pricing units can be used to
     * charge for usage in a non-fiat pricing unit, for example AI credits.
     *
     * Note: The USD (cents) pricing unit is 2714e483-4ff1-48e4-9e25-ac732e8f24f2.
     */
    fun list(): CompletableFuture<PricingUnitListPageAsync> = list(PricingUnitListParams.none())

    /** @see list */
    fun list(
        params: PricingUnitListParams = PricingUnitListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PricingUnitListPageAsync>

    /** @see list */
    fun list(
        params: PricingUnitListParams = PricingUnitListParams.none()
    ): CompletableFuture<PricingUnitListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<PricingUnitListPageAsync> =
        list(PricingUnitListParams.none(), requestOptions)

    /**
     * Archive a custom pricing unit. Once archived, it will no longer appear in pricing unit
     * selectors by default.
     */
    fun archive(params: PricingUnitArchiveParams): CompletableFuture<PricingUnitArchiveResponse> =
        archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: PricingUnitArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PricingUnitArchiveResponse>

    /** @see archive */
    fun archive(
        id: Id,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PricingUnitArchiveResponse> =
        archive(PricingUnitArchiveParams.builder().id(id).build(), requestOptions)

    /** @see archive */
    fun archive(id: Id): CompletableFuture<PricingUnitArchiveResponse> =
        archive(id, RequestOptions.none())

    /**
     * A view of [PricingUnitServiceAsync] that provides access to raw HTTP responses for each
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
        ): PricingUnitServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/credit-types/create`, but is otherwise the same
         * as [PricingUnitServiceAsync.create].
         */
        fun create(
            params: PricingUnitCreateParams
        ): CompletableFuture<HttpResponseFor<PricingUnitCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PricingUnitCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PricingUnitCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/credit-types/list`, but is otherwise the same as
         * [PricingUnitServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PricingUnitListPageAsync>> =
            list(PricingUnitListParams.none())

        /** @see list */
        fun list(
            params: PricingUnitListParams = PricingUnitListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PricingUnitListPageAsync>>

        /** @see list */
        fun list(
            params: PricingUnitListParams = PricingUnitListParams.none()
        ): CompletableFuture<HttpResponseFor<PricingUnitListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PricingUnitListPageAsync>> =
            list(PricingUnitListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/credit-types/archive`, but is otherwise the
         * same as [PricingUnitServiceAsync.archive].
         */
        fun archive(
            params: PricingUnitArchiveParams
        ): CompletableFuture<HttpResponseFor<PricingUnitArchiveResponse>> =
            archive(params, RequestOptions.none())

        /** @see archive */
        fun archive(
            params: PricingUnitArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PricingUnitArchiveResponse>>

        /** @see archive */
        fun archive(
            id: Id,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PricingUnitArchiveResponse>> =
            archive(PricingUnitArchiveParams.builder().id(id).build(), requestOptions)

        /** @see archive */
        fun archive(id: Id): CompletableFuture<HttpResponseFor<PricingUnitArchiveResponse>> =
            archive(id, RequestOptions.none())
    }
}
