// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.usage

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.JsonValue
import com.metronome.api.core.jsonMapper
import com.metronome.api.models.EventTypeFilter
import com.metronome.api.models.PropertyFilter
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageSearchResponseTest {

    @Test
    fun create() {
        val usageSearchResponse =
            UsageSearchResponse.builder()
                .id("id")
                .customerId("customer_id")
                .eventType("event_type")
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .transactionId("transaction_id")
                .isDuplicate(true)
                .addMatchedBillableMetric(
                    UsageSearchResponse.MatchedBillableMetric.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .aggregate("aggregate")
                        .addAggregateKey("string")
                        .aggregationKey("aggregation_key")
                        .aggregationType(
                            UsageSearchResponse.MatchedBillableMetric.AggregationType.COUNT
                        )
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customFields(
                            UsageSearchResponse.MatchedBillableMetric.CustomFields.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .eventTypeFilter(
                            EventTypeFilter.builder()
                                .addInValue("string")
                                .addNotInValue("string")
                                .build()
                        )
                        .filter(
                            UsageSearchResponse.MatchedBillableMetric.Filter.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .addGroupBy("string")
                        .addGroupKey(listOf("string"))
                        .addPropertyFilter(
                            PropertyFilter.builder()
                                .name("name")
                                .exists(true)
                                .addInValue("string")
                                .addNotInValue("string")
                                .build()
                        )
                        .sql("sql")
                        .build()
                )
                .matchedCustomer(
                    UsageSearchResponse.MatchedCustomer.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .build()
                )
                .processedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    UsageSearchResponse.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        assertThat(usageSearchResponse.id()).isEqualTo("id")
        assertThat(usageSearchResponse.customerId()).isEqualTo("customer_id")
        assertThat(usageSearchResponse.eventType()).isEqualTo("event_type")
        assertThat(usageSearchResponse.timestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(usageSearchResponse.transactionId()).isEqualTo("transaction_id")
        assertThat(usageSearchResponse.isDuplicate()).contains(true)
        assertThat(usageSearchResponse.matchedBillableMetrics().getOrNull())
            .containsExactly(
                UsageSearchResponse.MatchedBillableMetric.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .aggregate("aggregate")
                    .addAggregateKey("string")
                    .aggregationKey("aggregation_key")
                    .aggregationType(
                        UsageSearchResponse.MatchedBillableMetric.AggregationType.COUNT
                    )
                    .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .customFields(
                        UsageSearchResponse.MatchedBillableMetric.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .eventTypeFilter(
                        EventTypeFilter.builder()
                            .addInValue("string")
                            .addNotInValue("string")
                            .build()
                    )
                    .filter(
                        UsageSearchResponse.MatchedBillableMetric.Filter.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .addGroupBy("string")
                    .addGroupKey(listOf("string"))
                    .addPropertyFilter(
                        PropertyFilter.builder()
                            .name("name")
                            .exists(true)
                            .addInValue("string")
                            .addNotInValue("string")
                            .build()
                    )
                    .sql("sql")
                    .build()
            )
        assertThat(usageSearchResponse.matchedCustomer())
            .contains(
                UsageSearchResponse.MatchedCustomer.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("name")
                    .build()
            )
        assertThat(usageSearchResponse.processedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(usageSearchResponse.properties())
            .contains(
                UsageSearchResponse.Properties.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val usageSearchResponse =
            UsageSearchResponse.builder()
                .id("id")
                .customerId("customer_id")
                .eventType("event_type")
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .transactionId("transaction_id")
                .isDuplicate(true)
                .addMatchedBillableMetric(
                    UsageSearchResponse.MatchedBillableMetric.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .aggregate("aggregate")
                        .addAggregateKey("string")
                        .aggregationKey("aggregation_key")
                        .aggregationType(
                            UsageSearchResponse.MatchedBillableMetric.AggregationType.COUNT
                        )
                        .archivedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .customFields(
                            UsageSearchResponse.MatchedBillableMetric.CustomFields.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .eventTypeFilter(
                            EventTypeFilter.builder()
                                .addInValue("string")
                                .addNotInValue("string")
                                .build()
                        )
                        .filter(
                            UsageSearchResponse.MatchedBillableMetric.Filter.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .addGroupBy("string")
                        .addGroupKey(listOf("string"))
                        .addPropertyFilter(
                            PropertyFilter.builder()
                                .name("name")
                                .exists(true)
                                .addInValue("string")
                                .addNotInValue("string")
                                .build()
                        )
                        .sql("sql")
                        .build()
                )
                .matchedCustomer(
                    UsageSearchResponse.MatchedCustomer.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .name("name")
                        .build()
                )
                .processedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .properties(
                    UsageSearchResponse.Properties.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val roundtrippedUsageSearchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(usageSearchResponse),
                jacksonTypeRef<UsageSearchResponse>(),
            )

        assertThat(roundtrippedUsageSearchResponse).isEqualTo(usageSearchResponse)
    }
}
