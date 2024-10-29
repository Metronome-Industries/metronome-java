// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.blocking.customers

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.CustomerCommitCreateParams
import com.metronome.api.models.CustomerCommitCreateResponse
import com.metronome.api.models.CustomerCommitListParams
import com.metronome.api.models.CustomerCommitListResponse
import com.metronome.api.models.CustomerCommitUpdateEndDateParams
import com.metronome.api.models.CustomerCommitUpdateEndDateResponse

interface CommitService {

    /** Create a new commit at the customer level. */
    @JvmOverloads
    fun create(
        params: CustomerCommitCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CustomerCommitCreateResponse

    /** List commits. */
    @JvmOverloads
    fun list(
        params: CustomerCommitListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CustomerCommitListResponse

    /** Update the end date of a PREPAID commit */
    @JvmOverloads
    fun updateEndDate(
        params: CustomerCommitUpdateEndDateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CustomerCommitUpdateEndDateResponse
}
