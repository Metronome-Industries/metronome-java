// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1.settings

import com.metronome.api.TestServerExtension
import com.metronome.api.client.okhttp.MetronomeOkHttpClientAsync
import com.metronome.api.core.JsonValue
import com.metronome.api.models.V1SettingBillingProviderCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class BillingProviderServiceAsyncTest {

    @Test
    fun create() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val billingProviderServiceAsync = client.v1().settings().billingProviders()

        val billingProviderFuture =
            billingProviderServiceAsync.create(
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

        val billingProvider = billingProviderFuture.get()
        billingProvider.validate()
    }

    @Test
    fun list() {
        val client =
            MetronomeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .bearerToken("My Bearer Token")
                .build()
        val billingProviderServiceAsync = client.v1().settings().billingProviders()

        val pageFuture = billingProviderServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
