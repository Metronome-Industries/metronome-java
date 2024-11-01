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
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import com.metronome.api.models.*
import java.util.Objects
import java.util.Optional

class CustomerAlertListParams
constructor(
    private val customerId: String,
    private val nextPage: String?,
    private val alertStatuses: List<AlertStatus>?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun customerId(): String = customerId

    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage)

    fun alertStatuses(): Optional<List<AlertStatus>> = Optional.ofNullable(alertStatuses)

    @JvmSynthetic
    internal fun getBody(): CustomerAlertListBody {
        return CustomerAlertListBody(
            customerId,
            alertStatuses,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic
    internal fun getQueryParams(): Map<String, List<String>> {
        val params = mutableMapOf<String, List<String>>()
        this.nextPage?.let { params.put("next_page", listOf(it.toString())) }
        params.putAll(additionalQueryParams)
        return params.toImmutable()
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = CustomerAlertListBody.Builder::class)
    @NoAutoDetect
    class CustomerAlertListBody
    internal constructor(
        private val customerId: String?,
        private val alertStatuses: List<AlertStatus>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The Metronome ID of the customer */
        @JsonProperty("customer_id") fun customerId(): String? = customerId

        /** Optionally filter by alert status. If absent, only enabled alerts will be returned. */
        @JsonProperty("alert_statuses") fun alertStatuses(): List<AlertStatus>? = alertStatuses

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var customerId: String? = null
            private var alertStatuses: List<AlertStatus>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customerAlertListBody: CustomerAlertListBody) = apply {
                this.customerId = customerAlertListBody.customerId
                this.alertStatuses = customerAlertListBody.alertStatuses
                additionalProperties(customerAlertListBody.additionalProperties)
            }

            /** The Metronome ID of the customer */
            @JsonProperty("customer_id")
            fun customerId(customerId: String) = apply { this.customerId = customerId }

            /**
             * Optionally filter by alert status. If absent, only enabled alerts will be returned.
             */
            @JsonProperty("alert_statuses")
            fun alertStatuses(alertStatuses: List<AlertStatus>) = apply {
                this.alertStatuses = alertStatuses
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

            fun build(): CustomerAlertListBody =
                CustomerAlertListBody(
                    checkNotNull(customerId) { "`customerId` is required but was not set" },
                    alertStatuses?.toImmutable(),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomerAlertListBody && this.customerId == other.customerId && this.alertStatuses == other.alertStatuses && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(customerId, alertStatuses, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "CustomerAlertListBody{customerId=$customerId, alertStatuses=$alertStatuses, additionalProperties=$additionalProperties}"
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerAlertListParams && this.customerId == other.customerId && this.alertStatuses == other.alertStatuses && this.nextPage == other.nextPage && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(customerId, alertStatuses, nextPage, additionalQueryParams, additionalHeaders, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "CustomerAlertListParams{customerId=$customerId, alertStatuses=$alertStatuses, nextPage=$nextPage, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var customerId: String? = null
        private var nextPage: String? = null
        private var alertStatuses: MutableList<AlertStatus> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customerAlertListParams: CustomerAlertListParams) = apply {
            this.customerId = customerAlertListParams.customerId
            this.nextPage = customerAlertListParams.nextPage
            this.alertStatuses(customerAlertListParams.alertStatuses ?: listOf())
            additionalQueryParams(customerAlertListParams.additionalQueryParams)
            additionalHeaders(customerAlertListParams.additionalHeaders)
            additionalBodyProperties(customerAlertListParams.additionalBodyProperties)
        }

        /** The Metronome ID of the customer */
        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /** Cursor that indicates where the next page of results should start. */
        fun nextPage(nextPage: String) = apply { this.nextPage = nextPage }

        /** Optionally filter by alert status. If absent, only enabled alerts will be returned. */
        fun alertStatuses(alertStatuses: List<AlertStatus>) = apply {
            this.alertStatuses.clear()
            this.alertStatuses.addAll(alertStatuses)
        }

        /** Optionally filter by alert status. If absent, only enabled alerts will be returned. */
        fun addAlertStatus(alertStatus: AlertStatus) = apply { this.alertStatuses.add(alertStatus) }

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

        fun build(): CustomerAlertListParams =
            CustomerAlertListParams(
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                nextPage,
                if (alertStatuses.size == 0) null else alertStatuses.toImmutable(),
                additionalQueryParams.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalHeaders.mapValues { it.value.toImmutable() }.toImmutable(),
                additionalBodyProperties.toImmutable(),
            )
    }

    class AlertStatus
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AlertStatus && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ENABLED = AlertStatus(JsonField.of("ENABLED"))

            @JvmField val DISABLED = AlertStatus(JsonField.of("DISABLED"))

            @JvmField val ARCHIVED = AlertStatus(JsonField.of("ARCHIVED"))

            @JvmStatic fun of(value: String) = AlertStatus(JsonField.of(value))
        }

        enum class Known {
            ENABLED,
            DISABLED,
            ARCHIVED,
        }

        enum class Value {
            ENABLED,
            DISABLED,
            ARCHIVED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ENABLED -> Value.ENABLED
                DISABLED -> Value.DISABLED
                ARCHIVED -> Value.ARCHIVED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ENABLED -> Known.ENABLED
                DISABLED -> Known.DISABLED
                ARCHIVED -> Known.ARCHIVED
                else -> throw MetronomeInvalidDataException("Unknown AlertStatus: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
