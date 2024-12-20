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
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class AuditLogListResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("timestamp")
    @ExcludeMissing
    private val timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("actor") @ExcludeMissing private val actor: JsonField<Actor> = JsonMissing.of(),
    @JsonProperty("resource_type")
    @ExcludeMissing
    private val resourceType: JsonField<String> = JsonMissing.of(),
    @JsonProperty("resource_id")
    @ExcludeMissing
    private val resourceId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("action")
    @ExcludeMissing
    private val action: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

    fun actor(): Optional<Actor> = Optional.ofNullable(actor.getNullable("actor"))

    fun resourceType(): Optional<String> =
        Optional.ofNullable(resourceType.getNullable("resource_type"))

    fun resourceId(): Optional<String> = Optional.ofNullable(resourceId.getNullable("resource_id"))

    fun action(): Optional<String> = Optional.ofNullable(action.getNullable("action"))

    fun status(): Optional<Status> = Optional.ofNullable(status.getNullable("status"))

    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("timestamp") @ExcludeMissing fun _timestamp() = timestamp

    @JsonProperty("actor") @ExcludeMissing fun _actor() = actor

    @JsonProperty("resource_type") @ExcludeMissing fun _resourceType() = resourceType

    @JsonProperty("resource_id") @ExcludeMissing fun _resourceId() = resourceId

    @JsonProperty("action") @ExcludeMissing fun _action() = action

    @JsonProperty("status") @ExcludeMissing fun _status() = status

    @JsonProperty("description") @ExcludeMissing fun _description() = description

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AuditLogListResponse = apply {
        if (!validated) {
            id()
            timestamp()
            actor().map { it.validate() }
            resourceType()
            resourceId()
            action()
            status()
            description()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var timestamp: JsonField<OffsetDateTime> = JsonMissing.of()
        private var actor: JsonField<Actor> = JsonMissing.of()
        private var resourceType: JsonField<String> = JsonMissing.of()
        private var resourceId: JsonField<String> = JsonMissing.of()
        private var action: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(auditLogListResponse: AuditLogListResponse) = apply {
            id = auditLogListResponse.id
            timestamp = auditLogListResponse.timestamp
            actor = auditLogListResponse.actor
            resourceType = auditLogListResponse.resourceType
            resourceId = auditLogListResponse.resourceId
            action = auditLogListResponse.action
            status = auditLogListResponse.status
            description = auditLogListResponse.description
            additionalProperties = auditLogListResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

        fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply { this.timestamp = timestamp }

        fun actor(actor: Actor) = actor(JsonField.of(actor))

        fun actor(actor: JsonField<Actor>) = apply { this.actor = actor }

        fun resourceType(resourceType: String) = resourceType(JsonField.of(resourceType))

        fun resourceType(resourceType: JsonField<String>) = apply {
            this.resourceType = resourceType
        }

        fun resourceId(resourceId: String) = resourceId(JsonField.of(resourceId))

        fun resourceId(resourceId: JsonField<String>) = apply { this.resourceId = resourceId }

        fun action(action: String) = action(JsonField.of(action))

        fun action(action: JsonField<String>) = apply { this.action = action }

        fun status(status: Status) = status(JsonField.of(status))

        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun description(description: String) = description(JsonField.of(description))

        fun description(description: JsonField<String>) = apply { this.description = description }

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

        fun build(): AuditLogListResponse =
            AuditLogListResponse(
                id,
                timestamp,
                actor,
                resourceType,
                resourceId,
                action,
                status,
                description,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Actor
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email")
        @ExcludeMissing
        private val email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun email(): Optional<String> = Optional.ofNullable(email.getNullable("email"))

        fun name(): String = name.getRequired("name")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("email") @ExcludeMissing fun _email() = email

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Actor = apply {
            if (!validated) {
                id()
                email()
                name()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(actor: Actor) = apply {
                id = actor.id
                email = actor.email
                name = actor.name
                additionalProperties = actor.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun email(email: String) = email(JsonField.of(email))

            fun email(email: JsonField<String>) = apply { this.email = email }

            fun name(name: String) = name(JsonField.of(name))

            fun name(name: JsonField<String>) = apply { this.name = name }

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

            fun build(): Actor =
                Actor(
                    id,
                    email,
                    name,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Actor && id == other.id && email == other.email && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, email, name, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Actor{id=$id, email=$email, name=$name, additionalProperties=$additionalProperties}"
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val SUCCESS = of("success")

            @JvmField val FAILURE = of("failure")

            @JvmField val PENDING = of("pending")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            SUCCESS,
            FAILURE,
            PENDING,
        }

        enum class Value {
            SUCCESS,
            FAILURE,
            PENDING,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                SUCCESS -> Value.SUCCESS
                FAILURE -> Value.FAILURE
                PENDING -> Value.PENDING
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                SUCCESS -> Known.SUCCESS
                FAILURE -> Known.FAILURE
                PENDING -> Known.PENDING
                else -> throw MetronomeInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AuditLogListResponse && id == other.id && timestamp == other.timestamp && actor == other.actor && resourceType == other.resourceType && resourceId == other.resourceId && action == other.action && status == other.status && description == other.description && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, timestamp, actor, resourceType, resourceId, action, status, description, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AuditLogListResponse{id=$id, timestamp=$timestamp, actor=$actor, resourceType=$resourceType, resourceId=$resourceId, action=$action, status=$status, description=$description, additionalProperties=$additionalProperties}"
}
