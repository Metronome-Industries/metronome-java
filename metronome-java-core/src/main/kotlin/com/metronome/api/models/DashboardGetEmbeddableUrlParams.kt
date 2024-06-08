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
import com.metronome.api.core.toUnmodifiable
import com.metronome.api.errors.MetronomeInvalidDataException
import com.metronome.api.models.*
import java.util.Objects
import java.util.Optional

class DashboardGetEmbeddableUrlParams
constructor(
    private val customerId: String,
    private val dashboard: Dashboard,
    private val colorOverrides: List<ColorOverride>?,
    private val dashboardOptions: List<DashboardOption>?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun customerId(): String = customerId

    fun dashboard(): Dashboard = dashboard

    fun colorOverrides(): Optional<List<ColorOverride>> = Optional.ofNullable(colorOverrides)

    fun dashboardOptions(): Optional<List<DashboardOption>> = Optional.ofNullable(dashboardOptions)

    @JvmSynthetic
    internal fun getBody(): DashboardGetEmbeddableUrlBody {
        return DashboardGetEmbeddableUrlBody(
            customerId,
            dashboard,
            colorOverrides,
            dashboardOptions,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = DashboardGetEmbeddableUrlBody.Builder::class)
    @NoAutoDetect
    class DashboardGetEmbeddableUrlBody
    internal constructor(
        private val customerId: String?,
        private val dashboard: Dashboard?,
        private val colorOverrides: List<ColorOverride>?,
        private val dashboardOptions: List<DashboardOption>?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("customer_id") fun customerId(): String? = customerId

        /** The type of dashboard to retrieve. */
        @JsonProperty("dashboard") fun dashboard(): Dashboard? = dashboard

        /** Optional list of colors to override */
        @JsonProperty("color_overrides") fun colorOverrides(): List<ColorOverride>? = colorOverrides

        /** Optional dashboard specific options */
        @JsonProperty("dashboard_options")
        fun dashboardOptions(): List<DashboardOption>? = dashboardOptions

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DashboardGetEmbeddableUrlBody &&
                this.customerId == other.customerId &&
                this.dashboard == other.dashboard &&
                this.colorOverrides == other.colorOverrides &&
                this.dashboardOptions == other.dashboardOptions &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        customerId,
                        dashboard,
                        colorOverrides,
                        dashboardOptions,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "DashboardGetEmbeddableUrlBody{customerId=$customerId, dashboard=$dashboard, colorOverrides=$colorOverrides, dashboardOptions=$dashboardOptions, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var customerId: String? = null
            private var dashboard: Dashboard? = null
            private var colorOverrides: List<ColorOverride>? = null
            private var dashboardOptions: List<DashboardOption>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(dashboardGetEmbeddableUrlBody: DashboardGetEmbeddableUrlBody) =
                apply {
                    this.customerId = dashboardGetEmbeddableUrlBody.customerId
                    this.dashboard = dashboardGetEmbeddableUrlBody.dashboard
                    this.colorOverrides = dashboardGetEmbeddableUrlBody.colorOverrides
                    this.dashboardOptions = dashboardGetEmbeddableUrlBody.dashboardOptions
                    additionalProperties(dashboardGetEmbeddableUrlBody.additionalProperties)
                }

            @JsonProperty("customer_id")
            fun customerId(customerId: String) = apply { this.customerId = customerId }

            /** The type of dashboard to retrieve. */
            @JsonProperty("dashboard")
            fun dashboard(dashboard: Dashboard) = apply { this.dashboard = dashboard }

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
                    colorOverrides?.toUnmodifiable(),
                    dashboardOptions?.toUnmodifiable(),
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DashboardGetEmbeddableUrlParams &&
            this.customerId == other.customerId &&
            this.dashboard == other.dashboard &&
            this.colorOverrides == other.colorOverrides &&
            this.dashboardOptions == other.dashboardOptions &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            customerId,
            dashboard,
            colorOverrides,
            dashboardOptions,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "DashboardGetEmbeddableUrlParams{customerId=$customerId, dashboard=$dashboard, colorOverrides=$colorOverrides, dashboardOptions=$dashboardOptions, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var customerId: String? = null
        private var dashboard: Dashboard? = null
        private var colorOverrides: MutableList<ColorOverride> = mutableListOf()
        private var dashboardOptions: MutableList<DashboardOption> = mutableListOf()
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dashboardGetEmbeddableUrlParams: DashboardGetEmbeddableUrlParams) =
            apply {
                this.customerId = dashboardGetEmbeddableUrlParams.customerId
                this.dashboard = dashboardGetEmbeddableUrlParams.dashboard
                this.colorOverrides(dashboardGetEmbeddableUrlParams.colorOverrides ?: listOf())
                this.dashboardOptions(dashboardGetEmbeddableUrlParams.dashboardOptions ?: listOf())
                additionalQueryParams(dashboardGetEmbeddableUrlParams.additionalQueryParams)
                additionalHeaders(dashboardGetEmbeddableUrlParams.additionalHeaders)
                additionalBodyProperties(dashboardGetEmbeddableUrlParams.additionalBodyProperties)
            }

        fun customerId(customerId: String) = apply { this.customerId = customerId }

        /** The type of dashboard to retrieve. */
        fun dashboard(dashboard: Dashboard) = apply { this.dashboard = dashboard }

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

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): DashboardGetEmbeddableUrlParams =
            DashboardGetEmbeddableUrlParams(
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                checkNotNull(dashboard) { "`dashboard` is required but was not set" },
                if (colorOverrides.size == 0) null else colorOverrides.toUnmodifiable(),
                if (dashboardOptions.size == 0) null else dashboardOptions.toUnmodifiable(),
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class Dashboard
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Dashboard && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val INVOICES = Dashboard(JsonField.of("invoices"))

            @JvmField val USAGE = Dashboard(JsonField.of("usage"))

            @JvmField val CREDITS = Dashboard(JsonField.of("credits"))

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
    }

    @JsonDeserialize(builder = ColorOverride.Builder::class)
    @NoAutoDetect
    class ColorOverride
    private constructor(
        private val name: Name?,
        private val value: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The color to override */
        @JsonProperty("name") fun name(): Name? = name

        /** Hex value representation of the color */
        @JsonProperty("value") fun value(): String? = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ColorOverride &&
                this.name == other.name &&
                this.value == other.value &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        name,
                        value,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "ColorOverride{name=$name, value=$value, additionalProperties=$additionalProperties}"

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
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Name
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Name && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val GRAY_DARK = Name(JsonField.of("Gray_dark"))

                @JvmField val GRAY_MEDIUM = Name(JsonField.of("Gray_medium"))

                @JvmField val GRAY_LIGHT = Name(JsonField.of("Gray_light"))

                @JvmField val GRAY_EXTRALIGHT = Name(JsonField.of("Gray_extralight"))

                @JvmField val WHITE = Name(JsonField.of("White"))

                @JvmField val PRIMARY_MEDIUM = Name(JsonField.of("Primary_medium"))

                @JvmField val PRIMARY_LIGHT = Name(JsonField.of("Primary_light"))

                @JvmField val USAGE_LINE_0 = Name(JsonField.of("UsageLine_0"))

                @JvmField val USAGE_LINE_1 = Name(JsonField.of("UsageLine_1"))

                @JvmField val USAGE_LINE_2 = Name(JsonField.of("UsageLine_2"))

                @JvmField val USAGE_LINE_3 = Name(JsonField.of("UsageLine_3"))

                @JvmField val USAGE_LINE_4 = Name(JsonField.of("UsageLine_4"))

                @JvmField val USAGE_LINE_5 = Name(JsonField.of("UsageLine_5"))

                @JvmField val USAGE_LINE_6 = Name(JsonField.of("UsageLine_6"))

                @JvmField val USAGE_LINE_7 = Name(JsonField.of("UsageLine_7"))

                @JvmField val USAGE_LINE_8 = Name(JsonField.of("UsageLine_8"))

                @JvmField val USAGE_LINE_9 = Name(JsonField.of("UsageLine_9"))

                @JvmField val PRIMARY_GREEN = Name(JsonField.of("Primary_green"))

                @JvmField val PRIMARY_RED = Name(JsonField.of("Primary_red"))

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
        }
    }

    @JsonDeserialize(builder = DashboardOption.Builder::class)
    @NoAutoDetect
    class DashboardOption
    private constructor(
        private val key: String?,
        private val value: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The option key name */
        @JsonProperty("key") fun key(): String? = key

        /** The option value */
        @JsonProperty("value") fun value(): String? = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DashboardOption &&
                this.key == other.key &&
                this.value == other.value &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        key,
                        value,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "DashboardOption{key=$key, value=$value, additionalProperties=$additionalProperties}"

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
                    additionalProperties.toUnmodifiable(),
                )
        }
    }
}
