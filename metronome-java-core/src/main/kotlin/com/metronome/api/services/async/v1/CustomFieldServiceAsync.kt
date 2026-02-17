// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponse
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.models.v1.customfields.CustomFieldAddKeyParams
import com.metronome.api.models.v1.customfields.CustomFieldDeleteValuesParams
import com.metronome.api.models.v1.customfields.CustomFieldListKeysPageAsync
import com.metronome.api.models.v1.customfields.CustomFieldListKeysParams
import com.metronome.api.models.v1.customfields.CustomFieldRemoveKeyParams
import com.metronome.api.models.v1.customfields.CustomFieldSetValuesParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CustomFieldServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomFieldServiceAsync

    /**
     * Creates a new custom field key for a given entity (e.g. billable metric, contract, alert).
     *
     * Custom fields are properties that you can add to Metronome objects to store metadata like
     * foreign keys or other descriptors. This metadata can get transferred to or accessed by other
     * systems to contextualize Metronome data and power business processes. For example, to service
     * workflows like revenue recognition, reconciliation, and invoicing, custom fields help
     * Metronome know the relationship between entities in the platform and third-party systems.
     *
     * ### Use this endpoint to:
     * - Create a new custom field key for Customer objects in Metronome. You can then use the Set
     *   Custom Field Values endpoint to set the value of this key for a specific customer.
     * - Specify whether the key should enforce uniqueness. If the key is set to enforce uniqueness
     *   and you attempt to set a custom field value for the key that already exists, it will fail.
     *
     * ### Usage guidelines:
     * - Custom fields set on commits, credits, and contracts can be used to scope alert evaluation.
     *   For example, you can create a spend threshold alert that only considers spend associated
     *   with contracts with custom field key `contract_type` and value `paygo`
     * - Custom fields set on products can be used in the Stripe integration to set metadata on
     *   invoices.
     * - Custom fields for customers, contracts, invoices, products, commits, scheduled charges, and
     *   subscriptions are passed down to the invoice.
     */
    fun addKey(params: CustomFieldAddKeyParams): CompletableFuture<Void?> =
        addKey(params, RequestOptions.none())

    /** @see addKey */
    fun addKey(
        params: CustomFieldAddKeyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Remove specific custom field values from a Metronome entity instance by specifying the field
     * keys to delete. Use this endpoint to clean up unwanted custom field data while preserving
     * other fields on the same entity. Requires the entity type, entity ID, and array of keys to
     * remove.
     */
    fun deleteValues(params: CustomFieldDeleteValuesParams): CompletableFuture<Void?> =
        deleteValues(params, RequestOptions.none())

    /** @see deleteValues */
    fun deleteValues(
        params: CustomFieldDeleteValuesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Retrieve all your active custom field keys, with optional filtering by entity type (customer,
     * contract, product, etc.). Use this endpoint to discover what custom field keys are available
     * before setting values on entities or to audit your custom field configuration across
     * different entity types.
     */
    fun listKeys(): CompletableFuture<CustomFieldListKeysPageAsync> =
        listKeys(CustomFieldListKeysParams.none())

    /** @see listKeys */
    fun listKeys(
        params: CustomFieldListKeysParams = CustomFieldListKeysParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CustomFieldListKeysPageAsync>

    /** @see listKeys */
    fun listKeys(
        params: CustomFieldListKeysParams = CustomFieldListKeysParams.none()
    ): CompletableFuture<CustomFieldListKeysPageAsync> = listKeys(params, RequestOptions.none())

    /** @see listKeys */
    fun listKeys(requestOptions: RequestOptions): CompletableFuture<CustomFieldListKeysPageAsync> =
        listKeys(CustomFieldListKeysParams.none(), requestOptions)

    /**
     * Removes a custom field key from the allowlist for a specific entity type, preventing future
     * use of that key across all instances of the entity. Existing values for this key on entity
     * instances will no longer be accessible once the key is removed.
     */
    fun removeKey(params: CustomFieldRemoveKeyParams): CompletableFuture<Void?> =
        removeKey(params, RequestOptions.none())

    /** @see removeKey */
    fun removeKey(
        params: CustomFieldRemoveKeyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Sets custom field values on a specific Metronome entity instance. Overwrites existing values
     * for matching keys while preserving other fields. All updates are transactional—either all
     * values are set or none are. Custom field values are limited to 200 characters each.
     */
    fun setValues(params: CustomFieldSetValuesParams): CompletableFuture<Void?> =
        setValues(params, RequestOptions.none())

    /** @see setValues */
    fun setValues(
        params: CustomFieldSetValuesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [CustomFieldServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CustomFieldServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/customFields/addKey`, but is otherwise the same
         * as [CustomFieldServiceAsync.addKey].
         */
        fun addKey(params: CustomFieldAddKeyParams): CompletableFuture<HttpResponse> =
            addKey(params, RequestOptions.none())

        /** @see addKey */
        fun addKey(
            params: CustomFieldAddKeyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /v1/customFields/deleteValues`, but is otherwise
         * the same as [CustomFieldServiceAsync.deleteValues].
         */
        fun deleteValues(params: CustomFieldDeleteValuesParams): CompletableFuture<HttpResponse> =
            deleteValues(params, RequestOptions.none())

        /** @see deleteValues */
        fun deleteValues(
            params: CustomFieldDeleteValuesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /v1/customFields/listKeys`, but is otherwise the
         * same as [CustomFieldServiceAsync.listKeys].
         */
        fun listKeys(): CompletableFuture<HttpResponseFor<CustomFieldListKeysPageAsync>> =
            listKeys(CustomFieldListKeysParams.none())

        /** @see listKeys */
        fun listKeys(
            params: CustomFieldListKeysParams = CustomFieldListKeysParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CustomFieldListKeysPageAsync>>

        /** @see listKeys */
        fun listKeys(
            params: CustomFieldListKeysParams = CustomFieldListKeysParams.none()
        ): CompletableFuture<HttpResponseFor<CustomFieldListKeysPageAsync>> =
            listKeys(params, RequestOptions.none())

        /** @see listKeys */
        fun listKeys(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CustomFieldListKeysPageAsync>> =
            listKeys(CustomFieldListKeysParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/customFields/removeKey`, but is otherwise the
         * same as [CustomFieldServiceAsync.removeKey].
         */
        fun removeKey(params: CustomFieldRemoveKeyParams): CompletableFuture<HttpResponse> =
            removeKey(params, RequestOptions.none())

        /** @see removeKey */
        fun removeKey(
            params: CustomFieldRemoveKeyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /v1/customFields/setValues`, but is otherwise the
         * same as [CustomFieldServiceAsync.setValues].
         */
        fun setValues(params: CustomFieldSetValuesParams): CompletableFuture<HttpResponse> =
            setValues(params, RequestOptions.none())

        /** @see setValues */
        fun setValues(
            params: CustomFieldSetValuesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
