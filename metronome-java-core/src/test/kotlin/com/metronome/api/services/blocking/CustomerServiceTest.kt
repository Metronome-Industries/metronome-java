// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.core.JsonValue
import com.metronome.api.models.CustomerArchiveParams
import com.metronome.api.models.CustomerCreateParams
import com.metronome.api.models.CustomerListBillableMetricsParams
import com.metronome.api.models.CustomerListCostsParams
import com.metronome.api.models.CustomerListParams
import com.metronome.api.models.CustomerRetrieveParams
import com.metronome.api.models.CustomerSetIngestAliasesParams
import com.metronome.api.models.CustomerSetNameParams
import com.metronome.api.models.CustomerUpdateConfigParams
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
                    .name("Example, Inc.")
                    .billingConfig(
                        CustomerCreateParams.BillingConfig.builder()
                            .billingProviderCustomerId("billing_provider_customer_id")
                            .billingProviderType(
                                CustomerCreateParams.BillingConfig.BillingProviderType
                                    .AWS_MARKETPLACE
                            )
                            .awsProductCode("aws_product_code")
                            .awsRegion(CustomerCreateParams.BillingConfig.AwsRegion.AF_SOUTH_1)
                            .stripeCollectionMethod(
                                CustomerCreateParams.BillingConfig.StripeCollectionMethod
                                    .CHARGE_AUTOMATICALLY
                            )
                            .build()
                    )
                    .customFields(
                        CustomerCreateParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .externalId("x")
                    .ingestAliases(listOf("team@example.com"))
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
                    .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
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
        val response = customerService.list(CustomerListParams.builder().build())
        println(response)
        response.data().forEach { it.validate() }
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
                CustomerArchiveParams.builder().id("8deed800-1b7a-495d-a207-6c52bac54dc9").build()
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
        val response =
            customerService.listBillableMetrics(
                CustomerListBillableMetricsParams.builder()
                    .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .build()
            )
        println(response)
        response.data().forEach { it.validate() }
    }

    @Test
    fun callListCosts() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerService = client.customers()
        val response =
            customerService.listCosts(
                CustomerListCostsParams.builder()
                    .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        println(response)
        response.data().forEach { it.validate() }
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
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .ingestAliases(listOf("team@example.com"))
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
                    .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .name("Example, Inc.")
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
                .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                .leaveStripeInvoicesInDraft(true)
                .salesforceAccountId("0015500001WO1ZiABL")
                .build()
        )
    }
}
