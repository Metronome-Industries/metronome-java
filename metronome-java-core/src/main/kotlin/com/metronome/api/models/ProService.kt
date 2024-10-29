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
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = ProService.Builder::class)
@NoAutoDetect
class ProService
private constructor(
    private val id: JsonField<String>,
    private val description: JsonField<String>,
    private val productId: JsonField<String>,
    private val netsuiteSalesOrderId: JsonField<String>,
    private val unitPrice: JsonField<Double>,
    private val quantity: JsonField<Double>,
    private val maxAmount: JsonField<Double>,
    private val customFields: JsonField<CustomFields>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun id(): String = id.getRequired("id")

    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    fun productId(): String = productId.getRequired("product_id")

    /** This field's availability is dependent on your client's configuration. */
    fun netsuiteSalesOrderId(): Optional<String> =
        Optional.ofNullable(netsuiteSalesOrderId.getNullable("netsuite_sales_order_id"))

    /**
     * Unit price for the charge. Will be multiplied by quantity to determine the amount and must be
     * specified.
     */
    fun unitPrice(): Double = unitPrice.getRequired("unit_price")

    /** Quantity for the charge. Will be multiplied by unit_price to determine the amount. */
    fun quantity(): Double = quantity.getRequired("quantity")

    /** Maximum amount for the term. */
    fun maxAmount(): Double = maxAmount.getRequired("max_amount")

    fun customFields(): Optional<CustomFields> =
        Optional.ofNullable(customFields.getNullable("custom_fields"))

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("description") @ExcludeMissing fun _description() = description

    @JsonProperty("product_id") @ExcludeMissing fun _productId() = productId

    /** This field's availability is dependent on your client's configuration. */
    @JsonProperty("netsuite_sales_order_id")
    @ExcludeMissing
    fun _netsuiteSalesOrderId() = netsuiteSalesOrderId

    /**
     * Unit price for the charge. Will be multiplied by quantity to determine the amount and must be
     * specified.
     */
    @JsonProperty("unit_price") @ExcludeMissing fun _unitPrice() = unitPrice

    /** Quantity for the charge. Will be multiplied by unit_price to determine the amount. */
    @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

    /** Maximum amount for the term. */
    @JsonProperty("max_amount") @ExcludeMissing fun _maxAmount() = maxAmount

    @JsonProperty("custom_fields") @ExcludeMissing fun _customFields() = customFields

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ProService = apply {
        if (!validated) {
            id()
            description()
            productId()
            netsuiteSalesOrderId()
            unitPrice()
            quantity()
            maxAmount()
            customFields().map { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var productId: JsonField<String> = JsonMissing.of()
        private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
        private var unitPrice: JsonField<Double> = JsonMissing.of()
        private var quantity: JsonField<Double> = JsonMissing.of()
        private var maxAmount: JsonField<Double> = JsonMissing.of()
        private var customFields: JsonField<CustomFields> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(proService: ProService) = apply {
            this.id = proService.id
            this.description = proService.description
            this.productId = proService.productId
            this.netsuiteSalesOrderId = proService.netsuiteSalesOrderId
            this.unitPrice = proService.unitPrice
            this.quantity = proService.quantity
            this.maxAmount = proService.maxAmount
            this.customFields = proService.customFields
            additionalProperties(proService.additionalProperties)
        }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        fun description(description: String) = description(JsonField.of(description))

        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun productId(productId: String) = productId(JsonField.of(productId))

        @JsonProperty("product_id")
        @ExcludeMissing
        fun productId(productId: JsonField<String>) = apply { this.productId = productId }

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
            netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
            this.netsuiteSalesOrderId = netsuiteSalesOrderId
        }

        /**
         * Unit price for the charge. Will be multiplied by quantity to determine the amount and
         * must be specified.
         */
        fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

        /**
         * Unit price for the charge. Will be multiplied by quantity to determine the amount and
         * must be specified.
         */
        @JsonProperty("unit_price")
        @ExcludeMissing
        fun unitPrice(unitPrice: JsonField<Double>) = apply { this.unitPrice = unitPrice }

        /** Quantity for the charge. Will be multiplied by unit_price to determine the amount. */
        fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

        /** Quantity for the charge. Will be multiplied by unit_price to determine the amount. */
        @JsonProperty("quantity")
        @ExcludeMissing
        fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

        /** Maximum amount for the term. */
        fun maxAmount(maxAmount: Double) = maxAmount(JsonField.of(maxAmount))

        /** Maximum amount for the term. */
        @JsonProperty("max_amount")
        @ExcludeMissing
        fun maxAmount(maxAmount: JsonField<Double>) = apply { this.maxAmount = maxAmount }

        fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun customFields(customFields: JsonField<CustomFields>) = apply {
            this.customFields = customFields
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

        fun build(): ProService =
            ProService(
                id,
                description,
                productId,
                netsuiteSalesOrderId,
                unitPrice,
                quantity,
                maxAmount,
                customFields,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = CustomFields.Builder::class)
    @NoAutoDetect
    class CustomFields
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): CustomFields = apply {
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
            internal fun from(customFields: CustomFields) = apply {
                additionalProperties(customFields.additionalProperties)
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

            fun build(): CustomFields = CustomFields(additionalProperties.toUnmodifiable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomFields && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProService && this.id == other.id && this.description == other.description && this.productId == other.productId && this.netsuiteSalesOrderId == other.netsuiteSalesOrderId && this.unitPrice == other.unitPrice && this.quantity == other.quantity && this.maxAmount == other.maxAmount && this.customFields == other.customFields && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(id, description, productId, netsuiteSalesOrderId, unitPrice, quantity, maxAmount, customFields, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "ProService{id=$id, description=$description, productId=$productId, netsuiteSalesOrderId=$netsuiteSalesOrderId, unitPrice=$unitPrice, quantity=$quantity, maxAmount=$maxAmount, customFields=$customFields, additionalProperties=$additionalProperties}"
}
