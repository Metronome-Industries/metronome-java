// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

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
import com.metronome.api.core.getOrThrow
import com.metronome.api.errors.MetronomeInvalidDataException
import java.util.Objects
import java.util.Optional

@JsonDeserialize(using = V1ContractListBalancesResponse.Deserializer::class)
@JsonSerialize(using = V1ContractListBalancesResponse.Serializer::class)
class V1ContractListBalancesResponse
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

    fun <T> accept(visitor: Visitor<T>): T {
        return when {
            commit != null -> visitor.visitCommit(commit)
            credit != null -> visitor.visitCredit(credit)
            else -> visitor.unknown(_json)
        }
    }

    private var validated: Boolean = false

    fun validate(): V1ContractListBalancesResponse = apply {
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is V1ContractListBalancesResponse && commit == other.commit && credit == other.credit /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(commit, credit) /* spotless:on */

    override fun toString(): String =
        when {
            commit != null -> "V1ContractListBalancesResponse{commit=$commit}"
            credit != null -> "V1ContractListBalancesResponse{credit=$credit}"
            _json != null -> "V1ContractListBalancesResponse{_unknown=$_json}"
            else -> throw IllegalStateException("Invalid V1ContractListBalancesResponse")
        }

    companion object {

        @JvmStatic fun ofCommit(commit: Commit) = V1ContractListBalancesResponse(commit = commit)

        @JvmStatic fun ofCredit(credit: Credit) = V1ContractListBalancesResponse(credit = credit)
    }

    /**
     * An interface that defines how to map each variant of [V1ContractListBalancesResponse] to a
     * value of type [T].
     */
    interface Visitor<out T> {

        fun visitCommit(commit: Commit): T

        fun visitCredit(credit: Credit): T

        /**
         * Maps an unknown variant of [V1ContractListBalancesResponse] to a value of type [T].
         *
         * An instance of [V1ContractListBalancesResponse] can contain an unknown variant if it was
         * deserialized from data that doesn't match any known variant. For example, if the SDK is
         * on an older version than the API, then the API may respond with new variants that the SDK
         * is unaware of.
         *
         * @throws MetronomeInvalidDataException in the default implementation.
         */
        fun unknown(json: JsonValue?): T {
            throw MetronomeInvalidDataException("Unknown V1ContractListBalancesResponse: $json")
        }
    }

    internal class Deserializer :
        BaseDeserializer<V1ContractListBalancesResponse>(V1ContractListBalancesResponse::class) {

        override fun ObjectCodec.deserialize(node: JsonNode): V1ContractListBalancesResponse {
            val json = JsonValue.fromJsonNode(node)

            tryDeserialize(node, jacksonTypeRef<Commit>()) { it.validate() }
                ?.let {
                    return V1ContractListBalancesResponse(commit = it, _json = json)
                }
            tryDeserialize(node, jacksonTypeRef<Credit>()) { it.validate() }
                ?.let {
                    return V1ContractListBalancesResponse(credit = it, _json = json)
                }

            return V1ContractListBalancesResponse(_json = json)
        }
    }

    internal class Serializer :
        BaseSerializer<V1ContractListBalancesResponse>(V1ContractListBalancesResponse::class) {

        override fun serialize(
            value: V1ContractListBalancesResponse,
            generator: JsonGenerator,
            provider: SerializerProvider,
        ) {
            when {
                value.commit != null -> generator.writeObject(value.commit)
                value.credit != null -> generator.writeObject(value.credit)
                value._json != null -> generator.writeObject(value._json)
                else -> throw IllegalStateException("Invalid V1ContractListBalancesResponse")
            }
        }
    }
}
