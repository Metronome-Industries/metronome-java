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
import com.metronome.api.core.Params
import com.metronome.api.core.checkRequired
import com.metronome.api.core.http.Headers
import com.metronome.api.core.http.QueryParams
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

/**
 * Edit details for a contract-level or customer-level credit.
 *
 * ### Use this endpoint to:
 * - Extend the duration or the amount of an existing free credit like a trial
 * - Modify individual credit access schedules, applicable products, priority, or other fields.
 *
 * ### Usage guidelines:
 * - As with all edits in Metronome, draft invoices will reflect the edit immediately, while
 *   finalized invoices are untouched unless voided and regenerated.
 * - You cannot remove an access schedule segment that was applied to a finalized invoice. You can
 *   void the invoice beforehand and then remove the access schedule segment.
 */
class V2ContractEditCreditParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** ID of the credit to edit */
    fun creditId(): String = body.creditId()

    /** ID of the customer whose credit is being edited */
    fun customerId(): String = body.customerId()

    fun accessSchedule(): Optional<AccessSchedule> = body.accessSchedule()

    /**
     * Which products the credit applies to. If both applicable_product_ids and
     * applicable_product_tags are not provided, the credit applies to all products.
     */
    fun applicableProductIds(): Optional<List<String>> = body.applicableProductIds()

    /**
     * Which tags the credit applies to. If both applicable_product_ids and applicable_product_tags
     * are not provided, the credit applies to all products.
     */
    fun applicableProductTags(): Optional<List<String>> = body.applicableProductTags()

    /** Updated description for the credit */
    fun description(): Optional<String> = body.description()

    /** Optional configuration for credit hierarchy access control */
    fun hierarchyConfiguration(): Optional<CommitHierarchyConfiguration> =
        body.hierarchyConfiguration()

    /** Updated name for the credit */
    fun name(): Optional<String> = body.name()

    /** If multiple commits are applicable, the one with the lower priority will apply first. */
    fun priority(): Optional<Double> = body.priority()

    fun productId(): Optional<String> = body.productId()

    /**
     * If provided, updates the credit to use the specified rate type for current and future
     * invoices. Previously finalized invoices will need to be voided and regenerated to reflect the
     * rate type change.
     */
    fun rateType(): Optional<RateType> = body.rateType()

    /**
     * List of filters that determine what kind of customer usage draws down a commit or credit. A
     * customer's usage needs to meet the condition of at least one of the specifiers to contribute
     * to a commit's or credit's drawdown. This field cannot be used together with
     * `applicable_product_ids` or `applicable_product_tags`. Instead, to target usage by product or
     * product tag, pass those values in the body of `specifiers`.
     */
    fun specifiers(): Optional<List<CommitSpecifierInput>> = body.specifiers()

    /** ID of the credit to edit */
    fun _creditId(): JsonField<String> = body._creditId()

    /** ID of the customer whose credit is being edited */
    fun _customerId(): JsonField<String> = body._customerId()

    fun _accessSchedule(): JsonField<AccessSchedule> = body._accessSchedule()

    /**
     * Which products the credit applies to. If both applicable_product_ids and
     * applicable_product_tags are not provided, the credit applies to all products.
     */
    fun _applicableProductIds(): JsonField<List<String>> = body._applicableProductIds()

    /**
     * Which tags the credit applies to. If both applicable_product_ids and applicable_product_tags
     * are not provided, the credit applies to all products.
     */
    fun _applicableProductTags(): JsonField<List<String>> = body._applicableProductTags()

    /** Updated description for the credit */
    fun _description(): JsonField<String> = body._description()

    /** Optional configuration for credit hierarchy access control */
    fun _hierarchyConfiguration(): JsonField<CommitHierarchyConfiguration> =
        body._hierarchyConfiguration()

    /** Updated name for the credit */
    fun _name(): JsonField<String> = body._name()

    /** If multiple commits are applicable, the one with the lower priority will apply first. */
    fun _priority(): JsonField<Double> = body._priority()

    fun _productId(): JsonField<String> = body._productId()

    /**
     * If provided, updates the credit to use the specified rate type for current and future
     * invoices. Previously finalized invoices will need to be voided and regenerated to reflect the
     * rate type change.
     */
    fun _rateType(): JsonField<RateType> = body._rateType()

    /**
     * List of filters that determine what kind of customer usage draws down a commit or credit. A
     * customer's usage needs to meet the condition of at least one of the specifiers to contribute
     * to a commit's or credit's drawdown. This field cannot be used together with
     * `applicable_product_ids` or `applicable_product_tags`. Instead, to target usage by product or
     * product tag, pass those values in the body of `specifiers`.
     */
    fun _specifiers(): JsonField<List<CommitSpecifierInput>> = body._specifiers()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("credit_id")
        @ExcludeMissing
        private val creditId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer_id")
        @ExcludeMissing
        private val customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("access_schedule")
        @ExcludeMissing
        private val accessSchedule: JsonField<AccessSchedule> = JsonMissing.of(),
        @JsonProperty("applicable_product_ids")
        @ExcludeMissing
        private val applicableProductIds: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        private val applicableProductTags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hierarchy_configuration")
        @ExcludeMissing
        private val hierarchyConfiguration: JsonField<CommitHierarchyConfiguration> =
            JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("priority")
        @ExcludeMissing
        private val priority: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("product_id")
        @ExcludeMissing
        private val productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("rate_type")
        @ExcludeMissing
        private val rateType: JsonField<RateType> = JsonMissing.of(),
        @JsonProperty("specifiers")
        @ExcludeMissing
        private val specifiers: JsonField<List<CommitSpecifierInput>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** ID of the credit to edit */
        fun creditId(): String = creditId.getRequired("credit_id")

        /** ID of the customer whose credit is being edited */
        fun customerId(): String = customerId.getRequired("customer_id")

        fun accessSchedule(): Optional<AccessSchedule> =
            Optional.ofNullable(accessSchedule.getNullable("access_schedule"))

        /**
         * Which products the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         */
        fun applicableProductIds(): Optional<List<String>> =
            Optional.ofNullable(applicableProductIds.getNullable("applicable_product_ids"))

        /**
         * Which tags the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         */
        fun applicableProductTags(): Optional<List<String>> =
            Optional.ofNullable(applicableProductTags.getNullable("applicable_product_tags"))

        /** Updated description for the credit */
        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        /** Optional configuration for credit hierarchy access control */
        fun hierarchyConfiguration(): Optional<CommitHierarchyConfiguration> =
            Optional.ofNullable(hierarchyConfiguration.getNullable("hierarchy_configuration"))

        /** Updated name for the credit */
        fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

        /** If multiple commits are applicable, the one with the lower priority will apply first. */
        fun priority(): Optional<Double> = Optional.ofNullable(priority.getNullable("priority"))

        fun productId(): Optional<String> = Optional.ofNullable(productId.getNullable("product_id"))

        /**
         * If provided, updates the credit to use the specified rate type for current and future
         * invoices. Previously finalized invoices will need to be voided and regenerated to reflect
         * the rate type change.
         */
        fun rateType(): Optional<RateType> = Optional.ofNullable(rateType.getNullable("rate_type"))

        /**
         * List of filters that determine what kind of customer usage draws down a commit or credit.
         * A customer's usage needs to meet the condition of at least one of the specifiers to
         * contribute to a commit's or credit's drawdown. This field cannot be used together with
         * `applicable_product_ids` or `applicable_product_tags`. Instead, to target usage by
         * product or product tag, pass those values in the body of `specifiers`.
         */
        fun specifiers(): Optional<List<CommitSpecifierInput>> =
            Optional.ofNullable(specifiers.getNullable("specifiers"))

        /** ID of the credit to edit */
        @JsonProperty("credit_id") @ExcludeMissing fun _creditId(): JsonField<String> = creditId

        /** ID of the customer whose credit is being edited */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        @JsonProperty("access_schedule")
        @ExcludeMissing
        fun _accessSchedule(): JsonField<AccessSchedule> = accessSchedule

        /**
         * Which products the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         */
        @JsonProperty("applicable_product_ids")
        @ExcludeMissing
        fun _applicableProductIds(): JsonField<List<String>> = applicableProductIds

        /**
         * Which tags the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         */
        @JsonProperty("applicable_product_tags")
        @ExcludeMissing
        fun _applicableProductTags(): JsonField<List<String>> = applicableProductTags

        /** Updated description for the credit */
        @JsonProperty("description")
        @ExcludeMissing
        fun _description(): JsonField<String> = description

        /** Optional configuration for credit hierarchy access control */
        @JsonProperty("hierarchy_configuration")
        @ExcludeMissing
        fun _hierarchyConfiguration(): JsonField<CommitHierarchyConfiguration> =
            hierarchyConfiguration

        /** Updated name for the credit */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /** If multiple commits are applicable, the one with the lower priority will apply first. */
        @JsonProperty("priority") @ExcludeMissing fun _priority(): JsonField<Double> = priority

        @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

        /**
         * If provided, updates the credit to use the specified rate type for current and future
         * invoices. Previously finalized invoices will need to be voided and regenerated to reflect
         * the rate type change.
         */
        @JsonProperty("rate_type") @ExcludeMissing fun _rateType(): JsonField<RateType> = rateType

        /**
         * List of filters that determine what kind of customer usage draws down a commit or credit.
         * A customer's usage needs to meet the condition of at least one of the specifiers to
         * contribute to a commit's or credit's drawdown. This field cannot be used together with
         * `applicable_product_ids` or `applicable_product_tags`. Instead, to target usage by
         * product or product tag, pass those values in the body of `specifiers`.
         */
        @JsonProperty("specifiers")
        @ExcludeMissing
        fun _specifiers(): JsonField<List<CommitSpecifierInput>> = specifiers

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            creditId()
            customerId()
            accessSchedule().ifPresent { it.validate() }
            applicableProductIds()
            applicableProductTags()
            description()
            hierarchyConfiguration().ifPresent { it.validate() }
            name()
            priority()
            productId()
            rateType()
            specifiers().ifPresent { it.forEach { it.validate() } }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var creditId: JsonField<String>? = null
            private var customerId: JsonField<String>? = null
            private var accessSchedule: JsonField<AccessSchedule> = JsonMissing.of()
            private var applicableProductIds: JsonField<MutableList<String>>? = null
            private var applicableProductTags: JsonField<MutableList<String>>? = null
            private var description: JsonField<String> = JsonMissing.of()
            private var hierarchyConfiguration: JsonField<CommitHierarchyConfiguration> =
                JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var priority: JsonField<Double> = JsonMissing.of()
            private var productId: JsonField<String> = JsonMissing.of()
            private var rateType: JsonField<RateType> = JsonMissing.of()
            private var specifiers: JsonField<MutableList<CommitSpecifierInput>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                creditId = body.creditId
                customerId = body.customerId
                accessSchedule = body.accessSchedule
                applicableProductIds = body.applicableProductIds.map { it.toMutableList() }
                applicableProductTags = body.applicableProductTags.map { it.toMutableList() }
                description = body.description
                hierarchyConfiguration = body.hierarchyConfiguration
                name = body.name
                priority = body.priority
                productId = body.productId
                rateType = body.rateType
                specifiers = body.specifiers.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** ID of the credit to edit */
            fun creditId(creditId: String) = creditId(JsonField.of(creditId))

            /** ID of the credit to edit */
            fun creditId(creditId: JsonField<String>) = apply { this.creditId = creditId }

            /** ID of the customer whose credit is being edited */
            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /** ID of the customer whose credit is being edited */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            fun accessSchedule(accessSchedule: AccessSchedule) =
                accessSchedule(JsonField.of(accessSchedule))

            fun accessSchedule(accessSchedule: JsonField<AccessSchedule>) = apply {
                this.accessSchedule = accessSchedule
            }

            /**
             * Which products the credit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the credit applies to all products.
             */
            fun applicableProductIds(applicableProductIds: List<String>?) =
                applicableProductIds(JsonField.ofNullable(applicableProductIds))

            /**
             * Which products the credit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the credit applies to all products.
             */
            fun applicableProductIds(applicableProductIds: Optional<List<String>>) =
                applicableProductIds(applicableProductIds.orElse(null))

            /**
             * Which products the credit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the credit applies to all products.
             */
            fun applicableProductIds(applicableProductIds: JsonField<List<String>>) = apply {
                this.applicableProductIds = applicableProductIds.map { it.toMutableList() }
            }

            /**
             * Which products the credit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the credit applies to all products.
             */
            fun addApplicableProductId(applicableProductId: String) = apply {
                applicableProductIds =
                    (applicableProductIds ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(applicableProductId)
                    }
            }

            /**
             * Which tags the credit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the credit applies to all products.
             */
            fun applicableProductTags(applicableProductTags: List<String>?) =
                applicableProductTags(JsonField.ofNullable(applicableProductTags))

            /**
             * Which tags the credit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the credit applies to all products.
             */
            fun applicableProductTags(applicableProductTags: Optional<List<String>>) =
                applicableProductTags(applicableProductTags.orElse(null))

            /**
             * Which tags the credit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the credit applies to all products.
             */
            fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
                this.applicableProductTags = applicableProductTags.map { it.toMutableList() }
            }

            /**
             * Which tags the credit applies to. If both applicable_product_ids and
             * applicable_product_tags are not provided, the credit applies to all products.
             */
            fun addApplicableProductTag(applicableProductTag: String) = apply {
                applicableProductTags =
                    (applicableProductTags ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(applicableProductTag)
                    }
            }

            /** Updated description for the credit */
            fun description(description: String) = description(JsonField.of(description))

            /** Updated description for the credit */
            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            /** Optional configuration for credit hierarchy access control */
            fun hierarchyConfiguration(hierarchyConfiguration: CommitHierarchyConfiguration) =
                hierarchyConfiguration(JsonField.of(hierarchyConfiguration))

            /** Optional configuration for credit hierarchy access control */
            fun hierarchyConfiguration(
                hierarchyConfiguration: JsonField<CommitHierarchyConfiguration>
            ) = apply { this.hierarchyConfiguration = hierarchyConfiguration }

            /** Updated name for the credit */
            fun name(name: String) = name(JsonField.of(name))

            /** Updated name for the credit */
            fun name(name: JsonField<String>) = apply { this.name = name }

            /**
             * If multiple commits are applicable, the one with the lower priority will apply first.
             */
            fun priority(priority: Double?) = priority(JsonField.ofNullable(priority))

            /**
             * If multiple commits are applicable, the one with the lower priority will apply first.
             */
            fun priority(priority: Double) = priority(priority as Double?)

            /**
             * If multiple commits are applicable, the one with the lower priority will apply first.
             */
            @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
            fun priority(priority: Optional<Double>) = priority(priority.orElse(null) as Double?)

            /**
             * If multiple commits are applicable, the one with the lower priority will apply first.
             */
            fun priority(priority: JsonField<Double>) = apply { this.priority = priority }

            fun productId(productId: String) = productId(JsonField.of(productId))

            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            /**
             * If provided, updates the credit to use the specified rate type for current and future
             * invoices. Previously finalized invoices will need to be voided and regenerated to
             * reflect the rate type change.
             */
            fun rateType(rateType: RateType) = rateType(JsonField.of(rateType))

            /**
             * If provided, updates the credit to use the specified rate type for current and future
             * invoices. Previously finalized invoices will need to be voided and regenerated to
             * reflect the rate type change.
             */
            fun rateType(rateType: JsonField<RateType>) = apply { this.rateType = rateType }

            /**
             * List of filters that determine what kind of customer usage draws down a commit or
             * credit. A customer's usage needs to meet the condition of at least one of the
             * specifiers to contribute to a commit's or credit's drawdown. This field cannot be
             * used together with `applicable_product_ids` or `applicable_product_tags`. Instead, to
             * target usage by product or product tag, pass those values in the body of
             * `specifiers`.
             */
            fun specifiers(specifiers: List<CommitSpecifierInput>?) =
                specifiers(JsonField.ofNullable(specifiers))

            /**
             * List of filters that determine what kind of customer usage draws down a commit or
             * credit. A customer's usage needs to meet the condition of at least one of the
             * specifiers to contribute to a commit's or credit's drawdown. This field cannot be
             * used together with `applicable_product_ids` or `applicable_product_tags`. Instead, to
             * target usage by product or product tag, pass those values in the body of
             * `specifiers`.
             */
            fun specifiers(specifiers: Optional<List<CommitSpecifierInput>>) =
                specifiers(specifiers.orElse(null))

            /**
             * List of filters that determine what kind of customer usage draws down a commit or
             * credit. A customer's usage needs to meet the condition of at least one of the
             * specifiers to contribute to a commit's or credit's drawdown. This field cannot be
             * used together with `applicable_product_ids` or `applicable_product_tags`. Instead, to
             * target usage by product or product tag, pass those values in the body of
             * `specifiers`.
             */
            fun specifiers(specifiers: JsonField<List<CommitSpecifierInput>>) = apply {
                this.specifiers = specifiers.map { it.toMutableList() }
            }

            /**
             * List of filters that determine what kind of customer usage draws down a commit or
             * credit. A customer's usage needs to meet the condition of at least one of the
             * specifiers to contribute to a commit's or credit's drawdown. This field cannot be
             * used together with `applicable_product_ids` or `applicable_product_tags`. Instead, to
             * target usage by product or product tag, pass those values in the body of
             * `specifiers`.
             */
            fun addSpecifier(specifier: CommitSpecifierInput) = apply {
                specifiers =
                    (specifiers ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(specifier)
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

            fun build(): Body =
                Body(
                    checkRequired("creditId", creditId),
                    checkRequired("customerId", customerId),
                    accessSchedule,
                    (applicableProductIds ?: JsonMissing.of()).map { it.toImmutable() },
                    (applicableProductTags ?: JsonMissing.of()).map { it.toImmutable() },
                    description,
                    hierarchyConfiguration,
                    name,
                    priority,
                    productId,
                    rateType,
                    (specifiers ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && creditId == other.creditId && customerId == other.customerId && accessSchedule == other.accessSchedule && applicableProductIds == other.applicableProductIds && applicableProductTags == other.applicableProductTags && description == other.description && hierarchyConfiguration == other.hierarchyConfiguration && name == other.name && priority == other.priority && productId == other.productId && rateType == other.rateType && specifiers == other.specifiers && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(creditId, customerId, accessSchedule, applicableProductIds, applicableProductTags, description, hierarchyConfiguration, name, priority, productId, rateType, specifiers, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{creditId=$creditId, customerId=$customerId, accessSchedule=$accessSchedule, applicableProductIds=$applicableProductIds, applicableProductTags=$applicableProductTags, description=$description, hierarchyConfiguration=$hierarchyConfiguration, name=$name, priority=$priority, productId=$productId, rateType=$rateType, specifiers=$specifiers, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [V2ContractEditCreditParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(v2ContractEditCreditParams: V2ContractEditCreditParams) = apply {
            body = v2ContractEditCreditParams.body.toBuilder()
            additionalHeaders = v2ContractEditCreditParams.additionalHeaders.toBuilder()
            additionalQueryParams = v2ContractEditCreditParams.additionalQueryParams.toBuilder()
        }

        /** ID of the credit to edit */
        fun creditId(creditId: String) = apply { body.creditId(creditId) }

        /** ID of the credit to edit */
        fun creditId(creditId: JsonField<String>) = apply { body.creditId(creditId) }

        /** ID of the customer whose credit is being edited */
        fun customerId(customerId: String) = apply { body.customerId(customerId) }

        /** ID of the customer whose credit is being edited */
        fun customerId(customerId: JsonField<String>) = apply { body.customerId(customerId) }

        fun accessSchedule(accessSchedule: AccessSchedule) = apply {
            body.accessSchedule(accessSchedule)
        }

        fun accessSchedule(accessSchedule: JsonField<AccessSchedule>) = apply {
            body.accessSchedule(accessSchedule)
        }

        /**
         * Which products the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         */
        fun applicableProductIds(applicableProductIds: List<String>?) = apply {
            body.applicableProductIds(applicableProductIds)
        }

        /**
         * Which products the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         */
        fun applicableProductIds(applicableProductIds: Optional<List<String>>) =
            applicableProductIds(applicableProductIds.orElse(null))

        /**
         * Which products the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         */
        fun applicableProductIds(applicableProductIds: JsonField<List<String>>) = apply {
            body.applicableProductIds(applicableProductIds)
        }

        /**
         * Which products the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         */
        fun addApplicableProductId(applicableProductId: String) = apply {
            body.addApplicableProductId(applicableProductId)
        }

        /**
         * Which tags the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         */
        fun applicableProductTags(applicableProductTags: List<String>?) = apply {
            body.applicableProductTags(applicableProductTags)
        }

        /**
         * Which tags the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         */
        fun applicableProductTags(applicableProductTags: Optional<List<String>>) =
            applicableProductTags(applicableProductTags.orElse(null))

        /**
         * Which tags the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         */
        fun applicableProductTags(applicableProductTags: JsonField<List<String>>) = apply {
            body.applicableProductTags(applicableProductTags)
        }

        /**
         * Which tags the credit applies to. If both applicable_product_ids and
         * applicable_product_tags are not provided, the credit applies to all products.
         */
        fun addApplicableProductTag(applicableProductTag: String) = apply {
            body.addApplicableProductTag(applicableProductTag)
        }

        /** Updated description for the credit */
        fun description(description: String) = apply { body.description(description) }

        /** Updated description for the credit */
        fun description(description: JsonField<String>) = apply { body.description(description) }

        /** Optional configuration for credit hierarchy access control */
        fun hierarchyConfiguration(hierarchyConfiguration: CommitHierarchyConfiguration) = apply {
            body.hierarchyConfiguration(hierarchyConfiguration)
        }

        /** Optional configuration for credit hierarchy access control */
        fun hierarchyConfiguration(
            hierarchyConfiguration: JsonField<CommitHierarchyConfiguration>
        ) = apply { body.hierarchyConfiguration(hierarchyConfiguration) }

        /** Updated name for the credit */
        fun name(name: String) = apply { body.name(name) }

        /** Updated name for the credit */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        /** If multiple commits are applicable, the one with the lower priority will apply first. */
        fun priority(priority: Double?) = apply { body.priority(priority) }

        /** If multiple commits are applicable, the one with the lower priority will apply first. */
        fun priority(priority: Double) = priority(priority as Double?)

        /** If multiple commits are applicable, the one with the lower priority will apply first. */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun priority(priority: Optional<Double>) = priority(priority.orElse(null) as Double?)

        /** If multiple commits are applicable, the one with the lower priority will apply first. */
        fun priority(priority: JsonField<Double>) = apply { body.priority(priority) }

        fun productId(productId: String) = apply { body.productId(productId) }

        fun productId(productId: JsonField<String>) = apply { body.productId(productId) }

        /**
         * If provided, updates the credit to use the specified rate type for current and future
         * invoices. Previously finalized invoices will need to be voided and regenerated to reflect
         * the rate type change.
         */
        fun rateType(rateType: RateType) = apply { body.rateType(rateType) }

        /**
         * If provided, updates the credit to use the specified rate type for current and future
         * invoices. Previously finalized invoices will need to be voided and regenerated to reflect
         * the rate type change.
         */
        fun rateType(rateType: JsonField<RateType>) = apply { body.rateType(rateType) }

        /**
         * List of filters that determine what kind of customer usage draws down a commit or credit.
         * A customer's usage needs to meet the condition of at least one of the specifiers to
         * contribute to a commit's or credit's drawdown. This field cannot be used together with
         * `applicable_product_ids` or `applicable_product_tags`. Instead, to target usage by
         * product or product tag, pass those values in the body of `specifiers`.
         */
        fun specifiers(specifiers: List<CommitSpecifierInput>?) = apply {
            body.specifiers(specifiers)
        }

        /**
         * List of filters that determine what kind of customer usage draws down a commit or credit.
         * A customer's usage needs to meet the condition of at least one of the specifiers to
         * contribute to a commit's or credit's drawdown. This field cannot be used together with
         * `applicable_product_ids` or `applicable_product_tags`. Instead, to target usage by
         * product or product tag, pass those values in the body of `specifiers`.
         */
        fun specifiers(specifiers: Optional<List<CommitSpecifierInput>>) =
            specifiers(specifiers.orElse(null))

        /**
         * List of filters that determine what kind of customer usage draws down a commit or credit.
         * A customer's usage needs to meet the condition of at least one of the specifiers to
         * contribute to a commit's or credit's drawdown. This field cannot be used together with
         * `applicable_product_ids` or `applicable_product_tags`. Instead, to target usage by
         * product or product tag, pass those values in the body of `specifiers`.
         */
        fun specifiers(specifiers: JsonField<List<CommitSpecifierInput>>) = apply {
            body.specifiers(specifiers)
        }

        /**
         * List of filters that determine what kind of customer usage draws down a commit or credit.
         * A customer's usage needs to meet the condition of at least one of the specifiers to
         * contribute to a commit's or credit's drawdown. This field cannot be used together with
         * `applicable_product_ids` or `applicable_product_tags`. Instead, to target usage by
         * product or product tag, pass those values in the body of `specifiers`.
         */
        fun addSpecifier(specifier: CommitSpecifierInput) = apply { body.addSpecifier(specifier) }

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

        fun build(): V2ContractEditCreditParams =
            V2ContractEditCreditParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    @NoAutoDetect
    class AccessSchedule
    @JsonCreator
    private constructor(
        @JsonProperty("add_schedule_items")
        @ExcludeMissing
        private val addScheduleItems: JsonField<List<AddScheduleItem>> = JsonMissing.of(),
        @JsonProperty("remove_schedule_items")
        @ExcludeMissing
        private val removeScheduleItems: JsonField<List<RemoveScheduleItem>> = JsonMissing.of(),
        @JsonProperty("update_schedule_items")
        @ExcludeMissing
        private val updateScheduleItems: JsonField<List<UpdateScheduleItem>> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun addScheduleItems(): Optional<List<AddScheduleItem>> =
            Optional.ofNullable(addScheduleItems.getNullable("add_schedule_items"))

        fun removeScheduleItems(): Optional<List<RemoveScheduleItem>> =
            Optional.ofNullable(removeScheduleItems.getNullable("remove_schedule_items"))

        fun updateScheduleItems(): Optional<List<UpdateScheduleItem>> =
            Optional.ofNullable(updateScheduleItems.getNullable("update_schedule_items"))

        @JsonProperty("add_schedule_items")
        @ExcludeMissing
        fun _addScheduleItems(): JsonField<List<AddScheduleItem>> = addScheduleItems

        @JsonProperty("remove_schedule_items")
        @ExcludeMissing
        fun _removeScheduleItems(): JsonField<List<RemoveScheduleItem>> = removeScheduleItems

        @JsonProperty("update_schedule_items")
        @ExcludeMissing
        fun _updateScheduleItems(): JsonField<List<UpdateScheduleItem>> = updateScheduleItems

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): AccessSchedule = apply {
            if (validated) {
                return@apply
            }

            addScheduleItems().ifPresent { it.forEach { it.validate() } }
            removeScheduleItems().ifPresent { it.forEach { it.validate() } }
            updateScheduleItems().ifPresent { it.forEach { it.validate() } }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AccessSchedule]. */
        class Builder internal constructor() {

            private var addScheduleItems: JsonField<MutableList<AddScheduleItem>>? = null
            private var removeScheduleItems: JsonField<MutableList<RemoveScheduleItem>>? = null
            private var updateScheduleItems: JsonField<MutableList<UpdateScheduleItem>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(accessSchedule: AccessSchedule) = apply {
                addScheduleItems = accessSchedule.addScheduleItems.map { it.toMutableList() }
                removeScheduleItems = accessSchedule.removeScheduleItems.map { it.toMutableList() }
                updateScheduleItems = accessSchedule.updateScheduleItems.map { it.toMutableList() }
                additionalProperties = accessSchedule.additionalProperties.toMutableMap()
            }

            fun addScheduleItems(addScheduleItems: List<AddScheduleItem>) =
                addScheduleItems(JsonField.of(addScheduleItems))

            fun addScheduleItems(addScheduleItems: JsonField<List<AddScheduleItem>>) = apply {
                this.addScheduleItems = addScheduleItems.map { it.toMutableList() }
            }

            fun addAddScheduleItem(addScheduleItem: AddScheduleItem) = apply {
                addScheduleItems =
                    (addScheduleItems ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(addScheduleItem)
                    }
            }

            fun removeScheduleItems(removeScheduleItems: List<RemoveScheduleItem>) =
                removeScheduleItems(JsonField.of(removeScheduleItems))

            fun removeScheduleItems(removeScheduleItems: JsonField<List<RemoveScheduleItem>>) =
                apply {
                    this.removeScheduleItems = removeScheduleItems.map { it.toMutableList() }
                }

            fun addRemoveScheduleItem(removeScheduleItem: RemoveScheduleItem) = apply {
                removeScheduleItems =
                    (removeScheduleItems ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(removeScheduleItem)
                    }
            }

            fun updateScheduleItems(updateScheduleItems: List<UpdateScheduleItem>) =
                updateScheduleItems(JsonField.of(updateScheduleItems))

            fun updateScheduleItems(updateScheduleItems: JsonField<List<UpdateScheduleItem>>) =
                apply {
                    this.updateScheduleItems = updateScheduleItems.map { it.toMutableList() }
                }

            fun addUpdateScheduleItem(updateScheduleItem: UpdateScheduleItem) = apply {
                updateScheduleItems =
                    (updateScheduleItems ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(updateScheduleItem)
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

            fun build(): AccessSchedule =
                AccessSchedule(
                    (addScheduleItems ?: JsonMissing.of()).map { it.toImmutable() },
                    (removeScheduleItems ?: JsonMissing.of()).map { it.toImmutable() },
                    (updateScheduleItems ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class AddScheduleItem
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("ending_before")
            @ExcludeMissing
            private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("starting_at")
            @ExcludeMissing
            private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun amount(): Double = amount.getRequired("amount")

            fun endingBefore(): OffsetDateTime = endingBefore.getRequired("ending_before")

            fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            @JsonProperty("ending_before")
            @ExcludeMissing
            fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

            @JsonProperty("starting_at")
            @ExcludeMissing
            fun _startingAt(): JsonField<OffsetDateTime> = startingAt

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): AddScheduleItem = apply {
                if (validated) {
                    return@apply
                }

                amount()
                endingBefore()
                startingAt()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AddScheduleItem]. */
            class Builder internal constructor() {

                private var amount: JsonField<Double>? = null
                private var endingBefore: JsonField<OffsetDateTime>? = null
                private var startingAt: JsonField<OffsetDateTime>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(addScheduleItem: AddScheduleItem) = apply {
                    amount = addScheduleItem.amount
                    endingBefore = addScheduleItem.endingBefore
                    startingAt = addScheduleItem.startingAt
                    additionalProperties = addScheduleItem.additionalProperties.toMutableMap()
                }

                fun amount(amount: Double) = amount(JsonField.of(amount))

                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun endingBefore(endingBefore: OffsetDateTime) =
                    endingBefore(JsonField.of(endingBefore))

                fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                    this.endingBefore = endingBefore
                }

                fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

                fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                    this.startingAt = startingAt
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

                fun build(): AddScheduleItem =
                    AddScheduleItem(
                        checkRequired("amount", amount),
                        checkRequired("endingBefore", endingBefore),
                        checkRequired("startingAt", startingAt),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AddScheduleItem && amount == other.amount && endingBefore == other.endingBefore && startingAt == other.startingAt && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, endingBefore, startingAt, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AddScheduleItem{amount=$amount, endingBefore=$endingBefore, startingAt=$startingAt, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class RemoveScheduleItem
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): RemoveScheduleItem = apply {
                if (validated) {
                    return@apply
                }

                id()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [RemoveScheduleItem]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(removeScheduleItem: RemoveScheduleItem) = apply {
                    id = removeScheduleItem.id
                    additionalProperties = removeScheduleItem.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

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

                fun build(): RemoveScheduleItem =
                    RemoveScheduleItem(checkRequired("id", id), additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RemoveScheduleItem && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RemoveScheduleItem{id=$id, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class UpdateScheduleItem
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("ending_before")
            @ExcludeMissing
            private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("starting_at")
            @ExcludeMissing
            private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun amount(): Optional<Double> = Optional.ofNullable(amount.getNullable("amount"))

            fun endingBefore(): Optional<OffsetDateTime> =
                Optional.ofNullable(endingBefore.getNullable("ending_before"))

            fun startingAt(): Optional<OffsetDateTime> =
                Optional.ofNullable(startingAt.getNullable("starting_at"))

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Double> = amount

            @JsonProperty("ending_before")
            @ExcludeMissing
            fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

            @JsonProperty("starting_at")
            @ExcludeMissing
            fun _startingAt(): JsonField<OffsetDateTime> = startingAt

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): UpdateScheduleItem = apply {
                if (validated) {
                    return@apply
                }

                id()
                amount()
                endingBefore()
                startingAt()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [UpdateScheduleItem]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var amount: JsonField<Double> = JsonMissing.of()
                private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
                private var startingAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(updateScheduleItem: UpdateScheduleItem) = apply {
                    id = updateScheduleItem.id
                    amount = updateScheduleItem.amount
                    endingBefore = updateScheduleItem.endingBefore
                    startingAt = updateScheduleItem.startingAt
                    additionalProperties = updateScheduleItem.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun amount(amount: Double) = amount(JsonField.of(amount))

                fun amount(amount: JsonField<Double>) = apply { this.amount = amount }

                fun endingBefore(endingBefore: OffsetDateTime) =
                    endingBefore(JsonField.of(endingBefore))

                fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                    this.endingBefore = endingBefore
                }

                fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

                fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                    this.startingAt = startingAt
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

                fun build(): UpdateScheduleItem =
                    UpdateScheduleItem(
                        checkRequired("id", id),
                        amount,
                        endingBefore,
                        startingAt,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is UpdateScheduleItem && id == other.id && amount == other.amount && endingBefore == other.endingBefore && startingAt == other.startingAt && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, amount, endingBefore, startingAt, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "UpdateScheduleItem{id=$id, amount=$amount, endingBefore=$endingBefore, startingAt=$startingAt, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AccessSchedule && addScheduleItems == other.addScheduleItems && removeScheduleItems == other.removeScheduleItems && updateScheduleItems == other.updateScheduleItems && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(addScheduleItems, removeScheduleItems, updateScheduleItems, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AccessSchedule{addScheduleItems=$addScheduleItems, removeScheduleItems=$removeScheduleItems, updateScheduleItems=$updateScheduleItems, additionalProperties=$additionalProperties}"
    }

    /**
     * If provided, updates the credit to use the specified rate type for current and future
     * invoices. Previously finalized invoices will need to be voided and regenerated to reflect the
     * rate type change.
     */
    class RateType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val LIST_RATE = of("LIST_RATE")

            @JvmField val COMMIT_RATE = of("COMMIT_RATE")

            @JvmStatic fun of(value: String) = RateType(JsonField.of(value))
        }

        /** An enum containing [RateType]'s known values. */
        enum class Known {
            LIST_RATE,
            COMMIT_RATE,
        }

        /**
         * An enum containing [RateType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RateType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            LIST_RATE,
            COMMIT_RATE,
            /** An enum member indicating that [RateType] was instantiated with an unknown value. */
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
                LIST_RATE -> Value.LIST_RATE
                COMMIT_RATE -> Value.COMMIT_RATE
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
                LIST_RATE -> Known.LIST_RATE
                COMMIT_RATE -> Known.COMMIT_RATE
                else -> throw MetronomeInvalidDataException("Unknown RateType: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RateType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is V2ContractEditCreditParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "V2ContractEditCreditParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
