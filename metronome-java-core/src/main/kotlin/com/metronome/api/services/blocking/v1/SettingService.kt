// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1

import com.google.errorprone.annotations.MustBeClosed
import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.models.v1.settings.SettingUpsertAvalaraCredentialsParams
import com.metronome.api.models.v1.settings.SettingUpsertAvalaraCredentialsResponse
import com.metronome.api.services.blocking.v1.settings.BillingProviderService
import java.util.function.Consumer

interface SettingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SettingService

    fun billingProviders(): BillingProviderService

    /**
     * Set the Avalara credentials for some specified `delivery_method_ids`, which can be found in
     * the `/listConfiguredBillingProviders` response. This maps the Avalara credentials to the
     * appropriate billing entity. These credentials are only used for PLG Invoicing today.
     */
    fun upsertAvalaraCredentials(
        params: SettingUpsertAvalaraCredentialsParams
    ): SettingUpsertAvalaraCredentialsResponse =
        upsertAvalaraCredentials(params, RequestOptions.none())

    /** @see upsertAvalaraCredentials */
    fun upsertAvalaraCredentials(
        params: SettingUpsertAvalaraCredentialsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingUpsertAvalaraCredentialsResponse

    /** A view of [SettingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SettingService.WithRawResponse

        fun billingProviders(): BillingProviderService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/upsertAvalaraCredentials`, but is otherwise the
         * same as [SettingService.upsertAvalaraCredentials].
         */
        @MustBeClosed
        fun upsertAvalaraCredentials(
            params: SettingUpsertAvalaraCredentialsParams
        ): HttpResponseFor<SettingUpsertAvalaraCredentialsResponse> =
            upsertAvalaraCredentials(params, RequestOptions.none())

        /** @see upsertAvalaraCredentials */
        @MustBeClosed
        fun upsertAvalaraCredentials(
            params: SettingUpsertAvalaraCredentialsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingUpsertAvalaraCredentialsResponse>
    }
}
