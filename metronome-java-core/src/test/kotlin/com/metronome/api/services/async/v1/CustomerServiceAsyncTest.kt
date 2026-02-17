// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClientAsync
import com.metronome.api.core.JsonValue
import com.metronome.api.models.Id
import com.metronome.api.models.V1CustomerArchiveParams
import com.metronome.api.models.V1CustomerCreateParams
import com.metronome.api.models.V1CustomerListBillableMetricsParams
import com.metronome.api.models.V1CustomerListCostsParams
import com.metronome.api.models.V1CustomerPreviewEventsParams
import com.metronome.api.models.V1CustomerRetrieveBillingConfigurationsParams
import com.metronome.api.models.V1CustomerRetrieveParams
import com.metronome.api.models.V1CustomerSetBillingConfigurationsParams
import com.metronome.api.models.V1CustomerSetIngestAliasesParams
import com.metronome.api.models.V1CustomerSetNameParams
import com.metronome.api.models.V1CustomerUpdateConfigParams
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
        val customerServiceAsync = client.v1().customers()

        val customerFuture =
            customerServiceAsync.create(
                V1CustomerCreateParams.builder()
                    .name("Example, Inc.")
                    .billingConfig(
                        V1CustomerCreateParams.BillingConfig.builder()
                            .billingProviderCustomerId("billing_provider_customer_id")
                            .billingProviderType(
                                V1CustomerCreateParams.BillingConfig.BillingProviderType
                                    .AWS_MARKETPLACE
                            )
                            .awsCustomerAccountId("aws_customer_account_id")
                            .awsCustomerId("aws_customer_id")
                            .awsIsSubscriptionProduct(true)
                            .awsProductCode("aws_product_code")
                            .awsRegion(V1CustomerCreateParams.BillingConfig.AwsRegion.AF_SOUTH_1)
                            .stripeCollectionMethod(
                                V1CustomerCreateParams.BillingConfig.StripeCollectionMethod
                                    .CHARGE_AUTOMATICALLY
                            )
                            .build()
                    )
                    .customFields(
                        V1CustomerCreateParams.CustomFields.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .addCustomerBillingProviderConfiguration(
                        V1CustomerCreateParams.CustomerBillingProviderConfiguration.builder()
                            .billingProvider(
                                V1CustomerCreateParams.CustomerBillingProviderConfiguration
                                    .BillingProvider
                                    .AWS_MARKETPLACE
                            )
                            .configuration(
                                V1CustomerCreateParams.CustomerBillingProviderConfiguration
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
                                V1CustomerCreateParams.CustomerBillingProviderConfiguration
                                    .DeliveryMethod
                                    .DIRECT_TO_BILLING_PROVIDER
                            )
                            .deliveryMethodId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .taxProvider(
                                V1CustomerCreateParams.CustomerBillingProviderConfiguration
                                    .TaxProvider
                                    .ANROK
                            )
                            .build()
                    )
                    .addCustomerRevenueSystemConfiguration(
                        V1CustomerCreateParams.CustomerRevenueSystemConfiguration.builder()
                            .provider(
                                V1CustomerCreateParams.CustomerRevenueSystemConfiguration.Provider
                                    .NETSUITE
                            )
                            .configuration(
                                V1CustomerCreateParams.CustomerRevenueSystemConfiguration
                                    .Configuration
                                    .builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .deliveryMethod(
                                V1CustomerCreateParams.CustomerRevenueSystemConfiguration
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
        val customerServiceAsync = client.v1().customers()

        val customerFuture =
            customerServiceAsync.retrieve(
                V1CustomerRetrieveParams.builder()
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
        val customerServiceAsync = client.v1().customers()

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
        val customerServiceAsync = client.v1().customers()

        val responseFuture =
            customerServiceAsync.archive(
                V1CustomerArchiveParams.builder()
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
        val customerServiceAsync = client.v1().customers()

        val pageFuture =
            customerServiceAsync.listBillableMetrics(
                V1CustomerListBillableMetricsParams.builder()
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
        val customerServiceAsync = client.v1().customers()

        val pageFuture =
            customerServiceAsync.listCosts(
                V1CustomerListCostsParams.builder()
                    .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .endingBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .startingOn(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val page = pageFuture.get()
        page.response().validate()
    }

    @Test
    fun previewEvents() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerServiceAsync = client.v1().customers()

        val responseFuture =
            customerServiceAsync.previewEvents(
                V1CustomerPreviewEventsParams.builder()
                    .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .addEvent(
                        V1CustomerPreviewEventsParams.Event.builder()
                            .eventType("heartbeat")
                            .properties(
                                V1CustomerPreviewEventsParams.Event.Properties.builder()
                                    .putAdditionalProperty("cpu_hours", JsonValue.from("bar"))
                                    .putAdditionalProperty("memory_gb_hours", JsonValue.from("bar"))
                                    .build()
                            )
                            .timestamp("2021-01-01T00:00:00Z")
                            .transactionId("x")
                            .build()
                    )
                    .mode(V1CustomerPreviewEventsParams.Mode.REPLACE)
                    .skipZeroQtyLineItems(true)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun retrieveBillingConfigurations() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerServiceAsync = client.v1().customers()

        val responseFuture =
            customerServiceAsync.retrieveBillingConfigurations(
                V1CustomerRetrieveBillingConfigurationsParams.builder()
                    .customerId("6a37bb88-8538-48c5-b37b-a41c836328bd")
                    .includeArchived(true)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun setBillingConfigurations() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerServiceAsync = client.v1().customers()

        val responseFuture =
            customerServiceAsync.setBillingConfigurations(
                V1CustomerSetBillingConfigurationsParams.builder()
                    .data(
                        listOf(
                            V1CustomerSetBillingConfigurationsParams.Data.builder()
                                .billingProvider(
                                    V1CustomerSetBillingConfigurationsParams.Data.BillingProvider
                                        .AWS_MARKETPLACE
                                )
                                .customerId("4db51251-61de-4bfe-b9ce-495e244f3491")
                                .configuration(
                                    V1CustomerSetBillingConfigurationsParams.Data.Configuration
                                        .builder()
                                        .putAdditionalProperty(
                                            "stripe_customer_id",
                                            JsonValue.from("bar"),
                                        )
                                        .putAdditionalProperty(
                                            "stripe_collection_method",
                                            JsonValue.from("bar"),
                                        )
                                        .putAdditionalProperty(
                                            "leave_stripe_invoices_in_draft",
                                            JsonValue.from("bar"),
                                        )
                                        .build()
                                )
                                .deliveryMethod(
                                    V1CustomerSetBillingConfigurationsParams.Data.DeliveryMethod
                                        .DIRECT_TO_BILLING_PROVIDER
                                )
                                .deliveryMethodId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .taxProvider(
                                    V1CustomerSetBillingConfigurationsParams.Data.TaxProvider.ANROK
                                )
                                .build(),
                            V1CustomerSetBillingConfigurationsParams.Data.builder()
                                .billingProvider(
                                    V1CustomerSetBillingConfigurationsParams.Data.BillingProvider
                                        .AWS_MARKETPLACE
                                )
                                .customerId("4db51251-61de-4bfe-b9ce-495e244f3491")
                                .configuration(
                                    V1CustomerSetBillingConfigurationsParams.Data.Configuration
                                        .builder()
                                        .putAdditionalProperty(
                                            "aws_customer_id",
                                            JsonValue.from("bar"),
                                        )
                                        .putAdditionalProperty(
                                            "aws_product_code",
                                            JsonValue.from("bar"),
                                        )
                                        .putAdditionalProperty("aws_region", JsonValue.from("bar"))
                                        .build()
                                )
                                .deliveryMethod(
                                    V1CustomerSetBillingConfigurationsParams.Data.DeliveryMethod
                                        .DIRECT_TO_BILLING_PROVIDER
                                )
                                .deliveryMethodId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .taxProvider(
                                    V1CustomerSetBillingConfigurationsParams.Data.TaxProvider.ANROK
                                )
                                .build(),
                            V1CustomerSetBillingConfigurationsParams.Data.builder()
                                .billingProvider(
                                    V1CustomerSetBillingConfigurationsParams.Data.BillingProvider
                                        .AWS_MARKETPLACE
                                )
                                .customerId("4db51251-61de-4bfe-b9ce-495e244f3491")
                                .configuration(
                                    V1CustomerSetBillingConfigurationsParams.Data.Configuration
                                        .builder()
                                        .putAdditionalProperty(
                                            "azure_subscription_id",
                                            JsonValue.from("bar"),
                                        )
                                        .build()
                                )
                                .deliveryMethod(
                                    V1CustomerSetBillingConfigurationsParams.Data.DeliveryMethod
                                        .DIRECT_TO_BILLING_PROVIDER
                                )
                                .deliveryMethodId("5b9e3072-415b-4842-94f0-0b6700c8b6be")
                                .taxProvider(
                                    V1CustomerSetBillingConfigurationsParams.Data.TaxProvider.ANROK
                                )
                                .build(),
                            V1CustomerSetBillingConfigurationsParams.Data.builder()
                                .billingProvider(
                                    V1CustomerSetBillingConfigurationsParams.Data.BillingProvider
                                        .AWS_MARKETPLACE
                                )
                                .customerId("4db51251-61de-4bfe-b9ce-495e244f3491")
                                .configuration(
                                    V1CustomerSetBillingConfigurationsParams.Data.Configuration
                                        .builder()
                                        .putAdditionalProperty(
                                            "aws_customer_id",
                                            JsonValue.from("bar"),
                                        )
                                        .putAdditionalProperty(
                                            "aws_product_code",
                                            JsonValue.from("bar"),
                                        )
                                        .putAdditionalProperty("aws_region", JsonValue.from("bar"))
                                        .putAdditionalProperty(
                                            "aws_is_subscription_product",
                                            JsonValue.from("bar"),
                                        )
                                        .build()
                                )
                                .deliveryMethod(
                                    V1CustomerSetBillingConfigurationsParams.Data.DeliveryMethod
                                        .DIRECT_TO_BILLING_PROVIDER
                                )
                                .deliveryMethodId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .taxProvider(
                                    V1CustomerSetBillingConfigurationsParams.Data.TaxProvider.ANROK
                                )
                                .build(),
                            V1CustomerSetBillingConfigurationsParams.Data.builder()
                                .billingProvider(
                                    V1CustomerSetBillingConfigurationsParams.Data.BillingProvider
                                        .AWS_MARKETPLACE
                                )
                                .customerId("4db51251-61de-4bfe-b9ce-495e244f3491")
                                .configuration(
                                    V1CustomerSetBillingConfigurationsParams.Data.Configuration
                                        .builder()
                                        .putAdditionalProperty(
                                            "gcp_entitlement_id",
                                            JsonValue.from("bar"),
                                        )
                                        .putAdditionalProperty(
                                            "gcp_service_name",
                                            JsonValue.from("bar"),
                                        )
                                        .build()
                                )
                                .deliveryMethod(
                                    V1CustomerSetBillingConfigurationsParams.Data.DeliveryMethod
                                        .DIRECT_TO_BILLING_PROVIDER
                                )
                                .deliveryMethodId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .taxProvider(
                                    V1CustomerSetBillingConfigurationsParams.Data.TaxProvider.ANROK
                                )
                                .build(),
                            V1CustomerSetBillingConfigurationsParams.Data.builder()
                                .billingProvider(
                                    V1CustomerSetBillingConfigurationsParams.Data.BillingProvider
                                        .AWS_MARKETPLACE
                                )
                                .customerId("4db51251-61de-4bfe-b9ce-495e244f3491")
                                .configuration(
                                    V1CustomerSetBillingConfigurationsParams.Data.Configuration
                                        .builder()
                                        .putAdditionalProperty(
                                            "netsuite_customer_id",
                                            JsonValue.from("bar"),
                                        )
                                        .build()
                                )
                                .deliveryMethod(
                                    V1CustomerSetBillingConfigurationsParams.Data.DeliveryMethod
                                        .DIRECT_TO_BILLING_PROVIDER
                                )
                                .deliveryMethodId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .taxProvider(
                                    V1CustomerSetBillingConfigurationsParams.Data.TaxProvider.ANROK
                                )
                                .build(),
                        )
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun setIngestAliases() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val customerServiceAsync = client.v1().customers()

        val future =
            customerServiceAsync.setIngestAliases(
                V1CustomerSetIngestAliasesParams.builder()
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
        val customerServiceAsync = client.v1().customers()

        val responseFuture =
            customerServiceAsync.setName(
                V1CustomerSetNameParams.builder()
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
        val customerServiceAsync = client.v1().customers()

        val future =
            customerServiceAsync.updateConfig(
                V1CustomerUpdateConfigParams.builder()
                    .customerId("d7abd0cd-4ae9-4db7-8676-e986a4ebd8dc")
                    .leaveStripeInvoicesInDraft(true)
                    .salesforceAccountId("0015500001WO1ZiABL")
                    .build()
            )

        val response = future.get()
    }
}
