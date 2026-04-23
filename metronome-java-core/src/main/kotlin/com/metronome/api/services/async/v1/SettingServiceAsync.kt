// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.models.v1.settings.SettingUpsertAvalaraCredentialsParams
import com.metronome.api.models.v1.settings.SettingUpsertAvalaraCredentialsResponse
import com.metronome.api.services.async.v1.settings.BillingProviderServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/**
 * Use these endpoints to configure a billing API key, a webhook secret, or invoice finalization
 * behavior.
 */
interface SettingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SettingServiceAsync

    /**
     * Use these endpoints to configure a billing API key, a webhook secret, or invoice finalization
     * behavior.
     */
    fun billingProviders(): BillingProviderServiceAsync

    /**
     * Set the Avalara credentials for some specified `delivery_method_ids`, which can be found in
     * the `/listConfiguredBillingProviders` response. This maps the Avalara credentials to the
     * appropriate billing entity. These credentials are only used for PLG Invoicing today.
     */
    fun upsertAvalaraCredentials(
        params: SettingUpsertAvalaraCredentialsParams
    ): CompletableFuture<SettingUpsertAvalaraCredentialsResponse> =
        upsertAvalaraCredentials(params, RequestOptions.none())

    /** @see upsertAvalaraCredentials */
    fun upsertAvalaraCredentials(
        params: SettingUpsertAvalaraCredentialsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettingUpsertAvalaraCredentialsResponse>

    /**
     * A view of [SettingServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SettingServiceAsync.WithRawResponse

        /**
         * Use these endpoints to configure a billing API key, a webhook secret, or invoice
         * finalization behavior.
         */
        fun billingProviders(): BillingProviderServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/upsertAvalaraCredentials`, but is otherwise the
         * same as [SettingServiceAsync.upsertAvalaraCredentials].
         */
        fun upsertAvalaraCredentials(
            params: SettingUpsertAvalaraCredentialsParams
        ): CompletableFuture<HttpResponseFor<SettingUpsertAvalaraCredentialsResponse>> =
            upsertAvalaraCredentials(params, RequestOptions.none())

        /** @see upsertAvalaraCredentials */
        fun upsertAvalaraCredentials(
            params: SettingUpsertAvalaraCredentialsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettingUpsertAvalaraCredentialsResponse>>
    }
}
