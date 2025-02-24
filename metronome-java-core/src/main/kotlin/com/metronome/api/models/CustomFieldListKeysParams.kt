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
import com.metronome.api.core.Params
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.util.Objects
import java.util.Optional

/** List all active custom field keys, optionally filtered by entity type. */
class CustomFieldListKeysParams
private constructor(
    private val nextPage: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Cursor that indicates where the next page of results should start. */
    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage)

    /** Optional list of entity types to return keys for */
    fun entities(): Optional<List<Entity>> = body.entities()

    /** Optional list of entity types to return keys for */
    fun _entities(): JsonField<List<Entity>> = body._entities()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.nextPage?.let { queryParams.put("next_page", listOf(it.toString())) }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("entities")
        @ExcludeMissing
        private val entities: JsonField<List<Entity>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Optional list of entity types to return keys for */
        fun entities(): Optional<List<Entity>> =
            Optional.ofNullable(entities.getNullable("entities"))

        /** Optional list of entity types to return keys for */
        @JsonProperty("entities")
        @ExcludeMissing
        fun _entities(): JsonField<List<Entity>> = entities

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            entities()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var entities: JsonField<MutableList<Entity>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                entities = body.entities.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Optional list of entity types to return keys for */
            fun entities(entities: List<Entity>) = entities(JsonField.of(entities))

            /** Optional list of entity types to return keys for */
            fun entities(entities: JsonField<List<Entity>>) = apply {
                this.entities = entities.map { it.toMutableList() }
            }

            /** Optional list of entity types to return keys for */
            fun addEntity(entity: Entity) = apply {
                entities =
                    (entities ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(entity)
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

            fun build(): Body =
                Body(
                    (entities ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && entities == other.entities && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(entities, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{entities=$entities, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomFieldListKeysParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var nextPage: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(customFieldListKeysParams: CustomFieldListKeysParams) = apply {
            nextPage = customFieldListKeysParams.nextPage
            body = customFieldListKeysParams.body.toBuilder()
            additionalHeaders = customFieldListKeysParams.additionalHeaders.toBuilder()
            additionalQueryParams = customFieldListKeysParams.additionalQueryParams.toBuilder()
        }

        /** Cursor that indicates where the next page of results should start. */
        fun nextPage(nextPage: String?) = apply { this.nextPage = nextPage }

        /** Cursor that indicates where the next page of results should start. */
        fun nextPage(nextPage: Optional<String>) = nextPage(nextPage.orElse(null))

        /** Optional list of entity types to return keys for */
        fun entities(entities: List<Entity>) = apply { body.entities(entities) }

        /** Optional list of entity types to return keys for */
        fun entities(entities: JsonField<List<Entity>>) = apply { body.entities(entities) }

        /** Optional list of entity types to return keys for */
        fun addEntity(entity: Entity) = apply { body.addEntity(entity) }

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

        fun build(): CustomFieldListKeysParams =
            CustomFieldListKeysParams(
                nextPage,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class Entity @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ALERT = of("alert")

            @JvmField val BILLABLE_METRIC = of("billable_metric")

            @JvmField val CHARGE = of("charge")

            @JvmField val COMMIT = of("commit")

            @JvmField val CONTRACT_CREDIT = of("contract_credit")

            @JvmField val CONTRACT_PRODUCT = of("contract_product")

            @JvmField val CONTRACT = of("contract")

            @JvmField val CREDIT_GRANT = of("credit_grant")

            @JvmField val CUSTOMER_PLAN = of("customer_plan")

            @JvmField val CUSTOMER = of("customer")

            @JvmField val DISCOUNT = of("discount")

            @JvmField val INVOICE = of("invoice")

            @JvmField val PLAN = of("plan")

            @JvmField val PROFESSIONAL_SERVICE = of("professional_service")

            @JvmField val PRODUCT = of("product")

            @JvmField val RATE_CARD = of("rate_card")

            @JvmField val SCHEDULED_CHARGE = of("scheduled_charge")

            @JvmStatic fun of(value: String) = Entity(JsonField.of(value))
        }

        /** An enum containing [Entity]'s known values. */
        enum class Known {
            ALERT,
            BILLABLE_METRIC,
            CHARGE,
            COMMIT,
            CONTRACT_CREDIT,
            CONTRACT_PRODUCT,
            CONTRACT,
            CREDIT_GRANT,
            CUSTOMER_PLAN,
            CUSTOMER,
            DISCOUNT,
            INVOICE,
            PLAN,
            PROFESSIONAL_SERVICE,
            PRODUCT,
            RATE_CARD,
            SCHEDULED_CHARGE,
        }

        /**
         * An enum containing [Entity]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Entity] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ALERT,
            BILLABLE_METRIC,
            CHARGE,
            COMMIT,
            CONTRACT_CREDIT,
            CONTRACT_PRODUCT,
            CONTRACT,
            CREDIT_GRANT,
            CUSTOMER_PLAN,
            CUSTOMER,
            DISCOUNT,
            INVOICE,
            PLAN,
            PROFESSIONAL_SERVICE,
            PRODUCT,
            RATE_CARD,
            SCHEDULED_CHARGE,
            /** An enum member indicating that [Entity] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ALERT -> Value.ALERT
                BILLABLE_METRIC -> Value.BILLABLE_METRIC
                CHARGE -> Value.CHARGE
                COMMIT -> Value.COMMIT
                CONTRACT_CREDIT -> Value.CONTRACT_CREDIT
                CONTRACT_PRODUCT -> Value.CONTRACT_PRODUCT
                CONTRACT -> Value.CONTRACT
                CREDIT_GRANT -> Value.CREDIT_GRANT
                CUSTOMER_PLAN -> Value.CUSTOMER_PLAN
                CUSTOMER -> Value.CUSTOMER
                DISCOUNT -> Value.DISCOUNT
                INVOICE -> Value.INVOICE
                PLAN -> Value.PLAN
                PROFESSIONAL_SERVICE -> Value.PROFESSIONAL_SERVICE
                PRODUCT -> Value.PRODUCT
                RATE_CARD -> Value.RATE_CARD
                SCHEDULED_CHARGE -> Value.SCHEDULED_CHARGE
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws MetronomeInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                ALERT -> Known.ALERT
                BILLABLE_METRIC -> Known.BILLABLE_METRIC
                CHARGE -> Known.CHARGE
                COMMIT -> Known.COMMIT
                CONTRACT_CREDIT -> Known.CONTRACT_CREDIT
                CONTRACT_PRODUCT -> Known.CONTRACT_PRODUCT
                CONTRACT -> Known.CONTRACT
                CREDIT_GRANT -> Known.CREDIT_GRANT
                CUSTOMER_PLAN -> Known.CUSTOMER_PLAN
                CUSTOMER -> Known.CUSTOMER
                DISCOUNT -> Known.DISCOUNT
                INVOICE -> Known.INVOICE
                PLAN -> Known.PLAN
                PROFESSIONAL_SERVICE -> Known.PROFESSIONAL_SERVICE
                PRODUCT -> Known.PRODUCT
                RATE_CARD -> Known.RATE_CARD
                SCHEDULED_CHARGE -> Known.SCHEDULED_CHARGE
                else -> throw MetronomeInvalidDataException("Unknown Entity: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws MetronomeInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                MetronomeInvalidDataException("Value is not a String")
            }

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

        return /* spotless:off */ other is CustomFieldListKeysParams && nextPage == other.nextPage && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(nextPage, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "CustomFieldListKeysParams{nextPage=$nextPage, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
