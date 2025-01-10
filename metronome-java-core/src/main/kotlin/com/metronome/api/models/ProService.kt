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
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class ProService
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("max_amount")
    @ExcludeMissing
    private val maxAmount: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("product_id")
    @ExcludeMissing
    private val productId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("quantity")
    @ExcludeMissing
    private val quantity: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("unit_price")
    @ExcludeMissing
    private val unitPrice: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("custom_fields")
    @ExcludeMissing
    private val customFields: JsonField<CustomFields> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("netsuite_sales_order_id")
    @ExcludeMissing
    private val netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    /** Maximum amount for the term. */
    fun maxAmount(): Double = maxAmount.getRequired("max_amount")

    fun productId(): String = productId.getRequired("product_id")

    /** Quantity for the charge. Will be multiplied by unit_price to determine the amount. */
    fun quantity(): Double = quantity.getRequired("quantity")

    /**
     * Unit price for the charge. Will be multiplied by quantity to determine the amount and must be
     * specified.
     */
    fun unitPrice(): Double = unitPrice.getRequired("unit_price")

    fun customFields(): Optional<CustomFields> =
        Optional.ofNullable(customFields.getNullable("custom_fields"))

    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    /** This field's availability is dependent on your client's configuration. */
    fun netsuiteSalesOrderId(): Optional<String> =
        Optional.ofNullable(netsuiteSalesOrderId.getNullable("netsuite_sales_order_id"))

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** Maximum amount for the term. */
    @JsonProperty("max_amount") @ExcludeMissing fun _maxAmount(): JsonField<Double> = maxAmount

    @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

    /** Quantity for the charge. Will be multiplied by unit_price to determine the amount. */
    @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

    /**
     * Unit price for the charge. Will be multiplied by quantity to determine the amount and must be
     * specified.
     */
    @JsonProperty("unit_price") @ExcludeMissing fun _unitPrice(): JsonField<Double> = unitPrice

    @JsonProperty("custom_fields")
    @ExcludeMissing
    fun _customFields(): JsonField<CustomFields> = customFields

    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /** This field's availability is dependent on your client's configuration. */
    @JsonProperty("netsuite_sales_order_id")
    @ExcludeMissing
    fun _netsuiteSalesOrderId(): JsonField<String> = netsuiteSalesOrderId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ProService = apply {
        if (validated) {
            return@apply
        }

        id()
        maxAmount()
        productId()
        quantity()
        unitPrice()
        customFields().ifPresent { it.validate() }
        description()
        netsuiteSalesOrderId()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String>? = null
        private var maxAmount: JsonField<Double>? = null
        private var productId: JsonField<String>? = null
        private var quantity: JsonField<Double>? = null
        private var unitPrice: JsonField<Double>? = null
        private var customFields: JsonField<CustomFields> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(proService: ProService) = apply {
            id = proService.id
            maxAmount = proService.maxAmount
            productId = proService.productId
            quantity = proService.quantity
            unitPrice = proService.unitPrice
            customFields = proService.customFields
            description = proService.description
            netsuiteSalesOrderId = proService.netsuiteSalesOrderId
            additionalProperties = proService.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        /** Maximum amount for the term. */
        fun maxAmount(maxAmount: Double) = maxAmount(JsonField.of(maxAmount))

        /** Maximum amount for the term. */
        fun maxAmount(maxAmount: JsonField<Double>) = apply { this.maxAmount = maxAmount }

        fun productId(productId: String) = productId(JsonField.of(productId))

        fun productId(productId: JsonField<String>) = apply { this.productId = productId }

        /** Quantity for the charge. Will be multiplied by unit_price to determine the amount. */
        fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

        /** Quantity for the charge. Will be multiplied by unit_price to determine the amount. */
        fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

        /**
         * Unit price for the charge. Will be multiplied by quantity to determine the amount and
         * must be specified.
         */
        fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

        /**
         * Unit price for the charge. Will be multiplied by quantity to determine the amount and
         * must be specified.
         */
        fun unitPrice(unitPrice: JsonField<Double>) = apply { this.unitPrice = unitPrice }

        fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

        fun customFields(customFields: JsonField<CustomFields>) = apply {
            this.customFields = customFields
        }

        fun description(description: String) = description(JsonField.of(description))

        fun description(description: JsonField<String>) = apply { this.description = description }

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
            netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
            this.netsuiteSalesOrderId = netsuiteSalesOrderId
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

        fun build(): ProService =
            ProService(
                checkNotNull(id) { "`id` is required but was not set" },
                checkNotNull(maxAmount) { "`maxAmount` is required but was not set" },
                checkNotNull(productId) { "`productId` is required but was not set" },
                checkNotNull(quantity) { "`quantity` is required but was not set" },
                checkNotNull(unitPrice) { "`unitPrice` is required but was not set" },
                customFields,
                description,
                netsuiteSalesOrderId,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class CustomFields
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CustomFields = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customFields: CustomFields) = apply {
                additionalProperties = customFields.additionalProperties.toMutableMap()
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

            fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomFields && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProService && id == other.id && maxAmount == other.maxAmount && productId == other.productId && quantity == other.quantity && unitPrice == other.unitPrice && customFields == other.customFields && description == other.description && netsuiteSalesOrderId == other.netsuiteSalesOrderId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, maxAmount, productId, quantity, unitPrice, customFields, description, netsuiteSalesOrderId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ProService{id=$id, maxAmount=$maxAmount, productId=$productId, quantity=$quantity, unitPrice=$unitPrice, customFields=$customFields, description=$description, netsuiteSalesOrderId=$netsuiteSalesOrderId, additionalProperties=$additionalProperties}"
}
