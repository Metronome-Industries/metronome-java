// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.checkKnown
import com.metronome.api.core.checkRequired
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CustomerDetail
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val customFields: JsonField<CustomFields>,
    private val customerConfig: JsonField<CustomerConfig>,
    private val externalId: JsonField<String>,
    private val ingestAliases: JsonField<List<String>>,
    private val name: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val archivedAt: JsonField<OffsetDateTime>,
    private val currentBillableStatus: JsonField<CurrentBillableStatus>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("custom_fields")
        @ExcludeMissing
        customFields: JsonField<CustomFields> = JsonMissing.of(),
        @JsonProperty("customer_config")
        @ExcludeMissing
        customerConfig: JsonField<CustomerConfig> = JsonMissing.of(),
        @JsonProperty("external_id")
        @ExcludeMissing
        externalId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ingest_aliases")
        @ExcludeMissing
        ingestAliases: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("archived_at")
        @ExcludeMissing
        archivedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("current_billable_status")
        @ExcludeMissing
        currentBillableStatus: JsonField<CurrentBillableStatus> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        customFields,
        customerConfig,
        externalId,
        ingestAliases,
        name,
        updatedAt,
        archivedAt,
        currentBillableStatus,
        mutableMapOf(),
    )

    /**
     * the Metronome ID of the customer
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * RFC 3339 timestamp indicating when the customer was created.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

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
    fun customerConfig(): CustomerConfig = customerConfig.getRequired("customer_config")

    /**
     * (deprecated, use ingest_aliases instead) the first ID (Metronome or ingest alias) that can be
     * used in usage events
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun externalId(): String = externalId.getRequired("external_id")

    /**
     * aliases for this customer that can be used instead of the Metronome customer ID in usage
     * events
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun ingestAliases(): List<String> = ingestAliases.getRequired("ingest_aliases")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * RFC 3339 timestamp indicating when the customer was last updated.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * RFC 3339 timestamp indicating when the customer was archived. Null if the customer is active.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun archivedAt(): Optional<OffsetDateTime> = archivedAt.getOptional("archived_at")

    /**
     * This field's availability is dependent on your client's configuration.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun currentBillableStatus(): Optional<CurrentBillableStatus> =
        currentBillableStatus.getOptional("current_billable_status")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [customFields].
     *
     * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("custom_fields")
    @ExcludeMissing
    fun _customFields(): JsonField<CustomFields> = customFields

    /**
     * Returns the raw JSON value of [customerConfig].
     *
     * Unlike [customerConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer_config")
    @ExcludeMissing
    fun _customerConfig(): JsonField<CustomerConfig> = customerConfig

    /**
     * Returns the raw JSON value of [externalId].
     *
     * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("external_id") @ExcludeMissing fun _externalId(): JsonField<String> = externalId

    /**
     * Returns the raw JSON value of [ingestAliases].
     *
     * Unlike [ingestAliases], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ingest_aliases")
    @ExcludeMissing
    fun _ingestAliases(): JsonField<List<String>> = ingestAliases

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [archivedAt].
     *
     * Unlike [archivedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("archived_at")
    @ExcludeMissing
    fun _archivedAt(): JsonField<OffsetDateTime> = archivedAt

    /**
     * Returns the raw JSON value of [currentBillableStatus].
     *
     * Unlike [currentBillableStatus], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("current_billable_status")
    @ExcludeMissing
    fun _currentBillableStatus(): JsonField<CurrentBillableStatus> = currentBillableStatus

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
         * Returns a mutable builder for constructing an instance of [CustomerDetail].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .customFields()
         * .customerConfig()
         * .externalId()
         * .ingestAliases()
         * .name()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomerDetail]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var customFields: JsonField<CustomFields>? = null
        private var customerConfig: JsonField<CustomerConfig>? = null
        private var externalId: JsonField<String>? = null
        private var ingestAliases: JsonField<MutableList<String>>? = null
        private var name: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var archivedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var currentBillableStatus: JsonField<CurrentBillableStatus> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customerDetail: CustomerDetail) = apply {
            id = customerDetail.id
            createdAt = customerDetail.createdAt
            customFields = customerDetail.customFields
            customerConfig = customerDetail.customerConfig
            externalId = customerDetail.externalId
            ingestAliases = customerDetail.ingestAliases.map { it.toMutableList() }
            name = customerDetail.name
            updatedAt = customerDetail.updatedAt
            archivedAt = customerDetail.archivedAt
            currentBillableStatus = customerDetail.currentBillableStatus
            additionalProperties = customerDetail.additionalProperties.toMutableMap()
        }

        /** the Metronome ID of the customer */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** RFC 3339 timestamp indicating when the customer was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

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

        fun customerConfig(customerConfig: CustomerConfig) =
            customerConfig(JsonField.of(customerConfig))

        /**
         * Sets [Builder.customerConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerConfig] with a well-typed [CustomerConfig] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customerConfig(customerConfig: JsonField<CustomerConfig>) = apply {
            this.customerConfig = customerConfig
        }

        /**
         * (deprecated, use ingest_aliases instead) the first ID (Metronome or ingest alias) that
         * can be used in usage events
         */
        fun externalId(externalId: String) = externalId(JsonField.of(externalId))

        /**
         * Sets [Builder.externalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

        /**
         * aliases for this customer that can be used instead of the Metronome customer ID in usage
         * events
         */
        fun ingestAliases(ingestAliases: List<String>) = ingestAliases(JsonField.of(ingestAliases))

        /**
         * Sets [Builder.ingestAliases] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ingestAliases] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ingestAliases(ingestAliases: JsonField<List<String>>) = apply {
            this.ingestAliases = ingestAliases.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [ingestAliases].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIngestAlias(ingestAlias: String) = apply {
            ingestAliases =
                (ingestAliases ?: JsonField.of(mutableListOf())).also {
                    checkKnown("ingestAliases", it).add(ingestAlias)
                }
        }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** RFC 3339 timestamp indicating when the customer was last updated. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /**
         * RFC 3339 timestamp indicating when the customer was archived. Null if the customer is
         * active.
         */
        fun archivedAt(archivedAt: OffsetDateTime?) = archivedAt(JsonField.ofNullable(archivedAt))

        /** Alias for calling [Builder.archivedAt] with `archivedAt.orElse(null)`. */
        fun archivedAt(archivedAt: Optional<OffsetDateTime>) = archivedAt(archivedAt.getOrNull())

        /**
         * Sets [Builder.archivedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.archivedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun archivedAt(archivedAt: JsonField<OffsetDateTime>) = apply {
            this.archivedAt = archivedAt
        }

        /** This field's availability is dependent on your client's configuration. */
        fun currentBillableStatus(currentBillableStatus: CurrentBillableStatus) =
            currentBillableStatus(JsonField.of(currentBillableStatus))

        /**
         * Sets [Builder.currentBillableStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currentBillableStatus] with a well-typed
         * [CurrentBillableStatus] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun currentBillableStatus(currentBillableStatus: JsonField<CurrentBillableStatus>) = apply {
            this.currentBillableStatus = currentBillableStatus
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
         * Returns an immutable instance of [CustomerDetail].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .customFields()
         * .customerConfig()
         * .externalId()
         * .ingestAliases()
         * .name()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomerDetail =
            CustomerDetail(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("customFields", customFields),
                checkRequired("customerConfig", customerConfig),
                checkRequired("externalId", externalId),
                checkRequired("ingestAliases", ingestAliases).map { it.toImmutable() },
                checkRequired("name", name),
                checkRequired("updatedAt", updatedAt),
                archivedAt,
                currentBillableStatus,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CustomerDetail = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        customFields().validate()
        customerConfig().validate()
        externalId()
        ingestAliases()
        name()
        updatedAt()
        archivedAt()
        currentBillableStatus().ifPresent { it.validate() }
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (customFields.asKnown().getOrNull()?.validity() ?: 0) +
            (customerConfig.asKnown().getOrNull()?.validity() ?: 0) +
            (if (externalId.asKnown().isPresent) 1 else 0) +
            (ingestAliases.asKnown().getOrNull()?.size ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (archivedAt.asKnown().isPresent) 1 else 0) +
            (currentBillableStatus.asKnown().getOrNull()?.validity() ?: 0)

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

    class CustomerConfig
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val salesforceAccountId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("salesforce_account_id")
            @ExcludeMissing
            salesforceAccountId: JsonField<String> = JsonMissing.of()
        ) : this(salesforceAccountId, mutableMapOf())

        /**
         * The Salesforce account ID for the customer
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun salesforceAccountId(): Optional<String> =
            salesforceAccountId.getOptional("salesforce_account_id")

        /**
         * Returns the raw JSON value of [salesforceAccountId].
         *
         * Unlike [salesforceAccountId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("salesforce_account_id")
        @ExcludeMissing
        fun _salesforceAccountId(): JsonField<String> = salesforceAccountId

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
             * Returns a mutable builder for constructing an instance of [CustomerConfig].
             *
             * The following fields are required:
             * ```java
             * .salesforceAccountId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CustomerConfig]. */
        class Builder internal constructor() {

            private var salesforceAccountId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customerConfig: CustomerConfig) = apply {
                salesforceAccountId = customerConfig.salesforceAccountId
                additionalProperties = customerConfig.additionalProperties.toMutableMap()
            }

            /** The Salesforce account ID for the customer */
            fun salesforceAccountId(salesforceAccountId: String?) =
                salesforceAccountId(JsonField.ofNullable(salesforceAccountId))

            /**
             * Alias for calling [Builder.salesforceAccountId] with
             * `salesforceAccountId.orElse(null)`.
             */
            fun salesforceAccountId(salesforceAccountId: Optional<String>) =
                salesforceAccountId(salesforceAccountId.getOrNull())

            /**
             * Sets [Builder.salesforceAccountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.salesforceAccountId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun salesforceAccountId(salesforceAccountId: JsonField<String>) = apply {
                this.salesforceAccountId = salesforceAccountId
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
             * Returns an immutable instance of [CustomerConfig].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .salesforceAccountId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CustomerConfig =
                CustomerConfig(
                    checkRequired("salesforceAccountId", salesforceAccountId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CustomerConfig = apply {
            if (validated) {
                return@apply
            }

            salesforceAccountId()
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
        internal fun validity(): Int = (if (salesforceAccountId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CustomerConfig &&
                salesforceAccountId == other.salesforceAccountId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(salesforceAccountId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CustomerConfig{salesforceAccountId=$salesforceAccountId, additionalProperties=$additionalProperties}"
    }

    /** This field's availability is dependent on your client's configuration. */
    class CurrentBillableStatus
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val value: JsonField<Value_>,
        private val effectiveAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("value") @ExcludeMissing value: JsonField<Value_> = JsonMissing.of(),
            @JsonProperty("effective_at")
            @ExcludeMissing
            effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(value, effectiveAt, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun value(): Value_ = value.getRequired("value")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun effectiveAt(): Optional<OffsetDateTime> = effectiveAt.getOptional("effective_at")

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<Value_> = value

        /**
         * Returns the raw JSON value of [effectiveAt].
         *
         * Unlike [effectiveAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("effective_at")
        @ExcludeMissing
        fun _effectiveAt(): JsonField<OffsetDateTime> = effectiveAt

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
             * Returns a mutable builder for constructing an instance of [CurrentBillableStatus].
             *
             * The following fields are required:
             * ```java
             * .value()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CurrentBillableStatus]. */
        class Builder internal constructor() {

            private var value: JsonField<Value_>? = null
            private var effectiveAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(currentBillableStatus: CurrentBillableStatus) = apply {
                value = currentBillableStatus.value
                effectiveAt = currentBillableStatus.effectiveAt
                additionalProperties = currentBillableStatus.additionalProperties.toMutableMap()
            }

            fun value(value: Value_) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [Value_] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<Value_>) = apply { this.value = value }

            fun effectiveAt(effectiveAt: OffsetDateTime?) =
                effectiveAt(JsonField.ofNullable(effectiveAt))

            /** Alias for calling [Builder.effectiveAt] with `effectiveAt.orElse(null)`. */
            fun effectiveAt(effectiveAt: Optional<OffsetDateTime>) =
                effectiveAt(effectiveAt.getOrNull())

            /**
             * Sets [Builder.effectiveAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.effectiveAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun effectiveAt(effectiveAt: JsonField<OffsetDateTime>) = apply {
                this.effectiveAt = effectiveAt
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
             * Returns an immutable instance of [CurrentBillableStatus].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .value()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CurrentBillableStatus =
                CurrentBillableStatus(
                    checkRequired("value", value),
                    effectiveAt,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CurrentBillableStatus = apply {
            if (validated) {
                return@apply
            }

            value().validate()
            effectiveAt()
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
            (value.asKnown().getOrNull()?.validity() ?: 0) +
                (if (effectiveAt.asKnown().isPresent) 1 else 0)

        class Value_ @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val BILLABLE = of("billable")

                @JvmField val UNBILLABLE = of("unbillable")

                @JvmStatic fun of(value: String) = Value_(JsonField.of(value))
            }

            /** An enum containing [Value_]'s known values. */
            enum class Known {
                BILLABLE,
                UNBILLABLE,
            }

            /**
             * An enum containing [Value_]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Value_] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                BILLABLE,
                UNBILLABLE,
                /**
                 * An enum member indicating that [Value_] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    BILLABLE -> Value.BILLABLE
                    UNBILLABLE -> Value.UNBILLABLE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    BILLABLE -> Known.BILLABLE
                    UNBILLABLE -> Known.UNBILLABLE
                    else -> throw MetronomeInvalidDataException("Unknown Value_: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Value_ = apply {
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

                return other is Value_ && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CurrentBillableStatus &&
                value == other.value &&
                effectiveAt == other.effectiveAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(value, effectiveAt, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CurrentBillableStatus{value=$value, effectiveAt=$effectiveAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerDetail &&
            id == other.id &&
            createdAt == other.createdAt &&
            customFields == other.customFields &&
            customerConfig == other.customerConfig &&
            externalId == other.externalId &&
            ingestAliases == other.ingestAliases &&
            name == other.name &&
            updatedAt == other.updatedAt &&
            archivedAt == other.archivedAt &&
            currentBillableStatus == other.currentBillableStatus &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            customFields,
            customerConfig,
            externalId,
            ingestAliases,
            name,
            updatedAt,
            archivedAt,
            currentBillableStatus,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomerDetail{id=$id, createdAt=$createdAt, customFields=$customFields, customerConfig=$customerConfig, externalId=$externalId, ingestAliases=$ingestAliases, name=$name, updatedAt=$updatedAt, archivedAt=$archivedAt, currentBillableStatus=$currentBillableStatus, additionalProperties=$additionalProperties}"
}
