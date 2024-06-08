// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.models.*
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CustomerServiceTest {

    @Test
    fun callCreate() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerService = client.customers()
        val customerCreateResponse =
            customerService.create(
                CustomerCreateParams.builder()
                    .name("string")
                    .billingConfig(
                        CustomerCreateParams.BillingConfig.builder()
                            .billingProviderCustomerId("string")
                            .billingProviderType(
                                CustomerCreateParams.BillingConfig.BillingProviderType
                                    .AWS_MARKETPLACE
                            )
                            .awsProductCode("string")
                            .awsRegion(CustomerCreateParams.BillingConfig.AwsRegion.AF_SOUTH_1)
                            .stripeCollectionMethod(
                                CustomerCreateParams.BillingConfig.StripeCollectionMethod
                                    .CHARGE_AUTOMATICALLY
                            )
                            .build()
                    )
                    .customFields(CustomerCreateParams.CustomFields.builder().build())
                    .externalId("x")
                    .ingestAliases(listOf("x"))
                    .build()
            )
        println(customerCreateResponse)
        customerCreateResponse.validate()
    }

    @Test
    fun callRetrieve() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerService = client.customers()
        val customerRetrieveResponse =
            customerService.retrieve(
                CustomerRetrieveParams.builder()
                    .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )
        println(customerRetrieveResponse)
        customerRetrieveResponse.validate()
    }

    @Test
    fun callList() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerService = client.customers()
        val customerListResponse =
            customerService.list(
                CustomerListParams.builder()
                    .customerIds(listOf("string"))
                    .ingestAlias("string")
                    .limit(100L)
                    .nextPage("string")
                    .onlyArchived(true)
                    .salesforceAccountIds(listOf("string"))
                    .build()
            )
        println(customerListResponse)
        customerListResponse.validate()
    }

    @Test
    fun callArchive() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerService = client.customers()
        val customerArchiveResponse =
            customerService.archive(
                CustomerArchiveParams.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
            )
        println(customerArchiveResponse)
        customerArchiveResponse.validate()
    }

    @Test
    fun callListBillableMetrics() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerService = client.customers()
        val customerListBillableMetricsResponse =
            customerService.listBillableMetrics(
                CustomerListBillableMetricsParams.builder()
                    .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(100L)
                    .nextPage("string")
                    .onCurrentPlan(true)
                    .build()
            )
        println(customerListBillableMetricsResponse)
        customerListBillableMetricsResponse.validate()
    }

    @Test
    fun callListCosts() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerService = client.customers()
        val customerListCostsResponse =
            customerService.listCosts(
                CustomerListCostsParams.builder()
                    .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .limit(100L)
                    .nextPage("string")
                    .build()
            )
        println(customerListCostsResponse)
        customerListCostsResponse.validate()
    }

    @Test
    fun callSetIngestAliases() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerService = client.customers()
        customerService.setIngestAliases(
            CustomerSetIngestAliasesParams.builder()
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .ingestAliases(listOf("x"))
                .build()
        )
    }

    @Test
    fun callSetName() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerService = client.customers()
        val customerSetNameResponse =
            customerService.setName(
                CustomerSetNameParams.builder()
                    .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .name("string")
                    .build()
            )
        println(customerSetNameResponse)
        customerSetNameResponse.validate()
    }

    @Test
    fun callUpdateConfig() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerService = client.customers()
        customerService.updateConfig(
            CustomerUpdateConfigParams.builder()
                .customerId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .leaveStripeInvoicesInDraft(true)
                .salesforceAccountId("string")
                .build()
        )
    }
}
