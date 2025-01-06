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
    @JsonProperty("action")
    @ExcludeMissing
    private val action: JsonField<String> = JsonMissing.of(),
    @JsonProperty("actor") @ExcludeMissing private val actor: JsonField<Actor> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("resource_id")
    @ExcludeMissing
    private val resourceId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("resource_type")
    @ExcludeMissing
    private val resourceType: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

    fun action(): Optional<String> = Optional.ofNullable(action.getNullable("action"))

    fun actor(): Optional<Actor> = Optional.ofNullable(actor.getNullable("actor"))

    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    fun resourceId(): Optional<String> = Optional.ofNullable(resourceId.getNullable("resource_id"))

    fun resourceType(): Optional<String> =
        Optional.ofNullable(resourceType.getNullable("resource_type"))

    fun status(): Optional<Status> = Optional.ofNullable(status.getNullable("status"))

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("timestamp") @ExcludeMissing fun _timestamp() = timestamp

    @JsonProperty("action") @ExcludeMissing fun _action() = action

    @JsonProperty("actor") @ExcludeMissing fun _actor() = actor

    @JsonProperty("description") @ExcludeMissing fun _description() = description

    @JsonProperty("resource_id") @ExcludeMissing fun _resourceId() = resourceId

    @JsonProperty("resource_type") @ExcludeMissing fun _resourceType() = resourceType

    @JsonProperty("status") @ExcludeMissing fun _status() = status

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AuditLogListResponse = apply {
        if (!validated) {
            id()
            timestamp()
            action()
            actor().map { it.validate() }
            description()
            resourceId()
            resourceType()
            status()
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
        private var action: JsonField<String> = JsonMissing.of()
        private var actor: JsonField<Actor> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var resourceId: JsonField<String> = JsonMissing.of()
        private var resourceType: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(auditLogListResponse: AuditLogListResponse) = apply {
            id = auditLogListResponse.id
            timestamp = auditLogListResponse.timestamp
            action = auditLogListResponse.action
            actor = auditLogListResponse.actor
            description = auditLogListResponse.description
            resourceId = auditLogListResponse.resourceId
            resourceType = auditLogListResponse.resourceType
            status = auditLogListResponse.status
            additionalProperties = auditLogListResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

        fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply { this.timestamp = timestamp }

        fun action(action: String) = action(JsonField.of(action))

        fun action(action: JsonField<String>) = apply { this.action = action }

        fun actor(actor: Actor) = actor(JsonField.of(actor))

        fun actor(actor: JsonField<Actor>) = apply { this.actor = actor }

        fun description(description: String) = description(JsonField.of(description))

        fun description(description: JsonField<String>) = apply { this.description = description }

        fun resourceId(resourceId: String) = resourceId(JsonField.of(resourceId))

        fun resourceId(resourceId: JsonField<String>) = apply { this.resourceId = resourceId }

        fun resourceType(resourceType: String) = resourceType(JsonField.of(resourceType))

        fun resourceType(resourceType: JsonField<String>) = apply {
            this.resourceType = resourceType
        }

        fun status(status: Status) = status(JsonField.of(status))

        fun status(status: JsonField<Status>) = apply { this.status = status }

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
                action,
                actor,
                description,
                resourceId,
                resourceType,
                status,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class Actor
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email")
        @ExcludeMissing
        private val email: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun name(): String = name.getRequired("name")

        fun email(): Optional<String> = Optional.ofNullable(email.getNullable("email"))

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonProperty("email") @ExcludeMissing fun _email() = email

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Actor = apply {
            if (!validated) {
                id()
                name()
                email()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var id: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var email: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(actor: Actor) = apply {
                id = actor.id
                name = actor.name
                email = actor.email
                additionalProperties = actor.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun name(name: String) = name(JsonField.of(name))

            fun name(name: JsonField<String>) = apply { this.name = name }

            fun email(email: String) = email(JsonField.of(email))

            fun email(email: JsonField<String>) = apply { this.email = email }

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
                    name,
                    email,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Actor && id == other.id && name == other.name && email == other.email && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, name, email, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Actor{id=$id, name=$name, email=$email, additionalProperties=$additionalProperties}"
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

        return /* spotless:off */ other is AuditLogListResponse && id == other.id && timestamp == other.timestamp && action == other.action && actor == other.actor && description == other.description && resourceId == other.resourceId && resourceType == other.resourceType && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, timestamp, action, actor, description, resourceId, resourceType, status, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AuditLogListResponse{id=$id, timestamp=$timestamp, action=$action, actor=$actor, description=$description, resourceId=$resourceId, resourceType=$resourceType, status=$status, additionalProperties=$additionalProperties}"
}
