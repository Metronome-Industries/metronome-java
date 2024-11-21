// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = AuditLogListResponse.Builder::class)
@NoAutoDetect
class AuditLogListResponse
private constructor(
    private val id: JsonField<String>,
    private val timestamp: JsonField<OffsetDateTime>,
    private val actor: JsonField<Actor>,
    private val resourceType: JsonField<String>,
    private val resourceId: JsonField<String>,
    private val action: JsonField<String>,
    private val status: JsonField<Status>,
    private val description: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

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
            this.id = auditLogListResponse.id
            this.timestamp = auditLogListResponse.timestamp
            this.actor = auditLogListResponse.actor
            this.resourceType = auditLogListResponse.resourceType
            this.resourceId = auditLogListResponse.resourceId
            this.action = auditLogListResponse.action
            this.status = auditLogListResponse.status
            this.description = auditLogListResponse.description
            additionalProperties(auditLogListResponse.additionalProperties)
        }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

        @JsonProperty("timestamp")
        @ExcludeMissing
        fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply { this.timestamp = timestamp }

        fun actor(actor: Actor) = actor(JsonField.of(actor))

        @JsonProperty("actor")
        @ExcludeMissing
        fun actor(actor: JsonField<Actor>) = apply { this.actor = actor }

        fun resourceType(resourceType: String) = resourceType(JsonField.of(resourceType))

        @JsonProperty("resource_type")
        @ExcludeMissing
        fun resourceType(resourceType: JsonField<String>) = apply {
            this.resourceType = resourceType
        }

        fun resourceId(resourceId: String) = resourceId(JsonField.of(resourceId))

        @JsonProperty("resource_id")
        @ExcludeMissing
        fun resourceId(resourceId: JsonField<String>) = apply { this.resourceId = resourceId }

        fun action(action: String) = action(JsonField.of(action))

        @JsonProperty("action")
        @ExcludeMissing
        fun action(action: JsonField<String>) = apply { this.action = action }

        fun status(status: Status) = status(JsonField.of(status))

        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun description(description: String) = description(JsonField.of(description))

        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
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

    @JsonDeserialize(builder = Actor.Builder::class)
    @NoAutoDetect
    class Actor
    private constructor(
        private val id: JsonField<String>,
        private val email: JsonField<String>,
        private val name: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun id(): String = id.getRequired("id")

        fun email(): Optional<String> = Optional.ofNullable(email.getNullable("email"))

        fun name(): String = name.getRequired("name")

        @JsonProperty("id") @ExcludeMissing fun _id() = id

        @JsonProperty("email") @ExcludeMissing fun _email() = email

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
                this.id = actor.id
                this.email = actor.email
                this.name = actor.name
                additionalProperties(actor.additionalProperties)
            }

            fun id(id: String) = id(JsonField.of(id))

            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun email(email: String) = email(JsonField.of(email))

            @JsonProperty("email")
            @ExcludeMissing
            fun email(email: JsonField<String>) = apply { this.email = email }

            fun name(name: String) = name(JsonField.of(name))

            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val SUCCESS = Status(JsonField.of("success"))

            @JvmField val FAILURE = Status(JsonField.of("failure"))

            @JvmField val PENDING = Status(JsonField.of("pending"))

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
