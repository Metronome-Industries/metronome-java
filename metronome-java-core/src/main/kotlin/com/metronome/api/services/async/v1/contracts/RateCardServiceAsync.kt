// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1.contracts

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.JsonValue
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.models.Id
import com.metronome.api.models.v1.contracts.ratecards.RateCardArchiveParams
import com.metronome.api.models.v1.contracts.ratecards.RateCardArchiveResponse
import com.metronome.api.models.v1.contracts.ratecards.RateCardCreateParams
import com.metronome.api.models.v1.contracts.ratecards.RateCardCreateResponse
import com.metronome.api.models.v1.contracts.ratecards.RateCardListPageAsync
import com.metronome.api.models.v1.contracts.ratecards.RateCardListParams
import com.metronome.api.models.v1.contracts.ratecards.RateCardRetrieveParams
import com.metronome.api.models.v1.contracts.ratecards.RateCardRetrieveRateScheduleParams
import com.metronome.api.models.v1.contracts.ratecards.RateCardRetrieveRateScheduleResponse
import com.metronome.api.models.v1.contracts.ratecards.RateCardRetrieveResponse
import com.metronome.api.models.v1.contracts.ratecards.RateCardUpdateParams
import com.metronome.api.models.v1.contracts.ratecards.RateCardUpdateResponse
import com.metronome.api.services.async.v1.contracts.ratecards.NamedScheduleServiceAsync
import com.metronome.api.services.async.v1.contracts.ratecards.ProductOrderServiceAsync
import com.metronome.api.services.async.v1.contracts.ratecards.RateServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface RateCardServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): RateCardServiceAsync

    fun productOrders(): ProductOrderServiceAsync

    fun rates(): RateServiceAsync

    fun namedSchedules(): NamedScheduleServiceAsync

    /**
     * In Metronome, the rate card is the central location for your pricing. Rate cards were built
     * with new product launches and pricing changes in mind - you can update your products and
     * pricing in one place, and that change will be automatically propagated across your customer
     * cohorts. Most clients need only maintain one or a few rate cards within Metronome.
     *
     * ### Use this endpoint to:
     * - Create a rate card with a name and description
     * - Define the rate card's single underlying fiat currency, and any number of conversion rates
     *   between that fiat currency and custom pricing units. You can then add products and
     *   associated rates in the fiat currency or custom pricing unit for which you have defined a
     *   conversion rate.
     * - Set aliases for the rate card. Aliases are human-readable names that you can use in the
     *   place of the id of the rate card when provisioning a customer's contract. By using an
     *   alias, you can easily create a contract and provision a customer by choosing the paygo rate
     *   card, without storing the rate card id in your internal systems. This is helpful when
     *   launching a new rate card for paygo customers, you can update the alias for paygo to be
     *   scheduled to be assigned to the new rate card without updating your code.
     *
     * ### Key response fields:
     * - The ID of the rate card you just created
     *
     * ### Usage guidelines:
     * - After creating a rate card, you can now use the addRate or addRates endpoints to add
     *   products and their prices to it
     * - A rate card alias can only be used by one rate card at a time. If you create a contract
     *   with a rate card alias that is already in use by another rate card, the original rate
     *   card's alias schedule will be updated. The alias will reference the rate card to which it
     *   was most recently assigned.
     */
    fun create(params: RateCardCreateParams): CompletableFuture<RateCardCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: RateCardCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RateCardCreateResponse>

    /**
     * Return details for a specific rate card including name, description, and aliases. This
     * endpoint does not return rates - use the dedicated getRates or getRateSchedule endpoints to
     * understand the rates on a rate card.
     */
    fun retrieve(params: RateCardRetrieveParams): CompletableFuture<RateCardRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: RateCardRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RateCardRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        id: Id,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RateCardRetrieveResponse> =
        retrieve(RateCardRetrieveParams.builder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(id: Id): CompletableFuture<RateCardRetrieveResponse> =
        retrieve(id, RequestOptions.none())

    /**
     * Update the metadata properties of an existing rate card, including its name, description, and
     * aliases. This endpoint is designed for managing rate card identity and reference aliases
     * rather than modifying pricing rates.
     *
     * Modifies the descriptive properties and alias configuration of a rate card without affecting
     * the underlying pricing rates or schedules. This allows you to update how a rate card is
     * identified and referenced throughout your system.
     *
     * ### Use this endpoint to:
     * - Rate card renaming: Update display names or descriptions for organizational clarity
     * - Alias management: Add, modify, or schedule alias transitions for seamless rate card
     *   migrations
     * - Documentation updates: Keep rate card descriptions current with business context
     * - Self-serve provisioning setup: Configure aliases to enable code-free rate card transitions
     *
     * #### Active contract impact:
     * - Alias changes: Already-created contracts continue using their originally assigned rate
     *   cards.
     * - Other changes made using this endpoint will only impact the Metronome UI.
     *
     * #### Grandfathering existing PLG customer pricing:
     * - Rate card aliases support scheduled transitions, enabling seamless rate card migrations for
     *   new customers, allowing existing customers to be grandfathered into their existing prices
     *   without code. Note that there are multiple mechanisms to support grandfathering in
     *   Metronome.
     *
     * #### How scheduled aliases work for PLG grandfathering:
     * Initial setup:
     * - Add alias to current rate card: Assign a stable alias (e.g., "standard-pricing") to your
     *   active rate card
     * - Reference alias during contract creation: Configure your self-serve workflow to create
     *   contracts using `rate_card_alias` instead of direct `rate_card_id`
     * - Automatic resolution: New contracts referencing the alias automatically resolve to the rate
     *   card associated with the alias at the point in time of provisioning
     *
     * #### Grandfathering process:
     * - Create new rate card: Build your new rate card with updated pricing structure
     * - Schedule alias transition: Add the same alias to the new rate card with a `starting_at`
     *   timestamp
     * - Automatic cutover: Starting at the scheduled time, new contracts created in your PLG
     *   workflow using that alias will automatically reference the new rate card
     */
    fun update(params: RateCardUpdateParams): CompletableFuture<RateCardUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: RateCardUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RateCardUpdateResponse>

    /**
     * List all rate cards. Returns rate card IDs, names, descriptions, aliases, and other details.
     * To view the rates associated with a given rate card, use the getRates or getRateSchedule
     * endpoints.
     */
    fun list(): CompletableFuture<RateCardListPageAsync> = list(RateCardListParams.none())

    /** @see list */
    fun list(
        params: RateCardListParams = RateCardListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RateCardListPageAsync>

    /** @see list */
    fun list(
        params: RateCardListParams = RateCardListParams.none()
    ): CompletableFuture<RateCardListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        body: JsonValue,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RateCardListPageAsync> =
        list(RateCardListParams.builder().body(body).build(), requestOptions)

    /** @see list */
    fun list(body: JsonValue): CompletableFuture<RateCardListPageAsync> =
        list(body, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<RateCardListPageAsync> =
        list(RateCardListParams.none(), requestOptions)

    /**
     * Permanently disable a rate card by archiving it, preventing use in new contracts while
     * preserving existing contract pricing. Use this when retiring old pricing models,
     * consolidating rate cards, or removing outdated pricing structures. Returns the archived rate
     * card ID and stops the rate card from appearing in contract creation workflows.
     */
    fun archive(params: RateCardArchiveParams): CompletableFuture<RateCardArchiveResponse> =
        archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: RateCardArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RateCardArchiveResponse>

    /** @see archive */
    fun archive(
        id: Id,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RateCardArchiveResponse> =
        archive(RateCardArchiveParams.builder().id(id).build(), requestOptions)

    /** @see archive */
    fun archive(id: Id): CompletableFuture<RateCardArchiveResponse> =
        archive(id, RequestOptions.none())

    /**
     * A rate card defines the prices that you charge for your products. Rate cards support
     * scheduled changes over time, to allow you to easily roll out pricing changes and new product
     * launches across your customer base. Use this endpoint to understand the rate schedule
     * `starting_at` a given date, optionally filtering the list of rates returned based on product
     * id or pricing group values. For example, you may want to display a schedule of upcoming price
     * changes for a given product in your product experience - use this endpoint to fetch that
     * information from its source of truth in Metronome.
     *
     * If you want to understand the rates for a specific customer's contract, inclusive of
     * contract-level overrides, use the `getContractRateSchedule` endpoint.
     */
    fun retrieveRateSchedule(
        params: RateCardRetrieveRateScheduleParams
    ): CompletableFuture<RateCardRetrieveRateScheduleResponse> =
        retrieveRateSchedule(params, RequestOptions.none())

    /** @see retrieveRateSchedule */
    fun retrieveRateSchedule(
        params: RateCardRetrieveRateScheduleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<RateCardRetrieveRateScheduleResponse>

    /**
     * A view of [RateCardServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RateCardServiceAsync.WithRawResponse

        fun productOrders(): ProductOrderServiceAsync.WithRawResponse

        fun rates(): RateServiceAsync.WithRawResponse

        fun namedSchedules(): NamedScheduleServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/contract-pricing/rate-cards/create`, but is
         * otherwise the same as [RateCardServiceAsync.create].
         */
        fun create(
            params: RateCardCreateParams
        ): CompletableFuture<HttpResponseFor<RateCardCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: RateCardCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RateCardCreateResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/contract-pricing/rate-cards/get`, but is
         * otherwise the same as [RateCardServiceAsync.retrieve].
         */
        fun retrieve(
            params: RateCardRetrieveParams
        ): CompletableFuture<HttpResponseFor<RateCardRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: RateCardRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RateCardRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            id: Id,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RateCardRetrieveResponse>> =
            retrieve(RateCardRetrieveParams.builder().id(id).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(id: Id): CompletableFuture<HttpResponseFor<RateCardRetrieveResponse>> =
            retrieve(id, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /v1/contract-pricing/rate-cards/update`, but is
         * otherwise the same as [RateCardServiceAsync.update].
         */
        fun update(
            params: RateCardUpdateParams
        ): CompletableFuture<HttpResponseFor<RateCardUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: RateCardUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RateCardUpdateResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/contract-pricing/rate-cards/list`, but is
         * otherwise the same as [RateCardServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<RateCardListPageAsync>> =
            list(RateCardListParams.none())

        /** @see list */
        fun list(
            params: RateCardListParams = RateCardListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RateCardListPageAsync>>

        /** @see list */
        fun list(
            params: RateCardListParams = RateCardListParams.none()
        ): CompletableFuture<HttpResponseFor<RateCardListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            body: JsonValue,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RateCardListPageAsync>> =
            list(RateCardListParams.builder().body(body).build(), requestOptions)

        /** @see list */
        fun list(body: JsonValue): CompletableFuture<HttpResponseFor<RateCardListPageAsync>> =
            list(body, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<RateCardListPageAsync>> =
            list(RateCardListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/contract-pricing/rate-cards/archive`, but is
         * otherwise the same as [RateCardServiceAsync.archive].
         */
        fun archive(
            params: RateCardArchiveParams
        ): CompletableFuture<HttpResponseFor<RateCardArchiveResponse>> =
            archive(params, RequestOptions.none())

        /** @see archive */
        fun archive(
            params: RateCardArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RateCardArchiveResponse>>

        /** @see archive */
        fun archive(
            id: Id,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RateCardArchiveResponse>> =
            archive(RateCardArchiveParams.builder().id(id).build(), requestOptions)

        /** @see archive */
        fun archive(id: Id): CompletableFuture<HttpResponseFor<RateCardArchiveResponse>> =
            archive(id, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /v1/contract-pricing/rate-cards/getRateSchedule`,
         * but is otherwise the same as [RateCardServiceAsync.retrieveRateSchedule].
         */
        fun retrieveRateSchedule(
            params: RateCardRetrieveRateScheduleParams
        ): CompletableFuture<HttpResponseFor<RateCardRetrieveRateScheduleResponse>> =
            retrieveRateSchedule(params, RequestOptions.none())

        /** @see retrieveRateSchedule */
        fun retrieveRateSchedule(
            params: RateCardRetrieveRateScheduleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<RateCardRetrieveRateScheduleResponse>>
    }
}
