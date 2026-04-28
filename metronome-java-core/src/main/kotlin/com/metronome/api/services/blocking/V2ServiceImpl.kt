// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking

import com.metronome.api.core.ClientOptions
import com.metronome.api.services.blocking.v2.ContractService
import com.metronome.api.services.blocking.v2.ContractServiceImpl
import java.util.function.Consumer

class V2ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V2Service {

    private val withRawResponse: V2Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val contracts: ContractService by lazy { ContractServiceImpl(clientOptions) }

    override fun withRawResponse(): V2Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V2Service =
        V2ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun contracts(): ContractService = contracts

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V2Service.WithRawResponse {

        private val contracts: ContractService.WithRawResponse by lazy {
            ContractServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V2Service.WithRawResponse =
            V2ServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun contracts(): ContractService.WithRawResponse = contracts
    }
}
