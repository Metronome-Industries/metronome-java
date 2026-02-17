// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.client

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.getPackageVersion
import com.metronome.api.services.blocking.V1Service
import com.metronome.api.services.blocking.V1ServiceImpl
import com.metronome.api.services.blocking.V2Service
import com.metronome.api.services.blocking.V2ServiceImpl

class MetronomeClientImpl(private val clientOptions: ClientOptions) : MetronomeClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: MetronomeClientAsync by lazy { MetronomeClientAsyncImpl(clientOptions) }

    private val v2: V2Service by lazy { V2ServiceImpl(clientOptionsWithUserAgent) }

    private val v1: V1Service by lazy { V1ServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): MetronomeClientAsync = async

    override fun v2(): V2Service = v2

    override fun v1(): V1Service = v1

    override fun close() = clientOptions.httpClient.close()
}
