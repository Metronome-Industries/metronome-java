// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.BaseDeserializer
import com.metronome.api.core.BaseSerializer
import com.metronome.api.core.JsonValue
import com.metronome.api.core.allMaxBy
import com.metronome.api.core.getOrThrow
import com.metronome.api.errors.MetronomeInvalidDataException
import com.metronome.api.models.Commit
import com.metronome.api.models.Credit
import java.util.Objects
import java.util.Optional

@JsonDeserialize(using = ContractListBalancesResponse.Deserializer::class)
@JsonSerialize(using = ContractListBalancesResponse.Serializer::class)
class ContractListBalancesResponse
private constructor(
    private val commit: Commit? = null,
    private val credit: Credit? = null,
    private val _json: JsonValue? = null,
) {

    fun commit(): Optional<Commit> = Optional.ofNullable(commit)

    fun credit(): Optional<Credit> = Optional.ofNullable(credit)

    fun isCommit(): Boolean = commit != null

    fun isCredit(): Boolean = credit != null

    fun asCommit(): Commit = commit.getOrThrow("commit")

    fun asCredit(): Credit = credit.getOrThrow("credit")

    fun _json(): Optional<JsonValue> = Optional.ofNullable(_json)

    fun <T> accept(visitor: Visitor<T>): T =
        when {
            commit != null -> visitor.visitCommit(commit)
            credit != null -> visitor.visitCredit(credit)
            else -> visitor.unknown(_json)
        }

    private var validated: Boolean = false

    fun validate(): ContractListBalancesResponse = apply {
        if (validated) {
            return@apply
        }

        accept(
            object : Visitor<Unit> {
                override fun visitCommit(commit: Commit) {
                    commit.validate()
                }

                override fun visitCredit(credit: Credit) {
                    credit.validate()
                }
            }
        )
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        accept(
            object : Visitor<Int> {
                override fun visitCommit(commit: Commit) = commit.validity()

                override fun visitCredit(credit: Credit) = credit.validity()

                override fun unknown(json: JsonValue?) = 0
            }
        )

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ContractListBalancesResponse &&
            commit == other.commit &&
            credit == other.credit
    }

    override fun hashCode(): Int = Objects.hash(commit, credit)

    override fun toString(): String =
        when {
            commit != null -> "ContractListBalancesResponse{commit=$commit}"
            credit != null -> "ContractListBalancesResponse{credit=$credit}"
            _json != null -> "ContractListBalancesResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid ContractListBalancesResponse")
        }

    companion object {

        @JvmStatic fun ofCommit(commit: Commit) = ContractListBalancesResponse(commit = commit)

        @JvmStatic fun ofCredit(credit: Credit) = ContractListBalancesResponse(credit = credit)
    }

    /**
     * An interface that defines how to map each variant of [ContractListBalancesResponse] to a
     * value of type [T].
     */
    interface Visitor<out T> {

        fun visitCommit(commit: Commit): T

        fun visitCredit(credit: Credit): T

        /**
         * Maps an unknown variant of [ContractListBalancesResponse] to a value of type [T].
         *
         * An instance of [ContractListBalancesResponse] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws MetronomeInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw MetronomeInvalidDataException("Unknown ContractListBalancesResponse: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<ContractListBalancesResponse>(ContractListBalancesResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): ContractListBalancesResponse {
            val json = JsonValue.fromJsonNode(node)

            val bestMatches =
                sequenceOf(
                        tryDeserialize(node, jacksonTypeRef<Commit>())?.let {
                            ContractListBalancesResponse(commit = it, _json = json)
                        },
                        tryDeserialize(node, jacksonTypeRef<Credit>())?.let {
                            ContractListBalancesResponse(credit = it, _json = json)
                        },
                    )
                    .filterNotNull()
                    .allMaxBy { it.validity() }
                    .toList()
            return when (bestMatches.size) {
                // This can happen if what we're deserializing is completely incompatible with all
                // the possible variants (e.g. deserializing from boolean).
                0 -> ContractListBalancesResponse(_json = json)
                1 -> bestMatches.single()
                // If there's more than one match with the highest validity, then use the first
                // completely valid match, or simply the first match if none are completely valid.
                else -> bestMatches.firstOrNull { it.isValid() } ?: bestMatches.first()
            }
        }
    }

    internal class Serializer :
        BaseSerializer<ContractListBalancesResponse>(ContractListBalancesResponse::class) {

        override fun serialize(
            value: ContractListBalancesResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.commit != null -> generator.writeObject(value.commit)
                value.credit != null -> generator.writeObject(value.credit)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid ContractListBalancesResponse")
            }
        }
    }
}
