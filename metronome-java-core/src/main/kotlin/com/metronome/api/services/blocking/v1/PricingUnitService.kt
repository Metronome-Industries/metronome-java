// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1

import com.google.errorprone.annotations.MustBeClosed
import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.models.Id
import com.metronome.api.models.v1.pricingunits.PricingUnitArchiveParams
import com.metronome.api.models.v1.pricingunits.PricingUnitArchiveResponse
import com.metronome.api.models.v1.pricingunits.PricingUnitCreateParams
import com.metronome.api.models.v1.pricingunits.PricingUnitCreateResponse
import com.metronome.api.models.v1.pricingunits.PricingUnitListPage
import com.metronome.api.models.v1.pricingunits.PricingUnitListParams
import java.util.function.Consumer

/**
 * Use these endpoints to configure a billing API key, a webhook secret, or invoice finalization
 * behavior.
 */
interface PricingUnitService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PricingUnitService

    /**
     * Create a custom pricing unit. Custom pricing units can be used to charge for usage in a
     * non-fiat pricing unit, for example AI credits.
     */
    fun create(params: PricingUnitCreateParams): PricingUnitCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PricingUnitCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PricingUnitCreateResponse

    /**
     * List all pricing units. All fiat currency types (for example, USD or GBP) will be included,
     * as well as any custom pricing units that were configured. Custom pricing units can be used to
     * charge for usage in a non-fiat pricing unit, for example AI credits.
     *
     * Note: The USD (cents) pricing unit is 2714e483-4ff1-48e4-9e25-ac732e8f24f2.
     */
    fun list(): PricingUnitListPage = list(PricingUnitListParams.none())

    /** @see list */
    fun list(
        params: PricingUnitListParams = PricingUnitListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PricingUnitListPage

    /** @see list */
    fun list(params: PricingUnitListParams = PricingUnitListParams.none()): PricingUnitListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): PricingUnitListPage =
        list(PricingUnitListParams.none(), requestOptions)

    /**
     * Archive a custom pricing unit. Once archived, it will no longer appear in pricing unit
     * selectors by default.
     */
    fun archive(params: PricingUnitArchiveParams): PricingUnitArchiveResponse =
        archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: PricingUnitArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PricingUnitArchiveResponse

    /** @see archive */
    fun archive(
        id: Id,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PricingUnitArchiveResponse =
        archive(PricingUnitArchiveParams.builder().id(id).build(), requestOptions)

    /** @see archive */
    fun archive(id: Id): PricingUnitArchiveResponse = archive(id, RequestOptions.none())

    /**
     * A view of [PricingUnitService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PricingUnitService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/credit-types/create`, but is otherwise the same
         * as [PricingUnitService.create].
         */
        @MustBeClosed
        fun create(params: PricingUnitCreateParams): HttpResponseFor<PricingUnitCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: PricingUnitCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PricingUnitCreateResponse>

        /**
         * Returns a raw HTTP response for `get /v1/credit-types/list`, but is otherwise the same as
         * [PricingUnitService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<PricingUnitListPage> = list(PricingUnitListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PricingUnitListParams = PricingUnitListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PricingUnitListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: PricingUnitListParams = PricingUnitListParams.none()
        ): HttpResponseFor<PricingUnitListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PricingUnitListPage> =
            list(PricingUnitListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/credit-types/archive`, but is otherwise the
         * same as [PricingUnitService.archive].
         */
        @MustBeClosed
        fun archive(params: PricingUnitArchiveParams): HttpResponseFor<PricingUnitArchiveResponse> =
            archive(params, RequestOptions.none())

        /** @see archive */
        @MustBeClosed
        fun archive(
            params: PricingUnitArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PricingUnitArchiveResponse>

        /** @see archive */
        @MustBeClosed
        fun archive(
            id: Id,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PricingUnitArchiveResponse> =
            archive(PricingUnitArchiveParams.builder().id(id).build(), requestOptions)

        /** @see archive */
        @MustBeClosed
        fun archive(id: Id): HttpResponseFor<PricingUnitArchiveResponse> =
            archive(id, RequestOptions.none())
    }
}
