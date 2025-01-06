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
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class ContractRateCardRetrieveResponse
@JsonCreator
private constructor(
    @JsonProperty("data") @ExcludeMissing private val data: JsonField<Data> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun data(): Data = data.getRequired("data")

    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): ContractRateCardRetrieveResponse = apply {
        if (!validated) {
            data().validate()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var data: JsonField<Data> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(contractRateCardRetrieveResponse: ContractRateCardRetrieveResponse) =
            apply {
                data = contractRateCardRetrieveResponse.data
                additionalProperties =
                    contractRateCardRetrieveResponse.additionalProperties.toMutableMap()
            }

        fun data(data: Data) = data(JsonField.of(data))

        fun data(data: JsonField<Data>) = apply { this.data = data }

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

        fun build(): ContractRateCardRetrieveResponse =
            ContractRateCardRetrieveResponse(data, additionalProperties.toImmutable())
    }

    @NoAutoDetect
    class Data
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("created_by")
        @ExcludeMissing
        private val createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("aliases")
        @ExcludeMissing
        private val aliases: JsonField<List<Alias>> = JsonMissing.of(),
        @JsonProperty("credit_type_conversions")
        @ExcludeMissing
        private val creditTypeConversions: JsonField<List<CreditTypeConversion>> = JsonMissing.of(),
        @JsonProperty("custom_fields")
        @ExcludeMissing
        private val customFields: JsonField<CustomFields> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        private val description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fiat_credit_type")
        @ExcludeMissing
        private val fiatCreditType: JsonField<CreditTypeData> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        fun createdBy(): String = createdBy.getRequired("created_by")

        fun name(): String = name.getRequired("name")

        fun aliases(): Optional<List<Alias>> = Optional.ofNullable(aliases.getNullable("aliases"))

        fun creditTypeConversions(): Optional<List<CreditTypeConversion>> =
            Optional.ofNullable(creditTypeConversions.getNullable("credit_type_conversions"))

        fun customFields(): Optional<CustomFields> =
            Optional.ofNullable(customFields.getNullable("custom_fields"))

        fun description(): Optional<String> =
            Optional.ofNullable(description.getNullable("description"))

        fun fiatCreditType(): Optional<CreditTypeData> =
            Optional.ofNullable(fiatCreditType.getNullable("fiat_credit_type"))

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonProperty("created_by") @ExcludeMissing fun _createdBy() = createdBy

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonProperty("aliases") @ExcludeMissing fun _aliases() = aliases

        @JsonProperty("credit_type_conversions")
        @ExcludeMissing
        fun _creditTypeConversions() = creditTypeConversions

        @JsonProperty("custom_fields") @ExcludeMissing fun _customFields() = customFields

        @JsonProperty("description") @ExcludeMissing fun _description() = description

        @JsonProperty("fiat_credit_type") @ExcludeMissing fun _fiatCreditType() = fiatCreditType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (!validated) {
                id()
                createdAt()
                createdBy()
                name()
                aliases().map { it.forEach { it.validate() } }
                creditTypeConversions().map { it.forEach { it.validate() } }
                customFields().map { it.validate() }
                description()
                fiatCreditType().map { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdBy: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var aliases: JsonField<List<Alias>> = JsonMissing.of()
            private var creditTypeConversions: JsonField<List<CreditTypeConversion>> =
                JsonMissing.of()
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var description: JsonField<String> = JsonMissing.of()
            private var fiatCreditType: JsonField<CreditTypeData> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                createdAt = data.createdAt
                createdBy = data.createdBy
                name = data.name
                aliases = data.aliases
                creditTypeConversions = data.creditTypeConversions
                customFields = data.customFields
                description = data.description
                fiatCreditType = data.fiatCreditType
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

            fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

            fun name(name: String) = name(JsonField.of(name))

            fun name(name: JsonField<String>) = apply { this.name = name }

            fun aliases(aliases: List<Alias>) = aliases(JsonField.of(aliases))

            fun aliases(aliases: JsonField<List<Alias>>) = apply { this.aliases = aliases }

            fun creditTypeConversions(creditTypeConversions: List<CreditTypeConversion>) =
                creditTypeConversions(JsonField.of(creditTypeConversions))

            fun creditTypeConversions(
                creditTypeConversions: JsonField<List<CreditTypeConversion>>
            ) = apply { this.creditTypeConversions = creditTypeConversions }

            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

            fun customFields(customFields: JsonField<CustomFields>) = apply {
                this.customFields = customFields
            }

            fun description(description: String) = description(JsonField.of(description))

            fun description(description: JsonField<String>) = apply {
                this.description = description
            }

            fun fiatCreditType(fiatCreditType: CreditTypeData) =
                fiatCreditType(JsonField.of(fiatCreditType))

            fun fiatCreditType(fiatCreditType: JsonField<CreditTypeData>) = apply {
                this.fiatCreditType = fiatCreditType
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

            fun build(): Data =
                Data(
                    id,
                    createdAt,
                    createdBy,
                    name,
                    aliases.map { it.toImmutable() },
                    creditTypeConversions.map { it.toImmutable() },
                    customFields,
                    description,
                    fiatCreditType,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class Alias
        @JsonCreator
        private constructor(
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ending_before")
            @ExcludeMissing
            private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("starting_at")
            @ExcludeMissing
            private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun name(): String = name.getRequired("name")

            fun endingBefore(): Optional<OffsetDateTime> =
                Optional.ofNullable(endingBefore.getNullable("ending_before"))

            fun startingAt(): Optional<OffsetDateTime> =
                Optional.ofNullable(startingAt.getNullable("starting_at"))

            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonProperty("ending_before") @ExcludeMissing fun _endingBefore() = endingBefore

            @JsonProperty("starting_at") @ExcludeMissing fun _startingAt() = startingAt

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Alias = apply {
                if (!validated) {
                    name()
                    endingBefore()
                    startingAt()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var name: JsonField<String> = JsonMissing.of()
                private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
                private var startingAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(alias: Alias) = apply {
                    name = alias.name
                    endingBefore = alias.endingBefore
                    startingAt = alias.startingAt
                    additionalProperties = alias.additionalProperties.toMutableMap()
                }

                fun name(name: String) = name(JsonField.of(name))

                fun name(name: JsonField<String>) = apply { this.name = name }

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

                fun build(): Alias =
                    Alias(
                        name,
                        endingBefore,
                        startingAt,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Alias && name == other.name && endingBefore == other.endingBefore && startingAt == other.startingAt && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(name, endingBefore, startingAt, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Alias{name=$name, endingBefore=$endingBefore, startingAt=$startingAt, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class CreditTypeConversion
        @JsonCreator
        private constructor(
            @JsonProperty("custom_credit_type")
            @ExcludeMissing
            private val customCreditType: JsonField<CreditTypeData> = JsonMissing.of(),
            @JsonProperty("fiat_per_custom_credit")
            @ExcludeMissing
            private val fiatPerCustomCredit: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun customCreditType(): CreditTypeData =
                customCreditType.getRequired("custom_credit_type")

            fun fiatPerCustomCredit(): String =
                fiatPerCustomCredit.getRequired("fiat_per_custom_credit")

            @JsonProperty("custom_credit_type")
            @ExcludeMissing
            fun _customCreditType() = customCreditType

            @JsonProperty("fiat_per_custom_credit")
            @ExcludeMissing
            fun _fiatPerCustomCredit() = fiatPerCustomCredit

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CreditTypeConversion = apply {
                if (!validated) {
                    customCreditType().validate()
                    fiatPerCustomCredit()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var customCreditType: JsonField<CreditTypeData> = JsonMissing.of()
                private var fiatPerCustomCredit: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(creditTypeConversion: CreditTypeConversion) = apply {
                    customCreditType = creditTypeConversion.customCreditType
                    fiatPerCustomCredit = creditTypeConversion.fiatPerCustomCredit
                    additionalProperties = creditTypeConversion.additionalProperties.toMutableMap()
                }

                fun customCreditType(customCreditType: CreditTypeData) =
                    customCreditType(JsonField.of(customCreditType))

                fun customCreditType(customCreditType: JsonField<CreditTypeData>) = apply {
                    this.customCreditType = customCreditType
                }

                fun fiatPerCustomCredit(fiatPerCustomCredit: String) =
                    fiatPerCustomCredit(JsonField.of(fiatPerCustomCredit))

                fun fiatPerCustomCredit(fiatPerCustomCredit: JsonField<String>) = apply {
                    this.fiatPerCustomCredit = fiatPerCustomCredit
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

                fun build(): CreditTypeConversion =
                    CreditTypeConversion(
                        customCreditType,
                        fiatPerCustomCredit,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CreditTypeConversion && customCreditType == other.customCreditType && fiatPerCustomCredit == other.fiatPerCustomCredit && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(customCreditType, fiatPerCustomCredit, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreditTypeConversion{customCreditType=$customCreditType, fiatPerCustomCredit=$fiatPerCustomCredit, additionalProperties=$additionalProperties}"
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
                    additionalProperties = customFields.additionalProperties.toMutableMap()
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

            return /* spotless:off */ other is Data && id == other.id && createdAt == other.createdAt && createdBy == other.createdBy && name == other.name && aliases == other.aliases && creditTypeConversions == other.creditTypeConversions && customFields == other.customFields && description == other.description && fiatCreditType == other.fiatCreditType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, createdAt, createdBy, name, aliases, creditTypeConversions, customFields, description, fiatCreditType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, createdAt=$createdAt, createdBy=$createdBy, name=$name, aliases=$aliases, creditTypeConversions=$creditTypeConversions, customFields=$customFields, description=$description, fiatCreditType=$fiatCreditType, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ContractRateCardRetrieveResponse && data == other.data && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(data, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ContractRateCardRetrieveResponse{data=$data, additionalProperties=$additionalProperties}"
}
