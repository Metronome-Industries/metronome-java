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
    @JsonProperty("name") @ExcludeMissing private val name: JsonField<String> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("minimums")
    @ExcludeMissing
    private val minimums: JsonField<List<Minimum>> = JsonMissing.of(),
    @JsonProperty("overage_rates")
    @ExcludeMissing
    private val overageRates: JsonField<List<OverageRate>> = JsonMissing.of(),
    @JsonProperty("credit_grants")
    @ExcludeMissing
    private val creditGrants: JsonField<List<CreditGrant>> = JsonMissing.of(),
    @JsonProperty("custom_fields")
    @ExcludeMissing
    private val customFields: JsonField<CustomFields> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    fun name(): String = name.getRequired("name")

    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    fun minimums(): Optional<List<Minimum>> = Optional.ofNullable(minimums.getNullable("minimums"))

    fun overageRates(): Optional<List<OverageRate>> =
        Optional.ofNullable(overageRates.getNullable("overage_rates"))

    fun creditGrants(): Optional<List<CreditGrant>> =
        Optional.ofNullable(creditGrants.getNullable("credit_grants"))

    fun customFields(): CustomFields = customFields.getRequired("custom_fields")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("name") @ExcludeMissing fun _name() = name

    @JsonProperty("description") @ExcludeMissing fun _description() = description

    @JsonProperty("minimums") @ExcludeMissing fun _minimums() = minimums

    @JsonProperty("overage_rates") @ExcludeMissing fun _overageRates() = overageRates

    @JsonProperty("credit_grants") @ExcludeMissing fun _creditGrants() = creditGrants

    @JsonProperty("custom_fields") @ExcludeMissing fun _customFields() = customFields

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PlanDetail = apply {
        if (!validated) {
            id()
            name()
            description()
            minimums().map { it.forEach { it.validate() } }
            overageRates().map { it.forEach { it.validate() } }
            creditGrants().map { it.forEach { it.validate() } }
            customFields().validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var minimums: JsonField<List<Minimum>> = JsonMissing.of()
        private var overageRates: JsonField<List<OverageRate>> = JsonMissing.of()
        private var creditGrants: JsonField<List<CreditGrant>> = JsonMissing.of()
        private var customFields: JsonField<CustomFields> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(planDetail: PlanDetail) = apply {
            id = planDetail.id
            name = planDetail.name
            description = planDetail.description
            minimums = planDetail.minimums
            overageRates = planDetail.overageRates
            creditGrants = planDetail.creditGrants
            customFields = planDetail.customFields
            additionalProperties = planDetail.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun name(name: String) = name(JsonField.of(name))

        fun name(name: JsonField<String>) = apply { this.name = name }

        fun description(description: String) = description(JsonField.of(description))

        fun description(description: JsonField<String>) = apply { this.description = description }

        fun minimums(minimums: List<Minimum>) = minimums(JsonField.of(minimums))

        fun minimums(minimums: JsonField<List<Minimum>>) = apply { this.minimums = minimums }

        fun overageRates(overageRates: List<OverageRate>) = overageRates(JsonField.of(overageRates))

        fun overageRates(overageRates: JsonField<List<OverageRate>>) = apply {
            this.overageRates = overageRates
        }

        fun creditGrants(creditGrants: List<CreditGrant>) = creditGrants(JsonField.of(creditGrants))

        fun creditGrants(creditGrants: JsonField<List<CreditGrant>>) = apply {
            this.creditGrants = creditGrants
        }

        fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

        fun customFields(customFields: JsonField<CustomFields>) = apply {
            this.customFields = customFields
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
                id,
                name,
                description,
                minimums.map { it.toImmutable() },
                overageRates.map { it.toImmutable() },
                creditGrants.map { it.toImmutable() },
                customFields,
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
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount_granted")
        @ExcludeMissing
        private val amountGranted: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("amount_paid")
        @ExcludeMissing
        private val amountPaid: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("effective_duration")
        @ExcludeMissing
        private val effectiveDuration: JsonField<Double> = JsonMissing.of(),
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
        @JsonProperty("amount_paid_credit_type")
        @ExcludeMissing
        private val amountPaidCreditType: JsonField<CreditTypeData> = JsonMissing.of(),
        @JsonProperty("amount_granted_credit_type")
        @ExcludeMissing
        private val amountGrantedCreditType: JsonField<CreditTypeData> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun name(): String = name.getRequired("name")

        fun amountGranted(): Double = amountGranted.getRequired("amount_granted")

        fun amountPaid(): Double = amountPaid.getRequired("amount_paid")

        fun effectiveDuration(): Double = effectiveDuration.getRequired("effective_duration")

        fun priority(): String = priority.getRequired("priority")

        fun sendInvoice(): Boolean = sendInvoice.getRequired("send_invoice")

        fun reason(): Optional<String> = Optional.ofNullable(reason.getNullable("reason"))

        fun recurrenceDuration(): Optional<Double> =
            Optional.ofNullable(recurrenceDuration.getNullable("recurrence_duration"))

        fun recurrenceInterval(): Optional<Double> =
            Optional.ofNullable(recurrenceInterval.getNullable("recurrence_interval"))

        fun amountPaidCreditType(): CreditTypeData =
            amountPaidCreditType.getRequired("amount_paid_credit_type")

        fun amountGrantedCreditType(): CreditTypeData =
            amountGrantedCreditType.getRequired("amount_granted_credit_type")

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonProperty("amount_granted") @ExcludeMissing fun _amountGranted() = amountGranted

        @JsonProperty("amount_paid") @ExcludeMissing fun _amountPaid() = amountPaid

        @JsonProperty("effective_duration")
        @ExcludeMissing
        fun _effectiveDuration() = effectiveDuration

        @JsonProperty("priority") @ExcludeMissing fun _priority() = priority

        @JsonProperty("send_invoice") @ExcludeMissing fun _sendInvoice() = sendInvoice

        @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

        @JsonProperty("recurrence_duration")
        @ExcludeMissing
        fun _recurrenceDuration() = recurrenceDuration

        @JsonProperty("recurrence_interval")
        @ExcludeMissing
        fun _recurrenceInterval() = recurrenceInterval

        @JsonProperty("amount_paid_credit_type")
        @ExcludeMissing
        fun _amountPaidCreditType() = amountPaidCreditType

        @JsonProperty("amount_granted_credit_type")
        @ExcludeMissing
        fun _amountGrantedCreditType() = amountGrantedCreditType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CreditGrant = apply {
            if (!validated) {
                name()
                amountGranted()
                amountPaid()
                effectiveDuration()
                priority()
                sendInvoice()
                reason()
                recurrenceDuration()
                recurrenceInterval()
                amountPaidCreditType().validate()
                amountGrantedCreditType().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: JsonField<String> = JsonMissing.of()
            private var amountGranted: JsonField<Double> = JsonMissing.of()
            private var amountPaid: JsonField<Double> = JsonMissing.of()
            private var effectiveDuration: JsonField<Double> = JsonMissing.of()
            private var priority: JsonField<String> = JsonMissing.of()
            private var sendInvoice: JsonField<Boolean> = JsonMissing.of()
            private var reason: JsonField<String> = JsonMissing.of()
            private var recurrenceDuration: JsonField<Double> = JsonMissing.of()
            private var recurrenceInterval: JsonField<Double> = JsonMissing.of()
            private var amountPaidCreditType: JsonField<CreditTypeData> = JsonMissing.of()
            private var amountGrantedCreditType: JsonField<CreditTypeData> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(creditGrant: CreditGrant) = apply {
                name = creditGrant.name
                amountGranted = creditGrant.amountGranted
                amountPaid = creditGrant.amountPaid
                effectiveDuration = creditGrant.effectiveDuration
                priority = creditGrant.priority
                sendInvoice = creditGrant.sendInvoice
                reason = creditGrant.reason
                recurrenceDuration = creditGrant.recurrenceDuration
                recurrenceInterval = creditGrant.recurrenceInterval
                amountPaidCreditType = creditGrant.amountPaidCreditType
                amountGrantedCreditType = creditGrant.amountGrantedCreditType
                additionalProperties = creditGrant.additionalProperties.toMutableMap()
            }

            fun name(name: String) = name(JsonField.of(name))

            fun name(name: JsonField<String>) = apply { this.name = name }

            fun amountGranted(amountGranted: Double) = amountGranted(JsonField.of(amountGranted))

            fun amountGranted(amountGranted: JsonField<Double>) = apply {
                this.amountGranted = amountGranted
            }

            fun amountPaid(amountPaid: Double) = amountPaid(JsonField.of(amountPaid))

            fun amountPaid(amountPaid: JsonField<Double>) = apply { this.amountPaid = amountPaid }

            fun effectiveDuration(effectiveDuration: Double) =
                effectiveDuration(JsonField.of(effectiveDuration))

            fun effectiveDuration(effectiveDuration: JsonField<Double>) = apply {
                this.effectiveDuration = effectiveDuration
            }

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

            fun amountPaidCreditType(amountPaidCreditType: CreditTypeData) =
                amountPaidCreditType(JsonField.of(amountPaidCreditType))

            fun amountPaidCreditType(amountPaidCreditType: JsonField<CreditTypeData>) = apply {
                this.amountPaidCreditType = amountPaidCreditType
            }

            fun amountGrantedCreditType(amountGrantedCreditType: CreditTypeData) =
                amountGrantedCreditType(JsonField.of(amountGrantedCreditType))

            fun amountGrantedCreditType(amountGrantedCreditType: JsonField<CreditTypeData>) =
                apply {
                    this.amountGrantedCreditType = amountGrantedCreditType
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
                    name,
                    amountGranted,
                    amountPaid,
                    effectiveDuration,
                    priority,
                    sendInvoice,
                    reason,
                    recurrenceDuration,
                    recurrenceInterval,
                    amountPaidCreditType,
                    amountGrantedCreditType,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CreditGrant && name == other.name && amountGranted == other.amountGranted && amountPaid == other.amountPaid && effectiveDuration == other.effectiveDuration && priority == other.priority && sendInvoice == other.sendInvoice && reason == other.reason && recurrenceDuration == other.recurrenceDuration && recurrenceInterval == other.recurrenceInterval && amountPaidCreditType == other.amountPaidCreditType && amountGrantedCreditType == other.amountGrantedCreditType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, amountGranted, amountPaid, effectiveDuration, priority, sendInvoice, reason, recurrenceDuration, recurrenceInterval, amountPaidCreditType, amountGrantedCreditType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreditGrant{name=$name, amountGranted=$amountGranted, amountPaid=$amountPaid, effectiveDuration=$effectiveDuration, priority=$priority, sendInvoice=$sendInvoice, reason=$reason, recurrenceDuration=$recurrenceDuration, recurrenceInterval=$recurrenceInterval, amountPaidCreditType=$amountPaidCreditType, amountGrantedCreditType=$amountGrantedCreditType, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Minimum
    @JsonCreator
    private constructor(
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("value")
        @ExcludeMissing
        private val value: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("start_period")
        @ExcludeMissing
        private val startPeriod: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("credit_type")
        @ExcludeMissing
        private val creditType: JsonField<CreditTypeData> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun name(): String = name.getRequired("name")

        fun value(): Double = value.getRequired("value")

        /**
         * Used in price ramps. Indicates how many billing periods pass before the charge applies.
         */
        fun startPeriod(): Double = startPeriod.getRequired("start_period")

        fun creditType(): CreditTypeData = creditType.getRequired("credit_type")

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonProperty("value") @ExcludeMissing fun _value() = value

        /**
         * Used in price ramps. Indicates how many billing periods pass before the charge applies.
         */
        @JsonProperty("start_period") @ExcludeMissing fun _startPeriod() = startPeriod

        @JsonProperty("credit_type") @ExcludeMissing fun _creditType() = creditType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Minimum = apply {
            if (!validated) {
                name()
                value()
                startPeriod()
                creditType().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: JsonField<String> = JsonMissing.of()
            private var value: JsonField<Double> = JsonMissing.of()
            private var startPeriod: JsonField<Double> = JsonMissing.of()
            private var creditType: JsonField<CreditTypeData> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(minimum: Minimum) = apply {
                name = minimum.name
                value = minimum.value
                startPeriod = minimum.startPeriod
                creditType = minimum.creditType
                additionalProperties = minimum.additionalProperties.toMutableMap()
            }

            fun name(name: String) = name(JsonField.of(name))

            fun name(name: JsonField<String>) = apply { this.name = name }

            fun value(value: Double) = value(JsonField.of(value))

            fun value(value: JsonField<Double>) = apply { this.value = value }

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

            fun creditType(creditType: CreditTypeData) = creditType(JsonField.of(creditType))

            fun creditType(creditType: JsonField<CreditTypeData>) = apply {
                this.creditType = creditType
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

            fun build(): Minimum =
                Minimum(
                    name,
                    value,
                    startPeriod,
                    creditType,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Minimum && name == other.name && value == other.value && startPeriod == other.startPeriod && creditType == other.creditType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, value, startPeriod, creditType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Minimum{name=$name, value=$value, startPeriod=$startPeriod, creditType=$creditType, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class OverageRate
    @JsonCreator
    private constructor(
        @JsonProperty("to_fiat_conversion_factor")
        @ExcludeMissing
        private val toFiatConversionFactor: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("start_period")
        @ExcludeMissing
        private val startPeriod: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("fiat_credit_type")
        @ExcludeMissing
        private val fiatCreditType: JsonField<CreditTypeData> = JsonMissing.of(),
        @JsonProperty("credit_type")
        @ExcludeMissing
        private val creditType: JsonField<CreditTypeData> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun toFiatConversionFactor(): Double =
            toFiatConversionFactor.getRequired("to_fiat_conversion_factor")

        /**
         * Used in price ramps. Indicates how many billing periods pass before the charge applies.
         */
        fun startPeriod(): Double = startPeriod.getRequired("start_period")

        fun fiatCreditType(): CreditTypeData = fiatCreditType.getRequired("fiat_credit_type")

        fun creditType(): CreditTypeData = creditType.getRequired("credit_type")

        @JsonProperty("to_fiat_conversion_factor")
        @ExcludeMissing
        fun _toFiatConversionFactor() = toFiatConversionFactor

        /**
         * Used in price ramps. Indicates how many billing periods pass before the charge applies.
         */
        @JsonProperty("start_period") @ExcludeMissing fun _startPeriod() = startPeriod

        @JsonProperty("fiat_credit_type") @ExcludeMissing fun _fiatCreditType() = fiatCreditType

        @JsonProperty("credit_type") @ExcludeMissing fun _creditType() = creditType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): OverageRate = apply {
            if (!validated) {
                toFiatConversionFactor()
                startPeriod()
                fiatCreditType().validate()
                creditType().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var toFiatConversionFactor: JsonField<Double> = JsonMissing.of()
            private var startPeriod: JsonField<Double> = JsonMissing.of()
            private var fiatCreditType: JsonField<CreditTypeData> = JsonMissing.of()
            private var creditType: JsonField<CreditTypeData> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(overageRate: OverageRate) = apply {
                toFiatConversionFactor = overageRate.toFiatConversionFactor
                startPeriod = overageRate.startPeriod
                fiatCreditType = overageRate.fiatCreditType
                creditType = overageRate.creditType
                additionalProperties = overageRate.additionalProperties.toMutableMap()
            }

            fun toFiatConversionFactor(toFiatConversionFactor: Double) =
                toFiatConversionFactor(JsonField.of(toFiatConversionFactor))

            fun toFiatConversionFactor(toFiatConversionFactor: JsonField<Double>) = apply {
                this.toFiatConversionFactor = toFiatConversionFactor
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

            fun fiatCreditType(fiatCreditType: CreditTypeData) =
                fiatCreditType(JsonField.of(fiatCreditType))

            fun fiatCreditType(fiatCreditType: JsonField<CreditTypeData>) = apply {
                this.fiatCreditType = fiatCreditType
            }

            fun creditType(creditType: CreditTypeData) = creditType(JsonField.of(creditType))

            fun creditType(creditType: JsonField<CreditTypeData>) = apply {
                this.creditType = creditType
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
                    toFiatConversionFactor,
                    startPeriod,
                    fiatCreditType,
                    creditType,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is OverageRate && toFiatConversionFactor == other.toFiatConversionFactor && startPeriod == other.startPeriod && fiatCreditType == other.fiatCreditType && creditType == other.creditType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(toFiatConversionFactor, startPeriod, fiatCreditType, creditType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OverageRate{toFiatConversionFactor=$toFiatConversionFactor, startPeriod=$startPeriod, fiatCreditType=$fiatCreditType, creditType=$creditType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PlanDetail && id == other.id && name == other.name && description == other.description && minimums == other.minimums && overageRates == other.overageRates && creditGrants == other.creditGrants && customFields == other.customFields && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, name, description, minimums, overageRates, creditGrants, customFields, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PlanDetail{id=$id, name=$name, description=$description, minimums=$minimums, overageRates=$overageRates, creditGrants=$creditGrants, customFields=$customFields, additionalProperties=$additionalProperties}"
}
