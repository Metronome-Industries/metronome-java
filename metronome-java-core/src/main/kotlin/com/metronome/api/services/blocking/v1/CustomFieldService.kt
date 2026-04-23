// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.blocking.v1

import com.google.errorprone.annotations.MustBeClosed
import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponse
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.models.v1.customfields.CustomFieldAddKeyParams
import com.metronome.api.models.v1.customfields.CustomFieldDeleteValuesParams
import com.metronome.api.models.v1.customfields.CustomFieldListKeysPage
import com.metronome.api.models.v1.customfields.CustomFieldListKeysParams
import com.metronome.api.models.v1.customfields.CustomFieldRemoveKeyParams
import com.metronome.api.models.v1.customfields.CustomFieldSetValuesParams
import java.util.function.Consumer

/**
 * [Custom fields](https://docs.metronome.com/integrations/custom-fields/) enable adding additional
 * data to Metronome entities. Use these endpoints to create, retrieve, update, and delete custom
 * fields.
 */
interface CustomFieldService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CustomFieldService

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
    fun addKey(params: CustomFieldAddKeyParams) = addKey(params, RequestOptions.none())

    /** @see addKey */
    fun addKey(
        params: CustomFieldAddKeyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Remove specific custom field values from a Metronome entity instance by specifying the field
     * keys to delete. Use this endpoint to clean up unwanted custom field data while preserving
     * other fields on the same entity. Requires the entity type, entity ID, and array of keys to
     * remove.
     */
    fun deleteValues(params: CustomFieldDeleteValuesParams) =
        deleteValues(params, RequestOptions.none())

    /** @see deleteValues */
    fun deleteValues(
        params: CustomFieldDeleteValuesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Retrieve all your active custom field keys, with optional filtering by entity type (customer,
     * contract, product, etc.). Use this endpoint to discover what custom field keys are available
     * before setting values on entities or to audit your custom field configuration across
     * different entity types.
     */
    fun listKeys(): CustomFieldListKeysPage = listKeys(CustomFieldListKeysParams.none())

    /** @see listKeys */
    fun listKeys(
        params: CustomFieldListKeysParams = CustomFieldListKeysParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CustomFieldListKeysPage

    /** @see listKeys */
    fun listKeys(
        params: CustomFieldListKeysParams = CustomFieldListKeysParams.none()
    ): CustomFieldListKeysPage = listKeys(params, RequestOptions.none())

    /** @see listKeys */
    fun listKeys(requestOptions: RequestOptions): CustomFieldListKeysPage =
        listKeys(CustomFieldListKeysParams.none(), requestOptions)

    /**
     * Removes a custom field key from the allowlist for a specific entity type, preventing future
     * use of that key across all instances of the entity. Existing values for this key on entity
     * instances will no longer be accessible once the key is removed.
     */
    fun removeKey(params: CustomFieldRemoveKeyParams) = removeKey(params, RequestOptions.none())

    /** @see removeKey */
    fun removeKey(
        params: CustomFieldRemoveKeyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Sets custom field values on a specific Metronome entity instance. Overwrites existing values
     * for matching keys while preserving other fields. All updates are transactional—either all
     * values are set or none are. Custom field values are limited to 200 characters each.
     */
    fun setValues(params: CustomFieldSetValuesParams) = setValues(params, RequestOptions.none())

    /** @see setValues */
    fun setValues(
        params: CustomFieldSetValuesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [CustomFieldService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CustomFieldService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/customFields/addKey`, but is otherwise the same
         * as [CustomFieldService.addKey].
         */
        @MustBeClosed
        fun addKey(params: CustomFieldAddKeyParams): HttpResponse =
            addKey(params, RequestOptions.none())

        /** @see addKey */
        @MustBeClosed
        fun addKey(
            params: CustomFieldAddKeyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /v1/customFields/deleteValues`, but is otherwise
         * the same as [CustomFieldService.deleteValues].
         */
        @MustBeClosed
        fun deleteValues(params: CustomFieldDeleteValuesParams): HttpResponse =
            deleteValues(params, RequestOptions.none())

        /** @see deleteValues */
        @MustBeClosed
        fun deleteValues(
            params: CustomFieldDeleteValuesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /v1/customFields/listKeys`, but is otherwise the
         * same as [CustomFieldService.listKeys].
         */
        @MustBeClosed
        fun listKeys(): HttpResponseFor<CustomFieldListKeysPage> =
            listKeys(CustomFieldListKeysParams.none())

        /** @see listKeys */
        @MustBeClosed
        fun listKeys(
            params: CustomFieldListKeysParams = CustomFieldListKeysParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CustomFieldListKeysPage>

        /** @see listKeys */
        @MustBeClosed
        fun listKeys(
            params: CustomFieldListKeysParams = CustomFieldListKeysParams.none()
        ): HttpResponseFor<CustomFieldListKeysPage> = listKeys(params, RequestOptions.none())

        /** @see listKeys */
        @MustBeClosed
        fun listKeys(requestOptions: RequestOptions): HttpResponseFor<CustomFieldListKeysPage> =
            listKeys(CustomFieldListKeysParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/customFields/removeKey`, but is otherwise the
         * same as [CustomFieldService.removeKey].
         */
        @MustBeClosed
        fun removeKey(params: CustomFieldRemoveKeyParams): HttpResponse =
            removeKey(params, RequestOptions.none())

        /** @see removeKey */
        @MustBeClosed
        fun removeKey(
            params: CustomFieldRemoveKeyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /v1/customFields/setValues`, but is otherwise the
         * same as [CustomFieldService.setValues].
         */
        @MustBeClosed
        fun setValues(params: CustomFieldSetValuesParams): HttpResponse =
            setValues(params, RequestOptions.none())

        /** @see setValues */
        @MustBeClosed
        fun setValues(
            params: CustomFieldSetValuesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
