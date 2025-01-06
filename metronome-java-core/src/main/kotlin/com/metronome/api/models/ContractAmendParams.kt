// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

class ContractAmendParams
constructor(
    private val body: ContractAmendBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** ID of the contract to amend */
    fun contractId(): String = body.contractId()

    /** ID of the customer whose contract is to be amended */
    fun customerId(): String = body.customerId()

    /** inclusive start time for the amendment */
    fun startingAt(): OffsetDateTime = body.startingAt()

    fun commits(): Optional<List<Commit>> = body.commits()

    fun credits(): Optional<List<Credit>> = body.credits()

    fun customFields(): Optional<CustomFields> = body.customFields()

    /** This field's availability is dependent on your client's configuration. */
    fun discounts(): Optional<List<Discount>> = body.discounts()

    /** This field's availability is dependent on your client's configuration. */
    fun netsuiteSalesOrderId(): Optional<String> = body.netsuiteSalesOrderId()

    fun overrides(): Optional<List<Override>> = body.overrides()

    /** This field's availability is dependent on your client's configuration. */
    fun professionalServices(): Optional<List<ProfessionalService>> = body.professionalServices()

    /** This field's availability is dependent on your client's configuration. */
    fun resellerRoyalties(): Optional<List<ResellerRoyalty>> = body.resellerRoyalties()

    /** This field's availability is dependent on your client's configuration. */
    fun salesforceOpportunityId(): Optional<String> = body.salesforceOpportunityId()

    fun scheduledCharges(): Optional<List<ScheduledCharge>> = body.scheduledCharges()

    /** This field's availability is dependent on your client's configuration. */
    fun totalContractValue(): Optional<Double> = body.totalContractValue()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): ContractAmendBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ContractAmendBody
    @JsonCreator
    internal constructor(
        @JsonProperty("contract_id") private val contractId: String,
        @JsonProperty("customer_id") private val customerId: String,
        @JsonProperty("starting_at") private val startingAt: OffsetDateTime,
        @JsonProperty("commits") private val commits: List<Commit>?,
        @JsonProperty("credits") private val credits: List<Credit>?,
        @JsonProperty("custom_fields") private val customFields: CustomFields?,
        @JsonProperty("discounts") private val discounts: List<Discount>?,
        @JsonProperty("netsuite_sales_order_id") private val netsuiteSalesOrderId: String?,
        @JsonProperty("overrides") private val overrides: List<Override>?,
        @JsonProperty("professional_services")
        private val professionalServices: List<ProfessionalService>?,
        @JsonProperty("reseller_royalties") private val resellerRoyalties: List<ResellerRoyalty>?,
        @JsonProperty("salesforce_opportunity_id") private val salesforceOpportunityId: String?,
        @JsonProperty("scheduled_charges") private val scheduledCharges: List<ScheduledCharge>?,
        @JsonProperty("total_contract_value") private val totalContractValue: Double?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** ID of the contract to amend */
        @JsonProperty("contract_id") fun contractId(): String = contractId

        /** ID of the customer whose contract is to be amended */
        @JsonProperty("customer_id") fun customerId(): String = customerId

        /** inclusive start time for the amendment */
        @JsonProperty("starting_at") fun startingAt(): OffsetDateTime = startingAt

        @JsonProperty("commits")
        fun commits(): Optional<List<Commit>> = Optional.ofNullable(commits)

        @JsonProperty("credits")
        fun credits(): Optional<List<Credit>> = Optional.ofNullable(credits)

        @JsonProperty("custom_fields")
        fun customFields(): Optional<CustomFields> = Optional.ofNullable(customFields)

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("discounts")
        fun discounts(): Optional<List<Discount>> = Optional.ofNullable(discounts)

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("netsuite_sales_order_id")
        fun netsuiteSalesOrderId(): Optional<String> = Optional.ofNullable(netsuiteSalesOrderId)

        @JsonProperty("overrides")
        fun overrides(): Optional<List<Override>> = Optional.ofNullable(overrides)

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("professional_services")
        fun professionalServices(): Optional<List<ProfessionalService>> =
            Optional.ofNullable(professionalServices)

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("reseller_royalties")
        fun resellerRoyalties(): Optional<List<ResellerRoyalty>> =
            Optional.ofNullable(resellerRoyalties)

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("salesforce_opportunity_id")
        fun salesforceOpportunityId(): Optional<String> =
            Optional.ofNullable(salesforceOpportunityId)

        @JsonProperty("scheduled_charges")
        fun scheduledCharges(): Optional<List<ScheduledCharge>> =
            Optional.ofNullable(scheduledCharges)

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("total_contract_value")
        fun totalContractValue(): Optional<Double> = Optional.ofNullable(totalContractValue)

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
            private var commits: MutableList<Commit>? = null
            private var credits: MutableList<Credit>? = null
            private var customFields: CustomFields? = null
            private var discounts: MutableList<Discount>? = null
            private var netsuiteSalesOrderId: String? = null
            private var overrides: MutableList<Override>? = null
            private var professionalServices: MutableList<ProfessionalService>? = null
            private var resellerRoyalties: MutableList<ResellerRoyalty>? = null
            private var salesforceOpportunityId: String? = null
            private var scheduledCharges: MutableList<ScheduledCharge>? = null
            private var totalContractValue: Double? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contractAmendBody: ContractAmendBody) = apply {
                contractId = contractAmendBody.contractId
                customerId = contractAmendBody.customerId
                startingAt = contractAmendBody.startingAt
                commits = contractAmendBody.commits?.toMutableList()
                credits = contractAmendBody.credits?.toMutableList()
                customFields = contractAmendBody.customFields
                discounts = contractAmendBody.discounts?.toMutableList()
                netsuiteSalesOrderId = contractAmendBody.netsuiteSalesOrderId
                overrides = contractAmendBody.overrides?.toMutableList()
                professionalServices = contractAmendBody.professionalServices?.toMutableList()
                resellerRoyalties = contractAmendBody.resellerRoyalties?.toMutableList()
                salesforceOpportunityId = contractAmendBody.salesforceOpportunityId
                scheduledCharges = contractAmendBody.scheduledCharges?.toMutableList()
                totalContractValue = contractAmendBody.totalContractValue
                additionalProperties = contractAmendBody.additionalProperties.toMutableMap()
            }

            /** ID of the contract to amend */
            fun contractId(contractId: String) = apply { this.contractId = contractId }

            /** ID of the customer whose contract is to be amended */
            fun customerId(customerId: String) = apply { this.customerId = customerId }

            /** inclusive start time for the amendment */
            fun startingAt(startingAt: OffsetDateTime) = apply { this.startingAt = startingAt }

            fun commits(commits: List<Commit>?) = apply { this.commits = commits?.toMutableList() }

            fun commits(commits: Optional<List<Commit>>) = commits(commits.orElse(null))

            fun addCommit(commit: Commit) = apply {
                commits = (commits ?: mutableListOf()).apply { add(commit) }
            }

            fun credits(credits: List<Credit>?) = apply { this.credits = credits?.toMutableList() }

            fun credits(credits: Optional<List<Credit>>) = credits(credits.orElse(null))

            fun addCredit(credit: Credit) = apply {
                credits = (credits ?: mutableListOf()).apply { add(credit) }
            }

            fun customFields(customFields: CustomFields?) = apply {
                this.customFields = customFields
            }

            fun customFields(customFields: Optional<CustomFields>) =
                customFields(customFields.orElse(null))

            /** This field's availability is dependent on your client's configuration. */
            fun discounts(discounts: List<Discount>?) = apply {
                this.discounts = discounts?.toMutableList()
            }

            /** This field's availability is dependent on your client's configuration. */
            fun discounts(discounts: Optional<List<Discount>>) = discounts(discounts.orElse(null))

            /** This field's availability is dependent on your client's configuration. */
            fun addDiscount(discount: Discount) = apply {
                discounts = (discounts ?: mutableListOf()).apply { add(discount) }
            }

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: String?) = apply {
                this.netsuiteSalesOrderId = netsuiteSalesOrderId
            }

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: Optional<String>) =
                netsuiteSalesOrderId(netsuiteSalesOrderId.orElse(null))

            fun overrides(overrides: List<Override>?) = apply {
                this.overrides = overrides?.toMutableList()
            }

            fun overrides(overrides: Optional<List<Override>>) = overrides(overrides.orElse(null))

            fun addOverride(override: Override) = apply {
                overrides = (overrides ?: mutableListOf()).apply { add(override) }
            }

            /** This field's availability is dependent on your client's configuration. */
            fun professionalServices(professionalServices: List<ProfessionalService>?) = apply {
                this.professionalServices = professionalServices?.toMutableList()
            }

            /** This field's availability is dependent on your client's configuration. */
            fun professionalServices(professionalServices: Optional<List<ProfessionalService>>) =
                professionalServices(professionalServices.orElse(null))

            /** This field's availability is dependent on your client's configuration. */
            fun addProfessionalService(professionalService: ProfessionalService) = apply {
                professionalServices =
                    (professionalServices ?: mutableListOf()).apply { add(professionalService) }
            }

            /** This field's availability is dependent on your client's configuration. */
            fun resellerRoyalties(resellerRoyalties: List<ResellerRoyalty>?) = apply {
                this.resellerRoyalties = resellerRoyalties?.toMutableList()
            }

            /** This field's availability is dependent on your client's configuration. */
            fun resellerRoyalties(resellerRoyalties: Optional<List<ResellerRoyalty>>) =
                resellerRoyalties(resellerRoyalties.orElse(null))

            /** This field's availability is dependent on your client's configuration. */
            fun addResellerRoyalty(resellerRoyalty: ResellerRoyalty) = apply {
                resellerRoyalties =
                    (resellerRoyalties ?: mutableListOf()).apply { add(resellerRoyalty) }
            }

            /** This field's availability is dependent on your client's configuration. */
            fun salesforceOpportunityId(salesforceOpportunityId: String?) = apply {
                this.salesforceOpportunityId = salesforceOpportunityId
            }

            /** This field's availability is dependent on your client's configuration. */
            fun salesforceOpportunityId(salesforceOpportunityId: Optional<String>) =
                salesforceOpportunityId(salesforceOpportunityId.orElse(null))

            fun scheduledCharges(scheduledCharges: List<ScheduledCharge>?) = apply {
                this.scheduledCharges = scheduledCharges?.toMutableList()
            }

            fun scheduledCharges(scheduledCharges: Optional<List<ScheduledCharge>>) =
                scheduledCharges(scheduledCharges.orElse(null))

            fun addScheduledCharge(scheduledCharge: ScheduledCharge) = apply {
                scheduledCharges =
                    (scheduledCharges ?: mutableListOf()).apply { add(scheduledCharge) }
            }

            /** This field's availability is dependent on your client's configuration. */
            fun totalContractValue(totalContractValue: Double?) = apply {
                this.totalContractValue = totalContractValue
            }

            /** This field's availability is dependent on your client's configuration. */
            fun totalContractValue(totalContractValue: Double) =
                totalContractValue(totalContractValue as Double?)

            /** This field's availability is dependent on your client's configuration. */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun totalContractValue(totalContractValue: Optional<Double>) =
                totalContractValue(totalContractValue.orElse(null) as Double?)

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

            return /* spotless:off */ other is ContractAmendBody && contractId == other.contractId && customerId == other.customerId && startingAt == other.startingAt && commits == other.commits && credits == other.credits && customFields == other.customFields && discounts == other.discounts && netsuiteSalesOrderId == other.netsuiteSalesOrderId && overrides == other.overrides && professionalServices == other.professionalServices && resellerRoyalties == other.resellerRoyalties && salesforceOpportunityId == other.salesforceOpportunityId && scheduledCharges == other.scheduledCharges && totalContractValue == other.totalContractValue && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(contractId, customerId, startingAt, commits, credits, customFields, discounts, netsuiteSalesOrderId, overrides, professionalServices, resellerRoyalties, salesforceOpportunityId, scheduledCharges, totalContractValue, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ContractAmendBody{contractId=$contractId, customerId=$customerId, startingAt=$startingAt, commits=$commits, credits=$credits, customFields=$customFields, discounts=$discounts, netsuiteSalesOrderId=$netsuiteSalesOrderId, overrides=$overrides, professionalServices=$professionalServices, resellerRoyalties=$resellerRoyalties, salesforceOpportunityId=$salesforceOpportunityId, scheduledCharges=$scheduledCharges, totalContractValue=$totalContractValue, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: ContractAmendBody.Builder = ContractAmendBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(contractAmendParams: ContractAmendParams) = apply {
            body = contractAmendParams.body.toBuilder()
            additionalHeaders = contractAmendParams.additionalHeaders.toBuilder()
            additionalQueryParams = contractAmendParams.additionalQueryParams.toBuilder()
        }

        /** ID of the contract to amend */
        fun contractId(contractId: String) = apply { body.contractId(contractId) }

        /** ID of the customer whose contract is to be amended */
        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        /** inclusive start time for the amendment */
        fun startingAt(startingAt: OffsetDateTime) = apply { body.startingAt(startingAt) }

        fun commits(commits: List<Commit>?) = apply { body.commits(commits) }

        fun commits(commits: Optional<List<Commit>>) = commits(commits.orElse(null))

        fun addCommit(commit: Commit) = apply { body.addCommit(commit) }

        fun credits(credits: List<Credit>?) = apply { body.credits(credits) }

        fun credits(credits: Optional<List<Credit>>) = credits(credits.orElse(null))

        fun addCredit(credit: Credit) = apply { body.addCredit(credit) }

        fun customFields(customFields: CustomFields?) = apply { body.customFields(customFields) }

        fun customFields(customFields: Optional<CustomFields>) =
            customFields(customFields.orElse(null))

        /** This field's availability is dependent on your client's configuration. */
        fun discounts(discounts: List<Discount>?) = apply { body.discounts(discounts) }

        /** This field's availability is dependent on your client's configuration. */
        fun discounts(discounts: Optional<List<Discount>>) = discounts(discounts.orElse(null))

        /** This field's availability is dependent on your client's configuration. */
        fun addDiscount(discount: Discount) = apply { body.addDiscount(discount) }

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteSalesOrderId(netsuiteSalesOrderId: String?) = apply {
            body.netsuiteSalesOrderId(netsuiteSalesOrderId)
        }

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteSalesOrderId(netsuiteSalesOrderId: Optional<String>) =
            netsuiteSalesOrderId(netsuiteSalesOrderId.orElse(null))

        fun overrides(overrides: List<Override>?) = apply { body.overrides(overrides) }

        fun overrides(overrides: Optional<List<Override>>) = overrides(overrides.orElse(null))

        fun addOverride(override: Override) = apply { body.addOverride(override) }

        /** This field's availability is dependent on your client's configuration. */
        fun professionalServices(professionalServices: List<ProfessionalService>?) = apply {
            body.professionalServices(professionalServices)
        }

        /** This field's availability is dependent on your client's configuration. */
        fun professionalServices(professionalServices: Optional<List<ProfessionalService>>) =
            professionalServices(professionalServices.orElse(null))

        /** This field's availability is dependent on your client's configuration. */
        fun addProfessionalService(professionalService: ProfessionalService) = apply {
            body.addProfessionalService(professionalService)
        }

        /** This field's availability is dependent on your client's configuration. */
        fun resellerRoyalties(resellerRoyalties: List<ResellerRoyalty>?) = apply {
            body.resellerRoyalties(resellerRoyalties)
        }

        /** This field's availability is dependent on your client's configuration. */
        fun resellerRoyalties(resellerRoyalties: Optional<List<ResellerRoyalty>>) =
            resellerRoyalties(resellerRoyalties.orElse(null))

        /** This field's availability is dependent on your client's configuration. */
        fun addResellerRoyalty(resellerRoyalty: ResellerRoyalty) = apply {
            body.addResellerRoyalty(resellerRoyalty)
        }

        /** This field's availability is dependent on your client's configuration. */
        fun salesforceOpportunityId(salesforceOpportunityId: String?) = apply {
            body.salesforceOpportunityId(salesforceOpportunityId)
        }

        /** This field's availability is dependent on your client's configuration. */
        fun salesforceOpportunityId(salesforceOpportunityId: Optional<String>) =
            salesforceOpportunityId(salesforceOpportunityId.orElse(null))

        fun scheduledCharges(scheduledCharges: List<ScheduledCharge>?) = apply {
            body.scheduledCharges(scheduledCharges)
        }

        fun scheduledCharges(scheduledCharges: Optional<List<ScheduledCharge>>) =
            scheduledCharges(scheduledCharges.orElse(null))

        fun addScheduledCharge(scheduledCharge: ScheduledCharge) = apply {
            body.addScheduledCharge(scheduledCharge)
        }

        /** This field's availability is dependent on your client's configuration. */
        fun totalContractValue(totalContractValue: Double?) = apply {
            body.totalContractValue(totalContractValue)
        }

        /** This field's availability is dependent on your client's configuration. */
        fun totalContractValue(totalContractValue: Double) =
            totalContractValue(totalContractValue as Double?)

        /** This field's availability is dependent on your client's configuration. */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun totalContractValue(totalContractValue: Optional<Double>) =
            totalContractValue(totalContractValue.orElse(null) as Double?)

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

        fun build(): ContractAmendParams =
            ContractAmendParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class Commit
    @JsonCreator
    private constructor(
        @JsonProperty("product_id") private val productId: String,
        @JsonProperty("type") private val type: Type,
        @JsonProperty("access_schedule") private val accessSchedule: AccessSchedule?,
        @JsonProperty("amount") private val amount: Double?,
        @JsonProperty("applicable_product_ids") private val applicableProductIds: List<String>?,
        @JsonProperty("applicable_product_tags") private val applicableProductTags: List<String>?,
        @JsonProperty("custom_fields") private val customFields: CustomFields?,
        @JsonProperty("description") private val description: String?,
        @JsonProperty("invoice_schedule") private val invoiceSchedule: InvoiceSchedule?,
        @JsonProperty("name") private val name: String?,
        @JsonProperty("netsuite_sales_order_id") private val netsuiteSalesOrderId: String?,
        @JsonProperty("priority") private val priority: Double?,
        @JsonProperty("rate_type") private val rateType: RateType?,
        @JsonProperty("rollover_fraction") private val rolloverFraction: Double?,
        @JsonProperty("temporary_id") private val temporaryId: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("product_id") fun productId(): String = productId

        @JsonProperty("type") fun type(): Type = type

        /**
         * Required: Schedule for distributing the commit to the customer. For "POSTPAID" commits
         * only one schedule item is allowed and amount must match invoice_schedule total.
         */
        @JsonProperty("access_schedule")
        fun accessSchedule(): Optional<AccessSchedule> = Optional.ofNullable(accessSchedule)

        /** (DEPRECATED) Use access_schedule and invoice_schedule instead. */
        @JsonProperty("amount") fun amount(): Optional<Double> = Optional.ofNullable(amount)

        /**
         * Which products the commit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the commit applies to all products.
         */
        @JsonProperty("applicable_product_ids")
        fun applicableProductIds(): Optional<List<String>> =
            Optional.ofNullable(applicableProductIds)

        /**
         * Which tags the commit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the commit applies to all products.
         */
        @JsonProperty("applicable_product_tags")
        fun applicableProductTags(): Optional<List<String>> =
            Optional.ofNullable(applicableProductTags)

        @JsonProperty("custom_fields")
        fun customFields(): Optional<CustomFields> = Optional.ofNullable(customFields)

        /** Used only in UI/API. It is not exposed to end customers. */
        @JsonProperty("description")
        fun description(): Optional<String> = Optional.ofNullable(description)

        /**
         * Required for "POSTPAID" commits: the true up invoice will be generated at this time and
         * only one schedule item is allowed; the total must match access_schedule amount. Optional
         * for "PREPAID" commits: if not provided, this will be a "complimentary" commit with no
         * invoice.
         */
        @JsonProperty("invoice_schedule")
        fun invoiceSchedule(): Optional<InvoiceSchedule> = Optional.ofNullable(invoiceSchedule)

        /** displayed on invoices */
        @JsonProperty("name") fun name(): Optional<String> = Optional.ofNullable(name)

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("netsuite_sales_order_id")
        fun netsuiteSalesOrderId(): Optional<String> = Optional.ofNullable(netsuiteSalesOrderId)

        /** If multiple commits are applicable, the one with the lower priority will apply first. */
        @JsonProperty("priority") fun priority(): Optional<Double> = Optional.ofNullable(priority)

        @JsonProperty("rate_type")
        fun rateType(): Optional<RateType> = Optional.ofNullable(rateType)

        /** Fraction of unused segments that will be rolled over. Must be between 0 and 1. */
        @JsonProperty("rollover_fraction")
        fun rolloverFraction(): Optional<Double> = Optional.ofNullable(rolloverFraction)

        /**
         * A temporary ID for the commit that can be used to reference the commit for commit
         * specific overrides.
         */
        @JsonProperty("temporary_id")
        fun temporaryId(): Optional<String> = Optional.ofNullable(temporaryId)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var productId: String? = null
            private var type: Type? = null
            private var accessSchedule: AccessSchedule? = null
            private var amount: Double? = null
            private var applicableProductIds: MutableList<String>? = null
            private var applicableProductTags: MutableList<String>? = null
            private var customFields: CustomFields? = null
            private var description: String? = null
            private var invoiceSchedule: InvoiceSchedule? = null
            private var name: String? = null
            private var netsuiteSalesOrderId: String? = null
            private var priority: Double? = null
            private var rateType: RateType? = null
            private var rolloverFraction: Double? = null
            private var temporaryId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(commit: Commit) = apply {
                productId = commit.productId
                type = commit.type
                accessSchedule = commit.accessSchedule
                amount = commit.amount
                applicableProductIds = commit.applicableProductIds?.toMutableList()
                applicableProductTags = commit.applicableProductTags?.toMutableList()
                customFields = commit.customFields
                description = commit.description
                invoiceSchedule = commit.invoiceSchedule
                name = commit.name
                netsuiteSalesOrderId = commit.netsuiteSalesOrderId
                priority = commit.priority
                rateType = commit.rateType
                rolloverFraction = commit.rolloverFraction
                temporaryId = commit.temporaryId
                additionalProperties = commit.additionalProperties.toMutableMap()
            }

            fun productId(productId: String) = apply { this.productId = productId }

            fun type(type: Type) = apply { this.type = type }

            /**
             * Required: Schedule for distributing the commit to the customer. For "POSTPAID"
             * commits only one schedule item is allowed and amount must match invoice_schedule
             * total.
             */
            fun accessSchedule(accessSchedule: AccessSchedule?) = apply {
                this.accessSchedule = accessSchedule
            }

            /**
             * Required: Schedule for distributing the commit to the customer. For "POSTPAID"
             * commits only one schedule item is allowed and amount must match invoice_schedule
             * total.
             */
            fun accessSchedule(accessSchedule: Optional<AccessSchedule>) =
                accessSchedule(accessSchedule.orElse(null))

            /** (DEPRECATED) Use access_schedule and invoice_schedule instead. */
            fun amount(amount: Double?) = apply { this.amount = amount }

            /** (DEPRECATED) Use access_schedule and invoice_schedule instead. */
            fun amount(amount: Double) = amount(amount as Double?)

            /** (DEPRECATED) Use access_schedule and invoice_schedule instead. */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun amount(amount: Optional<Double>) = amount(amount.orElse(null) as Double?)

            /**
             * Which products the commit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the commit applies to all products.
             */
            fun applicableProductIds(applicableProductIds: List<String>?) = apply {
                this.applicableProductIds = applicableProductIds?.toMutableList()
            }

            /**
             * Which products the commit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the commit applies to all products.
             */
            fun applicableProductIds(applicableProductIds: Optional<List<String>>) =
                applicableProductIds(applicableProductIds.orElse(null))

            /**
             * Which products the commit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the commit applies to all products.
             */
            fun addApplicableProductId(applicableProductId: String) = apply {
                applicableProductIds =
                    (applicableProductIds ?: mutableListOf()).apply { add(applicableProductId) }
            }

            /**
             * Which tags the commit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the commit applies to all products.
             */
            fun applicableProductTags(applicableProductTags: List<String>?) = apply {
                this.applicableProductTags = applicableProductTags?.toMutableList()
            }

            /**
             * Which tags the commit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the commit applies to all products.
             */
            fun applicableProductTags(applicableProductTags: Optional<List<String>>) =
                applicableProductTags(applicableProductTags.orElse(null))

            /**
             * Which tags the commit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the commit applies to all products.
             */
            fun addApplicableProductTag(applicableProductTag: String) = apply {
                applicableProductTags =
                    (applicableProductTags ?: mutableListOf()).apply { add(applicableProductTag) }
            }

            fun customFields(customFields: CustomFields?) = apply {
                this.customFields = customFields
            }

            fun customFields(customFields: Optional<CustomFields>) =
                customFields(customFields.orElse(null))

            /** Used only in UI/API. It is not exposed to end customers. */
            fun description(description: String?) = apply { this.description = description }

            /** Used only in UI/API. It is not exposed to end customers. */
            fun description(description: Optional<String>) = description(description.orElse(null))

            /**
             * Required for "POSTPAID" commits: the true up invoice will be generated at this time
             * and only one schedule item is allowed; the total must match access_schedule amount.
             * Optional for "PREPAID" commits: if not provided, this will be a "complimentary"
             * commit with no invoice.
             */
            fun invoiceSchedule(invoiceSchedule: InvoiceSchedule?) = apply {
                this.invoiceSchedule = invoiceSchedule
            }

            /**
             * Required for "POSTPAID" commits: the true up invoice will be generated at this time
             * and only one schedule item is allowed; the total must match access_schedule amount.
             * Optional for "PREPAID" commits: if not provided, this will be a "complimentary"
             * commit with no invoice.
             */
            fun invoiceSchedule(invoiceSchedule: Optional<InvoiceSchedule>) =
                invoiceSchedule(invoiceSchedule.orElse(null))

            /** displayed on invoices */
            fun name(name: String?) = apply { this.name = name }

            /** displayed on invoices */
            fun name(name: Optional<String>) = name(name.orElse(null))

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: String?) = apply {
                this.netsuiteSalesOrderId = netsuiteSalesOrderId
            }

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: Optional<String>) =
                netsuiteSalesOrderId(netsuiteSalesOrderId.orElse(null))

            /**
             * If multiple commits are applicable, the one with the lower priority will apply first.
             */
            fun priority(priority: Double?) = apply { this.priority = priority }

            /**
             * If multiple commits are applicable, the one with the lower priority will apply first.
             */
            fun priority(priority: Double) = priority(priority as Double?)

            /**
             * If multiple commits are applicable, the one with the lower priority will apply first.
             */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun priority(priority: Optional<Double>) = priority(priority.orElse(null) as Double?)

            fun rateType(rateType: RateType?) = apply { this.rateType = rateType }

            fun rateType(rateType: Optional<RateType>) = rateType(rateType.orElse(null))

            /** Fraction of unused segments that will be rolled over. Must be between 0 and 1. */
            fun rolloverFraction(rolloverFraction: Double?) = apply {
                this.rolloverFraction = rolloverFraction
            }

            /** Fraction of unused segments that will be rolled over. Must be between 0 and 1. */
            fun rolloverFraction(rolloverFraction: Double) =
                rolloverFraction(rolloverFraction as Double?)

            /** Fraction of unused segments that will be rolled over. Must be between 0 and 1. */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun rolloverFraction(rolloverFraction: Optional<Double>) =
                rolloverFraction(rolloverFraction.orElse(null) as Double?)

            /**
             * A temporary ID for the commit that can be used to reference the commit for commit
             * specific overrides.
             */
            fun temporaryId(temporaryId: String?) = apply { this.temporaryId = temporaryId }

            /**
             * A temporary ID for the commit that can be used to reference the commit for commit
             * specific overrides.
             */
            fun temporaryId(temporaryId: Optional<String>) = temporaryId(temporaryId.orElse(null))

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

            fun build(): Commit =
                Commit(
                    checkNotNull(productId) { "`productId` is required but was not set" },
                    checkNotNull(type) { "`type` is required but was not set" },
                    accessSchedule,
                    amount,
                    applicableProductIds?.toImmutable(),
                    applicableProductTags?.toImmutable(),
                    customFields,
                    description,
                    invoiceSchedule,
                    name,
                    netsuiteSalesOrderId,
                    priority,
                    rateType,
                    rolloverFraction,
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Required: Schedule for distributing the commit to the customer. For "POSTPAID" commits
         * only one schedule item is allowed and amount must match invoice_schedule total.
         */
        @NoAutoDetect
        class AccessSchedule
        @JsonCreator
        private constructor(
            @JsonProperty("schedule_items") private val scheduleItems: List<ScheduleItem>,
            @JsonProperty("credit_type_id") private val creditTypeId: String?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("schedule_items") fun scheduleItems(): List<ScheduleItem> = scheduleItems

            /** Defaults to USD (cents) if not passed */
            @JsonProperty("credit_type_id")
            fun creditTypeId(): Optional<String> = Optional.ofNullable(creditTypeId)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var scheduleItems: MutableList<ScheduleItem>? = null
                private var creditTypeId: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(accessSchedule: AccessSchedule) = apply {
                    scheduleItems = accessSchedule.scheduleItems.toMutableList()
                    creditTypeId = accessSchedule.creditTypeId
                    additionalProperties = accessSchedule.additionalProperties.toMutableMap()
                }

                fun scheduleItems(scheduleItems: List<ScheduleItem>) = apply {
                    this.scheduleItems = scheduleItems.toMutableList()
                }

                fun addScheduleItem(scheduleItem: ScheduleItem) = apply {
                    scheduleItems = (scheduleItems ?: mutableListOf()).apply { add(scheduleItem) }
                }

                /** Defaults to USD (cents) if not passed */
                fun creditTypeId(creditTypeId: String?) = apply { this.creditTypeId = creditTypeId }

                /** Defaults to USD (cents) if not passed */
                fun creditTypeId(creditTypeId: Optional<String>) =
                    creditTypeId(creditTypeId.orElse(null))

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

                fun build(): AccessSchedule =
                    AccessSchedule(
                        checkNotNull(scheduleItems) {
                                "`scheduleItems` is required but was not set"
                            }
                            .toImmutable(),
                        creditTypeId,
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class ScheduleItem
            @JsonCreator
            private constructor(
                @JsonProperty("amount") private val amount: Double,
                @JsonProperty("ending_before") private val endingBefore: OffsetDateTime,
                @JsonProperty("starting_at") private val startingAt: OffsetDateTime,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                @JsonProperty("amount") fun amount(): Double = amount

                /** RFC 3339 timestamp (exclusive) */
                @JsonProperty("ending_before") fun endingBefore(): OffsetDateTime = endingBefore

                /** RFC 3339 timestamp (inclusive) */
                @JsonProperty("starting_at") fun startingAt(): OffsetDateTime = startingAt

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: Double? = null
                    private var endingBefore: OffsetDateTime? = null
                    private var startingAt: OffsetDateTime? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(scheduleItem: ScheduleItem) = apply {
                        amount = scheduleItem.amount
                        endingBefore = scheduleItem.endingBefore
                        startingAt = scheduleItem.startingAt
                        additionalProperties = scheduleItem.additionalProperties.toMutableMap()
                    }

                    fun amount(amount: Double) = apply { this.amount = amount }

                    /** RFC 3339 timestamp (exclusive) */
                    fun endingBefore(endingBefore: OffsetDateTime) = apply {
                        this.endingBefore = endingBefore
                    }

                    /** RFC 3339 timestamp (inclusive) */
                    fun startingAt(startingAt: OffsetDateTime) = apply {
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

                    fun build(): ScheduleItem =
                        ScheduleItem(
                            checkNotNull(amount) { "`amount` is required but was not set" },
                            checkNotNull(endingBefore) {
                                "`endingBefore` is required but was not set"
                            },
                            checkNotNull(startingAt) { "`startingAt` is required but was not set" },
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ScheduleItem && amount == other.amount && endingBefore == other.endingBefore && startingAt == other.startingAt && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, endingBefore, startingAt, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ScheduleItem{amount=$amount, endingBefore=$endingBefore, startingAt=$startingAt, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AccessSchedule && scheduleItems == other.scheduleItems && creditTypeId == other.creditTypeId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(scheduleItems, creditTypeId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AccessSchedule{scheduleItems=$scheduleItems, creditTypeId=$creditTypeId, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class CustomFields
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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
        @NoAutoDetect
        class InvoiceSchedule
        @JsonCreator
        private constructor(
            @JsonProperty("credit_type_id") private val creditTypeId: String?,
            @JsonProperty("recurring_schedule") private val recurringSchedule: RecurringSchedule?,
            @JsonProperty("schedule_items") private val scheduleItems: List<ScheduleItem>?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** Defaults to USD (cents) if not passed. */
            @JsonProperty("credit_type_id")
            fun creditTypeId(): Optional<String> = Optional.ofNullable(creditTypeId)

            /**
             * Enter the unit price and quantity for the charge or instead only send the amount. If
             * amount is sent, the unit price is assumed to be the amount and quantity is inferred
             * to be 1.
             */
            @JsonProperty("recurring_schedule")
            fun recurringSchedule(): Optional<RecurringSchedule> =
                Optional.ofNullable(recurringSchedule)

            /** Either provide amount or provide both unit_price and quantity. */
            @JsonProperty("schedule_items")
            fun scheduleItems(): Optional<List<ScheduleItem>> = Optional.ofNullable(scheduleItems)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var creditTypeId: String? = null
                private var recurringSchedule: RecurringSchedule? = null
                private var scheduleItems: MutableList<ScheduleItem>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(invoiceSchedule: InvoiceSchedule) = apply {
                    creditTypeId = invoiceSchedule.creditTypeId
                    recurringSchedule = invoiceSchedule.recurringSchedule
                    scheduleItems = invoiceSchedule.scheduleItems?.toMutableList()
                    additionalProperties = invoiceSchedule.additionalProperties.toMutableMap()
                }

                /** Defaults to USD (cents) if not passed. */
                fun creditTypeId(creditTypeId: String?) = apply { this.creditTypeId = creditTypeId }

                /** Defaults to USD (cents) if not passed. */
                fun creditTypeId(creditTypeId: Optional<String>) =
                    creditTypeId(creditTypeId.orElse(null))

                /**
                 * Enter the unit price and quantity for the charge or instead only send the amount.
                 * If amount is sent, the unit price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                fun recurringSchedule(recurringSchedule: RecurringSchedule?) = apply {
                    this.recurringSchedule = recurringSchedule
                }

                /**
                 * Enter the unit price and quantity for the charge or instead only send the amount.
                 * If amount is sent, the unit price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                fun recurringSchedule(recurringSchedule: Optional<RecurringSchedule>) =
                    recurringSchedule(recurringSchedule.orElse(null))

                /** Either provide amount or provide both unit_price and quantity. */
                fun scheduleItems(scheduleItems: List<ScheduleItem>?) = apply {
                    this.scheduleItems = scheduleItems?.toMutableList()
                }

                /** Either provide amount or provide both unit_price and quantity. */
                fun scheduleItems(scheduleItems: Optional<List<ScheduleItem>>) =
                    scheduleItems(scheduleItems.orElse(null))

                /** Either provide amount or provide both unit_price and quantity. */
                fun addScheduleItem(scheduleItem: ScheduleItem) = apply {
                    scheduleItems = (scheduleItems ?: mutableListOf()).apply { add(scheduleItem) }
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

                fun build(): InvoiceSchedule =
                    InvoiceSchedule(
                        creditTypeId,
                        recurringSchedule,
                        scheduleItems?.toImmutable(),
                        additionalProperties.toImmutable(),
                    )
            }

            /**
             * Enter the unit price and quantity for the charge or instead only send the amount. If
             * amount is sent, the unit price is assumed to be the amount and quantity is inferred
             * to be 1.
             */
            @NoAutoDetect
            class RecurringSchedule
            @JsonCreator
            private constructor(
                @JsonProperty("amount_distribution")
                private val amountDistribution: AmountDistribution,
                @JsonProperty("ending_before") private val endingBefore: OffsetDateTime,
                @JsonProperty("frequency") private val frequency: Frequency,
                @JsonProperty("starting_at") private val startingAt: OffsetDateTime,
                @JsonProperty("amount") private val amount: Double?,
                @JsonProperty("quantity") private val quantity: Double?,
                @JsonProperty("unit_price") private val unitPrice: Double?,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                @JsonProperty("amount_distribution")
                fun amountDistribution(): AmountDistribution = amountDistribution

                /** RFC 3339 timestamp (exclusive). */
                @JsonProperty("ending_before") fun endingBefore(): OffsetDateTime = endingBefore

                @JsonProperty("frequency") fun frequency(): Frequency = frequency

                /** RFC 3339 timestamp (inclusive). */
                @JsonProperty("starting_at") fun startingAt(): OffsetDateTime = startingAt

                /**
                 * Amount for the charge. Can be provided instead of unit_price and quantity. If
                 * amount is sent, the unit_price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                @JsonProperty("amount") fun amount(): Optional<Double> = Optional.ofNullable(amount)

                /**
                 * Quantity for the charge. Will be multiplied by unit_price to determine the amount
                 * and must be specified with unit_price. If specified amount cannot be provided.
                 */
                @JsonProperty("quantity")
                fun quantity(): Optional<Double> = Optional.ofNullable(quantity)

                /**
                 * Unit price for the charge. Will be multiplied by quantity to determine the amount
                 * and must be specified with quantity. If specified amount cannot be provided.
                 */
                @JsonProperty("unit_price")
                fun unitPrice(): Optional<Double> = Optional.ofNullable(unitPrice)

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amountDistribution: AmountDistribution? = null
                    private var endingBefore: OffsetDateTime? = null
                    private var frequency: Frequency? = null
                    private var startingAt: OffsetDateTime? = null
                    private var amount: Double? = null
                    private var quantity: Double? = null
                    private var unitPrice: Double? = null
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

                    fun amountDistribution(amountDistribution: AmountDistribution) = apply {
                        this.amountDistribution = amountDistribution
                    }

                    /** RFC 3339 timestamp (exclusive). */
                    fun endingBefore(endingBefore: OffsetDateTime) = apply {
                        this.endingBefore = endingBefore
                    }

                    fun frequency(frequency: Frequency) = apply { this.frequency = frequency }

                    /** RFC 3339 timestamp (inclusive). */
                    fun startingAt(startingAt: OffsetDateTime) = apply {
                        this.startingAt = startingAt
                    }

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    fun amount(amount: Double?) = apply { this.amount = amount }

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    fun amount(amount: Double) = amount(amount as Double?)

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                    fun amount(amount: Optional<Double>) = amount(amount.orElse(null) as Double?)

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    fun quantity(quantity: Double?) = apply { this.quantity = quantity }

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    fun quantity(quantity: Double) = quantity(quantity as Double?)

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                    fun quantity(quantity: Optional<Double>) =
                        quantity(quantity.orElse(null) as Double?)

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    fun unitPrice(unitPrice: Double?) = apply { this.unitPrice = unitPrice }

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    fun unitPrice(unitPrice: Double) = unitPrice(unitPrice as Double?)

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                    fun unitPrice(unitPrice: Optional<Double>) =
                        unitPrice(unitPrice.orElse(null) as Double?)

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

                    fun build(): RecurringSchedule =
                        RecurringSchedule(
                            checkNotNull(amountDistribution) {
                                "`amountDistribution` is required but was not set"
                            },
                            checkNotNull(endingBefore) {
                                "`endingBefore` is required but was not set"
                            },
                            checkNotNull(frequency) { "`frequency` is required but was not set" },
                            checkNotNull(startingAt) { "`startingAt` is required but was not set" },
                            amount,
                            quantity,
                            unitPrice,
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

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AmountDistribution && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                class Frequency
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Frequency && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is RecurringSchedule && amountDistribution == other.amountDistribution && endingBefore == other.endingBefore && frequency == other.frequency && startingAt == other.startingAt && amount == other.amount && quantity == other.quantity && unitPrice == other.unitPrice && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amountDistribution, endingBefore, frequency, startingAt, amount, quantity, unitPrice, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "RecurringSchedule{amountDistribution=$amountDistribution, endingBefore=$endingBefore, frequency=$frequency, startingAt=$startingAt, amount=$amount, quantity=$quantity, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class ScheduleItem
            @JsonCreator
            private constructor(
                @JsonProperty("timestamp") private val timestamp: OffsetDateTime,
                @JsonProperty("amount") private val amount: Double?,
                @JsonProperty("quantity") private val quantity: Double?,
                @JsonProperty("unit_price") private val unitPrice: Double?,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** timestamp of the scheduled event */
                @JsonProperty("timestamp") fun timestamp(): OffsetDateTime = timestamp

                /**
                 * Amount for the charge. Can be provided instead of unit_price and quantity. If
                 * amount is sent, the unit_price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                @JsonProperty("amount") fun amount(): Optional<Double> = Optional.ofNullable(amount)

                /**
                 * Quantity for the charge. Will be multiplied by unit_price to determine the amount
                 * and must be specified with unit_price. If specified amount cannot be provided.
                 */
                @JsonProperty("quantity")
                fun quantity(): Optional<Double> = Optional.ofNullable(quantity)

                /**
                 * Unit price for the charge. Will be multiplied by quantity to determine the amount
                 * and must be specified with quantity. If specified amount cannot be provided.
                 */
                @JsonProperty("unit_price")
                fun unitPrice(): Optional<Double> = Optional.ofNullable(unitPrice)

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var timestamp: OffsetDateTime? = null
                    private var amount: Double? = null
                    private var quantity: Double? = null
                    private var unitPrice: Double? = null
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
                    fun timestamp(timestamp: OffsetDateTime) = apply { this.timestamp = timestamp }

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    fun amount(amount: Double?) = apply { this.amount = amount }

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    fun amount(amount: Double) = amount(amount as Double?)

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                    fun amount(amount: Optional<Double>) = amount(amount.orElse(null) as Double?)

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    fun quantity(quantity: Double?) = apply { this.quantity = quantity }

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    fun quantity(quantity: Double) = quantity(quantity as Double?)

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                    fun quantity(quantity: Optional<Double>) =
                        quantity(quantity.orElse(null) as Double?)

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    fun unitPrice(unitPrice: Double?) = apply { this.unitPrice = unitPrice }

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    fun unitPrice(unitPrice: Double) = unitPrice(unitPrice as Double?)

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                    fun unitPrice(unitPrice: Optional<Double>) =
                        unitPrice(unitPrice.orElse(null) as Double?)

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

                    fun build(): ScheduleItem =
                        ScheduleItem(
                            checkNotNull(timestamp) { "`timestamp` is required but was not set" },
                            amount,
                            quantity,
                            unitPrice,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ScheduleItem && timestamp == other.timestamp && amount == other.amount && quantity == other.quantity && unitPrice == other.unitPrice && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(timestamp, amount, quantity, unitPrice, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ScheduleItem{timestamp=$timestamp, amount=$amount, quantity=$quantity, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is InvoiceSchedule && creditTypeId == other.creditTypeId && recurringSchedule == other.recurringSchedule && scheduleItems == other.scheduleItems && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(creditTypeId, recurringSchedule, scheduleItems, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InvoiceSchedule{creditTypeId=$creditTypeId, recurringSchedule=$recurringSchedule, scheduleItems=$scheduleItems, additionalProperties=$additionalProperties}"
        }

        class RateType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RateType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Commit && productId == other.productId && type == other.type && accessSchedule == other.accessSchedule && amount == other.amount && applicableProductIds == other.applicableProductIds && applicableProductTags == other.applicableProductTags && customFields == other.customFields && description == other.description && invoiceSchedule == other.invoiceSchedule && name == other.name && netsuiteSalesOrderId == other.netsuiteSalesOrderId && priority == other.priority && rateType == other.rateType && rolloverFraction == other.rolloverFraction && temporaryId == other.temporaryId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(productId, type, accessSchedule, amount, applicableProductIds, applicableProductTags, customFields, description, invoiceSchedule, name, netsuiteSalesOrderId, priority, rateType, rolloverFraction, temporaryId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Commit{productId=$productId, type=$type, accessSchedule=$accessSchedule, amount=$amount, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, customFields=$customFields, description=$description, invoiceSchedule=$invoiceSchedule, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, priority=$priority, rateType=$rateType, rolloverFraction=$rolloverFraction, temporaryId=$temporaryId, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Credit
    @JsonCreator
    private constructor(
        @JsonProperty("access_schedule") private val accessSchedule: AccessSchedule,
        @JsonProperty("product_id") private val productId: String,
        @JsonProperty("applicable_product_ids") private val applicableProductIds: List<String>?,
        @JsonProperty("applicable_product_tags") private val applicableProductTags: List<String>?,
        @JsonProperty("custom_fields") private val customFields: CustomFields?,
        @JsonProperty("description") private val description: String?,
        @JsonProperty("name") private val name: String?,
        @JsonProperty("netsuite_sales_order_id") private val netsuiteSalesOrderId: String?,
        @JsonProperty("priority") private val priority: Double?,
        @JsonProperty("rate_type") private val rateType: RateType?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Schedule for distributing the credit to the customer. */
        @JsonProperty("access_schedule") fun accessSchedule(): AccessSchedule = accessSchedule

        @JsonProperty("product_id") fun productId(): String = productId

        /**
         * Which products the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         */
        @JsonProperty("applicable_product_ids")
        fun applicableProductIds(): Optional<List<String>> =
            Optional.ofNullable(applicableProductIds)

        /**
         * Which tags the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         */
        @JsonProperty("applicable_product_tags")
        fun applicableProductTags(): Optional<List<String>> =
            Optional.ofNullable(applicableProductTags)

        @JsonProperty("custom_fields")
        fun customFields(): Optional<CustomFields> = Optional.ofNullable(customFields)

        /** Used only in UI/API. It is not exposed to end customers. */
        @JsonProperty("description")
        fun description(): Optional<String> = Optional.ofNullable(description)

        /** displayed on invoices */
        @JsonProperty("name") fun name(): Optional<String> = Optional.ofNullable(name)

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("netsuite_sales_order_id")
        fun netsuiteSalesOrderId(): Optional<String> = Optional.ofNullable(netsuiteSalesOrderId)

        /** If multiple credits are applicable, the one with the lower priority will apply first. */
        @JsonProperty("priority") fun priority(): Optional<Double> = Optional.ofNullable(priority)

        @JsonProperty("rate_type")
        fun rateType(): Optional<RateType> = Optional.ofNullable(rateType)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var accessSchedule: AccessSchedule? = null
            private var productId: String? = null
            private var applicableProductIds: MutableList<String>? = null
            private var applicableProductTags: MutableList<String>? = null
            private var customFields: CustomFields? = null
            private var description: String? = null
            private var name: String? = null
            private var netsuiteSalesOrderId: String? = null
            private var priority: Double? = null
            private var rateType: RateType? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(credit: Credit) = apply {
                accessSchedule = credit.accessSchedule
                productId = credit.productId
                applicableProductIds = credit.applicableProductIds?.toMutableList()
                applicableProductTags = credit.applicableProductTags?.toMutableList()
                customFields = credit.customFields
                description = credit.description
                name = credit.name
                netsuiteSalesOrderId = credit.netsuiteSalesOrderId
                priority = credit.priority
                rateType = credit.rateType
                additionalProperties = credit.additionalProperties.toMutableMap()
            }

            /** Schedule for distributing the credit to the customer. */
            fun accessSchedule(accessSchedule: AccessSchedule) = apply {
                this.accessSchedule = accessSchedule
            }

            fun productId(productId: String) = apply { this.productId = productId }

            /**
             * Which products the credit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the credit applies to all products.
             */
            fun applicableProductIds(applicableProductIds: List<String>?) = apply {
                this.applicableProductIds = applicableProductIds?.toMutableList()
            }

            /**
             * Which products the credit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the credit applies to all products.
             */
            fun applicableProductIds(applicableProductIds: Optional<List<String>>) =
                applicableProductIds(applicableProductIds.orElse(null))

            /**
             * Which products the credit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the credit applies to all products.
             */
            fun addApplicableProductId(applicableProductId: String) = apply {
                applicableProductIds =
                    (applicableProductIds ?: mutableListOf()).apply { add(applicableProductId) }
            }

            /**
             * Which tags the credit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the credit applies to all products.
             */
            fun applicableProductTags(applicableProductTags: List<String>?) = apply {
                this.applicableProductTags = applicableProductTags?.toMutableList()
            }

            /**
             * Which tags the credit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the credit applies to all products.
             */
            fun applicableProductTags(applicableProductTags: Optional<List<String>>) =
                applicableProductTags(applicableProductTags.orElse(null))

            /**
             * Which tags the credit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the credit applies to all products.
             */
            fun addApplicableProductTag(applicableProductTag: String) = apply {
                applicableProductTags =
                    (applicableProductTags ?: mutableListOf()).apply { add(applicableProductTag) }
            }

            fun customFields(customFields: CustomFields?) = apply {
                this.customFields = customFields
            }

            fun customFields(customFields: Optional<CustomFields>) =
                customFields(customFields.orElse(null))

            /** Used only in UI/API. It is not exposed to end customers. */
            fun description(description: String?) = apply { this.description = description }

            /** Used only in UI/API. It is not exposed to end customers. */
            fun description(description: Optional<String>) = description(description.orElse(null))

            /** displayed on invoices */
            fun name(name: String?) = apply { this.name = name }

            /** displayed on invoices */
            fun name(name: Optional<String>) = name(name.orElse(null))

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: String?) = apply {
                this.netsuiteSalesOrderId = netsuiteSalesOrderId
            }

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: Optional<String>) =
                netsuiteSalesOrderId(netsuiteSalesOrderId.orElse(null))

            /**
             * If multiple credits are applicable, the one with the lower priority will apply first.
             */
            fun priority(priority: Double?) = apply { this.priority = priority }

            /**
             * If multiple credits are applicable, the one with the lower priority will apply first.
             */
            fun priority(priority: Double) = priority(priority as Double?)

            /**
             * If multiple credits are applicable, the one with the lower priority will apply first.
             */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun priority(priority: Optional<Double>) = priority(priority.orElse(null) as Double?)

            fun rateType(rateType: RateType?) = apply { this.rateType = rateType }

            fun rateType(rateType: Optional<RateType>) = rateType(rateType.orElse(null))

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

            fun build(): Credit =
                Credit(
                    checkNotNull(accessSchedule) { "`accessSchedule` is required but was not set" },
                    checkNotNull(productId) { "`productId` is required but was not set" },
                    applicableProductIds?.toImmutable(),
                    applicableProductTags?.toImmutable(),
                    customFields,
                    description,
                    name,
                    netsuiteSalesOrderId,
                    priority,
                    rateType,
                    additionalProperties.toImmutable(),
                )
        }

        /** Schedule for distributing the credit to the customer. */
        @NoAutoDetect
        class AccessSchedule
        @JsonCreator
        private constructor(
            @JsonProperty("schedule_items") private val scheduleItems: List<ScheduleItem>,
            @JsonProperty("credit_type_id") private val creditTypeId: String?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("schedule_items") fun scheduleItems(): List<ScheduleItem> = scheduleItems

            /** Defaults to USD (cents) if not passed */
            @JsonProperty("credit_type_id")
            fun creditTypeId(): Optional<String> = Optional.ofNullable(creditTypeId)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var scheduleItems: MutableList<ScheduleItem>? = null
                private var creditTypeId: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(accessSchedule: AccessSchedule) = apply {
                    scheduleItems = accessSchedule.scheduleItems.toMutableList()
                    creditTypeId = accessSchedule.creditTypeId
                    additionalProperties = accessSchedule.additionalProperties.toMutableMap()
                }

                fun scheduleItems(scheduleItems: List<ScheduleItem>) = apply {
                    this.scheduleItems = scheduleItems.toMutableList()
                }

                fun addScheduleItem(scheduleItem: ScheduleItem) = apply {
                    scheduleItems = (scheduleItems ?: mutableListOf()).apply { add(scheduleItem) }
                }

                /** Defaults to USD (cents) if not passed */
                fun creditTypeId(creditTypeId: String?) = apply { this.creditTypeId = creditTypeId }

                /** Defaults to USD (cents) if not passed */
                fun creditTypeId(creditTypeId: Optional<String>) =
                    creditTypeId(creditTypeId.orElse(null))

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

                fun build(): AccessSchedule =
                    AccessSchedule(
                        checkNotNull(scheduleItems) {
                                "`scheduleItems` is required but was not set"
                            }
                            .toImmutable(),
                        creditTypeId,
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class ScheduleItem
            @JsonCreator
            private constructor(
                @JsonProperty("amount") private val amount: Double,
                @JsonProperty("ending_before") private val endingBefore: OffsetDateTime,
                @JsonProperty("starting_at") private val startingAt: OffsetDateTime,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                @JsonProperty("amount") fun amount(): Double = amount

                /** RFC 3339 timestamp (exclusive) */
                @JsonProperty("ending_before") fun endingBefore(): OffsetDateTime = endingBefore

                /** RFC 3339 timestamp (inclusive) */
                @JsonProperty("starting_at") fun startingAt(): OffsetDateTime = startingAt

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: Double? = null
                    private var endingBefore: OffsetDateTime? = null
                    private var startingAt: OffsetDateTime? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(scheduleItem: ScheduleItem) = apply {
                        amount = scheduleItem.amount
                        endingBefore = scheduleItem.endingBefore
                        startingAt = scheduleItem.startingAt
                        additionalProperties = scheduleItem.additionalProperties.toMutableMap()
                    }

                    fun amount(amount: Double) = apply { this.amount = amount }

                    /** RFC 3339 timestamp (exclusive) */
                    fun endingBefore(endingBefore: OffsetDateTime) = apply {
                        this.endingBefore = endingBefore
                    }

                    /** RFC 3339 timestamp (inclusive) */
                    fun startingAt(startingAt: OffsetDateTime) = apply {
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

                    fun build(): ScheduleItem =
                        ScheduleItem(
                            checkNotNull(amount) { "`amount` is required but was not set" },
                            checkNotNull(endingBefore) {
                                "`endingBefore` is required but was not set"
                            },
                            checkNotNull(startingAt) { "`startingAt` is required but was not set" },
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ScheduleItem && amount == other.amount && endingBefore == other.endingBefore && startingAt == other.startingAt && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, endingBefore, startingAt, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ScheduleItem{amount=$amount, endingBefore=$endingBefore, startingAt=$startingAt, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AccessSchedule && scheduleItems == other.scheduleItems && creditTypeId == other.creditTypeId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(scheduleItems, creditTypeId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AccessSchedule{scheduleItems=$scheduleItems, creditTypeId=$creditTypeId, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class CustomFields
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RateType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Credit && accessSchedule == other.accessSchedule && productId == other.productId && applicableProductIds == other.applicableProductIds && applicableProductTags == other.applicableProductTags && customFields == other.customFields && description == other.description && name == other.name && netsuiteSalesOrderId == other.netsuiteSalesOrderId && priority == other.priority && rateType == other.rateType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accessSchedule, productId, applicableProductIds, applicableProductTags, customFields, description, name, netsuiteSalesOrderId, priority, rateType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Credit{accessSchedule=$accessSchedule, productId=$productId, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, customFields=$customFields, description=$description, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, priority=$priority, rateType=$rateType, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class CustomFields
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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

    @NoAutoDetect
    class Discount
    @JsonCreator
    private constructor(
        @JsonProperty("product_id") private val productId: String,
        @JsonProperty("schedule") private val schedule: Schedule,
        @JsonProperty("name") private val name: String?,
        @JsonProperty("netsuite_sales_order_id") private val netsuiteSalesOrderId: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("product_id") fun productId(): String = productId

        /** Must provide either schedule_items or recurring_schedule. */
        @JsonProperty("schedule") fun schedule(): Schedule = schedule

        /** displayed on invoices */
        @JsonProperty("name") fun name(): Optional<String> = Optional.ofNullable(name)

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("netsuite_sales_order_id")
        fun netsuiteSalesOrderId(): Optional<String> = Optional.ofNullable(netsuiteSalesOrderId)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var productId: String? = null
            private var schedule: Schedule? = null
            private var name: String? = null
            private var netsuiteSalesOrderId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(discount: Discount) = apply {
                productId = discount.productId
                schedule = discount.schedule
                name = discount.name
                netsuiteSalesOrderId = discount.netsuiteSalesOrderId
                additionalProperties = discount.additionalProperties.toMutableMap()
            }

            fun productId(productId: String) = apply { this.productId = productId }

            /** Must provide either schedule_items or recurring_schedule. */
            fun schedule(schedule: Schedule) = apply { this.schedule = schedule }

            /** displayed on invoices */
            fun name(name: String?) = apply { this.name = name }

            /** displayed on invoices */
            fun name(name: Optional<String>) = name(name.orElse(null))

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: String?) = apply {
                this.netsuiteSalesOrderId = netsuiteSalesOrderId
            }

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: Optional<String>) =
                netsuiteSalesOrderId(netsuiteSalesOrderId.orElse(null))

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

            fun build(): Discount =
                Discount(
                    checkNotNull(productId) { "`productId` is required but was not set" },
                    checkNotNull(schedule) { "`schedule` is required but was not set" },
                    name,
                    netsuiteSalesOrderId,
                    additionalProperties.toImmutable(),
                )
        }

        /** Must provide either schedule_items or recurring_schedule. */
        @NoAutoDetect
        class Schedule
        @JsonCreator
        private constructor(
            @JsonProperty("credit_type_id") private val creditTypeId: String?,
            @JsonProperty("recurring_schedule") private val recurringSchedule: RecurringSchedule?,
            @JsonProperty("schedule_items") private val scheduleItems: List<ScheduleItem>?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** Defaults to USD (cents) if not passed. */
            @JsonProperty("credit_type_id")
            fun creditTypeId(): Optional<String> = Optional.ofNullable(creditTypeId)

            /**
             * Enter the unit price and quantity for the charge or instead only send the amount. If
             * amount is sent, the unit price is assumed to be the amount and quantity is inferred
             * to be 1.
             */
            @JsonProperty("recurring_schedule")
            fun recurringSchedule(): Optional<RecurringSchedule> =
                Optional.ofNullable(recurringSchedule)

            /** Either provide amount or provide both unit_price and quantity. */
            @JsonProperty("schedule_items")
            fun scheduleItems(): Optional<List<ScheduleItem>> = Optional.ofNullable(scheduleItems)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var creditTypeId: String? = null
                private var recurringSchedule: RecurringSchedule? = null
                private var scheduleItems: MutableList<ScheduleItem>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(schedule: Schedule) = apply {
                    creditTypeId = schedule.creditTypeId
                    recurringSchedule = schedule.recurringSchedule
                    scheduleItems = schedule.scheduleItems?.toMutableList()
                    additionalProperties = schedule.additionalProperties.toMutableMap()
                }

                /** Defaults to USD (cents) if not passed. */
                fun creditTypeId(creditTypeId: String?) = apply { this.creditTypeId = creditTypeId }

                /** Defaults to USD (cents) if not passed. */
                fun creditTypeId(creditTypeId: Optional<String>) =
                    creditTypeId(creditTypeId.orElse(null))

                /**
                 * Enter the unit price and quantity for the charge or instead only send the amount.
                 * If amount is sent, the unit price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                fun recurringSchedule(recurringSchedule: RecurringSchedule?) = apply {
                    this.recurringSchedule = recurringSchedule
                }

                /**
                 * Enter the unit price and quantity for the charge or instead only send the amount.
                 * If amount is sent, the unit price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                fun recurringSchedule(recurringSchedule: Optional<RecurringSchedule>) =
                    recurringSchedule(recurringSchedule.orElse(null))

                /** Either provide amount or provide both unit_price and quantity. */
                fun scheduleItems(scheduleItems: List<ScheduleItem>?) = apply {
                    this.scheduleItems = scheduleItems?.toMutableList()
                }

                /** Either provide amount or provide both unit_price and quantity. */
                fun scheduleItems(scheduleItems: Optional<List<ScheduleItem>>) =
                    scheduleItems(scheduleItems.orElse(null))

                /** Either provide amount or provide both unit_price and quantity. */
                fun addScheduleItem(scheduleItem: ScheduleItem) = apply {
                    scheduleItems = (scheduleItems ?: mutableListOf()).apply { add(scheduleItem) }
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

                fun build(): Schedule =
                    Schedule(
                        creditTypeId,
                        recurringSchedule,
                        scheduleItems?.toImmutable(),
                        additionalProperties.toImmutable(),
                    )
            }

            /**
             * Enter the unit price and quantity for the charge or instead only send the amount. If
             * amount is sent, the unit price is assumed to be the amount and quantity is inferred
             * to be 1.
             */
            @NoAutoDetect
            class RecurringSchedule
            @JsonCreator
            private constructor(
                @JsonProperty("amount_distribution")
                private val amountDistribution: AmountDistribution,
                @JsonProperty("ending_before") private val endingBefore: OffsetDateTime,
                @JsonProperty("frequency") private val frequency: Frequency,
                @JsonProperty("starting_at") private val startingAt: OffsetDateTime,
                @JsonProperty("amount") private val amount: Double?,
                @JsonProperty("quantity") private val quantity: Double?,
                @JsonProperty("unit_price") private val unitPrice: Double?,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                @JsonProperty("amount_distribution")
                fun amountDistribution(): AmountDistribution = amountDistribution

                /** RFC 3339 timestamp (exclusive). */
                @JsonProperty("ending_before") fun endingBefore(): OffsetDateTime = endingBefore

                @JsonProperty("frequency") fun frequency(): Frequency = frequency

                /** RFC 3339 timestamp (inclusive). */
                @JsonProperty("starting_at") fun startingAt(): OffsetDateTime = startingAt

                /**
                 * Amount for the charge. Can be provided instead of unit_price and quantity. If
                 * amount is sent, the unit_price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                @JsonProperty("amount") fun amount(): Optional<Double> = Optional.ofNullable(amount)

                /**
                 * Quantity for the charge. Will be multiplied by unit_price to determine the amount
                 * and must be specified with unit_price. If specified amount cannot be provided.
                 */
                @JsonProperty("quantity")
                fun quantity(): Optional<Double> = Optional.ofNullable(quantity)

                /**
                 * Unit price for the charge. Will be multiplied by quantity to determine the amount
                 * and must be specified with quantity. If specified amount cannot be provided.
                 */
                @JsonProperty("unit_price")
                fun unitPrice(): Optional<Double> = Optional.ofNullable(unitPrice)

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amountDistribution: AmountDistribution? = null
                    private var endingBefore: OffsetDateTime? = null
                    private var frequency: Frequency? = null
                    private var startingAt: OffsetDateTime? = null
                    private var amount: Double? = null
                    private var quantity: Double? = null
                    private var unitPrice: Double? = null
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

                    fun amountDistribution(amountDistribution: AmountDistribution) = apply {
                        this.amountDistribution = amountDistribution
                    }

                    /** RFC 3339 timestamp (exclusive). */
                    fun endingBefore(endingBefore: OffsetDateTime) = apply {
                        this.endingBefore = endingBefore
                    }

                    fun frequency(frequency: Frequency) = apply { this.frequency = frequency }

                    /** RFC 3339 timestamp (inclusive). */
                    fun startingAt(startingAt: OffsetDateTime) = apply {
                        this.startingAt = startingAt
                    }

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    fun amount(amount: Double?) = apply { this.amount = amount }

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    fun amount(amount: Double) = amount(amount as Double?)

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                    fun amount(amount: Optional<Double>) = amount(amount.orElse(null) as Double?)

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    fun quantity(quantity: Double?) = apply { this.quantity = quantity }

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    fun quantity(quantity: Double) = quantity(quantity as Double?)

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                    fun quantity(quantity: Optional<Double>) =
                        quantity(quantity.orElse(null) as Double?)

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    fun unitPrice(unitPrice: Double?) = apply { this.unitPrice = unitPrice }

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    fun unitPrice(unitPrice: Double) = unitPrice(unitPrice as Double?)

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                    fun unitPrice(unitPrice: Optional<Double>) =
                        unitPrice(unitPrice.orElse(null) as Double?)

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

                    fun build(): RecurringSchedule =
                        RecurringSchedule(
                            checkNotNull(amountDistribution) {
                                "`amountDistribution` is required but was not set"
                            },
                            checkNotNull(endingBefore) {
                                "`endingBefore` is required but was not set"
                            },
                            checkNotNull(frequency) { "`frequency` is required but was not set" },
                            checkNotNull(startingAt) { "`startingAt` is required but was not set" },
                            amount,
                            quantity,
                            unitPrice,
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

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AmountDistribution && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                class Frequency
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Frequency && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is RecurringSchedule && amountDistribution == other.amountDistribution && endingBefore == other.endingBefore && frequency == other.frequency && startingAt == other.startingAt && amount == other.amount && quantity == other.quantity && unitPrice == other.unitPrice && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amountDistribution, endingBefore, frequency, startingAt, amount, quantity, unitPrice, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "RecurringSchedule{amountDistribution=$amountDistribution, endingBefore=$endingBefore, frequency=$frequency, startingAt=$startingAt, amount=$amount, quantity=$quantity, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class ScheduleItem
            @JsonCreator
            private constructor(
                @JsonProperty("timestamp") private val timestamp: OffsetDateTime,
                @JsonProperty("amount") private val amount: Double?,
                @JsonProperty("quantity") private val quantity: Double?,
                @JsonProperty("unit_price") private val unitPrice: Double?,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** timestamp of the scheduled event */
                @JsonProperty("timestamp") fun timestamp(): OffsetDateTime = timestamp

                /**
                 * Amount for the charge. Can be provided instead of unit_price and quantity. If
                 * amount is sent, the unit_price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                @JsonProperty("amount") fun amount(): Optional<Double> = Optional.ofNullable(amount)

                /**
                 * Quantity for the charge. Will be multiplied by unit_price to determine the amount
                 * and must be specified with unit_price. If specified amount cannot be provided.
                 */
                @JsonProperty("quantity")
                fun quantity(): Optional<Double> = Optional.ofNullable(quantity)

                /**
                 * Unit price for the charge. Will be multiplied by quantity to determine the amount
                 * and must be specified with quantity. If specified amount cannot be provided.
                 */
                @JsonProperty("unit_price")
                fun unitPrice(): Optional<Double> = Optional.ofNullable(unitPrice)

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var timestamp: OffsetDateTime? = null
                    private var amount: Double? = null
                    private var quantity: Double? = null
                    private var unitPrice: Double? = null
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
                    fun timestamp(timestamp: OffsetDateTime) = apply { this.timestamp = timestamp }

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    fun amount(amount: Double?) = apply { this.amount = amount }

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    fun amount(amount: Double) = amount(amount as Double?)

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                    fun amount(amount: Optional<Double>) = amount(amount.orElse(null) as Double?)

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    fun quantity(quantity: Double?) = apply { this.quantity = quantity }

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    fun quantity(quantity: Double) = quantity(quantity as Double?)

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                    fun quantity(quantity: Optional<Double>) =
                        quantity(quantity.orElse(null) as Double?)

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    fun unitPrice(unitPrice: Double?) = apply { this.unitPrice = unitPrice }

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    fun unitPrice(unitPrice: Double) = unitPrice(unitPrice as Double?)

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                    fun unitPrice(unitPrice: Optional<Double>) =
                        unitPrice(unitPrice.orElse(null) as Double?)

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

                    fun build(): ScheduleItem =
                        ScheduleItem(
                            checkNotNull(timestamp) { "`timestamp` is required but was not set" },
                            amount,
                            quantity,
                            unitPrice,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ScheduleItem && timestamp == other.timestamp && amount == other.amount && quantity == other.quantity && unitPrice == other.unitPrice && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(timestamp, amount, quantity, unitPrice, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ScheduleItem{timestamp=$timestamp, amount=$amount, quantity=$quantity, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Schedule && creditTypeId == other.creditTypeId && recurringSchedule == other.recurringSchedule && scheduleItems == other.scheduleItems && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(creditTypeId, recurringSchedule, scheduleItems, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Schedule{creditTypeId=$creditTypeId, recurringSchedule=$recurringSchedule, scheduleItems=$scheduleItems, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Discount && productId == other.productId && schedule == other.schedule && name == other.name && netsuiteSalesOrderId == other.netsuiteSalesOrderId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(productId, schedule, name, netsuiteSalesOrderId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Discount{productId=$productId, schedule=$schedule, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Override
    @JsonCreator
    private constructor(
        @JsonProperty("starting_at") private val startingAt: OffsetDateTime,
        @JsonProperty("applicable_product_tags") private val applicableProductTags: List<String>?,
        @JsonProperty("ending_before") private val endingBefore: OffsetDateTime?,
        @JsonProperty("entitled") private val entitled: Boolean?,
        @JsonProperty("is_commit_specific") private val isCommitSpecific: Boolean?,
        @JsonProperty("multiplier") private val multiplier: Double?,
        @JsonProperty("override_specifiers")
        private val overrideSpecifiers: List<OverrideSpecifier>?,
        @JsonProperty("overwrite_rate") private val overwriteRate: OverwriteRate?,
        @JsonProperty("priority") private val priority: Double?,
        @JsonProperty("product_id") private val productId: String?,
        @JsonProperty("target") private val target: Target?,
        @JsonProperty("tiers") private val tiers: List<Tier>?,
        @JsonProperty("type") private val type: Type?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** RFC 3339 timestamp indicating when the override will start applying (inclusive) */
        @JsonProperty("starting_at") fun startingAt(): OffsetDateTime = startingAt

        /**
         * tags identifying products whose rates are being overridden. Cannot be used in conjunction
         * with override_specifiers.
         */
        @JsonProperty("applicable_product_tags")
        fun applicableProductTags(): Optional<List<String>> =
            Optional.ofNullable(applicableProductTags)

        /** RFC 3339 timestamp indicating when the override will stop applying (exclusive) */
        @JsonProperty("ending_before")
        fun endingBefore(): Optional<OffsetDateTime> = Optional.ofNullable(endingBefore)

        @JsonProperty("entitled") fun entitled(): Optional<Boolean> = Optional.ofNullable(entitled)

        /**
         * Indicates whether the override should only apply to commits. Defaults to `false`. If
         * `true`, you can specify relevant commits in `override_specifiers` by passing
         * `commit_ids`. if you do not specify `commit_ids`, then the override will apply when
         * consuming any prepaid or postpaid commit.
         */
        @JsonProperty("is_commit_specific")
        fun isCommitSpecific(): Optional<Boolean> = Optional.ofNullable(isCommitSpecific)

        /** Required for MULTIPLIER type. Must be >=0. */
        @JsonProperty("multiplier")
        fun multiplier(): Optional<Double> = Optional.ofNullable(multiplier)

        /**
         * Cannot be used in conjunction with product_id or applicable_product_tags. If provided,
         * the override will apply to all products with the specified specifiers.
         */
        @JsonProperty("override_specifiers")
        fun overrideSpecifiers(): Optional<List<OverrideSpecifier>> =
            Optional.ofNullable(overrideSpecifiers)

        /** Required for OVERWRITE type. */
        @JsonProperty("overwrite_rate")
        fun overwriteRate(): Optional<OverwriteRate> = Optional.ofNullable(overwriteRate)

        /**
         * Required for EXPLICIT multiplier prioritization scheme and all TIERED overrides. Under
         * EXPLICIT prioritization, overwrites are prioritized first, and then tiered and multiplier
         * overrides are prioritized by their priority value (lowest first). Must be > 0.
         */
        @JsonProperty("priority") fun priority(): Optional<Double> = Optional.ofNullable(priority)

        /**
         * ID of the product whose rate is being overridden. Cannot be used in conjunction with
         * override_specifiers.
         */
        @JsonProperty("product_id")
        fun productId(): Optional<String> = Optional.ofNullable(productId)

        /**
         * Indicates whether the override applies to commit rates or list rates. Can only be used
         * for overrides that have `is_commit_specific` set to `true`. Defaults to `"LIST_RATE"`.
         */
        @JsonProperty("target") fun target(): Optional<Target> = Optional.ofNullable(target)

        /** Required for TIERED type. Must have at least one tier. */
        @JsonProperty("tiers") fun tiers(): Optional<List<Tier>> = Optional.ofNullable(tiers)

        /** Overwrites are prioritized over multipliers and tiered overrides. */
        @JsonProperty("type") fun type(): Optional<Type> = Optional.ofNullable(type)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var startingAt: OffsetDateTime? = null
            private var applicableProductTags: MutableList<String>? = null
            private var endingBefore: OffsetDateTime? = null
            private var entitled: Boolean? = null
            private var isCommitSpecific: Boolean? = null
            private var multiplier: Double? = null
            private var overrideSpecifiers: MutableList<OverrideSpecifier>? = null
            private var overwriteRate: OverwriteRate? = null
            private var priority: Double? = null
            private var productId: String? = null
            private var target: Target? = null
            private var tiers: MutableList<Tier>? = null
            private var type: Type? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(override: Override) = apply {
                startingAt = override.startingAt
                applicableProductTags = override.applicableProductTags?.toMutableList()
                endingBefore = override.endingBefore
                entitled = override.entitled
                isCommitSpecific = override.isCommitSpecific
                multiplier = override.multiplier
                overrideSpecifiers = override.overrideSpecifiers?.toMutableList()
                overwriteRate = override.overwriteRate
                priority = override.priority
                productId = override.productId
                target = override.target
                tiers = override.tiers?.toMutableList()
                type = override.type
                additionalProperties = override.additionalProperties.toMutableMap()
            }

            /** RFC 3339 timestamp indicating when the override will start applying (inclusive) */
            fun startingAt(startingAt: OffsetDateTime) = apply { this.startingAt = startingAt }

            /**
             * tags identifying products whose rates are being overridden. Cannot be used in
             * conjunction with override_specifiers.
             */
            fun applicableProductTags(applicableProductTags: List<String>?) = apply {
                this.applicableProductTags = applicableProductTags?.toMutableList()
            }

            /**
             * tags identifying products whose rates are being overridden. Cannot be used in
             * conjunction with override_specifiers.
             */
            fun applicableProductTags(applicableProductTags: Optional<List<String>>) =
                applicableProductTags(applicableProductTags.orElse(null))

            /**
             * tags identifying products whose rates are being overridden. Cannot be used in
             * conjunction with override_specifiers.
             */
            fun addApplicableProductTag(applicableProductTag: String) = apply {
                applicableProductTags =
                    (applicableProductTags ?: mutableListOf()).apply { add(applicableProductTag) }
            }

            /** RFC 3339 timestamp indicating when the override will stop applying (exclusive) */
            fun endingBefore(endingBefore: OffsetDateTime?) = apply {
                this.endingBefore = endingBefore
            }

            /** RFC 3339 timestamp indicating when the override will stop applying (exclusive) */
            fun endingBefore(endingBefore: Optional<OffsetDateTime>) =
                endingBefore(endingBefore.orElse(null))

            fun entitled(entitled: Boolean?) = apply { this.entitled = entitled }

            fun entitled(entitled: Boolean) = entitled(entitled as Boolean?)

            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun entitled(entitled: Optional<Boolean>) = entitled(entitled.orElse(null) as Boolean?)

            /**
             * Indicates whether the override should only apply to commits. Defaults to `false`. If
             * `true`, you can specify relevant commits in `override_specifiers` by passing
             * `commit_ids`. if you do not specify `commit_ids`, then the override will apply when
             * consuming any prepaid or postpaid commit.
             */
            fun isCommitSpecific(isCommitSpecific: Boolean?) = apply {
                this.isCommitSpecific = isCommitSpecific
            }

            /**
             * Indicates whether the override should only apply to commits. Defaults to `false`. If
             * `true`, you can specify relevant commits in `override_specifiers` by passing
             * `commit_ids`. if you do not specify `commit_ids`, then the override will apply when
             * consuming any prepaid or postpaid commit.
             */
            fun isCommitSpecific(isCommitSpecific: Boolean) =
                isCommitSpecific(isCommitSpecific as Boolean?)

            /**
             * Indicates whether the override should only apply to commits. Defaults to `false`. If
             * `true`, you can specify relevant commits in `override_specifiers` by passing
             * `commit_ids`. if you do not specify `commit_ids`, then the override will apply when
             * consuming any prepaid or postpaid commit.
             */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun isCommitSpecific(isCommitSpecific: Optional<Boolean>) =
                isCommitSpecific(isCommitSpecific.orElse(null) as Boolean?)

            /** Required for MULTIPLIER type. Must be >=0. */
            fun multiplier(multiplier: Double?) = apply { this.multiplier = multiplier }

            /** Required for MULTIPLIER type. Must be >=0. */
            fun multiplier(multiplier: Double) = multiplier(multiplier as Double?)

            /** Required for MULTIPLIER type. Must be >=0. */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun multiplier(multiplier: Optional<Double>) =
                multiplier(multiplier.orElse(null) as Double?)

            /**
             * Cannot be used in conjunction with product_id or applicable_product_tags. If
             * provided, the override will apply to all products with the specified specifiers.
             */
            fun overrideSpecifiers(overrideSpecifiers: List<OverrideSpecifier>?) = apply {
                this.overrideSpecifiers = overrideSpecifiers?.toMutableList()
            }

            /**
             * Cannot be used in conjunction with product_id or applicable_product_tags. If
             * provided, the override will apply to all products with the specified specifiers.
             */
            fun overrideSpecifiers(overrideSpecifiers: Optional<List<OverrideSpecifier>>) =
                overrideSpecifiers(overrideSpecifiers.orElse(null))

            /**
             * Cannot be used in conjunction with product_id or applicable_product_tags. If
             * provided, the override will apply to all products with the specified specifiers.
             */
            fun addOverrideSpecifier(overrideSpecifier: OverrideSpecifier) = apply {
                overrideSpecifiers =
                    (overrideSpecifiers ?: mutableListOf()).apply { add(overrideSpecifier) }
            }

            /** Required for OVERWRITE type. */
            fun overwriteRate(overwriteRate: OverwriteRate?) = apply {
                this.overwriteRate = overwriteRate
            }

            /** Required for OVERWRITE type. */
            fun overwriteRate(overwriteRate: Optional<OverwriteRate>) =
                overwriteRate(overwriteRate.orElse(null))

            /**
             * Required for EXPLICIT multiplier prioritization scheme and all TIERED overrides.
             * Under EXPLICIT prioritization, overwrites are prioritized first, and then tiered and
             * multiplier overrides are prioritized by their priority value (lowest first). Must
             * be > 0.
             */
            fun priority(priority: Double?) = apply { this.priority = priority }

            /**
             * Required for EXPLICIT multiplier prioritization scheme and all TIERED overrides.
             * Under EXPLICIT prioritization, overwrites are prioritized first, and then tiered and
             * multiplier overrides are prioritized by their priority value (lowest first). Must
             * be > 0.
             */
            fun priority(priority: Double) = priority(priority as Double?)

            /**
             * Required for EXPLICIT multiplier prioritization scheme and all TIERED overrides.
             * Under EXPLICIT prioritization, overwrites are prioritized first, and then tiered and
             * multiplier overrides are prioritized by their priority value (lowest first). Must
             * be > 0.
             */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun priority(priority: Optional<Double>) = priority(priority.orElse(null) as Double?)

            /**
             * ID of the product whose rate is being overridden. Cannot be used in conjunction with
             * override_specifiers.
             */
            fun productId(productId: String?) = apply { this.productId = productId }

            /**
             * ID of the product whose rate is being overridden. Cannot be used in conjunction with
             * override_specifiers.
             */
            fun productId(productId: Optional<String>) = productId(productId.orElse(null))

            /**
             * Indicates whether the override applies to commit rates or list rates. Can only be
             * used for overrides that have `is_commit_specific` set to `true`. Defaults to
             * `"LIST_RATE"`.
             */
            fun target(target: Target?) = apply { this.target = target }

            /**
             * Indicates whether the override applies to commit rates or list rates. Can only be
             * used for overrides that have `is_commit_specific` set to `true`. Defaults to
             * `"LIST_RATE"`.
             */
            fun target(target: Optional<Target>) = target(target.orElse(null))

            /** Required for TIERED type. Must have at least one tier. */
            fun tiers(tiers: List<Tier>?) = apply { this.tiers = tiers?.toMutableList() }

            /** Required for TIERED type. Must have at least one tier. */
            fun tiers(tiers: Optional<List<Tier>>) = tiers(tiers.orElse(null))

            /** Required for TIERED type. Must have at least one tier. */
            fun addTier(tier: Tier) = apply {
                tiers = (tiers ?: mutableListOf()).apply { add(tier) }
            }

            /** Overwrites are prioritized over multipliers and tiered overrides. */
            fun type(type: Type?) = apply { this.type = type }

            /** Overwrites are prioritized over multipliers and tiered overrides. */
            fun type(type: Optional<Type>) = type(type.orElse(null))

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

            fun build(): Override =
                Override(
                    checkNotNull(startingAt) { "`startingAt` is required but was not set" },
                    applicableProductTags?.toImmutable(),
                    endingBefore,
                    entitled,
                    isCommitSpecific,
                    multiplier,
                    overrideSpecifiers?.toImmutable(),
                    overwriteRate,
                    priority,
                    productId,
                    target,
                    tiers?.toImmutable(),
                    type,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class OverrideSpecifier
        @JsonCreator
        private constructor(
            @JsonProperty("commit_ids") private val commitIds: List<String>?,
            @JsonProperty("presentation_group_values")
            private val presentationGroupValues: PresentationGroupValues?,
            @JsonProperty("pricing_group_values")
            private val pricingGroupValues: PricingGroupValues?,
            @JsonProperty("product_id") private val productId: String?,
            @JsonProperty("product_tags") private val productTags: List<String>?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * Can only be used for commit specific overrides. Must be used in conjunction with one
             * of product_id, product_tags, pricing_group_values, or presentation_group_values. If
             * provided, the override will only apply to the specified commits. If not provided, the
             * override will apply to all commits.
             */
            @JsonProperty("commit_ids")
            fun commitIds(): Optional<List<String>> = Optional.ofNullable(commitIds)

            /**
             * A map of group names to values. The override will only apply to line items with the
             * specified presentation group values. Can only be used for multiplier overrides.
             */
            @JsonProperty("presentation_group_values")
            fun presentationGroupValues(): Optional<PresentationGroupValues> =
                Optional.ofNullable(presentationGroupValues)

            /**
             * A map of pricing group names to values. The override will only apply to products with
             * the specified pricing group values.
             */
            @JsonProperty("pricing_group_values")
            fun pricingGroupValues(): Optional<PricingGroupValues> =
                Optional.ofNullable(pricingGroupValues)

            /** If provided, the override will only apply to the product with the specified ID. */
            @JsonProperty("product_id")
            fun productId(): Optional<String> = Optional.ofNullable(productId)

            /**
             * If provided, the override will only apply to products with all the specified tags.
             */
            @JsonProperty("product_tags")
            fun productTags(): Optional<List<String>> = Optional.ofNullable(productTags)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var commitIds: MutableList<String>? = null
                private var presentationGroupValues: PresentationGroupValues? = null
                private var pricingGroupValues: PricingGroupValues? = null
                private var productId: String? = null
                private var productTags: MutableList<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(overrideSpecifier: OverrideSpecifier) = apply {
                    commitIds = overrideSpecifier.commitIds?.toMutableList()
                    presentationGroupValues = overrideSpecifier.presentationGroupValues
                    pricingGroupValues = overrideSpecifier.pricingGroupValues
                    productId = overrideSpecifier.productId
                    productTags = overrideSpecifier.productTags?.toMutableList()
                    additionalProperties = overrideSpecifier.additionalProperties.toMutableMap()
                }

                /**
                 * Can only be used for commit specific overrides. Must be used in conjunction with
                 * one of product_id, product_tags, pricing_group_values, or
                 * presentation_group_values. If provided, the override will only apply to the
                 * specified commits. If not provided, the override will apply to all commits.
                 */
                fun commitIds(commitIds: List<String>?) = apply {
                    this.commitIds = commitIds?.toMutableList()
                }

                /**
                 * Can only be used for commit specific overrides. Must be used in conjunction with
                 * one of product_id, product_tags, pricing_group_values, or
                 * presentation_group_values. If provided, the override will only apply to the
                 * specified commits. If not provided, the override will apply to all commits.
                 */
                fun commitIds(commitIds: Optional<List<String>>) = commitIds(commitIds.orElse(null))

                /**
                 * Can only be used for commit specific overrides. Must be used in conjunction with
                 * one of product_id, product_tags, pricing_group_values, or
                 * presentation_group_values. If provided, the override will only apply to the
                 * specified commits. If not provided, the override will apply to all commits.
                 */
                fun addCommitId(commitId: String) = apply {
                    commitIds = (commitIds ?: mutableListOf()).apply { add(commitId) }
                }

                /**
                 * A map of group names to values. The override will only apply to line items with
                 * the specified presentation group values. Can only be used for multiplier
                 * overrides.
                 */
                fun presentationGroupValues(presentationGroupValues: PresentationGroupValues?) =
                    apply {
                        this.presentationGroupValues = presentationGroupValues
                    }

                /**
                 * A map of group names to values. The override will only apply to line items with
                 * the specified presentation group values. Can only be used for multiplier
                 * overrides.
                 */
                fun presentationGroupValues(
                    presentationGroupValues: Optional<PresentationGroupValues>
                ) = presentationGroupValues(presentationGroupValues.orElse(null))

                /**
                 * A map of pricing group names to values. The override will only apply to products
                 * with the specified pricing group values.
                 */
                fun pricingGroupValues(pricingGroupValues: PricingGroupValues?) = apply {
                    this.pricingGroupValues = pricingGroupValues
                }

                /**
                 * A map of pricing group names to values. The override will only apply to products
                 * with the specified pricing group values.
                 */
                fun pricingGroupValues(pricingGroupValues: Optional<PricingGroupValues>) =
                    pricingGroupValues(pricingGroupValues.orElse(null))

                /**
                 * If provided, the override will only apply to the product with the specified ID.
                 */
                fun productId(productId: String?) = apply { this.productId = productId }

                /**
                 * If provided, the override will only apply to the product with the specified ID.
                 */
                fun productId(productId: Optional<String>) = productId(productId.orElse(null))

                /**
                 * If provided, the override will only apply to products with all the specified
                 * tags.
                 */
                fun productTags(productTags: List<String>?) = apply {
                    this.productTags = productTags?.toMutableList()
                }

                /**
                 * If provided, the override will only apply to products with all the specified
                 * tags.
                 */
                fun productTags(productTags: Optional<List<String>>) =
                    productTags(productTags.orElse(null))

                /**
                 * If provided, the override will only apply to products with all the specified
                 * tags.
                 */
                fun addProductTag(productTag: String) = apply {
                    productTags = (productTags ?: mutableListOf()).apply { add(productTag) }
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

                fun build(): OverrideSpecifier =
                    OverrideSpecifier(
                        commitIds?.toImmutable(),
                        presentationGroupValues,
                        pricingGroupValues,
                        productId,
                        productTags?.toImmutable(),
                        additionalProperties.toImmutable(),
                    )
            }

            /**
             * A map of group names to values. The override will only apply to line items with the
             * specified presentation group values. Can only be used for multiplier overrides.
             */
            @NoAutoDetect
            class PresentationGroupValues
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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
            @NoAutoDetect
            class PricingGroupValues
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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

                return /* spotless:off */ other is OverrideSpecifier && commitIds == other.commitIds && presentationGroupValues == other.presentationGroupValues && pricingGroupValues == other.pricingGroupValues && productId == other.productId && productTags == other.productTags && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(commitIds, presentationGroupValues, pricingGroupValues, productId, productTags, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OverrideSpecifier{commitIds=$commitIds, presentationGroupValues=$presentationGroupValues, pricingGroupValues=$pricingGroupValues, productId=$productId, productTags=$productTags, additionalProperties=$additionalProperties}"
        }

        /** Required for OVERWRITE type. */
        @NoAutoDetect
        class OverwriteRate
        @JsonCreator
        private constructor(
            @JsonProperty("rate_type") private val rateType: RateType,
            @JsonProperty("credit_type_id") private val creditTypeId: String?,
            @JsonProperty("custom_rate") private val customRate: CustomRate?,
            @JsonProperty("is_prorated") private val isProrated: Boolean?,
            @JsonProperty("price") private val price: Double?,
            @JsonProperty("quantity") private val quantity: Double?,
            @JsonProperty("tiers") private val tiers: List<Tier>?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("rate_type") fun rateType(): RateType = rateType

            @JsonProperty("credit_type_id")
            fun creditTypeId(): Optional<String> = Optional.ofNullable(creditTypeId)

            /**
             * Only set for CUSTOM rate_type. This field is interpreted by custom rate processors.
             */
            @JsonProperty("custom_rate")
            fun customRate(): Optional<CustomRate> = Optional.ofNullable(customRate)

            /**
             * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be set
             * to true.
             */
            @JsonProperty("is_prorated")
            fun isProrated(): Optional<Boolean> = Optional.ofNullable(isProrated)

            /**
             * Default price. For FLAT rate_type, this must be >=0. For PERCENTAGE rate_type, this
             * is a decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
             */
            @JsonProperty("price") fun price(): Optional<Double> = Optional.ofNullable(price)

            /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
            @JsonProperty("quantity")
            fun quantity(): Optional<Double> = Optional.ofNullable(quantity)

            /** Only set for TIERED rate_type. */
            @JsonProperty("tiers") fun tiers(): Optional<List<Tier>> = Optional.ofNullable(tiers)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var rateType: RateType? = null
                private var creditTypeId: String? = null
                private var customRate: CustomRate? = null
                private var isProrated: Boolean? = null
                private var price: Double? = null
                private var quantity: Double? = null
                private var tiers: MutableList<Tier>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(overwriteRate: OverwriteRate) = apply {
                    rateType = overwriteRate.rateType
                    creditTypeId = overwriteRate.creditTypeId
                    customRate = overwriteRate.customRate
                    isProrated = overwriteRate.isProrated
                    price = overwriteRate.price
                    quantity = overwriteRate.quantity
                    tiers = overwriteRate.tiers?.toMutableList()
                    additionalProperties = overwriteRate.additionalProperties.toMutableMap()
                }

                fun rateType(rateType: RateType) = apply { this.rateType = rateType }

                fun creditTypeId(creditTypeId: String?) = apply { this.creditTypeId = creditTypeId }

                fun creditTypeId(creditTypeId: Optional<String>) =
                    creditTypeId(creditTypeId.orElse(null))

                /**
                 * Only set for CUSTOM rate_type. This field is interpreted by custom rate
                 * processors.
                 */
                fun customRate(customRate: CustomRate?) = apply { this.customRate = customRate }

                /**
                 * Only set for CUSTOM rate_type. This field is interpreted by custom rate
                 * processors.
                 */
                fun customRate(customRate: Optional<CustomRate>) =
                    customRate(customRate.orElse(null))

                /**
                 * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be
                 * set to true.
                 */
                fun isProrated(isProrated: Boolean?) = apply { this.isProrated = isProrated }

                /**
                 * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be
                 * set to true.
                 */
                fun isProrated(isProrated: Boolean) = isProrated(isProrated as Boolean?)

                /**
                 * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be
                 * set to true.
                 */
                @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                fun isProrated(isProrated: Optional<Boolean>) =
                    isProrated(isProrated.orElse(null) as Boolean?)

                /**
                 * Default price. For FLAT rate_type, this must be >=0. For PERCENTAGE rate_type,
                 * this is a decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
                 */
                fun price(price: Double?) = apply { this.price = price }

                /**
                 * Default price. For FLAT rate_type, this must be >=0. For PERCENTAGE rate_type,
                 * this is a decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
                 */
                fun price(price: Double) = price(price as Double?)

                /**
                 * Default price. For FLAT rate_type, this must be >=0. For PERCENTAGE rate_type,
                 * this is a decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
                 */
                @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                fun price(price: Optional<Double>) = price(price.orElse(null) as Double?)

                /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
                fun quantity(quantity: Double?) = apply { this.quantity = quantity }

                /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
                fun quantity(quantity: Double) = quantity(quantity as Double?)

                /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
                @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                fun quantity(quantity: Optional<Double>) =
                    quantity(quantity.orElse(null) as Double?)

                /** Only set for TIERED rate_type. */
                fun tiers(tiers: List<Tier>?) = apply { this.tiers = tiers?.toMutableList() }

                /** Only set for TIERED rate_type. */
                fun tiers(tiers: Optional<List<Tier>>) = tiers(tiers.orElse(null))

                /** Only set for TIERED rate_type. */
                fun addTier(tier: Tier) = apply {
                    tiers = (tiers ?: mutableListOf()).apply { add(tier) }
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

                fun build(): OverwriteRate =
                    OverwriteRate(
                        checkNotNull(rateType) { "`rateType` is required but was not set" },
                        creditTypeId,
                        customRate,
                        isProrated,
                        price,
                        quantity,
                        tiers?.toImmutable(),
                        additionalProperties.toImmutable(),
                    )
            }

            class RateType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is RateType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * Only set for CUSTOM rate_type. This field is interpreted by custom rate processors.
             */
            @NoAutoDetect
            class CustomRate
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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

                return /* spotless:off */ other is OverwriteRate && rateType == other.rateType && creditTypeId == other.creditTypeId && customRate == other.customRate && isProrated == other.isProrated && price == other.price && quantity == other.quantity && tiers == other.tiers && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(rateType, creditTypeId, customRate, isProrated, price, quantity, tiers, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OverwriteRate{rateType=$rateType, creditTypeId=$creditTypeId, customRate=$customRate, isProrated=$isProrated, price=$price, quantity=$quantity, tiers=$tiers, additionalProperties=$additionalProperties}"
        }

        class Target
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Target && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class Tier
        @JsonCreator
        private constructor(
            @JsonProperty("multiplier") private val multiplier: Double,
            @JsonProperty("size") private val size: Double?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("multiplier") fun multiplier(): Double = multiplier

            @JsonProperty("size") fun size(): Optional<Double> = Optional.ofNullable(size)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var multiplier: Double? = null
                private var size: Double? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(tier: Tier) = apply {
                    multiplier = tier.multiplier
                    size = tier.size
                    additionalProperties = tier.additionalProperties.toMutableMap()
                }

                fun multiplier(multiplier: Double) = apply { this.multiplier = multiplier }

                fun size(size: Double?) = apply { this.size = size }

                fun size(size: Double) = size(size as Double?)

                @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                fun size(size: Optional<Double>) = size(size.orElse(null) as Double?)

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

                fun build(): Tier =
                    Tier(
                        checkNotNull(multiplier) { "`multiplier` is required but was not set" },
                        size,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Tier && multiplier == other.multiplier && size == other.size && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(multiplier, size, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Tier{multiplier=$multiplier, size=$size, additionalProperties=$additionalProperties}"
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Override && startingAt == other.startingAt && applicableProductTags == other.applicableProductTags && endingBefore == other.endingBefore && entitled == other.entitled && isCommitSpecific == other.isCommitSpecific && multiplier == other.multiplier && overrideSpecifiers == other.overrideSpecifiers && overwriteRate == other.overwriteRate && priority == other.priority && productId == other.productId && target == other.target && tiers == other.tiers && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(startingAt, applicableProductTags, endingBefore, entitled, isCommitSpecific, multiplier, overrideSpecifiers, overwriteRate, priority, productId, target, tiers, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Override{startingAt=$startingAt, applicableProductTags=$applicableProductTags, endingBefore=$endingBefore, entitled=$entitled, isCommitSpecific=$isCommitSpecific, multiplier=$multiplier, overrideSpecifiers=$overrideSpecifiers, overwriteRate=$overwriteRate, priority=$priority, productId=$productId, target=$target, tiers=$tiers, type=$type, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class ProfessionalService
    @JsonCreator
    private constructor(
        @JsonProperty("max_amount") private val maxAmount: Double,
        @JsonProperty("product_id") private val productId: String,
        @JsonProperty("quantity") private val quantity: Double,
        @JsonProperty("unit_price") private val unitPrice: Double,
        @JsonProperty("custom_fields") private val customFields: CustomFields?,
        @JsonProperty("description") private val description: String?,
        @JsonProperty("netsuite_sales_order_id") private val netsuiteSalesOrderId: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Maximum amount for the term. */
        @JsonProperty("max_amount") fun maxAmount(): Double = maxAmount

        @JsonProperty("product_id") fun productId(): String = productId

        /** Quantity for the charge. Will be multiplied by unit_price to determine the amount. */
        @JsonProperty("quantity") fun quantity(): Double = quantity

        /**
         * Unit price for the charge. Will be multiplied by quantity to determine the amount and
         * must be specified.
         */
        @JsonProperty("unit_price") fun unitPrice(): Double = unitPrice

        @JsonProperty("custom_fields")
        fun customFields(): Optional<CustomFields> = Optional.ofNullable(customFields)

        @JsonProperty("description")
        fun description(): Optional<String> = Optional.ofNullable(description)

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("netsuite_sales_order_id")
        fun netsuiteSalesOrderId(): Optional<String> = Optional.ofNullable(netsuiteSalesOrderId)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var maxAmount: Double? = null
            private var productId: String? = null
            private var quantity: Double? = null
            private var unitPrice: Double? = null
            private var customFields: CustomFields? = null
            private var description: String? = null
            private var netsuiteSalesOrderId: String? = null
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
            fun maxAmount(maxAmount: Double) = apply { this.maxAmount = maxAmount }

            fun productId(productId: String) = apply { this.productId = productId }

            /**
             * Quantity for the charge. Will be multiplied by unit_price to determine the amount.
             */
            fun quantity(quantity: Double) = apply { this.quantity = quantity }

            /**
             * Unit price for the charge. Will be multiplied by quantity to determine the amount and
             * must be specified.
             */
            fun unitPrice(unitPrice: Double) = apply { this.unitPrice = unitPrice }

            fun customFields(customFields: CustomFields?) = apply {
                this.customFields = customFields
            }

            fun customFields(customFields: Optional<CustomFields>) =
                customFields(customFields.orElse(null))

            fun description(description: String?) = apply { this.description = description }

            fun description(description: Optional<String>) = description(description.orElse(null))

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: String?) = apply {
                this.netsuiteSalesOrderId = netsuiteSalesOrderId
            }

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: Optional<String>) =
                netsuiteSalesOrderId(netsuiteSalesOrderId.orElse(null))

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

            fun build(): ProfessionalService =
                ProfessionalService(
                    checkNotNull(maxAmount) { "`maxAmount` is required but was not set" },
                    checkNotNull(productId) { "`productId` is required but was not set" },
                    checkNotNull(quantity) { "`quantity` is required but was not set" },
                    checkNotNull(unitPrice) { "`unitPrice` is required but was not set" },
                    customFields,
                    description,
                    netsuiteSalesOrderId,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class CustomFields
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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

            return /* spotless:off */ other is ProfessionalService && maxAmount == other.maxAmount && productId == other.productId && quantity == other.quantity && unitPrice == other.unitPrice && customFields == other.customFields && description == other.description && netsuiteSalesOrderId == other.netsuiteSalesOrderId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(maxAmount, productId, quantity, unitPrice, customFields, description, netsuiteSalesOrderId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ProfessionalService{maxAmount=$maxAmount, productId=$productId, quantity=$quantity, unitPrice=$unitPrice, customFields=$customFields, description=$description, netsuiteSalesOrderId=$netsuiteSalesOrderId, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class ResellerRoyalty
    @JsonCreator
    private constructor(
        @JsonProperty("reseller_type") private val resellerType: ResellerType,
        @JsonProperty("applicable_product_ids") private val applicableProductIds: List<String>?,
        @JsonProperty("applicable_product_tags") private val applicableProductTags: List<String>?,
        @JsonProperty("aws_options") private val awsOptions: AwsOptions?,
        @JsonProperty("ending_before") private val endingBefore: OffsetDateTime?,
        @JsonProperty("fraction") private val fraction: Double?,
        @JsonProperty("gcp_options") private val gcpOptions: GcpOptions?,
        @JsonProperty("netsuite_reseller_id") private val netsuiteResellerId: String?,
        @JsonProperty("reseller_contract_value") private val resellerContractValue: Double?,
        @JsonProperty("starting_at") private val startingAt: OffsetDateTime?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("reseller_type") fun resellerType(): ResellerType = resellerType

        /** Must provide at least one of applicable_product_ids or applicable_product_tags. */
        @JsonProperty("applicable_product_ids")
        fun applicableProductIds(): Optional<List<String>> =
            Optional.ofNullable(applicableProductIds)

        /** Must provide at least one of applicable_product_ids or applicable_product_tags. */
        @JsonProperty("applicable_product_tags")
        fun applicableProductTags(): Optional<List<String>> =
            Optional.ofNullable(applicableProductTags)

        @JsonProperty("aws_options")
        fun awsOptions(): Optional<AwsOptions> = Optional.ofNullable(awsOptions)

        /** Use null to indicate that the existing end timestamp should be removed. */
        @JsonProperty("ending_before")
        fun endingBefore(): Optional<OffsetDateTime> = Optional.ofNullable(endingBefore)

        @JsonProperty("fraction") fun fraction(): Optional<Double> = Optional.ofNullable(fraction)

        @JsonProperty("gcp_options")
        fun gcpOptions(): Optional<GcpOptions> = Optional.ofNullable(gcpOptions)

        @JsonProperty("netsuite_reseller_id")
        fun netsuiteResellerId(): Optional<String> = Optional.ofNullable(netsuiteResellerId)

        @JsonProperty("reseller_contract_value")
        fun resellerContractValue(): Optional<Double> = Optional.ofNullable(resellerContractValue)

        @JsonProperty("starting_at")
        fun startingAt(): Optional<OffsetDateTime> = Optional.ofNullable(startingAt)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var resellerType: ResellerType? = null
            private var applicableProductIds: MutableList<String>? = null
            private var applicableProductTags: MutableList<String>? = null
            private var awsOptions: AwsOptions? = null
            private var endingBefore: OffsetDateTime? = null
            private var fraction: Double? = null
            private var gcpOptions: GcpOptions? = null
            private var netsuiteResellerId: String? = null
            private var resellerContractValue: Double? = null
            private var startingAt: OffsetDateTime? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(resellerRoyalty: ResellerRoyalty) = apply {
                resellerType = resellerRoyalty.resellerType
                applicableProductIds = resellerRoyalty.applicableProductIds?.toMutableList()
                applicableProductTags = resellerRoyalty.applicableProductTags?.toMutableList()
                awsOptions = resellerRoyalty.awsOptions
                endingBefore = resellerRoyalty.endingBefore
                fraction = resellerRoyalty.fraction
                gcpOptions = resellerRoyalty.gcpOptions
                netsuiteResellerId = resellerRoyalty.netsuiteResellerId
                resellerContractValue = resellerRoyalty.resellerContractValue
                startingAt = resellerRoyalty.startingAt
                additionalProperties = resellerRoyalty.additionalProperties.toMutableMap()
            }

            fun resellerType(resellerType: ResellerType) = apply {
                this.resellerType = resellerType
            }

            /** Must provide at least one of applicable_product_ids or applicable_product_tags. */
            fun applicableProductIds(applicableProductIds: List<String>?) = apply {
                this.applicableProductIds = applicableProductIds?.toMutableList()
            }

            /** Must provide at least one of applicable_product_ids or applicable_product_tags. */
            fun applicableProductIds(applicableProductIds: Optional<List<String>>) =
                applicableProductIds(applicableProductIds.orElse(null))

            /** Must provide at least one of applicable_product_ids or applicable_product_tags. */
            fun addApplicableProductId(applicableProductId: String) = apply {
                applicableProductIds =
                    (applicableProductIds ?: mutableListOf()).apply { add(applicableProductId) }
            }

            /** Must provide at least one of applicable_product_ids or applicable_product_tags. */
            fun applicableProductTags(applicableProductTags: List<String>?) = apply {
                this.applicableProductTags = applicableProductTags?.toMutableList()
            }

            /** Must provide at least one of applicable_product_ids or applicable_product_tags. */
            fun applicableProductTags(applicableProductTags: Optional<List<String>>) =
                applicableProductTags(applicableProductTags.orElse(null))

            /** Must provide at least one of applicable_product_ids or applicable_product_tags. */
            fun addApplicableProductTag(applicableProductTag: String) = apply {
                applicableProductTags =
                    (applicableProductTags ?: mutableListOf()).apply { add(applicableProductTag) }
            }

            fun awsOptions(awsOptions: AwsOptions?) = apply { this.awsOptions = awsOptions }

            fun awsOptions(awsOptions: Optional<AwsOptions>) = awsOptions(awsOptions.orElse(null))

            /** Use null to indicate that the existing end timestamp should be removed. */
            fun endingBefore(endingBefore: OffsetDateTime?) = apply {
                this.endingBefore = endingBefore
            }

            /** Use null to indicate that the existing end timestamp should be removed. */
            fun endingBefore(endingBefore: Optional<OffsetDateTime>) =
                endingBefore(endingBefore.orElse(null))

            fun fraction(fraction: Double?) = apply { this.fraction = fraction }

            fun fraction(fraction: Double) = fraction(fraction as Double?)

            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun fraction(fraction: Optional<Double>) = fraction(fraction.orElse(null) as Double?)

            fun gcpOptions(gcpOptions: GcpOptions?) = apply { this.gcpOptions = gcpOptions }

            fun gcpOptions(gcpOptions: Optional<GcpOptions>) = gcpOptions(gcpOptions.orElse(null))

            fun netsuiteResellerId(netsuiteResellerId: String?) = apply {
                this.netsuiteResellerId = netsuiteResellerId
            }

            fun netsuiteResellerId(netsuiteResellerId: Optional<String>) =
                netsuiteResellerId(netsuiteResellerId.orElse(null))

            fun resellerContractValue(resellerContractValue: Double?) = apply {
                this.resellerContractValue = resellerContractValue
            }

            fun resellerContractValue(resellerContractValue: Double) =
                resellerContractValue(resellerContractValue as Double?)

            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun resellerContractValue(resellerContractValue: Optional<Double>) =
                resellerContractValue(resellerContractValue.orElse(null) as Double?)

            fun startingAt(startingAt: OffsetDateTime?) = apply { this.startingAt = startingAt }

            fun startingAt(startingAt: Optional<OffsetDateTime>) =
                startingAt(startingAt.orElse(null))

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

            fun build(): ResellerRoyalty =
                ResellerRoyalty(
                    checkNotNull(resellerType) { "`resellerType` is required but was not set" },
                    applicableProductIds?.toImmutable(),
                    applicableProductTags?.toImmutable(),
                    awsOptions,
                    endingBefore,
                    fraction,
                    gcpOptions,
                    netsuiteResellerId,
                    resellerContractValue,
                    startingAt,
                    additionalProperties.toImmutable(),
                )
        }

        class ResellerType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ResellerType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class AwsOptions
        @JsonCreator
        private constructor(
            @JsonProperty("aws_account_number") private val awsAccountNumber: String?,
            @JsonProperty("aws_offer_id") private val awsOfferId: String?,
            @JsonProperty("aws_payer_reference_id") private val awsPayerReferenceId: String?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("aws_account_number")
            fun awsAccountNumber(): Optional<String> = Optional.ofNullable(awsAccountNumber)

            @JsonProperty("aws_offer_id")
            fun awsOfferId(): Optional<String> = Optional.ofNullable(awsOfferId)

            @JsonProperty("aws_payer_reference_id")
            fun awsPayerReferenceId(): Optional<String> = Optional.ofNullable(awsPayerReferenceId)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var awsAccountNumber: String? = null
                private var awsOfferId: String? = null
                private var awsPayerReferenceId: String? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(awsOptions: AwsOptions) = apply {
                    awsAccountNumber = awsOptions.awsAccountNumber
                    awsOfferId = awsOptions.awsOfferId
                    awsPayerReferenceId = awsOptions.awsPayerReferenceId
                    additionalProperties = awsOptions.additionalProperties.toMutableMap()
                }

                fun awsAccountNumber(awsAccountNumber: String?) = apply {
                    this.awsAccountNumber = awsAccountNumber
                }

                fun awsAccountNumber(awsAccountNumber: Optional<String>) =
                    awsAccountNumber(awsAccountNumber.orElse(null))

                fun awsOfferId(awsOfferId: String?) = apply { this.awsOfferId = awsOfferId }

                fun awsOfferId(awsOfferId: Optional<String>) = awsOfferId(awsOfferId.orElse(null))

                fun awsPayerReferenceId(awsPayerReferenceId: String?) = apply {
                    this.awsPayerReferenceId = awsPayerReferenceId
                }

                fun awsPayerReferenceId(awsPayerReferenceId: Optional<String>) =
                    awsPayerReferenceId(awsPayerReferenceId.orElse(null))

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

                fun build(): AwsOptions =
                    AwsOptions(
                        awsAccountNumber,
                        awsOfferId,
                        awsPayerReferenceId,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AwsOptions && awsAccountNumber == other.awsAccountNumber && awsOfferId == other.awsOfferId && awsPayerReferenceId == other.awsPayerReferenceId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(awsAccountNumber, awsOfferId, awsPayerReferenceId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AwsOptions{awsAccountNumber=$awsAccountNumber, awsOfferId=$awsOfferId, awsPayerReferenceId=$awsPayerReferenceId, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class GcpOptions
        @JsonCreator
        private constructor(
            @JsonProperty("gcp_account_id") private val gcpAccountId: String?,
            @JsonProperty("gcp_offer_id") private val gcpOfferId: String?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonProperty("gcp_account_id")
            fun gcpAccountId(): Optional<String> = Optional.ofNullable(gcpAccountId)

            @JsonProperty("gcp_offer_id")
            fun gcpOfferId(): Optional<String> = Optional.ofNullable(gcpOfferId)

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
                    gcpAccountId = gcpOptions.gcpAccountId
                    gcpOfferId = gcpOptions.gcpOfferId
                    additionalProperties = gcpOptions.additionalProperties.toMutableMap()
                }

                fun gcpAccountId(gcpAccountId: String?) = apply { this.gcpAccountId = gcpAccountId }

                fun gcpAccountId(gcpAccountId: Optional<String>) =
                    gcpAccountId(gcpAccountId.orElse(null))

                fun gcpOfferId(gcpOfferId: String?) = apply { this.gcpOfferId = gcpOfferId }

                fun gcpOfferId(gcpOfferId: Optional<String>) = gcpOfferId(gcpOfferId.orElse(null))

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

            return /* spotless:off */ other is ResellerRoyalty && resellerType == other.resellerType && applicableProductIds == other.applicableProductIds && applicableProductTags == other.applicableProductTags && awsOptions == other.awsOptions && endingBefore == other.endingBefore && fraction == other.fraction && gcpOptions == other.gcpOptions && netsuiteResellerId == other.netsuiteResellerId && resellerContractValue == other.resellerContractValue && startingAt == other.startingAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(resellerType, applicableProductIds, applicableProductTags, awsOptions, endingBefore, fraction, gcpOptions, netsuiteResellerId, resellerContractValue, startingAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ResellerRoyalty{resellerType=$resellerType, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, awsOptions=$awsOptions, endingBefore=$endingBefore, fraction=$fraction, gcpOptions=$gcpOptions, netsuiteResellerId=$netsuiteResellerId, resellerContractValue=$resellerContractValue, startingAt=$startingAt, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class ScheduledCharge
    @JsonCreator
    private constructor(
        @JsonProperty("product_id") private val productId: String,
        @JsonProperty("schedule") private val schedule: Schedule,
        @JsonProperty("name") private val name: String?,
        @JsonProperty("netsuite_sales_order_id") private val netsuiteSalesOrderId: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("product_id") fun productId(): String = productId

        /** Must provide either schedule_items or recurring_schedule. */
        @JsonProperty("schedule") fun schedule(): Schedule = schedule

        /** displayed on invoices */
        @JsonProperty("name") fun name(): Optional<String> = Optional.ofNullable(name)

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("netsuite_sales_order_id")
        fun netsuiteSalesOrderId(): Optional<String> = Optional.ofNullable(netsuiteSalesOrderId)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var productId: String? = null
            private var schedule: Schedule? = null
            private var name: String? = null
            private var netsuiteSalesOrderId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(scheduledCharge: ScheduledCharge) = apply {
                productId = scheduledCharge.productId
                schedule = scheduledCharge.schedule
                name = scheduledCharge.name
                netsuiteSalesOrderId = scheduledCharge.netsuiteSalesOrderId
                additionalProperties = scheduledCharge.additionalProperties.toMutableMap()
            }

            fun productId(productId: String) = apply { this.productId = productId }

            /** Must provide either schedule_items or recurring_schedule. */
            fun schedule(schedule: Schedule) = apply { this.schedule = schedule }

            /** displayed on invoices */
            fun name(name: String?) = apply { this.name = name }

            /** displayed on invoices */
            fun name(name: Optional<String>) = name(name.orElse(null))

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: String?) = apply {
                this.netsuiteSalesOrderId = netsuiteSalesOrderId
            }

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(netsuiteSalesOrderId: Optional<String>) =
                netsuiteSalesOrderId(netsuiteSalesOrderId.orElse(null))

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

            fun build(): ScheduledCharge =
                ScheduledCharge(
                    checkNotNull(productId) { "`productId` is required but was not set" },
                    checkNotNull(schedule) { "`schedule` is required but was not set" },
                    name,
                    netsuiteSalesOrderId,
                    additionalProperties.toImmutable(),
                )
        }

        /** Must provide either schedule_items or recurring_schedule. */
        @NoAutoDetect
        class Schedule
        @JsonCreator
        private constructor(
            @JsonProperty("credit_type_id") private val creditTypeId: String?,
            @JsonProperty("recurring_schedule") private val recurringSchedule: RecurringSchedule?,
            @JsonProperty("schedule_items") private val scheduleItems: List<ScheduleItem>?,
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** Defaults to USD (cents) if not passed. */
            @JsonProperty("credit_type_id")
            fun creditTypeId(): Optional<String> = Optional.ofNullable(creditTypeId)

            /**
             * Enter the unit price and quantity for the charge or instead only send the amount. If
             * amount is sent, the unit price is assumed to be the amount and quantity is inferred
             * to be 1.
             */
            @JsonProperty("recurring_schedule")
            fun recurringSchedule(): Optional<RecurringSchedule> =
                Optional.ofNullable(recurringSchedule)

            /** Either provide amount or provide both unit_price and quantity. */
            @JsonProperty("schedule_items")
            fun scheduleItems(): Optional<List<ScheduleItem>> = Optional.ofNullable(scheduleItems)

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var creditTypeId: String? = null
                private var recurringSchedule: RecurringSchedule? = null
                private var scheduleItems: MutableList<ScheduleItem>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(schedule: Schedule) = apply {
                    creditTypeId = schedule.creditTypeId
                    recurringSchedule = schedule.recurringSchedule
                    scheduleItems = schedule.scheduleItems?.toMutableList()
                    additionalProperties = schedule.additionalProperties.toMutableMap()
                }

                /** Defaults to USD (cents) if not passed. */
                fun creditTypeId(creditTypeId: String?) = apply { this.creditTypeId = creditTypeId }

                /** Defaults to USD (cents) if not passed. */
                fun creditTypeId(creditTypeId: Optional<String>) =
                    creditTypeId(creditTypeId.orElse(null))

                /**
                 * Enter the unit price and quantity for the charge or instead only send the amount.
                 * If amount is sent, the unit price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                fun recurringSchedule(recurringSchedule: RecurringSchedule?) = apply {
                    this.recurringSchedule = recurringSchedule
                }

                /**
                 * Enter the unit price and quantity for the charge or instead only send the amount.
                 * If amount is sent, the unit price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                fun recurringSchedule(recurringSchedule: Optional<RecurringSchedule>) =
                    recurringSchedule(recurringSchedule.orElse(null))

                /** Either provide amount or provide both unit_price and quantity. */
                fun scheduleItems(scheduleItems: List<ScheduleItem>?) = apply {
                    this.scheduleItems = scheduleItems?.toMutableList()
                }

                /** Either provide amount or provide both unit_price and quantity. */
                fun scheduleItems(scheduleItems: Optional<List<ScheduleItem>>) =
                    scheduleItems(scheduleItems.orElse(null))

                /** Either provide amount or provide both unit_price and quantity. */
                fun addScheduleItem(scheduleItem: ScheduleItem) = apply {
                    scheduleItems = (scheduleItems ?: mutableListOf()).apply { add(scheduleItem) }
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

                fun build(): Schedule =
                    Schedule(
                        creditTypeId,
                        recurringSchedule,
                        scheduleItems?.toImmutable(),
                        additionalProperties.toImmutable(),
                    )
            }

            /**
             * Enter the unit price and quantity for the charge or instead only send the amount. If
             * amount is sent, the unit price is assumed to be the amount and quantity is inferred
             * to be 1.
             */
            @NoAutoDetect
            class RecurringSchedule
            @JsonCreator
            private constructor(
                @JsonProperty("amount_distribution")
                private val amountDistribution: AmountDistribution,
                @JsonProperty("ending_before") private val endingBefore: OffsetDateTime,
                @JsonProperty("frequency") private val frequency: Frequency,
                @JsonProperty("starting_at") private val startingAt: OffsetDateTime,
                @JsonProperty("amount") private val amount: Double?,
                @JsonProperty("quantity") private val quantity: Double?,
                @JsonProperty("unit_price") private val unitPrice: Double?,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                @JsonProperty("amount_distribution")
                fun amountDistribution(): AmountDistribution = amountDistribution

                /** RFC 3339 timestamp (exclusive). */
                @JsonProperty("ending_before") fun endingBefore(): OffsetDateTime = endingBefore

                @JsonProperty("frequency") fun frequency(): Frequency = frequency

                /** RFC 3339 timestamp (inclusive). */
                @JsonProperty("starting_at") fun startingAt(): OffsetDateTime = startingAt

                /**
                 * Amount for the charge. Can be provided instead of unit_price and quantity. If
                 * amount is sent, the unit_price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                @JsonProperty("amount") fun amount(): Optional<Double> = Optional.ofNullable(amount)

                /**
                 * Quantity for the charge. Will be multiplied by unit_price to determine the amount
                 * and must be specified with unit_price. If specified amount cannot be provided.
                 */
                @JsonProperty("quantity")
                fun quantity(): Optional<Double> = Optional.ofNullable(quantity)

                /**
                 * Unit price for the charge. Will be multiplied by quantity to determine the amount
                 * and must be specified with quantity. If specified amount cannot be provided.
                 */
                @JsonProperty("unit_price")
                fun unitPrice(): Optional<Double> = Optional.ofNullable(unitPrice)

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amountDistribution: AmountDistribution? = null
                    private var endingBefore: OffsetDateTime? = null
                    private var frequency: Frequency? = null
                    private var startingAt: OffsetDateTime? = null
                    private var amount: Double? = null
                    private var quantity: Double? = null
                    private var unitPrice: Double? = null
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

                    fun amountDistribution(amountDistribution: AmountDistribution) = apply {
                        this.amountDistribution = amountDistribution
                    }

                    /** RFC 3339 timestamp (exclusive). */
                    fun endingBefore(endingBefore: OffsetDateTime) = apply {
                        this.endingBefore = endingBefore
                    }

                    fun frequency(frequency: Frequency) = apply { this.frequency = frequency }

                    /** RFC 3339 timestamp (inclusive). */
                    fun startingAt(startingAt: OffsetDateTime) = apply {
                        this.startingAt = startingAt
                    }

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    fun amount(amount: Double?) = apply { this.amount = amount }

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    fun amount(amount: Double) = amount(amount as Double?)

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                    fun amount(amount: Optional<Double>) = amount(amount.orElse(null) as Double?)

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    fun quantity(quantity: Double?) = apply { this.quantity = quantity }

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    fun quantity(quantity: Double) = quantity(quantity as Double?)

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                    fun quantity(quantity: Optional<Double>) =
                        quantity(quantity.orElse(null) as Double?)

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    fun unitPrice(unitPrice: Double?) = apply { this.unitPrice = unitPrice }

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    fun unitPrice(unitPrice: Double) = unitPrice(unitPrice as Double?)

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                    fun unitPrice(unitPrice: Optional<Double>) =
                        unitPrice(unitPrice.orElse(null) as Double?)

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

                    fun build(): RecurringSchedule =
                        RecurringSchedule(
                            checkNotNull(amountDistribution) {
                                "`amountDistribution` is required but was not set"
                            },
                            checkNotNull(endingBefore) {
                                "`endingBefore` is required but was not set"
                            },
                            checkNotNull(frequency) { "`frequency` is required but was not set" },
                            checkNotNull(startingAt) { "`startingAt` is required but was not set" },
                            amount,
                            quantity,
                            unitPrice,
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

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AmountDistribution && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                class Frequency
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Frequency && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is RecurringSchedule && amountDistribution == other.amountDistribution && endingBefore == other.endingBefore && frequency == other.frequency && startingAt == other.startingAt && amount == other.amount && quantity == other.quantity && unitPrice == other.unitPrice && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amountDistribution, endingBefore, frequency, startingAt, amount, quantity, unitPrice, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "RecurringSchedule{amountDistribution=$amountDistribution, endingBefore=$endingBefore, frequency=$frequency, startingAt=$startingAt, amount=$amount, quantity=$quantity, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class ScheduleItem
            @JsonCreator
            private constructor(
                @JsonProperty("timestamp") private val timestamp: OffsetDateTime,
                @JsonProperty("amount") private val amount: Double?,
                @JsonProperty("quantity") private val quantity: Double?,
                @JsonProperty("unit_price") private val unitPrice: Double?,
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** timestamp of the scheduled event */
                @JsonProperty("timestamp") fun timestamp(): OffsetDateTime = timestamp

                /**
                 * Amount for the charge. Can be provided instead of unit_price and quantity. If
                 * amount is sent, the unit_price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                @JsonProperty("amount") fun amount(): Optional<Double> = Optional.ofNullable(amount)

                /**
                 * Quantity for the charge. Will be multiplied by unit_price to determine the amount
                 * and must be specified with unit_price. If specified amount cannot be provided.
                 */
                @JsonProperty("quantity")
                fun quantity(): Optional<Double> = Optional.ofNullable(quantity)

                /**
                 * Unit price for the charge. Will be multiplied by quantity to determine the amount
                 * and must be specified with quantity. If specified amount cannot be provided.
                 */
                @JsonProperty("unit_price")
                fun unitPrice(): Optional<Double> = Optional.ofNullable(unitPrice)

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var timestamp: OffsetDateTime? = null
                    private var amount: Double? = null
                    private var quantity: Double? = null
                    private var unitPrice: Double? = null
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
                    fun timestamp(timestamp: OffsetDateTime) = apply { this.timestamp = timestamp }

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    fun amount(amount: Double?) = apply { this.amount = amount }

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    fun amount(amount: Double) = amount(amount as Double?)

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                    fun amount(amount: Optional<Double>) = amount(amount.orElse(null) as Double?)

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    fun quantity(quantity: Double?) = apply { this.quantity = quantity }

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    fun quantity(quantity: Double) = quantity(quantity as Double?)

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                    fun quantity(quantity: Optional<Double>) =
                        quantity(quantity.orElse(null) as Double?)

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    fun unitPrice(unitPrice: Double?) = apply { this.unitPrice = unitPrice }

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    fun unitPrice(unitPrice: Double) = unitPrice(unitPrice as Double?)

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                    fun unitPrice(unitPrice: Optional<Double>) =
                        unitPrice(unitPrice.orElse(null) as Double?)

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

                    fun build(): ScheduleItem =
                        ScheduleItem(
                            checkNotNull(timestamp) { "`timestamp` is required but was not set" },
                            amount,
                            quantity,
                            unitPrice,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ScheduleItem && timestamp == other.timestamp && amount == other.amount && quantity == other.quantity && unitPrice == other.unitPrice && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(timestamp, amount, quantity, unitPrice, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ScheduleItem{timestamp=$timestamp, amount=$amount, quantity=$quantity, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Schedule && creditTypeId == other.creditTypeId && recurringSchedule == other.recurringSchedule && scheduleItems == other.scheduleItems && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(creditTypeId, recurringSchedule, scheduleItems, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Schedule{creditTypeId=$creditTypeId, recurringSchedule=$recurringSchedule, scheduleItems=$scheduleItems, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ScheduledCharge && productId == other.productId && schedule == other.schedule && name == other.name && netsuiteSalesOrderId == other.netsuiteSalesOrderId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(productId, schedule, name, netsuiteSalesOrderId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ScheduledCharge{productId=$productId, schedule=$schedule, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractAmendParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ContractAmendParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
