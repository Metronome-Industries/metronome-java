// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.client

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.getPackageVersion
import com.metronome.api.services.async.V1ServiceAsync
import com.metronome.api.services.async.V1ServiceAsyncImpl
import com.metronome.api.services.async.V2ServiceAsync
import com.metronome.api.services.async.V2ServiceAsyncImpl
import java.util.function.Consumer

class MetronomeClientAsyncImpl(private val clientOptions: ClientOptions) : MetronomeClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: MetronomeClient by lazy { MetronomeClientImpl(clientOptions) }

    private val withRawResponse: MetronomeClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val v2: V2ServiceAsync by lazy { V2ServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val v1: V1ServiceAsync by lazy { V1ServiceAsyncImpl(clientOptionsWithUserAgent) }

    override fun sync(): MetronomeClient = sync

    override fun withRawResponse(): MetronomeClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MetronomeClientAsync =
        MetronomeClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun v2(): V2ServiceAsync = v2

    override fun v1(): V1ServiceAsync = v1

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MetronomeClientAsync.WithRawResponse {

        private val v2: V2ServiceAsync.WithRawResponse by lazy {
            V2ServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val v1: V1ServiceAsync.WithRawResponse by lazy {
            V1ServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MetronomeClientAsync.WithRawResponse =
            MetronomeClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun v2(): V2ServiceAsync.WithRawResponse = v2

        override fun v1(): V1ServiceAsync.WithRawResponse = v1
    }
}
