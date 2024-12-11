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
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = ContractListResponse.Builder::class)
@NoAutoDetect
class ContractListResponse
private constructor(
    private val data: JsonField<List<Data>>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun data(): List<Data> = data.getRequired("data")

    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ContractListResponse = apply {
        if (!validated) {
            data().forEach { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var data: JsonField<List<Data>> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contractListResponse: ContractListResponse) = apply {
            this.data = contractListResponse.data
            additionalProperties(contractListResponse.additionalProperties)
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        @JsonProperty("data")
        @ExcludeMissing
        fun data(data: JsonField<List<Data>>) = apply { this.data = data }

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

        fun build(): ContractListResponse =
            ContractListResponse(data.map { it.toImmutable() }, additionalProperties.toImmutable())
    }

    @JsonDeserialize(builder = Data.Builder::class)
    @NoAutoDetect
    class Data
    private constructor(
        private val id: JsonField<String>,
        private val archivedAt: JsonField<OffsetDateTime>,
        private val customerId: JsonField<String>,
        private val uniquenessKey: JsonField<String>,
        private val initial: JsonField<ContractWithoutAmendments>,
        private val current: JsonField<ContractWithoutAmendments>,
        private val amendments: JsonField<List<Amendment>>,
        private val customFields: JsonField<CustomFields>,
        private val customerBillingProviderConfiguration:
            JsonField<CustomerBillingProviderConfiguration>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun id(): String = id.getRequired("id")

        /**
         * RFC 3339 timestamp indicating when the contract was archived. If not returned, the
         * contract is not archived.
         */
        fun archivedAt(): Optional<OffsetDateTime> =
            Optional.ofNullable(archivedAt.getNullable("archived_at"))

        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
         */
        fun uniquenessKey(): Optional<String> =
            Optional.ofNullable(uniquenessKey.getNullable("uniqueness_key"))

        fun initial(): ContractWithoutAmendments = initial.getRequired("initial")

        fun current(): ContractWithoutAmendments = current.getRequired("current")

        fun amendments(): List<Amendment> = amendments.getRequired("amendments")

        fun customFields(): Optional<CustomFields> =
            Optional.ofNullable(customFields.getNullable("custom_fields"))

        /** The billing provider configuration associated with a contract. */
        fun customerBillingProviderConfiguration(): Optional<CustomerBillingProviderConfiguration> =
            Optional.ofNullable(
                customerBillingProviderConfiguration.getNullable(
                    "customer_billing_provider_configuration"
                )
            )

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        /**
         * RFC 3339 timestamp indicating when the contract was archived. If not returned, the
         * contract is not archived.
         */
        @JsonProperty("archived_at") @ExcludeMissing fun _archivedAt() = archivedAt

        @JsonProperty("customer_id") @ExcludeMissing fun _customerId() = customerId

        /**
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
         */
        @JsonProperty("uniqueness_key") @ExcludeMissing fun _uniquenessKey() = uniquenessKey

        @JsonProperty("initial") @ExcludeMissing fun _initial() = initial

        @JsonProperty("current") @ExcludeMissing fun _current() = current

        @JsonProperty("amendments") @ExcludeMissing fun _amendments() = amendments

        @JsonProperty("custom_fields") @ExcludeMissing fun _customFields() = customFields

        /** The billing provider configuration associated with a contract. */
        @JsonProperty("customer_billing_provider_configuration")
        @ExcludeMissing
        fun _customerBillingProviderConfiguration() = customerBillingProviderConfiguration

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Data = apply {
            if (!validated) {
                id()
                archivedAt()
                customerId()
                uniquenessKey()
                initial().validate()
                current().validate()
                amendments().forEach { it.validate() }
                customFields().map { it.validate() }
                customerBillingProviderConfiguration().map { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var archivedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var customerId: JsonField<String> = JsonMissing.of()
            private var uniquenessKey: JsonField<String> = JsonMissing.of()
            private var initial: JsonField<ContractWithoutAmendments> = JsonMissing.of()
            private var current: JsonField<ContractWithoutAmendments> = JsonMissing.of()
            private var amendments: JsonField<List<Amendment>> = JsonMissing.of()
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var customerBillingProviderConfiguration:
                JsonField<CustomerBillingProviderConfiguration> =
                JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                this.id = data.id
                this.archivedAt = data.archivedAt
                this.customerId = data.customerId
                this.uniquenessKey = data.uniquenessKey
                this.initial = data.initial
                this.current = data.current
                this.amendments = data.amendments
                this.customFields = data.customFields
                this.customerBillingProviderConfiguration =
                    data.customerBillingProviderConfiguration
                additionalProperties(data.additionalProperties)
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * RFC 3339 timestamp indicating when the contract was archived. If not returned, the
             * contract is not archived.
             */
            fun archivedAt(archivedAt: OffsetDateTime) = archivedAt(JsonField.of(archivedAt))

            /**
             * RFC 3339 timestamp indicating when the contract was archived. If not returned, the
             * contract is not archived.
             */
            @JsonProperty("archived_at")
            @ExcludeMissing
            fun archivedAt(archivedAt: JsonField<OffsetDateTime>) = apply {
                this.archivedAt = archivedAt
            }

            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            @JsonProperty("customer_id")
            @ExcludeMissing
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /**
             * Prevents the creation of duplicates. If a request to create a record is made with a
             * previously used uniqueness key, a new record will not be created and the request will
             * fail with a 409 error.
             */
            fun uniquenessKey(uniquenessKey: String) = uniquenessKey(JsonField.of(uniquenessKey))

            /**
             * Prevents the creation of duplicates. If a request to create a record is made with a
             * previously used uniqueness key, a new record will not be created and the request will
             * fail with a 409 error.
             */
            @JsonProperty("uniqueness_key")
            @ExcludeMissing
            fun uniquenessKey(uniquenessKey: JsonField<String>) = apply {
                this.uniquenessKey = uniquenessKey
            }

            fun initial(initial: ContractWithoutAmendments) = initial(JsonField.of(initial))

            @JsonProperty("initial")
            @ExcludeMissing
            fun initial(initial: JsonField<ContractWithoutAmendments>) = apply {
                this.initial = initial
            }

            fun current(current: ContractWithoutAmendments) = current(JsonField.of(current))

            @JsonProperty("current")
            @ExcludeMissing
            fun current(current: JsonField<ContractWithoutAmendments>) = apply {
                this.current = current
            }

            fun amendments(amendments: List<Amendment>) = amendments(JsonField.of(amendments))

            @JsonProperty("amendments")
            @ExcludeMissing
            fun amendments(amendments: JsonField<List<Amendment>>) = apply {
                this.amendments = amendments
            }

            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

            @JsonProperty("custom_fields")
            @ExcludeMissing
            fun customFields(customFields: JsonField<CustomFields>) = apply {
                this.customFields = customFields
            }

            /** The billing provider configuration associated with a contract. */
            fun customerBillingProviderConfiguration(
                customerBillingProviderConfiguration: CustomerBillingProviderConfiguration
            ) =
                customerBillingProviderConfiguration(
                    JsonField.of(customerBillingProviderConfiguration)
                )

            /** The billing provider configuration associated with a contract. */
            @JsonProperty("customer_billing_provider_configuration")
            @ExcludeMissing
            fun customerBillingProviderConfiguration(
                customerBillingProviderConfiguration:
                    JsonField<CustomerBillingProviderConfiguration>
            ) = apply {
                this.customerBillingProviderConfiguration = customerBillingProviderConfiguration
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

            fun build(): Data =
                Data(
                    id,
                    archivedAt,
                    customerId,
                    uniquenessKey,
                    initial,
                    current,
                    amendments.map { it.toImmutable() },
                    customFields,
                    customerBillingProviderConfiguration,
                    additionalProperties.toImmutable(),
                )
        }

        @JsonDeserialize(builder = Amendment.Builder::class)
        @NoAutoDetect
        class Amendment
        private constructor(
            private val id: JsonField<String>,
            private val salesforceOpportunityId: JsonField<String>,
            private val startingAt: JsonField<OffsetDateTime>,
            private val commits: JsonField<List<Commit>>,
            private val credits: JsonField<List<Credit>>,
            private val overrides: JsonField<List<Override>>,
            private val discounts: JsonField<List<Discount>>,
            private val professionalServices: JsonField<List<ProService>>,
            private val scheduledCharges: JsonField<List<ScheduledCharge>>,
            private val resellerRoyalties: JsonField<List<ResellerRoyalty>>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val createdBy: JsonField<String>,
            private val netsuiteSalesOrderId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun id(): String = id.getRequired("id")

            /** This field's availability is dependent on your client's configuration. */
            fun salesforceOpportunityId(): Optional<String> =
                Optional.ofNullable(
                    salesforceOpportunityId.getNullable("salesforce_opportunity_id")
                )

            fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

            fun commits(): List<Commit> = commits.getRequired("commits")

            fun credits(): Optional<List<Credit>> =
                Optional.ofNullable(credits.getNullable("credits"))

            fun overrides(): List<Override> = overrides.getRequired("overrides")

            /** This field's availability is dependent on your client's configuration. */
            fun discounts(): Optional<List<Discount>> =
                Optional.ofNullable(discounts.getNullable("discounts"))

            /** This field's availability is dependent on your client's configuration. */
            fun professionalServices(): Optional<List<ProService>> =
                Optional.ofNullable(professionalServices.getNullable("professional_services"))

            fun scheduledCharges(): List<ScheduledCharge> =
                scheduledCharges.getRequired("scheduled_charges")

            /** This field's availability is dependent on your client's configuration. */
            fun resellerRoyalties(): Optional<List<ResellerRoyalty>> =
                Optional.ofNullable(resellerRoyalties.getNullable("reseller_royalties"))

            fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

            fun createdBy(): String = createdBy.getRequired("created_by")

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(): Optional<String> =
                Optional.ofNullable(netsuiteSalesOrderId.getNullable("netsuite_sales_order_id"))

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            /** This field's availability is dependent on your client's configuration. */
            @JsonProperty("salesforce_opportunity_id")
            @ExcludeMissing
            fun _salesforceOpportunityId() = salesforceOpportunityId

            @JsonProperty("starting_at") @ExcludeMissing fun _startingAt() = startingAt

            @JsonProperty("commits") @ExcludeMissing fun _commits() = commits

            @JsonProperty("credits") @ExcludeMissing fun _credits() = credits

            @JsonProperty("overrides") @ExcludeMissing fun _overrides() = overrides

            /** This field's availability is dependent on your client's configuration. */
            @JsonProperty("discounts") @ExcludeMissing fun _discounts() = discounts

            /** This field's availability is dependent on your client's configuration. */
            @JsonProperty("professional_services")
            @ExcludeMissing
            fun _professionalServices() = professionalServices

            @JsonProperty("scheduled_charges")
            @ExcludeMissing
            fun _scheduledCharges() = scheduledCharges

            /** This field's availability is dependent on your client's configuration. */
            @JsonProperty("reseller_royalties")
            @ExcludeMissing
            fun _resellerRoyalties() = resellerRoyalties

            @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

            @JsonProperty("created_by") @ExcludeMissing fun _createdBy() = createdBy

            /** This field's availability is dependent on your client's configuration. */
            @JsonProperty("netsuite_sales_order_id")
            @ExcludeMissing
            fun _netsuiteSalesOrderId() = netsuiteSalesOrderId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Amendment = apply {
                if (!validated) {
                    id()
                    salesforceOpportunityId()
                    startingAt()
                    commits().forEach { it.validate() }
                    credits().map { it.forEach { it.validate() } }
                    overrides().forEach { it.validate() }
                    discounts().map { it.forEach { it.validate() } }
                    professionalServices().map { it.forEach { it.validate() } }
                    scheduledCharges().forEach { it.validate() }
                    resellerRoyalties().map { it.forEach { it.validate() } }
                    createdAt()
                    createdBy()
                    netsuiteSalesOrderId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var salesforceOpportunityId: JsonField<String> = JsonMissing.of()
                private var startingAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var commits: JsonField<List<Commit>> = JsonMissing.of()
                private var credits: JsonField<List<Credit>> = JsonMissing.of()
                private var overrides: JsonField<List<Override>> = JsonMissing.of()
                private var discounts: JsonField<List<Discount>> = JsonMissing.of()
                private var professionalServices: JsonField<List<ProService>> = JsonMissing.of()
                private var scheduledCharges: JsonField<List<ScheduledCharge>> = JsonMissing.of()
                private var resellerRoyalties: JsonField<List<ResellerRoyalty>> = JsonMissing.of()
                private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var createdBy: JsonField<String> = JsonMissing.of()
                private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(amendment: Amendment) = apply {
                    this.id = amendment.id
                    this.salesforceOpportunityId = amendment.salesforceOpportunityId
                    this.startingAt = amendment.startingAt
                    this.commits = amendment.commits
                    this.credits = amendment.credits
                    this.overrides = amendment.overrides
                    this.discounts = amendment.discounts
                    this.professionalServices = amendment.professionalServices
                    this.scheduledCharges = amendment.scheduledCharges
                    this.resellerRoyalties = amendment.resellerRoyalties
                    this.createdAt = amendment.createdAt
                    this.createdBy = amendment.createdBy
                    this.netsuiteSalesOrderId = amendment.netsuiteSalesOrderId
                    additionalProperties(amendment.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                /** This field's availability is dependent on your client's configuration. */
                fun salesforceOpportunityId(salesforceOpportunityId: String) =
                    salesforceOpportunityId(JsonField.of(salesforceOpportunityId))

                /** This field's availability is dependent on your client's configuration. */
                @JsonProperty("salesforce_opportunity_id")
                @ExcludeMissing
                fun salesforceOpportunityId(salesforceOpportunityId: JsonField<String>) = apply {
                    this.salesforceOpportunityId = salesforceOpportunityId
                }

                fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

                @JsonProperty("starting_at")
                @ExcludeMissing
                fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                    this.startingAt = startingAt
                }

                fun commits(commits: List<Commit>) = commits(JsonField.of(commits))

                @JsonProperty("commits")
                @ExcludeMissing
                fun commits(commits: JsonField<List<Commit>>) = apply { this.commits = commits }

                fun credits(credits: List<Credit>) = credits(JsonField.of(credits))

                @JsonProperty("credits")
                @ExcludeMissing
                fun credits(credits: JsonField<List<Credit>>) = apply { this.credits = credits }

                fun overrides(overrides: List<Override>) = overrides(JsonField.of(overrides))

                @JsonProperty("overrides")
                @ExcludeMissing
                fun overrides(overrides: JsonField<List<Override>>) = apply {
                    this.overrides = overrides
                }

                /** This field's availability is dependent on your client's configuration. */
                fun discounts(discounts: List<Discount>) = discounts(JsonField.of(discounts))

                /** This field's availability is dependent on your client's configuration. */
                @JsonProperty("discounts")
                @ExcludeMissing
                fun discounts(discounts: JsonField<List<Discount>>) = apply {
                    this.discounts = discounts
                }

                /** This field's availability is dependent on your client's configuration. */
                fun professionalServices(professionalServices: List<ProService>) =
                    professionalServices(JsonField.of(professionalServices))

                /** This field's availability is dependent on your client's configuration. */
                @JsonProperty("professional_services")
                @ExcludeMissing
                fun professionalServices(professionalServices: JsonField<List<ProService>>) =
                    apply {
                        this.professionalServices = professionalServices
                    }

                fun scheduledCharges(scheduledCharges: List<ScheduledCharge>) =
                    scheduledCharges(JsonField.of(scheduledCharges))

                @JsonProperty("scheduled_charges")
                @ExcludeMissing
                fun scheduledCharges(scheduledCharges: JsonField<List<ScheduledCharge>>) = apply {
                    this.scheduledCharges = scheduledCharges
                }

                /** This field's availability is dependent on your client's configuration. */
                fun resellerRoyalties(resellerRoyalties: List<ResellerRoyalty>) =
                    resellerRoyalties(JsonField.of(resellerRoyalties))

                /** This field's availability is dependent on your client's configuration. */
                @JsonProperty("reseller_royalties")
                @ExcludeMissing
                fun resellerRoyalties(resellerRoyalties: JsonField<List<ResellerRoyalty>>) = apply {
                    this.resellerRoyalties = resellerRoyalties
                }

                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                @JsonProperty("created_at")
                @ExcludeMissing
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

                @JsonProperty("created_by")
                @ExcludeMissing
                fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

                /** This field's availability is dependent on your client's configuration. */
                fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
                    netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

                /** This field's availability is dependent on your client's configuration. */
                @JsonProperty("netsuite_sales_order_id")
                @ExcludeMissing
                fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Amendment =
                    Amendment(
                        id,
                        salesforceOpportunityId,
                        startingAt,
                        commits.map { it.toImmutable() },
                        credits.map { it.toImmutable() },
                        overrides.map { it.toImmutable() },
                        discounts.map { it.toImmutable() },
                        professionalServices.map { it.toImmutable() },
                        scheduledCharges.map { it.toImmutable() },
                        resellerRoyalties.map { it.toImmutable() },
                        createdAt,
                        createdBy,
                        netsuiteSalesOrderId,
                        additionalProperties.toImmutable(),
                    )
            }

            @JsonDeserialize(builder = ResellerRoyalty.Builder::class)
            @NoAutoDetect
            class ResellerRoyalty
            private constructor(
                private val resellerType: JsonField<ResellerType>,
                private val fraction: JsonField<Double>,
                private val netsuiteResellerId: JsonField<String>,
                private val startingAt: JsonField<OffsetDateTime>,
                private val endingBefore: JsonField<OffsetDateTime>,
                private val resellerContractValue: JsonField<Double>,
                private val awsAccountNumber: JsonField<String>,
                private val awsPayerReferenceId: JsonField<String>,
                private val awsOfferId: JsonField<String>,
                private val gcpAccountId: JsonField<String>,
                private val gcpOfferId: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun resellerType(): ResellerType = resellerType.getRequired("reseller_type")

                fun fraction(): Optional<Double> =
                    Optional.ofNullable(fraction.getNullable("fraction"))

                fun netsuiteResellerId(): Optional<String> =
                    Optional.ofNullable(netsuiteResellerId.getNullable("netsuite_reseller_id"))

                fun startingAt(): Optional<OffsetDateTime> =
                    Optional.ofNullable(startingAt.getNullable("starting_at"))

                fun endingBefore(): Optional<OffsetDateTime> =
                    Optional.ofNullable(endingBefore.getNullable("ending_before"))

                fun resellerContractValue(): Optional<Double> =
                    Optional.ofNullable(
                        resellerContractValue.getNullable("reseller_contract_value")
                    )

                fun awsAccountNumber(): Optional<String> =
                    Optional.ofNullable(awsAccountNumber.getNullable("aws_account_number"))

                fun awsPayerReferenceId(): Optional<String> =
                    Optional.ofNullable(awsPayerReferenceId.getNullable("aws_payer_reference_id"))

                fun awsOfferId(): Optional<String> =
                    Optional.ofNullable(awsOfferId.getNullable("aws_offer_id"))

                fun gcpAccountId(): Optional<String> =
                    Optional.ofNullable(gcpAccountId.getNullable("gcp_account_id"))

                fun gcpOfferId(): Optional<String> =
                    Optional.ofNullable(gcpOfferId.getNullable("gcp_offer_id"))

                @JsonProperty("reseller_type") @ExcludeMissing fun _resellerType() = resellerType

                @JsonProperty("fraction") @ExcludeMissing fun _fraction() = fraction

                @JsonProperty("netsuite_reseller_id")
                @ExcludeMissing
                fun _netsuiteResellerId() = netsuiteResellerId

                @JsonProperty("starting_at") @ExcludeMissing fun _startingAt() = startingAt

                @JsonProperty("ending_before") @ExcludeMissing fun _endingBefore() = endingBefore

                @JsonProperty("reseller_contract_value")
                @ExcludeMissing
                fun _resellerContractValue() = resellerContractValue

                @JsonProperty("aws_account_number")
                @ExcludeMissing
                fun _awsAccountNumber() = awsAccountNumber

                @JsonProperty("aws_payer_reference_id")
                @ExcludeMissing
                fun _awsPayerReferenceId() = awsPayerReferenceId

                @JsonProperty("aws_offer_id") @ExcludeMissing fun _awsOfferId() = awsOfferId

                @JsonProperty("gcp_account_id") @ExcludeMissing fun _gcpAccountId() = gcpAccountId

                @JsonProperty("gcp_offer_id") @ExcludeMissing fun _gcpOfferId() = gcpOfferId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): ResellerRoyalty = apply {
                    if (!validated) {
                        resellerType()
                        fraction()
                        netsuiteResellerId()
                        startingAt()
                        endingBefore()
                        resellerContractValue()
                        awsAccountNumber()
                        awsPayerReferenceId()
                        awsOfferId()
                        gcpAccountId()
                        gcpOfferId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var resellerType: JsonField<ResellerType> = JsonMissing.of()
                    private var fraction: JsonField<Double> = JsonMissing.of()
                    private var netsuiteResellerId: JsonField<String> = JsonMissing.of()
                    private var startingAt: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var resellerContractValue: JsonField<Double> = JsonMissing.of()
                    private var awsAccountNumber: JsonField<String> = JsonMissing.of()
                    private var awsPayerReferenceId: JsonField<String> = JsonMissing.of()
                    private var awsOfferId: JsonField<String> = JsonMissing.of()
                    private var gcpAccountId: JsonField<String> = JsonMissing.of()
                    private var gcpOfferId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(resellerRoyalty: ResellerRoyalty) = apply {
                        this.resellerType = resellerRoyalty.resellerType
                        this.fraction = resellerRoyalty.fraction
                        this.netsuiteResellerId = resellerRoyalty.netsuiteResellerId
                        this.startingAt = resellerRoyalty.startingAt
                        this.endingBefore = resellerRoyalty.endingBefore
                        this.resellerContractValue = resellerRoyalty.resellerContractValue
                        this.awsAccountNumber = resellerRoyalty.awsAccountNumber
                        this.awsPayerReferenceId = resellerRoyalty.awsPayerReferenceId
                        this.awsOfferId = resellerRoyalty.awsOfferId
                        this.gcpAccountId = resellerRoyalty.gcpAccountId
                        this.gcpOfferId = resellerRoyalty.gcpOfferId
                        additionalProperties(resellerRoyalty.additionalProperties)
                    }

                    fun resellerType(resellerType: ResellerType) =
                        resellerType(JsonField.of(resellerType))

                    @JsonProperty("reseller_type")
                    @ExcludeMissing
                    fun resellerType(resellerType: JsonField<ResellerType>) = apply {
                        this.resellerType = resellerType
                    }

                    fun fraction(fraction: Double) = fraction(JsonField.of(fraction))

                    @JsonProperty("fraction")
                    @ExcludeMissing
                    fun fraction(fraction: JsonField<Double>) = apply { this.fraction = fraction }

                    fun netsuiteResellerId(netsuiteResellerId: String) =
                        netsuiteResellerId(JsonField.of(netsuiteResellerId))

                    @JsonProperty("netsuite_reseller_id")
                    @ExcludeMissing
                    fun netsuiteResellerId(netsuiteResellerId: JsonField<String>) = apply {
                        this.netsuiteResellerId = netsuiteResellerId
                    }

                    fun startingAt(startingAt: OffsetDateTime) =
                        startingAt(JsonField.of(startingAt))

                    @JsonProperty("starting_at")
                    @ExcludeMissing
                    fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                        this.startingAt = startingAt
                    }

                    fun endingBefore(endingBefore: OffsetDateTime) =
                        endingBefore(JsonField.of(endingBefore))

                    @JsonProperty("ending_before")
                    @ExcludeMissing
                    fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                        this.endingBefore = endingBefore
                    }

                    fun resellerContractValue(resellerContractValue: Double) =
                        resellerContractValue(JsonField.of(resellerContractValue))

                    @JsonProperty("reseller_contract_value")
                    @ExcludeMissing
                    fun resellerContractValue(resellerContractValue: JsonField<Double>) = apply {
                        this.resellerContractValue = resellerContractValue
                    }

                    fun awsAccountNumber(awsAccountNumber: String) =
                        awsAccountNumber(JsonField.of(awsAccountNumber))

                    @JsonProperty("aws_account_number")
                    @ExcludeMissing
                    fun awsAccountNumber(awsAccountNumber: JsonField<String>) = apply {
                        this.awsAccountNumber = awsAccountNumber
                    }

                    fun awsPayerReferenceId(awsPayerReferenceId: String) =
                        awsPayerReferenceId(JsonField.of(awsPayerReferenceId))

                    @JsonProperty("aws_payer_reference_id")
                    @ExcludeMissing
                    fun awsPayerReferenceId(awsPayerReferenceId: JsonField<String>) = apply {
                        this.awsPayerReferenceId = awsPayerReferenceId
                    }

                    fun awsOfferId(awsOfferId: String) = awsOfferId(JsonField.of(awsOfferId))

                    @JsonProperty("aws_offer_id")
                    @ExcludeMissing
                    fun awsOfferId(awsOfferId: JsonField<String>) = apply {
                        this.awsOfferId = awsOfferId
                    }

                    fun gcpAccountId(gcpAccountId: String) =
                        gcpAccountId(JsonField.of(gcpAccountId))

                    @JsonProperty("gcp_account_id")
                    @ExcludeMissing
                    fun gcpAccountId(gcpAccountId: JsonField<String>) = apply {
                        this.gcpAccountId = gcpAccountId
                    }

                    fun gcpOfferId(gcpOfferId: String) = gcpOfferId(JsonField.of(gcpOfferId))

                    @JsonProperty("gcp_offer_id")
                    @ExcludeMissing
                    fun gcpOfferId(gcpOfferId: JsonField<String>) = apply {
                        this.gcpOfferId = gcpOfferId
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

                    fun build(): ResellerRoyalty =
                        ResellerRoyalty(
                            resellerType,
                            fraction,
                            netsuiteResellerId,
                            startingAt,
                            endingBefore,
                            resellerContractValue,
                            awsAccountNumber,
                            awsPayerReferenceId,
                            awsOfferId,
                            gcpAccountId,
                            gcpOfferId,
                            additionalProperties.toImmutable(),
                        )
                }

                class ResellerType
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
                            else ->
                                throw MetronomeInvalidDataException("Unknown ResellerType: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ResellerRoyalty && resellerType == other.resellerType && fraction == other.fraction && netsuiteResellerId == other.netsuiteResellerId && startingAt == other.startingAt && endingBefore == other.endingBefore && resellerContractValue == other.resellerContractValue && awsAccountNumber == other.awsAccountNumber && awsPayerReferenceId == other.awsPayerReferenceId && awsOfferId == other.awsOfferId && gcpAccountId == other.gcpAccountId && gcpOfferId == other.gcpOfferId && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(resellerType, fraction, netsuiteResellerId, startingAt, endingBefore, resellerContractValue, awsAccountNumber, awsPayerReferenceId, awsOfferId, gcpAccountId, gcpOfferId, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ResellerRoyalty{resellerType=$resellerType, fraction=$fraction, netsuiteResellerId=$netsuiteResellerId, startingAt=$startingAt, endingBefore=$endingBefore, resellerContractValue=$resellerContractValue, awsAccountNumber=$awsAccountNumber, awsPayerReferenceId=$awsPayerReferenceId, awsOfferId=$awsOfferId, gcpAccountId=$gcpAccountId, gcpOfferId=$gcpOfferId, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Amendment && id == other.id && salesforceOpportunityId == other.salesforceOpportunityId && startingAt == other.startingAt && commits == other.commits && credits == other.credits && overrides == other.overrides && discounts == other.discounts && professionalServices == other.professionalServices && scheduledCharges == other.scheduledCharges && resellerRoyalties == other.resellerRoyalties && createdAt == other.createdAt && createdBy == other.createdBy && netsuiteSalesOrderId == other.netsuiteSalesOrderId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, salesforceOpportunityId, startingAt, commits, credits, overrides, discounts, professionalServices, scheduledCharges, resellerRoyalties, createdAt, createdBy, netsuiteSalesOrderId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Amendment{id=$id, salesforceOpportunityId=$salesforceOpportunityId, startingAt=$startingAt, commits=$commits, credits=$credits, overrides=$overrides, discounts=$discounts, professionalServices=$professionalServices, scheduledCharges=$scheduledCharges, resellerRoyalties=$resellerRoyalties, createdAt=$createdAt, createdBy=$createdBy, netsuiteSalesOrderId=$netsuiteSalesOrderId, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = CustomFields.Builder::class)
        @NoAutoDetect
        class CustomFields
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CustomFields = apply {
                if (!validated) {
                    validated = true
                }
            }

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

        /** The billing provider configuration associated with a contract. */
        @JsonDeserialize(builder = CustomerBillingProviderConfiguration.Builder::class)
        @NoAutoDetect
        class CustomerBillingProviderConfiguration
        private constructor(
            private val billingProvider: JsonField<BillingProvider>,
            private val deliveryMethod: JsonField<DeliveryMethod>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun billingProvider(): BillingProvider = billingProvider.getRequired("billing_provider")

            fun deliveryMethod(): DeliveryMethod = deliveryMethod.getRequired("delivery_method")

            @JsonProperty("billing_provider")
            @ExcludeMissing
            fun _billingProvider() = billingProvider

            @JsonProperty("delivery_method") @ExcludeMissing fun _deliveryMethod() = deliveryMethod

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CustomerBillingProviderConfiguration = apply {
                if (!validated) {
                    billingProvider()
                    deliveryMethod()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var billingProvider: JsonField<BillingProvider> = JsonMissing.of()
                private var deliveryMethod: JsonField<DeliveryMethod> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    customerBillingProviderConfiguration: CustomerBillingProviderConfiguration
                ) = apply {
                    this.billingProvider = customerBillingProviderConfiguration.billingProvider
                    this.deliveryMethod = customerBillingProviderConfiguration.deliveryMethod
                    additionalProperties(customerBillingProviderConfiguration.additionalProperties)
                }

                fun billingProvider(billingProvider: BillingProvider) =
                    billingProvider(JsonField.of(billingProvider))

                @JsonProperty("billing_provider")
                @ExcludeMissing
                fun billingProvider(billingProvider: JsonField<BillingProvider>) = apply {
                    this.billingProvider = billingProvider
                }

                fun deliveryMethod(deliveryMethod: DeliveryMethod) =
                    deliveryMethod(JsonField.of(deliveryMethod))

                @JsonProperty("delivery_method")
                @ExcludeMissing
                fun deliveryMethod(deliveryMethod: JsonField<DeliveryMethod>) = apply {
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CustomerBillingProviderConfiguration =
                    CustomerBillingProviderConfiguration(
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

                    @JvmField val STRIPE = of("stripe")

                    @JvmField val NETSUITE = of("netsuite")

                    @JvmField val CUSTOM = of("custom")

                    @JvmField val AZURE_MARKETPLACE = of("azure_marketplace")

                    @JvmField val QUICKBOOKS_ONLINE = of("quickbooks_online")

                    @JvmField val WORKDAY = of("workday")

                    @JvmField val GCP_MARKETPLACE = of("gcp_marketplace")

                    @JvmStatic fun of(value: String) = BillingProvider(JsonField.of(value))
                }

                enum class Known {
                    AWS_MARKETPLACE,
                    STRIPE,
                    NETSUITE,
                    CUSTOM,
                    AZURE_MARKETPLACE,
                    QUICKBOOKS_ONLINE,
                    WORKDAY,
                    GCP_MARKETPLACE,
                }

                enum class Value {
                    AWS_MARKETPLACE,
                    STRIPE,
                    NETSUITE,
                    CUSTOM,
                    AZURE_MARKETPLACE,
                    QUICKBOOKS_ONLINE,
                    WORKDAY,
                    GCP_MARKETPLACE,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        AWS_MARKETPLACE -> Value.AWS_MARKETPLACE
                        STRIPE -> Value.STRIPE
                        NETSUITE -> Value.NETSUITE
                        CUSTOM -> Value.CUSTOM
                        AZURE_MARKETPLACE -> Value.AZURE_MARKETPLACE
                        QUICKBOOKS_ONLINE -> Value.QUICKBOOKS_ONLINE
                        WORKDAY -> Value.WORKDAY
                        GCP_MARKETPLACE -> Value.GCP_MARKETPLACE
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        AWS_MARKETPLACE -> Known.AWS_MARKETPLACE
                        STRIPE -> Known.STRIPE
                        NETSUITE -> Known.NETSUITE
                        CUSTOM -> Known.CUSTOM
                        AZURE_MARKETPLACE -> Known.AZURE_MARKETPLACE
                        QUICKBOOKS_ONLINE -> Known.QUICKBOOKS_ONLINE
                        WORKDAY -> Known.WORKDAY
                        GCP_MARKETPLACE -> Known.GCP_MARKETPLACE
                        else ->
                            throw MetronomeInvalidDataException("Unknown BillingProvider: $value")
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
                        else ->
                            throw MetronomeInvalidDataException("Unknown DeliveryMethod: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CustomerBillingProviderConfiguration && billingProvider == other.billingProvider && deliveryMethod == other.deliveryMethod && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(billingProvider, deliveryMethod, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CustomerBillingProviderConfiguration{billingProvider=$billingProvider, deliveryMethod=$deliveryMethod, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && id == other.id && archivedAt == other.archivedAt && customerId == other.customerId && uniquenessKey == other.uniquenessKey && initial == other.initial && current == other.current && amendments == other.amendments && customFields == other.customFields && customerBillingProviderConfiguration == other.customerBillingProviderConfiguration && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, archivedAt, customerId, uniquenessKey, initial, current, amendments, customFields, customerBillingProviderConfiguration, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, archivedAt=$archivedAt, customerId=$customerId, uniquenessKey=$uniquenessKey, initial=$initial, current=$current, amendments=$amendments, customFields=$customFields, customerBillingProviderConfiguration=$customerBillingProviderConfiguration, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractListResponse && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ContractListResponse{data=$data, additionalProperties=$additionalProperties}"
}
