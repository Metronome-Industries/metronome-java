// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.toImmutable
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = PlanDetail.Builder::class)
@NoAutoDetect
class PlanDetail
private constructor(
    private val id: JsonField<String>,
    private val name: JsonField<String>,
    private val description: JsonField<String>,
    private val minimums: JsonField<List<Minimum>>,
    private val overageRates: JsonField<List<OverageRate>>,
    private val creditGrants: JsonField<List<CreditGrant>>,
    private val customFields: JsonField<CustomFields>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

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
            this.id = planDetail.id
            this.name = planDetail.name
            this.description = planDetail.description
            this.minimums = planDetail.minimums
            this.overageRates = planDetail.overageRates
            this.creditGrants = planDetail.creditGrants
            this.customFields = planDetail.customFields
            additionalProperties(planDetail.additionalProperties)
        }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        fun name(name: String) = name(JsonField.of(name))

        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun description(description: String) = description(JsonField.of(description))

        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun minimums(minimums: List<Minimum>) = minimums(JsonField.of(minimums))

        @JsonProperty("minimums")
        @ExcludeMissing
        fun minimums(minimums: JsonField<List<Minimum>>) = apply { this.minimums = minimums }

        fun overageRates(overageRates: List<OverageRate>) = overageRates(JsonField.of(overageRates))

        @JsonProperty("overage_rates")
        @ExcludeMissing
        fun overageRates(overageRates: JsonField<List<OverageRate>>) = apply {
            this.overageRates = overageRates
        }

        fun creditGrants(creditGrants: List<CreditGrant>) = creditGrants(JsonField.of(creditGrants))

        @JsonProperty("credit_grants")
        @ExcludeMissing
        fun creditGrants(creditGrants: JsonField<List<CreditGrant>>) = apply {
            this.creditGrants = creditGrants
        }

        fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun customFields(customFields: JsonField<CustomFields>) = apply {
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

    @JsonDeserialize(builder = CreditGrant.Builder::class)
    @NoAutoDetect
    class CreditGrant
    private constructor(
        private val name: JsonField<String>,
        private val amountGranted: JsonField<Double>,
        private val amountPaid: JsonField<Double>,
        private val effectiveDuration: JsonField<Double>,
        private val priority: JsonField<String>,
        private val sendInvoice: JsonField<Boolean>,
        private val reason: JsonField<String>,
        private val recurrenceDuration: JsonField<Double>,
        private val recurrenceInterval: JsonField<Double>,
        private val amountPaidCreditType: JsonField<CreditTypeData>,
        private val amountGrantedCreditType: JsonField<CreditTypeData>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

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
                this.name = creditGrant.name
                this.amountGranted = creditGrant.amountGranted
                this.amountPaid = creditGrant.amountPaid
                this.effectiveDuration = creditGrant.effectiveDuration
                this.priority = creditGrant.priority
                this.sendInvoice = creditGrant.sendInvoice
                this.reason = creditGrant.reason
                this.recurrenceDuration = creditGrant.recurrenceDuration
                this.recurrenceInterval = creditGrant.recurrenceInterval
                this.amountPaidCreditType = creditGrant.amountPaidCreditType
                this.amountGrantedCreditType = creditGrant.amountGrantedCreditType
                additionalProperties(creditGrant.additionalProperties)
            }

            fun name(name: String) = name(JsonField.of(name))

            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun amountGranted(amountGranted: Double) = amountGranted(JsonField.of(amountGranted))

            @JsonProperty("amount_granted")
            @ExcludeMissing
            fun amountGranted(amountGranted: JsonField<Double>) = apply {
                this.amountGranted = amountGranted
            }

            fun amountPaid(amountPaid: Double) = amountPaid(JsonField.of(amountPaid))

            @JsonProperty("amount_paid")
            @ExcludeMissing
            fun amountPaid(amountPaid: JsonField<Double>) = apply { this.amountPaid = amountPaid }

            fun effectiveDuration(effectiveDuration: Double) =
                effectiveDuration(JsonField.of(effectiveDuration))

            @JsonProperty("effective_duration")
            @ExcludeMissing
            fun effectiveDuration(effectiveDuration: JsonField<Double>) = apply {
                this.effectiveDuration = effectiveDuration
            }

            fun priority(priority: String) = priority(JsonField.of(priority))

            @JsonProperty("priority")
            @ExcludeMissing
            fun priority(priority: JsonField<String>) = apply { this.priority = priority }

            fun sendInvoice(sendInvoice: Boolean) = sendInvoice(JsonField.of(sendInvoice))

            @JsonProperty("send_invoice")
            @ExcludeMissing
            fun sendInvoice(sendInvoice: JsonField<Boolean>) = apply {
                this.sendInvoice = sendInvoice
            }

            fun reason(reason: String) = reason(JsonField.of(reason))

            @JsonProperty("reason")
            @ExcludeMissing
            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

            fun recurrenceDuration(recurrenceDuration: Double) =
                recurrenceDuration(JsonField.of(recurrenceDuration))

            @JsonProperty("recurrence_duration")
            @ExcludeMissing
            fun recurrenceDuration(recurrenceDuration: JsonField<Double>) = apply {
                this.recurrenceDuration = recurrenceDuration
            }

            fun recurrenceInterval(recurrenceInterval: Double) =
                recurrenceInterval(JsonField.of(recurrenceInterval))

            @JsonProperty("recurrence_interval")
            @ExcludeMissing
            fun recurrenceInterval(recurrenceInterval: JsonField<Double>) = apply {
                this.recurrenceInterval = recurrenceInterval
            }

            fun amountPaidCreditType(amountPaidCreditType: CreditTypeData) =
                amountPaidCreditType(JsonField.of(amountPaidCreditType))

            @JsonProperty("amount_paid_credit_type")
            @ExcludeMissing
            fun amountPaidCreditType(amountPaidCreditType: JsonField<CreditTypeData>) = apply {
                this.amountPaidCreditType = amountPaidCreditType
            }

            fun amountGrantedCreditType(amountGrantedCreditType: CreditTypeData) =
                amountGrantedCreditType(JsonField.of(amountGrantedCreditType))

            @JsonProperty("amount_granted_credit_type")
            @ExcludeMissing
            fun amountGrantedCreditType(amountGrantedCreditType: JsonField<CreditTypeData>) =
                apply {
                    this.amountGrantedCreditType = amountGrantedCreditType
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

            return /* spotless:off */ other is CreditGrant && this.name == other.name && this.amountGranted == other.amountGranted && this.amountPaid == other.amountPaid && this.effectiveDuration == other.effectiveDuration && this.priority == other.priority && this.sendInvoice == other.sendInvoice && this.reason == other.reason && this.recurrenceDuration == other.recurrenceDuration && this.recurrenceInterval == other.recurrenceInterval && this.amountPaidCreditType == other.amountPaidCreditType && this.amountGrantedCreditType == other.amountGrantedCreditType && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(name, amountGranted, amountPaid, effectiveDuration, priority, sendInvoice, reason, recurrenceDuration, recurrenceInterval, amountPaidCreditType, amountGrantedCreditType, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "CreditGrant{name=$name, amountGranted=$amountGranted, amountPaid=$amountPaid, effectiveDuration=$effectiveDuration, priority=$priority, sendInvoice=$sendInvoice, reason=$reason, recurrenceDuration=$recurrenceDuration, recurrenceInterval=$recurrenceInterval, amountPaidCreditType=$amountPaidCreditType, amountGrantedCreditType=$amountGrantedCreditType, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = Minimum.Builder::class)
    @NoAutoDetect
    class Minimum
    private constructor(
        private val name: JsonField<String>,
        private val value: JsonField<Double>,
        private val startPeriod: JsonField<Double>,
        private val creditType: JsonField<CreditTypeData>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

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
                this.name = minimum.name
                this.value = minimum.value
                this.startPeriod = minimum.startPeriod
                this.creditType = minimum.creditType
                additionalProperties(minimum.additionalProperties)
            }

            fun name(name: String) = name(JsonField.of(name))

            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun value(value: Double) = value(JsonField.of(value))

            @JsonProperty("value")
            @ExcludeMissing
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
            @JsonProperty("start_period")
            @ExcludeMissing
            fun startPeriod(startPeriod: JsonField<Double>) = apply {
                this.startPeriod = startPeriod
            }

            fun creditType(creditType: CreditTypeData) = creditType(JsonField.of(creditType))

            @JsonProperty("credit_type")
            @ExcludeMissing
            fun creditType(creditType: JsonField<CreditTypeData>) = apply {
                this.creditType = creditType
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

            return /* spotless:off */ other is Minimum && this.name == other.name && this.value == other.value && this.startPeriod == other.startPeriod && this.creditType == other.creditType && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(name, value, startPeriod, creditType, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Minimum{name=$name, value=$value, startPeriod=$startPeriod, creditType=$creditType, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = OverageRate.Builder::class)
    @NoAutoDetect
    class OverageRate
    private constructor(
        private val toFiatConversionFactor: JsonField<Double>,
        private val startPeriod: JsonField<Double>,
        private val fiatCreditType: JsonField<CreditTypeData>,
        private val creditType: JsonField<CreditTypeData>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

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
                this.toFiatConversionFactor = overageRate.toFiatConversionFactor
                this.startPeriod = overageRate.startPeriod
                this.fiatCreditType = overageRate.fiatCreditType
                this.creditType = overageRate.creditType
                additionalProperties(overageRate.additionalProperties)
            }

            fun toFiatConversionFactor(toFiatConversionFactor: Double) =
                toFiatConversionFactor(JsonField.of(toFiatConversionFactor))

            @JsonProperty("to_fiat_conversion_factor")
            @ExcludeMissing
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
            @JsonProperty("start_period")
            @ExcludeMissing
            fun startPeriod(startPeriod: JsonField<Double>) = apply {
                this.startPeriod = startPeriod
            }

            fun fiatCreditType(fiatCreditType: CreditTypeData) =
                fiatCreditType(JsonField.of(fiatCreditType))

            @JsonProperty("fiat_credit_type")
            @ExcludeMissing
            fun fiatCreditType(fiatCreditType: JsonField<CreditTypeData>) = apply {
                this.fiatCreditType = fiatCreditType
            }

            fun creditType(creditType: CreditTypeData) = creditType(JsonField.of(creditType))

            @JsonProperty("credit_type")
            @ExcludeMissing
            fun creditType(creditType: JsonField<CreditTypeData>) = apply {
                this.creditType = creditType
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

            return /* spotless:off */ other is OverageRate && this.toFiatConversionFactor == other.toFiatConversionFactor && this.startPeriod == other.startPeriod && this.fiatCreditType == other.fiatCreditType && this.creditType == other.creditType && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(toFiatConversionFactor, startPeriod, fiatCreditType, creditType, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "OverageRate{toFiatConversionFactor=$toFiatConversionFactor, startPeriod=$startPeriod, fiatCreditType=$fiatCreditType, creditType=$creditType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PlanDetail && this.id == other.id && this.name == other.name && this.description == other.description && this.minimums == other.minimums && this.overageRates == other.overageRates && this.creditGrants == other.creditGrants && this.customFields == other.customFields && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(id, name, description, minimums, overageRates, creditGrants, customFields, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "PlanDetail{id=$id, name=$name, description=$description, minimums=$minimums, overageRates=$overageRates, creditGrants=$creditGrants, customFields=$customFields, additionalProperties=$additionalProperties}"
}
