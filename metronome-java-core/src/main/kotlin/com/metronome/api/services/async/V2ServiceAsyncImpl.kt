// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async

import com.metronome.api.core.ClientOptions
import com.metronome.api.services.async.v2.ContractServiceAsync
import com.metronome.api.services.async.v2.ContractServiceAsyncImpl

class V2ServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    V2ServiceAsync {

    private val contracts: ContractServiceAsync by lazy { ContractServiceAsyncImpl(clientOptions) }

    override fun contracts(): ContractServiceAsync = contracts
}
