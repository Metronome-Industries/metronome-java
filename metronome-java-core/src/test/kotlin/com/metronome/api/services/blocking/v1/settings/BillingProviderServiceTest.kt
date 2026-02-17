// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1.settings

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.core.JsonValue
import com.metronome.api.models.v1.settings.billingproviders.BillingProviderCreateParams
import com.metronome.api.models.v1.settings.billingproviders.BillingProviderListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class BillingProviderServiceTest {

    @Test
    fun create() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val billingProviderService = client.v1().settings().billingProviders()

        val billingProvider =
            billingProviderService.create(
                BillingProviderCreateParams.builder()
                    .billingProvider(BillingProviderCreateParams.BillingProvider.AWS_MARKETPLACE)
                    .configuration(
                        BillingProviderCreateParams.Configuration.builder()
                            .putAdditionalProperty("aws_external_id", JsonValue.from("bar"))
                            .putAdditionalProperty("aws_iam_role_arn", JsonValue.from("bar"))
                            .build()
                    )
                    .deliveryMethod(
                        BillingProviderCreateParams.DeliveryMethod.DIRECT_TO_BILLING_PROVIDER
                    )
                    .build()
            )

        billingProvider.validate()
    }

    @Test
    fun list() {
        val client =
            MetronomeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val billingProviderService = client.v1().settings().billingProviders()

        val billingProviders =
            billingProviderService.list(
                BillingProviderListParams.builder()
                    .nextPage("af26878a-de62-4a0d-9b77-3936f7c2b6d6")
                    .build()
            )

        billingProviders.validate()
    }
}
