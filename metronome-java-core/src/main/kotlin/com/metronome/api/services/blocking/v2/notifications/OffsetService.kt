// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v2.notifications

import com.google.errorprone.annotations.MustBeClosed
import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.models.v2.notifications.offset.OffsetArchiveParams
import com.metronome.api.models.v2.notifications.offset.OffsetArchiveResponse
import com.metronome.api.models.v2.notifications.offset.OffsetCreateParams
import com.metronome.api.models.v2.notifications.offset.OffsetCreateResponse
import com.metronome.api.models.v2.notifications.offset.OffsetEditParams
import com.metronome.api.models.v2.notifications.offset.OffsetEditResponse
import com.metronome.api.models.v2.notifications.offset.OffsetListPage
import com.metronome.api.models.v2.notifications.offset.OffsetListParams
import com.metronome.api.models.v2.notifications.offset.OffsetRetrieveParams
import com.metronome.api.models.v2.notifications.offset.OffsetRetrieveResponse
import com.metronome.api.services.blocking.v2.notifications.OffsetService
import java.util.function.Consumer

interface OffsetService {

    /** Returns a view of this service that provides access to raw HTTP responses for each method. */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OffsetService

    /**
     * Create an offset lifecycle event notification configuration. The lifecycle event type is inferred from the policy.type field.
     *
     */
    fun create(params: OffsetCreateParams): OffsetCreateResponse =
        create(
          params, RequestOptions.none()
        )

    /** @see create */
    fun create(params: OffsetCreateParams, requestOptions: RequestOptions = RequestOptions.none()): OffsetCreateResponse

    /** Retrieve a specific offset lifecycle event notification configuration by ID. */
    fun retrieve(params: OffsetRetrieveParams): OffsetRetrieveResponse =
        retrieve(
          params, RequestOptions.none()
        )

    /** @see retrieve */
    fun retrieve(params: OffsetRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): OffsetRetrieveResponse

    /**
     * List offset lifecycle event notification configurations. These are user-created notifications that trigger at a specified time offset relative to lifecycle events. Returns a maximum of 400 results per request.
     *
     */
    fun list(): OffsetListPage = list(OffsetListParams.none())

    /** @see list */
    fun list(params: OffsetListParams = OffsetListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): OffsetListPage

    /** @see list */
    fun list(params: OffsetListParams = OffsetListParams.none()): OffsetListPage =
        list(
          params, RequestOptions.none()
        )

    /** @see list */
    fun list(requestOptions: RequestOptions): OffsetListPage =
        list(
          OffsetListParams.none(), requestOptions
        )

    /**
     * Archive an offset lifecycle event notification configuration. Archived notifications are not processed.
     *
     */
    fun archive(params: OffsetArchiveParams): OffsetArchiveResponse =
        archive(
          params, RequestOptions.none()
        )

    /** @see archive */
    fun archive(params: OffsetArchiveParams, requestOptions: RequestOptions = RequestOptions.none()): OffsetArchiveResponse

    /** Edit an existing offset lifecycle event notification configuration. */
    fun edit(params: OffsetEditParams): OffsetEditResponse =
        edit(
          params, RequestOptions.none()
        )

    /** @see edit */
    fun edit(params: OffsetEditParams, requestOptions: RequestOptions = RequestOptions.none()): OffsetEditResponse

    /** A view of [OffsetService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): OffsetService.WithRawResponse

        /** Returns a raw HTTP response for `post /v2/notifications/create`, but is otherwise the             same as [OffsetService.create]. */
        @MustBeClosed
        fun create(params: OffsetCreateParams): HttpResponseFor<OffsetCreateResponse> =
            create(
              params, RequestOptions.none()
            )

        /** @see create */
        @MustBeClosed
        fun create(params: OffsetCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<OffsetCreateResponse>

        /** Returns a raw HTTP response for `post /v2/notifications/get`, but is otherwise the             same as [OffsetService.retrieve]. */
        @MustBeClosed
        fun retrieve(params: OffsetRetrieveParams): HttpResponseFor<OffsetRetrieveResponse> =
            retrieve(
              params, RequestOptions.none()
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: OffsetRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<OffsetRetrieveResponse>

        /** Returns a raw HTTP response for `post /v2/notifications/offset/list`, but is otherwise the             same as [OffsetService.list]. */
        @MustBeClosed
        fun list(): HttpResponseFor<OffsetListPage> = list(OffsetListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(params: OffsetListParams = OffsetListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<OffsetListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: OffsetListParams = OffsetListParams.none()): HttpResponseFor<OffsetListPage> =
            list(
              params, RequestOptions.none()
            )

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<OffsetListPage> =
            list(
              OffsetListParams.none(), requestOptions
            )

        /** Returns a raw HTTP response for `post /v2/notifications/archive`, but is otherwise the             same as [OffsetService.archive]. */
        @MustBeClosed
        fun archive(params: OffsetArchiveParams): HttpResponseFor<OffsetArchiveResponse> =
            archive(
              params, RequestOptions.none()
            )

        /** @see archive */
        @MustBeClosed
        fun archive(params: OffsetArchiveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<OffsetArchiveResponse>

        /** Returns a raw HTTP response for `post /v2/notifications/edit`, but is otherwise the             same as [OffsetService.edit]. */
        @MustBeClosed
        fun edit(params: OffsetEditParams): HttpResponseFor<OffsetEditResponse> =
            edit(
              params, RequestOptions.none()
            )

        /** @see edit */
        @MustBeClosed
        fun edit(params: OffsetEditParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<OffsetEditResponse>
    }
}
