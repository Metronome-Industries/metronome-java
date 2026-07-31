// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v2

import com.metronome.api.core.ClientOptions
import com.metronome.api.services.blocking.v2.notifications.OffsetService
import com.metronome.api.services.blocking.v2.notifications.OffsetServiceImpl
import com.metronome.api.services.blocking.v2.notifications.SystemService
import com.metronome.api.services.blocking.v2.notifications.SystemServiceImpl
import java.util.function.Consumer

class NotificationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    NotificationService {

    private val withRawResponse: NotificationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val offset: OffsetService by lazy { OffsetServiceImpl(clientOptions) }

    private val system: SystemService by lazy { SystemServiceImpl(clientOptions) }

    override fun withRawResponse(): NotificationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NotificationService =
        NotificationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun offset(): OffsetService = offset

    override fun system(): SystemService = system

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NotificationService.WithRawResponse {

        private val offset: OffsetService.WithRawResponse by lazy {
            OffsetServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val system: SystemService.WithRawResponse by lazy {
            SystemServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NotificationService.WithRawResponse =
            NotificationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun offset(): OffsetService.WithRawResponse = offset

        override fun system(): SystemService.WithRawResponse = system
    }
}
