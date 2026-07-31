// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v2.notifications

import com.google.errorprone.annotations.MustBeClosed
import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.models.v2.notifications.system.SystemListParams
import com.metronome.api.models.v2.notifications.system.SystemListResponse
import java.util.function.Consumer

interface SystemService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SystemService

    /**
     * List available system lifecycle event types for notifications. These are read-only event
     * types that can be used when creating offset notifications.
     */
    fun list(): SystemListResponse = list(SystemListParams.none())

    /** @see list */
    fun list(
        params: SystemListParams = SystemListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SystemListResponse

    /** @see list */
    fun list(params: SystemListParams = SystemListParams.none()): SystemListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SystemListResponse =
        list(SystemListParams.none(), requestOptions)

    /** A view of [SystemService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SystemService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v2/notifications/system/list`, but is otherwise
         * the same as [SystemService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<SystemListResponse> = list(SystemListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SystemListParams = SystemListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SystemListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SystemListParams = SystemListParams.none()
        ): HttpResponseFor<SystemListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SystemListResponse> =
            list(SystemListParams.none(), requestOptions)
    }
}
