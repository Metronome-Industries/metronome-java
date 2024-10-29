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
import com.metronome.api.core.toUnmodifiable
import com.metronome.api.errors.MetronomeInvalidDataException
import com.metronome.api.models.*
import java.util.Objects
import java.util.Optional

class AlertCreateParams
constructor(
    private val alertType: AlertType,
    private val name: String,
    private val threshold: Double,
    private val billableMetricId: String?,
    private val creditGrantTypeFilters: List<String>?,
    private val creditTypeId: String?,
    private val customFieldFilters: List<CustomFieldFilter>?,
    private val customerId: String?,
    private val evaluateOnCreate: Boolean?,
    private val groupKeyFilter: GroupKeyFilter?,
    private val invoiceTypesFilter: List<String>?,
    private val planId: String?,
    private val uniquenessKey: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun alertType(): AlertType = alertType

    fun name(): String = name

    fun threshold(): Double = threshold

    fun billableMetricId(): Optional<String> = Optional.ofNullable(billableMetricId)

    fun creditGrantTypeFilters(): Optional<List<String>> =
        Optional.ofNullable(creditGrantTypeFilters)

    fun creditTypeId(): Optional<String> = Optional.ofNullable(creditTypeId)

    fun customFieldFilters(): Optional<List<CustomFieldFilter>> =
        Optional.ofNullable(customFieldFilters)

    fun customerId(): Optional<String> = Optional.ofNullable(customerId)

    fun evaluateOnCreate(): Optional<Boolean> = Optional.ofNullable(evaluateOnCreate)

    fun groupKeyFilter(): Optional<GroupKeyFilter> = Optional.ofNullable(groupKeyFilter)

    fun invoiceTypesFilter(): Optional<List<String>> = Optional.ofNullable(invoiceTypesFilter)

    fun planId(): Optional<String> = Optional.ofNullable(planId)

    fun uniquenessKey(): Optional<String> = Optional.ofNullable(uniquenessKey)

    @JvmSynthetic
    internal fun getBody(): AlertCreateBody {
        return AlertCreateBody(
            alertType,
            name,
            threshold,
            billableMetricId,
            creditGrantTypeFilters,
            creditTypeId,
            customFieldFilters,
            customerId,
            evaluateOnCreate,
            groupKeyFilter,
            invoiceTypesFilter,
            planId,
            uniquenessKey,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = AlertCreateBody.Builder::class)
    @NoAutoDetect
    class AlertCreateBody
    internal constructor(
        private val alertType: AlertType?,
        private val name: String?,
        private val threshold: Double?,
        private val billableMetricId: String?,
        private val creditGrantTypeFilters: List<String>?,
        private val creditTypeId: String?,
        private val customFieldFilters: List<CustomFieldFilter>?,
        private val customerId: String?,
        private val evaluateOnCreate: Boolean?,
        private val groupKeyFilter: GroupKeyFilter?,
        private val invoiceTypesFilter: List<String>?,
        private val planId: String?,
        private val uniquenessKey: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** Type of the alert */
        @JsonProperty("alert_type") fun alertType(): AlertType? = alertType

        /** Name of the alert */
        @JsonProperty("name") fun name(): String? = name

        /**
         * Threshold value of the alert policy. Depending upon the alert type, this number may
         * represent a financial amount, the days remaining, or a percentage reached.
         */
        @JsonProperty("threshold") fun threshold(): Double? = threshold

        /**
         * For alerts of type `usage_threshold_reached`, specifies which billable metric to track
         * the usage for.
         */
        @JsonProperty("billable_metric_id") fun billableMetricId(): String? = billableMetricId

        /**
         * An array of strings, representing a way to filter the credit grant this alert applies to,
         * by looking at the credit_grant_type field on the credit grant. This field is only defined
         * for CreditPercentage and CreditBalance alerts
         */
        @JsonProperty("credit_grant_type_filters")
        fun creditGrantTypeFilters(): List<String>? = creditGrantTypeFilters

        @JsonProperty("credit_type_id") fun creditTypeId(): String? = creditTypeId

        /**
         * Only present for beta contract invoices. This field's availability is dependent on your
         * client's configuration. A list of custom field filters for alert types that support
         * advanced filtering
         */
        @JsonProperty("custom_field_filters")
        fun customFieldFilters(): List<CustomFieldFilter>? = customFieldFilters

        /**
         * If provided, will create this alert for this specific customer. To create an alert for
         * all customers, do not specify `customer_id` or `plan_id`.
         */
        @JsonProperty("customer_id") fun customerId(): String? = customerId

        /**
         * If true, the alert will evaluate immediately on customers that already meet the alert
         * threshold. If false, it will only evaluate on future customers that trigger the alert
         * threshold. Defaults to true.
         */
        @JsonProperty("evaluate_on_create") fun evaluateOnCreate(): Boolean? = evaluateOnCreate

        /**
         * Scopes alert evaluation to a specific presentation group key on individual line items.
         * Only present for spend alerts.
         */
        @JsonProperty("group_key_filter") fun groupKeyFilter(): GroupKeyFilter? = groupKeyFilter

        /** Only supported for invoice_total_reached alerts. A list of invoice types to evaluate. */
        @JsonProperty("invoice_types_filter")
        fun invoiceTypesFilter(): List<String>? = invoiceTypesFilter

        /**
         * If provided, will create this alert for this specific plan. To create an alert for all
         * customers, do not specify `customer_id` or `plan_id`.
         */
        @JsonProperty("plan_id") fun planId(): String? = planId

        /**
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
         */
        @JsonProperty("uniqueness_key") fun uniquenessKey(): String? = uniquenessKey

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var alertType: AlertType? = null
            private var name: String? = null
            private var threshold: Double? = null
            private var billableMetricId: String? = null
            private var creditGrantTypeFilters: List<String>? = null
            private var creditTypeId: String? = null
            private var customFieldFilters: List<CustomFieldFilter>? = null
            private var customerId: String? = null
            private var evaluateOnCreate: Boolean? = null
            private var groupKeyFilter: GroupKeyFilter? = null
            private var invoiceTypesFilter: List<String>? = null
            private var planId: String? = null
            private var uniquenessKey: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(alertCreateBody: AlertCreateBody) = apply {
                this.alertType = alertCreateBody.alertType
                this.name = alertCreateBody.name
                this.threshold = alertCreateBody.threshold
                this.billableMetricId = alertCreateBody.billableMetricId
                this.creditGrantTypeFilters = alertCreateBody.creditGrantTypeFilters
                this.creditTypeId = alertCreateBody.creditTypeId
                this.customFieldFilters = alertCreateBody.customFieldFilters
                this.customerId = alertCreateBody.customerId
                this.evaluateOnCreate = alertCreateBody.evaluateOnCreate
                this.groupKeyFilter = alertCreateBody.groupKeyFilter
                this.invoiceTypesFilter = alertCreateBody.invoiceTypesFilter
                this.planId = alertCreateBody.planId
                this.uniquenessKey = alertCreateBody.uniquenessKey
                additionalProperties(alertCreateBody.additionalProperties)
            }

            /** Type of the alert */
            @JsonProperty("alert_type")
            fun alertType(alertType: AlertType) = apply { this.alertType = alertType }

            /** Name of the alert */
            @JsonProperty("name") fun name(name: String) = apply { this.name = name }

            /**
             * Threshold value of the alert policy. Depending upon the alert type, this number may
             * represent a financial amount, the days remaining, or a percentage reached.
             */
            @JsonProperty("threshold")
            fun threshold(threshold: Double) = apply { this.threshold = threshold }

            /**
             * For alerts of type `usage_threshold_reached`, specifies which billable metric to
             * track the usage for.
             */
            @JsonProperty("billable_metric_id")
            fun billableMetricId(billableMetricId: String) = apply {
                this.billableMetricId = billableMetricId
            }

            /**
             * An array of strings, representing a way to filter the credit grant this alert applies
             * to, by looking at the credit_grant_type field on the credit grant. This field is only
             * defined for CreditPercentage and CreditBalance alerts
             */
            @JsonProperty("credit_grant_type_filters")
            fun creditGrantTypeFilters(creditGrantTypeFilters: List<String>) = apply {
                this.creditGrantTypeFilters = creditGrantTypeFilters
            }

            @JsonProperty("credit_type_id")
            fun creditTypeId(creditTypeId: String) = apply { this.creditTypeId = creditTypeId }

            /**
             * Only present for beta contract invoices. This field's availability is dependent on
             * your client's configuration. A list of custom field filters for alert types that
             * support advanced filtering
             */
            @JsonProperty("custom_field_filters")
            fun customFieldFilters(customFieldFilters: List<CustomFieldFilter>) = apply {
                this.customFieldFilters = customFieldFilters
            }

            /**
             * If provided, will create this alert for this specific customer. To create an alert
             * for all customers, do not specify `customer_id` or `plan_id`.
             */
            @JsonProperty("customer_id")
            fun customerId(customerId: String) = apply { this.customerId = customerId }

            /**
             * If true, the alert will evaluate immediately on customers that already meet the alert
             * threshold. If false, it will only evaluate on future customers that trigger the alert
             * threshold. Defaults to true.
             */
            @JsonProperty("evaluate_on_create")
            fun evaluateOnCreate(evaluateOnCreate: Boolean) = apply {
                this.evaluateOnCreate = evaluateOnCreate
            }

            /**
             * Scopes alert evaluation to a specific presentation group key on individual line
             * items. Only present for spend alerts.
             */
            @JsonProperty("group_key_filter")
            fun groupKeyFilter(groupKeyFilter: GroupKeyFilter) = apply {
                this.groupKeyFilter = groupKeyFilter
            }

            /**
             * Only supported for invoice_total_reached alerts. A list of invoice types to evaluate.
             */
            @JsonProperty("invoice_types_filter")
            fun invoiceTypesFilter(invoiceTypesFilter: List<String>) = apply {
                this.invoiceTypesFilter = invoiceTypesFilter
            }

            /**
             * If provided, will create this alert for this specific plan. To create an alert for
             * all customers, do not specify `customer_id` or `plan_id`.
             */
            @JsonProperty("plan_id") fun planId(planId: String) = apply { this.planId = planId }

            /**
             * Prevents the creation of duplicates. If a request to create a record is made with a
             * previously used uniqueness key, a new record will not be created and the request will
             * fail with a 409 error.
             */
            @JsonProperty("uniqueness_key")
            fun uniquenessKey(uniquenessKey: String) = apply { this.uniquenessKey = uniquenessKey }

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

            fun build(): AlertCreateBody =
                AlertCreateBody(
                    checkNotNull(alertType) { "`alertType` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(threshold) { "`threshold` is required but was not set" },
                    billableMetricId,
                    creditGrantTypeFilters?.toUnmodifiable(),
                    creditTypeId,
                    customFieldFilters?.toUnmodifiable(),
                    customerId,
                    evaluateOnCreate,
                    groupKeyFilter,
                    invoiceTypesFilter?.toUnmodifiable(),
                    planId,
                    uniquenessKey,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AlertCreateBody && this.alertType == other.alertType && this.name == other.name && this.threshold == other.threshold && this.billableMetricId == other.billableMetricId && this.creditGrantTypeFilters == other.creditGrantTypeFilters && this.creditTypeId == other.creditTypeId && this.customFieldFilters == other.customFieldFilters && this.customerId == other.customerId && this.evaluateOnCreate == other.evaluateOnCreate && this.groupKeyFilter == other.groupKeyFilter && this.invoiceTypesFilter == other.invoiceTypesFilter && this.planId == other.planId && this.uniquenessKey == other.uniquenessKey && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(alertType, name, threshold, billableMetricId, creditGrantTypeFilters, creditTypeId, customFieldFilters, customerId, evaluateOnCreate, groupKeyFilter, invoiceTypesFilter, planId, uniquenessKey, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "AlertCreateBody{alertType=$alertType, name=$name, threshold=$threshold, billableMetricId=$billableMetricId, creditGrantTypeFilters=$creditGrantTypeFilters, creditTypeId=$creditTypeId, customFieldFilters=$customFieldFilters, customerId=$customerId, evaluateOnCreate=$evaluateOnCreate, groupKeyFilter=$groupKeyFilter, invoiceTypesFilter=$invoiceTypesFilter, planId=$planId, uniquenessKey=$uniquenessKey, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AlertCreateParams && this.alertType == other.alertType && this.name == other.name && this.threshold == other.threshold && this.billableMetricId == other.billableMetricId && this.creditGrantTypeFilters == other.creditGrantTypeFilters && this.creditTypeId == other.creditTypeId && this.customFieldFilters == other.customFieldFilters && this.customerId == other.customerId && this.evaluateOnCreate == other.evaluateOnCreate && this.groupKeyFilter == other.groupKeyFilter && this.invoiceTypesFilter == other.invoiceTypesFilter && this.planId == other.planId && this.uniquenessKey == other.uniquenessKey && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(alertType, name, threshold, billableMetricId, creditGrantTypeFilters, creditTypeId, customFieldFilters, customerId, evaluateOnCreate, groupKeyFilter, invoiceTypesFilter, planId, uniquenessKey, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "AlertCreateParams{alertType=$alertType, name=$name, threshold=$threshold, billableMetricId=$billableMetricId, creditGrantTypeFilters=$creditGrantTypeFilters, creditTypeId=$creditTypeId, customFieldFilters=$customFieldFilters, customerId=$customerId, evaluateOnCreate=$evaluateOnCreate, groupKeyFilter=$groupKeyFilter, invoiceTypesFilter=$invoiceTypesFilter, planId=$planId, uniquenessKey=$uniquenessKey, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var alertType: AlertType? = null
        private var name: String? = null
        private var threshold: Double? = null
        private var billableMetricId: String? = null
        private var creditGrantTypeFilters: MutableList<String> = mutableListOf()
        private var creditTypeId: String? = null
        private var customFieldFilters: MutableList<CustomFieldFilter> = mutableListOf()
        private var customerId: String? = null
        private var evaluateOnCreate: Boolean? = null
        private var groupKeyFilter: GroupKeyFilter? = null
        private var invoiceTypesFilter: MutableList<String> = mutableListOf()
        private var planId: String? = null
        private var uniquenessKey: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(alertCreateParams: AlertCreateParams) = apply {
            this.alertType = alertCreateParams.alertType
            this.name = alertCreateParams.name
            this.threshold = alertCreateParams.threshold
            this.billableMetricId = alertCreateParams.billableMetricId
            this.creditGrantTypeFilters(alertCreateParams.creditGrantTypeFilters ?: listOf())
            this.creditTypeId = alertCreateParams.creditTypeId
            this.customFieldFilters(alertCreateParams.customFieldFilters ?: listOf())
            this.customerId = alertCreateParams.customerId
            this.evaluateOnCreate = alertCreateParams.evaluateOnCreate
            this.groupKeyFilter = alertCreateParams.groupKeyFilter
            this.invoiceTypesFilter(alertCreateParams.invoiceTypesFilter ?: listOf())
            this.planId = alertCreateParams.planId
            this.uniquenessKey = alertCreateParams.uniquenessKey
            additionalQueryParams(alertCreateParams.additionalQueryParams)
            additionalHeaders(alertCreateParams.additionalHeaders)
            additionalBodyProperties(alertCreateParams.additionalBodyProperties)
        }

        /** Type of the alert */
        fun alertType(alertType: AlertType) = apply { this.alertType = alertType }

        /** Name of the alert */
        fun name(name: String) = apply { this.name = name }

        /**
         * Threshold value of the alert policy. Depending upon the alert type, this number may
         * represent a financial amount, the days remaining, or a percentage reached.
         */
        fun threshold(threshold: Double) = apply { this.threshold = threshold }

        /**
         * For alerts of type `usage_threshold_reached`, specifies which billable metric to track
         * the usage for.
         */
        fun billableMetricId(billableMetricId: String) = apply {
            this.billableMetricId = billableMetricId
        }

        /**
         * An array of strings, representing a way to filter the credit grant this alert applies to,
         * by looking at the credit_grant_type field on the credit grant. This field is only defined
         * for CreditPercentage and CreditBalance alerts
         */
        fun creditGrantTypeFilters(creditGrantTypeFilters: List<String>) = apply {
            this.creditGrantTypeFilters.clear()
            this.creditGrantTypeFilters.addAll(creditGrantTypeFilters)
        }

        /**
         * An array of strings, representing a way to filter the credit grant this alert applies to,
         * by looking at the credit_grant_type field on the credit grant. This field is only defined
         * for CreditPercentage and CreditBalance alerts
         */
        fun addCreditGrantTypeFilter(creditGrantTypeFilter: String) = apply {
            this.creditGrantTypeFilters.add(creditGrantTypeFilter)
        }

        fun creditTypeId(creditTypeId: String) = apply { this.creditTypeId = creditTypeId }

        /**
         * Only present for beta contract invoices. This field's availability is dependent on your
         * client's configuration. A list of custom field filters for alert types that support
         * advanced filtering
         */
        fun customFieldFilters(customFieldFilters: List<CustomFieldFilter>) = apply {
            this.customFieldFilters.clear()
            this.customFieldFilters.addAll(customFieldFilters)
        }

        /**
         * Only present for beta contract invoices. This field's availability is dependent on your
         * client's configuration. A list of custom field filters for alert types that support
         * advanced filtering
         */
        fun addCustomFieldFilter(customFieldFilter: CustomFieldFilter) = apply {
            this.customFieldFilters.add(customFieldFilter)
        }

        /**
         * If provided, will create this alert for this specific customer. To create an alert for
         * all customers, do not specify `customer_id` or `plan_id`.
         */
        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /**
         * If true, the alert will evaluate immediately on customers that already meet the alert
         * threshold. If false, it will only evaluate on future customers that trigger the alert
         * threshold. Defaults to true.
         */
        fun evaluateOnCreate(evaluateOnCreate: Boolean) = apply {
            this.evaluateOnCreate = evaluateOnCreate
        }

        /**
         * Scopes alert evaluation to a specific presentation group key on individual line items.
         * Only present for spend alerts.
         */
        fun groupKeyFilter(groupKeyFilter: GroupKeyFilter) = apply {
            this.groupKeyFilter = groupKeyFilter
        }

        /** Only supported for invoice_total_reached alerts. A list of invoice types to evaluate. */
        fun invoiceTypesFilter(invoiceTypesFilter: List<String>) = apply {
            this.invoiceTypesFilter.clear()
            this.invoiceTypesFilter.addAll(invoiceTypesFilter)
        }

        /** Only supported for invoice_total_reached alerts. A list of invoice types to evaluate. */
        fun addInvoiceTypesFilter(invoiceTypesFilter: String) = apply {
            this.invoiceTypesFilter.add(invoiceTypesFilter)
        }

        /**
         * If provided, will create this alert for this specific plan. To create an alert for all
         * customers, do not specify `customer_id` or `plan_id`.
         */
        fun planId(planId: String) = apply { this.planId = planId }

        /**
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
         */
        fun uniquenessKey(uniquenessKey: String) = apply { this.uniquenessKey = uniquenessKey }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): AlertCreateParams =
            AlertCreateParams(
                checkNotNull(alertType) { "`alertType` is required but was not set" },
                checkNotNull(name) { "`name` is required but was not set" },
                checkNotNull(threshold) { "`threshold` is required but was not set" },
                billableMetricId,
                if (creditGrantTypeFilters.size == 0) null
                else creditGrantTypeFilters.toUnmodifiable(),
                creditTypeId,
                if (customFieldFilters.size == 0) null else customFieldFilters.toUnmodifiable(),
                customerId,
                evaluateOnCreate,
                groupKeyFilter,
                if (invoiceTypesFilter.size == 0) null else invoiceTypesFilter.toUnmodifiable(),
                planId,
                uniquenessKey,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class AlertType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AlertType && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField
            val LOW_CREDIT_BALANCE_REACHED = AlertType(JsonField.of("low_credit_balance_reached"))

            @JvmField
            val SPEND_THRESHOLD_REACHED = AlertType(JsonField.of("spend_threshold_reached"))

            @JvmField
            val MONTHLY_INVOICE_TOTAL_SPEND_THRESHOLD_REACHED =
                AlertType(JsonField.of("monthly_invoice_total_spend_threshold_reached"))

            @JvmField
            val LOW_REMAINING_DAYS_IN_PLAN_REACHED =
                AlertType(JsonField.of("low_remaining_days_in_plan_reached"))

            @JvmField
            val LOW_REMAINING_CREDIT_PERCENTAGE_REACHED =
                AlertType(JsonField.of("low_remaining_credit_percentage_reached"))

            @JvmField
            val USAGE_THRESHOLD_REACHED = AlertType(JsonField.of("usage_threshold_reached"))

            @JvmField
            val LOW_REMAINING_DAYS_FOR_COMMIT_SEGMENT_REACHED =
                AlertType(JsonField.of("low_remaining_days_for_commit_segment_reached"))

            @JvmField
            val LOW_REMAINING_COMMIT_BALANCE_REACHED =
                AlertType(JsonField.of("low_remaining_commit_balance_reached"))

            @JvmField
            val LOW_REMAINING_COMMIT_PERCENTAGE_REACHED =
                AlertType(JsonField.of("low_remaining_commit_percentage_reached"))

            @JvmField
            val LOW_REMAINING_DAYS_FOR_CONTRACT_CREDIT_SEGMENT_REACHED =
                AlertType(JsonField.of("low_remaining_days_for_contract_credit_segment_reached"))

            @JvmField
            val LOW_REMAINING_CONTRACT_CREDIT_BALANCE_REACHED =
                AlertType(JsonField.of("low_remaining_contract_credit_balance_reached"))

            @JvmField
            val LOW_REMAINING_CONTRACT_CREDIT_PERCENTAGE_REACHED =
                AlertType(JsonField.of("low_remaining_contract_credit_percentage_reached"))

            @JvmField
            val LOW_REMAINING_CONTRACT_CREDIT_AND_COMMIT_BALANCE_REACHED =
                AlertType(JsonField.of("low_remaining_contract_credit_and_commit_balance_reached"))

            @JvmField val INVOICE_TOTAL_REACHED = AlertType(JsonField.of("invoice_total_reached"))

            @JvmStatic fun of(value: String) = AlertType(JsonField.of(value))
        }

        enum class Known {
            LOW_CREDIT_BALANCE_REACHED,
            SPEND_THRESHOLD_REACHED,
            MONTHLY_INVOICE_TOTAL_SPEND_THRESHOLD_REACHED,
            LOW_REMAINING_DAYS_IN_PLAN_REACHED,
            LOW_REMAINING_CREDIT_PERCENTAGE_REACHED,
            USAGE_THRESHOLD_REACHED,
            LOW_REMAINING_DAYS_FOR_COMMIT_SEGMENT_REACHED,
            LOW_REMAINING_COMMIT_BALANCE_REACHED,
            LOW_REMAINING_COMMIT_PERCENTAGE_REACHED,
            LOW_REMAINING_DAYS_FOR_CONTRACT_CREDIT_SEGMENT_REACHED,
            LOW_REMAINING_CONTRACT_CREDIT_BALANCE_REACHED,
            LOW_REMAINING_CONTRACT_CREDIT_PERCENTAGE_REACHED,
            LOW_REMAINING_CONTRACT_CREDIT_AND_COMMIT_BALANCE_REACHED,
            INVOICE_TOTAL_REACHED,
        }

        enum class Value {
            LOW_CREDIT_BALANCE_REACHED,
            SPEND_THRESHOLD_REACHED,
            MONTHLY_INVOICE_TOTAL_SPEND_THRESHOLD_REACHED,
            LOW_REMAINING_DAYS_IN_PLAN_REACHED,
            LOW_REMAINING_CREDIT_PERCENTAGE_REACHED,
            USAGE_THRESHOLD_REACHED,
            LOW_REMAINING_DAYS_FOR_COMMIT_SEGMENT_REACHED,
            LOW_REMAINING_COMMIT_BALANCE_REACHED,
            LOW_REMAINING_COMMIT_PERCENTAGE_REACHED,
            LOW_REMAINING_DAYS_FOR_CONTRACT_CREDIT_SEGMENT_REACHED,
            LOW_REMAINING_CONTRACT_CREDIT_BALANCE_REACHED,
            LOW_REMAINING_CONTRACT_CREDIT_PERCENTAGE_REACHED,
            LOW_REMAINING_CONTRACT_CREDIT_AND_COMMIT_BALANCE_REACHED,
            INVOICE_TOTAL_REACHED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                LOW_CREDIT_BALANCE_REACHED -> Value.LOW_CREDIT_BALANCE_REACHED
                SPEND_THRESHOLD_REACHED -> Value.SPEND_THRESHOLD_REACHED
                MONTHLY_INVOICE_TOTAL_SPEND_THRESHOLD_REACHED ->
                    Value.MONTHLY_INVOICE_TOTAL_SPEND_THRESHOLD_REACHED
                LOW_REMAINING_DAYS_IN_PLAN_REACHED -> Value.LOW_REMAINING_DAYS_IN_PLAN_REACHED
                LOW_REMAINING_CREDIT_PERCENTAGE_REACHED ->
                    Value.LOW_REMAINING_CREDIT_PERCENTAGE_REACHED
                USAGE_THRESHOLD_REACHED -> Value.USAGE_THRESHOLD_REACHED
                LOW_REMAINING_DAYS_FOR_COMMIT_SEGMENT_REACHED ->
                    Value.LOW_REMAINING_DAYS_FOR_COMMIT_SEGMENT_REACHED
                LOW_REMAINING_COMMIT_BALANCE_REACHED -> Value.LOW_REMAINING_COMMIT_BALANCE_REACHED
                LOW_REMAINING_COMMIT_PERCENTAGE_REACHED ->
                    Value.LOW_REMAINING_COMMIT_PERCENTAGE_REACHED
                LOW_REMAINING_DAYS_FOR_CONTRACT_CREDIT_SEGMENT_REACHED ->
                    Value.LOW_REMAINING_DAYS_FOR_CONTRACT_CREDIT_SEGMENT_REACHED
                LOW_REMAINING_CONTRACT_CREDIT_BALANCE_REACHED ->
                    Value.LOW_REMAINING_CONTRACT_CREDIT_BALANCE_REACHED
                LOW_REMAINING_CONTRACT_CREDIT_PERCENTAGE_REACHED ->
                    Value.LOW_REMAINING_CONTRACT_CREDIT_PERCENTAGE_REACHED
                LOW_REMAINING_CONTRACT_CREDIT_AND_COMMIT_BALANCE_REACHED ->
                    Value.LOW_REMAINING_CONTRACT_CREDIT_AND_COMMIT_BALANCE_REACHED
                INVOICE_TOTAL_REACHED -> Value.INVOICE_TOTAL_REACHED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                LOW_CREDIT_BALANCE_REACHED -> Known.LOW_CREDIT_BALANCE_REACHED
                SPEND_THRESHOLD_REACHED -> Known.SPEND_THRESHOLD_REACHED
                MONTHLY_INVOICE_TOTAL_SPEND_THRESHOLD_REACHED ->
                    Known.MONTHLY_INVOICE_TOTAL_SPEND_THRESHOLD_REACHED
                LOW_REMAINING_DAYS_IN_PLAN_REACHED -> Known.LOW_REMAINING_DAYS_IN_PLAN_REACHED
                LOW_REMAINING_CREDIT_PERCENTAGE_REACHED ->
                    Known.LOW_REMAINING_CREDIT_PERCENTAGE_REACHED
                USAGE_THRESHOLD_REACHED -> Known.USAGE_THRESHOLD_REACHED
                LOW_REMAINING_DAYS_FOR_COMMIT_SEGMENT_REACHED ->
                    Known.LOW_REMAINING_DAYS_FOR_COMMIT_SEGMENT_REACHED
                LOW_REMAINING_COMMIT_BALANCE_REACHED -> Known.LOW_REMAINING_COMMIT_BALANCE_REACHED
                LOW_REMAINING_COMMIT_PERCENTAGE_REACHED ->
                    Known.LOW_REMAINING_COMMIT_PERCENTAGE_REACHED
                LOW_REMAINING_DAYS_FOR_CONTRACT_CREDIT_SEGMENT_REACHED ->
                    Known.LOW_REMAINING_DAYS_FOR_CONTRACT_CREDIT_SEGMENT_REACHED
                LOW_REMAINING_CONTRACT_CREDIT_BALANCE_REACHED ->
                    Known.LOW_REMAINING_CONTRACT_CREDIT_BALANCE_REACHED
                LOW_REMAINING_CONTRACT_CREDIT_PERCENTAGE_REACHED ->
                    Known.LOW_REMAINING_CONTRACT_CREDIT_PERCENTAGE_REACHED
                LOW_REMAINING_CONTRACT_CREDIT_AND_COMMIT_BALANCE_REACHED ->
                    Known.LOW_REMAINING_CONTRACT_CREDIT_AND_COMMIT_BALANCE_REACHED
                INVOICE_TOTAL_REACHED -> Known.INVOICE_TOTAL_REACHED
                else -> throw MetronomeInvalidDataException("Unknown AlertType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(builder = CustomFieldFilter.Builder::class)
    @NoAutoDetect
    class CustomFieldFilter
    private constructor(
        private val entity: Entity?,
        private val key: String?,
        private val value: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("entity") fun entity(): Entity? = entity

        @JsonProperty("key") fun key(): String? = key

        @JsonProperty("value") fun value(): String? = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var entity: Entity? = null
            private var key: String? = null
            private var value: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customFieldFilter: CustomFieldFilter) = apply {
                this.entity = customFieldFilter.entity
                this.key = customFieldFilter.key
                this.value = customFieldFilter.value
                additionalProperties(customFieldFilter.additionalProperties)
            }

            @JsonProperty("entity") fun entity(entity: Entity) = apply { this.entity = entity }

            @JsonProperty("key") fun key(key: String) = apply { this.key = key }

            @JsonProperty("value") fun value(value: String) = apply { this.value = value }

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

            fun build(): CustomFieldFilter =
                CustomFieldFilter(
                    checkNotNull(entity) { "`entity` is required but was not set" },
                    checkNotNull(key) { "`key` is required but was not set" },
                    checkNotNull(value) { "`value` is required but was not set" },
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Entity
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Entity && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val CONTRACT = Entity(JsonField.of("Contract"))

                @JvmField val COMMIT = Entity(JsonField.of("Commit"))

                @JvmField val CONTRACT_CREDIT = Entity(JsonField.of("ContractCredit"))

                @JvmStatic fun of(value: String) = Entity(JsonField.of(value))
            }

            enum class Known {
                CONTRACT,
                COMMIT,
                CONTRACT_CREDIT,
            }

            enum class Value {
                CONTRACT,
                COMMIT,
                CONTRACT_CREDIT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    CONTRACT -> Value.CONTRACT
                    COMMIT -> Value.COMMIT
                    CONTRACT_CREDIT -> Value.CONTRACT_CREDIT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    CONTRACT -> Known.CONTRACT
                    COMMIT -> Known.COMMIT
                    CONTRACT_CREDIT -> Known.CONTRACT_CREDIT
                    else -> throw MetronomeInvalidDataException("Unknown Entity: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomFieldFilter && this.entity == other.entity && this.key == other.key && this.value == other.value && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(entity, key, value, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "CustomFieldFilter{entity=$entity, key=$key, value=$value, additionalProperties=$additionalProperties}"
    }

    /**
     * Scopes alert evaluation to a specific presentation group key on individual line items. Only
     * present for spend alerts.
     */
    @JsonDeserialize(builder = GroupKeyFilter.Builder::class)
    @NoAutoDetect
    class GroupKeyFilter
    private constructor(
        private val key: String?,
        private val value: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("key") fun key(): String? = key

        @JsonProperty("value") fun value(): String? = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var key: String? = null
            private var value: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(groupKeyFilter: GroupKeyFilter) = apply {
                this.key = groupKeyFilter.key
                this.value = groupKeyFilter.value
                additionalProperties(groupKeyFilter.additionalProperties)
            }

            @JsonProperty("key") fun key(key: String) = apply { this.key = key }

            @JsonProperty("value") fun value(value: String) = apply { this.value = value }

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

            fun build(): GroupKeyFilter =
                GroupKeyFilter(
                    checkNotNull(key) { "`key` is required but was not set" },
                    checkNotNull(value) { "`value` is required but was not set" },
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is GroupKeyFilter && this.key == other.key && this.value == other.value && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(key, value, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "GroupKeyFilter{key=$key, value=$value, additionalProperties=$additionalProperties}"
    }
}
