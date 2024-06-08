// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.blocking

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.AuditLogListParams
import com.metronome.api.models.AuditLogListResponse

interface AuditLogService {

    /**
     * Retrieves a range of audit logs. If no further audit logs are currently available, the data
     * array will be empty. As new audit logs are created, subsequent requests using the same
     * next_page value will be in the returned data array, ensuring a continuous and uninterrupted
     * reading of audit logs.
     */
    @JvmOverloads
    fun list(
        params: AuditLogListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AuditLogListResponse
}
