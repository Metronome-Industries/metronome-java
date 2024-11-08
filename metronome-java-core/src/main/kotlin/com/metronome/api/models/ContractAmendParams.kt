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

class ContractAmendParams
constructor(
    private val contractId: String,
    private val customerId: String,
    private val startingAt: OffsetDateTime,
    private val commits: List<Commit>?,
    private val credits: List<Credit>?,
    private val customFields: CustomFields?,
    private val discounts: List<Discount>?,
    private val netsuiteSalesOrderId: String?,
    private val overrides: List<Override>?,
    private val professionalServices: List<ProfessionalService>?,
    private val resellerRoyalties: List<ResellerRoyalty>?,
    private val salesforceOpportunityId: String?,
    private val scheduledCharges: List<ScheduledCharge>?,
    private val totalContractValue: Double?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun contractId(): String = contractId

    fun customerId(): String = customerId

    fun startingAt(): OffsetDateTime = startingAt

    fun commits(): Optional<List<Commit>> = Optional.ofNullable(commits)

    fun credits(): Optional<List<Credit>> = Optional.ofNullable(credits)

    fun customFields(): Optional<CustomFields> = Optional.ofNullable(customFields)

    fun discounts(): Optional<List<Discount>> = Optional.ofNullable(discounts)

    fun netsuiteSalesOrderId(): Optional<String> = Optional.ofNullable(netsuiteSalesOrderId)

    fun overrides(): Optional<List<Override>> = Optional.ofNullable(overrides)

    fun professionalServices(): Optional<List<ProfessionalService>> =
        Optional.ofNullable(professionalServices)

    fun resellerRoyalties(): Optional<List<ResellerRoyalty>> =
        Optional.ofNullable(resellerRoyalties)

    fun salesforceOpportunityId(): Optional<String> = Optional.ofNullable(salesforceOpportunityId)

    fun scheduledCharges(): Optional<List<ScheduledCharge>> = Optional.ofNullable(scheduledCharges)

    fun totalContractValue(): Optional<Double> = Optional.ofNullable(totalContractValue)

    @JvmSynthetic
    internal fun getBody(): ContractAmendBody {
        return ContractAmendBody(
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
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = ContractAmendBody.Builder::class)
    @NoAutoDetect
    class ContractAmendBody
    internal constructor(
        private val contractId: String?,
        private val customerId: String?,
        private val startingAt: OffsetDateTime?,
        private val commits: List<Commit>?,
        private val credits: List<Credit>?,
        private val customFields: CustomFields?,
        private val discounts: List<Discount>?,
        private val netsuiteSalesOrderId: String?,
        private val overrides: List<Override>?,
        private val professionalServices: List<ProfessionalService>?,
        private val resellerRoyalties: List<ResellerRoyalty>?,
        private val salesforceOpportunityId: String?,
        private val scheduledCharges: List<ScheduledCharge>?,
        private val totalContractValue: Double?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** ID of the contract to amend */
        @JsonProperty("contract_id") fun contractId(): String? = contractId

        /** ID of the customer whose contract is to be amended */
        @JsonProperty("customer_id") fun customerId(): String? = customerId

        /** inclusive start time for the amendment */
        @JsonProperty("starting_at") fun startingAt(): OffsetDateTime? = startingAt

        @JsonProperty("commits") fun commits(): List<Commit>? = commits

        @JsonProperty("credits") fun credits(): List<Credit>? = credits

        @JsonProperty("custom_fields") fun customFields(): CustomFields? = customFields

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("discounts") fun discounts(): List<Discount>? = discounts

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("netsuite_sales_order_id")
        fun netsuiteSalesOrderId(): String? = netsuiteSalesOrderId

        @JsonProperty("overrides") fun overrides(): List<Override>? = overrides

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("professional_services")
        fun professionalServices(): List<ProfessionalService>? = professionalServices

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

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var contractId: String? = null
            private var customerId: String? = null
            private var startingAt: OffsetDateTime? = null
            private var commits: List<Commit>? = null
            private var credits: List<Credit>? = null
            private var customFields: CustomFields? = null
            private var discounts: List<Discount>? = null
            private var netsuiteSalesOrderId: String? = null
            private var overrides: List<Override>? = null
            private var professionalServices: List<ProfessionalService>? = null
            private var resellerRoyalties: List<ResellerRoyalty>? = null
            private var salesforceOpportunityId: String? = null
            private var scheduledCharges: List<ScheduledCharge>? = null
            private var totalContractValue: Double? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contractAmendBody: ContractAmendBody) = apply {
                this.contractId = contractAmendBody.contractId
                this.customerId = contractAmendBody.customerId
                this.startingAt = contractAmendBody.startingAt
                this.commits = contractAmendBody.commits
                this.credits = contractAmendBody.credits
                this.customFields = contractAmendBody.customFields
                this.discounts = contractAmendBody.discounts
                this.netsuiteSalesOrderId = contractAmendBody.netsuiteSalesOrderId
                this.overrides = contractAmendBody.overrides
                this.professionalServices = contractAmendBody.professionalServices
                this.resellerRoyalties = contractAmendBody.resellerRoyalties
                this.salesforceOpportunityId = contractAmendBody.salesforceOpportunityId
                this.scheduledCharges = contractAmendBody.scheduledCharges
                this.totalContractValue = contractAmendBody.totalContractValue
                additionalProperties(contractAmendBody.additionalProperties)
            }

            /** ID of the contract to amend */
            @JsonProperty("contract_id")
            fun contractId(contractId: String) = apply { this.contractId = contractId }

            /** ID of the customer whose contract is to be amended */
            @JsonProperty("customer_id")
            fun customerId(customerId: String) = apply { this.customerId = customerId }

            /** inclusive start time for the amendment */
            @JsonProperty("starting_at")
            fun startingAt(startingAt: OffsetDateTime) = apply { this.startingAt = startingAt }

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

            fun build(): ContractAmendBody =
                ContractAmendBody(
                    checkNotNull(contractId) { "`contractId` is required but was not set" },
                    checkNotNull(customerId) { "`customerId` is required but was not set" },
                    checkNotNull(startingAt) { "`startingAt` is required but was not set" },
                    commits?.toImmutable(),
                    credits?.toImmutable(),
                    customFields,
                    discounts?.toImmutable(),
                    netsuiteSalesOrderId,
                    overrides?.toImmutable(),
                    professionalServices?.toImmutable(),
                    resellerRoyalties?.toImmutable(),
                    salesforceOpportunityId,
                    scheduledCharges?.toImmutable(),
                    totalContractValue,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ContractAmendBody && this.contractId == other.contractId && this.customerId == other.customerId && this.startingAt == other.startingAt && this.commits == other.commits && this.credits == other.credits && this.customFields == other.customFields && this.discounts == other.discounts && this.netsuiteSalesOrderId == other.netsuiteSalesOrderId && this.overrides == other.overrides && this.professionalServices == other.professionalServices && this.resellerRoyalties == other.resellerRoyalties && this.salesforceOpportunityId == other.salesforceOpportunityId && this.scheduledCharges == other.scheduledCharges && this.totalContractValue == other.totalContractValue && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(contractId, customerId, startingAt, commits, credits, customFields, discounts, netsuiteSalesOrderId, overrides, professionalServices, resellerRoyalties, salesforceOpportunityId, scheduledCharges, totalContractValue, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ContractAmendBody{contractId=$contractId, customerId=$customerId, startingAt=$startingAt, commits=$commits, credits=$credits, customFields=$customFields, discounts=$discounts, netsuiteSalesOrderId=$netsuiteSalesOrderId, overrides=$overrides, professionalServices=$professionalServices, resellerRoyalties=$resellerRoyalties, salesforceOpportunityId=$salesforceOpportunityId, scheduledCharges=$scheduledCharges, totalContractValue=$totalContractValue, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractAmendParams && this.contractId == other.contractId && this.customerId == other.customerId && this.startingAt == other.startingAt && this.commits == other.commits && this.credits == other.credits && this.customFields == other.customFields && this.discounts == other.discounts && this.netsuiteSalesOrderId == other.netsuiteSalesOrderId && this.overrides == other.overrides && this.professionalServices == other.professionalServices && this.resellerRoyalties == other.resellerRoyalties && this.salesforceOpportunityId == other.salesforceOpportunityId && this.scheduledCharges == other.scheduledCharges && this.totalContractValue == other.totalContractValue && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(contractId, customerId, startingAt, commits, credits, customFields, discounts, netsuiteSalesOrderId, overrides, professionalServices, resellerRoyalties, salesforceOpportunityId, scheduledCharges, totalContractValue, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ContractAmendParams{contractId=$contractId, customerId=$customerId, startingAt=$startingAt, commits=$commits, credits=$credits, customFields=$customFields, discounts=$discounts, netsuiteSalesOrderId=$netsuiteSalesOrderId, overrides=$overrides, professionalServices=$professionalServices, resellerRoyalties=$resellerRoyalties, salesforceOpportunityId=$salesforceOpportunityId, scheduledCharges=$scheduledCharges, totalContractValue=$totalContractValue, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var contractId: String? = null
        private var customerId: String? = null
        private var startingAt: OffsetDateTime? = null
        private var commits: MutableList<Commit> = mutableListOf()
        private var credits: MutableList<Credit> = mutableListOf()
        private var customFields: CustomFields? = null
        private var discounts: MutableList<Discount> = mutableListOf()
        private var netsuiteSalesOrderId: String? = null
        private var overrides: MutableList<Override> = mutableListOf()
        private var professionalServices: MutableList<ProfessionalService> = mutableListOf()
        private var resellerRoyalties: MutableList<ResellerRoyalty> = mutableListOf()
        private var salesforceOpportunityId: String? = null
        private var scheduledCharges: MutableList<ScheduledCharge> = mutableListOf()
        private var totalContractValue: Double? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contractAmendParams: ContractAmendParams) = apply {
            this.contractId = contractAmendParams.contractId
            this.customerId = contractAmendParams.customerId
            this.startingAt = contractAmendParams.startingAt
            this.commits(contractAmendParams.commits ?: listOf())
            this.credits(contractAmendParams.credits ?: listOf())
            this.customFields = contractAmendParams.customFields
            this.discounts(contractAmendParams.discounts ?: listOf())
            this.netsuiteSalesOrderId = contractAmendParams.netsuiteSalesOrderId
            this.overrides(contractAmendParams.overrides ?: listOf())
            this.professionalServices(contractAmendParams.professionalServices ?: listOf())
            this.resellerRoyalties(contractAmendParams.resellerRoyalties ?: listOf())
            this.salesforceOpportunityId = contractAmendParams.salesforceOpportunityId
            this.scheduledCharges(contractAmendParams.scheduledCharges ?: listOf())
            this.totalContractValue = contractAmendParams.totalContractValue
            additionalHeaders(contractAmendParams.additionalHeaders)
            additionalQueryParams(contractAmendParams.additionalQueryParams)
            additionalBodyProperties(contractAmendParams.additionalBodyProperties)
        }

        /** ID of the contract to amend */
        fun contractId(contractId: String) = apply { this.contractId = contractId }

        /** ID of the customer whose contract is to be amended */
        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /** inclusive start time for the amendment */
        fun startingAt(startingAt: OffsetDateTime) = apply { this.startingAt = startingAt }

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

        fun build(): ContractAmendParams =
            ContractAmendParams(
                checkNotNull(contractId) { "`contractId` is required but was not set" },
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                checkNotNull(startingAt) { "`startingAt` is required but was not set" },
                if (commits.size == 0) null else commits.toImmutable(),
                if (credits.size == 0) null else credits.toImmutable(),
                customFields,
                if (discounts.size == 0) null else discounts.toImmutable(),
                netsuiteSalesOrderId,
                if (overrides.size == 0) null else overrides.toImmutable(),
                if (professionalServices.size == 0) null else professionalServices.toImmutable(),
                if (resellerRoyalties.size == 0) null else resellerRoyalties.toImmutable(),
                salesforceOpportunityId,
                if (scheduledCharges.size == 0) null else scheduledCharges.toImmutable(),
                totalContractValue,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = Commit.Builder::class)
    @NoAutoDetect
    class Commit
    private constructor(
        private val type: Type?,
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
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("type") fun type(): Type? = type

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

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var type: Type? = null
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
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(commit: Commit) = apply {
                this.type = commit.type
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
                additionalProperties(commit.additionalProperties)
            }

            @JsonProperty("type") fun type(type: Type) = apply { this.type = type }

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

                return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val PREPAID = Type(JsonField.of("PREPAID"))

                @JvmField val POSTPAID = Type(JsonField.of("POSTPAID"))

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

                    return /* spotless:off */ other is ScheduleItem && this.amount == other.amount && this.startingAt == other.startingAt && this.endingBefore == other.endingBefore && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(amount, startingAt, endingBefore, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "ScheduleItem{amount=$amount, startingAt=$startingAt, endingBefore=$endingBefore, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AccessSchedule && this.creditTypeId == other.creditTypeId && this.scheduleItems == other.scheduleItems && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(creditTypeId, scheduleItems, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

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

                return /* spotless:off */ other is CustomFields && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

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

                        return /* spotless:off */ other is AmountDistribution && this.value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val DIVIDED = AmountDistribution(JsonField.of("DIVIDED"))

                        @JvmField
                        val DIVIDED_ROUNDED = AmountDistribution(JsonField.of("DIVIDED_ROUNDED"))

                        @JvmField val EACH = AmountDistribution(JsonField.of("EACH"))

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

                        return /* spotless:off */ other is Frequency && this.value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val MONTHLY = Frequency(JsonField.of("MONTHLY"))

                        @JvmField val QUARTERLY = Frequency(JsonField.of("QUARTERLY"))

                        @JvmField val SEMI_ANNUAL = Frequency(JsonField.of("SEMI_ANNUAL"))

                        @JvmField val ANNUAL = Frequency(JsonField.of("ANNUAL"))

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

                    return /* spotless:off */ other is RecurringSchedule && this.startingAt == other.startingAt && this.endingBefore == other.endingBefore && this.frequency == other.frequency && this.unitPrice == other.unitPrice && this.quantity == other.quantity && this.amount == other.amount && this.amountDistribution == other.amountDistribution && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(startingAt, endingBefore, frequency, unitPrice, quantity, amount, amountDistribution, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

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

                    return /* spotless:off */ other is ScheduleItem && this.unitPrice == other.unitPrice && this.quantity == other.quantity && this.amount == other.amount && this.timestamp == other.timestamp && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(unitPrice, quantity, amount, timestamp, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "ScheduleItem{unitPrice=$unitPrice, quantity=$quantity, amount=$amount, timestamp=$timestamp, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoiceSchedule && this.creditTypeId == other.creditTypeId && this.scheduleItems == other.scheduleItems && this.recurringSchedule == other.recurringSchedule && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(creditTypeId, scheduleItems, recurringSchedule, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "InvoiceSchedule{creditTypeId=$creditTypeId, scheduleItems=$scheduleItems, recurringSchedule=$recurringSchedule, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Commit && this.type == other.type && this.name == other.name && this.productId == other.productId && this.accessSchedule == other.accessSchedule && this.invoiceSchedule == other.invoiceSchedule && this.amount == other.amount && this.description == other.description && this.rolloverFraction == other.rolloverFraction && this.priority == other.priority && this.applicableProductIds == other.applicableProductIds && this.applicableProductTags == other.applicableProductTags && this.netsuiteSalesOrderId == other.netsuiteSalesOrderId && this.customFields == other.customFields && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(type, name, productId, accessSchedule, invoiceSchedule, amount, description, rolloverFraction, priority, applicableProductIds, applicableProductTags, netsuiteSalesOrderId, customFields, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Commit{type=$type, name=$name, productId=$productId, accessSchedule=$accessSchedule, invoiceSchedule=$invoiceSchedule, amount=$amount, description=$description, rolloverFraction=$rolloverFraction, priority=$priority, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, netsuiteSalesOrderId=$netsuiteSalesOrderId, customFields=$customFields, additionalProperties=$additionalProperties}"
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

                    return /* spotless:off */ other is ScheduleItem && this.amount == other.amount && this.startingAt == other.startingAt && this.endingBefore == other.endingBefore && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(amount, startingAt, endingBefore, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "ScheduleItem{amount=$amount, startingAt=$startingAt, endingBefore=$endingBefore, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AccessSchedule && this.creditTypeId == other.creditTypeId && this.scheduleItems == other.scheduleItems && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(creditTypeId, scheduleItems, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

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

                return /* spotless:off */ other is CustomFields && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Credit && this.name == other.name && this.productId == other.productId && this.accessSchedule == other.accessSchedule && this.description == other.description && this.applicableProductIds == other.applicableProductIds && this.applicableProductTags == other.applicableProductTags && this.netsuiteSalesOrderId == other.netsuiteSalesOrderId && this.priority == other.priority && this.customFields == other.customFields && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(name, productId, accessSchedule, description, applicableProductIds, applicableProductTags, netsuiteSalesOrderId, priority, customFields, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Credit{name=$name, productId=$productId, accessSchedule=$accessSchedule, description=$description, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, netsuiteSalesOrderId=$netsuiteSalesOrderId, priority=$priority, customFields=$customFields, additionalProperties=$additionalProperties}"
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

            return /* spotless:off */ other is CustomFields && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

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

                        return /* spotless:off */ other is AmountDistribution && this.value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val DIVIDED = AmountDistribution(JsonField.of("DIVIDED"))

                        @JvmField
                        val DIVIDED_ROUNDED = AmountDistribution(JsonField.of("DIVIDED_ROUNDED"))

                        @JvmField val EACH = AmountDistribution(JsonField.of("EACH"))

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

                        return /* spotless:off */ other is Frequency && this.value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val MONTHLY = Frequency(JsonField.of("MONTHLY"))

                        @JvmField val QUARTERLY = Frequency(JsonField.of("QUARTERLY"))

                        @JvmField val SEMI_ANNUAL = Frequency(JsonField.of("SEMI_ANNUAL"))

                        @JvmField val ANNUAL = Frequency(JsonField.of("ANNUAL"))

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

                    return /* spotless:off */ other is RecurringSchedule && this.startingAt == other.startingAt && this.endingBefore == other.endingBefore && this.frequency == other.frequency && this.unitPrice == other.unitPrice && this.quantity == other.quantity && this.amount == other.amount && this.amountDistribution == other.amountDistribution && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(startingAt, endingBefore, frequency, unitPrice, quantity, amount, amountDistribution, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

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

                    return /* spotless:off */ other is ScheduleItem && this.unitPrice == other.unitPrice && this.quantity == other.quantity && this.amount == other.amount && this.timestamp == other.timestamp && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(unitPrice, quantity, amount, timestamp, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "ScheduleItem{unitPrice=$unitPrice, quantity=$quantity, amount=$amount, timestamp=$timestamp, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Schedule && this.creditTypeId == other.creditTypeId && this.scheduleItems == other.scheduleItems && this.recurringSchedule == other.recurringSchedule && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(creditTypeId, scheduleItems, recurringSchedule, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "Schedule{creditTypeId=$creditTypeId, scheduleItems=$scheduleItems, recurringSchedule=$recurringSchedule, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Discount && this.productId == other.productId && this.name == other.name && this.schedule == other.schedule && this.netsuiteSalesOrderId == other.netsuiteSalesOrderId && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(productId, name, schedule, netsuiteSalesOrderId, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Discount{productId=$productId, name=$name, schedule=$schedule, netsuiteSalesOrderId=$netsuiteSalesOrderId, additionalProperties=$additionalProperties}"
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

        /** ID of the product whose rate is being overridden */
        @JsonProperty("product_id") fun productId(): String? = productId

        /** tags identifying products whose rates are being overridden */
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

            /** ID of the product whose rate is being overridden */
            @JsonProperty("product_id")
            fun productId(productId: String) = apply { this.productId = productId }

            /** tags identifying products whose rates are being overridden */
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
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(builder = OverrideSpecifier.Builder::class)
        @NoAutoDetect
        class OverrideSpecifier
        private constructor(
            private val productId: String?,
            private val productTags: List<String>?,
            private val pricingGroupValues: PricingGroupValues?,
            private val presentationGroupValues: PresentationGroupValues?,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

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

                private var productId: String? = null
                private var productTags: List<String>? = null
                private var pricingGroupValues: PricingGroupValues? = null
                private var presentationGroupValues: PresentationGroupValues? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(overrideSpecifier: OverrideSpecifier) = apply {
                    this.productId = overrideSpecifier.productId
                    this.productTags = overrideSpecifier.productTags
                    this.pricingGroupValues = overrideSpecifier.pricingGroupValues
                    this.presentationGroupValues = overrideSpecifier.presentationGroupValues
                    additionalProperties(overrideSpecifier.additionalProperties)
                }

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

                    return /* spotless:off */ other is PresentationGroupValues && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

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

                    return /* spotless:off */ other is PricingGroupValues && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "PricingGroupValues{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is OverrideSpecifier && this.productId == other.productId && this.productTags == other.productTags && this.pricingGroupValues == other.pricingGroupValues && this.presentationGroupValues == other.presentationGroupValues && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(productId, productTags, pricingGroupValues, presentationGroupValues, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "OverrideSpecifier{productId=$productId, productTags=$productTags, pricingGroupValues=$pricingGroupValues, presentationGroupValues=$presentationGroupValues, additionalProperties=$additionalProperties}"
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

            /** Default proration configuration. Only valid for SUBSCRIPTION rate_type. */
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

                /** Default proration configuration. Only valid for SUBSCRIPTION rate_type. */
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

                    return /* spotless:off */ other is RateType && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val FLAT = RateType(JsonField.of("FLAT"))

                    @JvmField val PERCENTAGE = RateType(JsonField.of("PERCENTAGE"))

                    @JvmField val SUBSCRIPTION = RateType(JsonField.of("SUBSCRIPTION"))

                    @JvmField val TIERED = RateType(JsonField.of("TIERED"))

                    @JvmField val CUSTOM = RateType(JsonField.of("CUSTOM"))

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

                    return /* spotless:off */ other is CustomRate && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() = "CustomRate{additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is OverwriteRate && this.rateType == other.rateType && this.price == other.price && this.quantity == other.quantity && this.isProrated == other.isProrated && this.tiers == other.tiers && this.customRate == other.customRate && this.creditTypeId == other.creditTypeId && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(rateType, price, quantity, isProrated, tiers, customRate, creditTypeId, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "OverwriteRate{rateType=$rateType, price=$price, quantity=$quantity, isProrated=$isProrated, tiers=$tiers, customRate=$customRate, creditTypeId=$creditTypeId, additionalProperties=$additionalProperties}"
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

                return /* spotless:off */ other is Tier && this.size == other.size && this.multiplier == other.multiplier && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(size, multiplier, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

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

                return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val OVERWRITE = Type(JsonField.of("OVERWRITE"))

                @JvmField val MULTIPLIER = Type(JsonField.of("MULTIPLIER"))

                @JvmField val TIERED = Type(JsonField.of("TIERED"))

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

            return /* spotless:off */ other is Override && this.startingAt == other.startingAt && this.endingBefore == other.endingBefore && this.entitled == other.entitled && this.type == other.type && this.multiplier == other.multiplier && this.priority == other.priority && this.overwriteRate == other.overwriteRate && this.productId == other.productId && this.applicableProductTags == other.applicableProductTags && this.overrideSpecifiers == other.overrideSpecifiers && this.tiers == other.tiers && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(startingAt, endingBefore, entitled, type, multiplier, priority, overwriteRate, productId, applicableProductTags, overrideSpecifiers, tiers, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Override{startingAt=$startingAt, endingBefore=$endingBefore, entitled=$entitled, type=$type, multiplier=$multiplier, priority=$priority, overwriteRate=$overwriteRate, productId=$productId, applicableProductTags=$applicableProductTags, overrideSpecifiers=$overrideSpecifiers, tiers=$tiers, additionalProperties=$additionalProperties}"
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

                return /* spotless:off */ other is CustomFields && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ProfessionalService && this.description == other.description && this.productId == other.productId && this.netsuiteSalesOrderId == other.netsuiteSalesOrderId && this.unitPrice == other.unitPrice && this.quantity == other.quantity && this.maxAmount == other.maxAmount && this.customFields == other.customFields && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(description, productId, netsuiteSalesOrderId, unitPrice, quantity, maxAmount, customFields, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

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

        /** Use null to indicate that the existing end timestamp should be removed. */
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

            /** Use null to indicate that the existing end timestamp should be removed. */
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
                    fraction,
                    netsuiteResellerId,
                    applicableProductIds?.toImmutable(),
                    applicableProductTags?.toImmutable(),
                    startingAt,
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

                return /* spotless:off */ other is ResellerType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val AWS = ResellerType(JsonField.of("AWS"))

                @JvmField val AWS_PRO_SERVICE = ResellerType(JsonField.of("AWS_PRO_SERVICE"))

                @JvmField val GCP = ResellerType(JsonField.of("GCP"))

                @JvmField val GCP_PRO_SERVICE = ResellerType(JsonField.of("GCP_PRO_SERVICE"))

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

                return /* spotless:off */ other is AwsOptions && this.awsAccountNumber == other.awsAccountNumber && this.awsPayerReferenceId == other.awsPayerReferenceId && this.awsOfferId == other.awsOfferId && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(awsAccountNumber, awsPayerReferenceId, awsOfferId, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

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

                return /* spotless:off */ other is GcpOptions && this.gcpAccountId == other.gcpAccountId && this.gcpOfferId == other.gcpOfferId && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(gcpAccountId, gcpOfferId, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "GcpOptions{gcpAccountId=$gcpAccountId, gcpOfferId=$gcpOfferId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ResellerRoyalty && this.resellerType == other.resellerType && this.fraction == other.fraction && this.netsuiteResellerId == other.netsuiteResellerId && this.applicableProductIds == other.applicableProductIds && this.applicableProductTags == other.applicableProductTags && this.startingAt == other.startingAt && this.endingBefore == other.endingBefore && this.resellerContractValue == other.resellerContractValue && this.awsOptions == other.awsOptions && this.gcpOptions == other.gcpOptions && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(resellerType, fraction, netsuiteResellerId, applicableProductIds, applicableProductTags, startingAt, endingBefore, resellerContractValue, awsOptions, gcpOptions, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

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

                        return /* spotless:off */ other is AmountDistribution && this.value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val DIVIDED = AmountDistribution(JsonField.of("DIVIDED"))

                        @JvmField
                        val DIVIDED_ROUNDED = AmountDistribution(JsonField.of("DIVIDED_ROUNDED"))

                        @JvmField val EACH = AmountDistribution(JsonField.of("EACH"))

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

                        return /* spotless:off */ other is Frequency && this.value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        @JvmField val MONTHLY = Frequency(JsonField.of("MONTHLY"))

                        @JvmField val QUARTERLY = Frequency(JsonField.of("QUARTERLY"))

                        @JvmField val SEMI_ANNUAL = Frequency(JsonField.of("SEMI_ANNUAL"))

                        @JvmField val ANNUAL = Frequency(JsonField.of("ANNUAL"))

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

                    return /* spotless:off */ other is RecurringSchedule && this.startingAt == other.startingAt && this.endingBefore == other.endingBefore && this.frequency == other.frequency && this.unitPrice == other.unitPrice && this.quantity == other.quantity && this.amount == other.amount && this.amountDistribution == other.amountDistribution && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(startingAt, endingBefore, frequency, unitPrice, quantity, amount, amountDistribution, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

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

                    return /* spotless:off */ other is ScheduleItem && this.unitPrice == other.unitPrice && this.quantity == other.quantity && this.amount == other.amount && this.timestamp == other.timestamp && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(unitPrice, quantity, amount, timestamp, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "ScheduleItem{unitPrice=$unitPrice, quantity=$quantity, amount=$amount, timestamp=$timestamp, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Schedule && this.creditTypeId == other.creditTypeId && this.scheduleItems == other.scheduleItems && this.recurringSchedule == other.recurringSchedule && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(creditTypeId, scheduleItems, recurringSchedule, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "Schedule{creditTypeId=$creditTypeId, scheduleItems=$scheduleItems, recurringSchedule=$recurringSchedule, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ScheduledCharge && this.productId == other.productId && this.name == other.name && this.schedule == other.schedule && this.netsuiteSalesOrderId == other.netsuiteSalesOrderId && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(productId, name, schedule, netsuiteSalesOrderId, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ScheduledCharge{productId=$productId, name=$name, schedule=$schedule, netsuiteSalesOrderId=$netsuiteSalesOrderId, additionalProperties=$additionalProperties}"
    }
}
