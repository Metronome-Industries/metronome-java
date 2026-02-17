// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.contracts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.metronome.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ContractRetrieveSubscriptionQuantityHistoryResponseTest {

    @Test
    fun create() {
        val contractRetrieveSubscriptionQuantityHistoryResponse =
            ContractRetrieveSubscriptionQuantityHistoryResponse.builder()
                .data(
                    ContractRetrieveSubscriptionQuantityHistoryResponse.Data.builder()
                        .fiatCreditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addHistory(
                            ContractRetrieveSubscriptionQuantityHistoryResponse.Data.History
                                .builder()
                                .addData(
                                    ContractRetrieveSubscriptionQuantityHistoryResponse.Data.History
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

        assertThat(contractRetrieveSubscriptionQuantityHistoryResponse.data())
            .isEqualTo(
                ContractRetrieveSubscriptionQuantityHistoryResponse.Data.builder()
                    .fiatCreditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addHistory(
                        ContractRetrieveSubscriptionQuantityHistoryResponse.Data.History.builder()
                            .addData(
                                ContractRetrieveSubscriptionQuantityHistoryResponse.Data.History
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

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val contractRetrieveSubscriptionQuantityHistoryResponse =
            ContractRetrieveSubscriptionQuantityHistoryResponse.builder()
                .data(
                    ContractRetrieveSubscriptionQuantityHistoryResponse.Data.builder()
                        .fiatCreditTypeId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .addHistory(
                            ContractRetrieveSubscriptionQuantityHistoryResponse.Data.History
                                .builder()
                                .addData(
                                    ContractRetrieveSubscriptionQuantityHistoryResponse.Data.History
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

        val roundtrippedContractRetrieveSubscriptionQuantityHistoryResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(contractRetrieveSubscriptionQuantityHistoryResponse),
                jacksonTypeRef<ContractRetrieveSubscriptionQuantityHistoryResponse>(),
            )

        assertThat(roundtrippedContractRetrieveSubscriptionQuantityHistoryResponse)
            .isEqualTo(contractRetrieveSubscriptionQuantityHistoryResponse)
    }
}
