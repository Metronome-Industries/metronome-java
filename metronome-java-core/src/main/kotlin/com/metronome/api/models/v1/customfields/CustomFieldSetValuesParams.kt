// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customfields

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.Params
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/**
 * Sets custom field values on a specific Metronome entity instance. Overwrites existing values for
 * matching keys while preserving other fields. All updates are transactional—either all values are
 * set or none are. Custom field values are limited to 200 characters each.
 */
class CustomFieldSetValuesParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customFields(): CustomFields = body.customFields()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun entity(): Entity = body.entity()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun entityId(): String = body.entityId()

    /**
     * Returns the raw JSON value of [customFields].
     *
     * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customFields(): JsonField<CustomFields> = body._customFields()

    /**
     * Returns the raw JSON value of [entity].
     *
     * Unlike [entity], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _entity(): JsonField<Entity> = body._entity()

    /**
     * Returns the raw JSON value of [entityId].
     *
     * Unlike [entityId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _entityId(): JsonField<String> = body._entityId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomFieldSetValuesParams].
         *
         * The following fields are required:
         * ```java
         * .customFields()
         * .entity()
         * .entityId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomFieldSetValuesParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(customFieldSetValuesParams: CustomFieldSetValuesParams) = apply {
            body = customFieldSetValuesParams.body.toBuilder()
            additionalHeaders = customFieldSetValuesParams.additionalHeaders.toBuilder()
            additionalQueryParams = customFieldSetValuesParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [customFields]
         * - [entity]
         * - [entityId]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun customFields(customFields: CustomFields) = apply { body.customFields(customFields) }

        /**
         * Sets [Builder.customFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customFields] with a well-typed [CustomFields] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customFields(customFields: JsonField<CustomFields>) = apply {
            body.customFields(customFields)
        }

        fun entity(entity: Entity) = apply { body.entity(entity) }

        /**
         * Sets [Builder.entity] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entity] with a well-typed [Entity] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun entity(entity: JsonField<Entity>) = apply { body.entity(entity) }

        fun entityId(entityId: String) = apply { body.entityId(entityId) }

        /**
         * Sets [Builder.entityId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.entityId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun entityId(entityId: JsonField<String>) = apply { body.entityId(entityId) }

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

        /**
         * Returns an immutable instance of [CustomFieldSetValuesParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .customFields()
         * .entity()
         * .entityId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomFieldSetValuesParams =
            CustomFieldSetValuesParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val customFields: JsonField<CustomFields>,
        private val entity: JsonField<Entity>,
        private val entityId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("custom_fields")
            @ExcludeMissing
            customFields: JsonField<CustomFields> = JsonMissing.of(),
            @JsonProperty("entity") @ExcludeMissing entity: JsonField<Entity> = JsonMissing.of(),
            @JsonProperty("entity_id")
            @ExcludeMissing
            entityId: JsonField<String> = JsonMissing.of(),
        ) : this(customFields, entity, entityId, mutableMapOf())

        /**
         * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customFields(): CustomFields = customFields.getRequired("custom_fields")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun entity(): Entity = entity.getRequired("entity")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun entityId(): String = entityId.getRequired("entity_id")

        /**
         * Returns the raw JSON value of [customFields].
         *
         * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

        /**
         * Returns the raw JSON value of [entity].
         *
         * Unlike [entity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entity") @ExcludeMissing fun _entity(): JsonField<Entity> = entity

        /**
         * Returns the raw JSON value of [entityId].
         *
         * Unlike [entityId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entity_id") @ExcludeMissing fun _entityId(): JsonField<String> = entityId

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .customFields()
             * .entity()
             * .entityId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var customFields: JsonField<CustomFields>? = null
            private var entity: JsonField<Entity>? = null
            private var entityId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                customFields = body.customFields
                entity = body.entity
                entityId = body.entityId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

            /**
             * Sets [Builder.customFields] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customFields] with a well-typed [CustomFields] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customFields(customFields: JsonField<CustomFields>) = apply {
                this.customFields = customFields
            }

            fun entity(entity: Entity) = entity(JsonField.of(entity))

            /**
             * Sets [Builder.entity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entity] with a well-typed [Entity] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entity(entity: JsonField<Entity>) = apply { this.entity = entity }

            fun entityId(entityId: String) = entityId(JsonField.of(entityId))

            /**
             * Sets [Builder.entityId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entityId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entityId(entityId: JsonField<String>) = apply { this.entityId = entityId }

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

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .customFields()
             * .entity()
             * .entityId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("customFields", customFields),
                    checkRequired("entity", entity),
                    checkRequired("entityId", entityId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            customFields().validate()
            entity().validate()
            entityId()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (customFields.asKnown().getOrNull()?.validity() ?: 0) +
                (entity.asKnown().getOrNull()?.validity() ?: 0) +
                (if (entityId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                customFields == other.customFields &&
                entity == other.entity &&
                entityId == other.entityId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(customFields, entity, entityId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{customFields=$customFields, entity=$entity, entityId=$entityId, additionalProperties=$additionalProperties}"
    }

    /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
    class CustomFields
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [CustomFields]. */
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [CustomFields].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): CustomFields = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CustomFields && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
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

            @JvmField val SUBSCRIPTION = of("subscription")

            @JvmField val PACKAGE_COMMIT = of("package_commit")

            @JvmField val PACKAGE_CREDIT = of("package_credit")

            @JvmField val PACKAGE_SUBSCRIPTION = of("package_subscription")

            @JvmField val PACKAGE_SCHEDULED_CHARGE = of("package_scheduled_charge")

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
            SUBSCRIPTION,
            PACKAGE_COMMIT,
            PACKAGE_CREDIT,
            PACKAGE_SUBSCRIPTION,
            PACKAGE_SCHEDULED_CHARGE,
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
            SUBSCRIPTION,
            PACKAGE_COMMIT,
            PACKAGE_CREDIT,
            PACKAGE_SUBSCRIPTION,
            PACKAGE_SCHEDULED_CHARGE,
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
                SUBSCRIPTION -> Value.SUBSCRIPTION
                PACKAGE_COMMIT -> Value.PACKAGE_COMMIT
                PACKAGE_CREDIT -> Value.PACKAGE_CREDIT
                PACKAGE_SUBSCRIPTION -> Value.PACKAGE_SUBSCRIPTION
                PACKAGE_SCHEDULED_CHARGE -> Value.PACKAGE_SCHEDULED_CHARGE
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
                SUBSCRIPTION -> Known.SUBSCRIPTION
                PACKAGE_COMMIT -> Known.PACKAGE_COMMIT
                PACKAGE_CREDIT -> Known.PACKAGE_CREDIT
                PACKAGE_SUBSCRIPTION -> Known.PACKAGE_SUBSCRIPTION
                PACKAGE_SCHEDULED_CHARGE -> Known.PACKAGE_SCHEDULED_CHARGE
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

        private var validated: Boolean = false

        fun validate(): Entity = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Entity && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomFieldSetValuesParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CustomFieldSetValuesParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
