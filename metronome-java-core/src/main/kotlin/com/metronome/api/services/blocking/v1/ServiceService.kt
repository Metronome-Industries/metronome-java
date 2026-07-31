// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1

import com.google.errorprone.annotations.MustBeClosed
import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.models.v1.services.ServiceListParams
import com.metronome.api.models.v1.services.ServiceListResponse
import java.util.function.Consumer

/**
 * [Security](https://docs.metronome.com/developer-resources/security/) endpoints allow you to
 * retrieve security-related data.
 */
interface ServiceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ServiceService

    /**
     * Gets Metronome's service registry with associated IP addresses for security allowlisting and
     * firewall configuration. Use this endpoint to maintain an up-to-date list of IPs that your
     * systems should trust for Metronome communications. Returns service names and their current IP
     * ranges, with new IPs typically appearing 30+ days before first use to ensure smooth allowlist
     * updates.
     */
    fun list(): ServiceListResponse = list(ServiceListParams.none())

    /** @see list */
    fun list(
        params: ServiceListParams = ServiceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ServiceListResponse

    /** @see list */
    fun list(params: ServiceListParams = ServiceListParams.none()): ServiceListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ServiceListResponse =
        list(ServiceListParams.none(), requestOptions)

    /** A view of [ServiceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): ServiceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/services`, but is otherwise the same as
         * [ServiceService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ServiceListResponse> = list(ServiceListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ServiceListParams = ServiceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ServiceListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ServiceListParams = ServiceListParams.none()
        ): HttpResponseFor<ServiceListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ServiceListResponse> =
            list(ServiceListParams.none(), requestOptions)
    }
}
