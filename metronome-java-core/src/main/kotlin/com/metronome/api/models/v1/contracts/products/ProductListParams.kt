// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts.products

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
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.errors.MetronomeInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Get a paginated list of all products in your organization with their complete configuration,
 * version history, and metadata. By default excludes archived products unless explicitly requested
 * via the `archive_filter` parameter.
 */
class ProductListParams
private constructor(
    private val limit: Long?,
    private val nextPage: String?,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Max number of results that should be returned */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Cursor that indicates where the next page of results should start. */
    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage)

    /**
     * Filter options for the product list. If not provided, defaults to not archived.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun archiveFilter(): Optional<ArchiveFilter> = body.archiveFilter()

    /**
     * Returns the raw JSON value of [archiveFilter].
     *
     * Unlike [archiveFilter], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _archiveFilter(): JsonField<ArchiveFilter> = body._archiveFilter()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): ProductListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [ProductListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProductListParams]. */
    class Builder internal constructor() {

        private var limit: Long? = null
        private var nextPage: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(productListParams: ProductListParams) = apply {
            limit = productListParams.limit
            nextPage = productListParams.nextPage
            body = productListParams.body.toBuilder()
            additionalHeaders = productListParams.additionalHeaders.toBuilder()
            additionalQueryParams = productListParams.additionalQueryParams.toBuilder()
        }

        /** Max number of results that should be returned */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /** Cursor that indicates where the next page of results should start. */
        fun nextPage(nextPage: String?) = apply { this.nextPage = nextPage }

        /** Alias for calling [Builder.nextPage] with `nextPage.orElse(null)`. */
        fun nextPage(nextPage: Optional<String>) = nextPage(nextPage.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [archiveFilter]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Filter options for the product list. If not provided, defaults to not archived. */
        fun archiveFilter(archiveFilter: ArchiveFilter) = apply {
            body.archiveFilter(archiveFilter)
        }

        /**
         * Sets [Builder.archiveFilter] to an arbitrary JSON value.
         *
         * You should usually call [Builder.archiveFilter] with a well-typed [ArchiveFilter] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun archiveFilter(archiveFilter: JsonField<ArchiveFilter>) = apply {
            body.archiveFilter(archiveFilter)
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

        /**
         * Returns an immutable instance of [ProductListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ProductListParams =
            ProductListParams(
                limit,
                nextPage,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                limit?.let { put("limit", it.toString()) }
                nextPage?.let { put("next_page", it) }
                putAll(additionalQueryParams)
            }
            .build()

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val archiveFilter: JsonField<ArchiveFilter>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("archive_filter")
            @ExcludeMissing
            archiveFilter: JsonField<ArchiveFilter> = JsonMissing.of()
        ) : this(archiveFilter, mutableMapOf())

        /**
         * Filter options for the product list. If not provided, defaults to not archived.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun archiveFilter(): Optional<ArchiveFilter> = archiveFilter.getOptional("archive_filter")

        /**
         * Returns the raw JSON value of [archiveFilter].
         *
         * Unlike [archiveFilter], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("archive_filter")
        @ExcludeMissing
        fun _archiveFilter(): JsonField<ArchiveFilter> = archiveFilter

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

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var archiveFilter: JsonField<ArchiveFilter> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                archiveFilter = body.archiveFilter
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Filter options for the product list. If not provided, defaults to not archived. */
            fun archiveFilter(archiveFilter: ArchiveFilter) =
                archiveFilter(JsonField.of(archiveFilter))

            /**
             * Sets [Builder.archiveFilter] to an arbitrary JSON value.
             *
             * You should usually call [Builder.archiveFilter] with a well-typed [ArchiveFilter]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun archiveFilter(archiveFilter: JsonField<ArchiveFilter>) = apply {
                this.archiveFilter = archiveFilter
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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body = Body(archiveFilter, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            archiveFilter().ifPresent { it.validate() }
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
        internal fun validity(): Int = (archiveFilter.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                archiveFilter == other.archiveFilter &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(archiveFilter, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{archiveFilter=$archiveFilter, additionalProperties=$additionalProperties}"
    }

    /** Filter options for the product list. If not provided, defaults to not archived. */
    class ArchiveFilter @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val ARCHIVED = of("ARCHIVED")

            @JvmField val NOT_ARCHIVED = of("NOT_ARCHIVED")

            @JvmField val ALL = of("ALL")

            @JvmStatic fun of(value: String) = ArchiveFilter(JsonField.of(value))
        }

        /** An enum containing [ArchiveFilter]'s known values. */
        enum class Known {
            ARCHIVED,
            NOT_ARCHIVED,
            ALL,
        }

        /**
         * An enum containing [ArchiveFilter]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [ArchiveFilter] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ARCHIVED,
            NOT_ARCHIVED,
            ALL,
            /**
             * An enum member indicating that [ArchiveFilter] was instantiated with an unknown
             * value.
             */
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
                ARCHIVED -> Value.ARCHIVED
                NOT_ARCHIVED -> Value.NOT_ARCHIVED
                ALL -> Value.ALL
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
                ARCHIVED -> Known.ARCHIVED
                NOT_ARCHIVED -> Known.NOT_ARCHIVED
                ALL -> Known.ALL
                else -> throw MetronomeInvalidDataException("Unknown ArchiveFilter: $value")
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

        fun validate(): ArchiveFilter = apply {
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

            return other is ArchiveFilter && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProductListParams &&
            limit == other.limit &&
            nextPage == other.nextPage &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(limit, nextPage, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ProductListParams{limit=$limit, nextPage=$nextPage, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
