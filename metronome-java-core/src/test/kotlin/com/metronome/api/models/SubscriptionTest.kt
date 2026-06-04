// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.JsonValue
import com.metronome.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SubscriptionTest {

    @Test
    fun create() {
        val subscription =
            Subscription.builder()
                .billingPeriods(
                    Subscription.BillingPeriods.builder()
                        .current(
                            Subscription.BillingPeriods.Current.builder()
                                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .next(
                            Subscription.BillingPeriods.Next.builder()
                                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .previous(
                            Subscription.BillingPeriods.Previous.builder()
                                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .build()
                )
                .collectionSchedule(Subscription.CollectionSchedule.ADVANCE)
                .proration(
                    Subscription.Proration.builder()
                        .invoiceBehavior(Subscription.Proration.InvoiceBehavior.BILL_IMMEDIATELY)
                        .isProrated(true)
                        .build()
                )
                .quantityManagementMode(Subscription.QuantityManagementMode.SEAT_BASED)
                .addQuantitySchedule(
                    Subscription.QuantitySchedule.builder()
                        .quantity(0.0)
                        .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .subscriptionRate(
                    Subscription.SubscriptionRate.builder()
                        .billingFrequency(Subscription.SubscriptionRate.BillingFrequency.MONTHLY)
                        .product(
                            Subscription.SubscriptionRate.Product.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .name("name")
                                .build()
                        )
                        .build()
                )
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .customFields(
                    Subscription.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .description("description")
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .fiatCreditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .seatConfig(
                    Subscription.SeatConfig.builder().seatGroupKey("seat_group_key").build()
                )
                .build()

        assertThat(subscription.billingPeriods())
            .isEqualTo(
                Subscription.BillingPeriods.builder()
                    .current(
                        Subscription.BillingPeriods.Current.builder()
                            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .next(
                        Subscription.BillingPeriods.Next.builder()
                            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .previous(
                        Subscription.BillingPeriods.Previous.builder()
                            .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )
        assertThat(subscription.collectionSchedule())
            .isEqualTo(Subscription.CollectionSchedule.ADVANCE)
        assertThat(subscription.proration())
            .isEqualTo(
                Subscription.Proration.builder()
                    .invoiceBehavior(Subscription.Proration.InvoiceBehavior.BILL_IMMEDIATELY)
                    .isProrated(true)
                    .build()
            )
        assertThat(subscription.quantityManagementMode())
            .isEqualTo(Subscription.QuantityManagementMode.SEAT_BASED)
        assertThat(subscription.quantitySchedule())
            .containsExactly(
                Subscription.QuantitySchedule.builder()
                    .quantity(0.0)
                    .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(subscription.startingAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscription.subscriptionRate())
            .isEqualTo(
                Subscription.SubscriptionRate.builder()
                    .billingFrequency(Subscription.SubscriptionRate.BillingFrequency.MONTHLY)
                    .product(
                        Subscription.SubscriptionRate.Product.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .name("name")
                            .build()
                    )
                    .build()
            )
        assertThat(subscription.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(subscription.customFields())
            .contains(
                Subscription.CustomFields.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(subscription.description()).contains("description")
        assertThat(subscription.endingBefore())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(subscription.fiatCreditTypeId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(subscription.name()).contains("name")
        assertThat(subscription.seatConfig())
            .contains(Subscription.SeatConfig.builder().seatGroupKey("seat_group_key").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val subscription =
            Subscription.builder()
                .billingPeriods(
                    Subscription.BillingPeriods.builder()
                        .current(
                            Subscription.BillingPeriods.Current.builder()
                                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .next(
                            Subscription.BillingPeriods.Next.builder()
                                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .previous(
                            Subscription.BillingPeriods.Previous.builder()
                                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .build()
                )
                .collectionSchedule(Subscription.CollectionSchedule.ADVANCE)
                .proration(
                    Subscription.Proration.builder()
                        .invoiceBehavior(Subscription.Proration.InvoiceBehavior.BILL_IMMEDIATELY)
                        .isProrated(true)
                        .build()
                )
                .quantityManagementMode(Subscription.QuantityManagementMode.SEAT_BASED)
                .addQuantitySchedule(
                    Subscription.QuantitySchedule.builder()
                        .quantity(0.0)
                        .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .subscriptionRate(
                    Subscription.SubscriptionRate.builder()
                        .billingFrequency(Subscription.SubscriptionRate.BillingFrequency.MONTHLY)
                        .product(
                            Subscription.SubscriptionRate.Product.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .name("name")
                                .build()
                        )
                        .build()
                )
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .customFields(
                    Subscription.CustomFields.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .description("description")
                .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .fiatCreditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .name("name")
                .seatConfig(
                    Subscription.SeatConfig.builder().seatGroupKey("seat_group_key").build()
                )
                .build()

        val roundtrippedSubscription =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(subscription),
                jacksonTypeRef<Subscription>(),
            )

        assertThat(roundtrippedSubscription).isEqualTo(subscription)
    }
}
