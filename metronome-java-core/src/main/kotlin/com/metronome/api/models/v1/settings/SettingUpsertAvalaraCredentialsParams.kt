// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.settings

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
 * Set the Avalara credentials for some specified `delivery_method_ids`, which can be found in the
 * `/listConfiguredBillingProviders` response. This maps the Avalara credentials to the appropriate
 * billing entity. These credentials are only used for PLG Invoicing today.
 */
class SettingUpsertAvalaraCredentialsParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The Avalara environment to use (SANDBOX or PRODUCTION).
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun avalaraEnvironment(): AvalaraEnvironment = body.avalaraEnvironment()

    /**
     * The password for the Avalara account.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun avalaraPassword(): String = body.avalaraPassword()

    /**
     * The username for the Avalara account.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun avalaraUsername(): String = body.avalaraUsername()

    /**
     * The delivery method IDs of the billing provider configurations to update, can be found in the
     * response of the `/listConfiguredBillingProviders` endpoint.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun deliveryMethodIds(): List<String> = body.deliveryMethodIds()

    /**
     * Commit transactions if you want Metronome tax calculations used for reporting and tax
     * filings.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun commitTransactions(): Optional<Boolean> = body.commitTransactions()

    /**
     * Returns the raw JSON value of [avalaraEnvironment].
     *
     * Unlike [avalaraEnvironment], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _avalaraEnvironment(): JsonField<AvalaraEnvironment> = body._avalaraEnvironment()

    /**
     * Returns the raw JSON value of [avalaraPassword].
     *
     * Unlike [avalaraPassword], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _avalaraPassword(): JsonField<String> = body._avalaraPassword()

    /**
     * Returns the raw JSON value of [avalaraUsername].
     *
     * Unlike [avalaraUsername], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _avalaraUsername(): JsonField<String> = body._avalaraUsername()

    /**
     * Returns the raw JSON value of [deliveryMethodIds].
     *
     * Unlike [deliveryMethodIds], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _deliveryMethodIds(): JsonField<List<String>> = body._deliveryMethodIds()

    /**
     * Returns the raw JSON value of [commitTransactions].
     *
     * Unlike [commitTransactions], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _commitTransactions(): JsonField<Boolean> = body._commitTransactions()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SettingUpsertAvalaraCredentialsParams].
         *
         * The following fields are required:
         * ```java
         * .avalaraEnvironment()
         * .avalaraPassword()
         * .avalaraUsername()
         * .deliveryMethodIds()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SettingUpsertAvalaraCredentialsParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            settingUpsertAvalaraCredentialsParams: SettingUpsertAvalaraCredentialsParams
        ) = apply {
            body = settingUpsertAvalaraCredentialsParams.body.toBuilder()
            additionalHeaders = settingUpsertAvalaraCredentialsParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                settingUpsertAvalaraCredentialsParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [avalaraEnvironment]
         * - [avalaraPassword]
         * - [avalaraUsername]
         * - [deliveryMethodIds]
         * - [commitTransactions]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The Avalara environment to use (SANDBOX or PRODUCTION). */
        fun avalaraEnvironment(avalaraEnvironment: AvalaraEnvironment) = apply {
            body.avalaraEnvironment(avalaraEnvironment)
        }

        /**
         * Sets [Builder.avalaraEnvironment] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avalaraEnvironment] with a well-typed
         * [AvalaraEnvironment] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun avalaraEnvironment(avalaraEnvironment: JsonField<AvalaraEnvironment>) = apply {
            body.avalaraEnvironment(avalaraEnvironment)
        }

        /** The password for the Avalara account. */
        fun avalaraPassword(avalaraPassword: String) = apply {
            body.avalaraPassword(avalaraPassword)
        }

        /**
         * Sets [Builder.avalaraPassword] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avalaraPassword] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun avalaraPassword(avalaraPassword: JsonField<String>) = apply {
            body.avalaraPassword(avalaraPassword)
        }

        /** The username for the Avalara account. */
        fun avalaraUsername(avalaraUsername: String) = apply {
            body.avalaraUsername(avalaraUsername)
        }

        /**
         * Sets [Builder.avalaraUsername] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avalaraUsername] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun avalaraUsername(avalaraUsername: JsonField<String>) = apply {
            body.avalaraUsername(avalaraUsername)
        }

        /**
         * The delivery method IDs of the billing provider configurations to update, can be found in
         * the response of the `/listConfiguredBillingProviders` endpoint.
         */
        fun deliveryMethodIds(deliveryMethodIds: List<String>) = apply {
            body.deliveryMethodIds(deliveryMethodIds)
        }

        /**
         * Sets [Builder.deliveryMethodIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deliveryMethodIds] with a well-typed `List<String>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun deliveryMethodIds(deliveryMethodIds: JsonField<List<String>>) = apply {
            body.deliveryMethodIds(deliveryMethodIds)
        }

        /**
         * Adds a single [String] to [deliveryMethodIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addDeliveryMethodId(deliveryMethodId: String) = apply {
            body.addDeliveryMethodId(deliveryMethodId)
        }

        /**
         * Commit transactions if you want Metronome tax calculations used for reporting and tax
         * filings.
         */
        fun commitTransactions(commitTransactions: Boolean) = apply {
            body.commitTransactions(commitTransactions)
        }

        /**
         * Sets [Builder.commitTransactions] to an arbitrary JSON value.
         *
         * You should usually call [Builder.commitTransactions] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun commitTransactions(commitTransactions: JsonField<Boolean>) = apply {
            body.commitTransactions(commitTransactions)
        }

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
         * Returns an immutable instance of [SettingUpsertAvalaraCredentialsParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .avalaraEnvironment()
         * .avalaraPassword()
         * .avalaraUsername()
         * .deliveryMethodIds()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SettingUpsertAvalaraCredentialsParams =
            SettingUpsertAvalaraCredentialsParams(
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
        private val avalaraEnvironment: JsonField<AvalaraEnvironment>,
        private val avalaraPassword: JsonField<String>,
        private val avalaraUsername: JsonField<String>,
        private val deliveryMethodIds: JsonField<List<String>>,
        private val commitTransactions: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("avalara_environment")
            @ExcludeMissing
            avalaraEnvironment: JsonField<AvalaraEnvironment> = JsonMissing.of(),
            @JsonProperty("avalara_password")
            @ExcludeMissing
            avalaraPassword: JsonField<String> = JsonMissing.of(),
            @JsonProperty("avalara_username")
            @ExcludeMissing
            avalaraUsername: JsonField<String> = JsonMissing.of(),
            @JsonProperty("delivery_method_ids")
            @ExcludeMissing
            deliveryMethodIds: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("commit_transactions")
            @ExcludeMissing
            commitTransactions: JsonField<Boolean> = JsonMissing.of(),
        ) : this(
            avalaraEnvironment,
            avalaraPassword,
            avalaraUsername,
            deliveryMethodIds,
            commitTransactions,
            mutableMapOf(),
        )

        /**
         * The Avalara environment to use (SANDBOX or PRODUCTION).
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun avalaraEnvironment(): AvalaraEnvironment =
            avalaraEnvironment.getRequired("avalara_environment")

        /**
         * The password for the Avalara account.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun avalaraPassword(): String = avalaraPassword.getRequired("avalara_password")

        /**
         * The username for the Avalara account.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun avalaraUsername(): String = avalaraUsername.getRequired("avalara_username")

        /**
         * The delivery method IDs of the billing provider configurations to update, can be found in
         * the response of the `/listConfiguredBillingProviders` endpoint.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun deliveryMethodIds(): List<String> = deliveryMethodIds.getRequired("delivery_method_ids")

        /**
         * Commit transactions if you want Metronome tax calculations used for reporting and tax
         * filings.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun commitTransactions(): Optional<Boolean> =
            commitTransactions.getOptional("commit_transactions")

        /**
         * Returns the raw JSON value of [avalaraEnvironment].
         *
         * Unlike [avalaraEnvironment], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("avalara_environment")
        @ExcludeMissing
        fun _avalaraEnvironment(): JsonField<AvalaraEnvironment> = avalaraEnvironment

        /**
         * Returns the raw JSON value of [avalaraPassword].
         *
         * Unlike [avalaraPassword], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("avalara_password")
        @ExcludeMissing
        fun _avalaraPassword(): JsonField<String> = avalaraPassword

        /**
         * Returns the raw JSON value of [avalaraUsername].
         *
         * Unlike [avalaraUsername], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("avalara_username")
        @ExcludeMissing
        fun _avalaraUsername(): JsonField<String> = avalaraUsername

        /**
         * Returns the raw JSON value of [deliveryMethodIds].
         *
         * Unlike [deliveryMethodIds], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("delivery_method_ids")
        @ExcludeMissing
        fun _deliveryMethodIds(): JsonField<List<String>> = deliveryMethodIds

        /**
         * Returns the raw JSON value of [commitTransactions].
         *
         * Unlike [commitTransactions], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("commit_transactions")
        @ExcludeMissing
        fun _commitTransactions(): JsonField<Boolean> = commitTransactions

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
             * .avalaraEnvironment()
             * .avalaraPassword()
             * .avalaraUsername()
             * .deliveryMethodIds()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var avalaraEnvironment: JsonField<AvalaraEnvironment>? = null
            private var avalaraPassword: JsonField<String>? = null
            private var avalaraUsername: JsonField<String>? = null
            private var deliveryMethodIds: JsonField<MutableList<String>>? = null
            private var commitTransactions: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                avalaraEnvironment = body.avalaraEnvironment
                avalaraPassword = body.avalaraPassword
                avalaraUsername = body.avalaraUsername
                deliveryMethodIds = body.deliveryMethodIds.map { it.toMutableList() }
                commitTransactions = body.commitTransactions
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The Avalara environment to use (SANDBOX or PRODUCTION). */
            fun avalaraEnvironment(avalaraEnvironment: AvalaraEnvironment) =
                avalaraEnvironment(JsonField.of(avalaraEnvironment))

            /**
             * Sets [Builder.avalaraEnvironment] to an arbitrary JSON value.
             *
             * You should usually call [Builder.avalaraEnvironment] with a well-typed
             * [AvalaraEnvironment] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun avalaraEnvironment(avalaraEnvironment: JsonField<AvalaraEnvironment>) = apply {
                this.avalaraEnvironment = avalaraEnvironment
            }

            /** The password for the Avalara account. */
            fun avalaraPassword(avalaraPassword: String) =
                avalaraPassword(JsonField.of(avalaraPassword))

            /**
             * Sets [Builder.avalaraPassword] to an arbitrary JSON value.
             *
             * You should usually call [Builder.avalaraPassword] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun avalaraPassword(avalaraPassword: JsonField<String>) = apply {
                this.avalaraPassword = avalaraPassword
            }

            /** The username for the Avalara account. */
            fun avalaraUsername(avalaraUsername: String) =
                avalaraUsername(JsonField.of(avalaraUsername))

            /**
             * Sets [Builder.avalaraUsername] to an arbitrary JSON value.
             *
             * You should usually call [Builder.avalaraUsername] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun avalaraUsername(avalaraUsername: JsonField<String>) = apply {
                this.avalaraUsername = avalaraUsername
            }

            /**
             * The delivery method IDs of the billing provider configurations to update, can be
             * found in the response of the `/listConfiguredBillingProviders` endpoint.
             */
            fun deliveryMethodIds(deliveryMethodIds: List<String>) =
                deliveryMethodIds(JsonField.of(deliveryMethodIds))

            /**
             * Sets [Builder.deliveryMethodIds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deliveryMethodIds] with a well-typed `List<String>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun deliveryMethodIds(deliveryMethodIds: JsonField<List<String>>) = apply {
                this.deliveryMethodIds = deliveryMethodIds.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [deliveryMethodIds].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDeliveryMethodId(deliveryMethodId: String) = apply {
                deliveryMethodIds =
                    (deliveryMethodIds ?: JsonField.of(mutableListOf())).also {
                        checkKnown("deliveryMethodIds", it).add(deliveryMethodId)
                    }
            }

            /**
             * Commit transactions if you want Metronome tax calculations used for reporting and tax
             * filings.
             */
            fun commitTransactions(commitTransactions: Boolean) =
                commitTransactions(JsonField.of(commitTransactions))

            /**
             * Sets [Builder.commitTransactions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commitTransactions] with a well-typed [Boolean]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun commitTransactions(commitTransactions: JsonField<Boolean>) = apply {
                this.commitTransactions = commitTransactions
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
             * .avalaraEnvironment()
             * .avalaraPassword()
             * .avalaraUsername()
             * .deliveryMethodIds()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("avalaraEnvironment", avalaraEnvironment),
                    checkRequired("avalaraPassword", avalaraPassword),
                    checkRequired("avalaraUsername", avalaraUsername),
                    checkRequired("deliveryMethodIds", deliveryMethodIds).map { it.toImmutable() },
                    commitTransactions,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            avalaraEnvironment().validate()
            avalaraPassword()
            avalaraUsername()
            deliveryMethodIds()
            commitTransactions()
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
            (avalaraEnvironment.asKnown().getOrNull()?.validity() ?: 0) +
                (if (avalaraPassword.asKnown().isPresent) 1 else 0) +
                (if (avalaraUsername.asKnown().isPresent) 1 else 0) +
                (deliveryMethodIds.asKnown().getOrNull()?.size ?: 0) +
                (if (commitTransactions.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                avalaraEnvironment == other.avalaraEnvironment &&
                avalaraPassword == other.avalaraPassword &&
                avalaraUsername == other.avalaraUsername &&
                deliveryMethodIds == other.deliveryMethodIds &&
                commitTransactions == other.commitTransactions &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                avalaraEnvironment,
                avalaraPassword,
                avalaraUsername,
                deliveryMethodIds,
                commitTransactions,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{avalaraEnvironment=$avalaraEnvironment, avalaraPassword=$avalaraPassword, avalaraUsername=$avalaraUsername, deliveryMethodIds=$deliveryMethodIds, commitTransactions=$commitTransactions, additionalProperties=$additionalProperties}"
    }

    /** The Avalara environment to use (SANDBOX or PRODUCTION). */
    class AvalaraEnvironment
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PRODUCTION = of("PRODUCTION")

            @JvmField val SANDBOX = of("SANDBOX")

            @JvmStatic fun of(value: String) = AvalaraEnvironment(JsonField.of(value))
        }

        /** An enum containing [AvalaraEnvironment]'s known values. */
        enum class Known {
            PRODUCTION,
            SANDBOX,
        }

        /**
         * An enum containing [AvalaraEnvironment]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AvalaraEnvironment] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PRODUCTION,
            SANDBOX,
            /**
             * An enum member indicating that [AvalaraEnvironment] was instantiated with an unknown
             * value.
             */
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
                PRODUCTION -> Value.PRODUCTION
                SANDBOX -> Value.SANDBOX
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
                PRODUCTION -> Known.PRODUCTION
                SANDBOX -> Known.SANDBOX
                else -> throw MetronomeInvalidDataException("Unknown AvalaraEnvironment: $value")
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

        fun validate(): AvalaraEnvironment = apply {
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

            return other is AvalaraEnvironment && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SettingUpsertAvalaraCredentialsParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "SettingUpsertAvalaraCredentialsParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
