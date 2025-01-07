// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class PlanDetail
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("custom_fields")
    @ExcludeMissing
    private val customFields: JsonField<CustomFields> = JsonMissing.of(),
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("credit_grants")
    @ExcludeMissing
    private val creditGrants: JsonField<List<CreditGrant>> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("minimums")
    @ExcludeMissing
    private val minimums: JsonField<List<Minimum>> = JsonMissing.of(),
    @JsonProperty("overage_rates")
    @ExcludeMissing
    private val overageRates: JsonField<List<OverageRate>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    fun customFields(): CustomFields = customFields.getRequired("custom_fields")

    fun name(): String = name.getRequired("name")

    fun creditGrants(): Optional<List<CreditGrant>> =
        Optional.ofNullable(creditGrants.getNullable("credit_grants"))

    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    fun minimums(): Optional<List<Minimum>> = Optional.ofNullable(minimums.getNullable("minimums"))

    fun overageRates(): Optional<List<OverageRate>> =
        Optional.ofNullable(overageRates.getNullable("overage_rates"))

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    @JsonProperty("custom_fields")
    @ExcludeMissing
    fun _customFields(): JsonField<CustomFields> = customFields

    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    @JsonProperty("credit_grants")
    @ExcludeMissing
    fun _creditGrants(): JsonField<List<CreditGrant>> = creditGrants

    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    @JsonProperty("minimums") @ExcludeMissing fun _minimums(): JsonField<List<Minimum>> = minimums

    @JsonProperty("overage_rates")
    @ExcludeMissing
    fun _overageRates(): JsonField<List<OverageRate>> = overageRates

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PlanDetail = apply {
        if (!validated) {
            id()
            customFields().validate()
            name()
            creditGrants().map { it.forEach { it.validate() } }
            description()
            minimums().map { it.forEach { it.validate() } }
            overageRates().map { it.forEach { it.validate() } }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String>? = null
        private var customFields: JsonField<CustomFields>? = null
        private var name: JsonField<String>? = null
        private var creditGrants: JsonField<MutableList<CreditGrant>>? = null
        private var description: JsonField<String> = JsonMissing.of()
        private var minimums: JsonField<MutableList<Minimum>>? = null
        private var overageRates: JsonField<MutableList<OverageRate>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(planDetail: PlanDetail) = apply {
            id = planDetail.id
            customFields = planDetail.customFields
            name = planDetail.name
            creditGrants = planDetail.creditGrants.map { it.toMutableList() }
            description = planDetail.description
            minimums = planDetail.minimums.map { it.toMutableList() }
            overageRates = planDetail.overageRates.map { it.toMutableList() }
            additionalProperties = planDetail.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

        fun customFields(customFields: JsonField<CustomFields>) = apply {
            this.customFields = customFields
        }

        fun name(name: String) = name(JsonField.of(name))

        fun name(name: JsonField<String>) = apply { this.name = name }

        fun creditGrants(creditGrants: List<CreditGrant>) = creditGrants(JsonField.of(creditGrants))

        fun creditGrants(creditGrants: JsonField<List<CreditGrant>>) = apply {
            this.creditGrants = creditGrants.map { it.toMutableList() }
        }

        fun addCreditGrant(creditGrant: CreditGrant) = apply {
            creditGrants =
                (creditGrants ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(creditGrant)
                }
        }

        fun description(description: String) = description(JsonField.of(description))

        fun description(description: JsonField<String>) = apply { this.description = description }

        fun minimums(minimums: List<Minimum>) = minimums(JsonField.of(minimums))

        fun minimums(minimums: JsonField<List<Minimum>>) = apply {
            this.minimums = minimums.map { it.toMutableList() }
        }

        fun addMinimum(minimum: Minimum) = apply {
            minimums =
                (minimums ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(minimum)
                }
        }

        fun overageRates(overageRates: List<OverageRate>) = overageRates(JsonField.of(overageRates))

        fun overageRates(overageRates: JsonField<List<OverageRate>>) = apply {
            this.overageRates = overageRates.map { it.toMutableList() }
        }

        fun addOverageRate(overageRate: OverageRate) = apply {
            overageRates =
                (overageRates ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(overageRate)
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

        fun build(): PlanDetail =
            PlanDetail(
                checkNotNull(id) { "`id` is required but was not set" },
                checkNotNull(customFields) { "`customFields` is required but was not set" },
                checkNotNull(name) { "`name` is required but was not set" },
                (creditGrants ?: JsonMissing.of()).map { it.toImmutable() },
                description,
                (minimums ?: JsonMissing.of()).map { it.toImmutable() },
                (overageRates ?: JsonMissing.of()).map { it.toImmutable() },
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

        private var validated: Boolean = false

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
    class CreditGrant
    @JsonCreator
    private constructor(
        @JsonProperty("amount_granted")
        @ExcludeMissing
        private val amountGranted: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("amount_granted_credit_type")
        @ExcludeMissing
        private val amountGrantedCreditType: JsonField<CreditTypeData> = JsonMissing.of(),
        @JsonProperty("amount_paid")
        @ExcludeMissing
        private val amountPaid: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("amount_paid_credit_type")
        @ExcludeMissing
        private val amountPaidCreditType: JsonField<CreditTypeData> = JsonMissing.of(),
        @JsonProperty("effective_duration")
        @ExcludeMissing
        private val effectiveDuration: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("priority")
        @ExcludeMissing
        private val priority: JsonField<String> = JsonMissing.of(),
        @JsonProperty("send_invoice")
        @ExcludeMissing
        private val sendInvoice: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("reason")
        @ExcludeMissing
        private val reason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("recurrence_duration")
        @ExcludeMissing
        private val recurrenceDuration: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("recurrence_interval")
        @ExcludeMissing
        private val recurrenceInterval: JsonField<Double> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun amountGranted(): Double = amountGranted.getRequired("amount_granted")

        fun amountGrantedCreditType(): CreditTypeData =
            amountGrantedCreditType.getRequired("amount_granted_credit_type")

        fun amountPaid(): Double = amountPaid.getRequired("amount_paid")

        fun amountPaidCreditType(): CreditTypeData =
            amountPaidCreditType.getRequired("amount_paid_credit_type")

        fun effectiveDuration(): Double = effectiveDuration.getRequired("effective_duration")

        fun name(): String = name.getRequired("name")

        fun priority(): String = priority.getRequired("priority")

        fun sendInvoice(): Boolean = sendInvoice.getRequired("send_invoice")

        fun reason(): Optional<String> = Optional.ofNullable(reason.getNullable("reason"))

        fun recurrenceDuration(): Optional<Double> =
            Optional.ofNullable(recurrenceDuration.getNullable("recurrence_duration"))

        fun recurrenceInterval(): Optional<Double> =
            Optional.ofNullable(recurrenceInterval.getNullable("recurrence_interval"))

        @JsonProperty("amount_granted")
        @ExcludeMissing
        fun _amountGranted(): JsonField<Double> = amountGranted

        @JsonProperty("amount_granted_credit_type")
        @ExcludeMissing
        fun _amountGrantedCreditType(): JsonField<CreditTypeData> = amountGrantedCreditType

        @JsonProperty("amount_paid")
        @ExcludeMissing
        fun _amountPaid(): JsonField<Double> = amountPaid

        @JsonProperty("amount_paid_credit_type")
        @ExcludeMissing
        fun _amountPaidCreditType(): JsonField<CreditTypeData> = amountPaidCreditType

        @JsonProperty("effective_duration")
        @ExcludeMissing
        fun _effectiveDuration(): JsonField<Double> = effectiveDuration

        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<String> = priority

        @JsonProperty("send_invoice")
        @ExcludeMissing
        fun _sendInvoice(): JsonField<Boolean> = sendInvoice

        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

        @JsonProperty("recurrence_duration")
        @ExcludeMissing
        fun _recurrenceDuration(): JsonField<Double> = recurrenceDuration

        @JsonProperty("recurrence_interval")
        @ExcludeMissing
        fun _recurrenceInterval(): JsonField<Double> = recurrenceInterval

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CreditGrant = apply {
            if (!validated) {
                amountGranted()
                amountGrantedCreditType().validate()
                amountPaid()
                amountPaidCreditType().validate()
                effectiveDuration()
                name()
                priority()
                sendInvoice()
                reason()
                recurrenceDuration()
                recurrenceInterval()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amountGranted: JsonField<Double>? = null
            private var amountGrantedCreditType: JsonField<CreditTypeData>? = null
            private var amountPaid: JsonField<Double>? = null
            private var amountPaidCreditType: JsonField<CreditTypeData>? = null
            private var effectiveDuration: JsonField<Double>? = null
            private var name: JsonField<String>? = null
            private var priority: JsonField<String>? = null
            private var sendInvoice: JsonField<Boolean>? = null
            private var reason: JsonField<String> = JsonMissing.of()
            private var recurrenceDuration: JsonField<Double> = JsonMissing.of()
            private var recurrenceInterval: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(creditGrant: CreditGrant) = apply {
                amountGranted = creditGrant.amountGranted
                amountGrantedCreditType = creditGrant.amountGrantedCreditType
                amountPaid = creditGrant.amountPaid
                amountPaidCreditType = creditGrant.amountPaidCreditType
                effectiveDuration = creditGrant.effectiveDuration
                name = creditGrant.name
                priority = creditGrant.priority
                sendInvoice = creditGrant.sendInvoice
                reason = creditGrant.reason
                recurrenceDuration = creditGrant.recurrenceDuration
                recurrenceInterval = creditGrant.recurrenceInterval
                additionalProperties = creditGrant.additionalProperties.toMutableMap()
            }

            fun amountGranted(amountGranted: Double) = amountGranted(JsonField.of(amountGranted))

            fun amountGranted(amountGranted: JsonField<Double>) = apply {
                this.amountGranted = amountGranted
            }

            fun amountGrantedCreditType(amountGrantedCreditType: CreditTypeData) =
                amountGrantedCreditType(JsonField.of(amountGrantedCreditType))

            fun amountGrantedCreditType(amountGrantedCreditType: JsonField<CreditTypeData>) =
                apply {
                    this.amountGrantedCreditType = amountGrantedCreditType
                }

            fun amountPaid(amountPaid: Double) = amountPaid(JsonField.of(amountPaid))

            fun amountPaid(amountPaid: JsonField<Double>) = apply { this.amountPaid = amountPaid }

            fun amountPaidCreditType(amountPaidCreditType: CreditTypeData) =
                amountPaidCreditType(JsonField.of(amountPaidCreditType))

            fun amountPaidCreditType(amountPaidCreditType: JsonField<CreditTypeData>) = apply {
                this.amountPaidCreditType = amountPaidCreditType
            }

            fun effectiveDuration(effectiveDuration: Double) =
                effectiveDuration(JsonField.of(effectiveDuration))

            fun effectiveDuration(effectiveDuration: JsonField<Double>) = apply {
                this.effectiveDuration = effectiveDuration
            }

            fun name(name: String) = name(JsonField.of(name))

            fun name(name: JsonField<String>) = apply { this.name = name }

            fun priority(priority: String) = priority(JsonField.of(priority))

            fun priority(priority: JsonField<String>) = apply { this.priority = priority }

            fun sendInvoice(sendInvoice: Boolean) = sendInvoice(JsonField.of(sendInvoice))

            fun sendInvoice(sendInvoice: JsonField<Boolean>) = apply {
                this.sendInvoice = sendInvoice
            }

            fun reason(reason: String) = reason(JsonField.of(reason))

            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

            fun recurrenceDuration(recurrenceDuration: Double) =
                recurrenceDuration(JsonField.of(recurrenceDuration))

            fun recurrenceDuration(recurrenceDuration: JsonField<Double>) = apply {
                this.recurrenceDuration = recurrenceDuration
            }

            fun recurrenceInterval(recurrenceInterval: Double) =
                recurrenceInterval(JsonField.of(recurrenceInterval))

            fun recurrenceInterval(recurrenceInterval: JsonField<Double>) = apply {
                this.recurrenceInterval = recurrenceInterval
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

            fun build(): CreditGrant =
                CreditGrant(
                    checkNotNull(amountGranted) { "`amountGranted` is required but was not set" },
                    checkNotNull(amountGrantedCreditType) {
                        "`amountGrantedCreditType` is required but was not set"
                    },
                    checkNotNull(amountPaid) { "`amountPaid` is required but was not set" },
                    checkNotNull(amountPaidCreditType) {
                        "`amountPaidCreditType` is required but was not set"
                    },
                    checkNotNull(effectiveDuration) {
                        "`effectiveDuration` is required but was not set"
                    },
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(priority) { "`priority` is required but was not set" },
                    checkNotNull(sendInvoice) { "`sendInvoice` is required but was not set" },
                    reason,
                    recurrenceDuration,
                    recurrenceInterval,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CreditGrant && amountGranted == other.amountGranted && amountGrantedCreditType == other.amountGrantedCreditType && amountPaid == other.amountPaid && amountPaidCreditType == other.amountPaidCreditType && effectiveDuration == other.effectiveDuration && name == other.name && priority == other.priority && sendInvoice == other.sendInvoice && reason == other.reason && recurrenceDuration == other.recurrenceDuration && recurrenceInterval == other.recurrenceInterval && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amountGranted, amountGrantedCreditType, amountPaid, amountPaidCreditType, effectiveDuration, name, priority, sendInvoice, reason, recurrenceDuration, recurrenceInterval, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreditGrant{amountGranted=$amountGranted, amountGrantedCreditType=$amountGrantedCreditType, amountPaid=$amountPaid, amountPaidCreditType=$amountPaidCreditType, effectiveDuration=$effectiveDuration, name=$name, priority=$priority, sendInvoice=$sendInvoice, reason=$reason, recurrenceDuration=$recurrenceDuration, recurrenceInterval=$recurrenceInterval, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Minimum
    @JsonCreator
    private constructor(
        @JsonProperty("credit_type")
        @ExcludeMissing
        private val creditType: JsonField<CreditTypeData> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("start_period")
        @ExcludeMissing
        private val startPeriod: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("value")
        @ExcludeMissing
        private val value: JsonField<Double> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun creditType(): CreditTypeData = creditType.getRequired("credit_type")

        fun name(): String = name.getRequired("name")

        /**
         * Used in price ramps. Indicates how many billing periods pass before the charge applies.
         */
        fun startPeriod(): Double = startPeriod.getRequired("start_period")

        fun value(): Double = value.getRequired("value")

        @JsonProperty("credit_type")
        @ExcludeMissing
        fun _creditType(): JsonField<CreditTypeData> = creditType

        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Used in price ramps. Indicates how many billing periods pass before the charge applies.
         */
        @JsonProperty("start_period")
        @ExcludeMissing
        fun _startPeriod(): JsonField<Double> = startPeriod

        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Double> = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Minimum = apply {
            if (!validated) {
                creditType().validate()
                name()
                startPeriod()
                value()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var creditType: JsonField<CreditTypeData>? = null
            private var name: JsonField<String>? = null
            private var startPeriod: JsonField<Double>? = null
            private var value: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(minimum: Minimum) = apply {
                creditType = minimum.creditType
                name = minimum.name
                startPeriod = minimum.startPeriod
                value = minimum.value
                additionalProperties = minimum.additionalProperties.toMutableMap()
            }

            fun creditType(creditType: CreditTypeData) = creditType(JsonField.of(creditType))

            fun creditType(creditType: JsonField<CreditTypeData>) = apply {
                this.creditType = creditType
            }

            fun name(name: String) = name(JsonField.of(name))

            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * Used in price ramps. Indicates how many billing periods pass before the charge
             * applies.
             */
            fun startPeriod(startPeriod: Double) = startPeriod(JsonField.of(startPeriod))

            /**
             * Used in price ramps. Indicates how many billing periods pass before the charge
             * applies.
             */
            fun startPeriod(startPeriod: JsonField<Double>) = apply {
                this.startPeriod = startPeriod
            }

            fun value(value: Double) = value(JsonField.of(value))

            fun value(value: JsonField<Double>) = apply { this.value = value }

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

            fun build(): Minimum =
                Minimum(
                    checkNotNull(creditType) { "`creditType` is required but was not set" },
                    checkNotNull(name) { "`name` is required but was not set" },
                    checkNotNull(startPeriod) { "`startPeriod` is required but was not set" },
                    checkNotNull(value) { "`value` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Minimum && creditType == other.creditType && name == other.name && startPeriod == other.startPeriod && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(creditType, name, startPeriod, value, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Minimum{creditType=$creditType, name=$name, startPeriod=$startPeriod, value=$value, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class OverageRate
    @JsonCreator
    private constructor(
        @JsonProperty("credit_type")
        @ExcludeMissing
        private val creditType: JsonField<CreditTypeData> = JsonMissing.of(),
        @JsonProperty("fiat_credit_type")
        @ExcludeMissing
        private val fiatCreditType: JsonField<CreditTypeData> = JsonMissing.of(),
        @JsonProperty("start_period")
        @ExcludeMissing
        private val startPeriod: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("to_fiat_conversion_factor")
        @ExcludeMissing
        private val toFiatConversionFactor: JsonField<Double> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun creditType(): CreditTypeData = creditType.getRequired("credit_type")

        fun fiatCreditType(): CreditTypeData = fiatCreditType.getRequired("fiat_credit_type")

        /**
         * Used in price ramps. Indicates how many billing periods pass before the charge applies.
         */
        fun startPeriod(): Double = startPeriod.getRequired("start_period")

        fun toFiatConversionFactor(): Double =
            toFiatConversionFactor.getRequired("to_fiat_conversion_factor")

        @JsonProperty("credit_type")
        @ExcludeMissing
        fun _creditType(): JsonField<CreditTypeData> = creditType

        @JsonProperty("fiat_credit_type")
        @ExcludeMissing
        fun _fiatCreditType(): JsonField<CreditTypeData> = fiatCreditType

        /**
         * Used in price ramps. Indicates how many billing periods pass before the charge applies.
         */
        @JsonProperty("start_period")
        @ExcludeMissing
        fun _startPeriod(): JsonField<Double> = startPeriod

        @JsonProperty("to_fiat_conversion_factor")
        @ExcludeMissing
        fun _toFiatConversionFactor(): JsonField<Double> = toFiatConversionFactor

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): OverageRate = apply {
            if (!validated) {
                creditType().validate()
                fiatCreditType().validate()
                startPeriod()
                toFiatConversionFactor()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var creditType: JsonField<CreditTypeData>? = null
            private var fiatCreditType: JsonField<CreditTypeData>? = null
            private var startPeriod: JsonField<Double>? = null
            private var toFiatConversionFactor: JsonField<Double>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(overageRate: OverageRate) = apply {
                creditType = overageRate.creditType
                fiatCreditType = overageRate.fiatCreditType
                startPeriod = overageRate.startPeriod
                toFiatConversionFactor = overageRate.toFiatConversionFactor
                additionalProperties = overageRate.additionalProperties.toMutableMap()
            }

            fun creditType(creditType: CreditTypeData) = creditType(JsonField.of(creditType))

            fun creditType(creditType: JsonField<CreditTypeData>) = apply {
                this.creditType = creditType
            }

            fun fiatCreditType(fiatCreditType: CreditTypeData) =
                fiatCreditType(JsonField.of(fiatCreditType))

            fun fiatCreditType(fiatCreditType: JsonField<CreditTypeData>) = apply {
                this.fiatCreditType = fiatCreditType
            }

            /**
             * Used in price ramps. Indicates how many billing periods pass before the charge
             * applies.
             */
            fun startPeriod(startPeriod: Double) = startPeriod(JsonField.of(startPeriod))

            /**
             * Used in price ramps. Indicates how many billing periods pass before the charge
             * applies.
             */
            fun startPeriod(startPeriod: JsonField<Double>) = apply {
                this.startPeriod = startPeriod
            }

            fun toFiatConversionFactor(toFiatConversionFactor: Double) =
                toFiatConversionFactor(JsonField.of(toFiatConversionFactor))

            fun toFiatConversionFactor(toFiatConversionFactor: JsonField<Double>) = apply {
                this.toFiatConversionFactor = toFiatConversionFactor
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

            fun build(): OverageRate =
                OverageRate(
                    checkNotNull(creditType) { "`creditType` is required but was not set" },
                    checkNotNull(fiatCreditType) { "`fiatCreditType` is required but was not set" },
                    checkNotNull(startPeriod) { "`startPeriod` is required but was not set" },
                    checkNotNull(toFiatConversionFactor) {
                        "`toFiatConversionFactor` is required but was not set"
                    },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is OverageRate && creditType == other.creditType && fiatCreditType == other.fiatCreditType && startPeriod == other.startPeriod && toFiatConversionFactor == other.toFiatConversionFactor && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(creditType, fiatCreditType, startPeriod, toFiatConversionFactor, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OverageRate{creditType=$creditType, fiatCreditType=$fiatCreditType, startPeriod=$startPeriod, toFiatConversionFactor=$toFiatConversionFactor, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PlanDetail && id == other.id && customFields == other.customFields && name == other.name && creditGrants == other.creditGrants && description == other.description && minimums == other.minimums && overageRates == other.overageRates && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, customFields, name, creditGrants, description, minimums, overageRates, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PlanDetail{id=$id, customFields=$customFields, name=$name, creditGrants=$creditGrants, description=$description, minimums=$minimums, overageRates=$overageRates, additionalProperties=$additionalProperties}"
}
