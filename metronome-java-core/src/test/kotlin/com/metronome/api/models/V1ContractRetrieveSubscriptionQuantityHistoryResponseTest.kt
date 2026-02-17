// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class V1ContractRetrieveSubscriptionQuantityHistoryResponseTest {

    @Test
    fun createV1ContractRetrieveSubscriptionQuantityHistoryResponse() {
        val v1ContractRetrieveSubscriptionQuantityHistoryResponse =
            V1ContractRetrieveSubscriptionQuantityHistoryResponse.builder()
                .data(
                    V1ContractRetrieveSubscriptionQuantityHistoryResponse.Data.builder()
                        .fiatCreditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addHistory(
                            V1ContractRetrieveSubscriptionQuantityHistoryResponse.Data.History
                                .builder()
                                .addData(
                                    V1ContractRetrieveSubscriptionQuantityHistoryResponse.Data
                                        .History
                                        .InnerData
                                        .builder()
                                        .quantity(0.0)
                                        .total(0.0)
                                        .unitPrice(0.0)
                                        .build()
                                )
                                .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .subscriptionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .build()
                )
                .build()
        assertThat(v1ContractRetrieveSubscriptionQuantityHistoryResponse).isNotNull
        assertThat(v1ContractRetrieveSubscriptionQuantityHistoryResponse.data())
            .isEqualTo(
                V1ContractRetrieveSubscriptionQuantityHistoryResponse.Data.builder()
                    .fiatCreditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addHistory(
                        V1ContractRetrieveSubscriptionQuantityHistoryResponse.Data.History.builder()
                            .addData(
                                V1ContractRetrieveSubscriptionQuantityHistoryResponse.Data.History
                                    .InnerData
                                    .builder()
                                    .quantity(0.0)
                                    .total(0.0)
                                    .unitPrice(0.0)
                                    .build()
                            )
                            .startingAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .subscriptionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
    }
}
