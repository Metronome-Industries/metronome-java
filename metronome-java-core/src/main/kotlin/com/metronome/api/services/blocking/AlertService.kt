// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.blocking

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.AlertArchiveParams
import com.metronome.api.models.AlertArchiveResponse
import com.metronome.api.models.AlertCreateParams
import com.metronome.api.models.AlertCreateResponse

interface AlertService {

    /** Create a new alert */
    @JvmOverloads
    fun create(
        params: AlertCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AlertCreateResponse

    /** Archive an existing alert */
    @JvmOverloads
    fun archive(
        params: AlertArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AlertArchiveResponse
}
