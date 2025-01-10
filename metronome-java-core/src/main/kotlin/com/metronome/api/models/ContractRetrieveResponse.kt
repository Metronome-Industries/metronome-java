// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class ContractRetrieveResponse
@JsonCreator
private constructor(
    @JsonProperty("data") @ExcludeMissing private val data: JsonField<Data> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun data(): Data = data.getRequired("data")

    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ContractRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        data().validate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var data: JsonField<Data>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contractRetrieveResponse: ContractRetrieveResponse) = apply {
            data = contractRetrieveResponse.data
            additionalProperties = contractRetrieveResponse.additionalProperties.toMutableMap()
        }

        fun data(data: Data) = data(JsonField.of(data))

        fun data(data: JsonField<Data>) = apply { this.data = data }

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

        fun build(): ContractRetrieveResponse =
            ContractRetrieveResponse(
                checkNotNull(data) { "`data` is required but was not set" },
                additionalProperties.toImmutable()
            )
    }

    @NoAutoDetect
    class Data
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amendments")
        @ExcludeMissing
        private val amendments: JsonField<List<Amendment>> = JsonMissing.of(),
        @JsonProperty("current")
        @ExcludeMissing
        private val current: JsonField<ContractWithoutAmendments> = JsonMissing.of(),
        @JsonProperty("customer_id")
        @ExcludeMissing
        private val customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("initial")
        @ExcludeMissing
        private val initial: JsonField<ContractWithoutAmendments> = JsonMissing.of(),
        @JsonProperty("archived_at")
        @ExcludeMissing
        private val archivedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("custom_fields")
        @ExcludeMissing
        private val customFields: JsonField<CustomFields> = JsonMissing.of(),
        @JsonProperty("customer_billing_provider_configuration")
        @ExcludeMissing
        private val customerBillingProviderConfiguration:
            JsonField<CustomerBillingProviderConfiguration> =
            JsonMissing.of(),
        @JsonProperty("uniqueness_key")
        @ExcludeMissing
        private val uniquenessKey: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun amendments(): List<Amendment> = amendments.getRequired("amendments")

        fun current(): ContractWithoutAmendments = current.getRequired("current")

        fun customerId(): String = customerId.getRequired("customer_id")

        fun initial(): ContractWithoutAmendments = initial.getRequired("initial")

        /**
         * RFC 3339 timestamp indicating when the contract was archived. If not returned, the
         * contract is not archived.
         */
        fun archivedAt(): Optional<OffsetDateTime> =
            Optional.ofNullable(archivedAt.getNullable("archived_at"))

        fun customFields(): Optional<CustomFields> =
            Optional.ofNullable(customFields.getNullable("custom_fields"))

        /** The billing provider configuration associated with a contract. */
        fun customerBillingProviderConfiguration(): Optional<CustomerBillingProviderConfiguration> =
            Optional.ofNullable(
                customerBillingProviderConfiguration.getNullable(
                    "customer_billing_provider_configuration"
                )
            )

        /**
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
         */
        fun uniquenessKey(): Optional<String> =
            Optional.ofNullable(uniquenessKey.getNullable("uniqueness_key"))

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("amendments")
        @ExcludeMissing
        fun _amendments(): JsonField<List<Amendment>> = amendments

        @JsonProperty("current")
        @ExcludeMissing
        fun _current(): JsonField<ContractWithoutAmendments> = current

        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        @JsonProperty("initial")
        @ExcludeMissing
        fun _initial(): JsonField<ContractWithoutAmendments> = initial

        /**
         * RFC 3339 timestamp indicating when the contract was archived. If not returned, the
         * contract is not archived.
         */
        @JsonProperty("archived_at")
        @ExcludeMissing
        fun _archivedAt(): JsonField<OffsetDateTime> = archivedAt

        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

        /** The billing provider configuration associated with a contract. */
        @JsonProperty("customer_billing_provider_configuration")
        @ExcludeMissing
        fun _customerBillingProviderConfiguration():
            JsonField<CustomerBillingProviderConfiguration> = customerBillingProviderConfiguration

        /**
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
         */
        @JsonProperty("uniqueness_key")
        @ExcludeMissing
        fun _uniquenessKey(): JsonField<String> = uniquenessKey

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            amendments().forEach { it.validate() }
            current().validate()
            customerId()
            initial().validate()
            archivedAt()
            customFields().ifPresent { it.validate() }
            customerBillingProviderConfiguration().ifPresent { it.validate() }
            uniquenessKey()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String>? = null
            private var amendments: JsonField<MutableList<Amendment>>? = null
            private var current: JsonField<ContractWithoutAmendments>? = null
            private var customerId: JsonField<String>? = null
            private var initial: JsonField<ContractWithoutAmendments>? = null
            private var archivedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var customerBillingProviderConfiguration:
                JsonField<CustomerBillingProviderConfiguration> =
                JsonMissing.of()
            private var uniquenessKey: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                amendments = data.amendments.map { it.toMutableList() }
                current = data.current
                customerId = data.customerId
                initial = data.initial
                archivedAt = data.archivedAt
                customFields = data.customFields
                customerBillingProviderConfiguration = data.customerBillingProviderConfiguration
                uniquenessKey = data.uniquenessKey
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun amendments(amendments: List<Amendment>) = amendments(JsonField.of(amendments))

            fun amendments(amendments: JsonField<List<Amendment>>) = apply {
                this.amendments = amendments.map { it.toMutableList() }
            }

            fun addAmendment(amendment: Amendment) = apply {
                amendments =
                    (amendments ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(amendment)
                    }
            }

            fun current(current: ContractWithoutAmendments) = current(JsonField.of(current))

            fun current(current: JsonField<ContractWithoutAmendments>) = apply {
                this.current = current
            }

            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            fun initial(initial: ContractWithoutAmendments) = initial(JsonField.of(initial))

            fun initial(initial: JsonField<ContractWithoutAmendments>) = apply {
                this.initial = initial
            }

            /**
             * RFC 3339 timestamp indicating when the contract was archived. If not returned, the
             * contract is not archived.
             */
            fun archivedAt(archivedAt: OffsetDateTime) = archivedAt(JsonField.of(archivedAt))

            /**
             * RFC 3339 timestamp indicating when the contract was archived. If not returned, the
             * contract is not archived.
             */
            fun archivedAt(archivedAt: JsonField<OffsetDateTime>) = apply {
                this.archivedAt = archivedAt
            }

            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

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
            fun customerBillingProviderConfiguration(
                customerBillingProviderConfiguration:
                    JsonField<CustomerBillingProviderConfiguration>
            ) = apply {
                this.customerBillingProviderConfiguration = customerBillingProviderConfiguration
            }

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
            fun uniquenessKey(uniquenessKey: JsonField<String>) = apply {
                this.uniquenessKey = uniquenessKey
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

            fun build(): Data =
                Data(
                    checkNotNull(id) { "`id` is required but was not set" },
                    checkNotNull(amendments) { "`amendments` is required but was not set" }
                        .map { it.toImmutable() },
                    checkNotNull(current) { "`current` is required but was not set" },
                    checkNotNull(customerId) { "`customerId` is required but was not set" },
                    checkNotNull(initial) { "`initial` is required but was not set" },
                    archivedAt,
                    customFields,
                    customerBillingProviderConfiguration,
                    uniquenessKey,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class Amendment
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("commits")
            @ExcludeMissing
            private val commits: JsonField<List<Commit>> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("created_by")
            @ExcludeMissing
            private val createdBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("overrides")
            @ExcludeMissing
            private val overrides: JsonField<List<Override>> = JsonMissing.of(),
            @JsonProperty("scheduled_charges")
            @ExcludeMissing
            private val scheduledCharges: JsonField<List<ScheduledCharge>> = JsonMissing.of(),
            @JsonProperty("starting_at")
            @ExcludeMissing
            private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("credits")
            @ExcludeMissing
            private val credits: JsonField<List<Credit>> = JsonMissing.of(),
            @JsonProperty("discounts")
            @ExcludeMissing
            private val discounts: JsonField<List<Discount>> = JsonMissing.of(),
            @JsonProperty("netsuite_sales_order_id")
            @ExcludeMissing
            private val netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("professional_services")
            @ExcludeMissing
            private val professionalServices: JsonField<List<ProService>> = JsonMissing.of(),
            @JsonProperty("reseller_royalties")
            @ExcludeMissing
            private val resellerRoyalties: JsonField<List<ResellerRoyalty>> = JsonMissing.of(),
            @JsonProperty("salesforce_opportunity_id")
            @ExcludeMissing
            private val salesforceOpportunityId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun commits(): List<Commit> = commits.getRequired("commits")

            fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

            fun createdBy(): String = createdBy.getRequired("created_by")

            fun overrides(): List<Override> = overrides.getRequired("overrides")

            fun scheduledCharges(): List<ScheduledCharge> =
                scheduledCharges.getRequired("scheduled_charges")

            fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

            fun credits(): Optional<List<Credit>> =
                Optional.ofNullable(credits.getNullable("credits"))

            /** This field's availability is dependent on your client's configuration. */
            fun discounts(): Optional<List<Discount>> =
                Optional.ofNullable(discounts.getNullable("discounts"))

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(): Optional<String> =
                Optional.ofNullable(netsuiteSalesOrderId.getNullable("netsuite_sales_order_id"))

            /** This field's availability is dependent on your client's configuration. */
            fun professionalServices(): Optional<List<ProService>> =
                Optional.ofNullable(professionalServices.getNullable("professional_services"))

            /** This field's availability is dependent on your client's configuration. */
            fun resellerRoyalties(): Optional<List<ResellerRoyalty>> =
                Optional.ofNullable(resellerRoyalties.getNullable("reseller_royalties"))

            /** This field's availability is dependent on your client's configuration. */
            fun salesforceOpportunityId(): Optional<String> =
                Optional.ofNullable(
                    salesforceOpportunityId.getNullable("salesforce_opportunity_id")
                )

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonProperty("commits")
            @ExcludeMissing
            fun _commits(): JsonField<List<Commit>> = commits

            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            @JsonProperty("created_by")
            @ExcludeMissing
            fun _createdBy(): JsonField<String> = createdBy

            @JsonProperty("overrides")
            @ExcludeMissing
            fun _overrides(): JsonField<List<Override>> = overrides

            @JsonProperty("scheduled_charges")
            @ExcludeMissing
            fun _scheduledCharges(): JsonField<List<ScheduledCharge>> = scheduledCharges

            @JsonProperty("starting_at")
            @ExcludeMissing
            fun _startingAt(): JsonField<OffsetDateTime> = startingAt

            @JsonProperty("credits")
            @ExcludeMissing
            fun _credits(): JsonField<List<Credit>> = credits

            /** This field's availability is dependent on your client's configuration. */
            @JsonProperty("discounts")
            @ExcludeMissing
            fun _discounts(): JsonField<List<Discount>> = discounts

            /** This field's availability is dependent on your client's configuration. */
            @JsonProperty("netsuite_sales_order_id")
            @ExcludeMissing
            fun _netsuiteSalesOrderId(): JsonField<String> = netsuiteSalesOrderId

            /** This field's availability is dependent on your client's configuration. */
            @JsonProperty("professional_services")
            @ExcludeMissing
            fun _professionalServices(): JsonField<List<ProService>> = professionalServices

            /** This field's availability is dependent on your client's configuration. */
            @JsonProperty("reseller_royalties")
            @ExcludeMissing
            fun _resellerRoyalties(): JsonField<List<ResellerRoyalty>> = resellerRoyalties

            /** This field's availability is dependent on your client's configuration. */
            @JsonProperty("salesforce_opportunity_id")
            @ExcludeMissing
            fun _salesforceOpportunityId(): JsonField<String> = salesforceOpportunityId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Amendment = apply {
                if (validated) {
                    return@apply
                }

                id()
                commits().forEach { it.validate() }
                createdAt()
                createdBy()
                overrides().forEach { it.validate() }
                scheduledCharges().forEach { it.validate() }
                startingAt()
                credits().ifPresent { it.forEach { it.validate() } }
                discounts().ifPresent { it.forEach { it.validate() } }
                netsuiteSalesOrderId()
                professionalServices().ifPresent { it.forEach { it.validate() } }
                resellerRoyalties().ifPresent { it.forEach { it.validate() } }
                salesforceOpportunityId()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String>? = null
                private var commits: JsonField<MutableList<Commit>>? = null
                private var createdAt: JsonField<OffsetDateTime>? = null
                private var createdBy: JsonField<String>? = null
                private var overrides: JsonField<MutableList<Override>>? = null
                private var scheduledCharges: JsonField<MutableList<ScheduledCharge>>? = null
                private var startingAt: JsonField<OffsetDateTime>? = null
                private var credits: JsonField<MutableList<Credit>>? = null
                private var discounts: JsonField<MutableList<Discount>>? = null
                private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
                private var professionalServices: JsonField<MutableList<ProService>>? = null
                private var resellerRoyalties: JsonField<MutableList<ResellerRoyalty>>? = null
                private var salesforceOpportunityId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(amendment: Amendment) = apply {
                    id = amendment.id
                    commits = amendment.commits.map { it.toMutableList() }
                    createdAt = amendment.createdAt
                    createdBy = amendment.createdBy
                    overrides = amendment.overrides.map { it.toMutableList() }
                    scheduledCharges = amendment.scheduledCharges.map { it.toMutableList() }
                    startingAt = amendment.startingAt
                    credits = amendment.credits.map { it.toMutableList() }
                    discounts = amendment.discounts.map { it.toMutableList() }
                    netsuiteSalesOrderId = amendment.netsuiteSalesOrderId
                    professionalServices = amendment.professionalServices.map { it.toMutableList() }
                    resellerRoyalties = amendment.resellerRoyalties.map { it.toMutableList() }
                    salesforceOpportunityId = amendment.salesforceOpportunityId
                    additionalProperties = amendment.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun commits(commits: List<Commit>) = commits(JsonField.of(commits))

                fun commits(commits: JsonField<List<Commit>>) = apply {
                    this.commits = commits.map { it.toMutableList() }
                }

                fun addCommit(commit: Commit) = apply {
                    commits =
                        (commits ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(commit)
                        }
                }

                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

                fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

                fun overrides(overrides: List<Override>) = overrides(JsonField.of(overrides))

                fun overrides(overrides: JsonField<List<Override>>) = apply {
                    this.overrides = overrides.map { it.toMutableList() }
                }

                fun addOverride(override: Override) = apply {
                    overrides =
                        (overrides ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(override)
                        }
                }

                fun scheduledCharges(scheduledCharges: List<ScheduledCharge>) =
                    scheduledCharges(JsonField.of(scheduledCharges))

                fun scheduledCharges(scheduledCharges: JsonField<List<ScheduledCharge>>) = apply {
                    this.scheduledCharges = scheduledCharges.map { it.toMutableList() }
                }

                fun addScheduledCharge(scheduledCharge: ScheduledCharge) = apply {
                    scheduledCharges =
                        (scheduledCharges ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(scheduledCharge)
                        }
                }

                fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

                fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                    this.startingAt = startingAt
                }

                fun credits(credits: List<Credit>) = credits(JsonField.of(credits))

                fun credits(credits: JsonField<List<Credit>>) = apply {
                    this.credits = credits.map { it.toMutableList() }
                }

                fun addCredit(credit: Credit) = apply {
                    credits =
                        (credits ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(credit)
                        }
                }

                /** This field's availability is dependent on your client's configuration. */
                fun discounts(discounts: List<Discount>) = discounts(JsonField.of(discounts))

                /** This field's availability is dependent on your client's configuration. */
                fun discounts(discounts: JsonField<List<Discount>>) = apply {
                    this.discounts = discounts.map { it.toMutableList() }
                }

                /** This field's availability is dependent on your client's configuration. */
                fun addDiscount(discount: Discount) = apply {
                    discounts =
                        (discounts ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(discount)
                        }
                }

                /** This field's availability is dependent on your client's configuration. */
                fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
                    netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

                /** This field's availability is dependent on your client's configuration. */
                fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
                    this.netsuiteSalesOrderId = netsuiteSalesOrderId
                }

                /** This field's availability is dependent on your client's configuration. */
                fun professionalServices(professionalServices: List<ProService>) =
                    professionalServices(JsonField.of(professionalServices))

                /** This field's availability is dependent on your client's configuration. */
                fun professionalServices(professionalServices: JsonField<List<ProService>>) =
                    apply {
                        this.professionalServices = professionalServices.map { it.toMutableList() }
                    }

                /** This field's availability is dependent on your client's configuration. */
                fun addProfessionalService(professionalService: ProService) = apply {
                    professionalServices =
                        (professionalServices ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(professionalService)
                        }
                }

                /** This field's availability is dependent on your client's configuration. */
                fun resellerRoyalties(resellerRoyalties: List<ResellerRoyalty>) =
                    resellerRoyalties(JsonField.of(resellerRoyalties))

                /** This field's availability is dependent on your client's configuration. */
                fun resellerRoyalties(resellerRoyalties: JsonField<List<ResellerRoyalty>>) = apply {
                    this.resellerRoyalties = resellerRoyalties.map { it.toMutableList() }
                }

                /** This field's availability is dependent on your client's configuration. */
                fun addResellerRoyalty(resellerRoyalty: ResellerRoyalty) = apply {
                    resellerRoyalties =
                        (resellerRoyalties ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(resellerRoyalty)
                        }
                }

                /** This field's availability is dependent on your client's configuration. */
                fun salesforceOpportunityId(salesforceOpportunityId: String) =
                    salesforceOpportunityId(JsonField.of(salesforceOpportunityId))

                /** This field's availability is dependent on your client's configuration. */
                fun salesforceOpportunityId(salesforceOpportunityId: JsonField<String>) = apply {
                    this.salesforceOpportunityId = salesforceOpportunityId
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

                fun build(): Amendment =
                    Amendment(
                        checkNotNull(id) { "`id` is required but was not set" },
                        checkNotNull(commits) { "`commits` is required but was not set" }
                            .map { it.toImmutable() },
                        checkNotNull(createdAt) { "`createdAt` is required but was not set" },
                        checkNotNull(createdBy) { "`createdBy` is required but was not set" },
                        checkNotNull(overrides) { "`overrides` is required but was not set" }
                            .map { it.toImmutable() },
                        checkNotNull(scheduledCharges) {
                                "`scheduledCharges` is required but was not set"
                            }
                            .map { it.toImmutable() },
                        checkNotNull(startingAt) { "`startingAt` is required but was not set" },
                        (credits ?: JsonMissing.of()).map { it.toImmutable() },
                        (discounts ?: JsonMissing.of()).map { it.toImmutable() },
                        netsuiteSalesOrderId,
                        (professionalServices ?: JsonMissing.of()).map { it.toImmutable() },
                        (resellerRoyalties ?: JsonMissing.of()).map { it.toImmutable() },
                        salesforceOpportunityId,
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class ResellerRoyalty
            @JsonCreator
            private constructor(
                @JsonProperty("reseller_type")
                @ExcludeMissing
                private val resellerType: JsonField<ResellerType> = JsonMissing.of(),
                @JsonProperty("aws_account_number")
                @ExcludeMissing
                private val awsAccountNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("aws_offer_id")
                @ExcludeMissing
                private val awsOfferId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("aws_payer_reference_id")
                @ExcludeMissing
                private val awsPayerReferenceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("ending_before")
                @ExcludeMissing
                private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("fraction")
                @ExcludeMissing
                private val fraction: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("gcp_account_id")
                @ExcludeMissing
                private val gcpAccountId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("gcp_offer_id")
                @ExcludeMissing
                private val gcpOfferId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("netsuite_reseller_id")
                @ExcludeMissing
                private val netsuiteResellerId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("reseller_contract_value")
                @ExcludeMissing
                private val resellerContractValue: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("starting_at")
                @ExcludeMissing
                private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun resellerType(): ResellerType = resellerType.getRequired("reseller_type")

                fun awsAccountNumber(): Optional<String> =
                    Optional.ofNullable(awsAccountNumber.getNullable("aws_account_number"))

                fun awsOfferId(): Optional<String> =
                    Optional.ofNullable(awsOfferId.getNullable("aws_offer_id"))

                fun awsPayerReferenceId(): Optional<String> =
                    Optional.ofNullable(awsPayerReferenceId.getNullable("aws_payer_reference_id"))

                fun endingBefore(): Optional<OffsetDateTime> =
                    Optional.ofNullable(endingBefore.getNullable("ending_before"))

                fun fraction(): Optional<Double> =
                    Optional.ofNullable(fraction.getNullable("fraction"))

                fun gcpAccountId(): Optional<String> =
                    Optional.ofNullable(gcpAccountId.getNullable("gcp_account_id"))

                fun gcpOfferId(): Optional<String> =
                    Optional.ofNullable(gcpOfferId.getNullable("gcp_offer_id"))

                fun netsuiteResellerId(): Optional<String> =
                    Optional.ofNullable(netsuiteResellerId.getNullable("netsuite_reseller_id"))

                fun resellerContractValue(): Optional<Double> =
                    Optional.ofNullable(
                        resellerContractValue.getNullable("reseller_contract_value")
                    )

                fun startingAt(): Optional<OffsetDateTime> =
                    Optional.ofNullable(startingAt.getNullable("starting_at"))

                @JsonProperty("reseller_type")
                @ExcludeMissing
                fun _resellerType(): JsonField<ResellerType> = resellerType

                @JsonProperty("aws_account_number")
                @ExcludeMissing
                fun _awsAccountNumber(): JsonField<String> = awsAccountNumber

                @JsonProperty("aws_offer_id")
                @ExcludeMissing
                fun _awsOfferId(): JsonField<String> = awsOfferId

                @JsonProperty("aws_payer_reference_id")
                @ExcludeMissing
                fun _awsPayerReferenceId(): JsonField<String> = awsPayerReferenceId

                @JsonProperty("ending_before")
                @ExcludeMissing
                fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

                @JsonProperty("fraction")
                @ExcludeMissing
                fun _fraction(): JsonField<Double> = fraction

                @JsonProperty("gcp_account_id")
                @ExcludeMissing
                fun _gcpAccountId(): JsonField<String> = gcpAccountId

                @JsonProperty("gcp_offer_id")
                @ExcludeMissing
                fun _gcpOfferId(): JsonField<String> = gcpOfferId

                @JsonProperty("netsuite_reseller_id")
                @ExcludeMissing
                fun _netsuiteResellerId(): JsonField<String> = netsuiteResellerId

                @JsonProperty("reseller_contract_value")
                @ExcludeMissing
                fun _resellerContractValue(): JsonField<Double> = resellerContractValue

                @JsonProperty("starting_at")
                @ExcludeMissing
                fun _startingAt(): JsonField<OffsetDateTime> = startingAt

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): ResellerRoyalty = apply {
                    if (validated) {
                        return@apply
                    }

                    resellerType()
                    awsAccountNumber()
                    awsOfferId()
                    awsPayerReferenceId()
                    endingBefore()
                    fraction()
                    gcpAccountId()
                    gcpOfferId()
                    netsuiteResellerId()
                    resellerContractValue()
                    startingAt()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var resellerType: JsonField<ResellerType>? = null
                    private var awsAccountNumber: JsonField<String> = JsonMissing.of()
                    private var awsOfferId: JsonField<String> = JsonMissing.of()
                    private var awsPayerReferenceId: JsonField<String> = JsonMissing.of()
                    private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var fraction: JsonField<Double> = JsonMissing.of()
                    private var gcpAccountId: JsonField<String> = JsonMissing.of()
                    private var gcpOfferId: JsonField<String> = JsonMissing.of()
                    private var netsuiteResellerId: JsonField<String> = JsonMissing.of()
                    private var resellerContractValue: JsonField<Double> = JsonMissing.of()
                    private var startingAt: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(resellerRoyalty: ResellerRoyalty) = apply {
                        resellerType = resellerRoyalty.resellerType
                        awsAccountNumber = resellerRoyalty.awsAccountNumber
                        awsOfferId = resellerRoyalty.awsOfferId
                        awsPayerReferenceId = resellerRoyalty.awsPayerReferenceId
                        endingBefore = resellerRoyalty.endingBefore
                        fraction = resellerRoyalty.fraction
                        gcpAccountId = resellerRoyalty.gcpAccountId
                        gcpOfferId = resellerRoyalty.gcpOfferId
                        netsuiteResellerId = resellerRoyalty.netsuiteResellerId
                        resellerContractValue = resellerRoyalty.resellerContractValue
                        startingAt = resellerRoyalty.startingAt
                        additionalProperties = resellerRoyalty.additionalProperties.toMutableMap()
                    }

                    fun resellerType(resellerType: ResellerType) =
                        resellerType(JsonField.of(resellerType))

                    fun resellerType(resellerType: JsonField<ResellerType>) = apply {
                        this.resellerType = resellerType
                    }

                    fun awsAccountNumber(awsAccountNumber: String) =
                        awsAccountNumber(JsonField.of(awsAccountNumber))

                    fun awsAccountNumber(awsAccountNumber: JsonField<String>) = apply {
                        this.awsAccountNumber = awsAccountNumber
                    }

                    fun awsOfferId(awsOfferId: String) = awsOfferId(JsonField.of(awsOfferId))

                    fun awsOfferId(awsOfferId: JsonField<String>) = apply {
                        this.awsOfferId = awsOfferId
                    }

                    fun awsPayerReferenceId(awsPayerReferenceId: String) =
                        awsPayerReferenceId(JsonField.of(awsPayerReferenceId))

                    fun awsPayerReferenceId(awsPayerReferenceId: JsonField<String>) = apply {
                        this.awsPayerReferenceId = awsPayerReferenceId
                    }

                    fun endingBefore(endingBefore: OffsetDateTime?) =
                        endingBefore(JsonField.ofNullable(endingBefore))

                    fun endingBefore(endingBefore: Optional<OffsetDateTime>) =
                        endingBefore(endingBefore.orElse(null))

                    fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                        this.endingBefore = endingBefore
                    }

                    fun fraction(fraction: Double) = fraction(JsonField.of(fraction))

                    fun fraction(fraction: JsonField<Double>) = apply { this.fraction = fraction }

                    fun gcpAccountId(gcpAccountId: String) =
                        gcpAccountId(JsonField.of(gcpAccountId))

                    fun gcpAccountId(gcpAccountId: JsonField<String>) = apply {
                        this.gcpAccountId = gcpAccountId
                    }

                    fun gcpOfferId(gcpOfferId: String) = gcpOfferId(JsonField.of(gcpOfferId))

                    fun gcpOfferId(gcpOfferId: JsonField<String>) = apply {
                        this.gcpOfferId = gcpOfferId
                    }

                    fun netsuiteResellerId(netsuiteResellerId: String) =
                        netsuiteResellerId(JsonField.of(netsuiteResellerId))

                    fun netsuiteResellerId(netsuiteResellerId: JsonField<String>) = apply {
                        this.netsuiteResellerId = netsuiteResellerId
                    }

                    fun resellerContractValue(resellerContractValue: Double) =
                        resellerContractValue(JsonField.of(resellerContractValue))

                    fun resellerContractValue(resellerContractValue: JsonField<Double>) = apply {
                        this.resellerContractValue = resellerContractValue
                    }

                    fun startingAt(startingAt: OffsetDateTime) =
                        startingAt(JsonField.of(startingAt))

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

                    fun build(): ResellerRoyalty =
                        ResellerRoyalty(
                            checkNotNull(resellerType) {
                                "`resellerType` is required but was not set"
                            },
                            awsAccountNumber,
                            awsOfferId,
                            awsPayerReferenceId,
                            endingBefore,
                            fraction,
                            gcpAccountId,
                            gcpOfferId,
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

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

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

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is ResellerType && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ResellerRoyalty && resellerType == other.resellerType && awsAccountNumber == other.awsAccountNumber && awsOfferId == other.awsOfferId && awsPayerReferenceId == other.awsPayerReferenceId && endingBefore == other.endingBefore && fraction == other.fraction && gcpAccountId == other.gcpAccountId && gcpOfferId == other.gcpOfferId && netsuiteResellerId == other.netsuiteResellerId && resellerContractValue == other.resellerContractValue && startingAt == other.startingAt && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(resellerType, awsAccountNumber, awsOfferId, awsPayerReferenceId, endingBefore, fraction, gcpAccountId, gcpOfferId, netsuiteResellerId, resellerContractValue, startingAt, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "ResellerRoyalty{resellerType=$resellerType, awsAccountNumber=$awsAccountNumber, awsOfferId=$awsOfferId, awsPayerReferenceId=$awsPayerReferenceId, endingBefore=$endingBefore, fraction=$fraction, gcpAccountId=$gcpAccountId, gcpOfferId=$gcpOfferId, netsuiteResellerId=$netsuiteResellerId, resellerContractValue=$resellerContractValue, startingAt=$startingAt, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Amendment && id == other.id && commits == other.commits && createdAt == other.createdAt && createdBy == other.createdBy && overrides == other.overrides && scheduledCharges == other.scheduledCharges && startingAt == other.startingAt && credits == other.credits && discounts == other.discounts && netsuiteSalesOrderId == other.netsuiteSalesOrderId && professionalServices == other.professionalServices && resellerRoyalties == other.resellerRoyalties && salesforceOpportunityId == other.salesforceOpportunityId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, commits, createdAt, createdBy, overrides, scheduledCharges, startingAt, credits, discounts, netsuiteSalesOrderId, professionalServices, resellerRoyalties, salesforceOpportunityId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Amendment{id=$id, commits=$commits, createdAt=$createdAt, createdBy=$createdBy, overrides=$overrides, scheduledCharges=$scheduledCharges, startingAt=$startingAt, credits=$credits, discounts=$discounts, netsuiteSalesOrderId=$netsuiteSalesOrderId, professionalServices=$professionalServices, resellerRoyalties=$resellerRoyalties, salesforceOpportunityId=$salesforceOpportunityId, additionalProperties=$additionalProperties}"
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

            private var validated: Boolean = false

            fun validate(): CustomFields = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

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

        /** The billing provider configuration associated with a contract. */
        @NoAutoDetect
        class CustomerBillingProviderConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("billing_provider")
            @ExcludeMissing
            private val billingProvider: JsonField<BillingProvider> = JsonMissing.of(),
            @JsonProperty("delivery_method")
            @ExcludeMissing
            private val deliveryMethod: JsonField<DeliveryMethod> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun billingProvider(): BillingProvider = billingProvider.getRequired("billing_provider")

            fun deliveryMethod(): DeliveryMethod = deliveryMethod.getRequired("delivery_method")

            @JsonProperty("billing_provider")
            @ExcludeMissing
            fun _billingProvider(): JsonField<BillingProvider> = billingProvider

            @JsonProperty("delivery_method")
            @ExcludeMissing
            fun _deliveryMethod(): JsonField<DeliveryMethod> = deliveryMethod

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CustomerBillingProviderConfiguration = apply {
                if (validated) {
                    return@apply
                }

                billingProvider()
                deliveryMethod()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var billingProvider: JsonField<BillingProvider>? = null
                private var deliveryMethod: JsonField<DeliveryMethod>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    customerBillingProviderConfiguration: CustomerBillingProviderConfiguration
                ) = apply {
                    billingProvider = customerBillingProviderConfiguration.billingProvider
                    deliveryMethod = customerBillingProviderConfiguration.deliveryMethod
                    additionalProperties =
                        customerBillingProviderConfiguration.additionalProperties.toMutableMap()
                }

                fun billingProvider(billingProvider: BillingProvider) =
                    billingProvider(JsonField.of(billingProvider))

                fun billingProvider(billingProvider: JsonField<BillingProvider>) = apply {
                    this.billingProvider = billingProvider
                }

                fun deliveryMethod(deliveryMethod: DeliveryMethod) =
                    deliveryMethod(JsonField.of(deliveryMethod))

                fun deliveryMethod(deliveryMethod: JsonField<DeliveryMethod>) = apply {
                    this.deliveryMethod = deliveryMethod
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

                fun build(): CustomerBillingProviderConfiguration =
                    CustomerBillingProviderConfiguration(
                        checkNotNull(billingProvider) {
                            "`billingProvider` is required but was not set"
                        },
                        checkNotNull(deliveryMethod) {
                            "`deliveryMethod` is required but was not set"
                        },
                        additionalProperties.toImmutable(),
                    )
            }

            class BillingProvider
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is BillingProvider && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class DeliveryMethod
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DeliveryMethod && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
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

            return /* spotless:off */ other is Data && id == other.id && amendments == other.amendments && current == other.current && customerId == other.customerId && initial == other.initial && archivedAt == other.archivedAt && customFields == other.customFields && customerBillingProviderConfiguration == other.customerBillingProviderConfiguration && uniquenessKey == other.uniquenessKey && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, amendments, current, customerId, initial, archivedAt, customFields, customerBillingProviderConfiguration, uniquenessKey, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, amendments=$amendments, current=$current, customerId=$customerId, initial=$initial, archivedAt=$archivedAt, customFields=$customFields, customerBillingProviderConfiguration=$customerBillingProviderConfiguration, uniquenessKey=$uniquenessKey, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractRetrieveResponse && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ContractRetrieveResponse{data=$data, additionalProperties=$additionalProperties}"
}
