// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.metronome.api.core.Enum
import com.metronome.api.core.JsonField
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.Params
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional

/**
 * Retrieves a range of audit logs. If no further audit logs are currently available, the data array
 * will be empty. As new audit logs are created, subsequent requests using the same next_page value
 * will be in the returned data array, ensuring a continuous and uninterrupted reading of audit
 * logs.
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

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams {
        val queryParams = QueryParams.builder()
        this.endingBefore?.let {
            queryParams.put(
                "ending_before",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)),
            )
        }
        this.limit?.let { queryParams.put("limit", listOf(it.toString())) }
        this.nextPage?.let { queryParams.put("next_page", listOf(it.toString())) }
        this.resourceId?.let { queryParams.put("resource_id", listOf(it.toString())) }
        this.resourceType?.let { queryParams.put("resource_type", listOf(it.toString())) }
        this.sort?.let { queryParams.put("sort", listOf(it.toString())) }
        this.startingOn?.let {
            queryParams.put(
                "starting_on",
                listOf(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)),
            )
        }
        queryParams.putAll(additionalQueryParams)
        return queryParams.build()
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AuditLogListParams]. */
    @NoAutoDetect
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

        /** RFC 3339 timestamp (exclusive). Cannot be used with 'next_page'. */
        fun endingBefore(endingBefore: Optional<OffsetDateTime>) =
            endingBefore(endingBefore.orElse(null))

        /** Max number of results that should be returned */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /** Max number of results that should be returned */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Max number of results that should be returned */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun limit(limit: Optional<Long>) = limit(limit.orElse(null) as Long?)

        /** Cursor that indicates where the next page of results should start. */
        fun nextPage(nextPage: String?) = apply { this.nextPage = nextPage }

        /** Cursor that indicates where the next page of results should start. */
        fun nextPage(nextPage: Optional<String>) = nextPage(nextPage.orElse(null))

        /**
         * Optional parameter that can be used to filter which audit logs are returned. If you
         * specify resource_id, you must also specify resource_type.
         */
        fun resourceId(resourceId: String?) = apply { this.resourceId = resourceId }

        /**
         * Optional parameter that can be used to filter which audit logs are returned. If you
         * specify resource_id, you must also specify resource_type.
         */
        fun resourceId(resourceId: Optional<String>) = resourceId(resourceId.orElse(null))

        /**
         * Optional parameter that can be used to filter which audit logs are returned. If you
         * specify resource_type, you must also specify resource_id.
         */
        fun resourceType(resourceType: String?) = apply { this.resourceType = resourceType }

        /**
         * Optional parameter that can be used to filter which audit logs are returned. If you
         * specify resource_type, you must also specify resource_id.
         */
        fun resourceType(resourceType: Optional<String>) = resourceType(resourceType.orElse(null))

        /** Sort order by timestamp, e.g. date_asc or date_desc. Defaults to date_asc. */
        fun sort(sort: Sort?) = apply { this.sort = sort }

        /** Sort order by timestamp, e.g. date_asc or date_desc. Defaults to date_asc. */
        fun sort(sort: Optional<Sort>) = sort(sort.orElse(null))

        /**
         * RFC 3339 timestamp of the earliest audit log to return. Cannot be used with 'next_page'.
         */
        fun startingOn(startingOn: OffsetDateTime?) = apply { this.startingOn = startingOn }

        /**
         * RFC 3339 timestamp of the earliest audit log to return. Cannot be used with 'next_page'.
         */
        fun startingOn(startingOn: Optional<OffsetDateTime>) = startingOn(startingOn.orElse(null))

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Sort && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AuditLogListParams && endingBefore == other.endingBefore && limit == other.limit && nextPage == other.nextPage && resourceId == other.resourceId && resourceType == other.resourceType && sort == other.sort && startingOn == other.startingOn && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(endingBefore, limit, nextPage, resourceId, resourceType, sort, startingOn, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AuditLogListParams{endingBefore=$endingBefore, limit=$limit, nextPage=$nextPage, resourceId=$resourceId, resourceType=$resourceType, sort=$sort, startingOn=$startingOn, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
