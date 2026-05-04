// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers

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
 * Create a new customer in Metronome and optionally the billing configuration (recommended) which
 * dictates where invoices for the customer will be sent or where payment will be collected.
 *
 * ### Use this endpoint to:
 * Execute your customer provisioning workflows for either PLG motions, where customers originate in
 * your platform, or SLG motions, where customers originate in your sales system.
 *
 * ### Key response fields:
 * This end-point returns the `customer_id` created by the request. This id can be used to fetch
 * relevant billing configurations and create contracts.
 *
 * ### Example workflow:
 * - Generally, Metronome recommends first creating the customer in the downstream payment / ERP
 *   system when payment method is collected and then creating the customer in Metronome using the
 *   response (i.e. `customer_id`) from the downstream system. If you do not create a billing
 *   configuration on customer creation, you can add it later.
 * - Once a customer is created, you can then create a contract for the customer. In the contract
 *   creation process, you will need to add the customer billing configuration to the contract to
 *   ensure Metronome invoices the customer correctly. This is because a customer can have multiple
 *   configurations.
 * - As part of the customer creation process, set the ingest alias for the customer which will
 *   ensure usage is accurately mapped to the customer. Ingest aliases can be added or changed after
 *   the creation process as well.
 *
 * ### Usage guidelines:
 * For details on different billing configurations for different systems, review the
 * `/setCustomerBillingConfiguration` end-point.
 */
class CustomerCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * This will be truncated to 160 characters if the provided name is longer.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = body.name()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun billingConfig(): Optional<BillingConfig> = body.billingConfig()

    /**
     * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customFields(): Optional<CustomFields> = body.customFields()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerBillingProviderConfigurations():
        Optional<List<CustomerBillingProviderConfiguration>> =
        body.customerBillingProviderConfigurations()

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerRevenueSystemConfigurations(): Optional<List<CustomerRevenueSystemConfiguration>> =
        body.customerRevenueSystemConfigurations()

    /**
     * (deprecated, use ingest_aliases instead) an alias that can be used to refer to this customer
     * in usage events
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalId(): Optional<String> = body.externalId()

    /**
     * Aliases that can be used to refer to this customer in usage events
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ingestAliases(): Optional<List<String>> = body.ingestAliases()

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _name(): JsonField<String> = body._name()

    /**
     * Returns the raw JSON value of [billingConfig].
     *
     * Unlike [billingConfig], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _billingConfig(): JsonField<BillingConfig> = body._billingConfig()

    /**
     * Returns the raw JSON value of [customFields].
     *
     * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customFields(): JsonField<CustomFields> = body._customFields()

    /**
     * Returns the raw JSON value of [customerBillingProviderConfigurations].
     *
     * Unlike [customerBillingProviderConfigurations], this method doesn't throw if the JSON field
     * has an unexpected type.
     */
    fun _customerBillingProviderConfigurations():
        JsonField<List<CustomerBillingProviderConfiguration>> =
        body._customerBillingProviderConfigurations()

    /**
     * Returns the raw JSON value of [customerRevenueSystemConfigurations].
     *
     * Unlike [customerRevenueSystemConfigurations], this method doesn't throw if the JSON field has
     * an unexpected type.
     */
    fun _customerRevenueSystemConfigurations():
        JsonField<List<CustomerRevenueSystemConfiguration>> =
        body._customerRevenueSystemConfigurations()

    /**
     * Returns the raw JSON value of [externalId].
     *
     * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _externalId(): JsonField<String> = body._externalId()

    /**
     * Returns the raw JSON value of [ingestAliases].
     *
     * Unlike [ingestAliases], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _ingestAliases(): JsonField<List<String>> = body._ingestAliases()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CustomerCreateParams].
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CustomerCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(customerCreateParams: CustomerCreateParams) = apply {
            body = customerCreateParams.body.toBuilder()
            additionalHeaders = customerCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = customerCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [name]
         * - [billingConfig]
         * - [customFields]
         * - [customerBillingProviderConfigurations]
         * - [customerRevenueSystemConfigurations]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** This will be truncated to 160 characters if the provided name is longer. */
        fun name(name: String) = apply { body.name(name) }

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { body.name(name) }

        fun billingConfig(billingConfig: BillingConfig) = apply {
            body.billingConfig(billingConfig)
        }

        /**
         * Sets [Builder.billingConfig] to an arbitrary JSON value.
         *
         * You should usually call [Builder.billingConfig] with a well-typed [BillingConfig] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun billingConfig(billingConfig: JsonField<BillingConfig>) = apply {
            body.billingConfig(billingConfig)
        }

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

        fun customerBillingProviderConfigurations(
            customerBillingProviderConfigurations: List<CustomerBillingProviderConfiguration>
        ) = apply {
            body.customerBillingProviderConfigurations(customerBillingProviderConfigurations)
        }

        /**
         * Sets [Builder.customerBillingProviderConfigurations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerBillingProviderConfigurations] with a well-typed
         * `List<CustomerBillingProviderConfiguration>` value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun customerBillingProviderConfigurations(
            customerBillingProviderConfigurations:
                JsonField<List<CustomerBillingProviderConfiguration>>
        ) = apply {
            body.customerBillingProviderConfigurations(customerBillingProviderConfigurations)
        }

        /**
         * Adds a single [CustomerBillingProviderConfiguration] to
         * [customerBillingProviderConfigurations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCustomerBillingProviderConfiguration(
            customerBillingProviderConfiguration: CustomerBillingProviderConfiguration
        ) = apply {
            body.addCustomerBillingProviderConfiguration(customerBillingProviderConfiguration)
        }

        fun customerRevenueSystemConfigurations(
            customerRevenueSystemConfigurations: List<CustomerRevenueSystemConfiguration>
        ) = apply { body.customerRevenueSystemConfigurations(customerRevenueSystemConfigurations) }

        /**
         * Sets [Builder.customerRevenueSystemConfigurations] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerRevenueSystemConfigurations] with a well-typed
         * `List<CustomerRevenueSystemConfiguration>` value instead. This method is primarily for
         * setting the field to an undocumented or not yet supported value.
         */
        fun customerRevenueSystemConfigurations(
            customerRevenueSystemConfigurations: JsonField<List<CustomerRevenueSystemConfiguration>>
        ) = apply { body.customerRevenueSystemConfigurations(customerRevenueSystemConfigurations) }

        /**
         * Adds a single [CustomerRevenueSystemConfiguration] to
         * [customerRevenueSystemConfigurations].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCustomerRevenueSystemConfiguration(
            customerRevenueSystemConfiguration: CustomerRevenueSystemConfiguration
        ) = apply { body.addCustomerRevenueSystemConfiguration(customerRevenueSystemConfiguration) }

        /**
         * (deprecated, use ingest_aliases instead) an alias that can be used to refer to this
         * customer in usage events
         */
        fun externalId(externalId: String) = apply { body.externalId(externalId) }

        /**
         * Sets [Builder.externalId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun externalId(externalId: JsonField<String>) = apply { body.externalId(externalId) }

        /** Aliases that can be used to refer to this customer in usage events */
        fun ingestAliases(ingestAliases: List<String>) = apply { body.ingestAliases(ingestAliases) }

        /**
         * Sets [Builder.ingestAliases] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ingestAliases] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ingestAliases(ingestAliases: JsonField<List<String>>) = apply {
            body.ingestAliases(ingestAliases)
        }

        /**
         * Adds a single [String] to [ingestAliases].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addIngestAlias(ingestAlias: String) = apply { body.addIngestAlias(ingestAlias) }

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
         * Returns an immutable instance of [CustomerCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .name()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CustomerCreateParams =
            CustomerCreateParams(
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
        private val billingConfig: JsonField<BillingConfig>,
        private val customFields: JsonField<CustomFields>,
        private val customerBillingProviderConfigurations:
            JsonField<List<CustomerBillingProviderConfiguration>>,
        private val customerRevenueSystemConfigurations:
            JsonField<List<CustomerRevenueSystemConfiguration>>,
        private val externalId: JsonField<String>,
        private val ingestAliases: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("billing_config")
            @ExcludeMissing
            billingConfig: JsonField<BillingConfig> = JsonMissing.of(),
            @JsonProperty("custom_fields")
            @ExcludeMissing
            customFields: JsonField<CustomFields> = JsonMissing.of(),
            @JsonProperty("customer_billing_provider_configurations")
            @ExcludeMissing
            customerBillingProviderConfigurations:
                JsonField<List<CustomerBillingProviderConfiguration>> =
                JsonMissing.of(),
            @JsonProperty("customer_revenue_system_configurations")
            @ExcludeMissing
            customerRevenueSystemConfigurations:
                JsonField<List<CustomerRevenueSystemConfiguration>> =
                JsonMissing.of(),
            @JsonProperty("external_id")
            @ExcludeMissing
            externalId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ingest_aliases")
            @ExcludeMissing
            ingestAliases: JsonField<List<String>> = JsonMissing.of(),
        ) : this(
            name,
            billingConfig,
            customFields,
            customerBillingProviderConfigurations,
            customerRevenueSystemConfigurations,
            externalId,
            ingestAliases,
            mutableMapOf(),
        )

        /**
         * This will be truncated to 160 characters if the provided name is longer.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun billingConfig(): Optional<BillingConfig> = billingConfig.getOptional("billing_config")

        /**
         * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun customFields(): Optional<CustomFields> = customFields.getOptional("custom_fields")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun customerBillingProviderConfigurations():
            Optional<List<CustomerBillingProviderConfiguration>> =
            customerBillingProviderConfigurations.getOptional(
                "customer_billing_provider_configurations"
            )

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun customerRevenueSystemConfigurations():
            Optional<List<CustomerRevenueSystemConfiguration>> =
            customerRevenueSystemConfigurations.getOptional(
                "customer_revenue_system_configurations"
            )

        /**
         * (deprecated, use ingest_aliases instead) an alias that can be used to refer to this
         * customer in usage events
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun externalId(): Optional<String> = externalId.getOptional("external_id")

        /**
         * Aliases that can be used to refer to this customer in usage events
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun ingestAliases(): Optional<List<String>> = ingestAliases.getOptional("ingest_aliases")

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [billingConfig].
         *
         * Unlike [billingConfig], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billing_config")
        @ExcludeMissing
        fun _billingConfig(): JsonField<BillingConfig> = billingConfig

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
         * Returns the raw JSON value of [customerBillingProviderConfigurations].
         *
         * Unlike [customerBillingProviderConfigurations], this method doesn't throw if the JSON
         * field has an unexpected type.
         */
        @JsonProperty("customer_billing_provider_configurations")
        @ExcludeMissing
        fun _customerBillingProviderConfigurations():
            JsonField<List<CustomerBillingProviderConfiguration>> =
            customerBillingProviderConfigurations

        /**
         * Returns the raw JSON value of [customerRevenueSystemConfigurations].
         *
         * Unlike [customerRevenueSystemConfigurations], this method doesn't throw if the JSON field
         * has an unexpected type.
         */
        @JsonProperty("customer_revenue_system_configurations")
        @ExcludeMissing
        fun _customerRevenueSystemConfigurations():
            JsonField<List<CustomerRevenueSystemConfiguration>> =
            customerRevenueSystemConfigurations

        /**
         * Returns the raw JSON value of [externalId].
         *
         * Unlike [externalId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("external_id")
        @ExcludeMissing
        fun _externalId(): JsonField<String> = externalId

        /**
         * Returns the raw JSON value of [ingestAliases].
         *
         * Unlike [ingestAliases], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ingest_aliases")
        @ExcludeMissing
        fun _ingestAliases(): JsonField<List<String>> = ingestAliases

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
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var name: JsonField<String>? = null
            private var billingConfig: JsonField<BillingConfig> = JsonMissing.of()
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var customerBillingProviderConfigurations:
                JsonField<MutableList<CustomerBillingProviderConfiguration>>? =
                null
            private var customerRevenueSystemConfigurations:
                JsonField<MutableList<CustomerRevenueSystemConfiguration>>? =
                null
            private var externalId: JsonField<String> = JsonMissing.of()
            private var ingestAliases: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                name = body.name
                billingConfig = body.billingConfig
                customFields = body.customFields
                customerBillingProviderConfigurations =
                    body.customerBillingProviderConfigurations.map { it.toMutableList() }
                customerRevenueSystemConfigurations =
                    body.customerRevenueSystemConfigurations.map { it.toMutableList() }
                externalId = body.externalId
                ingestAliases = body.ingestAliases.map { it.toMutableList() }
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** This will be truncated to 160 characters if the provided name is longer. */
            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun billingConfig(billingConfig: BillingConfig) =
                billingConfig(JsonField.of(billingConfig))

            /**
             * Sets [Builder.billingConfig] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingConfig] with a well-typed [BillingConfig]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun billingConfig(billingConfig: JsonField<BillingConfig>) = apply {
                this.billingConfig = billingConfig
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

            fun customerBillingProviderConfigurations(
                customerBillingProviderConfigurations: List<CustomerBillingProviderConfiguration>
            ) =
                customerBillingProviderConfigurations(
                    JsonField.of(customerBillingProviderConfigurations)
                )

            /**
             * Sets [Builder.customerBillingProviderConfigurations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerBillingProviderConfigurations] with a
             * well-typed `List<CustomerBillingProviderConfiguration>` value instead. This method is
             * primarily for setting the field to an undocumented or not yet supported value.
             */
            fun customerBillingProviderConfigurations(
                customerBillingProviderConfigurations:
                    JsonField<List<CustomerBillingProviderConfiguration>>
            ) = apply {
                this.customerBillingProviderConfigurations =
                    customerBillingProviderConfigurations.map { it.toMutableList() }
            }

            /**
             * Adds a single [CustomerBillingProviderConfiguration] to
             * [customerBillingProviderConfigurations].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCustomerBillingProviderConfiguration(
                customerBillingProviderConfiguration: CustomerBillingProviderConfiguration
            ) = apply {
                customerBillingProviderConfigurations =
                    (customerBillingProviderConfigurations ?: JsonField.of(mutableListOf())).also {
                        checkKnown("customerBillingProviderConfigurations", it)
                            .add(customerBillingProviderConfiguration)
                    }
            }

            fun customerRevenueSystemConfigurations(
                customerRevenueSystemConfigurations: List<CustomerRevenueSystemConfiguration>
            ) =
                customerRevenueSystemConfigurations(
                    JsonField.of(customerRevenueSystemConfigurations)
                )

            /**
             * Sets [Builder.customerRevenueSystemConfigurations] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerRevenueSystemConfigurations] with a
             * well-typed `List<CustomerRevenueSystemConfiguration>` value instead. This method is
             * primarily for setting the field to an undocumented or not yet supported value.
             */
            fun customerRevenueSystemConfigurations(
                customerRevenueSystemConfigurations:
                    JsonField<List<CustomerRevenueSystemConfiguration>>
            ) = apply {
                this.customerRevenueSystemConfigurations =
                    customerRevenueSystemConfigurations.map { it.toMutableList() }
            }

            /**
             * Adds a single [CustomerRevenueSystemConfiguration] to
             * [customerRevenueSystemConfigurations].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addCustomerRevenueSystemConfiguration(
                customerRevenueSystemConfiguration: CustomerRevenueSystemConfiguration
            ) = apply {
                customerRevenueSystemConfigurations =
                    (customerRevenueSystemConfigurations ?: JsonField.of(mutableListOf())).also {
                        checkKnown("customerRevenueSystemConfigurations", it)
                            .add(customerRevenueSystemConfiguration)
                    }
            }

            /**
             * (deprecated, use ingest_aliases instead) an alias that can be used to refer to this
             * customer in usage events
             */
            fun externalId(externalId: String) = externalId(JsonField.of(externalId))

            /**
             * Sets [Builder.externalId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalId(externalId: JsonField<String>) = apply { this.externalId = externalId }

            /** Aliases that can be used to refer to this customer in usage events */
            fun ingestAliases(ingestAliases: List<String>) =
                ingestAliases(JsonField.of(ingestAliases))

            /**
             * Sets [Builder.ingestAliases] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ingestAliases] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun ingestAliases(ingestAliases: JsonField<List<String>>) = apply {
                this.ingestAliases = ingestAliases.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [ingestAliases].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addIngestAlias(ingestAlias: String) = apply {
                ingestAliases =
                    (ingestAliases ?: JsonField.of(mutableListOf())).also {
                        checkKnown("ingestAliases", it).add(ingestAlias)
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

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .name()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("name", name),
                    billingConfig,
                    customFields,
                    (customerBillingProviderConfigurations ?: JsonMissing.of()).map {
                        it.toImmutable()
                    },
                    (customerRevenueSystemConfigurations ?: JsonMissing.of()).map {
                        it.toImmutable()
                    },
                    externalId,
                    (ingestAliases ?: JsonMissing.of()).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            name()
            billingConfig().ifPresent { it.validate() }
            customFields().ifPresent { it.validate() }
            customerBillingProviderConfigurations().ifPresent { it.forEach { it.validate() } }
            customerRevenueSystemConfigurations().ifPresent { it.forEach { it.validate() } }
            externalId()
            ingestAliases()
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
                (billingConfig.asKnown().getOrNull()?.validity() ?: 0) +
                (customFields.asKnown().getOrNull()?.validity() ?: 0) +
                (customerBillingProviderConfigurations.asKnown().getOrNull()?.sumOf {
                    it.validity().toInt()
                } ?: 0) +
                (customerRevenueSystemConfigurations.asKnown().getOrNull()?.sumOf {
                    it.validity().toInt()
                } ?: 0) +
                (if (externalId.asKnown().isPresent) 1 else 0) +
                (ingestAliases.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                name == other.name &&
                billingConfig == other.billingConfig &&
                customFields == other.customFields &&
                customerBillingProviderConfigurations ==
                    other.customerBillingProviderConfigurations &&
                customerRevenueSystemConfigurations == other.customerRevenueSystemConfigurations &&
                externalId == other.externalId &&
                ingestAliases == other.ingestAliases &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                name,
                billingConfig,
                customFields,
                customerBillingProviderConfigurations,
                customerRevenueSystemConfigurations,
                externalId,
                ingestAliases,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{name=$name, billingConfig=$billingConfig, customFields=$customFields, customerBillingProviderConfigurations=$customerBillingProviderConfigurations, customerRevenueSystemConfigurations=$customerRevenueSystemConfigurations, externalId=$externalId, ingestAliases=$ingestAliases, additionalProperties=$additionalProperties}"
    }

    class BillingConfig
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val billingProviderCustomerId: JsonField<String>,
        private val billingProviderType: JsonField<BillingProviderType>,
        private val awsCustomerAccountId: JsonField<String>,
        private val awsCustomerId: JsonField<String>,
        private val awsIsSubscriptionProduct: JsonField<Boolean>,
        private val awsProductCode: JsonField<String>,
        private val awsRegion: JsonField<AwsRegion>,
        private val stripeCollectionMethod: JsonField<StripeCollectionMethod>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("billing_provider_customer_id")
            @ExcludeMissing
            billingProviderCustomerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("billing_provider_type")
            @ExcludeMissing
            billingProviderType: JsonField<BillingProviderType> = JsonMissing.of(),
            @JsonProperty("aws_customer_account_id")
            @ExcludeMissing
            awsCustomerAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("aws_customer_id")
            @ExcludeMissing
            awsCustomerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("aws_is_subscription_product")
            @ExcludeMissing
            awsIsSubscriptionProduct: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("aws_product_code")
            @ExcludeMissing
            awsProductCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("aws_region")
            @ExcludeMissing
            awsRegion: JsonField<AwsRegion> = JsonMissing.of(),
            @JsonProperty("stripe_collection_method")
            @ExcludeMissing
            stripeCollectionMethod: JsonField<StripeCollectionMethod> = JsonMissing.of(),
        ) : this(
            billingProviderCustomerId,
            billingProviderType,
            awsCustomerAccountId,
            awsCustomerId,
            awsIsSubscriptionProduct,
            awsProductCode,
            awsRegion,
            stripeCollectionMethod,
            mutableMapOf(),
        )

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun billingProviderCustomerId(): String =
            billingProviderCustomerId.getRequired("billing_provider_customer_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun billingProviderType(): BillingProviderType =
            billingProviderType.getRequired("billing_provider_type")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun awsCustomerAccountId(): Optional<String> =
            awsCustomerAccountId.getOptional("aws_customer_account_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun awsCustomerId(): Optional<String> = awsCustomerId.getOptional("aws_customer_id")

        /**
         * True if the aws_product_code is a SAAS subscription product, false otherwise.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun awsIsSubscriptionProduct(): Optional<Boolean> =
            awsIsSubscriptionProduct.getOptional("aws_is_subscription_product")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun awsProductCode(): Optional<String> = awsProductCode.getOptional("aws_product_code")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun awsRegion(): Optional<AwsRegion> = awsRegion.getOptional("aws_region")

        /**
         * The collection method for the customer's invoices. NOTE: `auto_charge_payment_intent` and
         * `manually_charge_payment_intent` are in beta.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun stripeCollectionMethod(): Optional<StripeCollectionMethod> =
            stripeCollectionMethod.getOptional("stripe_collection_method")

        /**
         * Returns the raw JSON value of [billingProviderCustomerId].
         *
         * Unlike [billingProviderCustomerId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("billing_provider_customer_id")
        @ExcludeMissing
        fun _billingProviderCustomerId(): JsonField<String> = billingProviderCustomerId

        /**
         * Returns the raw JSON value of [billingProviderType].
         *
         * Unlike [billingProviderType], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("billing_provider_type")
        @ExcludeMissing
        fun _billingProviderType(): JsonField<BillingProviderType> = billingProviderType

        /**
         * Returns the raw JSON value of [awsCustomerAccountId].
         *
         * Unlike [awsCustomerAccountId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("aws_customer_account_id")
        @ExcludeMissing
        fun _awsCustomerAccountId(): JsonField<String> = awsCustomerAccountId

        /**
         * Returns the raw JSON value of [awsCustomerId].
         *
         * Unlike [awsCustomerId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("aws_customer_id")
        @ExcludeMissing
        fun _awsCustomerId(): JsonField<String> = awsCustomerId

        /**
         * Returns the raw JSON value of [awsIsSubscriptionProduct].
         *
         * Unlike [awsIsSubscriptionProduct], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("aws_is_subscription_product")
        @ExcludeMissing
        fun _awsIsSubscriptionProduct(): JsonField<Boolean> = awsIsSubscriptionProduct

        /**
         * Returns the raw JSON value of [awsProductCode].
         *
         * Unlike [awsProductCode], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("aws_product_code")
        @ExcludeMissing
        fun _awsProductCode(): JsonField<String> = awsProductCode

        /**
         * Returns the raw JSON value of [awsRegion].
         *
         * Unlike [awsRegion], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("aws_region")
        @ExcludeMissing
        fun _awsRegion(): JsonField<AwsRegion> = awsRegion

        /**
         * Returns the raw JSON value of [stripeCollectionMethod].
         *
         * Unlike [stripeCollectionMethod], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("stripe_collection_method")
        @ExcludeMissing
        fun _stripeCollectionMethod(): JsonField<StripeCollectionMethod> = stripeCollectionMethod

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
             * Returns a mutable builder for constructing an instance of [BillingConfig].
             *
             * The following fields are required:
             * ```java
             * .billingProviderCustomerId()
             * .billingProviderType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [BillingConfig]. */
        class Builder internal constructor() {

            private var billingProviderCustomerId: JsonField<String>? = null
            private var billingProviderType: JsonField<BillingProviderType>? = null
            private var awsCustomerAccountId: JsonField<String> = JsonMissing.of()
            private var awsCustomerId: JsonField<String> = JsonMissing.of()
            private var awsIsSubscriptionProduct: JsonField<Boolean> = JsonMissing.of()
            private var awsProductCode: JsonField<String> = JsonMissing.of()
            private var awsRegion: JsonField<AwsRegion> = JsonMissing.of()
            private var stripeCollectionMethod: JsonField<StripeCollectionMethod> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(billingConfig: BillingConfig) = apply {
                billingProviderCustomerId = billingConfig.billingProviderCustomerId
                billingProviderType = billingConfig.billingProviderType
                awsCustomerAccountId = billingConfig.awsCustomerAccountId
                awsCustomerId = billingConfig.awsCustomerId
                awsIsSubscriptionProduct = billingConfig.awsIsSubscriptionProduct
                awsProductCode = billingConfig.awsProductCode
                awsRegion = billingConfig.awsRegion
                stripeCollectionMethod = billingConfig.stripeCollectionMethod
                additionalProperties = billingConfig.additionalProperties.toMutableMap()
            }

            fun billingProviderCustomerId(billingProviderCustomerId: String) =
                billingProviderCustomerId(JsonField.of(billingProviderCustomerId))

            /**
             * Sets [Builder.billingProviderCustomerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingProviderCustomerId] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun billingProviderCustomerId(billingProviderCustomerId: JsonField<String>) = apply {
                this.billingProviderCustomerId = billingProviderCustomerId
            }

            fun billingProviderType(billingProviderType: BillingProviderType) =
                billingProviderType(JsonField.of(billingProviderType))

            /**
             * Sets [Builder.billingProviderType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingProviderType] with a well-typed
             * [BillingProviderType] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun billingProviderType(billingProviderType: JsonField<BillingProviderType>) = apply {
                this.billingProviderType = billingProviderType
            }

            fun awsCustomerAccountId(awsCustomerAccountId: String) =
                awsCustomerAccountId(JsonField.of(awsCustomerAccountId))

            /**
             * Sets [Builder.awsCustomerAccountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.awsCustomerAccountId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun awsCustomerAccountId(awsCustomerAccountId: JsonField<String>) = apply {
                this.awsCustomerAccountId = awsCustomerAccountId
            }

            fun awsCustomerId(awsCustomerId: String) = awsCustomerId(JsonField.of(awsCustomerId))

            /**
             * Sets [Builder.awsCustomerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.awsCustomerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun awsCustomerId(awsCustomerId: JsonField<String>) = apply {
                this.awsCustomerId = awsCustomerId
            }

            /** True if the aws_product_code is a SAAS subscription product, false otherwise. */
            fun awsIsSubscriptionProduct(awsIsSubscriptionProduct: Boolean) =
                awsIsSubscriptionProduct(JsonField.of(awsIsSubscriptionProduct))

            /**
             * Sets [Builder.awsIsSubscriptionProduct] to an arbitrary JSON value.
             *
             * You should usually call [Builder.awsIsSubscriptionProduct] with a well-typed
             * [Boolean] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun awsIsSubscriptionProduct(awsIsSubscriptionProduct: JsonField<Boolean>) = apply {
                this.awsIsSubscriptionProduct = awsIsSubscriptionProduct
            }

            fun awsProductCode(awsProductCode: String) =
                awsProductCode(JsonField.of(awsProductCode))

            /**
             * Sets [Builder.awsProductCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.awsProductCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun awsProductCode(awsProductCode: JsonField<String>) = apply {
                this.awsProductCode = awsProductCode
            }

            fun awsRegion(awsRegion: AwsRegion) = awsRegion(JsonField.of(awsRegion))

            /**
             * Sets [Builder.awsRegion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.awsRegion] with a well-typed [AwsRegion] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun awsRegion(awsRegion: JsonField<AwsRegion>) = apply { this.awsRegion = awsRegion }

            /**
             * The collection method for the customer's invoices. NOTE: `auto_charge_payment_intent`
             * and `manually_charge_payment_intent` are in beta.
             */
            fun stripeCollectionMethod(stripeCollectionMethod: StripeCollectionMethod) =
                stripeCollectionMethod(JsonField.of(stripeCollectionMethod))

            /**
             * Sets [Builder.stripeCollectionMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stripeCollectionMethod] with a well-typed
             * [StripeCollectionMethod] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun stripeCollectionMethod(stripeCollectionMethod: JsonField<StripeCollectionMethod>) =
                apply {
                    this.stripeCollectionMethod = stripeCollectionMethod
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
             * Returns an immutable instance of [BillingConfig].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .billingProviderCustomerId()
             * .billingProviderType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): BillingConfig =
                BillingConfig(
                    checkRequired("billingProviderCustomerId", billingProviderCustomerId),
                    checkRequired("billingProviderType", billingProviderType),
                    awsCustomerAccountId,
                    awsCustomerId,
                    awsIsSubscriptionProduct,
                    awsProductCode,
                    awsRegion,
                    stripeCollectionMethod,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): BillingConfig = apply {
            if (validated) {
                return@apply
            }

            billingProviderCustomerId()
            billingProviderType().validate()
            awsCustomerAccountId()
            awsCustomerId()
            awsIsSubscriptionProduct()
            awsProductCode()
            awsRegion().ifPresent { it.validate() }
            stripeCollectionMethod().ifPresent { it.validate() }
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
            (if (billingProviderCustomerId.asKnown().isPresent) 1 else 0) +
                (billingProviderType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (awsCustomerAccountId.asKnown().isPresent) 1 else 0) +
                (if (awsCustomerId.asKnown().isPresent) 1 else 0) +
                (if (awsIsSubscriptionProduct.asKnown().isPresent) 1 else 0) +
                (if (awsProductCode.asKnown().isPresent) 1 else 0) +
                (awsRegion.asKnown().getOrNull()?.validity() ?: 0) +
                (stripeCollectionMethod.asKnown().getOrNull()?.validity() ?: 0)

        class BillingProviderType
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val AWS_MARKETPLACE = of("aws_marketplace")

                @JvmField val STRIPE = of("stripe")

                @JvmField val NETSUITE = of("netsuite")

                @JvmField val CUSTOM = of("custom")

                @JvmField val AZURE_MARKETPLACE = of("azure_marketplace")

                @JvmField val QUICKBOOKS_ONLINE = of("quickbooks_online")

                @JvmField val WORKDAY = of("workday")

                @JvmField val GCP_MARKETPLACE = of("gcp_marketplace")

                @JvmField val METRONOME = of("metronome")

                @JvmStatic fun of(value: String) = BillingProviderType(JsonField.of(value))
            }

            /** An enum containing [BillingProviderType]'s known values. */
            enum class Known {
                AWS_MARKETPLACE,
                STRIPE,
                NETSUITE,
                CUSTOM,
                AZURE_MARKETPLACE,
                QUICKBOOKS_ONLINE,
                WORKDAY,
                GCP_MARKETPLACE,
                METRONOME,
            }

            /**
             * An enum containing [BillingProviderType]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [BillingProviderType] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AWS_MARKETPLACE,
                STRIPE,
                NETSUITE,
                CUSTOM,
                AZURE_MARKETPLACE,
                QUICKBOOKS_ONLINE,
                WORKDAY,
                GCP_MARKETPLACE,
                METRONOME,
                /**
                 * An enum member indicating that [BillingProviderType] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    AWS_MARKETPLACE -> Value.AWS_MARKETPLACE
                    STRIPE -> Value.STRIPE
                    NETSUITE -> Value.NETSUITE
                    CUSTOM -> Value.CUSTOM
                    AZURE_MARKETPLACE -> Value.AZURE_MARKETPLACE
                    QUICKBOOKS_ONLINE -> Value.QUICKBOOKS_ONLINE
                    WORKDAY -> Value.WORKDAY
                    GCP_MARKETPLACE -> Value.GCP_MARKETPLACE
                    METRONOME -> Value.METRONOME
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    AWS_MARKETPLACE -> Known.AWS_MARKETPLACE
                    STRIPE -> Known.STRIPE
                    NETSUITE -> Known.NETSUITE
                    CUSTOM -> Known.CUSTOM
                    AZURE_MARKETPLACE -> Known.AZURE_MARKETPLACE
                    QUICKBOOKS_ONLINE -> Known.QUICKBOOKS_ONLINE
                    WORKDAY -> Known.WORKDAY
                    GCP_MARKETPLACE -> Known.GCP_MARKETPLACE
                    METRONOME -> Known.METRONOME
                    else ->
                        throw MetronomeInvalidDataException("Unknown BillingProviderType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): BillingProviderType = apply {
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

                return other is BillingProviderType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class AwsRegion @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val AF_SOUTH_1 = of("af-south-1")

                @JvmField val AP_EAST_1 = of("ap-east-1")

                @JvmField val AP_NORTHEAST_1 = of("ap-northeast-1")

                @JvmField val AP_NORTHEAST_2 = of("ap-northeast-2")

                @JvmField val AP_NORTHEAST_3 = of("ap-northeast-3")

                @JvmField val AP_SOUTH_1 = of("ap-south-1")

                @JvmField val AP_SOUTHEAST_1 = of("ap-southeast-1")

                @JvmField val AP_SOUTHEAST_2 = of("ap-southeast-2")

                @JvmField val CA_CENTRAL_1 = of("ca-central-1")

                @JvmField val CN_NORTH_1 = of("cn-north-1")

                @JvmField val CN_NORTHWEST_1 = of("cn-northwest-1")

                @JvmField val EU_CENTRAL_1 = of("eu-central-1")

                @JvmField val EU_NORTH_1 = of("eu-north-1")

                @JvmField val EU_SOUTH_1 = of("eu-south-1")

                @JvmField val EU_WEST_1 = of("eu-west-1")

                @JvmField val EU_WEST_2 = of("eu-west-2")

                @JvmField val EU_WEST_3 = of("eu-west-3")

                @JvmField val ME_SOUTH_1 = of("me-south-1")

                @JvmField val SA_EAST_1 = of("sa-east-1")

                @JvmField val US_EAST_1 = of("us-east-1")

                @JvmField val US_EAST_2 = of("us-east-2")

                @JvmField val US_GOV_EAST_1 = of("us-gov-east-1")

                @JvmField val US_GOV_WEST_1 = of("us-gov-west-1")

                @JvmField val US_WEST_1 = of("us-west-1")

                @JvmField val US_WEST_2 = of("us-west-2")

                @JvmStatic fun of(value: String) = AwsRegion(JsonField.of(value))
            }

            /** An enum containing [AwsRegion]'s known values. */
            enum class Known {
                AF_SOUTH_1,
                AP_EAST_1,
                AP_NORTHEAST_1,
                AP_NORTHEAST_2,
                AP_NORTHEAST_3,
                AP_SOUTH_1,
                AP_SOUTHEAST_1,
                AP_SOUTHEAST_2,
                CA_CENTRAL_1,
                CN_NORTH_1,
                CN_NORTHWEST_1,
                EU_CENTRAL_1,
                EU_NORTH_1,
                EU_SOUTH_1,
                EU_WEST_1,
                EU_WEST_2,
                EU_WEST_3,
                ME_SOUTH_1,
                SA_EAST_1,
                US_EAST_1,
                US_EAST_2,
                US_GOV_EAST_1,
                US_GOV_WEST_1,
                US_WEST_1,
                US_WEST_2,
            }

            /**
             * An enum containing [AwsRegion]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [AwsRegion] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AF_SOUTH_1,
                AP_EAST_1,
                AP_NORTHEAST_1,
                AP_NORTHEAST_2,
                AP_NORTHEAST_3,
                AP_SOUTH_1,
                AP_SOUTHEAST_1,
                AP_SOUTHEAST_2,
                CA_CENTRAL_1,
                CN_NORTH_1,
                CN_NORTHWEST_1,
                EU_CENTRAL_1,
                EU_NORTH_1,
                EU_SOUTH_1,
                EU_WEST_1,
                EU_WEST_2,
                EU_WEST_3,
                ME_SOUTH_1,
                SA_EAST_1,
                US_EAST_1,
                US_EAST_2,
                US_GOV_EAST_1,
                US_GOV_WEST_1,
                US_WEST_1,
                US_WEST_2,
                /**
                 * An enum member indicating that [AwsRegion] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    AF_SOUTH_1 -> Value.AF_SOUTH_1
                    AP_EAST_1 -> Value.AP_EAST_1
                    AP_NORTHEAST_1 -> Value.AP_NORTHEAST_1
                    AP_NORTHEAST_2 -> Value.AP_NORTHEAST_2
                    AP_NORTHEAST_3 -> Value.AP_NORTHEAST_3
                    AP_SOUTH_1 -> Value.AP_SOUTH_1
                    AP_SOUTHEAST_1 -> Value.AP_SOUTHEAST_1
                    AP_SOUTHEAST_2 -> Value.AP_SOUTHEAST_2
                    CA_CENTRAL_1 -> Value.CA_CENTRAL_1
                    CN_NORTH_1 -> Value.CN_NORTH_1
                    CN_NORTHWEST_1 -> Value.CN_NORTHWEST_1
                    EU_CENTRAL_1 -> Value.EU_CENTRAL_1
                    EU_NORTH_1 -> Value.EU_NORTH_1
                    EU_SOUTH_1 -> Value.EU_SOUTH_1
                    EU_WEST_1 -> Value.EU_WEST_1
                    EU_WEST_2 -> Value.EU_WEST_2
                    EU_WEST_3 -> Value.EU_WEST_3
                    ME_SOUTH_1 -> Value.ME_SOUTH_1
                    SA_EAST_1 -> Value.SA_EAST_1
                    US_EAST_1 -> Value.US_EAST_1
                    US_EAST_2 -> Value.US_EAST_2
                    US_GOV_EAST_1 -> Value.US_GOV_EAST_1
                    US_GOV_WEST_1 -> Value.US_GOV_WEST_1
                    US_WEST_1 -> Value.US_WEST_1
                    US_WEST_2 -> Value.US_WEST_2
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    AF_SOUTH_1 -> Known.AF_SOUTH_1
                    AP_EAST_1 -> Known.AP_EAST_1
                    AP_NORTHEAST_1 -> Known.AP_NORTHEAST_1
                    AP_NORTHEAST_2 -> Known.AP_NORTHEAST_2
                    AP_NORTHEAST_3 -> Known.AP_NORTHEAST_3
                    AP_SOUTH_1 -> Known.AP_SOUTH_1
                    AP_SOUTHEAST_1 -> Known.AP_SOUTHEAST_1
                    AP_SOUTHEAST_2 -> Known.AP_SOUTHEAST_2
                    CA_CENTRAL_1 -> Known.CA_CENTRAL_1
                    CN_NORTH_1 -> Known.CN_NORTH_1
                    CN_NORTHWEST_1 -> Known.CN_NORTHWEST_1
                    EU_CENTRAL_1 -> Known.EU_CENTRAL_1
                    EU_NORTH_1 -> Known.EU_NORTH_1
                    EU_SOUTH_1 -> Known.EU_SOUTH_1
                    EU_WEST_1 -> Known.EU_WEST_1
                    EU_WEST_2 -> Known.EU_WEST_2
                    EU_WEST_3 -> Known.EU_WEST_3
                    ME_SOUTH_1 -> Known.ME_SOUTH_1
                    SA_EAST_1 -> Known.SA_EAST_1
                    US_EAST_1 -> Known.US_EAST_1
                    US_EAST_2 -> Known.US_EAST_2
                    US_GOV_EAST_1 -> Known.US_GOV_EAST_1
                    US_GOV_WEST_1 -> Known.US_GOV_WEST_1
                    US_WEST_1 -> Known.US_WEST_1
                    US_WEST_2 -> Known.US_WEST_2
                    else -> throw MetronomeInvalidDataException("Unknown AwsRegion: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): AwsRegion = apply {
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

                return other is AwsRegion && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * The collection method for the customer's invoices. NOTE: `auto_charge_payment_intent` and
         * `manually_charge_payment_intent` are in beta.
         */
        class StripeCollectionMethod
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val CHARGE_AUTOMATICALLY = of("charge_automatically")

                @JvmField val SEND_INVOICE = of("send_invoice")

                @JvmField val AUTO_CHARGE_PAYMENT_INTENT = of("auto_charge_payment_intent")

                @JvmField val MANUALLY_CHARGE_PAYMENT_INTENT = of("manually_charge_payment_intent")

                @JvmStatic fun of(value: String) = StripeCollectionMethod(JsonField.of(value))
            }

            /** An enum containing [StripeCollectionMethod]'s known values. */
            enum class Known {
                CHARGE_AUTOMATICALLY,
                SEND_INVOICE,
                AUTO_CHARGE_PAYMENT_INTENT,
                MANUALLY_CHARGE_PAYMENT_INTENT,
            }

            /**
             * An enum containing [StripeCollectionMethod]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [StripeCollectionMethod] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CHARGE_AUTOMATICALLY,
                SEND_INVOICE,
                AUTO_CHARGE_PAYMENT_INTENT,
                MANUALLY_CHARGE_PAYMENT_INTENT,
                /**
                 * An enum member indicating that [StripeCollectionMethod] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    CHARGE_AUTOMATICALLY -> Value.CHARGE_AUTOMATICALLY
                    SEND_INVOICE -> Value.SEND_INVOICE
                    AUTO_CHARGE_PAYMENT_INTENT -> Value.AUTO_CHARGE_PAYMENT_INTENT
                    MANUALLY_CHARGE_PAYMENT_INTENT -> Value.MANUALLY_CHARGE_PAYMENT_INTENT
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    CHARGE_AUTOMATICALLY -> Known.CHARGE_AUTOMATICALLY
                    SEND_INVOICE -> Known.SEND_INVOICE
                    AUTO_CHARGE_PAYMENT_INTENT -> Known.AUTO_CHARGE_PAYMENT_INTENT
                    MANUALLY_CHARGE_PAYMENT_INTENT -> Known.MANUALLY_CHARGE_PAYMENT_INTENT
                    else ->
                        throw MetronomeInvalidDataException(
                            "Unknown StripeCollectionMethod: $value"
                        )
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): StripeCollectionMethod = apply {
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

                return other is StripeCollectionMethod && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BillingConfig &&
                billingProviderCustomerId == other.billingProviderCustomerId &&
                billingProviderType == other.billingProviderType &&
                awsCustomerAccountId == other.awsCustomerAccountId &&
                awsCustomerId == other.awsCustomerId &&
                awsIsSubscriptionProduct == other.awsIsSubscriptionProduct &&
                awsProductCode == other.awsProductCode &&
                awsRegion == other.awsRegion &&
                stripeCollectionMethod == other.stripeCollectionMethod &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                billingProviderCustomerId,
                billingProviderType,
                awsCustomerAccountId,
                awsCustomerId,
                awsIsSubscriptionProduct,
                awsProductCode,
                awsRegion,
                stripeCollectionMethod,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "BillingConfig{billingProviderCustomerId=$billingProviderCustomerId, billingProviderType=$billingProviderType, awsCustomerAccountId=$awsCustomerAccountId, awsCustomerId=$awsCustomerId, awsIsSubscriptionProduct=$awsIsSubscriptionProduct, awsProductCode=$awsProductCode, awsRegion=$awsRegion, stripeCollectionMethod=$stripeCollectionMethod, additionalProperties=$additionalProperties}"
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

    class CustomerBillingProviderConfiguration
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val billingProvider: JsonField<BillingProvider>,
        private val configuration: JsonField<Configuration>,
        private val deliveryMethod: JsonField<DeliveryMethod>,
        private val deliveryMethodId: JsonField<String>,
        private val taxProvider: JsonField<TaxProvider>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("billing_provider")
            @ExcludeMissing
            billingProvider: JsonField<BillingProvider> = JsonMissing.of(),
            @JsonProperty("configuration")
            @ExcludeMissing
            configuration: JsonField<Configuration> = JsonMissing.of(),
            @JsonProperty("delivery_method")
            @ExcludeMissing
            deliveryMethod: JsonField<DeliveryMethod> = JsonMissing.of(),
            @JsonProperty("delivery_method_id")
            @ExcludeMissing
            deliveryMethodId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tax_provider")
            @ExcludeMissing
            taxProvider: JsonField<TaxProvider> = JsonMissing.of(),
        ) : this(
            billingProvider,
            configuration,
            deliveryMethod,
            deliveryMethodId,
            taxProvider,
            mutableMapOf(),
        )

        /**
         * The billing provider set for this configuration.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun billingProvider(): BillingProvider = billingProvider.getRequired("billing_provider")

        /**
         * Configuration for the billing provider. The structure of this object is specific to the
         * billing provider and delivery provider combination. Defaults to an empty object, however,
         * for most billing provider + delivery method combinations, it will not be a valid
         * configuration.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun configuration(): Optional<Configuration> = configuration.getOptional("configuration")

        /**
         * The method to use for delivering invoices to this customer. If not provided, the
         * `delivery_method_id` must be provided.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun deliveryMethod(): Optional<DeliveryMethod> =
            deliveryMethod.getOptional("delivery_method")

        /**
         * ID of the delivery method to use for this customer. If not provided, the
         * `delivery_method` must be provided.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun deliveryMethodId(): Optional<String> =
            deliveryMethodId.getOptional("delivery_method_id")

        /**
         * Specifies which tax provider Metronome should use for tax calculation when billing
         * through Stripe. This is only supported for Stripe billing provider configurations with
         * auto_charge_payment_intent or manual_charge_payment_intent collection methods.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun taxProvider(): Optional<TaxProvider> = taxProvider.getOptional("tax_provider")

        /**
         * Returns the raw JSON value of [billingProvider].
         *
         * Unlike [billingProvider], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("billing_provider")
        @ExcludeMissing
        fun _billingProvider(): JsonField<BillingProvider> = billingProvider

        /**
         * Returns the raw JSON value of [configuration].
         *
         * Unlike [configuration], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("configuration")
        @ExcludeMissing
        fun _configuration(): JsonField<Configuration> = configuration

        /**
         * Returns the raw JSON value of [deliveryMethod].
         *
         * Unlike [deliveryMethod], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("delivery_method")
        @ExcludeMissing
        fun _deliveryMethod(): JsonField<DeliveryMethod> = deliveryMethod

        /**
         * Returns the raw JSON value of [deliveryMethodId].
         *
         * Unlike [deliveryMethodId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("delivery_method_id")
        @ExcludeMissing
        fun _deliveryMethodId(): JsonField<String> = deliveryMethodId

        /**
         * Returns the raw JSON value of [taxProvider].
         *
         * Unlike [taxProvider], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tax_provider")
        @ExcludeMissing
        fun _taxProvider(): JsonField<TaxProvider> = taxProvider

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
             * Returns a mutable builder for constructing an instance of
             * [CustomerBillingProviderConfiguration].
             *
             * The following fields are required:
             * ```java
             * .billingProvider()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CustomerBillingProviderConfiguration]. */
        class Builder internal constructor() {

            private var billingProvider: JsonField<BillingProvider>? = null
            private var configuration: JsonField<Configuration> = JsonMissing.of()
            private var deliveryMethod: JsonField<DeliveryMethod> = JsonMissing.of()
            private var deliveryMethodId: JsonField<String> = JsonMissing.of()
            private var taxProvider: JsonField<TaxProvider> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                customerBillingProviderConfiguration: CustomerBillingProviderConfiguration
            ) = apply {
                billingProvider = customerBillingProviderConfiguration.billingProvider
                configuration = customerBillingProviderConfiguration.configuration
                deliveryMethod = customerBillingProviderConfiguration.deliveryMethod
                deliveryMethodId = customerBillingProviderConfiguration.deliveryMethodId
                taxProvider = customerBillingProviderConfiguration.taxProvider
                additionalProperties =
                    customerBillingProviderConfiguration.additionalProperties.toMutableMap()
            }

            /** The billing provider set for this configuration. */
            fun billingProvider(billingProvider: BillingProvider) =
                billingProvider(JsonField.of(billingProvider))

            /**
             * Sets [Builder.billingProvider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingProvider] with a well-typed [BillingProvider]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun billingProvider(billingProvider: JsonField<BillingProvider>) = apply {
                this.billingProvider = billingProvider
            }

            /**
             * Configuration for the billing provider. The structure of this object is specific to
             * the billing provider and delivery provider combination. Defaults to an empty object,
             * however, for most billing provider + delivery method combinations, it will not be a
             * valid configuration.
             */
            fun configuration(configuration: Configuration) =
                configuration(JsonField.of(configuration))

            /**
             * Sets [Builder.configuration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.configuration] with a well-typed [Configuration]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun configuration(configuration: JsonField<Configuration>) = apply {
                this.configuration = configuration
            }

            /**
             * The method to use for delivering invoices to this customer. If not provided, the
             * `delivery_method_id` must be provided.
             */
            fun deliveryMethod(deliveryMethod: DeliveryMethod) =
                deliveryMethod(JsonField.of(deliveryMethod))

            /**
             * Sets [Builder.deliveryMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deliveryMethod] with a well-typed [DeliveryMethod]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun deliveryMethod(deliveryMethod: JsonField<DeliveryMethod>) = apply {
                this.deliveryMethod = deliveryMethod
            }

            /**
             * ID of the delivery method to use for this customer. If not provided, the
             * `delivery_method` must be provided.
             */
            fun deliveryMethodId(deliveryMethodId: String) =
                deliveryMethodId(JsonField.of(deliveryMethodId))

            /**
             * Sets [Builder.deliveryMethodId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deliveryMethodId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deliveryMethodId(deliveryMethodId: JsonField<String>) = apply {
                this.deliveryMethodId = deliveryMethodId
            }

            /**
             * Specifies which tax provider Metronome should use for tax calculation when billing
             * through Stripe. This is only supported for Stripe billing provider configurations
             * with auto_charge_payment_intent or manual_charge_payment_intent collection methods.
             */
            fun taxProvider(taxProvider: TaxProvider) = taxProvider(JsonField.of(taxProvider))

            /**
             * Sets [Builder.taxProvider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.taxProvider] with a well-typed [TaxProvider] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun taxProvider(taxProvider: JsonField<TaxProvider>) = apply {
                this.taxProvider = taxProvider
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
             * Returns an immutable instance of [CustomerBillingProviderConfiguration].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .billingProvider()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CustomerBillingProviderConfiguration =
                CustomerBillingProviderConfiguration(
                    checkRequired("billingProvider", billingProvider),
                    configuration,
                    deliveryMethod,
                    deliveryMethodId,
                    taxProvider,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): CustomerBillingProviderConfiguration = apply {
            if (validated) {
                return@apply
            }

            billingProvider().validate()
            configuration().ifPresent { it.validate() }
            deliveryMethod().ifPresent { it.validate() }
            deliveryMethodId()
            taxProvider().ifPresent { it.validate() }
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
            (billingProvider.asKnown().getOrNull()?.validity() ?: 0) +
                (configuration.asKnown().getOrNull()?.validity() ?: 0) +
                (deliveryMethod.asKnown().getOrNull()?.validity() ?: 0) +
                (if (deliveryMethodId.asKnown().isPresent) 1 else 0) +
                (taxProvider.asKnown().getOrNull()?.validity() ?: 0)

        /** The billing provider set for this configuration. */
        class BillingProvider
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val AWS_MARKETPLACE = of("aws_marketplace")

                @JvmField val AZURE_MARKETPLACE = of("azure_marketplace")

                @JvmField val GCP_MARKETPLACE = of("gcp_marketplace")

                @JvmField val STRIPE = of("stripe")

                @JvmField val NETSUITE = of("netsuite")

                @JvmStatic fun of(value: String) = BillingProvider(JsonField.of(value))
            }

            /** An enum containing [BillingProvider]'s known values. */
            enum class Known {
                AWS_MARKETPLACE,
                AZURE_MARKETPLACE,
                GCP_MARKETPLACE,
                STRIPE,
                NETSUITE,
            }

            /**
             * An enum containing [BillingProvider]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [BillingProvider] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AWS_MARKETPLACE,
                AZURE_MARKETPLACE,
                GCP_MARKETPLACE,
                STRIPE,
                NETSUITE,
                /**
                 * An enum member indicating that [BillingProvider] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    AWS_MARKETPLACE -> Value.AWS_MARKETPLACE
                    AZURE_MARKETPLACE -> Value.AZURE_MARKETPLACE
                    GCP_MARKETPLACE -> Value.GCP_MARKETPLACE
                    STRIPE -> Value.STRIPE
                    NETSUITE -> Value.NETSUITE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    AWS_MARKETPLACE -> Known.AWS_MARKETPLACE
                    AZURE_MARKETPLACE -> Known.AZURE_MARKETPLACE
                    GCP_MARKETPLACE -> Known.GCP_MARKETPLACE
                    STRIPE -> Known.STRIPE
                    NETSUITE -> Known.NETSUITE
                    else -> throw MetronomeInvalidDataException("Unknown BillingProvider: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): BillingProvider = apply {
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

                return other is BillingProvider && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Configuration for the billing provider. The structure of this object is specific to the
         * billing provider and delivery provider combination. Defaults to an empty object, however,
         * for most billing provider + delivery method combinations, it will not be a valid
         * configuration.
         */
        class Configuration
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

                /** Returns a mutable builder for constructing an instance of [Configuration]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Configuration]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(configuration: Configuration) = apply {
                    additionalProperties = configuration.additionalProperties.toMutableMap()
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

                /**
                 * Returns an immutable instance of [Configuration].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Configuration = Configuration(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Configuration = apply {
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

                return other is Configuration && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Configuration{additionalProperties=$additionalProperties}"
        }

        /**
         * The method to use for delivering invoices to this customer. If not provided, the
         * `delivery_method_id` must be provided.
         */
        class DeliveryMethod
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val DIRECT_TO_BILLING_PROVIDER = of("direct_to_billing_provider")

                @JvmField val AWS_SQS = of("aws_sqs")

                @JvmField val TACKLE = of("tackle")

                @JvmField val AWS_SNS = of("aws_sns")

                @JvmStatic fun of(value: String) = DeliveryMethod(JsonField.of(value))
            }

            /** An enum containing [DeliveryMethod]'s known values. */
            enum class Known {
                DIRECT_TO_BILLING_PROVIDER,
                AWS_SQS,
                TACKLE,
                AWS_SNS,
            }

            /**
             * An enum containing [DeliveryMethod]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DeliveryMethod] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DIRECT_TO_BILLING_PROVIDER,
                AWS_SQS,
                TACKLE,
                AWS_SNS,
                /**
                 * An enum member indicating that [DeliveryMethod] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    DIRECT_TO_BILLING_PROVIDER -> Value.DIRECT_TO_BILLING_PROVIDER
                    AWS_SQS -> Value.AWS_SQS
                    TACKLE -> Value.TACKLE
                    AWS_SNS -> Value.AWS_SNS
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    DIRECT_TO_BILLING_PROVIDER -> Known.DIRECT_TO_BILLING_PROVIDER
                    AWS_SQS -> Known.AWS_SQS
                    TACKLE -> Known.TACKLE
                    AWS_SNS -> Known.AWS_SNS
                    else -> throw MetronomeInvalidDataException("Unknown DeliveryMethod: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): DeliveryMethod = apply {
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

                return other is DeliveryMethod && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Specifies which tax provider Metronome should use for tax calculation when billing
         * through Stripe. This is only supported for Stripe billing provider configurations with
         * auto_charge_payment_intent or manual_charge_payment_intent collection methods.
         */
        class TaxProvider @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ANROK = of("anrok")

                @JvmField val AVALARA = of("avalara")

                @JvmField val STRIPE = of("stripe")

                @JvmStatic fun of(value: String) = TaxProvider(JsonField.of(value))
            }

            /** An enum containing [TaxProvider]'s known values. */
            enum class Known {
                ANROK,
                AVALARA,
                STRIPE,
            }

            /**
             * An enum containing [TaxProvider]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [TaxProvider] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ANROK,
                AVALARA,
                STRIPE,
                /**
                 * An enum member indicating that [TaxProvider] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ANROK -> Value.ANROK
                    AVALARA -> Value.AVALARA
                    STRIPE -> Value.STRIPE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    ANROK -> Known.ANROK
                    AVALARA -> Known.AVALARA
                    STRIPE -> Known.STRIPE
                    else -> throw MetronomeInvalidDataException("Unknown TaxProvider: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): TaxProvider = apply {
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

                return other is TaxProvider && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CustomerBillingProviderConfiguration &&
                billingProvider == other.billingProvider &&
                configuration == other.configuration &&
                deliveryMethod == other.deliveryMethod &&
                deliveryMethodId == other.deliveryMethodId &&
                taxProvider == other.taxProvider &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                billingProvider,
                configuration,
                deliveryMethod,
                deliveryMethodId,
                taxProvider,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CustomerBillingProviderConfiguration{billingProvider=$billingProvider, configuration=$configuration, deliveryMethod=$deliveryMethod, deliveryMethodId=$deliveryMethodId, taxProvider=$taxProvider, additionalProperties=$additionalProperties}"
    }

    class CustomerRevenueSystemConfiguration
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val provider: JsonField<Provider>,
        private val configuration: JsonField<Configuration>,
        private val deliveryMethod: JsonField<DeliveryMethod>,
        private val deliveryMethodId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("provider")
            @ExcludeMissing
            provider: JsonField<Provider> = JsonMissing.of(),
            @JsonProperty("configuration")
            @ExcludeMissing
            configuration: JsonField<Configuration> = JsonMissing.of(),
            @JsonProperty("delivery_method")
            @ExcludeMissing
            deliveryMethod: JsonField<DeliveryMethod> = JsonMissing.of(),
            @JsonProperty("delivery_method_id")
            @ExcludeMissing
            deliveryMethodId: JsonField<String> = JsonMissing.of(),
        ) : this(provider, configuration, deliveryMethod, deliveryMethodId, mutableMapOf())

        /**
         * The revenue system provider set for this configuration.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun provider(): Provider = provider.getRequired("provider")

        /**
         * Configuration for the revenue system provider. The structure of this object is specific
         * to the revenue system provider. For NetSuite, this should contain `netsuite_customer_id`.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun configuration(): Optional<Configuration> = configuration.getOptional("configuration")

        /**
         * The method to use for delivering invoices to this customer. If not provided, the
         * `delivery_method_id` must be provided.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun deliveryMethod(): Optional<DeliveryMethod> =
            deliveryMethod.getOptional("delivery_method")

        /**
         * ID of the delivery method to use for this customer. If not provided, the
         * `delivery_method` must be provided.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun deliveryMethodId(): Optional<String> =
            deliveryMethodId.getOptional("delivery_method_id")

        /**
         * Returns the raw JSON value of [provider].
         *
         * Unlike [provider], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("provider") @ExcludeMissing fun _provider(): JsonField<Provider> = provider

        /**
         * Returns the raw JSON value of [configuration].
         *
         * Unlike [configuration], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("configuration")
        @ExcludeMissing
        fun _configuration(): JsonField<Configuration> = configuration

        /**
         * Returns the raw JSON value of [deliveryMethod].
         *
         * Unlike [deliveryMethod], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("delivery_method")
        @ExcludeMissing
        fun _deliveryMethod(): JsonField<DeliveryMethod> = deliveryMethod

        /**
         * Returns the raw JSON value of [deliveryMethodId].
         *
         * Unlike [deliveryMethodId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("delivery_method_id")
        @ExcludeMissing
        fun _deliveryMethodId(): JsonField<String> = deliveryMethodId

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
             * Returns a mutable builder for constructing an instance of
             * [CustomerRevenueSystemConfiguration].
             *
             * The following fields are required:
             * ```java
             * .provider()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CustomerRevenueSystemConfiguration]. */
        class Builder internal constructor() {

            private var provider: JsonField<Provider>? = null
            private var configuration: JsonField<Configuration> = JsonMissing.of()
            private var deliveryMethod: JsonField<DeliveryMethod> = JsonMissing.of()
            private var deliveryMethodId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                customerRevenueSystemConfiguration: CustomerRevenueSystemConfiguration
            ) = apply {
                provider = customerRevenueSystemConfiguration.provider
                configuration = customerRevenueSystemConfiguration.configuration
                deliveryMethod = customerRevenueSystemConfiguration.deliveryMethod
                deliveryMethodId = customerRevenueSystemConfiguration.deliveryMethodId
                additionalProperties =
                    customerRevenueSystemConfiguration.additionalProperties.toMutableMap()
            }

            /** The revenue system provider set for this configuration. */
            fun provider(provider: Provider) = provider(JsonField.of(provider))

            /**
             * Sets [Builder.provider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.provider] with a well-typed [Provider] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun provider(provider: JsonField<Provider>) = apply { this.provider = provider }

            /**
             * Configuration for the revenue system provider. The structure of this object is
             * specific to the revenue system provider. For NetSuite, this should contain
             * `netsuite_customer_id`.
             */
            fun configuration(configuration: Configuration) =
                configuration(JsonField.of(configuration))

            /**
             * Sets [Builder.configuration] to an arbitrary JSON value.
             *
             * You should usually call [Builder.configuration] with a well-typed [Configuration]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun configuration(configuration: JsonField<Configuration>) = apply {
                this.configuration = configuration
            }

            /**
             * The method to use for delivering invoices to this customer. If not provided, the
             * `delivery_method_id` must be provided.
             */
            fun deliveryMethod(deliveryMethod: DeliveryMethod) =
                deliveryMethod(JsonField.of(deliveryMethod))

            /**
             * Sets [Builder.deliveryMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deliveryMethod] with a well-typed [DeliveryMethod]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun deliveryMethod(deliveryMethod: JsonField<DeliveryMethod>) = apply {
                this.deliveryMethod = deliveryMethod
            }

            /**
             * ID of the delivery method to use for this customer. If not provided, the
             * `delivery_method` must be provided.
             */
            fun deliveryMethodId(deliveryMethodId: String) =
                deliveryMethodId(JsonField.of(deliveryMethodId))

            /**
             * Sets [Builder.deliveryMethodId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deliveryMethodId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deliveryMethodId(deliveryMethodId: JsonField<String>) = apply {
                this.deliveryMethodId = deliveryMethodId
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
             * Returns an immutable instance of [CustomerRevenueSystemConfiguration].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .provider()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CustomerRevenueSystemConfiguration =
                CustomerRevenueSystemConfiguration(
                    checkRequired("provider", provider),
                    configuration,
                    deliveryMethod,
                    deliveryMethodId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): CustomerRevenueSystemConfiguration = apply {
            if (validated) {
                return@apply
            }

            provider().validate()
            configuration().ifPresent { it.validate() }
            deliveryMethod().ifPresent { it.validate() }
            deliveryMethodId()
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
            (provider.asKnown().getOrNull()?.validity() ?: 0) +
                (configuration.asKnown().getOrNull()?.validity() ?: 0) +
                (deliveryMethod.asKnown().getOrNull()?.validity() ?: 0) +
                (if (deliveryMethodId.asKnown().isPresent) 1 else 0)

        /** The revenue system provider set for this configuration. */
        class Provider @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val NETSUITE = of("netsuite")

                @JvmStatic fun of(value: String) = Provider(JsonField.of(value))
            }

            /** An enum containing [Provider]'s known values. */
            enum class Known {
                NETSUITE
            }

            /**
             * An enum containing [Provider]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Provider] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                NETSUITE,
                /**
                 * An enum member indicating that [Provider] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    NETSUITE -> Value.NETSUITE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    NETSUITE -> Known.NETSUITE
                    else -> throw MetronomeInvalidDataException("Unknown Provider: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Provider = apply {
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

                return other is Provider && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Configuration for the revenue system provider. The structure of this object is specific
         * to the revenue system provider. For NetSuite, this should contain `netsuite_customer_id`.
         */
        class Configuration
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

                /** Returns a mutable builder for constructing an instance of [Configuration]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Configuration]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(configuration: Configuration) = apply {
                    additionalProperties = configuration.additionalProperties.toMutableMap()
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

                /**
                 * Returns an immutable instance of [Configuration].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Configuration = Configuration(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Configuration = apply {
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

                return other is Configuration && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "Configuration{additionalProperties=$additionalProperties}"
        }

        /**
         * The method to use for delivering invoices to this customer. If not provided, the
         * `delivery_method_id` must be provided.
         */
        class DeliveryMethod
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val DIRECT_TO_BILLING_PROVIDER = of("direct_to_billing_provider")

                @JvmStatic fun of(value: String) = DeliveryMethod(JsonField.of(value))
            }

            /** An enum containing [DeliveryMethod]'s known values. */
            enum class Known {
                DIRECT_TO_BILLING_PROVIDER
            }

            /**
             * An enum containing [DeliveryMethod]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DeliveryMethod] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DIRECT_TO_BILLING_PROVIDER,
                /**
                 * An enum member indicating that [DeliveryMethod] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    DIRECT_TO_BILLING_PROVIDER -> Value.DIRECT_TO_BILLING_PROVIDER
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    DIRECT_TO_BILLING_PROVIDER -> Known.DIRECT_TO_BILLING_PROVIDER
                    else -> throw MetronomeInvalidDataException("Unknown DeliveryMethod: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): DeliveryMethod = apply {
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

                return other is DeliveryMethod && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CustomerRevenueSystemConfiguration &&
                provider == other.provider &&
                configuration == other.configuration &&
                deliveryMethod == other.deliveryMethod &&
                deliveryMethodId == other.deliveryMethodId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                provider,
                configuration,
                deliveryMethod,
                deliveryMethodId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CustomerRevenueSystemConfiguration{provider=$provider, configuration=$configuration, deliveryMethod=$deliveryMethod, deliveryMethodId=$deliveryMethodId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CustomerCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "CustomerCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
