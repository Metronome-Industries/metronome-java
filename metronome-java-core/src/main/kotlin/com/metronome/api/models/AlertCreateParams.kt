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
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.util.Objects
import java.util.Optional

/** Create a new alert */
class AlertCreateParams
private constructor(
    private val body: AlertCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** Type of the alert */
    fun alertType(): AlertType = body.alertType()

    /** Name of the alert */
    fun name(): String = body.name()

    /**
     * Threshold value of the alert policy. Depending upon the alert type, this number may represent
     * a financial amount, the days remaining, or a percentage reached.
     */
    fun threshold(): Double = body.threshold()

    /**
     * For alerts of type `usage_threshold_reached`, specifies which billable metric to track the
     * usage for.
     */
    fun billableMetricId(): Optional<String> = body.billableMetricId()

    /**
     * An array of strings, representing a way to filter the credit grant this alert applies to, by
     * looking at the credit_grant_type field on the credit grant. This field is only defined for
     * CreditPercentage and CreditBalance alerts
     */
    fun creditGrantTypeFilters(): Optional<List<String>> = body.creditGrantTypeFilters()

    fun creditTypeId(): Optional<String> = body.creditTypeId()

    /**
     * Only present for beta contract invoices. This field's availability is dependent on your
     * client's configuration. A list of custom field filters for alert types that support advanced
     * filtering
     */
    fun customFieldFilters(): Optional<List<CustomFieldFilter>> = body.customFieldFilters()

    /**
     * If provided, will create this alert for this specific customer. To create an alert for all
     * customers, do not specify `customer_id` or `plan_id`.
     */
    fun customerId(): Optional<String> = body.customerId()

    /**
     * If true, the alert will evaluate immediately on customers that already meet the alert
     * threshold. If false, it will only evaluate on future customers that trigger the alert
     * threshold. Defaults to true.
     */
    fun evaluateOnCreate(): Optional<Boolean> = body.evaluateOnCreate()

    /**
     * Scopes alert evaluation to a specific presentation group key on individual line items. Only
     * present for spend alerts.
     */
    fun groupKeyFilter(): Optional<GroupKeyFilter> = body.groupKeyFilter()

    /** Only supported for invoice_total_reached alerts. A list of invoice types to evaluate. */
    fun invoiceTypesFilter(): Optional<List<String>> = body.invoiceTypesFilter()

    /**
     * If provided, will create this alert for this specific plan. To create an alert for all
     * customers, do not specify `customer_id` or `plan_id`.
     */
    fun planId(): Optional<String> = body.planId()

    /**
     * Prevents the creation of duplicates. If a request to create a record is made with a
     * previously used uniqueness key, a new record will not be created and the request will fail
     * with a 409 error.
     */
    fun uniquenessKey(): Optional<String> = body.uniquenessKey()

    /** Type of the alert */
    fun _alertType(): JsonField<AlertType> = body._alertType()

    /** Name of the alert */
    fun _name(): JsonField<String> = body._name()

    /**
     * Threshold value of the alert policy. Depending upon the alert type, this number may represent
     * a financial amount, the days remaining, or a percentage reached.
     */
    fun _threshold(): JsonField<Double> = body._threshold()

    /**
     * For alerts of type `usage_threshold_reached`, specifies which billable metric to track the
     * usage for.
     */
    fun _billableMetricId(): JsonField<String> = body._billableMetricId()

    /**
     * An array of strings, representing a way to filter the credit grant this alert applies to, by
     * looking at the credit_grant_type field on the credit grant. This field is only defined for
     * CreditPercentage and CreditBalance alerts
     */
    fun _creditGrantTypeFilters(): JsonField<List<String>> = body._creditGrantTypeFilters()

    fun _creditTypeId(): JsonField<String> = body._creditTypeId()

    /**
     * Only present for beta contract invoices. This field's availability is dependent on your
     * client's configuration. A list of custom field filters for alert types that support advanced
     * filtering
     */
    fun _customFieldFilters(): JsonField<List<CustomFieldFilter>> = body._customFieldFilters()

    /**
     * If provided, will create this alert for this specific customer. To create an alert for all
     * customers, do not specify `customer_id` or `plan_id`.
     */
    fun _customerId(): JsonField<String> = body._customerId()

    /**
     * If true, the alert will evaluate immediately on customers that already meet the alert
     * threshold. If false, it will only evaluate on future customers that trigger the alert
     * threshold. Defaults to true.
     */
    fun _evaluateOnCreate(): JsonField<Boolean> = body._evaluateOnCreate()

    /**
     * Scopes alert evaluation to a specific presentation group key on individual line items. Only
     * present for spend alerts.
     */
    fun _groupKeyFilter(): JsonField<GroupKeyFilter> = body._groupKeyFilter()

    /** Only supported for invoice_total_reached alerts. A list of invoice types to evaluate. */
    fun _invoiceTypesFilter(): JsonField<List<String>> = body._invoiceTypesFilter()

    /**
     * If provided, will create this alert for this specific plan. To create an alert for all
     * customers, do not specify `customer_id` or `plan_id`.
     */
    fun _planId(): JsonField<String> = body._planId()

    /**
     * Prevents the creation of duplicates. If a request to create a record is made with a
     * previously used uniqueness key, a new record will not be created and the request will fail
     * with a 409 error.
     */
    fun _uniquenessKey(): JsonField<String> = body._uniquenessKey()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): AlertCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class AlertCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("alert_type")
        @ExcludeMissing
        private val alertType: JsonField<AlertType> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("threshold")
        @ExcludeMissing
        private val threshold: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("billable_metric_id")
        @ExcludeMissing
        private val billableMetricId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("credit_grant_type_filters")
        @ExcludeMissing
        private val creditGrantTypeFilters: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("credit_type_id")
        @ExcludeMissing
        private val creditTypeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("custom_field_filters")
        @ExcludeMissing
        private val customFieldFilters: JsonField<List<CustomFieldFilter>> = JsonMissing.of(),
        @JsonProperty("customer_id")
        @ExcludeMissing
        private val customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("evaluate_on_create")
        @ExcludeMissing
        private val evaluateOnCreate: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("group_key_filter")
        @ExcludeMissing
        private val groupKeyFilter: JsonField<GroupKeyFilter> = JsonMissing.of(),
        @JsonProperty("invoice_types_filter")
        @ExcludeMissing
        private val invoiceTypesFilter: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("plan_id")
        @ExcludeMissing
        private val planId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("uniqueness_key")
        @ExcludeMissing
        private val uniquenessKey: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Type of the alert */
        fun alertType(): AlertType = alertType.getRequired("alert_type")

        /** Name of the alert */
        fun name(): String = name.getRequired("name")

        /**
         * Threshold value of the alert policy. Depending upon the alert type, this number may
         * represent a financial amount, the days remaining, or a percentage reached.
         */
        fun threshold(): Double = threshold.getRequired("threshold")

        /**
         * For alerts of type `usage_threshold_reached`, specifies which billable metric to track
         * the usage for.
         */
        fun billableMetricId(): Optional<String> =
            Optional.ofNullable(billableMetricId.getNullable("billable_metric_id"))

        /**
         * An array of strings, representing a way to filter the credit grant this alert applies to,
         * by looking at the credit_grant_type field on the credit grant. This field is only defined
         * for CreditPercentage and CreditBalance alerts
         */
        fun creditGrantTypeFilters(): Optional<List<String>> =
            Optional.ofNullable(creditGrantTypeFilters.getNullable("credit_grant_type_filters"))

        fun creditTypeId(): Optional<String> =
            Optional.ofNullable(creditTypeId.getNullable("credit_type_id"))

        /**
         * Only present for beta contract invoices. This field's availability is dependent on your
         * client's configuration. A list of custom field filters for alert types that support
         * advanced filtering
         */
        fun customFieldFilters(): Optional<List<CustomFieldFilter>> =
            Optional.ofNullable(customFieldFilters.getNullable("custom_field_filters"))

        /**
         * If provided, will create this alert for this specific customer. To create an alert for
         * all customers, do not specify `customer_id` or `plan_id`.
         */
        fun customerId(): Optional<String> =
            Optional.ofNullable(customerId.getNullable("customer_id"))

        /**
         * If true, the alert will evaluate immediately on customers that already meet the alert
         * threshold. If false, it will only evaluate on future customers that trigger the alert
         * threshold. Defaults to true.
         */
        fun evaluateOnCreate(): Optional<Boolean> =
            Optional.ofNullable(evaluateOnCreate.getNullable("evaluate_on_create"))

        /**
         * Scopes alert evaluation to a specific presentation group key on individual line items.
         * Only present for spend alerts.
         */
        fun groupKeyFilter(): Optional<GroupKeyFilter> =
            Optional.ofNullable(groupKeyFilter.getNullable("group_key_filter"))

        /** Only supported for invoice_total_reached alerts. A list of invoice types to evaluate. */
        fun invoiceTypesFilter(): Optional<List<String>> =
            Optional.ofNullable(invoiceTypesFilter.getNullable("invoice_types_filter"))

        /**
         * If provided, will create this alert for this specific plan. To create an alert for all
         * customers, do not specify `customer_id` or `plan_id`.
         */
        fun planId(): Optional<String> = Optional.ofNullable(planId.getNullable("plan_id"))

        /**
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
         */
        fun uniquenessKey(): Optional<String> =
            Optional.ofNullable(uniquenessKey.getNullable("uniqueness_key"))

        /** Type of the alert */
        @JsonProperty("alert_type")
        @ExcludeMissing
        fun _alertType(): JsonField<AlertType> = alertType

        /** Name of the alert */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Threshold value of the alert policy. Depending upon the alert type, this number may
         * represent a financial amount, the days remaining, or a percentage reached.
         */
        @JsonProperty("threshold") @ExcludeMissing fun _threshold(): JsonField<Double> = threshold

        /**
         * For alerts of type `usage_threshold_reached`, specifies which billable metric to track
         * the usage for.
         */
        @JsonProperty("billable_metric_id")
        @ExcludeMissing
        fun _billableMetricId(): JsonField<String> = billableMetricId

        /**
         * An array of strings, representing a way to filter the credit grant this alert applies to,
         * by looking at the credit_grant_type field on the credit grant. This field is only defined
         * for CreditPercentage and CreditBalance alerts
         */
        @JsonProperty("credit_grant_type_filters")
        @ExcludeMissing
        fun _creditGrantTypeFilters(): JsonField<List<String>> = creditGrantTypeFilters

        @JsonProperty("credit_type_id")
        @ExcludeMissing
        fun _creditTypeId(): JsonField<String> = creditTypeId

        /**
         * Only present for beta contract invoices. This field's availability is dependent on your
         * client's configuration. A list of custom field filters for alert types that support
         * advanced filtering
         */
        @JsonProperty("custom_field_filters")
        @ExcludeMissing
        fun _customFieldFilters(): JsonField<List<CustomFieldFilter>> = customFieldFilters

        /**
         * If provided, will create this alert for this specific customer. To create an alert for
         * all customers, do not specify `customer_id` or `plan_id`.
         */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * If true, the alert will evaluate immediately on customers that already meet the alert
         * threshold. If false, it will only evaluate on future customers that trigger the alert
         * threshold. Defaults to true.
         */
        @JsonProperty("evaluate_on_create")
        @ExcludeMissing
        fun _evaluateOnCreate(): JsonField<Boolean> = evaluateOnCreate

        /**
         * Scopes alert evaluation to a specific presentation group key on individual line items.
         * Only present for spend alerts.
         */
        @JsonProperty("group_key_filter")
        @ExcludeMissing
        fun _groupKeyFilter(): JsonField<GroupKeyFilter> = groupKeyFilter

        /** Only supported for invoice_total_reached alerts. A list of invoice types to evaluate. */
        @JsonProperty("invoice_types_filter")
        @ExcludeMissing
        fun _invoiceTypesFilter(): JsonField<List<String>> = invoiceTypesFilter

        /**
         * If provided, will create this alert for this specific plan. To create an alert for all
         * customers, do not specify `customer_id` or `plan_id`.
         */
        @JsonProperty("plan_id") @ExcludeMissing fun _planId(): JsonField<String> = planId

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

        fun validate(): AlertCreateBody = apply {
            if (validated) {
                return@apply
            }

            alertType()
            name()
            threshold()
            billableMetricId()
            creditGrantTypeFilters()
            creditTypeId()
            customFieldFilters().ifPresent { it.forEach { it.validate() } }
            customerId()
            evaluateOnCreate()
            groupKeyFilter().ifPresent { it.validate() }
            invoiceTypesFilter()
            planId()
            uniquenessKey()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var alertType: JsonField<AlertType>? = null
            private var name: JsonField<String>? = null
            private var threshold: JsonField<Double>? = null
            private var billableMetricId: JsonField<String> = JsonMissing.of()
            private var creditGrantTypeFilters: JsonField<MutableList<String>>? = null
            private var creditTypeId: JsonField<String> = JsonMissing.of()
            private var customFieldFilters: JsonField<MutableList<CustomFieldFilter>>? = null
            private var customerId: JsonField<String> = JsonMissing.of()
            private var evaluateOnCreate: JsonField<Boolean> = JsonMissing.of()
            private var groupKeyFilter: JsonField<GroupKeyFilter> = JsonMissing.of()
            private var invoiceTypesFilter: JsonField<MutableList<String>>? = null
            private var planId: JsonField<String> = JsonMissing.of()
            private var uniquenessKey: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(alertCreateBody: AlertCreateBody) = apply {
                alertType = alertCreateBody.alertType
                name = alertCreateBody.name
                threshold = alertCreateBody.threshold
                billableMetricId = alertCreateBody.billableMetricId
                creditGrantTypeFilters =
                    alertCreateBody.creditGrantTypeFilters.map { it.toMutableList() }
                creditTypeId = alertCreateBody.creditTypeId
                customFieldFilters = alertCreateBody.customFieldFilters.map { it.toMutableList() }
                customerId = alertCreateBody.customerId
                evaluateOnCreate = alertCreateBody.evaluateOnCreate
                groupKeyFilter = alertCreateBody.groupKeyFilter
                invoiceTypesFilter = alertCreateBody.invoiceTypesFilter.map { it.toMutableList() }
                planId = alertCreateBody.planId
                uniquenessKey = alertCreateBody.uniquenessKey
                additionalProperties = alertCreateBody.additionalProperties.toMutableMap()
            }

            /** Type of the alert */
            fun alertType(alertType: AlertType) = alertType(JsonField.of(alertType))

            /** Type of the alert */
            fun alertType(alertType: JsonField<AlertType>) = apply { this.alertType = alertType }

            /** Name of the alert */
            fun name(name: String) = name(JsonField.of(name))

            /** Name of the alert */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Threshold value of the alert policy. Depending upon the alert type, this number may
             * represent a financial amount, the days remaining, or a percentage reached.
             */
            fun threshold(threshold: Double) = threshold(JsonField.of(threshold))

            /**
             * Threshold value of the alert policy. Depending upon the alert type, this number may
             * represent a financial amount, the days remaining, or a percentage reached.
             */
            fun threshold(threshold: JsonField<Double>) = apply { this.threshold = threshold }

            /**
             * For alerts of type `usage_threshold_reached`, specifies which billable metric to
             * track the usage for.
             */
            fun billableMetricId(billableMetricId: String) =
                billableMetricId(JsonField.of(billableMetricId))

            /**
             * For alerts of type `usage_threshold_reached`, specifies which billable metric to
             * track the usage for.
             */
            fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                this.billableMetricId = billableMetricId
            }

            /**
             * An array of strings, representing a way to filter the credit grant this alert applies
             * to, by looking at the credit_grant_type field on the credit grant. This field is only
             * defined for CreditPercentage and CreditBalance alerts
             */
            fun creditGrantTypeFilters(creditGrantTypeFilters: List<String>) =
                creditGrantTypeFilters(JsonField.of(creditGrantTypeFilters))

            /**
             * An array of strings, representing a way to filter the credit grant this alert applies
             * to, by looking at the credit_grant_type field on the credit grant. This field is only
             * defined for CreditPercentage and CreditBalance alerts
             */
            fun creditGrantTypeFilters(creditGrantTypeFilters: JsonField<List<String>>) = apply {
                this.creditGrantTypeFilters = creditGrantTypeFilters.map { it.toMutableList() }
            }

            /**
             * An array of strings, representing a way to filter the credit grant this alert applies
             * to, by looking at the credit_grant_type field on the credit grant. This field is only
             * defined for CreditPercentage and CreditBalance alerts
             */
            fun addCreditGrantTypeFilter(creditGrantTypeFilter: String) = apply {
                creditGrantTypeFilters =
                    (creditGrantTypeFilters ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(creditGrantTypeFilter)
                    }
            }

            fun creditTypeId(creditTypeId: String) = creditTypeId(JsonField.of(creditTypeId))

            fun creditTypeId(creditTypeId: JsonField<String>) = apply {
                this.creditTypeId = creditTypeId
            }

            /**
             * Only present for beta contract invoices. This field's availability is dependent on
             * your client's configuration. A list of custom field filters for alert types that
             * support advanced filtering
             */
            fun customFieldFilters(customFieldFilters: List<CustomFieldFilter>) =
                customFieldFilters(JsonField.of(customFieldFilters))

            /**
             * Only present for beta contract invoices. This field's availability is dependent on
             * your client's configuration. A list of custom field filters for alert types that
             * support advanced filtering
             */
            fun customFieldFilters(customFieldFilters: JsonField<List<CustomFieldFilter>>) = apply {
                this.customFieldFilters = customFieldFilters.map { it.toMutableList() }
            }

            /**
             * Only present for beta contract invoices. This field's availability is dependent on
             * your client's configuration. A list of custom field filters for alert types that
             * support advanced filtering
             */
            fun addCustomFieldFilter(customFieldFilter: CustomFieldFilter) = apply {
                customFieldFilters =
                    (customFieldFilters ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(customFieldFilter)
                    }
            }

            /**
             * If provided, will create this alert for this specific customer. To create an alert
             * for all customers, do not specify `customer_id` or `plan_id`.
             */
            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /**
             * If provided, will create this alert for this specific customer. To create an alert
             * for all customers, do not specify `customer_id` or `plan_id`.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /**
             * If true, the alert will evaluate immediately on customers that already meet the alert
             * threshold. If false, it will only evaluate on future customers that trigger the alert
             * threshold. Defaults to true.
             */
            fun evaluateOnCreate(evaluateOnCreate: Boolean) =
                evaluateOnCreate(JsonField.of(evaluateOnCreate))

            /**
             * If true, the alert will evaluate immediately on customers that already meet the alert
             * threshold. If false, it will only evaluate on future customers that trigger the alert
             * threshold. Defaults to true.
             */
            fun evaluateOnCreate(evaluateOnCreate: JsonField<Boolean>) = apply {
                this.evaluateOnCreate = evaluateOnCreate
            }

            /**
             * Scopes alert evaluation to a specific presentation group key on individual line
             * items. Only present for spend alerts.
             */
            fun groupKeyFilter(groupKeyFilter: GroupKeyFilter) =
                groupKeyFilter(JsonField.of(groupKeyFilter))

            /**
             * Scopes alert evaluation to a specific presentation group key on individual line
             * items. Only present for spend alerts.
             */
            fun groupKeyFilter(groupKeyFilter: JsonField<GroupKeyFilter>) = apply {
                this.groupKeyFilter = groupKeyFilter
            }

            /**
             * Only supported for invoice_total_reached alerts. A list of invoice types to evaluate.
             */
            fun invoiceTypesFilter(invoiceTypesFilter: List<String>) =
                invoiceTypesFilter(JsonField.of(invoiceTypesFilter))

            /**
             * Only supported for invoice_total_reached alerts. A list of invoice types to evaluate.
             */
            fun invoiceTypesFilter(invoiceTypesFilter: JsonField<List<String>>) = apply {
                this.invoiceTypesFilter = invoiceTypesFilter.map { it.toMutableList() }
            }

            /**
             * Only supported for invoice_total_reached alerts. A list of invoice types to evaluate.
             */
            fun addInvoiceTypesFilter(invoiceTypesFilter: String) = apply {
                this.invoiceTypesFilter =
                    (this.invoiceTypesFilter ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(invoiceTypesFilter)
                    }
            }

            /**
             * If provided, will create this alert for this specific plan. To create an alert for
             * all customers, do not specify `customer_id` or `plan_id`.
             */
            fun planId(planId: String) = planId(JsonField.of(planId))

            /**
             * If provided, will create this alert for this specific plan. To create an alert for
             * all customers, do not specify `customer_id` or `plan_id`.
             */
            fun planId(planId: JsonField<String>) = apply { this.planId = planId }

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

            fun build(): AlertCreateBody =
                AlertCreateBody(
                    checkRequired("alertType", alertType),
                    checkRequired("name", name),
                    checkRequired("threshold", threshold),
                    billableMetricId,
                    (creditGrantTypeFilters ?: JsonMissing.of()).map { it.toImmutable() },
                    creditTypeId,
                    (customFieldFilters ?: JsonMissing.of()).map { it.toImmutable() },
                    customerId,
                    evaluateOnCreate,
                    groupKeyFilter,
                    (invoiceTypesFilter ?: JsonMissing.of()).map { it.toImmutable() },
                    planId,
                    uniquenessKey,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AlertCreateBody && alertType == other.alertType && name == other.name && threshold == other.threshold && billableMetricId == other.billableMetricId && creditGrantTypeFilters == other.creditGrantTypeFilters && creditTypeId == other.creditTypeId && customFieldFilters == other.customFieldFilters && customerId == other.customerId && evaluateOnCreate == other.evaluateOnCreate && groupKeyFilter == other.groupKeyFilter && invoiceTypesFilter == other.invoiceTypesFilter && planId == other.planId && uniquenessKey == other.uniquenessKey && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(alertType, name, threshold, billableMetricId, creditGrantTypeFilters, creditTypeId, customFieldFilters, customerId, evaluateOnCreate, groupKeyFilter, invoiceTypesFilter, planId, uniquenessKey, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AlertCreateBody{alertType=$alertType, name=$name, threshold=$threshold, billableMetricId=$billableMetricId, creditGrantTypeFilters=$creditGrantTypeFilters, creditTypeId=$creditTypeId, customFieldFilters=$customFieldFilters, customerId=$customerId, evaluateOnCreate=$evaluateOnCreate, groupKeyFilter=$groupKeyFilter, invoiceTypesFilter=$invoiceTypesFilter, planId=$planId, uniquenessKey=$uniquenessKey, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder internal constructor() {

        private var body: AlertCreateBody.Builder = AlertCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(alertCreateParams: AlertCreateParams) = apply {
            body = alertCreateParams.body.toBuilder()
            additionalHeaders = alertCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = alertCreateParams.additionalQueryParams.toBuilder()
        }

        /** Type of the alert */
        fun alertType(alertType: AlertType) = apply { body.alertType(alertType) }

        /** Type of the alert */
        fun alertType(alertType: JsonField<AlertType>) = apply { body.alertType(alertType) }

        /** Name of the alert */
        fun name(name: String) = apply { body.name(name) }

        /** Name of the alert */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /**
         * Threshold value of the alert policy. Depending upon the alert type, this number may
         * represent a financial amount, the days remaining, or a percentage reached.
         */
        fun threshold(threshold: Double) = apply { body.threshold(threshold) }

        /**
         * Threshold value of the alert policy. Depending upon the alert type, this number may
         * represent a financial amount, the days remaining, or a percentage reached.
         */
        fun threshold(threshold: JsonField<Double>) = apply { body.threshold(threshold) }

        /**
         * For alerts of type `usage_threshold_reached`, specifies which billable metric to track
         * the usage for.
         */
        fun billableMetricId(billableMetricId: String) = apply {
            body.billableMetricId(billableMetricId)
        }

        /**
         * For alerts of type `usage_threshold_reached`, specifies which billable metric to track
         * the usage for.
         */
        fun billableMetricId(billableMetricId: JsonField<String>) = apply {
            body.billableMetricId(billableMetricId)
        }

        /**
         * An array of strings, representing a way to filter the credit grant this alert applies to,
         * by looking at the credit_grant_type field on the credit grant. This field is only defined
         * for CreditPercentage and CreditBalance alerts
         */
        fun creditGrantTypeFilters(creditGrantTypeFilters: List<String>) = apply {
            body.creditGrantTypeFilters(creditGrantTypeFilters)
        }

        /**
         * An array of strings, representing a way to filter the credit grant this alert applies to,
         * by looking at the credit_grant_type field on the credit grant. This field is only defined
         * for CreditPercentage and CreditBalance alerts
         */
        fun creditGrantTypeFilters(creditGrantTypeFilters: JsonField<List<String>>) = apply {
            body.creditGrantTypeFilters(creditGrantTypeFilters)
        }

        /**
         * An array of strings, representing a way to filter the credit grant this alert applies to,
         * by looking at the credit_grant_type field on the credit grant. This field is only defined
         * for CreditPercentage and CreditBalance alerts
         */
        fun addCreditGrantTypeFilter(creditGrantTypeFilter: String) = apply {
            body.addCreditGrantTypeFilter(creditGrantTypeFilter)
        }

        fun creditTypeId(creditTypeId: String) = apply { body.creditTypeId(creditTypeId) }

        fun creditTypeId(creditTypeId: JsonField<String>) = apply {
            body.creditTypeId(creditTypeId)
        }

        /**
         * Only present for beta contract invoices. This field's availability is dependent on your
         * client's configuration. A list of custom field filters for alert types that support
         * advanced filtering
         */
        fun customFieldFilters(customFieldFilters: List<CustomFieldFilter>) = apply {
            body.customFieldFilters(customFieldFilters)
        }

        /**
         * Only present for beta contract invoices. This field's availability is dependent on your
         * client's configuration. A list of custom field filters for alert types that support
         * advanced filtering
         */
        fun customFieldFilters(customFieldFilters: JsonField<List<CustomFieldFilter>>) = apply {
            body.customFieldFilters(customFieldFilters)
        }

        /**
         * Only present for beta contract invoices. This field's availability is dependent on your
         * client's configuration. A list of custom field filters for alert types that support
         * advanced filtering
         */
        fun addCustomFieldFilter(customFieldFilter: CustomFieldFilter) = apply {
            body.addCustomFieldFilter(customFieldFilter)
        }

        /**
         * If provided, will create this alert for this specific customer. To create an alert for
         * all customers, do not specify `customer_id` or `plan_id`.
         */
        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        /**
         * If provided, will create this alert for this specific customer. To create an alert for
         * all customers, do not specify `customer_id` or `plan_id`.
         */
        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        /**
         * If true, the alert will evaluate immediately on customers that already meet the alert
         * threshold. If false, it will only evaluate on future customers that trigger the alert
         * threshold. Defaults to true.
         */
        fun evaluateOnCreate(evaluateOnCreate: Boolean) = apply {
            body.evaluateOnCreate(evaluateOnCreate)
        }

        /**
         * If true, the alert will evaluate immediately on customers that already meet the alert
         * threshold. If false, it will only evaluate on future customers that trigger the alert
         * threshold. Defaults to true.
         */
        fun evaluateOnCreate(evaluateOnCreate: JsonField<Boolean>) = apply {
            body.evaluateOnCreate(evaluateOnCreate)
        }

        /**
         * Scopes alert evaluation to a specific presentation group key on individual line items.
         * Only present for spend alerts.
         */
        fun groupKeyFilter(groupKeyFilter: GroupKeyFilter) = apply {
            body.groupKeyFilter(groupKeyFilter)
        }

        /**
         * Scopes alert evaluation to a specific presentation group key on individual line items.
         * Only present for spend alerts.
         */
        fun groupKeyFilter(groupKeyFilter: JsonField<GroupKeyFilter>) = apply {
            body.groupKeyFilter(groupKeyFilter)
        }

        /** Only supported for invoice_total_reached alerts. A list of invoice types to evaluate. */
        fun invoiceTypesFilter(invoiceTypesFilter: List<String>) = apply {
            body.invoiceTypesFilter(invoiceTypesFilter)
        }

        /** Only supported for invoice_total_reached alerts. A list of invoice types to evaluate. */
        fun invoiceTypesFilter(invoiceTypesFilter: JsonField<List<String>>) = apply {
            body.invoiceTypesFilter(invoiceTypesFilter)
        }

        /** Only supported for invoice_total_reached alerts. A list of invoice types to evaluate. */
        fun addInvoiceTypesFilter(invoiceTypesFilter: String) = apply {
            body.addInvoiceTypesFilter(invoiceTypesFilter)
        }

        /**
         * If provided, will create this alert for this specific plan. To create an alert for all
         * customers, do not specify `customer_id` or `plan_id`.
         */
        fun planId(planId: String) = apply { body.planId(planId) }

        /**
         * If provided, will create this alert for this specific plan. To create an alert for all
         * customers, do not specify `customer_id` or `plan_id`.
         */
        fun planId(planId: JsonField<String>) = apply { body.planId(planId) }

        /**
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
         */
        fun uniquenessKey(uniquenessKey: String) = apply { body.uniquenessKey(uniquenessKey) }

        /**
         * Prevents the creation of duplicates. If a request to create a record is made with a
         * previously used uniqueness key, a new record will not be created and the request will
         * fail with a 409 error.
         */
        fun uniquenessKey(uniquenessKey: JsonField<String>) = apply {
            body.uniquenessKey(uniquenessKey)
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

        fun build(): AlertCreateParams =
            AlertCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** Type of the alert */
    class AlertType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val LOW_CREDIT_BALANCE_REACHED = of("low_credit_balance_reached")

            @JvmField val SPEND_THRESHOLD_REACHED = of("spend_threshold_reached")

            @JvmField
            val MONTHLY_INVOICE_TOTAL_SPEND_THRESHOLD_REACHED =
                of("monthly_invoice_total_spend_threshold_reached")

            @JvmField
            val LOW_REMAINING_DAYS_IN_PLAN_REACHED = of("low_remaining_days_in_plan_reached")

            @JvmField
            val LOW_REMAINING_CREDIT_PERCENTAGE_REACHED =
                of("low_remaining_credit_percentage_reached")

            @JvmField val USAGE_THRESHOLD_REACHED = of("usage_threshold_reached")

            @JvmField
            val LOW_REMAINING_DAYS_FOR_COMMIT_SEGMENT_REACHED =
                of("low_remaining_days_for_commit_segment_reached")

            @JvmField
            val LOW_REMAINING_COMMIT_BALANCE_REACHED = of("low_remaining_commit_balance_reached")

            @JvmField
            val LOW_REMAINING_COMMIT_PERCENTAGE_REACHED =
                of("low_remaining_commit_percentage_reached")

            @JvmField
            val LOW_REMAINING_DAYS_FOR_CONTRACT_CREDIT_SEGMENT_REACHED =
                of("low_remaining_days_for_contract_credit_segment_reached")

            @JvmField
            val LOW_REMAINING_CONTRACT_CREDIT_BALANCE_REACHED =
                of("low_remaining_contract_credit_balance_reached")

            @JvmField
            val LOW_REMAINING_CONTRACT_CREDIT_PERCENTAGE_REACHED =
                of("low_remaining_contract_credit_percentage_reached")

            @JvmField
            val LOW_REMAINING_CONTRACT_CREDIT_AND_COMMIT_BALANCE_REACHED =
                of("low_remaining_contract_credit_and_commit_balance_reached")

            @JvmField val INVOICE_TOTAL_REACHED = of("invoice_total_reached")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AlertType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class CustomFieldFilter
    @JsonCreator
    private constructor(
        @JsonProperty("entity")
        @ExcludeMissing
        private val entity: JsonField<Entity> = JsonMissing.of(),
        @JsonProperty("key") @ExcludeMissing private val key: JsonField<String> = JsonMissing.of(),
        @JsonProperty("value")
        @ExcludeMissing
        private val value: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun entity(): Entity = entity.getRequired("entity")

        fun key(): String = key.getRequired("key")

        fun value(): String = value.getRequired("value")

        @JsonProperty("entity") @ExcludeMissing fun _entity(): JsonField<Entity> = entity

        @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CustomFieldFilter = apply {
            if (validated) {
                return@apply
            }

            entity()
            key()
            value()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var entity: JsonField<Entity>? = null
            private var key: JsonField<String>? = null
            private var value: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customFieldFilter: CustomFieldFilter) = apply {
                entity = customFieldFilter.entity
                key = customFieldFilter.key
                value = customFieldFilter.value
                additionalProperties = customFieldFilter.additionalProperties.toMutableMap()
            }

            fun entity(entity: Entity) = entity(JsonField.of(entity))

            fun entity(entity: JsonField<Entity>) = apply { this.entity = entity }

            fun key(key: String) = key(JsonField.of(key))

            fun key(key: JsonField<String>) = apply { this.key = key }

            fun value(value: String) = value(JsonField.of(value))

            fun value(value: JsonField<String>) = apply { this.value = value }

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

            fun build(): CustomFieldFilter =
                CustomFieldFilter(
                    checkRequired("entity", entity),
                    checkRequired("key", key),
                    checkRequired("value", value),
                    additionalProperties.toImmutable(),
                )
        }

        class Entity
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val CONTRACT = of("Contract")

                @JvmField val COMMIT = of("Commit")

                @JvmField val CONTRACT_CREDIT = of("ContractCredit")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Entity && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomFieldFilter && entity == other.entity && key == other.key && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(entity, key, value, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CustomFieldFilter{entity=$entity, key=$key, value=$value, additionalProperties=$additionalProperties}"
    }

    /**
     * Scopes alert evaluation to a specific presentation group key on individual line items. Only
     * present for spend alerts.
     */
    @NoAutoDetect
    class GroupKeyFilter
    @JsonCreator
    private constructor(
        @JsonProperty("key") @ExcludeMissing private val key: JsonField<String> = JsonMissing.of(),
        @JsonProperty("value")
        @ExcludeMissing
        private val value: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun key(): String = key.getRequired("key")

        fun value(): String = value.getRequired("value")

        @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): GroupKeyFilter = apply {
            if (validated) {
                return@apply
            }

            key()
            value()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder internal constructor() {

            private var key: JsonField<String>? = null
            private var value: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(groupKeyFilter: GroupKeyFilter) = apply {
                key = groupKeyFilter.key
                value = groupKeyFilter.value
                additionalProperties = groupKeyFilter.additionalProperties.toMutableMap()
            }

            fun key(key: String) = key(JsonField.of(key))

            fun key(key: JsonField<String>) = apply { this.key = key }

            fun value(value: String) = value(JsonField.of(value))

            fun value(value: JsonField<String>) = apply { this.value = value }

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

            fun build(): GroupKeyFilter =
                GroupKeyFilter(
                    checkRequired("key", key),
                    checkRequired("value", value),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is GroupKeyFilter && key == other.key && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(key, value, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "GroupKeyFilter{key=$key, value=$value, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AlertCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AlertCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
