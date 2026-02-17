// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.metronome.api.services.async.v1

import com.metronome.api.core.RequestOptions
import com.metronome.api.models.V1CustomFieldAddKeyParams
import com.metronome.api.models.V1CustomFieldDeleteValuesParams
import com.metronome.api.models.V1CustomFieldListKeysPageAsync
import com.metronome.api.models.V1CustomFieldListKeysParams
import com.metronome.api.models.V1CustomFieldRemoveKeyParams
import com.metronome.api.models.V1CustomFieldSetValuesParams
import java.util.concurrent.CompletableFuture

interface CustomFieldServiceAsync {

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
    @JvmOverloads
    fun addKey(
        params: V1CustomFieldAddKeyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Remove specific custom field values from a Metronome entity instance by specifying the field
     * keys to delete. Use this endpoint to clean up unwanted custom field data while preserving
     * other fields on the same entity. Requires the entity type, entity ID, and array of keys to
     * remove.
     */
    @JvmOverloads
    fun deleteValues(
        params: V1CustomFieldDeleteValuesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Retrieve all your active custom field keys, with optional filtering by entity type (customer,
     * contract, product, etc.). Use this endpoint to discover what custom field keys are available
     * before setting values on entities or to audit your custom field configuration across
     * different entity types.
     */
    @JvmOverloads
    fun listKeys(
        params: V1CustomFieldListKeysParams = V1CustomFieldListKeysParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V1CustomFieldListKeysPageAsync>

    /**
     * Retrieve all your active custom field keys, with optional filtering by entity type (customer,
     * contract, product, etc.). Use this endpoint to discover what custom field keys are available
     * before setting values on entities or to audit your custom field configuration across
     * different entity types.
     */
    fun listKeys(
        requestOptions: RequestOptions
    ): CompletableFuture<V1CustomFieldListKeysPageAsync> =
        listKeys(V1CustomFieldListKeysParams.none(), requestOptions)

    /**
     * Removes a custom field key from the allowlist for a specific entity type, preventing future
     * use of that key across all instances of the entity. Existing values for this key on entity
     * instances will no longer be accessible once the key is removed.
     */
    @JvmOverloads
    fun removeKey(
        params: V1CustomFieldRemoveKeyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Sets custom field values on a specific Metronome entity instance. Overwrites existing values
     * for matching keys while preserving other fields. All updates are transactional—either all
     * values are set or none are. Custom field values are limited to 200 characters each.
     */
    @JvmOverloads
    fun setValues(
        params: V1CustomFieldSetValuesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>
}
