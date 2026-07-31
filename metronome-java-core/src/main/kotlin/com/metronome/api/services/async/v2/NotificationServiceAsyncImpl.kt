// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v2

import com.metronome.api.core.ClientOptions
import com.metronome.api.services.async.v2.notifications.OffsetServiceAsync
import com.metronome.api.services.async.v2.notifications.OffsetServiceAsyncImpl
import com.metronome.api.services.async.v2.notifications.SystemServiceAsync
import com.metronome.api.services.async.v2.notifications.SystemServiceAsyncImpl
import java.util.function.Consumer

class NotificationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    NotificationServiceAsync {

    private val withRawResponse: NotificationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val offset: OffsetServiceAsync by lazy { OffsetServiceAsyncImpl(clientOptions) }

    private val system: SystemServiceAsync by lazy { SystemServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): NotificationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NotificationServiceAsync =
        NotificationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun offset(): OffsetServiceAsync = offset

    override fun system(): SystemServiceAsync = system

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NotificationServiceAsync.WithRawResponse {

        private val offset: OffsetServiceAsync.WithRawResponse by lazy {
            OffsetServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val system: SystemServiceAsync.WithRawResponse by lazy {
            SystemServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NotificationServiceAsync.WithRawResponse =
            NotificationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun offset(): OffsetServiceAsync.WithRawResponse = offset

        override fun system(): SystemServiceAsync.WithRawResponse = system
    }
}
