// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.toUnmodifiable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = CustomerListCostsResponse.Builder::class)
@NoAutoDetect
class CustomerListCostsResponse
private constructor(
    private val data: JsonField<List<Data>>,
    private val nextPage: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun data(): List<Data> = data.getRequired("data")

    fun nextPage(): Optional<String> = Optional.ofNullable(nextPage.getNullable("next_page"))

    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonProperty("next_page") @ExcludeMissing fun _nextPage() = nextPage

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CustomerListCostsResponse = apply {
        if (!validated) {
            data().forEach { it.validate() }
            nextPage()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerListCostsResponse &&
            this.data == other.data &&
            this.nextPage == other.nextPage &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    data,
                    nextPage,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "CustomerListCostsResponse{data=$data, nextPage=$nextPage, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var data: JsonField<List<Data>> = JsonMissing.of()
        private var nextPage: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(customerListCostsResponse: CustomerListCostsResponse) = apply {
            this.data = customerListCostsResponse.data
            this.nextPage = customerListCostsResponse.nextPage
            additionalProperties(customerListCostsResponse.additionalProperties)
        }

        fun data(data: List<Data>) = data(JsonField.of(data))

        @JsonProperty("data")
        @ExcludeMissing
        fun data(data: JsonField<List<Data>>) = apply { this.data = data }

        fun nextPage(nextPage: String) = nextPage(JsonField.of(nextPage))

        @JsonProperty("next_page")
        @ExcludeMissing
        fun nextPage(nextPage: JsonField<String>) = apply { this.nextPage = nextPage }

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

        fun build(): CustomerListCostsResponse =
            CustomerListCostsResponse(
                data.map { it.toUnmodifiable() },
                nextPage,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = Data.Builder::class)
    @NoAutoDetect
    class Data
    private constructor(
        private val startTimestamp: JsonField<OffsetDateTime>,
        private val endTimestamp: JsonField<OffsetDateTime>,
        private val creditTypes: JsonField<CreditTypes>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        fun startTimestamp(): OffsetDateTime = startTimestamp.getRequired("start_timestamp")

        fun endTimestamp(): OffsetDateTime = endTimestamp.getRequired("end_timestamp")

        fun creditTypes(): CreditTypes = creditTypes.getRequired("credit_types")

        @JsonProperty("start_timestamp") @ExcludeMissing fun _startTimestamp() = startTimestamp

        @JsonProperty("end_timestamp") @ExcludeMissing fun _endTimestamp() = endTimestamp

        @JsonProperty("credit_types") @ExcludeMissing fun _creditTypes() = creditTypes

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Data = apply {
            if (!validated) {
                startTimestamp()
                endTimestamp()
                creditTypes().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                this.startTimestamp == other.startTimestamp &&
                this.endTimestamp == other.endTimestamp &&
                this.creditTypes == other.creditTypes &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        startTimestamp,
                        endTimestamp,
                        creditTypes,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Data{startTimestamp=$startTimestamp, endTimestamp=$endTimestamp, creditTypes=$creditTypes, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var startTimestamp: JsonField<OffsetDateTime> = JsonMissing.of()
            private var endTimestamp: JsonField<OffsetDateTime> = JsonMissing.of()
            private var creditTypes: JsonField<CreditTypes> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                this.startTimestamp = data.startTimestamp
                this.endTimestamp = data.endTimestamp
                this.creditTypes = data.creditTypes
                additionalProperties(data.additionalProperties)
            }

            fun startTimestamp(startTimestamp: OffsetDateTime) =
                startTimestamp(JsonField.of(startTimestamp))

            @JsonProperty("start_timestamp")
            @ExcludeMissing
            fun startTimestamp(startTimestamp: JsonField<OffsetDateTime>) = apply {
                this.startTimestamp = startTimestamp
            }

            fun endTimestamp(endTimestamp: OffsetDateTime) =
                endTimestamp(JsonField.of(endTimestamp))

            @JsonProperty("end_timestamp")
            @ExcludeMissing
            fun endTimestamp(endTimestamp: JsonField<OffsetDateTime>) = apply {
                this.endTimestamp = endTimestamp
            }

            fun creditTypes(creditTypes: CreditTypes) = creditTypes(JsonField.of(creditTypes))

            @JsonProperty("credit_types")
            @ExcludeMissing
            fun creditTypes(creditTypes: JsonField<CreditTypes>) = apply {
                this.creditTypes = creditTypes
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

            fun build(): Data =
                Data(
                    startTimestamp,
                    endTimestamp,
                    creditTypes,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = CreditTypes.Builder::class)
        @NoAutoDetect
        class CreditTypes
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CreditTypes = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreditTypes &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(additionalProperties)
                }
                return hashCode
            }

            override fun toString() = "CreditTypes{additionalProperties=$additionalProperties}"

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(creditTypes: CreditTypes) = apply {
                    additionalProperties(creditTypes.additionalProperties)
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

                fun build(): CreditTypes = CreditTypes(additionalProperties.toUnmodifiable())
            }
        }
    }
}
