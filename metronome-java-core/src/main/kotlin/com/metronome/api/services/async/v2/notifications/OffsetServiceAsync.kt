// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v2.notifications

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.models.v2.notifications.offset.OffsetArchiveParams
import com.metronome.api.models.v2.notifications.offset.OffsetArchiveResponse
import com.metronome.api.models.v2.notifications.offset.OffsetCreateParams
import com.metronome.api.models.v2.notifications.offset.OffsetCreateResponse
import com.metronome.api.models.v2.notifications.offset.OffsetEditParams
import com.metronome.api.models.v2.notifications.offset.OffsetEditResponse
import com.metronome.api.models.v2.notifications.offset.OffsetListPageAsync
import com.metronome.api.models.v2.notifications.offset.OffsetListParams
import com.metronome.api.models.v2.notifications.offset.OffsetRetrieveParams
import com.metronome.api.models.v2.notifications.offset.OffsetRetrieveResponse
import com.metronome.api.services.async.v2.notifications.OffsetServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OffsetServiceAsync {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OffsetServiceAsync

    /**
     * Create an offset lifecycle event notification configuration. The lifecycle event type is inferred from the policy.type field.
     *
     */
    fun create(params: OffsetCreateParams): CompletableFuture<OffsetCreateResponse> =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: OffsetCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<OffsetCreateResponse>

    /** Retrieve a specific offset lifecycle event notification configuration by ID. */
    fun retrieve(params: OffsetRetrieveParams): CompletableFuture<OffsetRetrieveResponse> =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(params: OffsetRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<OffsetRetrieveResponse>

    /**
     * List offset lifecycle event notification configurations. These are user-created notifications that trigger at a specified time offset relative to lifecycle events. Returns a maximum of 400 results per request.
     *
     */
    fun list(): CompletableFuture<OffsetListPageAsync> = list(OffsetListParams.none())

    /** @see list */
    fun list(params: OffsetListParams = OffsetListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<OffsetListPageAsync>

    /** @see list */
    fun list(params: OffsetListParams = OffsetListParams.none()): CompletableFuture<OffsetListPageAsync> =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<OffsetListPageAsync> =
        list(
          OffsetListParams.none(), requestOptions
        )

    /**
     * Archive an offset lifecycle event notification configuration. Archived notifications are not processed.
     *
     */
    fun archive(params: OffsetArchiveParams): CompletableFuture<OffsetArchiveResponse> =
        archive(
          params, RequestOptions.none()
        )

    /** @see archive */
    fun archive(params: OffsetArchiveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<OffsetArchiveResponse>

    /** Edit an existing offset lifecycle event notification configuration. */
    fun edit(params: OffsetEditParams): CompletableFuture<OffsetEditResponse> =
        edit(
          params, RequestOptions.none()
        )

    /** @see edit */
    fun edit(params: OffsetEditParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<OffsetEditResponse>

    /** A view of [OffsetServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OffsetServiceAsync.WithRawResponse

        /** Returns a raw HTTP response for `post /v2/notifications/create`, but is otherwise the             same as [OffsetServiceAsync.create]. */
        fun create(params: OffsetCreateParams): CompletableFuture<HttpResponseFor<OffsetCreateResponse>> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        fun create(params: OffsetCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<OffsetCreateResponse>>

        /** Returns a raw HTTP response for `post /v2/notifications/get`, but is otherwise the             same as [OffsetServiceAsync.retrieve]. */
        fun retrieve(params: OffsetRetrieveParams): CompletableFuture<HttpResponseFor<OffsetRetrieveResponse>> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        fun retrieve(params: OffsetRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<OffsetRetrieveResponse>>

        /** Returns a raw HTTP response for `post /v2/notifications/offset/list`, but is otherwise the             same as [OffsetServiceAsync.list]. */
        fun list(): CompletableFuture<HttpResponseFor<OffsetListPageAsync>> = list(OffsetListParams.none())

        /** @see list */
        fun list(params: OffsetListParams = OffsetListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<OffsetListPageAsync>>

        /** @see list */
        fun list(params: OffsetListParams = OffsetListParams.none()): CompletableFuture<HttpResponseFor<OffsetListPageAsync>> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponseFor<OffsetListPageAsync>> =
            list(
              OffsetListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `post /v2/notifications/archive`, but is otherwise the             same as [OffsetServiceAsync.archive]. */
        fun archive(params: OffsetArchiveParams): CompletableFuture<HttpResponseFor<OffsetArchiveResponse>> =
            archive(
              params, RequestOptions.none()
            )

        /** @see archive */
        fun archive(params: OffsetArchiveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<OffsetArchiveResponse>>

        /** Returns a raw HTTP response for `post /v2/notifications/edit`, but is otherwise the             same as [OffsetServiceAsync.edit]. */
        fun edit(params: OffsetEditParams): CompletableFuture<HttpResponseFor<OffsetEditResponse>> =
            edit(
              params, RequestOptions.none()
            )

        /** @see edit */
        fun edit(params: OffsetEditParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<OffsetEditResponse>>
    }
}
