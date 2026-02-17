// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts.products

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
 * Create a new product object. Products in Metronome represent your company's individual product or
 * service offerings. A Product can be thought of as the basic unit of a line item on the invoice.
 * This is analogous to SKUs or items in an ERP system. Give the product a meaningful name as they
 * will appear on customer invoices.
 */
class ProductCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * displayed on invoices
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = body.type()

    /**
     * Required for USAGE products
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billableMetricId(): Optional<String> = body.billableMetricId()

    /**
     * Required for COMPOSITE products
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun compositeProductIds(): Optional<List<String>> = body.compositeProductIds()

    /**
     * Required for COMPOSITE products
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun compositeTags(): Optional<List<String>> = body.compositeTags()

    /**
     * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customFields(): Optional<CustomFields> = body.customFields()

    /**
     * Beta feature only available for composite products. If true, products with $0 will not be
     * included when computing composite usage. Defaults to false
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun excludeFreeUsage(): Optional<Boolean> = body.excludeFreeUsage()

    /**
     * This field's availability is dependent on your client's configuration. Defaults to true.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isRefundable(): Optional<Boolean> = body.isRefundable()

    /**
     * This field's availability is dependent on your client's configuration.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun netsuiteInternalItemId(): Optional<String> = body.netsuiteInternalItemId()

    /**
     * This field's availability is dependent on your client's configuration.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun netsuiteOverageItemId(): Optional<String> = body.netsuiteOverageItemId()

    /**
     * For USAGE products only. Groups usage line items on invoices. The superset of values in the
     * pricing group key and presentation group key must be set as one compound group key on the
     * billable metric.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun presentationGroupKey(): Optional<List<String>> = body.presentationGroupKey()

    /**
     * For USAGE products only. If set, pricing for this product will be determined for each
     * pricing_group_key value, as opposed to the product as a whole. The superset of values in the
     * pricing group key and presentation group key must be set as one compound group key on the
     * billable metric.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pricingGroupKey(): Optional<List<String>> = body.pricingGroupKey()

    /**
     * Optional. Only valid for USAGE products. If provided, the quantity will be converted using
     * the provided conversion factor and operation. For example, if the operation is "multiply" and
     * the conversion factor is 100, then the quantity will be multiplied by 100. This can be used
     * in cases where data is sent in one unit and priced in another. For example, data could be
     * sent in MB and priced in GB. In this case, the conversion factor would be 1024 and the
     * operation would be "divide".
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun quantityConversion(): Optional<QuantityConversion> = body.quantityConversion()

    /**
     * Optional. Only valid for USAGE products. If provided, the quantity will be rounded using the
     * provided rounding method and decimal places. For example, if the method is "round up" and the
     * decimal places is 0, then the quantity will be rounded up to the nearest integer.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun quantityRounding(): Optional<QuantityRounding> = body.quantityRounding()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = body.tags()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _type(): JsonField<Type> = body._type()

    /**
     * Returns the raw JSON value of [billableMetricId].
     *
     * Unlike [billableMetricId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _billableMetricId(): JsonField<String> = body._billableMetricId()

    /**
     * Returns the raw JSON value of [compositeProductIds].
     *
     * Unlike [compositeProductIds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _compositeProductIds(): JsonField<List<String>> = body._compositeProductIds()

    /**
     * Returns the raw JSON value of [compositeTags].
     *
     * Unlike [compositeTags], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _compositeTags(): JsonField<List<String>> = body._compositeTags()

    /**
     * Returns the raw JSON value of [customFields].
     *
     * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customFields(): JsonField<CustomFields> = body._customFields()

    /**
     * Returns the raw JSON value of [excludeFreeUsage].
     *
     * Unlike [excludeFreeUsage], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _excludeFreeUsage(): JsonField<Boolean> = body._excludeFreeUsage()

    /**
     * Returns the raw JSON value of [isRefundable].
     *
     * Unlike [isRefundable], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _isRefundable(): JsonField<Boolean> = body._isRefundable()

    /**
     * Returns the raw JSON value of [netsuiteInternalItemId].
     *
     * Unlike [netsuiteInternalItemId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    fun _netsuiteInternalItemId(): JsonField<String> = body._netsuiteInternalItemId()

    /**
     * Returns the raw JSON value of [netsuiteOverageItemId].
     *
     * Unlike [netsuiteOverageItemId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _netsuiteOverageItemId(): JsonField<String> = body._netsuiteOverageItemId()

    /**
     * Returns the raw JSON value of [presentationGroupKey].
     *
     * Unlike [presentationGroupKey], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _presentationGroupKey(): JsonField<List<String>> = body._presentationGroupKey()

    /**
     * Returns the raw JSON value of [pricingGroupKey].
     *
     * Unlike [pricingGroupKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _pricingGroupKey(): JsonField<List<String>> = body._pricingGroupKey()

    /**
     * Returns the raw JSON value of [quantityConversion].
     *
     * Unlike [quantityConversion], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _quantityConversion(): JsonField<QuantityConversion> = body._quantityConversion()

    /**
     * Returns the raw JSON value of [quantityRounding].
     *
     * Unlike [quantityRounding], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _quantityRounding(): JsonField<QuantityRounding> = body._quantityRounding()

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tags(): JsonField<List<String>> = body._tags()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ProductCreateParams].
         *
         * The following fields are required:
         * ```java
         * .name()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ProductCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(productCreateParams: ProductCreateParams) = apply {
            body = productCreateParams.body.toBuilder()
            additionalHeaders = productCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = productCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [name]
         * - [type]
         * - [billableMetricId]
         * - [compositeProductIds]
         * - [compositeTags]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** displayed on invoices */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun type(type: Type) = apply { body.type(type) }

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { body.type(type) }

        /** Required for USAGE products */
        fun billableMetricId(billableMetricId: String) = apply {
            body.billableMetricId(billableMetricId)
        }

        /**
         * Sets [Builder.billableMetricId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billableMetricId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billableMetricId(billableMetricId: JsonField<String>) = apply {
            body.billableMetricId(billableMetricId)
        }

        /** Required for COMPOSITE products */
        fun compositeProductIds(compositeProductIds: List<String>) = apply {
            body.compositeProductIds(compositeProductIds)
        }

        /**
         * Sets [Builder.compositeProductIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.compositeProductIds] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun compositeProductIds(compositeProductIds: JsonField<List<String>>) = apply {
            body.compositeProductIds(compositeProductIds)
        }

        /**
         * Adds a single [String] to [compositeProductIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCompositeProductId(compositeProductId: String) = apply {
            body.addCompositeProductId(compositeProductId)
        }

        /** Required for COMPOSITE products */
        fun compositeTags(compositeTags: List<String>) = apply { body.compositeTags(compositeTags) }

        /**
         * Sets [Builder.compositeTags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.compositeTags] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun compositeTags(compositeTags: JsonField<List<String>>) = apply {
            body.compositeTags(compositeTags)
        }

        /**
         * Adds a single [String] to [compositeTags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCompositeTag(compositeTag: String) = apply { body.addCompositeTag(compositeTag) }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun customFields(customFields: CustomFields) = apply { body.customFields(customFields) }

        /**
         * Sets [Builder.customFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customFields] with a well-typed [CustomFields] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customFields(customFields: JsonField<CustomFields>) = apply {
            body.customFields(customFields)
        }

        /**
         * Beta feature only available for composite products. If true, products with $0 will not be
         * included when computing composite usage. Defaults to false
         */
        fun excludeFreeUsage(excludeFreeUsage: Boolean) = apply {
            body.excludeFreeUsage(excludeFreeUsage)
        }

        /**
         * Sets [Builder.excludeFreeUsage] to an arbitrary JSON value.
         *
         * You should usually call [Builder.excludeFreeUsage] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun excludeFreeUsage(excludeFreeUsage: JsonField<Boolean>) = apply {
            body.excludeFreeUsage(excludeFreeUsage)
        }

        /**
         * This field's availability is dependent on your client's configuration. Defaults to true.
         */
        fun isRefundable(isRefundable: Boolean) = apply { body.isRefundable(isRefundable) }

        /**
         * Sets [Builder.isRefundable] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isRefundable] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isRefundable(isRefundable: JsonField<Boolean>) = apply {
            body.isRefundable(isRefundable)
        }

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteInternalItemId(netsuiteInternalItemId: String) = apply {
            body.netsuiteInternalItemId(netsuiteInternalItemId)
        }

        /**
         * Sets [Builder.netsuiteInternalItemId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netsuiteInternalItemId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun netsuiteInternalItemId(netsuiteInternalItemId: JsonField<String>) = apply {
            body.netsuiteInternalItemId(netsuiteInternalItemId)
        }

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteOverageItemId(netsuiteOverageItemId: String) = apply {
            body.netsuiteOverageItemId(netsuiteOverageItemId)
        }

        /**
         * Sets [Builder.netsuiteOverageItemId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netsuiteOverageItemId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun netsuiteOverageItemId(netsuiteOverageItemId: JsonField<String>) = apply {
            body.netsuiteOverageItemId(netsuiteOverageItemId)
        }

        /**
         * For USAGE products only. Groups usage line items on invoices. The superset of values in
         * the pricing group key and presentation group key must be set as one compound group key on
         * the billable metric.
         */
        fun presentationGroupKey(presentationGroupKey: List<String>) = apply {
            body.presentationGroupKey(presentationGroupKey)
        }

        /**
         * Sets [Builder.presentationGroupKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.presentationGroupKey] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun presentationGroupKey(presentationGroupKey: JsonField<List<String>>) = apply {
            body.presentationGroupKey(presentationGroupKey)
        }

        /**
         * Adds a single [String] to [Builder.presentationGroupKey].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPresentationGroupKey(presentationGroupKey: String) = apply {
            body.addPresentationGroupKey(presentationGroupKey)
        }

        /**
         * For USAGE products only. If set, pricing for this product will be determined for each
         * pricing_group_key value, as opposed to the product as a whole. The superset of values in
         * the pricing group key and presentation group key must be set as one compound group key on
         * the billable metric.
         */
        fun pricingGroupKey(pricingGroupKey: List<String>) = apply {
            body.pricingGroupKey(pricingGroupKey)
        }

        /**
         * Sets [Builder.pricingGroupKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pricingGroupKey] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pricingGroupKey(pricingGroupKey: JsonField<List<String>>) = apply {
            body.pricingGroupKey(pricingGroupKey)
        }

        /**
         * Adds a single [String] to [Builder.pricingGroupKey].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPricingGroupKey(pricingGroupKey: String) = apply {
            body.addPricingGroupKey(pricingGroupKey)
        }

        /**
         * Optional. Only valid for USAGE products. If provided, the quantity will be converted
         * using the provided conversion factor and operation. For example, if the operation is
         * "multiply" and the conversion factor is 100, then the quantity will be multiplied by 100.
         * This can be used in cases where data is sent in one unit and priced in another. For
         * example, data could be sent in MB and priced in GB. In this case, the conversion factor
         * would be 1024 and the operation would be "divide".
         */
        fun quantityConversion(quantityConversion: QuantityConversion?) = apply {
            body.quantityConversion(quantityConversion)
        }

        /**
         * Alias for calling [Builder.quantityConversion] with `quantityConversion.orElse(null)`.
         */
        fun quantityConversion(quantityConversion: Optional<QuantityConversion>) =
            quantityConversion(quantityConversion.getOrNull())

        /**
         * Sets [Builder.quantityConversion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantityConversion] with a well-typed
         * [QuantityConversion] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun quantityConversion(quantityConversion: JsonField<QuantityConversion>) = apply {
            body.quantityConversion(quantityConversion)
        }

        /**
         * Optional. Only valid for USAGE products. If provided, the quantity will be rounded using
         * the provided rounding method and decimal places. For example, if the method is "round up"
         * and the decimal places is 0, then the quantity will be rounded up to the nearest integer.
         */
        fun quantityRounding(quantityRounding: QuantityRounding?) = apply {
            body.quantityRounding(quantityRounding)
        }

        /** Alias for calling [Builder.quantityRounding] with `quantityRounding.orElse(null)`. */
        fun quantityRounding(quantityRounding: Optional<QuantityRounding>) =
            quantityRounding(quantityRounding.getOrNull())

        /**
         * Sets [Builder.quantityRounding] to an arbitrary JSON value.
         *
         * You should usually call [Builder.quantityRounding] with a well-typed [QuantityRounding]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun quantityRounding(quantityRounding: JsonField<QuantityRounding>) = apply {
            body.quantityRounding(quantityRounding)
        }

        fun tags(tags: List<String>) = apply { body.tags(tags) }

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tags(tags: JsonField<List<String>>) = apply { body.tags(tags) }

        /**
         * Adds a single [String] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: String) = apply { body.addTag(tag) }

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
         * Returns an immutable instance of [ProductCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .name()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ProductCreateParams =
            ProductCreateParams(
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
        private val name: JsonField<String>,
        private val type: JsonField<Type>,
        private val billableMetricId: JsonField<String>,
        private val compositeProductIds: JsonField<List<String>>,
        private val compositeTags: JsonField<List<String>>,
        private val customFields: JsonField<CustomFields>,
        private val excludeFreeUsage: JsonField<Boolean>,
        private val isRefundable: JsonField<Boolean>,
        private val netsuiteInternalItemId: JsonField<String>,
        private val netsuiteOverageItemId: JsonField<String>,
        private val presentationGroupKey: JsonField<List<String>>,
        private val pricingGroupKey: JsonField<List<String>>,
        private val quantityConversion: JsonField<QuantityConversion>,
        private val quantityRounding: JsonField<QuantityRounding>,
        private val tags: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("billable_metric_id")
            @ExcludeMissing
            billableMetricId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("composite_product_ids")
            @ExcludeMissing
            compositeProductIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("composite_tags")
            @ExcludeMissing
            compositeTags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("custom_fields")
            @ExcludeMissing
            customFields: JsonField<CustomFields> = JsonMissing.of(),
            @JsonProperty("exclude_free_usage")
            @ExcludeMissing
            excludeFreeUsage: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("is_refundable")
            @ExcludeMissing
            isRefundable: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("netsuite_internal_item_id")
            @ExcludeMissing
            netsuiteInternalItemId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("netsuite_overage_item_id")
            @ExcludeMissing
            netsuiteOverageItemId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("presentation_group_key")
            @ExcludeMissing
            presentationGroupKey: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("pricing_group_key")
            @ExcludeMissing
            pricingGroupKey: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("quantity_conversion")
            @ExcludeMissing
            quantityConversion: JsonField<QuantityConversion> = JsonMissing.of(),
            @JsonProperty("quantity_rounding")
            @ExcludeMissing
            quantityRounding: JsonField<QuantityRounding> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            name,
            type,
            billableMetricId,
            compositeProductIds,
            compositeTags,
            customFields,
            excludeFreeUsage,
            isRefundable,
            netsuiteInternalItemId,
            netsuiteOverageItemId,
            presentationGroupKey,
            pricingGroupKey,
            quantityConversion,
            quantityRounding,
            tags,
            mutableMapOf(),
        )

        /**
         * displayed on invoices
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Required for USAGE products
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun billableMetricId(): Optional<String> =
            billableMetricId.getOptional("billable_metric_id")

        /**
         * Required for COMPOSITE products
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun compositeProductIds(): Optional<List<String>> =
            compositeProductIds.getOptional("composite_product_ids")

        /**
         * Required for COMPOSITE products
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun compositeTags(): Optional<List<String>> = compositeTags.getOptional("composite_tags")

        /**
         * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun customFields(): Optional<CustomFields> = customFields.getOptional("custom_fields")

        /**
         * Beta feature only available for composite products. If true, products with $0 will not be
         * included when computing composite usage. Defaults to false
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun excludeFreeUsage(): Optional<Boolean> =
            excludeFreeUsage.getOptional("exclude_free_usage")

        /**
         * This field's availability is dependent on your client's configuration. Defaults to true.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun isRefundable(): Optional<Boolean> = isRefundable.getOptional("is_refundable")

        /**
         * This field's availability is dependent on your client's configuration.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun netsuiteInternalItemId(): Optional<String> =
            netsuiteInternalItemId.getOptional("netsuite_internal_item_id")

        /**
         * This field's availability is dependent on your client's configuration.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun netsuiteOverageItemId(): Optional<String> =
            netsuiteOverageItemId.getOptional("netsuite_overage_item_id")

        /**
         * For USAGE products only. Groups usage line items on invoices. The superset of values in
         * the pricing group key and presentation group key must be set as one compound group key on
         * the billable metric.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun presentationGroupKey(): Optional<List<String>> =
            presentationGroupKey.getOptional("presentation_group_key")

        /**
         * For USAGE products only. If set, pricing for this product will be determined for each
         * pricing_group_key value, as opposed to the product as a whole. The superset of values in
         * the pricing group key and presentation group key must be set as one compound group key on
         * the billable metric.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun pricingGroupKey(): Optional<List<String>> =
            pricingGroupKey.getOptional("pricing_group_key")

        /**
         * Optional. Only valid for USAGE products. If provided, the quantity will be converted
         * using the provided conversion factor and operation. For example, if the operation is
         * "multiply" and the conversion factor is 100, then the quantity will be multiplied by 100.
         * This can be used in cases where data is sent in one unit and priced in another. For
         * example, data could be sent in MB and priced in GB. In this case, the conversion factor
         * would be 1024 and the operation would be "divide".
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun quantityConversion(): Optional<QuantityConversion> =
            quantityConversion.getOptional("quantity_conversion")

        /**
         * Optional. Only valid for USAGE products. If provided, the quantity will be rounded using
         * the provided rounding method and decimal places. For example, if the method is "round up"
         * and the decimal places is 0, then the quantity will be rounded up to the nearest integer.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun quantityRounding(): Optional<QuantityRounding> =
            quantityRounding.getOptional("quantity_rounding")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun tags(): Optional<List<String>> = tags.getOptional("tags")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [billableMetricId].
         *
         * Unlike [billableMetricId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billable_metric_id")
        @ExcludeMissing
        fun _billableMetricId(): JsonField<String> = billableMetricId

        /**
         * Returns the raw JSON value of [compositeProductIds].
         *
         * Unlike [compositeProductIds], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("composite_product_ids")
        @ExcludeMissing
        fun _compositeProductIds(): JsonField<List<String>> = compositeProductIds

        /**
         * Returns the raw JSON value of [compositeTags].
         *
         * Unlike [compositeTags], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("composite_tags")
        @ExcludeMissing
        fun _compositeTags(): JsonField<List<String>> = compositeTags

        /**
         * Returns the raw JSON value of [customFields].
         *
         * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

        /**
         * Returns the raw JSON value of [excludeFreeUsage].
         *
         * Unlike [excludeFreeUsage], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("exclude_free_usage")
        @ExcludeMissing
        fun _excludeFreeUsage(): JsonField<Boolean> = excludeFreeUsage

        /**
         * Returns the raw JSON value of [isRefundable].
         *
         * Unlike [isRefundable], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("is_refundable")
        @ExcludeMissing
        fun _isRefundable(): JsonField<Boolean> = isRefundable

        /**
         * Returns the raw JSON value of [netsuiteInternalItemId].
         *
         * Unlike [netsuiteInternalItemId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("netsuite_internal_item_id")
        @ExcludeMissing
        fun _netsuiteInternalItemId(): JsonField<String> = netsuiteInternalItemId

        /**
         * Returns the raw JSON value of [netsuiteOverageItemId].
         *
         * Unlike [netsuiteOverageItemId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("netsuite_overage_item_id")
        @ExcludeMissing
        fun _netsuiteOverageItemId(): JsonField<String> = netsuiteOverageItemId

        /**
         * Returns the raw JSON value of [presentationGroupKey].
         *
         * Unlike [presentationGroupKey], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("presentation_group_key")
        @ExcludeMissing
        fun _presentationGroupKey(): JsonField<List<String>> = presentationGroupKey

        /**
         * Returns the raw JSON value of [pricingGroupKey].
         *
         * Unlike [pricingGroupKey], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("pricing_group_key")
        @ExcludeMissing
        fun _pricingGroupKey(): JsonField<List<String>> = pricingGroupKey

        /**
         * Returns the raw JSON value of [quantityConversion].
         *
         * Unlike [quantityConversion], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("quantity_conversion")
        @ExcludeMissing
        fun _quantityConversion(): JsonField<QuantityConversion> = quantityConversion

        /**
         * Returns the raw JSON value of [quantityRounding].
         *
         * Unlike [quantityRounding], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("quantity_rounding")
        @ExcludeMissing
        fun _quantityRounding(): JsonField<QuantityRounding> = quantityRounding

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

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
             * .name()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var type: JsonField<Type>? = null
            private var billableMetricId: JsonField<String> = JsonMissing.of()
            private var compositeProductIds: JsonField<MutableList<String>>? = null
            private var compositeTags: JsonField<MutableList<String>>? = null
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var excludeFreeUsage: JsonField<Boolean> = JsonMissing.of()
            private var isRefundable: JsonField<Boolean> = JsonMissing.of()
            private var netsuiteInternalItemId: JsonField<String> = JsonMissing.of()
            private var netsuiteOverageItemId: JsonField<String> = JsonMissing.of()
            private var presentationGroupKey: JsonField<MutableList<String>>? = null
            private var pricingGroupKey: JsonField<MutableList<String>>? = null
            private var quantityConversion: JsonField<QuantityConversion> = JsonMissing.of()
            private var quantityRounding: JsonField<QuantityRounding> = JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                name = body.name
                type = body.type
                billableMetricId = body.billableMetricId
                compositeProductIds = body.compositeProductIds.map { it.toMutableList() }
                compositeTags = body.compositeTags.map { it.toMutableList() }
                customFields = body.customFields
                excludeFreeUsage = body.excludeFreeUsage
                isRefundable = body.isRefundable
                netsuiteInternalItemId = body.netsuiteInternalItemId
                netsuiteOverageItemId = body.netsuiteOverageItemId
                presentationGroupKey = body.presentationGroupKey.map { it.toMutableList() }
                pricingGroupKey = body.pricingGroupKey.map { it.toMutableList() }
                quantityConversion = body.quantityConversion
                quantityRounding = body.quantityRounding
                tags = body.tags.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** displayed on invoices */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** Required for USAGE products */
            fun billableMetricId(billableMetricId: String) =
                billableMetricId(JsonField.of(billableMetricId))

            /**
             * Sets [Builder.billableMetricId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billableMetricId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun billableMetricId(billableMetricId: JsonField<String>) = apply {
                this.billableMetricId = billableMetricId
            }

            /** Required for COMPOSITE products */
            fun compositeProductIds(compositeProductIds: List<String>) =
                compositeProductIds(JsonField.of(compositeProductIds))

            /**
             * Sets [Builder.compositeProductIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.compositeProductIds] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun compositeProductIds(compositeProductIds: JsonField<List<String>>) = apply {
                this.compositeProductIds = compositeProductIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [compositeProductIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCompositeProductId(compositeProductId: String) = apply {
                compositeProductIds =
                    (compositeProductIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("compositeProductIds", it).add(compositeProductId)
                    }
            }

            /** Required for COMPOSITE products */
            fun compositeTags(compositeTags: List<String>) =
                compositeTags(JsonField.of(compositeTags))

            /**
             * Sets [Builder.compositeTags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.compositeTags] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun compositeTags(compositeTags: JsonField<List<String>>) = apply {
                this.compositeTags = compositeTags.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [compositeTags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCompositeTag(compositeTag: String) = apply {
                compositeTags =
                    (compositeTags ?: JsonField.of(mutableListOf())).also {
                        checkKnown("compositeTags", it).add(compositeTag)
                    }
            }

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

            /**
             * Sets [Builder.customFields] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customFields] with a well-typed [CustomFields] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customFields(customFields: JsonField<CustomFields>) = apply {
                this.customFields = customFields
            }

            /**
             * Beta feature only available for composite products. If true, products with $0 will
             * not be included when computing composite usage. Defaults to false
             */
            fun excludeFreeUsage(excludeFreeUsage: Boolean) =
                excludeFreeUsage(JsonField.of(excludeFreeUsage))

            /**
             * Sets [Builder.excludeFreeUsage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.excludeFreeUsage] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun excludeFreeUsage(excludeFreeUsage: JsonField<Boolean>) = apply {
                this.excludeFreeUsage = excludeFreeUsage
            }

            /**
             * This field's availability is dependent on your client's configuration. Defaults to
             * true.
             */
            fun isRefundable(isRefundable: Boolean) = isRefundable(JsonField.of(isRefundable))

            /**
             * Sets [Builder.isRefundable] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isRefundable] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isRefundable(isRefundable: JsonField<Boolean>) = apply {
                this.isRefundable = isRefundable
            }

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteInternalItemId(netsuiteInternalItemId: String) =
                netsuiteInternalItemId(JsonField.of(netsuiteInternalItemId))

            /**
             * Sets [Builder.netsuiteInternalItemId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.netsuiteInternalItemId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun netsuiteInternalItemId(netsuiteInternalItemId: JsonField<String>) = apply {
                this.netsuiteInternalItemId = netsuiteInternalItemId
            }

            /** This field's availability is dependent on your client's configuration. */
            fun netsuiteOverageItemId(netsuiteOverageItemId: String) =
                netsuiteOverageItemId(JsonField.of(netsuiteOverageItemId))

            /**
             * Sets [Builder.netsuiteOverageItemId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.netsuiteOverageItemId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun netsuiteOverageItemId(netsuiteOverageItemId: JsonField<String>) = apply {
                this.netsuiteOverageItemId = netsuiteOverageItemId
            }

            /**
             * For USAGE products only. Groups usage line items on invoices. The superset of values
             * in the pricing group key and presentation group key must be set as one compound group
             * key on the billable metric.
             */
            fun presentationGroupKey(presentationGroupKey: List<String>) =
                presentationGroupKey(JsonField.of(presentationGroupKey))

            /**
             * Sets [Builder.presentationGroupKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.presentationGroupKey] with a well-typed
             * `List<String>` value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun presentationGroupKey(presentationGroupKey: JsonField<List<String>>) = apply {
                this.presentationGroupKey = presentationGroupKey.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.presentationGroupKey].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPresentationGroupKey(presentationGroupKey: String) = apply {
                this.presentationGroupKey =
                    (this.presentationGroupKey ?: JsonField.of(mutableListOf())).also {
                        checkKnown("presentationGroupKey", it).add(presentationGroupKey)
                    }
            }

            /**
             * For USAGE products only. If set, pricing for this product will be determined for each
             * pricing_group_key value, as opposed to the product as a whole. The superset of values
             * in the pricing group key and presentation group key must be set as one compound group
             * key on the billable metric.
             */
            fun pricingGroupKey(pricingGroupKey: List<String>) =
                pricingGroupKey(JsonField.of(pricingGroupKey))

            /**
             * Sets [Builder.pricingGroupKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pricingGroupKey] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun pricingGroupKey(pricingGroupKey: JsonField<List<String>>) = apply {
                this.pricingGroupKey = pricingGroupKey.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [Builder.pricingGroupKey].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPricingGroupKey(pricingGroupKey: String) = apply {
                this.pricingGroupKey =
                    (this.pricingGroupKey ?: JsonField.of(mutableListOf())).also {
                        checkKnown("pricingGroupKey", it).add(pricingGroupKey)
                    }
            }

            /**
             * Optional. Only valid for USAGE products. If provided, the quantity will be converted
             * using the provided conversion factor and operation. For example, if the operation is
             * "multiply" and the conversion factor is 100, then the quantity will be multiplied
             * by 100. This can be used in cases where data is sent in one unit and priced in
             * another. For example, data could be sent in MB and priced in GB. In this case, the
             * conversion factor would be 1024 and the operation would be "divide".
             */
            fun quantityConversion(quantityConversion: QuantityConversion?) =
                quantityConversion(JsonField.ofNullable(quantityConversion))

            /**
             * Alias for calling [Builder.quantityConversion] with
             * `quantityConversion.orElse(null)`.
             */
            fun quantityConversion(quantityConversion: Optional<QuantityConversion>) =
                quantityConversion(quantityConversion.getOrNull())

            /**
             * Sets [Builder.quantityConversion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quantityConversion] with a well-typed
             * [QuantityConversion] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun quantityConversion(quantityConversion: JsonField<QuantityConversion>) = apply {
                this.quantityConversion = quantityConversion
            }

            /**
             * Optional. Only valid for USAGE products. If provided, the quantity will be rounded
             * using the provided rounding method and decimal places. For example, if the method is
             * "round up" and the decimal places is 0, then the quantity will be rounded up to the
             * nearest integer.
             */
            fun quantityRounding(quantityRounding: QuantityRounding?) =
                quantityRounding(JsonField.ofNullable(quantityRounding))

            /**
             * Alias for calling [Builder.quantityRounding] with `quantityRounding.orElse(null)`.
             */
            fun quantityRounding(quantityRounding: Optional<QuantityRounding>) =
                quantityRounding(quantityRounding.getOrNull())

            /**
             * Sets [Builder.quantityRounding] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quantityRounding] with a well-typed
             * [QuantityRounding] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun quantityRounding(quantityRounding: JsonField<QuantityRounding>) = apply {
                this.quantityRounding = quantityRounding
            }

            fun tags(tags: List<String>) = tags(JsonField.of(tags))

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tags(tags: JsonField<List<String>>) = apply {
                this.tags = tags.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [tags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTag(tag: String) = apply {
                tags =
                    (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
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
             * .name()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("name", name),
                    checkRequired("type", type),
                    billableMetricId,
                    (compositeProductIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (compositeTags ?: JsonMissing.of()).map { it.toImmutable() },
                    customFields,
                    excludeFreeUsage,
                    isRefundable,
                    netsuiteInternalItemId,
                    netsuiteOverageItemId,
                    (presentationGroupKey ?: JsonMissing.of()).map { it.toImmutable() },
                    (pricingGroupKey ?: JsonMissing.of()).map { it.toImmutable() },
                    quantityConversion,
                    quantityRounding,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            name()
            type().validate()
            billableMetricId()
            compositeProductIds()
            compositeTags()
            customFields().ifPresent { it.validate() }
            excludeFreeUsage()
            isRefundable()
            netsuiteInternalItemId()
            netsuiteOverageItemId()
            presentationGroupKey()
            pricingGroupKey()
            quantityConversion().ifPresent { it.validate() }
            quantityRounding().ifPresent { it.validate() }
            tags()
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
            (if (name.asKnown().isPresent) 1 else 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                (if (billableMetricId.asKnown().isPresent) 1 else 0) +
                (compositeProductIds.asKnown().getOrNull()?.size ?: 0) +
                (compositeTags.asKnown().getOrNull()?.size ?: 0) +
                (customFields.asKnown().getOrNull()?.validity() ?: 0) +
                (if (excludeFreeUsage.asKnown().isPresent) 1 else 0) +
                (if (isRefundable.asKnown().isPresent) 1 else 0) +
                (if (netsuiteInternalItemId.asKnown().isPresent) 1 else 0) +
                (if (netsuiteOverageItemId.asKnown().isPresent) 1 else 0) +
                (presentationGroupKey.asKnown().getOrNull()?.size ?: 0) +
                (pricingGroupKey.asKnown().getOrNull()?.size ?: 0) +
                (quantityConversion.asKnown().getOrNull()?.validity() ?: 0) +
                (quantityRounding.asKnown().getOrNull()?.validity() ?: 0) +
                (tags.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                name == other.name &&
                type == other.type &&
                billableMetricId == other.billableMetricId &&
                compositeProductIds == other.compositeProductIds &&
                compositeTags == other.compositeTags &&
                customFields == other.customFields &&
                excludeFreeUsage == other.excludeFreeUsage &&
                isRefundable == other.isRefundable &&
                netsuiteInternalItemId == other.netsuiteInternalItemId &&
                netsuiteOverageItemId == other.netsuiteOverageItemId &&
                presentationGroupKey == other.presentationGroupKey &&
                pricingGroupKey == other.pricingGroupKey &&
                quantityConversion == other.quantityConversion &&
                quantityRounding == other.quantityRounding &&
                tags == other.tags &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                name,
                type,
                billableMetricId,
                compositeProductIds,
                compositeTags,
                customFields,
                excludeFreeUsage,
                isRefundable,
                netsuiteInternalItemId,
                netsuiteOverageItemId,
                presentationGroupKey,
                pricingGroupKey,
                quantityConversion,
                quantityRounding,
                tags,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{name=$name, type=$type, billableMetricId=$billableMetricId, compositeProductIds=$compositeProductIds, compositeTags=$compositeTags, customFields=$customFields, excludeFreeUsage=$excludeFreeUsage, isRefundable=$isRefundable, netsuiteInternalItemId=$netsuiteInternalItemId, netsuiteOverageItemId=$netsuiteOverageItemId, presentationGroupKey=$presentationGroupKey, pricingGroupKey=$pricingGroupKey, quantityConversion=$quantityConversion, quantityRounding=$quantityRounding, tags=$tags, additionalProperties=$additionalProperties}"
    }

    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val FIXED = of("FIXED")

            @JvmField val USAGE = of("USAGE")

            @JvmField val COMPOSITE = of("COMPOSITE")

            @JvmField val SUBSCRIPTION = of("SUBSCRIPTION")

            @JvmField val PROFESSIONAL_SERVICE = of("PROFESSIONAL_SERVICE")

            @JvmField val PRO_SERVICE = of("PRO_SERVICE")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            FIXED,
            USAGE,
            COMPOSITE,
            SUBSCRIPTION,
            PROFESSIONAL_SERVICE,
            PRO_SERVICE,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FIXED,
            USAGE,
            COMPOSITE,
            SUBSCRIPTION,
            PROFESSIONAL_SERVICE,
            PRO_SERVICE,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                FIXED -> Value.FIXED
                USAGE -> Value.USAGE
                COMPOSITE -> Value.COMPOSITE
                SUBSCRIPTION -> Value.SUBSCRIPTION
                PROFESSIONAL_SERVICE -> Value.PROFESSIONAL_SERVICE
                PRO_SERVICE -> Value.PRO_SERVICE
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
                FIXED -> Known.FIXED
                USAGE -> Known.USAGE
                COMPOSITE -> Known.COMPOSITE
                SUBSCRIPTION -> Known.SUBSCRIPTION
                PROFESSIONAL_SERVICE -> Known.PROFESSIONAL_SERVICE
                PRO_SERVICE -> Known.PRO_SERVICE
                else -> throw MetronomeInvalidDataException("Unknown Type: $value")
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

        fun validate(): Type = apply {
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

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
    class CustomFields
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

            /** Returns a mutable builder for constructing an instance of [CustomFields]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CustomFields]. */
        class Builder internal constructor() {

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

            /**
             * Returns an immutable instance of [CustomFields].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): CustomFields = apply {
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

            return other is CustomFields && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProductCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ProductCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
