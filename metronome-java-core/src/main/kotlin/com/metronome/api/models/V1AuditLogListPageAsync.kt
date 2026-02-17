// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import com.metronome.api.services.async.v1.AuditLogServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate

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
 *
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
class V1AuditLogListPageAsync
private constructor(
    private val auditLogsService: AuditLogServiceAsync,
    private val params: V1AuditLogListParams,
    private val response: Response,
) {

    fun response(): Response = response

    fun nextPage(): Optional<String> = response().nextPage()

    fun data(): List<V1AuditLogListResponse> = response().data()

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is V1AuditLogListPageAsync && auditLogsService == other.auditLogsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(auditLogsService, params, response) /* spotless:on */

    override fun toString() =
        "V1AuditLogListPageAsync{auditLogsService=$auditLogsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean {
        if (data().isEmpty()) {
            return false
        }

        return nextPage().isPresent
    }

    fun getNextPageParams(): Optional<V1AuditLogListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            V1AuditLogListParams.builder()
                .from(params)
                .apply { nextPage().ifPresent { this.nextPage(it) } }
                .build()
        )
    }

    fun getNextPage(): CompletableFuture<Optional<V1AuditLogListPageAsync>> {
        return getNextPageParams()
            .map { auditLogsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            auditLogsService: AuditLogServiceAsync,
            params: V1AuditLogListParams,
            response: Response,
        ) = V1AuditLogListPageAsync(auditLogsService, params, response)
    }

    @NoAutoDetect
    class Response
    @JsonCreator
    constructor(
        @JsonProperty("next_page") private val nextPage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("data")
        private val data: JsonField<List<V1AuditLogListResponse>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun nextPage(): Optional<String> = Optional.ofNullable(nextPage.getNullable("next_page"))

        fun data(): List<V1AuditLogListResponse> = data.getNullable("data") ?: listOf()

        @JsonProperty("next_page")
        fun _nextPage(): Optional<JsonField<String>> = Optional.ofNullable(nextPage)

        @JsonProperty("data")
        fun _data(): Optional<JsonField<List<V1AuditLogListResponse>>> = Optional.ofNullable(data)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Response = apply {
            if (validated) {
                return@apply
            }

            nextPage()
            data().map { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Response && nextPage == other.nextPage && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
        }

        override fun hashCode(): Int = /* spotless:off */ Objects.hash(nextPage, data, additionalProperties) /* spotless:on */

        override fun toString() =
            "Response{nextPage=$nextPage, data=$data, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var nextPage: JsonField<String> = JsonMissing.of()
            private var data: JsonField<List<V1AuditLogListResponse>> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(page: Response) = apply {
                this.nextPage = page.nextPage
                this.data = page.data
                this.additionalProperties.putAll(page.additionalProperties)
            }

            fun nextPage(nextPage: String) = nextPage(JsonField.of(nextPage))

            fun nextPage(nextPage: JsonField<String>) = apply { this.nextPage = nextPage }

            fun data(data: List<V1AuditLogListResponse>) = data(JsonField.of(data))

            fun data(data: JsonField<List<V1AuditLogListResponse>>) = apply { this.data = data }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun build() = Response(nextPage, data, additionalProperties.toImmutable())
        }
    }

    class AutoPager(private val firstPage: V1AuditLogListPageAsync) {

        fun forEach(
            action: Predicate<V1AuditLogListResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<V1AuditLogListPageAsync>>.forEach(
                action: (V1AuditLogListResponse) -> Boolean,
                executor: Executor,
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.data().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor,
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<V1AuditLogListResponse>> {
            val values = mutableListOf<V1AuditLogListResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
