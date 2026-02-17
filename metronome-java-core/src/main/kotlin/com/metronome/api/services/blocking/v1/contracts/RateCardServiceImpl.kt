// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1.contracts

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.handlers.errorHandler
import com.metronome.api.core.handlers.jsonHandler
import com.metronome.api.core.handlers.withErrorHandler
import com.metronome.api.core.http.HttpMethod
import com.metronome.api.core.http.HttpRequest
import com.metronome.api.core.http.HttpResponse.Handler
import com.metronome.api.core.json
import com.metronome.api.core.prepare
import com.metronome.api.errors.MetronomeError
import com.metronome.api.models.V1ContractRateCardArchiveParams
import com.metronome.api.models.V1ContractRateCardArchiveResponse
import com.metronome.api.models.V1ContractRateCardCreateParams
import com.metronome.api.models.V1ContractRateCardCreateResponse
import com.metronome.api.models.V1ContractRateCardListPage
import com.metronome.api.models.V1ContractRateCardListParams
import com.metronome.api.models.V1ContractRateCardRetrieveParams
import com.metronome.api.models.V1ContractRateCardRetrieveRateScheduleParams
import com.metronome.api.models.V1ContractRateCardRetrieveRateScheduleResponse
import com.metronome.api.models.V1ContractRateCardRetrieveResponse
import com.metronome.api.models.V1ContractRateCardUpdateParams
import com.metronome.api.models.V1ContractRateCardUpdateResponse
import com.metronome.api.services.blocking.v1.contracts.rateCards.NamedScheduleService
import com.metronome.api.services.blocking.v1.contracts.rateCards.NamedScheduleServiceImpl
import com.metronome.api.services.blocking.v1.contracts.rateCards.ProductOrderService
import com.metronome.api.services.blocking.v1.contracts.rateCards.ProductOrderServiceImpl
import com.metronome.api.services.blocking.v1.contracts.rateCards.RateService
import com.metronome.api.services.blocking.v1.contracts.rateCards.RateServiceImpl

class RateCardServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RateCardService {

    private val errorHandler: Handler<MetronomeError> = errorHandler(clientOptions.jsonMapper)

    private val productOrders: ProductOrderService by lazy {
        ProductOrderServiceImpl(clientOptions)
    }

    private val rates: RateService by lazy { RateServiceImpl(clientOptions) }

    private val namedSchedules: NamedScheduleService by lazy {
        NamedScheduleServiceImpl(clientOptions)
    }

    override fun productOrders(): ProductOrderService = productOrders

    override fun rates(): RateService = rates

    override fun namedSchedules(): NamedScheduleService = namedSchedules

    private val createHandler: Handler<V1ContractRateCardCreateResponse> =
        jsonHandler<V1ContractRateCardCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

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
    override fun create(
        params: V1ContractRateCardCreateParams,
        requestOptions: RequestOptions,
    ): V1ContractRateCardCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "contract-pricing", "rate-cards", "create")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val retrieveHandler: Handler<V1ContractRateCardRetrieveResponse> =
        jsonHandler<V1ContractRateCardRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Return details for a specific rate card including name, description, and aliases. This
     * endpoint does not return rates - use the dedicated getRates or getRateSchedule endpoints to
     * understand the rates on a rate card.
     */
    override fun retrieve(
        params: V1ContractRateCardRetrieveParams,
        requestOptions: RequestOptions,
    ): V1ContractRateCardRetrieveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "contract-pricing", "rate-cards", "get")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val updateHandler: Handler<V1ContractRateCardUpdateResponse> =
        jsonHandler<V1ContractRateCardUpdateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

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
     *
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
    override fun update(
        params: V1ContractRateCardUpdateParams,
        requestOptions: RequestOptions,
    ): V1ContractRateCardUpdateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "contract-pricing", "rate-cards", "update")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { updateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<V1ContractRateCardListPage.Response> =
        jsonHandler<V1ContractRateCardListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * List all rate cards. Returns rate card IDs, names, descriptions, aliases, and other details.
     * To view the rates associated with a given rate card, use the getRates or getRateSchedule
     * endpoints.
     */
    override fun list(
        params: V1ContractRateCardListParams,
        requestOptions: RequestOptions,
    ): V1ContractRateCardListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "contract-pricing", "rate-cards", "list")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
            .let { V1ContractRateCardListPage.of(this, params, it) }
    }

    private val archiveHandler: Handler<V1ContractRateCardArchiveResponse> =
        jsonHandler<V1ContractRateCardArchiveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Permanently disable a rate card by archiving it, preventing use in new contracts while
     * preserving existing contract pricing. Use this when retiring old pricing models,
     * consolidating rate cards, or removing outdated pricing structures. Returns the archived rate
     * card ID and stops the rate card from appearing in contract creation workflows.
     */
    override fun archive(
        params: V1ContractRateCardArchiveParams,
        requestOptions: RequestOptions,
    ): V1ContractRateCardArchiveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "contract-pricing", "rate-cards", "archive")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { archiveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val retrieveRateScheduleHandler:
        Handler<V1ContractRateCardRetrieveRateScheduleResponse> =
        jsonHandler<V1ContractRateCardRetrieveRateScheduleResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

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
    override fun retrieveRateSchedule(
        params: V1ContractRateCardRetrieveRateScheduleParams,
        requestOptions: RequestOptions,
    ): V1ContractRateCardRetrieveRateScheduleResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "contract-pricing", "rate-cards", "getRateSchedule")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveRateScheduleHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
