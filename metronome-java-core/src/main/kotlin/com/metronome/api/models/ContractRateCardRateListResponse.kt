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
import com.metronome.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = ContractRateCardRateListResponse.Builder::class)
@NoAutoDetect
class ContractRateCardRateListResponse
private constructor(
    private val productId: JsonField<String>,
    private val productName: JsonField<String>,
    private val productTags: JsonField<List<String>>,
    private val pricingGroupValues: JsonField<PricingGroupValues>,
    private val startingAt: JsonField<OffsetDateTime>,
    private val endingBefore: JsonField<OffsetDateTime>,
    private val entitled: JsonField<Boolean>,
    private val rate: JsonField<Rate>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun productId(): String = productId.getRequired("product_id")

    fun productName(): String = productName.getRequired("product_name")

    fun productTags(): List<String> = productTags.getRequired("product_tags")

    fun pricingGroupValues(): Optional<PricingGroupValues> =
        Optional.ofNullable(pricingGroupValues.getNullable("pricing_group_values"))

    fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

    fun endingBefore(): Optional<OffsetDateTime> =
        Optional.ofNullable(endingBefore.getNullable("ending_before"))

    fun entitled(): Boolean = entitled.getRequired("entitled")

    fun rate(): Rate = rate.getRequired("rate")

    @JsonProperty("product_id") @ExcludeMissing fun _productId() = productId

    @JsonProperty("product_name") @ExcludeMissing fun _productName() = productName

    @JsonProperty("product_tags") @ExcludeMissing fun _productTags() = productTags

    @JsonProperty("pricing_group_values")
    @ExcludeMissing
    fun _pricingGroupValues() = pricingGroupValues

    @JsonProperty("starting_at") @ExcludeMissing fun _startingAt() = startingAt

    @JsonProperty("ending_before") @ExcludeMissing fun _endingBefore() = endingBefore

    @JsonProperty("entitled") @ExcludeMissing fun _entitled() = entitled

    @JsonProperty("rate") @ExcludeMissing fun _rate() = rate

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ContractRateCardRateListResponse = apply {
        if (!validated) {
            productId()
            productName()
            productTags()
            pricingGroupValues().map { it.validate() }
            startingAt()
            endingBefore()
            entitled()
            rate().validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var productId: JsonField<String> = JsonMissing.of()
        private var productName: JsonField<String> = JsonMissing.of()
        private var productTags: JsonField<List<String>> = JsonMissing.of()
        private var pricingGroupValues: JsonField<PricingGroupValues> = JsonMissing.of()
        private var startingAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
        private var entitled: JsonField<Boolean> = JsonMissing.of()
        private var rate: JsonField<Rate> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contractRateCardRateListResponse: ContractRateCardRateListResponse) =
            apply {
                this.productId = contractRateCardRateListResponse.productId
                this.productName = contractRateCardRateListResponse.productName
                this.productTags = contractRateCardRateListResponse.productTags
                this.pricingGroupValues = contractRateCardRateListResponse.pricingGroupValues
                this.startingAt = contractRateCardRateListResponse.startingAt
                this.endingBefore = contractRateCardRateListResponse.endingBefore
                this.entitled = contractRateCardRateListResponse.entitled
                this.rate = contractRateCardRateListResponse.rate
                additionalProperties(contractRateCardRateListResponse.additionalProperties)
            }

        fun productId(productId: String) = productId(JsonField.of(productId))

        @JsonProperty("product_id")
        @ExcludeMissing
        fun productId(productId: JsonField<String>) = apply { this.productId = productId }

        fun productName(productName: String) = productName(JsonField.of(productName))

        @JsonProperty("product_name")
        @ExcludeMissing
        fun productName(productName: JsonField<String>) = apply { this.productName = productName }

        fun productTags(productTags: List<String>) = productTags(JsonField.of(productTags))

        @JsonProperty("product_tags")
        @ExcludeMissing
        fun productTags(productTags: JsonField<List<String>>) = apply {
            this.productTags = productTags
        }

        fun pricingGroupValues(pricingGroupValues: PricingGroupValues) =
            pricingGroupValues(JsonField.of(pricingGroupValues))

        @JsonProperty("pricing_group_values")
        @ExcludeMissing
        fun pricingGroupValues(pricingGroupValues: JsonField<PricingGroupValues>) = apply {
            this.pricingGroupValues = pricingGroupValues
        }

        fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

        @JsonProperty("starting_at")
        @ExcludeMissing
        fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
            this.startingAt = startingAt
        }

        fun endingBefore(endingBefore: OffsetDateTime) = endingBefore(JsonField.of(endingBefore))

        @JsonProperty("ending_before")
        @ExcludeMissing
        fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
            this.endingBefore = endingBefore
        }

        fun entitled(entitled: Boolean) = entitled(JsonField.of(entitled))

        @JsonProperty("entitled")
        @ExcludeMissing
        fun entitled(entitled: JsonField<Boolean>) = apply { this.entitled = entitled }

        fun rate(rate: Rate) = rate(JsonField.of(rate))

        @JsonProperty("rate")
        @ExcludeMissing
        fun rate(rate: JsonField<Rate>) = apply { this.rate = rate }

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

        fun build(): ContractRateCardRateListResponse =
            ContractRateCardRateListResponse(
                productId,
                productName,
                productTags.map { it.toImmutable() },
                pricingGroupValues,
                startingAt,
                endingBefore,
                entitled,
                rate,
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = PricingGroupValues.Builder::class)
    @NoAutoDetect
    class PricingGroupValues
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): PricingGroupValues = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(pricingGroupValues: PricingGroupValues) = apply {
                additionalProperties(pricingGroupValues.additionalProperties)
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

            fun build(): PricingGroupValues = PricingGroupValues(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PricingGroupValues && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "PricingGroupValues{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractRateCardRateListResponse && this.productId == other.productId && this.productName == other.productName && this.productTags == other.productTags && this.pricingGroupValues == other.pricingGroupValues && this.startingAt == other.startingAt && this.endingBefore == other.endingBefore && this.entitled == other.entitled && this.rate == other.rate && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(productId, productName, productTags, pricingGroupValues, startingAt, endingBefore, entitled, rate, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "ContractRateCardRateListResponse{productId=$productId, productName=$productName, productTags=$productTags, pricingGroupValues=$pricingGroupValues, startingAt=$startingAt, endingBefore=$endingBefore, entitled=$entitled, rate=$rate, additionalProperties=$additionalProperties}"
}
