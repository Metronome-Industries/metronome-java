// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v2

import com.metronome.api.core.ClientOptions
import com.metronome.api.services.blocking.v2.NotificationService
import com.metronome.api.services.blocking.v2.notifications.OffsetService
import com.metronome.api.services.blocking.v2.notifications.SystemService
import java.util.function.Consumer

interface NotificationService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NotificationService

    fun offset(): OffsetService

    fun system(): SystemService

    /** A view of [NotificationService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): NotificationService.WithRawResponse

        fun offset(): OffsetService.WithRawResponse

        fun system(): SystemService.WithRawResponse
    }
}
