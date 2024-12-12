// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.util.Objects
import java.util.Optional

class DashboardGetEmbeddableUrlParams
constructor(
    private val customerId: String,
    private val dashboard: Dashboard,
    private val bmGroupKeyOverrides: List<BmGroupKeyOverride>?,
    private val colorOverrides: List<ColorOverride>?,
    private val dashboardOptions: List<DashboardOption>?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun customerId(): String = customerId

    fun dashboard(): Dashboard = dashboard

    fun bmGroupKeyOverrides(): Optional<List<BmGroupKeyOverride>> =
        Optional.ofNullable(bmGroupKeyOverrides)

    fun colorOverrides(): Optional<List<ColorOverride>> = Optional.ofNullable(colorOverrides)

    fun dashboardOptions(): Optional<List<DashboardOption>> = Optional.ofNullable(dashboardOptions)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): DashboardGetEmbeddableUrlBody {
        return DashboardGetEmbeddableUrlBody(
            customerId,
            dashboard,
            bmGroupKeyOverrides,
            colorOverrides,
            dashboardOptions,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = DashboardGetEmbeddableUrlBody.Builder::class)
    @NoAutoDetect
    class DashboardGetEmbeddableUrlBody
    internal constructor(
        private val customerId: String?,
        private val dashboard: Dashboard?,
        private val bmGroupKeyOverrides: List<BmGroupKeyOverride>?,
        private val colorOverrides: List<ColorOverride>?,
        private val dashboardOptions: List<DashboardOption>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("customer_id") fun customerId(): String? = customerId

        /** The type of dashboard to retrieve. */
        @JsonProperty("dashboard") fun dashboard(): Dashboard? = dashboard

        /** Optional list of billable metric group key overrides */
        @JsonProperty("bm_group_key_overrides")
        fun bmGroupKeyOverrides(): List<BmGroupKeyOverride>? = bmGroupKeyOverrides

        /** Optional list of colors to override */
        @JsonProperty("color_overrides") fun colorOverrides(): List<ColorOverride>? = colorOverrides

        /** Optional dashboard specific options */
        @JsonProperty("dashboard_options")
        fun dashboardOptions(): List<DashboardOption>? = dashboardOptions

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
            private var bmGroupKeyOverrides: List<BmGroupKeyOverride>? = null
            private var colorOverrides: List<ColorOverride>? = null
            private var dashboardOptions: List<DashboardOption>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(dashboardGetEmbeddableUrlBody: DashboardGetEmbeddableUrlBody) =
                apply {
                    this.customerId = dashboardGetEmbeddableUrlBody.customerId
                    this.dashboard = dashboardGetEmbeddableUrlBody.dashboard
                    this.bmGroupKeyOverrides = dashboardGetEmbeddableUrlBody.bmGroupKeyOverrides
                    this.colorOverrides = dashboardGetEmbeddableUrlBody.colorOverrides
                    this.dashboardOptions = dashboardGetEmbeddableUrlBody.dashboardOptions
                    additionalProperties(dashboardGetEmbeddableUrlBody.additionalProperties)
                }

            @JsonProperty("customer_id")
            fun customerId(customerId: String) = apply { this.customerId = customerId }

            /** The type of dashboard to retrieve. */
            @JsonProperty("dashboard")
            fun dashboard(dashboard: Dashboard) = apply { this.dashboard = dashboard }

            /** Optional list of billable metric group key overrides */
            @JsonProperty("bm_group_key_overrides")
            fun bmGroupKeyOverrides(bmGroupKeyOverrides: List<BmGroupKeyOverride>) = apply {
                this.bmGroupKeyOverrides = bmGroupKeyOverrides
            }

            /** Optional list of colors to override */
            @JsonProperty("color_overrides")
            fun colorOverrides(colorOverrides: List<ColorOverride>) = apply {
                this.colorOverrides = colorOverrides
            }

            /** Optional dashboard specific options */
            @JsonProperty("dashboard_options")
            fun dashboardOptions(dashboardOptions: List<DashboardOption>) = apply {
                this.dashboardOptions = dashboardOptions
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
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

        private var customerId: String? = null
        private var dashboard: Dashboard? = null
        private var bmGroupKeyOverrides: MutableList<BmGroupKeyOverride> = mutableListOf()
        private var colorOverrides: MutableList<ColorOverride> = mutableListOf()
        private var dashboardOptions: MutableList<DashboardOption> = mutableListOf()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dashboardGetEmbeddableUrlParams: DashboardGetEmbeddableUrlParams) =
            apply {
                customerId = dashboardGetEmbeddableUrlParams.customerId
                dashboard = dashboardGetEmbeddableUrlParams.dashboard
                bmGroupKeyOverrides =
                    dashboardGetEmbeddableUrlParams.bmGroupKeyOverrides?.toMutableList()
                        ?: mutableListOf()
                colorOverrides =
                    dashboardGetEmbeddableUrlParams.colorOverrides?.toMutableList()
                        ?: mutableListOf()
                dashboardOptions =
                    dashboardGetEmbeddableUrlParams.dashboardOptions?.toMutableList()
                        ?: mutableListOf()
                additionalHeaders = dashboardGetEmbeddableUrlParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    dashboardGetEmbeddableUrlParams.additionalQueryParams.toBuilder()
                additionalBodyProperties =
                    dashboardGetEmbeddableUrlParams.additionalBodyProperties.toMutableMap()
            }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /** The type of dashboard to retrieve. */
        fun dashboard(dashboard: Dashboard) = apply { this.dashboard = dashboard }

        /** Optional list of billable metric group key overrides */
        fun bmGroupKeyOverrides(bmGroupKeyOverrides: List<BmGroupKeyOverride>) = apply {
            this.bmGroupKeyOverrides.clear()
            this.bmGroupKeyOverrides.addAll(bmGroupKeyOverrides)
        }

        /** Optional list of billable metric group key overrides */
        fun addBmGroupKeyOverride(bmGroupKeyOverride: BmGroupKeyOverride) = apply {
            this.bmGroupKeyOverrides.add(bmGroupKeyOverride)
        }

        /** Optional list of colors to override */
        fun colorOverrides(colorOverrides: List<ColorOverride>) = apply {
            this.colorOverrides.clear()
            this.colorOverrides.addAll(colorOverrides)
        }

        /** Optional list of colors to override */
        fun addColorOverride(colorOverride: ColorOverride) = apply {
            this.colorOverrides.add(colorOverride)
        }

        /** Optional dashboard specific options */
        fun dashboardOptions(dashboardOptions: List<DashboardOption>) = apply {
            this.dashboardOptions.clear()
            this.dashboardOptions.addAll(dashboardOptions)
        }

        /** Optional dashboard specific options */
        fun addDashboardOption(dashboardOption: DashboardOption) = apply {
            this.dashboardOptions.add(dashboardOption)
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
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): DashboardGetEmbeddableUrlParams =
            DashboardGetEmbeddableUrlParams(
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                checkNotNull(dashboard) { "`dashboard` is required but was not set" },
                bmGroupKeyOverrides.toImmutable().ifEmpty { null },
                colorOverrides.toImmutable().ifEmpty { null },
                dashboardOptions.toImmutable().ifEmpty { null },
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
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

    @JsonDeserialize(builder = BmGroupKeyOverride.Builder::class)
    @NoAutoDetect
    class BmGroupKeyOverride
    private constructor(
        private val groupKeyName: String?,
        private val displayName: String?,
        private val valueDisplayNames: ValueDisplayNames?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The name of the billable metric group key. */
        @JsonProperty("group_key_name") fun groupKeyName(): String? = groupKeyName

        /** The display name for the billable metric group key */
        @JsonProperty("display_name") fun displayName(): String? = displayName

        /**
         * <key, value> pairs of the billable metric group key values and their display names. e.g.
         * {"a": "Asia", "b": "Euro"}
         */
        @JsonProperty("value_display_names")
        fun valueDisplayNames(): ValueDisplayNames? = valueDisplayNames

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
                this.groupKeyName = bmGroupKeyOverride.groupKeyName
                this.displayName = bmGroupKeyOverride.displayName
                this.valueDisplayNames = bmGroupKeyOverride.valueDisplayNames
                additionalProperties(bmGroupKeyOverride.additionalProperties)
            }

            /** The name of the billable metric group key. */
            @JsonProperty("group_key_name")
            fun groupKeyName(groupKeyName: String) = apply { this.groupKeyName = groupKeyName }

            /** The display name for the billable metric group key */
            @JsonProperty("display_name")
            fun displayName(displayName: String) = apply { this.displayName = displayName }

            /**
             * <key, value> pairs of the billable metric group key values and their display names.
             * e.g. {"a": "Asia", "b": "Euro"}
             */
            @JsonProperty("value_display_names")
            fun valueDisplayNames(valueDisplayNames: ValueDisplayNames) = apply {
                this.valueDisplayNames = valueDisplayNames
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
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
        @JsonDeserialize(builder = ValueDisplayNames.Builder::class)
        @NoAutoDetect
        class ValueDisplayNames
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
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
                    additionalProperties(valueDisplayNames.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
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

    @JsonDeserialize(builder = ColorOverride.Builder::class)
    @NoAutoDetect
    class ColorOverride
    private constructor(
        private val name: Name?,
        private val value: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The color to override */
        @JsonProperty("name") fun name(): Name? = name

        /** Hex value representation of the color */
        @JsonProperty("value") fun value(): String? = value

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
                this.name = colorOverride.name
                this.value = colorOverride.value
                additionalProperties(colorOverride.additionalProperties)
            }

            /** The color to override */
            @JsonProperty("name") fun name(name: Name) = apply { this.name = name }

            /** Hex value representation of the color */
            @JsonProperty("value") fun value(value: String) = apply { this.value = value }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
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

    @JsonDeserialize(builder = DashboardOption.Builder::class)
    @NoAutoDetect
    class DashboardOption
    private constructor(
        private val key: String?,
        private val value: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The option key name */
        @JsonProperty("key") fun key(): String? = key

        /** The option value */
        @JsonProperty("value") fun value(): String? = value

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
                this.key = dashboardOption.key
                this.value = dashboardOption.value
                additionalProperties(dashboardOption.additionalProperties)
            }

            /** The option key name */
            @JsonProperty("key") fun key(key: String) = apply { this.key = key }

            /** The option value */
            @JsonProperty("value") fun value(value: String) = apply { this.value = value }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
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

        return /* spotless:off */ other is DashboardGetEmbeddableUrlParams && customerId == other.customerId && dashboard == other.dashboard && bmGroupKeyOverrides == other.bmGroupKeyOverrides && colorOverrides == other.colorOverrides && dashboardOptions == other.dashboardOptions && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(customerId, dashboard, bmGroupKeyOverrides, colorOverrides, dashboardOptions, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "DashboardGetEmbeddableUrlParams{customerId=$customerId, dashboard=$dashboard, bmGroupKeyOverrides=$bmGroupKeyOverrides, colorOverrides=$colorOverrides, dashboardOptions=$dashboardOptions, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
