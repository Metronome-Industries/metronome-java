// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v2.notifications

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.models.v2.notifications.system.SystemListParams
import com.metronome.api.models.v2.notifications.system.SystemListResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SystemServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SystemServiceAsync

    /**
     * List available system lifecycle event types for notifications. These are read-only event
     * types that can be used when creating offset notifications.
     */
    fun list(): CompletableFuture<SystemListResponse> = list(SystemListParams.none())

    /** @see list */
    fun list(
        params: SystemListParams = SystemListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SystemListResponse>

    /** @see list */
    fun list(
        params: SystemListParams = SystemListParams.none()
    ): CompletableFuture<SystemListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SystemListResponse> =
        list(SystemListParams.none(), requestOptions)

    /**
     * A view of [SystemServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SystemServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v2/notifications/system/list`, but is otherwise
         * the same as [SystemServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SystemListResponse>> =
            list(SystemListParams.none())

        /** @see list */
        fun list(
            params: SystemListParams = SystemListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SystemListResponse>>

        /** @see list */
        fun list(
            params: SystemListParams = SystemListParams.none()
        ): CompletableFuture<HttpResponseFor<SystemListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SystemListResponse>> =
            list(SystemListParams.none(), requestOptions)
    }
}
