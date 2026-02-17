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
import com.metronome.api.core.checkRequired
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class V2ContractGetEditHistoryResponse
@JsonCreator
private constructor(
    @JsonProperty("data")
    @ExcludeMissing
    private val data: JsonField<List<Data>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun data(): List<Data> = data.getRequired("data")

    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<List<Data>> = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): V2ContractGetEditHistoryResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V2ContractGetEditHistoryResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<Data>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(v2ContractGetEditHistoryResponse: V2ContractGetEditHistoryResponse) =
            apply {
                data = v2ContractGetEditHistoryResponse.data.map { it.toMutableList() }
                additionalProperties =
                    v2ContractGetEditHistoryResponse.additionalProperties.toMutableMap()
            }

        fun data(data: List<Data>) = data(JsonField.of(data))

        fun data(data: JsonField<List<Data>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        fun addData(data: Data) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(data)
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

        fun build(): V2ContractGetEditHistoryResponse =
            V2ContractGetEditHistoryResponse(
                checkRequired("data", data).map { it.toImmutable() },
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Data
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("add_commits")
        @ExcludeMissing
        private val addCommits: JsonField<List<AddCommit>> = JsonMissing.of(),
        @JsonProperty("add_credits")
        @ExcludeMissing
        private val addCredits: JsonField<List<AddCredit>> = JsonMissing.of(),
        @JsonProperty("add_discounts")
        @ExcludeMissing
        private val addDiscounts: JsonField<List<Discount>> = JsonMissing.of(),
        @JsonProperty("add_overrides")
        @ExcludeMissing
        private val addOverrides: JsonField<List<AddOverride>> = JsonMissing.of(),
        @JsonProperty("add_prepaid_balance_threshold_configuration")
        @ExcludeMissing
        private val addPrepaidBalanceThresholdConfiguration:
            JsonField<PrepaidBalanceThresholdConfigurationV2> =
            JsonMissing.of(),
        @JsonProperty("add_pro_services")
        @ExcludeMissing
        private val addProServices: JsonField<List<ProService>> = JsonMissing.of(),
        @JsonProperty("add_recurring_commits")
        @ExcludeMissing
        private val addRecurringCommits: JsonField<List<AddRecurringCommit>> = JsonMissing.of(),
        @JsonProperty("add_recurring_credits")
        @ExcludeMissing
        private val addRecurringCredits: JsonField<List<AddRecurringCredit>> = JsonMissing.of(),
        @JsonProperty("add_reseller_royalties")
        @ExcludeMissing
        private val addResellerRoyalties: JsonField<List<AddResellerRoyalty>> = JsonMissing.of(),
        @JsonProperty("add_scheduled_charges")
        @ExcludeMissing
        private val addScheduledCharges: JsonField<List<AddScheduledCharge>> = JsonMissing.of(),
        @JsonProperty("add_spend_threshold_configuration")
        @ExcludeMissing
        private val addSpendThresholdConfiguration: JsonField<SpendThresholdConfigurationV2> =
            JsonMissing.of(),
        @JsonProperty("add_subscriptions")
        @ExcludeMissing
        private val addSubscriptions: JsonField<List<Subscription>> = JsonMissing.of(),
        @JsonProperty("add_usage_filters")
        @ExcludeMissing
        private val addUsageFilters: JsonField<List<AddUsageFilter>> = JsonMissing.of(),
        @JsonProperty("archive_commits")
        @ExcludeMissing
        private val archiveCommits: JsonField<List<ArchiveCommit>> = JsonMissing.of(),
        @JsonProperty("archive_credits")
        @ExcludeMissing
        private val archiveCredits: JsonField<List<ArchiveCredit>> = JsonMissing.of(),
        @JsonProperty("archive_scheduled_charges")
        @ExcludeMissing
        private val archiveScheduledCharges: JsonField<List<ArchiveScheduledCharge>> =
            JsonMissing.of(),
        @JsonProperty("remove_overrides")
        @ExcludeMissing
        private val removeOverrides: JsonField<List<RemoveOverride>> = JsonMissing.of(),
        @JsonProperty("timestamp")
        @ExcludeMissing
        private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("uniqueness_key")
        @ExcludeMissing
        private val uniquenessKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("update_commits")
        @ExcludeMissing
        private val updateCommits: JsonField<List<UpdateCommit>> = JsonMissing.of(),
        @JsonProperty("update_contract_end_date")
        @ExcludeMissing
        private val updateContractEndDate: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("update_contract_name")
        @ExcludeMissing
        private val updateContractName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("update_credits")
        @ExcludeMissing
        private val updateCredits: JsonField<List<UpdateCredit>> = JsonMissing.of(),
        @JsonProperty("update_discounts")
        @ExcludeMissing
        private val updateDiscounts: JsonField<List<UpdateDiscount>> = JsonMissing.of(),
        @JsonProperty("update_prepaid_balance_threshold_configuration")
        @ExcludeMissing
        private val updatePrepaidBalanceThresholdConfiguration:
            JsonField<UpdatePrepaidBalanceThresholdConfiguration> =
            JsonMissing.of(),
        @JsonProperty("update_recurring_commits")
        @ExcludeMissing
        private val updateRecurringCommits: JsonField<List<UpdateRecurringCommit>> =
            JsonMissing.of(),
        @JsonProperty("update_recurring_credits")
        @ExcludeMissing
        private val updateRecurringCredits: JsonField<List<UpdateRecurringCredit>> =
            JsonMissing.of(),
        @JsonProperty("update_refund_invoices")
        @ExcludeMissing
        private val updateRefundInvoices: JsonField<List<UpdateRefundInvoice>> = JsonMissing.of(),
        @JsonProperty("update_scheduled_charges")
        @ExcludeMissing
        private val updateScheduledCharges: JsonField<List<UpdateScheduledCharge>> =
            JsonMissing.of(),
        @JsonProperty("update_spend_threshold_configuration")
        @ExcludeMissing
        private val updateSpendThresholdConfiguration:
            JsonField<UpdateSpendThresholdConfiguration> =
            JsonMissing.of(),
        @JsonProperty("update_subscriptions")
        @ExcludeMissing
        private val updateSubscriptions: JsonField<List<UpdateSubscription>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun addCommits(): Optional<List<AddCommit>> =
            Optional.ofNullable(addCommits.getNullable("add_commits"))

        fun addCredits(): Optional<List<AddCredit>> =
            Optional.ofNullable(addCredits.getNullable("add_credits"))

        fun addDiscounts(): Optional<List<Discount>> =
            Optional.ofNullable(addDiscounts.getNullable("add_discounts"))

        fun addOverrides(): Optional<List<AddOverride>> =
            Optional.ofNullable(addOverrides.getNullable("add_overrides"))

        fun addPrepaidBalanceThresholdConfiguration():
            Optional<PrepaidBalanceThresholdConfigurationV2> =
            Optional.ofNullable(
                addPrepaidBalanceThresholdConfiguration.getNullable(
                    "add_prepaid_balance_threshold_configuration"
                )
            )

        fun addProServices(): Optional<List<ProService>> =
            Optional.ofNullable(addProServices.getNullable("add_pro_services"))

        fun addRecurringCommits(): Optional<List<AddRecurringCommit>> =
            Optional.ofNullable(addRecurringCommits.getNullable("add_recurring_commits"))

        fun addRecurringCredits(): Optional<List<AddRecurringCredit>> =
            Optional.ofNullable(addRecurringCredits.getNullable("add_recurring_credits"))

        fun addResellerRoyalties(): Optional<List<AddResellerRoyalty>> =
            Optional.ofNullable(addResellerRoyalties.getNullable("add_reseller_royalties"))

        fun addScheduledCharges(): Optional<List<AddScheduledCharge>> =
            Optional.ofNullable(addScheduledCharges.getNullable("add_scheduled_charges"))

        fun addSpendThresholdConfiguration(): Optional<SpendThresholdConfigurationV2> =
            Optional.ofNullable(
                addSpendThresholdConfiguration.getNullable("add_spend_threshold_configuration")
            )

        /** List of subscriptions on the contract. */
        fun addSubscriptions(): Optional<List<Subscription>> =
            Optional.ofNullable(addSubscriptions.getNullable("add_subscriptions"))

        fun addUsageFilters(): Optional<List<AddUsageFilter>> =
            Optional.ofNullable(addUsageFilters.getNullable("add_usage_filters"))

        fun archiveCommits(): Optional<List<ArchiveCommit>> =
            Optional.ofNullable(archiveCommits.getNullable("archive_commits"))

        fun archiveCredits(): Optional<List<ArchiveCredit>> =
            Optional.ofNullable(archiveCredits.getNullable("archive_credits"))

        fun archiveScheduledCharges(): Optional<List<ArchiveScheduledCharge>> =
            Optional.ofNullable(archiveScheduledCharges.getNullable("archive_scheduled_charges"))

        fun removeOverrides(): Optional<List<RemoveOverride>> =
            Optional.ofNullable(removeOverrides.getNullable("remove_overrides"))

        fun timestamp(): Optional<OffsetDateTime> =
            Optional.ofNullable(timestamp.getNullable("timestamp"))

        /**
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
         */
        fun uniquenessKey(): Optional<String> =
            Optional.ofNullable(uniquenessKey.getNullable("uniqueness_key"))

        fun updateCommits(): Optional<List<UpdateCommit>> =
            Optional.ofNullable(updateCommits.getNullable("update_commits"))

        fun updateContractEndDate(): Optional<OffsetDateTime> =
            Optional.ofNullable(updateContractEndDate.getNullable("update_contract_end_date"))

        /**
         * Value to update the contract name to. If not provided, the contract name will remain
         * unchanged.
         */
        fun updateContractName(): Optional<String> =
            Optional.ofNullable(updateContractName.getNullable("update_contract_name"))

        fun updateCredits(): Optional<List<UpdateCredit>> =
            Optional.ofNullable(updateCredits.getNullable("update_credits"))

        fun updateDiscounts(): Optional<List<UpdateDiscount>> =
            Optional.ofNullable(updateDiscounts.getNullable("update_discounts"))

        fun updatePrepaidBalanceThresholdConfiguration():
            Optional<UpdatePrepaidBalanceThresholdConfiguration> =
            Optional.ofNullable(
                updatePrepaidBalanceThresholdConfiguration.getNullable(
                    "update_prepaid_balance_threshold_configuration"
                )
            )

        fun updateRecurringCommits(): Optional<List<UpdateRecurringCommit>> =
            Optional.ofNullable(updateRecurringCommits.getNullable("update_recurring_commits"))

        fun updateRecurringCredits(): Optional<List<UpdateRecurringCredit>> =
            Optional.ofNullable(updateRecurringCredits.getNullable("update_recurring_credits"))

        fun updateRefundInvoices(): Optional<List<UpdateRefundInvoice>> =
            Optional.ofNullable(updateRefundInvoices.getNullable("update_refund_invoices"))

        fun updateScheduledCharges(): Optional<List<UpdateScheduledCharge>> =
            Optional.ofNullable(updateScheduledCharges.getNullable("update_scheduled_charges"))

        fun updateSpendThresholdConfiguration(): Optional<UpdateSpendThresholdConfiguration> =
            Optional.ofNullable(
                updateSpendThresholdConfiguration.getNullable(
                    "update_spend_threshold_configuration"
                )
            )

        /** Optional list of subscriptions to update. */
        fun updateSubscriptions(): Optional<List<UpdateSubscription>> =
            Optional.ofNullable(updateSubscriptions.getNullable("update_subscriptions"))

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("add_commits")
        @ExcludeMissing
        fun _addCommits(): JsonField<List<AddCommit>> = addCommits

        @JsonProperty("add_credits")
        @ExcludeMissing
        fun _addCredits(): JsonField<List<AddCredit>> = addCredits

        @JsonProperty("add_discounts")
        @ExcludeMissing
        fun _addDiscounts(): JsonField<List<Discount>> = addDiscounts

        @JsonProperty("add_overrides")
        @ExcludeMissing
        fun _addOverrides(): JsonField<List<AddOverride>> = addOverrides

        @JsonProperty("add_prepaid_balance_threshold_configuration")
        @ExcludeMissing
        fun _addPrepaidBalanceThresholdConfiguration():
            JsonField<PrepaidBalanceThresholdConfigurationV2> =
            addPrepaidBalanceThresholdConfiguration

        @JsonProperty("add_pro_services")
        @ExcludeMissing
        fun _addProServices(): JsonField<List<ProService>> = addProServices

        @JsonProperty("add_recurring_commits")
        @ExcludeMissing
        fun _addRecurringCommits(): JsonField<List<AddRecurringCommit>> = addRecurringCommits

        @JsonProperty("add_recurring_credits")
        @ExcludeMissing
        fun _addRecurringCredits(): JsonField<List<AddRecurringCredit>> = addRecurringCredits

        @JsonProperty("add_reseller_royalties")
        @ExcludeMissing
        fun _addResellerRoyalties(): JsonField<List<AddResellerRoyalty>> = addResellerRoyalties

        @JsonProperty("add_scheduled_charges")
        @ExcludeMissing
        fun _addScheduledCharges(): JsonField<List<AddScheduledCharge>> = addScheduledCharges

        @JsonProperty("add_spend_threshold_configuration")
        @ExcludeMissing
        fun _addSpendThresholdConfiguration(): JsonField<SpendThresholdConfigurationV2> =
            addSpendThresholdConfiguration

        /** List of subscriptions on the contract. */
        @JsonProperty("add_subscriptions")
        @ExcludeMissing
        fun _addSubscriptions(): JsonField<List<Subscription>> = addSubscriptions

        @JsonProperty("add_usage_filters")
        @ExcludeMissing
        fun _addUsageFilters(): JsonField<List<AddUsageFilter>> = addUsageFilters

        @JsonProperty("archive_commits")
        @ExcludeMissing
        fun _archiveCommits(): JsonField<List<ArchiveCommit>> = archiveCommits

        @JsonProperty("archive_credits")
        @ExcludeMissing
        fun _archiveCredits(): JsonField<List<ArchiveCredit>> = archiveCredits

        @JsonProperty("archive_scheduled_charges")
        @ExcludeMissing
        fun _archiveScheduledCharges(): JsonField<List<ArchiveScheduledCharge>> =
            archiveScheduledCharges

        @JsonProperty("remove_overrides")
        @ExcludeMissing
        fun _removeOverrides(): JsonField<List<RemoveOverride>> = removeOverrides

        @JsonProperty("timestamp")
        @ExcludeMissing
        fun _timestamp(): JsonField<OffsetDateTime> = timestamp

        /**
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
         */
        @JsonProperty("uniqueness_key")
        @ExcludeMissing
        fun _uniquenessKey(): JsonField<String> = uniquenessKey

        @JsonProperty("update_commits")
        @ExcludeMissing
        fun _updateCommits(): JsonField<List<UpdateCommit>> = updateCommits

        @JsonProperty("update_contract_end_date")
        @ExcludeMissing
        fun _updateContractEndDate(): JsonField<OffsetDateTime> = updateContractEndDate

        /**
         * Value to update the contract name to. If not provided, the contract name will remain
         * unchanged.
         */
        @JsonProperty("update_contract_name")
        @ExcludeMissing
        fun _updateContractName(): JsonField<String> = updateContractName

        @JsonProperty("update_credits")
        @ExcludeMissing
        fun _updateCredits(): JsonField<List<UpdateCredit>> = updateCredits

        @JsonProperty("update_discounts")
        @ExcludeMissing
        fun _updateDiscounts(): JsonField<List<UpdateDiscount>> = updateDiscounts

        @JsonProperty("update_prepaid_balance_threshold_configuration")
        @ExcludeMissing
        fun _updatePrepaidBalanceThresholdConfiguration():
            JsonField<UpdatePrepaidBalanceThresholdConfiguration> =
            updatePrepaidBalanceThresholdConfiguration

        @JsonProperty("update_recurring_commits")
        @ExcludeMissing
        fun _updateRecurringCommits(): JsonField<List<UpdateRecurringCommit>> =
            updateRecurringCommits

        @JsonProperty("update_recurring_credits")
        @ExcludeMissing
        fun _updateRecurringCredits(): JsonField<List<UpdateRecurringCredit>> =
            updateRecurringCredits

        @JsonProperty("update_refund_invoices")
        @ExcludeMissing
        fun _updateRefundInvoices(): JsonField<List<UpdateRefundInvoice>> = updateRefundInvoices

        @JsonProperty("update_scheduled_charges")
        @ExcludeMissing
        fun _updateScheduledCharges(): JsonField<List<UpdateScheduledCharge>> =
            updateScheduledCharges

        @JsonProperty("update_spend_threshold_configuration")
        @ExcludeMissing
        fun _updateSpendThresholdConfiguration(): JsonField<UpdateSpendThresholdConfiguration> =
            updateSpendThresholdConfiguration

        /** Optional list of subscriptions to update. */
        @JsonProperty("update_subscriptions")
        @ExcludeMissing
        fun _updateSubscriptions(): JsonField<List<UpdateSubscription>> = updateSubscriptions

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            addCommits().ifPresent { it.forEach { it.validate() } }
            addCredits().ifPresent { it.forEach { it.validate() } }
            addDiscounts().ifPresent { it.forEach { it.validate() } }
            addOverrides().ifPresent { it.forEach { it.validate() } }
            addPrepaidBalanceThresholdConfiguration().ifPresent { it.validate() }
            addProServices().ifPresent { it.forEach { it.validate() } }
            addRecurringCommits().ifPresent { it.forEach { it.validate() } }
            addRecurringCredits().ifPresent { it.forEach { it.validate() } }
            addResellerRoyalties().ifPresent { it.forEach { it.validate() } }
            addScheduledCharges().ifPresent { it.forEach { it.validate() } }
            addSpendThresholdConfiguration().ifPresent { it.validate() }
            addSubscriptions().ifPresent { it.forEach { it.validate() } }
            addUsageFilters().ifPresent { it.forEach { it.validate() } }
            archiveCommits().ifPresent { it.forEach { it.validate() } }
            archiveCredits().ifPresent { it.forEach { it.validate() } }
            archiveScheduledCharges().ifPresent { it.forEach { it.validate() } }
            removeOverrides().ifPresent { it.forEach { it.validate() } }
            timestamp()
            uniquenessKey()
            updateCommits().ifPresent { it.forEach { it.validate() } }
            updateContractEndDate()
            updateContractName()
            updateCredits().ifPresent { it.forEach { it.validate() } }
            updateDiscounts().ifPresent { it.forEach { it.validate() } }
            updatePrepaidBalanceThresholdConfiguration().ifPresent { it.validate() }
            updateRecurringCommits().ifPresent { it.forEach { it.validate() } }
            updateRecurringCredits().ifPresent { it.forEach { it.validate() } }
            updateRefundInvoices().ifPresent { it.forEach { it.validate() } }
            updateScheduledCharges().ifPresent { it.forEach { it.validate() } }
            updateSpendThresholdConfiguration().ifPresent { it.validate() }
            updateSubscriptions().ifPresent { it.forEach { it.validate() } }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var addCommits: JsonField<MutableList<AddCommit>>? = null
            private var addCredits: JsonField<MutableList<AddCredit>>? = null
            private var addDiscounts: JsonField<MutableList<Discount>>? = null
            private var addOverrides: JsonField<MutableList<AddOverride>>? = null
            private var addPrepaidBalanceThresholdConfiguration:
                JsonField<PrepaidBalanceThresholdConfigurationV2> =
                JsonMissing.of()
            private var addProServices: JsonField<MutableList<ProService>>? = null
            private var addRecurringCommits: JsonField<MutableList<AddRecurringCommit>>? = null
            private var addRecurringCredits: JsonField<MutableList<AddRecurringCredit>>? = null
            private var addResellerRoyalties: JsonField<MutableList<AddResellerRoyalty>>? = null
            private var addScheduledCharges: JsonField<MutableList<AddScheduledCharge>>? = null
            private var addSpendThresholdConfiguration: JsonField<SpendThresholdConfigurationV2> =
                JsonMissing.of()
            private var addSubscriptions: JsonField<MutableList<Subscription>>? = null
            private var addUsageFilters: JsonField<MutableList<AddUsageFilter>>? = null
            private var archiveCommits: JsonField<MutableList<ArchiveCommit>>? = null
            private var archiveCredits: JsonField<MutableList<ArchiveCredit>>? = null
            private var archiveScheduledCharges: JsonField<MutableList<ArchiveScheduledCharge>>? =
                null
            private var removeOverrides: JsonField<MutableList<RemoveOverride>>? = null
            private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
            private var uniquenessKey: JsonField<String> = JsonMissing.of()
            private var updateCommits: JsonField<MutableList<UpdateCommit>>? = null
            private var updateContractEndDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var updateContractName: JsonField<String> = JsonMissing.of()
            private var updateCredits: JsonField<MutableList<UpdateCredit>>? = null
            private var updateDiscounts: JsonField<MutableList<UpdateDiscount>>? = null
            private var updatePrepaidBalanceThresholdConfiguration:
                JsonField<UpdatePrepaidBalanceThresholdConfiguration> =
                JsonMissing.of()
            private var updateRecurringCommits: JsonField<MutableList<UpdateRecurringCommit>>? =
                null
            private var updateRecurringCredits: JsonField<MutableList<UpdateRecurringCredit>>? =
                null
            private var updateRefundInvoices: JsonField<MutableList<UpdateRefundInvoice>>? = null
            private var updateScheduledCharges: JsonField<MutableList<UpdateScheduledCharge>>? =
                null
            private var updateSpendThresholdConfiguration:
                JsonField<UpdateSpendThresholdConfiguration> =
                JsonMissing.of()
            private var updateSubscriptions: JsonField<MutableList<UpdateSubscription>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                addCommits = data.addCommits.map { it.toMutableList() }
                addCredits = data.addCredits.map { it.toMutableList() }
                addDiscounts = data.addDiscounts.map { it.toMutableList() }
                addOverrides = data.addOverrides.map { it.toMutableList() }
                addPrepaidBalanceThresholdConfiguration =
                    data.addPrepaidBalanceThresholdConfiguration
                addProServices = data.addProServices.map { it.toMutableList() }
                addRecurringCommits = data.addRecurringCommits.map { it.toMutableList() }
                addRecurringCredits = data.addRecurringCredits.map { it.toMutableList() }
                addResellerRoyalties = data.addResellerRoyalties.map { it.toMutableList() }
                addScheduledCharges = data.addScheduledCharges.map { it.toMutableList() }
                addSpendThresholdConfiguration = data.addSpendThresholdConfiguration
                addSubscriptions = data.addSubscriptions.map { it.toMutableList() }
                addUsageFilters = data.addUsageFilters.map { it.toMutableList() }
                archiveCommits = data.archiveCommits.map { it.toMutableList() }
                archiveCredits = data.archiveCredits.map { it.toMutableList() }
                archiveScheduledCharges = data.archiveScheduledCharges.map { it.toMutableList() }
                removeOverrides = data.removeOverrides.map { it.toMutableList() }
                timestamp = data.timestamp
                uniquenessKey = data.uniquenessKey
                updateCommits = data.updateCommits.map { it.toMutableList() }
                updateContractEndDate = data.updateContractEndDate
                updateContractName = data.updateContractName
                updateCredits = data.updateCredits.map { it.toMutableList() }
                updateDiscounts = data.updateDiscounts.map { it.toMutableList() }
                updatePrepaidBalanceThresholdConfiguration =
                    data.updatePrepaidBalanceThresholdConfiguration
                updateRecurringCommits = data.updateRecurringCommits.map { it.toMutableList() }
                updateRecurringCredits = data.updateRecurringCredits.map { it.toMutableList() }
                updateRefundInvoices = data.updateRefundInvoices.map { it.toMutableList() }
                updateScheduledCharges = data.updateScheduledCharges.map { it.toMutableList() }
                updateSpendThresholdConfiguration = data.updateSpendThresholdConfiguration
                updateSubscriptions = data.updateSubscriptions.map { it.toMutableList() }
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun addCommits(addCommits: List<AddCommit>) = addCommits(JsonField.of(addCommits))

            fun addCommits(addCommits: JsonField<List<AddCommit>>) = apply {
                this.addCommits = addCommits.map { it.toMutableList() }
            }

            fun addAddCommit(addCommit: AddCommit) = apply {
                addCommits =
                    (addCommits ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(addCommit)
                    }
            }

            fun addCredits(addCredits: List<AddCredit>) = addCredits(JsonField.of(addCredits))

            fun addCredits(addCredits: JsonField<List<AddCredit>>) = apply {
                this.addCredits = addCredits.map { it.toMutableList() }
            }

            fun addAddCredit(addCredit: AddCredit) = apply {
                addCredits =
                    (addCredits ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(addCredit)
                    }
            }

            fun addDiscounts(addDiscounts: List<Discount>) =
                addDiscounts(JsonField.of(addDiscounts))

            fun addDiscounts(addDiscounts: JsonField<List<Discount>>) = apply {
                this.addDiscounts = addDiscounts.map { it.toMutableList() }
            }

            fun addAddDiscount(addDiscount: Discount) = apply {
                addDiscounts =
                    (addDiscounts ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(addDiscount)
                    }
            }

            fun addOverrides(addOverrides: List<AddOverride>) =
                addOverrides(JsonField.of(addOverrides))

            fun addOverrides(addOverrides: JsonField<List<AddOverride>>) = apply {
                this.addOverrides = addOverrides.map { it.toMutableList() }
            }

            fun addAddOverride(addOverride: AddOverride) = apply {
                addOverrides =
                    (addOverrides ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(addOverride)
                    }
            }

            fun addPrepaidBalanceThresholdConfiguration(
                addPrepaidBalanceThresholdConfiguration: PrepaidBalanceThresholdConfigurationV2
            ) =
                addPrepaidBalanceThresholdConfiguration(
                    JsonField.of(addPrepaidBalanceThresholdConfiguration)
                )

            fun addPrepaidBalanceThresholdConfiguration(
                addPrepaidBalanceThresholdConfiguration:
                    JsonField<PrepaidBalanceThresholdConfigurationV2>
            ) = apply {
                this.addPrepaidBalanceThresholdConfiguration =
                    addPrepaidBalanceThresholdConfiguration
            }

            fun addProServices(addProServices: List<ProService>) =
                addProServices(JsonField.of(addProServices))

            fun addProServices(addProServices: JsonField<List<ProService>>) = apply {
                this.addProServices = addProServices.map { it.toMutableList() }
            }

            fun addAddProService(addProService: ProService) = apply {
                addProServices =
                    (addProServices ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(addProService)
                    }
            }

            fun addRecurringCommits(addRecurringCommits: List<AddRecurringCommit>) =
                addRecurringCommits(JsonField.of(addRecurringCommits))

            fun addRecurringCommits(addRecurringCommits: JsonField<List<AddRecurringCommit>>) =
                apply {
                    this.addRecurringCommits = addRecurringCommits.map { it.toMutableList() }
                }

            fun addAddRecurringCommit(addRecurringCommit: AddRecurringCommit) = apply {
                addRecurringCommits =
                    (addRecurringCommits ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(addRecurringCommit)
                    }
            }

            fun addRecurringCredits(addRecurringCredits: List<AddRecurringCredit>) =
                addRecurringCredits(JsonField.of(addRecurringCredits))

            fun addRecurringCredits(addRecurringCredits: JsonField<List<AddRecurringCredit>>) =
                apply {
                    this.addRecurringCredits = addRecurringCredits.map { it.toMutableList() }
                }

            fun addAddRecurringCredit(addRecurringCredit: AddRecurringCredit) = apply {
                addRecurringCredits =
                    (addRecurringCredits ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(addRecurringCredit)
                    }
            }

            fun addResellerRoyalties(addResellerRoyalties: List<AddResellerRoyalty>) =
                addResellerRoyalties(JsonField.of(addResellerRoyalties))

            fun addResellerRoyalties(addResellerRoyalties: JsonField<List<AddResellerRoyalty>>) =
                apply {
                    this.addResellerRoyalties = addResellerRoyalties.map { it.toMutableList() }
                }

            fun addAddResellerRoyalty(addResellerRoyalty: AddResellerRoyalty) = apply {
                addResellerRoyalties =
                    (addResellerRoyalties ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(addResellerRoyalty)
                    }
            }

            fun addScheduledCharges(addScheduledCharges: List<AddScheduledCharge>) =
                addScheduledCharges(JsonField.of(addScheduledCharges))

            fun addScheduledCharges(addScheduledCharges: JsonField<List<AddScheduledCharge>>) =
                apply {
                    this.addScheduledCharges = addScheduledCharges.map { it.toMutableList() }
                }

            fun addAddScheduledCharge(addScheduledCharge: AddScheduledCharge) = apply {
                addScheduledCharges =
                    (addScheduledCharges ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(addScheduledCharge)
                    }
            }

            fun addSpendThresholdConfiguration(
                addSpendThresholdConfiguration: SpendThresholdConfigurationV2
            ) = addSpendThresholdConfiguration(JsonField.of(addSpendThresholdConfiguration))

            fun addSpendThresholdConfiguration(
                addSpendThresholdConfiguration: JsonField<SpendThresholdConfigurationV2>
            ) = apply { this.addSpendThresholdConfiguration = addSpendThresholdConfiguration }

            /** List of subscriptions on the contract. */
            fun addSubscriptions(addSubscriptions: List<Subscription>) =
                addSubscriptions(JsonField.of(addSubscriptions))

            /** List of subscriptions on the contract. */
            fun addSubscriptions(addSubscriptions: JsonField<List<Subscription>>) = apply {
                this.addSubscriptions = addSubscriptions.map { it.toMutableList() }
            }

            /** List of subscriptions on the contract. */
            fun addAddSubscription(addSubscription: Subscription) = apply {
                addSubscriptions =
                    (addSubscriptions ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(addSubscription)
                    }
            }

            fun addUsageFilters(addUsageFilters: List<AddUsageFilter>) =
                addUsageFilters(JsonField.of(addUsageFilters))

            fun addUsageFilters(addUsageFilters: JsonField<List<AddUsageFilter>>) = apply {
                this.addUsageFilters = addUsageFilters.map { it.toMutableList() }
            }

            fun addAddUsageFilter(addUsageFilter: AddUsageFilter) = apply {
                addUsageFilters =
                    (addUsageFilters ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(addUsageFilter)
                    }
            }

            fun archiveCommits(archiveCommits: List<ArchiveCommit>) =
                archiveCommits(JsonField.of(archiveCommits))

            fun archiveCommits(archiveCommits: JsonField<List<ArchiveCommit>>) = apply {
                this.archiveCommits = archiveCommits.map { it.toMutableList() }
            }

            fun addArchiveCommit(archiveCommit: ArchiveCommit) = apply {
                archiveCommits =
                    (archiveCommits ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(archiveCommit)
                    }
            }

            fun archiveCredits(archiveCredits: List<ArchiveCredit>) =
                archiveCredits(JsonField.of(archiveCredits))

            fun archiveCredits(archiveCredits: JsonField<List<ArchiveCredit>>) = apply {
                this.archiveCredits = archiveCredits.map { it.toMutableList() }
            }

            fun addArchiveCredit(archiveCredit: ArchiveCredit) = apply {
                archiveCredits =
                    (archiveCredits ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(archiveCredit)
                    }
            }

            fun archiveScheduledCharges(archiveScheduledCharges: List<ArchiveScheduledCharge>) =
                archiveScheduledCharges(JsonField.of(archiveScheduledCharges))

            fun archiveScheduledCharges(
                archiveScheduledCharges: JsonField<List<ArchiveScheduledCharge>>
            ) = apply {
                this.archiveScheduledCharges = archiveScheduledCharges.map { it.toMutableList() }
            }

            fun addArchiveScheduledCharge(archiveScheduledCharge: ArchiveScheduledCharge) = apply {
                archiveScheduledCharges =
                    (archiveScheduledCharges ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(archiveScheduledCharge)
                    }
            }

            fun removeOverrides(removeOverrides: List<RemoveOverride>) =
                removeOverrides(JsonField.of(removeOverrides))

            fun removeOverrides(removeOverrides: JsonField<List<RemoveOverride>>) = apply {
                this.removeOverrides = removeOverrides.map { it.toMutableList() }
            }

            fun addRemoveOverride(removeOverride: RemoveOverride) = apply {
                removeOverrides =
                    (removeOverrides ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(removeOverride)
                    }
            }

            fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

            fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                this.timestamp = timestamp
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

            fun updateCommits(updateCommits: List<UpdateCommit>) =
                updateCommits(JsonField.of(updateCommits))

            fun updateCommits(updateCommits: JsonField<List<UpdateCommit>>) = apply {
                this.updateCommits = updateCommits.map { it.toMutableList() }
            }

            fun addUpdateCommit(updateCommit: UpdateCommit) = apply {
                updateCommits =
                    (updateCommits ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(updateCommit)
                    }
            }

            fun updateContractEndDate(updateContractEndDate: OffsetDateTime) =
                updateContractEndDate(JsonField.of(updateContractEndDate))

            fun updateContractEndDate(updateContractEndDate: JsonField<OffsetDateTime>) = apply {
                this.updateContractEndDate = updateContractEndDate
            }

            /**
             * Value to update the contract name to. If not provided, the contract name will remain
             * unchanged.
             */
            fun updateContractName(updateContractName: String?) =
                updateContractName(JsonField.ofNullable(updateContractName))

            /**
             * Value to update the contract name to. If not provided, the contract name will remain
             * unchanged.
             */
            fun updateContractName(updateContractName: Optional<String>) =
                updateContractName(updateContractName.orElse(null))

            /**
             * Value to update the contract name to. If not provided, the contract name will remain
             * unchanged.
             */
            fun updateContractName(updateContractName: JsonField<String>) = apply {
                this.updateContractName = updateContractName
            }

            fun updateCredits(updateCredits: List<UpdateCredit>) =
                updateCredits(JsonField.of(updateCredits))

            fun updateCredits(updateCredits: JsonField<List<UpdateCredit>>) = apply {
                this.updateCredits = updateCredits.map { it.toMutableList() }
            }

            fun addUpdateCredit(updateCredit: UpdateCredit) = apply {
                updateCredits =
                    (updateCredits ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(updateCredit)
                    }
            }

            fun updateDiscounts(updateDiscounts: List<UpdateDiscount>) =
                updateDiscounts(JsonField.of(updateDiscounts))

            fun updateDiscounts(updateDiscounts: JsonField<List<UpdateDiscount>>) = apply {
                this.updateDiscounts = updateDiscounts.map { it.toMutableList() }
            }

            fun addUpdateDiscount(updateDiscount: UpdateDiscount) = apply {
                updateDiscounts =
                    (updateDiscounts ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(updateDiscount)
                    }
            }

            fun updatePrepaidBalanceThresholdConfiguration(
                updatePrepaidBalanceThresholdConfiguration:
                    UpdatePrepaidBalanceThresholdConfiguration
            ) =
                updatePrepaidBalanceThresholdConfiguration(
                    JsonField.of(updatePrepaidBalanceThresholdConfiguration)
                )

            fun updatePrepaidBalanceThresholdConfiguration(
                updatePrepaidBalanceThresholdConfiguration:
                    JsonField<UpdatePrepaidBalanceThresholdConfiguration>
            ) = apply {
                this.updatePrepaidBalanceThresholdConfiguration =
                    updatePrepaidBalanceThresholdConfiguration
            }

            fun updateRecurringCommits(updateRecurringCommits: List<UpdateRecurringCommit>) =
                updateRecurringCommits(JsonField.of(updateRecurringCommits))

            fun updateRecurringCommits(
                updateRecurringCommits: JsonField<List<UpdateRecurringCommit>>
            ) = apply {
                this.updateRecurringCommits = updateRecurringCommits.map { it.toMutableList() }
            }

            fun addUpdateRecurringCommit(updateRecurringCommit: UpdateRecurringCommit) = apply {
                updateRecurringCommits =
                    (updateRecurringCommits ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(updateRecurringCommit)
                    }
            }

            fun updateRecurringCredits(updateRecurringCredits: List<UpdateRecurringCredit>) =
                updateRecurringCredits(JsonField.of(updateRecurringCredits))

            fun updateRecurringCredits(
                updateRecurringCredits: JsonField<List<UpdateRecurringCredit>>
            ) = apply {
                this.updateRecurringCredits = updateRecurringCredits.map { it.toMutableList() }
            }

            fun addUpdateRecurringCredit(updateRecurringCredit: UpdateRecurringCredit) = apply {
                updateRecurringCredits =
                    (updateRecurringCredits ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(updateRecurringCredit)
                    }
            }

            fun updateRefundInvoices(updateRefundInvoices: List<UpdateRefundInvoice>) =
                updateRefundInvoices(JsonField.of(updateRefundInvoices))

            fun updateRefundInvoices(updateRefundInvoices: JsonField<List<UpdateRefundInvoice>>) =
                apply {
                    this.updateRefundInvoices = updateRefundInvoices.map { it.toMutableList() }
                }

            fun addUpdateRefundInvoice(updateRefundInvoice: UpdateRefundInvoice) = apply {
                updateRefundInvoices =
                    (updateRefundInvoices ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(updateRefundInvoice)
                    }
            }

            fun updateScheduledCharges(updateScheduledCharges: List<UpdateScheduledCharge>) =
                updateScheduledCharges(JsonField.of(updateScheduledCharges))

            fun updateScheduledCharges(
                updateScheduledCharges: JsonField<List<UpdateScheduledCharge>>
            ) = apply {
                this.updateScheduledCharges = updateScheduledCharges.map { it.toMutableList() }
            }

            fun addUpdateScheduledCharge(updateScheduledCharge: UpdateScheduledCharge) = apply {
                updateScheduledCharges =
                    (updateScheduledCharges ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(updateScheduledCharge)
                    }
            }

            fun updateSpendThresholdConfiguration(
                updateSpendThresholdConfiguration: UpdateSpendThresholdConfiguration
            ) = updateSpendThresholdConfiguration(JsonField.of(updateSpendThresholdConfiguration))

            fun updateSpendThresholdConfiguration(
                updateSpendThresholdConfiguration: JsonField<UpdateSpendThresholdConfiguration>
            ) = apply { this.updateSpendThresholdConfiguration = updateSpendThresholdConfiguration }

            /** Optional list of subscriptions to update. */
            fun updateSubscriptions(updateSubscriptions: List<UpdateSubscription>) =
                updateSubscriptions(JsonField.of(updateSubscriptions))

            /** Optional list of subscriptions to update. */
            fun updateSubscriptions(updateSubscriptions: JsonField<List<UpdateSubscription>>) =
                apply {
                    this.updateSubscriptions = updateSubscriptions.map { it.toMutableList() }
                }

            /** Optional list of subscriptions to update. */
            fun addUpdateSubscription(updateSubscription: UpdateSubscription) = apply {
                updateSubscriptions =
                    (updateSubscriptions ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(updateSubscription)
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

            fun build(): Data =
                Data(
                    checkRequired("id", id),
                    (addCommits ?: JsonMissing.of()).map { it.toImmutable() },
                    (addCredits ?: JsonMissing.of()).map { it.toImmutable() },
                    (addDiscounts ?: JsonMissing.of()).map { it.toImmutable() },
                    (addOverrides ?: JsonMissing.of()).map { it.toImmutable() },
                    addPrepaidBalanceThresholdConfiguration,
                    (addProServices ?: JsonMissing.of()).map { it.toImmutable() },
                    (addRecurringCommits ?: JsonMissing.of()).map { it.toImmutable() },
                    (addRecurringCredits ?: JsonMissing.of()).map { it.toImmutable() },
                    (addResellerRoyalties ?: JsonMissing.of()).map { it.toImmutable() },
                    (addScheduledCharges ?: JsonMissing.of()).map { it.toImmutable() },
                    addSpendThresholdConfiguration,
                    (addSubscriptions ?: JsonMissing.of()).map { it.toImmutable() },
                    (addUsageFilters ?: JsonMissing.of()).map { it.toImmutable() },
                    (archiveCommits ?: JsonMissing.of()).map { it.toImmutable() },
                    (archiveCredits ?: JsonMissing.of()).map { it.toImmutable() },
                    (archiveScheduledCharges ?: JsonMissing.of()).map { it.toImmutable() },
                    (removeOverrides ?: JsonMissing.of()).map { it.toImmutable() },
                    timestamp,
                    uniquenessKey,
                    (updateCommits ?: JsonMissing.of()).map { it.toImmutable() },
                    updateContractEndDate,
                    updateContractName,
                    (updateCredits ?: JsonMissing.of()).map { it.toImmutable() },
                    (updateDiscounts ?: JsonMissing.of()).map { it.toImmutable() },
                    updatePrepaidBalanceThresholdConfiguration,
                    (updateRecurringCommits ?: JsonMissing.of()).map { it.toImmutable() },
                    (updateRecurringCredits ?: JsonMissing.of()).map { it.toImmutable() },
                    (updateRefundInvoices ?: JsonMissing.of()).map { it.toImmutable() },
                    (updateScheduledCharges ?: JsonMissing.of()).map { it.toImmutable() },
                    updateSpendThresholdConfiguration,
                    (updateSubscriptions ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class AddCommit
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("product")
            @ExcludeMissing
            private val product: JsonField<Product> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("access_schedule")
            @ExcludeMissing
            private val accessSchedule: JsonField<ScheduleDuration> = JsonMissing.of(),
            @JsonProperty("applicable_product_ids")
            @ExcludeMissing
            private val applicableProductIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("applicable_product_tags")
            @ExcludeMissing
            private val applicableProductTags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            private val description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("hierarchy_configuration")
            @ExcludeMissing
            private val hierarchyConfiguration: JsonField<CommitHierarchyConfiguration> =
                JsonMissing.of(),
            @JsonProperty("invoice_schedule")
            @ExcludeMissing
            private val invoiceSchedule: JsonField<InvoiceSchedule> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("netsuite_sales_order_id")
            @ExcludeMissing
            private val netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("priority")
            @ExcludeMissing
            private val priority: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("rate_type")
            @ExcludeMissing
            private val rateType: JsonField<RateType> = JsonMissing.of(),
            @JsonProperty("rollover_fraction")
            @ExcludeMissing
            private val rolloverFraction: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("salesforce_opportunity_id")
            @ExcludeMissing
            private val salesforceOpportunityId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("specifiers")
            @ExcludeMissing
            private val specifiers: JsonField<List<CommitSpecifierInput>> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun product(): Product = product.getRequired("product")

            fun type(): Type = type.getRequired("type")

            /**
             * The schedule that the customer will gain access to the credits purposed with this
             * commit.
             */
            fun accessSchedule(): Optional<ScheduleDuration> =
                Optional.ofNullable(accessSchedule.getNullable("access_schedule"))

            fun applicableProductIds(): Optional<List<String>> =
                Optional.ofNullable(applicableProductIds.getNullable("applicable_product_ids"))

            fun applicableProductTags(): Optional<List<String>> =
                Optional.ofNullable(applicableProductTags.getNullable("applicable_product_tags"))

            fun description(): Optional<String> =
                Optional.ofNullable(description.getNullable("description"))

            /** Optional configuration for commit hierarchy access control */
            fun hierarchyConfiguration(): Optional<CommitHierarchyConfiguration> =
                Optional.ofNullable(hierarchyConfiguration.getNullable("hierarchy_configuration"))

            /** The schedule that the customer will be invoiced for this commit. */
            fun invoiceSchedule(): Optional<InvoiceSchedule> =
                Optional.ofNullable(invoiceSchedule.getNullable("invoice_schedule"))

            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(): Optional<String> =
                Optional.ofNullable(netsuiteSalesOrderId.getNullable("netsuite_sales_order_id"))

            /**
             * If multiple credits or commits are applicable, the one with the lower priority will
             * apply first.
             */
            fun priority(): Optional<Double> = Optional.ofNullable(priority.getNullable("priority"))

            fun rateType(): Optional<RateType> =
                Optional.ofNullable(rateType.getNullable("rate_type"))

            fun rolloverFraction(): Optional<Double> =
                Optional.ofNullable(rolloverFraction.getNullable("rollover_fraction"))

            /** This field's availability is dependent on your client's configuration. */
            fun salesforceOpportunityId(): Optional<String> =
                Optional.ofNullable(
                    salesforceOpportunityId.getNullable("salesforce_opportunity_id")
                )

            /**
             * List of filters that determine what kind of customer usage draws down a commit or
             * credit. A customer's usage needs to meet the condition of at least one of the
             * specifiers to contribute to a commit's or credit's drawdown. This field cannot be
             * used together with `applicable_product_ids` or `applicable_product_tags`. Instead, to
             * target usage by product or product tag, pass those values in the body of
             * `specifiers`.
             */
            fun specifiers(): Optional<List<CommitSpecifierInput>> =
                Optional.ofNullable(specifiers.getNullable("specifiers"))

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonProperty("product") @ExcludeMissing fun _product(): JsonField<Product> = product

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * The schedule that the customer will gain access to the credits purposed with this
             * commit.
             */
            @JsonProperty("access_schedule")
            @ExcludeMissing
            fun _accessSchedule(): JsonField<ScheduleDuration> = accessSchedule

            @JsonProperty("applicable_product_ids")
            @ExcludeMissing
            fun _applicableProductIds(): JsonField<List<String>> = applicableProductIds

            @JsonProperty("applicable_product_tags")
            @ExcludeMissing
            fun _applicableProductTags(): JsonField<List<String>> = applicableProductTags

            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /** Optional configuration for commit hierarchy access control */
            @JsonProperty("hierarchy_configuration")
            @ExcludeMissing
            fun _hierarchyConfiguration(): JsonField<CommitHierarchyConfiguration> =
                hierarchyConfiguration

            /** The schedule that the customer will be invoiced for this commit. */
            @JsonProperty("invoice_schedule")
            @ExcludeMissing
            fun _invoiceSchedule(): JsonField<InvoiceSchedule> = invoiceSchedule

            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /** This field's availability is dependent on your client's configuration. */
            @JsonProperty("netsuite_sales_order_id")
            @ExcludeMissing
            fun _netsuiteSalesOrderId(): JsonField<String> = netsuiteSalesOrderId

            /**
             * If multiple credits or commits are applicable, the one with the lower priority will
             * apply first.
             */
            @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

            @JsonProperty("rate_type")
            @ExcludeMissing
            fun _rateType(): JsonField<RateType> = rateType

            @JsonProperty("rollover_fraction")
            @ExcludeMissing
            fun _rolloverFraction(): JsonField<Double> = rolloverFraction

            /** This field's availability is dependent on your client's configuration. */
            @JsonProperty("salesforce_opportunity_id")
            @ExcludeMissing
            fun _salesforceOpportunityId(): JsonField<String> = salesforceOpportunityId

            /**
             * List of filters that determine what kind of customer usage draws down a commit or
             * credit. A customer's usage needs to meet the condition of at least one of the
             * specifiers to contribute to a commit's or credit's drawdown. This field cannot be
             * used together with `applicable_product_ids` or `applicable_product_tags`. Instead, to
             * target usage by product or product tag, pass those values in the body of
             * `specifiers`.
             */
            @JsonProperty("specifiers")
            @ExcludeMissing
            fun _specifiers(): JsonField<List<CommitSpecifierInput>> = specifiers

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): AddCommit = apply {
                if (validated) {
                    return@apply
                }

                id()
                product().validate()
                type()
                accessSchedule().ifPresent { it.validate() }
                applicableProductIds()
                applicableProductTags()
                description()
                hierarchyConfiguration().ifPresent { it.validate() }
                invoiceSchedule().ifPresent { it.validate() }
                name()
                netsuiteSalesOrderId()
                priority()
                rateType()
                rolloverFraction()
                salesforceOpportunityId()
                specifiers().ifPresent { it.forEach { it.validate() } }
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AddCommit]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var product: JsonField<Product>? = null
                private var type: JsonField<Type>? = null
                private var accessSchedule: JsonField<ScheduleDuration> = JsonMissing.of()
                private var applicableProductIds: JsonField<MutableList<String>>? = null
                private var applicableProductTags: JsonField<MutableList<String>>? = null
                private var description: JsonField<String> = JsonMissing.of()
                private var hierarchyConfiguration: JsonField<CommitHierarchyConfiguration> =
                    JsonMissing.of()
                private var invoiceSchedule: JsonField<InvoiceSchedule> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
                private var priority: JsonField<Double> = JsonMissing.of()
                private var rateType: JsonField<RateType> = JsonMissing.of()
                private var rolloverFraction: JsonField<Double> = JsonMissing.of()
                private var salesforceOpportunityId: JsonField<String> = JsonMissing.of()
                private var specifiers: JsonField<MutableList<CommitSpecifierInput>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(addCommit: AddCommit) = apply {
                    id = addCommit.id
                    product = addCommit.product
                    type = addCommit.type
                    accessSchedule = addCommit.accessSchedule
                    applicableProductIds = addCommit.applicableProductIds.map { it.toMutableList() }
                    applicableProductTags =
                        addCommit.applicableProductTags.map { it.toMutableList() }
                    description = addCommit.description
                    hierarchyConfiguration = addCommit.hierarchyConfiguration
                    invoiceSchedule = addCommit.invoiceSchedule
                    name = addCommit.name
                    netsuiteSalesOrderId = addCommit.netsuiteSalesOrderId
                    priority = addCommit.priority
                    rateType = addCommit.rateType
                    rolloverFraction = addCommit.rolloverFraction
                    salesforceOpportunityId = addCommit.salesforceOpportunityId
                    specifiers = addCommit.specifiers.map { it.toMutableList() }
                    additionalProperties = addCommit.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun product(product: Product) = product(JsonField.of(product))

                fun product(product: JsonField<Product>) = apply { this.product = product }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

                /**
                 * The schedule that the customer will gain access to the credits purposed with this
                 * commit.
                 */
                fun accessSchedule(accessSchedule: ScheduleDuration) =
                    accessSchedule(JsonField.of(accessSchedule))

                /**
                 * The schedule that the customer will gain access to the credits purposed with this
                 * commit.
                 */
                fun accessSchedule(accessSchedule: JsonField<ScheduleDuration>) = apply {
                    this.accessSchedule = accessSchedule
                }

                fun applicableProductIds(applicableProductIds: List<String>) =
                    applicableProductIds(JsonField.of(applicableProductIds))

                fun applicableProductIds(applicableProductIds: JsonField<List<String>>) = apply {
                    this.applicableProductIds = applicableProductIds.map { it.toMutableList() }
                }

                fun addApplicableProductId(applicableProductId: String) = apply {
                    applicableProductIds =
                        (applicableProductIds ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(applicableProductId)
                        }
                }

                fun applicableProductTags(applicableProductTags: List<String>) =
                    applicableProductTags(JsonField.of(applicableProductTags))

                fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
                    this.applicableProductTags = applicableProductTags.map { it.toMutableList() }
                }

                fun addApplicableProductTag(applicableProductTag: String) = apply {
                    applicableProductTags =
                        (applicableProductTags ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(applicableProductTag)
                        }
                }

                fun description(description: String) = description(JsonField.of(description))

                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /** Optional configuration for commit hierarchy access control */
                fun hierarchyConfiguration(hierarchyConfiguration: CommitHierarchyConfiguration) =
                    hierarchyConfiguration(JsonField.of(hierarchyConfiguration))

                /** Optional configuration for commit hierarchy access control */
                fun hierarchyConfiguration(
                    hierarchyConfiguration: JsonField<CommitHierarchyConfiguration>
                ) = apply { this.hierarchyConfiguration = hierarchyConfiguration }

                /** The schedule that the customer will be invoiced for this commit. */
                fun invoiceSchedule(invoiceSchedule: InvoiceSchedule) =
                    invoiceSchedule(JsonField.of(invoiceSchedule))

                /** The schedule that the customer will be invoiced for this commit. */
                fun invoiceSchedule(invoiceSchedule: JsonField<InvoiceSchedule>) = apply {
                    this.invoiceSchedule = invoiceSchedule
                }

                fun name(name: String) = name(JsonField.of(name))

                fun name(name: JsonField<String>) = apply { this.name = name }

                /** This field's availability is dependent on your client's configuration. */
                fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
                    netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

                /** This field's availability is dependent on your client's configuration. */
                fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
                    this.netsuiteSalesOrderId = netsuiteSalesOrderId
                }

                /**
                 * If multiple credits or commits are applicable, the one with the lower priority
                 * will apply first.
                 */
                fun priority(priority: Double) = priority(JsonField.of(priority))

                /**
                 * If multiple credits or commits are applicable, the one with the lower priority
                 * will apply first.
                 */
                fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

                fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

                fun rateType(rateType: JsonField<RateType>) = apply { this.rateType = rateType }

                fun rolloverFraction(rolloverFraction: Double) =
                    rolloverFraction(JsonField.of(rolloverFraction))

                fun rolloverFraction(rolloverFraction: JsonField<Double>) = apply {
                    this.rolloverFraction = rolloverFraction
                }

                /** This field's availability is dependent on your client's configuration. */
                fun salesforceOpportunityId(salesforceOpportunityId: String) =
                    salesforceOpportunityId(JsonField.of(salesforceOpportunityId))

                /** This field's availability is dependent on your client's configuration. */
                fun salesforceOpportunityId(salesforceOpportunityId: JsonField<String>) = apply {
                    this.salesforceOpportunityId = salesforceOpportunityId
                }

                /**
                 * List of filters that determine what kind of customer usage draws down a commit or
                 * credit. A customer's usage needs to meet the condition of at least one of the
                 * specifiers to contribute to a commit's or credit's drawdown. This field cannot be
                 * used together with `applicable_product_ids` or `applicable_product_tags`.
                 * Instead, to target usage by product or product tag, pass those values in the body
                 * of `specifiers`.
                 */
                fun specifiers(specifiers: List<CommitSpecifierInput>) =
                    specifiers(JsonField.of(specifiers))

                /**
                 * List of filters that determine what kind of customer usage draws down a commit or
                 * credit. A customer's usage needs to meet the condition of at least one of the
                 * specifiers to contribute to a commit's or credit's drawdown. This field cannot be
                 * used together with `applicable_product_ids` or `applicable_product_tags`.
                 * Instead, to target usage by product or product tag, pass those values in the body
                 * of `specifiers`.
                 */
                fun specifiers(specifiers: JsonField<List<CommitSpecifierInput>>) = apply {
                    this.specifiers = specifiers.map { it.toMutableList() }
                }

                /**
                 * List of filters that determine what kind of customer usage draws down a commit or
                 * credit. A customer's usage needs to meet the condition of at least one of the
                 * specifiers to contribute to a commit's or credit's drawdown. This field cannot be
                 * used together with `applicable_product_ids` or `applicable_product_tags`.
                 * Instead, to target usage by product or product tag, pass those values in the body
                 * of `specifiers`.
                 */
                fun addSpecifier(specifier: CommitSpecifierInput) = apply {
                    specifiers =
                        (specifiers ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(specifier)
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

                fun build(): AddCommit =
                    AddCommit(
                        checkRequired("id", id),
                        checkRequired("product", product),
                        checkRequired("type", type),
                        accessSchedule,
                        (applicableProductIds ?: JsonMissing.of()).map { it.toImmutable() },
                        (applicableProductTags ?: JsonMissing.of()).map { it.toImmutable() },
                        description,
                        hierarchyConfiguration,
                        invoiceSchedule,
                        name,
                        netsuiteSalesOrderId,
                        priority,
                        rateType,
                        rolloverFraction,
                        salesforceOpportunityId,
                        (specifiers ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class Product
            @JsonCreator
            private constructor(
                @JsonProperty("id")
                @ExcludeMissing
                private val id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name")
                @ExcludeMissing
                private val name: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun id(): String = id.getRequired("id")

                fun name(): String = name.getRequired("name")

                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Product = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    name()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Product]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var name: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(product: Product) = apply {
                        id = product.id
                        name = product.name
                        additionalProperties = product.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun name(name: String) = name(JsonField.of(name))

                    fun name(name: JsonField<String>) = apply { this.name = name }

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

                    fun build(): Product =
                        Product(
                            checkRequired("id", id),
                            checkRequired("name", name),
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Product && id == other.id && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, name, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Product{id=$id, name=$name, additionalProperties=$additionalProperties}"
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PREPAID,
                    POSTPAID,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                 * @throws MetronomeInvalidDataException if this class instance's value is a not a
                 *   known member.
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
                 * @throws MetronomeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        MetronomeInvalidDataException("Value is not a String")
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** The schedule that the customer will be invoiced for this commit. */
            @NoAutoDetect
            class InvoiceSchedule
            @JsonCreator
            private constructor(
                @JsonProperty("credit_type")
                @ExcludeMissing
                private val creditType: JsonField<CreditTypeData> = JsonMissing.of(),
                @JsonProperty("do_not_invoice")
                @ExcludeMissing
                private val doNotInvoice: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("schedule_items")
                @ExcludeMissing
                private val scheduleItems: JsonField<List<ScheduleItem>> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun creditType(): Optional<CreditTypeData> =
                    Optional.ofNullable(creditType.getNullable("credit_type"))

                /** If true, this schedule will not generate an invoice. */
                fun doNotInvoice(): Optional<Boolean> =
                    Optional.ofNullable(doNotInvoice.getNullable("do_not_invoice"))

                fun scheduleItems(): Optional<List<ScheduleItem>> =
                    Optional.ofNullable(scheduleItems.getNullable("schedule_items"))

                @JsonProperty("credit_type")
                @ExcludeMissing
                fun _creditType(): JsonField<CreditTypeData> = creditType

                /** If true, this schedule will not generate an invoice. */
                @JsonProperty("do_not_invoice")
                @ExcludeMissing
                fun _doNotInvoice(): JsonField<Boolean> = doNotInvoice

                @JsonProperty("schedule_items")
                @ExcludeMissing
                fun _scheduleItems(): JsonField<List<ScheduleItem>> = scheduleItems

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): InvoiceSchedule = apply {
                    if (validated) {
                        return@apply
                    }

                    creditType().ifPresent { it.validate() }
                    doNotInvoice()
                    scheduleItems().ifPresent { it.forEach { it.validate() } }
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [InvoiceSchedule]. */
                class Builder internal constructor() {

                    private var creditType: JsonField<CreditTypeData> = JsonMissing.of()
                    private var doNotInvoice: JsonField<Boolean> = JsonMissing.of()
                    private var scheduleItems: JsonField<MutableList<ScheduleItem>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(invoiceSchedule: InvoiceSchedule) = apply {
                        creditType = invoiceSchedule.creditType
                        doNotInvoice = invoiceSchedule.doNotInvoice
                        scheduleItems = invoiceSchedule.scheduleItems.map { it.toMutableList() }
                        additionalProperties = invoiceSchedule.additionalProperties.toMutableMap()
                    }

                    fun creditType(creditType: CreditTypeData) =
                        creditType(JsonField.of(creditType))

                    fun creditType(creditType: JsonField<CreditTypeData>) = apply {
                        this.creditType = creditType
                    }

                    /** If true, this schedule will not generate an invoice. */
                    fun doNotInvoice(doNotInvoice: Boolean) =
                        doNotInvoice(JsonField.of(doNotInvoice))

                    /** If true, this schedule will not generate an invoice. */
                    fun doNotInvoice(doNotInvoice: JsonField<Boolean>) = apply {
                        this.doNotInvoice = doNotInvoice
                    }

                    fun scheduleItems(scheduleItems: List<ScheduleItem>) =
                        scheduleItems(JsonField.of(scheduleItems))

                    fun scheduleItems(scheduleItems: JsonField<List<ScheduleItem>>) = apply {
                        this.scheduleItems = scheduleItems.map { it.toMutableList() }
                    }

                    fun addScheduleItem(scheduleItem: ScheduleItem) = apply {
                        scheduleItems =
                            (scheduleItems ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(scheduleItem)
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

                    fun build(): InvoiceSchedule =
                        InvoiceSchedule(
                            creditType,
                            doNotInvoice,
                            (scheduleItems ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toImmutable(),
                        )
                }

                @NoAutoDetect
                class ScheduleItem
                @JsonCreator
                private constructor(
                    @JsonProperty("id")
                    @ExcludeMissing
                    private val id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("timestamp")
                    @ExcludeMissing
                    private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("amount")
                    @ExcludeMissing
                    private val amount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("invoice_id")
                    @ExcludeMissing
                    private val invoiceId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("quantity")
                    @ExcludeMissing
                    private val quantity: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("unit_price")
                    @ExcludeMissing
                    private val unitPrice: JsonField<Double> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun id(): String = id.getRequired("id")

                    fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

                    fun amount(): Optional<Double> =
                        Optional.ofNullable(amount.getNullable("amount"))

                    fun invoiceId(): Optional<String> =
                        Optional.ofNullable(invoiceId.getNullable("invoice_id"))

                    fun quantity(): Optional<Double> =
                        Optional.ofNullable(quantity.getNullable("quantity"))

                    fun unitPrice(): Optional<Double> =
                        Optional.ofNullable(unitPrice.getNullable("unit_price"))

                    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                    @JsonProperty("timestamp")
                    @ExcludeMissing
                    fun _timestamp(): JsonField<OffsetDateTime> = timestamp

                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun _amount(): JsonField<Double> = amount

                    @JsonProperty("invoice_id")
                    @ExcludeMissing
                    fun _invoiceId(): JsonField<String> = invoiceId

                    @JsonProperty("quantity")
                    @ExcludeMissing
                    fun _quantity(): JsonField<Double> = quantity

                    @JsonProperty("unit_price")
                    @ExcludeMissing
                    fun _unitPrice(): JsonField<Double> = unitPrice

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): ScheduleItem = apply {
                        if (validated) {
                            return@apply
                        }

                        id()
                        timestamp()
                        amount()
                        invoiceId()
                        quantity()
                        unitPrice()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [ScheduleItem]. */
                    class Builder internal constructor() {

                        private var id: JsonField<String>? = null
                        private var timestamp: JsonField<OffsetDateTime>? = null
                        private var amount: JsonField<Double> = JsonMissing.of()
                        private var invoiceId: JsonField<String> = JsonMissing.of()
                        private var quantity: JsonField<Double> = JsonMissing.of()
                        private var unitPrice: JsonField<Double> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(scheduleItem: ScheduleItem) = apply {
                            id = scheduleItem.id
                            timestamp = scheduleItem.timestamp
                            amount = scheduleItem.amount
                            invoiceId = scheduleItem.invoiceId
                            quantity = scheduleItem.quantity
                            unitPrice = scheduleItem.unitPrice
                            additionalProperties = scheduleItem.additionalProperties.toMutableMap()
                        }

                        fun id(id: String) = id(JsonField.of(id))

                        fun id(id: JsonField<String>) = apply { this.id = id }

                        fun timestamp(timestamp: OffsetDateTime) =
                            timestamp(JsonField.of(timestamp))

                        fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                            this.timestamp = timestamp
                        }

                        fun amount(amount: Double) = amount(JsonField.of(amount))

                        fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                        fun invoiceId(invoiceId: String?) =
                            invoiceId(JsonField.ofNullable(invoiceId))

                        fun invoiceId(invoiceId: Optional<String>) =
                            invoiceId(invoiceId.orElse(null))

                        fun invoiceId(invoiceId: JsonField<String>) = apply {
                            this.invoiceId = invoiceId
                        }

                        fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                        fun quantity(quantity: JsonField<Double>) = apply {
                            this.quantity = quantity
                        }

                        fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

                        fun unitPrice(unitPrice: JsonField<Double>) = apply {
                            this.unitPrice = unitPrice
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

                        fun build(): ScheduleItem =
                            ScheduleItem(
                                checkRequired("id", id),
                                checkRequired("timestamp", timestamp),
                                amount,
                                invoiceId,
                                quantity,
                                unitPrice,
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is ScheduleItem && id == other.id && timestamp == other.timestamp && amount == other.amount && invoiceId == other.invoiceId && quantity == other.quantity && unitPrice == other.unitPrice && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(id, timestamp, amount, invoiceId, quantity, unitPrice, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "ScheduleItem{id=$id, timestamp=$timestamp, amount=$amount, invoiceId=$invoiceId, quantity=$quantity, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is InvoiceSchedule && creditType == other.creditType && doNotInvoice == other.doNotInvoice && scheduleItems == other.scheduleItems && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(creditType, doNotInvoice, scheduleItems, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "InvoiceSchedule{creditType=$creditType, doNotInvoice=$doNotInvoice, scheduleItems=$scheduleItems, additionalProperties=$additionalProperties}"
            }

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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    COMMIT_RATE,
                    LIST_RATE,
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
                 * @throws MetronomeInvalidDataException if this class instance's value is a not a
                 *   known member.
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
                 * @throws MetronomeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        MetronomeInvalidDataException("Value is not a String")
                    }

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

                return /* spotless:off */ other is AddCommit && id == other.id && product == other.product && type == other.type && accessSchedule == other.accessSchedule && applicableProductIds == other.applicableProductIds && applicableProductTags == other.applicableProductTags && description == other.description && hierarchyConfiguration == other.hierarchyConfiguration && invoiceSchedule == other.invoiceSchedule && name == other.name && netsuiteSalesOrderId == other.netsuiteSalesOrderId && priority == other.priority && rateType == other.rateType && rolloverFraction == other.rolloverFraction && salesforceOpportunityId == other.salesforceOpportunityId && specifiers == other.specifiers && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, product, type, accessSchedule, applicableProductIds, applicableProductTags, description, hierarchyConfiguration, invoiceSchedule, name, netsuiteSalesOrderId, priority, rateType, rolloverFraction, salesforceOpportunityId, specifiers, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AddCommit{id=$id, product=$product, type=$type, accessSchedule=$accessSchedule, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, description=$description, hierarchyConfiguration=$hierarchyConfiguration, invoiceSchedule=$invoiceSchedule, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, priority=$priority, rateType=$rateType, rolloverFraction=$rolloverFraction, salesforceOpportunityId=$salesforceOpportunityId, specifiers=$specifiers, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class AddCredit
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("product")
            @ExcludeMissing
            private val product: JsonField<Product> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("access_schedule")
            @ExcludeMissing
            private val accessSchedule: JsonField<ScheduleDuration> = JsonMissing.of(),
            @JsonProperty("applicable_product_ids")
            @ExcludeMissing
            private val applicableProductIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("applicable_product_tags")
            @ExcludeMissing
            private val applicableProductTags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            private val description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("hierarchy_configuration")
            @ExcludeMissing
            private val hierarchyConfiguration: JsonField<CommitHierarchyConfiguration> =
                JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("netsuite_sales_order_id")
            @ExcludeMissing
            private val netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("priority")
            @ExcludeMissing
            private val priority: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("salesforce_opportunity_id")
            @ExcludeMissing
            private val salesforceOpportunityId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("specifiers")
            @ExcludeMissing
            private val specifiers: JsonField<List<CommitSpecifierInput>> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun product(): Product = product.getRequired("product")

            fun type(): Type = type.getRequired("type")

            /** The schedule that the customer will gain access to the credits. */
            fun accessSchedule(): Optional<ScheduleDuration> =
                Optional.ofNullable(accessSchedule.getNullable("access_schedule"))

            fun applicableProductIds(): Optional<List<String>> =
                Optional.ofNullable(applicableProductIds.getNullable("applicable_product_ids"))

            fun applicableProductTags(): Optional<List<String>> =
                Optional.ofNullable(applicableProductTags.getNullable("applicable_product_tags"))

            fun description(): Optional<String> =
                Optional.ofNullable(description.getNullable("description"))

            /** Optional configuration for recurring credit hierarchy access control */
            fun hierarchyConfiguration(): Optional<CommitHierarchyConfiguration> =
                Optional.ofNullable(hierarchyConfiguration.getNullable("hierarchy_configuration"))

            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(): Optional<String> =
                Optional.ofNullable(netsuiteSalesOrderId.getNullable("netsuite_sales_order_id"))

            /**
             * If multiple credits or commits are applicable, the one with the lower priority will
             * apply first.
             */
            fun priority(): Optional<Double> = Optional.ofNullable(priority.getNullable("priority"))

            /** This field's availability is dependent on your client's configuration. */
            fun salesforceOpportunityId(): Optional<String> =
                Optional.ofNullable(
                    salesforceOpportunityId.getNullable("salesforce_opportunity_id")
                )

            /**
             * List of filters that determine what kind of customer usage draws down a commit or
             * credit. A customer's usage needs to meet the condition of at least one of the
             * specifiers to contribute to a commit's or credit's drawdown. This field cannot be
             * used together with `applicable_product_ids` or `applicable_product_tags`. Instead, to
             * target usage by product or product tag, pass those values in the body of
             * `specifiers`.
             */
            fun specifiers(): Optional<List<CommitSpecifierInput>> =
                Optional.ofNullable(specifiers.getNullable("specifiers"))

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonProperty("product") @ExcludeMissing fun _product(): JsonField<Product> = product

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /** The schedule that the customer will gain access to the credits. */
            @JsonProperty("access_schedule")
            @ExcludeMissing
            fun _accessSchedule(): JsonField<ScheduleDuration> = accessSchedule

            @JsonProperty("applicable_product_ids")
            @ExcludeMissing
            fun _applicableProductIds(): JsonField<List<String>> = applicableProductIds

            @JsonProperty("applicable_product_tags")
            @ExcludeMissing
            fun _applicableProductTags(): JsonField<List<String>> = applicableProductTags

            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /** Optional configuration for recurring credit hierarchy access control */
            @JsonProperty("hierarchy_configuration")
            @ExcludeMissing
            fun _hierarchyConfiguration(): JsonField<CommitHierarchyConfiguration> =
                hierarchyConfiguration

            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /** This field's availability is dependent on your client's configuration. */
            @JsonProperty("netsuite_sales_order_id")
            @ExcludeMissing
            fun _netsuiteSalesOrderId(): JsonField<String> = netsuiteSalesOrderId

            /**
             * If multiple credits or commits are applicable, the one with the lower priority will
             * apply first.
             */
            @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

            /** This field's availability is dependent on your client's configuration. */
            @JsonProperty("salesforce_opportunity_id")
            @ExcludeMissing
            fun _salesforceOpportunityId(): JsonField<String> = salesforceOpportunityId

            /**
             * List of filters that determine what kind of customer usage draws down a commit or
             * credit. A customer's usage needs to meet the condition of at least one of the
             * specifiers to contribute to a commit's or credit's drawdown. This field cannot be
             * used together with `applicable_product_ids` or `applicable_product_tags`. Instead, to
             * target usage by product or product tag, pass those values in the body of
             * `specifiers`.
             */
            @JsonProperty("specifiers")
            @ExcludeMissing
            fun _specifiers(): JsonField<List<CommitSpecifierInput>> = specifiers

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): AddCredit = apply {
                if (validated) {
                    return@apply
                }

                id()
                product().validate()
                type()
                accessSchedule().ifPresent { it.validate() }
                applicableProductIds()
                applicableProductTags()
                description()
                hierarchyConfiguration().ifPresent { it.validate() }
                name()
                netsuiteSalesOrderId()
                priority()
                salesforceOpportunityId()
                specifiers().ifPresent { it.forEach { it.validate() } }
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AddCredit]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var product: JsonField<Product>? = null
                private var type: JsonField<Type>? = null
                private var accessSchedule: JsonField<ScheduleDuration> = JsonMissing.of()
                private var applicableProductIds: JsonField<MutableList<String>>? = null
                private var applicableProductTags: JsonField<MutableList<String>>? = null
                private var description: JsonField<String> = JsonMissing.of()
                private var hierarchyConfiguration: JsonField<CommitHierarchyConfiguration> =
                    JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
                private var priority: JsonField<Double> = JsonMissing.of()
                private var salesforceOpportunityId: JsonField<String> = JsonMissing.of()
                private var specifiers: JsonField<MutableList<CommitSpecifierInput>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(addCredit: AddCredit) = apply {
                    id = addCredit.id
                    product = addCredit.product
                    type = addCredit.type
                    accessSchedule = addCredit.accessSchedule
                    applicableProductIds = addCredit.applicableProductIds.map { it.toMutableList() }
                    applicableProductTags =
                        addCredit.applicableProductTags.map { it.toMutableList() }
                    description = addCredit.description
                    hierarchyConfiguration = addCredit.hierarchyConfiguration
                    name = addCredit.name
                    netsuiteSalesOrderId = addCredit.netsuiteSalesOrderId
                    priority = addCredit.priority
                    salesforceOpportunityId = addCredit.salesforceOpportunityId
                    specifiers = addCredit.specifiers.map { it.toMutableList() }
                    additionalProperties = addCredit.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun product(product: Product) = product(JsonField.of(product))

                fun product(product: JsonField<Product>) = apply { this.product = product }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

                /** The schedule that the customer will gain access to the credits. */
                fun accessSchedule(accessSchedule: ScheduleDuration) =
                    accessSchedule(JsonField.of(accessSchedule))

                /** The schedule that the customer will gain access to the credits. */
                fun accessSchedule(accessSchedule: JsonField<ScheduleDuration>) = apply {
                    this.accessSchedule = accessSchedule
                }

                fun applicableProductIds(applicableProductIds: List<String>) =
                    applicableProductIds(JsonField.of(applicableProductIds))

                fun applicableProductIds(applicableProductIds: JsonField<List<String>>) = apply {
                    this.applicableProductIds = applicableProductIds.map { it.toMutableList() }
                }

                fun addApplicableProductId(applicableProductId: String) = apply {
                    applicableProductIds =
                        (applicableProductIds ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(applicableProductId)
                        }
                }

                fun applicableProductTags(applicableProductTags: List<String>) =
                    applicableProductTags(JsonField.of(applicableProductTags))

                fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
                    this.applicableProductTags = applicableProductTags.map { it.toMutableList() }
                }

                fun addApplicableProductTag(applicableProductTag: String) = apply {
                    applicableProductTags =
                        (applicableProductTags ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(applicableProductTag)
                        }
                }

                fun description(description: String) = description(JsonField.of(description))

                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /** Optional configuration for recurring credit hierarchy access control */
                fun hierarchyConfiguration(hierarchyConfiguration: CommitHierarchyConfiguration) =
                    hierarchyConfiguration(JsonField.of(hierarchyConfiguration))

                /** Optional configuration for recurring credit hierarchy access control */
                fun hierarchyConfiguration(
                    hierarchyConfiguration: JsonField<CommitHierarchyConfiguration>
                ) = apply { this.hierarchyConfiguration = hierarchyConfiguration }

                fun name(name: String) = name(JsonField.of(name))

                fun name(name: JsonField<String>) = apply { this.name = name }

                /** This field's availability is dependent on your client's configuration. */
                fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
                    netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

                /** This field's availability is dependent on your client's configuration. */
                fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
                    this.netsuiteSalesOrderId = netsuiteSalesOrderId
                }

                /**
                 * If multiple credits or commits are applicable, the one with the lower priority
                 * will apply first.
                 */
                fun priority(priority: Double) = priority(JsonField.of(priority))

                /**
                 * If multiple credits or commits are applicable, the one with the lower priority
                 * will apply first.
                 */
                fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

                /** This field's availability is dependent on your client's configuration. */
                fun salesforceOpportunityId(salesforceOpportunityId: String) =
                    salesforceOpportunityId(JsonField.of(salesforceOpportunityId))

                /** This field's availability is dependent on your client's configuration. */
                fun salesforceOpportunityId(salesforceOpportunityId: JsonField<String>) = apply {
                    this.salesforceOpportunityId = salesforceOpportunityId
                }

                /**
                 * List of filters that determine what kind of customer usage draws down a commit or
                 * credit. A customer's usage needs to meet the condition of at least one of the
                 * specifiers to contribute to a commit's or credit's drawdown. This field cannot be
                 * used together with `applicable_product_ids` or `applicable_product_tags`.
                 * Instead, to target usage by product or product tag, pass those values in the body
                 * of `specifiers`.
                 */
                fun specifiers(specifiers: List<CommitSpecifierInput>) =
                    specifiers(JsonField.of(specifiers))

                /**
                 * List of filters that determine what kind of customer usage draws down a commit or
                 * credit. A customer's usage needs to meet the condition of at least one of the
                 * specifiers to contribute to a commit's or credit's drawdown. This field cannot be
                 * used together with `applicable_product_ids` or `applicable_product_tags`.
                 * Instead, to target usage by product or product tag, pass those values in the body
                 * of `specifiers`.
                 */
                fun specifiers(specifiers: JsonField<List<CommitSpecifierInput>>) = apply {
                    this.specifiers = specifiers.map { it.toMutableList() }
                }

                /**
                 * List of filters that determine what kind of customer usage draws down a commit or
                 * credit. A customer's usage needs to meet the condition of at least one of the
                 * specifiers to contribute to a commit's or credit's drawdown. This field cannot be
                 * used together with `applicable_product_ids` or `applicable_product_tags`.
                 * Instead, to target usage by product or product tag, pass those values in the body
                 * of `specifiers`.
                 */
                fun addSpecifier(specifier: CommitSpecifierInput) = apply {
                    specifiers =
                        (specifiers ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(specifier)
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

                fun build(): AddCredit =
                    AddCredit(
                        checkRequired("id", id),
                        checkRequired("product", product),
                        checkRequired("type", type),
                        accessSchedule,
                        (applicableProductIds ?: JsonMissing.of()).map { it.toImmutable() },
                        (applicableProductTags ?: JsonMissing.of()).map { it.toImmutable() },
                        description,
                        hierarchyConfiguration,
                        name,
                        netsuiteSalesOrderId,
                        priority,
                        salesforceOpportunityId,
                        (specifiers ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class Product
            @JsonCreator
            private constructor(
                @JsonProperty("id")
                @ExcludeMissing
                private val id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name")
                @ExcludeMissing
                private val name: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun id(): String = id.getRequired("id")

                fun name(): String = name.getRequired("name")

                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Product = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    name()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Product]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var name: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(product: Product) = apply {
                        id = product.id
                        name = product.name
                        additionalProperties = product.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun name(name: String) = name(JsonField.of(name))

                    fun name(name: JsonField<String>) = apply { this.name = name }

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

                    fun build(): Product =
                        Product(
                            checkRequired("id", id),
                            checkRequired("name", name),
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Product && id == other.id && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, name, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Product{id=$id, name=$name, additionalProperties=$additionalProperties}"
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val CREDIT = of("CREDIT")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    CREDIT
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CREDIT,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        CREDIT -> Value.CREDIT
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
                        CREDIT -> Known.CREDIT
                        else -> throw MetronomeInvalidDataException("Unknown Type: $value")
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

                return /* spotless:off */ other is AddCredit && id == other.id && product == other.product && type == other.type && accessSchedule == other.accessSchedule && applicableProductIds == other.applicableProductIds && applicableProductTags == other.applicableProductTags && description == other.description && hierarchyConfiguration == other.hierarchyConfiguration && name == other.name && netsuiteSalesOrderId == other.netsuiteSalesOrderId && priority == other.priority && salesforceOpportunityId == other.salesforceOpportunityId && specifiers == other.specifiers && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, product, type, accessSchedule, applicableProductIds, applicableProductTags, description, hierarchyConfiguration, name, netsuiteSalesOrderId, priority, salesforceOpportunityId, specifiers, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AddCredit{id=$id, product=$product, type=$type, accessSchedule=$accessSchedule, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, description=$description, hierarchyConfiguration=$hierarchyConfiguration, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, priority=$priority, salesforceOpportunityId=$salesforceOpportunityId, specifiers=$specifiers, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class AddOverride
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("starting_at")
            @ExcludeMissing
            private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("applicable_product_tags")
            @ExcludeMissing
            private val applicableProductTags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("ending_before")
            @ExcludeMissing
            private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("entitled")
            @ExcludeMissing
            private val entitled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("is_commit_specific")
            @ExcludeMissing
            private val isCommitSpecific: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("multiplier")
            @ExcludeMissing
            private val multiplier: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("override_specifiers")
            @ExcludeMissing
            private val overrideSpecifiers: JsonField<List<OverrideSpecifier>> = JsonMissing.of(),
            @JsonProperty("override_tiers")
            @ExcludeMissing
            private val overrideTiers: JsonField<List<OverrideTier>> = JsonMissing.of(),
            @JsonProperty("overwrite_rate")
            @ExcludeMissing
            private val overwriteRate: JsonField<OverwriteRate> = JsonMissing.of(),
            @JsonProperty("priority")
            @ExcludeMissing
            private val priority: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("product")
            @ExcludeMissing
            private val product: JsonField<Product> = JsonMissing.of(),
            @JsonProperty("target")
            @ExcludeMissing
            private val target: JsonField<Target> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

            fun applicableProductTags(): Optional<List<String>> =
                Optional.ofNullable(applicableProductTags.getNullable("applicable_product_tags"))

            fun endingBefore(): Optional<OffsetDateTime> =
                Optional.ofNullable(endingBefore.getNullable("ending_before"))

            fun entitled(): Optional<Boolean> =
                Optional.ofNullable(entitled.getNullable("entitled"))

            fun isCommitSpecific(): Optional<Boolean> =
                Optional.ofNullable(isCommitSpecific.getNullable("is_commit_specific"))

            fun multiplier(): Optional<Double> =
                Optional.ofNullable(multiplier.getNullable("multiplier"))

            fun overrideSpecifiers(): Optional<List<OverrideSpecifier>> =
                Optional.ofNullable(overrideSpecifiers.getNullable("override_specifiers"))

            fun overrideTiers(): Optional<List<OverrideTier>> =
                Optional.ofNullable(overrideTiers.getNullable("override_tiers"))

            fun overwriteRate(): Optional<OverwriteRate> =
                Optional.ofNullable(overwriteRate.getNullable("overwrite_rate"))

            fun priority(): Optional<Double> = Optional.ofNullable(priority.getNullable("priority"))

            fun product(): Optional<Product> = Optional.ofNullable(product.getNullable("product"))

            fun target(): Optional<Target> = Optional.ofNullable(target.getNullable("target"))

            fun type(): Optional<Type> = Optional.ofNullable(type.getNullable("type"))

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonProperty("starting_at")
            @ExcludeMissing
            fun _startingAt(): JsonField<OffsetDateTime> = startingAt

            @JsonProperty("applicable_product_tags")
            @ExcludeMissing
            fun _applicableProductTags(): JsonField<List<String>> = applicableProductTags

            @JsonProperty("ending_before")
            @ExcludeMissing
            fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

            @JsonProperty("entitled") @ExcludeMissing fun _entitled(): JsonField<Boolean> = entitled

            @JsonProperty("is_commit_specific")
            @ExcludeMissing
            fun _isCommitSpecific(): JsonField<Boolean> = isCommitSpecific

            @JsonProperty("multiplier")
            @ExcludeMissing
            fun _multiplier(): JsonField<Double> = multiplier

            @JsonProperty("override_specifiers")
            @ExcludeMissing
            fun _overrideSpecifiers(): JsonField<List<OverrideSpecifier>> = overrideSpecifiers

            @JsonProperty("override_tiers")
            @ExcludeMissing
            fun _overrideTiers(): JsonField<List<OverrideTier>> = overrideTiers

            @JsonProperty("overwrite_rate")
            @ExcludeMissing
            fun _overwriteRate(): JsonField<OverwriteRate> = overwriteRate

            @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

            @JsonProperty("product") @ExcludeMissing fun _product(): JsonField<Product> = product

            @JsonProperty("target") @ExcludeMissing fun _target(): JsonField<Target> = target

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): AddOverride = apply {
                if (validated) {
                    return@apply
                }

                id()
                startingAt()
                applicableProductTags()
                endingBefore()
                entitled()
                isCommitSpecific()
                multiplier()
                overrideSpecifiers().ifPresent { it.forEach { it.validate() } }
                overrideTiers().ifPresent { it.forEach { it.validate() } }
                overwriteRate().ifPresent { it.validate() }
                priority()
                product().ifPresent { it.validate() }
                target()
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AddOverride]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var startingAt: JsonField<OffsetDateTime>? = null
                private var applicableProductTags: JsonField<MutableList<String>>? = null
                private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
                private var entitled: JsonField<Boolean> = JsonMissing.of()
                private var isCommitSpecific: JsonField<Boolean> = JsonMissing.of()
                private var multiplier: JsonField<Double> = JsonMissing.of()
                private var overrideSpecifiers: JsonField<MutableList<OverrideSpecifier>>? = null
                private var overrideTiers: JsonField<MutableList<OverrideTier>>? = null
                private var overwriteRate: JsonField<OverwriteRate> = JsonMissing.of()
                private var priority: JsonField<Double> = JsonMissing.of()
                private var product: JsonField<Product> = JsonMissing.of()
                private var target: JsonField<Target> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(addOverride: AddOverride) = apply {
                    id = addOverride.id
                    startingAt = addOverride.startingAt
                    applicableProductTags =
                        addOverride.applicableProductTags.map { it.toMutableList() }
                    endingBefore = addOverride.endingBefore
                    entitled = addOverride.entitled
                    isCommitSpecific = addOverride.isCommitSpecific
                    multiplier = addOverride.multiplier
                    overrideSpecifiers = addOverride.overrideSpecifiers.map { it.toMutableList() }
                    overrideTiers = addOverride.overrideTiers.map { it.toMutableList() }
                    overwriteRate = addOverride.overwriteRate
                    priority = addOverride.priority
                    product = addOverride.product
                    target = addOverride.target
                    type = addOverride.type
                    additionalProperties = addOverride.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

                fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                    this.startingAt = startingAt
                }

                fun applicableProductTags(applicableProductTags: List<String>) =
                    applicableProductTags(JsonField.of(applicableProductTags))

                fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
                    this.applicableProductTags = applicableProductTags.map { it.toMutableList() }
                }

                fun addApplicableProductTag(applicableProductTag: String) = apply {
                    applicableProductTags =
                        (applicableProductTags ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(applicableProductTag)
                        }
                }

                fun endingBefore(endingBefore: OffsetDateTime) =
                    endingBefore(JsonField.of(endingBefore))

                fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                    this.endingBefore = endingBefore
                }

                fun entitled(entitled: Boolean) = entitled(JsonField.of(entitled))

                fun entitled(entitled: JsonField<Boolean>) = apply { this.entitled = entitled }

                fun isCommitSpecific(isCommitSpecific: Boolean) =
                    isCommitSpecific(JsonField.of(isCommitSpecific))

                fun isCommitSpecific(isCommitSpecific: JsonField<Boolean>) = apply {
                    this.isCommitSpecific = isCommitSpecific
                }

                fun multiplier(multiplier: Double) = multiplier(JsonField.of(multiplier))

                fun multiplier(multiplier: JsonField<Double>) = apply {
                    this.multiplier = multiplier
                }

                fun overrideSpecifiers(overrideSpecifiers: List<OverrideSpecifier>) =
                    overrideSpecifiers(JsonField.of(overrideSpecifiers))

                fun overrideSpecifiers(overrideSpecifiers: JsonField<List<OverrideSpecifier>>) =
                    apply {
                        this.overrideSpecifiers = overrideSpecifiers.map { it.toMutableList() }
                    }

                fun addOverrideSpecifier(overrideSpecifier: OverrideSpecifier) = apply {
                    overrideSpecifiers =
                        (overrideSpecifiers ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(overrideSpecifier)
                        }
                }

                fun overrideTiers(overrideTiers: List<OverrideTier>) =
                    overrideTiers(JsonField.of(overrideTiers))

                fun overrideTiers(overrideTiers: JsonField<List<OverrideTier>>) = apply {
                    this.overrideTiers = overrideTiers.map { it.toMutableList() }
                }

                fun addOverrideTier(overrideTier: OverrideTier) = apply {
                    overrideTiers =
                        (overrideTiers ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(overrideTier)
                        }
                }

                fun overwriteRate(overwriteRate: OverwriteRate) =
                    overwriteRate(JsonField.of(overwriteRate))

                fun overwriteRate(overwriteRate: JsonField<OverwriteRate>) = apply {
                    this.overwriteRate = overwriteRate
                }

                fun priority(priority: Double) = priority(JsonField.of(priority))

                fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

                fun product(product: Product) = product(JsonField.of(product))

                fun product(product: JsonField<Product>) = apply { this.product = product }

                fun target(target: Target) = target(JsonField.of(target))

                fun target(target: JsonField<Target>) = apply { this.target = target }

                fun type(type: Type) = type(JsonField.of(type))

                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): AddOverride =
                    AddOverride(
                        checkRequired("id", id),
                        checkRequired("startingAt", startingAt),
                        (applicableProductTags ?: JsonMissing.of()).map { it.toImmutable() },
                        endingBefore,
                        entitled,
                        isCommitSpecific,
                        multiplier,
                        (overrideSpecifiers ?: JsonMissing.of()).map { it.toImmutable() },
                        (overrideTiers ?: JsonMissing.of()).map { it.toImmutable() },
                        overwriteRate,
                        priority,
                        product,
                        target,
                        type,
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class OverrideSpecifier
            @JsonCreator
            private constructor(
                @JsonProperty("billing_frequency")
                @ExcludeMissing
                private val billingFrequency: JsonField<BillingFrequency> = JsonMissing.of(),
                @JsonProperty("commit_ids")
                @ExcludeMissing
                private val commitIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("presentation_group_values")
                @ExcludeMissing
                private val presentationGroupValues: JsonField<PresentationGroupValues> =
                    JsonMissing.of(),
                @JsonProperty("pricing_group_values")
                @ExcludeMissing
                private val pricingGroupValues: JsonField<PricingGroupValues> = JsonMissing.of(),
                @JsonProperty("product_id")
                @ExcludeMissing
                private val productId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("product_tags")
                @ExcludeMissing
                private val productTags: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("recurring_commit_ids")
                @ExcludeMissing
                private val recurringCommitIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("recurring_credit_ids")
                @ExcludeMissing
                private val recurringCreditIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun billingFrequency(): Optional<BillingFrequency> =
                    Optional.ofNullable(billingFrequency.getNullable("billing_frequency"))

                fun commitIds(): Optional<List<String>> =
                    Optional.ofNullable(commitIds.getNullable("commit_ids"))

                fun presentationGroupValues(): Optional<PresentationGroupValues> =
                    Optional.ofNullable(
                        presentationGroupValues.getNullable("presentation_group_values")
                    )

                fun pricingGroupValues(): Optional<PricingGroupValues> =
                    Optional.ofNullable(pricingGroupValues.getNullable("pricing_group_values"))

                fun productId(): Optional<String> =
                    Optional.ofNullable(productId.getNullable("product_id"))

                fun productTags(): Optional<List<String>> =
                    Optional.ofNullable(productTags.getNullable("product_tags"))

                fun recurringCommitIds(): Optional<List<String>> =
                    Optional.ofNullable(recurringCommitIds.getNullable("recurring_commit_ids"))

                fun recurringCreditIds(): Optional<List<String>> =
                    Optional.ofNullable(recurringCreditIds.getNullable("recurring_credit_ids"))

                @JsonProperty("billing_frequency")
                @ExcludeMissing
                fun _billingFrequency(): JsonField<BillingFrequency> = billingFrequency

                @JsonProperty("commit_ids")
                @ExcludeMissing
                fun _commitIds(): JsonField<List<String>> = commitIds

                @JsonProperty("presentation_group_values")
                @ExcludeMissing
                fun _presentationGroupValues(): JsonField<PresentationGroupValues> =
                    presentationGroupValues

                @JsonProperty("pricing_group_values")
                @ExcludeMissing
                fun _pricingGroupValues(): JsonField<PricingGroupValues> = pricingGroupValues

                @JsonProperty("product_id")
                @ExcludeMissing
                fun _productId(): JsonField<String> = productId

                @JsonProperty("product_tags")
                @ExcludeMissing
                fun _productTags(): JsonField<List<String>> = productTags

                @JsonProperty("recurring_commit_ids")
                @ExcludeMissing
                fun _recurringCommitIds(): JsonField<List<String>> = recurringCommitIds

                @JsonProperty("recurring_credit_ids")
                @ExcludeMissing
                fun _recurringCreditIds(): JsonField<List<String>> = recurringCreditIds

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): OverrideSpecifier = apply {
                    if (validated) {
                        return@apply
                    }

                    billingFrequency()
                    commitIds()
                    presentationGroupValues().ifPresent { it.validate() }
                    pricingGroupValues().ifPresent { it.validate() }
                    productId()
                    productTags()
                    recurringCommitIds()
                    recurringCreditIds()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

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
                    private var recurringCreditIds: JsonField<MutableList<String>>? = null
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
                        recurringCreditIds =
                            overrideSpecifier.recurringCreditIds.map { it.toMutableList() }
                        additionalProperties = overrideSpecifier.additionalProperties.toMutableMap()
                    }

                    fun billingFrequency(billingFrequency: BillingFrequency) =
                        billingFrequency(JsonField.of(billingFrequency))

                    fun billingFrequency(billingFrequency: JsonField<BillingFrequency>) = apply {
                        this.billingFrequency = billingFrequency
                    }

                    fun commitIds(commitIds: List<String>) = commitIds(JsonField.of(commitIds))

                    fun commitIds(commitIds: JsonField<List<String>>) = apply {
                        this.commitIds = commitIds.map { it.toMutableList() }
                    }

                    fun addCommitId(commitId: String) = apply {
                        commitIds =
                            (commitIds ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(commitId)
                            }
                    }

                    fun presentationGroupValues(presentationGroupValues: PresentationGroupValues) =
                        presentationGroupValues(JsonField.of(presentationGroupValues))

                    fun presentationGroupValues(
                        presentationGroupValues: JsonField<PresentationGroupValues>
                    ) = apply { this.presentationGroupValues = presentationGroupValues }

                    fun pricingGroupValues(pricingGroupValues: PricingGroupValues) =
                        pricingGroupValues(JsonField.of(pricingGroupValues))

                    fun pricingGroupValues(pricingGroupValues: JsonField<PricingGroupValues>) =
                        apply {
                            this.pricingGroupValues = pricingGroupValues
                        }

                    fun productId(productId: String) = productId(JsonField.of(productId))

                    fun productId(productId: JsonField<String>) = apply {
                        this.productId = productId
                    }

                    fun productTags(productTags: List<String>) =
                        productTags(JsonField.of(productTags))

                    fun productTags(productTags: JsonField<List<String>>) = apply {
                        this.productTags = productTags.map { it.toMutableList() }
                    }

                    fun addProductTag(productTag: String) = apply {
                        productTags =
                            (productTags ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(productTag)
                            }
                    }

                    fun recurringCommitIds(recurringCommitIds: List<String>) =
                        recurringCommitIds(JsonField.of(recurringCommitIds))

                    fun recurringCommitIds(recurringCommitIds: JsonField<List<String>>) = apply {
                        this.recurringCommitIds = recurringCommitIds.map { it.toMutableList() }
                    }

                    fun addRecurringCommitId(recurringCommitId: String) = apply {
                        recurringCommitIds =
                            (recurringCommitIds ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(recurringCommitId)
                            }
                    }

                    fun recurringCreditIds(recurringCreditIds: List<String>) =
                        recurringCreditIds(JsonField.of(recurringCreditIds))

                    fun recurringCreditIds(recurringCreditIds: JsonField<List<String>>) = apply {
                        this.recurringCreditIds = recurringCreditIds.map { it.toMutableList() }
                    }

                    fun addRecurringCreditId(recurringCreditId: String) = apply {
                        recurringCreditIds =
                            (recurringCreditIds ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(recurringCreditId)
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

                    fun build(): OverrideSpecifier =
                        OverrideSpecifier(
                            billingFrequency,
                            (commitIds ?: JsonMissing.of()).map { it.toImmutable() },
                            presentationGroupValues,
                            pricingGroupValues,
                            productId,
                            (productTags ?: JsonMissing.of()).map { it.toImmutable() },
                            (recurringCommitIds ?: JsonMissing.of()).map { it.toImmutable() },
                            (recurringCreditIds ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toImmutable(),
                        )
                }

                class BillingFrequency
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
                     * An enum containing [BillingFrequency]'s known values, as well as an
                     * [_UNKNOWN] member.
                     *
                     * An instance of [BillingFrequency] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        MONTHLY,
                        QUARTERLY,
                        ANNUAL,
                        WEEKLY,
                        /**
                         * An enum member indicating that [BillingFrequency] was instantiated with
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
                            MONTHLY -> Value.MONTHLY
                            QUARTERLY -> Value.QUARTERLY
                            ANNUAL -> Value.ANNUAL
                            WEEKLY -> Value.WEEKLY
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
                            ANNUAL -> Known.ANNUAL
                            WEEKLY -> Known.WEEKLY
                            else ->
                                throw MetronomeInvalidDataException(
                                    "Unknown BillingFrequency: $value"
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

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is BillingFrequency && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                @NoAutoDetect
                class PresentationGroupValues
                @JsonCreator
                private constructor(
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): PresentationGroupValues = apply {
                        if (validated) {
                            return@apply
                        }

                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [PresentationGroupValues]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(presentationGroupValues: PresentationGroupValues) =
                            apply {
                                additionalProperties =
                                    presentationGroupValues.additionalProperties.toMutableMap()
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

                @NoAutoDetect
                class PricingGroupValues
                @JsonCreator
                private constructor(
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): PricingGroupValues = apply {
                        if (validated) {
                            return@apply
                        }

                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [PricingGroupValues]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(pricingGroupValues: PricingGroupValues) = apply {
                            additionalProperties =
                                pricingGroupValues.additionalProperties.toMutableMap()
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

                    return /* spotless:off */ other is OverrideSpecifier && billingFrequency == other.billingFrequency && commitIds == other.commitIds && presentationGroupValues == other.presentationGroupValues && pricingGroupValues == other.pricingGroupValues && productId == other.productId && productTags == other.productTags && recurringCommitIds == other.recurringCommitIds && recurringCreditIds == other.recurringCreditIds && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(billingFrequency, commitIds, presentationGroupValues, pricingGroupValues, productId, productTags, recurringCommitIds, recurringCreditIds, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "OverrideSpecifier{billingFrequency=$billingFrequency, commitIds=$commitIds, presentationGroupValues=$presentationGroupValues, pricingGroupValues=$pricingGroupValues, productId=$productId, productTags=$productTags, recurringCommitIds=$recurringCommitIds, recurringCreditIds=$recurringCreditIds, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class OverwriteRate
            @JsonCreator
            private constructor(
                @JsonProperty("rate_type")
                @ExcludeMissing
                private val rateType: JsonField<RateType> = JsonMissing.of(),
                @JsonProperty("credit_type")
                @ExcludeMissing
                private val creditType: JsonField<CreditTypeData> = JsonMissing.of(),
                @JsonProperty("custom_rate")
                @ExcludeMissing
                private val customRate: JsonField<CustomRate> = JsonMissing.of(),
                @JsonProperty("is_prorated")
                @ExcludeMissing
                private val isProrated: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("price")
                @ExcludeMissing
                private val price: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("quantity")
                @ExcludeMissing
                private val quantity: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("tiers")
                @ExcludeMissing
                private val tiers: JsonField<List<Tier>> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun rateType(): RateType = rateType.getRequired("rate_type")

                fun creditType(): Optional<CreditTypeData> =
                    Optional.ofNullable(creditType.getNullable("credit_type"))

                /**
                 * Only set for CUSTOM rate_type. This field is interpreted by custom rate
                 * processors.
                 */
                fun customRate(): Optional<CustomRate> =
                    Optional.ofNullable(customRate.getNullable("custom_rate"))

                /**
                 * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be
                 * set to true.
                 */
                fun isProrated(): Optional<Boolean> =
                    Optional.ofNullable(isProrated.getNullable("is_prorated"))

                /**
                 * Default price. For FLAT rate_type, this must be >=0. For PERCENTAGE rate_type,
                 * this is a decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
                 */
                fun price(): Optional<Double> = Optional.ofNullable(price.getNullable("price"))

                /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
                fun quantity(): Optional<Double> =
                    Optional.ofNullable(quantity.getNullable("quantity"))

                /** Only set for TIERED rate_type. */
                fun tiers(): Optional<List<Tier>> = Optional.ofNullable(tiers.getNullable("tiers"))

                @JsonProperty("rate_type")
                @ExcludeMissing
                fun _rateType(): JsonField<RateType> = rateType

                @JsonProperty("credit_type")
                @ExcludeMissing
                fun _creditType(): JsonField<CreditTypeData> = creditType

                /**
                 * Only set for CUSTOM rate_type. This field is interpreted by custom rate
                 * processors.
                 */
                @JsonProperty("custom_rate")
                @ExcludeMissing
                fun _customRate(): JsonField<CustomRate> = customRate

                /**
                 * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must be
                 * set to true.
                 */
                @JsonProperty("is_prorated")
                @ExcludeMissing
                fun _isProrated(): JsonField<Boolean> = isProrated

                /**
                 * Default price. For FLAT rate_type, this must be >=0. For PERCENTAGE rate_type,
                 * this is a decimal fraction, e.g. use 0.1 for 10%; this must be >=0 and <=1.
                 */
                @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Double> = price

                /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
                @JsonProperty("quantity")
                @ExcludeMissing
                fun _quantity(): JsonField<Double> = quantity

                /** Only set for TIERED rate_type. */
                @JsonProperty("tiers") @ExcludeMissing fun _tiers(): JsonField<List<Tier>> = tiers

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): OverwriteRate = apply {
                    if (validated) {
                        return@apply
                    }

                    rateType()
                    creditType().ifPresent { it.validate() }
                    customRate().ifPresent { it.validate() }
                    isProrated()
                    price()
                    quantity()
                    tiers().ifPresent { it.forEach { it.validate() } }
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [OverwriteRate]. */
                class Builder internal constructor() {

                    private var rateType: JsonField<RateType>? = null
                    private var creditType: JsonField<CreditTypeData> = JsonMissing.of()
                    private var customRate: JsonField<CustomRate> = JsonMissing.of()
                    private var isProrated: JsonField<Boolean> = JsonMissing.of()
                    private var price: JsonField<Double> = JsonMissing.of()
                    private var quantity: JsonField<Double> = JsonMissing.of()
                    private var tiers: JsonField<MutableList<Tier>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(overwriteRate: OverwriteRate) = apply {
                        rateType = overwriteRate.rateType
                        creditType = overwriteRate.creditType
                        customRate = overwriteRate.customRate
                        isProrated = overwriteRate.isProrated
                        price = overwriteRate.price
                        quantity = overwriteRate.quantity
                        tiers = overwriteRate.tiers.map { it.toMutableList() }
                        additionalProperties = overwriteRate.additionalProperties.toMutableMap()
                    }

                    fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

                    fun rateType(rateType: JsonField<RateType>) = apply { this.rateType = rateType }

                    fun creditType(creditType: CreditTypeData) =
                        creditType(JsonField.of(creditType))

                    fun creditType(creditType: JsonField<CreditTypeData>) = apply {
                        this.creditType = creditType
                    }

                    /**
                     * Only set for CUSTOM rate_type. This field is interpreted by custom rate
                     * processors.
                     */
                    fun customRate(customRate: CustomRate) = customRate(JsonField.of(customRate))

                    /**
                     * Only set for CUSTOM rate_type. This field is interpreted by custom rate
                     * processors.
                     */
                    fun customRate(customRate: JsonField<CustomRate>) = apply {
                        this.customRate = customRate
                    }

                    /**
                     * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must
                     * be set to true.
                     */
                    fun isProrated(isProrated: Boolean) = isProrated(JsonField.of(isProrated))

                    /**
                     * Default proration configuration. Only valid for SUBSCRIPTION rate_type. Must
                     * be set to true.
                     */
                    fun isProrated(isProrated: JsonField<Boolean>) = apply {
                        this.isProrated = isProrated
                    }

                    /**
                     * Default price. For FLAT rate_type, this must be >=0. For PERCENTAGE
                     * rate_type, this is a decimal fraction, e.g. use 0.1 for 10%; this must be >=0
                     * and <=1.
                     */
                    fun price(price: Double) = price(JsonField.of(price))

                    /**
                     * Default price. For FLAT rate_type, this must be >=0. For PERCENTAGE
                     * rate_type, this is a decimal fraction, e.g. use 0.1 for 10%; this must be >=0
                     * and <=1.
                     */
                    fun price(price: JsonField<Double>) = apply { this.price = price }

                    /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    /** Default quantity. For SUBSCRIPTION rate_type, this must be >=0. */
                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                    /** Only set for TIERED rate_type. */
                    fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

                    /** Only set for TIERED rate_type. */
                    fun tiers(tiers: JsonField<List<Tier>>) = apply {
                        this.tiers = tiers.map { it.toMutableList() }
                    }

                    /** Only set for TIERED rate_type. */
                    fun addTier(tier: Tier) = apply {
                        tiers =
                            (tiers ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(tier)
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

                    fun build(): OverwriteRate =
                        OverwriteRate(
                            checkRequired("rateType", rateType),
                            creditType,
                            customRate,
                            isProrated,
                            price,
                            quantity,
                            (tiers ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toImmutable(),
                        )
                }

                class RateType
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
                     * An enum containing [RateType]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [RateType] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
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
                         * An enum member indicating that [RateType] was instantiated with an
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
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws MetronomeInvalidDataException if this class instance's value is a not
                     *   a known member.
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
                 * Only set for CUSTOM rate_type. This field is interpreted by custom rate
                 * processors.
                 */
                @NoAutoDetect
                class CustomRate
                @JsonCreator
                private constructor(
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
                ) {

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): CustomRate = apply {
                        if (validated) {
                            return@apply
                        }

                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [CustomRate]. */
                    class Builder internal constructor() {

                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(customRate: CustomRate) = apply {
                            additionalProperties = customRate.additionalProperties.toMutableMap()
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

                    override fun toString() =
                        "CustomRate{additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is OverwriteRate && rateType == other.rateType && creditType == other.creditType && customRate == other.customRate && isProrated == other.isProrated && price == other.price && quantity == other.quantity && tiers == other.tiers && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(rateType, creditType, customRate, isProrated, price, quantity, tiers, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "OverwriteRate{rateType=$rateType, creditType=$creditType, customRate=$customRate, isProrated=$isProrated, price=$price, quantity=$quantity, tiers=$tiers, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class Product
            @JsonCreator
            private constructor(
                @JsonProperty("id")
                @ExcludeMissing
                private val id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name")
                @ExcludeMissing
                private val name: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun id(): String = id.getRequired("id")

                fun name(): String = name.getRequired("name")

                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Product = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    name()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Product]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var name: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(product: Product) = apply {
                        id = product.id
                        name = product.name
                        additionalProperties = product.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun name(name: String) = name(JsonField.of(name))

                    fun name(name: JsonField<String>) = apply { this.name = name }

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

                    fun build(): Product =
                        Product(
                            checkRequired("id", id),
                            checkRequired("name", name),
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Product && id == other.id && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, name, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Product{id=$id, name=$name, additionalProperties=$additionalProperties}"
            }

            class Target @JsonCreator private constructor(private val value: JsonField<String>) :
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    COMMIT_RATE,
                    LIST_RATE,
                    /**
                     * An enum member indicating that [Target] was instantiated with an unknown
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
                 * @throws MetronomeInvalidDataException if this class instance's value is a not a
                 *   known member.
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
                 * @throws MetronomeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        MetronomeInvalidDataException("Value is not a String")
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Target && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    OVERWRITE,
                    MULTIPLIER,
                    TIERED,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                 * @throws MetronomeInvalidDataException if this class instance's value is a not a
                 *   known member.
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
                 * @throws MetronomeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        MetronomeInvalidDataException("Value is not a String")
                    }

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

                return /* spotless:off */ other is AddOverride && id == other.id && startingAt == other.startingAt && applicableProductTags == other.applicableProductTags && endingBefore == other.endingBefore && entitled == other.entitled && isCommitSpecific == other.isCommitSpecific && multiplier == other.multiplier && overrideSpecifiers == other.overrideSpecifiers && overrideTiers == other.overrideTiers && overwriteRate == other.overwriteRate && priority == other.priority && product == other.product && target == other.target && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, startingAt, applicableProductTags, endingBefore, entitled, isCommitSpecific, multiplier, overrideSpecifiers, overrideTiers, overwriteRate, priority, product, target, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AddOverride{id=$id, startingAt=$startingAt, applicableProductTags=$applicableProductTags, endingBefore=$endingBefore, entitled=$entitled, isCommitSpecific=$isCommitSpecific, multiplier=$multiplier, overrideSpecifiers=$overrideSpecifiers, overrideTiers=$overrideTiers, overwriteRate=$overwriteRate, priority=$priority, product=$product, target=$target, type=$type, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class AddRecurringCommit
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("access_amount")
            @ExcludeMissing
            private val accessAmount: JsonField<AccessAmount> = JsonMissing.of(),
            @JsonProperty("commit_duration")
            @ExcludeMissing
            private val commitDuration: JsonField<CommitDuration> = JsonMissing.of(),
            @JsonProperty("priority")
            @ExcludeMissing
            private val priority: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("product")
            @ExcludeMissing
            private val product: JsonField<Product> = JsonMissing.of(),
            @JsonProperty("rate_type")
            @ExcludeMissing
            private val rateType: JsonField<RateType> = JsonMissing.of(),
            @JsonProperty("starting_at")
            @ExcludeMissing
            private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("applicable_product_ids")
            @ExcludeMissing
            private val applicableProductIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("applicable_product_tags")
            @ExcludeMissing
            private val applicableProductTags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("contract")
            @ExcludeMissing
            private val contract: JsonField<Contract> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            private val description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ending_before")
            @ExcludeMissing
            private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("hierarchy_configuration")
            @ExcludeMissing
            private val hierarchyConfiguration: JsonField<CommitHierarchyConfiguration> =
                JsonMissing.of(),
            @JsonProperty("invoice_amount")
            @ExcludeMissing
            private val invoiceAmount: JsonField<InvoiceAmount> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("netsuite_sales_order_id")
            @ExcludeMissing
            private val netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("proration")
            @ExcludeMissing
            private val proration: JsonField<Proration> = JsonMissing.of(),
            @JsonProperty("recurrence_frequency")
            @ExcludeMissing
            private val recurrenceFrequency: JsonField<RecurrenceFrequency> = JsonMissing.of(),
            @JsonProperty("rollover_fraction")
            @ExcludeMissing
            private val rolloverFraction: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("specifiers")
            @ExcludeMissing
            private val specifiers: JsonField<List<CommitSpecifier>> = JsonMissing.of(),
            @JsonProperty("subscription_config")
            @ExcludeMissing
            private val subscriptionConfig: JsonField<RecurringCommitSubscriptionConfig> =
                JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            /** The amount of commit to grant. */
            fun accessAmount(): AccessAmount = accessAmount.getRequired("access_amount")

            /** The amount of time the created commits will be valid for */
            fun commitDuration(): CommitDuration = commitDuration.getRequired("commit_duration")

            /** Will be passed down to the individual commits */
            fun priority(): Double = priority.getRequired("priority")

            fun product(): Product = product.getRequired("product")

            /** Whether the created commits will use the commit rate or list rate */
            fun rateType(): RateType = rateType.getRequired("rate_type")

            /** Determines the start time for the first commit */
            fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

            /** Will be passed down to the individual commits */
            fun applicableProductIds(): Optional<List<String>> =
                Optional.ofNullable(applicableProductIds.getNullable("applicable_product_ids"))

            /** Will be passed down to the individual commits */
            fun applicableProductTags(): Optional<List<String>> =
                Optional.ofNullable(applicableProductTags.getNullable("applicable_product_tags"))

            fun contract(): Optional<Contract> =
                Optional.ofNullable(contract.getNullable("contract"))

            /** Will be passed down to the individual commits */
            fun description(): Optional<String> =
                Optional.ofNullable(description.getNullable("description"))

            /** Determines when the contract will stop creating recurring commits. Optional */
            fun endingBefore(): Optional<OffsetDateTime> =
                Optional.ofNullable(endingBefore.getNullable("ending_before"))

            /** Optional configuration for recurring credit hierarchy access control */
            fun hierarchyConfiguration(): Optional<CommitHierarchyConfiguration> =
                Optional.ofNullable(hierarchyConfiguration.getNullable("hierarchy_configuration"))

            /** The amount the customer should be billed for the commit. Not required. */
            fun invoiceAmount(): Optional<InvoiceAmount> =
                Optional.ofNullable(invoiceAmount.getNullable("invoice_amount"))

            /** Displayed on invoices. Will be passed through to the individual commits */
            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            /** Will be passed down to the individual commits */
            fun netsuiteSalesOrderId(): Optional<String> =
                Optional.ofNullable(netsuiteSalesOrderId.getNullable("netsuite_sales_order_id"))

            /**
             * Determines whether the first and last commit will be prorated. If not provided, the
             * default is FIRST_AND_LAST (i.e. prorate both the first and last commits).
             */
            fun proration(): Optional<Proration> =
                Optional.ofNullable(proration.getNullable("proration"))

            /**
             * The frequency at which the recurring commits will be created. If not provided: - The
             * commits will be created on the usage invoice frequency. If provided: - The period
             * defined in the duration will correspond to this frequency. - Commits will be created
             * aligned with the recurring commit's starting_at rather than the usage invoice dates.
             */
            fun recurrenceFrequency(): Optional<RecurrenceFrequency> =
                Optional.ofNullable(recurrenceFrequency.getNullable("recurrence_frequency"))

            /**
             * Will be passed down to the individual commits. This controls how much of an
             * individual unexpired commit will roll over upon contract transition. Must be between
             * 0 and 1.
             */
            fun rolloverFraction(): Optional<Double> =
                Optional.ofNullable(rolloverFraction.getNullable("rollover_fraction"))

            /**
             * List of filters that determine what kind of customer usage draws down a commit or
             * credit. A customer's usage needs to meet the condition of at least one of the
             * specifiers to contribute to a commit's or credit's drawdown.
             */
            fun specifiers(): Optional<List<CommitSpecifier>> =
                Optional.ofNullable(specifiers.getNullable("specifiers"))

            /** Attach a subscription to the recurring commit/credit. */
            fun subscriptionConfig(): Optional<RecurringCommitSubscriptionConfig> =
                Optional.ofNullable(subscriptionConfig.getNullable("subscription_config"))

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /** The amount of commit to grant. */
            @JsonProperty("access_amount")
            @ExcludeMissing
            fun _accessAmount(): JsonField<AccessAmount> = accessAmount

            /** The amount of time the created commits will be valid for */
            @JsonProperty("commit_duration")
            @ExcludeMissing
            fun _commitDuration(): JsonField<CommitDuration> = commitDuration

            /** Will be passed down to the individual commits */
            @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

            @JsonProperty("product") @ExcludeMissing fun _product(): JsonField<Product> = product

            /** Whether the created commits will use the commit rate or list rate */
            @JsonProperty("rate_type")
            @ExcludeMissing
            fun _rateType(): JsonField<RateType> = rateType

            /** Determines the start time for the first commit */
            @JsonProperty("starting_at")
            @ExcludeMissing
            fun _startingAt(): JsonField<OffsetDateTime> = startingAt

            /** Will be passed down to the individual commits */
            @JsonProperty("applicable_product_ids")
            @ExcludeMissing
            fun _applicableProductIds(): JsonField<List<String>> = applicableProductIds

            /** Will be passed down to the individual commits */
            @JsonProperty("applicable_product_tags")
            @ExcludeMissing
            fun _applicableProductTags(): JsonField<List<String>> = applicableProductTags

            @JsonProperty("contract")
            @ExcludeMissing
            fun _contract(): JsonField<Contract> = contract

            /** Will be passed down to the individual commits */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /** Determines when the contract will stop creating recurring commits. Optional */
            @JsonProperty("ending_before")
            @ExcludeMissing
            fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

            /** Optional configuration for recurring credit hierarchy access control */
            @JsonProperty("hierarchy_configuration")
            @ExcludeMissing
            fun _hierarchyConfiguration(): JsonField<CommitHierarchyConfiguration> =
                hierarchyConfiguration

            /** The amount the customer should be billed for the commit. Not required. */
            @JsonProperty("invoice_amount")
            @ExcludeMissing
            fun _invoiceAmount(): JsonField<InvoiceAmount> = invoiceAmount

            /** Displayed on invoices. Will be passed through to the individual commits */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /** Will be passed down to the individual commits */
            @JsonProperty("netsuite_sales_order_id")
            @ExcludeMissing
            fun _netsuiteSalesOrderId(): JsonField<String> = netsuiteSalesOrderId

            /**
             * Determines whether the first and last commit will be prorated. If not provided, the
             * default is FIRST_AND_LAST (i.e. prorate both the first and last commits).
             */
            @JsonProperty("proration")
            @ExcludeMissing
            fun _proration(): JsonField<Proration> = proration

            /**
             * The frequency at which the recurring commits will be created. If not provided: - The
             * commits will be created on the usage invoice frequency. If provided: - The period
             * defined in the duration will correspond to this frequency. - Commits will be created
             * aligned with the recurring commit's starting_at rather than the usage invoice dates.
             */
            @JsonProperty("recurrence_frequency")
            @ExcludeMissing
            fun _recurrenceFrequency(): JsonField<RecurrenceFrequency> = recurrenceFrequency

            /**
             * Will be passed down to the individual commits. This controls how much of an
             * individual unexpired commit will roll over upon contract transition. Must be between
             * 0 and 1.
             */
            @JsonProperty("rollover_fraction")
            @ExcludeMissing
            fun _rolloverFraction(): JsonField<Double> = rolloverFraction

            /**
             * List of filters that determine what kind of customer usage draws down a commit or
             * credit. A customer's usage needs to meet the condition of at least one of the
             * specifiers to contribute to a commit's or credit's drawdown.
             */
            @JsonProperty("specifiers")
            @ExcludeMissing
            fun _specifiers(): JsonField<List<CommitSpecifier>> = specifiers

            /** Attach a subscription to the recurring commit/credit. */
            @JsonProperty("subscription_config")
            @ExcludeMissing
            fun _subscriptionConfig(): JsonField<RecurringCommitSubscriptionConfig> =
                subscriptionConfig

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): AddRecurringCommit = apply {
                if (validated) {
                    return@apply
                }

                id()
                accessAmount().validate()
                commitDuration().validate()
                priority()
                product().validate()
                rateType()
                startingAt()
                applicableProductIds()
                applicableProductTags()
                contract().ifPresent { it.validate() }
                description()
                endingBefore()
                hierarchyConfiguration().ifPresent { it.validate() }
                invoiceAmount().ifPresent { it.validate() }
                name()
                netsuiteSalesOrderId()
                proration()
                recurrenceFrequency()
                rolloverFraction()
                specifiers().ifPresent { it.forEach { it.validate() } }
                subscriptionConfig().ifPresent { it.validate() }
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AddRecurringCommit]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var accessAmount: JsonField<AccessAmount>? = null
                private var commitDuration: JsonField<CommitDuration>? = null
                private var priority: JsonField<Double>? = null
                private var product: JsonField<Product>? = null
                private var rateType: JsonField<RateType>? = null
                private var startingAt: JsonField<OffsetDateTime>? = null
                private var applicableProductIds: JsonField<MutableList<String>>? = null
                private var applicableProductTags: JsonField<MutableList<String>>? = null
                private var contract: JsonField<Contract> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
                private var hierarchyConfiguration: JsonField<CommitHierarchyConfiguration> =
                    JsonMissing.of()
                private var invoiceAmount: JsonField<InvoiceAmount> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
                private var proration: JsonField<Proration> = JsonMissing.of()
                private var recurrenceFrequency: JsonField<RecurrenceFrequency> = JsonMissing.of()
                private var rolloverFraction: JsonField<Double> = JsonMissing.of()
                private var specifiers: JsonField<MutableList<CommitSpecifier>>? = null
                private var subscriptionConfig: JsonField<RecurringCommitSubscriptionConfig> =
                    JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(addRecurringCommit: AddRecurringCommit) = apply {
                    id = addRecurringCommit.id
                    accessAmount = addRecurringCommit.accessAmount
                    commitDuration = addRecurringCommit.commitDuration
                    priority = addRecurringCommit.priority
                    product = addRecurringCommit.product
                    rateType = addRecurringCommit.rateType
                    startingAt = addRecurringCommit.startingAt
                    applicableProductIds =
                        addRecurringCommit.applicableProductIds.map { it.toMutableList() }
                    applicableProductTags =
                        addRecurringCommit.applicableProductTags.map { it.toMutableList() }
                    contract = addRecurringCommit.contract
                    description = addRecurringCommit.description
                    endingBefore = addRecurringCommit.endingBefore
                    hierarchyConfiguration = addRecurringCommit.hierarchyConfiguration
                    invoiceAmount = addRecurringCommit.invoiceAmount
                    name = addRecurringCommit.name
                    netsuiteSalesOrderId = addRecurringCommit.netsuiteSalesOrderId
                    proration = addRecurringCommit.proration
                    recurrenceFrequency = addRecurringCommit.recurrenceFrequency
                    rolloverFraction = addRecurringCommit.rolloverFraction
                    specifiers = addRecurringCommit.specifiers.map { it.toMutableList() }
                    subscriptionConfig = addRecurringCommit.subscriptionConfig
                    additionalProperties = addRecurringCommit.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                /** The amount of commit to grant. */
                fun accessAmount(accessAmount: AccessAmount) =
                    accessAmount(JsonField.of(accessAmount))

                /** The amount of commit to grant. */
                fun accessAmount(accessAmount: JsonField<AccessAmount>) = apply {
                    this.accessAmount = accessAmount
                }

                /** The amount of time the created commits will be valid for */
                fun commitDuration(commitDuration: CommitDuration) =
                    commitDuration(JsonField.of(commitDuration))

                /** The amount of time the created commits will be valid for */
                fun commitDuration(commitDuration: JsonField<CommitDuration>) = apply {
                    this.commitDuration = commitDuration
                }

                /** Will be passed down to the individual commits */
                fun priority(priority: Double) = priority(JsonField.of(priority))

                /** Will be passed down to the individual commits */
                fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

                fun product(product: Product) = product(JsonField.of(product))

                fun product(product: JsonField<Product>) = apply { this.product = product }

                /** Whether the created commits will use the commit rate or list rate */
                fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

                /** Whether the created commits will use the commit rate or list rate */
                fun rateType(rateType: JsonField<RateType>) = apply { this.rateType = rateType }

                /** Determines the start time for the first commit */
                fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

                /** Determines the start time for the first commit */
                fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                    this.startingAt = startingAt
                }

                /** Will be passed down to the individual commits */
                fun applicableProductIds(applicableProductIds: List<String>) =
                    applicableProductIds(JsonField.of(applicableProductIds))

                /** Will be passed down to the individual commits */
                fun applicableProductIds(applicableProductIds: JsonField<List<String>>) = apply {
                    this.applicableProductIds = applicableProductIds.map { it.toMutableList() }
                }

                /** Will be passed down to the individual commits */
                fun addApplicableProductId(applicableProductId: String) = apply {
                    applicableProductIds =
                        (applicableProductIds ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(applicableProductId)
                        }
                }

                /** Will be passed down to the individual commits */
                fun applicableProductTags(applicableProductTags: List<String>) =
                    applicableProductTags(JsonField.of(applicableProductTags))

                /** Will be passed down to the individual commits */
                fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
                    this.applicableProductTags = applicableProductTags.map { it.toMutableList() }
                }

                /** Will be passed down to the individual commits */
                fun addApplicableProductTag(applicableProductTag: String) = apply {
                    applicableProductTags =
                        (applicableProductTags ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(applicableProductTag)
                        }
                }

                fun contract(contract: Contract) = contract(JsonField.of(contract))

                fun contract(contract: JsonField<Contract>) = apply { this.contract = contract }

                /** Will be passed down to the individual commits */
                fun description(description: String) = description(JsonField.of(description))

                /** Will be passed down to the individual commits */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /** Determines when the contract will stop creating recurring commits. Optional */
                fun endingBefore(endingBefore: OffsetDateTime) =
                    endingBefore(JsonField.of(endingBefore))

                /** Determines when the contract will stop creating recurring commits. Optional */
                fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                    this.endingBefore = endingBefore
                }

                /** Optional configuration for recurring credit hierarchy access control */
                fun hierarchyConfiguration(hierarchyConfiguration: CommitHierarchyConfiguration) =
                    hierarchyConfiguration(JsonField.of(hierarchyConfiguration))

                /** Optional configuration for recurring credit hierarchy access control */
                fun hierarchyConfiguration(
                    hierarchyConfiguration: JsonField<CommitHierarchyConfiguration>
                ) = apply { this.hierarchyConfiguration = hierarchyConfiguration }

                /** The amount the customer should be billed for the commit. Not required. */
                fun invoiceAmount(invoiceAmount: InvoiceAmount) =
                    invoiceAmount(JsonField.of(invoiceAmount))

                /** The amount the customer should be billed for the commit. Not required. */
                fun invoiceAmount(invoiceAmount: JsonField<InvoiceAmount>) = apply {
                    this.invoiceAmount = invoiceAmount
                }

                /** Displayed on invoices. Will be passed through to the individual commits */
                fun name(name: String) = name(JsonField.of(name))

                /** Displayed on invoices. Will be passed through to the individual commits */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** Will be passed down to the individual commits */
                fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
                    netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

                /** Will be passed down to the individual commits */
                fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
                    this.netsuiteSalesOrderId = netsuiteSalesOrderId
                }

                /**
                 * Determines whether the first and last commit will be prorated. If not provided,
                 * the default is FIRST_AND_LAST (i.e. prorate both the first and last commits).
                 */
                fun proration(proration: Proration) = proration(JsonField.of(proration))

                /**
                 * Determines whether the first and last commit will be prorated. If not provided,
                 * the default is FIRST_AND_LAST (i.e. prorate both the first and last commits).
                 */
                fun proration(proration: JsonField<Proration>) = apply {
                    this.proration = proration
                }

                /**
                 * The frequency at which the recurring commits will be created. If not provided: -
                 * The commits will be created on the usage invoice frequency. If provided: - The
                 * period defined in the duration will correspond to this frequency. - Commits will
                 * be created aligned with the recurring commit's starting_at rather than the usage
                 * invoice dates.
                 */
                fun recurrenceFrequency(recurrenceFrequency: RecurrenceFrequency) =
                    recurrenceFrequency(JsonField.of(recurrenceFrequency))

                /**
                 * The frequency at which the recurring commits will be created. If not provided: -
                 * The commits will be created on the usage invoice frequency. If provided: - The
                 * period defined in the duration will correspond to this frequency. - Commits will
                 * be created aligned with the recurring commit's starting_at rather than the usage
                 * invoice dates.
                 */
                fun recurrenceFrequency(recurrenceFrequency: JsonField<RecurrenceFrequency>) =
                    apply {
                        this.recurrenceFrequency = recurrenceFrequency
                    }

                /**
                 * Will be passed down to the individual commits. This controls how much of an
                 * individual unexpired commit will roll over upon contract transition. Must be
                 * between 0 and 1.
                 */
                fun rolloverFraction(rolloverFraction: Double) =
                    rolloverFraction(JsonField.of(rolloverFraction))

                /**
                 * Will be passed down to the individual commits. This controls how much of an
                 * individual unexpired commit will roll over upon contract transition. Must be
                 * between 0 and 1.
                 */
                fun rolloverFraction(rolloverFraction: JsonField<Double>) = apply {
                    this.rolloverFraction = rolloverFraction
                }

                /**
                 * List of filters that determine what kind of customer usage draws down a commit or
                 * credit. A customer's usage needs to meet the condition of at least one of the
                 * specifiers to contribute to a commit's or credit's drawdown.
                 */
                fun specifiers(specifiers: List<CommitSpecifier>) =
                    specifiers(JsonField.of(specifiers))

                /**
                 * List of filters that determine what kind of customer usage draws down a commit or
                 * credit. A customer's usage needs to meet the condition of at least one of the
                 * specifiers to contribute to a commit's or credit's drawdown.
                 */
                fun specifiers(specifiers: JsonField<List<CommitSpecifier>>) = apply {
                    this.specifiers = specifiers.map { it.toMutableList() }
                }

                /**
                 * List of filters that determine what kind of customer usage draws down a commit or
                 * credit. A customer's usage needs to meet the condition of at least one of the
                 * specifiers to contribute to a commit's or credit's drawdown.
                 */
                fun addSpecifier(specifier: CommitSpecifier) = apply {
                    specifiers =
                        (specifiers ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(specifier)
                        }
                }

                /** Attach a subscription to the recurring commit/credit. */
                fun subscriptionConfig(subscriptionConfig: RecurringCommitSubscriptionConfig) =
                    subscriptionConfig(JsonField.of(subscriptionConfig))

                /** Attach a subscription to the recurring commit/credit. */
                fun subscriptionConfig(
                    subscriptionConfig: JsonField<RecurringCommitSubscriptionConfig>
                ) = apply { this.subscriptionConfig = subscriptionConfig }

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

                fun build(): AddRecurringCommit =
                    AddRecurringCommit(
                        checkRequired("id", id),
                        checkRequired("accessAmount", accessAmount),
                        checkRequired("commitDuration", commitDuration),
                        checkRequired("priority", priority),
                        checkRequired("product", product),
                        checkRequired("rateType", rateType),
                        checkRequired("startingAt", startingAt),
                        (applicableProductIds ?: JsonMissing.of()).map { it.toImmutable() },
                        (applicableProductTags ?: JsonMissing.of()).map { it.toImmutable() },
                        contract,
                        description,
                        endingBefore,
                        hierarchyConfiguration,
                        invoiceAmount,
                        name,
                        netsuiteSalesOrderId,
                        proration,
                        recurrenceFrequency,
                        rolloverFraction,
                        (specifiers ?: JsonMissing.of()).map { it.toImmutable() },
                        subscriptionConfig,
                        additionalProperties.toImmutable(),
                    )
            }

            /** The amount of commit to grant. */
            @NoAutoDetect
            class AccessAmount
            @JsonCreator
            private constructor(
                @JsonProperty("credit_type_id")
                @ExcludeMissing
                private val creditTypeId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("unit_price")
                @ExcludeMissing
                private val unitPrice: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("quantity")
                @ExcludeMissing
                private val quantity: JsonField<Double> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun creditTypeId(): String = creditTypeId.getRequired("credit_type_id")

                fun unitPrice(): Double = unitPrice.getRequired("unit_price")

                fun quantity(): Optional<Double> =
                    Optional.ofNullable(quantity.getNullable("quantity"))

                @JsonProperty("credit_type_id")
                @ExcludeMissing
                fun _creditTypeId(): JsonField<String> = creditTypeId

                @JsonProperty("unit_price")
                @ExcludeMissing
                fun _unitPrice(): JsonField<Double> = unitPrice

                @JsonProperty("quantity")
                @ExcludeMissing
                fun _quantity(): JsonField<Double> = quantity

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): AccessAmount = apply {
                    if (validated) {
                        return@apply
                    }

                    creditTypeId()
                    unitPrice()
                    quantity()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [AccessAmount]. */
                class Builder internal constructor() {

                    private var creditTypeId: JsonField<String>? = null
                    private var unitPrice: JsonField<Double>? = null
                    private var quantity: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(accessAmount: AccessAmount) = apply {
                        creditTypeId = accessAmount.creditTypeId
                        unitPrice = accessAmount.unitPrice
                        quantity = accessAmount.quantity
                        additionalProperties = accessAmount.additionalProperties.toMutableMap()
                    }

                    fun creditTypeId(creditTypeId: String) =
                        creditTypeId(JsonField.of(creditTypeId))

                    fun creditTypeId(creditTypeId: JsonField<String>) = apply {
                        this.creditTypeId = creditTypeId
                    }

                    fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

                    fun unitPrice(unitPrice: JsonField<Double>) = apply {
                        this.unitPrice = unitPrice
                    }

                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

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

                    fun build(): AccessAmount =
                        AccessAmount(
                            checkRequired("creditTypeId", creditTypeId),
                            checkRequired("unitPrice", unitPrice),
                            quantity,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is AccessAmount && creditTypeId == other.creditTypeId && unitPrice == other.unitPrice && quantity == other.quantity && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(creditTypeId, unitPrice, quantity, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AccessAmount{creditTypeId=$creditTypeId, unitPrice=$unitPrice, quantity=$quantity, additionalProperties=$additionalProperties}"
            }

            /** The amount of time the created commits will be valid for */
            @NoAutoDetect
            class CommitDuration
            @JsonCreator
            private constructor(
                @JsonProperty("value")
                @ExcludeMissing
                private val value: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("unit")
                @ExcludeMissing
                private val unit: JsonField<Unit> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun value(): Double = value.getRequired("value")

                fun unit(): Optional<Unit> = Optional.ofNullable(unit.getNullable("unit"))

                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

                @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<Unit> = unit

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): CommitDuration = apply {
                    if (validated) {
                        return@apply
                    }

                    value()
                    unit()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [CommitDuration]. */
                class Builder internal constructor() {

                    private var value: JsonField<Double>? = null
                    private var unit: JsonField<Unit> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(commitDuration: CommitDuration) = apply {
                        value = commitDuration.value
                        unit = commitDuration.unit
                        additionalProperties = commitDuration.additionalProperties.toMutableMap()
                    }

                    fun value(value: Double) = value(JsonField.of(value))

                    fun value(value: JsonField<Double>) = apply { this.value = value }

                    fun unit(unit: Unit) = unit(JsonField.of(unit))

                    fun unit(unit: JsonField<Unit>) = apply { this.unit = unit }

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

                    fun build(): CommitDuration =
                        CommitDuration(
                            checkRequired("value", value),
                            unit,
                            additionalProperties.toImmutable(),
                        )
                }

                class Unit @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

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

                        @JvmField val PERIODS = of("PERIODS")

                        @JvmStatic fun of(value: String) = Unit(JsonField.of(value))
                    }

                    /** An enum containing [Unit]'s known values. */
                    enum class Known {
                        PERIODS
                    }

                    /**
                     * An enum containing [Unit]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Unit] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        PERIODS,
                        /**
                         * An enum member indicating that [Unit] was instantiated with an unknown
                         * value.
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
                            PERIODS -> Value.PERIODS
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
                            PERIODS -> Known.PERIODS
                            else -> throw MetronomeInvalidDataException("Unknown Unit: $value")
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

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Unit && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is CommitDuration && value == other.value && unit == other.unit && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(value, unit, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CommitDuration{value=$value, unit=$unit, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class Product
            @JsonCreator
            private constructor(
                @JsonProperty("id")
                @ExcludeMissing
                private val id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name")
                @ExcludeMissing
                private val name: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun id(): String = id.getRequired("id")

                fun name(): String = name.getRequired("name")

                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Product = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    name()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Product]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var name: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(product: Product) = apply {
                        id = product.id
                        name = product.name
                        additionalProperties = product.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun name(name: String) = name(JsonField.of(name))

                    fun name(name: JsonField<String>) = apply { this.name = name }

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

                    fun build(): Product =
                        Product(
                            checkRequired("id", id),
                            checkRequired("name", name),
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Product && id == other.id && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, name, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Product{id=$id, name=$name, additionalProperties=$additionalProperties}"
            }

            /** Whether the created commits will use the commit rate or list rate */
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    COMMIT_RATE,
                    LIST_RATE,
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
                 * @throws MetronomeInvalidDataException if this class instance's value is a not a
                 *   known member.
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
                 * @throws MetronomeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        MetronomeInvalidDataException("Value is not a String")
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is RateType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            @NoAutoDetect
            class Contract
            @JsonCreator
            private constructor(
                @JsonProperty("id")
                @ExcludeMissing
                private val id: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun id(): String = id.getRequired("id")

                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Contract = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Contract]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(contract: Contract) = apply {
                        id = contract.id
                        additionalProperties = contract.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    fun id(id: JsonField<String>) = apply { this.id = id }

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

                    fun build(): Contract =
                        Contract(checkRequired("id", id), additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Contract && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Contract{id=$id, additionalProperties=$additionalProperties}"
            }

            /** The amount the customer should be billed for the commit. Not required. */
            @NoAutoDetect
            class InvoiceAmount
            @JsonCreator
            private constructor(
                @JsonProperty("credit_type_id")
                @ExcludeMissing
                private val creditTypeId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("quantity")
                @ExcludeMissing
                private val quantity: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("unit_price")
                @ExcludeMissing
                private val unitPrice: JsonField<Double> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun creditTypeId(): String = creditTypeId.getRequired("credit_type_id")

                fun quantity(): Double = quantity.getRequired("quantity")

                fun unitPrice(): Double = unitPrice.getRequired("unit_price")

                @JsonProperty("credit_type_id")
                @ExcludeMissing
                fun _creditTypeId(): JsonField<String> = creditTypeId

                @JsonProperty("quantity")
                @ExcludeMissing
                fun _quantity(): JsonField<Double> = quantity

                @JsonProperty("unit_price")
                @ExcludeMissing
                fun _unitPrice(): JsonField<Double> = unitPrice

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): InvoiceAmount = apply {
                    if (validated) {
                        return@apply
                    }

                    creditTypeId()
                    quantity()
                    unitPrice()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [InvoiceAmount]. */
                class Builder internal constructor() {

                    private var creditTypeId: JsonField<String>? = null
                    private var quantity: JsonField<Double>? = null
                    private var unitPrice: JsonField<Double>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(invoiceAmount: InvoiceAmount) = apply {
                        creditTypeId = invoiceAmount.creditTypeId
                        quantity = invoiceAmount.quantity
                        unitPrice = invoiceAmount.unitPrice
                        additionalProperties = invoiceAmount.additionalProperties.toMutableMap()
                    }

                    fun creditTypeId(creditTypeId: String) =
                        creditTypeId(JsonField.of(creditTypeId))

                    fun creditTypeId(creditTypeId: JsonField<String>) = apply {
                        this.creditTypeId = creditTypeId
                    }

                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                    fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

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

                    fun build(): InvoiceAmount =
                        InvoiceAmount(
                            checkRequired("creditTypeId", creditTypeId),
                            checkRequired("quantity", quantity),
                            checkRequired("unitPrice", unitPrice),
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is InvoiceAmount && creditTypeId == other.creditTypeId && quantity == other.quantity && unitPrice == other.unitPrice && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(creditTypeId, quantity, unitPrice, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "InvoiceAmount{creditTypeId=$creditTypeId, quantity=$quantity, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
            }

            /**
             * Determines whether the first and last commit will be prorated. If not provided, the
             * default is FIRST_AND_LAST (i.e. prorate both the first and last commits).
             */
            class Proration @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val FIRST = of("FIRST")

                    @JvmField val LAST = of("LAST")

                    @JvmField val FIRST_AND_LAST = of("FIRST_AND_LAST")

                    @JvmStatic fun of(value: String) = Proration(JsonField.of(value))
                }

                /** An enum containing [Proration]'s known values. */
                enum class Known {
                    NONE,
                    FIRST,
                    LAST,
                    FIRST_AND_LAST,
                }

                /**
                 * An enum containing [Proration]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Proration] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    NONE,
                    FIRST,
                    LAST,
                    FIRST_AND_LAST,
                    /**
                     * An enum member indicating that [Proration] was instantiated with an unknown
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
                        FIRST -> Value.FIRST
                        LAST -> Value.LAST
                        FIRST_AND_LAST -> Value.FIRST_AND_LAST
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
                        FIRST -> Known.FIRST
                        LAST -> Known.LAST
                        FIRST_AND_LAST -> Known.FIRST_AND_LAST
                        else -> throw MetronomeInvalidDataException("Unknown Proration: $value")
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Proration && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * The frequency at which the recurring commits will be created. If not provided: - The
             * commits will be created on the usage invoice frequency. If provided: - The period
             * defined in the duration will correspond to this frequency. - Commits will be created
             * aligned with the recurring commit's starting_at rather than the usage invoice dates.
             */
            class RecurrenceFrequency
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

                    @JvmStatic fun of(value: String) = RecurrenceFrequency(JsonField.of(value))
                }

                /** An enum containing [RecurrenceFrequency]'s known values. */
                enum class Known {
                    MONTHLY,
                    QUARTERLY,
                    ANNUAL,
                    WEEKLY,
                }

                /**
                 * An enum containing [RecurrenceFrequency]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [RecurrenceFrequency] can contain an unknown value in a couple of
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
                     * An enum member indicating that [RecurrenceFrequency] was instantiated with an
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
                            throw MetronomeInvalidDataException(
                                "Unknown RecurrenceFrequency: $value"
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is RecurrenceFrequency && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AddRecurringCommit && id == other.id && accessAmount == other.accessAmount && commitDuration == other.commitDuration && priority == other.priority && product == other.product && rateType == other.rateType && startingAt == other.startingAt && applicableProductIds == other.applicableProductIds && applicableProductTags == other.applicableProductTags && contract == other.contract && description == other.description && endingBefore == other.endingBefore && hierarchyConfiguration == other.hierarchyConfiguration && invoiceAmount == other.invoiceAmount && name == other.name && netsuiteSalesOrderId == other.netsuiteSalesOrderId && proration == other.proration && recurrenceFrequency == other.recurrenceFrequency && rolloverFraction == other.rolloverFraction && specifiers == other.specifiers && subscriptionConfig == other.subscriptionConfig && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, accessAmount, commitDuration, priority, product, rateType, startingAt, applicableProductIds, applicableProductTags, contract, description, endingBefore, hierarchyConfiguration, invoiceAmount, name, netsuiteSalesOrderId, proration, recurrenceFrequency, rolloverFraction, specifiers, subscriptionConfig, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AddRecurringCommit{id=$id, accessAmount=$accessAmount, commitDuration=$commitDuration, priority=$priority, product=$product, rateType=$rateType, startingAt=$startingAt, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, contract=$contract, description=$description, endingBefore=$endingBefore, hierarchyConfiguration=$hierarchyConfiguration, invoiceAmount=$invoiceAmount, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, proration=$proration, recurrenceFrequency=$recurrenceFrequency, rolloverFraction=$rolloverFraction, specifiers=$specifiers, subscriptionConfig=$subscriptionConfig, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class AddRecurringCredit
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("access_amount")
            @ExcludeMissing
            private val accessAmount: JsonField<AccessAmount> = JsonMissing.of(),
            @JsonProperty("commit_duration")
            @ExcludeMissing
            private val commitDuration: JsonField<CommitDuration> = JsonMissing.of(),
            @JsonProperty("priority")
            @ExcludeMissing
            private val priority: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("product")
            @ExcludeMissing
            private val product: JsonField<Product> = JsonMissing.of(),
            @JsonProperty("rate_type")
            @ExcludeMissing
            private val rateType: JsonField<RateType> = JsonMissing.of(),
            @JsonProperty("starting_at")
            @ExcludeMissing
            private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("applicable_product_ids")
            @ExcludeMissing
            private val applicableProductIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("applicable_product_tags")
            @ExcludeMissing
            private val applicableProductTags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("contract")
            @ExcludeMissing
            private val contract: JsonField<Contract> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            private val description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ending_before")
            @ExcludeMissing
            private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("hierarchy_configuration")
            @ExcludeMissing
            private val hierarchyConfiguration: JsonField<CommitHierarchyConfiguration> =
                JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("netsuite_sales_order_id")
            @ExcludeMissing
            private val netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("proration")
            @ExcludeMissing
            private val proration: JsonField<Proration> = JsonMissing.of(),
            @JsonProperty("recurrence_frequency")
            @ExcludeMissing
            private val recurrenceFrequency: JsonField<RecurrenceFrequency> = JsonMissing.of(),
            @JsonProperty("rollover_fraction")
            @ExcludeMissing
            private val rolloverFraction: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("specifiers")
            @ExcludeMissing
            private val specifiers: JsonField<List<CommitSpecifier>> = JsonMissing.of(),
            @JsonProperty("subscription_config")
            @ExcludeMissing
            private val subscriptionConfig: JsonField<RecurringCommitSubscriptionConfig> =
                JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            /** The amount of commit to grant. */
            fun accessAmount(): AccessAmount = accessAmount.getRequired("access_amount")

            /** The amount of time the created commits will be valid for */
            fun commitDuration(): CommitDuration = commitDuration.getRequired("commit_duration")

            /** Will be passed down to the individual commits */
            fun priority(): Double = priority.getRequired("priority")

            fun product(): Product = product.getRequired("product")

            /** Whether the created commits will use the commit rate or list rate */
            fun rateType(): RateType = rateType.getRequired("rate_type")

            /** Determines the start time for the first commit */
            fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

            /** Will be passed down to the individual commits */
            fun applicableProductIds(): Optional<List<String>> =
                Optional.ofNullable(applicableProductIds.getNullable("applicable_product_ids"))

            /** Will be passed down to the individual commits */
            fun applicableProductTags(): Optional<List<String>> =
                Optional.ofNullable(applicableProductTags.getNullable("applicable_product_tags"))

            fun contract(): Optional<Contract> =
                Optional.ofNullable(contract.getNullable("contract"))

            /** Will be passed down to the individual commits */
            fun description(): Optional<String> =
                Optional.ofNullable(description.getNullable("description"))

            /** Determines when the contract will stop creating recurring commits. Optional */
            fun endingBefore(): Optional<OffsetDateTime> =
                Optional.ofNullable(endingBefore.getNullable("ending_before"))

            /** Optional configuration for recurring credit hierarchy access control */
            fun hierarchyConfiguration(): Optional<CommitHierarchyConfiguration> =
                Optional.ofNullable(hierarchyConfiguration.getNullable("hierarchy_configuration"))

            /** Displayed on invoices. Will be passed through to the individual commits */
            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            /** Will be passed down to the individual commits */
            fun netsuiteSalesOrderId(): Optional<String> =
                Optional.ofNullable(netsuiteSalesOrderId.getNullable("netsuite_sales_order_id"))

            /**
             * Determines whether the first and last commit will be prorated. If not provided, the
             * default is FIRST_AND_LAST (i.e. prorate both the first and last commits).
             */
            fun proration(): Optional<Proration> =
                Optional.ofNullable(proration.getNullable("proration"))

            /**
             * The frequency at which the recurring commits will be created. If not provided: - The
             * commits will be created on the usage invoice frequency. If provided: - The period
             * defined in the duration will correspond to this frequency. - Commits will be created
             * aligned with the recurring commit's starting_at rather than the usage invoice dates.
             */
            fun recurrenceFrequency(): Optional<RecurrenceFrequency> =
                Optional.ofNullable(recurrenceFrequency.getNullable("recurrence_frequency"))

            /**
             * Will be passed down to the individual commits. This controls how much of an
             * individual unexpired commit will roll over upon contract transition. Must be between
             * 0 and 1.
             */
            fun rolloverFraction(): Optional<Double> =
                Optional.ofNullable(rolloverFraction.getNullable("rollover_fraction"))

            /**
             * List of filters that determine what kind of customer usage draws down a commit or
             * credit. A customer's usage needs to meet the condition of at least one of the
             * specifiers to contribute to a commit's or credit's drawdown.
             */
            fun specifiers(): Optional<List<CommitSpecifier>> =
                Optional.ofNullable(specifiers.getNullable("specifiers"))

            /** Attach a subscription to the recurring commit/credit. */
            fun subscriptionConfig(): Optional<RecurringCommitSubscriptionConfig> =
                Optional.ofNullable(subscriptionConfig.getNullable("subscription_config"))

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /** The amount of commit to grant. */
            @JsonProperty("access_amount")
            @ExcludeMissing
            fun _accessAmount(): JsonField<AccessAmount> = accessAmount

            /** The amount of time the created commits will be valid for */
            @JsonProperty("commit_duration")
            @ExcludeMissing
            fun _commitDuration(): JsonField<CommitDuration> = commitDuration

            /** Will be passed down to the individual commits */
            @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

            @JsonProperty("product") @ExcludeMissing fun _product(): JsonField<Product> = product

            /** Whether the created commits will use the commit rate or list rate */
            @JsonProperty("rate_type")
            @ExcludeMissing
            fun _rateType(): JsonField<RateType> = rateType

            /** Determines the start time for the first commit */
            @JsonProperty("starting_at")
            @ExcludeMissing
            fun _startingAt(): JsonField<OffsetDateTime> = startingAt

            /** Will be passed down to the individual commits */
            @JsonProperty("applicable_product_ids")
            @ExcludeMissing
            fun _applicableProductIds(): JsonField<List<String>> = applicableProductIds

            /** Will be passed down to the individual commits */
            @JsonProperty("applicable_product_tags")
            @ExcludeMissing
            fun _applicableProductTags(): JsonField<List<String>> = applicableProductTags

            @JsonProperty("contract")
            @ExcludeMissing
            fun _contract(): JsonField<Contract> = contract

            /** Will be passed down to the individual commits */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /** Determines when the contract will stop creating recurring commits. Optional */
            @JsonProperty("ending_before")
            @ExcludeMissing
            fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

            /** Optional configuration for recurring credit hierarchy access control */
            @JsonProperty("hierarchy_configuration")
            @ExcludeMissing
            fun _hierarchyConfiguration(): JsonField<CommitHierarchyConfiguration> =
                hierarchyConfiguration

            /** Displayed on invoices. Will be passed through to the individual commits */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /** Will be passed down to the individual commits */
            @JsonProperty("netsuite_sales_order_id")
            @ExcludeMissing
            fun _netsuiteSalesOrderId(): JsonField<String> = netsuiteSalesOrderId

            /**
             * Determines whether the first and last commit will be prorated. If not provided, the
             * default is FIRST_AND_LAST (i.e. prorate both the first and last commits).
             */
            @JsonProperty("proration")
            @ExcludeMissing
            fun _proration(): JsonField<Proration> = proration

            /**
             * The frequency at which the recurring commits will be created. If not provided: - The
             * commits will be created on the usage invoice frequency. If provided: - The period
             * defined in the duration will correspond to this frequency. - Commits will be created
             * aligned with the recurring commit's starting_at rather than the usage invoice dates.
             */
            @JsonProperty("recurrence_frequency")
            @ExcludeMissing
            fun _recurrenceFrequency(): JsonField<RecurrenceFrequency> = recurrenceFrequency

            /**
             * Will be passed down to the individual commits. This controls how much of an
             * individual unexpired commit will roll over upon contract transition. Must be between
             * 0 and 1.
             */
            @JsonProperty("rollover_fraction")
            @ExcludeMissing
            fun _rolloverFraction(): JsonField<Double> = rolloverFraction

            /**
             * List of filters that determine what kind of customer usage draws down a commit or
             * credit. A customer's usage needs to meet the condition of at least one of the
             * specifiers to contribute to a commit's or credit's drawdown.
             */
            @JsonProperty("specifiers")
            @ExcludeMissing
            fun _specifiers(): JsonField<List<CommitSpecifier>> = specifiers

            /** Attach a subscription to the recurring commit/credit. */
            @JsonProperty("subscription_config")
            @ExcludeMissing
            fun _subscriptionConfig(): JsonField<RecurringCommitSubscriptionConfig> =
                subscriptionConfig

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): AddRecurringCredit = apply {
                if (validated) {
                    return@apply
                }

                id()
                accessAmount().validate()
                commitDuration().validate()
                priority()
                product().validate()
                rateType()
                startingAt()
                applicableProductIds()
                applicableProductTags()
                contract().ifPresent { it.validate() }
                description()
                endingBefore()
                hierarchyConfiguration().ifPresent { it.validate() }
                name()
                netsuiteSalesOrderId()
                proration()
                recurrenceFrequency()
                rolloverFraction()
                specifiers().ifPresent { it.forEach { it.validate() } }
                subscriptionConfig().ifPresent { it.validate() }
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AddRecurringCredit]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var accessAmount: JsonField<AccessAmount>? = null
                private var commitDuration: JsonField<CommitDuration>? = null
                private var priority: JsonField<Double>? = null
                private var product: JsonField<Product>? = null
                private var rateType: JsonField<RateType>? = null
                private var startingAt: JsonField<OffsetDateTime>? = null
                private var applicableProductIds: JsonField<MutableList<String>>? = null
                private var applicableProductTags: JsonField<MutableList<String>>? = null
                private var contract: JsonField<Contract> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
                private var hierarchyConfiguration: JsonField<CommitHierarchyConfiguration> =
                    JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
                private var proration: JsonField<Proration> = JsonMissing.of()
                private var recurrenceFrequency: JsonField<RecurrenceFrequency> = JsonMissing.of()
                private var rolloverFraction: JsonField<Double> = JsonMissing.of()
                private var specifiers: JsonField<MutableList<CommitSpecifier>>? = null
                private var subscriptionConfig: JsonField<RecurringCommitSubscriptionConfig> =
                    JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(addRecurringCredit: AddRecurringCredit) = apply {
                    id = addRecurringCredit.id
                    accessAmount = addRecurringCredit.accessAmount
                    commitDuration = addRecurringCredit.commitDuration
                    priority = addRecurringCredit.priority
                    product = addRecurringCredit.product
                    rateType = addRecurringCredit.rateType
                    startingAt = addRecurringCredit.startingAt
                    applicableProductIds =
                        addRecurringCredit.applicableProductIds.map { it.toMutableList() }
                    applicableProductTags =
                        addRecurringCredit.applicableProductTags.map { it.toMutableList() }
                    contract = addRecurringCredit.contract
                    description = addRecurringCredit.description
                    endingBefore = addRecurringCredit.endingBefore
                    hierarchyConfiguration = addRecurringCredit.hierarchyConfiguration
                    name = addRecurringCredit.name
                    netsuiteSalesOrderId = addRecurringCredit.netsuiteSalesOrderId
                    proration = addRecurringCredit.proration
                    recurrenceFrequency = addRecurringCredit.recurrenceFrequency
                    rolloverFraction = addRecurringCredit.rolloverFraction
                    specifiers = addRecurringCredit.specifiers.map { it.toMutableList() }
                    subscriptionConfig = addRecurringCredit.subscriptionConfig
                    additionalProperties = addRecurringCredit.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                /** The amount of commit to grant. */
                fun accessAmount(accessAmount: AccessAmount) =
                    accessAmount(JsonField.of(accessAmount))

                /** The amount of commit to grant. */
                fun accessAmount(accessAmount: JsonField<AccessAmount>) = apply {
                    this.accessAmount = accessAmount
                }

                /** The amount of time the created commits will be valid for */
                fun commitDuration(commitDuration: CommitDuration) =
                    commitDuration(JsonField.of(commitDuration))

                /** The amount of time the created commits will be valid for */
                fun commitDuration(commitDuration: JsonField<CommitDuration>) = apply {
                    this.commitDuration = commitDuration
                }

                /** Will be passed down to the individual commits */
                fun priority(priority: Double) = priority(JsonField.of(priority))

                /** Will be passed down to the individual commits */
                fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

                fun product(product: Product) = product(JsonField.of(product))

                fun product(product: JsonField<Product>) = apply { this.product = product }

                /** Whether the created commits will use the commit rate or list rate */
                fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

                /** Whether the created commits will use the commit rate or list rate */
                fun rateType(rateType: JsonField<RateType>) = apply { this.rateType = rateType }

                /** Determines the start time for the first commit */
                fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

                /** Determines the start time for the first commit */
                fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                    this.startingAt = startingAt
                }

                /** Will be passed down to the individual commits */
                fun applicableProductIds(applicableProductIds: List<String>) =
                    applicableProductIds(JsonField.of(applicableProductIds))

                /** Will be passed down to the individual commits */
                fun applicableProductIds(applicableProductIds: JsonField<List<String>>) = apply {
                    this.applicableProductIds = applicableProductIds.map { it.toMutableList() }
                }

                /** Will be passed down to the individual commits */
                fun addApplicableProductId(applicableProductId: String) = apply {
                    applicableProductIds =
                        (applicableProductIds ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(applicableProductId)
                        }
                }

                /** Will be passed down to the individual commits */
                fun applicableProductTags(applicableProductTags: List<String>) =
                    applicableProductTags(JsonField.of(applicableProductTags))

                /** Will be passed down to the individual commits */
                fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
                    this.applicableProductTags = applicableProductTags.map { it.toMutableList() }
                }

                /** Will be passed down to the individual commits */
                fun addApplicableProductTag(applicableProductTag: String) = apply {
                    applicableProductTags =
                        (applicableProductTags ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(applicableProductTag)
                        }
                }

                fun contract(contract: Contract) = contract(JsonField.of(contract))

                fun contract(contract: JsonField<Contract>) = apply { this.contract = contract }

                /** Will be passed down to the individual commits */
                fun description(description: String) = description(JsonField.of(description))

                /** Will be passed down to the individual commits */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /** Determines when the contract will stop creating recurring commits. Optional */
                fun endingBefore(endingBefore: OffsetDateTime) =
                    endingBefore(JsonField.of(endingBefore))

                /** Determines when the contract will stop creating recurring commits. Optional */
                fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                    this.endingBefore = endingBefore
                }

                /** Optional configuration for recurring credit hierarchy access control */
                fun hierarchyConfiguration(hierarchyConfiguration: CommitHierarchyConfiguration) =
                    hierarchyConfiguration(JsonField.of(hierarchyConfiguration))

                /** Optional configuration for recurring credit hierarchy access control */
                fun hierarchyConfiguration(
                    hierarchyConfiguration: JsonField<CommitHierarchyConfiguration>
                ) = apply { this.hierarchyConfiguration = hierarchyConfiguration }

                /** Displayed on invoices. Will be passed through to the individual commits */
                fun name(name: String) = name(JsonField.of(name))

                /** Displayed on invoices. Will be passed through to the individual commits */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** Will be passed down to the individual commits */
                fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
                    netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

                /** Will be passed down to the individual commits */
                fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
                    this.netsuiteSalesOrderId = netsuiteSalesOrderId
                }

                /**
                 * Determines whether the first and last commit will be prorated. If not provided,
                 * the default is FIRST_AND_LAST (i.e. prorate both the first and last commits).
                 */
                fun proration(proration: Proration) = proration(JsonField.of(proration))

                /**
                 * Determines whether the first and last commit will be prorated. If not provided,
                 * the default is FIRST_AND_LAST (i.e. prorate both the first and last commits).
                 */
                fun proration(proration: JsonField<Proration>) = apply {
                    this.proration = proration
                }

                /**
                 * The frequency at which the recurring commits will be created. If not provided: -
                 * The commits will be created on the usage invoice frequency. If provided: - The
                 * period defined in the duration will correspond to this frequency. - Commits will
                 * be created aligned with the recurring commit's starting_at rather than the usage
                 * invoice dates.
                 */
                fun recurrenceFrequency(recurrenceFrequency: RecurrenceFrequency) =
                    recurrenceFrequency(JsonField.of(recurrenceFrequency))

                /**
                 * The frequency at which the recurring commits will be created. If not provided: -
                 * The commits will be created on the usage invoice frequency. If provided: - The
                 * period defined in the duration will correspond to this frequency. - Commits will
                 * be created aligned with the recurring commit's starting_at rather than the usage
                 * invoice dates.
                 */
                fun recurrenceFrequency(recurrenceFrequency: JsonField<RecurrenceFrequency>) =
                    apply {
                        this.recurrenceFrequency = recurrenceFrequency
                    }

                /**
                 * Will be passed down to the individual commits. This controls how much of an
                 * individual unexpired commit will roll over upon contract transition. Must be
                 * between 0 and 1.
                 */
                fun rolloverFraction(rolloverFraction: Double) =
                    rolloverFraction(JsonField.of(rolloverFraction))

                /**
                 * Will be passed down to the individual commits. This controls how much of an
                 * individual unexpired commit will roll over upon contract transition. Must be
                 * between 0 and 1.
                 */
                fun rolloverFraction(rolloverFraction: JsonField<Double>) = apply {
                    this.rolloverFraction = rolloverFraction
                }

                /**
                 * List of filters that determine what kind of customer usage draws down a commit or
                 * credit. A customer's usage needs to meet the condition of at least one of the
                 * specifiers to contribute to a commit's or credit's drawdown.
                 */
                fun specifiers(specifiers: List<CommitSpecifier>) =
                    specifiers(JsonField.of(specifiers))

                /**
                 * List of filters that determine what kind of customer usage draws down a commit or
                 * credit. A customer's usage needs to meet the condition of at least one of the
                 * specifiers to contribute to a commit's or credit's drawdown.
                 */
                fun specifiers(specifiers: JsonField<List<CommitSpecifier>>) = apply {
                    this.specifiers = specifiers.map { it.toMutableList() }
                }

                /**
                 * List of filters that determine what kind of customer usage draws down a commit or
                 * credit. A customer's usage needs to meet the condition of at least one of the
                 * specifiers to contribute to a commit's or credit's drawdown.
                 */
                fun addSpecifier(specifier: CommitSpecifier) = apply {
                    specifiers =
                        (specifiers ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(specifier)
                        }
                }

                /** Attach a subscription to the recurring commit/credit. */
                fun subscriptionConfig(subscriptionConfig: RecurringCommitSubscriptionConfig) =
                    subscriptionConfig(JsonField.of(subscriptionConfig))

                /** Attach a subscription to the recurring commit/credit. */
                fun subscriptionConfig(
                    subscriptionConfig: JsonField<RecurringCommitSubscriptionConfig>
                ) = apply { this.subscriptionConfig = subscriptionConfig }

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

                fun build(): AddRecurringCredit =
                    AddRecurringCredit(
                        checkRequired("id", id),
                        checkRequired("accessAmount", accessAmount),
                        checkRequired("commitDuration", commitDuration),
                        checkRequired("priority", priority),
                        checkRequired("product", product),
                        checkRequired("rateType", rateType),
                        checkRequired("startingAt", startingAt),
                        (applicableProductIds ?: JsonMissing.of()).map { it.toImmutable() },
                        (applicableProductTags ?: JsonMissing.of()).map { it.toImmutable() },
                        contract,
                        description,
                        endingBefore,
                        hierarchyConfiguration,
                        name,
                        netsuiteSalesOrderId,
                        proration,
                        recurrenceFrequency,
                        rolloverFraction,
                        (specifiers ?: JsonMissing.of()).map { it.toImmutable() },
                        subscriptionConfig,
                        additionalProperties.toImmutable(),
                    )
            }

            /** The amount of commit to grant. */
            @NoAutoDetect
            class AccessAmount
            @JsonCreator
            private constructor(
                @JsonProperty("credit_type_id")
                @ExcludeMissing
                private val creditTypeId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("unit_price")
                @ExcludeMissing
                private val unitPrice: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("quantity")
                @ExcludeMissing
                private val quantity: JsonField<Double> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun creditTypeId(): String = creditTypeId.getRequired("credit_type_id")

                fun unitPrice(): Double = unitPrice.getRequired("unit_price")

                fun quantity(): Optional<Double> =
                    Optional.ofNullable(quantity.getNullable("quantity"))

                @JsonProperty("credit_type_id")
                @ExcludeMissing
                fun _creditTypeId(): JsonField<String> = creditTypeId

                @JsonProperty("unit_price")
                @ExcludeMissing
                fun _unitPrice(): JsonField<Double> = unitPrice

                @JsonProperty("quantity")
                @ExcludeMissing
                fun _quantity(): JsonField<Double> = quantity

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): AccessAmount = apply {
                    if (validated) {
                        return@apply
                    }

                    creditTypeId()
                    unitPrice()
                    quantity()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [AccessAmount]. */
                class Builder internal constructor() {

                    private var creditTypeId: JsonField<String>? = null
                    private var unitPrice: JsonField<Double>? = null
                    private var quantity: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(accessAmount: AccessAmount) = apply {
                        creditTypeId = accessAmount.creditTypeId
                        unitPrice = accessAmount.unitPrice
                        quantity = accessAmount.quantity
                        additionalProperties = accessAmount.additionalProperties.toMutableMap()
                    }

                    fun creditTypeId(creditTypeId: String) =
                        creditTypeId(JsonField.of(creditTypeId))

                    fun creditTypeId(creditTypeId: JsonField<String>) = apply {
                        this.creditTypeId = creditTypeId
                    }

                    fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

                    fun unitPrice(unitPrice: JsonField<Double>) = apply {
                        this.unitPrice = unitPrice
                    }

                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

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

                    fun build(): AccessAmount =
                        AccessAmount(
                            checkRequired("creditTypeId", creditTypeId),
                            checkRequired("unitPrice", unitPrice),
                            quantity,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is AccessAmount && creditTypeId == other.creditTypeId && unitPrice == other.unitPrice && quantity == other.quantity && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(creditTypeId, unitPrice, quantity, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AccessAmount{creditTypeId=$creditTypeId, unitPrice=$unitPrice, quantity=$quantity, additionalProperties=$additionalProperties}"
            }

            /** The amount of time the created commits will be valid for */
            @NoAutoDetect
            class CommitDuration
            @JsonCreator
            private constructor(
                @JsonProperty("value")
                @ExcludeMissing
                private val value: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("unit")
                @ExcludeMissing
                private val unit: JsonField<Unit> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun value(): Double = value.getRequired("value")

                fun unit(): Optional<Unit> = Optional.ofNullable(unit.getNullable("unit"))

                @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

                @JsonProperty("unit") @ExcludeMissing fun _unit(): JsonField<Unit> = unit

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): CommitDuration = apply {
                    if (validated) {
                        return@apply
                    }

                    value()
                    unit()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [CommitDuration]. */
                class Builder internal constructor() {

                    private var value: JsonField<Double>? = null
                    private var unit: JsonField<Unit> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(commitDuration: CommitDuration) = apply {
                        value = commitDuration.value
                        unit = commitDuration.unit
                        additionalProperties = commitDuration.additionalProperties.toMutableMap()
                    }

                    fun value(value: Double) = value(JsonField.of(value))

                    fun value(value: JsonField<Double>) = apply { this.value = value }

                    fun unit(unit: Unit) = unit(JsonField.of(unit))

                    fun unit(unit: JsonField<Unit>) = apply { this.unit = unit }

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

                    fun build(): CommitDuration =
                        CommitDuration(
                            checkRequired("value", value),
                            unit,
                            additionalProperties.toImmutable(),
                        )
                }

                class Unit @JsonCreator private constructor(private val value: JsonField<String>) :
                    Enum {

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

                        @JvmField val PERIODS = of("PERIODS")

                        @JvmStatic fun of(value: String) = Unit(JsonField.of(value))
                    }

                    /** An enum containing [Unit]'s known values. */
                    enum class Known {
                        PERIODS
                    }

                    /**
                     * An enum containing [Unit]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Unit] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        PERIODS,
                        /**
                         * An enum member indicating that [Unit] was instantiated with an unknown
                         * value.
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
                            PERIODS -> Value.PERIODS
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
                            PERIODS -> Known.PERIODS
                            else -> throw MetronomeInvalidDataException("Unknown Unit: $value")
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

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Unit && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is CommitDuration && value == other.value && unit == other.unit && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(value, unit, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "CommitDuration{value=$value, unit=$unit, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class Product
            @JsonCreator
            private constructor(
                @JsonProperty("id")
                @ExcludeMissing
                private val id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name")
                @ExcludeMissing
                private val name: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun id(): String = id.getRequired("id")

                fun name(): String = name.getRequired("name")

                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Product = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    name()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Product]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var name: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(product: Product) = apply {
                        id = product.id
                        name = product.name
                        additionalProperties = product.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun name(name: String) = name(JsonField.of(name))

                    fun name(name: JsonField<String>) = apply { this.name = name }

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

                    fun build(): Product =
                        Product(
                            checkRequired("id", id),
                            checkRequired("name", name),
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Product && id == other.id && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, name, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Product{id=$id, name=$name, additionalProperties=$additionalProperties}"
            }

            /** Whether the created commits will use the commit rate or list rate */
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    COMMIT_RATE,
                    LIST_RATE,
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
                 * @throws MetronomeInvalidDataException if this class instance's value is a not a
                 *   known member.
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
                 * @throws MetronomeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        MetronomeInvalidDataException("Value is not a String")
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is RateType && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            @NoAutoDetect
            class Contract
            @JsonCreator
            private constructor(
                @JsonProperty("id")
                @ExcludeMissing
                private val id: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun id(): String = id.getRequired("id")

                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Contract = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Contract]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(contract: Contract) = apply {
                        id = contract.id
                        additionalProperties = contract.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    fun id(id: JsonField<String>) = apply { this.id = id }

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

                    fun build(): Contract =
                        Contract(checkRequired("id", id), additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Contract && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Contract{id=$id, additionalProperties=$additionalProperties}"
            }

            /**
             * Determines whether the first and last commit will be prorated. If not provided, the
             * default is FIRST_AND_LAST (i.e. prorate both the first and last commits).
             */
            class Proration @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val FIRST = of("FIRST")

                    @JvmField val LAST = of("LAST")

                    @JvmField val FIRST_AND_LAST = of("FIRST_AND_LAST")

                    @JvmStatic fun of(value: String) = Proration(JsonField.of(value))
                }

                /** An enum containing [Proration]'s known values. */
                enum class Known {
                    NONE,
                    FIRST,
                    LAST,
                    FIRST_AND_LAST,
                }

                /**
                 * An enum containing [Proration]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Proration] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    NONE,
                    FIRST,
                    LAST,
                    FIRST_AND_LAST,
                    /**
                     * An enum member indicating that [Proration] was instantiated with an unknown
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
                        FIRST -> Value.FIRST
                        LAST -> Value.LAST
                        FIRST_AND_LAST -> Value.FIRST_AND_LAST
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
                        FIRST -> Known.FIRST
                        LAST -> Known.LAST
                        FIRST_AND_LAST -> Known.FIRST_AND_LAST
                        else -> throw MetronomeInvalidDataException("Unknown Proration: $value")
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Proration && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /**
             * The frequency at which the recurring commits will be created. If not provided: - The
             * commits will be created on the usage invoice frequency. If provided: - The period
             * defined in the duration will correspond to this frequency. - Commits will be created
             * aligned with the recurring commit's starting_at rather than the usage invoice dates.
             */
            class RecurrenceFrequency
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

                    @JvmStatic fun of(value: String) = RecurrenceFrequency(JsonField.of(value))
                }

                /** An enum containing [RecurrenceFrequency]'s known values. */
                enum class Known {
                    MONTHLY,
                    QUARTERLY,
                    ANNUAL,
                    WEEKLY,
                }

                /**
                 * An enum containing [RecurrenceFrequency]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [RecurrenceFrequency] can contain an unknown value in a couple of
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
                     * An enum member indicating that [RecurrenceFrequency] was instantiated with an
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
                            throw MetronomeInvalidDataException(
                                "Unknown RecurrenceFrequency: $value"
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is RecurrenceFrequency && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AddRecurringCredit && id == other.id && accessAmount == other.accessAmount && commitDuration == other.commitDuration && priority == other.priority && product == other.product && rateType == other.rateType && startingAt == other.startingAt && applicableProductIds == other.applicableProductIds && applicableProductTags == other.applicableProductTags && contract == other.contract && description == other.description && endingBefore == other.endingBefore && hierarchyConfiguration == other.hierarchyConfiguration && name == other.name && netsuiteSalesOrderId == other.netsuiteSalesOrderId && proration == other.proration && recurrenceFrequency == other.recurrenceFrequency && rolloverFraction == other.rolloverFraction && specifiers == other.specifiers && subscriptionConfig == other.subscriptionConfig && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, accessAmount, commitDuration, priority, product, rateType, startingAt, applicableProductIds, applicableProductTags, contract, description, endingBefore, hierarchyConfiguration, name, netsuiteSalesOrderId, proration, recurrenceFrequency, rolloverFraction, specifiers, subscriptionConfig, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AddRecurringCredit{id=$id, accessAmount=$accessAmount, commitDuration=$commitDuration, priority=$priority, product=$product, rateType=$rateType, startingAt=$startingAt, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, contract=$contract, description=$description, endingBefore=$endingBefore, hierarchyConfiguration=$hierarchyConfiguration, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, proration=$proration, recurrenceFrequency=$recurrenceFrequency, rolloverFraction=$rolloverFraction, specifiers=$specifiers, subscriptionConfig=$subscriptionConfig, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class AddResellerRoyalty
        @JsonCreator
        private constructor(
            @JsonProperty("reseller_type")
            @ExcludeMissing
            private val resellerType: JsonField<ResellerType> = JsonMissing.of(),
            @JsonProperty("applicable_product_ids")
            @ExcludeMissing
            private val applicableProductIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("applicable_product_tags")
            @ExcludeMissing
            private val applicableProductTags: JsonField<List<String>> = JsonMissing.of(),
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

            fun applicableProductIds(): Optional<List<String>> =
                Optional.ofNullable(applicableProductIds.getNullable("applicable_product_ids"))

            fun applicableProductTags(): Optional<List<String>> =
                Optional.ofNullable(applicableProductTags.getNullable("applicable_product_tags"))

            fun awsAccountNumber(): Optional<String> =
                Optional.ofNullable(awsAccountNumber.getNullable("aws_account_number"))

            fun awsOfferId(): Optional<String> =
                Optional.ofNullable(awsOfferId.getNullable("aws_offer_id"))

            fun awsPayerReferenceId(): Optional<String> =
                Optional.ofNullable(awsPayerReferenceId.getNullable("aws_payer_reference_id"))

            fun endingBefore(): Optional<OffsetDateTime> =
                Optional.ofNullable(endingBefore.getNullable("ending_before"))

            fun fraction(): Optional<Double> = Optional.ofNullable(fraction.getNullable("fraction"))

            fun gcpAccountId(): Optional<String> =
                Optional.ofNullable(gcpAccountId.getNullable("gcp_account_id"))

            fun gcpOfferId(): Optional<String> =
                Optional.ofNullable(gcpOfferId.getNullable("gcp_offer_id"))

            fun netsuiteResellerId(): Optional<String> =
                Optional.ofNullable(netsuiteResellerId.getNullable("netsuite_reseller_id"))

            fun resellerContractValue(): Optional<Double> =
                Optional.ofNullable(resellerContractValue.getNullable("reseller_contract_value"))

            fun startingAt(): Optional<OffsetDateTime> =
                Optional.ofNullable(startingAt.getNullable("starting_at"))

            @JsonProperty("reseller_type")
            @ExcludeMissing
            fun _resellerType(): JsonField<ResellerType> = resellerType

            @JsonProperty("applicable_product_ids")
            @ExcludeMissing
            fun _applicableProductIds(): JsonField<List<String>> = applicableProductIds

            @JsonProperty("applicable_product_tags")
            @ExcludeMissing
            fun _applicableProductTags(): JsonField<List<String>> = applicableProductTags

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

            @JsonProperty("fraction") @ExcludeMissing fun _fraction(): JsonField<Double> = fraction

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

            fun validate(): AddResellerRoyalty = apply {
                if (validated) {
                    return@apply
                }

                resellerType()
                applicableProductIds()
                applicableProductTags()
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

            /** A builder for [AddResellerRoyalty]. */
            class Builder internal constructor() {

                private var resellerType: JsonField<ResellerType>? = null
                private var applicableProductIds: JsonField<MutableList<String>>? = null
                private var applicableProductTags: JsonField<MutableList<String>>? = null
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
                internal fun from(addResellerRoyalty: AddResellerRoyalty) = apply {
                    resellerType = addResellerRoyalty.resellerType
                    applicableProductIds =
                        addResellerRoyalty.applicableProductIds.map { it.toMutableList() }
                    applicableProductTags =
                        addResellerRoyalty.applicableProductTags.map { it.toMutableList() }
                    awsAccountNumber = addResellerRoyalty.awsAccountNumber
                    awsOfferId = addResellerRoyalty.awsOfferId
                    awsPayerReferenceId = addResellerRoyalty.awsPayerReferenceId
                    endingBefore = addResellerRoyalty.endingBefore
                    fraction = addResellerRoyalty.fraction
                    gcpAccountId = addResellerRoyalty.gcpAccountId
                    gcpOfferId = addResellerRoyalty.gcpOfferId
                    netsuiteResellerId = addResellerRoyalty.netsuiteResellerId
                    resellerContractValue = addResellerRoyalty.resellerContractValue
                    startingAt = addResellerRoyalty.startingAt
                    additionalProperties = addResellerRoyalty.additionalProperties.toMutableMap()
                }

                fun resellerType(resellerType: ResellerType) =
                    resellerType(JsonField.of(resellerType))

                fun resellerType(resellerType: JsonField<ResellerType>) = apply {
                    this.resellerType = resellerType
                }

                fun applicableProductIds(applicableProductIds: List<String>) =
                    applicableProductIds(JsonField.of(applicableProductIds))

                fun applicableProductIds(applicableProductIds: JsonField<List<String>>) = apply {
                    this.applicableProductIds = applicableProductIds.map { it.toMutableList() }
                }

                fun addApplicableProductId(applicableProductId: String) = apply {
                    applicableProductIds =
                        (applicableProductIds ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(applicableProductId)
                        }
                }

                fun applicableProductTags(applicableProductTags: List<String>) =
                    applicableProductTags(JsonField.of(applicableProductTags))

                fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
                    this.applicableProductTags = applicableProductTags.map { it.toMutableList() }
                }

                fun addApplicableProductTag(applicableProductTag: String) = apply {
                    applicableProductTags =
                        (applicableProductTags ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(applicableProductTag)
                        }
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

                fun gcpAccountId(gcpAccountId: String) = gcpAccountId(JsonField.of(gcpAccountId))

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

                fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

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

                fun build(): AddResellerRoyalty =
                    AddResellerRoyalty(
                        checkRequired("resellerType", resellerType),
                        (applicableProductIds ?: JsonMissing.of()).map { it.toImmutable() },
                        (applicableProductTags ?: JsonMissing.of()).map { it.toImmutable() },
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
                 * An enum containing [ResellerType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [ResellerType] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    AWS,
                    AWS_PRO_SERVICE,
                    GCP,
                    GCP_PRO_SERVICE,
                    /**
                     * An enum member indicating that [ResellerType] was instantiated with an
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
                 * @throws MetronomeInvalidDataException if this class instance's value is a not a
                 *   known member.
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
                 * @throws MetronomeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        MetronomeInvalidDataException("Value is not a String")
                    }

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

                return /* spotless:off */ other is AddResellerRoyalty && resellerType == other.resellerType && applicableProductIds == other.applicableProductIds && applicableProductTags == other.applicableProductTags && awsAccountNumber == other.awsAccountNumber && awsOfferId == other.awsOfferId && awsPayerReferenceId == other.awsPayerReferenceId && endingBefore == other.endingBefore && fraction == other.fraction && gcpAccountId == other.gcpAccountId && gcpOfferId == other.gcpOfferId && netsuiteResellerId == other.netsuiteResellerId && resellerContractValue == other.resellerContractValue && startingAt == other.startingAt && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(resellerType, applicableProductIds, applicableProductTags, awsAccountNumber, awsOfferId, awsPayerReferenceId, endingBefore, fraction, gcpAccountId, gcpOfferId, netsuiteResellerId, resellerContractValue, startingAt, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AddResellerRoyalty{resellerType=$resellerType, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, awsAccountNumber=$awsAccountNumber, awsOfferId=$awsOfferId, awsPayerReferenceId=$awsPayerReferenceId, endingBefore=$endingBefore, fraction=$fraction, gcpAccountId=$gcpAccountId, gcpOfferId=$gcpOfferId, netsuiteResellerId=$netsuiteResellerId, resellerContractValue=$resellerContractValue, startingAt=$startingAt, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class AddScheduledCharge
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("product")
            @ExcludeMissing
            private val product: JsonField<Product> = JsonMissing.of(),
            @JsonProperty("schedule")
            @ExcludeMissing
            private val schedule: JsonField<SchedulePointInTime> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("netsuite_sales_order_id")
            @ExcludeMissing
            private val netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun product(): Product = product.getRequired("product")

            fun schedule(): SchedulePointInTime = schedule.getRequired("schedule")

            /** displayed on invoices */
            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteSalesOrderId(): Optional<String> =
                Optional.ofNullable(netsuiteSalesOrderId.getNullable("netsuite_sales_order_id"))

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonProperty("product") @ExcludeMissing fun _product(): JsonField<Product> = product

            @JsonProperty("schedule")
            @ExcludeMissing
            fun _schedule(): JsonField<SchedulePointInTime> = schedule

            /** displayed on invoices */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /** This field's availability is dependent on your client's configuration. */
            @JsonProperty("netsuite_sales_order_id")
            @ExcludeMissing
            fun _netsuiteSalesOrderId(): JsonField<String> = netsuiteSalesOrderId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): AddScheduledCharge = apply {
                if (validated) {
                    return@apply
                }

                id()
                product().validate()
                schedule().validate()
                name()
                netsuiteSalesOrderId()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AddScheduledCharge]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var product: JsonField<Product>? = null
                private var schedule: JsonField<SchedulePointInTime>? = null
                private var name: JsonField<String> = JsonMissing.of()
                private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(addScheduledCharge: AddScheduledCharge) = apply {
                    id = addScheduledCharge.id
                    product = addScheduledCharge.product
                    schedule = addScheduledCharge.schedule
                    name = addScheduledCharge.name
                    netsuiteSalesOrderId = addScheduledCharge.netsuiteSalesOrderId
                    additionalProperties = addScheduledCharge.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun product(product: Product) = product(JsonField.of(product))

                fun product(product: JsonField<Product>) = apply { this.product = product }

                fun schedule(schedule: SchedulePointInTime) = schedule(JsonField.of(schedule))

                fun schedule(schedule: JsonField<SchedulePointInTime>) = apply {
                    this.schedule = schedule
                }

                /** displayed on invoices */
                fun name(name: String) = name(JsonField.of(name))

                /** displayed on invoices */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** This field's availability is dependent on your client's configuration. */
                fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
                    netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

                /** This field's availability is dependent on your client's configuration. */
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

                fun build(): AddScheduledCharge =
                    AddScheduledCharge(
                        checkRequired("id", id),
                        checkRequired("product", product),
                        checkRequired("schedule", schedule),
                        name,
                        netsuiteSalesOrderId,
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class Product
            @JsonCreator
            private constructor(
                @JsonProperty("id")
                @ExcludeMissing
                private val id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name")
                @ExcludeMissing
                private val name: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun id(): String = id.getRequired("id")

                fun name(): String = name.getRequired("name")

                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Product = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    name()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Product]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var name: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(product: Product) = apply {
                        id = product.id
                        name = product.name
                        additionalProperties = product.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun name(name: String) = name(JsonField.of(name))

                    fun name(name: JsonField<String>) = apply { this.name = name }

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

                    fun build(): Product =
                        Product(
                            checkRequired("id", id),
                            checkRequired("name", name),
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Product && id == other.id && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(id, name, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Product{id=$id, name=$name, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AddScheduledCharge && id == other.id && product == other.product && schedule == other.schedule && name == other.name && netsuiteSalesOrderId == other.netsuiteSalesOrderId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, product, schedule, name, netsuiteSalesOrderId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AddScheduledCharge{id=$id, product=$product, schedule=$schedule, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class AddUsageFilter
        @JsonCreator
        private constructor(
            @JsonProperty("group_key")
            @ExcludeMissing
            private val groupKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("group_values")
            @ExcludeMissing
            private val groupValues: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("starting_at")
            @ExcludeMissing
            private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("ending_before")
            @ExcludeMissing
            private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun groupKey(): String = groupKey.getRequired("group_key")

            fun groupValues(): List<String> = groupValues.getRequired("group_values")

            /**
             * This will match contract starting_at value if usage filter is active from the
             * beginning of the contract.
             */
            fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

            /**
             * This will match contract ending_before value if usage filter is active until the end
             * of the contract. It will be undefined if the contract is open-ended.
             */
            fun endingBefore(): Optional<OffsetDateTime> =
                Optional.ofNullable(endingBefore.getNullable("ending_before"))

            @JsonProperty("group_key") @ExcludeMissing fun _groupKey(): JsonField<String> = groupKey

            @JsonProperty("group_values")
            @ExcludeMissing
            fun _groupValues(): JsonField<List<String>> = groupValues

            /**
             * This will match contract starting_at value if usage filter is active from the
             * beginning of the contract.
             */
            @JsonProperty("starting_at")
            @ExcludeMissing
            fun _startingAt(): JsonField<OffsetDateTime> = startingAt

            /**
             * This will match contract ending_before value if usage filter is active until the end
             * of the contract. It will be undefined if the contract is open-ended.
             */
            @JsonProperty("ending_before")
            @ExcludeMissing
            fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): AddUsageFilter = apply {
                if (validated) {
                    return@apply
                }

                groupKey()
                groupValues()
                startingAt()
                endingBefore()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AddUsageFilter]. */
            class Builder internal constructor() {

                private var groupKey: JsonField<String>? = null
                private var groupValues: JsonField<MutableList<String>>? = null
                private var startingAt: JsonField<OffsetDateTime>? = null
                private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(addUsageFilter: AddUsageFilter) = apply {
                    groupKey = addUsageFilter.groupKey
                    groupValues = addUsageFilter.groupValues.map { it.toMutableList() }
                    startingAt = addUsageFilter.startingAt
                    endingBefore = addUsageFilter.endingBefore
                    additionalProperties = addUsageFilter.additionalProperties.toMutableMap()
                }

                fun groupKey(groupKey: String) = groupKey(JsonField.of(groupKey))

                fun groupKey(groupKey: JsonField<String>) = apply { this.groupKey = groupKey }

                fun groupValues(groupValues: List<String>) = groupValues(JsonField.of(groupValues))

                fun groupValues(groupValues: JsonField<List<String>>) = apply {
                    this.groupValues = groupValues.map { it.toMutableList() }
                }

                fun addGroupValue(groupValue: String) = apply {
                    groupValues =
                        (groupValues ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(groupValue)
                        }
                }

                /**
                 * This will match contract starting_at value if usage filter is active from the
                 * beginning of the contract.
                 */
                fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

                /**
                 * This will match contract starting_at value if usage filter is active from the
                 * beginning of the contract.
                 */
                fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                    this.startingAt = startingAt
                }

                /**
                 * This will match contract ending_before value if usage filter is active until the
                 * end of the contract. It will be undefined if the contract is open-ended.
                 */
                fun endingBefore(endingBefore: OffsetDateTime) =
                    endingBefore(JsonField.of(endingBefore))

                /**
                 * This will match contract ending_before value if usage filter is active until the
                 * end of the contract. It will be undefined if the contract is open-ended.
                 */
                fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                    this.endingBefore = endingBefore
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

                fun build(): AddUsageFilter =
                    AddUsageFilter(
                        checkRequired("groupKey", groupKey),
                        checkRequired("groupValues", groupValues).map { it.toImmutable() },
                        checkRequired("startingAt", startingAt),
                        endingBefore,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AddUsageFilter && groupKey == other.groupKey && groupValues == other.groupValues && startingAt == other.startingAt && endingBefore == other.endingBefore && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(groupKey, groupValues, startingAt, endingBefore, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AddUsageFilter{groupKey=$groupKey, groupValues=$groupValues, startingAt=$startingAt, endingBefore=$endingBefore, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class ArchiveCommit
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): ArchiveCommit = apply {
                if (validated) {
                    return@apply
                }

                id()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ArchiveCommit]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(archiveCommit: ArchiveCommit) = apply {
                    id = archiveCommit.id
                    additionalProperties = archiveCommit.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

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

                fun build(): ArchiveCommit =
                    ArchiveCommit(checkRequired("id", id), additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ArchiveCommit && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ArchiveCommit{id=$id, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class ArchiveCredit
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): ArchiveCredit = apply {
                if (validated) {
                    return@apply
                }

                id()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ArchiveCredit]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(archiveCredit: ArchiveCredit) = apply {
                    id = archiveCredit.id
                    additionalProperties = archiveCredit.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

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

                fun build(): ArchiveCredit =
                    ArchiveCredit(checkRequired("id", id), additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ArchiveCredit && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ArchiveCredit{id=$id, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class ArchiveScheduledCharge
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): ArchiveScheduledCharge = apply {
                if (validated) {
                    return@apply
                }

                id()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ArchiveScheduledCharge]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(archiveScheduledCharge: ArchiveScheduledCharge) = apply {
                    id = archiveScheduledCharge.id
                    additionalProperties =
                        archiveScheduledCharge.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

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

                fun build(): ArchiveScheduledCharge =
                    ArchiveScheduledCharge(
                        checkRequired("id", id),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ArchiveScheduledCharge && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ArchiveScheduledCharge{id=$id, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class RemoveOverride
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): RemoveOverride = apply {
                if (validated) {
                    return@apply
                }

                id()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [RemoveOverride]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(removeOverride: RemoveOverride) = apply {
                    id = removeOverride.id
                    additionalProperties = removeOverride.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

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

                fun build(): RemoveOverride =
                    RemoveOverride(checkRequired("id", id), additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RemoveOverride && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RemoveOverride{id=$id, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class UpdateCommit
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("access_schedule")
            @ExcludeMissing
            private val accessSchedule: JsonField<AccessSchedule> = JsonMissing.of(),
            @JsonProperty("applicable_product_ids")
            @ExcludeMissing
            private val applicableProductIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("applicable_product_tags")
            @ExcludeMissing
            private val applicableProductTags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            private val description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("hierarchy_configuration")
            @ExcludeMissing
            private val hierarchyConfiguration: JsonField<CommitHierarchyConfiguration> =
                JsonMissing.of(),
            @JsonProperty("invoice_schedule")
            @ExcludeMissing
            private val invoiceSchedule: JsonField<InvoiceSchedule> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("netsuite_sales_order_id")
            @ExcludeMissing
            private val netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("priority")
            @ExcludeMissing
            private val priority: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("product_id")
            @ExcludeMissing
            private val productId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rate_type")
            @ExcludeMissing
            private val rateType: JsonField<RateType> = JsonMissing.of(),
            @JsonProperty("rollover_fraction")
            @ExcludeMissing
            private val rolloverFraction: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("specifiers")
            @ExcludeMissing
            private val specifiers: JsonField<List<CommitSpecifierInput>> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun accessSchedule(): Optional<AccessSchedule> =
                Optional.ofNullable(accessSchedule.getNullable("access_schedule"))

            /**
             * Which products the commit applies to. If applicable_product_ids,
             * applicable_product_tags or specifiers are not provided, the commit applies to all
             * products.
             */
            fun applicableProductIds(): Optional<List<String>> =
                Optional.ofNullable(applicableProductIds.getNullable("applicable_product_ids"))

            /**
             * Which tags the commit applies to. If applicable_product_ids, applicable_product_tags
             * or specifiers are not provided, the commit applies to all products.
             */
            fun applicableProductTags(): Optional<List<String>> =
                Optional.ofNullable(applicableProductTags.getNullable("applicable_product_tags"))

            fun description(): Optional<String> =
                Optional.ofNullable(description.getNullable("description"))

            /** Optional configuration for commit hierarchy access control */
            fun hierarchyConfiguration(): Optional<CommitHierarchyConfiguration> =
                Optional.ofNullable(hierarchyConfiguration.getNullable("hierarchy_configuration"))

            fun invoiceSchedule(): Optional<InvoiceSchedule> =
                Optional.ofNullable(invoiceSchedule.getNullable("invoice_schedule"))

            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            fun netsuiteSalesOrderId(): Optional<String> =
                Optional.ofNullable(netsuiteSalesOrderId.getNullable("netsuite_sales_order_id"))

            /**
             * If multiple commits are applicable, the one with the lower priority will apply first.
             */
            fun priority(): Optional<Double> = Optional.ofNullable(priority.getNullable("priority"))

            fun productId(): Optional<String> =
                Optional.ofNullable(productId.getNullable("product_id"))

            /** If set, the commit's rate type was updated to the specified value. */
            fun rateType(): Optional<RateType> =
                Optional.ofNullable(rateType.getNullable("rate_type"))

            fun rolloverFraction(): Optional<Double> =
                Optional.ofNullable(rolloverFraction.getNullable("rollover_fraction"))

            /**
             * List of filters that determine what kind of customer usage draws down a commit or
             * credit. A customer's usage needs to meet the condition of at least one of the
             * specifiers to contribute to a commit's or credit's drawdown. This field cannot be
             * used together with `applicable_product_ids` or `applicable_product_tags`. Instead, to
             * target usage by product or product tag, pass those values in the body of
             * `specifiers`.
             */
            fun specifiers(): Optional<List<CommitSpecifierInput>> =
                Optional.ofNullable(specifiers.getNullable("specifiers"))

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonProperty("access_schedule")
            @ExcludeMissing
            fun _accessSchedule(): JsonField<AccessSchedule> = accessSchedule

            /**
             * Which products the commit applies to. If applicable_product_ids,
             * applicable_product_tags or specifiers are not provided, the commit applies to all
             * products.
             */
            @JsonProperty("applicable_product_ids")
            @ExcludeMissing
            fun _applicableProductIds(): JsonField<List<String>> = applicableProductIds

            /**
             * Which tags the commit applies to. If applicable_product_ids, applicable_product_tags
             * or specifiers are not provided, the commit applies to all products.
             */
            @JsonProperty("applicable_product_tags")
            @ExcludeMissing
            fun _applicableProductTags(): JsonField<List<String>> = applicableProductTags

            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /** Optional configuration for commit hierarchy access control */
            @JsonProperty("hierarchy_configuration")
            @ExcludeMissing
            fun _hierarchyConfiguration(): JsonField<CommitHierarchyConfiguration> =
                hierarchyConfiguration

            @JsonProperty("invoice_schedule")
            @ExcludeMissing
            fun _invoiceSchedule(): JsonField<InvoiceSchedule> = invoiceSchedule

            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonProperty("netsuite_sales_order_id")
            @ExcludeMissing
            fun _netsuiteSalesOrderId(): JsonField<String> = netsuiteSalesOrderId

            /**
             * If multiple commits are applicable, the one with the lower priority will apply first.
             */
            @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

            @JsonProperty("product_id")
            @ExcludeMissing
            fun _productId(): JsonField<String> = productId

            /** If set, the commit's rate type was updated to the specified value. */
            @JsonProperty("rate_type")
            @ExcludeMissing
            fun _rateType(): JsonField<RateType> = rateType

            @JsonProperty("rollover_fraction")
            @ExcludeMissing
            fun _rolloverFraction(): JsonField<Double> = rolloverFraction

            /**
             * List of filters that determine what kind of customer usage draws down a commit or
             * credit. A customer's usage needs to meet the condition of at least one of the
             * specifiers to contribute to a commit's or credit's drawdown. This field cannot be
             * used together with `applicable_product_ids` or `applicable_product_tags`. Instead, to
             * target usage by product or product tag, pass those values in the body of
             * `specifiers`.
             */
            @JsonProperty("specifiers")
            @ExcludeMissing
            fun _specifiers(): JsonField<List<CommitSpecifierInput>> = specifiers

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): UpdateCommit = apply {
                if (validated) {
                    return@apply
                }

                id()
                accessSchedule().ifPresent { it.validate() }
                applicableProductIds()
                applicableProductTags()
                description()
                hierarchyConfiguration().ifPresent { it.validate() }
                invoiceSchedule().ifPresent { it.validate() }
                name()
                netsuiteSalesOrderId()
                priority()
                productId()
                rateType()
                rolloverFraction()
                specifiers().ifPresent { it.forEach { it.validate() } }
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UpdateCommit]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var accessSchedule: JsonField<AccessSchedule> = JsonMissing.of()
                private var applicableProductIds: JsonField<MutableList<String>>? = null
                private var applicableProductTags: JsonField<MutableList<String>>? = null
                private var description: JsonField<String> = JsonMissing.of()
                private var hierarchyConfiguration: JsonField<CommitHierarchyConfiguration> =
                    JsonMissing.of()
                private var invoiceSchedule: JsonField<InvoiceSchedule> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
                private var priority: JsonField<Double> = JsonMissing.of()
                private var productId: JsonField<String> = JsonMissing.of()
                private var rateType: JsonField<RateType> = JsonMissing.of()
                private var rolloverFraction: JsonField<Double> = JsonMissing.of()
                private var specifiers: JsonField<MutableList<CommitSpecifierInput>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(updateCommit: UpdateCommit) = apply {
                    id = updateCommit.id
                    accessSchedule = updateCommit.accessSchedule
                    applicableProductIds =
                        updateCommit.applicableProductIds.map { it.toMutableList() }
                    applicableProductTags =
                        updateCommit.applicableProductTags.map { it.toMutableList() }
                    description = updateCommit.description
                    hierarchyConfiguration = updateCommit.hierarchyConfiguration
                    invoiceSchedule = updateCommit.invoiceSchedule
                    name = updateCommit.name
                    netsuiteSalesOrderId = updateCommit.netsuiteSalesOrderId
                    priority = updateCommit.priority
                    productId = updateCommit.productId
                    rateType = updateCommit.rateType
                    rolloverFraction = updateCommit.rolloverFraction
                    specifiers = updateCommit.specifiers.map { it.toMutableList() }
                    additionalProperties = updateCommit.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun accessSchedule(accessSchedule: AccessSchedule) =
                    accessSchedule(JsonField.of(accessSchedule))

                fun accessSchedule(accessSchedule: JsonField<AccessSchedule>) = apply {
                    this.accessSchedule = accessSchedule
                }

                /**
                 * Which products the commit applies to. If applicable_product_ids,
                 * applicable_product_tags or specifiers are not provided, the commit applies to all
                 * products.
                 */
                fun applicableProductIds(applicableProductIds: List<String>?) =
                    applicableProductIds(JsonField.ofNullable(applicableProductIds))

                /**
                 * Which products the commit applies to. If applicable_product_ids,
                 * applicable_product_tags or specifiers are not provided, the commit applies to all
                 * products.
                 */
                fun applicableProductIds(applicableProductIds: Optional<List<String>>) =
                    applicableProductIds(applicableProductIds.orElse(null))

                /**
                 * Which products the commit applies to. If applicable_product_ids,
                 * applicable_product_tags or specifiers are not provided, the commit applies to all
                 * products.
                 */
                fun applicableProductIds(applicableProductIds: JsonField<List<String>>) = apply {
                    this.applicableProductIds = applicableProductIds.map { it.toMutableList() }
                }

                /**
                 * Which products the commit applies to. If applicable_product_ids,
                 * applicable_product_tags or specifiers are not provided, the commit applies to all
                 * products.
                 */
                fun addApplicableProductId(applicableProductId: String) = apply {
                    applicableProductIds =
                        (applicableProductIds ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(applicableProductId)
                        }
                }

                /**
                 * Which tags the commit applies to. If applicable_product_ids,
                 * applicable_product_tags or specifiers are not provided, the commit applies to all
                 * products.
                 */
                fun applicableProductTags(applicableProductTags: List<String>?) =
                    applicableProductTags(JsonField.ofNullable(applicableProductTags))

                /**
                 * Which tags the commit applies to. If applicable_product_ids,
                 * applicable_product_tags or specifiers are not provided, the commit applies to all
                 * products.
                 */
                fun applicableProductTags(applicableProductTags: Optional<List<String>>) =
                    applicableProductTags(applicableProductTags.orElse(null))

                /**
                 * Which tags the commit applies to. If applicable_product_ids,
                 * applicable_product_tags or specifiers are not provided, the commit applies to all
                 * products.
                 */
                fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
                    this.applicableProductTags = applicableProductTags.map { it.toMutableList() }
                }

                /**
                 * Which tags the commit applies to. If applicable_product_ids,
                 * applicable_product_tags or specifiers are not provided, the commit applies to all
                 * products.
                 */
                fun addApplicableProductTag(applicableProductTag: String) = apply {
                    applicableProductTags =
                        (applicableProductTags ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(applicableProductTag)
                        }
                }

                fun description(description: String) = description(JsonField.of(description))

                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /** Optional configuration for commit hierarchy access control */
                fun hierarchyConfiguration(hierarchyConfiguration: CommitHierarchyConfiguration) =
                    hierarchyConfiguration(JsonField.of(hierarchyConfiguration))

                /** Optional configuration for commit hierarchy access control */
                fun hierarchyConfiguration(
                    hierarchyConfiguration: JsonField<CommitHierarchyConfiguration>
                ) = apply { this.hierarchyConfiguration = hierarchyConfiguration }

                fun invoiceSchedule(invoiceSchedule: InvoiceSchedule) =
                    invoiceSchedule(JsonField.of(invoiceSchedule))

                fun invoiceSchedule(invoiceSchedule: JsonField<InvoiceSchedule>) = apply {
                    this.invoiceSchedule = invoiceSchedule
                }

                fun name(name: String) = name(JsonField.of(name))

                fun name(name: JsonField<String>) = apply { this.name = name }

                fun netsuiteSalesOrderId(netsuiteSalesOrderId: String?) =
                    netsuiteSalesOrderId(JsonField.ofNullable(netsuiteSalesOrderId))

                fun netsuiteSalesOrderId(netsuiteSalesOrderId: Optional<String>) =
                    netsuiteSalesOrderId(netsuiteSalesOrderId.orElse(null))

                fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
                    this.netsuiteSalesOrderId = netsuiteSalesOrderId
                }

                /**
                 * If multiple commits are applicable, the one with the lower priority will apply
                 * first.
                 */
                fun priority(priority: Double?) = priority(JsonField.ofNullable(priority))

                /**
                 * If multiple commits are applicable, the one with the lower priority will apply
                 * first.
                 */
                fun priority(priority: Double) = priority(priority as Double?)

                /**
                 * If multiple commits are applicable, the one with the lower priority will apply
                 * first.
                 */
                @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                fun priority(priority: Optional<Double>) =
                    priority(priority.orElse(null) as Double?)

                /**
                 * If multiple commits are applicable, the one with the lower priority will apply
                 * first.
                 */
                fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

                fun productId(productId: String) = productId(JsonField.of(productId))

                fun productId(productId: JsonField<String>) = apply { this.productId = productId }

                /** If set, the commit's rate type was updated to the specified value. */
                fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

                /** If set, the commit's rate type was updated to the specified value. */
                fun rateType(rateType: JsonField<RateType>) = apply { this.rateType = rateType }

                fun rolloverFraction(rolloverFraction: Double?) =
                    rolloverFraction(JsonField.ofNullable(rolloverFraction))

                fun rolloverFraction(rolloverFraction: Double) =
                    rolloverFraction(rolloverFraction as Double?)

                @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                fun rolloverFraction(rolloverFraction: Optional<Double>) =
                    rolloverFraction(rolloverFraction.orElse(null) as Double?)

                fun rolloverFraction(rolloverFraction: JsonField<Double>) = apply {
                    this.rolloverFraction = rolloverFraction
                }

                /**
                 * List of filters that determine what kind of customer usage draws down a commit or
                 * credit. A customer's usage needs to meet the condition of at least one of the
                 * specifiers to contribute to a commit's or credit's drawdown. This field cannot be
                 * used together with `applicable_product_ids` or `applicable_product_tags`.
                 * Instead, to target usage by product or product tag, pass those values in the body
                 * of `specifiers`.
                 */
                fun specifiers(specifiers: List<CommitSpecifierInput>?) =
                    specifiers(JsonField.ofNullable(specifiers))

                /**
                 * List of filters that determine what kind of customer usage draws down a commit or
                 * credit. A customer's usage needs to meet the condition of at least one of the
                 * specifiers to contribute to a commit's or credit's drawdown. This field cannot be
                 * used together with `applicable_product_ids` or `applicable_product_tags`.
                 * Instead, to target usage by product or product tag, pass those values in the body
                 * of `specifiers`.
                 */
                fun specifiers(specifiers: Optional<List<CommitSpecifierInput>>) =
                    specifiers(specifiers.orElse(null))

                /**
                 * List of filters that determine what kind of customer usage draws down a commit or
                 * credit. A customer's usage needs to meet the condition of at least one of the
                 * specifiers to contribute to a commit's or credit's drawdown. This field cannot be
                 * used together with `applicable_product_ids` or `applicable_product_tags`.
                 * Instead, to target usage by product or product tag, pass those values in the body
                 * of `specifiers`.
                 */
                fun specifiers(specifiers: JsonField<List<CommitSpecifierInput>>) = apply {
                    this.specifiers = specifiers.map { it.toMutableList() }
                }

                /**
                 * List of filters that determine what kind of customer usage draws down a commit or
                 * credit. A customer's usage needs to meet the condition of at least one of the
                 * specifiers to contribute to a commit's or credit's drawdown. This field cannot be
                 * used together with `applicable_product_ids` or `applicable_product_tags`.
                 * Instead, to target usage by product or product tag, pass those values in the body
                 * of `specifiers`.
                 */
                fun addSpecifier(specifier: CommitSpecifierInput) = apply {
                    specifiers =
                        (specifiers ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(specifier)
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

                fun build(): UpdateCommit =
                    UpdateCommit(
                        checkRequired("id", id),
                        accessSchedule,
                        (applicableProductIds ?: JsonMissing.of()).map { it.toImmutable() },
                        (applicableProductTags ?: JsonMissing.of()).map { it.toImmutable() },
                        description,
                        hierarchyConfiguration,
                        invoiceSchedule,
                        name,
                        netsuiteSalesOrderId,
                        priority,
                        productId,
                        rateType,
                        rolloverFraction,
                        (specifiers ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class AccessSchedule
            @JsonCreator
            private constructor(
                @JsonProperty("add_schedule_items")
                @ExcludeMissing
                private val addScheduleItems: JsonField<List<AddScheduleItem>> = JsonMissing.of(),
                @JsonProperty("remove_schedule_items")
                @ExcludeMissing
                private val removeScheduleItems: JsonField<List<RemoveScheduleItem>> =
                    JsonMissing.of(),
                @JsonProperty("update_schedule_items")
                @ExcludeMissing
                private val updateScheduleItems: JsonField<List<UpdateScheduleItem>> =
                    JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun addScheduleItems(): Optional<List<AddScheduleItem>> =
                    Optional.ofNullable(addScheduleItems.getNullable("add_schedule_items"))

                fun removeScheduleItems(): Optional<List<RemoveScheduleItem>> =
                    Optional.ofNullable(removeScheduleItems.getNullable("remove_schedule_items"))

                fun updateScheduleItems(): Optional<List<UpdateScheduleItem>> =
                    Optional.ofNullable(updateScheduleItems.getNullable("update_schedule_items"))

                @JsonProperty("add_schedule_items")
                @ExcludeMissing
                fun _addScheduleItems(): JsonField<List<AddScheduleItem>> = addScheduleItems

                @JsonProperty("remove_schedule_items")
                @ExcludeMissing
                fun _removeScheduleItems(): JsonField<List<RemoveScheduleItem>> =
                    removeScheduleItems

                @JsonProperty("update_schedule_items")
                @ExcludeMissing
                fun _updateScheduleItems(): JsonField<List<UpdateScheduleItem>> =
                    updateScheduleItems

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): AccessSchedule = apply {
                    if (validated) {
                        return@apply
                    }

                    addScheduleItems().ifPresent { it.forEach { it.validate() } }
                    removeScheduleItems().ifPresent { it.forEach { it.validate() } }
                    updateScheduleItems().ifPresent { it.forEach { it.validate() } }
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [AccessSchedule]. */
                class Builder internal constructor() {

                    private var addScheduleItems: JsonField<MutableList<AddScheduleItem>>? = null
                    private var removeScheduleItems: JsonField<MutableList<RemoveScheduleItem>>? =
                        null
                    private var updateScheduleItems: JsonField<MutableList<UpdateScheduleItem>>? =
                        null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(accessSchedule: AccessSchedule) = apply {
                        addScheduleItems =
                            accessSchedule.addScheduleItems.map { it.toMutableList() }
                        removeScheduleItems =
                            accessSchedule.removeScheduleItems.map { it.toMutableList() }
                        updateScheduleItems =
                            accessSchedule.updateScheduleItems.map { it.toMutableList() }
                        additionalProperties = accessSchedule.additionalProperties.toMutableMap()
                    }

                    fun addScheduleItems(addScheduleItems: List<AddScheduleItem>) =
                        addScheduleItems(JsonField.of(addScheduleItems))

                    fun addScheduleItems(addScheduleItems: JsonField<List<AddScheduleItem>>) =
                        apply {
                            this.addScheduleItems = addScheduleItems.map { it.toMutableList() }
                        }

                    fun addAddScheduleItem(addScheduleItem: AddScheduleItem) = apply {
                        addScheduleItems =
                            (addScheduleItems ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(addScheduleItem)
                            }
                    }

                    fun removeScheduleItems(removeScheduleItems: List<RemoveScheduleItem>) =
                        removeScheduleItems(JsonField.of(removeScheduleItems))

                    fun removeScheduleItems(
                        removeScheduleItems: JsonField<List<RemoveScheduleItem>>
                    ) = apply {
                        this.removeScheduleItems = removeScheduleItems.map { it.toMutableList() }
                    }

                    fun addRemoveScheduleItem(removeScheduleItem: RemoveScheduleItem) = apply {
                        removeScheduleItems =
                            (removeScheduleItems ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(removeScheduleItem)
                            }
                    }

                    fun updateScheduleItems(updateScheduleItems: List<UpdateScheduleItem>) =
                        updateScheduleItems(JsonField.of(updateScheduleItems))

                    fun updateScheduleItems(
                        updateScheduleItems: JsonField<List<UpdateScheduleItem>>
                    ) = apply {
                        this.updateScheduleItems = updateScheduleItems.map { it.toMutableList() }
                    }

                    fun addUpdateScheduleItem(updateScheduleItem: UpdateScheduleItem) = apply {
                        updateScheduleItems =
                            (updateScheduleItems ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(updateScheduleItem)
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

                    fun build(): AccessSchedule =
                        AccessSchedule(
                            (addScheduleItems ?: JsonMissing.of()).map { it.toImmutable() },
                            (removeScheduleItems ?: JsonMissing.of()).map { it.toImmutable() },
                            (updateScheduleItems ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toImmutable(),
                        )
                }

                @NoAutoDetect
                class AddScheduleItem
                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    private val amount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("ending_before")
                    @ExcludeMissing
                    private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("starting_at")
                    @ExcludeMissing
                    private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun amount(): Double = amount.getRequired("amount")

                    /** RFC 3339 timestamp (exclusive) */
                    fun endingBefore(): OffsetDateTime = endingBefore.getRequired("ending_before")

                    /** RFC 3339 timestamp (inclusive) */
                    fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun _amount(): JsonField<Double> = amount

                    /** RFC 3339 timestamp (exclusive) */
                    @JsonProperty("ending_before")
                    @ExcludeMissing
                    fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

                    /** RFC 3339 timestamp (inclusive) */
                    @JsonProperty("starting_at")
                    @ExcludeMissing
                    fun _startingAt(): JsonField<OffsetDateTime> = startingAt

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): AddScheduleItem = apply {
                        if (validated) {
                            return@apply
                        }

                        amount()
                        endingBefore()
                        startingAt()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [AddScheduleItem]. */
                    class Builder internal constructor() {

                        private var amount: JsonField<Double>? = null
                        private var endingBefore: JsonField<OffsetDateTime>? = null
                        private var startingAt: JsonField<OffsetDateTime>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(addScheduleItem: AddScheduleItem) = apply {
                            amount = addScheduleItem.amount
                            endingBefore = addScheduleItem.endingBefore
                            startingAt = addScheduleItem.startingAt
                            additionalProperties =
                                addScheduleItem.additionalProperties.toMutableMap()
                        }

                        fun amount(amount: Double) = amount(JsonField.of(amount))

                        fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                        /** RFC 3339 timestamp (exclusive) */
                        fun endingBefore(endingBefore: OffsetDateTime) =
                            endingBefore(JsonField.of(endingBefore))

                        /** RFC 3339 timestamp (exclusive) */
                        fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                            this.endingBefore = endingBefore
                        }

                        /** RFC 3339 timestamp (inclusive) */
                        fun startingAt(startingAt: OffsetDateTime) =
                            startingAt(JsonField.of(startingAt))

                        /** RFC 3339 timestamp (inclusive) */
                        fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                            this.startingAt = startingAt
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

                        fun build(): AddScheduleItem =
                            AddScheduleItem(
                                checkRequired("amount", amount),
                                checkRequired("endingBefore", endingBefore),
                                checkRequired("startingAt", startingAt),
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AddScheduleItem && amount == other.amount && endingBefore == other.endingBefore && startingAt == other.startingAt && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(amount, endingBefore, startingAt, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "AddScheduleItem{amount=$amount, endingBefore=$endingBefore, startingAt=$startingAt, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class RemoveScheduleItem
                @JsonCreator
                private constructor(
                    @JsonProperty("id")
                    @ExcludeMissing
                    private val id: JsonField<String> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun id(): String = id.getRequired("id")

                    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): RemoveScheduleItem = apply {
                        if (validated) {
                            return@apply
                        }

                        id()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [RemoveScheduleItem]. */
                    class Builder internal constructor() {

                        private var id: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(removeScheduleItem: RemoveScheduleItem) = apply {
                            id = removeScheduleItem.id
                            additionalProperties =
                                removeScheduleItem.additionalProperties.toMutableMap()
                        }

                        fun id(id: String) = id(JsonField.of(id))

                        fun id(id: JsonField<String>) = apply { this.id = id }

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

                        fun build(): RemoveScheduleItem =
                            RemoveScheduleItem(
                                checkRequired("id", id),
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is RemoveScheduleItem && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "RemoveScheduleItem{id=$id, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class UpdateScheduleItem
                @JsonCreator
                private constructor(
                    @JsonProperty("id")
                    @ExcludeMissing
                    private val id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("amount")
                    @ExcludeMissing
                    private val amount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("ending_before")
                    @ExcludeMissing
                    private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("starting_at")
                    @ExcludeMissing
                    private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun id(): String = id.getRequired("id")

                    fun amount(): Optional<Double> =
                        Optional.ofNullable(amount.getNullable("amount"))

                    /** RFC 3339 timestamp (exclusive) */
                    fun endingBefore(): Optional<OffsetDateTime> =
                        Optional.ofNullable(endingBefore.getNullable("ending_before"))

                    /** RFC 3339 timestamp (inclusive) */
                    fun startingAt(): Optional<OffsetDateTime> =
                        Optional.ofNullable(startingAt.getNullable("starting_at"))

                    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun _amount(): JsonField<Double> = amount

                    /** RFC 3339 timestamp (exclusive) */
                    @JsonProperty("ending_before")
                    @ExcludeMissing
                    fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

                    /** RFC 3339 timestamp (inclusive) */
                    @JsonProperty("starting_at")
                    @ExcludeMissing
                    fun _startingAt(): JsonField<OffsetDateTime> = startingAt

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): UpdateScheduleItem = apply {
                        if (validated) {
                            return@apply
                        }

                        id()
                        amount()
                        endingBefore()
                        startingAt()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [UpdateScheduleItem]. */
                    class Builder internal constructor() {

                        private var id: JsonField<String>? = null
                        private var amount: JsonField<Double> = JsonMissing.of()
                        private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
                        private var startingAt: JsonField<OffsetDateTime> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(updateScheduleItem: UpdateScheduleItem) = apply {
                            id = updateScheduleItem.id
                            amount = updateScheduleItem.amount
                            endingBefore = updateScheduleItem.endingBefore
                            startingAt = updateScheduleItem.startingAt
                            additionalProperties =
                                updateScheduleItem.additionalProperties.toMutableMap()
                        }

                        fun id(id: String) = id(JsonField.of(id))

                        fun id(id: JsonField<String>) = apply { this.id = id }

                        fun amount(amount: Double) = amount(JsonField.of(amount))

                        fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                        /** RFC 3339 timestamp (exclusive) */
                        fun endingBefore(endingBefore: OffsetDateTime) =
                            endingBefore(JsonField.of(endingBefore))

                        /** RFC 3339 timestamp (exclusive) */
                        fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                            this.endingBefore = endingBefore
                        }

                        /** RFC 3339 timestamp (inclusive) */
                        fun startingAt(startingAt: OffsetDateTime) =
                            startingAt(JsonField.of(startingAt))

                        /** RFC 3339 timestamp (inclusive) */
                        fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                            this.startingAt = startingAt
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

                        fun build(): UpdateScheduleItem =
                            UpdateScheduleItem(
                                checkRequired("id", id),
                                amount,
                                endingBefore,
                                startingAt,
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is UpdateScheduleItem && id == other.id && amount == other.amount && endingBefore == other.endingBefore && startingAt == other.startingAt && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(id, amount, endingBefore, startingAt, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "UpdateScheduleItem{id=$id, amount=$amount, endingBefore=$endingBefore, startingAt=$startingAt, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is AccessSchedule && addScheduleItems == other.addScheduleItems && removeScheduleItems == other.removeScheduleItems && updateScheduleItems == other.updateScheduleItems && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(addScheduleItems, removeScheduleItems, updateScheduleItems, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AccessSchedule{addScheduleItems=$addScheduleItems, removeScheduleItems=$removeScheduleItems, updateScheduleItems=$updateScheduleItems, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class InvoiceSchedule
            @JsonCreator
            private constructor(
                @JsonProperty("add_schedule_items")
                @ExcludeMissing
                private val addScheduleItems: JsonField<List<AddScheduleItem>> = JsonMissing.of(),
                @JsonProperty("remove_schedule_items")
                @ExcludeMissing
                private val removeScheduleItems: JsonField<List<RemoveScheduleItem>> =
                    JsonMissing.of(),
                @JsonProperty("update_schedule_items")
                @ExcludeMissing
                private val updateScheduleItems: JsonField<List<UpdateScheduleItem>> =
                    JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun addScheduleItems(): Optional<List<AddScheduleItem>> =
                    Optional.ofNullable(addScheduleItems.getNullable("add_schedule_items"))

                fun removeScheduleItems(): Optional<List<RemoveScheduleItem>> =
                    Optional.ofNullable(removeScheduleItems.getNullable("remove_schedule_items"))

                fun updateScheduleItems(): Optional<List<UpdateScheduleItem>> =
                    Optional.ofNullable(updateScheduleItems.getNullable("update_schedule_items"))

                @JsonProperty("add_schedule_items")
                @ExcludeMissing
                fun _addScheduleItems(): JsonField<List<AddScheduleItem>> = addScheduleItems

                @JsonProperty("remove_schedule_items")
                @ExcludeMissing
                fun _removeScheduleItems(): JsonField<List<RemoveScheduleItem>> =
                    removeScheduleItems

                @JsonProperty("update_schedule_items")
                @ExcludeMissing
                fun _updateScheduleItems(): JsonField<List<UpdateScheduleItem>> =
                    updateScheduleItems

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): InvoiceSchedule = apply {
                    if (validated) {
                        return@apply
                    }

                    addScheduleItems().ifPresent { it.forEach { it.validate() } }
                    removeScheduleItems().ifPresent { it.forEach { it.validate() } }
                    updateScheduleItems().ifPresent { it.forEach { it.validate() } }
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [InvoiceSchedule]. */
                class Builder internal constructor() {

                    private var addScheduleItems: JsonField<MutableList<AddScheduleItem>>? = null
                    private var removeScheduleItems: JsonField<MutableList<RemoveScheduleItem>>? =
                        null
                    private var updateScheduleItems: JsonField<MutableList<UpdateScheduleItem>>? =
                        null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(invoiceSchedule: InvoiceSchedule) = apply {
                        addScheduleItems =
                            invoiceSchedule.addScheduleItems.map { it.toMutableList() }
                        removeScheduleItems =
                            invoiceSchedule.removeScheduleItems.map { it.toMutableList() }
                        updateScheduleItems =
                            invoiceSchedule.updateScheduleItems.map { it.toMutableList() }
                        additionalProperties = invoiceSchedule.additionalProperties.toMutableMap()
                    }

                    fun addScheduleItems(addScheduleItems: List<AddScheduleItem>) =
                        addScheduleItems(JsonField.of(addScheduleItems))

                    fun addScheduleItems(addScheduleItems: JsonField<List<AddScheduleItem>>) =
                        apply {
                            this.addScheduleItems = addScheduleItems.map { it.toMutableList() }
                        }

                    fun addAddScheduleItem(addScheduleItem: AddScheduleItem) = apply {
                        addScheduleItems =
                            (addScheduleItems ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(addScheduleItem)
                            }
                    }

                    fun removeScheduleItems(removeScheduleItems: List<RemoveScheduleItem>) =
                        removeScheduleItems(JsonField.of(removeScheduleItems))

                    fun removeScheduleItems(
                        removeScheduleItems: JsonField<List<RemoveScheduleItem>>
                    ) = apply {
                        this.removeScheduleItems = removeScheduleItems.map { it.toMutableList() }
                    }

                    fun addRemoveScheduleItem(removeScheduleItem: RemoveScheduleItem) = apply {
                        removeScheduleItems =
                            (removeScheduleItems ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(removeScheduleItem)
                            }
                    }

                    fun updateScheduleItems(updateScheduleItems: List<UpdateScheduleItem>) =
                        updateScheduleItems(JsonField.of(updateScheduleItems))

                    fun updateScheduleItems(
                        updateScheduleItems: JsonField<List<UpdateScheduleItem>>
                    ) = apply {
                        this.updateScheduleItems = updateScheduleItems.map { it.toMutableList() }
                    }

                    fun addUpdateScheduleItem(updateScheduleItem: UpdateScheduleItem) = apply {
                        updateScheduleItems =
                            (updateScheduleItems ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(updateScheduleItem)
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

                    fun build(): InvoiceSchedule =
                        InvoiceSchedule(
                            (addScheduleItems ?: JsonMissing.of()).map { it.toImmutable() },
                            (removeScheduleItems ?: JsonMissing.of()).map { it.toImmutable() },
                            (updateScheduleItems ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toImmutable(),
                        )
                }

                @NoAutoDetect
                class AddScheduleItem
                @JsonCreator
                private constructor(
                    @JsonProperty("timestamp")
                    @ExcludeMissing
                    private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("amount")
                    @ExcludeMissing
                    private val amount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("quantity")
                    @ExcludeMissing
                    private val quantity: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("unit_price")
                    @ExcludeMissing
                    private val unitPrice: JsonField<Double> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

                    fun amount(): Optional<Double> =
                        Optional.ofNullable(amount.getNullable("amount"))

                    fun quantity(): Optional<Double> =
                        Optional.ofNullable(quantity.getNullable("quantity"))

                    fun unitPrice(): Optional<Double> =
                        Optional.ofNullable(unitPrice.getNullable("unit_price"))

                    @JsonProperty("timestamp")
                    @ExcludeMissing
                    fun _timestamp(): JsonField<OffsetDateTime> = timestamp

                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun _amount(): JsonField<Double> = amount

                    @JsonProperty("quantity")
                    @ExcludeMissing
                    fun _quantity(): JsonField<Double> = quantity

                    @JsonProperty("unit_price")
                    @ExcludeMissing
                    fun _unitPrice(): JsonField<Double> = unitPrice

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): AddScheduleItem = apply {
                        if (validated) {
                            return@apply
                        }

                        timestamp()
                        amount()
                        quantity()
                        unitPrice()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [AddScheduleItem]. */
                    class Builder internal constructor() {

                        private var timestamp: JsonField<OffsetDateTime>? = null
                        private var amount: JsonField<Double> = JsonMissing.of()
                        private var quantity: JsonField<Double> = JsonMissing.of()
                        private var unitPrice: JsonField<Double> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(addScheduleItem: AddScheduleItem) = apply {
                            timestamp = addScheduleItem.timestamp
                            amount = addScheduleItem.amount
                            quantity = addScheduleItem.quantity
                            unitPrice = addScheduleItem.unitPrice
                            additionalProperties =
                                addScheduleItem.additionalProperties.toMutableMap()
                        }

                        fun timestamp(timestamp: OffsetDateTime) =
                            timestamp(JsonField.of(timestamp))

                        fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                            this.timestamp = timestamp
                        }

                        fun amount(amount: Double) = amount(JsonField.of(amount))

                        fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                        fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                        fun quantity(quantity: JsonField<Double>) = apply {
                            this.quantity = quantity
                        }

                        fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

                        fun unitPrice(unitPrice: JsonField<Double>) = apply {
                            this.unitPrice = unitPrice
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

                        fun build(): AddScheduleItem =
                            AddScheduleItem(
                                checkRequired("timestamp", timestamp),
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

                        return /* spotless:off */ other is AddScheduleItem && timestamp == other.timestamp && amount == other.amount && quantity == other.quantity && unitPrice == other.unitPrice && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(timestamp, amount, quantity, unitPrice, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "AddScheduleItem{timestamp=$timestamp, amount=$amount, quantity=$quantity, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class RemoveScheduleItem
                @JsonCreator
                private constructor(
                    @JsonProperty("id")
                    @ExcludeMissing
                    private val id: JsonField<String> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun id(): String = id.getRequired("id")

                    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): RemoveScheduleItem = apply {
                        if (validated) {
                            return@apply
                        }

                        id()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [RemoveScheduleItem]. */
                    class Builder internal constructor() {

                        private var id: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(removeScheduleItem: RemoveScheduleItem) = apply {
                            id = removeScheduleItem.id
                            additionalProperties =
                                removeScheduleItem.additionalProperties.toMutableMap()
                        }

                        fun id(id: String) = id(JsonField.of(id))

                        fun id(id: JsonField<String>) = apply { this.id = id }

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

                        fun build(): RemoveScheduleItem =
                            RemoveScheduleItem(
                                checkRequired("id", id),
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is RemoveScheduleItem && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "RemoveScheduleItem{id=$id, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class UpdateScheduleItem
                @JsonCreator
                private constructor(
                    @JsonProperty("id")
                    @ExcludeMissing
                    private val id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("amount")
                    @ExcludeMissing
                    private val amount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("quantity")
                    @ExcludeMissing
                    private val quantity: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("timestamp")
                    @ExcludeMissing
                    private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("unit_price")
                    @ExcludeMissing
                    private val unitPrice: JsonField<Double> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun id(): String = id.getRequired("id")

                    fun amount(): Optional<Double> =
                        Optional.ofNullable(amount.getNullable("amount"))

                    fun quantity(): Optional<Double> =
                        Optional.ofNullable(quantity.getNullable("quantity"))

                    fun timestamp(): Optional<OffsetDateTime> =
                        Optional.ofNullable(timestamp.getNullable("timestamp"))

                    fun unitPrice(): Optional<Double> =
                        Optional.ofNullable(unitPrice.getNullable("unit_price"))

                    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun _amount(): JsonField<Double> = amount

                    @JsonProperty("quantity")
                    @ExcludeMissing
                    fun _quantity(): JsonField<Double> = quantity

                    @JsonProperty("timestamp")
                    @ExcludeMissing
                    fun _timestamp(): JsonField<OffsetDateTime> = timestamp

                    @JsonProperty("unit_price")
                    @ExcludeMissing
                    fun _unitPrice(): JsonField<Double> = unitPrice

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): UpdateScheduleItem = apply {
                        if (validated) {
                            return@apply
                        }

                        id()
                        amount()
                        quantity()
                        timestamp()
                        unitPrice()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [UpdateScheduleItem]. */
                    class Builder internal constructor() {

                        private var id: JsonField<String>? = null
                        private var amount: JsonField<Double> = JsonMissing.of()
                        private var quantity: JsonField<Double> = JsonMissing.of()
                        private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
                        private var unitPrice: JsonField<Double> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(updateScheduleItem: UpdateScheduleItem) = apply {
                            id = updateScheduleItem.id
                            amount = updateScheduleItem.amount
                            quantity = updateScheduleItem.quantity
                            timestamp = updateScheduleItem.timestamp
                            unitPrice = updateScheduleItem.unitPrice
                            additionalProperties =
                                updateScheduleItem.additionalProperties.toMutableMap()
                        }

                        fun id(id: String) = id(JsonField.of(id))

                        fun id(id: JsonField<String>) = apply { this.id = id }

                        fun amount(amount: Double) = amount(JsonField.of(amount))

                        fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                        fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                        fun quantity(quantity: JsonField<Double>) = apply {
                            this.quantity = quantity
                        }

                        fun timestamp(timestamp: OffsetDateTime) =
                            timestamp(JsonField.of(timestamp))

                        fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                            this.timestamp = timestamp
                        }

                        fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

                        fun unitPrice(unitPrice: JsonField<Double>) = apply {
                            this.unitPrice = unitPrice
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

                        fun build(): UpdateScheduleItem =
                            UpdateScheduleItem(
                                checkRequired("id", id),
                                amount,
                                quantity,
                                timestamp,
                                unitPrice,
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is UpdateScheduleItem && id == other.id && amount == other.amount && quantity == other.quantity && timestamp == other.timestamp && unitPrice == other.unitPrice && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(id, amount, quantity, timestamp, unitPrice, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "UpdateScheduleItem{id=$id, amount=$amount, quantity=$quantity, timestamp=$timestamp, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is InvoiceSchedule && addScheduleItems == other.addScheduleItems && removeScheduleItems == other.removeScheduleItems && updateScheduleItems == other.updateScheduleItems && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(addScheduleItems, removeScheduleItems, updateScheduleItems, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "InvoiceSchedule{addScheduleItems=$addScheduleItems, removeScheduleItems=$removeScheduleItems, updateScheduleItems=$updateScheduleItems, additionalProperties=$additionalProperties}"
            }

            /** If set, the commit's rate type was updated to the specified value. */
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
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    COMMIT_RATE,
                    LIST_RATE,
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
                 * @throws MetronomeInvalidDataException if this class instance's value is a not a
                 *   known member.
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
                 * @throws MetronomeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        MetronomeInvalidDataException("Value is not a String")
                    }

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

                return /* spotless:off */ other is UpdateCommit && id == other.id && accessSchedule == other.accessSchedule && applicableProductIds == other.applicableProductIds && applicableProductTags == other.applicableProductTags && description == other.description && hierarchyConfiguration == other.hierarchyConfiguration && invoiceSchedule == other.invoiceSchedule && name == other.name && netsuiteSalesOrderId == other.netsuiteSalesOrderId && priority == other.priority && productId == other.productId && rateType == other.rateType && rolloverFraction == other.rolloverFraction && specifiers == other.specifiers && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, accessSchedule, applicableProductIds, applicableProductTags, description, hierarchyConfiguration, invoiceSchedule, name, netsuiteSalesOrderId, priority, productId, rateType, rolloverFraction, specifiers, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UpdateCommit{id=$id, accessSchedule=$accessSchedule, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, description=$description, hierarchyConfiguration=$hierarchyConfiguration, invoiceSchedule=$invoiceSchedule, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, priority=$priority, productId=$productId, rateType=$rateType, rolloverFraction=$rolloverFraction, specifiers=$specifiers, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class UpdateCredit
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("access_schedule")
            @ExcludeMissing
            private val accessSchedule: JsonField<AccessSchedule> = JsonMissing.of(),
            @JsonProperty("description")
            @ExcludeMissing
            private val description: JsonField<String> = JsonMissing.of(),
            @JsonProperty("hierarchy_configuration")
            @ExcludeMissing
            private val hierarchyConfiguration: JsonField<CommitHierarchyConfiguration> =
                JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("netsuite_sales_order_id")
            @ExcludeMissing
            private val netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("priority")
            @ExcludeMissing
            private val priority: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("rate_type")
            @ExcludeMissing
            private val rateType: JsonField<RateType> = JsonMissing.of(),
            @JsonProperty("rollover_fraction")
            @ExcludeMissing
            private val rolloverFraction: JsonField<Double> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun accessSchedule(): Optional<AccessSchedule> =
                Optional.ofNullable(accessSchedule.getNullable("access_schedule"))

            fun description(): Optional<String> =
                Optional.ofNullable(description.getNullable("description"))

            /** Optional configuration for credit hierarchy access control */
            fun hierarchyConfiguration(): Optional<CommitHierarchyConfiguration> =
                Optional.ofNullable(hierarchyConfiguration.getNullable("hierarchy_configuration"))

            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            fun netsuiteSalesOrderId(): Optional<String> =
                Optional.ofNullable(netsuiteSalesOrderId.getNullable("netsuite_sales_order_id"))

            /**
             * If multiple credits are applicable, the one with the lower priority will apply first.
             */
            fun priority(): Optional<Double> = Optional.ofNullable(priority.getNullable("priority"))

            /** If set, the credit's rate type was updated to the specified value. */
            fun rateType(): Optional<RateType> =
                Optional.ofNullable(rateType.getNullable("rate_type"))

            fun rolloverFraction(): Optional<Double> =
                Optional.ofNullable(rolloverFraction.getNullable("rollover_fraction"))

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonProperty("access_schedule")
            @ExcludeMissing
            fun _accessSchedule(): JsonField<AccessSchedule> = accessSchedule

            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            /** Optional configuration for credit hierarchy access control */
            @JsonProperty("hierarchy_configuration")
            @ExcludeMissing
            fun _hierarchyConfiguration(): JsonField<CommitHierarchyConfiguration> =
                hierarchyConfiguration

            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonProperty("netsuite_sales_order_id")
            @ExcludeMissing
            fun _netsuiteSalesOrderId(): JsonField<String> = netsuiteSalesOrderId

            /**
             * If multiple credits are applicable, the one with the lower priority will apply first.
             */
            @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

            /** If set, the credit's rate type was updated to the specified value. */
            @JsonProperty("rate_type")
            @ExcludeMissing
            fun _rateType(): JsonField<RateType> = rateType

            @JsonProperty("rollover_fraction")
            @ExcludeMissing
            fun _rolloverFraction(): JsonField<Double> = rolloverFraction

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): UpdateCredit = apply {
                if (validated) {
                    return@apply
                }

                id()
                accessSchedule().ifPresent { it.validate() }
                description()
                hierarchyConfiguration().ifPresent { it.validate() }
                name()
                netsuiteSalesOrderId()
                priority()
                rateType()
                rolloverFraction()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UpdateCredit]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var accessSchedule: JsonField<AccessSchedule> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var hierarchyConfiguration: JsonField<CommitHierarchyConfiguration> =
                    JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
                private var priority: JsonField<Double> = JsonMissing.of()
                private var rateType: JsonField<RateType> = JsonMissing.of()
                private var rolloverFraction: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(updateCredit: UpdateCredit) = apply {
                    id = updateCredit.id
                    accessSchedule = updateCredit.accessSchedule
                    description = updateCredit.description
                    hierarchyConfiguration = updateCredit.hierarchyConfiguration
                    name = updateCredit.name
                    netsuiteSalesOrderId = updateCredit.netsuiteSalesOrderId
                    priority = updateCredit.priority
                    rateType = updateCredit.rateType
                    rolloverFraction = updateCredit.rolloverFraction
                    additionalProperties = updateCredit.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun accessSchedule(accessSchedule: AccessSchedule) =
                    accessSchedule(JsonField.of(accessSchedule))

                fun accessSchedule(accessSchedule: JsonField<AccessSchedule>) = apply {
                    this.accessSchedule = accessSchedule
                }

                fun description(description: String) = description(JsonField.of(description))

                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /** Optional configuration for credit hierarchy access control */
                fun hierarchyConfiguration(hierarchyConfiguration: CommitHierarchyConfiguration) =
                    hierarchyConfiguration(JsonField.of(hierarchyConfiguration))

                /** Optional configuration for credit hierarchy access control */
                fun hierarchyConfiguration(
                    hierarchyConfiguration: JsonField<CommitHierarchyConfiguration>
                ) = apply { this.hierarchyConfiguration = hierarchyConfiguration }

                fun name(name: String) = name(JsonField.of(name))

                fun name(name: JsonField<String>) = apply { this.name = name }

                fun netsuiteSalesOrderId(netsuiteSalesOrderId: String?) =
                    netsuiteSalesOrderId(JsonField.ofNullable(netsuiteSalesOrderId))

                fun netsuiteSalesOrderId(netsuiteSalesOrderId: Optional<String>) =
                    netsuiteSalesOrderId(netsuiteSalesOrderId.orElse(null))

                fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
                    this.netsuiteSalesOrderId = netsuiteSalesOrderId
                }

                /**
                 * If multiple credits are applicable, the one with the lower priority will apply
                 * first.
                 */
                fun priority(priority: Double?) = priority(JsonField.ofNullable(priority))

                /**
                 * If multiple credits are applicable, the one with the lower priority will apply
                 * first.
                 */
                fun priority(priority: Double) = priority(priority as Double?)

                /**
                 * If multiple credits are applicable, the one with the lower priority will apply
                 * first.
                 */
                @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                fun priority(priority: Optional<Double>) =
                    priority(priority.orElse(null) as Double?)

                /**
                 * If multiple credits are applicable, the one with the lower priority will apply
                 * first.
                 */
                fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

                /** If set, the credit's rate type was updated to the specified value. */
                fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

                /** If set, the credit's rate type was updated to the specified value. */
                fun rateType(rateType: JsonField<RateType>) = apply { this.rateType = rateType }

                fun rolloverFraction(rolloverFraction: Double?) =
                    rolloverFraction(JsonField.ofNullable(rolloverFraction))

                fun rolloverFraction(rolloverFraction: Double) =
                    rolloverFraction(rolloverFraction as Double?)

                @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
                fun rolloverFraction(rolloverFraction: Optional<Double>) =
                    rolloverFraction(rolloverFraction.orElse(null) as Double?)

                fun rolloverFraction(rolloverFraction: JsonField<Double>) = apply {
                    this.rolloverFraction = rolloverFraction
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

                fun build(): UpdateCredit =
                    UpdateCredit(
                        checkRequired("id", id),
                        accessSchedule,
                        description,
                        hierarchyConfiguration,
                        name,
                        netsuiteSalesOrderId,
                        priority,
                        rateType,
                        rolloverFraction,
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class AccessSchedule
            @JsonCreator
            private constructor(
                @JsonProperty("add_schedule_items")
                @ExcludeMissing
                private val addScheduleItems: JsonField<List<AddScheduleItem>> = JsonMissing.of(),
                @JsonProperty("remove_schedule_items")
                @ExcludeMissing
                private val removeScheduleItems: JsonField<List<RemoveScheduleItem>> =
                    JsonMissing.of(),
                @JsonProperty("update_schedule_items")
                @ExcludeMissing
                private val updateScheduleItems: JsonField<List<UpdateScheduleItem>> =
                    JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun addScheduleItems(): Optional<List<AddScheduleItem>> =
                    Optional.ofNullable(addScheduleItems.getNullable("add_schedule_items"))

                fun removeScheduleItems(): Optional<List<RemoveScheduleItem>> =
                    Optional.ofNullable(removeScheduleItems.getNullable("remove_schedule_items"))

                fun updateScheduleItems(): Optional<List<UpdateScheduleItem>> =
                    Optional.ofNullable(updateScheduleItems.getNullable("update_schedule_items"))

                @JsonProperty("add_schedule_items")
                @ExcludeMissing
                fun _addScheduleItems(): JsonField<List<AddScheduleItem>> = addScheduleItems

                @JsonProperty("remove_schedule_items")
                @ExcludeMissing
                fun _removeScheduleItems(): JsonField<List<RemoveScheduleItem>> =
                    removeScheduleItems

                @JsonProperty("update_schedule_items")
                @ExcludeMissing
                fun _updateScheduleItems(): JsonField<List<UpdateScheduleItem>> =
                    updateScheduleItems

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): AccessSchedule = apply {
                    if (validated) {
                        return@apply
                    }

                    addScheduleItems().ifPresent { it.forEach { it.validate() } }
                    removeScheduleItems().ifPresent { it.forEach { it.validate() } }
                    updateScheduleItems().ifPresent { it.forEach { it.validate() } }
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [AccessSchedule]. */
                class Builder internal constructor() {

                    private var addScheduleItems: JsonField<MutableList<AddScheduleItem>>? = null
                    private var removeScheduleItems: JsonField<MutableList<RemoveScheduleItem>>? =
                        null
                    private var updateScheduleItems: JsonField<MutableList<UpdateScheduleItem>>? =
                        null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(accessSchedule: AccessSchedule) = apply {
                        addScheduleItems =
                            accessSchedule.addScheduleItems.map { it.toMutableList() }
                        removeScheduleItems =
                            accessSchedule.removeScheduleItems.map { it.toMutableList() }
                        updateScheduleItems =
                            accessSchedule.updateScheduleItems.map { it.toMutableList() }
                        additionalProperties = accessSchedule.additionalProperties.toMutableMap()
                    }

                    fun addScheduleItems(addScheduleItems: List<AddScheduleItem>) =
                        addScheduleItems(JsonField.of(addScheduleItems))

                    fun addScheduleItems(addScheduleItems: JsonField<List<AddScheduleItem>>) =
                        apply {
                            this.addScheduleItems = addScheduleItems.map { it.toMutableList() }
                        }

                    fun addAddScheduleItem(addScheduleItem: AddScheduleItem) = apply {
                        addScheduleItems =
                            (addScheduleItems ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(addScheduleItem)
                            }
                    }

                    fun removeScheduleItems(removeScheduleItems: List<RemoveScheduleItem>) =
                        removeScheduleItems(JsonField.of(removeScheduleItems))

                    fun removeScheduleItems(
                        removeScheduleItems: JsonField<List<RemoveScheduleItem>>
                    ) = apply {
                        this.removeScheduleItems = removeScheduleItems.map { it.toMutableList() }
                    }

                    fun addRemoveScheduleItem(removeScheduleItem: RemoveScheduleItem) = apply {
                        removeScheduleItems =
                            (removeScheduleItems ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(removeScheduleItem)
                            }
                    }

                    fun updateScheduleItems(updateScheduleItems: List<UpdateScheduleItem>) =
                        updateScheduleItems(JsonField.of(updateScheduleItems))

                    fun updateScheduleItems(
                        updateScheduleItems: JsonField<List<UpdateScheduleItem>>
                    ) = apply {
                        this.updateScheduleItems = updateScheduleItems.map { it.toMutableList() }
                    }

                    fun addUpdateScheduleItem(updateScheduleItem: UpdateScheduleItem) = apply {
                        updateScheduleItems =
                            (updateScheduleItems ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(updateScheduleItem)
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

                    fun build(): AccessSchedule =
                        AccessSchedule(
                            (addScheduleItems ?: JsonMissing.of()).map { it.toImmutable() },
                            (removeScheduleItems ?: JsonMissing.of()).map { it.toImmutable() },
                            (updateScheduleItems ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toImmutable(),
                        )
                }

                @NoAutoDetect
                class AddScheduleItem
                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    private val amount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("ending_before")
                    @ExcludeMissing
                    private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("starting_at")
                    @ExcludeMissing
                    private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun amount(): Double = amount.getRequired("amount")

                    /** RFC 3339 timestamp (exclusive) */
                    fun endingBefore(): OffsetDateTime = endingBefore.getRequired("ending_before")

                    /** RFC 3339 timestamp (inclusive) */
                    fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun _amount(): JsonField<Double> = amount

                    /** RFC 3339 timestamp (exclusive) */
                    @JsonProperty("ending_before")
                    @ExcludeMissing
                    fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

                    /** RFC 3339 timestamp (inclusive) */
                    @JsonProperty("starting_at")
                    @ExcludeMissing
                    fun _startingAt(): JsonField<OffsetDateTime> = startingAt

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): AddScheduleItem = apply {
                        if (validated) {
                            return@apply
                        }

                        amount()
                        endingBefore()
                        startingAt()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [AddScheduleItem]. */
                    class Builder internal constructor() {

                        private var amount: JsonField<Double>? = null
                        private var endingBefore: JsonField<OffsetDateTime>? = null
                        private var startingAt: JsonField<OffsetDateTime>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(addScheduleItem: AddScheduleItem) = apply {
                            amount = addScheduleItem.amount
                            endingBefore = addScheduleItem.endingBefore
                            startingAt = addScheduleItem.startingAt
                            additionalProperties =
                                addScheduleItem.additionalProperties.toMutableMap()
                        }

                        fun amount(amount: Double) = amount(JsonField.of(amount))

                        fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                        /** RFC 3339 timestamp (exclusive) */
                        fun endingBefore(endingBefore: OffsetDateTime) =
                            endingBefore(JsonField.of(endingBefore))

                        /** RFC 3339 timestamp (exclusive) */
                        fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                            this.endingBefore = endingBefore
                        }

                        /** RFC 3339 timestamp (inclusive) */
                        fun startingAt(startingAt: OffsetDateTime) =
                            startingAt(JsonField.of(startingAt))

                        /** RFC 3339 timestamp (inclusive) */
                        fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                            this.startingAt = startingAt
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

                        fun build(): AddScheduleItem =
                            AddScheduleItem(
                                checkRequired("amount", amount),
                                checkRequired("endingBefore", endingBefore),
                                checkRequired("startingAt", startingAt),
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AddScheduleItem && amount == other.amount && endingBefore == other.endingBefore && startingAt == other.startingAt && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(amount, endingBefore, startingAt, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "AddScheduleItem{amount=$amount, endingBefore=$endingBefore, startingAt=$startingAt, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class RemoveScheduleItem
                @JsonCreator
                private constructor(
                    @JsonProperty("id")
                    @ExcludeMissing
                    private val id: JsonField<String> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun id(): String = id.getRequired("id")

                    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): RemoveScheduleItem = apply {
                        if (validated) {
                            return@apply
                        }

                        id()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [RemoveScheduleItem]. */
                    class Builder internal constructor() {

                        private var id: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(removeScheduleItem: RemoveScheduleItem) = apply {
                            id = removeScheduleItem.id
                            additionalProperties =
                                removeScheduleItem.additionalProperties.toMutableMap()
                        }

                        fun id(id: String) = id(JsonField.of(id))

                        fun id(id: JsonField<String>) = apply { this.id = id }

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

                        fun build(): RemoveScheduleItem =
                            RemoveScheduleItem(
                                checkRequired("id", id),
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is RemoveScheduleItem && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "RemoveScheduleItem{id=$id, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class UpdateScheduleItem
                @JsonCreator
                private constructor(
                    @JsonProperty("id")
                    @ExcludeMissing
                    private val id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("amount")
                    @ExcludeMissing
                    private val amount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("ending_before")
                    @ExcludeMissing
                    private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("starting_at")
                    @ExcludeMissing
                    private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun id(): String = id.getRequired("id")

                    fun amount(): Optional<Double> =
                        Optional.ofNullable(amount.getNullable("amount"))

                    /** RFC 3339 timestamp (exclusive) */
                    fun endingBefore(): Optional<OffsetDateTime> =
                        Optional.ofNullable(endingBefore.getNullable("ending_before"))

                    /** RFC 3339 timestamp (inclusive) */
                    fun startingAt(): Optional<OffsetDateTime> =
                        Optional.ofNullable(startingAt.getNullable("starting_at"))

                    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun _amount(): JsonField<Double> = amount

                    /** RFC 3339 timestamp (exclusive) */
                    @JsonProperty("ending_before")
                    @ExcludeMissing
                    fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

                    /** RFC 3339 timestamp (inclusive) */
                    @JsonProperty("starting_at")
                    @ExcludeMissing
                    fun _startingAt(): JsonField<OffsetDateTime> = startingAt

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): UpdateScheduleItem = apply {
                        if (validated) {
                            return@apply
                        }

                        id()
                        amount()
                        endingBefore()
                        startingAt()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [UpdateScheduleItem]. */
                    class Builder internal constructor() {

                        private var id: JsonField<String>? = null
                        private var amount: JsonField<Double> = JsonMissing.of()
                        private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
                        private var startingAt: JsonField<OffsetDateTime> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(updateScheduleItem: UpdateScheduleItem) = apply {
                            id = updateScheduleItem.id
                            amount = updateScheduleItem.amount
                            endingBefore = updateScheduleItem.endingBefore
                            startingAt = updateScheduleItem.startingAt
                            additionalProperties =
                                updateScheduleItem.additionalProperties.toMutableMap()
                        }

                        fun id(id: String) = id(JsonField.of(id))

                        fun id(id: JsonField<String>) = apply { this.id = id }

                        fun amount(amount: Double) = amount(JsonField.of(amount))

                        fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                        /** RFC 3339 timestamp (exclusive) */
                        fun endingBefore(endingBefore: OffsetDateTime) =
                            endingBefore(JsonField.of(endingBefore))

                        /** RFC 3339 timestamp (exclusive) */
                        fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                            this.endingBefore = endingBefore
                        }

                        /** RFC 3339 timestamp (inclusive) */
                        fun startingAt(startingAt: OffsetDateTime) =
                            startingAt(JsonField.of(startingAt))

                        /** RFC 3339 timestamp (inclusive) */
                        fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                            this.startingAt = startingAt
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

                        fun build(): UpdateScheduleItem =
                            UpdateScheduleItem(
                                checkRequired("id", id),
                                amount,
                                endingBefore,
                                startingAt,
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is UpdateScheduleItem && id == other.id && amount == other.amount && endingBefore == other.endingBefore && startingAt == other.startingAt && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(id, amount, endingBefore, startingAt, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "UpdateScheduleItem{id=$id, amount=$amount, endingBefore=$endingBefore, startingAt=$startingAt, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is AccessSchedule && addScheduleItems == other.addScheduleItems && removeScheduleItems == other.removeScheduleItems && updateScheduleItems == other.updateScheduleItems && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(addScheduleItems, removeScheduleItems, updateScheduleItems, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AccessSchedule{addScheduleItems=$addScheduleItems, removeScheduleItems=$removeScheduleItems, updateScheduleItems=$updateScheduleItems, additionalProperties=$additionalProperties}"
            }

            /** If set, the credit's rate type was updated to the specified value. */
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

                    @JvmField val LIST_RATE = of("LIST_RATE")

                    @JvmField val COMMIT_RATE = of("COMMIT_RATE")

                    @JvmStatic fun of(value: String) = RateType(JsonField.of(value))
                }

                /** An enum containing [RateType]'s known values. */
                enum class Known {
                    LIST_RATE,
                    COMMIT_RATE,
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
                    LIST_RATE,
                    COMMIT_RATE,
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
                        LIST_RATE -> Value.LIST_RATE
                        COMMIT_RATE -> Value.COMMIT_RATE
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
                        LIST_RATE -> Known.LIST_RATE
                        COMMIT_RATE -> Known.COMMIT_RATE
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

                return /* spotless:off */ other is UpdateCredit && id == other.id && accessSchedule == other.accessSchedule && description == other.description && hierarchyConfiguration == other.hierarchyConfiguration && name == other.name && netsuiteSalesOrderId == other.netsuiteSalesOrderId && priority == other.priority && rateType == other.rateType && rolloverFraction == other.rolloverFraction && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, accessSchedule, description, hierarchyConfiguration, name, netsuiteSalesOrderId, priority, rateType, rolloverFraction, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UpdateCredit{id=$id, accessSchedule=$accessSchedule, description=$description, hierarchyConfiguration=$hierarchyConfiguration, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, priority=$priority, rateType=$rateType, rolloverFraction=$rolloverFraction, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class UpdateDiscount
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("custom_fields")
            @ExcludeMissing
            private val customFields: JsonField<CustomFields> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("netsuite_sales_order_id")
            @ExcludeMissing
            private val netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("schedule")
            @ExcludeMissing
            private val schedule: JsonField<Schedule> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun customFields(): Optional<CustomFields> =
                Optional.ofNullable(customFields.getNullable("custom_fields"))

            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            fun netsuiteSalesOrderId(): Optional<String> =
                Optional.ofNullable(netsuiteSalesOrderId.getNullable("netsuite_sales_order_id"))

            /** Must provide either schedule_items or recurring_schedule. */
            fun schedule(): Optional<Schedule> =
                Optional.ofNullable(schedule.getNullable("schedule"))

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            @JsonProperty("custom_fields")
            @ExcludeMissing
            fun _customFields(): JsonField<CustomFields> = customFields

            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonProperty("netsuite_sales_order_id")
            @ExcludeMissing
            fun _netsuiteSalesOrderId(): JsonField<String> = netsuiteSalesOrderId

            /** Must provide either schedule_items or recurring_schedule. */
            @JsonProperty("schedule")
            @ExcludeMissing
            fun _schedule(): JsonField<Schedule> = schedule

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): UpdateDiscount = apply {
                if (validated) {
                    return@apply
                }

                id()
                customFields().ifPresent { it.validate() }
                name()
                netsuiteSalesOrderId()
                schedule().ifPresent { it.validate() }
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UpdateDiscount]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var customFields: JsonField<CustomFields> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
                private var schedule: JsonField<Schedule> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(updateDiscount: UpdateDiscount) = apply {
                    id = updateDiscount.id
                    customFields = updateDiscount.customFields
                    name = updateDiscount.name
                    netsuiteSalesOrderId = updateDiscount.netsuiteSalesOrderId
                    schedule = updateDiscount.schedule
                    additionalProperties = updateDiscount.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
                fun customFields(customFields: CustomFields) =
                    customFields(JsonField.of(customFields))

                /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
                fun customFields(customFields: JsonField<CustomFields>) = apply {
                    this.customFields = customFields
                }

                fun name(name: String) = name(JsonField.of(name))

                fun name(name: JsonField<String>) = apply { this.name = name }

                fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
                    netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

                fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
                    this.netsuiteSalesOrderId = netsuiteSalesOrderId
                }

                /** Must provide either schedule_items or recurring_schedule. */
                fun schedule(schedule: Schedule) = schedule(JsonField.of(schedule))

                /** Must provide either schedule_items or recurring_schedule. */
                fun schedule(schedule: JsonField<Schedule>) = apply { this.schedule = schedule }

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

                fun build(): UpdateDiscount =
                    UpdateDiscount(
                        checkRequired("id", id),
                        customFields,
                        name,
                        netsuiteSalesOrderId,
                        schedule,
                        additionalProperties.toImmutable(),
                    )
            }

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            @NoAutoDetect
            class CustomFields
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
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

            /** Must provide either schedule_items or recurring_schedule. */
            @NoAutoDetect
            class Schedule
            @JsonCreator
            private constructor(
                @JsonProperty("credit_type_id")
                @ExcludeMissing
                private val creditTypeId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("do_not_invoice")
                @ExcludeMissing
                private val doNotInvoice: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("recurring_schedule")
                @ExcludeMissing
                private val recurringSchedule: JsonField<RecurringSchedule> = JsonMissing.of(),
                @JsonProperty("schedule_items")
                @ExcludeMissing
                private val scheduleItems: JsonField<List<ScheduleItem>> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** Defaults to USD (cents) if not passed. */
                fun creditTypeId(): Optional<String> =
                    Optional.ofNullable(creditTypeId.getNullable("credit_type_id"))

                /**
                 * This field is only applicable to commit invoice schedules. If true, this schedule
                 * will not generate an invoice.
                 */
                fun doNotInvoice(): Optional<Boolean> =
                    Optional.ofNullable(doNotInvoice.getNullable("do_not_invoice"))

                /**
                 * Enter the unit price and quantity for the charge or instead only send the amount.
                 * If amount is sent, the unit price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                fun recurringSchedule(): Optional<RecurringSchedule> =
                    Optional.ofNullable(recurringSchedule.getNullable("recurring_schedule"))

                /** Either provide amount or provide both unit_price and quantity. */
                fun scheduleItems(): Optional<List<ScheduleItem>> =
                    Optional.ofNullable(scheduleItems.getNullable("schedule_items"))

                /** Defaults to USD (cents) if not passed. */
                @JsonProperty("credit_type_id")
                @ExcludeMissing
                fun _creditTypeId(): JsonField<String> = creditTypeId

                /**
                 * This field is only applicable to commit invoice schedules. If true, this schedule
                 * will not generate an invoice.
                 */
                @JsonProperty("do_not_invoice")
                @ExcludeMissing
                fun _doNotInvoice(): JsonField<Boolean> = doNotInvoice

                /**
                 * Enter the unit price and quantity for the charge or instead only send the amount.
                 * If amount is sent, the unit price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                @JsonProperty("recurring_schedule")
                @ExcludeMissing
                fun _recurringSchedule(): JsonField<RecurringSchedule> = recurringSchedule

                /** Either provide amount or provide both unit_price and quantity. */
                @JsonProperty("schedule_items")
                @ExcludeMissing
                fun _scheduleItems(): JsonField<List<ScheduleItem>> = scheduleItems

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

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

                fun toBuilder() = Builder().from(this)

                companion object {

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
                    fun creditTypeId(creditTypeId: String) =
                        creditTypeId(JsonField.of(creditTypeId))

                    /** Defaults to USD (cents) if not passed. */
                    fun creditTypeId(creditTypeId: JsonField<String>) = apply {
                        this.creditTypeId = creditTypeId
                    }

                    /**
                     * This field is only applicable to commit invoice schedules. If true, this
                     * schedule will not generate an invoice.
                     */
                    fun doNotInvoice(doNotInvoice: Boolean) =
                        doNotInvoice(JsonField.of(doNotInvoice))

                    /**
                     * This field is only applicable to commit invoice schedules. If true, this
                     * schedule will not generate an invoice.
                     */
                    fun doNotInvoice(doNotInvoice: JsonField<Boolean>) = apply {
                        this.doNotInvoice = doNotInvoice
                    }

                    /**
                     * Enter the unit price and quantity for the charge or instead only send the
                     * amount. If amount is sent, the unit price is assumed to be the amount and
                     * quantity is inferred to be 1.
                     */
                    fun recurringSchedule(recurringSchedule: RecurringSchedule) =
                        recurringSchedule(JsonField.of(recurringSchedule))

                    /**
                     * Enter the unit price and quantity for the charge or instead only send the
                     * amount. If amount is sent, the unit price is assumed to be the amount and
                     * quantity is inferred to be 1.
                     */
                    fun recurringSchedule(recurringSchedule: JsonField<RecurringSchedule>) = apply {
                        this.recurringSchedule = recurringSchedule
                    }

                    /** Either provide amount or provide both unit_price and quantity. */
                    fun scheduleItems(scheduleItems: List<ScheduleItem>) =
                        scheduleItems(JsonField.of(scheduleItems))

                    /** Either provide amount or provide both unit_price and quantity. */
                    fun scheduleItems(scheduleItems: JsonField<List<ScheduleItem>>) = apply {
                        this.scheduleItems = scheduleItems.map { it.toMutableList() }
                    }

                    /** Either provide amount or provide both unit_price and quantity. */
                    fun addScheduleItem(scheduleItem: ScheduleItem) = apply {
                        scheduleItems =
                            (scheduleItems ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(scheduleItem)
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

                    fun build(): Schedule =
                        Schedule(
                            creditTypeId,
                            doNotInvoice,
                            recurringSchedule,
                            (scheduleItems ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toImmutable(),
                        )
                }

                /**
                 * Enter the unit price and quantity for the charge or instead only send the amount.
                 * If amount is sent, the unit price is assumed to be the amount and quantity is
                 * inferred to be 1.
                 */
                @NoAutoDetect
                class RecurringSchedule
                @JsonCreator
                private constructor(
                    @JsonProperty("amount_distribution")
                    @ExcludeMissing
                    private val amountDistribution: JsonField<AmountDistribution> =
                        JsonMissing.of(),
                    @JsonProperty("ending_before")
                    @ExcludeMissing
                    private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("frequency")
                    @ExcludeMissing
                    private val frequency: JsonField<Frequency> = JsonMissing.of(),
                    @JsonProperty("starting_at")
                    @ExcludeMissing
                    private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("amount")
                    @ExcludeMissing
                    private val amount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("quantity")
                    @ExcludeMissing
                    private val quantity: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("unit_price")
                    @ExcludeMissing
                    private val unitPrice: JsonField<Double> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun amountDistribution(): AmountDistribution =
                        amountDistribution.getRequired("amount_distribution")

                    /** RFC 3339 timestamp (exclusive). */
                    fun endingBefore(): OffsetDateTime = endingBefore.getRequired("ending_before")

                    fun frequency(): Frequency = frequency.getRequired("frequency")

                    /** RFC 3339 timestamp (inclusive). */
                    fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    fun amount(): Optional<Double> =
                        Optional.ofNullable(amount.getNullable("amount"))

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    fun quantity(): Optional<Double> =
                        Optional.ofNullable(quantity.getNullable("quantity"))

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    fun unitPrice(): Optional<Double> =
                        Optional.ofNullable(unitPrice.getNullable("unit_price"))

                    @JsonProperty("amount_distribution")
                    @ExcludeMissing
                    fun _amountDistribution(): JsonField<AmountDistribution> = amountDistribution

                    /** RFC 3339 timestamp (exclusive). */
                    @JsonProperty("ending_before")
                    @ExcludeMissing
                    fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

                    @JsonProperty("frequency")
                    @ExcludeMissing
                    fun _frequency(): JsonField<Frequency> = frequency

                    /** RFC 3339 timestamp (inclusive). */
                    @JsonProperty("starting_at")
                    @ExcludeMissing
                    fun _startingAt(): JsonField<OffsetDateTime> = startingAt

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun _amount(): JsonField<Double> = amount

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    @JsonProperty("quantity")
                    @ExcludeMissing
                    fun _quantity(): JsonField<Double> = quantity

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    @JsonProperty("unit_price")
                    @ExcludeMissing
                    fun _unitPrice(): JsonField<Double> = unitPrice

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): RecurringSchedule = apply {
                        if (validated) {
                            return@apply
                        }

                        amountDistribution()
                        endingBefore()
                        frequency()
                        startingAt()
                        amount()
                        quantity()
                        unitPrice()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

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
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(recurringSchedule: RecurringSchedule) = apply {
                            amountDistribution = recurringSchedule.amountDistribution
                            endingBefore = recurringSchedule.endingBefore
                            frequency = recurringSchedule.frequency
                            startingAt = recurringSchedule.startingAt
                            amount = recurringSchedule.amount
                            quantity = recurringSchedule.quantity
                            unitPrice = recurringSchedule.unitPrice
                            additionalProperties =
                                recurringSchedule.additionalProperties.toMutableMap()
                        }

                        fun amountDistribution(amountDistribution: AmountDistribution) =
                            amountDistribution(JsonField.of(amountDistribution))

                        fun amountDistribution(amountDistribution: JsonField<AmountDistribution>) =
                            apply {
                                this.amountDistribution = amountDistribution
                            }

                        /** RFC 3339 timestamp (exclusive). */
                        fun endingBefore(endingBefore: OffsetDateTime) =
                            endingBefore(JsonField.of(endingBefore))

                        /** RFC 3339 timestamp (exclusive). */
                        fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                            this.endingBefore = endingBefore
                        }

                        fun frequency(frequency: Frequency) = frequency(JsonField.of(frequency))

                        fun frequency(frequency: JsonField<Frequency>) = apply {
                            this.frequency = frequency
                        }

                        /** RFC 3339 timestamp (inclusive). */
                        fun startingAt(startingAt: OffsetDateTime) =
                            startingAt(JsonField.of(startingAt))

                        /** RFC 3339 timestamp (inclusive). */
                        fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                            this.startingAt = startingAt
                        }

                        /**
                         * Amount for the charge. Can be provided instead of unit_price and
                         * quantity. If amount is sent, the unit_price is assumed to be the amount
                         * and quantity is inferred to be 1.
                         */
                        fun amount(amount: Double) = amount(JsonField.of(amount))

                        /**
                         * Amount for the charge. Can be provided instead of unit_price and
                         * quantity. If amount is sent, the unit_price is assumed to be the amount
                         * and quantity is inferred to be 1.
                         */
                        fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                        /**
                         * Quantity for the charge. Will be multiplied by unit_price to determine
                         * the amount and must be specified with unit_price. If specified amount
                         * cannot be provided.
                         */
                        fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                        /**
                         * Quantity for the charge. Will be multiplied by unit_price to determine
                         * the amount and must be specified with unit_price. If specified amount
                         * cannot be provided.
                         */
                        fun quantity(quantity: JsonField<Double>) = apply {
                            this.quantity = quantity
                        }

                        /**
                         * Unit price for the charge. Will be multiplied by quantity to determine
                         * the amount and must be specified with quantity. If specified amount
                         * cannot be provided.
                         */
                        fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

                        /**
                         * Unit price for the charge. Will be multiplied by quantity to determine
                         * the amount and must be specified with quantity. If specified amount
                         * cannot be provided.
                         */
                        fun unitPrice(unitPrice: JsonField<Double>) = apply {
                            this.unitPrice = unitPrice
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

                        fun build(): RecurringSchedule =
                            RecurringSchedule(
                                checkRequired("amountDistribution", amountDistribution),
                                checkRequired("endingBefore", endingBefore),
                                checkRequired("frequency", frequency),
                                checkRequired("startingAt", startingAt),
                                amount,
                                quantity,
                                unitPrice,
                                additionalProperties.toImmutable(),
                            )
                    }

                    class AmountDistribution
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val DIVIDED = of("DIVIDED")

                            @JvmField val DIVIDED_ROUNDED = of("DIVIDED_ROUNDED")

                            @JvmField val EACH = of("EACH")

                            @JvmStatic
                            fun of(value: String) = AmountDistribution(JsonField.of(value))
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
                         * An instance of [AmountDistribution] can contain an unknown value in a
                         * couple of cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            DIVIDED,
                            DIVIDED_ROUNDED,
                            EACH,
                            /**
                             * An enum member indicating that [AmountDistribution] was instantiated
                             * with an unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
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
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws MetronomeInvalidDataException if this class instance's value is a
                         *   not a known member.
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
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws MetronomeInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                MetronomeInvalidDataException("Value is not a String")
                            }

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
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val MONTHLY = of("MONTHLY")

                            @JvmField val QUARTERLY = of("QUARTERLY")

                            @JvmField val SEMI_ANNUAL = of("SEMI_ANNUAL")

                            @JvmField val ANNUAL = of("ANNUAL")

                            @JvmField val WEEKLY = of("WEEKLY")

                            @JvmStatic fun of(value: String) = Frequency(JsonField.of(value))
                        }

                        /** An enum containing [Frequency]'s known values. */
                        enum class Known {
                            MONTHLY,
                            QUARTERLY,
                            SEMI_ANNUAL,
                            ANNUAL,
                            WEEKLY,
                        }

                        /**
                         * An enum containing [Frequency]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Frequency] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            MONTHLY,
                            QUARTERLY,
                            SEMI_ANNUAL,
                            ANNUAL,
                            WEEKLY,
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
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                MONTHLY -> Value.MONTHLY
                                QUARTERLY -> Value.QUARTERLY
                                SEMI_ANNUAL -> Value.SEMI_ANNUAL
                                ANNUAL -> Value.ANNUAL
                                WEEKLY -> Value.WEEKLY
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws MetronomeInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                MONTHLY -> Known.MONTHLY
                                QUARTERLY -> Known.QUARTERLY
                                SEMI_ANNUAL -> Known.SEMI_ANNUAL
                                ANNUAL -> Known.ANNUAL
                                WEEKLY -> Known.WEEKLY
                                else ->
                                    throw MetronomeInvalidDataException("Unknown Frequency: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws MetronomeInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                MetronomeInvalidDataException("Value is not a String")
                            }

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
                    @JsonProperty("timestamp")
                    @ExcludeMissing
                    private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("amount")
                    @ExcludeMissing
                    private val amount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("quantity")
                    @ExcludeMissing
                    private val quantity: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("unit_price")
                    @ExcludeMissing
                    private val unitPrice: JsonField<Double> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** timestamp of the scheduled event */
                    fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    fun amount(): Optional<Double> =
                        Optional.ofNullable(amount.getNullable("amount"))

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    fun quantity(): Optional<Double> =
                        Optional.ofNullable(quantity.getNullable("quantity"))

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    fun unitPrice(): Optional<Double> =
                        Optional.ofNullable(unitPrice.getNullable("unit_price"))

                    /** timestamp of the scheduled event */
                    @JsonProperty("timestamp")
                    @ExcludeMissing
                    fun _timestamp(): JsonField<OffsetDateTime> = timestamp

                    /**
                     * Amount for the charge. Can be provided instead of unit_price and quantity. If
                     * amount is sent, the unit_price is assumed to be the amount and quantity is
                     * inferred to be 1.
                     */
                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun _amount(): JsonField<Double> = amount

                    /**
                     * Quantity for the charge. Will be multiplied by unit_price to determine the
                     * amount and must be specified with unit_price. If specified amount cannot be
                     * provided.
                     */
                    @JsonProperty("quantity")
                    @ExcludeMissing
                    fun _quantity(): JsonField<Double> = quantity

                    /**
                     * Unit price for the charge. Will be multiplied by quantity to determine the
                     * amount and must be specified with quantity. If specified amount cannot be
                     * provided.
                     */
                    @JsonProperty("unit_price")
                    @ExcludeMissing
                    fun _unitPrice(): JsonField<Double> = unitPrice

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

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

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [ScheduleItem]. */
                    class Builder internal constructor() {

                        private var timestamp: JsonField<OffsetDateTime>? = null
                        private var amount: JsonField<Double> = JsonMissing.of()
                        private var quantity: JsonField<Double> = JsonMissing.of()
                        private var unitPrice: JsonField<Double> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(scheduleItem: ScheduleItem) = apply {
                            timestamp = scheduleItem.timestamp
                            amount = scheduleItem.amount
                            quantity = scheduleItem.quantity
                            unitPrice = scheduleItem.unitPrice
                            additionalProperties = scheduleItem.additionalProperties.toMutableMap()
                        }

                        /** timestamp of the scheduled event */
                        fun timestamp(timestamp: OffsetDateTime) =
                            timestamp(JsonField.of(timestamp))

                        /** timestamp of the scheduled event */
                        fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                            this.timestamp = timestamp
                        }

                        /**
                         * Amount for the charge. Can be provided instead of unit_price and
                         * quantity. If amount is sent, the unit_price is assumed to be the amount
                         * and quantity is inferred to be 1.
                         */
                        fun amount(amount: Double) = amount(JsonField.of(amount))

                        /**
                         * Amount for the charge. Can be provided instead of unit_price and
                         * quantity. If amount is sent, the unit_price is assumed to be the amount
                         * and quantity is inferred to be 1.
                         */
                        fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                        /**
                         * Quantity for the charge. Will be multiplied by unit_price to determine
                         * the amount and must be specified with unit_price. If specified amount
                         * cannot be provided.
                         */
                        fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                        /**
                         * Quantity for the charge. Will be multiplied by unit_price to determine
                         * the amount and must be specified with unit_price. If specified amount
                         * cannot be provided.
                         */
                        fun quantity(quantity: JsonField<Double>) = apply {
                            this.quantity = quantity
                        }

                        /**
                         * Unit price for the charge. Will be multiplied by quantity to determine
                         * the amount and must be specified with quantity. If specified amount
                         * cannot be provided.
                         */
                        fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

                        /**
                         * Unit price for the charge. Will be multiplied by quantity to determine
                         * the amount and must be specified with quantity. If specified amount
                         * cannot be provided.
                         */
                        fun unitPrice(unitPrice: JsonField<Double>) = apply {
                            this.unitPrice = unitPrice
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

                        fun build(): ScheduleItem =
                            ScheduleItem(
                                checkRequired("timestamp", timestamp),
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

                    return /* spotless:off */ other is Schedule && creditTypeId == other.creditTypeId && doNotInvoice == other.doNotInvoice && recurringSchedule == other.recurringSchedule && scheduleItems == other.scheduleItems && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(creditTypeId, doNotInvoice, recurringSchedule, scheduleItems, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Schedule{creditTypeId=$creditTypeId, doNotInvoice=$doNotInvoice, recurringSchedule=$recurringSchedule, scheduleItems=$scheduleItems, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is UpdateDiscount && id == other.id && customFields == other.customFields && name == other.name && netsuiteSalesOrderId == other.netsuiteSalesOrderId && schedule == other.schedule && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, customFields, name, netsuiteSalesOrderId, schedule, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UpdateDiscount{id=$id, customFields=$customFields, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, schedule=$schedule, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class UpdatePrepaidBalanceThresholdConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("commit")
            @ExcludeMissing
            private val commit: JsonField<Commit> = JsonMissing.of(),
            @JsonProperty("custom_credit_type_id")
            @ExcludeMissing
            private val customCreditTypeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("is_enabled")
            @ExcludeMissing
            private val isEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("payment_gate_config")
            @ExcludeMissing
            private val paymentGateConfig: JsonField<PaymentGateConfigV2> = JsonMissing.of(),
            @JsonProperty("recharge_to_amount")
            @ExcludeMissing
            private val rechargeToAmount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("threshold_amount")
            @ExcludeMissing
            private val thresholdAmount: JsonField<Double> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun commit(): Optional<Commit> = Optional.ofNullable(commit.getNullable("commit"))

            /**
             * If provided, the threshold, recharge-to amount, and the resulting threshold commit
             * amount will be in terms of this credit type instead of the fiat currency.
             */
            fun customCreditTypeId(): Optional<String> =
                Optional.ofNullable(customCreditTypeId.getNullable("custom_credit_type_id"))

            /**
             * When set to false, the contract will not be evaluated against the threshold_amount.
             * Toggling to true will result an immediate evaluation, regardless of prior state.
             */
            fun isEnabled(): Optional<Boolean> =
                Optional.ofNullable(isEnabled.getNullable("is_enabled"))

            fun paymentGateConfig(): Optional<PaymentGateConfigV2> =
                Optional.ofNullable(paymentGateConfig.getNullable("payment_gate_config"))

            /** Specify the amount the balance should be recharged to. */
            fun rechargeToAmount(): Optional<Double> =
                Optional.ofNullable(rechargeToAmount.getNullable("recharge_to_amount"))

            /**
             * Specify the threshold amount for the contract. Each time the contract's balance
             * lowers to this amount, a threshold charge will be initiated.
             */
            fun thresholdAmount(): Optional<Double> =
                Optional.ofNullable(thresholdAmount.getNullable("threshold_amount"))

            @JsonProperty("commit") @ExcludeMissing fun _commit(): JsonField<Commit> = commit

            /**
             * If provided, the threshold, recharge-to amount, and the resulting threshold commit
             * amount will be in terms of this credit type instead of the fiat currency.
             */
            @JsonProperty("custom_credit_type_id")
            @ExcludeMissing
            fun _customCreditTypeId(): JsonField<String> = customCreditTypeId

            /**
             * When set to false, the contract will not be evaluated against the threshold_amount.
             * Toggling to true will result an immediate evaluation, regardless of prior state.
             */
            @JsonProperty("is_enabled")
            @ExcludeMissing
            fun _isEnabled(): JsonField<Boolean> = isEnabled

            @JsonProperty("payment_gate_config")
            @ExcludeMissing
            fun _paymentGateConfig(): JsonField<PaymentGateConfigV2> = paymentGateConfig

            /** Specify the amount the balance should be recharged to. */
            @JsonProperty("recharge_to_amount")
            @ExcludeMissing
            fun _rechargeToAmount(): JsonField<Double> = rechargeToAmount

            /**
             * Specify the threshold amount for the contract. Each time the contract's balance
             * lowers to this amount, a threshold charge will be initiated.
             */
            @JsonProperty("threshold_amount")
            @ExcludeMissing
            fun _thresholdAmount(): JsonField<Double> = thresholdAmount

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): UpdatePrepaidBalanceThresholdConfiguration = apply {
                if (validated) {
                    return@apply
                }

                commit().ifPresent { it.validate() }
                customCreditTypeId()
                isEnabled()
                paymentGateConfig().ifPresent { it.validate() }
                rechargeToAmount()
                thresholdAmount()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UpdatePrepaidBalanceThresholdConfiguration]. */
            class Builder internal constructor() {

                private var commit: JsonField<Commit> = JsonMissing.of()
                private var customCreditTypeId: JsonField<String> = JsonMissing.of()
                private var isEnabled: JsonField<Boolean> = JsonMissing.of()
                private var paymentGateConfig: JsonField<PaymentGateConfigV2> = JsonMissing.of()
                private var rechargeToAmount: JsonField<Double> = JsonMissing.of()
                private var thresholdAmount: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    updatePrepaidBalanceThresholdConfiguration:
                        UpdatePrepaidBalanceThresholdConfiguration
                ) = apply {
                    commit = updatePrepaidBalanceThresholdConfiguration.commit
                    customCreditTypeId =
                        updatePrepaidBalanceThresholdConfiguration.customCreditTypeId
                    isEnabled = updatePrepaidBalanceThresholdConfiguration.isEnabled
                    paymentGateConfig = updatePrepaidBalanceThresholdConfiguration.paymentGateConfig
                    rechargeToAmount = updatePrepaidBalanceThresholdConfiguration.rechargeToAmount
                    thresholdAmount = updatePrepaidBalanceThresholdConfiguration.thresholdAmount
                    additionalProperties =
                        updatePrepaidBalanceThresholdConfiguration.additionalProperties
                            .toMutableMap()
                }

                fun commit(commit: Commit) = commit(JsonField.of(commit))

                fun commit(commit: JsonField<Commit>) = apply { this.commit = commit }

                /**
                 * If provided, the threshold, recharge-to amount, and the resulting threshold
                 * commit amount will be in terms of this credit type instead of the fiat currency.
                 */
                fun customCreditTypeId(customCreditTypeId: String?) =
                    customCreditTypeId(JsonField.ofNullable(customCreditTypeId))

                /**
                 * If provided, the threshold, recharge-to amount, and the resulting threshold
                 * commit amount will be in terms of this credit type instead of the fiat currency.
                 */
                fun customCreditTypeId(customCreditTypeId: Optional<String>) =
                    customCreditTypeId(customCreditTypeId.orElse(null))

                /**
                 * If provided, the threshold, recharge-to amount, and the resulting threshold
                 * commit amount will be in terms of this credit type instead of the fiat currency.
                 */
                fun customCreditTypeId(customCreditTypeId: JsonField<String>) = apply {
                    this.customCreditTypeId = customCreditTypeId
                }

                /**
                 * When set to false, the contract will not be evaluated against the
                 * threshold_amount. Toggling to true will result an immediate evaluation,
                 * regardless of prior state.
                 */
                fun isEnabled(isEnabled: Boolean) = isEnabled(JsonField.of(isEnabled))

                /**
                 * When set to false, the contract will not be evaluated against the
                 * threshold_amount. Toggling to true will result an immediate evaluation,
                 * regardless of prior state.
                 */
                fun isEnabled(isEnabled: JsonField<Boolean>) = apply { this.isEnabled = isEnabled }

                fun paymentGateConfig(paymentGateConfig: PaymentGateConfigV2) =
                    paymentGateConfig(JsonField.of(paymentGateConfig))

                fun paymentGateConfig(paymentGateConfig: JsonField<PaymentGateConfigV2>) = apply {
                    this.paymentGateConfig = paymentGateConfig
                }

                /** Specify the amount the balance should be recharged to. */
                fun rechargeToAmount(rechargeToAmount: Double) =
                    rechargeToAmount(JsonField.of(rechargeToAmount))

                /** Specify the amount the balance should be recharged to. */
                fun rechargeToAmount(rechargeToAmount: JsonField<Double>) = apply {
                    this.rechargeToAmount = rechargeToAmount
                }

                /**
                 * Specify the threshold amount for the contract. Each time the contract's balance
                 * lowers to this amount, a threshold charge will be initiated.
                 */
                fun thresholdAmount(thresholdAmount: Double) =
                    thresholdAmount(JsonField.of(thresholdAmount))

                /**
                 * Specify the threshold amount for the contract. Each time the contract's balance
                 * lowers to this amount, a threshold charge will be initiated.
                 */
                fun thresholdAmount(thresholdAmount: JsonField<Double>) = apply {
                    this.thresholdAmount = thresholdAmount
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

                fun build(): UpdatePrepaidBalanceThresholdConfiguration =
                    UpdatePrepaidBalanceThresholdConfiguration(
                        commit,
                        customCreditTypeId,
                        isEnabled,
                        paymentGateConfig,
                        rechargeToAmount,
                        thresholdAmount,
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class Commit
            @JsonCreator
            private constructor(
                @JsonProperty("description")
                @ExcludeMissing
                private val description: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name")
                @ExcludeMissing
                private val name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("product_id")
                @ExcludeMissing
                private val productId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("applicable_product_ids")
                @ExcludeMissing
                private val applicableProductIds: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("applicable_product_tags")
                @ExcludeMissing
                private val applicableProductTags: JsonField<List<String>> = JsonMissing.of(),
                @JsonProperty("specifiers")
                @ExcludeMissing
                private val specifiers: JsonField<List<CommitSpecifierInput>> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun description(): Optional<String> =
                    Optional.ofNullable(description.getNullable("description"))

                /**
                 * Specify the name of the line item for the threshold charge. If left blank, it
                 * will default to the commit product name.
                 */
                fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

                /**
                 * The commit product that will be used to generate the line item for commit
                 * payment.
                 */
                fun productId(): Optional<String> =
                    Optional.ofNullable(productId.getNullable("product_id"))

                /**
                 * Which products the threshold commit applies to. If both applicable_product_ids
                 * and applicable_product_tags are not provided, the commit applies to all products.
                 */
                fun applicableProductIds(): Optional<List<String>> =
                    Optional.ofNullable(applicableProductIds.getNullable("applicable_product_ids"))

                /**
                 * Which tags the threshold commit applies to. If both applicable_product_ids and
                 * applicable_product_tags are not provided, the commit applies to all products.
                 */
                fun applicableProductTags(): Optional<List<String>> =
                    Optional.ofNullable(
                        applicableProductTags.getNullable("applicable_product_tags")
                    )

                /**
                 * List of filters that determine what kind of customer usage draws down a commit or
                 * credit. A customer's usage needs to meet the condition of at least one of the
                 * specifiers to contribute to a commit's or credit's drawdown. This field cannot be
                 * used together with `applicable_product_ids` or `applicable_product_tags`.
                 * Instead, to target usage by product or product tag, pass those values in the body
                 * of `specifiers`.
                 */
                fun specifiers(): Optional<List<CommitSpecifierInput>> =
                    Optional.ofNullable(specifiers.getNullable("specifiers"))

                @JsonProperty("description")
                @ExcludeMissing
                fun _description(): JsonField<String> = description

                /**
                 * Specify the name of the line item for the threshold charge. If left blank, it
                 * will default to the commit product name.
                 */
                @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

                /**
                 * The commit product that will be used to generate the line item for commit
                 * payment.
                 */
                @JsonProperty("product_id")
                @ExcludeMissing
                fun _productId(): JsonField<String> = productId

                /**
                 * Which products the threshold commit applies to. If both applicable_product_ids
                 * and applicable_product_tags are not provided, the commit applies to all products.
                 */
                @JsonProperty("applicable_product_ids")
                @ExcludeMissing
                fun _applicableProductIds(): JsonField<List<String>> = applicableProductIds

                /**
                 * Which tags the threshold commit applies to. If both applicable_product_ids and
                 * applicable_product_tags are not provided, the commit applies to all products.
                 */
                @JsonProperty("applicable_product_tags")
                @ExcludeMissing
                fun _applicableProductTags(): JsonField<List<String>> = applicableProductTags

                /**
                 * List of filters that determine what kind of customer usage draws down a commit or
                 * credit. A customer's usage needs to meet the condition of at least one of the
                 * specifiers to contribute to a commit's or credit's drawdown. This field cannot be
                 * used together with `applicable_product_ids` or `applicable_product_tags`.
                 * Instead, to target usage by product or product tag, pass those values in the body
                 * of `specifiers`.
                 */
                @JsonProperty("specifiers")
                @ExcludeMissing
                fun _specifiers(): JsonField<List<CommitSpecifierInput>> = specifiers

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toUpdateBaseThresholdCommit(): UpdateBaseThresholdCommit =
                    UpdateBaseThresholdCommit.builder()
                        .description(description)
                        .name(name)
                        .productId(productId)
                        .build()

                private var validated: Boolean = false

                fun validate(): Commit = apply {
                    if (validated) {
                        return@apply
                    }

                    description()
                    name()
                    productId()
                    applicableProductIds()
                    applicableProductTags()
                    specifiers().ifPresent { it.forEach { it.validate() } }
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Commit]. */
                class Builder internal constructor() {

                    private var description: JsonField<String> = JsonMissing.of()
                    private var name: JsonField<String> = JsonMissing.of()
                    private var productId: JsonField<String> = JsonMissing.of()
                    private var applicableProductIds: JsonField<MutableList<String>>? = null
                    private var applicableProductTags: JsonField<MutableList<String>>? = null
                    private var specifiers: JsonField<MutableList<CommitSpecifierInput>>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(commit: Commit) = apply {
                        description = commit.description
                        name = commit.name
                        productId = commit.productId
                        applicableProductIds =
                            commit.applicableProductIds.map { it.toMutableList() }
                        applicableProductTags =
                            commit.applicableProductTags.map { it.toMutableList() }
                        specifiers = commit.specifiers.map { it.toMutableList() }
                        additionalProperties = commit.additionalProperties.toMutableMap()
                    }

                    fun description(description: String) = description(JsonField.of(description))

                    fun description(description: JsonField<String>) = apply {
                        this.description = description
                    }

                    /**
                     * Specify the name of the line item for the threshold charge. If left blank, it
                     * will default to the commit product name.
                     */
                    fun name(name: String) = name(JsonField.of(name))

                    /**
                     * Specify the name of the line item for the threshold charge. If left blank, it
                     * will default to the commit product name.
                     */
                    fun name(name: JsonField<String>) = apply { this.name = name }

                    /**
                     * The commit product that will be used to generate the line item for commit
                     * payment.
                     */
                    fun productId(productId: String) = productId(JsonField.of(productId))

                    /**
                     * The commit product that will be used to generate the line item for commit
                     * payment.
                     */
                    fun productId(productId: JsonField<String>) = apply {
                        this.productId = productId
                    }

                    /**
                     * Which products the threshold commit applies to. If both
                     * applicable_product_ids and applicable_product_tags are not provided, the
                     * commit applies to all products.
                     */
                    fun applicableProductIds(applicableProductIds: List<String>?) =
                        applicableProductIds(JsonField.ofNullable(applicableProductIds))

                    /**
                     * Which products the threshold commit applies to. If both
                     * applicable_product_ids and applicable_product_tags are not provided, the
                     * commit applies to all products.
                     */
                    fun applicableProductIds(applicableProductIds: Optional<List<String>>) =
                        applicableProductIds(applicableProductIds.orElse(null))

                    /**
                     * Which products the threshold commit applies to. If both
                     * applicable_product_ids and applicable_product_tags are not provided, the
                     * commit applies to all products.
                     */
                    fun applicableProductIds(applicableProductIds: JsonField<List<String>>) =
                        apply {
                            this.applicableProductIds =
                                applicableProductIds.map { it.toMutableList() }
                        }

                    /**
                     * Which products the threshold commit applies to. If both
                     * applicable_product_ids and applicable_product_tags are not provided, the
                     * commit applies to all products.
                     */
                    fun addApplicableProductId(applicableProductId: String) = apply {
                        applicableProductIds =
                            (applicableProductIds ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(applicableProductId)
                            }
                    }

                    /**
                     * Which tags the threshold commit applies to. If both applicable_product_ids
                     * and applicable_product_tags are not provided, the commit applies to all
                     * products.
                     */
                    fun applicableProductTags(applicableProductTags: List<String>?) =
                        applicableProductTags(JsonField.ofNullable(applicableProductTags))

                    /**
                     * Which tags the threshold commit applies to. If both applicable_product_ids
                     * and applicable_product_tags are not provided, the commit applies to all
                     * products.
                     */
                    fun applicableProductTags(applicableProductTags: Optional<List<String>>) =
                        applicableProductTags(applicableProductTags.orElse(null))

                    /**
                     * Which tags the threshold commit applies to. If both applicable_product_ids
                     * and applicable_product_tags are not provided, the commit applies to all
                     * products.
                     */
                    fun applicableProductTags(applicableProductTags: JsonField<List<String>>) =
                        apply {
                            this.applicableProductTags =
                                applicableProductTags.map { it.toMutableList() }
                        }

                    /**
                     * Which tags the threshold commit applies to. If both applicable_product_ids
                     * and applicable_product_tags are not provided, the commit applies to all
                     * products.
                     */
                    fun addApplicableProductTag(applicableProductTag: String) = apply {
                        applicableProductTags =
                            (applicableProductTags ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(applicableProductTag)
                            }
                    }

                    /**
                     * List of filters that determine what kind of customer usage draws down a
                     * commit or credit. A customer's usage needs to meet the condition of at least
                     * one of the specifiers to contribute to a commit's or credit's drawdown. This
                     * field cannot be used together with `applicable_product_ids` or
                     * `applicable_product_tags`. Instead, to target usage by product or product
                     * tag, pass those values in the body of `specifiers`.
                     */
                    fun specifiers(specifiers: List<CommitSpecifierInput>?) =
                        specifiers(JsonField.ofNullable(specifiers))

                    /**
                     * List of filters that determine what kind of customer usage draws down a
                     * commit or credit. A customer's usage needs to meet the condition of at least
                     * one of the specifiers to contribute to a commit's or credit's drawdown. This
                     * field cannot be used together with `applicable_product_ids` or
                     * `applicable_product_tags`. Instead, to target usage by product or product
                     * tag, pass those values in the body of `specifiers`.
                     */
                    fun specifiers(specifiers: Optional<List<CommitSpecifierInput>>) =
                        specifiers(specifiers.orElse(null))

                    /**
                     * List of filters that determine what kind of customer usage draws down a
                     * commit or credit. A customer's usage needs to meet the condition of at least
                     * one of the specifiers to contribute to a commit's or credit's drawdown. This
                     * field cannot be used together with `applicable_product_ids` or
                     * `applicable_product_tags`. Instead, to target usage by product or product
                     * tag, pass those values in the body of `specifiers`.
                     */
                    fun specifiers(specifiers: JsonField<List<CommitSpecifierInput>>) = apply {
                        this.specifiers = specifiers.map { it.toMutableList() }
                    }

                    /**
                     * List of filters that determine what kind of customer usage draws down a
                     * commit or credit. A customer's usage needs to meet the condition of at least
                     * one of the specifiers to contribute to a commit's or credit's drawdown. This
                     * field cannot be used together with `applicable_product_ids` or
                     * `applicable_product_tags`. Instead, to target usage by product or product
                     * tag, pass those values in the body of `specifiers`.
                     */
                    fun addSpecifier(specifier: CommitSpecifierInput) = apply {
                        specifiers =
                            (specifiers ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(specifier)
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

                    fun build(): Commit =
                        Commit(
                            description,
                            name,
                            productId,
                            (applicableProductIds ?: JsonMissing.of()).map { it.toImmutable() },
                            (applicableProductTags ?: JsonMissing.of()).map { it.toImmutable() },
                            (specifiers ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Commit && description == other.description && name == other.name && productId == other.productId && applicableProductIds == other.applicableProductIds && applicableProductTags == other.applicableProductTags && specifiers == other.specifiers && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(description, name, productId, applicableProductIds, applicableProductTags, specifiers, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Commit{description=$description, name=$name, productId=$productId, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, specifiers=$specifiers, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is UpdatePrepaidBalanceThresholdConfiguration && commit == other.commit && customCreditTypeId == other.customCreditTypeId && isEnabled == other.isEnabled && paymentGateConfig == other.paymentGateConfig && rechargeToAmount == other.rechargeToAmount && thresholdAmount == other.thresholdAmount && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(commit, customCreditTypeId, isEnabled, paymentGateConfig, rechargeToAmount, thresholdAmount, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UpdatePrepaidBalanceThresholdConfiguration{commit=$commit, customCreditTypeId=$customCreditTypeId, isEnabled=$isEnabled, paymentGateConfig=$paymentGateConfig, rechargeToAmount=$rechargeToAmount, thresholdAmount=$thresholdAmount, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class UpdateRecurringCommit
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("access_amount")
            @ExcludeMissing
            private val accessAmount: JsonField<AccessAmount> = JsonMissing.of(),
            @JsonProperty("ending_before")
            @ExcludeMissing
            private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("invoice_amount")
            @ExcludeMissing
            private val invoiceAmount: JsonField<InvoiceAmount> = JsonMissing.of(),
            @JsonProperty("rate_type")
            @ExcludeMissing
            private val rateType: JsonField<RateType> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun accessAmount(): Optional<AccessAmount> =
                Optional.ofNullable(accessAmount.getNullable("access_amount"))

            fun endingBefore(): Optional<OffsetDateTime> =
                Optional.ofNullable(endingBefore.getNullable("ending_before"))

            fun invoiceAmount(): Optional<InvoiceAmount> =
                Optional.ofNullable(invoiceAmount.getNullable("invoice_amount"))

            fun rateType(): Optional<RateType> =
                Optional.ofNullable(rateType.getNullable("rate_type"))

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonProperty("access_amount")
            @ExcludeMissing
            fun _accessAmount(): JsonField<AccessAmount> = accessAmount

            @JsonProperty("ending_before")
            @ExcludeMissing
            fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

            @JsonProperty("invoice_amount")
            @ExcludeMissing
            fun _invoiceAmount(): JsonField<InvoiceAmount> = invoiceAmount

            @JsonProperty("rate_type")
            @ExcludeMissing
            fun _rateType(): JsonField<RateType> = rateType

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): UpdateRecurringCommit = apply {
                if (validated) {
                    return@apply
                }

                id()
                accessAmount().ifPresent { it.validate() }
                endingBefore()
                invoiceAmount().ifPresent { it.validate() }
                rateType()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UpdateRecurringCommit]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var accessAmount: JsonField<AccessAmount> = JsonMissing.of()
                private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
                private var invoiceAmount: JsonField<InvoiceAmount> = JsonMissing.of()
                private var rateType: JsonField<RateType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(updateRecurringCommit: UpdateRecurringCommit) = apply {
                    id = updateRecurringCommit.id
                    accessAmount = updateRecurringCommit.accessAmount
                    endingBefore = updateRecurringCommit.endingBefore
                    invoiceAmount = updateRecurringCommit.invoiceAmount
                    rateType = updateRecurringCommit.rateType
                    additionalProperties = updateRecurringCommit.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun accessAmount(accessAmount: AccessAmount) =
                    accessAmount(JsonField.of(accessAmount))

                fun accessAmount(accessAmount: JsonField<AccessAmount>) = apply {
                    this.accessAmount = accessAmount
                }

                fun endingBefore(endingBefore: OffsetDateTime) =
                    endingBefore(JsonField.of(endingBefore))

                fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                    this.endingBefore = endingBefore
                }

                fun invoiceAmount(invoiceAmount: InvoiceAmount) =
                    invoiceAmount(JsonField.of(invoiceAmount))

                fun invoiceAmount(invoiceAmount: JsonField<InvoiceAmount>) = apply {
                    this.invoiceAmount = invoiceAmount
                }

                fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

                fun rateType(rateType: JsonField<RateType>) = apply { this.rateType = rateType }

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

                fun build(): UpdateRecurringCommit =
                    UpdateRecurringCommit(
                        checkRequired("id", id),
                        accessAmount,
                        endingBefore,
                        invoiceAmount,
                        rateType,
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class AccessAmount
            @JsonCreator
            private constructor(
                @JsonProperty("quantity")
                @ExcludeMissing
                private val quantity: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("unit_price")
                @ExcludeMissing
                private val unitPrice: JsonField<Double> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun quantity(): Optional<Double> =
                    Optional.ofNullable(quantity.getNullable("quantity"))

                fun unitPrice(): Optional<Double> =
                    Optional.ofNullable(unitPrice.getNullable("unit_price"))

                @JsonProperty("quantity")
                @ExcludeMissing
                fun _quantity(): JsonField<Double> = quantity

                @JsonProperty("unit_price")
                @ExcludeMissing
                fun _unitPrice(): JsonField<Double> = unitPrice

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): AccessAmount = apply {
                    if (validated) {
                        return@apply
                    }

                    quantity()
                    unitPrice()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [AccessAmount]. */
                class Builder internal constructor() {

                    private var quantity: JsonField<Double> = JsonMissing.of()
                    private var unitPrice: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(accessAmount: AccessAmount) = apply {
                        quantity = accessAmount.quantity
                        unitPrice = accessAmount.unitPrice
                        additionalProperties = accessAmount.additionalProperties.toMutableMap()
                    }

                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                    fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

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

                    fun build(): AccessAmount =
                        AccessAmount(quantity, unitPrice, additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is AccessAmount && quantity == other.quantity && unitPrice == other.unitPrice && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(quantity, unitPrice, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AccessAmount{quantity=$quantity, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class InvoiceAmount
            @JsonCreator
            private constructor(
                @JsonProperty("quantity")
                @ExcludeMissing
                private val quantity: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("unit_price")
                @ExcludeMissing
                private val unitPrice: JsonField<Double> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun quantity(): Optional<Double> =
                    Optional.ofNullable(quantity.getNullable("quantity"))

                fun unitPrice(): Optional<Double> =
                    Optional.ofNullable(unitPrice.getNullable("unit_price"))

                @JsonProperty("quantity")
                @ExcludeMissing
                fun _quantity(): JsonField<Double> = quantity

                @JsonProperty("unit_price")
                @ExcludeMissing
                fun _unitPrice(): JsonField<Double> = unitPrice

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): InvoiceAmount = apply {
                    if (validated) {
                        return@apply
                    }

                    quantity()
                    unitPrice()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [InvoiceAmount]. */
                class Builder internal constructor() {

                    private var quantity: JsonField<Double> = JsonMissing.of()
                    private var unitPrice: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(invoiceAmount: InvoiceAmount) = apply {
                        quantity = invoiceAmount.quantity
                        unitPrice = invoiceAmount.unitPrice
                        additionalProperties = invoiceAmount.additionalProperties.toMutableMap()
                    }

                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                    fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

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

                    fun build(): InvoiceAmount =
                        InvoiceAmount(quantity, unitPrice, additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is InvoiceAmount && quantity == other.quantity && unitPrice == other.unitPrice && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(quantity, unitPrice, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "InvoiceAmount{quantity=$quantity, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
            }

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

                    @JvmField val LIST_RATE = of("LIST_RATE")

                    @JvmField val COMMIT_RATE = of("COMMIT_RATE")

                    @JvmStatic fun of(value: String) = RateType(JsonField.of(value))
                }

                /** An enum containing [RateType]'s known values. */
                enum class Known {
                    LIST_RATE,
                    COMMIT_RATE,
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
                    LIST_RATE,
                    COMMIT_RATE,
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
                        LIST_RATE -> Value.LIST_RATE
                        COMMIT_RATE -> Value.COMMIT_RATE
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
                        LIST_RATE -> Known.LIST_RATE
                        COMMIT_RATE -> Known.COMMIT_RATE
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

                return /* spotless:off */ other is UpdateRecurringCommit && id == other.id && accessAmount == other.accessAmount && endingBefore == other.endingBefore && invoiceAmount == other.invoiceAmount && rateType == other.rateType && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, accessAmount, endingBefore, invoiceAmount, rateType, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UpdateRecurringCommit{id=$id, accessAmount=$accessAmount, endingBefore=$endingBefore, invoiceAmount=$invoiceAmount, rateType=$rateType, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class UpdateRecurringCredit
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("access_amount")
            @ExcludeMissing
            private val accessAmount: JsonField<AccessAmount> = JsonMissing.of(),
            @JsonProperty("ending_before")
            @ExcludeMissing
            private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("rate_type")
            @ExcludeMissing
            private val rateType: JsonField<RateType> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun accessAmount(): Optional<AccessAmount> =
                Optional.ofNullable(accessAmount.getNullable("access_amount"))

            fun endingBefore(): Optional<OffsetDateTime> =
                Optional.ofNullable(endingBefore.getNullable("ending_before"))

            fun rateType(): Optional<RateType> =
                Optional.ofNullable(rateType.getNullable("rate_type"))

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonProperty("access_amount")
            @ExcludeMissing
            fun _accessAmount(): JsonField<AccessAmount> = accessAmount

            @JsonProperty("ending_before")
            @ExcludeMissing
            fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

            @JsonProperty("rate_type")
            @ExcludeMissing
            fun _rateType(): JsonField<RateType> = rateType

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): UpdateRecurringCredit = apply {
                if (validated) {
                    return@apply
                }

                id()
                accessAmount().ifPresent { it.validate() }
                endingBefore()
                rateType()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UpdateRecurringCredit]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var accessAmount: JsonField<AccessAmount> = JsonMissing.of()
                private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
                private var rateType: JsonField<RateType> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(updateRecurringCredit: UpdateRecurringCredit) = apply {
                    id = updateRecurringCredit.id
                    accessAmount = updateRecurringCredit.accessAmount
                    endingBefore = updateRecurringCredit.endingBefore
                    rateType = updateRecurringCredit.rateType
                    additionalProperties = updateRecurringCredit.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun accessAmount(accessAmount: AccessAmount) =
                    accessAmount(JsonField.of(accessAmount))

                fun accessAmount(accessAmount: JsonField<AccessAmount>) = apply {
                    this.accessAmount = accessAmount
                }

                fun endingBefore(endingBefore: OffsetDateTime) =
                    endingBefore(JsonField.of(endingBefore))

                fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                    this.endingBefore = endingBefore
                }

                fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

                fun rateType(rateType: JsonField<RateType>) = apply { this.rateType = rateType }

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

                fun build(): UpdateRecurringCredit =
                    UpdateRecurringCredit(
                        checkRequired("id", id),
                        accessAmount,
                        endingBefore,
                        rateType,
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class AccessAmount
            @JsonCreator
            private constructor(
                @JsonProperty("quantity")
                @ExcludeMissing
                private val quantity: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("unit_price")
                @ExcludeMissing
                private val unitPrice: JsonField<Double> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun quantity(): Optional<Double> =
                    Optional.ofNullable(quantity.getNullable("quantity"))

                fun unitPrice(): Optional<Double> =
                    Optional.ofNullable(unitPrice.getNullable("unit_price"))

                @JsonProperty("quantity")
                @ExcludeMissing
                fun _quantity(): JsonField<Double> = quantity

                @JsonProperty("unit_price")
                @ExcludeMissing
                fun _unitPrice(): JsonField<Double> = unitPrice

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): AccessAmount = apply {
                    if (validated) {
                        return@apply
                    }

                    quantity()
                    unitPrice()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [AccessAmount]. */
                class Builder internal constructor() {

                    private var quantity: JsonField<Double> = JsonMissing.of()
                    private var unitPrice: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(accessAmount: AccessAmount) = apply {
                        quantity = accessAmount.quantity
                        unitPrice = accessAmount.unitPrice
                        additionalProperties = accessAmount.additionalProperties.toMutableMap()
                    }

                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                    fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

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

                    fun build(): AccessAmount =
                        AccessAmount(quantity, unitPrice, additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is AccessAmount && quantity == other.quantity && unitPrice == other.unitPrice && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(quantity, unitPrice, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "AccessAmount{quantity=$quantity, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
            }

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

                    @JvmField val LIST_RATE = of("LIST_RATE")

                    @JvmField val COMMIT_RATE = of("COMMIT_RATE")

                    @JvmStatic fun of(value: String) = RateType(JsonField.of(value))
                }

                /** An enum containing [RateType]'s known values. */
                enum class Known {
                    LIST_RATE,
                    COMMIT_RATE,
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
                    LIST_RATE,
                    COMMIT_RATE,
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
                        LIST_RATE -> Value.LIST_RATE
                        COMMIT_RATE -> Value.COMMIT_RATE
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
                        LIST_RATE -> Known.LIST_RATE
                        COMMIT_RATE -> Known.COMMIT_RATE
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

                return /* spotless:off */ other is UpdateRecurringCredit && id == other.id && accessAmount == other.accessAmount && endingBefore == other.endingBefore && rateType == other.rateType && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, accessAmount, endingBefore, rateType, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UpdateRecurringCredit{id=$id, accessAmount=$accessAmount, endingBefore=$endingBefore, rateType=$rateType, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class UpdateRefundInvoice
        @JsonCreator
        private constructor(
            @JsonProperty("date")
            @ExcludeMissing
            private val date: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("invoice_id")
            @ExcludeMissing
            private val invoiceId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun date(): OffsetDateTime = date.getRequired("date")

            fun invoiceId(): String = invoiceId.getRequired("invoice_id")

            @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<OffsetDateTime> = date

            @JsonProperty("invoice_id")
            @ExcludeMissing
            fun _invoiceId(): JsonField<String> = invoiceId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): UpdateRefundInvoice = apply {
                if (validated) {
                    return@apply
                }

                date()
                invoiceId()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UpdateRefundInvoice]. */
            class Builder internal constructor() {

                private var date: JsonField<OffsetDateTime>? = null
                private var invoiceId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(updateRefundInvoice: UpdateRefundInvoice) = apply {
                    date = updateRefundInvoice.date
                    invoiceId = updateRefundInvoice.invoiceId
                    additionalProperties = updateRefundInvoice.additionalProperties.toMutableMap()
                }

                fun date(date: OffsetDateTime) = date(JsonField.of(date))

                fun date(date: JsonField<OffsetDateTime>) = apply { this.date = date }

                fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

                fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

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

                fun build(): UpdateRefundInvoice =
                    UpdateRefundInvoice(
                        checkRequired("date", date),
                        checkRequired("invoiceId", invoiceId),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is UpdateRefundInvoice && date == other.date && invoiceId == other.invoiceId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(date, invoiceId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UpdateRefundInvoice{date=$date, invoiceId=$invoiceId, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class UpdateScheduledCharge
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("invoice_schedule")
            @ExcludeMissing
            private val invoiceSchedule: JsonField<InvoiceSchedule> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("netsuite_sales_order_id")
            @ExcludeMissing
            private val netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun invoiceSchedule(): Optional<InvoiceSchedule> =
                Optional.ofNullable(invoiceSchedule.getNullable("invoice_schedule"))

            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            fun netsuiteSalesOrderId(): Optional<String> =
                Optional.ofNullable(netsuiteSalesOrderId.getNullable("netsuite_sales_order_id"))

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonProperty("invoice_schedule")
            @ExcludeMissing
            fun _invoiceSchedule(): JsonField<InvoiceSchedule> = invoiceSchedule

            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonProperty("netsuite_sales_order_id")
            @ExcludeMissing
            fun _netsuiteSalesOrderId(): JsonField<String> = netsuiteSalesOrderId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): UpdateScheduledCharge = apply {
                if (validated) {
                    return@apply
                }

                id()
                invoiceSchedule().ifPresent { it.validate() }
                name()
                netsuiteSalesOrderId()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UpdateScheduledCharge]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var invoiceSchedule: JsonField<InvoiceSchedule> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(updateScheduledCharge: UpdateScheduledCharge) = apply {
                    id = updateScheduledCharge.id
                    invoiceSchedule = updateScheduledCharge.invoiceSchedule
                    name = updateScheduledCharge.name
                    netsuiteSalesOrderId = updateScheduledCharge.netsuiteSalesOrderId
                    additionalProperties = updateScheduledCharge.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun invoiceSchedule(invoiceSchedule: InvoiceSchedule) =
                    invoiceSchedule(JsonField.of(invoiceSchedule))

                fun invoiceSchedule(invoiceSchedule: JsonField<InvoiceSchedule>) = apply {
                    this.invoiceSchedule = invoiceSchedule
                }

                fun name(name: String) = name(JsonField.of(name))

                fun name(name: JsonField<String>) = apply { this.name = name }

                fun netsuiteSalesOrderId(netsuiteSalesOrderId: String?) =
                    netsuiteSalesOrderId(JsonField.ofNullable(netsuiteSalesOrderId))

                fun netsuiteSalesOrderId(netsuiteSalesOrderId: Optional<String>) =
                    netsuiteSalesOrderId(netsuiteSalesOrderId.orElse(null))

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

                fun build(): UpdateScheduledCharge =
                    UpdateScheduledCharge(
                        checkRequired("id", id),
                        invoiceSchedule,
                        name,
                        netsuiteSalesOrderId,
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class InvoiceSchedule
            @JsonCreator
            private constructor(
                @JsonProperty("add_schedule_items")
                @ExcludeMissing
                private val addScheduleItems: JsonField<List<AddScheduleItem>> = JsonMissing.of(),
                @JsonProperty("remove_schedule_items")
                @ExcludeMissing
                private val removeScheduleItems: JsonField<List<RemoveScheduleItem>> =
                    JsonMissing.of(),
                @JsonProperty("update_schedule_items")
                @ExcludeMissing
                private val updateScheduleItems: JsonField<List<UpdateScheduleItem>> =
                    JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun addScheduleItems(): Optional<List<AddScheduleItem>> =
                    Optional.ofNullable(addScheduleItems.getNullable("add_schedule_items"))

                fun removeScheduleItems(): Optional<List<RemoveScheduleItem>> =
                    Optional.ofNullable(removeScheduleItems.getNullable("remove_schedule_items"))

                fun updateScheduleItems(): Optional<List<UpdateScheduleItem>> =
                    Optional.ofNullable(updateScheduleItems.getNullable("update_schedule_items"))

                @JsonProperty("add_schedule_items")
                @ExcludeMissing
                fun _addScheduleItems(): JsonField<List<AddScheduleItem>> = addScheduleItems

                @JsonProperty("remove_schedule_items")
                @ExcludeMissing
                fun _removeScheduleItems(): JsonField<List<RemoveScheduleItem>> =
                    removeScheduleItems

                @JsonProperty("update_schedule_items")
                @ExcludeMissing
                fun _updateScheduleItems(): JsonField<List<UpdateScheduleItem>> =
                    updateScheduleItems

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): InvoiceSchedule = apply {
                    if (validated) {
                        return@apply
                    }

                    addScheduleItems().ifPresent { it.forEach { it.validate() } }
                    removeScheduleItems().ifPresent { it.forEach { it.validate() } }
                    updateScheduleItems().ifPresent { it.forEach { it.validate() } }
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [InvoiceSchedule]. */
                class Builder internal constructor() {

                    private var addScheduleItems: JsonField<MutableList<AddScheduleItem>>? = null
                    private var removeScheduleItems: JsonField<MutableList<RemoveScheduleItem>>? =
                        null
                    private var updateScheduleItems: JsonField<MutableList<UpdateScheduleItem>>? =
                        null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(invoiceSchedule: InvoiceSchedule) = apply {
                        addScheduleItems =
                            invoiceSchedule.addScheduleItems.map { it.toMutableList() }
                        removeScheduleItems =
                            invoiceSchedule.removeScheduleItems.map { it.toMutableList() }
                        updateScheduleItems =
                            invoiceSchedule.updateScheduleItems.map { it.toMutableList() }
                        additionalProperties = invoiceSchedule.additionalProperties.toMutableMap()
                    }

                    fun addScheduleItems(addScheduleItems: List<AddScheduleItem>) =
                        addScheduleItems(JsonField.of(addScheduleItems))

                    fun addScheduleItems(addScheduleItems: JsonField<List<AddScheduleItem>>) =
                        apply {
                            this.addScheduleItems = addScheduleItems.map { it.toMutableList() }
                        }

                    fun addAddScheduleItem(addScheduleItem: AddScheduleItem) = apply {
                        addScheduleItems =
                            (addScheduleItems ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(addScheduleItem)
                            }
                    }

                    fun removeScheduleItems(removeScheduleItems: List<RemoveScheduleItem>) =
                        removeScheduleItems(JsonField.of(removeScheduleItems))

                    fun removeScheduleItems(
                        removeScheduleItems: JsonField<List<RemoveScheduleItem>>
                    ) = apply {
                        this.removeScheduleItems = removeScheduleItems.map { it.toMutableList() }
                    }

                    fun addRemoveScheduleItem(removeScheduleItem: RemoveScheduleItem) = apply {
                        removeScheduleItems =
                            (removeScheduleItems ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(removeScheduleItem)
                            }
                    }

                    fun updateScheduleItems(updateScheduleItems: List<UpdateScheduleItem>) =
                        updateScheduleItems(JsonField.of(updateScheduleItems))

                    fun updateScheduleItems(
                        updateScheduleItems: JsonField<List<UpdateScheduleItem>>
                    ) = apply {
                        this.updateScheduleItems = updateScheduleItems.map { it.toMutableList() }
                    }

                    fun addUpdateScheduleItem(updateScheduleItem: UpdateScheduleItem) = apply {
                        updateScheduleItems =
                            (updateScheduleItems ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(updateScheduleItem)
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

                    fun build(): InvoiceSchedule =
                        InvoiceSchedule(
                            (addScheduleItems ?: JsonMissing.of()).map { it.toImmutable() },
                            (removeScheduleItems ?: JsonMissing.of()).map { it.toImmutable() },
                            (updateScheduleItems ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toImmutable(),
                        )
                }

                @NoAutoDetect
                class AddScheduleItem
                @JsonCreator
                private constructor(
                    @JsonProperty("timestamp")
                    @ExcludeMissing
                    private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("amount")
                    @ExcludeMissing
                    private val amount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("quantity")
                    @ExcludeMissing
                    private val quantity: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("unit_price")
                    @ExcludeMissing
                    private val unitPrice: JsonField<Double> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

                    fun amount(): Optional<Double> =
                        Optional.ofNullable(amount.getNullable("amount"))

                    fun quantity(): Optional<Double> =
                        Optional.ofNullable(quantity.getNullable("quantity"))

                    fun unitPrice(): Optional<Double> =
                        Optional.ofNullable(unitPrice.getNullable("unit_price"))

                    @JsonProperty("timestamp")
                    @ExcludeMissing
                    fun _timestamp(): JsonField<OffsetDateTime> = timestamp

                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun _amount(): JsonField<Double> = amount

                    @JsonProperty("quantity")
                    @ExcludeMissing
                    fun _quantity(): JsonField<Double> = quantity

                    @JsonProperty("unit_price")
                    @ExcludeMissing
                    fun _unitPrice(): JsonField<Double> = unitPrice

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): AddScheduleItem = apply {
                        if (validated) {
                            return@apply
                        }

                        timestamp()
                        amount()
                        quantity()
                        unitPrice()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [AddScheduleItem]. */
                    class Builder internal constructor() {

                        private var timestamp: JsonField<OffsetDateTime>? = null
                        private var amount: JsonField<Double> = JsonMissing.of()
                        private var quantity: JsonField<Double> = JsonMissing.of()
                        private var unitPrice: JsonField<Double> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(addScheduleItem: AddScheduleItem) = apply {
                            timestamp = addScheduleItem.timestamp
                            amount = addScheduleItem.amount
                            quantity = addScheduleItem.quantity
                            unitPrice = addScheduleItem.unitPrice
                            additionalProperties =
                                addScheduleItem.additionalProperties.toMutableMap()
                        }

                        fun timestamp(timestamp: OffsetDateTime) =
                            timestamp(JsonField.of(timestamp))

                        fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                            this.timestamp = timestamp
                        }

                        fun amount(amount: Double) = amount(JsonField.of(amount))

                        fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                        fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                        fun quantity(quantity: JsonField<Double>) = apply {
                            this.quantity = quantity
                        }

                        fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

                        fun unitPrice(unitPrice: JsonField<Double>) = apply {
                            this.unitPrice = unitPrice
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

                        fun build(): AddScheduleItem =
                            AddScheduleItem(
                                checkRequired("timestamp", timestamp),
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

                        return /* spotless:off */ other is AddScheduleItem && timestamp == other.timestamp && amount == other.amount && quantity == other.quantity && unitPrice == other.unitPrice && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(timestamp, amount, quantity, unitPrice, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "AddScheduleItem{timestamp=$timestamp, amount=$amount, quantity=$quantity, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class RemoveScheduleItem
                @JsonCreator
                private constructor(
                    @JsonProperty("id")
                    @ExcludeMissing
                    private val id: JsonField<String> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun id(): String = id.getRequired("id")

                    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): RemoveScheduleItem = apply {
                        if (validated) {
                            return@apply
                        }

                        id()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [RemoveScheduleItem]. */
                    class Builder internal constructor() {

                        private var id: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(removeScheduleItem: RemoveScheduleItem) = apply {
                            id = removeScheduleItem.id
                            additionalProperties =
                                removeScheduleItem.additionalProperties.toMutableMap()
                        }

                        fun id(id: String) = id(JsonField.of(id))

                        fun id(id: JsonField<String>) = apply { this.id = id }

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

                        fun build(): RemoveScheduleItem =
                            RemoveScheduleItem(
                                checkRequired("id", id),
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is RemoveScheduleItem && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "RemoveScheduleItem{id=$id, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class UpdateScheduleItem
                @JsonCreator
                private constructor(
                    @JsonProperty("id")
                    @ExcludeMissing
                    private val id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("amount")
                    @ExcludeMissing
                    private val amount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("quantity")
                    @ExcludeMissing
                    private val quantity: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("timestamp")
                    @ExcludeMissing
                    private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("unit_price")
                    @ExcludeMissing
                    private val unitPrice: JsonField<Double> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun id(): String = id.getRequired("id")

                    fun amount(): Optional<Double> =
                        Optional.ofNullable(amount.getNullable("amount"))

                    fun quantity(): Optional<Double> =
                        Optional.ofNullable(quantity.getNullable("quantity"))

                    fun timestamp(): Optional<OffsetDateTime> =
                        Optional.ofNullable(timestamp.getNullable("timestamp"))

                    fun unitPrice(): Optional<Double> =
                        Optional.ofNullable(unitPrice.getNullable("unit_price"))

                    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun _amount(): JsonField<Double> = amount

                    @JsonProperty("quantity")
                    @ExcludeMissing
                    fun _quantity(): JsonField<Double> = quantity

                    @JsonProperty("timestamp")
                    @ExcludeMissing
                    fun _timestamp(): JsonField<OffsetDateTime> = timestamp

                    @JsonProperty("unit_price")
                    @ExcludeMissing
                    fun _unitPrice(): JsonField<Double> = unitPrice

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): UpdateScheduleItem = apply {
                        if (validated) {
                            return@apply
                        }

                        id()
                        amount()
                        quantity()
                        timestamp()
                        unitPrice()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [UpdateScheduleItem]. */
                    class Builder internal constructor() {

                        private var id: JsonField<String>? = null
                        private var amount: JsonField<Double> = JsonMissing.of()
                        private var quantity: JsonField<Double> = JsonMissing.of()
                        private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
                        private var unitPrice: JsonField<Double> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(updateScheduleItem: UpdateScheduleItem) = apply {
                            id = updateScheduleItem.id
                            amount = updateScheduleItem.amount
                            quantity = updateScheduleItem.quantity
                            timestamp = updateScheduleItem.timestamp
                            unitPrice = updateScheduleItem.unitPrice
                            additionalProperties =
                                updateScheduleItem.additionalProperties.toMutableMap()
                        }

                        fun id(id: String) = id(JsonField.of(id))

                        fun id(id: JsonField<String>) = apply { this.id = id }

                        fun amount(amount: Double) = amount(JsonField.of(amount))

                        fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                        fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                        fun quantity(quantity: JsonField<Double>) = apply {
                            this.quantity = quantity
                        }

                        fun timestamp(timestamp: OffsetDateTime) =
                            timestamp(JsonField.of(timestamp))

                        fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                            this.timestamp = timestamp
                        }

                        fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

                        fun unitPrice(unitPrice: JsonField<Double>) = apply {
                            this.unitPrice = unitPrice
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

                        fun build(): UpdateScheduleItem =
                            UpdateScheduleItem(
                                checkRequired("id", id),
                                amount,
                                quantity,
                                timestamp,
                                unitPrice,
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is UpdateScheduleItem && id == other.id && amount == other.amount && quantity == other.quantity && timestamp == other.timestamp && unitPrice == other.unitPrice && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(id, amount, quantity, timestamp, unitPrice, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "UpdateScheduleItem{id=$id, amount=$amount, quantity=$quantity, timestamp=$timestamp, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is InvoiceSchedule && addScheduleItems == other.addScheduleItems && removeScheduleItems == other.removeScheduleItems && updateScheduleItems == other.updateScheduleItems && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(addScheduleItems, removeScheduleItems, updateScheduleItems, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "InvoiceSchedule{addScheduleItems=$addScheduleItems, removeScheduleItems=$removeScheduleItems, updateScheduleItems=$updateScheduleItems, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is UpdateScheduledCharge && id == other.id && invoiceSchedule == other.invoiceSchedule && name == other.name && netsuiteSalesOrderId == other.netsuiteSalesOrderId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, invoiceSchedule, name, netsuiteSalesOrderId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UpdateScheduledCharge{id=$id, invoiceSchedule=$invoiceSchedule, name=$name, netsuiteSalesOrderId=$netsuiteSalesOrderId, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class UpdateSpendThresholdConfiguration
        @JsonCreator
        private constructor(
            @JsonProperty("commit")
            @ExcludeMissing
            private val commit: JsonField<UpdateBaseThresholdCommit> = JsonMissing.of(),
            @JsonProperty("is_enabled")
            @ExcludeMissing
            private val isEnabled: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("payment_gate_config")
            @ExcludeMissing
            private val paymentGateConfig: JsonField<PaymentGateConfigV2> = JsonMissing.of(),
            @JsonProperty("threshold_amount")
            @ExcludeMissing
            private val thresholdAmount: JsonField<Double> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun commit(): Optional<UpdateBaseThresholdCommit> =
                Optional.ofNullable(commit.getNullable("commit"))

            /**
             * When set to false, the contract will not be evaluated against the threshold_amount.
             * Toggling to true will result an immediate evaluation, regardless of prior state.
             */
            fun isEnabled(): Optional<Boolean> =
                Optional.ofNullable(isEnabled.getNullable("is_enabled"))

            fun paymentGateConfig(): Optional<PaymentGateConfigV2> =
                Optional.ofNullable(paymentGateConfig.getNullable("payment_gate_config"))

            /**
             * Specify the threshold amount for the contract. Each time the contract's usage hits
             * this amount, a threshold charge will be initiated.
             */
            fun thresholdAmount(): Optional<Double> =
                Optional.ofNullable(thresholdAmount.getNullable("threshold_amount"))

            @JsonProperty("commit")
            @ExcludeMissing
            fun _commit(): JsonField<UpdateBaseThresholdCommit> = commit

            /**
             * When set to false, the contract will not be evaluated against the threshold_amount.
             * Toggling to true will result an immediate evaluation, regardless of prior state.
             */
            @JsonProperty("is_enabled")
            @ExcludeMissing
            fun _isEnabled(): JsonField<Boolean> = isEnabled

            @JsonProperty("payment_gate_config")
            @ExcludeMissing
            fun _paymentGateConfig(): JsonField<PaymentGateConfigV2> = paymentGateConfig

            /**
             * Specify the threshold amount for the contract. Each time the contract's usage hits
             * this amount, a threshold charge will be initiated.
             */
            @JsonProperty("threshold_amount")
            @ExcludeMissing
            fun _thresholdAmount(): JsonField<Double> = thresholdAmount

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): UpdateSpendThresholdConfiguration = apply {
                if (validated) {
                    return@apply
                }

                commit().ifPresent { it.validate() }
                isEnabled()
                paymentGateConfig().ifPresent { it.validate() }
                thresholdAmount()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UpdateSpendThresholdConfiguration]. */
            class Builder internal constructor() {

                private var commit: JsonField<UpdateBaseThresholdCommit> = JsonMissing.of()
                private var isEnabled: JsonField<Boolean> = JsonMissing.of()
                private var paymentGateConfig: JsonField<PaymentGateConfigV2> = JsonMissing.of()
                private var thresholdAmount: JsonField<Double> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    updateSpendThresholdConfiguration: UpdateSpendThresholdConfiguration
                ) = apply {
                    commit = updateSpendThresholdConfiguration.commit
                    isEnabled = updateSpendThresholdConfiguration.isEnabled
                    paymentGateConfig = updateSpendThresholdConfiguration.paymentGateConfig
                    thresholdAmount = updateSpendThresholdConfiguration.thresholdAmount
                    additionalProperties =
                        updateSpendThresholdConfiguration.additionalProperties.toMutableMap()
                }

                fun commit(commit: UpdateBaseThresholdCommit) = commit(JsonField.of(commit))

                fun commit(commit: JsonField<UpdateBaseThresholdCommit>) = apply {
                    this.commit = commit
                }

                /**
                 * When set to false, the contract will not be evaluated against the
                 * threshold_amount. Toggling to true will result an immediate evaluation,
                 * regardless of prior state.
                 */
                fun isEnabled(isEnabled: Boolean) = isEnabled(JsonField.of(isEnabled))

                /**
                 * When set to false, the contract will not be evaluated against the
                 * threshold_amount. Toggling to true will result an immediate evaluation,
                 * regardless of prior state.
                 */
                fun isEnabled(isEnabled: JsonField<Boolean>) = apply { this.isEnabled = isEnabled }

                fun paymentGateConfig(paymentGateConfig: PaymentGateConfigV2) =
                    paymentGateConfig(JsonField.of(paymentGateConfig))

                fun paymentGateConfig(paymentGateConfig: JsonField<PaymentGateConfigV2>) = apply {
                    this.paymentGateConfig = paymentGateConfig
                }

                /**
                 * Specify the threshold amount for the contract. Each time the contract's usage
                 * hits this amount, a threshold charge will be initiated.
                 */
                fun thresholdAmount(thresholdAmount: Double) =
                    thresholdAmount(JsonField.of(thresholdAmount))

                /**
                 * Specify the threshold amount for the contract. Each time the contract's usage
                 * hits this amount, a threshold charge will be initiated.
                 */
                fun thresholdAmount(thresholdAmount: JsonField<Double>) = apply {
                    this.thresholdAmount = thresholdAmount
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

                fun build(): UpdateSpendThresholdConfiguration =
                    UpdateSpendThresholdConfiguration(
                        commit,
                        isEnabled,
                        paymentGateConfig,
                        thresholdAmount,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is UpdateSpendThresholdConfiguration && commit == other.commit && isEnabled == other.isEnabled && paymentGateConfig == other.paymentGateConfig && thresholdAmount == other.thresholdAmount && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(commit, isEnabled, paymentGateConfig, thresholdAmount, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UpdateSpendThresholdConfiguration{commit=$commit, isEnabled=$isEnabled, paymentGateConfig=$paymentGateConfig, thresholdAmount=$thresholdAmount, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class UpdateSubscription
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ending_before")
            @ExcludeMissing
            private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("quantity_updates")
            @ExcludeMissing
            private val quantityUpdates: JsonField<List<QuantityUpdate>> = JsonMissing.of(),
            @JsonProperty("seat_updates")
            @ExcludeMissing
            private val seatUpdates: JsonField<SeatUpdates> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun endingBefore(): Optional<OffsetDateTime> =
                Optional.ofNullable(endingBefore.getNullable("ending_before"))

            fun quantityUpdates(): Optional<List<QuantityUpdate>> =
                Optional.ofNullable(quantityUpdates.getNullable("quantity_updates"))

            /** Manage subscription seats for subscriptions in SEAT_BASED mode. */
            fun seatUpdates(): Optional<SeatUpdates> =
                Optional.ofNullable(seatUpdates.getNullable("seat_updates"))

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonProperty("ending_before")
            @ExcludeMissing
            fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

            @JsonProperty("quantity_updates")
            @ExcludeMissing
            fun _quantityUpdates(): JsonField<List<QuantityUpdate>> = quantityUpdates

            /** Manage subscription seats for subscriptions in SEAT_BASED mode. */
            @JsonProperty("seat_updates")
            @ExcludeMissing
            fun _seatUpdates(): JsonField<SeatUpdates> = seatUpdates

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): UpdateSubscription = apply {
                if (validated) {
                    return@apply
                }

                id()
                endingBefore()
                quantityUpdates().ifPresent { it.forEach { it.validate() } }
                seatUpdates().ifPresent { it.validate() }
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UpdateSubscription]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
                private var quantityUpdates: JsonField<MutableList<QuantityUpdate>>? = null
                private var seatUpdates: JsonField<SeatUpdates> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(updateSubscription: UpdateSubscription) = apply {
                    id = updateSubscription.id
                    endingBefore = updateSubscription.endingBefore
                    quantityUpdates = updateSubscription.quantityUpdates.map { it.toMutableList() }
                    seatUpdates = updateSubscription.seatUpdates
                    additionalProperties = updateSubscription.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun endingBefore(endingBefore: OffsetDateTime) =
                    endingBefore(JsonField.of(endingBefore))

                fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                    this.endingBefore = endingBefore
                }

                fun quantityUpdates(quantityUpdates: List<QuantityUpdate>) =
                    quantityUpdates(JsonField.of(quantityUpdates))

                fun quantityUpdates(quantityUpdates: JsonField<List<QuantityUpdate>>) = apply {
                    this.quantityUpdates = quantityUpdates.map { it.toMutableList() }
                }

                fun addQuantityUpdate(quantityUpdate: QuantityUpdate) = apply {
                    quantityUpdates =
                        (quantityUpdates ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(quantityUpdate)
                        }
                }

                /** Manage subscription seats for subscriptions in SEAT_BASED mode. */
                fun seatUpdates(seatUpdates: SeatUpdates) = seatUpdates(JsonField.of(seatUpdates))

                /** Manage subscription seats for subscriptions in SEAT_BASED mode. */
                fun seatUpdates(seatUpdates: JsonField<SeatUpdates>) = apply {
                    this.seatUpdates = seatUpdates
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

                fun build(): UpdateSubscription =
                    UpdateSubscription(
                        checkRequired("id", id),
                        endingBefore,
                        (quantityUpdates ?: JsonMissing.of()).map { it.toImmutable() },
                        seatUpdates,
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class QuantityUpdate
            @JsonCreator
            private constructor(
                @JsonProperty("starting_at")
                @ExcludeMissing
                private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("quantity")
                @ExcludeMissing
                private val quantity: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("quantity_delta")
                @ExcludeMissing
                private val quantityDelta: JsonField<Double> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

                fun quantity(): Optional<Double> =
                    Optional.ofNullable(quantity.getNullable("quantity"))

                fun quantityDelta(): Optional<Double> =
                    Optional.ofNullable(quantityDelta.getNullable("quantity_delta"))

                @JsonProperty("starting_at")
                @ExcludeMissing
                fun _startingAt(): JsonField<OffsetDateTime> = startingAt

                @JsonProperty("quantity")
                @ExcludeMissing
                fun _quantity(): JsonField<Double> = quantity

                @JsonProperty("quantity_delta")
                @ExcludeMissing
                fun _quantityDelta(): JsonField<Double> = quantityDelta

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): QuantityUpdate = apply {
                    if (validated) {
                        return@apply
                    }

                    startingAt()
                    quantity()
                    quantityDelta()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [QuantityUpdate]. */
                class Builder internal constructor() {

                    private var startingAt: JsonField<OffsetDateTime>? = null
                    private var quantity: JsonField<Double> = JsonMissing.of()
                    private var quantityDelta: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(quantityUpdate: QuantityUpdate) = apply {
                        startingAt = quantityUpdate.startingAt
                        quantity = quantityUpdate.quantity
                        quantityDelta = quantityUpdate.quantityDelta
                        additionalProperties = quantityUpdate.additionalProperties.toMutableMap()
                    }

                    fun startingAt(startingAt: OffsetDateTime) =
                        startingAt(JsonField.of(startingAt))

                    fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                        this.startingAt = startingAt
                    }

                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                    fun quantityDelta(quantityDelta: Double) =
                        quantityDelta(JsonField.of(quantityDelta))

                    fun quantityDelta(quantityDelta: JsonField<Double>) = apply {
                        this.quantityDelta = quantityDelta
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

                    fun build(): QuantityUpdate =
                        QuantityUpdate(
                            checkRequired("startingAt", startingAt),
                            quantity,
                            quantityDelta,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is QuantityUpdate && startingAt == other.startingAt && quantity == other.quantity && quantityDelta == other.quantityDelta && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(startingAt, quantity, quantityDelta, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "QuantityUpdate{startingAt=$startingAt, quantity=$quantity, quantityDelta=$quantityDelta, additionalProperties=$additionalProperties}"
            }

            /** Manage subscription seats for subscriptions in SEAT_BASED mode. */
            @NoAutoDetect
            class SeatUpdates
            @JsonCreator
            private constructor(
                @JsonProperty("add_seat_ids")
                @ExcludeMissing
                private val addSeatIds: JsonField<List<AddSeatId>> = JsonMissing.of(),
                @JsonProperty("add_unassigned_seats")
                @ExcludeMissing
                private val addUnassignedSeats: JsonField<List<AddUnassignedSeat>> =
                    JsonMissing.of(),
                @JsonProperty("remove_seat_ids")
                @ExcludeMissing
                private val removeSeatIds: JsonField<List<RemoveSeatId>> = JsonMissing.of(),
                @JsonProperty("remove_unassigned_seats")
                @ExcludeMissing
                private val removeUnassignedSeats: JsonField<List<RemoveUnassignedSeat>> =
                    JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /**
                 * Adds seat IDs to the subscription. If there are unassigned seats, the new seat
                 * IDs will fill these unassigned seats and not increase the total subscription
                 * quantity. Otherwise, if there are more new seat IDs than unassigned seats, the
                 * total subscription quantity will increase.
                 */
                fun addSeatIds(): Optional<List<AddSeatId>> =
                    Optional.ofNullable(addSeatIds.getNullable("add_seat_ids"))

                /**
                 * Adds unassigned seats to the subscription. This will increase the total
                 * subscription quantity.
                 */
                fun addUnassignedSeats(): Optional<List<AddUnassignedSeat>> =
                    Optional.ofNullable(addUnassignedSeats.getNullable("add_unassigned_seats"))

                /**
                 * Removes seat IDs from the subscription, if possible. If a seat ID is removed, the
                 * total subscription quantity will decrease. Otherwise, if the seat ID is not found
                 * on the subscription, this is a no-op.
                 */
                fun removeSeatIds(): Optional<List<RemoveSeatId>> =
                    Optional.ofNullable(removeSeatIds.getNullable("remove_seat_ids"))

                /**
                 * Removes unassigned seats from the subscription. This will decrease the total
                 * subscription quantity if there are are unassigned seats.
                 */
                fun removeUnassignedSeats(): Optional<List<RemoveUnassignedSeat>> =
                    Optional.ofNullable(
                        removeUnassignedSeats.getNullable("remove_unassigned_seats")
                    )

                /**
                 * Adds seat IDs to the subscription. If there are unassigned seats, the new seat
                 * IDs will fill these unassigned seats and not increase the total subscription
                 * quantity. Otherwise, if there are more new seat IDs than unassigned seats, the
                 * total subscription quantity will increase.
                 */
                @JsonProperty("add_seat_ids")
                @ExcludeMissing
                fun _addSeatIds(): JsonField<List<AddSeatId>> = addSeatIds

                /**
                 * Adds unassigned seats to the subscription. This will increase the total
                 * subscription quantity.
                 */
                @JsonProperty("add_unassigned_seats")
                @ExcludeMissing
                fun _addUnassignedSeats(): JsonField<List<AddUnassignedSeat>> = addUnassignedSeats

                /**
                 * Removes seat IDs from the subscription, if possible. If a seat ID is removed, the
                 * total subscription quantity will decrease. Otherwise, if the seat ID is not found
                 * on the subscription, this is a no-op.
                 */
                @JsonProperty("remove_seat_ids")
                @ExcludeMissing
                fun _removeSeatIds(): JsonField<List<RemoveSeatId>> = removeSeatIds

                /**
                 * Removes unassigned seats from the subscription. This will decrease the total
                 * subscription quantity if there are are unassigned seats.
                 */
                @JsonProperty("remove_unassigned_seats")
                @ExcludeMissing
                fun _removeUnassignedSeats(): JsonField<List<RemoveUnassignedSeat>> =
                    removeUnassignedSeats

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): SeatUpdates = apply {
                    if (validated) {
                        return@apply
                    }

                    addSeatIds().ifPresent { it.forEach { it.validate() } }
                    addUnassignedSeats().ifPresent { it.forEach { it.validate() } }
                    removeSeatIds().ifPresent { it.forEach { it.validate() } }
                    removeUnassignedSeats().ifPresent { it.forEach { it.validate() } }
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [SeatUpdates]. */
                class Builder internal constructor() {

                    private var addSeatIds: JsonField<MutableList<AddSeatId>>? = null
                    private var addUnassignedSeats: JsonField<MutableList<AddUnassignedSeat>>? =
                        null
                    private var removeSeatIds: JsonField<MutableList<RemoveSeatId>>? = null
                    private var removeUnassignedSeats:
                        JsonField<MutableList<RemoveUnassignedSeat>>? =
                        null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(seatUpdates: SeatUpdates) = apply {
                        addSeatIds = seatUpdates.addSeatIds.map { it.toMutableList() }
                        addUnassignedSeats =
                            seatUpdates.addUnassignedSeats.map { it.toMutableList() }
                        removeSeatIds = seatUpdates.removeSeatIds.map { it.toMutableList() }
                        removeUnassignedSeats =
                            seatUpdates.removeUnassignedSeats.map { it.toMutableList() }
                        additionalProperties = seatUpdates.additionalProperties.toMutableMap()
                    }

                    /**
                     * Adds seat IDs to the subscription. If there are unassigned seats, the new
                     * seat IDs will fill these unassigned seats and not increase the total
                     * subscription quantity. Otherwise, if there are more new seat IDs than
                     * unassigned seats, the total subscription quantity will increase.
                     */
                    fun addSeatIds(addSeatIds: List<AddSeatId>) =
                        addSeatIds(JsonField.of(addSeatIds))

                    /**
                     * Adds seat IDs to the subscription. If there are unassigned seats, the new
                     * seat IDs will fill these unassigned seats and not increase the total
                     * subscription quantity. Otherwise, if there are more new seat IDs than
                     * unassigned seats, the total subscription quantity will increase.
                     */
                    fun addSeatIds(addSeatIds: JsonField<List<AddSeatId>>) = apply {
                        this.addSeatIds = addSeatIds.map { it.toMutableList() }
                    }

                    /**
                     * Adds seat IDs to the subscription. If there are unassigned seats, the new
                     * seat IDs will fill these unassigned seats and not increase the total
                     * subscription quantity. Otherwise, if there are more new seat IDs than
                     * unassigned seats, the total subscription quantity will increase.
                     */
                    fun addAddSeatId(addSeatId: AddSeatId) = apply {
                        addSeatIds =
                            (addSeatIds ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(addSeatId)
                            }
                    }

                    /**
                     * Adds unassigned seats to the subscription. This will increase the total
                     * subscription quantity.
                     */
                    fun addUnassignedSeats(addUnassignedSeats: List<AddUnassignedSeat>) =
                        addUnassignedSeats(JsonField.of(addUnassignedSeats))

                    /**
                     * Adds unassigned seats to the subscription. This will increase the total
                     * subscription quantity.
                     */
                    fun addUnassignedSeats(addUnassignedSeats: JsonField<List<AddUnassignedSeat>>) =
                        apply {
                            this.addUnassignedSeats = addUnassignedSeats.map { it.toMutableList() }
                        }

                    /**
                     * Adds unassigned seats to the subscription. This will increase the total
                     * subscription quantity.
                     */
                    fun addAddUnassignedSeat(addUnassignedSeat: AddUnassignedSeat) = apply {
                        addUnassignedSeats =
                            (addUnassignedSeats ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(addUnassignedSeat)
                            }
                    }

                    /**
                     * Removes seat IDs from the subscription, if possible. If a seat ID is removed,
                     * the total subscription quantity will decrease. Otherwise, if the seat ID is
                     * not found on the subscription, this is a no-op.
                     */
                    fun removeSeatIds(removeSeatIds: List<RemoveSeatId>) =
                        removeSeatIds(JsonField.of(removeSeatIds))

                    /**
                     * Removes seat IDs from the subscription, if possible. If a seat ID is removed,
                     * the total subscription quantity will decrease. Otherwise, if the seat ID is
                     * not found on the subscription, this is a no-op.
                     */
                    fun removeSeatIds(removeSeatIds: JsonField<List<RemoveSeatId>>) = apply {
                        this.removeSeatIds = removeSeatIds.map { it.toMutableList() }
                    }

                    /**
                     * Removes seat IDs from the subscription, if possible. If a seat ID is removed,
                     * the total subscription quantity will decrease. Otherwise, if the seat ID is
                     * not found on the subscription, this is a no-op.
                     */
                    fun addRemoveSeatId(removeSeatId: RemoveSeatId) = apply {
                        removeSeatIds =
                            (removeSeatIds ?: JsonField.of(mutableListOf())).apply {
                                asKnown()
                                    .orElseThrow {
                                        IllegalStateException(
                                            "Field was set to non-list type: ${javaClass.simpleName}"
                                        )
                                    }
                                    .add(removeSeatId)
                            }
                    }

                    /**
                     * Removes unassigned seats from the subscription. This will decrease the total
                     * subscription quantity if there are are unassigned seats.
                     */
                    fun removeUnassignedSeats(removeUnassignedSeats: List<RemoveUnassignedSeat>) =
                        removeUnassignedSeats(JsonField.of(removeUnassignedSeats))

                    /**
                     * Removes unassigned seats from the subscription. This will decrease the total
                     * subscription quantity if there are are unassigned seats.
                     */
                    fun removeUnassignedSeats(
                        removeUnassignedSeats: JsonField<List<RemoveUnassignedSeat>>
                    ) = apply {
                        this.removeUnassignedSeats =
                            removeUnassignedSeats.map { it.toMutableList() }
                    }

                    /**
                     * Removes unassigned seats from the subscription. This will decrease the total
                     * subscription quantity if there are are unassigned seats.
                     */
                    fun addRemoveUnassignedSeat(removeUnassignedSeat: RemoveUnassignedSeat) =
                        apply {
                            removeUnassignedSeats =
                                (removeUnassignedSeats ?: JsonField.of(mutableListOf())).apply {
                                    asKnown()
                                        .orElseThrow {
                                            IllegalStateException(
                                                "Field was set to non-list type: ${javaClass.simpleName}"
                                            )
                                        }
                                        .add(removeUnassignedSeat)
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

                    fun build(): SeatUpdates =
                        SeatUpdates(
                            (addSeatIds ?: JsonMissing.of()).map { it.toImmutable() },
                            (addUnassignedSeats ?: JsonMissing.of()).map { it.toImmutable() },
                            (removeSeatIds ?: JsonMissing.of()).map { it.toImmutable() },
                            (removeUnassignedSeats ?: JsonMissing.of()).map { it.toImmutable() },
                            additionalProperties.toImmutable(),
                        )
                }

                @NoAutoDetect
                class AddSeatId
                @JsonCreator
                private constructor(
                    @JsonProperty("seat_ids")
                    @ExcludeMissing
                    private val seatIds: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("starting_at")
                    @ExcludeMissing
                    private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun seatIds(): List<String> = seatIds.getRequired("seat_ids")

                    /** Assigned seats will be added/removed starting at this date. */
                    fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

                    @JsonProperty("seat_ids")
                    @ExcludeMissing
                    fun _seatIds(): JsonField<List<String>> = seatIds

                    /** Assigned seats will be added/removed starting at this date. */
                    @JsonProperty("starting_at")
                    @ExcludeMissing
                    fun _startingAt(): JsonField<OffsetDateTime> = startingAt

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): AddSeatId = apply {
                        if (validated) {
                            return@apply
                        }

                        seatIds()
                        startingAt()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [AddSeatId]. */
                    class Builder internal constructor() {

                        private var seatIds: JsonField<MutableList<String>>? = null
                        private var startingAt: JsonField<OffsetDateTime>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(addSeatId: AddSeatId) = apply {
                            seatIds = addSeatId.seatIds.map { it.toMutableList() }
                            startingAt = addSeatId.startingAt
                            additionalProperties = addSeatId.additionalProperties.toMutableMap()
                        }

                        fun seatIds(seatIds: List<String>) = seatIds(JsonField.of(seatIds))

                        fun seatIds(seatIds: JsonField<List<String>>) = apply {
                            this.seatIds = seatIds.map { it.toMutableList() }
                        }

                        fun addSeatId(seatId: String) = apply {
                            seatIds =
                                (seatIds ?: JsonField.of(mutableListOf())).apply {
                                    asKnown()
                                        .orElseThrow {
                                            IllegalStateException(
                                                "Field was set to non-list type: ${javaClass.simpleName}"
                                            )
                                        }
                                        .add(seatId)
                                }
                        }

                        /** Assigned seats will be added/removed starting at this date. */
                        fun startingAt(startingAt: OffsetDateTime) =
                            startingAt(JsonField.of(startingAt))

                        /** Assigned seats will be added/removed starting at this date. */
                        fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                            this.startingAt = startingAt
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

                        fun build(): AddSeatId =
                            AddSeatId(
                                checkRequired("seatIds", seatIds).map { it.toImmutable() },
                                checkRequired("startingAt", startingAt),
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AddSeatId && seatIds == other.seatIds && startingAt == other.startingAt && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(seatIds, startingAt, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "AddSeatId{seatIds=$seatIds, startingAt=$startingAt, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class AddUnassignedSeat
                @JsonCreator
                private constructor(
                    @JsonProperty("quantity")
                    @ExcludeMissing
                    private val quantity: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("starting_at")
                    @ExcludeMissing
                    private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /**
                     * The number of unassigned seats on the subscription will increase/decrease by
                     * this delta. Must be greater than 0.
                     */
                    fun quantity(): Double = quantity.getRequired("quantity")

                    /** Unassigned seats will be updated starting at this date. */
                    fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

                    /**
                     * The number of unassigned seats on the subscription will increase/decrease by
                     * this delta. Must be greater than 0.
                     */
                    @JsonProperty("quantity")
                    @ExcludeMissing
                    fun _quantity(): JsonField<Double> = quantity

                    /** Unassigned seats will be updated starting at this date. */
                    @JsonProperty("starting_at")
                    @ExcludeMissing
                    fun _startingAt(): JsonField<OffsetDateTime> = startingAt

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): AddUnassignedSeat = apply {
                        if (validated) {
                            return@apply
                        }

                        quantity()
                        startingAt()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [AddUnassignedSeat]. */
                    class Builder internal constructor() {

                        private var quantity: JsonField<Double>? = null
                        private var startingAt: JsonField<OffsetDateTime>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(addUnassignedSeat: AddUnassignedSeat) = apply {
                            quantity = addUnassignedSeat.quantity
                            startingAt = addUnassignedSeat.startingAt
                            additionalProperties =
                                addUnassignedSeat.additionalProperties.toMutableMap()
                        }

                        /**
                         * The number of unassigned seats on the subscription will increase/decrease
                         * by this delta. Must be greater than 0.
                         */
                        fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                        /**
                         * The number of unassigned seats on the subscription will increase/decrease
                         * by this delta. Must be greater than 0.
                         */
                        fun quantity(quantity: JsonField<Double>) = apply {
                            this.quantity = quantity
                        }

                        /** Unassigned seats will be updated starting at this date. */
                        fun startingAt(startingAt: OffsetDateTime) =
                            startingAt(JsonField.of(startingAt))

                        /** Unassigned seats will be updated starting at this date. */
                        fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                            this.startingAt = startingAt
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

                        fun build(): AddUnassignedSeat =
                            AddUnassignedSeat(
                                checkRequired("quantity", quantity),
                                checkRequired("startingAt", startingAt),
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is AddUnassignedSeat && quantity == other.quantity && startingAt == other.startingAt && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(quantity, startingAt, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "AddUnassignedSeat{quantity=$quantity, startingAt=$startingAt, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class RemoveSeatId
                @JsonCreator
                private constructor(
                    @JsonProperty("seat_ids")
                    @ExcludeMissing
                    private val seatIds: JsonField<List<String>> = JsonMissing.of(),
                    @JsonProperty("starting_at")
                    @ExcludeMissing
                    private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    fun seatIds(): List<String> = seatIds.getRequired("seat_ids")

                    /** Assigned seats will be added/removed starting at this date. */
                    fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

                    @JsonProperty("seat_ids")
                    @ExcludeMissing
                    fun _seatIds(): JsonField<List<String>> = seatIds

                    /** Assigned seats will be added/removed starting at this date. */
                    @JsonProperty("starting_at")
                    @ExcludeMissing
                    fun _startingAt(): JsonField<OffsetDateTime> = startingAt

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): RemoveSeatId = apply {
                        if (validated) {
                            return@apply
                        }

                        seatIds()
                        startingAt()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [RemoveSeatId]. */
                    class Builder internal constructor() {

                        private var seatIds: JsonField<MutableList<String>>? = null
                        private var startingAt: JsonField<OffsetDateTime>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(removeSeatId: RemoveSeatId) = apply {
                            seatIds = removeSeatId.seatIds.map { it.toMutableList() }
                            startingAt = removeSeatId.startingAt
                            additionalProperties = removeSeatId.additionalProperties.toMutableMap()
                        }

                        fun seatIds(seatIds: List<String>) = seatIds(JsonField.of(seatIds))

                        fun seatIds(seatIds: JsonField<List<String>>) = apply {
                            this.seatIds = seatIds.map { it.toMutableList() }
                        }

                        fun addSeatId(seatId: String) = apply {
                            seatIds =
                                (seatIds ?: JsonField.of(mutableListOf())).apply {
                                    asKnown()
                                        .orElseThrow {
                                            IllegalStateException(
                                                "Field was set to non-list type: ${javaClass.simpleName}"
                                            )
                                        }
                                        .add(seatId)
                                }
                        }

                        /** Assigned seats will be added/removed starting at this date. */
                        fun startingAt(startingAt: OffsetDateTime) =
                            startingAt(JsonField.of(startingAt))

                        /** Assigned seats will be added/removed starting at this date. */
                        fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                            this.startingAt = startingAt
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

                        fun build(): RemoveSeatId =
                            RemoveSeatId(
                                checkRequired("seatIds", seatIds).map { it.toImmutable() },
                                checkRequired("startingAt", startingAt),
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is RemoveSeatId && seatIds == other.seatIds && startingAt == other.startingAt && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(seatIds, startingAt, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "RemoveSeatId{seatIds=$seatIds, startingAt=$startingAt, additionalProperties=$additionalProperties}"
                }

                @NoAutoDetect
                class RemoveUnassignedSeat
                @JsonCreator
                private constructor(
                    @JsonProperty("quantity")
                    @ExcludeMissing
                    private val quantity: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("starting_at")
                    @ExcludeMissing
                    private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /**
                     * The number of unassigned seats on the subscription will increase/decrease by
                     * this delta. Must be greater than 0.
                     */
                    fun quantity(): Double = quantity.getRequired("quantity")

                    /** Unassigned seats will be updated starting at this date. */
                    fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

                    /**
                     * The number of unassigned seats on the subscription will increase/decrease by
                     * this delta. Must be greater than 0.
                     */
                    @JsonProperty("quantity")
                    @ExcludeMissing
                    fun _quantity(): JsonField<Double> = quantity

                    /** Unassigned seats will be updated starting at this date. */
                    @JsonProperty("starting_at")
                    @ExcludeMissing
                    fun _startingAt(): JsonField<OffsetDateTime> = startingAt

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): RemoveUnassignedSeat = apply {
                        if (validated) {
                            return@apply
                        }

                        quantity()
                        startingAt()
                        validated = true
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [RemoveUnassignedSeat]. */
                    class Builder internal constructor() {

                        private var quantity: JsonField<Double>? = null
                        private var startingAt: JsonField<OffsetDateTime>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(removeUnassignedSeat: RemoveUnassignedSeat) = apply {
                            quantity = removeUnassignedSeat.quantity
                            startingAt = removeUnassignedSeat.startingAt
                            additionalProperties =
                                removeUnassignedSeat.additionalProperties.toMutableMap()
                        }

                        /**
                         * The number of unassigned seats on the subscription will increase/decrease
                         * by this delta. Must be greater than 0.
                         */
                        fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                        /**
                         * The number of unassigned seats on the subscription will increase/decrease
                         * by this delta. Must be greater than 0.
                         */
                        fun quantity(quantity: JsonField<Double>) = apply {
                            this.quantity = quantity
                        }

                        /** Unassigned seats will be updated starting at this date. */
                        fun startingAt(startingAt: OffsetDateTime) =
                            startingAt(JsonField.of(startingAt))

                        /** Unassigned seats will be updated starting at this date. */
                        fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                            this.startingAt = startingAt
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

                        fun build(): RemoveUnassignedSeat =
                            RemoveUnassignedSeat(
                                checkRequired("quantity", quantity),
                                checkRequired("startingAt", startingAt),
                                additionalProperties.toImmutable(),
                            )
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is RemoveUnassignedSeat && quantity == other.quantity && startingAt == other.startingAt && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(quantity, startingAt, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "RemoveUnassignedSeat{quantity=$quantity, startingAt=$startingAt, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is SeatUpdates && addSeatIds == other.addSeatIds && addUnassignedSeats == other.addUnassignedSeats && removeSeatIds == other.removeSeatIds && removeUnassignedSeats == other.removeUnassignedSeats && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(addSeatIds, addUnassignedSeats, removeSeatIds, removeUnassignedSeats, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "SeatUpdates{addSeatIds=$addSeatIds, addUnassignedSeats=$addUnassignedSeats, removeSeatIds=$removeSeatIds, removeUnassignedSeats=$removeUnassignedSeats, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is UpdateSubscription && id == other.id && endingBefore == other.endingBefore && quantityUpdates == other.quantityUpdates && seatUpdates == other.seatUpdates && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, endingBefore, quantityUpdates, seatUpdates, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UpdateSubscription{id=$id, endingBefore=$endingBefore, quantityUpdates=$quantityUpdates, seatUpdates=$seatUpdates, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Data && id == other.id && addCommits == other.addCommits && addCredits == other.addCredits && addDiscounts == other.addDiscounts && addOverrides == other.addOverrides && addPrepaidBalanceThresholdConfiguration == other.addPrepaidBalanceThresholdConfiguration && addProServices == other.addProServices && addRecurringCommits == other.addRecurringCommits && addRecurringCredits == other.addRecurringCredits && addResellerRoyalties == other.addResellerRoyalties && addScheduledCharges == other.addScheduledCharges && addSpendThresholdConfiguration == other.addSpendThresholdConfiguration && addSubscriptions == other.addSubscriptions && addUsageFilters == other.addUsageFilters && archiveCommits == other.archiveCommits && archiveCredits == other.archiveCredits && archiveScheduledCharges == other.archiveScheduledCharges && removeOverrides == other.removeOverrides && timestamp == other.timestamp && uniquenessKey == other.uniquenessKey && updateCommits == other.updateCommits && updateContractEndDate == other.updateContractEndDate && updateContractName == other.updateContractName && updateCredits == other.updateCredits && updateDiscounts == other.updateDiscounts && updatePrepaidBalanceThresholdConfiguration == other.updatePrepaidBalanceThresholdConfiguration && updateRecurringCommits == other.updateRecurringCommits && updateRecurringCredits == other.updateRecurringCredits && updateRefundInvoices == other.updateRefundInvoices && updateScheduledCharges == other.updateScheduledCharges && updateSpendThresholdConfiguration == other.updateSpendThresholdConfiguration && updateSubscriptions == other.updateSubscriptions && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, addCommits, addCredits, addDiscounts, addOverrides, addPrepaidBalanceThresholdConfiguration, addProServices, addRecurringCommits, addRecurringCredits, addResellerRoyalties, addScheduledCharges, addSpendThresholdConfiguration, addSubscriptions, addUsageFilters, archiveCommits, archiveCredits, archiveScheduledCharges, removeOverrides, timestamp, uniquenessKey, updateCommits, updateContractEndDate, updateContractName, updateCredits, updateDiscounts, updatePrepaidBalanceThresholdConfiguration, updateRecurringCommits, updateRecurringCredits, updateRefundInvoices, updateScheduledCharges, updateSpendThresholdConfiguration, updateSubscriptions, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, addCommits=$addCommits, addCredits=$addCredits, addDiscounts=$addDiscounts, addOverrides=$addOverrides, addPrepaidBalanceThresholdConfiguration=$addPrepaidBalanceThresholdConfiguration, addProServices=$addProServices, addRecurringCommits=$addRecurringCommits, addRecurringCredits=$addRecurringCredits, addResellerRoyalties=$addResellerRoyalties, addScheduledCharges=$addScheduledCharges, addSpendThresholdConfiguration=$addSpendThresholdConfiguration, addSubscriptions=$addSubscriptions, addUsageFilters=$addUsageFilters, archiveCommits=$archiveCommits, archiveCredits=$archiveCredits, archiveScheduledCharges=$archiveScheduledCharges, removeOverrides=$removeOverrides, timestamp=$timestamp, uniquenessKey=$uniquenessKey, updateCommits=$updateCommits, updateContractEndDate=$updateContractEndDate, updateContractName=$updateContractName, updateCredits=$updateCredits, updateDiscounts=$updateDiscounts, updatePrepaidBalanceThresholdConfiguration=$updatePrepaidBalanceThresholdConfiguration, updateRecurringCommits=$updateRecurringCommits, updateRecurringCredits=$updateRecurringCredits, updateRefundInvoices=$updateRefundInvoices, updateScheduledCharges=$updateScheduledCharges, updateSpendThresholdConfiguration=$updateSpendThresholdConfiguration, updateSubscriptions=$updateSubscriptions, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is V2ContractGetEditHistoryResponse && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "V2ContractGetEditHistoryResponse{data=$data, additionalProperties=$additionalProperties}"
}
