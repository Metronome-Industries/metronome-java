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
import com.metronome.api.core.checkRequired
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
    @JsonProperty("request")
    @ExcludeMissing
    private val request: JsonField<Request> = JsonMissing.of(),
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

    fun request(): Request = request.getRequired("request")

    fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

    fun action(): Optional<String> = Optional.ofNullable(action.getNullable("action"))

    fun actor(): Optional<Actor> = Optional.ofNullable(actor.getNullable("actor"))

    fun description(): Optional<String> =
        Optional.ofNullable(description.getNullable("description"))

    fun resourceId(): Optional<String> = Optional.ofNullable(resourceId.getNullable("resource_id"))

    fun resourceType(): Optional<String> =
        Optional.ofNullable(resourceType.getNullable("resource_type"))

    fun status(): Optional<Status> = Optional.ofNullable(status.getNullable("status"))

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    @JsonProperty("request") @ExcludeMissing fun _request(): JsonField<Request> = request

    @JsonProperty("timestamp")
    @ExcludeMissing
    fun _timestamp(): JsonField<OffsetDateTime> = timestamp

    @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<String> = action

    @JsonProperty("actor") @ExcludeMissing fun _actor(): JsonField<Actor> = actor

    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    @JsonProperty("resource_id") @ExcludeMissing fun _resourceId(): JsonField<String> = resourceId

    @JsonProperty("resource_type")
    @ExcludeMissing
    fun _resourceType(): JsonField<String> = resourceType

    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AuditLogListResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        request().validate()
        timestamp()
        action()
        actor().ifPresent { it.validate() }
        description()
        resourceId()
        resourceType()
        status()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AuditLogListResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var request: JsonField<Request>? = null
        private var timestamp: JsonField<OffsetDateTime>? = null
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
            request = auditLogListResponse.request
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

        fun request(request: Request) = request(JsonField.of(request))

        fun request(request: JsonField<Request>) = apply { this.request = request }

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
                checkRequired("id", id),
                checkRequired("request", request),
                checkRequired("timestamp", timestamp),
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
    class Request
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ip") @ExcludeMissing private val ip: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_agent")
        @ExcludeMissing
        private val userAgent: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun id(): String = id.getRequired("id")

        fun ip(): Optional<String> = Optional.ofNullable(ip.getNullable("ip"))

        fun userAgent(): Optional<String> = Optional.ofNullable(userAgent.getNullable("user_agent"))

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("ip") @ExcludeMissing fun _ip(): JsonField<String> = ip

        @JsonProperty("user_agent") @ExcludeMissing fun _userAgent(): JsonField<String> = userAgent

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Request = apply {
            if (validated) {
                return@apply
            }

            id()
            ip()
            userAgent()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Request]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var ip: JsonField<String> = JsonMissing.of()
            private var userAgent: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(request: Request) = apply {
                id = request.id
                ip = request.ip
                userAgent = request.userAgent
                additionalProperties = request.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            fun id(id: JsonField<String>) = apply { this.id = id }

            fun ip(ip: String) = ip(JsonField.of(ip))

            fun ip(ip: JsonField<String>) = apply { this.ip = ip }

            fun userAgent(userAgent: String) = userAgent(JsonField.of(userAgent))

            fun userAgent(userAgent: JsonField<String>) = apply { this.userAgent = userAgent }

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

            fun build(): Request =
                Request(checkRequired("id", id), ip, userAgent, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Request && id == other.id && ip == other.ip && userAgent == other.userAgent && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(id, ip, userAgent, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Request{id=$id, ip=$ip, userAgent=$userAgent, additionalProperties=$additionalProperties}"
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

        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Actor = apply {
            if (validated) {
                return@apply
            }

            id()
            name()
            email()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Actor]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var name: JsonField<String>? = null
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
                    checkRequired("id", id),
                    checkRequired("name", name),
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

    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val SUCCESS = of("success")

            @JvmField val FAILURE = of("failure")

            @JvmField val PENDING = of("pending")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            SUCCESS,
            FAILURE,
            PENDING,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            SUCCESS,
            FAILURE,
            PENDING,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                SUCCESS -> Value.SUCCESS
                FAILURE -> Value.FAILURE
                PENDING -> Value.PENDING
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
                SUCCESS -> Known.SUCCESS
                FAILURE -> Known.FAILURE
                PENDING -> Known.PENDING
                else -> throw MetronomeInvalidDataException("Unknown Status: $value")
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

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AuditLogListResponse && id == other.id && request == other.request && timestamp == other.timestamp && action == other.action && actor == other.actor && description == other.description && resourceId == other.resourceId && resourceType == other.resourceType && status == other.status && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, request, timestamp, action, actor, description, resourceId, resourceType, status, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AuditLogListResponse{id=$id, request=$request, timestamp=$timestamp, action=$action, actor=$actor, description=$description, resourceId=$resourceId, resourceType=$resourceType, status=$status, additionalProperties=$additionalProperties}"
}
