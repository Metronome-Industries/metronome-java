// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.blocking.v1.settings

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.V1SettingBillingProviderCreateParams
import com.metronome.api.models.V1SettingBillingProviderCreateResponse
import com.metronome.api.models.V1SettingBillingProviderListPage
import com.metronome.api.models.V1SettingBillingProviderListParams

interface BillingProviderService {

    /**
     * Set up account-level configuration for a billing provider. Once configured, individual
     * contracts across customers can be mapped to this configuration using the returned
     * delivery_method_id.
     */
    @JvmOverloads
    fun create(
        params: V1SettingBillingProviderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1SettingBillingProviderCreateResponse

    /**
     * Lists all configured billing providers and their delivery method configurations for your
     * account. Returns provider details, delivery method IDs, and configuration settings needed for
     * mapping individual customer contracts to billing integrations.
     */
    @JvmOverloads
    fun list(
        params: V1SettingBillingProviderListParams = V1SettingBillingProviderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1SettingBillingProviderListPage

    /**
     * Lists all configured billing providers and their delivery method configurations for your
     * account. Returns provider details, delivery method IDs, and configuration settings needed for
     * mapping individual customer contracts to billing integrations.
     */
    fun list(requestOptions: RequestOptions): V1SettingBillingProviderListPage =
        list(V1SettingBillingProviderListParams.none(), requestOptions)
}
