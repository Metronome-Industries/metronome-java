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
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.util.Objects
import java.util.Optional

/**
 * Retrieve an embeddable dashboard url for a customer. The dashboard can be embedded using an
 * iframe in a website. This will show information such as usage data and customer invoices.
 */
class DashboardGetEmbeddableUrlParams
private constructor(
    private val body: DashboardGetEmbeddableUrlBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun customerId(): String = body.customerId()

    /** The type of dashboard to retrieve. */
    fun dashboard(): Dashboard = body.dashboard()

    /** Optional list of billable metric group key overrides */
    fun bmGroupKeyOverrides(): Optional<List<BmGroupKeyOverride>> = body.bmGroupKeyOverrides()

    /** Optional list of colors to override */
    fun colorOverrides(): Optional<List<ColorOverride>> = body.colorOverrides()

    /** Optional dashboard specific options */
    fun dashboardOptions(): Optional<List<DashboardOption>> = body.dashboardOptions()

    fun _customerId(): JsonField<String> = body._customerId()

    /** The type of dashboard to retrieve. */
    fun _dashboard(): JsonField<Dashboard> = body._dashboard()

    /** Optional list of billable metric group key overrides */
    fun _bmGroupKeyOverrides(): JsonField<List<BmGroupKeyOverride>> = body._bmGroupKeyOverrides()

    /** Optional list of colors to override */
    fun _colorOverrides(): JsonField<List<ColorOverride>> = body._colorOverrides()

    /** Optional dashboard specific options */
    fun _dashboardOptions(): JsonField<List<DashboardOption>> = body._dashboardOptions()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): DashboardGetEmbeddableUrlBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class DashboardGetEmbeddableUrlBody
    @JsonCreator
    internal constructor(
        @JsonProperty("customer_id")
        @ExcludeMissing
        private val customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("dashboard")
        @ExcludeMissing
        private val dashboard: JsonField<Dashboard> = JsonMissing.of(),
        @JsonProperty("bm_group_key_overrides")
        @ExcludeMissing
        private val bmGroupKeyOverrides: JsonField<List<BmGroupKeyOverride>> = JsonMissing.of(),
        @JsonProperty("color_overrides")
        @ExcludeMissing
        private val colorOverrides: JsonField<List<ColorOverride>> = JsonMissing.of(),
        @JsonProperty("dashboard_options")
        @ExcludeMissing
        private val dashboardOptions: JsonField<List<DashboardOption>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun customerId(): String = customerId.getRequired("customer_id")

        /** The type of dashboard to retrieve. */
        fun dashboard(): Dashboard = dashboard.getRequired("dashboard")

        /** Optional list of billable metric group key overrides */
        fun bmGroupKeyOverrides(): Optional<List<BmGroupKeyOverride>> =
            Optional.ofNullable(bmGroupKeyOverrides.getNullable("bm_group_key_overrides"))

        /** Optional list of colors to override */
        fun colorOverrides(): Optional<List<ColorOverride>> =
            Optional.ofNullable(colorOverrides.getNullable("color_overrides"))

        /** Optional dashboard specific options */
        fun dashboardOptions(): Optional<List<DashboardOption>> =
            Optional.ofNullable(dashboardOptions.getNullable("dashboard_options"))

        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /** The type of dashboard to retrieve. */
        @JsonProperty("dashboard")
        @ExcludeMissing
        fun _dashboard(): JsonField<Dashboard> = dashboard

        /** Optional list of billable metric group key overrides */
        @JsonProperty("bm_group_key_overrides")
        @ExcludeMissing
        fun _bmGroupKeyOverrides(): JsonField<List<BmGroupKeyOverride>> = bmGroupKeyOverrides

        /** Optional list of colors to override */
        @JsonProperty("color_overrides")
        @ExcludeMissing
        fun _colorOverrides(): JsonField<List<ColorOverride>> = colorOverrides

        /** Optional dashboard specific options */
        @JsonProperty("dashboard_options")
        @ExcludeMissing
        fun _dashboardOptions(): JsonField<List<DashboardOption>> = dashboardOptions

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): DashboardGetEmbeddableUrlBody = apply {
            if (validated) {
                return@apply
            }

            customerId()
            dashboard()
            bmGroupKeyOverrides().ifPresent { it.forEach { it.validate() } }
            colorOverrides().ifPresent { it.forEach { it.validate() } }
            dashboardOptions().ifPresent { it.forEach { it.validate() } }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [DashboardGetEmbeddableUrlBody]. */
        class Builder internal constructor() {

            private var customerId: JsonField<String>? = null
            private var dashboard: JsonField<Dashboard>? = null
            private var bmGroupKeyOverrides: JsonField<MutableList<BmGroupKeyOverride>>? = null
            private var colorOverrides: JsonField<MutableList<ColorOverride>>? = null
            private var dashboardOptions: JsonField<MutableList<DashboardOption>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(dashboardGetEmbeddableUrlBody: DashboardGetEmbeddableUrlBody) =
                apply {
                    customerId = dashboardGetEmbeddableUrlBody.customerId
                    dashboard = dashboardGetEmbeddableUrlBody.dashboard
                    bmGroupKeyOverrides =
                        dashboardGetEmbeddableUrlBody.bmGroupKeyOverrides.map { it.toMutableList() }
                    colorOverrides =
                        dashboardGetEmbeddableUrlBody.colorOverrides.map { it.toMutableList() }
                    dashboardOptions =
                        dashboardGetEmbeddableUrlBody.dashboardOptions.map { it.toMutableList() }
                    additionalProperties =
                        dashboardGetEmbeddableUrlBody.additionalProperties.toMutableMap()
                }

            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            /** The type of dashboard to retrieve. */
            fun dashboard(dashboard: Dashboard) = dashboard(JsonField.of(dashboard))

            /** The type of dashboard to retrieve. */
            fun dashboard(dashboard: JsonField<Dashboard>) = apply { this.dashboard = dashboard }

            /** Optional list of billable metric group key overrides */
            fun bmGroupKeyOverrides(bmGroupKeyOverrides: List<BmGroupKeyOverride>) =
                bmGroupKeyOverrides(JsonField.of(bmGroupKeyOverrides))

            /** Optional list of billable metric group key overrides */
            fun bmGroupKeyOverrides(bmGroupKeyOverrides: JsonField<List<BmGroupKeyOverride>>) =
                apply {
                    this.bmGroupKeyOverrides = bmGroupKeyOverrides.map { it.toMutableList() }
                }

            /** Optional list of billable metric group key overrides */
            fun addBmGroupKeyOverride(bmGroupKeyOverride: BmGroupKeyOverride) = apply {
                bmGroupKeyOverrides =
                    (bmGroupKeyOverrides ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(bmGroupKeyOverride)
                    }
            }

            /** Optional list of colors to override */
            fun colorOverrides(colorOverrides: List<ColorOverride>) =
                colorOverrides(JsonField.of(colorOverrides))

            /** Optional list of colors to override */
            fun colorOverrides(colorOverrides: JsonField<List<ColorOverride>>) = apply {
                this.colorOverrides = colorOverrides.map { it.toMutableList() }
            }

            /** Optional list of colors to override */
            fun addColorOverride(colorOverride: ColorOverride) = apply {
                colorOverrides =
                    (colorOverrides ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(colorOverride)
                    }
            }

            /** Optional dashboard specific options */
            fun dashboardOptions(dashboardOptions: List<DashboardOption>) =
                dashboardOptions(JsonField.of(dashboardOptions))

            /** Optional dashboard specific options */
            fun dashboardOptions(dashboardOptions: JsonField<List<DashboardOption>>) = apply {
                this.dashboardOptions = dashboardOptions.map { it.toMutableList() }
            }

            /** Optional dashboard specific options */
            fun addDashboardOption(dashboardOption: DashboardOption) = apply {
                dashboardOptions =
                    (dashboardOptions ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(dashboardOption)
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

            fun build(): DashboardGetEmbeddableUrlBody =
                DashboardGetEmbeddableUrlBody(
                    checkRequired("customerId", customerId),
                    checkRequired("dashboard", dashboard),
                    (bmGroupKeyOverrides ?: JsonMissing.of()).map { it.toImmutable() },
                    (colorOverrides ?: JsonMissing.of()).map { it.toImmutable() },
                    (dashboardOptions ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DashboardGetEmbeddableUrlBody && customerId == other.customerId && dashboard == other.dashboard && bmGroupKeyOverrides == other.bmGroupKeyOverrides && colorOverrides == other.colorOverrides && dashboardOptions == other.dashboardOptions && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(customerId, dashboard, bmGroupKeyOverrides, colorOverrides, dashboardOptions, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DashboardGetEmbeddableUrlBody{customerId=$customerId, dashboard=$dashboard, bmGroupKeyOverrides=$bmGroupKeyOverrides, colorOverrides=$colorOverrides, dashboardOptions=$dashboardOptions, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DashboardGetEmbeddableUrlParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: DashboardGetEmbeddableUrlBody.Builder =
            DashboardGetEmbeddableUrlBody.builder()
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

        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        /** The type of dashboard to retrieve. */
        fun dashboard(dashboard: Dashboard) = apply { body.dashboard(dashboard) }

        /** The type of dashboard to retrieve. */
        fun dashboard(dashboard: JsonField<Dashboard>) = apply { body.dashboard(dashboard) }

        /** Optional list of billable metric group key overrides */
        fun bmGroupKeyOverrides(bmGroupKeyOverrides: List<BmGroupKeyOverride>) = apply {
            body.bmGroupKeyOverrides(bmGroupKeyOverrides)
        }

        /** Optional list of billable metric group key overrides */
        fun bmGroupKeyOverrides(bmGroupKeyOverrides: JsonField<List<BmGroupKeyOverride>>) = apply {
            body.bmGroupKeyOverrides(bmGroupKeyOverrides)
        }

        /** Optional list of billable metric group key overrides */
        fun addBmGroupKeyOverride(bmGroupKeyOverride: BmGroupKeyOverride) = apply {
            body.addBmGroupKeyOverride(bmGroupKeyOverride)
        }

        /** Optional list of colors to override */
        fun colorOverrides(colorOverrides: List<ColorOverride>) = apply {
            body.colorOverrides(colorOverrides)
        }

        /** Optional list of colors to override */
        fun colorOverrides(colorOverrides: JsonField<List<ColorOverride>>) = apply {
            body.colorOverrides(colorOverrides)
        }

        /** Optional list of colors to override */
        fun addColorOverride(colorOverride: ColorOverride) = apply {
            body.addColorOverride(colorOverride)
        }

        /** Optional dashboard specific options */
        fun dashboardOptions(dashboardOptions: List<DashboardOption>) = apply {
            body.dashboardOptions(dashboardOptions)
        }

        /** Optional dashboard specific options */
        fun dashboardOptions(dashboardOptions: JsonField<List<DashboardOption>>) = apply {
            body.dashboardOptions(dashboardOptions)
        }

        /** Optional dashboard specific options */
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

        fun build(): DashboardGetEmbeddableUrlParams =
            DashboardGetEmbeddableUrlParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** The type of dashboard to retrieve. */
    class Dashboard
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

            @JvmStatic fun of(value: String) = Dashboard(JsonField.of(value))
        }

        /** An enum containing [Dashboard]'s known values. */
        enum class Known {
            INVOICES,
            USAGE,
            CREDITS,
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
                else -> throw MetronomeInvalidDataException("Unknown Dashboard: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Dashboard && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class BmGroupKeyOverride
    @JsonCreator
    private constructor(
        @JsonProperty("group_key_name")
        @ExcludeMissing
        private val groupKeyName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("display_name")
        @ExcludeMissing
        private val displayName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("value_display_names")
        @ExcludeMissing
        private val valueDisplayNames: JsonField<ValueDisplayNames> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The name of the billable metric group key. */
        fun groupKeyName(): String = groupKeyName.getRequired("group_key_name")

        /** The display name for the billable metric group key */
        fun displayName(): Optional<String> =
            Optional.ofNullable(displayName.getNullable("display_name"))

        /**
         * <key, value> pairs of the billable metric group key values and their display names. e.g.
         * {"a": "Asia", "b": "Euro"}
         */
        fun valueDisplayNames(): Optional<ValueDisplayNames> =
            Optional.ofNullable(valueDisplayNames.getNullable("value_display_names"))

        /** The name of the billable metric group key. */
        @JsonProperty("group_key_name")
        @ExcludeMissing
        fun _groupKeyName(): JsonField<String> = groupKeyName

        /** The display name for the billable metric group key */
        @JsonProperty("display_name")
        @ExcludeMissing
        fun _displayName(): JsonField<String> = displayName

        /**
         * <key, value> pairs of the billable metric group key values and their display names. e.g.
         * {"a": "Asia", "b": "Euro"}
         */
        @JsonProperty("value_display_names")
        @ExcludeMissing
        fun _valueDisplayNames(): JsonField<ValueDisplayNames> = valueDisplayNames

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): BmGroupKeyOverride = apply {
            if (validated) {
                return@apply
            }

            groupKeyName()
            displayName()
            valueDisplayNames().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            /** The name of the billable metric group key. */
            fun groupKeyName(groupKeyName: JsonField<String>) = apply {
                this.groupKeyName = groupKeyName
            }

            /** The display name for the billable metric group key */
            fun displayName(displayName: String) = displayName(JsonField.of(displayName))

            /** The display name for the billable metric group key */
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
             * <key, value> pairs of the billable metric group key values and their display names.
             * e.g. {"a": "Asia", "b": "Euro"}
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

            fun build(): BmGroupKeyOverride =
                BmGroupKeyOverride(
                    checkRequired("groupKeyName", groupKeyName),
                    displayName,
                    valueDisplayNames,
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * <key, value> pairs of the billable metric group key values and their display names. e.g.
         * {"a": "Asia", "b": "Euro"}
         */
        @NoAutoDetect
        class ValueDisplayNames
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): ValueDisplayNames = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun build(): ValueDisplayNames =
                    ValueDisplayNames(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ValueDisplayNames && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ValueDisplayNames{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BmGroupKeyOverride && groupKeyName == other.groupKeyName && displayName == other.displayName && valueDisplayNames == other.valueDisplayNames && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(groupKeyName, displayName, valueDisplayNames, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BmGroupKeyOverride{groupKeyName=$groupKeyName, displayName=$displayName, valueDisplayNames=$valueDisplayNames, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class ColorOverride
    @JsonCreator
    private constructor(
        @JsonProperty("name") @ExcludeMissing private val name: JsonField<Name> = JsonMissing.of(),
        @JsonProperty("value")
        @ExcludeMissing
        private val value: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The color to override */
        fun name(): Optional<Name> = Optional.ofNullable(name.getNullable("name"))

        /** Hex value representation of the color */
        fun value(): Optional<String> = Optional.ofNullable(value.getNullable("value"))

        /** The color to override */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<Name> = name

        /** Hex value representation of the color */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ColorOverride = apply {
            if (validated) {
                return@apply
            }

            name()
            value()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            /** The color to override */
            fun name(name: JsonField<Name>) = apply { this.name = name }

            /** Hex value representation of the color */
            fun value(value: String) = value(JsonField.of(value))

            /** Hex value representation of the color */
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

            fun build(): ColorOverride =
                ColorOverride(
                    name,
                    value,
                    additionalProperties.toImmutable(),
                )
        }

        /** The color to override */
        class Name
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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
                    else -> throw MetronomeInvalidDataException("Unknown Name: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Name && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ColorOverride && name == other.name && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(name, value, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ColorOverride{name=$name, value=$value, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class DashboardOption
    @JsonCreator
    private constructor(
        @JsonProperty("key") @ExcludeMissing private val key: JsonField<String> = JsonMissing.of(),
        @JsonProperty("value")
        @ExcludeMissing
        private val value: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The option key name */
        fun key(): String = key.getRequired("key")

        /** The option value */
        fun value(): String = value.getRequired("value")

        /** The option key name */
        @JsonProperty("key") @ExcludeMissing fun _key(): JsonField<String> = key

        /** The option value */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): DashboardOption = apply {
            if (validated) {
                return@apply
            }

            key()
            value()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            /** The option key name */
            fun key(key: JsonField<String>) = apply { this.key = key }

            /** The option value */
            fun value(value: String) = value(JsonField.of(value))

            /** The option value */
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

            fun build(): DashboardOption =
                DashboardOption(
                    checkRequired("key", key),
                    checkRequired("value", value),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DashboardOption && key == other.key && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(key, value, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "DashboardOption{key=$key, value=$value, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DashboardGetEmbeddableUrlParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "DashboardGetEmbeddableUrlParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
