// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.Params
import com.metronome.api.core.checkKnown
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import com.metronome.api.models.CommitHierarchyConfiguration
import com.metronome.api.models.CommitSpecifierInput
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Amendments will be replaced by Contract editing. New clients should implement using the
 * `editContract` endpoint. Read more about the migration to contract editing
 * [here](/guides/implement-metronome/migrate-amendments-to-edits/) and reach out to your Metronome
 * representative for more details. Once contract editing is enabled, access to this endpoint will
 * be removed.
 */
class ContractAmendParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * ID of the contract to amend
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun contractId(): String = body.contractId()

    /**
     * ID of the customer whose contract is to be amended
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = body.customerId()

    /**
     * inclusive start time for the amendment
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun startingAt(): OffsetDateTime = body.startingAt()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commits(): Optional<List<Commit>> = body.commits()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun credits(): Optional<List<Credit>> = body.credits()

    /**
     * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customFields(): Optional<CustomFields> = body.customFields()

    /**
     * This field's availability is dependent on your client's configuration.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun discounts(): Optional<List<Discount>> = body.discounts()

    /**
     * This field's availability is dependent on your client's configuration.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun netsuiteSalesOrderId(): Optional<String> = body.netsuiteSalesOrderId()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun overrides(): Optional<List<Override>> = body.overrides()

    /**
     * This field's availability is dependent on your client's configuration.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun professionalServices(): Optional<List<ProfessionalService>> = body.professionalServices()

    /**
     * This field's availability is dependent on your client's configuration.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resellerRoyalties(): Optional<List<ResellerRoyalty>> = body.resellerRoyalties()

    /**
     * This field's availability is dependent on your client's configuration.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun salesforceOpportunityId(): Optional<String> = body.salesforceOpportunityId()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scheduledCharges(): Optional<List<ScheduledCharge>> = body.scheduledCharges()

    /**
     * This field's availability is dependent on your client's configuration.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalContractValue(): Optional<Double> = body.totalContractValue()

    /**
     * Returns the raw JSON value of [contractId].
     *
     * Unlike [contractId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _contractId(): JsonField<String> = body._contractId()

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customerId(): JsonField<String> = body._customerId()

    /**
     * Returns the raw JSON value of [startingAt].
     *
     * Unlike [startingAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _startingAt(): JsonField<OffsetDateTime> = body._startingAt()

    /**
     * Returns the raw JSON value of [commits].
     *
     * Unlike [commits], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _commits(): JsonField<List<Commit>> = body._commits()

    /**
     * Returns the raw JSON value of [credits].
     *
     * Unlike [credits], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _credits(): JsonField<List<Credit>> = body._credits()

    /**
     * Returns the raw JSON value of [customFields].
     *
     * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customFields(): JsonField<CustomFields> = body._customFields()

    /**
     * Returns the raw JSON value of [discounts].
     *
     * Unlike [discounts], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _discounts(): JsonField<List<Discount>> = body._discounts()

    /**
     * Returns the raw JSON value of [netsuiteSalesOrderId].
     *
     * Unlike [netsuiteSalesOrderId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _netsuiteSalesOrderId(): JsonField<String> = body._netsuiteSalesOrderId()

    /**
     * Returns the raw JSON value of [overrides].
     *
     * Unlike [overrides], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _overrides(): JsonField<List<Override>> = body._overrides()

    /**
     * Returns the raw JSON value of [professionalServices].
     *
     * Unlike [professionalServices], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _professionalServices(): JsonField<List<ProfessionalService>> = body._professionalServices()

    /**
     * Returns the raw JSON value of [resellerRoyalties].
     *
     * Unlike [resellerRoyalties], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _resellerRoyalties(): JsonField<List<ResellerRoyalty>> = body._resellerRoyalties()

    /**
     * Returns the raw JSON value of [salesforceOpportunityId].
     *
     * Unlike [salesforceOpportunityId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _salesforceOpportunityId(): JsonField<String> = body._salesforceOpportunityId()

    /**
     * Returns the raw JSON value of [scheduledCharges].
     *
     * Unlike [scheduledCharges], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _scheduledCharges(): JsonField<List<ScheduledCharge>> = body._scheduledCharges()

    /**
     * Returns the raw JSON value of [totalContractValue].
     *
     * Unlike [totalContractValue], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _totalContractValue(): JsonField<Double> = body._totalContractValue()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ContractAmendParams].
         *
         * The following fields are required:
         * ```java
         * .contractId()
         * .customerId()
         * .startingAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ContractAmendParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(contractAmendParams: ContractAmendParams) = apply {
            body = contractAmendParams.body.toBuilder()
            additionalHeaders = contractAmendParams.additionalHeaders.toBuilder()
            additionalQueryParams = contractAmendParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [contractId]
         * - [customerId]
         * - [startingAt]
         * - [commits]
         * - [credits]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** ID of the contract to amend */
        fun contractId(contractId: String) = apply { body.contractId(contractId) }

        /**
         * Sets [Builder.contractId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contractId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contractId(contractId: JsonField<String>) = apply { body.contractId(contractId) }

        /** ID of the customer whose contract is to be amended */
        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        /** inclusive start time for the amendment */
        fun startingAt(startingAt: OffsetDateTime) = apply { body.startingAt(startingAt) }

        /**
         * Sets [Builder.startingAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startingAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
            body.startingAt(startingAt)
        }

        fun commits(commits: List<Commit>) = apply { body.commits(commits) }

        /**
         * Sets [Builder.commits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commits] with a well-typed `List<Commit>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun commits(commits: JsonField<List<Commit>>) = apply { body.commits(commits) }

        /**
         * Adds a single [Commit] to [commits].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCommit(commit: Commit) = apply { body.addCommit(commit) }

        fun credits(credits: List<Credit>) = apply { body.credits(credits) }

        /**
         * Sets [Builder.credits] to an arbitrary JSON value.
         *
         * You should usually call [Builder.credits] with a well-typed `List<Credit>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun credits(credits: JsonField<List<Credit>>) = apply { body.credits(credits) }

        /**
         * Adds a single [Credit] to [credits].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCredit(credit: Credit) = apply { body.addCredit(credit) }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun customFields(customFields: CustomFields) = apply { body.customFields(customFields) }

        /**
         * Sets [Builder.customFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customFields] with a well-typed [CustomFields] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customFields(customFields: JsonField<CustomFields>) = apply {
            body.customFields(customFields)
        }

        /** This field's availability is dependent on your client's configuration. */
        fun discounts(discounts: List<Discount>) = apply { body.discounts(discounts) }

        /**
         * Sets [Builder.discounts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.discounts] with a well-typed `List<Discount>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun discounts(discounts: JsonField<List<Discount>>) = apply { body.discounts(discounts) }

        /**
         * Adds a single [Discount] to [discounts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDiscount(discount: Discount) = apply { body.addDiscount(discount) }

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) = apply {
            body.netsuiteSalesOrderId(netsuiteSalesOrderId)
        }

        /**
         * Sets [Builder.netsuiteSalesOrderId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netsuiteSalesOrderId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
            body.netsuiteSalesOrderId(netsuiteSalesOrderId)
        }

        fun overrides(overrides: List<Override>) = apply { body.overrides(overrides) }

        /**
         * Sets [Builder.overrides] to an arbitrary JSON value.
         *
         * You should usually call [Builder.overrides] with a well-typed `List<Override>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun overrides(overrides: JsonField<List<Override>>) = apply { body.overrides(overrides) }

        /**
         * Adds a single [Override] to [overrides].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addOverride(override: Override) = apply { body.addOverride(override) }

        /** This field's availability is dependent on your client's configuration. */
        fun professionalServices(professionalServices: List<ProfessionalService>) = apply {
            body.professionalServices(professionalServices)
        }

        /**
         * Sets [Builder.professionalServices] to an arbitrary JSON value.
         *
         * You should usually call [Builder.professionalServices] with a well-typed
         * `List<ProfessionalService>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun professionalServices(professionalServices: JsonField<List<ProfessionalService>>) =
            apply {
                body.professionalServices(professionalServices)
            }

        /**
         * Adds a single [ProfessionalService] to [professionalServices].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addProfessionalService(professionalService: ProfessionalService) = apply {
            body.addProfessionalService(professionalService)
        }

        /** This field's availability is dependent on your client's configuration. */
        fun resellerRoyalties(resellerRoyalties: List<ResellerRoyalty>) = apply {
            body.resellerRoyalties(resellerRoyalties)
        }

        /**
         * Sets [Builder.resellerRoyalties] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resellerRoyalties] with a well-typed
         * `List<ResellerRoyalty>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun resellerRoyalties(resellerRoyalties: JsonField<List<ResellerRoyalty>>) = apply {
            body.resellerRoyalties(resellerRoyalties)
        }

        /**
         * Adds a single [ResellerRoyalty] to [resellerRoyalties].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addResellerRoyalty(resellerRoyalty: ResellerRoyalty) = apply {
            body.addResellerRoyalty(resellerRoyalty)
        }

        /** This field's availability is dependent on your client's configuration. */
        fun salesforceOpportunityId(salesforceOpportunityId: String) = apply {
            body.salesforceOpportunityId(salesforceOpportunityId)
        }

        /**
         * Sets [Builder.salesforceOpportunityId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.salesforceOpportunityId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun salesforceOpportunityId(salesforceOpportunityId: JsonField<String>) = apply {
            body.salesforceOpportunityId(salesforceOpportunityId)
        }

        fun scheduledCharges(scheduledCharges: List<ScheduledCharge>) = apply {
            body.scheduledCharges(scheduledCharges)
        }

        /**
         * Sets [Builder.scheduledCharges] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scheduledCharges] with a well-typed
         * `List<ScheduledCharge>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun scheduledCharges(scheduledCharges: JsonField<List<ScheduledCharge>>) = apply {
            body.scheduledCharges(scheduledCharges)
        }

        /**
         * Adds a single [ScheduledCharge] to [scheduledCharges].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addScheduledCharge(scheduledCharge: ScheduledCharge) = apply {
            body.addScheduledCharge(scheduledCharge)
        }

        /** This field's availability is dependent on your client's configuration. */
        fun totalContractValue(totalContractValue: Double) = apply {
            body.totalContractValue(totalContractValue)
        }

        /**
         * Sets [Builder.totalContractValue] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalContractValue] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun totalContractValue(totalContractValue: JsonField<Double>) = apply {
            body.totalContractValue(totalContractValue)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [ContractAmendParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .contractId()
         * .customerId()
         * .startingAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ContractAmendParams =
            ContractAmendParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val contractId: JsonField<String>,
        private val customerId: JsonField<String>,
        private val startingAt: JsonField<OffsetDateTime>,
        private val commits: JsonField<List<Commit>>,
        private val credits: JsonField<List<Credit>>,
        private val customFields: JsonField<CustomFields>,
        private val discounts: JsonField<List<Discount>>,
        private val netsuiteSalesOrderId: JsonField<String>,
        private val overrides: JsonField<List<Override>>,
        private val professionalServices: JsonField<List<ProfessionalService>>,
        private val resellerRoyalties: JsonField<List<ResellerRoyalty>>,
        private val salesforceOpportunityId: JsonField<String>,
        private val scheduledCharges: JsonField<List<ScheduledCharge>>,
        private val totalContractValue: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("contract_id")
            @ExcludeMissing
            contractId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customer_id")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("starting_at")
            @ExcludeMissing
            startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("commits")
            @ExcludeMissing
            commits: JsonField<List<Commit>> = JsonMissing.of(),
            @JsonProperty("credits")
            @ExcludeMissing
            credits: JsonField<List<Credit>> = JsonMissing.of(),
            @JsonProperty("custom_fields")
            @ExcludeMissing
            customFields: JsonField<CustomFields> = JsonMissing.of(),
            @JsonProperty("discounts")
            @ExcludeMissing
            discounts: JsonField<List<Discount>> = JsonMissing.of(),
            @JsonProperty("netsuite_sales_order_id")
            @ExcludeMissing
            netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("overrides")
            @ExcludeMissing
            overrides: JsonField<List<Override>> = JsonMissing.of(),
            @JsonProperty("professional_services")
            @ExcludeMissing
            professionalServices: JsonField<List<ProfessionalService>> = JsonMissing.of(),
            @JsonProperty("reseller_royalties")
            @ExcludeMissing
            resellerRoyalties: JsonField<List<ResellerRoyalty>> = JsonMissing.of(),
            @JsonProperty("salesforce_opportunity_id")
            @ExcludeMissing
            salesforceOpportunityId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("scheduled_charges")
            @ExcludeMissing
            scheduledCharges: JsonField<List<ScheduledCharge>> = JsonMissing.of(),
            @JsonProperty("total_contract_value")
            @ExcludeMissing
            totalContractValue: JsonField<Double> = JsonMissing.of(),
        ) : this(
            contractId,
            customerId,
            startingAt,
            commits,
            credits,
            customFields,
            discounts,
            netsuiteSalesOrderId,
            overrides,
            professionalServices,
            resellerRoyalties,
            salesforceOpportunityId,
            scheduledCharges,
            totalContractValue,
            mutableMapOf(),
        )

        /**
         * ID of the contract to amend
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun contractId(): String = contractId.getRequired("contract_id")

        /**
         * ID of the customer whose contract is to be amended
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * inclusive start time for the amendment
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun commits(): Optional<List<Commit>> = commits.getOptional("commits")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun credits(): Optional<List<Credit>> = credits.getOptional("credits")

        /**
         * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun customFields(): Optional<CustomFields> = customFields.getOptional("custom_fields")

        /**
         * This field's availability is dependent on your client's configuration.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun discounts(): Optional<List<Discount>> = discounts.getOptional("discounts")

        /**
         * This field's availability is dependent on your client's configuration.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun netsuiteSalesOrderId(): Optional<String> =
            netsuiteSalesOrderId.getOptional("netsuite_sales_order_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun overrides(): Optional<List<Override>> = overrides.getOptional("overrides")

        /**
         * This field's availability is dependent on your client's configuration.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun professionalServices(): Optional<List<ProfessionalService>> =
            professionalServices.getOptional("professional_services")

        /**
         * This field's availability is dependent on your client's configuration.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun resellerRoyalties(): Optional<List<ResellerRoyalty>> =
            resellerRoyalties.getOptional("reseller_royalties")

        /**
         * This field's availability is dependent on your client's configuration.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun salesforceOpportunityId(): Optional<String> =
            salesforceOpportunityId.getOptional("salesforce_opportunity_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun scheduledCharges(): Optional<List<ScheduledCharge>> =
            scheduledCharges.getOptional("scheduled_charges")

        /**
         * This field's availability is dependent on your client's configuration.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun totalContractValue(): Optional<Double> =
            totalContractValue.getOptional("total_contract_value")

        /**
         * Returns the raw JSON value of [contractId].
         *
         * Unlike [contractId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("contract_id")
        @ExcludeMissing
        fun _contractId(): JsonField<String> = contractId

        /**
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * Returns the raw JSON value of [startingAt].
         *
         * Unlike [startingAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("starting_at")
        @ExcludeMissing
        fun _startingAt(): JsonField<OffsetDateTime> = startingAt

        /**
         * Returns the raw JSON value of [commits].
         *
         * Unlike [commits], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("commits") @ExcludeMissing fun _commits(): JsonField<List<Commit>> = commits

        /**
         * Returns the raw JSON value of [credits].
         *
         * Unlike [credits], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("credits") @ExcludeMissing fun _credits(): JsonField<List<Credit>> = credits

        /**
         * Returns the raw JSON value of [customFields].
         *
         * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

        /**
         * Returns the raw JSON value of [discounts].
         *
         * Unlike [discounts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("discounts")
        @ExcludeMissing
        fun _discounts(): JsonField<List<Discount>> = discounts

        /**
         * Returns the raw JSON value of [netsuiteSalesOrderId].
         *
         * Unlike [netsuiteSalesOrderId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        fun _netsuiteSalesOrderId(): JsonField<String> = netsuiteSalesOrderId

        /**
         * Returns the raw JSON value of [overrides].
         *
         * Unlike [overrides], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("overrides")
        @ExcludeMissing
        fun _overrides(): JsonField<List<Override>> = overrides

        /**
         * Returns the raw JSON value of [professionalServices].
         *
         * Unlike [professionalServices], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("professional_services")
        @ExcludeMissing
        fun _professionalServices(): JsonField<List<ProfessionalService>> = professionalServices

        /**
         * Returns the raw JSON value of [resellerRoyalties].
         *
         * Unlike [resellerRoyalties], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("reseller_royalties")
        @ExcludeMissing
        fun _resellerRoyalties(): JsonField<List<ResellerRoyalty>> = resellerRoyalties

        /**
         * Returns the raw JSON value of [salesforceOpportunityId].
         *
         * Unlike [salesforceOpportunityId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("salesforce_opportunity_id")
        @ExcludeMissing
        fun _salesforceOpportunityId(): JsonField<String> = salesforceOpportunityId

        /**
         * Returns the raw JSON value of [scheduledCharges].
         *
         * Unlike [scheduledCharges], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("scheduled_charges")
        @ExcludeMissing
        fun _scheduledCharges(): JsonField<List<ScheduledCharge>> = scheduledCharges

        /**
         * Returns the raw JSON value of [totalContractValue].
         *
         * Unlike [totalContractValue], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("total_contract_value")
        @ExcludeMissing
        fun _totalContractValue(): JsonField<Double> = totalContractValue

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .contractId()
             * .customerId()
             * .startingAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var contractId: JsonField<String>? = null
            private var customerId: JsonField<String>? = null
            private var startingAt: JsonField<OffsetDateTime>? = null
            private var commits: JsonField<MutableList<Commit>>? = null
            private var credits: JsonField<MutableList<Credit>>? = null
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var discounts: JsonField<MutableList<Discount>>? = null
            private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
            private var overrides: JsonField<MutableList<Override>>? = null
            private var professionalServices: JsonField<MutableList<ProfessionalService>>? = null
            private var resellerRoyalties: JsonField<MutableList<ResellerRoyalty>>? = null
            private var salesforceOpportunityId: JsonField<String> = JsonMissing.of()
            private var scheduledCharges: JsonField<MutableList<ScheduledCharge>>? = null
            private var totalContractValue: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                contractId = body.contractId
                customerId = body.customerId
                startingAt = body.startingAt
                commits = body.commits.map { it.toMutableList() }
                credits = body.credits.map { it.toMutableList() }
                customFields = body.customFields
                discounts = body.discounts.map { it.toMutableList() }
                netsuiteSalesOrderId = body.netsuiteSalesOrderId
                overrides = body.overrides.map { it.toMutableList() }
                professionalServices = body.professionalServices.map { it.toMutableList() }
                resellerRoyalties = body.resellerRoyalties.map { it.toMutableList() }
                salesforceOpportunityId = body.salesforceOpportunityId
                scheduledCharges = body.scheduledCharges.map { it.toMutableList() }
                totalContractValue = body.totalContractValue
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** ID of the contract to amend */
            fun contractId(contractId: String) = contractId(JsonField.of(contractId))

            /**
             * Sets [Builder.contractId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contractId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contractId(contractId: JsonField<String>) = apply { this.contractId = contractId }

            /** ID of the customer whose contract is to be amended */
            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /** inclusive start time for the amendment */
            fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

            /**
             * Sets [Builder.startingAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startingAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                this.startingAt = startingAt
            }

            fun commits(commits: List<Commit>) = commits(JsonField.of(commits))

            /**
             * Sets [Builder.commits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commits] with a well-typed `List<Commit>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun commits(commits: JsonField<List<Commit>>) = apply {
                this.commits = commits.map { it.toMutableList() }
            }

            /**
             * Adds a single [Commit] to [commits].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCommit(commit: Commit) = apply {
                commits =
                    (commits ?: JsonField.of(mutableListOf())).also {
                        checkKnown("commits", it).add(commit)
                    }
            }

            fun credits(credits: List<Credit>) = credits(JsonField.of(credits))

            /**
             * Sets [Builder.credits] to an arbitrary JSON value.
             *
             * You should usually call [Builder.credits] with a well-typed `List<Credit>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun credits(credits: JsonField<List<Credit>>) = apply {
                this.credits = credits.map { it.toMutableList() }
            }

            /**
             * Adds a single [Credit] to [credits].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCredit(credit: Credit) = apply {
                credits =
                    (credits ?: JsonField.of(mutableListOf())).also {
                        checkKnown("credits", it).add(credit)
                    }
            }

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

            /**
             * Sets [Builder.customFields] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customFields] with a well-typed [CustomFields] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customFields(customFields: JsonField<CustomFields>) = apply {
                this.customFields = customFields
            }

            /** This field's availability is dependent on your client's configuration. */
            fun discounts(discounts: List<Discount>) = discounts(JsonField.of(discounts))

            /**
             * Sets [Builder.discounts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discounts] with a well-typed `List<Discount>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun discounts(discounts: JsonField<List<Discount>>) = apply {
                this.discounts = discounts.map { it.toMutableList() }
            }

            /**
             * Adds a single [Discount] to [discounts].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDiscount(discount: Discount) = apply {
                discounts =
                    (discounts ?: JsonField.of(mutableListOf())).also {
                        checkKnown("discounts", it).add(discount)
                    }
            }

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
                netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

            /**
             * Sets [Builder.netsuiteSalesOrderId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.netsuiteSalesOrderId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
                this.netsuiteSalesOrderId = netsuiteSalesOrderId
            }

            fun overrides(overrides: List<Override>) = overrides(JsonField.of(overrides))

            /**
             * Sets [Builder.overrides] to an arbitrary JSON value.
             *
             * You should usually call [Builder.overrides] with a well-typed `List<Override>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun overrides(overrides: JsonField<List<Override>>) = apply {
                this.overrides = overrides.map { it.toMutableList() }
            }

            /**
             * Adds a single [Override] to [overrides].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOverride(override: Override) = apply {
                overrides =
                    (overrides ?: JsonField.of(mutableListOf())).also {
                        checkKnown("overrides", it).add(override)
                    }
            }

            /** This field's availability is dependent on your client's configuration. */
            fun professionalServices(professionalServices: List<ProfessionalService>) =
                professionalServices(JsonField.of(professionalServices))

            /**
             * Sets [Builder.professionalServices] to an arbitrary JSON value.
             *
             * You should usually call [Builder.professionalServices] with a well-typed
             * `List<ProfessionalService>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun professionalServices(professionalServices: JsonField<List<ProfessionalService>>) =
                apply {
                    this.professionalServices = professionalServices.map { it.toMutableList() }
                }

            /**
             * Adds a single [ProfessionalService] to [professionalServices].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addProfessionalService(professionalService: ProfessionalService) = apply {
                professionalServices =
                    (professionalServices ?: JsonField.of(mutableListOf())).also {
                        checkKnown("professionalServices", it).add(professionalService)
                    }
            }

            /** This field's availability is dependent on your client's configuration. */
            fun resellerRoyalties(resellerRoyalties: List<ResellerRoyalty>) =
                resellerRoyalties(JsonField.of(resellerRoyalties))

            /**
             * Sets [Builder.resellerRoyalties] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resellerRoyalties] with a well-typed
             * `List<ResellerRoyalty>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun resellerRoyalties(resellerRoyalties: JsonField<List<ResellerRoyalty>>) = apply {
                this.resellerRoyalties = resellerRoyalties.map { it.toMutableList() }
            }

            /**
             * Adds a single [ResellerRoyalty] to [resellerRoyalties].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addResellerRoyalty(resellerRoyalty: ResellerRoyalty) = apply {
                resellerRoyalties =
                    (resellerRoyalties ?: JsonField.of(mutableListOf())).also {
                        checkKnown("resellerRoyalties", it).add(resellerRoyalty)
                    }
            }

            /** This field's availability is dependent on your client's configuration. */
            fun salesforceOpportunityId(salesforceOpportunityId: String) =
                salesforceOpportunityId(JsonField.of(salesforceOpportunityId))

            /**
             * Sets [Builder.salesforceOpportunityId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.salesforceOpportunityId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun salesforceOpportunityId(salesforceOpportunityId: JsonField<String>) = apply {
                this.salesforceOpportunityId = salesforceOpportunityId
            }

            fun scheduledCharges(scheduledCharges: List<ScheduledCharge>) =
                scheduledCharges(JsonField.of(scheduledCharges))

            /**
             * Sets [Builder.scheduledCharges] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scheduledCharges] with a well-typed
             * `List<ScheduledCharge>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun scheduledCharges(scheduledCharges: JsonField<List<ScheduledCharge>>) = apply {
                this.scheduledCharges = scheduledCharges.map { it.toMutableList() }
            }

            /**
             * Adds a single [ScheduledCharge] to [scheduledCharges].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addScheduledCharge(scheduledCharge: ScheduledCharge) = apply {
                scheduledCharges =
                    (scheduledCharges ?: JsonField.of(mutableListOf())).also {
                        checkKnown("scheduledCharges", it).add(scheduledCharge)
                    }
            }

            /** This field's availability is dependent on your client's configuration. */
            fun totalContractValue(totalContractValue: Double) =
                totalContractValue(JsonField.of(totalContractValue))

            /**
             * Sets [Builder.totalContractValue] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalContractValue] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun totalContractValue(totalContractValue: JsonField<Double>) = apply {
                this.totalContractValue = totalContractValue
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .contractId()
             * .customerId()
             * .startingAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("contractId", contractId),
                    checkRequired("customerId", customerId),
                    checkRequired("startingAt", startingAt),
                    (commits ?: JsonMissing.of()).map { it.toImmutable() },
                    (credits ?: JsonMissing.of()).map { it.toImmutable() },
                    customFields,
                    (discounts ?: JsonMissing.of()).map { it.toImmutable() },
                    netsuiteSalesOrderId,
                    (overrides ?: JsonMissing.of()).map { it.toImmutable() },
                    (professionalServices ?: JsonMissing.of()).map { it.toImmutable() },
                    (resellerRoyalties ?: JsonMissing.of()).map { it.toImmutable() },
                    salesforceOpportunityId,
                    (scheduledCharges ?: JsonMissing.of()).map { it.toImmutable() },
                    totalContractValue,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            contractId()
            customerId()
            startingAt()
            commits().ifPresent { it.forEach { it.validate() } }
            credits().ifPresent { it.forEach { it.validate() } }
            customFields().ifPresent { it.validate() }
            discounts().ifPresent { it.forEach { it.validate() } }
            netsuiteSalesOrderId()
            overrides().ifPresent { it.forEach { it.validate() } }
            professionalServices().ifPresent { it.forEach { it.validate() } }
            resellerRoyalties().ifPresent { it.forEach { it.validate() } }
            salesforceOpportunityId()
            scheduledCharges().ifPresent { it.forEach { it.validate() } }
            totalContractValue()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (contractId.asKnown().isPresent) 1 else 0) +
                (if (customerId.asKnown().isPresent) 1 else 0) +
                (if (startingAt.asKnown().isPresent) 1 else 0) +
                (commits.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (credits.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (customFields.asKnown().getOrNull()?.validity() ?: 0) +
                (discounts.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (netsuiteSalesOrderId.asKnown().isPresent) 1 else 0) +
                (overrides.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (professionalServices.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (resellerRoyalties.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (salesforceOpportunityId.asKnown().isPresent) 1 else 0) +
                (scheduledCharges.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (totalContractValue.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                contractId == other.contractId &&
                customerId == other.customerId &&
                startingAt == other.startingAt &&
                commits == other.commits &&
                credits == other.credits &&
                customFields == other.customFields &&
                discounts == other.discounts &&
                netsuiteSalesOrderId == other.netsuiteSalesOrderId &&
                overrides == other.overrides &&
                professionalServices == other.professionalServices &&
                resellerRoyalties == other.resellerRoyalties &&
                salesforceOpportunityId == other.salesforceOpportunityId &&
                scheduledCharges == other.scheduledCharges &&
                totalContractValue == other.totalContractValue &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                contractId,
                customerId,
                startingAt,
                commits,
                credits,
                customFields,
                discounts,
                netsuiteSalesOrderId,
                overrides,
                professionalServices,
                resellerRoyalties,
                salesforceOpportunityId,
                scheduledCharges,
                totalContractValue,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{contractId=$contractId, customerId=$customerId, startingAt=$startingAt, commits=$commits, credits=$credits, customFields=$customFields, discounts=$discounts, netsuiteSalesOrderId=$netsuiteSalesOrderId, overrides=$overrides, professionalServices=$professionalServices, resellerRoyalties=$resellerRoyalties, salesforceOpportunityId=$salesforceOpportunityId, scheduledCharges=$scheduledCharges, totalContractValue=$totalContractValue, additionalProperties=$additionalProperties}"
    }

    class Commit
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val productId: JsonField<String>,
        private val type: JsonField<Type>,
        private val accessSchedule: JsonField<AccessSchedule>,
        private val amount: JsonField<Double>,
        private val applicableProductIds: JsonField<List<String>>,
        private val applicableProductTags: JsonField<List<String>>,
        private val customFields: JsonField<CustomFields>,
        private val description: JsonField<String>,
        private val hierarchyConfiguration: JsonField<CommitHierarchyConfiguration>,
        private val invoiceSchedule: JsonField<InvoiceSchedule>,
        private val name: JsonField<String>,
        private val netsuiteSalesOrderId: JsonField<String>,
        private val paymentGateConfig: JsonField<PaymentGateConfig>,
        private val priority: JsonField<Double>,
        private val rateType: JsonField<RateType>,
        private val rolloverFraction: JsonField<Double>,
        private val specifiers: JsonField<List<CommitSpecifierInput>>,
        private val temporaryId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("product_id")
            @ExcludeMissing
            productId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("access_schedule")
            @ExcludeMissing
            accessSchedule: JsonField<AccessSchedule> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("applicable_product_ids")
            @ExcludeMissing
            applicableProductIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("applicable_product_tags")
            @ExcludeMissing
            applicableProductTags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("custom_fields")
            @ExcludeMissing
            customFields: JsonField<CustomFields> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("hierarchy_configuration")
            @ExcludeMissing
            hierarchyConfiguration: JsonField<CommitHierarchyConfiguration> = JsonMissing.of(),
            @JsonProperty("invoice_schedule")
            @ExcludeMissing
            invoiceSchedule: JsonField<InvoiceSchedule> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("netsuite_sales_order_id")
            @ExcludeMissing
            netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("payment_gate_config")
            @ExcludeMissing
            paymentGateConfig: JsonField<PaymentGateConfig> = JsonMissing.of(),
            @JsonProperty("priority")
            @ExcludeMissing
            priority: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("rate_type")
            @ExcludeMissing
            rateType: JsonField<RateType> = JsonMissing.of(),
            @JsonProperty("rollover_fraction")
            @ExcludeMissing
            rolloverFraction: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("specifiers")
            @ExcludeMissing
            specifiers: JsonField<List<CommitSpecifierInput>> = JsonMissing.of(),
            @JsonProperty("temporary_id")
            @ExcludeMissing
            temporaryId: JsonField<String> = JsonMissing.of(),
        ) : this(
            productId,
            type,
            accessSchedule,
            amount,
            applicableProductIds,
            applicableProductTags,
            customFields,
            description,
            hierarchyConfiguration,
            invoiceSchedule,
            name,
            netsuiteSalesOrderId,
            paymentGateConfig,
            priority,
            rateType,
            rolloverFraction,
            specifiers,
            temporaryId,
            mutableMapOf(),
        )

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun productId(): String = productId.getRequired("product_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Required: Schedule for distributing the commit to the customer. For "POSTPAID" commits
         * only one schedule item is allowed and amount must match invoice_schedule total.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun accessSchedule(): Optional<AccessSchedule> =
            accessSchedule.getOptional("access_schedule")

        /**
         * (DEPRECATED) Use access_schedule and invoice_schedule instead.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun amount(): Optional<Double> = amount.getOptional("amount")

        /**
         * Which products the commit applies to. If applicable_product_ids, applicable_product_tags
         * or specifiers are not provided, the commit applies to all products.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun applicableProductIds(): Optional<List<String>> =
            applicableProductIds.getOptional("applicable_product_ids")

        /**
         * Which tags the commit applies to. If applicable_product_ids, applicable_product_tags or
         * specifiers are not provided, the commit applies to all products.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun applicableProductTags(): Optional<List<String>> =
            applicableProductTags.getOptional("applicable_product_tags")

        /**
         * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun customFields(): Optional<CustomFields> = customFields.getOptional("custom_fields")

        /**
         * Used only in UI/API. It is not exposed to end customers.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Optional configuration for commit hierarchy access control
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun hierarchyConfiguration(): Optional<CommitHierarchyConfiguration> =
            hierarchyConfiguration.getOptional("hierarchy_configuration")

        /**
         * Required for "POSTPAID" commits: the true up invoice will be generated at this time and
         * only one schedule item is allowed; the total must match access_schedule amount. Optional
         * for "PREPAID" commits: if not provided, this will be a "complimentary" commit with no
         * invoice.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun invoiceSchedule(): Optional<InvoiceSchedule> =
            invoiceSchedule.getOptional("invoice_schedule")

        /**
         * displayed on invoices
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * This field's availability is dependent on your client's configuration.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun netsuiteSalesOrderId(): Optional<String> =
            netsuiteSalesOrderId.getOptional("netsuite_sales_order_id")

        /**
         * optionally payment gate this commit
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun paymentGateConfig(): Optional<PaymentGateConfig> =
            paymentGateConfig.getOptional("payment_gate_config")

        /**
         * If multiple commits are applicable, the one with the lower priority will apply first.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun priority(): Optional<Double> = priority.getOptional("priority")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun rateType(): Optional<RateType> = rateType.getOptional("rate_type")

        /**
         * Fraction of unused segments that will be rolled over. Must be between 0 and 1.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun rolloverFraction(): Optional<Double> = rolloverFraction.getOptional("rollover_fraction")

        /**
         * List of filters that determine what kind of customer usage draws down a commit or credit.
         * A customer's usage needs to meet the condition of at least one of the specifiers to
         * contribute to a commit's or credit's drawdown. This field cannot be used together with
         * `applicable_product_ids` or `applicable_product_tags`.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun specifiers(): Optional<List<CommitSpecifierInput>> =
            specifiers.getOptional("specifiers")

        /**
         * A temporary ID for the commit that can be used to reference the commit for commit
         * specific overrides.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun temporaryId(): Optional<String> = temporaryId.getOptional("temporary_id")

        /**
         * Returns the raw JSON value of [productId].
         *
         * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [accessSchedule].
         *
         * Unlike [accessSchedule], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("access_schedule")
        @ExcludeMissing
        fun _accessSchedule(): JsonField<AccessSchedule> = accessSchedule

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

        /**
         * Returns the raw JSON value of [applicableProductIds].
         *
         * Unlike [applicableProductIds], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("applicable_product_ids")
        @ExcludeMissing
        fun _applicableProductIds(): JsonField<List<String>> = applicableProductIds

        /**
         * Returns the raw JSON value of [applicableProductTags].
         *
         * Unlike [applicableProductTags], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        fun _applicableProductTags(): JsonField<List<String>> = applicableProductTags

        /**
         * Returns the raw JSON value of [customFields].
         *
         * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [hierarchyConfiguration].
         *
         * Unlike [hierarchyConfiguration], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("hierarchy_configuration")
        @ExcludeMissing
        fun _hierarchyConfiguration(): JsonField<CommitHierarchyConfiguration> =
            hierarchyConfiguration

        /**
         * Returns the raw JSON value of [invoiceSchedule].
         *
         * Unlike [invoiceSchedule], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("invoice_schedule")
        @ExcludeMissing
        fun _invoiceSchedule(): JsonField<InvoiceSchedule> = invoiceSchedule

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [netsuiteSalesOrderId].
         *
         * Unlike [netsuiteSalesOrderId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        fun _netsuiteSalesOrderId(): JsonField<String> = netsuiteSalesOrderId

        /**
         * Returns the raw JSON value of [paymentGateConfig].
         *
         * Unlike [paymentGateConfig], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("payment_gate_config")
        @ExcludeMissing
        fun _paymentGateConfig(): JsonField<PaymentGateConfig> = paymentGateConfig

        /**
         * Returns the raw JSON value of [priority].
         *
         * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

        /**
         * Returns the raw JSON value of [rateType].
         *
         * Unlike [rateType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rate_type") @ExcludeMissing fun _rateType(): JsonField<RateType> = rateType

        /**
         * Returns the raw JSON value of [rolloverFraction].
         *
         * Unlike [rolloverFraction], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("rollover_fraction")
        @ExcludeMissing
        fun _rolloverFraction(): JsonField<Double> = rolloverFraction

        /**
         * Returns the raw JSON value of [specifiers].
         *
         * Unlike [specifiers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("specifiers")
        @ExcludeMissing
        fun _specifiers(): JsonField<List<CommitSpecifierInput>> = specifiers

        /**
         * Returns the raw JSON value of [temporaryId].
         *
         * Unlike [temporaryId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("temporary_id")
        @ExcludeMissing
        fun _temporaryId(): JsonField<String> = temporaryId

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Commit].
             *
             * The following fields are required:
             * ```java
             * .productId()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Commit]. */
        class Builder internal constructor() {

            private var productId: JsonField<String>? = null
            private var type: JsonField<Type>? = null
            private var accessSchedule: JsonField<AccessSchedule> = JsonMissing.of()
            private var amount: JsonField<Double> = JsonMissing.of()
            private var applicableProductIds: JsonField<MutableList<String>>? = null
            private var applicableProductTags: JsonField<MutableList<String>>? = null
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var hierarchyConfiguration: JsonField<CommitHierarchyConfiguration> =
                JsonMissing.of()
            private var invoiceSchedule: JsonField<InvoiceSchedule> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
            private var paymentGateConfig: JsonField<PaymentGateConfig> = JsonMissing.of()
            private var priority: JsonField<Double> = JsonMissing.of()
            private var rateType: JsonField<RateType> = JsonMissing.of()
            private var rolloverFraction: JsonField<Double> = JsonMissing.of()
            private var specifiers: JsonField<MutableList<CommitSpecifierInput>>? = null
            private var temporaryId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(commit: Commit) = apply {
                productId = commit.productId
                type = commit.type
                accessSchedule = commit.accessSchedule
                amount = commit.amount
                applicableProductIds = commit.applicableProductIds.map { it.toMutableList() }
                applicableProductTags = commit.applicableProductTags.map { it.toMutableList() }
                customFields = commit.customFields
                description = commit.description
                hierarchyConfiguration = commit.hierarchyConfiguration
                invoiceSchedule = commit.invoiceSchedule
                name = commit.name
                netsuiteSalesOrderId = commit.netsuiteSalesOrderId
                paymentGateConfig = commit.paymentGateConfig
                priority = commit.priority
                rateType = commit.rateType
                rolloverFraction = commit.rolloverFraction
                specifiers = commit.specifiers.map { it.toMutableList() }
                temporaryId = commit.temporaryId
                additionalProperties = commit.additionalProperties.toMutableMap()
            }

            fun productId(productId: String) = productId(JsonField.of(productId))

            /**
             * Sets [Builder.productId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /**
             * Required: Schedule for distributing the commit to the customer. For "POSTPAID"
             * commits only one schedule item is allowed and amount must match invoice_schedule
             * total.
             */
            fun accessSchedule(accessSchedule: AccessSchedule) =
                accessSchedule(JsonField.of(accessSchedule))

            /**
             * Sets [Builder.accessSchedule] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accessSchedule] with a well-typed [AccessSchedule]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun accessSchedule(accessSchedule: JsonField<AccessSchedule>) = apply {
                this.accessSchedule = accessSchedule
            }

            /** (DEPRECATED) Use access_schedule and invoice_schedule instead. */
            fun amount(amount: Double) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

            /**
             * Which products the commit applies to. If applicable_product_ids,
             * applicable_product_tags or specifiers are not provided, the commit applies to all
             * products.
             */
            fun applicableProductIds(applicableProductIds: List<String>) =
                applicableProductIds(JsonField.of(applicableProductIds))

            /**
             * Sets [Builder.applicableProductIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.applicableProductIds] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun applicableProductIds(applicableProductIds: JsonField<List<String>>) = apply {
                this.applicableProductIds = applicableProductIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [applicableProductIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addApplicableProductId(applicableProductId: String) = apply {
                applicableProductIds =
                    (applicableProductIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("applicableProductIds", it).add(applicableProductId)
                    }
            }

            /**
             * Which tags the commit applies to. If applicable_product_ids, applicable_product_tags
             * or specifiers are not provided, the commit applies to all products.
             */
            fun applicableProductTags(applicableProductTags: List<String>) =
                applicableProductTags(JsonField.of(applicableProductTags))

            /**
             * Sets [Builder.applicableProductTags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.applicableProductTags] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
                this.applicableProductTags = applicableProductTags.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [applicableProductTags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addApplicableProductTag(applicableProductTag: String) = apply {
                applicableProductTags =
                    (applicableProductTags ?: JsonField.of(mutableListOf())).also {
                        checkKnown("applicableProductTags", it).add(applicableProductTag)
                    }
            }

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

            /**
             * Sets [Builder.customFields] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customFields] with a well-typed [CustomFields] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customFields(customFields: JsonField<CustomFields>) = apply {
                this.customFields = customFields
            }

            /** Used only in UI/API. It is not exposed to end customers. */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** Optional configuration for commit hierarchy access control */
            fun hierarchyConfiguration(hierarchyConfiguration: CommitHierarchyConfiguration) =
                hierarchyConfiguration(JsonField.of(hierarchyConfiguration))

            /**
             * Sets [Builder.hierarchyConfiguration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hierarchyConfiguration] with a well-typed
             * [CommitHierarchyConfiguration] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun hierarchyConfiguration(
                hierarchyConfiguration: JsonField<CommitHierarchyConfiguration>
            ) = apply { this.hierarchyConfiguration = hierarchyConfiguration }

            /**
             * Required for "POSTPAID" commits: the true up invoice will be generated at this time
             * and only one schedule item is allowed; the total must match access_schedule amount.
             * Optional for "PREPAID" commits: if not provided, this will be a "complimentary"
             * commit with no invoice.
             */
            fun invoiceSchedule(invoiceSchedule: InvoiceSchedule) =
                invoiceSchedule(JsonField.of(invoiceSchedule))

            /**
             * Sets [Builder.invoiceSchedule] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invoiceSchedule] with a well-typed [InvoiceSchedule]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun invoiceSchedule(invoiceSchedule: JsonField<InvoiceSchedule>) = apply {
                this.invoiceSchedule = invoiceSchedule
            }

            /** displayed on invoices */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
                netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

            /**
             * Sets [Builder.netsuiteSalesOrderId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.netsuiteSalesOrderId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
                this.netsuiteSalesOrderId = netsuiteSalesOrderId
            }

            /** optionally payment gate this commit */
            fun paymentGateConfig(paymentGateConfig: PaymentGateConfig) =
                paymentGateConfig(JsonField.of(paymentGateConfig))

            /**
             * Sets [Builder.paymentGateConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.paymentGateConfig] with a well-typed
             * [PaymentGateConfig] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun paymentGateConfig(paymentGateConfig: JsonField<PaymentGateConfig>) = apply {
                this.paymentGateConfig = paymentGateConfig
            }

            /**
             * If multiple commits are applicable, the one with the lower priority will apply first.
             */
            fun priority(priority: Double) = priority(JsonField.of(priority))

            /**
             * Sets [Builder.priority] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priority] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

            fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

            /**
             * Sets [Builder.rateType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rateType] with a well-typed [RateType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rateType(rateType: JsonField<RateType>) = apply { this.rateType = rateType }

            /** Fraction of unused segments that will be rolled over. Must be between 0 and 1. */
            fun rolloverFraction(rolloverFraction: Double) =
                rolloverFraction(JsonField.of(rolloverFraction))

            /**
             * Sets [Builder.rolloverFraction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rolloverFraction] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rolloverFraction(rolloverFraction: JsonField<Double>) = apply {
                this.rolloverFraction = rolloverFraction
            }

            /**
             * List of filters that determine what kind of customer usage draws down a commit or
             * credit. A customer's usage needs to meet the condition of at least one of the
             * specifiers to contribute to a commit's or credit's drawdown. This field cannot be
             * used together with `applicable_product_ids` or `applicable_product_tags`.
             */
            fun specifiers(specifiers: List<CommitSpecifierInput>) =
                specifiers(JsonField.of(specifiers))

            /**
             * Sets [Builder.specifiers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.specifiers] with a well-typed
             * `List<CommitSpecifierInput>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun specifiers(specifiers: JsonField<List<CommitSpecifierInput>>) = apply {
                this.specifiers = specifiers.map { it.toMutableList() }
            }

            /**
             * Adds a single [CommitSpecifierInput] to [specifiers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSpecifier(specifier: CommitSpecifierInput) = apply {
                specifiers =
                    (specifiers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("specifiers", it).add(specifier)
                    }
            }

            /**
             * A temporary ID for the commit that can be used to reference the commit for commit
             * specific overrides.
             */
            fun temporaryId(temporaryId: String) = temporaryId(JsonField.of(temporaryId))

            /**
             * Sets [Builder.temporaryId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.temporaryId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun temporaryId(temporaryId: JsonField<String>) = apply {
                this.temporaryId = temporaryId
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Commit].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .productId()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Commit =
                Commit(
                    checkRequired("productId", productId),
                    checkRequired("type", type),
                    accessSchedule,
                    amount,
                    (applicableProductIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (applicableProductTags ?: JsonMissing.of()).map { it.toImmutable() },
                    customFields,
                    description,
                    hierarchyConfiguration,
                    invoiceSchedule,
                    name,
                    netsuiteSalesOrderId,
                    paymentGateConfig,
                    priority,
                    rateType,
                    rolloverFraction,
                    (specifiers ?: JsonMissing.of()).map { it.toImmutable() },
                    temporaryId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Commit = apply {
            if (validated) {
                return@apply
            }

            productId()
            type().validate()
            accessSchedule().ifPresent { it.validate() }
            amount()
            applicableProductIds()
            applicableProductTags()
            customFields().ifPresent { it.validate() }
            description()
            hierarchyConfiguration().ifPresent { it.validate() }
            invoiceSchedule().ifPresent { it.validate() }
            name()
            netsuiteSalesOrderId()
            paymentGateConfig().ifPresent { it.validate() }
            priority()
            rateType().ifPresent { it.validate() }
            rolloverFraction()
            specifiers().ifPresent { it.forEach { it.validate() } }
            temporaryId()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (productId.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                (accessSchedule.asKnown().getOrNull()?.validity() ?: 0) +
                (if (amount.asKnown().isPresent) 1 else 0) +
                (applicableProductIds.asKnown().getOrNull()?.size ?: 0) +
                (applicableProductTags.asKnown().getOrNull()?.size ?: 0) +
                (customFields.asKnown().getOrNull()?.validity() ?: 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (hierarchyConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
                (invoiceSchedule.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (netsuiteSalesOrderId.asKnown().isPresent) 1 else 0) +
                (paymentGateConfig.asKnown().getOrNull()?.validity() ?: 0) +
                (if (priority.asKnown().isPresent) 1 else 0) +
                (rateType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (rolloverFraction.asKnown().isPresent) 1 else 0) +
                (specifiers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (temporaryId.asKnown().isPresent) 1 else 0)

        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val PREPAID = of("PREPAID")

                @JvmField val POSTPAID = of("POSTPAID")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                PREPAID,
                POSTPAID,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PREPAID,
                POSTPAID,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    PREPAID -> Value.PREPAID
                    POSTPAID -> Value.POSTPAID
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    PREPAID -> Known.PREPAID
                    POSTPAID -> Known.POSTPAID
                    else -> throw MetronomeInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Type = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Required: Schedule for distributing the commit to the customer. For "POSTPAID" commits
         * only one schedule item is allowed and amount must match invoice_schedule total.
         */
        class AccessSchedule
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val scheduleItems: JsonField<List<ScheduleItem>>,
            private val creditTypeId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("schedule_items")
                @ExcludeMissing
                scheduleItems: JsonField<List<ScheduleItem>> = JsonMissing.of(),
                @JsonProperty("credit_type_id")
                @ExcludeMissing
                creditTypeId: JsonField<String> = JsonMissing.of(),
            ) : this(scheduleItems, creditTypeId, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun scheduleItems(): List<ScheduleItem> = scheduleItems.getRequired("schedule_items")

            /**
             * Defaults to USD (cents) if not passed
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun creditTypeId(): Optional<String> = creditTypeId.getOptional("credit_type_id")

            /**
             * Returns the raw JSON value of [scheduleItems].
             *
             * Unlike [scheduleItems], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("schedule_items")
            @ExcludeMissing
            fun _scheduleItems(): JsonField<List<ScheduleItem>> = scheduleItems

            /**
             * Returns the raw JSON value of [creditTypeId].
             *
             * Unlike [creditTypeId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("credit_type_id")
            @ExcludeMissing
            fun _creditTypeId(): JsonField<String> = creditTypeId

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [AccessSchedule].
                 *
                 * The following fields are required:
                 * ```java
                 * .scheduleItems()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AccessSchedule]. */
            class Builder internal constructor() {

                private var scheduleItems: JsonField<MutableList<ScheduleItem>>? = null
                private var creditTypeId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(accessSchedule: AccessSchedule) = apply {
                    scheduleItems = accessSchedule.scheduleItems.map { it.toMutableList() }
                    creditTypeId = accessSchedule.creditTypeId
                    additionalProperties = accessSchedule.additionalProperties.toMutableMap()
                }

                fun scheduleItems(scheduleItems: List<ScheduleItem>) =
                    scheduleItems(JsonField.of(scheduleItems))

                /**
                 * Sets [Builder.scheduleItems] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.scheduleItems] with a well-typed
                 * `List<ScheduleItem>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun scheduleItems(scheduleItems: JsonField<List<ScheduleItem>>) = apply {
                    this.scheduleItems = scheduleItems.map { it.toMutableList() }
                }

                /**
                 * Adds a single [ScheduleItem] to [scheduleItems].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addScheduleItem(scheduleItem: ScheduleItem) = apply {
                    scheduleItems =
                        (scheduleItems ?: JsonField.of(mutableListOf())).also {
                            checkKnown("scheduleItems", it).add(scheduleItem)
                        }
                }

                /** Defaults to USD (cents) if not passed */
                fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

                /**
                 * Sets [Builder.creditTypeId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.creditTypeId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun creditTypeId(creditTypeId: JsonField<String>) = apply {
                    this.creditTypeId = creditTypeId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [AccessSchedule].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .scheduleItems()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): AccessSchedule =
                    AccessSchedule(
                        checkRequired("scheduleItems", scheduleItems).map { it.toImmutable() },
                        creditTypeId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): AccessSchedule = apply {
                if (validated) {
                    return@apply
                }

                scheduleItems().forEach { it.validate() }
                creditTypeId()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (scheduleItems.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (creditTypeId.asKnown().isPresent) 1 else 0)

            class ScheduleItem
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amount: JsonField<Double>,
                private val endingBefore: JsonField<OffsetDateTime>,
                private val startingAt: JsonField<OffsetDateTime>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("ending_before")
                    @ExcludeMissing
                    endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("starting_at")
                    @ExcludeMissing
                    startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                ) : this(amount, endingBefore, startingAt, mutableMapOf())

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun amount(): Double = amount.getRequired("amount")

                /**
                 * RFC 3339 timestamp (exclusive)
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun endingBefore(): OffsetDateTime = endingBefore.getRequired("ending_before")

                /**
                 * RFC 3339 timestamp (inclusive)
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                /**
                 * Returns the raw JSON value of [endingBefore].
                 *
                 * Unlike [endingBefore], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("ending_before")
                @ExcludeMissing
                fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

                /**
                 * Returns the raw JSON value of [startingAt].
                 *
                 * Unlike [startingAt], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("starting_at")
                @ExcludeMissing
                fun _startingAt(): JsonField<OffsetDateTime> = startingAt

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [ScheduleItem].
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .endingBefore()
                     * .startingAt()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ScheduleItem]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double>? = null
                    private var endingBefore: JsonField<OffsetDateTime>? = null
                    private var startingAt: JsonField<OffsetDateTime>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(scheduleItem: ScheduleItem) = apply {
                        amount = scheduleItem.amount
                        endingBefore = scheduleItem.endingBefore
                        startingAt = scheduleItem.startingAt
                        additionalProperties = scheduleItem.additionalProperties.toMutableMap()
                    }

                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    /** RFC 3339 timestamp (exclusive) */
                    fun endingBefore(endingBefore: OffsetDateTime) =
                        endingBefore(JsonField.of(endingBefore))

                    /**
                     * Sets [Builder.endingBefore] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.endingBefore] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                        this.endingBefore = endingBefore
                    }

                    /** RFC 3339 timestamp (inclusive) */
                    fun startingAt(startingAt: OffsetDateTime) =
                        startingAt(JsonField.of(startingAt))

                    /**
                     * Sets [Builder.startingAt] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.startingAt] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                        this.startingAt = startingAt
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [ScheduleItem].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .endingBefore()
                     * .startingAt()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): ScheduleItem =
                        ScheduleItem(
                            checkRequired("amount", amount),
                            checkRequired("endingBefore", endingBefore),
                            checkRequired("startingAt", startingAt),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): ScheduleItem = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    endingBefore()
                    startingAt()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (amount.asKnown().isPresent) 1 else 0) +
                        (if (endingBefore.asKnown().isPresent) 1 else 0) +
                        (if (startingAt.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ScheduleItem &&
                        amount == other.amount &&
                        endingBefore == other.endingBefore &&
                        startingAt == other.startingAt &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(amount, endingBefore, startingAt, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ScheduleItem{amount=$amount, endingBefore=$endingBefore, startingAt=$startingAt, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AccessSchedule &&
                    scheduleItems == other.scheduleItems &&
                    creditTypeId == other.creditTypeId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(scheduleItems, creditTypeId, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AccessSchedule{scheduleItems=$scheduleItems, creditTypeId=$creditTypeId, additionalProperties=$additionalProperties}"
        }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        class CustomFields
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [CustomFields]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CustomFields]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(customFields: CustomFields) = apply {
                    additionalProperties = customFields.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [CustomFields].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): CustomFields = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CustomFields && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
        }

        /**
         * Required for "POSTPAID" commits: the true up invoice will be generated at this time and
         * only one schedule item is allowed; the total must match access_schedule amount. Optional
         * for "PREPAID" commits: if not provided, this will be a "complimentary" commit with no
         * invoice.
         */
        class InvoiceSchedule
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val creditTypeId: JsonField<String>,
            private val doNotInvoice: JsonField<Boolean>,
            private val recurringSchedule: JsonField<RecurringSchedule>,
            private val scheduleItems: JsonField<List<ScheduleItem>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("credit_type_id")
                @ExcludeMissing
                creditTypeId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("do_not_invoice")
                @ExcludeMissing
                doNotInvoice: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("recurring_schedule")
                @ExcludeMissing
                recurringSchedule: JsonField<RecurringSchedule> = JsonMissing.of(),
                @JsonProperty("schedule_items")
                @ExcludeMissing
                scheduleItems: JsonField<List<ScheduleItem>> = JsonMissing.of(),
            ) : this(creditTypeId, doNotInvoice, recurringSchedule, scheduleItems, mutableMapOf())

            /**
             * Defaults to USD (cents) if not passed.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun creditTypeId(): Optional<String> = creditTypeId.getOptional("credit_type_id")

            /**
             * This field is only applicable to commit invoice schedules. If true, this schedule
             * will not generate an invoice.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun doNotInvoice(): Optional<Boolean> = doNotInvoice.getOptional("do_not_invoice")

            /**
             * Enter the unit price and quantity for the charge or instead only send the amount. If
             * amount is sent, the unit price is assumed to be the amount and quantity is inferred
             * to be 1.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun recurringSchedule(): Optional<RecurringSchedule> =
                recurringSchedule.getOptional("recurring_schedule")

            /**
             * Either provide amount or provide both unit_price and quantity.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun scheduleItems(): Optional<List<ScheduleItem>> =
                scheduleItems.getOptional("schedule_items")

            /**
             * Returns the raw JSON value of [creditTypeId].
             *
             * Unlike [creditTypeId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("credit_type_id")
            @ExcludeMissing
            fun _creditTypeId(): JsonField<String> = creditTypeId

            /**
             * Returns the raw JSON value of [doNotInvoice].
             *
             * Unlike [doNotInvoice], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("do_not_invoice")
            @ExcludeMissing
            fun _doNotInvoice(): JsonField<Boolean> = doNotInvoice

            /**
             * Returns the raw JSON value of [recurringSchedule].
             *
             * Unlike [recurringSchedule], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("recurring_schedule")
            @ExcludeMissing
            fun _recurringSchedule(): JsonField<RecurringSchedule> = recurringSchedule

            /**
             * Returns the raw JSON value of [scheduleItems].
             *
             * Unlike [scheduleItems], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("schedule_items")
            @ExcludeMissing
            fun _scheduleItems(): JsonField<List<ScheduleItem>> = scheduleItems

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [InvoiceSchedule]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [InvoiceSchedule]. */
            class Builder internal constructor() {

                private var creditTypeId: JsonField<String> = JsonMissing.of()
                private var doNotInvoice: JsonField<Boolean> = JsonMissing.of()
                private var recurringSchedule: JsonField<RecurringSchedule> = JsonMissing.of()
                private var scheduleItems: JsonField<MutableList<ScheduleItem>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(invoiceSchedule: InvoiceSchedule) = apply {
                    creditTypeId = invoiceSchedule.creditTypeId
                    doNotInvoice = invoiceSchedule.doNotInvoice
                    recurringSchedule = invoiceSchedule.recurringSchedule
                    scheduleItems = invoiceSchedule.scheduleItems.map { it.toMutableList() }
                    additionalProperties = invoiceSchedule.additionalProperties.toMutableMap()
                }

                /** Defaults to USD (cents) if not passed. */
                fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

                /**
                 * Sets [Builder.creditTypeId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.creditTypeId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun creditTypeId(creditTypeId: JsonField<String>) = apply {
                    this.creditTypeId = creditTypeId
                }

                /**
                 * This field is only applicable to commit invoice schedules. If true, this schedule
                 * will not generate an invoice.
                 */
                fun doNotInvoice(doNotInvoice: Boolean) = doNotInvoice(JsonField.of(doNotInvoice))

                /**
                 * Sets [Builder.doNotInvoice] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.doNotInvoice] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun doNotInvoice(doNotInvoice: JsonField<Boolean>) = apply {
                    this.doNotInvoice = doNotInvoice
                }

                /**
                 * Enter the unit price and quantity for the charge or instead only send the amount.
                 * If amount is sent, the unit price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                fun recurringSchedule(recurringSchedule: RecurringSchedule) =
                    recurringSchedule(JsonField.of(recurringSchedule))

                /**
                 * Sets [Builder.recurringSchedule] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recurringSchedule] with a well-typed
                 * [RecurringSchedule] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun recurringSchedule(recurringSchedule: JsonField<RecurringSchedule>) = apply {
                    this.recurringSchedule = recurringSchedule
                }

                /** Either provide amount or provide both unit_price and quantity. */
                fun scheduleItems(scheduleItems: List<ScheduleItem>) =
                    scheduleItems(JsonField.of(scheduleItems))

                /**
                 * Sets [Builder.scheduleItems] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.scheduleItems] with a well-typed
                 * `List<ScheduleItem>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun scheduleItems(scheduleItems: JsonField<List<ScheduleItem>>) = apply {
                    this.scheduleItems = scheduleItems.map { it.toMutableList() }
                }

                /**
                 * Adds a single [ScheduleItem] to [scheduleItems].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addScheduleItem(scheduleItem: ScheduleItem) = apply {
                    scheduleItems =
                        (scheduleItems ?: JsonField.of(mutableListOf())).also {
                            checkKnown("scheduleItems", it).add(scheduleItem)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [InvoiceSchedule].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): InvoiceSchedule =
                    InvoiceSchedule(
                        creditTypeId,
                        doNotInvoice,
                        recurringSchedule,
                        (scheduleItems ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): InvoiceSchedule = apply {
                if (validated) {
                    return@apply
                }

                creditTypeId()
                doNotInvoice()
                recurringSchedule().ifPresent { it.validate() }
                scheduleItems().ifPresent { it.forEach { it.validate() } }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (creditTypeId.asKnown().isPresent) 1 else 0) +
                    (if (doNotInvoice.asKnown().isPresent) 1 else 0) +
                    (recurringSchedule.asKnown().getOrNull()?.validity() ?: 0) +
                    (scheduleItems.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            /**
             * Enter the unit price and quantity for the charge or instead only send the amount. If
             * amount is sent, the unit price is assumed to be the amount and quantity is inferred
             * to be 1.
             */
            class RecurringSchedule
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amountDistribution: JsonField<AmountDistribution>,
                private val endingBefore: JsonField<OffsetDateTime>,
                private val frequency: JsonField<Frequency>,
                private val startingAt: JsonField<OffsetDateTime>,
                private val amount: JsonField<Double>,
                private val quantity: JsonField<Double>,
                private val unitPrice: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount_distribution")
                    @ExcludeMissing
                    amountDistribution: JsonField<AmountDistribution> = JsonMissing.of(),
                    @JsonProperty("ending_before")
                    @ExcludeMissing
                    endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("frequency")
                    @ExcludeMissing
                    frequency: JsonField<Frequency> = JsonMissing.of(),
                    @JsonProperty("starting_at")
                    @ExcludeMissing
                    startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("quantity")
                    @ExcludeMissing
                    quantity: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("unit_price")
                    @ExcludeMissing
                    unitPrice: JsonField<Double> = JsonMissing.of(),
                ) : this(
                    amountDistribution,
                    endingBefore,
                    frequency,
                    startingAt,
                    amount,
                    quantity,
                    unitPrice,
                    mutableMapOf(),
                )

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun amountDistribution(): AmountDistribution =
                    amountDistribution.getRequired("amount_distribution")

                /**
                 * RFC 3339 timestamp (exclusive).
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun endingBefore(): OffsetDateTime = endingBefore.getRequired("ending_before")

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun frequency(): Frequency = frequency.getRequired("frequency")

                /**
                 * RFC 3339 timestamp (inclusive).
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

                /**
                 * Amount for the charge. Can be provided instead of unit_price and quantity. If
                 * amount is sent, the unit_price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun amount(): Optional<Double> = amount.getOptional("amount")

                /**
                 * Quantity for the charge. Will be multiplied by unit_price to determine the amount
                 * and must be specified with unit_price. If specified amount cannot be provided.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun quantity(): Optional<Double> = quantity.getOptional("quantity")

                /**
                 * Unit price for the charge. Will be multiplied by quantity to determine the amount
                 * and must be specified with quantity. If specified amount cannot be provided.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun unitPrice(): Optional<Double> = unitPrice.getOptional("unit_price")

                /**
                 * Returns the raw JSON value of [amountDistribution].
                 *
                 * Unlike [amountDistribution], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("amount_distribution")
                @ExcludeMissing
                fun _amountDistribution(): JsonField<AmountDistribution> = amountDistribution

                /**
                 * Returns the raw JSON value of [endingBefore].
                 *
                 * Unlike [endingBefore], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("ending_before")
                @ExcludeMissing
                fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

                /**
                 * Returns the raw JSON value of [frequency].
                 *
                 * Unlike [frequency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("frequency")
                @ExcludeMissing
                fun _frequency(): JsonField<Frequency> = frequency

                /**
                 * Returns the raw JSON value of [startingAt].
                 *
                 * Unlike [startingAt], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("starting_at")
                @ExcludeMissing
                fun _startingAt(): JsonField<OffsetDateTime> = startingAt

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                /**
                 * Returns the raw JSON value of [quantity].
                 *
                 * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("quantity")
                @ExcludeMissing
                fun _quantity(): JsonField<Double> = quantity

                /**
                 * Returns the raw JSON value of [unitPrice].
                 *
                 * Unlike [unitPrice], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("unit_price")
                @ExcludeMissing
                fun _unitPrice(): JsonField<Double> = unitPrice

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [RecurringSchedule].
                     *
                     * The following fields are required:
                     * ```java
                     * .amountDistribution()
                     * .endingBefore()
                     * .frequency()
                     * .startingAt()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [RecurringSchedule]. */
                class Builder internal constructor() {

                    private var amountDistribution: JsonField<AmountDistribution>? = null
                    private var endingBefore: JsonField<OffsetDateTime>? = null
                    private var frequency: JsonField<Frequency>? = null
                    private var startingAt: JsonField<OffsetDateTime>? = null
                    private var amount: JsonField<Double> = JsonMissing.of()
                    private var quantity: JsonField<Double> = JsonMissing.of()
                    private var unitPrice: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(recurringSchedule: RecurringSchedule) = apply {
                        amountDistribution = recurringSchedule.amountDistribution
                        endingBefore = recurringSchedule.endingBefore
                        frequency = recurringSchedule.frequency
                        startingAt = recurringSchedule.startingAt
                        amount = recurringSchedule.amount
                        quantity = recurringSchedule.quantity
                        unitPrice = recurringSchedule.unitPrice
                        additionalProperties = recurringSchedule.additionalProperties.toMutableMap()
                    }

                    fun amountDistribution(amountDistribution: AmountDistribution) =
                        amountDistribution(JsonField.of(amountDistribution))

                    /**
                     * Sets [Builder.amountDistribution] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amountDistribution] with a well-typed
                     * [AmountDistribution] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun amountDistribution(amountDistribution: JsonField<AmountDistribution>) =
                        apply {
                            this.amountDistribution = amountDistribution
                        }

                    /** RFC 3339 timestamp (exclusive). */
                    fun endingBefore(endingBefore: OffsetDateTime) =
                        endingBefore(JsonField.of(endingBefore))

                    /**
                     * Sets [Builder.endingBefore] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.endingBefore] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                        this.endingBefore = endingBefore
                    }

                    fun frequency(frequency: Frequency) = frequency(JsonField.of(frequency))

                    /**
                     * Sets [Builder.frequency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.frequency] with a well-typed [Frequency]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun frequency(frequency: JsonField<Frequency>) = apply {
                        this.frequency = frequency
                    }

                    /** RFC 3339 timestamp (inclusive). */
                    fun startingAt(startingAt: OffsetDateTime) =
                        startingAt(JsonField.of(startingAt))

                    /**
                     * Sets [Builder.startingAt] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.startingAt] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                        this.startingAt = startingAt
                    }

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    /**
                     * Sets [Builder.quantity] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.quantity] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

                    /**
                     * Sets [Builder.unitPrice] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.unitPrice] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun unitPrice(unitPrice: JsonField<Double>) = apply {
                        this.unitPrice = unitPrice
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [RecurringSchedule].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .amountDistribution()
                     * .endingBefore()
                     * .frequency()
                     * .startingAt()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): RecurringSchedule =
                        RecurringSchedule(
                            checkRequired("amountDistribution", amountDistribution),
                            checkRequired("endingBefore", endingBefore),
                            checkRequired("frequency", frequency),
                            checkRequired("startingAt", startingAt),
                            amount,
                            quantity,
                            unitPrice,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): RecurringSchedule = apply {
                    if (validated) {
                        return@apply
                    }

                    amountDistribution().validate()
                    endingBefore()
                    frequency().validate()
                    startingAt()
                    amount()
                    quantity()
                    unitPrice()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (amountDistribution.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (endingBefore.asKnown().isPresent) 1 else 0) +
                        (frequency.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (startingAt.asKnown().isPresent) 1 else 0) +
                        (if (amount.asKnown().isPresent) 1 else 0) +
                        (if (quantity.asKnown().isPresent) 1 else 0) +
                        (if (unitPrice.asKnown().isPresent) 1 else 0)

                class AmountDistribution
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val DIVIDED = of("DIVIDED")

                        @JvmField val DIVIDED_ROUNDED = of("DIVIDED_ROUNDED")

                        @JvmField val EACH = of("EACH")

                        @JvmStatic fun of(value: String) = AmountDistribution(JsonField.of(value))
                    }

                    /** An enum containing [AmountDistribution]'s known values. */
                    enum class Known {
                        DIVIDED,
                        DIVIDED_ROUNDED,
                        EACH,
                    }

                    /**
                     * An enum containing [AmountDistribution]'s known values, as well as an
                     * [_UNKNOWN] member.
                     *
                     * An instance of [AmountDistribution] can contain an unknown value in a couple
                     * of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        DIVIDED,
                        DIVIDED_ROUNDED,
                        EACH,
                        /**
                         * An enum member indicating that [AmountDistribution] was instantiated with
                         * an unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            DIVIDED -> Value.DIVIDED
                            DIVIDED_ROUNDED -> Value.DIVIDED_ROUNDED
                            EACH -> Value.EACH
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws MetronomeInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            DIVIDED -> Known.DIVIDED
                            DIVIDED_ROUNDED -> Known.DIVIDED_ROUNDED
                            EACH -> Known.EACH
                            else ->
                                throw MetronomeInvalidDataException(
                                    "Unknown AmountDistribution: $value"
                                )
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws MetronomeInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            MetronomeInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws MetronomeInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): AmountDistribution = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: MetronomeInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is AmountDistribution && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                class Frequency
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val MONTHLY = of("MONTHLY")

                        @JvmField val QUARTERLY = of("QUARTERLY")

                        @JvmField val SEMI_ANNUAL = of("SEMI_ANNUAL")

                        @JvmField val ANNUAL = of("ANNUAL")

                        @JvmStatic fun of(value: String) = Frequency(JsonField.of(value))
                    }

                    /** An enum containing [Frequency]'s known values. */
                    enum class Known {
                        MONTHLY,
                        QUARTERLY,
                        SEMI_ANNUAL,
                        ANNUAL,
                    }

                    /**
                     * An enum containing [Frequency]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [Frequency] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        MONTHLY,
                        QUARTERLY,
                        SEMI_ANNUAL,
                        ANNUAL,
                        /**
                         * An enum member indicating that [Frequency] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            MONTHLY -> Value.MONTHLY
                            QUARTERLY -> Value.QUARTERLY
                            SEMI_ANNUAL -> Value.SEMI_ANNUAL
                            ANNUAL -> Value.ANNUAL
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws MetronomeInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            MONTHLY -> Known.MONTHLY
                            QUARTERLY -> Known.QUARTERLY
                            SEMI_ANNUAL -> Known.SEMI_ANNUAL
                            ANNUAL -> Known.ANNUAL
                            else -> throw MetronomeInvalidDataException("Unknown Frequency: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws MetronomeInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            MetronomeInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws MetronomeInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Frequency = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: MetronomeInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Frequency && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is RecurringSchedule &&
                        amountDistribution == other.amountDistribution &&
                        endingBefore == other.endingBefore &&
                        frequency == other.frequency &&
                        startingAt == other.startingAt &&
                        amount == other.amount &&
                        quantity == other.quantity &&
                        unitPrice == other.unitPrice &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        amountDistribution,
                        endingBefore,
                        frequency,
                        startingAt,
                        amount,
                        quantity,
                        unitPrice,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "RecurringSchedule{amountDistribution=$amountDistribution, endingBefore=$endingBefore, frequency=$frequency, startingAt=$startingAt, amount=$amount, quantity=$quantity, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
            }

            class ScheduleItem
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val timestamp: JsonField<OffsetDateTime>,
                private val amount: JsonField<Double>,
                private val quantity: JsonField<Double>,
                private val unitPrice: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("timestamp")
                    @ExcludeMissing
                    timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("quantity")
                    @ExcludeMissing
                    quantity: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("unit_price")
                    @ExcludeMissing
                    unitPrice: JsonField<Double> = JsonMissing.of(),
                ) : this(timestamp, amount, quantity, unitPrice, mutableMapOf())

                /**
                 * timestamp of the scheduled event
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

                /**
                 * Amount for the charge. Can be provided instead of unit_price and quantity. If
                 * amount is sent, the unit_price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun amount(): Optional<Double> = amount.getOptional("amount")

                /**
                 * Quantity for the charge. Will be multiplied by unit_price to determine the amount
                 * and must be specified with unit_price. If specified amount cannot be provided.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun quantity(): Optional<Double> = quantity.getOptional("quantity")

                /**
                 * Unit price for the charge. Will be multiplied by quantity to determine the amount
                 * and must be specified with quantity. If specified amount cannot be provided.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun unitPrice(): Optional<Double> = unitPrice.getOptional("unit_price")

                /**
                 * Returns the raw JSON value of [timestamp].
                 *
                 * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("timestamp")
                @ExcludeMissing
                fun _timestamp(): JsonField<OffsetDateTime> = timestamp

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                /**
                 * Returns the raw JSON value of [quantity].
                 *
                 * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("quantity")
                @ExcludeMissing
                fun _quantity(): JsonField<Double> = quantity

                /**
                 * Returns the raw JSON value of [unitPrice].
                 *
                 * Unlike [unitPrice], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("unit_price")
                @ExcludeMissing
                fun _unitPrice(): JsonField<Double> = unitPrice

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [ScheduleItem].
                     *
                     * The following fields are required:
                     * ```java
                     * .timestamp()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ScheduleItem]. */
                class Builder internal constructor() {

                    private var timestamp: JsonField<OffsetDateTime>? = null
                    private var amount: JsonField<Double> = JsonMissing.of()
                    private var quantity: JsonField<Double> = JsonMissing.of()
                    private var unitPrice: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(scheduleItem: ScheduleItem) = apply {
                        timestamp = scheduleItem.timestamp
                        amount = scheduleItem.amount
                        quantity = scheduleItem.quantity
                        unitPrice = scheduleItem.unitPrice
                        additionalProperties = scheduleItem.additionalProperties.toMutableMap()
                    }

                    /** timestamp of the scheduled event */
                    fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                    /**
                     * Sets [Builder.timestamp] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.timestamp] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                        this.timestamp = timestamp
                    }

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    /**
                     * Sets [Builder.quantity] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.quantity] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

                    /**
                     * Sets [Builder.unitPrice] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.unitPrice] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun unitPrice(unitPrice: JsonField<Double>) = apply {
                        this.unitPrice = unitPrice
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [ScheduleItem].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .timestamp()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): ScheduleItem =
                        ScheduleItem(
                            checkRequired("timestamp", timestamp),
                            amount,
                            quantity,
                            unitPrice,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): ScheduleItem = apply {
                    if (validated) {
                        return@apply
                    }

                    timestamp()
                    amount()
                    quantity()
                    unitPrice()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (timestamp.asKnown().isPresent) 1 else 0) +
                        (if (amount.asKnown().isPresent) 1 else 0) +
                        (if (quantity.asKnown().isPresent) 1 else 0) +
                        (if (unitPrice.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ScheduleItem &&
                        timestamp == other.timestamp &&
                        amount == other.amount &&
                        quantity == other.quantity &&
                        unitPrice == other.unitPrice &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(timestamp, amount, quantity, unitPrice, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ScheduleItem{timestamp=$timestamp, amount=$amount, quantity=$quantity, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InvoiceSchedule &&
                    creditTypeId == other.creditTypeId &&
                    doNotInvoice == other.doNotInvoice &&
                    recurringSchedule == other.recurringSchedule &&
                    scheduleItems == other.scheduleItems &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    creditTypeId,
                    doNotInvoice,
                    recurringSchedule,
                    scheduleItems,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InvoiceSchedule{creditTypeId=$creditTypeId, doNotInvoice=$doNotInvoice, recurringSchedule=$recurringSchedule, scheduleItems=$scheduleItems, additionalProperties=$additionalProperties}"
        }

        /** optionally payment gate this commit */
        class PaymentGateConfig
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val paymentGateType: JsonField<PaymentGateType>,
            private val precalculatedTaxConfig: JsonField<PrecalculatedTaxConfig>,
            private val stripeConfig: JsonField<StripeConfig>,
            private val taxType: JsonField<TaxType>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("payment_gate_type")
                @ExcludeMissing
                paymentGateType: JsonField<PaymentGateType> = JsonMissing.of(),
                @JsonProperty("precalculated_tax_config")
                @ExcludeMissing
                precalculatedTaxConfig: JsonField<PrecalculatedTaxConfig> = JsonMissing.of(),
                @JsonProperty("stripe_config")
                @ExcludeMissing
                stripeConfig: JsonField<StripeConfig> = JsonMissing.of(),
                @JsonProperty("tax_type")
                @ExcludeMissing
                taxType: JsonField<TaxType> = JsonMissing.of(),
            ) : this(paymentGateType, precalculatedTaxConfig, stripeConfig, taxType, mutableMapOf())

            /**
             * Gate access to the commit balance based on successful collection of payment. Select
             * STRIPE for Metronome to facilitate payment via Stripe. Select EXTERNAL to facilitate
             * payment using your own payment integration. Select NONE if you do not wish to payment
             * gate the commit balance.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun paymentGateType(): PaymentGateType =
                paymentGateType.getRequired("payment_gate_type")

            /**
             * Only applicable if using PRECALCULATED as your tax type.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun precalculatedTaxConfig(): Optional<PrecalculatedTaxConfig> =
                precalculatedTaxConfig.getOptional("precalculated_tax_config")

            /**
             * Only applicable if using STRIPE as your payment gate type.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun stripeConfig(): Optional<StripeConfig> = stripeConfig.getOptional("stripe_config")

            /**
             * Stripe tax is only supported for Stripe payment gateway. Select NONE if you do not
             * wish Metronome to calculate tax on your behalf. Leaving this field blank will default
             * to NONE.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun taxType(): Optional<TaxType> = taxType.getOptional("tax_type")

            /**
             * Returns the raw JSON value of [paymentGateType].
             *
             * Unlike [paymentGateType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("payment_gate_type")
            @ExcludeMissing
            fun _paymentGateType(): JsonField<PaymentGateType> = paymentGateType

            /**
             * Returns the raw JSON value of [precalculatedTaxConfig].
             *
             * Unlike [precalculatedTaxConfig], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("precalculated_tax_config")
            @ExcludeMissing
            fun _precalculatedTaxConfig(): JsonField<PrecalculatedTaxConfig> =
                precalculatedTaxConfig

            /**
             * Returns the raw JSON value of [stripeConfig].
             *
             * Unlike [stripeConfig], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("stripe_config")
            @ExcludeMissing
            fun _stripeConfig(): JsonField<StripeConfig> = stripeConfig

            /**
             * Returns the raw JSON value of [taxType].
             *
             * Unlike [taxType], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tax_type") @ExcludeMissing fun _taxType(): JsonField<TaxType> = taxType

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [PaymentGateConfig].
                 *
                 * The following fields are required:
                 * ```java
                 * .paymentGateType()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PaymentGateConfig]. */
            class Builder internal constructor() {

                private var paymentGateType: JsonField<PaymentGateType>? = null
                private var precalculatedTaxConfig: JsonField<PrecalculatedTaxConfig> =
                    JsonMissing.of()
                private var stripeConfig: JsonField<StripeConfig> = JsonMissing.of()
                private var taxType: JsonField<TaxType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(paymentGateConfig: PaymentGateConfig) = apply {
                    paymentGateType = paymentGateConfig.paymentGateType
                    precalculatedTaxConfig = paymentGateConfig.precalculatedTaxConfig
                    stripeConfig = paymentGateConfig.stripeConfig
                    taxType = paymentGateConfig.taxType
                    additionalProperties = paymentGateConfig.additionalProperties.toMutableMap()
                }

                /**
                 * Gate access to the commit balance based on successful collection of payment.
                 * Select STRIPE for Metronome to facilitate payment via Stripe. Select EXTERNAL to
                 * facilitate payment using your own payment integration. Select NONE if you do not
                 * wish to payment gate the commit balance.
                 */
                fun paymentGateType(paymentGateType: PaymentGateType) =
                    paymentGateType(JsonField.of(paymentGateType))

                /**
                 * Sets [Builder.paymentGateType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.paymentGateType] with a well-typed
                 * [PaymentGateType] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun paymentGateType(paymentGateType: JsonField<PaymentGateType>) = apply {
                    this.paymentGateType = paymentGateType
                }

                /** Only applicable if using PRECALCULATED as your tax type. */
                fun precalculatedTaxConfig(precalculatedTaxConfig: PrecalculatedTaxConfig) =
                    precalculatedTaxConfig(JsonField.of(precalculatedTaxConfig))

                /**
                 * Sets [Builder.precalculatedTaxConfig] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.precalculatedTaxConfig] with a well-typed
                 * [PrecalculatedTaxConfig] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun precalculatedTaxConfig(
                    precalculatedTaxConfig: JsonField<PrecalculatedTaxConfig>
                ) = apply { this.precalculatedTaxConfig = precalculatedTaxConfig }

                /** Only applicable if using STRIPE as your payment gate type. */
                fun stripeConfig(stripeConfig: StripeConfig) =
                    stripeConfig(JsonField.of(stripeConfig))

                /**
                 * Sets [Builder.stripeConfig] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.stripeConfig] with a well-typed [StripeConfig]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun stripeConfig(stripeConfig: JsonField<StripeConfig>) = apply {
                    this.stripeConfig = stripeConfig
                }

                /**
                 * Stripe tax is only supported for Stripe payment gateway. Select NONE if you do
                 * not wish Metronome to calculate tax on your behalf. Leaving this field blank will
                 * default to NONE.
                 */
                fun taxType(taxType: TaxType) = taxType(JsonField.of(taxType))

                /**
                 * Sets [Builder.taxType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.taxType] with a well-typed [TaxType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun taxType(taxType: JsonField<TaxType>) = apply { this.taxType = taxType }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [PaymentGateConfig].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .paymentGateType()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PaymentGateConfig =
                    PaymentGateConfig(
                        checkRequired("paymentGateType", paymentGateType),
                        precalculatedTaxConfig,
                        stripeConfig,
                        taxType,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): PaymentGateConfig = apply {
                if (validated) {
                    return@apply
                }

                paymentGateType().validate()
                precalculatedTaxConfig().ifPresent { it.validate() }
                stripeConfig().ifPresent { it.validate() }
                taxType().ifPresent { it.validate() }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (paymentGateType.asKnown().getOrNull()?.validity() ?: 0) +
                    (precalculatedTaxConfig.asKnown().getOrNull()?.validity() ?: 0) +
                    (stripeConfig.asKnown().getOrNull()?.validity() ?: 0) +
                    (taxType.asKnown().getOrNull()?.validity() ?: 0)

            /**
             * Gate access to the commit balance based on successful collection of payment. Select
             * STRIPE for Metronome to facilitate payment via Stripe. Select EXTERNAL to facilitate
             * payment using your own payment integration. Select NONE if you do not wish to payment
             * gate the commit balance.
             */
            class PaymentGateType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val NONE = of("NONE")

                    @JvmField val STRIPE = of("STRIPE")

                    @JvmField val EXTERNAL = of("EXTERNAL")

                    @JvmStatic fun of(value: String) = PaymentGateType(JsonField.of(value))
                }

                /** An enum containing [PaymentGateType]'s known values. */
                enum class Known {
                    NONE,
                    STRIPE,
                    EXTERNAL,
                }

                /**
                 * An enum containing [PaymentGateType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [PaymentGateType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    NONE,
                    STRIPE,
                    EXTERNAL,
                    /**
                     * An enum member indicating that [PaymentGateType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        NONE -> Value.NONE
                        STRIPE -> Value.STRIPE
                        EXTERNAL -> Value.EXTERNAL
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        NONE -> Known.NONE
                        STRIPE -> Known.STRIPE
                        EXTERNAL -> Known.EXTERNAL
                        else ->
                            throw MetronomeInvalidDataException("Unknown PaymentGateType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        MetronomeInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): PaymentGateType = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PaymentGateType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Only applicable if using PRECALCULATED as your tax type. */
            class PrecalculatedTaxConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val taxAmount: JsonField<Double>,
                private val taxName: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("tax_amount")
                    @ExcludeMissing
                    taxAmount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("tax_name")
                    @ExcludeMissing
                    taxName: JsonField<String> = JsonMissing.of(),
                ) : this(taxAmount, taxName, mutableMapOf())

                /**
                 * Amount of tax to be applied. This should be in the same currency and denomination
                 * as the commit's invoice schedule
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun taxAmount(): Double = taxAmount.getRequired("tax_amount")

                /**
                 * Name of the tax to be applied. This may be used in an invoice line item
                 * description.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun taxName(): Optional<String> = taxName.getOptional("tax_name")

                /**
                 * Returns the raw JSON value of [taxAmount].
                 *
                 * Unlike [taxAmount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("tax_amount")
                @ExcludeMissing
                fun _taxAmount(): JsonField<Double> = taxAmount

                /**
                 * Returns the raw JSON value of [taxName].
                 *
                 * Unlike [taxName], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("tax_name")
                @ExcludeMissing
                fun _taxName(): JsonField<String> = taxName

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [PrecalculatedTaxConfig].
                     *
                     * The following fields are required:
                     * ```java
                     * .taxAmount()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PrecalculatedTaxConfig]. */
                class Builder internal constructor() {

                    private var taxAmount: JsonField<Double>? = null
                    private var taxName: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(precalculatedTaxConfig: PrecalculatedTaxConfig) = apply {
                        taxAmount = precalculatedTaxConfig.taxAmount
                        taxName = precalculatedTaxConfig.taxName
                        additionalProperties =
                            precalculatedTaxConfig.additionalProperties.toMutableMap()
                    }

                    /**
                     * Amount of tax to be applied. This should be in the same currency and
                     * denomination as the commit's invoice schedule
                     */
                    fun taxAmount(taxAmount: Double) = taxAmount(JsonField.of(taxAmount))

                    /**
                     * Sets [Builder.taxAmount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.taxAmount] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun taxAmount(taxAmount: JsonField<Double>) = apply {
                        this.taxAmount = taxAmount
                    }

                    /**
                     * Name of the tax to be applied. This may be used in an invoice line item
                     * description.
                     */
                    fun taxName(taxName: String) = taxName(JsonField.of(taxName))

                    /**
                     * Sets [Builder.taxName] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.taxName] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun taxName(taxName: JsonField<String>) = apply { this.taxName = taxName }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [PrecalculatedTaxConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .taxAmount()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): PrecalculatedTaxConfig =
                        PrecalculatedTaxConfig(
                            checkRequired("taxAmount", taxAmount),
                            taxName,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): PrecalculatedTaxConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    taxAmount()
                    taxName()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (taxAmount.asKnown().isPresent) 1 else 0) +
                        (if (taxName.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PrecalculatedTaxConfig &&
                        taxAmount == other.taxAmount &&
                        taxName == other.taxName &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(taxAmount, taxName, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PrecalculatedTaxConfig{taxAmount=$taxAmount, taxName=$taxName, additionalProperties=$additionalProperties}"
            }

            /** Only applicable if using STRIPE as your payment gate type. */
            class StripeConfig
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val paymentType: JsonField<PaymentType>,
                private val invoiceMetadata: JsonField<InvoiceMetadata>,
                private val onSessionPayment: JsonField<Boolean>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("payment_type")
                    @ExcludeMissing
                    paymentType: JsonField<PaymentType> = JsonMissing.of(),
                    @JsonProperty("invoice_metadata")
                    @ExcludeMissing
                    invoiceMetadata: JsonField<InvoiceMetadata> = JsonMissing.of(),
                    @JsonProperty("on_session_payment")
                    @ExcludeMissing
                    onSessionPayment: JsonField<Boolean> = JsonMissing.of(),
                ) : this(paymentType, invoiceMetadata, onSessionPayment, mutableMapOf())

                /**
                 * If left blank, will default to INVOICE
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun paymentType(): PaymentType = paymentType.getRequired("payment_type")

                /**
                 * Metadata to be added to the Stripe invoice. Only applicable if using INVOICE as
                 * your payment type.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun invoiceMetadata(): Optional<InvoiceMetadata> =
                    invoiceMetadata.getOptional("invoice_metadata")

                /**
                 * If true, the payment will be made assuming the customer is present (i.e. on
                 * session).
                 *
                 * If false, the payment will be made assuming the customer is not present (i.e. off
                 * session). For cardholders from a country with an e-mandate requirement (e.g.
                 * India), the payment may be declined.
                 *
                 * If left blank, will default to false.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun onSessionPayment(): Optional<Boolean> =
                    onSessionPayment.getOptional("on_session_payment")

                /**
                 * Returns the raw JSON value of [paymentType].
                 *
                 * Unlike [paymentType], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("payment_type")
                @ExcludeMissing
                fun _paymentType(): JsonField<PaymentType> = paymentType

                /**
                 * Returns the raw JSON value of [invoiceMetadata].
                 *
                 * Unlike [invoiceMetadata], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("invoice_metadata")
                @ExcludeMissing
                fun _invoiceMetadata(): JsonField<InvoiceMetadata> = invoiceMetadata

                /**
                 * Returns the raw JSON value of [onSessionPayment].
                 *
                 * Unlike [onSessionPayment], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("on_session_payment")
                @ExcludeMissing
                fun _onSessionPayment(): JsonField<Boolean> = onSessionPayment

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [StripeConfig].
                     *
                     * The following fields are required:
                     * ```java
                     * .paymentType()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [StripeConfig]. */
                class Builder internal constructor() {

                    private var paymentType: JsonField<PaymentType>? = null
                    private var invoiceMetadata: JsonField<InvoiceMetadata> = JsonMissing.of()
                    private var onSessionPayment: JsonField<Boolean> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(stripeConfig: StripeConfig) = apply {
                        paymentType = stripeConfig.paymentType
                        invoiceMetadata = stripeConfig.invoiceMetadata
                        onSessionPayment = stripeConfig.onSessionPayment
                        additionalProperties = stripeConfig.additionalProperties.toMutableMap()
                    }

                    /** If left blank, will default to INVOICE */
                    fun paymentType(paymentType: PaymentType) =
                        paymentType(JsonField.of(paymentType))

                    /**
                     * Sets [Builder.paymentType] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.paymentType] with a well-typed [PaymentType]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun paymentType(paymentType: JsonField<PaymentType>) = apply {
                        this.paymentType = paymentType
                    }

                    /**
                     * Metadata to be added to the Stripe invoice. Only applicable if using INVOICE
                     * as your payment type.
                     */
                    fun invoiceMetadata(invoiceMetadata: InvoiceMetadata) =
                        invoiceMetadata(JsonField.of(invoiceMetadata))

                    /**
                     * Sets [Builder.invoiceMetadata] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.invoiceMetadata] with a well-typed
                     * [InvoiceMetadata] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun invoiceMetadata(invoiceMetadata: JsonField<InvoiceMetadata>) = apply {
                        this.invoiceMetadata = invoiceMetadata
                    }

                    /**
                     * If true, the payment will be made assuming the customer is present (i.e. on
                     * session).
                     *
                     * If false, the payment will be made assuming the customer is not present (i.e.
                     * off session). For cardholders from a country with an e-mandate requirement
                     * (e.g. India), the payment may be declined.
                     *
                     * If left blank, will default to false.
                     */
                    fun onSessionPayment(onSessionPayment: Boolean) =
                        onSessionPayment(JsonField.of(onSessionPayment))

                    /**
                     * Sets [Builder.onSessionPayment] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.onSessionPayment] with a well-typed
                     * [Boolean] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun onSessionPayment(onSessionPayment: JsonField<Boolean>) = apply {
                        this.onSessionPayment = onSessionPayment
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [StripeConfig].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .paymentType()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): StripeConfig =
                        StripeConfig(
                            checkRequired("paymentType", paymentType),
                            invoiceMetadata,
                            onSessionPayment,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): StripeConfig = apply {
                    if (validated) {
                        return@apply
                    }

                    paymentType().validate()
                    invoiceMetadata().ifPresent { it.validate() }
                    onSessionPayment()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (paymentType.asKnown().getOrNull()?.validity() ?: 0) +
                        (invoiceMetadata.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (onSessionPayment.asKnown().isPresent) 1 else 0)

                /** If left blank, will default to INVOICE */
                class PaymentType
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val INVOICE = of("INVOICE")

                        @JvmField val PAYMENT_INTENT = of("PAYMENT_INTENT")

                        @JvmStatic fun of(value: String) = PaymentType(JsonField.of(value))
                    }

                    /** An enum containing [PaymentType]'s known values. */
                    enum class Known {
                        INVOICE,
                        PAYMENT_INTENT,
                    }

                    /**
                     * An enum containing [PaymentType]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [PaymentType] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        INVOICE,
                        PAYMENT_INTENT,
                        /**
                         * An enum member indicating that [PaymentType] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            INVOICE -> Value.INVOICE
                            PAYMENT_INTENT -> Value.PAYMENT_INTENT
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws MetronomeInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            INVOICE -> Known.INVOICE
                            PAYMENT_INTENT -> Known.PAYMENT_INTENT
                            else ->
                                throw MetronomeInvalidDataException("Unknown PaymentType: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws MetronomeInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            MetronomeInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws MetronomeInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): PaymentType = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: MetronomeInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is PaymentType && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /**
                 * Metadata to be added to the Stripe invoice. Only applicable if using INVOICE as
                 * your payment type.
                 */
                class InvoiceMetadata
                @JsonCreator
                private constructor(
                    @com.fasterxml.jackson.annotation.JsonValue
                    private val additionalProperties: Map<String, JsonValue>
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of
                         * [InvoiceMetadata].
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [InvoiceMetadata]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(invoiceMetadata: InvoiceMetadata) = apply {
                            additionalProperties =
                                invoiceMetadata.additionalProperties.toMutableMap()
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [InvoiceMetadata].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): InvoiceMetadata =
                            InvoiceMetadata(additionalProperties.toImmutable())
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws MetronomeInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): InvoiceMetadata = apply {
                        if (validated) {
                            return@apply
                        }

                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: MetronomeInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int =
                        additionalProperties.count { (_, value) ->
                            !value.isNull() && !value.isMissing()
                        }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is InvoiceMetadata &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "InvoiceMetadata{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is StripeConfig &&
                        paymentType == other.paymentType &&
                        invoiceMetadata == other.invoiceMetadata &&
                        onSessionPayment == other.onSessionPayment &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        paymentType,
                        invoiceMetadata,
                        onSessionPayment,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "StripeConfig{paymentType=$paymentType, invoiceMetadata=$invoiceMetadata, onSessionPayment=$onSessionPayment, additionalProperties=$additionalProperties}"
            }

            /**
             * Stripe tax is only supported for Stripe payment gateway. Select NONE if you do not
             * wish Metronome to calculate tax on your behalf. Leaving this field blank will default
             * to NONE.
             */
            class TaxType @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val NONE = of("NONE")

                    @JvmField val STRIPE = of("STRIPE")

                    @JvmField val ANROK = of("ANROK")

                    @JvmField val PRECALCULATED = of("PRECALCULATED")

                    @JvmStatic fun of(value: String) = TaxType(JsonField.of(value))
                }

                /** An enum containing [TaxType]'s known values. */
                enum class Known {
                    NONE,
                    STRIPE,
                    ANROK,
                    PRECALCULATED,
                }

                /**
                 * An enum containing [TaxType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [TaxType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    NONE,
                    STRIPE,
                    ANROK,
                    PRECALCULATED,
                    /**
                     * An enum member indicating that [TaxType] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        NONE -> Value.NONE
                        STRIPE -> Value.STRIPE
                        ANROK -> Value.ANROK
                        PRECALCULATED -> Value.PRECALCULATED
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        NONE -> Known.NONE
                        STRIPE -> Known.STRIPE
                        ANROK -> Known.ANROK
                        PRECALCULATED -> Known.PRECALCULATED
                        else -> throw MetronomeInvalidDataException("Unknown TaxType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        MetronomeInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): TaxType = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is TaxType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PaymentGateConfig &&
                    paymentGateType == other.paymentGateType &&
                    precalculatedTaxConfig == other.precalculatedTaxConfig &&
                    stripeConfig == other.stripeConfig &&
                    taxType == other.taxType &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    paymentGateType,
                    precalculatedTaxConfig,
                    stripeConfig,
                    taxType,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PaymentGateConfig{paymentGateType=$paymentGateType, precalculatedTaxConfig=$precalculatedTaxConfig, stripeConfig=$stripeConfig, taxType=$taxType, additionalProperties=$additionalProperties}"
        }

        class RateType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val COMMIT_RATE = of("COMMIT_RATE")

                @JvmField val LIST_RATE = of("LIST_RATE")

                @JvmStatic fun of(value: String) = RateType(JsonField.of(value))
            }

            /** An enum containing [RateType]'s known values. */
            enum class Known {
                COMMIT_RATE,
                LIST_RATE,
            }

            /**
             * An enum containing [RateType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [RateType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                COMMIT_RATE,
                LIST_RATE,
                /**
                 * An enum member indicating that [RateType] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    COMMIT_RATE -> Value.COMMIT_RATE
                    LIST_RATE -> Value.LIST_RATE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    COMMIT_RATE -> Known.COMMIT_RATE
                    LIST_RATE -> Known.LIST_RATE
                    else -> throw MetronomeInvalidDataException("Unknown RateType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): RateType = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RateType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Commit &&
                productId == other.productId &&
                type == other.type &&
                accessSchedule == other.accessSchedule &&
                amount == other.amount &&
                applicableProductIds == other.applicableProductIds &&
                applicableProductTags == other.applicableProductTags &&
                customFields == other.customFields &&
                description == other.description &&
                hierarchyConfiguration == other.hierarchyConfiguration &&
                invoiceSchedule == other.invoiceSchedule &&
                name == other.name &&
                netsuiteSalesOrderId == other.netsuiteSalesOrderId &&
                paymentGateConfig == other.paymentGateConfig &&
                priority == other.priority &&
                rateType == other.rateType &&
                rolloverFraction == other.rolloverFraction &&
                specifiers == other.specifiers &&
                temporaryId == other.temporaryId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                productId,
                type,
                accessSchedule,
                amount,
                applicableProductIds,
                applicableProductTags,
                customFields,
                description,
                hierarchyConfiguration,
                invoiceSchedule,
                name,
                netsuiteSalesOrderId,
                paymentGateConfig,
                priority,
                rateType,
                rolloverFraction,
                specifiers,
                temporaryId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Commit{productId=$productId, type=$type, accessSchedule=$accessSchedule, amount=$amount, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, customFields=$customFields, description=$description, hierarchyConfiguration=$hierarchyConfiguration, invoiceSchedule=$invoiceSchedule, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, paymentGateConfig=$paymentGateConfig, priority=$priority, rateType=$rateType, rolloverFraction=$rolloverFraction, specifiers=$specifiers, temporaryId=$temporaryId, additionalProperties=$additionalProperties}"
    }

    class Credit
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val accessSchedule: JsonField<AccessSchedule>,
        private val productId: JsonField<String>,
        private val applicableProductIds: JsonField<List<String>>,
        private val applicableProductTags: JsonField<List<String>>,
        private val customFields: JsonField<CustomFields>,
        private val description: JsonField<String>,
        private val hierarchyConfiguration: JsonField<CommitHierarchyConfiguration>,
        private val name: JsonField<String>,
        private val netsuiteSalesOrderId: JsonField<String>,
        private val priority: JsonField<Double>,
        private val rateType: JsonField<RateType>,
        private val rolloverFraction: JsonField<Double>,
        private val specifiers: JsonField<List<CommitSpecifierInput>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("access_schedule")
            @ExcludeMissing
            accessSchedule: JsonField<AccessSchedule> = JsonMissing.of(),
            @JsonProperty("product_id")
            @ExcludeMissing
            productId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("applicable_product_ids")
            @ExcludeMissing
            applicableProductIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("applicable_product_tags")
            @ExcludeMissing
            applicableProductTags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("custom_fields")
            @ExcludeMissing
            customFields: JsonField<CustomFields> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("hierarchy_configuration")
            @ExcludeMissing
            hierarchyConfiguration: JsonField<CommitHierarchyConfiguration> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("netsuite_sales_order_id")
            @ExcludeMissing
            netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("priority")
            @ExcludeMissing
            priority: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("rate_type")
            @ExcludeMissing
            rateType: JsonField<RateType> = JsonMissing.of(),
            @JsonProperty("rollover_fraction")
            @ExcludeMissing
            rolloverFraction: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("specifiers")
            @ExcludeMissing
            specifiers: JsonField<List<CommitSpecifierInput>> = JsonMissing.of(),
        ) : this(
            accessSchedule,
            productId,
            applicableProductIds,
            applicableProductTags,
            customFields,
            description,
            hierarchyConfiguration,
            name,
            netsuiteSalesOrderId,
            priority,
            rateType,
            rolloverFraction,
            specifiers,
            mutableMapOf(),
        )

        /**
         * Schedule for distributing the credit to the customer.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun accessSchedule(): AccessSchedule = accessSchedule.getRequired("access_schedule")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun productId(): String = productId.getRequired("product_id")

        /**
         * Which products the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun applicableProductIds(): Optional<List<String>> =
            applicableProductIds.getOptional("applicable_product_ids")

        /**
         * Which tags the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun applicableProductTags(): Optional<List<String>> =
            applicableProductTags.getOptional("applicable_product_tags")

        /**
         * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun customFields(): Optional<CustomFields> = customFields.getOptional("custom_fields")

        /**
         * Used only in UI/API. It is not exposed to end customers.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * Optional configuration for credit hierarchy access control
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun hierarchyConfiguration(): Optional<CommitHierarchyConfiguration> =
            hierarchyConfiguration.getOptional("hierarchy_configuration")

        /**
         * displayed on invoices
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * This field's availability is dependent on your client's configuration.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun netsuiteSalesOrderId(): Optional<String> =
            netsuiteSalesOrderId.getOptional("netsuite_sales_order_id")

        /**
         * If multiple credits are applicable, the one with the lower priority will apply first.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun priority(): Optional<Double> = priority.getOptional("priority")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun rateType(): Optional<RateType> = rateType.getOptional("rate_type")

        /**
         * Fraction of unused segments that will be rolled over. Must be between 0 and 1.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun rolloverFraction(): Optional<Double> = rolloverFraction.getOptional("rollover_fraction")

        /**
         * List of filters that determine what kind of customer usage draws down a commit or credit.
         * A customer's usage needs to meet the condition of at least one of the specifiers to
         * contribute to a commit's or credit's drawdown. This field cannot be used together with
         * `applicable_product_ids` or `applicable_product_tags`.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun specifiers(): Optional<List<CommitSpecifierInput>> =
            specifiers.getOptional("specifiers")

        /**
         * Returns the raw JSON value of [accessSchedule].
         *
         * Unlike [accessSchedule], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("access_schedule")
        @ExcludeMissing
        fun _accessSchedule(): JsonField<AccessSchedule> = accessSchedule

        /**
         * Returns the raw JSON value of [productId].
         *
         * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

        /**
         * Returns the raw JSON value of [applicableProductIds].
         *
         * Unlike [applicableProductIds], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("applicable_product_ids")
        @ExcludeMissing
        fun _applicableProductIds(): JsonField<List<String>> = applicableProductIds

        /**
         * Returns the raw JSON value of [applicableProductTags].
         *
         * Unlike [applicableProductTags], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        fun _applicableProductTags(): JsonField<List<String>> = applicableProductTags

        /**
         * Returns the raw JSON value of [customFields].
         *
         * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [hierarchyConfiguration].
         *
         * Unlike [hierarchyConfiguration], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("hierarchy_configuration")
        @ExcludeMissing
        fun _hierarchyConfiguration(): JsonField<CommitHierarchyConfiguration> =
            hierarchyConfiguration

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [netsuiteSalesOrderId].
         *
         * Unlike [netsuiteSalesOrderId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        fun _netsuiteSalesOrderId(): JsonField<String> = netsuiteSalesOrderId

        /**
         * Returns the raw JSON value of [priority].
         *
         * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

        /**
         * Returns the raw JSON value of [rateType].
         *
         * Unlike [rateType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rate_type") @ExcludeMissing fun _rateType(): JsonField<RateType> = rateType

        /**
         * Returns the raw JSON value of [rolloverFraction].
         *
         * Unlike [rolloverFraction], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("rollover_fraction")
        @ExcludeMissing
        fun _rolloverFraction(): JsonField<Double> = rolloverFraction

        /**
         * Returns the raw JSON value of [specifiers].
         *
         * Unlike [specifiers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("specifiers")
        @ExcludeMissing
        fun _specifiers(): JsonField<List<CommitSpecifierInput>> = specifiers

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Credit].
             *
             * The following fields are required:
             * ```java
             * .accessSchedule()
             * .productId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Credit]. */
        class Builder internal constructor() {

            private var accessSchedule: JsonField<AccessSchedule>? = null
            private var productId: JsonField<String>? = null
            private var applicableProductIds: JsonField<MutableList<String>>? = null
            private var applicableProductTags: JsonField<MutableList<String>>? = null
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var hierarchyConfiguration: JsonField<CommitHierarchyConfiguration> =
                JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
            private var priority: JsonField<Double> = JsonMissing.of()
            private var rateType: JsonField<RateType> = JsonMissing.of()
            private var rolloverFraction: JsonField<Double> = JsonMissing.of()
            private var specifiers: JsonField<MutableList<CommitSpecifierInput>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(credit: Credit) = apply {
                accessSchedule = credit.accessSchedule
                productId = credit.productId
                applicableProductIds = credit.applicableProductIds.map { it.toMutableList() }
                applicableProductTags = credit.applicableProductTags.map { it.toMutableList() }
                customFields = credit.customFields
                description = credit.description
                hierarchyConfiguration = credit.hierarchyConfiguration
                name = credit.name
                netsuiteSalesOrderId = credit.netsuiteSalesOrderId
                priority = credit.priority
                rateType = credit.rateType
                rolloverFraction = credit.rolloverFraction
                specifiers = credit.specifiers.map { it.toMutableList() }
                additionalProperties = credit.additionalProperties.toMutableMap()
            }

            /** Schedule for distributing the credit to the customer. */
            fun accessSchedule(accessSchedule: AccessSchedule) =
                accessSchedule(JsonField.of(accessSchedule))

            /**
             * Sets [Builder.accessSchedule] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accessSchedule] with a well-typed [AccessSchedule]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun accessSchedule(accessSchedule: JsonField<AccessSchedule>) = apply {
                this.accessSchedule = accessSchedule
            }

            fun productId(productId: String) = productId(JsonField.of(productId))

            /**
             * Sets [Builder.productId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            /**
             * Which products the credit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the credit applies to all products.
             */
            fun applicableProductIds(applicableProductIds: List<String>) =
                applicableProductIds(JsonField.of(applicableProductIds))

            /**
             * Sets [Builder.applicableProductIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.applicableProductIds] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun applicableProductIds(applicableProductIds: JsonField<List<String>>) = apply {
                this.applicableProductIds = applicableProductIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [applicableProductIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addApplicableProductId(applicableProductId: String) = apply {
                applicableProductIds =
                    (applicableProductIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("applicableProductIds", it).add(applicableProductId)
                    }
            }

            /**
             * Which tags the credit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the credit applies to all products.
             */
            fun applicableProductTags(applicableProductTags: List<String>) =
                applicableProductTags(JsonField.of(applicableProductTags))

            /**
             * Sets [Builder.applicableProductTags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.applicableProductTags] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
                this.applicableProductTags = applicableProductTags.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [applicableProductTags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addApplicableProductTag(applicableProductTag: String) = apply {
                applicableProductTags =
                    (applicableProductTags ?: JsonField.of(mutableListOf())).also {
                        checkKnown("applicableProductTags", it).add(applicableProductTag)
                    }
            }

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

            /**
             * Sets [Builder.customFields] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customFields] with a well-typed [CustomFields] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customFields(customFields: JsonField<CustomFields>) = apply {
                this.customFields = customFields
            }

            /** Used only in UI/API. It is not exposed to end customers. */
            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** Optional configuration for credit hierarchy access control */
            fun hierarchyConfiguration(hierarchyConfiguration: CommitHierarchyConfiguration) =
                hierarchyConfiguration(JsonField.of(hierarchyConfiguration))

            /**
             * Sets [Builder.hierarchyConfiguration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hierarchyConfiguration] with a well-typed
             * [CommitHierarchyConfiguration] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun hierarchyConfiguration(
                hierarchyConfiguration: JsonField<CommitHierarchyConfiguration>
            ) = apply { this.hierarchyConfiguration = hierarchyConfiguration }

            /** displayed on invoices */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
                netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

            /**
             * Sets [Builder.netsuiteSalesOrderId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.netsuiteSalesOrderId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
                this.netsuiteSalesOrderId = netsuiteSalesOrderId
            }

            /**
             * If multiple credits are applicable, the one with the lower priority will apply first.
             */
            fun priority(priority: Double) = priority(JsonField.of(priority))

            /**
             * Sets [Builder.priority] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priority] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

            fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

            /**
             * Sets [Builder.rateType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rateType] with a well-typed [RateType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rateType(rateType: JsonField<RateType>) = apply { this.rateType = rateType }

            /** Fraction of unused segments that will be rolled over. Must be between 0 and 1. */
            fun rolloverFraction(rolloverFraction: Double) =
                rolloverFraction(JsonField.of(rolloverFraction))

            /**
             * Sets [Builder.rolloverFraction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rolloverFraction] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rolloverFraction(rolloverFraction: JsonField<Double>) = apply {
                this.rolloverFraction = rolloverFraction
            }

            /**
             * List of filters that determine what kind of customer usage draws down a commit or
             * credit. A customer's usage needs to meet the condition of at least one of the
             * specifiers to contribute to a commit's or credit's drawdown. This field cannot be
             * used together with `applicable_product_ids` or `applicable_product_tags`.
             */
            fun specifiers(specifiers: List<CommitSpecifierInput>) =
                specifiers(JsonField.of(specifiers))

            /**
             * Sets [Builder.specifiers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.specifiers] with a well-typed
             * `List<CommitSpecifierInput>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun specifiers(specifiers: JsonField<List<CommitSpecifierInput>>) = apply {
                this.specifiers = specifiers.map { it.toMutableList() }
            }

            /**
             * Adds a single [CommitSpecifierInput] to [specifiers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSpecifier(specifier: CommitSpecifierInput) = apply {
                specifiers =
                    (specifiers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("specifiers", it).add(specifier)
                    }
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Credit].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .accessSchedule()
             * .productId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Credit =
                Credit(
                    checkRequired("accessSchedule", accessSchedule),
                    checkRequired("productId", productId),
                    (applicableProductIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (applicableProductTags ?: JsonMissing.of()).map { it.toImmutable() },
                    customFields,
                    description,
                    hierarchyConfiguration,
                    name,
                    netsuiteSalesOrderId,
                    priority,
                    rateType,
                    rolloverFraction,
                    (specifiers ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Credit = apply {
            if (validated) {
                return@apply
            }

            accessSchedule().validate()
            productId()
            applicableProductIds()
            applicableProductTags()
            customFields().ifPresent { it.validate() }
            description()
            hierarchyConfiguration().ifPresent { it.validate() }
            name()
            netsuiteSalesOrderId()
            priority()
            rateType().ifPresent { it.validate() }
            rolloverFraction()
            specifiers().ifPresent { it.forEach { it.validate() } }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (accessSchedule.asKnown().getOrNull()?.validity() ?: 0) +
                (if (productId.asKnown().isPresent) 1 else 0) +
                (applicableProductIds.asKnown().getOrNull()?.size ?: 0) +
                (applicableProductTags.asKnown().getOrNull()?.size ?: 0) +
                (customFields.asKnown().getOrNull()?.validity() ?: 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (hierarchyConfiguration.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (netsuiteSalesOrderId.asKnown().isPresent) 1 else 0) +
                (if (priority.asKnown().isPresent) 1 else 0) +
                (rateType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (rolloverFraction.asKnown().isPresent) 1 else 0) +
                (specifiers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        /** Schedule for distributing the credit to the customer. */
        class AccessSchedule
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val scheduleItems: JsonField<List<ScheduleItem>>,
            private val creditTypeId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("schedule_items")
                @ExcludeMissing
                scheduleItems: JsonField<List<ScheduleItem>> = JsonMissing.of(),
                @JsonProperty("credit_type_id")
                @ExcludeMissing
                creditTypeId: JsonField<String> = JsonMissing.of(),
            ) : this(scheduleItems, creditTypeId, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun scheduleItems(): List<ScheduleItem> = scheduleItems.getRequired("schedule_items")

            /**
             * Defaults to USD (cents) if not passed
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun creditTypeId(): Optional<String> = creditTypeId.getOptional("credit_type_id")

            /**
             * Returns the raw JSON value of [scheduleItems].
             *
             * Unlike [scheduleItems], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("schedule_items")
            @ExcludeMissing
            fun _scheduleItems(): JsonField<List<ScheduleItem>> = scheduleItems

            /**
             * Returns the raw JSON value of [creditTypeId].
             *
             * Unlike [creditTypeId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("credit_type_id")
            @ExcludeMissing
            fun _creditTypeId(): JsonField<String> = creditTypeId

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [AccessSchedule].
                 *
                 * The following fields are required:
                 * ```java
                 * .scheduleItems()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AccessSchedule]. */
            class Builder internal constructor() {

                private var scheduleItems: JsonField<MutableList<ScheduleItem>>? = null
                private var creditTypeId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(accessSchedule: AccessSchedule) = apply {
                    scheduleItems = accessSchedule.scheduleItems.map { it.toMutableList() }
                    creditTypeId = accessSchedule.creditTypeId
                    additionalProperties = accessSchedule.additionalProperties.toMutableMap()
                }

                fun scheduleItems(scheduleItems: List<ScheduleItem>) =
                    scheduleItems(JsonField.of(scheduleItems))

                /**
                 * Sets [Builder.scheduleItems] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.scheduleItems] with a well-typed
                 * `List<ScheduleItem>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun scheduleItems(scheduleItems: JsonField<List<ScheduleItem>>) = apply {
                    this.scheduleItems = scheduleItems.map { it.toMutableList() }
                }

                /**
                 * Adds a single [ScheduleItem] to [scheduleItems].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addScheduleItem(scheduleItem: ScheduleItem) = apply {
                    scheduleItems =
                        (scheduleItems ?: JsonField.of(mutableListOf())).also {
                            checkKnown("scheduleItems", it).add(scheduleItem)
                        }
                }

                /** Defaults to USD (cents) if not passed */
                fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

                /**
                 * Sets [Builder.creditTypeId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.creditTypeId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun creditTypeId(creditTypeId: JsonField<String>) = apply {
                    this.creditTypeId = creditTypeId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [AccessSchedule].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .scheduleItems()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): AccessSchedule =
                    AccessSchedule(
                        checkRequired("scheduleItems", scheduleItems).map { it.toImmutable() },
                        creditTypeId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): AccessSchedule = apply {
                if (validated) {
                    return@apply
                }

                scheduleItems().forEach { it.validate() }
                creditTypeId()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (scheduleItems.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                    (if (creditTypeId.asKnown().isPresent) 1 else 0)

            class ScheduleItem
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amount: JsonField<Double>,
                private val endingBefore: JsonField<OffsetDateTime>,
                private val startingAt: JsonField<OffsetDateTime>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("ending_before")
                    @ExcludeMissing
                    endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("starting_at")
                    @ExcludeMissing
                    startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                ) : this(amount, endingBefore, startingAt, mutableMapOf())

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun amount(): Double = amount.getRequired("amount")

                /**
                 * RFC 3339 timestamp (exclusive)
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun endingBefore(): OffsetDateTime = endingBefore.getRequired("ending_before")

                /**
                 * RFC 3339 timestamp (inclusive)
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                /**
                 * Returns the raw JSON value of [endingBefore].
                 *
                 * Unlike [endingBefore], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("ending_before")
                @ExcludeMissing
                fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

                /**
                 * Returns the raw JSON value of [startingAt].
                 *
                 * Unlike [startingAt], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("starting_at")
                @ExcludeMissing
                fun _startingAt(): JsonField<OffsetDateTime> = startingAt

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [ScheduleItem].
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .endingBefore()
                     * .startingAt()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ScheduleItem]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Double>? = null
                    private var endingBefore: JsonField<OffsetDateTime>? = null
                    private var startingAt: JsonField<OffsetDateTime>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(scheduleItem: ScheduleItem) = apply {
                        amount = scheduleItem.amount
                        endingBefore = scheduleItem.endingBefore
                        startingAt = scheduleItem.startingAt
                        additionalProperties = scheduleItem.additionalProperties.toMutableMap()
                    }

                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    /** RFC 3339 timestamp (exclusive) */
                    fun endingBefore(endingBefore: OffsetDateTime) =
                        endingBefore(JsonField.of(endingBefore))

                    /**
                     * Sets [Builder.endingBefore] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.endingBefore] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                        this.endingBefore = endingBefore
                    }

                    /** RFC 3339 timestamp (inclusive) */
                    fun startingAt(startingAt: OffsetDateTime) =
                        startingAt(JsonField.of(startingAt))

                    /**
                     * Sets [Builder.startingAt] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.startingAt] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                        this.startingAt = startingAt
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [ScheduleItem].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .endingBefore()
                     * .startingAt()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): ScheduleItem =
                        ScheduleItem(
                            checkRequired("amount", amount),
                            checkRequired("endingBefore", endingBefore),
                            checkRequired("startingAt", startingAt),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): ScheduleItem = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    endingBefore()
                    startingAt()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (amount.asKnown().isPresent) 1 else 0) +
                        (if (endingBefore.asKnown().isPresent) 1 else 0) +
                        (if (startingAt.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ScheduleItem &&
                        amount == other.amount &&
                        endingBefore == other.endingBefore &&
                        startingAt == other.startingAt &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(amount, endingBefore, startingAt, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ScheduleItem{amount=$amount, endingBefore=$endingBefore, startingAt=$startingAt, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AccessSchedule &&
                    scheduleItems == other.scheduleItems &&
                    creditTypeId == other.creditTypeId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(scheduleItems, creditTypeId, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AccessSchedule{scheduleItems=$scheduleItems, creditTypeId=$creditTypeId, additionalProperties=$additionalProperties}"
        }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        class CustomFields
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [CustomFields]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CustomFields]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(customFields: CustomFields) = apply {
                    additionalProperties = customFields.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [CustomFields].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): CustomFields = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CustomFields && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
        }

        class RateType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val COMMIT_RATE = of("COMMIT_RATE")

                @JvmField val LIST_RATE = of("LIST_RATE")

                @JvmStatic fun of(value: String) = RateType(JsonField.of(value))
            }

            /** An enum containing [RateType]'s known values. */
            enum class Known {
                COMMIT_RATE,
                LIST_RATE,
            }

            /**
             * An enum containing [RateType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [RateType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                COMMIT_RATE,
                LIST_RATE,
                /**
                 * An enum member indicating that [RateType] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    COMMIT_RATE -> Value.COMMIT_RATE
                    LIST_RATE -> Value.LIST_RATE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    COMMIT_RATE -> Known.COMMIT_RATE
                    LIST_RATE -> Known.LIST_RATE
                    else -> throw MetronomeInvalidDataException("Unknown RateType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): RateType = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RateType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Credit &&
                accessSchedule == other.accessSchedule &&
                productId == other.productId &&
                applicableProductIds == other.applicableProductIds &&
                applicableProductTags == other.applicableProductTags &&
                customFields == other.customFields &&
                description == other.description &&
                hierarchyConfiguration == other.hierarchyConfiguration &&
                name == other.name &&
                netsuiteSalesOrderId == other.netsuiteSalesOrderId &&
                priority == other.priority &&
                rateType == other.rateType &&
                rolloverFraction == other.rolloverFraction &&
                specifiers == other.specifiers &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                accessSchedule,
                productId,
                applicableProductIds,
                applicableProductTags,
                customFields,
                description,
                hierarchyConfiguration,
                name,
                netsuiteSalesOrderId,
                priority,
                rateType,
                rolloverFraction,
                specifiers,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Credit{accessSchedule=$accessSchedule, productId=$productId, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, customFields=$customFields, description=$description, hierarchyConfiguration=$hierarchyConfiguration, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, priority=$priority, rateType=$rateType, rolloverFraction=$rolloverFraction, specifiers=$specifiers, additionalProperties=$additionalProperties}"
    }

    /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
    class CustomFields
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [CustomFields]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CustomFields]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customFields: CustomFields) = apply {
                additionalProperties = customFields.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [CustomFields].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): CustomFields = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CustomFields && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
    }

    class Discount
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val productId: JsonField<String>,
        private val schedule: JsonField<Schedule>,
        private val customFields: JsonField<CustomFields>,
        private val name: JsonField<String>,
        private val netsuiteSalesOrderId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("product_id")
            @ExcludeMissing
            productId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("schedule")
            @ExcludeMissing
            schedule: JsonField<Schedule> = JsonMissing.of(),
            @JsonProperty("custom_fields")
            @ExcludeMissing
            customFields: JsonField<CustomFields> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("netsuite_sales_order_id")
            @ExcludeMissing
            netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
        ) : this(productId, schedule, customFields, name, netsuiteSalesOrderId, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun productId(): String = productId.getRequired("product_id")

        /**
         * Must provide either schedule_items or recurring_schedule.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun schedule(): Schedule = schedule.getRequired("schedule")

        /**
         * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun customFields(): Optional<CustomFields> = customFields.getOptional("custom_fields")

        /**
         * displayed on invoices
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * This field's availability is dependent on your client's configuration.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun netsuiteSalesOrderId(): Optional<String> =
            netsuiteSalesOrderId.getOptional("netsuite_sales_order_id")

        /**
         * Returns the raw JSON value of [productId].
         *
         * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

        /**
         * Returns the raw JSON value of [schedule].
         *
         * Unlike [schedule], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("schedule") @ExcludeMissing fun _schedule(): JsonField<Schedule> = schedule

        /**
         * Returns the raw JSON value of [customFields].
         *
         * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [netsuiteSalesOrderId].
         *
         * Unlike [netsuiteSalesOrderId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        fun _netsuiteSalesOrderId(): JsonField<String> = netsuiteSalesOrderId

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Discount].
             *
             * The following fields are required:
             * ```java
             * .productId()
             * .schedule()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Discount]. */
        class Builder internal constructor() {

            private var productId: JsonField<String>? = null
            private var schedule: JsonField<Schedule>? = null
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(discount: Discount) = apply {
                productId = discount.productId
                schedule = discount.schedule
                customFields = discount.customFields
                name = discount.name
                netsuiteSalesOrderId = discount.netsuiteSalesOrderId
                additionalProperties = discount.additionalProperties.toMutableMap()
            }

            fun productId(productId: String) = productId(JsonField.of(productId))

            /**
             * Sets [Builder.productId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            /** Must provide either schedule_items or recurring_schedule. */
            fun schedule(schedule: Schedule) = schedule(JsonField.of(schedule))

            /**
             * Sets [Builder.schedule] to an arbitrary JSON value.
             *
             * You should usually call [Builder.schedule] with a well-typed [Schedule] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun schedule(schedule: JsonField<Schedule>) = apply { this.schedule = schedule }

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

            /**
             * Sets [Builder.customFields] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customFields] with a well-typed [CustomFields] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customFields(customFields: JsonField<CustomFields>) = apply {
                this.customFields = customFields
            }

            /** displayed on invoices */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
                netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

            /**
             * Sets [Builder.netsuiteSalesOrderId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.netsuiteSalesOrderId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
                this.netsuiteSalesOrderId = netsuiteSalesOrderId
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Discount].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .productId()
             * .schedule()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Discount =
                Discount(
                    checkRequired("productId", productId),
                    checkRequired("schedule", schedule),
                    customFields,
                    name,
                    netsuiteSalesOrderId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Discount = apply {
            if (validated) {
                return@apply
            }

            productId()
            schedule().validate()
            customFields().ifPresent { it.validate() }
            name()
            netsuiteSalesOrderId()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (productId.asKnown().isPresent) 1 else 0) +
                (schedule.asKnown().getOrNull()?.validity() ?: 0) +
                (customFields.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (netsuiteSalesOrderId.asKnown().isPresent) 1 else 0)

        /** Must provide either schedule_items or recurring_schedule. */
        class Schedule
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val creditTypeId: JsonField<String>,
            private val doNotInvoice: JsonField<Boolean>,
            private val recurringSchedule: JsonField<RecurringSchedule>,
            private val scheduleItems: JsonField<List<ScheduleItem>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("credit_type_id")
                @ExcludeMissing
                creditTypeId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("do_not_invoice")
                @ExcludeMissing
                doNotInvoice: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("recurring_schedule")
                @ExcludeMissing
                recurringSchedule: JsonField<RecurringSchedule> = JsonMissing.of(),
                @JsonProperty("schedule_items")
                @ExcludeMissing
                scheduleItems: JsonField<List<ScheduleItem>> = JsonMissing.of(),
            ) : this(creditTypeId, doNotInvoice, recurringSchedule, scheduleItems, mutableMapOf())

            /**
             * Defaults to USD (cents) if not passed.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun creditTypeId(): Optional<String> = creditTypeId.getOptional("credit_type_id")

            /**
             * This field is only applicable to commit invoice schedules. If true, this schedule
             * will not generate an invoice.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun doNotInvoice(): Optional<Boolean> = doNotInvoice.getOptional("do_not_invoice")

            /**
             * Enter the unit price and quantity for the charge or instead only send the amount. If
             * amount is sent, the unit price is assumed to be the amount and quantity is inferred
             * to be 1.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun recurringSchedule(): Optional<RecurringSchedule> =
                recurringSchedule.getOptional("recurring_schedule")

            /**
             * Either provide amount or provide both unit_price and quantity.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun scheduleItems(): Optional<List<ScheduleItem>> =
                scheduleItems.getOptional("schedule_items")

            /**
             * Returns the raw JSON value of [creditTypeId].
             *
             * Unlike [creditTypeId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("credit_type_id")
            @ExcludeMissing
            fun _creditTypeId(): JsonField<String> = creditTypeId

            /**
             * Returns the raw JSON value of [doNotInvoice].
             *
             * Unlike [doNotInvoice], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("do_not_invoice")
            @ExcludeMissing
            fun _doNotInvoice(): JsonField<Boolean> = doNotInvoice

            /**
             * Returns the raw JSON value of [recurringSchedule].
             *
             * Unlike [recurringSchedule], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("recurring_schedule")
            @ExcludeMissing
            fun _recurringSchedule(): JsonField<RecurringSchedule> = recurringSchedule

            /**
             * Returns the raw JSON value of [scheduleItems].
             *
             * Unlike [scheduleItems], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("schedule_items")
            @ExcludeMissing
            fun _scheduleItems(): JsonField<List<ScheduleItem>> = scheduleItems

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Schedule]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Schedule]. */
            class Builder internal constructor() {

                private var creditTypeId: JsonField<String> = JsonMissing.of()
                private var doNotInvoice: JsonField<Boolean> = JsonMissing.of()
                private var recurringSchedule: JsonField<RecurringSchedule> = JsonMissing.of()
                private var scheduleItems: JsonField<MutableList<ScheduleItem>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(schedule: Schedule) = apply {
                    creditTypeId = schedule.creditTypeId
                    doNotInvoice = schedule.doNotInvoice
                    recurringSchedule = schedule.recurringSchedule
                    scheduleItems = schedule.scheduleItems.map { it.toMutableList() }
                    additionalProperties = schedule.additionalProperties.toMutableMap()
                }

                /** Defaults to USD (cents) if not passed. */
                fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

                /**
                 * Sets [Builder.creditTypeId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.creditTypeId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun creditTypeId(creditTypeId: JsonField<String>) = apply {
                    this.creditTypeId = creditTypeId
                }

                /**
                 * This field is only applicable to commit invoice schedules. If true, this schedule
                 * will not generate an invoice.
                 */
                fun doNotInvoice(doNotInvoice: Boolean) = doNotInvoice(JsonField.of(doNotInvoice))

                /**
                 * Sets [Builder.doNotInvoice] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.doNotInvoice] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun doNotInvoice(doNotInvoice: JsonField<Boolean>) = apply {
                    this.doNotInvoice = doNotInvoice
                }

                /**
                 * Enter the unit price and quantity for the charge or instead only send the amount.
                 * If amount is sent, the unit price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                fun recurringSchedule(recurringSchedule: RecurringSchedule) =
                    recurringSchedule(JsonField.of(recurringSchedule))

                /**
                 * Sets [Builder.recurringSchedule] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recurringSchedule] with a well-typed
                 * [RecurringSchedule] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun recurringSchedule(recurringSchedule: JsonField<RecurringSchedule>) = apply {
                    this.recurringSchedule = recurringSchedule
                }

                /** Either provide amount or provide both unit_price and quantity. */
                fun scheduleItems(scheduleItems: List<ScheduleItem>) =
                    scheduleItems(JsonField.of(scheduleItems))

                /**
                 * Sets [Builder.scheduleItems] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.scheduleItems] with a well-typed
                 * `List<ScheduleItem>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun scheduleItems(scheduleItems: JsonField<List<ScheduleItem>>) = apply {
                    this.scheduleItems = scheduleItems.map { it.toMutableList() }
                }

                /**
                 * Adds a single [ScheduleItem] to [scheduleItems].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addScheduleItem(scheduleItem: ScheduleItem) = apply {
                    scheduleItems =
                        (scheduleItems ?: JsonField.of(mutableListOf())).also {
                            checkKnown("scheduleItems", it).add(scheduleItem)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Schedule].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Schedule =
                    Schedule(
                        creditTypeId,
                        doNotInvoice,
                        recurringSchedule,
                        (scheduleItems ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Schedule = apply {
                if (validated) {
                    return@apply
                }

                creditTypeId()
                doNotInvoice()
                recurringSchedule().ifPresent { it.validate() }
                scheduleItems().ifPresent { it.forEach { it.validate() } }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (creditTypeId.asKnown().isPresent) 1 else 0) +
                    (if (doNotInvoice.asKnown().isPresent) 1 else 0) +
                    (recurringSchedule.asKnown().getOrNull()?.validity() ?: 0) +
                    (scheduleItems.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            /**
             * Enter the unit price and quantity for the charge or instead only send the amount. If
             * amount is sent, the unit price is assumed to be the amount and quantity is inferred
             * to be 1.
             */
            class RecurringSchedule
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amountDistribution: JsonField<AmountDistribution>,
                private val endingBefore: JsonField<OffsetDateTime>,
                private val frequency: JsonField<Frequency>,
                private val startingAt: JsonField<OffsetDateTime>,
                private val amount: JsonField<Double>,
                private val quantity: JsonField<Double>,
                private val unitPrice: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount_distribution")
                    @ExcludeMissing
                    amountDistribution: JsonField<AmountDistribution> = JsonMissing.of(),
                    @JsonProperty("ending_before")
                    @ExcludeMissing
                    endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("frequency")
                    @ExcludeMissing
                    frequency: JsonField<Frequency> = JsonMissing.of(),
                    @JsonProperty("starting_at")
                    @ExcludeMissing
                    startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("quantity")
                    @ExcludeMissing
                    quantity: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("unit_price")
                    @ExcludeMissing
                    unitPrice: JsonField<Double> = JsonMissing.of(),
                ) : this(
                    amountDistribution,
                    endingBefore,
                    frequency,
                    startingAt,
                    amount,
                    quantity,
                    unitPrice,
                    mutableMapOf(),
                )

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun amountDistribution(): AmountDistribution =
                    amountDistribution.getRequired("amount_distribution")

                /**
                 * RFC 3339 timestamp (exclusive).
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun endingBefore(): OffsetDateTime = endingBefore.getRequired("ending_before")

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun frequency(): Frequency = frequency.getRequired("frequency")

                /**
                 * RFC 3339 timestamp (inclusive).
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

                /**
                 * Amount for the charge. Can be provided instead of unit_price and quantity. If
                 * amount is sent, the unit_price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun amount(): Optional<Double> = amount.getOptional("amount")

                /**
                 * Quantity for the charge. Will be multiplied by unit_price to determine the amount
                 * and must be specified with unit_price. If specified amount cannot be provided.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun quantity(): Optional<Double> = quantity.getOptional("quantity")

                /**
                 * Unit price for the charge. Will be multiplied by quantity to determine the amount
                 * and must be specified with quantity. If specified amount cannot be provided.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun unitPrice(): Optional<Double> = unitPrice.getOptional("unit_price")

                /**
                 * Returns the raw JSON value of [amountDistribution].
                 *
                 * Unlike [amountDistribution], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("amount_distribution")
                @ExcludeMissing
                fun _amountDistribution(): JsonField<AmountDistribution> = amountDistribution

                /**
                 * Returns the raw JSON value of [endingBefore].
                 *
                 * Unlike [endingBefore], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("ending_before")
                @ExcludeMissing
                fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

                /**
                 * Returns the raw JSON value of [frequency].
                 *
                 * Unlike [frequency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("frequency")
                @ExcludeMissing
                fun _frequency(): JsonField<Frequency> = frequency

                /**
                 * Returns the raw JSON value of [startingAt].
                 *
                 * Unlike [startingAt], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("starting_at")
                @ExcludeMissing
                fun _startingAt(): JsonField<OffsetDateTime> = startingAt

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                /**
                 * Returns the raw JSON value of [quantity].
                 *
                 * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("quantity")
                @ExcludeMissing
                fun _quantity(): JsonField<Double> = quantity

                /**
                 * Returns the raw JSON value of [unitPrice].
                 *
                 * Unlike [unitPrice], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("unit_price")
                @ExcludeMissing
                fun _unitPrice(): JsonField<Double> = unitPrice

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [RecurringSchedule].
                     *
                     * The following fields are required:
                     * ```java
                     * .amountDistribution()
                     * .endingBefore()
                     * .frequency()
                     * .startingAt()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [RecurringSchedule]. */
                class Builder internal constructor() {

                    private var amountDistribution: JsonField<AmountDistribution>? = null
                    private var endingBefore: JsonField<OffsetDateTime>? = null
                    private var frequency: JsonField<Frequency>? = null
                    private var startingAt: JsonField<OffsetDateTime>? = null
                    private var amount: JsonField<Double> = JsonMissing.of()
                    private var quantity: JsonField<Double> = JsonMissing.of()
                    private var unitPrice: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(recurringSchedule: RecurringSchedule) = apply {
                        amountDistribution = recurringSchedule.amountDistribution
                        endingBefore = recurringSchedule.endingBefore
                        frequency = recurringSchedule.frequency
                        startingAt = recurringSchedule.startingAt
                        amount = recurringSchedule.amount
                        quantity = recurringSchedule.quantity
                        unitPrice = recurringSchedule.unitPrice
                        additionalProperties = recurringSchedule.additionalProperties.toMutableMap()
                    }

                    fun amountDistribution(amountDistribution: AmountDistribution) =
                        amountDistribution(JsonField.of(amountDistribution))

                    /**
                     * Sets [Builder.amountDistribution] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amountDistribution] with a well-typed
                     * [AmountDistribution] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun amountDistribution(amountDistribution: JsonField<AmountDistribution>) =
                        apply {
                            this.amountDistribution = amountDistribution
                        }

                    /** RFC 3339 timestamp (exclusive). */
                    fun endingBefore(endingBefore: OffsetDateTime) =
                        endingBefore(JsonField.of(endingBefore))

                    /**
                     * Sets [Builder.endingBefore] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.endingBefore] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                        this.endingBefore = endingBefore
                    }

                    fun frequency(frequency: Frequency) = frequency(JsonField.of(frequency))

                    /**
                     * Sets [Builder.frequency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.frequency] with a well-typed [Frequency]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun frequency(frequency: JsonField<Frequency>) = apply {
                        this.frequency = frequency
                    }

                    /** RFC 3339 timestamp (inclusive). */
                    fun startingAt(startingAt: OffsetDateTime) =
                        startingAt(JsonField.of(startingAt))

                    /**
                     * Sets [Builder.startingAt] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.startingAt] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                        this.startingAt = startingAt
                    }

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    /**
                     * Sets [Builder.quantity] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.quantity] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

                    /**
                     * Sets [Builder.unitPrice] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.unitPrice] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun unitPrice(unitPrice: JsonField<Double>) = apply {
                        this.unitPrice = unitPrice
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [RecurringSchedule].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .amountDistribution()
                     * .endingBefore()
                     * .frequency()
                     * .startingAt()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): RecurringSchedule =
                        RecurringSchedule(
                            checkRequired("amountDistribution", amountDistribution),
                            checkRequired("endingBefore", endingBefore),
                            checkRequired("frequency", frequency),
                            checkRequired("startingAt", startingAt),
                            amount,
                            quantity,
                            unitPrice,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): RecurringSchedule = apply {
                    if (validated) {
                        return@apply
                    }

                    amountDistribution().validate()
                    endingBefore()
                    frequency().validate()
                    startingAt()
                    amount()
                    quantity()
                    unitPrice()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (amountDistribution.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (endingBefore.asKnown().isPresent) 1 else 0) +
                        (frequency.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (startingAt.asKnown().isPresent) 1 else 0) +
                        (if (amount.asKnown().isPresent) 1 else 0) +
                        (if (quantity.asKnown().isPresent) 1 else 0) +
                        (if (unitPrice.asKnown().isPresent) 1 else 0)

                class AmountDistribution
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val DIVIDED = of("DIVIDED")

                        @JvmField val DIVIDED_ROUNDED = of("DIVIDED_ROUNDED")

                        @JvmField val EACH = of("EACH")

                        @JvmStatic fun of(value: String) = AmountDistribution(JsonField.of(value))
                    }

                    /** An enum containing [AmountDistribution]'s known values. */
                    enum class Known {
                        DIVIDED,
                        DIVIDED_ROUNDED,
                        EACH,
                    }

                    /**
                     * An enum containing [AmountDistribution]'s known values, as well as an
                     * [_UNKNOWN] member.
                     *
                     * An instance of [AmountDistribution] can contain an unknown value in a couple
                     * of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        DIVIDED,
                        DIVIDED_ROUNDED,
                        EACH,
                        /**
                         * An enum member indicating that [AmountDistribution] was instantiated with
                         * an unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            DIVIDED -> Value.DIVIDED
                            DIVIDED_ROUNDED -> Value.DIVIDED_ROUNDED
                            EACH -> Value.EACH
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws MetronomeInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            DIVIDED -> Known.DIVIDED
                            DIVIDED_ROUNDED -> Known.DIVIDED_ROUNDED
                            EACH -> Known.EACH
                            else ->
                                throw MetronomeInvalidDataException(
                                    "Unknown AmountDistribution: $value"
                                )
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws MetronomeInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            MetronomeInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws MetronomeInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): AmountDistribution = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: MetronomeInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is AmountDistribution && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                class Frequency
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val MONTHLY = of("MONTHLY")

                        @JvmField val QUARTERLY = of("QUARTERLY")

                        @JvmField val SEMI_ANNUAL = of("SEMI_ANNUAL")

                        @JvmField val ANNUAL = of("ANNUAL")

                        @JvmStatic fun of(value: String) = Frequency(JsonField.of(value))
                    }

                    /** An enum containing [Frequency]'s known values. */
                    enum class Known {
                        MONTHLY,
                        QUARTERLY,
                        SEMI_ANNUAL,
                        ANNUAL,
                    }

                    /**
                     * An enum containing [Frequency]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [Frequency] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        MONTHLY,
                        QUARTERLY,
                        SEMI_ANNUAL,
                        ANNUAL,
                        /**
                         * An enum member indicating that [Frequency] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            MONTHLY -> Value.MONTHLY
                            QUARTERLY -> Value.QUARTERLY
                            SEMI_ANNUAL -> Value.SEMI_ANNUAL
                            ANNUAL -> Value.ANNUAL
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws MetronomeInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            MONTHLY -> Known.MONTHLY
                            QUARTERLY -> Known.QUARTERLY
                            SEMI_ANNUAL -> Known.SEMI_ANNUAL
                            ANNUAL -> Known.ANNUAL
                            else -> throw MetronomeInvalidDataException("Unknown Frequency: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws MetronomeInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            MetronomeInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws MetronomeInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Frequency = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: MetronomeInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Frequency && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is RecurringSchedule &&
                        amountDistribution == other.amountDistribution &&
                        endingBefore == other.endingBefore &&
                        frequency == other.frequency &&
                        startingAt == other.startingAt &&
                        amount == other.amount &&
                        quantity == other.quantity &&
                        unitPrice == other.unitPrice &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        amountDistribution,
                        endingBefore,
                        frequency,
                        startingAt,
                        amount,
                        quantity,
                        unitPrice,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "RecurringSchedule{amountDistribution=$amountDistribution, endingBefore=$endingBefore, frequency=$frequency, startingAt=$startingAt, amount=$amount, quantity=$quantity, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
            }

            class ScheduleItem
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val timestamp: JsonField<OffsetDateTime>,
                private val amount: JsonField<Double>,
                private val quantity: JsonField<Double>,
                private val unitPrice: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("timestamp")
                    @ExcludeMissing
                    timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("quantity")
                    @ExcludeMissing
                    quantity: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("unit_price")
                    @ExcludeMissing
                    unitPrice: JsonField<Double> = JsonMissing.of(),
                ) : this(timestamp, amount, quantity, unitPrice, mutableMapOf())

                /**
                 * timestamp of the scheduled event
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

                /**
                 * Amount for the charge. Can be provided instead of unit_price and quantity. If
                 * amount is sent, the unit_price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun amount(): Optional<Double> = amount.getOptional("amount")

                /**
                 * Quantity for the charge. Will be multiplied by unit_price to determine the amount
                 * and must be specified with unit_price. If specified amount cannot be provided.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun quantity(): Optional<Double> = quantity.getOptional("quantity")

                /**
                 * Unit price for the charge. Will be multiplied by quantity to determine the amount
                 * and must be specified with quantity. If specified amount cannot be provided.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun unitPrice(): Optional<Double> = unitPrice.getOptional("unit_price")

                /**
                 * Returns the raw JSON value of [timestamp].
                 *
                 * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("timestamp")
                @ExcludeMissing
                fun _timestamp(): JsonField<OffsetDateTime> = timestamp

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                /**
                 * Returns the raw JSON value of [quantity].
                 *
                 * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("quantity")
                @ExcludeMissing
                fun _quantity(): JsonField<Double> = quantity

                /**
                 * Returns the raw JSON value of [unitPrice].
                 *
                 * Unlike [unitPrice], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("unit_price")
                @ExcludeMissing
                fun _unitPrice(): JsonField<Double> = unitPrice

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [ScheduleItem].
                     *
                     * The following fields are required:
                     * ```java
                     * .timestamp()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ScheduleItem]. */
                class Builder internal constructor() {

                    private var timestamp: JsonField<OffsetDateTime>? = null
                    private var amount: JsonField<Double> = JsonMissing.of()
                    private var quantity: JsonField<Double> = JsonMissing.of()
                    private var unitPrice: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(scheduleItem: ScheduleItem) = apply {
                        timestamp = scheduleItem.timestamp
                        amount = scheduleItem.amount
                        quantity = scheduleItem.quantity
                        unitPrice = scheduleItem.unitPrice
                        additionalProperties = scheduleItem.additionalProperties.toMutableMap()
                    }

                    /** timestamp of the scheduled event */
                    fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                    /**
                     * Sets [Builder.timestamp] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.timestamp] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                        this.timestamp = timestamp
                    }

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    /**
                     * Sets [Builder.quantity] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.quantity] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

                    /**
                     * Sets [Builder.unitPrice] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.unitPrice] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun unitPrice(unitPrice: JsonField<Double>) = apply {
                        this.unitPrice = unitPrice
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [ScheduleItem].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .timestamp()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): ScheduleItem =
                        ScheduleItem(
                            checkRequired("timestamp", timestamp),
                            amount,
                            quantity,
                            unitPrice,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): ScheduleItem = apply {
                    if (validated) {
                        return@apply
                    }

                    timestamp()
                    amount()
                    quantity()
                    unitPrice()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (timestamp.asKnown().isPresent) 1 else 0) +
                        (if (amount.asKnown().isPresent) 1 else 0) +
                        (if (quantity.asKnown().isPresent) 1 else 0) +
                        (if (unitPrice.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ScheduleItem &&
                        timestamp == other.timestamp &&
                        amount == other.amount &&
                        quantity == other.quantity &&
                        unitPrice == other.unitPrice &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(timestamp, amount, quantity, unitPrice, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ScheduleItem{timestamp=$timestamp, amount=$amount, quantity=$quantity, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Schedule &&
                    creditTypeId == other.creditTypeId &&
                    doNotInvoice == other.doNotInvoice &&
                    recurringSchedule == other.recurringSchedule &&
                    scheduleItems == other.scheduleItems &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    creditTypeId,
                    doNotInvoice,
                    recurringSchedule,
                    scheduleItems,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Schedule{creditTypeId=$creditTypeId, doNotInvoice=$doNotInvoice, recurringSchedule=$recurringSchedule, scheduleItems=$scheduleItems, additionalProperties=$additionalProperties}"
        }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        class CustomFields
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [CustomFields]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CustomFields]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(customFields: CustomFields) = apply {
                    additionalProperties = customFields.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [CustomFields].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): CustomFields = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CustomFields && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Discount &&
                productId == other.productId &&
                schedule == other.schedule &&
                customFields == other.customFields &&
                name == other.name &&
                netsuiteSalesOrderId == other.netsuiteSalesOrderId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                productId,
                schedule,
                customFields,
                name,
                netsuiteSalesOrderId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Discount{productId=$productId, schedule=$schedule, customFields=$customFields, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, additionalProperties=$additionalProperties}"
    }

    class Override
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val startingAt: JsonField<OffsetDateTime>,
        private val applicableProductTags: JsonField<List<String>>,
        private val endingBefore: JsonField<OffsetDateTime>,
        private val entitled: JsonField<Boolean>,
        private val isCommitSpecific: JsonField<Boolean>,
        private val multiplier: JsonField<Double>,
        private val overrideSpecifiers: JsonField<List<OverrideSpecifier>>,
        private val overwriteRate: JsonField<OverwriteRate>,
        private val priority: JsonField<Double>,
        private val productId: JsonField<String>,
        private val target: JsonField<Target>,
        private val tiers: JsonField<List<Tier>>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("starting_at")
            @ExcludeMissing
            startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("applicable_product_tags")
            @ExcludeMissing
            applicableProductTags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("ending_before")
            @ExcludeMissing
            endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("entitled")
            @ExcludeMissing
            entitled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("is_commit_specific")
            @ExcludeMissing
            isCommitSpecific: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("multiplier")
            @ExcludeMissing
            multiplier: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("override_specifiers")
            @ExcludeMissing
            overrideSpecifiers: JsonField<List<OverrideSpecifier>> = JsonMissing.of(),
            @JsonProperty("overwrite_rate")
            @ExcludeMissing
            overwriteRate: JsonField<OverwriteRate> = JsonMissing.of(),
            @JsonProperty("priority")
            @ExcludeMissing
            priority: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("product_id")
            @ExcludeMissing
            productId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("target") @ExcludeMissing target: JsonField<Target> = JsonMissing.of(),
            @JsonProperty("tiers") @ExcludeMissing tiers: JsonField<List<Tier>> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(
            startingAt,
            applicableProductTags,
            endingBefore,
            entitled,
            isCommitSpecific,
            multiplier,
            overrideSpecifiers,
            overwriteRate,
            priority,
            productId,
            target,
            tiers,
            type,
            mutableMapOf(),
        )

        /**
         * RFC 3339 timestamp indicating when the override will start applying (inclusive)
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

        /**
         * tags identifying products whose rates are being overridden. Cannot be used in conjunction
         * with override_specifiers.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun applicableProductTags(): Optional<List<String>> =
            applicableProductTags.getOptional("applicable_product_tags")

        /**
         * RFC 3339 timestamp indicating when the override will stop applying (exclusive)
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun endingBefore(): Optional<OffsetDateTime> = endingBefore.getOptional("ending_before")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun entitled(): Optional<Boolean> = entitled.getOptional("entitled")

        /**
         * Indicates whether the override should only apply to commits. Defaults to `false`. If
         * `true`, you can specify relevant commits in `override_specifiers` by passing
         * `commit_ids`. if you do not specify `commit_ids`, then the override will apply when
         * consuming any prepaid or postpaid commit.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun isCommitSpecific(): Optional<Boolean> =
            isCommitSpecific.getOptional("is_commit_specific")

        /**
         * Required for MULTIPLIER type. Must be >=0.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun multiplier(): Optional<Double> = multiplier.getOptional("multiplier")

        /**
         * Cannot be used in conjunction with product_id or applicable_product_tags. If provided,
         * the override will apply to all products with the specified specifiers.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun overrideSpecifiers(): Optional<List<OverrideSpecifier>> =
            overrideSpecifiers.getOptional("override_specifiers")

        /**
         * Required for OVERWRITE type.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun overwriteRate(): Optional<OverwriteRate> = overwriteRate.getOptional("overwrite_rate")

        /**
         * Required for EXPLICIT multiplier prioritization scheme and all TIERED overrides. Under
         * EXPLICIT prioritization, overwrites are prioritized first, and then tiered and multiplier
         * overrides are prioritized by their priority value (lowest first). Must be > 0.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun priority(): Optional<Double> = priority.getOptional("priority")

        /**
         * ID of the product whose rate is being overridden. Cannot be used in conjunction with
         * override_specifiers.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun productId(): Optional<String> = productId.getOptional("product_id")

        /**
         * Indicates whether the override applies to commit rates or list rates. Can only be used
         * for overrides that have `is_commit_specific` set to `true`. Defaults to `"LIST_RATE"`.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun target(): Optional<Target> = target.getOptional("target")

        /**
         * Required for TIERED type. Must have at least one tier.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun tiers(): Optional<List<Tier>> = tiers.getOptional("tiers")

        /**
         * Overwrites are prioritized over multipliers and tiered overrides.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun type(): Optional<Type> = type.getOptional("type")

        /**
         * Returns the raw JSON value of [startingAt].
         *
         * Unlike [startingAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("starting_at")
        @ExcludeMissing
        fun _startingAt(): JsonField<OffsetDateTime> = startingAt

        /**
         * Returns the raw JSON value of [applicableProductTags].
         *
         * Unlike [applicableProductTags], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        fun _applicableProductTags(): JsonField<List<String>> = applicableProductTags

        /**
         * Returns the raw JSON value of [endingBefore].
         *
         * Unlike [endingBefore], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ending_before")
        @ExcludeMissing
        fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

        /**
         * Returns the raw JSON value of [entitled].
         *
         * Unlike [entitled], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entitled") @ExcludeMissing fun _entitled(): JsonField<Boolean> = entitled

        /**
         * Returns the raw JSON value of [isCommitSpecific].
         *
         * Unlike [isCommitSpecific], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("is_commit_specific")
        @ExcludeMissing
        fun _isCommitSpecific(): JsonField<Boolean> = isCommitSpecific

        /**
         * Returns the raw JSON value of [multiplier].
         *
         * Unlike [multiplier], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("multiplier")
        @ExcludeMissing
        fun _multiplier(): JsonField<Double> = multiplier

        /**
         * Returns the raw JSON value of [overrideSpecifiers].
         *
         * Unlike [overrideSpecifiers], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("override_specifiers")
        @ExcludeMissing
        fun _overrideSpecifiers(): JsonField<List<OverrideSpecifier>> = overrideSpecifiers

        /**
         * Returns the raw JSON value of [overwriteRate].
         *
         * Unlike [overwriteRate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("overwrite_rate")
        @ExcludeMissing
        fun _overwriteRate(): JsonField<OverwriteRate> = overwriteRate

        /**
         * Returns the raw JSON value of [priority].
         *
         * Unlike [priority], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

        /**
         * Returns the raw JSON value of [productId].
         *
         * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

        /**
         * Returns the raw JSON value of [target].
         *
         * Unlike [target], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("target") @ExcludeMissing fun _target(): JsonField<Target> = target

        /**
         * Returns the raw JSON value of [tiers].
         *
         * Unlike [tiers], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tiers") @ExcludeMissing fun _tiers(): JsonField<List<Tier>> = tiers

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Override].
             *
             * The following fields are required:
             * ```java
             * .startingAt()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Override]. */
        class Builder internal constructor() {

            private var startingAt: JsonField<OffsetDateTime>? = null
            private var applicableProductTags: JsonField<MutableList<String>>? = null
            private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var entitled: JsonField<Boolean> = JsonMissing.of()
            private var isCommitSpecific: JsonField<Boolean> = JsonMissing.of()
            private var multiplier: JsonField<Double> = JsonMissing.of()
            private var overrideSpecifiers: JsonField<MutableList<OverrideSpecifier>>? = null
            private var overwriteRate: JsonField<OverwriteRate> = JsonMissing.of()
            private var priority: JsonField<Double> = JsonMissing.of()
            private var productId: JsonField<String> = JsonMissing.of()
            private var target: JsonField<Target> = JsonMissing.of()
            private var tiers: JsonField<MutableList<Tier>>? = null
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(override: Override) = apply {
                startingAt = override.startingAt
                applicableProductTags = override.applicableProductTags.map { it.toMutableList() }
                endingBefore = override.endingBefore
                entitled = override.entitled
                isCommitSpecific = override.isCommitSpecific
                multiplier = override.multiplier
                overrideSpecifiers = override.overrideSpecifiers.map { it.toMutableList() }
                overwriteRate = override.overwriteRate
                priority = override.priority
                productId = override.productId
                target = override.target
                tiers = override.tiers.map { it.toMutableList() }
                type = override.type
                additionalProperties = override.additionalProperties.toMutableMap()
            }

            /** RFC 3339 timestamp indicating when the override will start applying (inclusive) */
            fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

            /**
             * Sets [Builder.startingAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startingAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                this.startingAt = startingAt
            }

            /**
             * tags identifying products whose rates are being overridden. Cannot be used in
             * conjunction with override_specifiers.
             */
            fun applicableProductTags(applicableProductTags: List<String>) =
                applicableProductTags(JsonField.of(applicableProductTags))

            /**
             * Sets [Builder.applicableProductTags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.applicableProductTags] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
                this.applicableProductTags = applicableProductTags.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [applicableProductTags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addApplicableProductTag(applicableProductTag: String) = apply {
                applicableProductTags =
                    (applicableProductTags ?: JsonField.of(mutableListOf())).also {
                        checkKnown("applicableProductTags", it).add(applicableProductTag)
                    }
            }

            /** RFC 3339 timestamp indicating when the override will stop applying (exclusive) */
            fun endingBefore(endingBefore: OffsetDateTime) =
                endingBefore(JsonField.of(endingBefore))

            /**
             * Sets [Builder.endingBefore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endingBefore] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                this.endingBefore = endingBefore
            }

            fun entitled(entitled: Boolean) = entitled(JsonField.of(entitled))

            /**
             * Sets [Builder.entitled] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entitled] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entitled(entitled: JsonField<Boolean>) = apply { this.entitled = entitled }

            /**
             * Indicates whether the override should only apply to commits. Defaults to `false`. If
             * `true`, you can specify relevant commits in `override_specifiers` by passing
             * `commit_ids`. if you do not specify `commit_ids`, then the override will apply when
             * consuming any prepaid or postpaid commit.
             */
            fun isCommitSpecific(isCommitSpecific: Boolean) =
                isCommitSpecific(JsonField.of(isCommitSpecific))

            /**
             * Sets [Builder.isCommitSpecific] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isCommitSpecific] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isCommitSpecific(isCommitSpecific: JsonField<Boolean>) = apply {
                this.isCommitSpecific = isCommitSpecific
            }

            /** Required for MULTIPLIER type. Must be >=0. */
            fun multiplier(multiplier: Double) = multiplier(JsonField.of(multiplier))

            /**
             * Sets [Builder.multiplier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.multiplier] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun multiplier(multiplier: JsonField<Double>) = apply { this.multiplier = multiplier }

            /**
             * Cannot be used in conjunction with product_id or applicable_product_tags. If
             * provided, the override will apply to all products with the specified specifiers.
             */
            fun overrideSpecifiers(overrideSpecifiers: List<OverrideSpecifier>) =
                overrideSpecifiers(JsonField.of(overrideSpecifiers))

            /**
             * Sets [Builder.overrideSpecifiers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.overrideSpecifiers] with a well-typed
             * `List<OverrideSpecifier>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun overrideSpecifiers(overrideSpecifiers: JsonField<List<OverrideSpecifier>>) = apply {
                this.overrideSpecifiers = overrideSpecifiers.map { it.toMutableList() }
            }

            /**
             * Adds a single [OverrideSpecifier] to [overrideSpecifiers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addOverrideSpecifier(overrideSpecifier: OverrideSpecifier) = apply {
                overrideSpecifiers =
                    (overrideSpecifiers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("overrideSpecifiers", it).add(overrideSpecifier)
                    }
            }

            /** Required for OVERWRITE type. */
            fun overwriteRate(overwriteRate: OverwriteRate) =
                overwriteRate(JsonField.of(overwriteRate))

            /**
             * Sets [Builder.overwriteRate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.overwriteRate] with a well-typed [OverwriteRate]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun overwriteRate(overwriteRate: JsonField<OverwriteRate>) = apply {
                this.overwriteRate = overwriteRate
            }

            /**
             * Required for EXPLICIT multiplier prioritization scheme and all TIERED overrides.
             * Under EXPLICIT prioritization, overwrites are prioritized first, and then tiered and
             * multiplier overrides are prioritized by their priority value (lowest first). Must
             * be > 0.
             */
            fun priority(priority: Double) = priority(JsonField.of(priority))

            /**
             * Sets [Builder.priority] to an arbitrary JSON value.
             *
             * You should usually call [Builder.priority] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

            /**
             * ID of the product whose rate is being overridden. Cannot be used in conjunction with
             * override_specifiers.
             */
            fun productId(productId: String) = productId(JsonField.of(productId))

            /**
             * Sets [Builder.productId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            /**
             * Indicates whether the override applies to commit rates or list rates. Can only be
             * used for overrides that have `is_commit_specific` set to `true`. Defaults to
             * `"LIST_RATE"`.
             */
            fun target(target: Target) = target(JsonField.of(target))

            /**
             * Sets [Builder.target] to an arbitrary JSON value.
             *
             * You should usually call [Builder.target] with a well-typed [Target] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun target(target: JsonField<Target>) = apply { this.target = target }

            /** Required for TIERED type. Must have at least one tier. */
            fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

            /**
             * Sets [Builder.tiers] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tiers] with a well-typed `List<Tier>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tiers(tiers: JsonField<List<Tier>>) = apply {
                this.tiers = tiers.map { it.toMutableList() }
            }

            /**
             * Adds a single [Tier] to [tiers].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTier(tier: Tier) = apply {
                tiers =
                    (tiers ?: JsonField.of(mutableListOf())).also {
                        checkKnown("tiers", it).add(tier)
                    }
            }

            /** Overwrites are prioritized over multipliers and tiered overrides. */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Override].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .startingAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Override =
                Override(
                    checkRequired("startingAt", startingAt),
                    (applicableProductTags ?: JsonMissing.of()).map { it.toImmutable() },
                    endingBefore,
                    entitled,
                    isCommitSpecific,
                    multiplier,
                    (overrideSpecifiers ?: JsonMissing.of()).map { it.toImmutable() },
                    overwriteRate,
                    priority,
                    productId,
                    target,
                    (tiers ?: JsonMissing.of()).map { it.toImmutable() },
                    type,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Override = apply {
            if (validated) {
                return@apply
            }

            startingAt()
            applicableProductTags()
            endingBefore()
            entitled()
            isCommitSpecific()
            multiplier()
            overrideSpecifiers().ifPresent { it.forEach { it.validate() } }
            overwriteRate().ifPresent { it.validate() }
            priority()
            productId()
            target().ifPresent { it.validate() }
            tiers().ifPresent { it.forEach { it.validate() } }
            type().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (startingAt.asKnown().isPresent) 1 else 0) +
                (applicableProductTags.asKnown().getOrNull()?.size ?: 0) +
                (if (endingBefore.asKnown().isPresent) 1 else 0) +
                (if (entitled.asKnown().isPresent) 1 else 0) +
                (if (isCommitSpecific.asKnown().isPresent) 1 else 0) +
                (if (multiplier.asKnown().isPresent) 1 else 0) +
                (overrideSpecifiers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (overwriteRate.asKnown().getOrNull()?.validity() ?: 0) +
                (if (priority.asKnown().isPresent) 1 else 0) +
                (if (productId.asKnown().isPresent) 1 else 0) +
                (target.asKnown().getOrNull()?.validity() ?: 0) +
                (tiers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0)

        class OverrideSpecifier
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val billingFrequency: JsonField<BillingFrequency>,
            private val commitIds: JsonField<List<String>>,
            private val presentationGroupValues: JsonField<PresentationGroupValues>,
            private val pricingGroupValues: JsonField<PricingGroupValues>,
            private val productId: JsonField<String>,
            private val productTags: JsonField<List<String>>,
            private val recurringCommitIds: JsonField<List<String>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("billing_frequency")
                @ExcludeMissing
                billingFrequency: JsonField<BillingFrequency> = JsonMissing.of(),
                @JsonProperty("commit_ids")
                @ExcludeMissing
                commitIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("presentation_group_values")
                @ExcludeMissing
                presentationGroupValues: JsonField<PresentationGroupValues> = JsonMissing.of(),
                @JsonProperty("pricing_group_values")
                @ExcludeMissing
                pricingGroupValues: JsonField<PricingGroupValues> = JsonMissing.of(),
                @JsonProperty("product_id")
                @ExcludeMissing
                productId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("product_tags")
                @ExcludeMissing
                productTags: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("recurring_commit_ids")
                @ExcludeMissing
                recurringCommitIds: JsonField<List<String>> = JsonMissing.of(),
            ) : this(
                billingFrequency,
                commitIds,
                presentationGroupValues,
                pricingGroupValues,
                productId,
                productTags,
                recurringCommitIds,
                mutableMapOf(),
            )

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun billingFrequency(): Optional<BillingFrequency> =
                billingFrequency.getOptional("billing_frequency")

            /**
             * Can only be used for commit specific overrides. Must be used in conjunction with one
             * of `product_id`, `product_tags`, `pricing_group_values`, or
             * `presentation_group_values`. If provided, the override will only apply to the
             * specified commits. If not provided, the override will apply to all commits.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun commitIds(): Optional<List<String>> = commitIds.getOptional("commit_ids")

            /**
             * A map of group names to values. The override will only apply to line items with the
             * specified presentation group values.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun presentationGroupValues(): Optional<PresentationGroupValues> =
                presentationGroupValues.getOptional("presentation_group_values")

            /**
             * A map of pricing group names to values. The override will only apply to products with
             * the specified pricing group values.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun pricingGroupValues(): Optional<PricingGroupValues> =
                pricingGroupValues.getOptional("pricing_group_values")

            /**
             * If provided, the override will only apply to the product with the specified ID.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun productId(): Optional<String> = productId.getOptional("product_id")

            /**
             * If provided, the override will only apply to products with all the specified tags.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun productTags(): Optional<List<String>> = productTags.getOptional("product_tags")

            /**
             * Can only be used for commit specific overrides. Must be used in conjunction with one
             * of `product_id`, `product_tags`, `pricing_group_values`, or
             * `presentation_group_values`. If provided, the override will only apply to commits
             * created by the specified recurring commit ids.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun recurringCommitIds(): Optional<List<String>> =
                recurringCommitIds.getOptional("recurring_commit_ids")

            /**
             * Returns the raw JSON value of [billingFrequency].
             *
             * Unlike [billingFrequency], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("billing_frequency")
            @ExcludeMissing
            fun _billingFrequency(): JsonField<BillingFrequency> = billingFrequency

            /**
             * Returns the raw JSON value of [commitIds].
             *
             * Unlike [commitIds], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("commit_ids")
            @ExcludeMissing
            fun _commitIds(): JsonField<List<String>> = commitIds

            /**
             * Returns the raw JSON value of [presentationGroupValues].
             *
             * Unlike [presentationGroupValues], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("presentation_group_values")
            @ExcludeMissing
            fun _presentationGroupValues(): JsonField<PresentationGroupValues> =
                presentationGroupValues

            /**
             * Returns the raw JSON value of [pricingGroupValues].
             *
             * Unlike [pricingGroupValues], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("pricing_group_values")
            @ExcludeMissing
            fun _pricingGroupValues(): JsonField<PricingGroupValues> = pricingGroupValues

            /**
             * Returns the raw JSON value of [productId].
             *
             * Unlike [productId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("product_id")
            @ExcludeMissing
            fun _productId(): JsonField<String> = productId

            /**
             * Returns the raw JSON value of [productTags].
             *
             * Unlike [productTags], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("product_tags")
            @ExcludeMissing
            fun _productTags(): JsonField<List<String>> = productTags

            /**
             * Returns the raw JSON value of [recurringCommitIds].
             *
             * Unlike [recurringCommitIds], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("recurring_commit_ids")
            @ExcludeMissing
            fun _recurringCommitIds(): JsonField<List<String>> = recurringCommitIds

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [OverrideSpecifier].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [OverrideSpecifier]. */
            class Builder internal constructor() {

                private var billingFrequency: JsonField<BillingFrequency> = JsonMissing.of()
                private var commitIds: JsonField<MutableList<String>>? = null
                private var presentationGroupValues: JsonField<PresentationGroupValues> =
                    JsonMissing.of()
                private var pricingGroupValues: JsonField<PricingGroupValues> = JsonMissing.of()
                private var productId: JsonField<String> = JsonMissing.of()
                private var productTags: JsonField<MutableList<String>>? = null
                private var recurringCommitIds: JsonField<MutableList<String>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(overrideSpecifier: OverrideSpecifier) = apply {
                    billingFrequency = overrideSpecifier.billingFrequency
                    commitIds = overrideSpecifier.commitIds.map { it.toMutableList() }
                    presentationGroupValues = overrideSpecifier.presentationGroupValues
                    pricingGroupValues = overrideSpecifier.pricingGroupValues
                    productId = overrideSpecifier.productId
                    productTags = overrideSpecifier.productTags.map { it.toMutableList() }
                    recurringCommitIds =
                        overrideSpecifier.recurringCommitIds.map { it.toMutableList() }
                    additionalProperties = overrideSpecifier.additionalProperties.toMutableMap()
                }

                fun billingFrequency(billingFrequency: BillingFrequency) =
                    billingFrequency(JsonField.of(billingFrequency))

                /**
                 * Sets [Builder.billingFrequency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billingFrequency] with a well-typed
                 * [BillingFrequency] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun billingFrequency(billingFrequency: JsonField<BillingFrequency>) = apply {
                    this.billingFrequency = billingFrequency
                }

                /**
                 * Can only be used for commit specific overrides. Must be used in conjunction with
                 * one of `product_id`, `product_tags`, `pricing_group_values`, or
                 * `presentation_group_values`. If provided, the override will only apply to the
                 * specified commits. If not provided, the override will apply to all commits.
                 */
                fun commitIds(commitIds: List<String>) = commitIds(JsonField.of(commitIds))

                /**
                 * Sets [Builder.commitIds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.commitIds] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun commitIds(commitIds: JsonField<List<String>>) = apply {
                    this.commitIds = commitIds.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [commitIds].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addCommitId(commitId: String) = apply {
                    commitIds =
                        (commitIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("commitIds", it).add(commitId)
                        }
                }

                /**
                 * A map of group names to values. The override will only apply to line items with
                 * the specified presentation group values.
                 */
                fun presentationGroupValues(presentationGroupValues: PresentationGroupValues) =
                    presentationGroupValues(JsonField.of(presentationGroupValues))

                /**
                 * Sets [Builder.presentationGroupValues] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.presentationGroupValues] with a well-typed
                 * [PresentationGroupValues] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun presentationGroupValues(
                    presentationGroupValues: JsonField<PresentationGroupValues>
                ) = apply { this.presentationGroupValues = presentationGroupValues }

                /**
                 * A map of pricing group names to values. The override will only apply to products
                 * with the specified pricing group values.
                 */
                fun pricingGroupValues(pricingGroupValues: PricingGroupValues) =
                    pricingGroupValues(JsonField.of(pricingGroupValues))

                /**
                 * Sets [Builder.pricingGroupValues] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pricingGroupValues] with a well-typed
                 * [PricingGroupValues] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun pricingGroupValues(pricingGroupValues: JsonField<PricingGroupValues>) = apply {
                    this.pricingGroupValues = pricingGroupValues
                }

                /**
                 * If provided, the override will only apply to the product with the specified ID.
                 */
                fun productId(productId: String) = productId(JsonField.of(productId))

                /**
                 * Sets [Builder.productId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.productId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun productId(productId: JsonField<String>) = apply { this.productId = productId }

                /**
                 * If provided, the override will only apply to products with all the specified
                 * tags.
                 */
                fun productTags(productTags: List<String>) = productTags(JsonField.of(productTags))

                /**
                 * Sets [Builder.productTags] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.productTags] with a well-typed `List<String>`
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun productTags(productTags: JsonField<List<String>>) = apply {
                    this.productTags = productTags.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [productTags].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addProductTag(productTag: String) = apply {
                    productTags =
                        (productTags ?: JsonField.of(mutableListOf())).also {
                            checkKnown("productTags", it).add(productTag)
                        }
                }

                /**
                 * Can only be used for commit specific overrides. Must be used in conjunction with
                 * one of `product_id`, `product_tags`, `pricing_group_values`, or
                 * `presentation_group_values`. If provided, the override will only apply to commits
                 * created by the specified recurring commit ids.
                 */
                fun recurringCommitIds(recurringCommitIds: List<String>) =
                    recurringCommitIds(JsonField.of(recurringCommitIds))

                /**
                 * Sets [Builder.recurringCommitIds] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recurringCommitIds] with a well-typed
                 * `List<String>` value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun recurringCommitIds(recurringCommitIds: JsonField<List<String>>) = apply {
                    this.recurringCommitIds = recurringCommitIds.map { it.toMutableList() }
                }

                /**
                 * Adds a single [String] to [recurringCommitIds].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addRecurringCommitId(recurringCommitId: String) = apply {
                    recurringCommitIds =
                        (recurringCommitIds ?: JsonField.of(mutableListOf())).also {
                            checkKnown("recurringCommitIds", it).add(recurringCommitId)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [OverrideSpecifier].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): OverrideSpecifier =
                    OverrideSpecifier(
                        billingFrequency,
                        (commitIds ?: JsonMissing.of()).map { it.toImmutable() },
                        presentationGroupValues,
                        pricingGroupValues,
                        productId,
                        (productTags ?: JsonMissing.of()).map { it.toImmutable() },
                        (recurringCommitIds ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): OverrideSpecifier = apply {
                if (validated) {
                    return@apply
                }

                billingFrequency().ifPresent { it.validate() }
                commitIds()
                presentationGroupValues().ifPresent { it.validate() }
                pricingGroupValues().ifPresent { it.validate() }
                productId()
                productTags()
                recurringCommitIds()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (billingFrequency.asKnown().getOrNull()?.validity() ?: 0) +
                    (commitIds.asKnown().getOrNull()?.size ?: 0) +
                    (presentationGroupValues.asKnown().getOrNull()?.validity() ?: 0) +
                    (pricingGroupValues.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (productId.asKnown().isPresent) 1 else 0) +
                    (productTags.asKnown().getOrNull()?.size ?: 0) +
                    (recurringCommitIds.asKnown().getOrNull()?.size ?: 0)

            class BillingFrequency
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val MONTHLY = of("MONTHLY")

                    @JvmField val QUARTERLY = of("QUARTERLY")

                    @JvmField val ANNUAL = of("ANNUAL")

                    @JvmField val WEEKLY = of("WEEKLY")

                    @JvmStatic fun of(value: String) = BillingFrequency(JsonField.of(value))
                }

                /** An enum containing [BillingFrequency]'s known values. */
                enum class Known {
                    MONTHLY,
                    QUARTERLY,
                    ANNUAL,
                    WEEKLY,
                }

                /**
                 * An enum containing [BillingFrequency]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [BillingFrequency] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    MONTHLY,
                    QUARTERLY,
                    ANNUAL,
                    WEEKLY,
                    /**
                     * An enum member indicating that [BillingFrequency] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        MONTHLY -> Value.MONTHLY
                        QUARTERLY -> Value.QUARTERLY
                        ANNUAL -> Value.ANNUAL
                        WEEKLY -> Value.WEEKLY
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        MONTHLY -> Known.MONTHLY
                        QUARTERLY -> Known.QUARTERLY
                        ANNUAL -> Known.ANNUAL
                        WEEKLY -> Known.WEEKLY
                        else ->
                            throw MetronomeInvalidDataException("Unknown BillingFrequency: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        MetronomeInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): BillingFrequency = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is BillingFrequency && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * A map of group names to values. The override will only apply to line items with the
             * specified presentation group values.
             */
            class PresentationGroupValues
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [PresentationGroupValues].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PresentationGroupValues]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(presentationGroupValues: PresentationGroupValues) = apply {
                        additionalProperties =
                            presentationGroupValues.additionalProperties.toMutableMap()
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [PresentationGroupValues].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): PresentationGroupValues =
                        PresentationGroupValues(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): PresentationGroupValues = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PresentationGroupValues &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PresentationGroupValues{additionalProperties=$additionalProperties}"
            }

            /**
             * A map of pricing group names to values. The override will only apply to products with
             * the specified pricing group values.
             */
            class PricingGroupValues
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [PricingGroupValues].
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [PricingGroupValues]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(pricingGroupValues: PricingGroupValues) = apply {
                        additionalProperties =
                            pricingGroupValues.additionalProperties.toMutableMap()
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [PricingGroupValues].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): PricingGroupValues =
                        PricingGroupValues(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): PricingGroupValues = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PricingGroupValues &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PricingGroupValues{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is OverrideSpecifier &&
                    billingFrequency == other.billingFrequency &&
                    commitIds == other.commitIds &&
                    presentationGroupValues == other.presentationGroupValues &&
                    pricingGroupValues == other.pricingGroupValues &&
                    productId == other.productId &&
                    productTags == other.productTags &&
                    recurringCommitIds == other.recurringCommitIds &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    billingFrequency,
                    commitIds,
                    presentationGroupValues,
                    pricingGroupValues,
                    productId,
                    productTags,
                    recurringCommitIds,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OverrideSpecifier{billingFrequency=$billingFrequency, commitIds=$commitIds, presentationGroupValues=$presentationGroupValues, pricingGroupValues=$pricingGroupValues, productId=$productId, productTags=$productTags, recurringCommitIds=$recurringCommitIds, additionalProperties=$additionalProperties}"
        }

        /** Required for OVERWRITE type. */
        class OverwriteRate
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val rateType: JsonField<RateType>,
            private val creditTypeId: JsonField<String>,
            private val customRate: JsonField<CustomRate>,
            private val isProrated: JsonField<Boolean>,
            private val price: JsonField<Double>,
            private val quantity: JsonField<Double>,
            private val tiers: JsonField<List<Tier>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("rate_type")
                @ExcludeMissing
                rateType: JsonField<RateType> = JsonMissing.of(),
                @JsonProperty("credit_type_id")
                @ExcludeMissing
                creditTypeId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("custom_rate")
                @ExcludeMissing
                customRate: JsonField<CustomRate> = JsonMissing.of(),
                @JsonProperty("is_prorated")
                @ExcludeMissing
                isProrated: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("price") @ExcludeMissing price: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("quantity")
                @ExcludeMissing
                quantity: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("tiers")
                @ExcludeMissing
                tiers: JsonField<List<Tier>> = JsonMissing.of(),
            ) : this(
                rateType,
                creditTypeId,
                customRate,
                isProrated,
                price,
                quantity,
                tiers,
                mutableMapOf(),
            )

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun rateType(): RateType = rateType.getRequired("rate_type")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun creditTypeId(): Optional<String> = creditTypeId.getOptional("credit_type_id")

            /**
             * Only set for CUSTOM rate_type. This field is interpreted by custom rate processors.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun customRate(): Optional<CustomRate> = customRate.getOptional("custom_rate")

            /**
             * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be set
             * to true.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun isProrated(): Optional<Boolean> = isProrated.getOptional("is_prorated")

            /**
             * Default price. For FLAT rate_type, this must be >=0. For PERCENTAGE rate_type, this
             * is a decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun price(): Optional<Double> = price.getOptional("price")

            /**
             * Default quantity. For SUBSCRIPTION rate_type, this must be >=0.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun quantity(): Optional<Double> = quantity.getOptional("quantity")

            /**
             * Only set for TIERED rate_type.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun tiers(): Optional<List<Tier>> = tiers.getOptional("tiers")

            /**
             * Returns the raw JSON value of [rateType].
             *
             * Unlike [rateType], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("rate_type")
            @ExcludeMissing
            fun _rateType(): JsonField<RateType> = rateType

            /**
             * Returns the raw JSON value of [creditTypeId].
             *
             * Unlike [creditTypeId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("credit_type_id")
            @ExcludeMissing
            fun _creditTypeId(): JsonField<String> = creditTypeId

            /**
             * Returns the raw JSON value of [customRate].
             *
             * Unlike [customRate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("custom_rate")
            @ExcludeMissing
            fun _customRate(): JsonField<CustomRate> = customRate

            /**
             * Returns the raw JSON value of [isProrated].
             *
             * Unlike [isProrated], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("is_prorated")
            @ExcludeMissing
            fun _isProrated(): JsonField<Boolean> = isProrated

            /**
             * Returns the raw JSON value of [price].
             *
             * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Double> = price

            /**
             * Returns the raw JSON value of [quantity].
             *
             * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

            /**
             * Returns the raw JSON value of [tiers].
             *
             * Unlike [tiers], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tiers") @ExcludeMissing fun _tiers(): JsonField<List<Tier>> = tiers

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [OverwriteRate].
                 *
                 * The following fields are required:
                 * ```java
                 * .rateType()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [OverwriteRate]. */
            class Builder internal constructor() {

                private var rateType: JsonField<RateType>? = null
                private var creditTypeId: JsonField<String> = JsonMissing.of()
                private var customRate: JsonField<CustomRate> = JsonMissing.of()
                private var isProrated: JsonField<Boolean> = JsonMissing.of()
                private var price: JsonField<Double> = JsonMissing.of()
                private var quantity: JsonField<Double> = JsonMissing.of()
                private var tiers: JsonField<MutableList<Tier>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(overwriteRate: OverwriteRate) = apply {
                    rateType = overwriteRate.rateType
                    creditTypeId = overwriteRate.creditTypeId
                    customRate = overwriteRate.customRate
                    isProrated = overwriteRate.isProrated
                    price = overwriteRate.price
                    quantity = overwriteRate.quantity
                    tiers = overwriteRate.tiers.map { it.toMutableList() }
                    additionalProperties = overwriteRate.additionalProperties.toMutableMap()
                }

                fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

                /**
                 * Sets [Builder.rateType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.rateType] with a well-typed [RateType] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun rateType(rateType: JsonField<RateType>) = apply { this.rateType = rateType }

                fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

                /**
                 * Sets [Builder.creditTypeId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.creditTypeId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun creditTypeId(creditTypeId: JsonField<String>) = apply {
                    this.creditTypeId = creditTypeId
                }

                /**
                 * Only set for CUSTOM rate_type. This field is interpreted by custom rate
                 * processors.
                 */
                fun customRate(customRate: CustomRate) = customRate(JsonField.of(customRate))

                /**
                 * Sets [Builder.customRate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.customRate] with a well-typed [CustomRate] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun customRate(customRate: JsonField<CustomRate>) = apply {
                    this.customRate = customRate
                }

                /**
                 * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be
                 * set to true.
                 */
                fun isProrated(isProrated: Boolean) = isProrated(JsonField.of(isProrated))

                /**
                 * Sets [Builder.isProrated] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.isProrated] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun isProrated(isProrated: JsonField<Boolean>) = apply {
                    this.isProrated = isProrated
                }

                /**
                 * Default price. For FLAT rate_type, this must be >=0. For PERCENTAGE rate_type,
                 * this is a decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
                 */
                fun price(price: Double) = price(JsonField.of(price))

                /**
                 * Sets [Builder.price] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.price] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun price(price: JsonField<Double>) = apply { this.price = price }

                /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
                fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                /**
                 * Sets [Builder.quantity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.quantity] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                /** Only set for TIERED rate_type. */
                fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

                /**
                 * Sets [Builder.tiers] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tiers] with a well-typed `List<Tier>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tiers(tiers: JsonField<List<Tier>>) = apply {
                    this.tiers = tiers.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Tier] to [tiers].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addTier(tier: Tier) = apply {
                    tiers =
                        (tiers ?: JsonField.of(mutableListOf())).also {
                            checkKnown("tiers", it).add(tier)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [OverwriteRate].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .rateType()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): OverwriteRate =
                    OverwriteRate(
                        checkRequired("rateType", rateType),
                        creditTypeId,
                        customRate,
                        isProrated,
                        price,
                        quantity,
                        (tiers ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): OverwriteRate = apply {
                if (validated) {
                    return@apply
                }

                rateType().validate()
                creditTypeId()
                customRate().ifPresent { it.validate() }
                isProrated()
                price()
                quantity()
                tiers().ifPresent { it.forEach { it.validate() } }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (rateType.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (creditTypeId.asKnown().isPresent) 1 else 0) +
                    (customRate.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (isProrated.asKnown().isPresent) 1 else 0) +
                    (if (price.asKnown().isPresent) 1 else 0) +
                    (if (quantity.asKnown().isPresent) 1 else 0) +
                    (tiers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            class RateType @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val FLAT = of("FLAT")

                    @JvmField val PERCENTAGE = of("PERCENTAGE")

                    @JvmField val SUBSCRIPTION = of("SUBSCRIPTION")

                    @JvmField val TIERED = of("TIERED")

                    @JvmField val TIERED_PERCENTAGE = of("TIERED_PERCENTAGE")

                    @JvmField val CUSTOM = of("CUSTOM")

                    @JvmStatic fun of(value: String) = RateType(JsonField.of(value))
                }

                /** An enum containing [RateType]'s known values. */
                enum class Known {
                    FLAT,
                    PERCENTAGE,
                    SUBSCRIPTION,
                    TIERED,
                    TIERED_PERCENTAGE,
                    CUSTOM,
                }

                /**
                 * An enum containing [RateType]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [RateType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    FLAT,
                    PERCENTAGE,
                    SUBSCRIPTION,
                    TIERED,
                    TIERED_PERCENTAGE,
                    CUSTOM,
                    /**
                     * An enum member indicating that [RateType] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        FLAT -> Value.FLAT
                        PERCENTAGE -> Value.PERCENTAGE
                        SUBSCRIPTION -> Value.SUBSCRIPTION
                        TIERED -> Value.TIERED
                        TIERED_PERCENTAGE -> Value.TIERED_PERCENTAGE
                        CUSTOM -> Value.CUSTOM
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        FLAT -> Known.FLAT
                        PERCENTAGE -> Known.PERCENTAGE
                        SUBSCRIPTION -> Known.SUBSCRIPTION
                        TIERED -> Known.TIERED
                        TIERED_PERCENTAGE -> Known.TIERED_PERCENTAGE
                        CUSTOM -> Known.CUSTOM
                        else -> throw MetronomeInvalidDataException("Unknown RateType: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        MetronomeInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): RateType = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is RateType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * Only set for CUSTOM rate_type. This field is interpreted by custom rate processors.
             */
            class CustomRate
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [CustomRate]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [CustomRate]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(customRate: CustomRate) = apply {
                        additionalProperties = customRate.additionalProperties.toMutableMap()
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [CustomRate].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): CustomRate = CustomRate(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): CustomRate = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CustomRate && additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "CustomRate{additionalProperties=$additionalProperties}"
            }

            class Tier
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val price: JsonField<Double>,
                private val size: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("price")
                    @ExcludeMissing
                    price: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("size") @ExcludeMissing size: JsonField<Double> = JsonMissing.of(),
                ) : this(price, size, mutableMapOf())

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun price(): Double = price.getRequired("price")

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun size(): Optional<Double> = size.getOptional("size")

                /**
                 * Returns the raw JSON value of [price].
                 *
                 * Unlike [price], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Double> = price

                /**
                 * Returns the raw JSON value of [size].
                 *
                 * Unlike [size], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("size") @ExcludeMissing fun _size(): JsonField<Double> = size

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Tier].
                     *
                     * The following fields are required:
                     * ```java
                     * .price()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Tier]. */
                class Builder internal constructor() {

                    private var price: JsonField<Double>? = null
                    private var size: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(tier: Tier) = apply {
                        price = tier.price
                        size = tier.size
                        additionalProperties = tier.additionalProperties.toMutableMap()
                    }

                    fun price(price: Double) = price(JsonField.of(price))

                    /**
                     * Sets [Builder.price] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.price] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun price(price: JsonField<Double>) = apply { this.price = price }

                    fun size(size: Double) = size(JsonField.of(size))

                    /**
                     * Sets [Builder.size] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.size] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun size(size: JsonField<Double>) = apply { this.size = size }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Tier].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .price()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Tier =
                        Tier(
                            checkRequired("price", price),
                            size,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Tier = apply {
                    if (validated) {
                        return@apply
                    }

                    price()
                    size()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (price.asKnown().isPresent) 1 else 0) +
                        (if (size.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Tier &&
                        price == other.price &&
                        size == other.size &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(price, size, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Tier{price=$price, size=$size, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is OverwriteRate &&
                    rateType == other.rateType &&
                    creditTypeId == other.creditTypeId &&
                    customRate == other.customRate &&
                    isProrated == other.isProrated &&
                    price == other.price &&
                    quantity == other.quantity &&
                    tiers == other.tiers &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    rateType,
                    creditTypeId,
                    customRate,
                    isProrated,
                    price,
                    quantity,
                    tiers,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OverwriteRate{rateType=$rateType, creditTypeId=$creditTypeId, customRate=$customRate, isProrated=$isProrated, price=$price, quantity=$quantity, tiers=$tiers, additionalProperties=$additionalProperties}"
        }

        /**
         * Indicates whether the override applies to commit rates or list rates. Can only be used
         * for overrides that have `is_commit_specific` set to `true`. Defaults to `"LIST_RATE"`.
         */
        class Target @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val COMMIT_RATE = of("COMMIT_RATE")

                @JvmField val LIST_RATE = of("LIST_RATE")

                @JvmStatic fun of(value: String) = Target(JsonField.of(value))
            }

            /** An enum containing [Target]'s known values. */
            enum class Known {
                COMMIT_RATE,
                LIST_RATE,
            }

            /**
             * An enum containing [Target]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Target] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                COMMIT_RATE,
                LIST_RATE,
                /**
                 * An enum member indicating that [Target] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    COMMIT_RATE -> Value.COMMIT_RATE
                    LIST_RATE -> Value.LIST_RATE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    COMMIT_RATE -> Known.COMMIT_RATE
                    LIST_RATE -> Known.LIST_RATE
                    else -> throw MetronomeInvalidDataException("Unknown Target: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Target = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Target && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class Tier
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val multiplier: JsonField<Double>,
            private val size: JsonField<Double>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("multiplier")
                @ExcludeMissing
                multiplier: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("size") @ExcludeMissing size: JsonField<Double> = JsonMissing.of(),
            ) : this(multiplier, size, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun multiplier(): Double = multiplier.getRequired("multiplier")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun size(): Optional<Double> = size.getOptional("size")

            /**
             * Returns the raw JSON value of [multiplier].
             *
             * Unlike [multiplier], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("multiplier")
            @ExcludeMissing
            fun _multiplier(): JsonField<Double> = multiplier

            /**
             * Returns the raw JSON value of [size].
             *
             * Unlike [size], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("size") @ExcludeMissing fun _size(): JsonField<Double> = size

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Tier].
                 *
                 * The following fields are required:
                 * ```java
                 * .multiplier()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Tier]. */
            class Builder internal constructor() {

                private var multiplier: JsonField<Double>? = null
                private var size: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(tier: Tier) = apply {
                    multiplier = tier.multiplier
                    size = tier.size
                    additionalProperties = tier.additionalProperties.toMutableMap()
                }

                fun multiplier(multiplier: Double) = multiplier(JsonField.of(multiplier))

                /**
                 * Sets [Builder.multiplier] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.multiplier] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun multiplier(multiplier: JsonField<Double>) = apply {
                    this.multiplier = multiplier
                }

                fun size(size: Double) = size(JsonField.of(size))

                /**
                 * Sets [Builder.size] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.size] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun size(size: JsonField<Double>) = apply { this.size = size }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Tier].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .multiplier()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Tier =
                    Tier(
                        checkRequired("multiplier", multiplier),
                        size,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Tier = apply {
                if (validated) {
                    return@apply
                }

                multiplier()
                size()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (multiplier.asKnown().isPresent) 1 else 0) +
                    (if (size.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Tier &&
                    multiplier == other.multiplier &&
                    size == other.size &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(multiplier, size, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Tier{multiplier=$multiplier, size=$size, additionalProperties=$additionalProperties}"
        }

        /** Overwrites are prioritized over multipliers and tiered overrides. */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val OVERWRITE = of("OVERWRITE")

                @JvmField val MULTIPLIER = of("MULTIPLIER")

                @JvmField val TIERED = of("TIERED")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                OVERWRITE,
                MULTIPLIER,
                TIERED,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                OVERWRITE,
                MULTIPLIER,
                TIERED,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    OVERWRITE -> Value.OVERWRITE
                    MULTIPLIER -> Value.MULTIPLIER
                    TIERED -> Value.TIERED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    OVERWRITE -> Known.OVERWRITE
                    MULTIPLIER -> Known.MULTIPLIER
                    TIERED -> Known.TIERED
                    else -> throw MetronomeInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Type = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Override &&
                startingAt == other.startingAt &&
                applicableProductTags == other.applicableProductTags &&
                endingBefore == other.endingBefore &&
                entitled == other.entitled &&
                isCommitSpecific == other.isCommitSpecific &&
                multiplier == other.multiplier &&
                overrideSpecifiers == other.overrideSpecifiers &&
                overwriteRate == other.overwriteRate &&
                priority == other.priority &&
                productId == other.productId &&
                target == other.target &&
                tiers == other.tiers &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                startingAt,
                applicableProductTags,
                endingBefore,
                entitled,
                isCommitSpecific,
                multiplier,
                overrideSpecifiers,
                overwriteRate,
                priority,
                productId,
                target,
                tiers,
                type,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Override{startingAt=$startingAt, applicableProductTags=$applicableProductTags, endingBefore=$endingBefore, entitled=$entitled, isCommitSpecific=$isCommitSpecific, multiplier=$multiplier, overrideSpecifiers=$overrideSpecifiers, overwriteRate=$overwriteRate, priority=$priority, productId=$productId, target=$target, tiers=$tiers, type=$type, additionalProperties=$additionalProperties}"
    }

    class ProfessionalService
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val maxAmount: JsonField<Double>,
        private val productId: JsonField<String>,
        private val quantity: JsonField<Double>,
        private val unitPrice: JsonField<Double>,
        private val customFields: JsonField<CustomFields>,
        private val description: JsonField<String>,
        private val netsuiteSalesOrderId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("max_amount")
            @ExcludeMissing
            maxAmount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("product_id")
            @ExcludeMissing
            productId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quantity")
            @ExcludeMissing
            quantity: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("unit_price")
            @ExcludeMissing
            unitPrice: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("custom_fields")
            @ExcludeMissing
            customFields: JsonField<CustomFields> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("netsuite_sales_order_id")
            @ExcludeMissing
            netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
        ) : this(
            maxAmount,
            productId,
            quantity,
            unitPrice,
            customFields,
            description,
            netsuiteSalesOrderId,
            mutableMapOf(),
        )

        /**
         * Maximum amount for the term.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun maxAmount(): Double = maxAmount.getRequired("max_amount")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun productId(): String = productId.getRequired("product_id")

        /**
         * Quantity for the charge. Will be multiplied by unit_price to determine the amount.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun quantity(): Double = quantity.getRequired("quantity")

        /**
         * Unit price for the charge. Will be multiplied by quantity to determine the amount and
         * must be specified.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun unitPrice(): Double = unitPrice.getRequired("unit_price")

        /**
         * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun customFields(): Optional<CustomFields> = customFields.getOptional("custom_fields")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun description(): Optional<String> = description.getOptional("description")

        /**
         * This field's availability is dependent on your client's configuration.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun netsuiteSalesOrderId(): Optional<String> =
            netsuiteSalesOrderId.getOptional("netsuite_sales_order_id")

        /**
         * Returns the raw JSON value of [maxAmount].
         *
         * Unlike [maxAmount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_amount") @ExcludeMissing fun _maxAmount(): JsonField<Double> = maxAmount

        /**
         * Returns the raw JSON value of [productId].
         *
         * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

        /**
         * Returns the raw JSON value of [quantity].
         *
         * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

        /**
         * Returns the raw JSON value of [unitPrice].
         *
         * Unlike [unitPrice], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("unit_price") @ExcludeMissing fun _unitPrice(): JsonField<Double> = unitPrice

        /**
         * Returns the raw JSON value of [customFields].
         *
         * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

        /**
         * Returns the raw JSON value of [description].
         *
         * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /**
         * Returns the raw JSON value of [netsuiteSalesOrderId].
         *
         * Unlike [netsuiteSalesOrderId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        fun _netsuiteSalesOrderId(): JsonField<String> = netsuiteSalesOrderId

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [ProfessionalService].
             *
             * The following fields are required:
             * ```java
             * .maxAmount()
             * .productId()
             * .quantity()
             * .unitPrice()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ProfessionalService]. */
        class Builder internal constructor() {

            private var maxAmount: JsonField<Double>? = null
            private var productId: JsonField<String>? = null
            private var quantity: JsonField<Double>? = null
            private var unitPrice: JsonField<Double>? = null
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(professionalService: ProfessionalService) = apply {
                maxAmount = professionalService.maxAmount
                productId = professionalService.productId
                quantity = professionalService.quantity
                unitPrice = professionalService.unitPrice
                customFields = professionalService.customFields
                description = professionalService.description
                netsuiteSalesOrderId = professionalService.netsuiteSalesOrderId
                additionalProperties = professionalService.additionalProperties.toMutableMap()
            }

            /** Maximum amount for the term. */
            fun maxAmount(maxAmount: Double) = maxAmount(JsonField.of(maxAmount))

            /**
             * Sets [Builder.maxAmount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxAmount] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxAmount(maxAmount: JsonField<Double>) = apply { this.maxAmount = maxAmount }

            fun productId(productId: String) = productId(JsonField.of(productId))

            /**
             * Sets [Builder.productId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            /**
             * Quantity for the charge. Will be multiplied by unit_price to determine the amount.
             */
            fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

            /**
             * Sets [Builder.quantity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quantity] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

            /**
             * Unit price for the charge. Will be multiplied by quantity to determine the amount and
             * must be specified.
             */
            fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

            /**
             * Sets [Builder.unitPrice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unitPrice] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun unitPrice(unitPrice: JsonField<Double>) = apply { this.unitPrice = unitPrice }

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

            /**
             * Sets [Builder.customFields] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customFields] with a well-typed [CustomFields] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customFields(customFields: JsonField<CustomFields>) = apply {
                this.customFields = customFields
            }

            fun description(description: String) = description(JsonField.of(description))

            /**
             * Sets [Builder.description] to an arbitrary JSON value.
             *
             * You should usually call [Builder.description] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
                netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

            /**
             * Sets [Builder.netsuiteSalesOrderId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.netsuiteSalesOrderId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
                this.netsuiteSalesOrderId = netsuiteSalesOrderId
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [ProfessionalService].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .maxAmount()
             * .productId()
             * .quantity()
             * .unitPrice()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ProfessionalService =
                ProfessionalService(
                    checkRequired("maxAmount", maxAmount),
                    checkRequired("productId", productId),
                    checkRequired("quantity", quantity),
                    checkRequired("unitPrice", unitPrice),
                    customFields,
                    description,
                    netsuiteSalesOrderId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): ProfessionalService = apply {
            if (validated) {
                return@apply
            }

            maxAmount()
            productId()
            quantity()
            unitPrice()
            customFields().ifPresent { it.validate() }
            description()
            netsuiteSalesOrderId()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (maxAmount.asKnown().isPresent) 1 else 0) +
                (if (productId.asKnown().isPresent) 1 else 0) +
                (if (quantity.asKnown().isPresent) 1 else 0) +
                (if (unitPrice.asKnown().isPresent) 1 else 0) +
                (customFields.asKnown().getOrNull()?.validity() ?: 0) +
                (if (description.asKnown().isPresent) 1 else 0) +
                (if (netsuiteSalesOrderId.asKnown().isPresent) 1 else 0)

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        class CustomFields
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [CustomFields]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CustomFields]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(customFields: CustomFields) = apply {
                    additionalProperties = customFields.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [CustomFields].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): CustomFields = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CustomFields && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ProfessionalService &&
                maxAmount == other.maxAmount &&
                productId == other.productId &&
                quantity == other.quantity &&
                unitPrice == other.unitPrice &&
                customFields == other.customFields &&
                description == other.description &&
                netsuiteSalesOrderId == other.netsuiteSalesOrderId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                maxAmount,
                productId,
                quantity,
                unitPrice,
                customFields,
                description,
                netsuiteSalesOrderId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ProfessionalService{maxAmount=$maxAmount, productId=$productId, quantity=$quantity, unitPrice=$unitPrice, customFields=$customFields, description=$description, netsuiteSalesOrderId=$netsuiteSalesOrderId, additionalProperties=$additionalProperties}"
    }

    class ResellerRoyalty
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val resellerType: JsonField<ResellerType>,
        private val applicableProductIds: JsonField<List<String>>,
        private val applicableProductTags: JsonField<List<String>>,
        private val awsOptions: JsonField<AwsOptions>,
        private val endingBefore: JsonField<OffsetDateTime>,
        private val fraction: JsonField<Double>,
        private val gcpOptions: JsonField<GcpOptions>,
        private val netsuiteResellerId: JsonField<String>,
        private val resellerContractValue: JsonField<Double>,
        private val startingAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("reseller_type")
            @ExcludeMissing
            resellerType: JsonField<ResellerType> = JsonMissing.of(),
            @JsonProperty("applicable_product_ids")
            @ExcludeMissing
            applicableProductIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("applicable_product_tags")
            @ExcludeMissing
            applicableProductTags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("aws_options")
            @ExcludeMissing
            awsOptions: JsonField<AwsOptions> = JsonMissing.of(),
            @JsonProperty("ending_before")
            @ExcludeMissing
            endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("fraction")
            @ExcludeMissing
            fraction: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("gcp_options")
            @ExcludeMissing
            gcpOptions: JsonField<GcpOptions> = JsonMissing.of(),
            @JsonProperty("netsuite_reseller_id")
            @ExcludeMissing
            netsuiteResellerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reseller_contract_value")
            @ExcludeMissing
            resellerContractValue: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("starting_at")
            @ExcludeMissing
            startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(
            resellerType,
            applicableProductIds,
            applicableProductTags,
            awsOptions,
            endingBefore,
            fraction,
            gcpOptions,
            netsuiteResellerId,
            resellerContractValue,
            startingAt,
            mutableMapOf(),
        )

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun resellerType(): ResellerType = resellerType.getRequired("reseller_type")

        /**
         * Must provide at least one of applicable_product_ids or applicable_product_tags.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun applicableProductIds(): Optional<List<String>> =
            applicableProductIds.getOptional("applicable_product_ids")

        /**
         * Must provide at least one of applicable_product_ids or applicable_product_tags.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun applicableProductTags(): Optional<List<String>> =
            applicableProductTags.getOptional("applicable_product_tags")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun awsOptions(): Optional<AwsOptions> = awsOptions.getOptional("aws_options")

        /**
         * Use null to indicate that the existing end timestamp should be removed.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun endingBefore(): Optional<OffsetDateTime> = endingBefore.getOptional("ending_before")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun fraction(): Optional<Double> = fraction.getOptional("fraction")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun gcpOptions(): Optional<GcpOptions> = gcpOptions.getOptional("gcp_options")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun netsuiteResellerId(): Optional<String> =
            netsuiteResellerId.getOptional("netsuite_reseller_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun resellerContractValue(): Optional<Double> =
            resellerContractValue.getOptional("reseller_contract_value")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun startingAt(): Optional<OffsetDateTime> = startingAt.getOptional("starting_at")

        /**
         * Returns the raw JSON value of [resellerType].
         *
         * Unlike [resellerType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("reseller_type")
        @ExcludeMissing
        fun _resellerType(): JsonField<ResellerType> = resellerType

        /**
         * Returns the raw JSON value of [applicableProductIds].
         *
         * Unlike [applicableProductIds], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("applicable_product_ids")
        @ExcludeMissing
        fun _applicableProductIds(): JsonField<List<String>> = applicableProductIds

        /**
         * Returns the raw JSON value of [applicableProductTags].
         *
         * Unlike [applicableProductTags], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        fun _applicableProductTags(): JsonField<List<String>> = applicableProductTags

        /**
         * Returns the raw JSON value of [awsOptions].
         *
         * Unlike [awsOptions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("aws_options")
        @ExcludeMissing
        fun _awsOptions(): JsonField<AwsOptions> = awsOptions

        /**
         * Returns the raw JSON value of [endingBefore].
         *
         * Unlike [endingBefore], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ending_before")
        @ExcludeMissing
        fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

        /**
         * Returns the raw JSON value of [fraction].
         *
         * Unlike [fraction], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fraction") @ExcludeMissing fun _fraction(): JsonField<Double> = fraction

        /**
         * Returns the raw JSON value of [gcpOptions].
         *
         * Unlike [gcpOptions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("gcp_options")
        @ExcludeMissing
        fun _gcpOptions(): JsonField<GcpOptions> = gcpOptions

        /**
         * Returns the raw JSON value of [netsuiteResellerId].
         *
         * Unlike [netsuiteResellerId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("netsuite_reseller_id")
        @ExcludeMissing
        fun _netsuiteResellerId(): JsonField<String> = netsuiteResellerId

        /**
         * Returns the raw JSON value of [resellerContractValue].
         *
         * Unlike [resellerContractValue], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("reseller_contract_value")
        @ExcludeMissing
        fun _resellerContractValue(): JsonField<Double> = resellerContractValue

        /**
         * Returns the raw JSON value of [startingAt].
         *
         * Unlike [startingAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("starting_at")
        @ExcludeMissing
        fun _startingAt(): JsonField<OffsetDateTime> = startingAt

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [ResellerRoyalty].
             *
             * The following fields are required:
             * ```java
             * .resellerType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ResellerRoyalty]. */
        class Builder internal constructor() {

            private var resellerType: JsonField<ResellerType>? = null
            private var applicableProductIds: JsonField<MutableList<String>>? = null
            private var applicableProductTags: JsonField<MutableList<String>>? = null
            private var awsOptions: JsonField<AwsOptions> = JsonMissing.of()
            private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var fraction: JsonField<Double> = JsonMissing.of()
            private var gcpOptions: JsonField<GcpOptions> = JsonMissing.of()
            private var netsuiteResellerId: JsonField<String> = JsonMissing.of()
            private var resellerContractValue: JsonField<Double> = JsonMissing.of()
            private var startingAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(resellerRoyalty: ResellerRoyalty) = apply {
                resellerType = resellerRoyalty.resellerType
                applicableProductIds =
                    resellerRoyalty.applicableProductIds.map { it.toMutableList() }
                applicableProductTags =
                    resellerRoyalty.applicableProductTags.map { it.toMutableList() }
                awsOptions = resellerRoyalty.awsOptions
                endingBefore = resellerRoyalty.endingBefore
                fraction = resellerRoyalty.fraction
                gcpOptions = resellerRoyalty.gcpOptions
                netsuiteResellerId = resellerRoyalty.netsuiteResellerId
                resellerContractValue = resellerRoyalty.resellerContractValue
                startingAt = resellerRoyalty.startingAt
                additionalProperties = resellerRoyalty.additionalProperties.toMutableMap()
            }

            fun resellerType(resellerType: ResellerType) = resellerType(JsonField.of(resellerType))

            /**
             * Sets [Builder.resellerType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resellerType] with a well-typed [ResellerType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun resellerType(resellerType: JsonField<ResellerType>) = apply {
                this.resellerType = resellerType
            }

            /** Must provide at least one of applicable_product_ids or applicable_product_tags. */
            fun applicableProductIds(applicableProductIds: List<String>) =
                applicableProductIds(JsonField.of(applicableProductIds))

            /**
             * Sets [Builder.applicableProductIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.applicableProductIds] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun applicableProductIds(applicableProductIds: JsonField<List<String>>) = apply {
                this.applicableProductIds = applicableProductIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [applicableProductIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addApplicableProductId(applicableProductId: String) = apply {
                applicableProductIds =
                    (applicableProductIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("applicableProductIds", it).add(applicableProductId)
                    }
            }

            /** Must provide at least one of applicable_product_ids or applicable_product_tags. */
            fun applicableProductTags(applicableProductTags: List<String>) =
                applicableProductTags(JsonField.of(applicableProductTags))

            /**
             * Sets [Builder.applicableProductTags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.applicableProductTags] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
                this.applicableProductTags = applicableProductTags.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [applicableProductTags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addApplicableProductTag(applicableProductTag: String) = apply {
                applicableProductTags =
                    (applicableProductTags ?: JsonField.of(mutableListOf())).also {
                        checkKnown("applicableProductTags", it).add(applicableProductTag)
                    }
            }

            fun awsOptions(awsOptions: AwsOptions) = awsOptions(JsonField.of(awsOptions))

            /**
             * Sets [Builder.awsOptions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.awsOptions] with a well-typed [AwsOptions] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun awsOptions(awsOptions: JsonField<AwsOptions>) = apply {
                this.awsOptions = awsOptions
            }

            /** Use null to indicate that the existing end timestamp should be removed. */
            fun endingBefore(endingBefore: OffsetDateTime?) =
                endingBefore(JsonField.ofNullable(endingBefore))

            /** Alias for calling [Builder.endingBefore] with `endingBefore.orElse(null)`. */
            fun endingBefore(endingBefore: Optional<OffsetDateTime>) =
                endingBefore(endingBefore.getOrNull())

            /**
             * Sets [Builder.endingBefore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endingBefore] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                this.endingBefore = endingBefore
            }

            fun fraction(fraction: Double) = fraction(JsonField.of(fraction))

            /**
             * Sets [Builder.fraction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fraction] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fraction(fraction: JsonField<Double>) = apply { this.fraction = fraction }

            fun gcpOptions(gcpOptions: GcpOptions) = gcpOptions(JsonField.of(gcpOptions))

            /**
             * Sets [Builder.gcpOptions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gcpOptions] with a well-typed [GcpOptions] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun gcpOptions(gcpOptions: JsonField<GcpOptions>) = apply {
                this.gcpOptions = gcpOptions
            }

            fun netsuiteResellerId(netsuiteResellerId: String) =
                netsuiteResellerId(JsonField.of(netsuiteResellerId))

            /**
             * Sets [Builder.netsuiteResellerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.netsuiteResellerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun netsuiteResellerId(netsuiteResellerId: JsonField<String>) = apply {
                this.netsuiteResellerId = netsuiteResellerId
            }

            fun resellerContractValue(resellerContractValue: Double) =
                resellerContractValue(JsonField.of(resellerContractValue))

            /**
             * Sets [Builder.resellerContractValue] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resellerContractValue] with a well-typed [Double]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun resellerContractValue(resellerContractValue: JsonField<Double>) = apply {
                this.resellerContractValue = resellerContractValue
            }

            fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

            /**
             * Sets [Builder.startingAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startingAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                this.startingAt = startingAt
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [ResellerRoyalty].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .resellerType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ResellerRoyalty =
                ResellerRoyalty(
                    checkRequired("resellerType", resellerType),
                    (applicableProductIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (applicableProductTags ?: JsonMissing.of()).map { it.toImmutable() },
                    awsOptions,
                    endingBefore,
                    fraction,
                    gcpOptions,
                    netsuiteResellerId,
                    resellerContractValue,
                    startingAt,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): ResellerRoyalty = apply {
            if (validated) {
                return@apply
            }

            resellerType().validate()
            applicableProductIds()
            applicableProductTags()
            awsOptions().ifPresent { it.validate() }
            endingBefore()
            fraction()
            gcpOptions().ifPresent { it.validate() }
            netsuiteResellerId()
            resellerContractValue()
            startingAt()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (resellerType.asKnown().getOrNull()?.validity() ?: 0) +
                (applicableProductIds.asKnown().getOrNull()?.size ?: 0) +
                (applicableProductTags.asKnown().getOrNull()?.size ?: 0) +
                (awsOptions.asKnown().getOrNull()?.validity() ?: 0) +
                (if (endingBefore.asKnown().isPresent) 1 else 0) +
                (if (fraction.asKnown().isPresent) 1 else 0) +
                (gcpOptions.asKnown().getOrNull()?.validity() ?: 0) +
                (if (netsuiteResellerId.asKnown().isPresent) 1 else 0) +
                (if (resellerContractValue.asKnown().isPresent) 1 else 0) +
                (if (startingAt.asKnown().isPresent) 1 else 0)

        class ResellerType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val AWS = of("AWS")

                @JvmField val AWS_PRO_SERVICE = of("AWS_PRO_SERVICE")

                @JvmField val GCP = of("GCP")

                @JvmField val GCP_PRO_SERVICE = of("GCP_PRO_SERVICE")

                @JvmStatic fun of(value: String) = ResellerType(JsonField.of(value))
            }

            /** An enum containing [ResellerType]'s known values. */
            enum class Known {
                AWS,
                AWS_PRO_SERVICE,
                GCP,
                GCP_PRO_SERVICE,
            }

            /**
             * An enum containing [ResellerType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ResellerType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AWS,
                AWS_PRO_SERVICE,
                GCP,
                GCP_PRO_SERVICE,
                /**
                 * An enum member indicating that [ResellerType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    AWS -> Value.AWS
                    AWS_PRO_SERVICE -> Value.AWS_PRO_SERVICE
                    GCP -> Value.GCP
                    GCP_PRO_SERVICE -> Value.GCP_PRO_SERVICE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    AWS -> Known.AWS
                    AWS_PRO_SERVICE -> Known.AWS_PRO_SERVICE
                    GCP -> Known.GCP
                    GCP_PRO_SERVICE -> Known.GCP_PRO_SERVICE
                    else -> throw MetronomeInvalidDataException("Unknown ResellerType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): ResellerType = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ResellerType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class AwsOptions
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val awsAccountNumber: JsonField<String>,
            private val awsOfferId: JsonField<String>,
            private val awsPayerReferenceId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("aws_account_number")
                @ExcludeMissing
                awsAccountNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("aws_offer_id")
                @ExcludeMissing
                awsOfferId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("aws_payer_reference_id")
                @ExcludeMissing
                awsPayerReferenceId: JsonField<String> = JsonMissing.of(),
            ) : this(awsAccountNumber, awsOfferId, awsPayerReferenceId, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun awsAccountNumber(): Optional<String> =
                awsAccountNumber.getOptional("aws_account_number")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun awsOfferId(): Optional<String> = awsOfferId.getOptional("aws_offer_id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun awsPayerReferenceId(): Optional<String> =
                awsPayerReferenceId.getOptional("aws_payer_reference_id")

            /**
             * Returns the raw JSON value of [awsAccountNumber].
             *
             * Unlike [awsAccountNumber], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("aws_account_number")
            @ExcludeMissing
            fun _awsAccountNumber(): JsonField<String> = awsAccountNumber

            /**
             * Returns the raw JSON value of [awsOfferId].
             *
             * Unlike [awsOfferId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("aws_offer_id")
            @ExcludeMissing
            fun _awsOfferId(): JsonField<String> = awsOfferId

            /**
             * Returns the raw JSON value of [awsPayerReferenceId].
             *
             * Unlike [awsPayerReferenceId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("aws_payer_reference_id")
            @ExcludeMissing
            fun _awsPayerReferenceId(): JsonField<String> = awsPayerReferenceId

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [AwsOptions]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AwsOptions]. */
            class Builder internal constructor() {

                private var awsAccountNumber: JsonField<String> = JsonMissing.of()
                private var awsOfferId: JsonField<String> = JsonMissing.of()
                private var awsPayerReferenceId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(awsOptions: AwsOptions) = apply {
                    awsAccountNumber = awsOptions.awsAccountNumber
                    awsOfferId = awsOptions.awsOfferId
                    awsPayerReferenceId = awsOptions.awsPayerReferenceId
                    additionalProperties = awsOptions.additionalProperties.toMutableMap()
                }

                fun awsAccountNumber(awsAccountNumber: String) =
                    awsAccountNumber(JsonField.of(awsAccountNumber))

                /**
                 * Sets [Builder.awsAccountNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.awsAccountNumber] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun awsAccountNumber(awsAccountNumber: JsonField<String>) = apply {
                    this.awsAccountNumber = awsAccountNumber
                }

                fun awsOfferId(awsOfferId: String) = awsOfferId(JsonField.of(awsOfferId))

                /**
                 * Sets [Builder.awsOfferId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.awsOfferId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun awsOfferId(awsOfferId: JsonField<String>) = apply {
                    this.awsOfferId = awsOfferId
                }

                fun awsPayerReferenceId(awsPayerReferenceId: String) =
                    awsPayerReferenceId(JsonField.of(awsPayerReferenceId))

                /**
                 * Sets [Builder.awsPayerReferenceId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.awsPayerReferenceId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun awsPayerReferenceId(awsPayerReferenceId: JsonField<String>) = apply {
                    this.awsPayerReferenceId = awsPayerReferenceId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [AwsOptions].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): AwsOptions =
                    AwsOptions(
                        awsAccountNumber,
                        awsOfferId,
                        awsPayerReferenceId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): AwsOptions = apply {
                if (validated) {
                    return@apply
                }

                awsAccountNumber()
                awsOfferId()
                awsPayerReferenceId()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (awsAccountNumber.asKnown().isPresent) 1 else 0) +
                    (if (awsOfferId.asKnown().isPresent) 1 else 0) +
                    (if (awsPayerReferenceId.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AwsOptions &&
                    awsAccountNumber == other.awsAccountNumber &&
                    awsOfferId == other.awsOfferId &&
                    awsPayerReferenceId == other.awsPayerReferenceId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    awsAccountNumber,
                    awsOfferId,
                    awsPayerReferenceId,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AwsOptions{awsAccountNumber=$awsAccountNumber, awsOfferId=$awsOfferId, awsPayerReferenceId=$awsPayerReferenceId, additionalProperties=$additionalProperties}"
        }

        class GcpOptions
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val gcpAccountId: JsonField<String>,
            private val gcpOfferId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("gcp_account_id")
                @ExcludeMissing
                gcpAccountId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("gcp_offer_id")
                @ExcludeMissing
                gcpOfferId: JsonField<String> = JsonMissing.of(),
            ) : this(gcpAccountId, gcpOfferId, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun gcpAccountId(): Optional<String> = gcpAccountId.getOptional("gcp_account_id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun gcpOfferId(): Optional<String> = gcpOfferId.getOptional("gcp_offer_id")

            /**
             * Returns the raw JSON value of [gcpAccountId].
             *
             * Unlike [gcpAccountId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("gcp_account_id")
            @ExcludeMissing
            fun _gcpAccountId(): JsonField<String> = gcpAccountId

            /**
             * Returns the raw JSON value of [gcpOfferId].
             *
             * Unlike [gcpOfferId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("gcp_offer_id")
            @ExcludeMissing
            fun _gcpOfferId(): JsonField<String> = gcpOfferId

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [GcpOptions]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [GcpOptions]. */
            class Builder internal constructor() {

                private var gcpAccountId: JsonField<String> = JsonMissing.of()
                private var gcpOfferId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(gcpOptions: GcpOptions) = apply {
                    gcpAccountId = gcpOptions.gcpAccountId
                    gcpOfferId = gcpOptions.gcpOfferId
                    additionalProperties = gcpOptions.additionalProperties.toMutableMap()
                }

                fun gcpAccountId(gcpAccountId: String) = gcpAccountId(JsonField.of(gcpAccountId))

                /**
                 * Sets [Builder.gcpAccountId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.gcpAccountId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun gcpAccountId(gcpAccountId: JsonField<String>) = apply {
                    this.gcpAccountId = gcpAccountId
                }

                fun gcpOfferId(gcpOfferId: String) = gcpOfferId(JsonField.of(gcpOfferId))

                /**
                 * Sets [Builder.gcpOfferId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.gcpOfferId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun gcpOfferId(gcpOfferId: JsonField<String>) = apply {
                    this.gcpOfferId = gcpOfferId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [GcpOptions].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): GcpOptions =
                    GcpOptions(gcpAccountId, gcpOfferId, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): GcpOptions = apply {
                if (validated) {
                    return@apply
                }

                gcpAccountId()
                gcpOfferId()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (gcpAccountId.asKnown().isPresent) 1 else 0) +
                    (if (gcpOfferId.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is GcpOptions &&
                    gcpAccountId == other.gcpAccountId &&
                    gcpOfferId == other.gcpOfferId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(gcpAccountId, gcpOfferId, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "GcpOptions{gcpAccountId=$gcpAccountId, gcpOfferId=$gcpOfferId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ResellerRoyalty &&
                resellerType == other.resellerType &&
                applicableProductIds == other.applicableProductIds &&
                applicableProductTags == other.applicableProductTags &&
                awsOptions == other.awsOptions &&
                endingBefore == other.endingBefore &&
                fraction == other.fraction &&
                gcpOptions == other.gcpOptions &&
                netsuiteResellerId == other.netsuiteResellerId &&
                resellerContractValue == other.resellerContractValue &&
                startingAt == other.startingAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                resellerType,
                applicableProductIds,
                applicableProductTags,
                awsOptions,
                endingBefore,
                fraction,
                gcpOptions,
                netsuiteResellerId,
                resellerContractValue,
                startingAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ResellerRoyalty{resellerType=$resellerType, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, awsOptions=$awsOptions, endingBefore=$endingBefore, fraction=$fraction, gcpOptions=$gcpOptions, netsuiteResellerId=$netsuiteResellerId, resellerContractValue=$resellerContractValue, startingAt=$startingAt, additionalProperties=$additionalProperties}"
    }

    class ScheduledCharge
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val productId: JsonField<String>,
        private val schedule: JsonField<Schedule>,
        private val customFields: JsonField<CustomFields>,
        private val name: JsonField<String>,
        private val netsuiteSalesOrderId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("product_id")
            @ExcludeMissing
            productId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("schedule")
            @ExcludeMissing
            schedule: JsonField<Schedule> = JsonMissing.of(),
            @JsonProperty("custom_fields")
            @ExcludeMissing
            customFields: JsonField<CustomFields> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("netsuite_sales_order_id")
            @ExcludeMissing
            netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
        ) : this(productId, schedule, customFields, name, netsuiteSalesOrderId, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun productId(): String = productId.getRequired("product_id")

        /**
         * Must provide either schedule_items or recurring_schedule.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun schedule(): Schedule = schedule.getRequired("schedule")

        /**
         * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun customFields(): Optional<CustomFields> = customFields.getOptional("custom_fields")

        /**
         * displayed on invoices
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * This field's availability is dependent on your client's configuration.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun netsuiteSalesOrderId(): Optional<String> =
            netsuiteSalesOrderId.getOptional("netsuite_sales_order_id")

        /**
         * Returns the raw JSON value of [productId].
         *
         * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

        /**
         * Returns the raw JSON value of [schedule].
         *
         * Unlike [schedule], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("schedule") @ExcludeMissing fun _schedule(): JsonField<Schedule> = schedule

        /**
         * Returns the raw JSON value of [customFields].
         *
         * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [netsuiteSalesOrderId].
         *
         * Unlike [netsuiteSalesOrderId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        fun _netsuiteSalesOrderId(): JsonField<String> = netsuiteSalesOrderId

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [ScheduledCharge].
             *
             * The following fields are required:
             * ```java
             * .productId()
             * .schedule()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ScheduledCharge]. */
        class Builder internal constructor() {

            private var productId: JsonField<String>? = null
            private var schedule: JsonField<Schedule>? = null
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(scheduledCharge: ScheduledCharge) = apply {
                productId = scheduledCharge.productId
                schedule = scheduledCharge.schedule
                customFields = scheduledCharge.customFields
                name = scheduledCharge.name
                netsuiteSalesOrderId = scheduledCharge.netsuiteSalesOrderId
                additionalProperties = scheduledCharge.additionalProperties.toMutableMap()
            }

            fun productId(productId: String) = productId(JsonField.of(productId))

            /**
             * Sets [Builder.productId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            /** Must provide either schedule_items or recurring_schedule. */
            fun schedule(schedule: Schedule) = schedule(JsonField.of(schedule))

            /**
             * Sets [Builder.schedule] to an arbitrary JSON value.
             *
             * You should usually call [Builder.schedule] with a well-typed [Schedule] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun schedule(schedule: JsonField<Schedule>) = apply { this.schedule = schedule }

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

            /**
             * Sets [Builder.customFields] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customFields] with a well-typed [CustomFields] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customFields(customFields: JsonField<CustomFields>) = apply {
                this.customFields = customFields
            }

            /** displayed on invoices */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
                netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

            /**
             * Sets [Builder.netsuiteSalesOrderId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.netsuiteSalesOrderId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
                this.netsuiteSalesOrderId = netsuiteSalesOrderId
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [ScheduledCharge].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .productId()
             * .schedule()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ScheduledCharge =
                ScheduledCharge(
                    checkRequired("productId", productId),
                    checkRequired("schedule", schedule),
                    customFields,
                    name,
                    netsuiteSalesOrderId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): ScheduledCharge = apply {
            if (validated) {
                return@apply
            }

            productId()
            schedule().validate()
            customFields().ifPresent { it.validate() }
            name()
            netsuiteSalesOrderId()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (productId.asKnown().isPresent) 1 else 0) +
                (schedule.asKnown().getOrNull()?.validity() ?: 0) +
                (customFields.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (netsuiteSalesOrderId.asKnown().isPresent) 1 else 0)

        /** Must provide either schedule_items or recurring_schedule. */
        class Schedule
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val creditTypeId: JsonField<String>,
            private val doNotInvoice: JsonField<Boolean>,
            private val recurringSchedule: JsonField<RecurringSchedule>,
            private val scheduleItems: JsonField<List<ScheduleItem>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("credit_type_id")
                @ExcludeMissing
                creditTypeId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("do_not_invoice")
                @ExcludeMissing
                doNotInvoice: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("recurring_schedule")
                @ExcludeMissing
                recurringSchedule: JsonField<RecurringSchedule> = JsonMissing.of(),
                @JsonProperty("schedule_items")
                @ExcludeMissing
                scheduleItems: JsonField<List<ScheduleItem>> = JsonMissing.of(),
            ) : this(creditTypeId, doNotInvoice, recurringSchedule, scheduleItems, mutableMapOf())

            /**
             * Defaults to USD (cents) if not passed.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun creditTypeId(): Optional<String> = creditTypeId.getOptional("credit_type_id")

            /**
             * This field is only applicable to commit invoice schedules. If true, this schedule
             * will not generate an invoice.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun doNotInvoice(): Optional<Boolean> = doNotInvoice.getOptional("do_not_invoice")

            /**
             * Enter the unit price and quantity for the charge or instead only send the amount. If
             * amount is sent, the unit price is assumed to be the amount and quantity is inferred
             * to be 1.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun recurringSchedule(): Optional<RecurringSchedule> =
                recurringSchedule.getOptional("recurring_schedule")

            /**
             * Either provide amount or provide both unit_price and quantity.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun scheduleItems(): Optional<List<ScheduleItem>> =
                scheduleItems.getOptional("schedule_items")

            /**
             * Returns the raw JSON value of [creditTypeId].
             *
             * Unlike [creditTypeId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("credit_type_id")
            @ExcludeMissing
            fun _creditTypeId(): JsonField<String> = creditTypeId

            /**
             * Returns the raw JSON value of [doNotInvoice].
             *
             * Unlike [doNotInvoice], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("do_not_invoice")
            @ExcludeMissing
            fun _doNotInvoice(): JsonField<Boolean> = doNotInvoice

            /**
             * Returns the raw JSON value of [recurringSchedule].
             *
             * Unlike [recurringSchedule], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("recurring_schedule")
            @ExcludeMissing
            fun _recurringSchedule(): JsonField<RecurringSchedule> = recurringSchedule

            /**
             * Returns the raw JSON value of [scheduleItems].
             *
             * Unlike [scheduleItems], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("schedule_items")
            @ExcludeMissing
            fun _scheduleItems(): JsonField<List<ScheduleItem>> = scheduleItems

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Schedule]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Schedule]. */
            class Builder internal constructor() {

                private var creditTypeId: JsonField<String> = JsonMissing.of()
                private var doNotInvoice: JsonField<Boolean> = JsonMissing.of()
                private var recurringSchedule: JsonField<RecurringSchedule> = JsonMissing.of()
                private var scheduleItems: JsonField<MutableList<ScheduleItem>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(schedule: Schedule) = apply {
                    creditTypeId = schedule.creditTypeId
                    doNotInvoice = schedule.doNotInvoice
                    recurringSchedule = schedule.recurringSchedule
                    scheduleItems = schedule.scheduleItems.map { it.toMutableList() }
                    additionalProperties = schedule.additionalProperties.toMutableMap()
                }

                /** Defaults to USD (cents) if not passed. */
                fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

                /**
                 * Sets [Builder.creditTypeId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.creditTypeId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun creditTypeId(creditTypeId: JsonField<String>) = apply {
                    this.creditTypeId = creditTypeId
                }

                /**
                 * This field is only applicable to commit invoice schedules. If true, this schedule
                 * will not generate an invoice.
                 */
                fun doNotInvoice(doNotInvoice: Boolean) = doNotInvoice(JsonField.of(doNotInvoice))

                /**
                 * Sets [Builder.doNotInvoice] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.doNotInvoice] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun doNotInvoice(doNotInvoice: JsonField<Boolean>) = apply {
                    this.doNotInvoice = doNotInvoice
                }

                /**
                 * Enter the unit price and quantity for the charge or instead only send the amount.
                 * If amount is sent, the unit price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                fun recurringSchedule(recurringSchedule: RecurringSchedule) =
                    recurringSchedule(JsonField.of(recurringSchedule))

                /**
                 * Sets [Builder.recurringSchedule] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recurringSchedule] with a well-typed
                 * [RecurringSchedule] value instead. This method is primarily for setting the field
                 * to an undocumented or not yet supported value.
                 */
                fun recurringSchedule(recurringSchedule: JsonField<RecurringSchedule>) = apply {
                    this.recurringSchedule = recurringSchedule
                }

                /** Either provide amount or provide both unit_price and quantity. */
                fun scheduleItems(scheduleItems: List<ScheduleItem>) =
                    scheduleItems(JsonField.of(scheduleItems))

                /**
                 * Sets [Builder.scheduleItems] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.scheduleItems] with a well-typed
                 * `List<ScheduleItem>` value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun scheduleItems(scheduleItems: JsonField<List<ScheduleItem>>) = apply {
                    this.scheduleItems = scheduleItems.map { it.toMutableList() }
                }

                /**
                 * Adds a single [ScheduleItem] to [scheduleItems].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addScheduleItem(scheduleItem: ScheduleItem) = apply {
                    scheduleItems =
                        (scheduleItems ?: JsonField.of(mutableListOf())).also {
                            checkKnown("scheduleItems", it).add(scheduleItem)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Schedule].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Schedule =
                    Schedule(
                        creditTypeId,
                        doNotInvoice,
                        recurringSchedule,
                        (scheduleItems ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Schedule = apply {
                if (validated) {
                    return@apply
                }

                creditTypeId()
                doNotInvoice()
                recurringSchedule().ifPresent { it.validate() }
                scheduleItems().ifPresent { it.forEach { it.validate() } }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (creditTypeId.asKnown().isPresent) 1 else 0) +
                    (if (doNotInvoice.asKnown().isPresent) 1 else 0) +
                    (recurringSchedule.asKnown().getOrNull()?.validity() ?: 0) +
                    (scheduleItems.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            /**
             * Enter the unit price and quantity for the charge or instead only send the amount. If
             * amount is sent, the unit price is assumed to be the amount and quantity is inferred
             * to be 1.
             */
            class RecurringSchedule
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amountDistribution: JsonField<AmountDistribution>,
                private val endingBefore: JsonField<OffsetDateTime>,
                private val frequency: JsonField<Frequency>,
                private val startingAt: JsonField<OffsetDateTime>,
                private val amount: JsonField<Double>,
                private val quantity: JsonField<Double>,
                private val unitPrice: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount_distribution")
                    @ExcludeMissing
                    amountDistribution: JsonField<AmountDistribution> = JsonMissing.of(),
                    @JsonProperty("ending_before")
                    @ExcludeMissing
                    endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("frequency")
                    @ExcludeMissing
                    frequency: JsonField<Frequency> = JsonMissing.of(),
                    @JsonProperty("starting_at")
                    @ExcludeMissing
                    startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("quantity")
                    @ExcludeMissing
                    quantity: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("unit_price")
                    @ExcludeMissing
                    unitPrice: JsonField<Double> = JsonMissing.of(),
                ) : this(
                    amountDistribution,
                    endingBefore,
                    frequency,
                    startingAt,
                    amount,
                    quantity,
                    unitPrice,
                    mutableMapOf(),
                )

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun amountDistribution(): AmountDistribution =
                    amountDistribution.getRequired("amount_distribution")

                /**
                 * RFC 3339 timestamp (exclusive).
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun endingBefore(): OffsetDateTime = endingBefore.getRequired("ending_before")

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun frequency(): Frequency = frequency.getRequired("frequency")

                /**
                 * RFC 3339 timestamp (inclusive).
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

                /**
                 * Amount for the charge. Can be provided instead of unit_price and quantity. If
                 * amount is sent, the unit_price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun amount(): Optional<Double> = amount.getOptional("amount")

                /**
                 * Quantity for the charge. Will be multiplied by unit_price to determine the amount
                 * and must be specified with unit_price. If specified amount cannot be provided.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun quantity(): Optional<Double> = quantity.getOptional("quantity")

                /**
                 * Unit price for the charge. Will be multiplied by quantity to determine the amount
                 * and must be specified with quantity. If specified amount cannot be provided.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun unitPrice(): Optional<Double> = unitPrice.getOptional("unit_price")

                /**
                 * Returns the raw JSON value of [amountDistribution].
                 *
                 * Unlike [amountDistribution], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("amount_distribution")
                @ExcludeMissing
                fun _amountDistribution(): JsonField<AmountDistribution> = amountDistribution

                /**
                 * Returns the raw JSON value of [endingBefore].
                 *
                 * Unlike [endingBefore], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("ending_before")
                @ExcludeMissing
                fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

                /**
                 * Returns the raw JSON value of [frequency].
                 *
                 * Unlike [frequency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("frequency")
                @ExcludeMissing
                fun _frequency(): JsonField<Frequency> = frequency

                /**
                 * Returns the raw JSON value of [startingAt].
                 *
                 * Unlike [startingAt], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("starting_at")
                @ExcludeMissing
                fun _startingAt(): JsonField<OffsetDateTime> = startingAt

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                /**
                 * Returns the raw JSON value of [quantity].
                 *
                 * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("quantity")
                @ExcludeMissing
                fun _quantity(): JsonField<Double> = quantity

                /**
                 * Returns the raw JSON value of [unitPrice].
                 *
                 * Unlike [unitPrice], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("unit_price")
                @ExcludeMissing
                fun _unitPrice(): JsonField<Double> = unitPrice

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [RecurringSchedule].
                     *
                     * The following fields are required:
                     * ```java
                     * .amountDistribution()
                     * .endingBefore()
                     * .frequency()
                     * .startingAt()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [RecurringSchedule]. */
                class Builder internal constructor() {

                    private var amountDistribution: JsonField<AmountDistribution>? = null
                    private var endingBefore: JsonField<OffsetDateTime>? = null
                    private var frequency: JsonField<Frequency>? = null
                    private var startingAt: JsonField<OffsetDateTime>? = null
                    private var amount: JsonField<Double> = JsonMissing.of()
                    private var quantity: JsonField<Double> = JsonMissing.of()
                    private var unitPrice: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(recurringSchedule: RecurringSchedule) = apply {
                        amountDistribution = recurringSchedule.amountDistribution
                        endingBefore = recurringSchedule.endingBefore
                        frequency = recurringSchedule.frequency
                        startingAt = recurringSchedule.startingAt
                        amount = recurringSchedule.amount
                        quantity = recurringSchedule.quantity
                        unitPrice = recurringSchedule.unitPrice
                        additionalProperties = recurringSchedule.additionalProperties.toMutableMap()
                    }

                    fun amountDistribution(amountDistribution: AmountDistribution) =
                        amountDistribution(JsonField.of(amountDistribution))

                    /**
                     * Sets [Builder.amountDistribution] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amountDistribution] with a well-typed
                     * [AmountDistribution] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun amountDistribution(amountDistribution: JsonField<AmountDistribution>) =
                        apply {
                            this.amountDistribution = amountDistribution
                        }

                    /** RFC 3339 timestamp (exclusive). */
                    fun endingBefore(endingBefore: OffsetDateTime) =
                        endingBefore(JsonField.of(endingBefore))

                    /**
                     * Sets [Builder.endingBefore] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.endingBefore] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                        this.endingBefore = endingBefore
                    }

                    fun frequency(frequency: Frequency) = frequency(JsonField.of(frequency))

                    /**
                     * Sets [Builder.frequency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.frequency] with a well-typed [Frequency]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun frequency(frequency: JsonField<Frequency>) = apply {
                        this.frequency = frequency
                    }

                    /** RFC 3339 timestamp (inclusive). */
                    fun startingAt(startingAt: OffsetDateTime) =
                        startingAt(JsonField.of(startingAt))

                    /**
                     * Sets [Builder.startingAt] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.startingAt] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                        this.startingAt = startingAt
                    }

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    /**
                     * Sets [Builder.quantity] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.quantity] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

                    /**
                     * Sets [Builder.unitPrice] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.unitPrice] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun unitPrice(unitPrice: JsonField<Double>) = apply {
                        this.unitPrice = unitPrice
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [RecurringSchedule].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .amountDistribution()
                     * .endingBefore()
                     * .frequency()
                     * .startingAt()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): RecurringSchedule =
                        RecurringSchedule(
                            checkRequired("amountDistribution", amountDistribution),
                            checkRequired("endingBefore", endingBefore),
                            checkRequired("frequency", frequency),
                            checkRequired("startingAt", startingAt),
                            amount,
                            quantity,
                            unitPrice,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): RecurringSchedule = apply {
                    if (validated) {
                        return@apply
                    }

                    amountDistribution().validate()
                    endingBefore()
                    frequency().validate()
                    startingAt()
                    amount()
                    quantity()
                    unitPrice()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (amountDistribution.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (endingBefore.asKnown().isPresent) 1 else 0) +
                        (frequency.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (startingAt.asKnown().isPresent) 1 else 0) +
                        (if (amount.asKnown().isPresent) 1 else 0) +
                        (if (quantity.asKnown().isPresent) 1 else 0) +
                        (if (unitPrice.asKnown().isPresent) 1 else 0)

                class AmountDistribution
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val DIVIDED = of("DIVIDED")

                        @JvmField val DIVIDED_ROUNDED = of("DIVIDED_ROUNDED")

                        @JvmField val EACH = of("EACH")

                        @JvmStatic fun of(value: String) = AmountDistribution(JsonField.of(value))
                    }

                    /** An enum containing [AmountDistribution]'s known values. */
                    enum class Known {
                        DIVIDED,
                        DIVIDED_ROUNDED,
                        EACH,
                    }

                    /**
                     * An enum containing [AmountDistribution]'s known values, as well as an
                     * [_UNKNOWN] member.
                     *
                     * An instance of [AmountDistribution] can contain an unknown value in a couple
                     * of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        DIVIDED,
                        DIVIDED_ROUNDED,
                        EACH,
                        /**
                         * An enum member indicating that [AmountDistribution] was instantiated with
                         * an unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            DIVIDED -> Value.DIVIDED
                            DIVIDED_ROUNDED -> Value.DIVIDED_ROUNDED
                            EACH -> Value.EACH
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws MetronomeInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            DIVIDED -> Known.DIVIDED
                            DIVIDED_ROUNDED -> Known.DIVIDED_ROUNDED
                            EACH -> Known.EACH
                            else ->
                                throw MetronomeInvalidDataException(
                                    "Unknown AmountDistribution: $value"
                                )
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws MetronomeInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            MetronomeInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws MetronomeInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): AmountDistribution = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: MetronomeInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is AmountDistribution && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                class Frequency
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val MONTHLY = of("MONTHLY")

                        @JvmField val QUARTERLY = of("QUARTERLY")

                        @JvmField val SEMI_ANNUAL = of("SEMI_ANNUAL")

                        @JvmField val ANNUAL = of("ANNUAL")

                        @JvmStatic fun of(value: String) = Frequency(JsonField.of(value))
                    }

                    /** An enum containing [Frequency]'s known values. */
                    enum class Known {
                        MONTHLY,
                        QUARTERLY,
                        SEMI_ANNUAL,
                        ANNUAL,
                    }

                    /**
                     * An enum containing [Frequency]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [Frequency] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        MONTHLY,
                        QUARTERLY,
                        SEMI_ANNUAL,
                        ANNUAL,
                        /**
                         * An enum member indicating that [Frequency] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            MONTHLY -> Value.MONTHLY
                            QUARTERLY -> Value.QUARTERLY
                            SEMI_ANNUAL -> Value.SEMI_ANNUAL
                            ANNUAL -> Value.ANNUAL
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws MetronomeInvalidDataException if this class instance's value is a not
                     *   a known member.
                     */
                    fun known(): Known =
                        when (this) {
                            MONTHLY -> Known.MONTHLY
                            QUARTERLY -> Known.QUARTERLY
                            SEMI_ANNUAL -> Known.SEMI_ANNUAL
                            ANNUAL -> Known.ANNUAL
                            else -> throw MetronomeInvalidDataException("Unknown Frequency: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws MetronomeInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            MetronomeInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws MetronomeInvalidDataException if any value type in this object
                     *   doesn't match its expected type.
                     */
                    fun validate(): Frequency = apply {
                        if (validated) {
                            return@apply
                        }

                        known()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: MetronomeInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Frequency && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is RecurringSchedule &&
                        amountDistribution == other.amountDistribution &&
                        endingBefore == other.endingBefore &&
                        frequency == other.frequency &&
                        startingAt == other.startingAt &&
                        amount == other.amount &&
                        quantity == other.quantity &&
                        unitPrice == other.unitPrice &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        amountDistribution,
                        endingBefore,
                        frequency,
                        startingAt,
                        amount,
                        quantity,
                        unitPrice,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "RecurringSchedule{amountDistribution=$amountDistribution, endingBefore=$endingBefore, frequency=$frequency, startingAt=$startingAt, amount=$amount, quantity=$quantity, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
            }

            class ScheduleItem
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val timestamp: JsonField<OffsetDateTime>,
                private val amount: JsonField<Double>,
                private val quantity: JsonField<Double>,
                private val unitPrice: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("timestamp")
                    @ExcludeMissing
                    timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("quantity")
                    @ExcludeMissing
                    quantity: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("unit_price")
                    @ExcludeMissing
                    unitPrice: JsonField<Double> = JsonMissing.of(),
                ) : this(timestamp, amount, quantity, unitPrice, mutableMapOf())

                /**
                 * timestamp of the scheduled event
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

                /**
                 * Amount for the charge. Can be provided instead of unit_price and quantity. If
                 * amount is sent, the unit_price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun amount(): Optional<Double> = amount.getOptional("amount")

                /**
                 * Quantity for the charge. Will be multiplied by unit_price to determine the amount
                 * and must be specified with unit_price. If specified amount cannot be provided.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun quantity(): Optional<Double> = quantity.getOptional("quantity")

                /**
                 * Unit price for the charge. Will be multiplied by quantity to determine the amount
                 * and must be specified with quantity. If specified amount cannot be provided.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun unitPrice(): Optional<Double> = unitPrice.getOptional("unit_price")

                /**
                 * Returns the raw JSON value of [timestamp].
                 *
                 * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("timestamp")
                @ExcludeMissing
                fun _timestamp(): JsonField<OffsetDateTime> = timestamp

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

                /**
                 * Returns the raw JSON value of [quantity].
                 *
                 * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("quantity")
                @ExcludeMissing
                fun _quantity(): JsonField<Double> = quantity

                /**
                 * Returns the raw JSON value of [unitPrice].
                 *
                 * Unlike [unitPrice], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("unit_price")
                @ExcludeMissing
                fun _unitPrice(): JsonField<Double> = unitPrice

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [ScheduleItem].
                     *
                     * The following fields are required:
                     * ```java
                     * .timestamp()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [ScheduleItem]. */
                class Builder internal constructor() {

                    private var timestamp: JsonField<OffsetDateTime>? = null
                    private var amount: JsonField<Double> = JsonMissing.of()
                    private var quantity: JsonField<Double> = JsonMissing.of()
                    private var unitPrice: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(scheduleItem: ScheduleItem) = apply {
                        timestamp = scheduleItem.timestamp
                        amount = scheduleItem.amount
                        quantity = scheduleItem.quantity
                        unitPrice = scheduleItem.unitPrice
                        additionalProperties = scheduleItem.additionalProperties.toMutableMap()
                    }

                    /** timestamp of the scheduled event */
                    fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

                    /**
                     * Sets [Builder.timestamp] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.timestamp] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                        this.timestamp = timestamp
                    }

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    fun amount(amount: Double) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    /**
                     * Sets [Builder.quantity] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.quantity] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

                    /**
                     * Sets [Builder.unitPrice] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.unitPrice] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun unitPrice(unitPrice: JsonField<Double>) = apply {
                        this.unitPrice = unitPrice
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [ScheduleItem].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .timestamp()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): ScheduleItem =
                        ScheduleItem(
                            checkRequired("timestamp", timestamp),
                            amount,
                            quantity,
                            unitPrice,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): ScheduleItem = apply {
                    if (validated) {
                        return@apply
                    }

                    timestamp()
                    amount()
                    quantity()
                    unitPrice()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (timestamp.asKnown().isPresent) 1 else 0) +
                        (if (amount.asKnown().isPresent) 1 else 0) +
                        (if (quantity.asKnown().isPresent) 1 else 0) +
                        (if (unitPrice.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ScheduleItem &&
                        timestamp == other.timestamp &&
                        amount == other.amount &&
                        quantity == other.quantity &&
                        unitPrice == other.unitPrice &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(timestamp, amount, quantity, unitPrice, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ScheduleItem{timestamp=$timestamp, amount=$amount, quantity=$quantity, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Schedule &&
                    creditTypeId == other.creditTypeId &&
                    doNotInvoice == other.doNotInvoice &&
                    recurringSchedule == other.recurringSchedule &&
                    scheduleItems == other.scheduleItems &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    creditTypeId,
                    doNotInvoice,
                    recurringSchedule,
                    scheduleItems,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Schedule{creditTypeId=$creditTypeId, doNotInvoice=$doNotInvoice, recurringSchedule=$recurringSchedule, scheduleItems=$scheduleItems, additionalProperties=$additionalProperties}"
        }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        class CustomFields
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [CustomFields]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CustomFields]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(customFields: CustomFields) = apply {
                    additionalProperties = customFields.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [CustomFields].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): CustomFields = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CustomFields && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ScheduledCharge &&
                productId == other.productId &&
                schedule == other.schedule &&
                customFields == other.customFields &&
                name == other.name &&
                netsuiteSalesOrderId == other.netsuiteSalesOrderId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                productId,
                schedule,
                customFields,
                name,
                netsuiteSalesOrderId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ScheduledCharge{productId=$productId, schedule=$schedule, customFields=$customFields, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContractAmendParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ContractAmendParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
