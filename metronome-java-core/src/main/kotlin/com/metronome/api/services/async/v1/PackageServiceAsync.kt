// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.services.async.v1

import com.metronome.api.core.ClientOptions
import com.metronome.api.core.RequestOptions
import com.metronome.api.core.http.HttpResponseFor
import com.metronome.api.models.v1.packages.PackageArchiveParams
import com.metronome.api.models.v1.packages.PackageArchiveResponse
import com.metronome.api.models.v1.packages.PackageCreateParams
import com.metronome.api.models.v1.packages.PackageCreateResponse
import com.metronome.api.models.v1.packages.PackageListContractsOnPackagePageAsync
import com.metronome.api.models.v1.packages.PackageListContractsOnPackageParams
import com.metronome.api.models.v1.packages.PackageListPageAsync
import com.metronome.api.models.v1.packages.PackageListParams
import com.metronome.api.models.v1.packages.PackageRetrieveParams
import com.metronome.api.models.v1.packages.PackageRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PackageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PackageServiceAsync

    /**
     * Create a package that defines a set of reusable, time-relative contract terms that can be
     * used across cohorts of customers. Packages provide an abstraction layer on top of rate cards
     * to provide an easy way to provision customers with standard pricing.
     *
     * ### **Use this endpoint to:**
     * - Model standard pay-as-you-go pricing packages that can be easily reused across customers
     * - Define standardized contract terms and discounting for sales-led motions
     * - Set aliases for the package to facilitate easy package transition. Aliases are
     *   human-readable names that you can use in the place of the id of the package when
     *   provisioning a customer’s contract. By using an alias, you can easily create a contract and
     *   provision a customer by choosing the “Starter Plan” package, without storing the package ID
     *   in your internal systems. This is helpful when launching terms for a package, as you can
     *   create a new package with the “Starter Plan” alias scheduled to be assigned without
     *   updating your provisioning code.
     *
     * ### Key input fields:
     * - `starting_at_offset`: Starting date relative to contract start. Generates the `starting_at`
     *   date when a contract is provisioned using a package.
     * - `duration`: Duration starting from `starting_at_offset`. Generates the `ending_before` date
     *   when a contract is provisioned using a package.
     * - `date_offset`: Date relative to contract start. Used for point-in-time dates without a
     *   duration.
     * - `aliases`: Human-readable name to use when provisioning contracts with a package.
     *
     * ### Usage guidelines:
     * - Use packages for standard self-serve use cases where customers have consistent terms. For
     *   customers with negotiated custom contract terms, use the `createContract` endpoint for
     *   maximum flexibility.
     * - Billing provider configuration can be set when creating a package by using
     *   `billing_provider` and `delivery_method`. To provision a customer successfully with a
     *   package, the customer must have one and only one billing provider configuration that
     *   matches the billing provider configuration set on the package.
     * - A package alias can only be used by one package at a time. If you create a new package with
     *   an alias that is already in use by another package, the original package’s alias schedule
     *   will be updated. The alias will reference the package to which it was most recently
     *   assigned.
     * - Terms can only be specified using times relative to the contract start date. Supported
     *   granularities are: `days`, `weeks`, `months`, `years`
     * - Packages cannot be edited once created. Use the rate card to easily add new rates across
     *   all of your customers or make direct edits to a contract after provisioning with a package.
     *   Edited contracts will still be associated with the package used during provisioning.
     */
    fun create(params: PackageCreateParams): CompletableFuture<PackageCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PackageCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PackageCreateResponse>

    /**
     * Gets the details for a specific package, including name, aliases, duration, and terms. Use
     * this endpoint to understand a package’s alias schedule, or display a specific package’s
     * details to end customers.
     */
    fun retrieve(params: PackageRetrieveParams): CompletableFuture<PackageRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PackageRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PackageRetrieveResponse>

    /**
     * Lists all packages with details including name, aliases, duration, and terms. To view
     * contracts on a specific package, use the `listContractsOnPackage` endpoint.
     */
    fun list(): CompletableFuture<PackageListPageAsync> = list(PackageListParams.none())

    /** @see list */
    fun list(
        params: PackageListParams = PackageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PackageListPageAsync>

    /** @see list */
    fun list(
        params: PackageListParams = PackageListParams.none()
    ): CompletableFuture<PackageListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<PackageListPageAsync> =
        list(PackageListParams.none(), requestOptions)

    /**
     * Archive a package. Archived packages cannot be used to create new contracts. However,
     * existing contracts associated with the package will continue to function as normal. Once you
     * archive a package, you can still retrieve it in the UI and API, but you cannot unarchive it.
     */
    fun archive(params: PackageArchiveParams): CompletableFuture<PackageArchiveResponse> =
        archive(params, RequestOptions.none())

    /** @see archive */
    fun archive(
        params: PackageArchiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PackageArchiveResponse>

    /**
     * For a given package, returns all contract IDs and customer IDs associated with the package
     * over a specific time period.
     *
     * ### Use this endpoint to:
     * - Understand which customers are provisioned on a package at any given time for internal
     *   cohort management
     * - Manage customer migrations to a new package. For example, to migrate all active customers
     *   to a new package, call this endpoint, end contracts, and provision customers on a new
     *   package.
     *
     * ### **Usage guidelines:**
     * Use the **`starting_at`**, **`covering_date`**, and **`include_archived`** parameters to
     * filter the list of returned contracts. For example, to list only currently active contracts,
     * pass **`covering_date`** equal to the current time.
     */
    fun listContractsOnPackage(
        params: PackageListContractsOnPackageParams
    ): CompletableFuture<PackageListContractsOnPackagePageAsync> =
        listContractsOnPackage(params, RequestOptions.none())

    /** @see listContractsOnPackage */
    fun listContractsOnPackage(
        params: PackageListContractsOnPackageParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PackageListContractsOnPackagePageAsync>

    /**
     * A view of [PackageServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PackageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/packages/create`, but is otherwise the same as
         * [PackageServiceAsync.create].
         */
        fun create(
            params: PackageCreateParams
        ): CompletableFuture<HttpResponseFor<PackageCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PackageCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PackageCreateResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/packages/get`, but is otherwise the same as
         * [PackageServiceAsync.retrieve].
         */
        fun retrieve(
            params: PackageRetrieveParams
        ): CompletableFuture<HttpResponseFor<PackageRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: PackageRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PackageRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/packages/list`, but is otherwise the same as
         * [PackageServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PackageListPageAsync>> =
            list(PackageListParams.none())

        /** @see list */
        fun list(
            params: PackageListParams = PackageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PackageListPageAsync>>

        /** @see list */
        fun list(
            params: PackageListParams = PackageListParams.none()
        ): CompletableFuture<HttpResponseFor<PackageListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PackageListPageAsync>> =
            list(PackageListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/packages/archive`, but is otherwise the same as
         * [PackageServiceAsync.archive].
         */
        fun archive(
            params: PackageArchiveParams
        ): CompletableFuture<HttpResponseFor<PackageArchiveResponse>> =
            archive(params, RequestOptions.none())

        /** @see archive */
        fun archive(
            params: PackageArchiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PackageArchiveResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/packages/listContractsOnPackage`, but is
         * otherwise the same as [PackageServiceAsync.listContractsOnPackage].
         */
        fun listContractsOnPackage(
            params: PackageListContractsOnPackageParams
        ): CompletableFuture<HttpResponseFor<PackageListContractsOnPackagePageAsync>> =
            listContractsOnPackage(params, RequestOptions.none())

        /** @see listContractsOnPackage */
        fun listContractsOnPackage(
            params: PackageListContractsOnPackageParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PackageListContractsOnPackagePageAsync>>
    }
}
