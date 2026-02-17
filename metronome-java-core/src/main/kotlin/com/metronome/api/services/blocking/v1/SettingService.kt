// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.blocking.v1

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.V1SettingUpsertAvalaraCredentialsParams
import com.metronome.api.models.V1SettingUpsertAvalaraCredentialsResponse
import com.metronome.api.services.blocking.v1.settings.BillingProviderService

interface SettingService {

    fun billingProviders(): BillingProviderService

    /**
     * Set the Avalara credentials for some specified `delivery_method_ids`, which can be found in
     * the `/listConfiguredBillingProviders` response. This maps the Avalara credentials to the
     * appropriate billing entity. These credentials are only used for PLG Invoicing today.
     */
    @JvmOverloads
    fun upsertAvalaraCredentials(
        params: V1SettingUpsertAvalaraCredentialsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1SettingUpsertAvalaraCredentialsResponse
}
