// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.async

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.CustomFieldAddKeyParams
import com.metronome.api.models.CustomFieldDeleteValuesParams
import com.metronome.api.models.CustomFieldListKeysParams
import com.metronome.api.models.CustomFieldListKeysResponse
import com.metronome.api.models.CustomFieldRemoveKeyParams
import com.metronome.api.models.CustomFieldSetValuesParams
import java.util.concurrent.CompletableFuture

interface CustomFieldServiceAsync {

    /**
     * Add a key to the allow list for a given entity. There is a 100 character limit on custom
     * field keys.
     */
    @JvmOverloads
    fun addKey(
        params: CustomFieldAddKeyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Deletes one or more custom fields on an instance of a Metronome entity. */
    @JvmOverloads
    fun deleteValues(
        params: CustomFieldDeleteValuesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** List all active custom field keys, optionally filtered by entity type. */
    @JvmOverloads
    fun listKeys(
        params: CustomFieldListKeysParams = CustomFieldListKeysParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomFieldListKeysResponse>

    /** List all active custom field keys, optionally filtered by entity type. */
    fun listKeys(requestOptions: RequestOptions): CompletableFuture<CustomFieldListKeysResponse> =
        listKeys(CustomFieldListKeysParams.none(), requestOptions)

    /** Remove a key from the allow list for a given entity. */
    @JvmOverloads
    fun removeKey(
        params: CustomFieldRemoveKeyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Sets one or more custom fields on an instance of a Metronome entity. If a key/value pair
     * passed in this request matches one already set on the entity, its value will be overwritten.
     * Any key/value pairs that exist on the entity that do not match those passed in this request
     * will remain untouched. This endpoint is transactional and will update all key/value pairs or
     * no key/value pairs. Partial updates are not supported. There is a 200 character limit on
     * custom field values.
     */
    @JvmOverloads
    fun setValues(
        params: CustomFieldSetValuesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>
}
