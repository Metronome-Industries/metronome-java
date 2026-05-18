// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.dashboards

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
import com.metronome.api.core.checkKnown
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Generate secure, embeddable dashboard URLs that allow you to seamlessly integrate Metronome's
 * billing visualizations directly into your application. This endpoint creates authenticated
 * iframe-ready URLs for customer-specific dashboards, providing a white-labeled billing experience
 * without building custom UI.
 *
 * ### Use this endpoint to:
 * - Embed billing dashboards directly in your customer portal or admin interface
 * - Provide self-service access to invoices, usage data, and credit balances
 * - Build white-labeled billing experiences with minimal development effort
 *
 * ### Key response fields:
 * - A secure, time-limited URL that can be embedded in an iframe
 * - The URL includes authentication tokens and configuration parameters
 * - URLs are customer-specific and respect your security settings
 *
 * ### Usage guidelines:
 * - Dashboard types: Choose from `invoices`, `usage`, or `commits_and_credits`
 * - Customization options:
 *     - `dashboard_options`: Configure whether you want invoices to show zero usage line items
 *     - `color_overrides`: Match your brand's color palette
 *     - `bm_group_key_overrides`: Customize how dimensions are displayed (for the usage embeddable
 *       dashboard)
 * - Iframe implementation: Embed the returned URL directly in an iframe element
 * - Responsive design: Dashboards automatically adapt to container dimensions
 */
class DashboardGetEmbeddableUrlParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = body.customerId()

    /**
     * The type of dashboard to retrieve.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun dashboard(): Dashboard = body.dashboard()

    /**
     * Optional list of billable metric group key overrides
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun bmGroupKeyOverrides(): Optional<List<BmGroupKeyOverride>> = body.bmGroupKeyOverrides()

    /**
     * Optional list of colors to override
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun colorOverrides(): Optional<List<ColorOverride>> = body.colorOverrides()

    /**
     * Optional dashboard specific options
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dashboardOptions(): Optional<List<DashboardOption>> = body.dashboardOptions()

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customerId(): JsonField<String> = body._customerId()

    /**
     * Returns the raw JSON value of [dashboard].
     *
     * Unlike [dashboard], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dashboard(): JsonField<Dashboard> = body._dashboard()

    /**
     * Returns the raw JSON value of [bmGroupKeyOverrides].
     *
     * Unlike [bmGroupKeyOverrides], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _bmGroupKeyOverrides(): JsonField<List<BmGroupKeyOverride>> = body._bmGroupKeyOverrides()

    /**
     * Returns the raw JSON value of [colorOverrides].
     *
     * Unlike [colorOverrides], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _colorOverrides(): JsonField<List<ColorOverride>> = body._colorOverrides()

    /**
     * Returns the raw JSON value of [dashboardOptions].
     *
     * Unlike [dashboardOptions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _dashboardOptions(): JsonField<List<DashboardOption>> = body._dashboardOptions()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DashboardGetEmbeddableUrlParams].
         *
         * The following fields are required:
         * ```java
         * .customerId()
         * .dashboard()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DashboardGetEmbeddableUrlParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(dashboardGetEmbeddableUrlParams: DashboardGetEmbeddableUrlParams) =
            apply {
                body = dashboardGetEmbeddableUrlParams.body.toBuilder()
                additionalHeaders = dashboardGetEmbeddableUrlParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    dashboardGetEmbeddableUrlParams.additionalQueryParams.toBuilder()
            }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [customerId]
         * - [dashboard]
         * - [bmGroupKeyOverrides]
         * - [colorOverrides]
         * - [dashboardOptions]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        /** The type of dashboard to retrieve. */
        fun dashboard(dashboard: Dashboard) = apply { body.dashboard(dashboard) }

        /**
         * Sets [Builder.dashboard] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dashboard] with a well-typed [Dashboard] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dashboard(dashboard: JsonField<Dashboard>) = apply { body.dashboard(dashboard) }

        /** Optional list of billable metric group key overrides */
        fun bmGroupKeyOverrides(bmGroupKeyOverrides: List<BmGroupKeyOverride>) = apply {
            body.bmGroupKeyOverrides(bmGroupKeyOverrides)
        }

        /**
         * Sets [Builder.bmGroupKeyOverrides] to an arbitrary JSON value.
         *
         * You should usually call [Builder.bmGroupKeyOverrides] with a well-typed
         * `List<BmGroupKeyOverride>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun bmGroupKeyOverrides(bmGroupKeyOverrides: JsonField<List<BmGroupKeyOverride>>) = apply {
            body.bmGroupKeyOverrides(bmGroupKeyOverrides)
        }

        /**
         * Adds a single [BmGroupKeyOverride] to [bmGroupKeyOverrides].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBmGroupKeyOverride(bmGroupKeyOverride: BmGroupKeyOverride) = apply {
            body.addBmGroupKeyOverride(bmGroupKeyOverride)
        }

        /** Optional list of colors to override */
        fun colorOverrides(colorOverrides: List<ColorOverride>) = apply {
            body.colorOverrides(colorOverrides)
        }

        /**
         * Sets [Builder.colorOverrides] to an arbitrary JSON value.
         *
         * You should usually call [Builder.colorOverrides] with a well-typed `List<ColorOverride>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun colorOverrides(colorOverrides: JsonField<List<ColorOverride>>) = apply {
            body.colorOverrides(colorOverrides)
        }

        /**
         * Adds a single [ColorOverride] to [colorOverrides].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addColorOverride(colorOverride: ColorOverride) = apply {
            body.addColorOverride(colorOverride)
        }

        /** Optional dashboard specific options */
        fun dashboardOptions(dashboardOptions: List<DashboardOption>) = apply {
            body.dashboardOptions(dashboardOptions)
        }

        /**
         * Sets [Builder.dashboardOptions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dashboardOptions] with a well-typed
         * `List<DashboardOption>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun dashboardOptions(dashboardOptions: JsonField<List<DashboardOption>>) = apply {
            body.dashboardOptions(dashboardOptions)
        }

        /**
         * Adds a single [DashboardOption] to [dashboardOptions].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDashboardOption(dashboardOption: DashboardOption) = apply {
            body.addDashboardOption(dashboardOption)
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
         * Returns an immutable instance of [DashboardGetEmbeddableUrlParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .customerId()
         * .dashboard()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DashboardGetEmbeddableUrlParams =
            DashboardGetEmbeddableUrlParams(
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
        private val customerId: JsonField<String>,
        private val dashboard: JsonField<Dashboard>,
        private val bmGroupKeyOverrides: JsonField<List<BmGroupKeyOverride>>,
        private val colorOverrides: JsonField<List<ColorOverride>>,
        private val dashboardOptions: JsonField<List<DashboardOption>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("customer_id")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dashboard")
            @ExcludeMissing
            dashboard: JsonField<Dashboard> = JsonMissing.of(),
            @JsonProperty("bm_group_key_overrides")
            @ExcludeMissing
            bmGroupKeyOverrides: JsonField<List<BmGroupKeyOverride>> = JsonMissing.of(),
            @JsonProperty("color_overrides")
            @ExcludeMissing
            colorOverrides: JsonField<List<ColorOverride>> = JsonMissing.of(),
            @JsonProperty("dashboard_options")
            @ExcludeMissing
            dashboardOptions: JsonField<List<DashboardOption>> = JsonMissing.of(),
        ) : this(
            customerId,
            dashboard,
            bmGroupKeyOverrides,
            colorOverrides,
            dashboardOptions,
            mutableMapOf(),
        )

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * The type of dashboard to retrieve.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun dashboard(): Dashboard = dashboard.getRequired("dashboard")

        /**
         * Optional list of billable metric group key overrides
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun bmGroupKeyOverrides(): Optional<List<BmGroupKeyOverride>> =
            bmGroupKeyOverrides.getOptional("bm_group_key_overrides")

        /**
         * Optional list of colors to override
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun colorOverrides(): Optional<List<ColorOverride>> =
            colorOverrides.getOptional("color_overrides")

        /**
         * Optional dashboard specific options
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun dashboardOptions(): Optional<List<DashboardOption>> =
            dashboardOptions.getOptional("dashboard_options")

        /**
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * Returns the raw JSON value of [dashboard].
         *
         * Unlike [dashboard], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dashboard")
        @ExcludeMissing
        fun _dashboard(): JsonField<Dashboard> = dashboard

        /**
         * Returns the raw JSON value of [bmGroupKeyOverrides].
         *
         * Unlike [bmGroupKeyOverrides], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("bm_group_key_overrides")
        @ExcludeMissing
        fun _bmGroupKeyOverrides(): JsonField<List<BmGroupKeyOverride>> = bmGroupKeyOverrides

        /**
         * Returns the raw JSON value of [colorOverrides].
         *
         * Unlike [colorOverrides], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("color_overrides")
        @ExcludeMissing
        fun _colorOverrides(): JsonField<List<ColorOverride>> = colorOverrides

        /**
         * Returns the raw JSON value of [dashboardOptions].
         *
         * Unlike [dashboardOptions], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("dashboard_options")
        @ExcludeMissing
        fun _dashboardOptions(): JsonField<List<DashboardOption>> = dashboardOptions

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
             * .customerId()
             * .dashboard()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var customerId: JsonField<String>? = null
            private var dashboard: JsonField<Dashboard>? = null
            private var bmGroupKeyOverrides: JsonField<MutableList<BmGroupKeyOverride>>? = null
            private var colorOverrides: JsonField<MutableList<ColorOverride>>? = null
            private var dashboardOptions: JsonField<MutableList<DashboardOption>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                customerId = body.customerId
                dashboard = body.dashboard
                bmGroupKeyOverrides = body.bmGroupKeyOverrides.map { it.toMutableList() }
                colorOverrides = body.colorOverrides.map { it.toMutableList() }
                dashboardOptions = body.dashboardOptions.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /** The type of dashboard to retrieve. */
            fun dashboard(dashboard: Dashboard) = dashboard(JsonField.of(dashboard))

            /**
             * Sets [Builder.dashboard] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dashboard] with a well-typed [Dashboard] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dashboard(dashboard: JsonField<Dashboard>) = apply { this.dashboard = dashboard }

            /** Optional list of billable metric group key overrides */
            fun bmGroupKeyOverrides(bmGroupKeyOverrides: List<BmGroupKeyOverride>) =
                bmGroupKeyOverrides(JsonField.of(bmGroupKeyOverrides))

            /**
             * Sets [Builder.bmGroupKeyOverrides] to an arbitrary JSON value.
             *
             * You should usually call [Builder.bmGroupKeyOverrides] with a well-typed
             * `List<BmGroupKeyOverride>` value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun bmGroupKeyOverrides(bmGroupKeyOverrides: JsonField<List<BmGroupKeyOverride>>) =
                apply {
                    this.bmGroupKeyOverrides = bmGroupKeyOverrides.map { it.toMutableList() }
                }

            /**
             * Adds a single [BmGroupKeyOverride] to [bmGroupKeyOverrides].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addBmGroupKeyOverride(bmGroupKeyOverride: BmGroupKeyOverride) = apply {
                bmGroupKeyOverrides =
                    (bmGroupKeyOverrides ?: JsonField.of(mutableListOf())).also {
                        checkKnown("bmGroupKeyOverrides", it).add(bmGroupKeyOverride)
                    }
            }

            /** Optional list of colors to override */
            fun colorOverrides(colorOverrides: List<ColorOverride>) =
                colorOverrides(JsonField.of(colorOverrides))

            /**
             * Sets [Builder.colorOverrides] to an arbitrary JSON value.
             *
             * You should usually call [Builder.colorOverrides] with a well-typed
             * `List<ColorOverride>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun colorOverrides(colorOverrides: JsonField<List<ColorOverride>>) = apply {
                this.colorOverrides = colorOverrides.map { it.toMutableList() }
            }

            /**
             * Adds a single [ColorOverride] to [colorOverrides].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addColorOverride(colorOverride: ColorOverride) = apply {
                colorOverrides =
                    (colorOverrides ?: JsonField.of(mutableListOf())).also {
                        checkKnown("colorOverrides", it).add(colorOverride)
                    }
            }

            /** Optional dashboard specific options */
            fun dashboardOptions(dashboardOptions: List<DashboardOption>) =
                dashboardOptions(JsonField.of(dashboardOptions))

            /**
             * Sets [Builder.dashboardOptions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dashboardOptions] with a well-typed
             * `List<DashboardOption>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun dashboardOptions(dashboardOptions: JsonField<List<DashboardOption>>) = apply {
                this.dashboardOptions = dashboardOptions.map { it.toMutableList() }
            }

            /**
             * Adds a single [DashboardOption] to [dashboardOptions].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDashboardOption(dashboardOption: DashboardOption) = apply {
                dashboardOptions =
                    (dashboardOptions ?: JsonField.of(mutableListOf())).also {
                        checkKnown("dashboardOptions", it).add(dashboardOption)
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

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .customerId()
             * .dashboard()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("customerId", customerId),
                    checkRequired("dashboard", dashboard),
                    (bmGroupKeyOverrides ?: JsonMissing.of()).map { it.toImmutable() },
                    (colorOverrides ?: JsonMissing.of()).map { it.toImmutable() },
                    (dashboardOptions ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            customerId()
            dashboard().validate()
            bmGroupKeyOverrides().ifPresent { it.forEach { it.validate() } }
            colorOverrides().ifPresent { it.forEach { it.validate() } }
            dashboardOptions().ifPresent { it.forEach { it.validate() } }
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
            (if (customerId.asKnown().isPresent) 1 else 0) +
                (dashboard.asKnown().getOrNull()?.validity() ?: 0) +
                (bmGroupKeyOverrides.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (colorOverrides.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (dashboardOptions.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                customerId == other.customerId &&
                dashboard == other.dashboard &&
                bmGroupKeyOverrides == other.bmGroupKeyOverrides &&
                colorOverrides == other.colorOverrides &&
                dashboardOptions == other.dashboardOptions &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                customerId,
                dashboard,
                bmGroupKeyOverrides,
                colorOverrides,
                dashboardOptions,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{customerId=$customerId, dashboard=$dashboard, bmGroupKeyOverrides=$bmGroupKeyOverrides, colorOverrides=$colorOverrides, dashboardOptions=$dashboardOptions, additionalProperties=$additionalProperties}"
    }

    /** The type of dashboard to retrieve. */
    class Dashboard @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val INVOICES = of("invoices")

            @JvmField val USAGE = of("usage")

            @JvmField val CREDITS = of("credits")

            @JvmField val COMMITS_AND_CREDITS = of("commits_and_credits")

            @JvmStatic fun of(value: String) = Dashboard(JsonField.of(value))
        }

        /** An enum containing [Dashboard]'s known values. */
        enum class Known {
            INVOICES,
            USAGE,
            CREDITS,
            COMMITS_AND_CREDITS,
        }

        /**
         * An enum containing [Dashboard]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Dashboard] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            INVOICES,
            USAGE,
            CREDITS,
            COMMITS_AND_CREDITS,
            /**
             * An enum member indicating that [Dashboard] was instantiated with an unknown value.
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
                INVOICES -> Value.INVOICES
                USAGE -> Value.USAGE
                CREDITS -> Value.CREDITS
                COMMITS_AND_CREDITS -> Value.COMMITS_AND_CREDITS
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
                INVOICES -> Known.INVOICES
                USAGE -> Known.USAGE
                CREDITS -> Known.CREDITS
                COMMITS_AND_CREDITS -> Known.COMMITS_AND_CREDITS
                else -> throw MetronomeInvalidDataException("Unknown Dashboard: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Dashboard = apply {
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

            return other is Dashboard && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class BmGroupKeyOverride
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val groupKeyName: JsonField<String>,
        private val displayName: JsonField<String>,
        private val valueDisplayNames: JsonField<ValueDisplayNames>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("group_key_name")
            @ExcludeMissing
            groupKeyName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("display_name")
            @ExcludeMissing
            displayName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("value_display_names")
            @ExcludeMissing
            valueDisplayNames: JsonField<ValueDisplayNames> = JsonMissing.of(),
        ) : this(groupKeyName, displayName, valueDisplayNames, mutableMapOf())

        /**
         * The name of the billable metric group key.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun groupKeyName(): String = groupKeyName.getRequired("group_key_name")

        /**
         * The display name for the billable metric group key
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun displayName(): Optional<String> = displayName.getOptional("display_name")

        /**
         * <key, value> pairs of the billable metric group key values and their display names. e.g.
         * {"a": "Asia", "b": "Euro"}
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun valueDisplayNames(): Optional<ValueDisplayNames> =
            valueDisplayNames.getOptional("value_display_names")

        /**
         * Returns the raw JSON value of [groupKeyName].
         *
         * Unlike [groupKeyName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("group_key_name")
        @ExcludeMissing
        fun _groupKeyName(): JsonField<String> = groupKeyName

        /**
         * Returns the raw JSON value of [displayName].
         *
         * Unlike [displayName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("display_name")
        @ExcludeMissing
        fun _displayName(): JsonField<String> = displayName

        /**
         * Returns the raw JSON value of [valueDisplayNames].
         *
         * Unlike [valueDisplayNames], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("value_display_names")
        @ExcludeMissing
        fun _valueDisplayNames(): JsonField<ValueDisplayNames> = valueDisplayNames

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
             * Returns a mutable builder for constructing an instance of [BmGroupKeyOverride].
             *
             * The following fields are required:
             * ```java
             * .groupKeyName()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BmGroupKeyOverride]. */
        class Builder internal constructor() {

            private var groupKeyName: JsonField<String>? = null
            private var displayName: JsonField<String> = JsonMissing.of()
            private var valueDisplayNames: JsonField<ValueDisplayNames> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(bmGroupKeyOverride: BmGroupKeyOverride) = apply {
                groupKeyName = bmGroupKeyOverride.groupKeyName
                displayName = bmGroupKeyOverride.displayName
                valueDisplayNames = bmGroupKeyOverride.valueDisplayNames
                additionalProperties = bmGroupKeyOverride.additionalProperties.toMutableMap()
            }

            /** The name of the billable metric group key. */
            fun groupKeyName(groupKeyName: String) = groupKeyName(JsonField.of(groupKeyName))

            /**
             * Sets [Builder.groupKeyName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groupKeyName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun groupKeyName(groupKeyName: JsonField<String>) = apply {
                this.groupKeyName = groupKeyName
            }

            /** The display name for the billable metric group key */
            fun displayName(displayName: String) = displayName(JsonField.of(displayName))

            /**
             * Sets [Builder.displayName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.displayName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun displayName(displayName: JsonField<String>) = apply {
                this.displayName = displayName
            }

            /**
             * <key, value> pairs of the billable metric group key values and their display names.
             * e.g. {"a": "Asia", "b": "Euro"}
             */
            fun valueDisplayNames(valueDisplayNames: ValueDisplayNames) =
                valueDisplayNames(JsonField.of(valueDisplayNames))

            /**
             * Sets [Builder.valueDisplayNames] to an arbitrary JSON value.
             *
             * You should usually call [Builder.valueDisplayNames] with a well-typed
             * [ValueDisplayNames] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun valueDisplayNames(valueDisplayNames: JsonField<ValueDisplayNames>) = apply {
                this.valueDisplayNames = valueDisplayNames
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
             * Returns an immutable instance of [BmGroupKeyOverride].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .groupKeyName()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): BmGroupKeyOverride =
                BmGroupKeyOverride(
                    checkRequired("groupKeyName", groupKeyName),
                    displayName,
                    valueDisplayNames,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): BmGroupKeyOverride = apply {
            if (validated) {
                return@apply
            }

            groupKeyName()
            displayName()
            valueDisplayNames().ifPresent { it.validate() }
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
            (if (groupKeyName.asKnown().isPresent) 1 else 0) +
                (if (displayName.asKnown().isPresent) 1 else 0) +
                (valueDisplayNames.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * <key, value> pairs of the billable metric group key values and their display names. e.g.
         * {"a": "Asia", "b": "Euro"}
         */
        class ValueDisplayNames
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

                /**
                 * Returns a mutable builder for constructing an instance of [ValueDisplayNames].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ValueDisplayNames]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(valueDisplayNames: ValueDisplayNames) = apply {
                    additionalProperties = valueDisplayNames.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [ValueDisplayNames].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ValueDisplayNames =
                    ValueDisplayNames(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): ValueDisplayNames = apply {
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

                return other is ValueDisplayNames &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ValueDisplayNames{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BmGroupKeyOverride &&
                groupKeyName == other.groupKeyName &&
                displayName == other.displayName &&
                valueDisplayNames == other.valueDisplayNames &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(groupKeyName, displayName, valueDisplayNames, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BmGroupKeyOverride{groupKeyName=$groupKeyName, displayName=$displayName, valueDisplayNames=$valueDisplayNames, additionalProperties=$additionalProperties}"
    }

    class ColorOverride
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val name: JsonField<Name>,
        private val value: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<Name> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
        ) : this(name, value, mutableMapOf())

        /**
         * The color to override
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<Name> = name.getOptional("name")

        /**
         * Hex value representation of the color
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun value(): Optional<String> = value.getOptional("value")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<Name> = name

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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

            /** Returns a mutable builder for constructing an instance of [ColorOverride]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ColorOverride]. */
        class Builder internal constructor() {

            private var name: JsonField<Name> = JsonMissing.of()
            private var value: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(colorOverride: ColorOverride) = apply {
                name = colorOverride.name
                value = colorOverride.value
                additionalProperties = colorOverride.additionalProperties.toMutableMap()
            }

            /** The color to override */
            fun name(name: Name) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [Name] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<Name>) = apply { this.name = name }

            /** Hex value representation of the color */
            fun value(value: String) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<String>) = apply { this.value = value }

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
             * Returns an immutable instance of [ColorOverride].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ColorOverride =
                ColorOverride(name, value, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): ColorOverride = apply {
            if (validated) {
                return@apply
            }

            name().ifPresent { it.validate() }
            value()
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
            (name.asKnown().getOrNull()?.validity() ?: 0) +
                (if (value.asKnown().isPresent) 1 else 0)

        /** The color to override */
        class Name @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val GRAY_DARK = of("Gray_dark")

                @JvmField val GRAY_MEDIUM = of("Gray_medium")

                @JvmField val GRAY_LIGHT = of("Gray_light")

                @JvmField val GRAY_EXTRALIGHT = of("Gray_extralight")

                @JvmField val WHITE = of("White")

                @JvmField val PRIMARY_MEDIUM = of("Primary_medium")

                @JvmField val PRIMARY_LIGHT = of("Primary_light")

                @JvmField val USAGE_LINE_0 = of("UsageLine_0")

                @JvmField val USAGE_LINE_1 = of("UsageLine_1")

                @JvmField val USAGE_LINE_2 = of("UsageLine_2")

                @JvmField val USAGE_LINE_3 = of("UsageLine_3")

                @JvmField val USAGE_LINE_4 = of("UsageLine_4")

                @JvmField val USAGE_LINE_5 = of("UsageLine_5")

                @JvmField val USAGE_LINE_6 = of("UsageLine_6")

                @JvmField val USAGE_LINE_7 = of("UsageLine_7")

                @JvmField val USAGE_LINE_8 = of("UsageLine_8")

                @JvmField val USAGE_LINE_9 = of("UsageLine_9")

                @JvmField val PRIMARY_GREEN = of("Primary_green")

                @JvmField val PRIMARY_RED = of("Primary_red")

                @JvmField val PROGRESS_BAR = of("Progress_bar")

                @JvmField val PROGRESS_BAR_BACKGROUND = of("Progress_bar_background")

                @JvmStatic fun of(value: String) = Name(JsonField.of(value))
            }

            /** An enum containing [Name]'s known values. */
            enum class Known {
                GRAY_DARK,
                GRAY_MEDIUM,
                GRAY_LIGHT,
                GRAY_EXTRALIGHT,
                WHITE,
                PRIMARY_MEDIUM,
                PRIMARY_LIGHT,
                USAGE_LINE_0,
                USAGE_LINE_1,
                USAGE_LINE_2,
                USAGE_LINE_3,
                USAGE_LINE_4,
                USAGE_LINE_5,
                USAGE_LINE_6,
                USAGE_LINE_7,
                USAGE_LINE_8,
                USAGE_LINE_9,
                PRIMARY_GREEN,
                PRIMARY_RED,
                PROGRESS_BAR,
                PROGRESS_BAR_BACKGROUND,
            }

            /**
             * An enum containing [Name]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Name] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                GRAY_DARK,
                GRAY_MEDIUM,
                GRAY_LIGHT,
                GRAY_EXTRALIGHT,
                WHITE,
                PRIMARY_MEDIUM,
                PRIMARY_LIGHT,
                USAGE_LINE_0,
                USAGE_LINE_1,
                USAGE_LINE_2,
                USAGE_LINE_3,
                USAGE_LINE_4,
                USAGE_LINE_5,
                USAGE_LINE_6,
                USAGE_LINE_7,
                USAGE_LINE_8,
                USAGE_LINE_9,
                PRIMARY_GREEN,
                PRIMARY_RED,
                PROGRESS_BAR,
                PROGRESS_BAR_BACKGROUND,
                /** An enum member indicating that [Name] was instantiated with an unknown value. */
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
                    GRAY_DARK -> Value.GRAY_DARK
                    GRAY_MEDIUM -> Value.GRAY_MEDIUM
                    GRAY_LIGHT -> Value.GRAY_LIGHT
                    GRAY_EXTRALIGHT -> Value.GRAY_EXTRALIGHT
                    WHITE -> Value.WHITE
                    PRIMARY_MEDIUM -> Value.PRIMARY_MEDIUM
                    PRIMARY_LIGHT -> Value.PRIMARY_LIGHT
                    USAGE_LINE_0 -> Value.USAGE_LINE_0
                    USAGE_LINE_1 -> Value.USAGE_LINE_1
                    USAGE_LINE_2 -> Value.USAGE_LINE_2
                    USAGE_LINE_3 -> Value.USAGE_LINE_3
                    USAGE_LINE_4 -> Value.USAGE_LINE_4
                    USAGE_LINE_5 -> Value.USAGE_LINE_5
                    USAGE_LINE_6 -> Value.USAGE_LINE_6
                    USAGE_LINE_7 -> Value.USAGE_LINE_7
                    USAGE_LINE_8 -> Value.USAGE_LINE_8
                    USAGE_LINE_9 -> Value.USAGE_LINE_9
                    PRIMARY_GREEN -> Value.PRIMARY_GREEN
                    PRIMARY_RED -> Value.PRIMARY_RED
                    PROGRESS_BAR -> Value.PROGRESS_BAR
                    PROGRESS_BAR_BACKGROUND -> Value.PROGRESS_BAR_BACKGROUND
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
                    GRAY_DARK -> Known.GRAY_DARK
                    GRAY_MEDIUM -> Known.GRAY_MEDIUM
                    GRAY_LIGHT -> Known.GRAY_LIGHT
                    GRAY_EXTRALIGHT -> Known.GRAY_EXTRALIGHT
                    WHITE -> Known.WHITE
                    PRIMARY_MEDIUM -> Known.PRIMARY_MEDIUM
                    PRIMARY_LIGHT -> Known.PRIMARY_LIGHT
                    USAGE_LINE_0 -> Known.USAGE_LINE_0
                    USAGE_LINE_1 -> Known.USAGE_LINE_1
                    USAGE_LINE_2 -> Known.USAGE_LINE_2
                    USAGE_LINE_3 -> Known.USAGE_LINE_3
                    USAGE_LINE_4 -> Known.USAGE_LINE_4
                    USAGE_LINE_5 -> Known.USAGE_LINE_5
                    USAGE_LINE_6 -> Known.USAGE_LINE_6
                    USAGE_LINE_7 -> Known.USAGE_LINE_7
                    USAGE_LINE_8 -> Known.USAGE_LINE_8
                    USAGE_LINE_9 -> Known.USAGE_LINE_9
                    PRIMARY_GREEN -> Known.PRIMARY_GREEN
                    PRIMARY_RED -> Known.PRIMARY_RED
                    PROGRESS_BAR -> Known.PROGRESS_BAR
                    PROGRESS_BAR_BACKGROUND -> Known.PROGRESS_BAR_BACKGROUND
                    else -> throw MetronomeInvalidDataException("Unknown Name: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Name = apply {
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

                return other is Name && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ColorOverride &&
                name == other.name &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(name, value, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ColorOverride{name=$name, value=$value, additionalProperties=$additionalProperties}"
    }

    class DashboardOption
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val key: JsonField<String>,
        private val value: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("key") @ExcludeMissing key: JsonField<String> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
        ) : this(key, value, mutableMapOf())

        /**
         * The option key name
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun key(): String = key.getRequired("key")

        /**
         * The option value
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun value(): String = value.getRequired("value")

        /**
         * Returns the raw JSON value of [key].
         *
         * Unlike [key], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
             * Returns a mutable builder for constructing an instance of [DashboardOption].
             *
             * The following fields are required:
             * ```java
             * .key()
             * .value()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DashboardOption]. */
        class Builder internal constructor() {

            private var key: JsonField<String>? = null
            private var value: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(dashboardOption: DashboardOption) = apply {
                key = dashboardOption.key
                value = dashboardOption.value
                additionalProperties = dashboardOption.additionalProperties.toMutableMap()
            }

            /** The option key name */
            fun key(key: String) = key(JsonField.of(key))

            /**
             * Sets [Builder.key] to an arbitrary JSON value.
             *
             * You should usually call [Builder.key] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun key(key: JsonField<String>) = apply { this.key = key }

            /** The option value */
            fun value(value: String) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<String>) = apply { this.value = value }

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
             * Returns an immutable instance of [DashboardOption].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .key()
             * .value()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): DashboardOption =
                DashboardOption(
                    checkRequired("key", key),
                    checkRequired("value", value),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): DashboardOption = apply {
            if (validated) {
                return@apply
            }

            key()
            value()
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
            (if (key.asKnown().isPresent) 1 else 0) + (if (value.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DashboardOption &&
                key == other.key &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(key, value, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DashboardOption{key=$key, value=$value, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DashboardGetEmbeddableUrlParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "DashboardGetEmbeddableUrlParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
