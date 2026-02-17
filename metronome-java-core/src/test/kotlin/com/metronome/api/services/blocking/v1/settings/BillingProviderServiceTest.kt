// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1.settings

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClient
import com.metronome.api.core.JsonValue
import com.metronome.api.models.V1SettingBillingProviderCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class BillingProviderServiceTest {

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
                V1SettingBillingProviderCreateParams.builder()
                    .billingProvider(
                        V1SettingBillingProviderCreateParams.BillingProvider.AWS_MARKETPLACE
                    )
                    .configuration(
                        V1SettingBillingProviderCreateParams.Configuration.builder()
                            .putAdditionalProperty("aws_external_id", JsonValue.from("bar"))
                            .putAdditionalProperty("aws_iam_role_arn", JsonValue.from("bar"))
                            .build()
                    )
                    .deliveryMethod(
                        V1SettingBillingProviderCreateParams.DeliveryMethod
                            .DIRECT_TO_BILLING_PROVIDER
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

        val page = billingProviderService.list()

        page.response().validate()
    }
}
