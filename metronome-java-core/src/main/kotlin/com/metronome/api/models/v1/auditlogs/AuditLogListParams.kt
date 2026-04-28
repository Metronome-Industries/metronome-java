// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.auditlogs

import com.fasterxml.jackson.annotation.JsonCreator
import com.metronome.api.core.Enum
import com.metronome.api.core.JsonField
import com.metronome.api.core.Params
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Get a comprehensive audit trail of all operations performed in your Metronome account, whether
 * initiated through the API, web interface, or automated processes. This endpoint provides detailed
 * logs of who did what and when, enabling compliance reporting, security monitoring, and
 * operational troubleshooting across all interaction channels.
 *
 * ### Use this endpoint to:
 * - Monitor all account activity for security and compliance purposes
 * - Track configuration changes regardless of source (API, UI, or system)
 * - Investigate issues by reviewing historical operations
 *
 * ### Key response fields:
 * An array of AuditLog objects containing:
 * - id: Unique identifier for the audit log entry
 * - timestamp: When the action occurred (RFC 3339 format)
 * - actor: Information about who performed the action
 * - request: Details including request ID, IP address, and user agent
 * - `resource_type`: The type of resource affected (e.g., customer, contract, invoice)
 * - `resource_id`: The specific resource identifier
 * - `action`: The operation performed
 * - `next_page`: Cursor for continuous log retrieval
 *
 * ### Usage guidelines:
 * - Continuous retrieval: The next_page token enables uninterrupted log streaming—save it between
 *   requests to ensure no logs are missed
 * - Empty responses: An empty data array means no new logs yet; continue polling with the same
 *   next_page token
 * - Date filtering:
 *     - `starting_on`: Earliest logs to return (inclusive)
 *     - `ending_before`: Latest logs to return (exclusive)
 *     - Cannot be used with `next_page`
 * - Resource filtering: Must specify both `resource_type` and `resource_id` together
 * - Sort order: Default is `date_asc`; use `date_desc` for newest first
 */
class AuditLogListParams
private constructor(
    private val endingBefore: OffsetDateTime?,
    private val limit: Long?,
    private val nextPage: String?,
    private val resourceId: String?,
    private val resourceType: String?,
    private val sort: Sort?,
    private val startingOn: OffsetDateTime?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** RFC 3339 timestamp (exclusive). Cannot be used with 'next_page'. */
    fun endingBefore(): Optional<OffsetDateTime> = Optional.ofNullable(endingBefore)

    /** Max number of results that should be returned */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Cursor that indicates where the next page of results should start. */
    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage)

    /**
     * Optional parameter that can be used to filter which audit logs are returned. If you specify
     * resource_id, you must also specify resource_type.
     */
    fun resourceId(): Optional<String> = Optional.ofNullable(resourceId)

    /**
     * Optional parameter that can be used to filter which audit logs are returned. If you specify
     * resource_type, you must also specify resource_id.
     */
    fun resourceType(): Optional<String> = Optional.ofNullable(resourceType)

    /** Sort order by timestamp, e.g. date_asc or date_desc. Defaults to date_asc. */
    fun sort(): Optional<Sort> = Optional.ofNullable(sort)

    /** RFC 3339 timestamp of the earliest audit log to return. Cannot be used with 'next_page'. */
    fun startingOn(): Optional<OffsetDateTime> = Optional.ofNullable(startingOn)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): AuditLogListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [AuditLogListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AuditLogListParams]. */
    class Builder internal constructor() {

        private var endingBefore: OffsetDateTime? = null
        private var limit: Long? = null
        private var nextPage: String? = null
        private var resourceId: String? = null
        private var resourceType: String? = null
        private var sort: Sort? = null
        private var startingOn: OffsetDateTime? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(auditLogListParams: AuditLogListParams) = apply {
            endingBefore = auditLogListParams.endingBefore
            limit = auditLogListParams.limit
            nextPage = auditLogListParams.nextPage
            resourceId = auditLogListParams.resourceId
            resourceType = auditLogListParams.resourceType
            sort = auditLogListParams.sort
            startingOn = auditLogListParams.startingOn
            additionalHeaders = auditLogListParams.additionalHeaders.toBuilder()
            additionalQueryParams = auditLogListParams.additionalQueryParams.toBuilder()
        }

        /** RFC 3339 timestamp (exclusive). Cannot be used with 'next_page'. */
        fun endingBefore(endingBefore: OffsetDateTime?) = apply { this.endingBefore = endingBefore }

        /** Alias for calling [Builder.endingBefore] with `endingBefore.orElse(null)`. */
        fun endingBefore(endingBefore: Optional<OffsetDateTime>) =
            endingBefore(endingBefore.getOrNull())

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
         * Optional parameter that can be used to filter which audit logs are returned. If you
         * specify resource_id, you must also specify resource_type.
         */
        fun resourceId(resourceId: String?) = apply { this.resourceId = resourceId }

        /** Alias for calling [Builder.resourceId] with `resourceId.orElse(null)`. */
        fun resourceId(resourceId: Optional<String>) = resourceId(resourceId.getOrNull())

        /**
         * Optional parameter that can be used to filter which audit logs are returned. If you
         * specify resource_type, you must also specify resource_id.
         */
        fun resourceType(resourceType: String?) = apply { this.resourceType = resourceType }

        /** Alias for calling [Builder.resourceType] with `resourceType.orElse(null)`. */
        fun resourceType(resourceType: Optional<String>) = resourceType(resourceType.getOrNull())

        /** Sort order by timestamp, e.g. date_asc or date_desc. Defaults to date_asc. */
        fun sort(sort: Sort?) = apply { this.sort = sort }

        /** Alias for calling [Builder.sort] with `sort.orElse(null)`. */
        fun sort(sort: Optional<Sort>) = sort(sort.getOrNull())

        /**
         * RFC 3339 timestamp of the earliest audit log to return. Cannot be used with 'next_page'.
         */
        fun startingOn(startingOn: OffsetDateTime?) = apply { this.startingOn = startingOn }

        /** Alias for calling [Builder.startingOn] with `startingOn.orElse(null)`. */
        fun startingOn(startingOn: Optional<OffsetDateTime>) = startingOn(startingOn.getOrNull())

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
         * Returns an immutable instance of [AuditLogListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AuditLogListParams =
            AuditLogListParams(
                endingBefore,
                limit,
                nextPage,
                resourceId,
                resourceType,
                sort,
                startingOn,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                endingBefore?.let {
                    put("ending_before", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                limit?.let { put("limit", it.toString()) }
                nextPage?.let { put("next_page", it) }
                resourceId?.let { put("resource_id", it) }
                resourceType?.let { put("resource_type", it) }
                sort?.let { put("sort", it.toString()) }
                startingOn?.let {
                    put("starting_on", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it))
                }
                putAll(additionalQueryParams)
            }
            .build()

    /** Sort order by timestamp, e.g. date_asc or date_desc. Defaults to date_asc. */
    class Sort @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val DATE_ASC = of("date_asc")

            @JvmField val DATE_DESC = of("date_desc")

            @JvmStatic fun of(value: String) = Sort(JsonField.of(value))
        }

        /** An enum containing [Sort]'s known values. */
        enum class Known {
            DATE_ASC,
            DATE_DESC,
        }

        /**
         * An enum containing [Sort]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Sort] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DATE_ASC,
            DATE_DESC,
            /** An enum member indicating that [Sort] was instantiated with an unknown value. */
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
                DATE_ASC -> Value.DATE_ASC
                DATE_DESC -> Value.DATE_DESC
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
                DATE_ASC -> Known.DATE_ASC
                DATE_DESC -> Known.DATE_DESC
                else -> throw MetronomeInvalidDataException("Unknown Sort: $value")
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

        fun validate(): Sort = apply {
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

            return other is Sort && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuditLogListParams &&
            endingBefore == other.endingBefore &&
            limit == other.limit &&
            nextPage == other.nextPage &&
            resourceId == other.resourceId &&
            resourceType == other.resourceType &&
            sort == other.sort &&
            startingOn == other.startingOn &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            endingBefore,
            limit,
            nextPage,
            resourceId,
            resourceType,
            sort,
            startingOn,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "AuditLogListParams{endingBefore=$endingBefore, limit=$limit, nextPage=$nextPage, resourceId=$resourceId, resourceType=$resourceType, sort=$sort, startingOn=$startingOn, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
