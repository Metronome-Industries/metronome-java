// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClientAsync
import com.metronome.api.core.JsonValue
import com.metronome.api.models.CustomerArchiveParams
import com.metronome.api.models.CustomerCreateParams
import com.metronome.api.models.CustomerListBillableMetricsParams
import com.metronome.api.models.CustomerListCostsParams
import com.metronome.api.models.CustomerRetrieveParams
import com.metronome.api.models.CustomerSetIngestAliasesParams
import com.metronome.api.models.CustomerSetNameParams
import com.metronome.api.models.CustomerUpdateConfigParams
import com.metronome.api.models.Id
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CustomerServiceAsyncTest {

    @Test
    fun create() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerServiceAsync = client.customers()

        val customerFuture =
            customerServiceAsync.create(
                CustomerCreateParams.builder()
                    .name("Example, Inc.")
                    .billingConfig(
                        CustomerCreateParams.BillingConfig.builder()
                            .billingProviderCustomerId("billing_provider_customer_id")
                            .billingProviderType(
                                CustomerCreateParams.BillingConfig.BillingProviderType
                                    .AWS_MARKETPLACE
                            )
                            .awsIsSubscriptionProduct(true)
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
                    .addCustomerBillingProviderConfiguration(
                        CustomerCreateParams.CustomerBillingProviderConfiguration.builder()
                            .billingProvider(
                                CustomerCreateParams.CustomerBillingProviderConfiguration
                                    .BillingProvider
                                    .AWS_MARKETPLACE
                            )
                            .configuration(
                                CustomerCreateParams.CustomerBillingProviderConfiguration
                                    .Configuration
                                    .builder()
                                    .putAdditionalProperty(
                                        "stripe_customer_id",
                                        JsonValue.from("bar"),
                                    )
                                    .putAdditionalProperty(
                                        "stripe_collection_method",
                                        JsonValue.from("bar"),
                                    )
                                    .build()
                            )
                            .deliveryMethod(
                                CustomerCreateParams.CustomerBillingProviderConfiguration
                                    .DeliveryMethod
                                    .DIRECT_TO_BILLING_PROVIDER
                            )
                            .deliveryMethodId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .build()
                    )
                    .externalId("x")
                    .addIngestAlias("team@example.com")
                    .build()
            )

        val customer = customerFuture.get()
        customer.validate()
    }

    @Test
    fun retrieve() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerServiceAsync = client.customers()

        val customerFuture =
            customerServiceAsync.retrieve(
                CustomerRetrieveParams.builder()
                    .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .build()
            )

        val customer = customerFuture.get()
        customer.validate()
    }

    @Test
    fun list() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerServiceAsync = client.customers()

        val pageFuture = customerServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun archive() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerServiceAsync = client.customers()

        val responseFuture =
            customerServiceAsync.archive(
                CustomerArchiveParams.builder()
                    .id(Id.builder().id("8deed800-1b7a-495d-a207-6c52bac54dc9").build())
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun listBillableMetrics() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerServiceAsync = client.customers()

        val pageFuture =
            customerServiceAsync.listBillableMetrics(
                CustomerListBillableMetricsParams.builder()
                    .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun listCosts() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerServiceAsync = client.customers()

        val pageFuture =
            customerServiceAsync.listCosts(
                CustomerListCostsParams.builder()
                    .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun setIngestAliases() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerServiceAsync = client.customers()

        val future =
            customerServiceAsync.setIngestAliases(
                CustomerSetIngestAliasesParams.builder()
                    .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .addIngestAlias("team@example.com")
                    .build()
            )

        val response = future.get()
    }

    @Test
    fun setName() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerServiceAsync = client.customers()

        val responseFuture =
            customerServiceAsync.setName(
                CustomerSetNameParams.builder()
                    .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .name("Example, Inc.")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun updateConfig() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerServiceAsync = client.customers()

        val future =
            customerServiceAsync.updateConfig(
                CustomerUpdateConfigParams.builder()
                    .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .leaveStripeInvoicesInDraft(true)
                    .salesforceAccountId("0015500001WO1ZiABL")
                    .build()
            )

        val response = future.get()
    }
}
