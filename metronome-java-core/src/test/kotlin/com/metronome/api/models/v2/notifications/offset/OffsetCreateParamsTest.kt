// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v2.notifications.offset

import com.metronome.api.models.v2.notifications.offset.OffsetCreateParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OffsetCreateParamsTest {

    @Test
    fun create() {
      OffsetCreateParams.builder()
          .name("+1 day after contract starts")
          .policy(OffsetCreateParams.Policy.builder()
              .offset("P1D")
              .type("contract.start")
              .build())
          .uniquenessKey("contract-start-notification-823j7fqzo1")
          .build()
    }

    @Test
    fun body() {
      val params = OffsetCreateParams.builder()
          .name("+1 day after contract starts")
          .policy(OffsetCreateParams.Policy.builder()
              .offset("P1D")
              .type("contract.start")
              .build())
          .uniquenessKey("contract-start-notification-823j7fqzo1")
          .build()

      val body = params._body()

      assertThat(body.name()).isEqualTo("+1 day after contract starts")
      assertThat(body.policy()).isEqualTo(OffsetCreateParams.Policy.builder()
          .offset("P1D")
          .type("contract.start")
          .build())
      assertThat(body.uniquenessKey()).contains("contract-start-notification-823j7fqzo1")
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = OffsetCreateParams.builder()
          .name("+1 day after contract starts")
          .policy(OffsetCreateParams.Policy.builder()
              .offset("P1D")
              .type("contract.start")
              .build())
          .build()

      val body = params._body()

      assertThat(body.name()).isEqualTo("+1 day after contract starts")
      assertThat(body.policy()).isEqualTo(OffsetCreateParams.Policy.builder()
          .offset("P1D")
          .type("contract.start")
          .build())
    }
}
