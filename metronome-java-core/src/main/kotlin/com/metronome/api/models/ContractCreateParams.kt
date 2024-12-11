// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import com.metronome.api.models.*
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class ContractCreateParams
constructor(
    private val customerId: String,
    private val startingAt: OffsetDateTime,
    private val billingProviderConfiguration: BillingProviderConfiguration?,
    private val commits: List<Commit>?,
    private val credits: List<Credit>?,
    private val customFields: CustomFields?,
    private val discounts: List<Discount>?,
    private val endingBefore: OffsetDateTime?,
    private val multiplierOverridePrioritization: MultiplierOverridePrioritization?,
    private val name: String?,
    private val netPaymentTermsDays: Double?,
    private val netsuiteSalesOrderId: String?,
    private val overrides: List<Override>?,
    private val professionalServices: List<ProfessionalService>?,
    private val rateCardAlias: String?,
    private val rateCardId: String?,
    private val resellerRoyalties: List<ResellerRoyalty>?,
    private val salesforceOpportunityId: String?,
    private val scheduledCharges: List<ScheduledCharge>?,
    private val totalContractValue: Double?,
    private val transition: Transition?,
    private val uniquenessKey: String?,
    private val usageFilter: BaseUsageFilter?,
    private val usageStatementSchedule: UsageStatementSchedule?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun customerId(): String = customerId

    fun startingAt(): OffsetDateTime = startingAt

    fun billingProviderConfiguration(): Optional<BillingProviderConfiguration> =
        Optional.ofNullable(billingProviderConfiguration)

    fun commits(): Optional<List<Commit>> = Optional.ofNullable(commits)

    fun credits(): Optional<List<Credit>> = Optional.ofNullable(credits)

    fun customFields(): Optional<CustomFields> = Optional.ofNullable(customFields)

    fun discounts(): Optional<List<Discount>> = Optional.ofNullable(discounts)

    fun endingBefore(): Optional<OffsetDateTime> = Optional.ofNullable(endingBefore)

    fun multiplierOverridePrioritization(): Optional<MultiplierOverridePrioritization> =
        Optional.ofNullable(multiplierOverridePrioritization)

    fun name(): Optional<String> = Optional.ofNullable(name)

    fun netPaymentTermsDays(): Optional<Double> = Optional.ofNullable(netPaymentTermsDays)

    fun netsuiteSalesOrderId(): Optional<String> = Optional.ofNullable(netsuiteSalesOrderId)

    fun overrides(): Optional<List<Override>> = Optional.ofNullable(overrides)

    fun professionalServices(): Optional<List<ProfessionalService>> =
        Optional.ofNullable(professionalServices)

    fun rateCardAlias(): Optional<String> = Optional.ofNullable(rateCardAlias)

    fun rateCardId(): Optional<String> = Optional.ofNullable(rateCardId)

    fun resellerRoyalties(): Optional<List<ResellerRoyalty>> =
        Optional.ofNullable(resellerRoyalties)

    fun salesforceOpportunityId(): Optional<String> = Optional.ofNullable(salesforceOpportunityId)

    fun scheduledCharges(): Optional<List<ScheduledCharge>> = Optional.ofNullable(scheduledCharges)

    fun totalContractValue(): Optional<Double> = Optional.ofNullable(totalContractValue)

    fun transition(): Optional<Transition> = Optional.ofNullable(transition)

    fun uniquenessKey(): Optional<String> = Optional.ofNullable(uniquenessKey)

    fun usageFilter(): Optional<BaseUsageFilter> = Optional.ofNullable(usageFilter)

    fun usageStatementSchedule(): Optional<UsageStatementSchedule> =
        Optional.ofNullable(usageStatementSchedule)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): ContractCreateBody {
        return ContractCreateBody(
            customerId,
            startingAt,
            billingProviderConfiguration,
            commits,
            credits,
            customFields,
            discounts,
            endingBefore,
            multiplierOverridePrioritization,
            name,
            netPaymentTermsDays,
            netsuiteSalesOrderId,
            overrides,
            professionalServices,
            rateCardAlias,
            rateCardId,
            resellerRoyalties,
            salesforceOpportunityId,
            scheduledCharges,
            totalContractValue,
            transition,
            uniquenessKey,
            usageFilter,
            usageStatementSchedule,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = ContractCreateBody.Builder::class)
    @NoAutoDetect
    class ContractCreateBody
    internal constructor(
        private val customerId: String?,
        private val startingAt: OffsetDateTime?,
        private val billingProviderConfiguration: BillingProviderConfiguration?,
        private val commits: List<Commit>?,
        private val credits: List<Credit>?,
        private val customFields: CustomFields?,
        private val discounts: List<Discount>?,
        private val endingBefore: OffsetDateTime?,
        private val multiplierOverridePrioritization: MultiplierOverridePrioritization?,
        private val name: String?,
        private val netPaymentTermsDays: Double?,
        private val netsuiteSalesOrderId: String?,
        private val overrides: List<Override>?,
        private val professionalServices: List<ProfessionalService>?,
        private val rateCardAlias: String?,
        private val rateCardId: String?,
        private val resellerRoyalties: List<ResellerRoyalty>?,
        private val salesforceOpportunityId: String?,
        private val scheduledCharges: List<ScheduledCharge>?,
        private val totalContractValue: Double?,
        private val transition: Transition?,
        private val uniquenessKey: String?,
        private val usageFilter: BaseUsageFilter?,
        private val usageStatementSchedule: UsageStatementSchedule?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("customer_id") fun customerId(): String? = customerId

        /** inclusive contract start time */
        @JsonProperty("starting_at") fun startingAt(): OffsetDateTime? = startingAt

        /** The billing provider configuration associated with a contract. */
        @JsonProperty("billing_provider_configuration")
        fun billingProviderConfiguration(): BillingProviderConfiguration? =
            billingProviderConfiguration

        @JsonProperty("commits") fun commits(): List<Commit>? = commits

        @JsonProperty("credits") fun credits(): List<Credit>? = credits

        @JsonProperty("custom_fields") fun customFields(): CustomFields? = customFields

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("discounts") fun discounts(): List<Discount>? = discounts

        /** exclusive contract end time */
        @JsonProperty("ending_before") fun endingBefore(): OffsetDateTime? = endingBefore

        /**
         * Defaults to LOWEST_MULTIPLIER, which applies the greatest discount to list prices
         * automatically. EXPLICIT prioritization requires specifying priorities for each
         * multiplier; the one with the lowest priority value will be prioritized first. If tiered
         * overrides are used, prioritization must be explicit.
         */
        @JsonProperty("multiplier_override_prioritization")
        fun multiplierOverridePrioritization(): MultiplierOverridePrioritization? =
            multiplierOverridePrioritization

        @JsonProperty("name") fun name(): String? = name

        @JsonProperty("net_payment_terms_days")
        fun netPaymentTermsDays(): Double? = netPaymentTermsDays

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("netsuite_sales_order_id")
        fun netsuiteSalesOrderId(): String? = netsuiteSalesOrderId

        @JsonProperty("overrides") fun overrides(): List<Override>? = overrides

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("professional_services")
        fun professionalServices(): List<ProfessionalService>? = professionalServices

        /** Selects the rate card linked to the specified alias as of the contract's start date. */
        @JsonProperty("rate_card_alias") fun rateCardAlias(): String? = rateCardAlias

        @JsonProperty("rate_card_id") fun rateCardId(): String? = rateCardId

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("reseller_royalties")
        fun resellerRoyalties(): List<ResellerRoyalty>? = resellerRoyalties

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("salesforce_opportunity_id")
        fun salesforceOpportunityId(): String? = salesforceOpportunityId

        @JsonProperty("scheduled_charges")
        fun scheduledCharges(): List<ScheduledCharge>? = scheduledCharges

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("total_contract_value") fun totalContractValue(): Double? = totalContractValue

        @JsonProperty("transition") fun transition(): Transition? = transition

        /**
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
         */
        @JsonProperty("uniqueness_key") fun uniquenessKey(): String? = uniquenessKey

        @JsonProperty("usage_filter") fun usageFilter(): BaseUsageFilter? = usageFilter

        @JsonProperty("usage_statement_schedule")
        fun usageStatementSchedule(): UsageStatementSchedule? = usageStatementSchedule

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var customerId: String? = null
            private var startingAt: OffsetDateTime? = null
            private var billingProviderConfiguration: BillingProviderConfiguration? = null
            private var commits: List<Commit>? = null
            private var credits: List<Credit>? = null
            private var customFields: CustomFields? = null
            private var discounts: List<Discount>? = null
            private var endingBefore: OffsetDateTime? = null
            private var multiplierOverridePrioritization: MultiplierOverridePrioritization? = null
            private var name: String? = null
            private var netPaymentTermsDays: Double? = null
            private var netsuiteSalesOrderId: String? = null
            private var overrides: List<Override>? = null
            private var professionalServices: List<ProfessionalService>? = null
            private var rateCardAlias: String? = null
            private var rateCardId: String? = null
            private var resellerRoyalties: List<ResellerRoyalty>? = null
            private var salesforceOpportunityId: String? = null
            private var scheduledCharges: List<ScheduledCharge>? = null
            private var totalContractValue: Double? = null
            private var transition: Transition? = null
            private var uniquenessKey: String? = null
            private var usageFilter: BaseUsageFilter? = null
            private var usageStatementSchedule: UsageStatementSchedule? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contractCreateBody: ContractCreateBody) = apply {
                this.customerId = contractCreateBody.customerId
                this.startingAt = contractCreateBody.startingAt
                this.billingProviderConfiguration = contractCreateBody.billingProviderConfiguration
                this.commits = contractCreateBody.commits
                this.credits = contractCreateBody.credits
                this.customFields = contractCreateBody.customFields
                this.discounts = contractCreateBody.discounts
                this.endingBefore = contractCreateBody.endingBefore
                this.multiplierOverridePrioritization =
                    contractCreateBody.multiplierOverridePrioritization
                this.name = contractCreateBody.name
                this.netPaymentTermsDays = contractCreateBody.netPaymentTermsDays
                this.netsuiteSalesOrderId = contractCreateBody.netsuiteSalesOrderId
                this.overrides = contractCreateBody.overrides
                this.professionalServices = contractCreateBody.professionalServices
                this.rateCardAlias = contractCreateBody.rateCardAlias
                this.rateCardId = contractCreateBody.rateCardId
                this.resellerRoyalties = contractCreateBody.resellerRoyalties
                this.salesforceOpportunityId = contractCreateBody.salesforceOpportunityId
                this.scheduledCharges = contractCreateBody.scheduledCharges
                this.totalContractValue = contractCreateBody.totalContractValue
                this.transition = contractCreateBody.transition
                this.uniquenessKey = contractCreateBody.uniquenessKey
                this.usageFilter = contractCreateBody.usageFilter
                this.usageStatementSchedule = contractCreateBody.usageStatementSchedule
                additionalProperties(contractCreateBody.additionalProperties)
            }

            @JsonProperty("customer_id")
            fun customerId(customerId: String) = apply { this.customerId = customerId }

            /** inclusive contract start time */
            @JsonProperty("starting_at")
            fun startingAt(startingAt: OffsetDateTime) = apply { this.startingAt = startingAt }

            /** The billing provider configuration associated with a contract. */
            @JsonProperty("billing_provider_configuration")
            fun billingProviderConfiguration(
                billingProviderConfiguration: BillingProviderConfiguration
            ) = apply { this.billingProviderConfiguration = billingProviderConfiguration }

            @JsonProperty("commits")
            fun commits(commits: List<Commit>) = apply { this.commits = commits }

            @JsonProperty("credits")
            fun credits(credits: List<Credit>) = apply { this.credits = credits }

            @JsonProperty("custom_fields")
            fun customFields(customFields: CustomFields) = apply {
                this.customFields = customFields
            }

            /** This field's availability is dependent on your client's configuration. */
            @JsonProperty("discounts")
            fun discounts(discounts: List<Discount>) = apply { this.discounts = discounts }

            /** exclusive contract end time */
            @JsonProperty("ending_before")
            fun endingBefore(endingBefore: OffsetDateTime) = apply {
                this.endingBefore = endingBefore
            }

            /**
             * Defaults to LOWEST_MULTIPLIER, which applies the greatest discount to list prices
             * automatically. EXPLICIT prioritization requires specifying priorities for each
             * multiplier; the one with the lowest priority value will be prioritized first. If
             * tiered overrides are used, prioritization must be explicit.
             */
            @JsonProperty("multiplier_override_prioritization")
            fun multiplierOverridePrioritization(
                multiplierOverridePrioritization: MultiplierOverridePrioritization
            ) = apply { this.multiplierOverridePrioritization = multiplierOverridePrioritization }

            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            @JsonProperty("net_payment_terms_days")
            fun netPaymentTermsDays(netPaymentTermsDays: Double) = apply {
                this.netPaymentTermsDays = netPaymentTermsDays
            }

            /** This field's availability is dependent on your client's configuration. */
            @JsonProperty("netsuite_sales_order_id")
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) = apply {
                this.netsuiteSalesOrderId = netsuiteSalesOrderId
            }

            @JsonProperty("overrides")
            fun overrides(overrides: List<Override>) = apply { this.overrides = overrides }

            /** This field's availability is dependent on your client's configuration. */
            @JsonProperty("professional_services")
            fun professionalServices(professionalServices: List<ProfessionalService>) = apply {
                this.professionalServices = professionalServices
            }

            /**
             * Selects the rate card linked to the specified alias as of the contract's start date.
             */
            @JsonProperty("rate_card_alias")
            fun rateCardAlias(rateCardAlias: String) = apply { this.rateCardAlias = rateCardAlias }

            @JsonProperty("rate_card_id")
            fun rateCardId(rateCardId: String) = apply { this.rateCardId = rateCardId }

            /** This field's availability is dependent on your client's configuration. */
            @JsonProperty("reseller_royalties")
            fun resellerRoyalties(resellerRoyalties: List<ResellerRoyalty>) = apply {
                this.resellerRoyalties = resellerRoyalties
            }

            /** This field's availability is dependent on your client's configuration. */
            @JsonProperty("salesforce_opportunity_id")
            fun salesforceOpportunityId(salesforceOpportunityId: String) = apply {
                this.salesforceOpportunityId = salesforceOpportunityId
            }

            @JsonProperty("scheduled_charges")
            fun scheduledCharges(scheduledCharges: List<ScheduledCharge>) = apply {
                this.scheduledCharges = scheduledCharges
            }

            /** This field's availability is dependent on your client's configuration. */
            @JsonProperty("total_contract_value")
            fun totalContractValue(totalContractValue: Double) = apply {
                this.totalContractValue = totalContractValue
            }

            @JsonProperty("transition")
            fun transition(transition: Transition) = apply { this.transition = transition }

            /**
             * Prevents the creation of duplicates. If a request to create a record is made with a
             * previously used uniqueness key, a new record will not be created and the request will
             * fail with a 409 error.
             */
            @JsonProperty("uniqueness_key")
            fun uniquenessKey(uniquenessKey: String) = apply { this.uniquenessKey = uniquenessKey }

            @JsonProperty("usage_filter")
            fun usageFilter(usageFilter: BaseUsageFilter) = apply { this.usageFilter = usageFilter }

            @JsonProperty("usage_statement_schedule")
            fun usageStatementSchedule(usageStatementSchedule: UsageStatementSchedule) = apply {
                this.usageStatementSchedule = usageStatementSchedule
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): ContractCreateBody =
                ContractCreateBody(
                    checkNotNull(customerId) { "`customerId` is required but was not set" },
                    checkNotNull(startingAt) { "`startingAt` is required but was not set" },
                    billingProviderConfiguration,
                    commits?.toImmutable(),
                    credits?.toImmutable(),
                    customFields,
                    discounts?.toImmutable(),
                    endingBefore,
                    multiplierOverridePrioritization,
                    name,
                    netPaymentTermsDays,
                    netsuiteSalesOrderId,
                    overrides?.toImmutable(),
                    professionalServices?.toImmutable(),
                    rateCardAlias,
                    rateCardId,
                    resellerRoyalties?.toImmutable(),
                    salesforceOpportunityId,
                    scheduledCharges?.toImmutable(),
                    totalContractValue,
                    transition,
                    uniquenessKey,
                    usageFilter,
                    usageStatementSchedule,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ContractCreateBody && customerId == other.customerId && startingAt == other.startingAt && billingProviderConfiguration == other.billingProviderConfiguration && commits == other.commits && credits == other.credits && customFields == other.customFields && discounts == other.discounts && endingBefore == other.endingBefore && multiplierOverridePrioritization == other.multiplierOverridePrioritization && name == other.name && netPaymentTermsDays == other.netPaymentTermsDays && netsuiteSalesOrderId == other.netsuiteSalesOrderId && overrides == other.overrides && professionalServices == other.professionalServices && rateCardAlias == other.rateCardAlias && rateCardId == other.rateCardId && resellerRoyalties == other.resellerRoyalties && salesforceOpportunityId == other.salesforceOpportunityId && scheduledCharges == other.scheduledCharges && totalContractValue == other.totalContractValue && transition == other.transition && uniquenessKey == other.uniquenessKey && usageFilter == other.usageFilter && usageStatementSchedule == other.usageStatementSchedule && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(customerId, startingAt, billingProviderConfiguration, commits, credits, customFields, discounts, endingBefore, multiplierOverridePrioritization, name, netPaymentTermsDays, netsuiteSalesOrderId, overrides, professionalServices, rateCardAlias, rateCardId, resellerRoyalties, salesforceOpportunityId, scheduledCharges, totalContractValue, transition, uniquenessKey, usageFilter, usageStatementSchedule, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ContractCreateBody{customerId=$customerId, startingAt=$startingAt, billingProviderConfiguration=$billingProviderConfiguration, commits=$commits, credits=$credits, customFields=$customFields, discounts=$discounts, endingBefore=$endingBefore, multiplierOverridePrioritization=$multiplierOverridePrioritization, name=$name, netPaymentTermsDays=$netPaymentTermsDays, netsuiteSalesOrderId=$netsuiteSalesOrderId, overrides=$overrides, professionalServices=$professionalServices, rateCardAlias=$rateCardAlias, rateCardId=$rateCardId, resellerRoyalties=$resellerRoyalties, salesforceOpportunityId=$salesforceOpportunityId, scheduledCharges=$scheduledCharges, totalContractValue=$totalContractValue, transition=$transition, uniquenessKey=$uniquenessKey, usageFilter=$usageFilter, usageStatementSchedule=$usageStatementSchedule, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var customerId: String? = null
        private var startingAt: OffsetDateTime? = null
        private var billingProviderConfiguration: BillingProviderConfiguration? = null
        private var commits: MutableList<Commit> = mutableListOf()
        private var credits: MutableList<Credit> = mutableListOf()
        private var customFields: CustomFields? = null
        private var discounts: MutableList<Discount> = mutableListOf()
        private var endingBefore: OffsetDateTime? = null
        private var multiplierOverridePrioritization: MultiplierOverridePrioritization? = null
        private var name: String? = null
        private var netPaymentTermsDays: Double? = null
        private var netsuiteSalesOrderId: String? = null
        private var overrides: MutableList<Override> = mutableListOf()
        private var professionalServices: MutableList<ProfessionalService> = mutableListOf()
        private var rateCardAlias: String? = null
        private var rateCardId: String? = null
        private var resellerRoyalties: MutableList<ResellerRoyalty> = mutableListOf()
        private var salesforceOpportunityId: String? = null
        private var scheduledCharges: MutableList<ScheduledCharge> = mutableListOf()
        private var totalContractValue: Double? = null
        private var transition: Transition? = null
        private var uniquenessKey: String? = null
        private var usageFilter: BaseUsageFilter? = null
        private var usageStatementSchedule: UsageStatementSchedule? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contractCreateParams: ContractCreateParams) = apply {
            customerId = contractCreateParams.customerId
            startingAt = contractCreateParams.startingAt
            billingProviderConfiguration = contractCreateParams.billingProviderConfiguration
            commits = contractCreateParams.commits?.toMutableList() ?: mutableListOf()
            credits = contractCreateParams.credits?.toMutableList() ?: mutableListOf()
            customFields = contractCreateParams.customFields
            discounts = contractCreateParams.discounts?.toMutableList() ?: mutableListOf()
            endingBefore = contractCreateParams.endingBefore
            multiplierOverridePrioritization = contractCreateParams.multiplierOverridePrioritization
            name = contractCreateParams.name
            netPaymentTermsDays = contractCreateParams.netPaymentTermsDays
            netsuiteSalesOrderId = contractCreateParams.netsuiteSalesOrderId
            overrides = contractCreateParams.overrides?.toMutableList() ?: mutableListOf()
            professionalServices =
                contractCreateParams.professionalServices?.toMutableList() ?: mutableListOf()
            rateCardAlias = contractCreateParams.rateCardAlias
            rateCardId = contractCreateParams.rateCardId
            resellerRoyalties =
                contractCreateParams.resellerRoyalties?.toMutableList() ?: mutableListOf()
            salesforceOpportunityId = contractCreateParams.salesforceOpportunityId
            scheduledCharges =
                contractCreateParams.scheduledCharges?.toMutableList() ?: mutableListOf()
            totalContractValue = contractCreateParams.totalContractValue
            transition = contractCreateParams.transition
            uniquenessKey = contractCreateParams.uniquenessKey
            usageFilter = contractCreateParams.usageFilter
            usageStatementSchedule = contractCreateParams.usageStatementSchedule
            additionalHeaders = contractCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = contractCreateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties = contractCreateParams.additionalBodyProperties.toMutableMap()
        }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /** inclusive contract start time */
        fun startingAt(startingAt: OffsetDateTime) = apply { this.startingAt = startingAt }

        /** The billing provider configuration associated with a contract. */
        fun billingProviderConfiguration(
            billingProviderConfiguration: BillingProviderConfiguration
        ) = apply { this.billingProviderConfiguration = billingProviderConfiguration }

        fun commits(commits: List<Commit>) = apply {
            this.commits.clear()
            this.commits.addAll(commits)
        }

        fun addCommit(commit: Commit) = apply { this.commits.add(commit) }

        fun credits(credits: List<Credit>) = apply {
            this.credits.clear()
            this.credits.addAll(credits)
        }

        fun addCredit(credit: Credit) = apply { this.credits.add(credit) }

        fun customFields(customFields: CustomFields) = apply { this.customFields = customFields }

        /** This field's availability is dependent on your client's configuration. */
        fun discounts(discounts: List<Discount>) = apply {
            this.discounts.clear()
            this.discounts.addAll(discounts)
        }

        /** This field's availability is dependent on your client's configuration. */
        fun addDiscount(discount: Discount) = apply { this.discounts.add(discount) }

        /** exclusive contract end time */
        fun endingBefore(endingBefore: OffsetDateTime) = apply { this.endingBefore = endingBefore }

        /**
         * Defaults to LOWEST_MULTIPLIER, which applies the greatest discount to list prices
         * automatically. EXPLICIT prioritization requires specifying priorities for each
         * multiplier; the one with the lowest priority value will be prioritized first. If tiered
         * overrides are used, prioritization must be explicit.
         */
        fun multiplierOverridePrioritization(
            multiplierOverridePrioritization: MultiplierOverridePrioritization
        ) = apply { this.multiplierOverridePrioritization = multiplierOverridePrioritization }

        fun name(name: String) = apply { this.name = name }

        fun netPaymentTermsDays(netPaymentTermsDays: Double) = apply {
            this.netPaymentTermsDays = netPaymentTermsDays
        }

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) = apply {
            this.netsuiteSalesOrderId = netsuiteSalesOrderId
        }

        fun overrides(overrides: List<Override>) = apply {
            this.overrides.clear()
            this.overrides.addAll(overrides)
        }

        fun addOverride(override: Override) = apply { this.overrides.add(override) }

        /** This field's availability is dependent on your client's configuration. */
        fun professionalServices(professionalServices: List<ProfessionalService>) = apply {
            this.professionalServices.clear()
            this.professionalServices.addAll(professionalServices)
        }

        /** This field's availability is dependent on your client's configuration. */
        fun addProfessionalService(professionalService: ProfessionalService) = apply {
            this.professionalServices.add(professionalService)
        }

        /** Selects the rate card linked to the specified alias as of the contract's start date. */
        fun rateCardAlias(rateCardAlias: String) = apply { this.rateCardAlias = rateCardAlias }

        fun rateCardId(rateCardId: String) = apply { this.rateCardId = rateCardId }

        /** This field's availability is dependent on your client's configuration. */
        fun resellerRoyalties(resellerRoyalties: List<ResellerRoyalty>) = apply {
            this.resellerRoyalties.clear()
            this.resellerRoyalties.addAll(resellerRoyalties)
        }

        /** This field's availability is dependent on your client's configuration. */
        fun addResellerRoyalty(resellerRoyalty: ResellerRoyalty) = apply {
            this.resellerRoyalties.add(resellerRoyalty)
        }

        /** This field's availability is dependent on your client's configuration. */
        fun salesforceOpportunityId(salesforceOpportunityId: String) = apply {
            this.salesforceOpportunityId = salesforceOpportunityId
        }

        fun scheduledCharges(scheduledCharges: List<ScheduledCharge>) = apply {
            this.scheduledCharges.clear()
            this.scheduledCharges.addAll(scheduledCharges)
        }

        fun addScheduledCharge(scheduledCharge: ScheduledCharge) = apply {
            this.scheduledCharges.add(scheduledCharge)
        }

        /** This field's availability is dependent on your client's configuration. */
        fun totalContractValue(totalContractValue: Double) = apply {
            this.totalContractValue = totalContractValue
        }

        fun transition(transition: Transition) = apply { this.transition = transition }

        /**
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
         */
        fun uniquenessKey(uniquenessKey: String) = apply { this.uniquenessKey = uniquenessKey }

        fun usageFilter(usageFilter: BaseUsageFilter) = apply { this.usageFilter = usageFilter }

        fun usageStatementSchedule(usageStatementSchedule: UsageStatementSchedule) = apply {
            this.usageStatementSchedule = usageStatementSchedule
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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): ContractCreateParams =
            ContractCreateParams(
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                checkNotNull(startingAt) { "`startingAt` is required but was not set" },
                billingProviderConfiguration,
                commits.toImmutable().ifEmpty { null },
                credits.toImmutable().ifEmpty { null },
                customFields,
                discounts.toImmutable().ifEmpty { null },
                endingBefore,
                multiplierOverridePrioritization,
                name,
                netPaymentTermsDays,
                netsuiteSalesOrderId,
                overrides.toImmutable().ifEmpty { null },
                professionalServices.toImmutable().ifEmpty { null },
                rateCardAlias,
                rateCardId,
                resellerRoyalties.toImmutable().ifEmpty { null },
                salesforceOpportunityId,
                scheduledCharges.toImmutable().ifEmpty { null },
                totalContractValue,
                transition,
                uniquenessKey,
                usageFilter,
                usageStatementSchedule,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    /** The billing provider configuration associated with a contract. */
    @JsonDeserialize(builder = BillingProviderConfiguration.Builder::class)
    @NoAutoDetect
    class BillingProviderConfiguration
    private constructor(
        private val billingProviderConfigurationId: String?,
        private val billingProvider: BillingProvider?,
        private val deliveryMethod: DeliveryMethod?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The Metronome ID of the billing provider configuration */
        @JsonProperty("billing_provider_configuration_id")
        fun billingProviderConfigurationId(): String? = billingProviderConfigurationId

        @JsonProperty("billing_provider") fun billingProvider(): BillingProvider? = billingProvider

        @JsonProperty("delivery_method") fun deliveryMethod(): DeliveryMethod? = deliveryMethod

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var billingProviderConfigurationId: String? = null
            private var billingProvider: BillingProvider? = null
            private var deliveryMethod: DeliveryMethod? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(billingProviderConfiguration: BillingProviderConfiguration) = apply {
                this.billingProviderConfigurationId =
                    billingProviderConfiguration.billingProviderConfigurationId
                this.billingProvider = billingProviderConfiguration.billingProvider
                this.deliveryMethod = billingProviderConfiguration.deliveryMethod
                additionalProperties(billingProviderConfiguration.additionalProperties)
            }

            /** The Metronome ID of the billing provider configuration */
            @JsonProperty("billing_provider_configuration_id")
            fun billingProviderConfigurationId(billingProviderConfigurationId: String) = apply {
                this.billingProviderConfigurationId = billingProviderConfigurationId
            }

            @JsonProperty("billing_provider")
            fun billingProvider(billingProvider: BillingProvider) = apply {
                this.billingProvider = billingProvider
            }

            @JsonProperty("delivery_method")
            fun deliveryMethod(deliveryMethod: DeliveryMethod) = apply {
                this.deliveryMethod = deliveryMethod
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): BillingProviderConfiguration =
                BillingProviderConfiguration(
                    billingProviderConfigurationId,
                    billingProvider,
                    deliveryMethod,
                    additionalProperties.toImmutable(),
                )
        }

        class BillingProvider
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingProvider && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val AWS_MARKETPLACE = of("aws_marketplace")

                @JvmField val AZURE_MARKETPLACE = of("azure_marketplace")

                @JvmField val GCP_MARKETPLACE = of("gcp_marketplace")

                @JvmField val STRIPE = of("stripe")

                @JvmField val NETSUITE = of("netsuite")

                @JvmStatic fun of(value: String) = BillingProvider(JsonField.of(value))
            }

            enum class Known {
                AWS_MARKETPLACE,
                AZURE_MARKETPLACE,
                GCP_MARKETPLACE,
                STRIPE,
                NETSUITE,
            }

            enum class Value {
                AWS_MARKETPLACE,
                AZURE_MARKETPLACE,
                GCP_MARKETPLACE,
                STRIPE,
                NETSUITE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    AWS_MARKETPLACE -> Value.AWS_MARKETPLACE
                    AZURE_MARKETPLACE -> Value.AZURE_MARKETPLACE
                    GCP_MARKETPLACE -> Value.GCP_MARKETPLACE
                    STRIPE -> Value.STRIPE
                    NETSUITE -> Value.NETSUITE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    AWS_MARKETPLACE -> Known.AWS_MARKETPLACE
                    AZURE_MARKETPLACE -> Known.AZURE_MARKETPLACE
                    GCP_MARKETPLACE -> Known.GCP_MARKETPLACE
                    STRIPE -> Known.STRIPE
                    NETSUITE -> Known.NETSUITE
                    else -> throw MetronomeInvalidDataException("Unknown BillingProvider: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class DeliveryMethod
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DeliveryMethod && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val DIRECT_TO_BILLING_PROVIDER = of("direct_to_billing_provider")

                @JvmField val AWS_SQS = of("aws_sqs")

                @JvmField val TACKLE = of("tackle")

                @JvmField val AWS_SNS = of("aws_sns")

                @JvmStatic fun of(value: String) = DeliveryMethod(JsonField.of(value))
            }

            enum class Known {
                DIRECT_TO_BILLING_PROVIDER,
                AWS_SQS,
                TACKLE,
                AWS_SNS,
            }

            enum class Value {
                DIRECT_TO_BILLING_PROVIDER,
                AWS_SQS,
                TACKLE,
                AWS_SNS,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    DIRECT_TO_BILLING_PROVIDER -> Value.DIRECT_TO_BILLING_PROVIDER
                    AWS_SQS -> Value.AWS_SQS
                    TACKLE -> Value.TACKLE
                    AWS_SNS -> Value.AWS_SNS
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    DIRECT_TO_BILLING_PROVIDER -> Known.DIRECT_TO_BILLING_PROVIDER
                    AWS_SQS -> Known.AWS_SQS
                    TACKLE -> Known.TACKLE
                    AWS_SNS -> Known.AWS_SNS
                    else -> throw MetronomeInvalidDataException("Unknown DeliveryMethod: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BillingProviderConfiguration && billingProviderConfigurationId == other.billingProviderConfigurationId && billingProvider == other.billingProvider && deliveryMethod == other.deliveryMethod && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(billingProviderConfigurationId, billingProvider, deliveryMethod, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BillingProviderConfiguration{billingProviderConfigurationId=$billingProviderConfigurationId, billingProvider=$billingProvider, deliveryMethod=$deliveryMethod, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = Commit.Builder::class)
    @NoAutoDetect
    class Commit
    private constructor(
        private val type: Type?,
        private val rateType: RateType?,
        private val name: String?,
        private val productId: String?,
        private val accessSchedule: AccessSchedule?,
        private val invoiceSchedule: InvoiceSchedule?,
        private val amount: Double?,
        private val description: String?,
        private val rolloverFraction: Double?,
        private val priority: Double?,
        private val applicableProductIds: List<String>?,
        private val applicableProductTags: List<String>?,
        private val netsuiteSalesOrderId: String?,
        private val customFields: CustomFields?,
        private val temporaryId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("type") fun type(): Type? = type

        @JsonProperty("rate_type") fun rateType(): RateType? = rateType

        /** displayed on invoices */
        @JsonProperty("name") fun name(): String? = name

        @JsonProperty("product_id") fun productId(): String? = productId

        /**
         * Required: Schedule for distributing the commit to the customer. For "POSTPAID" commits
         * only one schedule item is allowed and amount must match invoice_schedule total.
         */
        @JsonProperty("access_schedule") fun accessSchedule(): AccessSchedule? = accessSchedule

        /**
         * Required for "POSTPAID" commits: the true up invoice will be generated at this time and
         * only one schedule item is allowed; the total must match access_schedule amount. Optional
         * for "PREPAID" commits: if not provided, this will be a "complimentary" commit with no
         * invoice.
         */
        @JsonProperty("invoice_schedule") fun invoiceSchedule(): InvoiceSchedule? = invoiceSchedule

        /** (DEPRECATED) Use access_schedule and invoice_schedule instead. */
        @JsonProperty("amount") fun amount(): Double? = amount

        /** Used only in UI/API. It is not exposed to end customers. */
        @JsonProperty("description") fun description(): String? = description

        /** Fraction of unused segments that will be rolled over. Must be between 0 and 1. */
        @JsonProperty("rollover_fraction") fun rolloverFraction(): Double? = rolloverFraction

        /** If multiple commits are applicable, the one with the lower priority will apply first. */
        @JsonProperty("priority") fun priority(): Double? = priority

        /**
         * Which products the commit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the commit applies to all products.
         */
        @JsonProperty("applicable_product_ids")
        fun applicableProductIds(): List<String>? = applicableProductIds

        /**
         * Which tags the commit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the commit applies to all products.
         */
        @JsonProperty("applicable_product_tags")
        fun applicableProductTags(): List<String>? = applicableProductTags

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("netsuite_sales_order_id")
        fun netsuiteSalesOrderId(): String? = netsuiteSalesOrderId

        @JsonProperty("custom_fields") fun customFields(): CustomFields? = customFields

        /**
         * A temporary ID for the commit that can be used to reference the commit for commit
         * specific overrides.
         */
        @JsonProperty("temporary_id") fun temporaryId(): String? = temporaryId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var type: Type? = null
            private var rateType: RateType? = null
            private var name: String? = null
            private var productId: String? = null
            private var accessSchedule: AccessSchedule? = null
            private var invoiceSchedule: InvoiceSchedule? = null
            private var amount: Double? = null
            private var description: String? = null
            private var rolloverFraction: Double? = null
            private var priority: Double? = null
            private var applicableProductIds: List<String>? = null
            private var applicableProductTags: List<String>? = null
            private var netsuiteSalesOrderId: String? = null
            private var customFields: CustomFields? = null
            private var temporaryId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(commit: Commit) = apply {
                this.type = commit.type
                this.rateType = commit.rateType
                this.name = commit.name
                this.productId = commit.productId
                this.accessSchedule = commit.accessSchedule
                this.invoiceSchedule = commit.invoiceSchedule
                this.amount = commit.amount
                this.description = commit.description
                this.rolloverFraction = commit.rolloverFraction
                this.priority = commit.priority
                this.applicableProductIds = commit.applicableProductIds
                this.applicableProductTags = commit.applicableProductTags
                this.netsuiteSalesOrderId = commit.netsuiteSalesOrderId
                this.customFields = commit.customFields
                this.temporaryId = commit.temporaryId
                additionalProperties(commit.additionalProperties)
            }

            @JsonProperty("type") fun type(type: Type) = apply { this.type = type }

            @JsonProperty("rate_type")
            fun rateType(rateType: RateType) = apply { this.rateType = rateType }

            /** displayed on invoices */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            @JsonProperty("product_id")
            fun productId(productId: String) = apply { this.productId = productId }

            /**
             * Required: Schedule for distributing the commit to the customer. For "POSTPAID"
             * commits only one schedule item is allowed and amount must match invoice_schedule
             * total.
             */
            @JsonProperty("access_schedule")
            fun accessSchedule(accessSchedule: AccessSchedule) = apply {
                this.accessSchedule = accessSchedule
            }

            /**
             * Required for "POSTPAID" commits: the true up invoice will be generated at this time
             * and only one schedule item is allowed; the total must match access_schedule amount.
             * Optional for "PREPAID" commits: if not provided, this will be a "complimentary"
             * commit with no invoice.
             */
            @JsonProperty("invoice_schedule")
            fun invoiceSchedule(invoiceSchedule: InvoiceSchedule) = apply {
                this.invoiceSchedule = invoiceSchedule
            }

            /** (DEPRECATED) Use access_schedule and invoice_schedule instead. */
            @JsonProperty("amount") fun amount(amount: Double) = apply { this.amount = amount }

            /** Used only in UI/API. It is not exposed to end customers. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /** Fraction of unused segments that will be rolled over. Must be between 0 and 1. */
            @JsonProperty("rollover_fraction")
            fun rolloverFraction(rolloverFraction: Double) = apply {
                this.rolloverFraction = rolloverFraction
            }

            /**
             * If multiple commits are applicable, the one with the lower priority will apply first.
             */
            @JsonProperty("priority")
            fun priority(priority: Double) = apply { this.priority = priority }

            /**
             * Which products the commit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the commit applies to all products.
             */
            @JsonProperty("applicable_product_ids")
            fun applicableProductIds(applicableProductIds: List<String>) = apply {
                this.applicableProductIds = applicableProductIds
            }

            /**
             * Which tags the commit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the commit applies to all products.
             */
            @JsonProperty("applicable_product_tags")
            fun applicableProductTags(applicableProductTags: List<String>) = apply {
                this.applicableProductTags = applicableProductTags
            }

            /** This field's availability is dependent on your client's configuration. */
            @JsonProperty("netsuite_sales_order_id")
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) = apply {
                this.netsuiteSalesOrderId = netsuiteSalesOrderId
            }

            @JsonProperty("custom_fields")
            fun customFields(customFields: CustomFields) = apply {
                this.customFields = customFields
            }

            /**
             * A temporary ID for the commit that can be used to reference the commit for commit
             * specific overrides.
             */
            @JsonProperty("temporary_id")
            fun temporaryId(temporaryId: String) = apply { this.temporaryId = temporaryId }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Commit =
                Commit(
                    checkNotNull(type) { "`type` is required but was not set" },
                    rateType,
                    name,
                    checkNotNull(productId) { "`productId` is required but was not set" },
                    accessSchedule,
                    invoiceSchedule,
                    amount,
                    description,
                    rolloverFraction,
                    priority,
                    applicableProductIds?.toImmutable(),
                    applicableProductTags?.toImmutable(),
                    netsuiteSalesOrderId,
                    customFields,
                    temporaryId,
                    additionalProperties.toImmutable(),
                )
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val PREPAID = of("PREPAID")

                @JvmField val POSTPAID = of("POSTPAID")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                PREPAID,
                POSTPAID,
            }

            enum class Value {
                PREPAID,
                POSTPAID,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    PREPAID -> Value.PREPAID
                    POSTPAID -> Value.POSTPAID
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    PREPAID -> Known.PREPAID
                    POSTPAID -> Known.POSTPAID
                    else -> throw MetronomeInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        /**
         * Required: Schedule for distributing the commit to the customer. For "POSTPAID" commits
         * only one schedule item is allowed and amount must match invoice_schedule total.
         */
        @JsonDeserialize(builder = AccessSchedule.Builder::class)
        @NoAutoDetect
        class AccessSchedule
        private constructor(
            private val creditTypeId: String?,
            private val scheduleItems: List<ScheduleItem>?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            @JsonProperty("credit_type_id") fun creditTypeId(): String? = creditTypeId

            @JsonProperty("schedule_items") fun scheduleItems(): List<ScheduleItem>? = scheduleItems

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var creditTypeId: String? = null
                private var scheduleItems: List<ScheduleItem>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(accessSchedule: AccessSchedule) = apply {
                    this.creditTypeId = accessSchedule.creditTypeId
                    this.scheduleItems = accessSchedule.scheduleItems
                    additionalProperties(accessSchedule.additionalProperties)
                }

                @JsonProperty("credit_type_id")
                fun creditTypeId(creditTypeId: String) = apply { this.creditTypeId = creditTypeId }

                @JsonProperty("schedule_items")
                fun scheduleItems(scheduleItems: List<ScheduleItem>) = apply {
                    this.scheduleItems = scheduleItems
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): AccessSchedule =
                    AccessSchedule(
                        creditTypeId,
                        checkNotNull(scheduleItems) {
                                "`scheduleItems` is required but was not set"
                            }
                            .toImmutable(),
                        additionalProperties.toImmutable(),
                    )
            }

            @JsonDeserialize(builder = ScheduleItem.Builder::class)
            @NoAutoDetect
            class ScheduleItem
            private constructor(
                private val amount: Double?,
                private val startingAt: OffsetDateTime?,
                private val endingBefore: OffsetDateTime?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                @JsonProperty("amount") fun amount(): Double? = amount

                /** RFC 3339 timestamp (inclusive) */
                @JsonProperty("starting_at") fun startingAt(): OffsetDateTime? = startingAt

                /** RFC 3339 timestamp (exclusive) */
                @JsonProperty("ending_before") fun endingBefore(): OffsetDateTime? = endingBefore

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: Double? = null
                    private var startingAt: OffsetDateTime? = null
                    private var endingBefore: OffsetDateTime? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(scheduleItem: ScheduleItem) = apply {
                        this.amount = scheduleItem.amount
                        this.startingAt = scheduleItem.startingAt
                        this.endingBefore = scheduleItem.endingBefore
                        additionalProperties(scheduleItem.additionalProperties)
                    }

                    @JsonProperty("amount")
                    fun amount(amount: Double) = apply { this.amount = amount }

                    /** RFC 3339 timestamp (inclusive) */
                    @JsonProperty("starting_at")
                    fun startingAt(startingAt: OffsetDateTime) = apply {
                        this.startingAt = startingAt
                    }

                    /** RFC 3339 timestamp (exclusive) */
                    @JsonProperty("ending_before")
                    fun endingBefore(endingBefore: OffsetDateTime) = apply {
                        this.endingBefore = endingBefore
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): ScheduleItem =
                        ScheduleItem(
                            checkNotNull(amount) { "`amount` is required but was not set" },
                            checkNotNull(startingAt) { "`startingAt` is required but was not set" },
                            checkNotNull(endingBefore) {
                                "`endingBefore` is required but was not set"
                            },
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ScheduleItem && amount == other.amount && startingAt == other.startingAt && endingBefore == other.endingBefore && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, startingAt, endingBefore, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ScheduleItem{amount=$amount, startingAt=$startingAt, endingBefore=$endingBefore, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AccessSchedule && creditTypeId == other.creditTypeId && scheduleItems == other.scheduleItems && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(creditTypeId, scheduleItems, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AccessSchedule{creditTypeId=$creditTypeId, scheduleItems=$scheduleItems, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = CustomFields.Builder::class)
        @NoAutoDetect
        class CustomFields
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(customFields: CustomFields) = apply {
                    additionalProperties(customFields.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CustomFields && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
        }

        /**
         * Required for "POSTPAID" commits: the true up invoice will be generated at this time and
         * only one schedule item is allowed; the total must match access_schedule amount. Optional
         * for "PREPAID" commits: if not provided, this will be a "complimentary" commit with no
         * invoice.
         */
        @JsonDeserialize(builder = InvoiceSchedule.Builder::class)
        @NoAutoDetect
        class InvoiceSchedule
        private constructor(
            private val creditTypeId: String?,
            private val scheduleItems: List<ScheduleItem>?,
            private val recurringSchedule: RecurringSchedule?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** Defaults to USD if not passed. Only USD is supported at this time. */
            @JsonProperty("credit_type_id") fun creditTypeId(): String? = creditTypeId

            /** Either provide amount or provide both unit_price and quantity. */
            @JsonProperty("schedule_items") fun scheduleItems(): List<ScheduleItem>? = scheduleItems

            /**
             * Enter the unit price and quantity for the charge or instead only send the amount. If
             * amount is sent, the unit price is assumed to be the amount and quantity is inferred
             * to be 1.
             */
            @JsonProperty("recurring_schedule")
            fun recurringSchedule(): RecurringSchedule? = recurringSchedule

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var creditTypeId: String? = null
                private var scheduleItems: List<ScheduleItem>? = null
                private var recurringSchedule: RecurringSchedule? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(invoiceSchedule: InvoiceSchedule) = apply {
                    this.creditTypeId = invoiceSchedule.creditTypeId
                    this.scheduleItems = invoiceSchedule.scheduleItems
                    this.recurringSchedule = invoiceSchedule.recurringSchedule
                    additionalProperties(invoiceSchedule.additionalProperties)
                }

                /** Defaults to USD if not passed. Only USD is supported at this time. */
                @JsonProperty("credit_type_id")
                fun creditTypeId(creditTypeId: String) = apply { this.creditTypeId = creditTypeId }

                /** Either provide amount or provide both unit_price and quantity. */
                @JsonProperty("schedule_items")
                fun scheduleItems(scheduleItems: List<ScheduleItem>) = apply {
                    this.scheduleItems = scheduleItems
                }

                /**
                 * Enter the unit price and quantity for the charge or instead only send the amount.
                 * If amount is sent, the unit price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                @JsonProperty("recurring_schedule")
                fun recurringSchedule(recurringSchedule: RecurringSchedule) = apply {
                    this.recurringSchedule = recurringSchedule
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InvoiceSchedule =
                    InvoiceSchedule(
                        creditTypeId,
                        scheduleItems?.toImmutable(),
                        recurringSchedule,
                        additionalProperties.toImmutable(),
                    )
            }

            /**
             * Enter the unit price and quantity for the charge or instead only send the amount. If
             * amount is sent, the unit price is assumed to be the amount and quantity is inferred
             * to be 1.
             */
            @JsonDeserialize(builder = RecurringSchedule.Builder::class)
            @NoAutoDetect
            class RecurringSchedule
            private constructor(
                private val startingAt: OffsetDateTime?,
                private val endingBefore: OffsetDateTime?,
                private val frequency: Frequency?,
                private val unitPrice: Double?,
                private val quantity: Double?,
                private val amount: Double?,
                private val amountDistribution: AmountDistribution?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /** RFC 3339 timestamp (inclusive). */
                @JsonProperty("starting_at") fun startingAt(): OffsetDateTime? = startingAt

                /** RFC 3339 timestamp (exclusive). */
                @JsonProperty("ending_before") fun endingBefore(): OffsetDateTime? = endingBefore

                @JsonProperty("frequency") fun frequency(): Frequency? = frequency

                /**
                 * Unit price for the charge. Will be multiplied by quantity to determine the amount
                 * and must be specified with quantity. If specified amount cannot be provided.
                 */
                @JsonProperty("unit_price") fun unitPrice(): Double? = unitPrice

                /**
                 * Quantity for the charge. Will be multiplied by unit_price to determine the amount
                 * and must be specified with unit_price. If specified amount cannot be provided.
                 */
                @JsonProperty("quantity") fun quantity(): Double? = quantity

                /**
                 * Amount for the charge. Can be provided instead of unit_price and quantity. If
                 * amount is sent, the unit_price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                @JsonProperty("amount") fun amount(): Double? = amount

                @JsonProperty("amount_distribution")
                fun amountDistribution(): AmountDistribution? = amountDistribution

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var startingAt: OffsetDateTime? = null
                    private var endingBefore: OffsetDateTime? = null
                    private var frequency: Frequency? = null
                    private var unitPrice: Double? = null
                    private var quantity: Double? = null
                    private var amount: Double? = null
                    private var amountDistribution: AmountDistribution? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(recurringSchedule: RecurringSchedule) = apply {
                        this.startingAt = recurringSchedule.startingAt
                        this.endingBefore = recurringSchedule.endingBefore
                        this.frequency = recurringSchedule.frequency
                        this.unitPrice = recurringSchedule.unitPrice
                        this.quantity = recurringSchedule.quantity
                        this.amount = recurringSchedule.amount
                        this.amountDistribution = recurringSchedule.amountDistribution
                        additionalProperties(recurringSchedule.additionalProperties)
                    }

                    /** RFC 3339 timestamp (inclusive). */
                    @JsonProperty("starting_at")
                    fun startingAt(startingAt: OffsetDateTime) = apply {
                        this.startingAt = startingAt
                    }

                    /** RFC 3339 timestamp (exclusive). */
                    @JsonProperty("ending_before")
                    fun endingBefore(endingBefore: OffsetDateTime) = apply {
                        this.endingBefore = endingBefore
                    }

                    @JsonProperty("frequency")
                    fun frequency(frequency: Frequency) = apply { this.frequency = frequency }

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    @JsonProperty("unit_price")
                    fun unitPrice(unitPrice: Double) = apply { this.unitPrice = unitPrice }

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    @JsonProperty("quantity")
                    fun quantity(quantity: Double) = apply { this.quantity = quantity }

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    @JsonProperty("amount")
                    fun amount(amount: Double) = apply { this.amount = amount }

                    @JsonProperty("amount_distribution")
                    fun amountDistribution(amountDistribution: AmountDistribution) = apply {
                        this.amountDistribution = amountDistribution
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): RecurringSchedule =
                        RecurringSchedule(
                            checkNotNull(startingAt) { "`startingAt` is required but was not set" },
                            checkNotNull(endingBefore) {
                                "`endingBefore` is required but was not set"
                            },
                            checkNotNull(frequency) { "`frequency` is required but was not set" },
                            unitPrice,
                            quantity,
                            amount,
                            checkNotNull(amountDistribution) {
                                "`amountDistribution` is required but was not set"
                            },
                            additionalProperties.toImmutable(),
                        )
                }

                class AmountDistribution
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AmountDistribution && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val DIVIDED = of("DIVIDED")

                        @JvmField val DIVIDED_ROUNDED = of("DIVIDED_ROUNDED")

                        @JvmField val EACH = of("EACH")

                        @JvmStatic fun of(value: String) = AmountDistribution(JsonField.of(value))
                    }

                    enum class Known {
                        DIVIDED,
                        DIVIDED_ROUNDED,
                        EACH,
                    }

                    enum class Value {
                        DIVIDED,
                        DIVIDED_ROUNDED,
                        EACH,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            DIVIDED -> Value.DIVIDED
                            DIVIDED_ROUNDED -> Value.DIVIDED_ROUNDED
                            EACH -> Value.EACH
                            else -> Value._UNKNOWN
                        }

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

                    fun asString(): String = _value().asStringOrThrow()
                }

                class Frequency
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Frequency && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val MONTHLY = of("MONTHLY")

                        @JvmField val QUARTERLY = of("QUARTERLY")

                        @JvmField val SEMI_ANNUAL = of("SEMI_ANNUAL")

                        @JvmField val ANNUAL = of("ANNUAL")

                        @JvmStatic fun of(value: String) = Frequency(JsonField.of(value))
                    }

                    enum class Known {
                        MONTHLY,
                        QUARTERLY,
                        SEMI_ANNUAL,
                        ANNUAL,
                    }

                    enum class Value {
                        MONTHLY,
                        QUARTERLY,
                        SEMI_ANNUAL,
                        ANNUAL,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            MONTHLY -> Value.MONTHLY
                            QUARTERLY -> Value.QUARTERLY
                            SEMI_ANNUAL -> Value.SEMI_ANNUAL
                            ANNUAL -> Value.ANNUAL
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            MONTHLY -> Known.MONTHLY
                            QUARTERLY -> Known.QUARTERLY
                            SEMI_ANNUAL -> Known.SEMI_ANNUAL
                            ANNUAL -> Known.ANNUAL
                            else -> throw MetronomeInvalidDataException("Unknown Frequency: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is RecurringSchedule && startingAt == other.startingAt && endingBefore == other.endingBefore && frequency == other.frequency && unitPrice == other.unitPrice && quantity == other.quantity && amount == other.amount && amountDistribution == other.amountDistribution && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(startingAt, endingBefore, frequency, unitPrice, quantity, amount, amountDistribution, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "RecurringSchedule{startingAt=$startingAt, endingBefore=$endingBefore, frequency=$frequency, unitPrice=$unitPrice, quantity=$quantity, amount=$amount, amountDistribution=$amountDistribution, additionalProperties=$additionalProperties}"
            }

            @JsonDeserialize(builder = ScheduleItem.Builder::class)
            @NoAutoDetect
            class ScheduleItem
            private constructor(
                private val unitPrice: Double?,
                private val quantity: Double?,
                private val amount: Double?,
                private val timestamp: OffsetDateTime?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /**
                 * Unit price for the charge. Will be multiplied by quantity to determine the amount
                 * and must be specified with quantity. If specified amount cannot be provided.
                 */
                @JsonProperty("unit_price") fun unitPrice(): Double? = unitPrice

                /**
                 * Quantity for the charge. Will be multiplied by unit_price to determine the amount
                 * and must be specified with unit_price. If specified amount cannot be provided.
                 */
                @JsonProperty("quantity") fun quantity(): Double? = quantity

                /**
                 * Amount for the charge. Can be provided instead of unit_price and quantity. If
                 * amount is sent, the unit_price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                @JsonProperty("amount") fun amount(): Double? = amount

                /** timestamp of the scheduled event */
                @JsonProperty("timestamp") fun timestamp(): OffsetDateTime? = timestamp

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var unitPrice: Double? = null
                    private var quantity: Double? = null
                    private var amount: Double? = null
                    private var timestamp: OffsetDateTime? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(scheduleItem: ScheduleItem) = apply {
                        this.unitPrice = scheduleItem.unitPrice
                        this.quantity = scheduleItem.quantity
                        this.amount = scheduleItem.amount
                        this.timestamp = scheduleItem.timestamp
                        additionalProperties(scheduleItem.additionalProperties)
                    }

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    @JsonProperty("unit_price")
                    fun unitPrice(unitPrice: Double) = apply { this.unitPrice = unitPrice }

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    @JsonProperty("quantity")
                    fun quantity(quantity: Double) = apply { this.quantity = quantity }

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    @JsonProperty("amount")
                    fun amount(amount: Double) = apply { this.amount = amount }

                    /** timestamp of the scheduled event */
                    @JsonProperty("timestamp")
                    fun timestamp(timestamp: OffsetDateTime) = apply { this.timestamp = timestamp }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): ScheduleItem =
                        ScheduleItem(
                            unitPrice,
                            quantity,
                            amount,
                            checkNotNull(timestamp) { "`timestamp` is required but was not set" },
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ScheduleItem && unitPrice == other.unitPrice && quantity == other.quantity && amount == other.amount && timestamp == other.timestamp && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(unitPrice, quantity, amount, timestamp, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ScheduleItem{unitPrice=$unitPrice, quantity=$quantity, amount=$amount, timestamp=$timestamp, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoiceSchedule && creditTypeId == other.creditTypeId && scheduleItems == other.scheduleItems && recurringSchedule == other.recurringSchedule && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(creditTypeId, scheduleItems, recurringSchedule, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InvoiceSchedule{creditTypeId=$creditTypeId, scheduleItems=$scheduleItems, recurringSchedule=$recurringSchedule, additionalProperties=$additionalProperties}"
        }

        class RateType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RateType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val COMMIT_RATE = of("COMMIT_RATE")

                @JvmField val COMMIT_RATE = of("commit_rate")

                @JvmField val LIST_RATE = of("LIST_RATE")

                @JvmField val LIST_RATE = of("list_rate")

                @JvmStatic fun of(value: String) = RateType(JsonField.of(value))
            }

            enum class Known {
                COMMIT_RATE,
                COMMIT_RATE,
                LIST_RATE,
                LIST_RATE,
            }

            enum class Value {
                COMMIT_RATE,
                COMMIT_RATE,
                LIST_RATE,
                LIST_RATE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    COMMIT_RATE -> Value.COMMIT_RATE
                    COMMIT_RATE -> Value.COMMIT_RATE
                    LIST_RATE -> Value.LIST_RATE
                    LIST_RATE -> Value.LIST_RATE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    COMMIT_RATE -> Known.COMMIT_RATE
                    COMMIT_RATE -> Known.COMMIT_RATE
                    LIST_RATE -> Known.LIST_RATE
                    LIST_RATE -> Known.LIST_RATE
                    else -> throw MetronomeInvalidDataException("Unknown RateType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Commit && type == other.type && rateType == other.rateType && name == other.name && productId == other.productId && accessSchedule == other.accessSchedule && invoiceSchedule == other.invoiceSchedule && amount == other.amount && description == other.description && rolloverFraction == other.rolloverFraction && priority == other.priority && applicableProductIds == other.applicableProductIds && applicableProductTags == other.applicableProductTags && netsuiteSalesOrderId == other.netsuiteSalesOrderId && customFields == other.customFields && temporaryId == other.temporaryId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(type, rateType, name, productId, accessSchedule, invoiceSchedule, amount, description, rolloverFraction, priority, applicableProductIds, applicableProductTags, netsuiteSalesOrderId, customFields, temporaryId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Commit{type=$type, rateType=$rateType, name=$name, productId=$productId, accessSchedule=$accessSchedule, invoiceSchedule=$invoiceSchedule, amount=$amount, description=$description, rolloverFraction=$rolloverFraction, priority=$priority, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, netsuiteSalesOrderId=$netsuiteSalesOrderId, customFields=$customFields, temporaryId=$temporaryId, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = Credit.Builder::class)
    @NoAutoDetect
    class Credit
    private constructor(
        private val name: String?,
        private val productId: String?,
        private val accessSchedule: AccessSchedule?,
        private val description: String?,
        private val applicableProductIds: List<String>?,
        private val applicableProductTags: List<String>?,
        private val netsuiteSalesOrderId: String?,
        private val priority: Double?,
        private val customFields: CustomFields?,
        private val rateType: RateType?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** displayed on invoices */
        @JsonProperty("name") fun name(): String? = name

        @JsonProperty("product_id") fun productId(): String? = productId

        /** Schedule for distributing the credit to the customer. */
        @JsonProperty("access_schedule") fun accessSchedule(): AccessSchedule? = accessSchedule

        /** Used only in UI/API. It is not exposed to end customers. */
        @JsonProperty("description") fun description(): String? = description

        /**
         * Which products the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         */
        @JsonProperty("applicable_product_ids")
        fun applicableProductIds(): List<String>? = applicableProductIds

        /**
         * Which tags the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         */
        @JsonProperty("applicable_product_tags")
        fun applicableProductTags(): List<String>? = applicableProductTags

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("netsuite_sales_order_id")
        fun netsuiteSalesOrderId(): String? = netsuiteSalesOrderId

        /** If multiple credits are applicable, the one with the lower priority will apply first. */
        @JsonProperty("priority") fun priority(): Double? = priority

        @JsonProperty("custom_fields") fun customFields(): CustomFields? = customFields

        @JsonProperty("rate_type") fun rateType(): RateType? = rateType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: String? = null
            private var productId: String? = null
            private var accessSchedule: AccessSchedule? = null
            private var description: String? = null
            private var applicableProductIds: List<String>? = null
            private var applicableProductTags: List<String>? = null
            private var netsuiteSalesOrderId: String? = null
            private var priority: Double? = null
            private var customFields: CustomFields? = null
            private var rateType: RateType? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(credit: Credit) = apply {
                this.name = credit.name
                this.productId = credit.productId
                this.accessSchedule = credit.accessSchedule
                this.description = credit.description
                this.applicableProductIds = credit.applicableProductIds
                this.applicableProductTags = credit.applicableProductTags
                this.netsuiteSalesOrderId = credit.netsuiteSalesOrderId
                this.priority = credit.priority
                this.customFields = credit.customFields
                this.rateType = credit.rateType
                additionalProperties(credit.additionalProperties)
            }

            /** displayed on invoices */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            @JsonProperty("product_id")
            fun productId(productId: String) = apply { this.productId = productId }

            /** Schedule for distributing the credit to the customer. */
            @JsonProperty("access_schedule")
            fun accessSchedule(accessSchedule: AccessSchedule) = apply {
                this.accessSchedule = accessSchedule
            }

            /** Used only in UI/API. It is not exposed to end customers. */
            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            /**
             * Which products the credit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the credit applies to all products.
             */
            @JsonProperty("applicable_product_ids")
            fun applicableProductIds(applicableProductIds: List<String>) = apply {
                this.applicableProductIds = applicableProductIds
            }

            /**
             * Which tags the credit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the credit applies to all products.
             */
            @JsonProperty("applicable_product_tags")
            fun applicableProductTags(applicableProductTags: List<String>) = apply {
                this.applicableProductTags = applicableProductTags
            }

            /** This field's availability is dependent on your client's configuration. */
            @JsonProperty("netsuite_sales_order_id")
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) = apply {
                this.netsuiteSalesOrderId = netsuiteSalesOrderId
            }

            /**
             * If multiple credits are applicable, the one with the lower priority will apply first.
             */
            @JsonProperty("priority")
            fun priority(priority: Double) = apply { this.priority = priority }

            @JsonProperty("custom_fields")
            fun customFields(customFields: CustomFields) = apply {
                this.customFields = customFields
            }

            @JsonProperty("rate_type")
            fun rateType(rateType: RateType) = apply { this.rateType = rateType }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Credit =
                Credit(
                    name,
                    checkNotNull(productId) { "`productId` is required but was not set" },
                    checkNotNull(accessSchedule) { "`accessSchedule` is required but was not set" },
                    description,
                    applicableProductIds?.toImmutable(),
                    applicableProductTags?.toImmutable(),
                    netsuiteSalesOrderId,
                    priority,
                    customFields,
                    rateType,
                    additionalProperties.toImmutable(),
                )
        }

        /** Schedule for distributing the credit to the customer. */
        @JsonDeserialize(builder = AccessSchedule.Builder::class)
        @NoAutoDetect
        class AccessSchedule
        private constructor(
            private val creditTypeId: String?,
            private val scheduleItems: List<ScheduleItem>?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            @JsonProperty("credit_type_id") fun creditTypeId(): String? = creditTypeId

            @JsonProperty("schedule_items") fun scheduleItems(): List<ScheduleItem>? = scheduleItems

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var creditTypeId: String? = null
                private var scheduleItems: List<ScheduleItem>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(accessSchedule: AccessSchedule) = apply {
                    this.creditTypeId = accessSchedule.creditTypeId
                    this.scheduleItems = accessSchedule.scheduleItems
                    additionalProperties(accessSchedule.additionalProperties)
                }

                @JsonProperty("credit_type_id")
                fun creditTypeId(creditTypeId: String) = apply { this.creditTypeId = creditTypeId }

                @JsonProperty("schedule_items")
                fun scheduleItems(scheduleItems: List<ScheduleItem>) = apply {
                    this.scheduleItems = scheduleItems
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): AccessSchedule =
                    AccessSchedule(
                        creditTypeId,
                        checkNotNull(scheduleItems) {
                                "`scheduleItems` is required but was not set"
                            }
                            .toImmutable(),
                        additionalProperties.toImmutable(),
                    )
            }

            @JsonDeserialize(builder = ScheduleItem.Builder::class)
            @NoAutoDetect
            class ScheduleItem
            private constructor(
                private val amount: Double?,
                private val startingAt: OffsetDateTime?,
                private val endingBefore: OffsetDateTime?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                @JsonProperty("amount") fun amount(): Double? = amount

                /** RFC 3339 timestamp (inclusive) */
                @JsonProperty("starting_at") fun startingAt(): OffsetDateTime? = startingAt

                /** RFC 3339 timestamp (exclusive) */
                @JsonProperty("ending_before") fun endingBefore(): OffsetDateTime? = endingBefore

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: Double? = null
                    private var startingAt: OffsetDateTime? = null
                    private var endingBefore: OffsetDateTime? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(scheduleItem: ScheduleItem) = apply {
                        this.amount = scheduleItem.amount
                        this.startingAt = scheduleItem.startingAt
                        this.endingBefore = scheduleItem.endingBefore
                        additionalProperties(scheduleItem.additionalProperties)
                    }

                    @JsonProperty("amount")
                    fun amount(amount: Double) = apply { this.amount = amount }

                    /** RFC 3339 timestamp (inclusive) */
                    @JsonProperty("starting_at")
                    fun startingAt(startingAt: OffsetDateTime) = apply {
                        this.startingAt = startingAt
                    }

                    /** RFC 3339 timestamp (exclusive) */
                    @JsonProperty("ending_before")
                    fun endingBefore(endingBefore: OffsetDateTime) = apply {
                        this.endingBefore = endingBefore
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): ScheduleItem =
                        ScheduleItem(
                            checkNotNull(amount) { "`amount` is required but was not set" },
                            checkNotNull(startingAt) { "`startingAt` is required but was not set" },
                            checkNotNull(endingBefore) {
                                "`endingBefore` is required but was not set"
                            },
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ScheduleItem && amount == other.amount && startingAt == other.startingAt && endingBefore == other.endingBefore && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, startingAt, endingBefore, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ScheduleItem{amount=$amount, startingAt=$startingAt, endingBefore=$endingBefore, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AccessSchedule && creditTypeId == other.creditTypeId && scheduleItems == other.scheduleItems && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(creditTypeId, scheduleItems, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AccessSchedule{creditTypeId=$creditTypeId, scheduleItems=$scheduleItems, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = CustomFields.Builder::class)
        @NoAutoDetect
        class CustomFields
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(customFields: CustomFields) = apply {
                    additionalProperties(customFields.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CustomFields && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
        }

        class RateType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RateType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val COMMIT_RATE = of("COMMIT_RATE")

                @JvmField val COMMIT_RATE = of("commit_rate")

                @JvmField val LIST_RATE = of("LIST_RATE")

                @JvmField val LIST_RATE = of("list_rate")

                @JvmStatic fun of(value: String) = RateType(JsonField.of(value))
            }

            enum class Known {
                COMMIT_RATE,
                COMMIT_RATE,
                LIST_RATE,
                LIST_RATE,
            }

            enum class Value {
                COMMIT_RATE,
                COMMIT_RATE,
                LIST_RATE,
                LIST_RATE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    COMMIT_RATE -> Value.COMMIT_RATE
                    COMMIT_RATE -> Value.COMMIT_RATE
                    LIST_RATE -> Value.LIST_RATE
                    LIST_RATE -> Value.LIST_RATE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    COMMIT_RATE -> Known.COMMIT_RATE
                    COMMIT_RATE -> Known.COMMIT_RATE
                    LIST_RATE -> Known.LIST_RATE
                    LIST_RATE -> Known.LIST_RATE
                    else -> throw MetronomeInvalidDataException("Unknown RateType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Credit && name == other.name && productId == other.productId && accessSchedule == other.accessSchedule && description == other.description && applicableProductIds == other.applicableProductIds && applicableProductTags == other.applicableProductTags && netsuiteSalesOrderId == other.netsuiteSalesOrderId && priority == other.priority && customFields == other.customFields && rateType == other.rateType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, productId, accessSchedule, description, applicableProductIds, applicableProductTags, netsuiteSalesOrderId, priority, customFields, rateType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Credit{name=$name, productId=$productId, accessSchedule=$accessSchedule, description=$description, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, netsuiteSalesOrderId=$netsuiteSalesOrderId, priority=$priority, customFields=$customFields, rateType=$rateType, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = CustomFields.Builder::class)
    @NoAutoDetect
    class CustomFields
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customFields: CustomFields) = apply {
                additionalProperties(customFields.additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomFields && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = Discount.Builder::class)
    @NoAutoDetect
    class Discount
    private constructor(
        private val productId: String?,
        private val name: String?,
        private val schedule: Schedule?,
        private val netsuiteSalesOrderId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("product_id") fun productId(): String? = productId

        /** displayed on invoices */
        @JsonProperty("name") fun name(): String? = name

        /** Must provide either schedule_items or recurring_schedule. */
        @JsonProperty("schedule") fun schedule(): Schedule? = schedule

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("netsuite_sales_order_id")
        fun netsuiteSalesOrderId(): String? = netsuiteSalesOrderId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var productId: String? = null
            private var name: String? = null
            private var schedule: Schedule? = null
            private var netsuiteSalesOrderId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(discount: Discount) = apply {
                this.productId = discount.productId
                this.name = discount.name
                this.schedule = discount.schedule
                this.netsuiteSalesOrderId = discount.netsuiteSalesOrderId
                additionalProperties(discount.additionalProperties)
            }

            @JsonProperty("product_id")
            fun productId(productId: String) = apply { this.productId = productId }

            /** displayed on invoices */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** Must provide either schedule_items or recurring_schedule. */
            @JsonProperty("schedule")
            fun schedule(schedule: Schedule) = apply { this.schedule = schedule }

            /** This field's availability is dependent on your client's configuration. */
            @JsonProperty("netsuite_sales_order_id")
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) = apply {
                this.netsuiteSalesOrderId = netsuiteSalesOrderId
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Discount =
                Discount(
                    checkNotNull(productId) { "`productId` is required but was not set" },
                    name,
                    checkNotNull(schedule) { "`schedule` is required but was not set" },
                    netsuiteSalesOrderId,
                    additionalProperties.toImmutable(),
                )
        }

        /** Must provide either schedule_items or recurring_schedule. */
        @JsonDeserialize(builder = Schedule.Builder::class)
        @NoAutoDetect
        class Schedule
        private constructor(
            private val creditTypeId: String?,
            private val scheduleItems: List<ScheduleItem>?,
            private val recurringSchedule: RecurringSchedule?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** Defaults to USD if not passed. Only USD is supported at this time. */
            @JsonProperty("credit_type_id") fun creditTypeId(): String? = creditTypeId

            /** Either provide amount or provide both unit_price and quantity. */
            @JsonProperty("schedule_items") fun scheduleItems(): List<ScheduleItem>? = scheduleItems

            /**
             * Enter the unit price and quantity for the charge or instead only send the amount. If
             * amount is sent, the unit price is assumed to be the amount and quantity is inferred
             * to be 1.
             */
            @JsonProperty("recurring_schedule")
            fun recurringSchedule(): RecurringSchedule? = recurringSchedule

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var creditTypeId: String? = null
                private var scheduleItems: List<ScheduleItem>? = null
                private var recurringSchedule: RecurringSchedule? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(schedule: Schedule) = apply {
                    this.creditTypeId = schedule.creditTypeId
                    this.scheduleItems = schedule.scheduleItems
                    this.recurringSchedule = schedule.recurringSchedule
                    additionalProperties(schedule.additionalProperties)
                }

                /** Defaults to USD if not passed. Only USD is supported at this time. */
                @JsonProperty("credit_type_id")
                fun creditTypeId(creditTypeId: String) = apply { this.creditTypeId = creditTypeId }

                /** Either provide amount or provide both unit_price and quantity. */
                @JsonProperty("schedule_items")
                fun scheduleItems(scheduleItems: List<ScheduleItem>) = apply {
                    this.scheduleItems = scheduleItems
                }

                /**
                 * Enter the unit price and quantity for the charge or instead only send the amount.
                 * If amount is sent, the unit price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                @JsonProperty("recurring_schedule")
                fun recurringSchedule(recurringSchedule: RecurringSchedule) = apply {
                    this.recurringSchedule = recurringSchedule
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Schedule =
                    Schedule(
                        creditTypeId,
                        scheduleItems?.toImmutable(),
                        recurringSchedule,
                        additionalProperties.toImmutable(),
                    )
            }

            /**
             * Enter the unit price and quantity for the charge or instead only send the amount. If
             * amount is sent, the unit price is assumed to be the amount and quantity is inferred
             * to be 1.
             */
            @JsonDeserialize(builder = RecurringSchedule.Builder::class)
            @NoAutoDetect
            class RecurringSchedule
            private constructor(
                private val startingAt: OffsetDateTime?,
                private val endingBefore: OffsetDateTime?,
                private val frequency: Frequency?,
                private val unitPrice: Double?,
                private val quantity: Double?,
                private val amount: Double?,
                private val amountDistribution: AmountDistribution?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /** RFC 3339 timestamp (inclusive). */
                @JsonProperty("starting_at") fun startingAt(): OffsetDateTime? = startingAt

                /** RFC 3339 timestamp (exclusive). */
                @JsonProperty("ending_before") fun endingBefore(): OffsetDateTime? = endingBefore

                @JsonProperty("frequency") fun frequency(): Frequency? = frequency

                /**
                 * Unit price for the charge. Will be multiplied by quantity to determine the amount
                 * and must be specified with quantity. If specified amount cannot be provided.
                 */
                @JsonProperty("unit_price") fun unitPrice(): Double? = unitPrice

                /**
                 * Quantity for the charge. Will be multiplied by unit_price to determine the amount
                 * and must be specified with unit_price. If specified amount cannot be provided.
                 */
                @JsonProperty("quantity") fun quantity(): Double? = quantity

                /**
                 * Amount for the charge. Can be provided instead of unit_price and quantity. If
                 * amount is sent, the unit_price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                @JsonProperty("amount") fun amount(): Double? = amount

                @JsonProperty("amount_distribution")
                fun amountDistribution(): AmountDistribution? = amountDistribution

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var startingAt: OffsetDateTime? = null
                    private var endingBefore: OffsetDateTime? = null
                    private var frequency: Frequency? = null
                    private var unitPrice: Double? = null
                    private var quantity: Double? = null
                    private var amount: Double? = null
                    private var amountDistribution: AmountDistribution? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(recurringSchedule: RecurringSchedule) = apply {
                        this.startingAt = recurringSchedule.startingAt
                        this.endingBefore = recurringSchedule.endingBefore
                        this.frequency = recurringSchedule.frequency
                        this.unitPrice = recurringSchedule.unitPrice
                        this.quantity = recurringSchedule.quantity
                        this.amount = recurringSchedule.amount
                        this.amountDistribution = recurringSchedule.amountDistribution
                        additionalProperties(recurringSchedule.additionalProperties)
                    }

                    /** RFC 3339 timestamp (inclusive). */
                    @JsonProperty("starting_at")
                    fun startingAt(startingAt: OffsetDateTime) = apply {
                        this.startingAt = startingAt
                    }

                    /** RFC 3339 timestamp (exclusive). */
                    @JsonProperty("ending_before")
                    fun endingBefore(endingBefore: OffsetDateTime) = apply {
                        this.endingBefore = endingBefore
                    }

                    @JsonProperty("frequency")
                    fun frequency(frequency: Frequency) = apply { this.frequency = frequency }

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    @JsonProperty("unit_price")
                    fun unitPrice(unitPrice: Double) = apply { this.unitPrice = unitPrice }

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    @JsonProperty("quantity")
                    fun quantity(quantity: Double) = apply { this.quantity = quantity }

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    @JsonProperty("amount")
                    fun amount(amount: Double) = apply { this.amount = amount }

                    @JsonProperty("amount_distribution")
                    fun amountDistribution(amountDistribution: AmountDistribution) = apply {
                        this.amountDistribution = amountDistribution
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): RecurringSchedule =
                        RecurringSchedule(
                            checkNotNull(startingAt) { "`startingAt` is required but was not set" },
                            checkNotNull(endingBefore) {
                                "`endingBefore` is required but was not set"
                            },
                            checkNotNull(frequency) { "`frequency` is required but was not set" },
                            unitPrice,
                            quantity,
                            amount,
                            checkNotNull(amountDistribution) {
                                "`amountDistribution` is required but was not set"
                            },
                            additionalProperties.toImmutable(),
                        )
                }

                class AmountDistribution
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AmountDistribution && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val DIVIDED = of("DIVIDED")

                        @JvmField val DIVIDED_ROUNDED = of("DIVIDED_ROUNDED")

                        @JvmField val EACH = of("EACH")

                        @JvmStatic fun of(value: String) = AmountDistribution(JsonField.of(value))
                    }

                    enum class Known {
                        DIVIDED,
                        DIVIDED_ROUNDED,
                        EACH,
                    }

                    enum class Value {
                        DIVIDED,
                        DIVIDED_ROUNDED,
                        EACH,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            DIVIDED -> Value.DIVIDED
                            DIVIDED_ROUNDED -> Value.DIVIDED_ROUNDED
                            EACH -> Value.EACH
                            else -> Value._UNKNOWN
                        }

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

                    fun asString(): String = _value().asStringOrThrow()
                }

                class Frequency
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Frequency && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val MONTHLY = of("MONTHLY")

                        @JvmField val QUARTERLY = of("QUARTERLY")

                        @JvmField val SEMI_ANNUAL = of("SEMI_ANNUAL")

                        @JvmField val ANNUAL = of("ANNUAL")

                        @JvmStatic fun of(value: String) = Frequency(JsonField.of(value))
                    }

                    enum class Known {
                        MONTHLY,
                        QUARTERLY,
                        SEMI_ANNUAL,
                        ANNUAL,
                    }

                    enum class Value {
                        MONTHLY,
                        QUARTERLY,
                        SEMI_ANNUAL,
                        ANNUAL,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            MONTHLY -> Value.MONTHLY
                            QUARTERLY -> Value.QUARTERLY
                            SEMI_ANNUAL -> Value.SEMI_ANNUAL
                            ANNUAL -> Value.ANNUAL
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            MONTHLY -> Known.MONTHLY
                            QUARTERLY -> Known.QUARTERLY
                            SEMI_ANNUAL -> Known.SEMI_ANNUAL
                            ANNUAL -> Known.ANNUAL
                            else -> throw MetronomeInvalidDataException("Unknown Frequency: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is RecurringSchedule && startingAt == other.startingAt && endingBefore == other.endingBefore && frequency == other.frequency && unitPrice == other.unitPrice && quantity == other.quantity && amount == other.amount && amountDistribution == other.amountDistribution && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(startingAt, endingBefore, frequency, unitPrice, quantity, amount, amountDistribution, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "RecurringSchedule{startingAt=$startingAt, endingBefore=$endingBefore, frequency=$frequency, unitPrice=$unitPrice, quantity=$quantity, amount=$amount, amountDistribution=$amountDistribution, additionalProperties=$additionalProperties}"
            }

            @JsonDeserialize(builder = ScheduleItem.Builder::class)
            @NoAutoDetect
            class ScheduleItem
            private constructor(
                private val unitPrice: Double?,
                private val quantity: Double?,
                private val amount: Double?,
                private val timestamp: OffsetDateTime?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /**
                 * Unit price for the charge. Will be multiplied by quantity to determine the amount
                 * and must be specified with quantity. If specified amount cannot be provided.
                 */
                @JsonProperty("unit_price") fun unitPrice(): Double? = unitPrice

                /**
                 * Quantity for the charge. Will be multiplied by unit_price to determine the amount
                 * and must be specified with unit_price. If specified amount cannot be provided.
                 */
                @JsonProperty("quantity") fun quantity(): Double? = quantity

                /**
                 * Amount for the charge. Can be provided instead of unit_price and quantity. If
                 * amount is sent, the unit_price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                @JsonProperty("amount") fun amount(): Double? = amount

                /** timestamp of the scheduled event */
                @JsonProperty("timestamp") fun timestamp(): OffsetDateTime? = timestamp

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var unitPrice: Double? = null
                    private var quantity: Double? = null
                    private var amount: Double? = null
                    private var timestamp: OffsetDateTime? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(scheduleItem: ScheduleItem) = apply {
                        this.unitPrice = scheduleItem.unitPrice
                        this.quantity = scheduleItem.quantity
                        this.amount = scheduleItem.amount
                        this.timestamp = scheduleItem.timestamp
                        additionalProperties(scheduleItem.additionalProperties)
                    }

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    @JsonProperty("unit_price")
                    fun unitPrice(unitPrice: Double) = apply { this.unitPrice = unitPrice }

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    @JsonProperty("quantity")
                    fun quantity(quantity: Double) = apply { this.quantity = quantity }

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    @JsonProperty("amount")
                    fun amount(amount: Double) = apply { this.amount = amount }

                    /** timestamp of the scheduled event */
                    @JsonProperty("timestamp")
                    fun timestamp(timestamp: OffsetDateTime) = apply { this.timestamp = timestamp }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): ScheduleItem =
                        ScheduleItem(
                            unitPrice,
                            quantity,
                            amount,
                            checkNotNull(timestamp) { "`timestamp` is required but was not set" },
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ScheduleItem && unitPrice == other.unitPrice && quantity == other.quantity && amount == other.amount && timestamp == other.timestamp && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(unitPrice, quantity, amount, timestamp, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ScheduleItem{unitPrice=$unitPrice, quantity=$quantity, amount=$amount, timestamp=$timestamp, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Schedule && creditTypeId == other.creditTypeId && scheduleItems == other.scheduleItems && recurringSchedule == other.recurringSchedule && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(creditTypeId, scheduleItems, recurringSchedule, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Schedule{creditTypeId=$creditTypeId, scheduleItems=$scheduleItems, recurringSchedule=$recurringSchedule, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Discount && productId == other.productId && name == other.name && schedule == other.schedule && netsuiteSalesOrderId == other.netsuiteSalesOrderId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(productId, name, schedule, netsuiteSalesOrderId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Discount{productId=$productId, name=$name, schedule=$schedule, netsuiteSalesOrderId=$netsuiteSalesOrderId, additionalProperties=$additionalProperties}"
    }

    class MultiplierOverridePrioritization
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is MultiplierOverridePrioritization && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val LOWEST_MULTIPLIER = of("LOWEST_MULTIPLIER")

            @JvmField val EXPLICIT = of("EXPLICIT")

            @JvmStatic fun of(value: String) = MultiplierOverridePrioritization(JsonField.of(value))
        }

        enum class Known {
            LOWEST_MULTIPLIER,
            EXPLICIT,
        }

        enum class Value {
            LOWEST_MULTIPLIER,
            EXPLICIT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                LOWEST_MULTIPLIER -> Value.LOWEST_MULTIPLIER
                EXPLICIT -> Value.EXPLICIT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                LOWEST_MULTIPLIER -> Known.LOWEST_MULTIPLIER
                EXPLICIT -> Known.EXPLICIT
                else ->
                    throw MetronomeInvalidDataException(
                        "Unknown MultiplierOverridePrioritization: $value"
                    )
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(builder = Override.Builder::class)
    @NoAutoDetect
    class Override
    private constructor(
        private val startingAt: OffsetDateTime?,
        private val endingBefore: OffsetDateTime?,
        private val entitled: Boolean?,
        private val type: Type?,
        private val multiplier: Double?,
        private val priority: Double?,
        private val overwriteRate: OverwriteRate?,
        private val productId: String?,
        private val applicableProductTags: List<String>?,
        private val overrideSpecifiers: List<OverrideSpecifier>?,
        private val tiers: List<Tier>?,
        private val isCommitSpecific: Boolean?,
        private val target: Target?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** RFC 3339 timestamp indicating when the override will start applying (inclusive) */
        @JsonProperty("starting_at") fun startingAt(): OffsetDateTime? = startingAt

        /** RFC 3339 timestamp indicating when the override will stop applying (exclusive) */
        @JsonProperty("ending_before") fun endingBefore(): OffsetDateTime? = endingBefore

        @JsonProperty("entitled") fun entitled(): Boolean? = entitled

        /** Overwrites are prioritized over multipliers and tiered overrides. */
        @JsonProperty("type") fun type(): Type? = type

        /** Required for MULTIPLIER type. Must be >=0. */
        @JsonProperty("multiplier") fun multiplier(): Double? = multiplier

        /**
         * Required for EXPLICIT multiplier prioritization scheme and all TIERED overrides. Under
         * EXPLICIT prioritization, overwrites are prioritized first, and then tiered and multiplier
         * overrides are prioritized by their priority value (lowest first). Must be > 0.
         */
        @JsonProperty("priority") fun priority(): Double? = priority

        /** Required for OVERWRITE type. */
        @JsonProperty("overwrite_rate") fun overwriteRate(): OverwriteRate? = overwriteRate

        /**
         * ID of the product whose rate is being overridden. Cannot be used in conjunction with
         * override_specifiers.
         */
        @JsonProperty("product_id") fun productId(): String? = productId

        /**
         * tags identifying products whose rates are being overridden. Cannot be used in conjunction
         * with override_specifiers.
         */
        @JsonProperty("applicable_product_tags")
        fun applicableProductTags(): List<String>? = applicableProductTags

        /**
         * Cannot be used in conjunction with product_id or applicable_product_tags. If provided,
         * the override will apply to all products with the specified specifiers.
         */
        @JsonProperty("override_specifiers")
        fun overrideSpecifiers(): List<OverrideSpecifier>? = overrideSpecifiers

        /** Required for TIERED type. Must have at least one tier. */
        @JsonProperty("tiers") fun tiers(): List<Tier>? = tiers

        /**
         * Indicates whether the override should only apply to commits. Defaults to `false`. If
         * `true`, you can specify relevant commits in `override_specifiers` by passing
         * `commit_ids`. if you do not specify `commit_ids`, then the override will apply when
         * consuming any prepaid or postpaid commit.
         */
        @JsonProperty("is_commit_specific") fun isCommitSpecific(): Boolean? = isCommitSpecific

        /**
         * Indicates whether the override applies to commit rates or list rates. Can only be used
         * for overrides that have `is_commit_specific` set to `true`. Defaults to `"LIST_RATE"`.
         */
        @JsonProperty("target") fun target(): Target? = target

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var startingAt: OffsetDateTime? = null
            private var endingBefore: OffsetDateTime? = null
            private var entitled: Boolean? = null
            private var type: Type? = null
            private var multiplier: Double? = null
            private var priority: Double? = null
            private var overwriteRate: OverwriteRate? = null
            private var productId: String? = null
            private var applicableProductTags: List<String>? = null
            private var overrideSpecifiers: List<OverrideSpecifier>? = null
            private var tiers: List<Tier>? = null
            private var isCommitSpecific: Boolean? = null
            private var target: Target? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(override: Override) = apply {
                this.startingAt = override.startingAt
                this.endingBefore = override.endingBefore
                this.entitled = override.entitled
                this.type = override.type
                this.multiplier = override.multiplier
                this.priority = override.priority
                this.overwriteRate = override.overwriteRate
                this.productId = override.productId
                this.applicableProductTags = override.applicableProductTags
                this.overrideSpecifiers = override.overrideSpecifiers
                this.tiers = override.tiers
                this.isCommitSpecific = override.isCommitSpecific
                this.target = override.target
                additionalProperties(override.additionalProperties)
            }

            /** RFC 3339 timestamp indicating when the override will start applying (inclusive) */
            @JsonProperty("starting_at")
            fun startingAt(startingAt: OffsetDateTime) = apply { this.startingAt = startingAt }

            /** RFC 3339 timestamp indicating when the override will stop applying (exclusive) */
            @JsonProperty("ending_before")
            fun endingBefore(endingBefore: OffsetDateTime) = apply {
                this.endingBefore = endingBefore
            }

            @JsonProperty("entitled")
            fun entitled(entitled: Boolean) = apply { this.entitled = entitled }

            /** Overwrites are prioritized over multipliers and tiered overrides. */
            @JsonProperty("type") fun type(type: Type) = apply { this.type = type }

            /** Required for MULTIPLIER type. Must be >=0. */
            @JsonProperty("multiplier")
            fun multiplier(multiplier: Double) = apply { this.multiplier = multiplier }

            /**
             * Required for EXPLICIT multiplier prioritization scheme and all TIERED overrides.
             * Under EXPLICIT prioritization, overwrites are prioritized first, and then tiered and
             * multiplier overrides are prioritized by their priority value (lowest first). Must
             * be > 0.
             */
            @JsonProperty("priority")
            fun priority(priority: Double) = apply { this.priority = priority }

            /** Required for OVERWRITE type. */
            @JsonProperty("overwrite_rate")
            fun overwriteRate(overwriteRate: OverwriteRate) = apply {
                this.overwriteRate = overwriteRate
            }

            /**
             * ID of the product whose rate is being overridden. Cannot be used in conjunction with
             * override_specifiers.
             */
            @JsonProperty("product_id")
            fun productId(productId: String) = apply { this.productId = productId }

            /**
             * tags identifying products whose rates are being overridden. Cannot be used in
             * conjunction with override_specifiers.
             */
            @JsonProperty("applicable_product_tags")
            fun applicableProductTags(applicableProductTags: List<String>) = apply {
                this.applicableProductTags = applicableProductTags
            }

            /**
             * Cannot be used in conjunction with product_id or applicable_product_tags. If
             * provided, the override will apply to all products with the specified specifiers.
             */
            @JsonProperty("override_specifiers")
            fun overrideSpecifiers(overrideSpecifiers: List<OverrideSpecifier>) = apply {
                this.overrideSpecifiers = overrideSpecifiers
            }

            /** Required for TIERED type. Must have at least one tier. */
            @JsonProperty("tiers") fun tiers(tiers: List<Tier>) = apply { this.tiers = tiers }

            /**
             * Indicates whether the override should only apply to commits. Defaults to `false`. If
             * `true`, you can specify relevant commits in `override_specifiers` by passing
             * `commit_ids`. if you do not specify `commit_ids`, then the override will apply when
             * consuming any prepaid or postpaid commit.
             */
            @JsonProperty("is_commit_specific")
            fun isCommitSpecific(isCommitSpecific: Boolean) = apply {
                this.isCommitSpecific = isCommitSpecific
            }

            /**
             * Indicates whether the override applies to commit rates or list rates. Can only be
             * used for overrides that have `is_commit_specific` set to `true`. Defaults to
             * `"LIST_RATE"`.
             */
            @JsonProperty("target") fun target(target: Target) = apply { this.target = target }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Override =
                Override(
                    checkNotNull(startingAt) { "`startingAt` is required but was not set" },
                    endingBefore,
                    entitled,
                    type,
                    multiplier,
                    priority,
                    overwriteRate,
                    productId,
                    applicableProductTags?.toImmutable(),
                    overrideSpecifiers?.toImmutable(),
                    tiers?.toImmutable(),
                    isCommitSpecific,
                    target,
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(builder = OverrideSpecifier.Builder::class)
        @NoAutoDetect
        class OverrideSpecifier
        private constructor(
            private val commitIds: List<String>?,
            private val productId: String?,
            private val productTags: List<String>?,
            private val pricingGroupValues: PricingGroupValues?,
            private val presentationGroupValues: PresentationGroupValues?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /**
             * Can only be used for commit specific overrides. Must be used in conjunction with one
             * of product_id, product_tags, pricing_group_values, or presentation_group_values. If
             * provided, the override will only apply to the specified commits. If not provided, the
             * override will apply to all commits.
             */
            @JsonProperty("commit_ids") fun commitIds(): List<String>? = commitIds

            /** If provided, the override will only apply to the product with the specified ID. */
            @JsonProperty("product_id") fun productId(): String? = productId

            /**
             * If provided, the override will only apply to products with all the specified tags.
             */
            @JsonProperty("product_tags") fun productTags(): List<String>? = productTags

            /**
             * A map of pricing group names to values. The override will only apply to products with
             * the specified pricing group values.
             */
            @JsonProperty("pricing_group_values")
            fun pricingGroupValues(): PricingGroupValues? = pricingGroupValues

            /**
             * A map of group names to values. The override will only apply to line items with the
             * specified presentation group values. Can only be used for multiplier overrides.
             */
            @JsonProperty("presentation_group_values")
            fun presentationGroupValues(): PresentationGroupValues? = presentationGroupValues

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var commitIds: List<String>? = null
                private var productId: String? = null
                private var productTags: List<String>? = null
                private var pricingGroupValues: PricingGroupValues? = null
                private var presentationGroupValues: PresentationGroupValues? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(overrideSpecifier: OverrideSpecifier) = apply {
                    this.commitIds = overrideSpecifier.commitIds
                    this.productId = overrideSpecifier.productId
                    this.productTags = overrideSpecifier.productTags
                    this.pricingGroupValues = overrideSpecifier.pricingGroupValues
                    this.presentationGroupValues = overrideSpecifier.presentationGroupValues
                    additionalProperties(overrideSpecifier.additionalProperties)
                }

                /**
                 * Can only be used for commit specific overrides. Must be used in conjunction with
                 * one of product_id, product_tags, pricing_group_values, or
                 * presentation_group_values. If provided, the override will only apply to the
                 * specified commits. If not provided, the override will apply to all commits.
                 */
                @JsonProperty("commit_ids")
                fun commitIds(commitIds: List<String>) = apply { this.commitIds = commitIds }

                /**
                 * If provided, the override will only apply to the product with the specified ID.
                 */
                @JsonProperty("product_id")
                fun productId(productId: String) = apply { this.productId = productId }

                /**
                 * If provided, the override will only apply to products with all the specified
                 * tags.
                 */
                @JsonProperty("product_tags")
                fun productTags(productTags: List<String>) = apply {
                    this.productTags = productTags
                }

                /**
                 * A map of pricing group names to values. The override will only apply to products
                 * with the specified pricing group values.
                 */
                @JsonProperty("pricing_group_values")
                fun pricingGroupValues(pricingGroupValues: PricingGroupValues) = apply {
                    this.pricingGroupValues = pricingGroupValues
                }

                /**
                 * A map of group names to values. The override will only apply to line items with
                 * the specified presentation group values. Can only be used for multiplier
                 * overrides.
                 */
                @JsonProperty("presentation_group_values")
                fun presentationGroupValues(presentationGroupValues: PresentationGroupValues) =
                    apply {
                        this.presentationGroupValues = presentationGroupValues
                    }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): OverrideSpecifier =
                    OverrideSpecifier(
                        commitIds?.toImmutable(),
                        productId,
                        productTags?.toImmutable(),
                        pricingGroupValues,
                        presentationGroupValues,
                        additionalProperties.toImmutable(),
                    )
            }

            /**
             * A map of group names to values. The override will only apply to line items with the
             * specified presentation group values. Can only be used for multiplier overrides.
             */
            @JsonDeserialize(builder = PresentationGroupValues.Builder::class)
            @NoAutoDetect
            class PresentationGroupValues
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(presentationGroupValues: PresentationGroupValues) = apply {
                        additionalProperties(presentationGroupValues.additionalProperties)
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): PresentationGroupValues =
                        PresentationGroupValues(additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is PresentationGroupValues && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PresentationGroupValues{additionalProperties=$additionalProperties}"
            }

            /**
             * A map of pricing group names to values. The override will only apply to products with
             * the specified pricing group values.
             */
            @JsonDeserialize(builder = PricingGroupValues.Builder::class)
            @NoAutoDetect
            class PricingGroupValues
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(pricingGroupValues: PricingGroupValues) = apply {
                        additionalProperties(pricingGroupValues.additionalProperties)
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): PricingGroupValues =
                        PricingGroupValues(additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is PricingGroupValues && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "PricingGroupValues{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is OverrideSpecifier && commitIds == other.commitIds && productId == other.productId && productTags == other.productTags && pricingGroupValues == other.pricingGroupValues && presentationGroupValues == other.presentationGroupValues && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(commitIds, productId, productTags, pricingGroupValues, presentationGroupValues, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OverrideSpecifier{commitIds=$commitIds, productId=$productId, productTags=$productTags, pricingGroupValues=$pricingGroupValues, presentationGroupValues=$presentationGroupValues, additionalProperties=$additionalProperties}"
        }

        /** Required for OVERWRITE type. */
        @JsonDeserialize(builder = OverwriteRate.Builder::class)
        @NoAutoDetect
        class OverwriteRate
        private constructor(
            private val rateType: RateType?,
            private val price: Double?,
            private val quantity: Double?,
            private val isProrated: Boolean?,
            private val tiers: List<Tier>?,
            private val customRate: CustomRate?,
            private val creditTypeId: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            @JsonProperty("rate_type") fun rateType(): RateType? = rateType

            /**
             * Default price. For FLAT rate_type, this must be >=0. For PERCENTAGE rate_type, this
             * is a decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
             */
            @JsonProperty("price") fun price(): Double? = price

            /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
            @JsonProperty("quantity") fun quantity(): Double? = quantity

            /**
             * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be set
             * to true.
             */
            @JsonProperty("is_prorated") fun isProrated(): Boolean? = isProrated

            /** Only set for TIERED rate_type. */
            @JsonProperty("tiers") fun tiers(): List<Tier>? = tiers

            /**
             * Only set for CUSTOM rate_type. This field is interpreted by custom rate processors.
             */
            @JsonProperty("custom_rate") fun customRate(): CustomRate? = customRate

            @JsonProperty("credit_type_id") fun creditTypeId(): String? = creditTypeId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var rateType: RateType? = null
                private var price: Double? = null
                private var quantity: Double? = null
                private var isProrated: Boolean? = null
                private var tiers: List<Tier>? = null
                private var customRate: CustomRate? = null
                private var creditTypeId: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(overwriteRate: OverwriteRate) = apply {
                    this.rateType = overwriteRate.rateType
                    this.price = overwriteRate.price
                    this.quantity = overwriteRate.quantity
                    this.isProrated = overwriteRate.isProrated
                    this.tiers = overwriteRate.tiers
                    this.customRate = overwriteRate.customRate
                    this.creditTypeId = overwriteRate.creditTypeId
                    additionalProperties(overwriteRate.additionalProperties)
                }

                @JsonProperty("rate_type")
                fun rateType(rateType: RateType) = apply { this.rateType = rateType }

                /**
                 * Default price. For FLAT rate_type, this must be >=0. For PERCENTAGE rate_type,
                 * this is a decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
                 */
                @JsonProperty("price") fun price(price: Double) = apply { this.price = price }

                /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
                @JsonProperty("quantity")
                fun quantity(quantity: Double) = apply { this.quantity = quantity }

                /**
                 * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be
                 * set to true.
                 */
                @JsonProperty("is_prorated")
                fun isProrated(isProrated: Boolean) = apply { this.isProrated = isProrated }

                /** Only set for TIERED rate_type. */
                @JsonProperty("tiers") fun tiers(tiers: List<Tier>) = apply { this.tiers = tiers }

                /**
                 * Only set for CUSTOM rate_type. This field is interpreted by custom rate
                 * processors.
                 */
                @JsonProperty("custom_rate")
                fun customRate(customRate: CustomRate) = apply { this.customRate = customRate }

                @JsonProperty("credit_type_id")
                fun creditTypeId(creditTypeId: String) = apply { this.creditTypeId = creditTypeId }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): OverwriteRate =
                    OverwriteRate(
                        checkNotNull(rateType) { "`rateType` is required but was not set" },
                        price,
                        quantity,
                        isProrated,
                        tiers?.toImmutable(),
                        customRate,
                        creditTypeId,
                        additionalProperties.toImmutable(),
                    )
            }

            class RateType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is RateType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val FLAT = of("FLAT")

                    @JvmField val PERCENTAGE = of("PERCENTAGE")

                    @JvmField val SUBSCRIPTION = of("SUBSCRIPTION")

                    @JvmField val TIERED = of("TIERED")

                    @JvmField val CUSTOM = of("CUSTOM")

                    @JvmStatic fun of(value: String) = RateType(JsonField.of(value))
                }

                enum class Known {
                    FLAT,
                    PERCENTAGE,
                    SUBSCRIPTION,
                    TIERED,
                    CUSTOM,
                }

                enum class Value {
                    FLAT,
                    PERCENTAGE,
                    SUBSCRIPTION,
                    TIERED,
                    CUSTOM,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        FLAT -> Value.FLAT
                        PERCENTAGE -> Value.PERCENTAGE
                        SUBSCRIPTION -> Value.SUBSCRIPTION
                        TIERED -> Value.TIERED
                        CUSTOM -> Value.CUSTOM
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        FLAT -> Known.FLAT
                        PERCENTAGE -> Known.PERCENTAGE
                        SUBSCRIPTION -> Known.SUBSCRIPTION
                        TIERED -> Known.TIERED
                        CUSTOM -> Known.CUSTOM
                        else -> throw MetronomeInvalidDataException("Unknown RateType: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            /**
             * Only set for CUSTOM rate_type. This field is interpreted by custom rate processors.
             */
            @JsonDeserialize(builder = CustomRate.Builder::class)
            @NoAutoDetect
            class CustomRate
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(customRate: CustomRate) = apply {
                        additionalProperties(customRate.additionalProperties)
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): CustomRate = CustomRate(additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is CustomRate && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() = "CustomRate{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is OverwriteRate && rateType == other.rateType && price == other.price && quantity == other.quantity && isProrated == other.isProrated && tiers == other.tiers && customRate == other.customRate && creditTypeId == other.creditTypeId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(rateType, price, quantity, isProrated, tiers, customRate, creditTypeId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OverwriteRate{rateType=$rateType, price=$price, quantity=$quantity, isProrated=$isProrated, tiers=$tiers, customRate=$customRate, creditTypeId=$creditTypeId, additionalProperties=$additionalProperties}"
        }

        class Target
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Target && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val COMMIT_RATE = of("COMMIT_RATE")

                @JvmField val COMMIT_RATE = of("commit_rate")

                @JvmField val LIST_RATE = of("LIST_RATE")

                @JvmField val LIST_RATE = of("list_rate")

                @JvmStatic fun of(value: String) = Target(JsonField.of(value))
            }

            enum class Known {
                COMMIT_RATE,
                COMMIT_RATE,
                LIST_RATE,
                LIST_RATE,
            }

            enum class Value {
                COMMIT_RATE,
                COMMIT_RATE,
                LIST_RATE,
                LIST_RATE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    COMMIT_RATE -> Value.COMMIT_RATE
                    COMMIT_RATE -> Value.COMMIT_RATE
                    LIST_RATE -> Value.LIST_RATE
                    LIST_RATE -> Value.LIST_RATE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    COMMIT_RATE -> Known.COMMIT_RATE
                    COMMIT_RATE -> Known.COMMIT_RATE
                    LIST_RATE -> Known.LIST_RATE
                    LIST_RATE -> Known.LIST_RATE
                    else -> throw MetronomeInvalidDataException("Unknown Target: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = Tier.Builder::class)
        @NoAutoDetect
        class Tier
        private constructor(
            private val size: Double?,
            private val multiplier: Double?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            @JsonProperty("size") fun size(): Double? = size

            @JsonProperty("multiplier") fun multiplier(): Double? = multiplier

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var size: Double? = null
                private var multiplier: Double? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(tier: Tier) = apply {
                    this.size = tier.size
                    this.multiplier = tier.multiplier
                    additionalProperties(tier.additionalProperties)
                }

                @JsonProperty("size") fun size(size: Double) = apply { this.size = size }

                @JsonProperty("multiplier")
                fun multiplier(multiplier: Double) = apply { this.multiplier = multiplier }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Tier =
                    Tier(
                        size,
                        checkNotNull(multiplier) { "`multiplier` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Tier && size == other.size && multiplier == other.multiplier && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(size, multiplier, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Tier{size=$size, multiplier=$multiplier, additionalProperties=$additionalProperties}"
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val OVERWRITE = of("OVERWRITE")

                @JvmField val MULTIPLIER = of("MULTIPLIER")

                @JvmField val TIERED = of("TIERED")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                OVERWRITE,
                MULTIPLIER,
                TIERED,
            }

            enum class Value {
                OVERWRITE,
                MULTIPLIER,
                TIERED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    OVERWRITE -> Value.OVERWRITE
                    MULTIPLIER -> Value.MULTIPLIER
                    TIERED -> Value.TIERED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    OVERWRITE -> Known.OVERWRITE
                    MULTIPLIER -> Known.MULTIPLIER
                    TIERED -> Known.TIERED
                    else -> throw MetronomeInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Override && startingAt == other.startingAt && endingBefore == other.endingBefore && entitled == other.entitled && type == other.type && multiplier == other.multiplier && priority == other.priority && overwriteRate == other.overwriteRate && productId == other.productId && applicableProductTags == other.applicableProductTags && overrideSpecifiers == other.overrideSpecifiers && tiers == other.tiers && isCommitSpecific == other.isCommitSpecific && target == other.target && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(startingAt, endingBefore, entitled, type, multiplier, priority, overwriteRate, productId, applicableProductTags, overrideSpecifiers, tiers, isCommitSpecific, target, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Override{startingAt=$startingAt, endingBefore=$endingBefore, entitled=$entitled, type=$type, multiplier=$multiplier, priority=$priority, overwriteRate=$overwriteRate, productId=$productId, applicableProductTags=$applicableProductTags, overrideSpecifiers=$overrideSpecifiers, tiers=$tiers, isCommitSpecific=$isCommitSpecific, target=$target, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = ProfessionalService.Builder::class)
    @NoAutoDetect
    class ProfessionalService
    private constructor(
        private val description: String?,
        private val productId: String?,
        private val netsuiteSalesOrderId: String?,
        private val unitPrice: Double?,
        private val quantity: Double?,
        private val maxAmount: Double?,
        private val customFields: CustomFields?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("description") fun description(): String? = description

        @JsonProperty("product_id") fun productId(): String? = productId

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("netsuite_sales_order_id")
        fun netsuiteSalesOrderId(): String? = netsuiteSalesOrderId

        /**
         * Unit price for the charge. Will be multiplied by quantity to determine the amount and
         * must be specified.
         */
        @JsonProperty("unit_price") fun unitPrice(): Double? = unitPrice

        /** Quantity for the charge. Will be multiplied by unit_price to determine the amount. */
        @JsonProperty("quantity") fun quantity(): Double? = quantity

        /** Maximum amount for the term. */
        @JsonProperty("max_amount") fun maxAmount(): Double? = maxAmount

        @JsonProperty("custom_fields") fun customFields(): CustomFields? = customFields

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var description: String? = null
            private var productId: String? = null
            private var netsuiteSalesOrderId: String? = null
            private var unitPrice: Double? = null
            private var quantity: Double? = null
            private var maxAmount: Double? = null
            private var customFields: CustomFields? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(professionalService: ProfessionalService) = apply {
                this.description = professionalService.description
                this.productId = professionalService.productId
                this.netsuiteSalesOrderId = professionalService.netsuiteSalesOrderId
                this.unitPrice = professionalService.unitPrice
                this.quantity = professionalService.quantity
                this.maxAmount = professionalService.maxAmount
                this.customFields = professionalService.customFields
                additionalProperties(professionalService.additionalProperties)
            }

            @JsonProperty("description")
            fun description(description: String) = apply { this.description = description }

            @JsonProperty("product_id")
            fun productId(productId: String) = apply { this.productId = productId }

            /** This field's availability is dependent on your client's configuration. */
            @JsonProperty("netsuite_sales_order_id")
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) = apply {
                this.netsuiteSalesOrderId = netsuiteSalesOrderId
            }

            /**
             * Unit price for the charge. Will be multiplied by quantity to determine the amount and
             * must be specified.
             */
            @JsonProperty("unit_price")
            fun unitPrice(unitPrice: Double) = apply { this.unitPrice = unitPrice }

            /**
             * Quantity for the charge. Will be multiplied by unit_price to determine the amount.
             */
            @JsonProperty("quantity")
            fun quantity(quantity: Double) = apply { this.quantity = quantity }

            /** Maximum amount for the term. */
            @JsonProperty("max_amount")
            fun maxAmount(maxAmount: Double) = apply { this.maxAmount = maxAmount }

            @JsonProperty("custom_fields")
            fun customFields(customFields: CustomFields) = apply {
                this.customFields = customFields
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): ProfessionalService =
                ProfessionalService(
                    description,
                    checkNotNull(productId) { "`productId` is required but was not set" },
                    netsuiteSalesOrderId,
                    checkNotNull(unitPrice) { "`unitPrice` is required but was not set" },
                    checkNotNull(quantity) { "`quantity` is required but was not set" },
                    checkNotNull(maxAmount) { "`maxAmount` is required but was not set" },
                    customFields,
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(builder = CustomFields.Builder::class)
        @NoAutoDetect
        class CustomFields
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(customFields: CustomFields) = apply {
                    additionalProperties(customFields.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CustomFields && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ProfessionalService && description == other.description && productId == other.productId && netsuiteSalesOrderId == other.netsuiteSalesOrderId && unitPrice == other.unitPrice && quantity == other.quantity && maxAmount == other.maxAmount && customFields == other.customFields && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(description, productId, netsuiteSalesOrderId, unitPrice, quantity, maxAmount, customFields, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ProfessionalService{description=$description, productId=$productId, netsuiteSalesOrderId=$netsuiteSalesOrderId, unitPrice=$unitPrice, quantity=$quantity, maxAmount=$maxAmount, customFields=$customFields, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = ResellerRoyalty.Builder::class)
    @NoAutoDetect
    class ResellerRoyalty
    private constructor(
        private val resellerType: ResellerType?,
        private val fraction: Double?,
        private val netsuiteResellerId: String?,
        private val applicableProductIds: List<String>?,
        private val applicableProductTags: List<String>?,
        private val startingAt: OffsetDateTime?,
        private val endingBefore: OffsetDateTime?,
        private val resellerContractValue: Double?,
        private val awsOptions: AwsOptions?,
        private val gcpOptions: GcpOptions?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("reseller_type") fun resellerType(): ResellerType? = resellerType

        @JsonProperty("fraction") fun fraction(): Double? = fraction

        @JsonProperty("netsuite_reseller_id") fun netsuiteResellerId(): String? = netsuiteResellerId

        /** Must provide at least one of applicable_product_ids or applicable_product_tags. */
        @JsonProperty("applicable_product_ids")
        fun applicableProductIds(): List<String>? = applicableProductIds

        /** Must provide at least one of applicable_product_ids or applicable_product_tags. */
        @JsonProperty("applicable_product_tags")
        fun applicableProductTags(): List<String>? = applicableProductTags

        @JsonProperty("starting_at") fun startingAt(): OffsetDateTime? = startingAt

        @JsonProperty("ending_before") fun endingBefore(): OffsetDateTime? = endingBefore

        @JsonProperty("reseller_contract_value")
        fun resellerContractValue(): Double? = resellerContractValue

        @JsonProperty("aws_options") fun awsOptions(): AwsOptions? = awsOptions

        @JsonProperty("gcp_options") fun gcpOptions(): GcpOptions? = gcpOptions

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var resellerType: ResellerType? = null
            private var fraction: Double? = null
            private var netsuiteResellerId: String? = null
            private var applicableProductIds: List<String>? = null
            private var applicableProductTags: List<String>? = null
            private var startingAt: OffsetDateTime? = null
            private var endingBefore: OffsetDateTime? = null
            private var resellerContractValue: Double? = null
            private var awsOptions: AwsOptions? = null
            private var gcpOptions: GcpOptions? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(resellerRoyalty: ResellerRoyalty) = apply {
                this.resellerType = resellerRoyalty.resellerType
                this.fraction = resellerRoyalty.fraction
                this.netsuiteResellerId = resellerRoyalty.netsuiteResellerId
                this.applicableProductIds = resellerRoyalty.applicableProductIds
                this.applicableProductTags = resellerRoyalty.applicableProductTags
                this.startingAt = resellerRoyalty.startingAt
                this.endingBefore = resellerRoyalty.endingBefore
                this.resellerContractValue = resellerRoyalty.resellerContractValue
                this.awsOptions = resellerRoyalty.awsOptions
                this.gcpOptions = resellerRoyalty.gcpOptions
                additionalProperties(resellerRoyalty.additionalProperties)
            }

            @JsonProperty("reseller_type")
            fun resellerType(resellerType: ResellerType) = apply {
                this.resellerType = resellerType
            }

            @JsonProperty("fraction")
            fun fraction(fraction: Double) = apply { this.fraction = fraction }

            @JsonProperty("netsuite_reseller_id")
            fun netsuiteResellerId(netsuiteResellerId: String) = apply {
                this.netsuiteResellerId = netsuiteResellerId
            }

            /** Must provide at least one of applicable_product_ids or applicable_product_tags. */
            @JsonProperty("applicable_product_ids")
            fun applicableProductIds(applicableProductIds: List<String>) = apply {
                this.applicableProductIds = applicableProductIds
            }

            /** Must provide at least one of applicable_product_ids or applicable_product_tags. */
            @JsonProperty("applicable_product_tags")
            fun applicableProductTags(applicableProductTags: List<String>) = apply {
                this.applicableProductTags = applicableProductTags
            }

            @JsonProperty("starting_at")
            fun startingAt(startingAt: OffsetDateTime) = apply { this.startingAt = startingAt }

            @JsonProperty("ending_before")
            fun endingBefore(endingBefore: OffsetDateTime) = apply {
                this.endingBefore = endingBefore
            }

            @JsonProperty("reseller_contract_value")
            fun resellerContractValue(resellerContractValue: Double) = apply {
                this.resellerContractValue = resellerContractValue
            }

            @JsonProperty("aws_options")
            fun awsOptions(awsOptions: AwsOptions) = apply { this.awsOptions = awsOptions }

            @JsonProperty("gcp_options")
            fun gcpOptions(gcpOptions: GcpOptions) = apply { this.gcpOptions = gcpOptions }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): ResellerRoyalty =
                ResellerRoyalty(
                    checkNotNull(resellerType) { "`resellerType` is required but was not set" },
                    checkNotNull(fraction) { "`fraction` is required but was not set" },
                    checkNotNull(netsuiteResellerId) {
                        "`netsuiteResellerId` is required but was not set"
                    },
                    applicableProductIds?.toImmutable(),
                    applicableProductTags?.toImmutable(),
                    checkNotNull(startingAt) { "`startingAt` is required but was not set" },
                    endingBefore,
                    resellerContractValue,
                    awsOptions,
                    gcpOptions,
                    additionalProperties.toImmutable(),
                )
        }

        class ResellerType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ResellerType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val AWS = of("AWS")

                @JvmField val AWS_PRO_SERVICE = of("AWS_PRO_SERVICE")

                @JvmField val GCP = of("GCP")

                @JvmField val GCP_PRO_SERVICE = of("GCP_PRO_SERVICE")

                @JvmStatic fun of(value: String) = ResellerType(JsonField.of(value))
            }

            enum class Known {
                AWS,
                AWS_PRO_SERVICE,
                GCP,
                GCP_PRO_SERVICE,
            }

            enum class Value {
                AWS,
                AWS_PRO_SERVICE,
                GCP,
                GCP_PRO_SERVICE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    AWS -> Value.AWS
                    AWS_PRO_SERVICE -> Value.AWS_PRO_SERVICE
                    GCP -> Value.GCP
                    GCP_PRO_SERVICE -> Value.GCP_PRO_SERVICE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    AWS -> Known.AWS
                    AWS_PRO_SERVICE -> Known.AWS_PRO_SERVICE
                    GCP -> Known.GCP
                    GCP_PRO_SERVICE -> Known.GCP_PRO_SERVICE
                    else -> throw MetronomeInvalidDataException("Unknown ResellerType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = AwsOptions.Builder::class)
        @NoAutoDetect
        class AwsOptions
        private constructor(
            private val awsAccountNumber: String?,
            private val awsPayerReferenceId: String?,
            private val awsOfferId: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            @JsonProperty("aws_account_number") fun awsAccountNumber(): String? = awsAccountNumber

            @JsonProperty("aws_payer_reference_id")
            fun awsPayerReferenceId(): String? = awsPayerReferenceId

            @JsonProperty("aws_offer_id") fun awsOfferId(): String? = awsOfferId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var awsAccountNumber: String? = null
                private var awsPayerReferenceId: String? = null
                private var awsOfferId: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(awsOptions: AwsOptions) = apply {
                    this.awsAccountNumber = awsOptions.awsAccountNumber
                    this.awsPayerReferenceId = awsOptions.awsPayerReferenceId
                    this.awsOfferId = awsOptions.awsOfferId
                    additionalProperties(awsOptions.additionalProperties)
                }

                @JsonProperty("aws_account_number")
                fun awsAccountNumber(awsAccountNumber: String) = apply {
                    this.awsAccountNumber = awsAccountNumber
                }

                @JsonProperty("aws_payer_reference_id")
                fun awsPayerReferenceId(awsPayerReferenceId: String) = apply {
                    this.awsPayerReferenceId = awsPayerReferenceId
                }

                @JsonProperty("aws_offer_id")
                fun awsOfferId(awsOfferId: String) = apply { this.awsOfferId = awsOfferId }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): AwsOptions =
                    AwsOptions(
                        awsAccountNumber,
                        awsPayerReferenceId,
                        awsOfferId,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AwsOptions && awsAccountNumber == other.awsAccountNumber && awsPayerReferenceId == other.awsPayerReferenceId && awsOfferId == other.awsOfferId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(awsAccountNumber, awsPayerReferenceId, awsOfferId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AwsOptions{awsAccountNumber=$awsAccountNumber, awsPayerReferenceId=$awsPayerReferenceId, awsOfferId=$awsOfferId, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = GcpOptions.Builder::class)
        @NoAutoDetect
        class GcpOptions
        private constructor(
            private val gcpAccountId: String?,
            private val gcpOfferId: String?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            @JsonProperty("gcp_account_id") fun gcpAccountId(): String? = gcpAccountId

            @JsonProperty("gcp_offer_id") fun gcpOfferId(): String? = gcpOfferId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var gcpAccountId: String? = null
                private var gcpOfferId: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(gcpOptions: GcpOptions) = apply {
                    this.gcpAccountId = gcpOptions.gcpAccountId
                    this.gcpOfferId = gcpOptions.gcpOfferId
                    additionalProperties(gcpOptions.additionalProperties)
                }

                @JsonProperty("gcp_account_id")
                fun gcpAccountId(gcpAccountId: String) = apply { this.gcpAccountId = gcpAccountId }

                @JsonProperty("gcp_offer_id")
                fun gcpOfferId(gcpOfferId: String) = apply { this.gcpOfferId = gcpOfferId }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): GcpOptions =
                    GcpOptions(
                        gcpAccountId,
                        gcpOfferId,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is GcpOptions && gcpAccountId == other.gcpAccountId && gcpOfferId == other.gcpOfferId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(gcpAccountId, gcpOfferId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "GcpOptions{gcpAccountId=$gcpAccountId, gcpOfferId=$gcpOfferId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ResellerRoyalty && resellerType == other.resellerType && fraction == other.fraction && netsuiteResellerId == other.netsuiteResellerId && applicableProductIds == other.applicableProductIds && applicableProductTags == other.applicableProductTags && startingAt == other.startingAt && endingBefore == other.endingBefore && resellerContractValue == other.resellerContractValue && awsOptions == other.awsOptions && gcpOptions == other.gcpOptions && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(resellerType, fraction, netsuiteResellerId, applicableProductIds, applicableProductTags, startingAt, endingBefore, resellerContractValue, awsOptions, gcpOptions, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ResellerRoyalty{resellerType=$resellerType, fraction=$fraction, netsuiteResellerId=$netsuiteResellerId, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, startingAt=$startingAt, endingBefore=$endingBefore, resellerContractValue=$resellerContractValue, awsOptions=$awsOptions, gcpOptions=$gcpOptions, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = ScheduledCharge.Builder::class)
    @NoAutoDetect
    class ScheduledCharge
    private constructor(
        private val productId: String?,
        private val name: String?,
        private val schedule: Schedule?,
        private val netsuiteSalesOrderId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("product_id") fun productId(): String? = productId

        /** displayed on invoices */
        @JsonProperty("name") fun name(): String? = name

        /** Must provide either schedule_items or recurring_schedule. */
        @JsonProperty("schedule") fun schedule(): Schedule? = schedule

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("netsuite_sales_order_id")
        fun netsuiteSalesOrderId(): String? = netsuiteSalesOrderId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var productId: String? = null
            private var name: String? = null
            private var schedule: Schedule? = null
            private var netsuiteSalesOrderId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(scheduledCharge: ScheduledCharge) = apply {
                this.productId = scheduledCharge.productId
                this.name = scheduledCharge.name
                this.schedule = scheduledCharge.schedule
                this.netsuiteSalesOrderId = scheduledCharge.netsuiteSalesOrderId
                additionalProperties(scheduledCharge.additionalProperties)
            }

            @JsonProperty("product_id")
            fun productId(productId: String) = apply { this.productId = productId }

            /** displayed on invoices */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /** Must provide either schedule_items or recurring_schedule. */
            @JsonProperty("schedule")
            fun schedule(schedule: Schedule) = apply { this.schedule = schedule }

            /** This field's availability is dependent on your client's configuration. */
            @JsonProperty("netsuite_sales_order_id")
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) = apply {
                this.netsuiteSalesOrderId = netsuiteSalesOrderId
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): ScheduledCharge =
                ScheduledCharge(
                    checkNotNull(productId) { "`productId` is required but was not set" },
                    name,
                    checkNotNull(schedule) { "`schedule` is required but was not set" },
                    netsuiteSalesOrderId,
                    additionalProperties.toImmutable(),
                )
        }

        /** Must provide either schedule_items or recurring_schedule. */
        @JsonDeserialize(builder = Schedule.Builder::class)
        @NoAutoDetect
        class Schedule
        private constructor(
            private val creditTypeId: String?,
            private val scheduleItems: List<ScheduleItem>?,
            private val recurringSchedule: RecurringSchedule?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** Defaults to USD if not passed. Only USD is supported at this time. */
            @JsonProperty("credit_type_id") fun creditTypeId(): String? = creditTypeId

            /** Either provide amount or provide both unit_price and quantity. */
            @JsonProperty("schedule_items") fun scheduleItems(): List<ScheduleItem>? = scheduleItems

            /**
             * Enter the unit price and quantity for the charge or instead only send the amount. If
             * amount is sent, the unit price is assumed to be the amount and quantity is inferred
             * to be 1.
             */
            @JsonProperty("recurring_schedule")
            fun recurringSchedule(): RecurringSchedule? = recurringSchedule

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var creditTypeId: String? = null
                private var scheduleItems: List<ScheduleItem>? = null
                private var recurringSchedule: RecurringSchedule? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(schedule: Schedule) = apply {
                    this.creditTypeId = schedule.creditTypeId
                    this.scheduleItems = schedule.scheduleItems
                    this.recurringSchedule = schedule.recurringSchedule
                    additionalProperties(schedule.additionalProperties)
                }

                /** Defaults to USD if not passed. Only USD is supported at this time. */
                @JsonProperty("credit_type_id")
                fun creditTypeId(creditTypeId: String) = apply { this.creditTypeId = creditTypeId }

                /** Either provide amount or provide both unit_price and quantity. */
                @JsonProperty("schedule_items")
                fun scheduleItems(scheduleItems: List<ScheduleItem>) = apply {
                    this.scheduleItems = scheduleItems
                }

                /**
                 * Enter the unit price and quantity for the charge or instead only send the amount.
                 * If amount is sent, the unit price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                @JsonProperty("recurring_schedule")
                fun recurringSchedule(recurringSchedule: RecurringSchedule) = apply {
                    this.recurringSchedule = recurringSchedule
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Schedule =
                    Schedule(
                        creditTypeId,
                        scheduleItems?.toImmutable(),
                        recurringSchedule,
                        additionalProperties.toImmutable(),
                    )
            }

            /**
             * Enter the unit price and quantity for the charge or instead only send the amount. If
             * amount is sent, the unit price is assumed to be the amount and quantity is inferred
             * to be 1.
             */
            @JsonDeserialize(builder = RecurringSchedule.Builder::class)
            @NoAutoDetect
            class RecurringSchedule
            private constructor(
                private val startingAt: OffsetDateTime?,
                private val endingBefore: OffsetDateTime?,
                private val frequency: Frequency?,
                private val unitPrice: Double?,
                private val quantity: Double?,
                private val amount: Double?,
                private val amountDistribution: AmountDistribution?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /** RFC 3339 timestamp (inclusive). */
                @JsonProperty("starting_at") fun startingAt(): OffsetDateTime? = startingAt

                /** RFC 3339 timestamp (exclusive). */
                @JsonProperty("ending_before") fun endingBefore(): OffsetDateTime? = endingBefore

                @JsonProperty("frequency") fun frequency(): Frequency? = frequency

                /**
                 * Unit price for the charge. Will be multiplied by quantity to determine the amount
                 * and must be specified with quantity. If specified amount cannot be provided.
                 */
                @JsonProperty("unit_price") fun unitPrice(): Double? = unitPrice

                /**
                 * Quantity for the charge. Will be multiplied by unit_price to determine the amount
                 * and must be specified with unit_price. If specified amount cannot be provided.
                 */
                @JsonProperty("quantity") fun quantity(): Double? = quantity

                /**
                 * Amount for the charge. Can be provided instead of unit_price and quantity. If
                 * amount is sent, the unit_price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                @JsonProperty("amount") fun amount(): Double? = amount

                @JsonProperty("amount_distribution")
                fun amountDistribution(): AmountDistribution? = amountDistribution

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var startingAt: OffsetDateTime? = null
                    private var endingBefore: OffsetDateTime? = null
                    private var frequency: Frequency? = null
                    private var unitPrice: Double? = null
                    private var quantity: Double? = null
                    private var amount: Double? = null
                    private var amountDistribution: AmountDistribution? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(recurringSchedule: RecurringSchedule) = apply {
                        this.startingAt = recurringSchedule.startingAt
                        this.endingBefore = recurringSchedule.endingBefore
                        this.frequency = recurringSchedule.frequency
                        this.unitPrice = recurringSchedule.unitPrice
                        this.quantity = recurringSchedule.quantity
                        this.amount = recurringSchedule.amount
                        this.amountDistribution = recurringSchedule.amountDistribution
                        additionalProperties(recurringSchedule.additionalProperties)
                    }

                    /** RFC 3339 timestamp (inclusive). */
                    @JsonProperty("starting_at")
                    fun startingAt(startingAt: OffsetDateTime) = apply {
                        this.startingAt = startingAt
                    }

                    /** RFC 3339 timestamp (exclusive). */
                    @JsonProperty("ending_before")
                    fun endingBefore(endingBefore: OffsetDateTime) = apply {
                        this.endingBefore = endingBefore
                    }

                    @JsonProperty("frequency")
                    fun frequency(frequency: Frequency) = apply { this.frequency = frequency }

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    @JsonProperty("unit_price")
                    fun unitPrice(unitPrice: Double) = apply { this.unitPrice = unitPrice }

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    @JsonProperty("quantity")
                    fun quantity(quantity: Double) = apply { this.quantity = quantity }

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    @JsonProperty("amount")
                    fun amount(amount: Double) = apply { this.amount = amount }

                    @JsonProperty("amount_distribution")
                    fun amountDistribution(amountDistribution: AmountDistribution) = apply {
                        this.amountDistribution = amountDistribution
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): RecurringSchedule =
                        RecurringSchedule(
                            checkNotNull(startingAt) { "`startingAt` is required but was not set" },
                            checkNotNull(endingBefore) {
                                "`endingBefore` is required but was not set"
                            },
                            checkNotNull(frequency) { "`frequency` is required but was not set" },
                            unitPrice,
                            quantity,
                            amount,
                            checkNotNull(amountDistribution) {
                                "`amountDistribution` is required but was not set"
                            },
                            additionalProperties.toImmutable(),
                        )
                }

                class AmountDistribution
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AmountDistribution && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val DIVIDED = of("DIVIDED")

                        @JvmField val DIVIDED_ROUNDED = of("DIVIDED_ROUNDED")

                        @JvmField val EACH = of("EACH")

                        @JvmStatic fun of(value: String) = AmountDistribution(JsonField.of(value))
                    }

                    enum class Known {
                        DIVIDED,
                        DIVIDED_ROUNDED,
                        EACH,
                    }

                    enum class Value {
                        DIVIDED,
                        DIVIDED_ROUNDED,
                        EACH,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            DIVIDED -> Value.DIVIDED
                            DIVIDED_ROUNDED -> Value.DIVIDED_ROUNDED
                            EACH -> Value.EACH
                            else -> Value._UNKNOWN
                        }

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

                    fun asString(): String = _value().asStringOrThrow()
                }

                class Frequency
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Frequency && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val MONTHLY = of("MONTHLY")

                        @JvmField val QUARTERLY = of("QUARTERLY")

                        @JvmField val SEMI_ANNUAL = of("SEMI_ANNUAL")

                        @JvmField val ANNUAL = of("ANNUAL")

                        @JvmStatic fun of(value: String) = Frequency(JsonField.of(value))
                    }

                    enum class Known {
                        MONTHLY,
                        QUARTERLY,
                        SEMI_ANNUAL,
                        ANNUAL,
                    }

                    enum class Value {
                        MONTHLY,
                        QUARTERLY,
                        SEMI_ANNUAL,
                        ANNUAL,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            MONTHLY -> Value.MONTHLY
                            QUARTERLY -> Value.QUARTERLY
                            SEMI_ANNUAL -> Value.SEMI_ANNUAL
                            ANNUAL -> Value.ANNUAL
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            MONTHLY -> Known.MONTHLY
                            QUARTERLY -> Known.QUARTERLY
                            SEMI_ANNUAL -> Known.SEMI_ANNUAL
                            ANNUAL -> Known.ANNUAL
                            else -> throw MetronomeInvalidDataException("Unknown Frequency: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is RecurringSchedule && startingAt == other.startingAt && endingBefore == other.endingBefore && frequency == other.frequency && unitPrice == other.unitPrice && quantity == other.quantity && amount == other.amount && amountDistribution == other.amountDistribution && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(startingAt, endingBefore, frequency, unitPrice, quantity, amount, amountDistribution, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "RecurringSchedule{startingAt=$startingAt, endingBefore=$endingBefore, frequency=$frequency, unitPrice=$unitPrice, quantity=$quantity, amount=$amount, amountDistribution=$amountDistribution, additionalProperties=$additionalProperties}"
            }

            @JsonDeserialize(builder = ScheduleItem.Builder::class)
            @NoAutoDetect
            class ScheduleItem
            private constructor(
                private val unitPrice: Double?,
                private val quantity: Double?,
                private val amount: Double?,
                private val timestamp: OffsetDateTime?,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                /**
                 * Unit price for the charge. Will be multiplied by quantity to determine the amount
                 * and must be specified with quantity. If specified amount cannot be provided.
                 */
                @JsonProperty("unit_price") fun unitPrice(): Double? = unitPrice

                /**
                 * Quantity for the charge. Will be multiplied by unit_price to determine the amount
                 * and must be specified with unit_price. If specified amount cannot be provided.
                 */
                @JsonProperty("quantity") fun quantity(): Double? = quantity

                /**
                 * Amount for the charge. Can be provided instead of unit_price and quantity. If
                 * amount is sent, the unit_price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                @JsonProperty("amount") fun amount(): Double? = amount

                /** timestamp of the scheduled event */
                @JsonProperty("timestamp") fun timestamp(): OffsetDateTime? = timestamp

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var unitPrice: Double? = null
                    private var quantity: Double? = null
                    private var amount: Double? = null
                    private var timestamp: OffsetDateTime? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(scheduleItem: ScheduleItem) = apply {
                        this.unitPrice = scheduleItem.unitPrice
                        this.quantity = scheduleItem.quantity
                        this.amount = scheduleItem.amount
                        this.timestamp = scheduleItem.timestamp
                        additionalProperties(scheduleItem.additionalProperties)
                    }

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    @JsonProperty("unit_price")
                    fun unitPrice(unitPrice: Double) = apply { this.unitPrice = unitPrice }

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    @JsonProperty("quantity")
                    fun quantity(quantity: Double) = apply { this.quantity = quantity }

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    @JsonProperty("amount")
                    fun amount(amount: Double) = apply { this.amount = amount }

                    /** timestamp of the scheduled event */
                    @JsonProperty("timestamp")
                    fun timestamp(timestamp: OffsetDateTime) = apply { this.timestamp = timestamp }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): ScheduleItem =
                        ScheduleItem(
                            unitPrice,
                            quantity,
                            amount,
                            checkNotNull(timestamp) { "`timestamp` is required but was not set" },
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ScheduleItem && unitPrice == other.unitPrice && quantity == other.quantity && amount == other.amount && timestamp == other.timestamp && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(unitPrice, quantity, amount, timestamp, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ScheduleItem{unitPrice=$unitPrice, quantity=$quantity, amount=$amount, timestamp=$timestamp, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Schedule && creditTypeId == other.creditTypeId && scheduleItems == other.scheduleItems && recurringSchedule == other.recurringSchedule && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(creditTypeId, scheduleItems, recurringSchedule, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Schedule{creditTypeId=$creditTypeId, scheduleItems=$scheduleItems, recurringSchedule=$recurringSchedule, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ScheduledCharge && productId == other.productId && name == other.name && schedule == other.schedule && netsuiteSalesOrderId == other.netsuiteSalesOrderId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(productId, name, schedule, netsuiteSalesOrderId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ScheduledCharge{productId=$productId, name=$name, schedule=$schedule, netsuiteSalesOrderId=$netsuiteSalesOrderId, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = Transition.Builder::class)
    @NoAutoDetect
    class Transition
    private constructor(
        private val type: Type?,
        private val fromContractId: String?,
        private val futureInvoiceBehavior: FutureInvoiceBehavior?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** This field's available values may vary based on your client's configuration. */
        @JsonProperty("type") fun type(): Type? = type

        @JsonProperty("from_contract_id") fun fromContractId(): String? = fromContractId

        @JsonProperty("future_invoice_behavior")
        fun futureInvoiceBehavior(): FutureInvoiceBehavior? = futureInvoiceBehavior

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var type: Type? = null
            private var fromContractId: String? = null
            private var futureInvoiceBehavior: FutureInvoiceBehavior? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(transition: Transition) = apply {
                this.type = transition.type
                this.fromContractId = transition.fromContractId
                this.futureInvoiceBehavior = transition.futureInvoiceBehavior
                additionalProperties(transition.additionalProperties)
            }

            /** This field's available values may vary based on your client's configuration. */
            @JsonProperty("type") fun type(type: Type) = apply { this.type = type }

            @JsonProperty("from_contract_id")
            fun fromContractId(fromContractId: String) = apply {
                this.fromContractId = fromContractId
            }

            @JsonProperty("future_invoice_behavior")
            fun futureInvoiceBehavior(futureInvoiceBehavior: FutureInvoiceBehavior) = apply {
                this.futureInvoiceBehavior = futureInvoiceBehavior
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Transition =
                Transition(
                    checkNotNull(type) { "`type` is required but was not set" },
                    checkNotNull(fromContractId) { "`fromContractId` is required but was not set" },
                    futureInvoiceBehavior,
                    additionalProperties.toImmutable(),
                )
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val SUPERSEDE = of("SUPERSEDE")

                @JvmField val RENEWAL = of("RENEWAL")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                SUPERSEDE,
                RENEWAL,
            }

            enum class Value {
                SUPERSEDE,
                RENEWAL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    SUPERSEDE -> Value.SUPERSEDE
                    RENEWAL -> Value.RENEWAL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    SUPERSEDE -> Known.SUPERSEDE
                    RENEWAL -> Known.RENEWAL
                    else -> throw MetronomeInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = FutureInvoiceBehavior.Builder::class)
        @NoAutoDetect
        class FutureInvoiceBehavior
        private constructor(
            private val trueup: Trueup?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /**
             * Controls whether future trueup invoices are billed or removed. Default behavior is
             * AS_IS if not specified.
             */
            @JsonProperty("trueup") fun trueup(): Trueup? = trueup

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var trueup: Trueup? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(futureInvoiceBehavior: FutureInvoiceBehavior) = apply {
                    this.trueup = futureInvoiceBehavior.trueup
                    additionalProperties(futureInvoiceBehavior.additionalProperties)
                }

                /**
                 * Controls whether future trueup invoices are billed or removed. Default behavior
                 * is AS_IS if not specified.
                 */
                @JsonProperty("trueup") fun trueup(trueup: Trueup) = apply { this.trueup = trueup }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): FutureInvoiceBehavior =
                    FutureInvoiceBehavior(trueup, additionalProperties.toImmutable())
            }

            class Trueup
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Trueup && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val REMOVE = of("REMOVE")

                    @JvmField val AS_IS = of("AS_IS")

                    @JvmStatic fun of(value: String) = Trueup(JsonField.of(value))
                }

                enum class Known {
                    REMOVE,
                    AS_IS,
                }

                enum class Value {
                    REMOVE,
                    AS_IS,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        REMOVE -> Value.REMOVE
                        AS_IS -> Value.AS_IS
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        REMOVE -> Known.REMOVE
                        AS_IS -> Known.AS_IS
                        else -> throw MetronomeInvalidDataException("Unknown Trueup: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is FutureInvoiceBehavior && trueup == other.trueup && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(trueup, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "FutureInvoiceBehavior{trueup=$trueup, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Transition && type == other.type && fromContractId == other.fromContractId && futureInvoiceBehavior == other.futureInvoiceBehavior && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(type, fromContractId, futureInvoiceBehavior, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Transition{type=$type, fromContractId=$fromContractId, futureInvoiceBehavior=$futureInvoiceBehavior, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = UsageStatementSchedule.Builder::class)
    @NoAutoDetect
    class UsageStatementSchedule
    private constructor(
        private val frequency: Frequency?,
        private val day: Day?,
        private val billingAnchorDate: OffsetDateTime?,
        private val invoiceGenerationStartingAt: OffsetDateTime?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("frequency") fun frequency(): Frequency? = frequency

        /** If not provided, defaults to the first day of the month. */
        @JsonProperty("day") fun day(): Day? = day

        /**
         * Required when using CUSTOM_DATE. This option lets you set a historical billing anchor
         * date, aligning future billing cycles with a chosen cadence. For example, if a contract
         * starts on 2024-09-15 and you set the anchor date to 2024-09-10 with a MONTHLY frequency,
         * the first usage statement will cover 09-15 to 10-10. Subsequent statements will follow
         * the 10th of each month.
         */
        @JsonProperty("billing_anchor_date")
        fun billingAnchorDate(): OffsetDateTime? = billingAnchorDate

        /**
         * The date Metronome should start generating usage invoices. If unspecified, contract start
         * date will be used. This is useful to set if you want to import historical invoices via
         * our 'Create Historical Invoices' API rather than having Metronome automatically generate
         * them.
         */
        @JsonProperty("invoice_generation_starting_at")
        fun invoiceGenerationStartingAt(): OffsetDateTime? = invoiceGenerationStartingAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var frequency: Frequency? = null
            private var day: Day? = null
            private var billingAnchorDate: OffsetDateTime? = null
            private var invoiceGenerationStartingAt: OffsetDateTime? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(usageStatementSchedule: UsageStatementSchedule) = apply {
                this.frequency = usageStatementSchedule.frequency
                this.day = usageStatementSchedule.day
                this.billingAnchorDate = usageStatementSchedule.billingAnchorDate
                this.invoiceGenerationStartingAt =
                    usageStatementSchedule.invoiceGenerationStartingAt
                additionalProperties(usageStatementSchedule.additionalProperties)
            }

            @JsonProperty("frequency")
            fun frequency(frequency: Frequency) = apply { this.frequency = frequency }

            /** If not provided, defaults to the first day of the month. */
            @JsonProperty("day") fun day(day: Day) = apply { this.day = day }

            /**
             * Required when using CUSTOM_DATE. This option lets you set a historical billing anchor
             * date, aligning future billing cycles with a chosen cadence. For example, if a
             * contract starts on 2024-09-15 and you set the anchor date to 2024-09-10 with a
             * MONTHLY frequency, the first usage statement will cover 09-15 to 10-10. Subsequent
             * statements will follow the 10th of each month.
             */
            @JsonProperty("billing_anchor_date")
            fun billingAnchorDate(billingAnchorDate: OffsetDateTime) = apply {
                this.billingAnchorDate = billingAnchorDate
            }

            /**
             * The date Metronome should start generating usage invoices. If unspecified, contract
             * start date will be used. This is useful to set if you want to import historical
             * invoices via our 'Create Historical Invoices' API rather than having Metronome
             * automatically generate them.
             */
            @JsonProperty("invoice_generation_starting_at")
            fun invoiceGenerationStartingAt(invoiceGenerationStartingAt: OffsetDateTime) = apply {
                this.invoiceGenerationStartingAt = invoiceGenerationStartingAt
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): UsageStatementSchedule =
                UsageStatementSchedule(
                    checkNotNull(frequency) { "`frequency` is required but was not set" },
                    day,
                    billingAnchorDate,
                    invoiceGenerationStartingAt,
                    additionalProperties.toImmutable(),
                )
        }

        class Frequency
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Frequency && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val MONTHLY = of("MONTHLY")

                @JvmField val QUARTERLY = of("QUARTERLY")

                @JvmField val ANNUAL = of("ANNUAL")

                @JvmStatic fun of(value: String) = Frequency(JsonField.of(value))
            }

            enum class Known {
                MONTHLY,
                QUARTERLY,
                ANNUAL,
            }

            enum class Value {
                MONTHLY,
                QUARTERLY,
                ANNUAL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    MONTHLY -> Value.MONTHLY
                    QUARTERLY -> Value.QUARTERLY
                    ANNUAL -> Value.ANNUAL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    MONTHLY -> Known.MONTHLY
                    QUARTERLY -> Known.QUARTERLY
                    ANNUAL -> Known.ANNUAL
                    else -> throw MetronomeInvalidDataException("Unknown Frequency: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class Day
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Day && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val FIRST_OF_MONTH = of("FIRST_OF_MONTH")

                @JvmField val CONTRACT_START = of("CONTRACT_START")

                @JvmField val CUSTOM_DATE = of("CUSTOM_DATE")

                @JvmField val CUSTOM_DATE = of("custom_date")

                @JvmStatic fun of(value: String) = Day(JsonField.of(value))
            }

            enum class Known {
                FIRST_OF_MONTH,
                CONTRACT_START,
                CUSTOM_DATE,
                CUSTOM_DATE,
            }

            enum class Value {
                FIRST_OF_MONTH,
                CONTRACT_START,
                CUSTOM_DATE,
                CUSTOM_DATE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    FIRST_OF_MONTH -> Value.FIRST_OF_MONTH
                    CONTRACT_START -> Value.CONTRACT_START
                    CUSTOM_DATE -> Value.CUSTOM_DATE
                    CUSTOM_DATE -> Value.CUSTOM_DATE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    FIRST_OF_MONTH -> Known.FIRST_OF_MONTH
                    CONTRACT_START -> Known.CONTRACT_START
                    CUSTOM_DATE -> Known.CUSTOM_DATE
                    CUSTOM_DATE -> Known.CUSTOM_DATE
                    else -> throw MetronomeInvalidDataException("Unknown Day: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is UsageStatementSchedule && frequency == other.frequency && day == other.day && billingAnchorDate == other.billingAnchorDate && invoiceGenerationStartingAt == other.invoiceGenerationStartingAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(frequency, day, billingAnchorDate, invoiceGenerationStartingAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "UsageStatementSchedule{frequency=$frequency, day=$day, billingAnchorDate=$billingAnchorDate, invoiceGenerationStartingAt=$invoiceGenerationStartingAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractCreateParams && customerId == other.customerId && startingAt == other.startingAt && billingProviderConfiguration == other.billingProviderConfiguration && commits == other.commits && credits == other.credits && customFields == other.customFields && discounts == other.discounts && endingBefore == other.endingBefore && multiplierOverridePrioritization == other.multiplierOverridePrioritization && name == other.name && netPaymentTermsDays == other.netPaymentTermsDays && netsuiteSalesOrderId == other.netsuiteSalesOrderId && overrides == other.overrides && professionalServices == other.professionalServices && rateCardAlias == other.rateCardAlias && rateCardId == other.rateCardId && resellerRoyalties == other.resellerRoyalties && salesforceOpportunityId == other.salesforceOpportunityId && scheduledCharges == other.scheduledCharges && totalContractValue == other.totalContractValue && transition == other.transition && uniquenessKey == other.uniquenessKey && usageFilter == other.usageFilter && usageStatementSchedule == other.usageStatementSchedule && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(customerId, startingAt, billingProviderConfiguration, commits, credits, customFields, discounts, endingBefore, multiplierOverridePrioritization, name, netPaymentTermsDays, netsuiteSalesOrderId, overrides, professionalServices, rateCardAlias, rateCardId, resellerRoyalties, salesforceOpportunityId, scheduledCharges, totalContractValue, transition, uniquenessKey, usageFilter, usageStatementSchedule, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "ContractCreateParams{customerId=$customerId, startingAt=$startingAt, billingProviderConfiguration=$billingProviderConfiguration, commits=$commits, credits=$credits, customFields=$customFields, discounts=$discounts, endingBefore=$endingBefore, multiplierOverridePrioritization=$multiplierOverridePrioritization, name=$name, netPaymentTermsDays=$netPaymentTermsDays, netsuiteSalesOrderId=$netsuiteSalesOrderId, overrides=$overrides, professionalServices=$professionalServices, rateCardAlias=$rateCardAlias, rateCardId=$rateCardId, resellerRoyalties=$resellerRoyalties, salesforceOpportunityId=$salesforceOpportunityId, scheduledCharges=$scheduledCharges, totalContractValue=$totalContractValue, transition=$transition, uniquenessKey=$uniquenessKey, usageFilter=$usageFilter, usageStatementSchedule=$usageStatementSchedule, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
