// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import com.metronome.api.models.*
import java.util.Objects
import java.util.Optional

class DashboardGetEmbeddableUrlParams
constructor(
    private val customerId: String,
    private val dashboard: Dashboard,
    private val bmGroupKeyOverrides: List<BmGroupKeyOverride>?,
    private val colorOverrides: List<ColorOverride>?,
    private val dashboardOptions: List<DashboardOption>?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun customerId(): String = customerId

    fun dashboard(): Dashboard = dashboard

    fun bmGroupKeyOverrides(): Optional<List<BmGroupKeyOverride>> =
        Optional.ofNullable(bmGroupKeyOverrides)

    fun colorOverrides(): Optional<List<ColorOverride>> = Optional.ofNullable(colorOverrides)

    fun dashboardOptions(): Optional<List<DashboardOption>> = Optional.ofNullable(dashboardOptions)

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

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

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

            return /* spotless:off */ other is DashboardGetEmbeddableUrlBody && this.customerId == other.customerId && this.dashboard == other.dashboard && this.bmGroupKeyOverrides == other.bmGroupKeyOverrides && this.colorOverrides == other.colorOverrides && this.dashboardOptions == other.dashboardOptions && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(customerId, dashboard, bmGroupKeyOverrides, colorOverrides, dashboardOptions, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "DashboardGetEmbeddableUrlBody{customerId=$customerId, dashboard=$dashboard, bmGroupKeyOverrides=$bmGroupKeyOverrides, colorOverrides=$colorOverrides, dashboardOptions=$dashboardOptions, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DashboardGetEmbeddableUrlParams && this.customerId == other.customerId && this.dashboard == other.dashboard && this.bmGroupKeyOverrides == other.bmGroupKeyOverrides && this.colorOverrides == other.colorOverrides && this.dashboardOptions == other.dashboardOptions && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(customerId, dashboard, bmGroupKeyOverrides, colorOverrides, dashboardOptions, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "DashboardGetEmbeddableUrlParams{customerId=$customerId, dashboard=$dashboard, bmGroupKeyOverrides=$bmGroupKeyOverrides, colorOverrides=$colorOverrides, dashboardOptions=$dashboardOptions, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

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
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(dashboardGetEmbeddableUrlParams: DashboardGetEmbeddableUrlParams) =
            apply {
                this.customerId = dashboardGetEmbeddableUrlParams.customerId
                this.dashboard = dashboardGetEmbeddableUrlParams.dashboard
                this.bmGroupKeyOverrides(
                    dashboardGetEmbeddableUrlParams.bmGroupKeyOverrides ?: listOf()
                )
                this.colorOverrides(dashboardGetEmbeddableUrlParams.colorOverrides ?: listOf())
                this.dashboardOptions(dashboardGetEmbeddableUrlParams.dashboardOptions ?: listOf())
                additionalHeaders(dashboardGetEmbeddableUrlParams.additionalHeaders)
                additionalQueryParams(dashboardGetEmbeddableUrlParams.additionalQueryParams)
                additionalBodyProperties(dashboardGetEmbeddableUrlParams.additionalBodyProperties)
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

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
        }

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
                if (bmGroupKeyOverrides.size == 0) null else bmGroupKeyOverrides.toImmutable(),
                if (colorOverrides.size == 0) null else colorOverrides.toImmutable(),
                if (dashboardOptions.size == 0) null else dashboardOptions.toImmutable(),
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
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

            return /* spotless:off */ other is Dashboard && this.value == other.value /* spotless:on */
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

                return /* spotless:off */ other is ValueDisplayNames && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "ValueDisplayNames{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BmGroupKeyOverride && this.groupKeyName == other.groupKeyName && this.displayName == other.displayName && this.valueDisplayNames == other.valueDisplayNames && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(groupKeyName, displayName, valueDisplayNames, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Name && this.value == other.value /* spotless:on */
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ColorOverride && this.name == other.name && this.value == other.value && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(name, value, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

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

            return /* spotless:off */ other is DashboardOption && this.key == other.key && this.value == other.value && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(key, value, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "DashboardOption{key=$key, value=$value, additionalProperties=$additionalProperties}"
    }
}
