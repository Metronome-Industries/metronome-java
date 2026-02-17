// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.blocking.v1

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.V1ServiceListParams
import com.metronome.api.models.V1ServiceListResponse

interface ServiceService {

    /**
     * Gets Metronome's service registry with associated IP addresses for security allowlisting and
     * firewall configuration. Use this endpoint to maintain an up-to-date list of IPs that your
     * systems should trust for Metronome communications. Returns service names and their current IP
     * ranges, with new IPs typically appearing 30+ days before first use to ensure smooth allowlist
     * updates.
     */
    @JvmOverloads
    fun list(
        params: V1ServiceListParams = V1ServiceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V1ServiceListResponse

    /**
     * Gets Metronome's service registry with associated IP addresses for security allowlisting and
     * firewall configuration. Use this endpoint to maintain an up-to-date list of IPs that your
     * systems should trust for Metronome communications. Returns service names and their current IP
     * ranges, with new IPs typically appearing 30+ days before first use to ensure smooth allowlist
     * updates.
     */
    fun list(requestOptions: RequestOptions): V1ServiceListResponse =
        list(V1ServiceListParams.none(), requestOptions)
}
