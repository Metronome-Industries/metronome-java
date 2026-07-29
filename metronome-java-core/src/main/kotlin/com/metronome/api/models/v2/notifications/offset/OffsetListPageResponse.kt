// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v2.notifications.offset

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.checkKnown
import com.metronome.api.core.checkRequired
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import com.metronome.api.models.v2.notifications.LifecycleEventOffsetNotificationConfig
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class OffsetListPageResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<List<LifecycleEventOffsetNotificationConfig>>,
    private val cursor: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data")
        @ExcludeMissing
        data: JsonField<List<LifecycleEventOffsetNotificationConfig>> = JsonMissing.of(),
        @JsonProperty("cursor") @ExcludeMissing cursor: JsonField<String> = JsonMissing.of(),
    ) : this(data, cursor, mutableMapOf())

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun data(): List<LifecycleEventOffsetNotificationConfig> = data.getRequired("data")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cursor(): Optional<String> = cursor.getOptional("cursor")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data")
    @ExcludeMissing
    fun _data(): JsonField<List<LifecycleEventOffsetNotificationConfig>> = data

    /**
     * Returns the raw JSON value of [cursor].
     *
     * Unlike [cursor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cursor") @ExcludeMissing fun _cursor(): JsonField<String> = cursor

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
         * Returns a mutable builder for constructing an instance of [OffsetListPageResponse].
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [OffsetListPageResponse]. */
    class Builder internal constructor() {

        private var data: JsonField<MutableList<LifecycleEventOffsetNotificationConfig>>? = null
        private var cursor: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(offsetListPageResponse: OffsetListPageResponse) = apply {
            data = offsetListPageResponse.data.map { it.toMutableList() }
            cursor = offsetListPageResponse.cursor
            additionalProperties = offsetListPageResponse.additionalProperties.toMutableMap()
        }

        fun data(data: List<LifecycleEventOffsetNotificationConfig>) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed
         * `List<LifecycleEventOffsetNotificationConfig>` value instead. This method is primarily
         * for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<List<LifecycleEventOffsetNotificationConfig>>) = apply {
            this.data = data.map { it.toMutableList() }
        }

        /**
         * Adds a single [LifecycleEventOffsetNotificationConfig] to [Builder.data].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addData(data: LifecycleEventOffsetNotificationConfig) = apply {
            this.data =
                (this.data ?: JsonField.of(mutableListOf())).also {
                    checkKnown("data", it).add(data)
                }
        }

        fun cursor(cursor: String?) = cursor(JsonField.ofNullable(cursor))

        /** Alias for calling [Builder.cursor] with `cursor.orElse(null)`. */
        fun cursor(cursor: Optional<String>) = cursor(cursor.getOrNull())

        /**
         * Sets [Builder.cursor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cursor] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cursor(cursor: JsonField<String>) = apply { this.cursor = cursor }

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
         * Returns an immutable instance of [OffsetListPageResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .data()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OffsetListPageResponse =
            OffsetListPageResponse(
                checkRequired("data", data).map { it.toImmutable() },
                cursor,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): OffsetListPageResponse = apply {
        if (validated) {
            return@apply
        }

        data().forEach { it.validate() }
        cursor()
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
        (data.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (cursor.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is OffsetListPageResponse &&
            data == other.data &&
            cursor == other.cursor &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, cursor, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OffsetListPageResponse{data=$data, cursor=$cursor, additionalProperties=$additionalProperties}"
}
