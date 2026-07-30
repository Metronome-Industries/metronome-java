// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v2

import com.metronome.api.core.ClientOptions
import com.metronome.api.services.async.v2.NotificationServiceAsync
import com.metronome.api.services.async.v2.notifications.OffsetServiceAsync
import com.metronome.api.services.async.v2.notifications.SystemServiceAsync
import java.util.function.Consumer

interface NotificationServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NotificationServiceAsync

    fun offset(): OffsetServiceAsync

    fun system(): SystemServiceAsync

    /** A view of [NotificationServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): NotificationServiceAsync.WithRawResponse

        fun offset(): OffsetServiceAsync.WithRawResponse

        fun system(): SystemServiceAsync.WithRawResponse
    }
}
