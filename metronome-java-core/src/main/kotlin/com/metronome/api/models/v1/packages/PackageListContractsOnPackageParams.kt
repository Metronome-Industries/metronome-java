// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.packages

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.Params
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * For a given package, returns all contract IDs and customer IDs associated with the package over a
 * specific time period.
 *
 * ### Use this endpoint to:
 * - Understand which customers are provisioned on a package at any given time for internal cohort
 *   management
 * - Manage customer migrations to a new package. For example, to migrate all active customers to a
 *   new package, call this endpoint, end contracts, and provision customers on a new package.
 *
 * ### **Usage guidelines:**
 * Use the **`starting_at`**, **`covering_date`**, and **`include_archived`** parameters to filter
 * the list of returned contracts. For example, to list only currently active contracts,
 * pass **`covering_date`** equal to the current time.
 */
class PackageListContractsOnPackageParams
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
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun packageId(): String = body.packageId()

    /**
     * Optional RFC 3339 timestamp. Only include contracts active on the provided date. This cannot
     * be provided if starting_at filter is provided.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun coveringDate(): Optional<OffsetDateTime> = body.coveringDate()

    /**
     * Default false. Determines whether to include archived contracts in the results
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun includeArchived(): Optional<Boolean> = body.includeArchived()

    /**
     * Optional RFC 3339 timestamp. Only include contracts that started on or after this date. This
     * cannot be provided if covering_date filter is provided.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startingAt(): Optional<OffsetDateTime> = body.startingAt()

    /**
     * Returns the raw JSON value of [packageId].
     *
     * Unlike [packageId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _packageId(): JsonField<String> = body._packageId()

    /**
     * Returns the raw JSON value of [coveringDate].
     *
     * Unlike [coveringDate], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _coveringDate(): JsonField<OffsetDateTime> = body._coveringDate()

    /**
     * Returns the raw JSON value of [includeArchived].
     *
     * Unlike [includeArchived], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _includeArchived(): JsonField<Boolean> = body._includeArchived()

    /**
     * Returns the raw JSON value of [startingAt].
     *
     * Unlike [startingAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _startingAt(): JsonField<OffsetDateTime> = body._startingAt()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PackageListContractsOnPackageParams].
         *
         * The following fields are required:
         * ```java
         * .packageId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PackageListContractsOnPackageParams]. */
    class Builder internal constructor() {

        private var limit: Long? = null
        private var nextPage: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            packageListContractsOnPackageParams: PackageListContractsOnPackageParams
        ) = apply {
            limit = packageListContractsOnPackageParams.limit
            nextPage = packageListContractsOnPackageParams.nextPage
            body = packageListContractsOnPackageParams.body.toBuilder()
            additionalHeaders = packageListContractsOnPackageParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                packageListContractsOnPackageParams.additionalQueryParams.toBuilder()
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
         * - [packageId]
         * - [coveringDate]
         * - [includeArchived]
         * - [startingAt]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun packageId(packageId: String) = apply { body.packageId(packageId) }

        /**
         * Sets [Builder.packageId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.packageId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun packageId(packageId: JsonField<String>) = apply { body.packageId(packageId) }

        /**
         * Optional RFC 3339 timestamp. Only include contracts active on the provided date. This
         * cannot be provided if starting_at filter is provided.
         */
        fun coveringDate(coveringDate: OffsetDateTime) = apply { body.coveringDate(coveringDate) }

        /**
         * Sets [Builder.coveringDate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.coveringDate] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun coveringDate(coveringDate: JsonField<OffsetDateTime>) = apply {
            body.coveringDate(coveringDate)
        }

        /** Default false. Determines whether to include archived contracts in the results */
        fun includeArchived(includeArchived: Boolean) = apply {
            body.includeArchived(includeArchived)
        }

        /**
         * Sets [Builder.includeArchived] to an arbitrary JSON value.
         *
         * You should usually call [Builder.includeArchived] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun includeArchived(includeArchived: JsonField<Boolean>) = apply {
            body.includeArchived(includeArchived)
        }

        /**
         * Optional RFC 3339 timestamp. Only include contracts that started on or after this date.
         * This cannot be provided if covering_date filter is provided.
         */
        fun startingAt(startingAt: OffsetDateTime) = apply { body.startingAt(startingAt) }

        /**
         * Sets [Builder.startingAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startingAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
            body.startingAt(startingAt)
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
         * Returns an immutable instance of [PackageListContractsOnPackageParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .packageId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PackageListContractsOnPackageParams =
            PackageListContractsOnPackageParams(
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
        private val packageId: JsonField<String>,
        private val coveringDate: JsonField<OffsetDateTime>,
        private val includeArchived: JsonField<Boolean>,
        private val startingAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("package_id")
            @ExcludeMissing
            packageId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("covering_date")
            @ExcludeMissing
            coveringDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("include_archived")
            @ExcludeMissing
            includeArchived: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("starting_at")
            @ExcludeMissing
            startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(packageId, coveringDate, includeArchived, startingAt, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun packageId(): String = packageId.getRequired("package_id")

        /**
         * Optional RFC 3339 timestamp. Only include contracts active on the provided date. This
         * cannot be provided if starting_at filter is provided.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun coveringDate(): Optional<OffsetDateTime> = coveringDate.getOptional("covering_date")

        /**
         * Default false. Determines whether to include archived contracts in the results
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun includeArchived(): Optional<Boolean> = includeArchived.getOptional("include_archived")

        /**
         * Optional RFC 3339 timestamp. Only include contracts that started on or after this date.
         * This cannot be provided if covering_date filter is provided.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun startingAt(): Optional<OffsetDateTime> = startingAt.getOptional("starting_at")

        /**
         * Returns the raw JSON value of [packageId].
         *
         * Unlike [packageId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("package_id") @ExcludeMissing fun _packageId(): JsonField<String> = packageId

        /**
         * Returns the raw JSON value of [coveringDate].
         *
         * Unlike [coveringDate], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("covering_date")
        @ExcludeMissing
        fun _coveringDate(): JsonField<OffsetDateTime> = coveringDate

        /**
         * Returns the raw JSON value of [includeArchived].
         *
         * Unlike [includeArchived], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("include_archived")
        @ExcludeMissing
        fun _includeArchived(): JsonField<Boolean> = includeArchived

        /**
         * Returns the raw JSON value of [startingAt].
         *
         * Unlike [startingAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("starting_at")
        @ExcludeMissing
        fun _startingAt(): JsonField<OffsetDateTime> = startingAt

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
             * .packageId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var packageId: JsonField<String>? = null
            private var coveringDate: JsonField<OffsetDateTime> = JsonMissing.of()
            private var includeArchived: JsonField<Boolean> = JsonMissing.of()
            private var startingAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                packageId = body.packageId
                coveringDate = body.coveringDate
                includeArchived = body.includeArchived
                startingAt = body.startingAt
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun packageId(packageId: String) = packageId(JsonField.of(packageId))

            /**
             * Sets [Builder.packageId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.packageId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun packageId(packageId: JsonField<String>) = apply { this.packageId = packageId }

            /**
             * Optional RFC 3339 timestamp. Only include contracts active on the provided date. This
             * cannot be provided if starting_at filter is provided.
             */
            fun coveringDate(coveringDate: OffsetDateTime) =
                coveringDate(JsonField.of(coveringDate))

            /**
             * Sets [Builder.coveringDate] to an arbitrary JSON value.
             *
             * You should usually call [Builder.coveringDate] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun coveringDate(coveringDate: JsonField<OffsetDateTime>) = apply {
                this.coveringDate = coveringDate
            }

            /** Default false. Determines whether to include archived contracts in the results */
            fun includeArchived(includeArchived: Boolean) =
                includeArchived(JsonField.of(includeArchived))

            /**
             * Sets [Builder.includeArchived] to an arbitrary JSON value.
             *
             * You should usually call [Builder.includeArchived] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun includeArchived(includeArchived: JsonField<Boolean>) = apply {
                this.includeArchived = includeArchived
            }

            /**
             * Optional RFC 3339 timestamp. Only include contracts that started on or after this
             * date. This cannot be provided if covering_date filter is provided.
             */
            fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

            /**
             * Sets [Builder.startingAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startingAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                this.startingAt = startingAt
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
             *
             * The following fields are required:
             * ```java
             * .packageId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("packageId", packageId),
                    coveringDate,
                    includeArchived,
                    startingAt,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            packageId()
            coveringDate()
            includeArchived()
            startingAt()
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
            (if (packageId.asKnown().isPresent) 1 else 0) +
                (if (coveringDate.asKnown().isPresent) 1 else 0) +
                (if (includeArchived.asKnown().isPresent) 1 else 0) +
                (if (startingAt.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                packageId == other.packageId &&
                coveringDate == other.coveringDate &&
                includeArchived == other.includeArchived &&
                startingAt == other.startingAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(packageId, coveringDate, includeArchived, startingAt, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{packageId=$packageId, coveringDate=$coveringDate, includeArchived=$includeArchived, startingAt=$startingAt, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PackageListContractsOnPackageParams &&
            limit == other.limit &&
            nextPage == other.nextPage &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(limit, nextPage, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "PackageListContractsOnPackageParams{limit=$limit, nextPage=$nextPage, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
