// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
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
constructor(
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

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): DashboardGetEmbeddableUrlBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class DashboardGetEmbeddableUrlBody
    @JsonCreator
    internal constructor(
        @JsonProperty("customer_id") private val customerId: String,
        @JsonProperty("dashboard") private val dashboard: Dashboard,
        @JsonProperty("bm_group_key_overrides")
        private val bmGroupKeyOverrides: List<BmGroupKeyOverride>?,
        @JsonProperty("color_overrides") private val colorOverrides: List<ColorOverride>?,
        @JsonProperty("dashboard_options") private val dashboardOptions: List<DashboardOption>?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("customer_id") fun customerId(): String = customerId

        /** The type of dashboard to retrieve. */
        @JsonProperty("dashboard") fun dashboard(): Dashboard = dashboard

        /** Optional list of billable metric group key overrides */
        @JsonProperty("bm_group_key_overrides")
        fun bmGroupKeyOverrides(): Optional<List<BmGroupKeyOverride>> =
            Optional.ofNullable(bmGroupKeyOverrides)

        /** Optional list of colors to override */
        @JsonProperty("color_overrides")
        fun colorOverrides(): Optional<List<ColorOverride>> = Optional.ofNullable(colorOverrides)

        /** Optional dashboard specific options */
        @JsonProperty("dashboard_options")
        fun dashboardOptions(): Optional<List<DashboardOption>> =
            Optional.ofNullable(dashboardOptions)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var customerId: String? = null
            private var dashboard: Dashboard? = null
            private var bmGroupKeyOverrides: MutableList<BmGroupKeyOverride>? = null
            private var colorOverrides: MutableList<ColorOverride>? = null
            private var dashboardOptions: MutableList<DashboardOption>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(dashboardGetEmbeddableUrlBody: DashboardGetEmbeddableUrlBody) =
                apply {
                    customerId = dashboardGetEmbeddableUrlBody.customerId
                    dashboard = dashboardGetEmbeddableUrlBody.dashboard
                    bmGroupKeyOverrides =
                        dashboardGetEmbeddableUrlBody.bmGroupKeyOverrides?.toMutableList()
                    colorOverrides = dashboardGetEmbeddableUrlBody.colorOverrides?.toMutableList()
                    dashboardOptions =
                        dashboardGetEmbeddableUrlBody.dashboardOptions?.toMutableList()
                    additionalProperties =
                        dashboardGetEmbeddableUrlBody.additionalProperties.toMutableMap()
                }

            fun customerId(customerId: String) = apply { this.customerId = customerId }

            /** The type of dashboard to retrieve. */
            fun dashboard(dashboard: Dashboard) = apply { this.dashboard = dashboard }

            /** Optional list of billable metric group key overrides */
            fun bmGroupKeyOverrides(bmGroupKeyOverrides: List<BmGroupKeyOverride>?) = apply {
                this.bmGroupKeyOverrides = bmGroupKeyOverrides?.toMutableList()
            }

            /** Optional list of billable metric group key overrides */
            fun bmGroupKeyOverrides(bmGroupKeyOverrides: Optional<List<BmGroupKeyOverride>>) =
                bmGroupKeyOverrides(bmGroupKeyOverrides.orElse(null))

            /** Optional list of billable metric group key overrides */
            fun addBmGroupKeyOverride(bmGroupKeyOverride: BmGroupKeyOverride) = apply {
                bmGroupKeyOverrides =
                    (bmGroupKeyOverrides ?: mutableListOf()).apply { add(bmGroupKeyOverride) }
            }

            /** Optional list of colors to override */
            fun colorOverrides(colorOverrides: List<ColorOverride>?) = apply {
                this.colorOverrides = colorOverrides?.toMutableList()
            }

            /** Optional list of colors to override */
            fun colorOverrides(colorOverrides: Optional<List<ColorOverride>>) =
                colorOverrides(colorOverrides.orElse(null))

            /** Optional list of colors to override */
            fun addColorOverride(colorOverride: ColorOverride) = apply {
                colorOverrides = (colorOverrides ?: mutableListOf()).apply { add(colorOverride) }
            }

            /** Optional dashboard specific options */
            fun dashboardOptions(dashboardOptions: List<DashboardOption>?) = apply {
                this.dashboardOptions = dashboardOptions?.toMutableList()
            }

            /** Optional dashboard specific options */
            fun dashboardOptions(dashboardOptions: Optional<List<DashboardOption>>) =
                dashboardOptions(dashboardOptions.orElse(null))

            /** Optional dashboard specific options */
            fun addDashboardOption(dashboardOption: DashboardOption) = apply {
                dashboardOptions =
                    (dashboardOptions ?: mutableListOf()).apply { add(dashboardOption) }
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
                    checkNotNull(customerId) { "`customerId` is required but was not set" },
                    checkNotNull(dashboard) { "`dashboard` is required but was not set" },
                    bmGroupKeyOverrides?.toImmutable(),
                    colorOverrides?.toImmutable(),
                    dashboardOptions?.toImmutable(),
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

    @NoAutoDetect
    class Builder {

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

        /** The type of dashboard to retrieve. */
        fun dashboard(dashboard: Dashboard) = apply { body.dashboard(dashboard) }

        /** Optional list of billable metric group key overrides */
        fun bmGroupKeyOverrides(bmGroupKeyOverrides: List<BmGroupKeyOverride>?) = apply {
            body.bmGroupKeyOverrides(bmGroupKeyOverrides)
        }

        /** Optional list of billable metric group key overrides */
        fun bmGroupKeyOverrides(bmGroupKeyOverrides: Optional<List<BmGroupKeyOverride>>) =
            bmGroupKeyOverrides(bmGroupKeyOverrides.orElse(null))

        /** Optional list of billable metric group key overrides */
        fun addBmGroupKeyOverride(bmGroupKeyOverride: BmGroupKeyOverride) = apply {
            body.addBmGroupKeyOverride(bmGroupKeyOverride)
        }

        /** Optional list of colors to override */
        fun colorOverrides(colorOverrides: List<ColorOverride>?) = apply {
            body.colorOverrides(colorOverrides)
        }

        /** Optional list of colors to override */
        fun colorOverrides(colorOverrides: Optional<List<ColorOverride>>) =
            colorOverrides(colorOverrides.orElse(null))

        /** Optional list of colors to override */
        fun addColorOverride(colorOverride: ColorOverride) = apply {
            body.addColorOverride(colorOverride)
        }

        /** Optional dashboard specific options */
        fun dashboardOptions(dashboardOptions: List<DashboardOption>?) = apply {
            body.dashboardOptions(dashboardOptions)
        }

        /** Optional dashboard specific options */
        fun dashboardOptions(dashboardOptions: Optional<List<DashboardOption>>) =
            dashboardOptions(dashboardOptions.orElse(null))

        /** Optional dashboard specific options */
        fun addDashboardOption(dashboardOption: DashboardOption) = apply {
            body.addDashboardOption(dashboardOption)
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

        fun build(): DashboardGetEmbeddableUrlParams =
            DashboardGetEmbeddableUrlParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class Dashboard
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val INVOICES = of("invoices")

            @JvmField val USAGE = of("usage")

            @JvmField val CREDITS = of("credits")

            @JvmStatic fun of(value: String) = Dashboard(JsonField.of(value))
        }

        enum class Known {
            INVOICES,
            USAGE,
            CREDITS,
        }

        enum class Value {
            INVOICES,
            USAGE,
            CREDITS,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INVOICES -> Value.INVOICES
                USAGE -> Value.USAGE
                CREDITS -> Value.CREDITS
                else -> Value._UNKNOWN
            }

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
        @JsonProperty("group_key_name") private val groupKeyName: String,
        @JsonProperty("display_name") private val displayName: String?,
        @JsonProperty("value_display_names") private val valueDisplayNames: ValueDisplayNames?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The name of the billable metric group key. */
        @JsonProperty("group_key_name") fun groupKeyName(): String = groupKeyName

        /** The display name for the billable metric group key */
        @JsonProperty("display_name")
        fun displayName(): Optional<String> = Optional.ofNullable(displayName)

        /**
         * <key, value> pairs of the billable metric group key values and their display names. e.g.
         * {"a": "Asia", "b": "Euro"}
         */
        @JsonProperty("value_display_names")
        fun valueDisplayNames(): Optional<ValueDisplayNames> =
            Optional.ofNullable(valueDisplayNames)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var groupKeyName: String? = null
            private var displayName: String? = null
            private var valueDisplayNames: ValueDisplayNames? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(bmGroupKeyOverride: BmGroupKeyOverride) = apply {
                groupKeyName = bmGroupKeyOverride.groupKeyName
                displayName = bmGroupKeyOverride.displayName
                valueDisplayNames = bmGroupKeyOverride.valueDisplayNames
                additionalProperties = bmGroupKeyOverride.additionalProperties.toMutableMap()
            }

            /** The name of the billable metric group key. */
            fun groupKeyName(groupKeyName: String) = apply { this.groupKeyName = groupKeyName }

            /** The display name for the billable metric group key */
            fun displayName(displayName: String?) = apply { this.displayName = displayName }

            /** The display name for the billable metric group key */
            fun displayName(displayName: Optional<String>) = displayName(displayName.orElse(null))

            /**
             * <key, value> pairs of the billable metric group key values and their display names.
             * e.g. {"a": "Asia", "b": "Euro"}
             */
            fun valueDisplayNames(valueDisplayNames: ValueDisplayNames?) = apply {
                this.valueDisplayNames = valueDisplayNames
            }

            /**
             * <key, value> pairs of the billable metric group key values and their display names.
             * e.g. {"a": "Asia", "b": "Euro"}
             */
            fun valueDisplayNames(valueDisplayNames: Optional<ValueDisplayNames>) =
                valueDisplayNames(valueDisplayNames.orElse(null))

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
                    checkNotNull(groupKeyName) { "`groupKeyName` is required but was not set" },
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

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

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
        @JsonProperty("name") private val name: Name?,
        @JsonProperty("value") private val value: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The color to override */
        @JsonProperty("name") fun name(): Optional<Name> = Optional.ofNullable(name)

        /** Hex value representation of the color */
        @JsonProperty("value") fun value(): Optional<String> = Optional.ofNullable(value)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: Name? = null
            private var value: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(colorOverride: ColorOverride) = apply {
                name = colorOverride.name
                value = colorOverride.value
                additionalProperties = colorOverride.additionalProperties.toMutableMap()
            }

            /** The color to override */
            fun name(name: Name?) = apply { this.name = name }

            /** The color to override */
            fun name(name: Optional<Name>) = name(name.orElse(null))

            /** Hex value representation of the color */
            fun value(value: String?) = apply { this.value = value }

            /** Hex value representation of the color */
            fun value(value: Optional<String>) = value(value.orElse(null))

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

        class Name
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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
                _UNKNOWN,
            }

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
        @JsonProperty("key") private val key: String,
        @JsonProperty("value") private val value: String,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The option key name */
        @JsonProperty("key") fun key(): String = key

        /** The option value */
        @JsonProperty("value") fun value(): String = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var key: String? = null
            private var value: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(dashboardOption: DashboardOption) = apply {
                key = dashboardOption.key
                value = dashboardOption.value
                additionalProperties = dashboardOption.additionalProperties.toMutableMap()
            }

            /** The option key name */
            fun key(key: String) = apply { this.key = key }

            /** The option value */
            fun value(value: String) = apply { this.value = value }

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
                    checkNotNull(key) { "`key` is required but was not set" },
                    checkNotNull(value) { "`value` is required but was not set" },
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
