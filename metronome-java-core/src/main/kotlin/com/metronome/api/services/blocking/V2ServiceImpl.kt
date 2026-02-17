// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking

import com.metronome.api.core.ClientOptions
import com.metronome.api.services.blocking.v2.ContractService
import com.metronome.api.services.blocking.v2.ContractServiceImpl

class V2ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V2Service {

    private val contracts: ContractService by lazy { ContractServiceImpl(clientOptions) }

    override fun contracts(): ContractService = contracts
}
