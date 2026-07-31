// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.invoices

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.checkKnown
import com.metronome.api.core.checkRequired
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import com.metronome.api.models.CreditTypeData
import com.metronome.api.models.Rate
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Invoice
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val creditType: JsonField<CreditTypeData>,
    private val customerId: JsonField<String>,
    private val lineItems: JsonField<List<LineItem>>,
    private val status: JsonField<String>,
    private val total: JsonField<Double>,
    private val type: JsonField<String>,
    private val amendmentId: JsonField<String>,
    private val billableStatus: JsonValue,
    private val constituentInvoices: JsonField<List<ConstituentInvoice>>,
    private val contractCustomFields: JsonField<ContractCustomFields>,
    private val contractId: JsonField<String>,
    private val correctionRecord: JsonField<CorrectionRecord>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val customFields: JsonField<CustomFields>,
    private val customerCustomFields: JsonField<CustomerCustomFields>,
    private val endTimestamp: JsonField<OffsetDateTime>,
    private val externalInvoice: JsonField<ExternalInvoice>,
    private val invoiceAdjustments: JsonField<List<InvoiceAdjustment>>,
    private val issuedAt: JsonField<OffsetDateTime>,
    private val netPaymentTermsDays: JsonField<Double>,
    private val netsuiteSalesOrderId: JsonField<String>,
    private val payer: JsonField<Payer>,
    private val planCustomFields: JsonField<PlanCustomFields>,
    private val planId: JsonField<String>,
    private val planName: JsonField<String>,
    private val regeneratedFromInvoiceId: JsonField<String>,
    private val resellerRoyalty: JsonField<ResellerRoyalty>,
    private val revenueSystemInvoices: JsonField<List<RevenueSystemInvoice>>,
    private val salesforceOpportunityId: JsonField<String>,
    private val startTimestamp: JsonField<OffsetDateTime>,
    private val subtotal: JsonField<Double>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("credit_type")
        @ExcludeMissing
        creditType: JsonField<CreditTypeData> = JsonMissing.of(),
        @JsonProperty("customer_id")
        @ExcludeMissing
        customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("line_items")
        @ExcludeMissing
        lineItems: JsonField<List<LineItem>> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total") @ExcludeMissing total: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amendment_id")
        @ExcludeMissing
        amendmentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("billable_status")
        @ExcludeMissing
        billableStatus: JsonValue = JsonMissing.of(),
        @JsonProperty("constituent_invoices")
        @ExcludeMissing
        constituentInvoices: JsonField<List<ConstituentInvoice>> = JsonMissing.of(),
        @JsonProperty("contract_custom_fields")
        @ExcludeMissing
        contractCustomFields: JsonField<ContractCustomFields> = JsonMissing.of(),
        @JsonProperty("contract_id")
        @ExcludeMissing
        contractId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("correction_record")
        @ExcludeMissing
        correctionRecord: JsonField<CorrectionRecord> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("custom_fields")
        @ExcludeMissing
        customFields: JsonField<CustomFields> = JsonMissing.of(),
        @JsonProperty("customer_custom_fields")
        @ExcludeMissing
        customerCustomFields: JsonField<CustomerCustomFields> = JsonMissing.of(),
        @JsonProperty("end_timestamp")
        @ExcludeMissing
        endTimestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("external_invoice")
        @ExcludeMissing
        externalInvoice: JsonField<ExternalInvoice> = JsonMissing.of(),
        @JsonProperty("invoice_adjustments")
        @ExcludeMissing
        invoiceAdjustments: JsonField<List<InvoiceAdjustment>> = JsonMissing.of(),
        @JsonProperty("issued_at")
        @ExcludeMissing
        issuedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("net_payment_terms_days")
        @ExcludeMissing
        netPaymentTermsDays: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payer") @ExcludeMissing payer: JsonField<Payer> = JsonMissing.of(),
        @JsonProperty("plan_custom_fields")
        @ExcludeMissing
        planCustomFields: JsonField<PlanCustomFields> = JsonMissing.of(),
        @JsonProperty("plan_id") @ExcludeMissing planId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("plan_name") @ExcludeMissing planName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("regenerated_from_invoice_id")
        @ExcludeMissing
        regeneratedFromInvoiceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reseller_royalty")
        @ExcludeMissing
        resellerRoyalty: JsonField<ResellerRoyalty> = JsonMissing.of(),
        @JsonProperty("revenue_system_invoices")
        @ExcludeMissing
        revenueSystemInvoices: JsonField<List<RevenueSystemInvoice>> = JsonMissing.of(),
        @JsonProperty("salesforce_opportunity_id")
        @ExcludeMissing
        salesforceOpportunityId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("start_timestamp")
        @ExcludeMissing
        startTimestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("subtotal") @ExcludeMissing subtotal: JsonField<Double> = JsonMissing.of(),
    ) : this(
        id,
        creditType,
        customerId,
        lineItems,
        status,
        total,
        type,
        amendmentId,
        billableStatus,
        constituentInvoices,
        contractCustomFields,
        contractId,
        correctionRecord,
        createdAt,
        customFields,
        customerCustomFields,
        endTimestamp,
        externalInvoice,
        invoiceAdjustments,
        issuedAt,
        netPaymentTermsDays,
        netsuiteSalesOrderId,
        payer,
        planCustomFields,
        planId,
        planName,
        regeneratedFromInvoiceId,
        resellerRoyalty,
        revenueSystemInvoices,
        salesforceOpportunityId,
        startTimestamp,
        subtotal,
        mutableMapOf(),
    )

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun creditType(): CreditTypeData = creditType.getRequired("credit_type")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun customerId(): String = customerId.getRequired("customer_id")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun lineItems(): List<LineItem> = lineItems.getRequired("line_items")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): String = status.getRequired("status")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun total(): Double = total.getRequired("total")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): String = type.getRequired("type")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun amendmentId(): Optional<String> = amendmentId.getOptional("amendment_id")

    /**
     * This field's availability is dependent on your client's configuration.
     *
     * This arbitrary value can be deserialized into a custom type using the `convert` method:
     * ```java
     * MyClass myObject = invoice.billableStatus().convert(MyClass.class);
     * ```
     */
    @JsonProperty("billable_status")
    @ExcludeMissing
    fun _billableStatus(): JsonValue = billableStatus

    /**
     * Required on invoices with type USAGE_CONSOLIDATED. List of constituent invoices that were
     * consolidated to create this invoice.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun constituentInvoices(): Optional<List<ConstituentInvoice>> =
        constituentInvoices.getOptional("constituent_invoices")

    /**
     * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contractCustomFields(): Optional<ContractCustomFields> =
        contractCustomFields.getOptional("contract_custom_fields")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contractId(): Optional<String> = contractId.getOptional("contract_id")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun correctionRecord(): Optional<CorrectionRecord> =
        correctionRecord.getOptional("correction_record")

    /**
     * When the invoice was created (UTC). This field is present for correction invoices only.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customFields(): Optional<CustomFields> = customFields.getOptional("custom_fields")

    /**
     * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerCustomFields(): Optional<CustomerCustomFields> =
        customerCustomFields.getOptional("customer_custom_fields")

    /**
     * End of the usage period this invoice covers (UTC)
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun endTimestamp(): Optional<OffsetDateTime> = endTimestamp.getOptional("end_timestamp")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun externalInvoice(): Optional<ExternalInvoice> =
        externalInvoice.getOptional("external_invoice")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun invoiceAdjustments(): Optional<List<InvoiceAdjustment>> =
        invoiceAdjustments.getOptional("invoice_adjustments")

    /**
     * When the invoice was issued (UTC)
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun issuedAt(): Optional<OffsetDateTime> = issuedAt.getOptional("issued_at")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun netPaymentTermsDays(): Optional<Double> =
        netPaymentTermsDays.getOptional("net_payment_terms_days")

    /**
     * This field's availability is dependent on your client's configuration.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun netsuiteSalesOrderId(): Optional<String> =
        netsuiteSalesOrderId.getOptional("netsuite_sales_order_id")

    /**
     * Required for account hierarchy usage invoices. An object containing the contract and customer
     * UUIDs that pay for this invoice.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun payer(): Optional<Payer> = payer.getOptional("payer")

    /**
     * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun planCustomFields(): Optional<PlanCustomFields> =
        planCustomFields.getOptional("plan_custom_fields")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun planId(): Optional<String> = planId.getOptional("plan_id")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun planName(): Optional<String> = planName.getOptional("plan_name")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun regeneratedFromInvoiceId(): Optional<String> =
        regeneratedFromInvoiceId.getOptional("regenerated_from_invoice_id")

    /**
     * Only present for contract invoices with reseller royalties.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun resellerRoyalty(): Optional<ResellerRoyalty> =
        resellerRoyalty.getOptional("reseller_royalty")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun revenueSystemInvoices(): Optional<List<RevenueSystemInvoice>> =
        revenueSystemInvoices.getOptional("revenue_system_invoices")

    /**
     * This field's availability is dependent on your client's configuration.
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun salesforceOpportunityId(): Optional<String> =
        salesforceOpportunityId.getOptional("salesforce_opportunity_id")

    /**
     * Beginning of the usage period this invoice covers (UTC)
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun startTimestamp(): Optional<OffsetDateTime> = startTimestamp.getOptional("start_timestamp")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun subtotal(): Optional<Double> = subtotal.getOptional("subtotal")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [creditType].
     *
     * Unlike [creditType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("credit_type")
    @ExcludeMissing
    fun _creditType(): JsonField<CreditTypeData> = creditType

    /**
     * Returns the raw JSON value of [customerId].
     *
     * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("customer_id") @ExcludeMissing fun _customerId(): JsonField<String> = customerId

    /**
     * Returns the raw JSON value of [lineItems].
     *
     * Unlike [lineItems], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("line_items")
    @ExcludeMissing
    fun _lineItems(): JsonField<List<LineItem>> = lineItems

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    /**
     * Returns the raw JSON value of [total].
     *
     * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Double> = total

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

    /**
     * Returns the raw JSON value of [amendmentId].
     *
     * Unlike [amendmentId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amendment_id")
    @ExcludeMissing
    fun _amendmentId(): JsonField<String> = amendmentId

    /**
     * Returns the raw JSON value of [constituentInvoices].
     *
     * Unlike [constituentInvoices], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("constituent_invoices")
    @ExcludeMissing
    fun _constituentInvoices(): JsonField<List<ConstituentInvoice>> = constituentInvoices

    /**
     * Returns the raw JSON value of [contractCustomFields].
     *
     * Unlike [contractCustomFields], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("contract_custom_fields")
    @ExcludeMissing
    fun _contractCustomFields(): JsonField<ContractCustomFields> = contractCustomFields

    /**
     * Returns the raw JSON value of [contractId].
     *
     * Unlike [contractId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("contract_id") @ExcludeMissing fun _contractId(): JsonField<String> = contractId

    /**
     * Returns the raw JSON value of [correctionRecord].
     *
     * Unlike [correctionRecord], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("correction_record")
    @ExcludeMissing
    fun _correctionRecord(): JsonField<CorrectionRecord> = correctionRecord

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [customFields].
     *
     * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("custom_fields")
    @ExcludeMissing
    fun _customFields(): JsonField<CustomFields> = customFields

    /**
     * Returns the raw JSON value of [customerCustomFields].
     *
     * Unlike [customerCustomFields], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("customer_custom_fields")
    @ExcludeMissing
    fun _customerCustomFields(): JsonField<CustomerCustomFields> = customerCustomFields

    /**
     * Returns the raw JSON value of [endTimestamp].
     *
     * Unlike [endTimestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("end_timestamp")
    @ExcludeMissing
    fun _endTimestamp(): JsonField<OffsetDateTime> = endTimestamp

    /**
     * Returns the raw JSON value of [externalInvoice].
     *
     * Unlike [externalInvoice], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("external_invoice")
    @ExcludeMissing
    fun _externalInvoice(): JsonField<ExternalInvoice> = externalInvoice

    /**
     * Returns the raw JSON value of [invoiceAdjustments].
     *
     * Unlike [invoiceAdjustments], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("invoice_adjustments")
    @ExcludeMissing
    fun _invoiceAdjustments(): JsonField<List<InvoiceAdjustment>> = invoiceAdjustments

    /**
     * Returns the raw JSON value of [issuedAt].
     *
     * Unlike [issuedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("issued_at") @ExcludeMissing fun _issuedAt(): JsonField<OffsetDateTime> = issuedAt

    /**
     * Returns the raw JSON value of [netPaymentTermsDays].
     *
     * Unlike [netPaymentTermsDays], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("net_payment_terms_days")
    @ExcludeMissing
    fun _netPaymentTermsDays(): JsonField<Double> = netPaymentTermsDays

    /**
     * Returns the raw JSON value of [netsuiteSalesOrderId].
     *
     * Unlike [netsuiteSalesOrderId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("netsuite_sales_order_id")
    @ExcludeMissing
    fun _netsuiteSalesOrderId(): JsonField<String> = netsuiteSalesOrderId

    /**
     * Returns the raw JSON value of [payer].
     *
     * Unlike [payer], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("payer") @ExcludeMissing fun _payer(): JsonField<Payer> = payer

    /**
     * Returns the raw JSON value of [planCustomFields].
     *
     * Unlike [planCustomFields], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("plan_custom_fields")
    @ExcludeMissing
    fun _planCustomFields(): JsonField<PlanCustomFields> = planCustomFields

    /**
     * Returns the raw JSON value of [planId].
     *
     * Unlike [planId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("plan_id") @ExcludeMissing fun _planId(): JsonField<String> = planId

    /**
     * Returns the raw JSON value of [planName].
     *
     * Unlike [planName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("plan_name") @ExcludeMissing fun _planName(): JsonField<String> = planName

    /**
     * Returns the raw JSON value of [regeneratedFromInvoiceId].
     *
     * Unlike [regeneratedFromInvoiceId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("regenerated_from_invoice_id")
    @ExcludeMissing
    fun _regeneratedFromInvoiceId(): JsonField<String> = regeneratedFromInvoiceId

    /**
     * Returns the raw JSON value of [resellerRoyalty].
     *
     * Unlike [resellerRoyalty], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reseller_royalty")
    @ExcludeMissing
    fun _resellerRoyalty(): JsonField<ResellerRoyalty> = resellerRoyalty

    /**
     * Returns the raw JSON value of [revenueSystemInvoices].
     *
     * Unlike [revenueSystemInvoices], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("revenue_system_invoices")
    @ExcludeMissing
    fun _revenueSystemInvoices(): JsonField<List<RevenueSystemInvoice>> = revenueSystemInvoices

    /**
     * Returns the raw JSON value of [salesforceOpportunityId].
     *
     * Unlike [salesforceOpportunityId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("salesforce_opportunity_id")
    @ExcludeMissing
    fun _salesforceOpportunityId(): JsonField<String> = salesforceOpportunityId

    /**
     * Returns the raw JSON value of [startTimestamp].
     *
     * Unlike [startTimestamp], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("start_timestamp")
    @ExcludeMissing
    fun _startTimestamp(): JsonField<OffsetDateTime> = startTimestamp

    /**
     * Returns the raw JSON value of [subtotal].
     *
     * Unlike [subtotal], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("subtotal") @ExcludeMissing fun _subtotal(): JsonField<Double> = subtotal

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Invoice].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .creditType()
         * .customerId()
         * .lineItems()
         * .status()
         * .total()
         * .type()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Invoice]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var creditType: JsonField<CreditTypeData>? = null
        private var customerId: JsonField<String>? = null
        private var lineItems: JsonField<MutableList<LineItem>>? = null
        private var status: JsonField<String>? = null
        private var total: JsonField<Double>? = null
        private var type: JsonField<String>? = null
        private var amendmentId: JsonField<String> = JsonMissing.of()
        private var billableStatus: JsonValue = JsonMissing.of()
        private var constituentInvoices: JsonField<MutableList<ConstituentInvoice>>? = null
        private var contractCustomFields: JsonField<ContractCustomFields> = JsonMissing.of()
        private var contractId: JsonField<String> = JsonMissing.of()
        private var correctionRecord: JsonField<CorrectionRecord> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var customFields: JsonField<CustomFields> = JsonMissing.of()
        private var customerCustomFields: JsonField<CustomerCustomFields> = JsonMissing.of()
        private var endTimestamp: JsonField<OffsetDateTime> = JsonMissing.of()
        private var externalInvoice: JsonField<ExternalInvoice> = JsonMissing.of()
        private var invoiceAdjustments: JsonField<MutableList<InvoiceAdjustment>>? = null
        private var issuedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var netPaymentTermsDays: JsonField<Double> = JsonMissing.of()
        private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
        private var payer: JsonField<Payer> = JsonMissing.of()
        private var planCustomFields: JsonField<PlanCustomFields> = JsonMissing.of()
        private var planId: JsonField<String> = JsonMissing.of()
        private var planName: JsonField<String> = JsonMissing.of()
        private var regeneratedFromInvoiceId: JsonField<String> = JsonMissing.of()
        private var resellerRoyalty: JsonField<ResellerRoyalty> = JsonMissing.of()
        private var revenueSystemInvoices: JsonField<MutableList<RevenueSystemInvoice>>? = null
        private var salesforceOpportunityId: JsonField<String> = JsonMissing.of()
        private var startTimestamp: JsonField<OffsetDateTime> = JsonMissing.of()
        private var subtotal: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(invoice: Invoice) = apply {
            id = invoice.id
            creditType = invoice.creditType
            customerId = invoice.customerId
            lineItems = invoice.lineItems.map { it.toMutableList() }
            status = invoice.status
            total = invoice.total
            type = invoice.type
            amendmentId = invoice.amendmentId
            billableStatus = invoice.billableStatus
            constituentInvoices = invoice.constituentInvoices.map { it.toMutableList() }
            contractCustomFields = invoice.contractCustomFields
            contractId = invoice.contractId
            correctionRecord = invoice.correctionRecord
            createdAt = invoice.createdAt
            customFields = invoice.customFields
            customerCustomFields = invoice.customerCustomFields
            endTimestamp = invoice.endTimestamp
            externalInvoice = invoice.externalInvoice
            invoiceAdjustments = invoice.invoiceAdjustments.map { it.toMutableList() }
            issuedAt = invoice.issuedAt
            netPaymentTermsDays = invoice.netPaymentTermsDays
            netsuiteSalesOrderId = invoice.netsuiteSalesOrderId
            payer = invoice.payer
            planCustomFields = invoice.planCustomFields
            planId = invoice.planId
            planName = invoice.planName
            regeneratedFromInvoiceId = invoice.regeneratedFromInvoiceId
            resellerRoyalty = invoice.resellerRoyalty
            revenueSystemInvoices = invoice.revenueSystemInvoices.map { it.toMutableList() }
            salesforceOpportunityId = invoice.salesforceOpportunityId
            startTimestamp = invoice.startTimestamp
            subtotal = invoice.subtotal
            additionalProperties = invoice.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun creditType(creditType: CreditTypeData) = creditType(JsonField.of(creditType))

        /**
         * Sets [Builder.creditType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.creditType] with a well-typed [CreditTypeData] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun creditType(creditType: JsonField<CreditTypeData>) = apply {
            this.creditType = creditType
        }

        fun customerId(customerId: String) = customerId(JsonField.of(customerId))

        /**
         * Sets [Builder.customerId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        fun lineItems(lineItems: List<LineItem>) = lineItems(JsonField.of(lineItems))

        /**
         * Sets [Builder.lineItems] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lineItems] with a well-typed `List<LineItem>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lineItems(lineItems: JsonField<List<LineItem>>) = apply {
            this.lineItems = lineItems.map { it.toMutableList() }
        }

        /**
         * Adds a single [LineItem] to [lineItems].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLineItem(lineItem: LineItem) = apply {
            lineItems =
                (lineItems ?: JsonField.of(mutableListOf())).also {
                    checkKnown("lineItems", it).add(lineItem)
                }
        }

        fun status(status: String) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<String>) = apply { this.status = status }

        fun total(total: Double) = total(JsonField.of(total))

        /**
         * Sets [Builder.total] to an arbitrary JSON value.
         *
         * You should usually call [Builder.total] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun total(total: JsonField<Double>) = apply { this.total = total }

        fun type(type: String) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<String>) = apply { this.type = type }

        fun amendmentId(amendmentId: String) = amendmentId(JsonField.of(amendmentId))

        /**
         * Sets [Builder.amendmentId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amendmentId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun amendmentId(amendmentId: JsonField<String>) = apply { this.amendmentId = amendmentId }

        /** This field's availability is dependent on your client's configuration. */
        fun billableStatus(billableStatus: JsonValue) = apply {
            this.billableStatus = billableStatus
        }

        /**
         * Required on invoices with type USAGE_CONSOLIDATED. List of constituent invoices that were
         * consolidated to create this invoice.
         */
        fun constituentInvoices(constituentInvoices: List<ConstituentInvoice>) =
            constituentInvoices(JsonField.of(constituentInvoices))

        /**
         * Sets [Builder.constituentInvoices] to an arbitrary JSON value.
         *
         * You should usually call [Builder.constituentInvoices] with a well-typed
         * `List<ConstituentInvoice>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun constituentInvoices(constituentInvoices: JsonField<List<ConstituentInvoice>>) = apply {
            this.constituentInvoices = constituentInvoices.map { it.toMutableList() }
        }

        /**
         * Adds a single [ConstituentInvoice] to [constituentInvoices].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addConstituentInvoice(constituentInvoice: ConstituentInvoice) = apply {
            constituentInvoices =
                (constituentInvoices ?: JsonField.of(mutableListOf())).also {
                    checkKnown("constituentInvoices", it).add(constituentInvoice)
                }
        }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun contractCustomFields(contractCustomFields: ContractCustomFields) =
            contractCustomFields(JsonField.of(contractCustomFields))

        /**
         * Sets [Builder.contractCustomFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contractCustomFields] with a well-typed
         * [ContractCustomFields] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun contractCustomFields(contractCustomFields: JsonField<ContractCustomFields>) = apply {
            this.contractCustomFields = contractCustomFields
        }

        fun contractId(contractId: String) = contractId(JsonField.of(contractId))

        /**
         * Sets [Builder.contractId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contractId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun contractId(contractId: JsonField<String>) = apply { this.contractId = contractId }

        fun correctionRecord(correctionRecord: CorrectionRecord) =
            correctionRecord(JsonField.of(correctionRecord))

        /**
         * Sets [Builder.correctionRecord] to an arbitrary JSON value.
         *
         * You should usually call [Builder.correctionRecord] with a well-typed [CorrectionRecord]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun correctionRecord(correctionRecord: JsonField<CorrectionRecord>) = apply {
            this.correctionRecord = correctionRecord
        }

        /**
         * When the invoice was created (UTC). This field is present for correction invoices only.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

        /**
         * Sets [Builder.customFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customFields] with a well-typed [CustomFields] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun customFields(customFields: JsonField<CustomFields>) = apply {
            this.customFields = customFields
        }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun customerCustomFields(customerCustomFields: CustomerCustomFields) =
            customerCustomFields(JsonField.of(customerCustomFields))

        /**
         * Sets [Builder.customerCustomFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerCustomFields] with a well-typed
         * [CustomerCustomFields] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun customerCustomFields(customerCustomFields: JsonField<CustomerCustomFields>) = apply {
            this.customerCustomFields = customerCustomFields
        }

        /** End of the usage period this invoice covers (UTC) */
        fun endTimestamp(endTimestamp: OffsetDateTime) = endTimestamp(JsonField.of(endTimestamp))

        /**
         * Sets [Builder.endTimestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.endTimestamp] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun endTimestamp(endTimestamp: JsonField<OffsetDateTime>) = apply {
            this.endTimestamp = endTimestamp
        }

        fun externalInvoice(externalInvoice: ExternalInvoice?) =
            externalInvoice(JsonField.ofNullable(externalInvoice))

        /** Alias for calling [Builder.externalInvoice] with `externalInvoice.orElse(null)`. */
        fun externalInvoice(externalInvoice: Optional<ExternalInvoice>) =
            externalInvoice(externalInvoice.getOrNull())

        /**
         * Sets [Builder.externalInvoice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalInvoice] with a well-typed [ExternalInvoice]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun externalInvoice(externalInvoice: JsonField<ExternalInvoice>) = apply {
            this.externalInvoice = externalInvoice
        }

        fun invoiceAdjustments(invoiceAdjustments: List<InvoiceAdjustment>) =
            invoiceAdjustments(JsonField.of(invoiceAdjustments))

        /**
         * Sets [Builder.invoiceAdjustments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceAdjustments] with a well-typed
         * `List<InvoiceAdjustment>` value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun invoiceAdjustments(invoiceAdjustments: JsonField<List<InvoiceAdjustment>>) = apply {
            this.invoiceAdjustments = invoiceAdjustments.map { it.toMutableList() }
        }

        /**
         * Adds a single [InvoiceAdjustment] to [invoiceAdjustments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInvoiceAdjustment(invoiceAdjustment: InvoiceAdjustment) = apply {
            invoiceAdjustments =
                (invoiceAdjustments ?: JsonField.of(mutableListOf())).also {
                    checkKnown("invoiceAdjustments", it).add(invoiceAdjustment)
                }
        }

        /** When the invoice was issued (UTC) */
        fun issuedAt(issuedAt: OffsetDateTime) = issuedAt(JsonField.of(issuedAt))

        /**
         * Sets [Builder.issuedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.issuedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun issuedAt(issuedAt: JsonField<OffsetDateTime>) = apply { this.issuedAt = issuedAt }

        fun netPaymentTermsDays(netPaymentTermsDays: Double) =
            netPaymentTermsDays(JsonField.of(netPaymentTermsDays))

        /**
         * Sets [Builder.netPaymentTermsDays] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netPaymentTermsDays] with a well-typed [Double] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun netPaymentTermsDays(netPaymentTermsDays: JsonField<Double>) = apply {
            this.netPaymentTermsDays = netPaymentTermsDays
        }

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
            netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

        /**
         * Sets [Builder.netsuiteSalesOrderId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.netsuiteSalesOrderId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
            this.netsuiteSalesOrderId = netsuiteSalesOrderId
        }

        /**
         * Required for account hierarchy usage invoices. An object containing the contract and
         * customer UUIDs that pay for this invoice.
         */
        fun payer(payer: Payer) = payer(JsonField.of(payer))

        /**
         * Sets [Builder.payer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payer] with a well-typed [Payer] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun payer(payer: JsonField<Payer>) = apply { this.payer = payer }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun planCustomFields(planCustomFields: PlanCustomFields) =
            planCustomFields(JsonField.of(planCustomFields))

        /**
         * Sets [Builder.planCustomFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planCustomFields] with a well-typed [PlanCustomFields]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun planCustomFields(planCustomFields: JsonField<PlanCustomFields>) = apply {
            this.planCustomFields = planCustomFields
        }

        fun planId(planId: String) = planId(JsonField.of(planId))

        /**
         * Sets [Builder.planId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun planId(planId: JsonField<String>) = apply { this.planId = planId }

        fun planName(planName: String) = planName(JsonField.of(planName))

        /**
         * Sets [Builder.planName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun planName(planName: JsonField<String>) = apply { this.planName = planName }

        fun regeneratedFromInvoiceId(regeneratedFromInvoiceId: String) =
            regeneratedFromInvoiceId(JsonField.of(regeneratedFromInvoiceId))

        /**
         * Sets [Builder.regeneratedFromInvoiceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.regeneratedFromInvoiceId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun regeneratedFromInvoiceId(regeneratedFromInvoiceId: JsonField<String>) = apply {
            this.regeneratedFromInvoiceId = regeneratedFromInvoiceId
        }

        /** Only present for contract invoices with reseller royalties. */
        fun resellerRoyalty(resellerRoyalty: ResellerRoyalty) =
            resellerRoyalty(JsonField.of(resellerRoyalty))

        /**
         * Sets [Builder.resellerRoyalty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resellerRoyalty] with a well-typed [ResellerRoyalty]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun resellerRoyalty(resellerRoyalty: JsonField<ResellerRoyalty>) = apply {
            this.resellerRoyalty = resellerRoyalty
        }

        fun revenueSystemInvoices(revenueSystemInvoices: List<RevenueSystemInvoice>?) =
            revenueSystemInvoices(JsonField.ofNullable(revenueSystemInvoices))

        /**
         * Alias for calling [Builder.revenueSystemInvoices] with
         * `revenueSystemInvoices.orElse(null)`.
         */
        fun revenueSystemInvoices(revenueSystemInvoices: Optional<List<RevenueSystemInvoice>>) =
            revenueSystemInvoices(revenueSystemInvoices.getOrNull())

        /**
         * Sets [Builder.revenueSystemInvoices] to an arbitrary JSON value.
         *
         * You should usually call [Builder.revenueSystemInvoices] with a well-typed
         * `List<RevenueSystemInvoice>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun revenueSystemInvoices(revenueSystemInvoices: JsonField<List<RevenueSystemInvoice>>) =
            apply {
                this.revenueSystemInvoices = revenueSystemInvoices.map { it.toMutableList() }
            }

        /**
         * Adds a single [RevenueSystemInvoice] to [revenueSystemInvoices].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRevenueSystemInvoice(revenueSystemInvoice: RevenueSystemInvoice) = apply {
            revenueSystemInvoices =
                (revenueSystemInvoices ?: JsonField.of(mutableListOf())).also {
                    checkKnown("revenueSystemInvoices", it).add(revenueSystemInvoice)
                }
        }

        /** This field's availability is dependent on your client's configuration. */
        fun salesforceOpportunityId(salesforceOpportunityId: String) =
            salesforceOpportunityId(JsonField.of(salesforceOpportunityId))

        /**
         * Sets [Builder.salesforceOpportunityId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.salesforceOpportunityId] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun salesforceOpportunityId(salesforceOpportunityId: JsonField<String>) = apply {
            this.salesforceOpportunityId = salesforceOpportunityId
        }

        /** Beginning of the usage period this invoice covers (UTC) */
        fun startTimestamp(startTimestamp: OffsetDateTime) =
            startTimestamp(JsonField.of(startTimestamp))

        /**
         * Sets [Builder.startTimestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.startTimestamp] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun startTimestamp(startTimestamp: JsonField<OffsetDateTime>) = apply {
            this.startTimestamp = startTimestamp
        }

        fun subtotal(subtotal: Double) = subtotal(JsonField.of(subtotal))

        /**
         * Sets [Builder.subtotal] to an arbitrary JSON value.
         *
         * You should usually call [Builder.subtotal] with a well-typed [Double] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun subtotal(subtotal: JsonField<Double>) = apply { this.subtotal = subtotal }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [Invoice].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .creditType()
         * .customerId()
         * .lineItems()
         * .status()
         * .total()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Invoice =
            Invoice(
                checkRequired("id", id),
                checkRequired("creditType", creditType),
                checkRequired("customerId", customerId),
                checkRequired("lineItems", lineItems).map { it.toImmutable() },
                checkRequired("status", status),
                checkRequired("total", total),
                checkRequired("type", type),
                amendmentId,
                billableStatus,
                (constituentInvoices ?: JsonMissing.of()).map { it.toImmutable() },
                contractCustomFields,
                contractId,
                correctionRecord,
                createdAt,
                customFields,
                customerCustomFields,
                endTimestamp,
                externalInvoice,
                (invoiceAdjustments ?: JsonMissing.of()).map { it.toImmutable() },
                issuedAt,
                netPaymentTermsDays,
                netsuiteSalesOrderId,
                payer,
                planCustomFields,
                planId,
                planName,
                regeneratedFromInvoiceId,
                resellerRoyalty,
                (revenueSystemInvoices ?: JsonMissing.of()).map { it.toImmutable() },
                salesforceOpportunityId,
                startTimestamp,
                subtotal,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): Invoice = apply {
        if (validated) {
            return@apply
        }

        id()
        creditType().validate()
        customerId()
        lineItems().forEach { it.validate() }
        status()
        total()
        type()
        amendmentId()
        constituentInvoices().ifPresent { it.forEach { it.validate() } }
        contractCustomFields().ifPresent { it.validate() }
        contractId()
        correctionRecord().ifPresent { it.validate() }
        createdAt()
        customFields().ifPresent { it.validate() }
        customerCustomFields().ifPresent { it.validate() }
        endTimestamp()
        externalInvoice().ifPresent { it.validate() }
        invoiceAdjustments().ifPresent { it.forEach { it.validate() } }
        issuedAt()
        netPaymentTermsDays()
        netsuiteSalesOrderId()
        payer().ifPresent { it.validate() }
        planCustomFields().ifPresent { it.validate() }
        planId()
        planName()
        regeneratedFromInvoiceId()
        resellerRoyalty().ifPresent { it.validate() }
        revenueSystemInvoices().ifPresent { it.forEach { it.validate() } }
        salesforceOpportunityId()
        startTimestamp()
        subtotal()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: MetronomeInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (creditType.asKnown().getOrNull()?.validity() ?: 0) +
            (if (customerId.asKnown().isPresent) 1 else 0) +
            (lineItems.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (status.asKnown().isPresent) 1 else 0) +
            (if (total.asKnown().isPresent) 1 else 0) +
            (if (type.asKnown().isPresent) 1 else 0) +
            (if (amendmentId.asKnown().isPresent) 1 else 0) +
            (constituentInvoices.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (contractCustomFields.asKnown().getOrNull()?.validity() ?: 0) +
            (if (contractId.asKnown().isPresent) 1 else 0) +
            (correctionRecord.asKnown().getOrNull()?.validity() ?: 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (customFields.asKnown().getOrNull()?.validity() ?: 0) +
            (customerCustomFields.asKnown().getOrNull()?.validity() ?: 0) +
            (if (endTimestamp.asKnown().isPresent) 1 else 0) +
            (externalInvoice.asKnown().getOrNull()?.validity() ?: 0) +
            (invoiceAdjustments.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (issuedAt.asKnown().isPresent) 1 else 0) +
            (if (netPaymentTermsDays.asKnown().isPresent) 1 else 0) +
            (if (netsuiteSalesOrderId.asKnown().isPresent) 1 else 0) +
            (payer.asKnown().getOrNull()?.validity() ?: 0) +
            (planCustomFields.asKnown().getOrNull()?.validity() ?: 0) +
            (if (planId.asKnown().isPresent) 1 else 0) +
            (if (planName.asKnown().isPresent) 1 else 0) +
            (if (regeneratedFromInvoiceId.asKnown().isPresent) 1 else 0) +
            (resellerRoyalty.asKnown().getOrNull()?.validity() ?: 0) +
            (revenueSystemInvoices.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (salesforceOpportunityId.asKnown().isPresent) 1 else 0) +
            (if (startTimestamp.asKnown().isPresent) 1 else 0) +
            (if (subtotal.asKnown().isPresent) 1 else 0)

    class LineItem
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val creditType: JsonField<CreditTypeData>,
        private val name: JsonField<String>,
        private val total: JsonField<Double>,
        private val type: JsonField<String>,
        private val appliedCommitOrCredit: JsonField<AppliedCommitOrCredit>,
        private val commitCustomFields: JsonField<CommitCustomFields>,
        private val commitId: JsonField<String>,
        private val commitNetsuiteItemId: JsonField<String>,
        private val commitNetsuiteSalesOrderId: JsonField<String>,
        private val commitSegmentId: JsonField<String>,
        private val commitType: JsonField<String>,
        private val customFields: JsonField<CustomFields>,
        private val discountCustomFields: JsonField<DiscountCustomFields>,
        private val discountId: JsonField<String>,
        private val endingBefore: JsonField<OffsetDateTime>,
        private val groupKey: JsonField<String>,
        private val groupValue: JsonField<String>,
        private val isProrated: JsonField<Boolean>,
        private val listPrice: JsonField<Rate>,
        private val metadata: JsonField<String>,
        private val netsuiteInvoiceBillingEnd: JsonField<OffsetDateTime>,
        private val netsuiteInvoiceBillingStart: JsonField<OffsetDateTime>,
        private val netsuiteItemId: JsonField<String>,
        private val origin: JsonField<Origin>,
        private val postpaidCommit: JsonField<PostpaidCommit>,
        private val presentationGroupValues: JsonField<PresentationGroupValues>,
        private val pricingGroupValues: JsonField<PricingGroupValues>,
        private val productCustomFields: JsonField<ProductCustomFields>,
        private val productId: JsonField<String>,
        private val productTags: JsonField<List<String>>,
        private val productType: JsonField<String>,
        private val professionalServiceCustomFields: JsonField<ProfessionalServiceCustomFields>,
        private val professionalServiceId: JsonField<String>,
        private val quantity: JsonField<Double>,
        private val resellerType: JsonField<ResellerType>,
        private val scheduledChargeCustomFields: JsonField<ScheduledChargeCustomFields>,
        private val scheduledChargeId: JsonField<String>,
        private val startingAt: JsonField<OffsetDateTime>,
        private val subLineItems: JsonField<List<SubLineItem>>,
        private val subscriptionCustomFields: JsonField<SubscriptionCustomFields>,
        private val subscriptionId: JsonField<String>,
        private val tier: JsonField<Tier>,
        private val unitPrice: JsonField<Double>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("credit_type")
            @ExcludeMissing
            creditType: JsonField<CreditTypeData> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("total") @ExcludeMissing total: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<String> = JsonMissing.of(),
            @JsonProperty("applied_commit_or_credit")
            @ExcludeMissing
            appliedCommitOrCredit: JsonField<AppliedCommitOrCredit> = JsonMissing.of(),
            @JsonProperty("commit_custom_fields")
            @ExcludeMissing
            commitCustomFields: JsonField<CommitCustomFields> = JsonMissing.of(),
            @JsonProperty("commit_id")
            @ExcludeMissing
            commitId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("commit_netsuite_item_id")
            @ExcludeMissing
            commitNetsuiteItemId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("commit_netsuite_sales_order_id")
            @ExcludeMissing
            commitNetsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("commit_segment_id")
            @ExcludeMissing
            commitSegmentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("commit_type")
            @ExcludeMissing
            commitType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("custom_fields")
            @ExcludeMissing
            customFields: JsonField<CustomFields> = JsonMissing.of(),
            @JsonProperty("discount_custom_fields")
            @ExcludeMissing
            discountCustomFields: JsonField<DiscountCustomFields> = JsonMissing.of(),
            @JsonProperty("discount_id")
            @ExcludeMissing
            discountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ending_before")
            @ExcludeMissing
            endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("group_key")
            @ExcludeMissing
            groupKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("group_value")
            @ExcludeMissing
            groupValue: JsonField<String> = JsonMissing.of(),
            @JsonProperty("is_prorated")
            @ExcludeMissing
            isProrated: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("list_price")
            @ExcludeMissing
            listPrice: JsonField<Rate> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<String> = JsonMissing.of(),
            @JsonProperty("netsuite_invoice_billing_end")
            @ExcludeMissing
            netsuiteInvoiceBillingEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("netsuite_invoice_billing_start")
            @ExcludeMissing
            netsuiteInvoiceBillingStart: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("netsuite_item_id")
            @ExcludeMissing
            netsuiteItemId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("origin") @ExcludeMissing origin: JsonField<Origin> = JsonMissing.of(),
            @JsonProperty("postpaid_commit")
            @ExcludeMissing
            postpaidCommit: JsonField<PostpaidCommit> = JsonMissing.of(),
            @JsonProperty("presentation_group_values")
            @ExcludeMissing
            presentationGroupValues: JsonField<PresentationGroupValues> = JsonMissing.of(),
            @JsonProperty("pricing_group_values")
            @ExcludeMissing
            pricingGroupValues: JsonField<PricingGroupValues> = JsonMissing.of(),
            @JsonProperty("product_custom_fields")
            @ExcludeMissing
            productCustomFields: JsonField<ProductCustomFields> = JsonMissing.of(),
            @JsonProperty("product_id")
            @ExcludeMissing
            productId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("product_tags")
            @ExcludeMissing
            productTags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("product_type")
            @ExcludeMissing
            productType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("professional_service_custom_fields")
            @ExcludeMissing
            professionalServiceCustomFields: JsonField<ProfessionalServiceCustomFields> =
                JsonMissing.of(),
            @JsonProperty("professional_service_id")
            @ExcludeMissing
            professionalServiceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quantity")
            @ExcludeMissing
            quantity: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("reseller_type")
            @ExcludeMissing
            resellerType: JsonField<ResellerType> = JsonMissing.of(),
            @JsonProperty("scheduled_charge_custom_fields")
            @ExcludeMissing
            scheduledChargeCustomFields: JsonField<ScheduledChargeCustomFields> = JsonMissing.of(),
            @JsonProperty("scheduled_charge_id")
            @ExcludeMissing
            scheduledChargeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("starting_at")
            @ExcludeMissing
            startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("sub_line_items")
            @ExcludeMissing
            subLineItems: JsonField<List<SubLineItem>> = JsonMissing.of(),
            @JsonProperty("subscription_custom_fields")
            @ExcludeMissing
            subscriptionCustomFields: JsonField<SubscriptionCustomFields> = JsonMissing.of(),
            @JsonProperty("subscription_id")
            @ExcludeMissing
            subscriptionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tier") @ExcludeMissing tier: JsonField<Tier> = JsonMissing.of(),
            @JsonProperty("unit_price")
            @ExcludeMissing
            unitPrice: JsonField<Double> = JsonMissing.of(),
        ) : this(
            creditType,
            name,
            total,
            type,
            appliedCommitOrCredit,
            commitCustomFields,
            commitId,
            commitNetsuiteItemId,
            commitNetsuiteSalesOrderId,
            commitSegmentId,
            commitType,
            customFields,
            discountCustomFields,
            discountId,
            endingBefore,
            groupKey,
            groupValue,
            isProrated,
            listPrice,
            metadata,
            netsuiteInvoiceBillingEnd,
            netsuiteInvoiceBillingStart,
            netsuiteItemId,
            origin,
            postpaidCommit,
            presentationGroupValues,
            pricingGroupValues,
            productCustomFields,
            productId,
            productTags,
            productType,
            professionalServiceCustomFields,
            professionalServiceId,
            quantity,
            resellerType,
            scheduledChargeCustomFields,
            scheduledChargeId,
            startingAt,
            subLineItems,
            subscriptionCustomFields,
            subscriptionId,
            tier,
            unitPrice,
            mutableMapOf(),
        )

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditType(): CreditTypeData = creditType.getRequired("credit_type")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun total(): Double = total.getRequired("total")

        /**
         * The type of line item.
         * - `scheduled`: Line item is associated with a scheduled charge. View the
         *   scheduled_charge_id on the line item.
         * - `commit_purchase`: Line item is associated with a payment for a prepaid commit. View
         *   the commit_id on the line item.
         * - `usage`: Line item is associated with a usage product or composite product. View the
         *   product_id on the line item to determine which product.
         * - `subscription`: Line item is associated with a subscription. e.g. monthly recurring
         *   payment for an in-advance subscription.
         * - `applied_commit_or_credit`: On metronome invoices, applied commits and credits are
         *   associated with their own line items. These line items have negative totals. Use the
         *   applied_commit_or_credit object on the line item to understand the id of the applied
         *   commit or credit, and its type. Note that the application of a postpaid commit is
         *   associated with a line item, but the total on the line item is not included in the
         *   invoice's total as postpaid commits are paid in-arrears.
         * - `cpu_conversion`: Line item converting between a custom pricing unit and fiat currency,
         *   using the conversion rate set on the rate card. This line item will appear when there
         *   are products priced in custom pricing units, and there is insufficient prepaid
         *   commit/credit in that custom pricing unit to fully cover the spend. Then, the
         *   outstanding spend in custom pricing units will be converted to fiat currency using a
         *   cpu_conversion line item.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): String = type.getRequired("type")

        /**
         * Details about the credit or commit that was applied to this line item. Only present on
         * line items with product of `USAGE`, `SUBSCRIPTION` or `COMPOSITE` types.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun appliedCommitOrCredit(): Optional<AppliedCommitOrCredit> =
            appliedCommitOrCredit.getOptional("applied_commit_or_credit")

        /**
         * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun commitCustomFields(): Optional<CommitCustomFields> =
            commitCustomFields.getOptional("commit_custom_fields")

        /**
         * For line items with product of `USAGE`, `SUBSCRIPTION`, or `COMPOSITE` types, the ID of
         * the credit or commit that was applied to this line item. For line items with product type
         * of `FIXED`, the ID of the prepaid or postpaid commit that is being paid for.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun commitId(): Optional<String> = commitId.getOptional("commit_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun commitNetsuiteItemId(): Optional<String> =
            commitNetsuiteItemId.getOptional("commit_netsuite_item_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun commitNetsuiteSalesOrderId(): Optional<String> =
            commitNetsuiteSalesOrderId.getOptional("commit_netsuite_sales_order_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun commitSegmentId(): Optional<String> = commitSegmentId.getOptional("commit_segment_id")

        /**
         * `PrepaidCommit` (for commit types `PREPAID` and `CREDIT`) or `PostpaidCommit` (for commit
         * type `POSTPAID`).
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun commitType(): Optional<String> = commitType.getOptional("commit_type")

        /**
         * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun customFields(): Optional<CustomFields> = customFields.getOptional("custom_fields")

        /**
         * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun discountCustomFields(): Optional<DiscountCustomFields> =
            discountCustomFields.getOptional("discount_custom_fields")

        /**
         * ID of the discount applied to this line item.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun discountId(): Optional<String> = discountId.getOptional("discount_id")

        /**
         * The line item's end date (exclusive).
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun endingBefore(): Optional<OffsetDateTime> = endingBefore.getOptional("ending_before")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun groupKey(): Optional<String> = groupKey.getOptional("group_key")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun groupValue(): Optional<String> = groupValue.getOptional("group_value")

        /**
         * Indicates whether the line item is prorated for `SUBSCRIPTION` type product.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun isProrated(): Optional<Boolean> = isProrated.getOptional("is_prorated")

        /**
         * Only present for contract invoices and when the `include_list_prices` query parameter is
         * set to true. This will include the list rate for the charge if applicable. Only present
         * for usage and subscription line items.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun listPrice(): Optional<Rate> = listPrice.getOptional("list_price")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun metadata(): Optional<String> = metadata.getOptional("metadata")

        /**
         * The end date for the billing period on the invoice.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun netsuiteInvoiceBillingEnd(): Optional<OffsetDateTime> =
            netsuiteInvoiceBillingEnd.getOptional("netsuite_invoice_billing_end")

        /**
         * The start date for the billing period on the invoice.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun netsuiteInvoiceBillingStart(): Optional<OffsetDateTime> =
            netsuiteInvoiceBillingStart.getOptional("netsuite_invoice_billing_start")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun netsuiteItemId(): Optional<String> = netsuiteItemId.getOptional("netsuite_item_id")

        /**
         * Present on line items from invoices with type USAGE_CONSOLIDATED. Indicates the original
         * customer, contract, invoice and line item from which this line item was copied.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun origin(): Optional<Origin> = origin.getOptional("origin")

        /**
         * Only present for line items paying for a postpaid commit true-up.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun postpaidCommit(): Optional<PostpaidCommit> =
            postpaidCommit.getOptional("postpaid_commit")

        /**
         * Includes the presentation group values associated with this line item if presentation
         * group keys are used.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun presentationGroupValues(): Optional<PresentationGroupValues> =
            presentationGroupValues.getOptional("presentation_group_values")

        /**
         * Includes the pricing group values associated with this line item if dimensional pricing
         * is used.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun pricingGroupValues(): Optional<PricingGroupValues> =
            pricingGroupValues.getOptional("pricing_group_values")

        /**
         * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun productCustomFields(): Optional<ProductCustomFields> =
            productCustomFields.getOptional("product_custom_fields")

        /**
         * ID of the product associated with the line item.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun productId(): Optional<String> = productId.getOptional("product_id")

        /**
         * The current product tags associated with the line item's `product_id`.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun productTags(): Optional<List<String>> = productTags.getOptional("product_tags")

        /**
         * The type of the line item's product. Possible values are `FixedProductListItem` (for
         * `FIXED` type products), `UsageProductListItem` (for `USAGE` type products),
         * `SubscriptionProductListItem` (for `SUBSCRIPTION` type products) or
         * `CompositeProductListItem` (for `COMPOSITE` type products). For scheduled charges, commit
         * and credit payments, the value is `FixedProductListItem`.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun productType(): Optional<String> = productType.getOptional("product_type")

        /**
         * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun professionalServiceCustomFields(): Optional<ProfessionalServiceCustomFields> =
            professionalServiceCustomFields.getOptional("professional_service_custom_fields")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun professionalServiceId(): Optional<String> =
            professionalServiceId.getOptional("professional_service_id")

        /**
         * The quantity associated with the line item.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun quantity(): Optional<Double> = quantity.getOptional("quantity")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun resellerType(): Optional<ResellerType> = resellerType.getOptional("reseller_type")

        /**
         * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun scheduledChargeCustomFields(): Optional<ScheduledChargeCustomFields> =
            scheduledChargeCustomFields.getOptional("scheduled_charge_custom_fields")

        /**
         * ID of scheduled charge.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun scheduledChargeId(): Optional<String> =
            scheduledChargeId.getOptional("scheduled_charge_id")

        /**
         * The line item's start date (inclusive).
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun startingAt(): Optional<OffsetDateTime> = startingAt.getOptional("starting_at")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun subLineItems(): Optional<List<SubLineItem>> = subLineItems.getOptional("sub_line_items")

        /**
         * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun subscriptionCustomFields(): Optional<SubscriptionCustomFields> =
            subscriptionCustomFields.getOptional("subscription_custom_fields")

        /**
         * ID of the subscription that this line item is associated with. Only present on line items
         * with product of `SUBSCRIPTION` type.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun subscriptionId(): Optional<String> = subscriptionId.getOptional("subscription_id")

        /**
         * Populated if the line item has a tiered price.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun tier(): Optional<Tier> = tier.getOptional("tier")

        /**
         * The unit price associated with the line item.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun unitPrice(): Optional<Double> = unitPrice.getOptional("unit_price")

        /**
         * Returns the raw JSON value of [creditType].
         *
         * Unlike [creditType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("credit_type")
        @ExcludeMissing
        fun _creditType(): JsonField<CreditTypeData> = creditType

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [total].
         *
         * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Double> = total

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

        /**
         * Returns the raw JSON value of [appliedCommitOrCredit].
         *
         * Unlike [appliedCommitOrCredit], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("applied_commit_or_credit")
        @ExcludeMissing
        fun _appliedCommitOrCredit(): JsonField<AppliedCommitOrCredit> = appliedCommitOrCredit

        /**
         * Returns the raw JSON value of [commitCustomFields].
         *
         * Unlike [commitCustomFields], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("commit_custom_fields")
        @ExcludeMissing
        fun _commitCustomFields(): JsonField<CommitCustomFields> = commitCustomFields

        /**
         * Returns the raw JSON value of [commitId].
         *
         * Unlike [commitId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("commit_id") @ExcludeMissing fun _commitId(): JsonField<String> = commitId

        /**
         * Returns the raw JSON value of [commitNetsuiteItemId].
         *
         * Unlike [commitNetsuiteItemId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("commit_netsuite_item_id")
        @ExcludeMissing
        fun _commitNetsuiteItemId(): JsonField<String> = commitNetsuiteItemId

        /**
         * Returns the raw JSON value of [commitNetsuiteSalesOrderId].
         *
         * Unlike [commitNetsuiteSalesOrderId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("commit_netsuite_sales_order_id")
        @ExcludeMissing
        fun _commitNetsuiteSalesOrderId(): JsonField<String> = commitNetsuiteSalesOrderId

        /**
         * Returns the raw JSON value of [commitSegmentId].
         *
         * Unlike [commitSegmentId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("commit_segment_id")
        @ExcludeMissing
        fun _commitSegmentId(): JsonField<String> = commitSegmentId

        /**
         * Returns the raw JSON value of [commitType].
         *
         * Unlike [commitType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("commit_type")
        @ExcludeMissing
        fun _commitType(): JsonField<String> = commitType

        /**
         * Returns the raw JSON value of [customFields].
         *
         * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

        /**
         * Returns the raw JSON value of [discountCustomFields].
         *
         * Unlike [discountCustomFields], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("discount_custom_fields")
        @ExcludeMissing
        fun _discountCustomFields(): JsonField<DiscountCustomFields> = discountCustomFields

        /**
         * Returns the raw JSON value of [discountId].
         *
         * Unlike [discountId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("discount_id")
        @ExcludeMissing
        fun _discountId(): JsonField<String> = discountId

        /**
         * Returns the raw JSON value of [endingBefore].
         *
         * Unlike [endingBefore], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ending_before")
        @ExcludeMissing
        fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

        /**
         * Returns the raw JSON value of [groupKey].
         *
         * Unlike [groupKey], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("group_key") @ExcludeMissing fun _groupKey(): JsonField<String> = groupKey

        /**
         * Returns the raw JSON value of [groupValue].
         *
         * Unlike [groupValue], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("group_value")
        @ExcludeMissing
        fun _groupValue(): JsonField<String> = groupValue

        /**
         * Returns the raw JSON value of [isProrated].
         *
         * Unlike [isProrated], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("is_prorated")
        @ExcludeMissing
        fun _isProrated(): JsonField<Boolean> = isProrated

        /**
         * Returns the raw JSON value of [listPrice].
         *
         * Unlike [listPrice], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("list_price") @ExcludeMissing fun _listPrice(): JsonField<Rate> = listPrice

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<String> = metadata

        /**
         * Returns the raw JSON value of [netsuiteInvoiceBillingEnd].
         *
         * Unlike [netsuiteInvoiceBillingEnd], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("netsuite_invoice_billing_end")
        @ExcludeMissing
        fun _netsuiteInvoiceBillingEnd(): JsonField<OffsetDateTime> = netsuiteInvoiceBillingEnd

        /**
         * Returns the raw JSON value of [netsuiteInvoiceBillingStart].
         *
         * Unlike [netsuiteInvoiceBillingStart], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("netsuite_invoice_billing_start")
        @ExcludeMissing
        fun _netsuiteInvoiceBillingStart(): JsonField<OffsetDateTime> = netsuiteInvoiceBillingStart

        /**
         * Returns the raw JSON value of [netsuiteItemId].
         *
         * Unlike [netsuiteItemId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("netsuite_item_id")
        @ExcludeMissing
        fun _netsuiteItemId(): JsonField<String> = netsuiteItemId

        /**
         * Returns the raw JSON value of [origin].
         *
         * Unlike [origin], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("origin") @ExcludeMissing fun _origin(): JsonField<Origin> = origin

        /**
         * Returns the raw JSON value of [postpaidCommit].
         *
         * Unlike [postpaidCommit], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("postpaid_commit")
        @ExcludeMissing
        fun _postpaidCommit(): JsonField<PostpaidCommit> = postpaidCommit

        /**
         * Returns the raw JSON value of [presentationGroupValues].
         *
         * Unlike [presentationGroupValues], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("presentation_group_values")
        @ExcludeMissing
        fun _presentationGroupValues(): JsonField<PresentationGroupValues> = presentationGroupValues

        /**
         * Returns the raw JSON value of [pricingGroupValues].
         *
         * Unlike [pricingGroupValues], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("pricing_group_values")
        @ExcludeMissing
        fun _pricingGroupValues(): JsonField<PricingGroupValues> = pricingGroupValues

        /**
         * Returns the raw JSON value of [productCustomFields].
         *
         * Unlike [productCustomFields], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("product_custom_fields")
        @ExcludeMissing
        fun _productCustomFields(): JsonField<ProductCustomFields> = productCustomFields

        /**
         * Returns the raw JSON value of [productId].
         *
         * Unlike [productId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

        /**
         * Returns the raw JSON value of [productTags].
         *
         * Unlike [productTags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("product_tags")
        @ExcludeMissing
        fun _productTags(): JsonField<List<String>> = productTags

        /**
         * Returns the raw JSON value of [productType].
         *
         * Unlike [productType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("product_type")
        @ExcludeMissing
        fun _productType(): JsonField<String> = productType

        /**
         * Returns the raw JSON value of [professionalServiceCustomFields].
         *
         * Unlike [professionalServiceCustomFields], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("professional_service_custom_fields")
        @ExcludeMissing
        fun _professionalServiceCustomFields(): JsonField<ProfessionalServiceCustomFields> =
            professionalServiceCustomFields

        /**
         * Returns the raw JSON value of [professionalServiceId].
         *
         * Unlike [professionalServiceId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("professional_service_id")
        @ExcludeMissing
        fun _professionalServiceId(): JsonField<String> = professionalServiceId

        /**
         * Returns the raw JSON value of [quantity].
         *
         * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

        /**
         * Returns the raw JSON value of [resellerType].
         *
         * Unlike [resellerType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("reseller_type")
        @ExcludeMissing
        fun _resellerType(): JsonField<ResellerType> = resellerType

        /**
         * Returns the raw JSON value of [scheduledChargeCustomFields].
         *
         * Unlike [scheduledChargeCustomFields], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("scheduled_charge_custom_fields")
        @ExcludeMissing
        fun _scheduledChargeCustomFields(): JsonField<ScheduledChargeCustomFields> =
            scheduledChargeCustomFields

        /**
         * Returns the raw JSON value of [scheduledChargeId].
         *
         * Unlike [scheduledChargeId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("scheduled_charge_id")
        @ExcludeMissing
        fun _scheduledChargeId(): JsonField<String> = scheduledChargeId

        /**
         * Returns the raw JSON value of [startingAt].
         *
         * Unlike [startingAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("starting_at")
        @ExcludeMissing
        fun _startingAt(): JsonField<OffsetDateTime> = startingAt

        /**
         * Returns the raw JSON value of [subLineItems].
         *
         * Unlike [subLineItems], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("sub_line_items")
        @ExcludeMissing
        fun _subLineItems(): JsonField<List<SubLineItem>> = subLineItems

        /**
         * Returns the raw JSON value of [subscriptionCustomFields].
         *
         * Unlike [subscriptionCustomFields], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("subscription_custom_fields")
        @ExcludeMissing
        fun _subscriptionCustomFields(): JsonField<SubscriptionCustomFields> =
            subscriptionCustomFields

        /**
         * Returns the raw JSON value of [subscriptionId].
         *
         * Unlike [subscriptionId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("subscription_id")
        @ExcludeMissing
        fun _subscriptionId(): JsonField<String> = subscriptionId

        /**
         * Returns the raw JSON value of [tier].
         *
         * Unlike [tier], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tier") @ExcludeMissing fun _tier(): JsonField<Tier> = tier

        /**
         * Returns the raw JSON value of [unitPrice].
         *
         * Unlike [unitPrice], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("unit_price") @ExcludeMissing fun _unitPrice(): JsonField<Double> = unitPrice

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [LineItem].
             *
             * The following fields are required:
             * ```java
             * .creditType()
             * .name()
             * .total()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [LineItem]. */
        class Builder internal constructor() {

            private var creditType: JsonField<CreditTypeData>? = null
            private var name: JsonField<String>? = null
            private var total: JsonField<Double>? = null
            private var type: JsonField<String>? = null
            private var appliedCommitOrCredit: JsonField<AppliedCommitOrCredit> = JsonMissing.of()
            private var commitCustomFields: JsonField<CommitCustomFields> = JsonMissing.of()
            private var commitId: JsonField<String> = JsonMissing.of()
            private var commitNetsuiteItemId: JsonField<String> = JsonMissing.of()
            private var commitNetsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
            private var commitSegmentId: JsonField<String> = JsonMissing.of()
            private var commitType: JsonField<String> = JsonMissing.of()
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var discountCustomFields: JsonField<DiscountCustomFields> = JsonMissing.of()
            private var discountId: JsonField<String> = JsonMissing.of()
            private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var groupKey: JsonField<String> = JsonMissing.of()
            private var groupValue: JsonField<String> = JsonMissing.of()
            private var isProrated: JsonField<Boolean> = JsonMissing.of()
            private var listPrice: JsonField<Rate> = JsonMissing.of()
            private var metadata: JsonField<String> = JsonMissing.of()
            private var netsuiteInvoiceBillingEnd: JsonField<OffsetDateTime> = JsonMissing.of()
            private var netsuiteInvoiceBillingStart: JsonField<OffsetDateTime> = JsonMissing.of()
            private var netsuiteItemId: JsonField<String> = JsonMissing.of()
            private var origin: JsonField<Origin> = JsonMissing.of()
            private var postpaidCommit: JsonField<PostpaidCommit> = JsonMissing.of()
            private var presentationGroupValues: JsonField<PresentationGroupValues> =
                JsonMissing.of()
            private var pricingGroupValues: JsonField<PricingGroupValues> = JsonMissing.of()
            private var productCustomFields: JsonField<ProductCustomFields> = JsonMissing.of()
            private var productId: JsonField<String> = JsonMissing.of()
            private var productTags: JsonField<MutableList<String>>? = null
            private var productType: JsonField<String> = JsonMissing.of()
            private var professionalServiceCustomFields:
                JsonField<ProfessionalServiceCustomFields> =
                JsonMissing.of()
            private var professionalServiceId: JsonField<String> = JsonMissing.of()
            private var quantity: JsonField<Double> = JsonMissing.of()
            private var resellerType: JsonField<ResellerType> = JsonMissing.of()
            private var scheduledChargeCustomFields: JsonField<ScheduledChargeCustomFields> =
                JsonMissing.of()
            private var scheduledChargeId: JsonField<String> = JsonMissing.of()
            private var startingAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var subLineItems: JsonField<MutableList<SubLineItem>>? = null
            private var subscriptionCustomFields: JsonField<SubscriptionCustomFields> =
                JsonMissing.of()
            private var subscriptionId: JsonField<String> = JsonMissing.of()
            private var tier: JsonField<Tier> = JsonMissing.of()
            private var unitPrice: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(lineItem: LineItem) = apply {
                creditType = lineItem.creditType
                name = lineItem.name
                total = lineItem.total
                type = lineItem.type
                appliedCommitOrCredit = lineItem.appliedCommitOrCredit
                commitCustomFields = lineItem.commitCustomFields
                commitId = lineItem.commitId
                commitNetsuiteItemId = lineItem.commitNetsuiteItemId
                commitNetsuiteSalesOrderId = lineItem.commitNetsuiteSalesOrderId
                commitSegmentId = lineItem.commitSegmentId
                commitType = lineItem.commitType
                customFields = lineItem.customFields
                discountCustomFields = lineItem.discountCustomFields
                discountId = lineItem.discountId
                endingBefore = lineItem.endingBefore
                groupKey = lineItem.groupKey
                groupValue = lineItem.groupValue
                isProrated = lineItem.isProrated
                listPrice = lineItem.listPrice
                metadata = lineItem.metadata
                netsuiteInvoiceBillingEnd = lineItem.netsuiteInvoiceBillingEnd
                netsuiteInvoiceBillingStart = lineItem.netsuiteInvoiceBillingStart
                netsuiteItemId = lineItem.netsuiteItemId
                origin = lineItem.origin
                postpaidCommit = lineItem.postpaidCommit
                presentationGroupValues = lineItem.presentationGroupValues
                pricingGroupValues = lineItem.pricingGroupValues
                productCustomFields = lineItem.productCustomFields
                productId = lineItem.productId
                productTags = lineItem.productTags.map { it.toMutableList() }
                productType = lineItem.productType
                professionalServiceCustomFields = lineItem.professionalServiceCustomFields
                professionalServiceId = lineItem.professionalServiceId
                quantity = lineItem.quantity
                resellerType = lineItem.resellerType
                scheduledChargeCustomFields = lineItem.scheduledChargeCustomFields
                scheduledChargeId = lineItem.scheduledChargeId
                startingAt = lineItem.startingAt
                subLineItems = lineItem.subLineItems.map { it.toMutableList() }
                subscriptionCustomFields = lineItem.subscriptionCustomFields
                subscriptionId = lineItem.subscriptionId
                tier = lineItem.tier
                unitPrice = lineItem.unitPrice
                additionalProperties = lineItem.additionalProperties.toMutableMap()
            }

            fun creditType(creditType: CreditTypeData) = creditType(JsonField.of(creditType))

            /**
             * Sets [Builder.creditType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditType] with a well-typed [CreditTypeData] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creditType(creditType: JsonField<CreditTypeData>) = apply {
                this.creditType = creditType
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun total(total: Double) = total(JsonField.of(total))

            /**
             * Sets [Builder.total] to an arbitrary JSON value.
             *
             * You should usually call [Builder.total] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun total(total: JsonField<Double>) = apply { this.total = total }

            /**
             * The type of line item.
             * - `scheduled`: Line item is associated with a scheduled charge. View the
             *   scheduled_charge_id on the line item.
             * - `commit_purchase`: Line item is associated with a payment for a prepaid commit.
             *   View the commit_id on the line item.
             * - `usage`: Line item is associated with a usage product or composite product. View
             *   the product_id on the line item to determine which product.
             * - `subscription`: Line item is associated with a subscription. e.g. monthly recurring
             *   payment for an in-advance subscription.
             * - `applied_commit_or_credit`: On metronome invoices, applied commits and credits are
             *   associated with their own line items. These line items have negative totals. Use
             *   the applied_commit_or_credit object on the line item to understand the id of the
             *   applied commit or credit, and its type. Note that the application of a postpaid
             *   commit is associated with a line item, but the total on the line item is not
             *   included in the invoice's total as postpaid commits are paid in-arrears.
             * - `cpu_conversion`: Line item converting between a custom pricing unit and fiat
             *   currency, using the conversion rate set on the rate card. This line item will
             *   appear when there are products priced in custom pricing units, and there is
             *   insufficient prepaid commit/credit in that custom pricing unit to fully cover the
             *   spend. Then, the outstanding spend in custom pricing units will be converted to
             *   fiat currency using a cpu_conversion line item.
             */
            fun type(type: String) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<String>) = apply { this.type = type }

            /**
             * Details about the credit or commit that was applied to this line item. Only present
             * on line items with product of `USAGE`, `SUBSCRIPTION` or `COMPOSITE` types.
             */
            fun appliedCommitOrCredit(appliedCommitOrCredit: AppliedCommitOrCredit) =
                appliedCommitOrCredit(JsonField.of(appliedCommitOrCredit))

            /**
             * Sets [Builder.appliedCommitOrCredit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.appliedCommitOrCredit] with a well-typed
             * [AppliedCommitOrCredit] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun appliedCommitOrCredit(appliedCommitOrCredit: JsonField<AppliedCommitOrCredit>) =
                apply {
                    this.appliedCommitOrCredit = appliedCommitOrCredit
                }

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun commitCustomFields(commitCustomFields: CommitCustomFields) =
                commitCustomFields(JsonField.of(commitCustomFields))

            /**
             * Sets [Builder.commitCustomFields] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commitCustomFields] with a well-typed
             * [CommitCustomFields] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun commitCustomFields(commitCustomFields: JsonField<CommitCustomFields>) = apply {
                this.commitCustomFields = commitCustomFields
            }

            /**
             * For line items with product of `USAGE`, `SUBSCRIPTION`, or `COMPOSITE` types, the ID
             * of the credit or commit that was applied to this line item. For line items with
             * product type of `FIXED`, the ID of the prepaid or postpaid commit that is being paid
             * for.
             */
            fun commitId(commitId: String) = commitId(JsonField.of(commitId))

            /**
             * Sets [Builder.commitId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commitId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun commitId(commitId: JsonField<String>) = apply { this.commitId = commitId }

            fun commitNetsuiteItemId(commitNetsuiteItemId: String) =
                commitNetsuiteItemId(JsonField.of(commitNetsuiteItemId))

            /**
             * Sets [Builder.commitNetsuiteItemId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commitNetsuiteItemId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun commitNetsuiteItemId(commitNetsuiteItemId: JsonField<String>) = apply {
                this.commitNetsuiteItemId = commitNetsuiteItemId
            }

            fun commitNetsuiteSalesOrderId(commitNetsuiteSalesOrderId: String) =
                commitNetsuiteSalesOrderId(JsonField.of(commitNetsuiteSalesOrderId))

            /**
             * Sets [Builder.commitNetsuiteSalesOrderId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commitNetsuiteSalesOrderId] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun commitNetsuiteSalesOrderId(commitNetsuiteSalesOrderId: JsonField<String>) = apply {
                this.commitNetsuiteSalesOrderId = commitNetsuiteSalesOrderId
            }

            fun commitSegmentId(commitSegmentId: String) =
                commitSegmentId(JsonField.of(commitSegmentId))

            /**
             * Sets [Builder.commitSegmentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commitSegmentId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun commitSegmentId(commitSegmentId: JsonField<String>) = apply {
                this.commitSegmentId = commitSegmentId
            }

            /**
             * `PrepaidCommit` (for commit types `PREPAID` and `CREDIT`) or `PostpaidCommit` (for
             * commit type `POSTPAID`).
             */
            fun commitType(commitType: String) = commitType(JsonField.of(commitType))

            /**
             * Sets [Builder.commitType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.commitType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun commitType(commitType: JsonField<String>) = apply { this.commitType = commitType }

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

            /**
             * Sets [Builder.customFields] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customFields] with a well-typed [CustomFields] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customFields(customFields: JsonField<CustomFields>) = apply {
                this.customFields = customFields
            }

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun discountCustomFields(discountCustomFields: DiscountCustomFields) =
                discountCustomFields(JsonField.of(discountCustomFields))

            /**
             * Sets [Builder.discountCustomFields] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discountCustomFields] with a well-typed
             * [DiscountCustomFields] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun discountCustomFields(discountCustomFields: JsonField<DiscountCustomFields>) =
                apply {
                    this.discountCustomFields = discountCustomFields
                }

            /** ID of the discount applied to this line item. */
            fun discountId(discountId: String) = discountId(JsonField.of(discountId))

            /**
             * Sets [Builder.discountId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.discountId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun discountId(discountId: JsonField<String>) = apply { this.discountId = discountId }

            /** The line item's end date (exclusive). */
            fun endingBefore(endingBefore: OffsetDateTime) =
                endingBefore(JsonField.of(endingBefore))

            /**
             * Sets [Builder.endingBefore] to an arbitrary JSON value.
             *
             * You should usually call [Builder.endingBefore] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                this.endingBefore = endingBefore
            }

            fun groupKey(groupKey: String) = groupKey(JsonField.of(groupKey))

            /**
             * Sets [Builder.groupKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groupKey] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun groupKey(groupKey: JsonField<String>) = apply { this.groupKey = groupKey }

            fun groupValue(groupValue: String?) = groupValue(JsonField.ofNullable(groupValue))

            /** Alias for calling [Builder.groupValue] with `groupValue.orElse(null)`. */
            fun groupValue(groupValue: Optional<String>) = groupValue(groupValue.getOrNull())

            /**
             * Sets [Builder.groupValue] to an arbitrary JSON value.
             *
             * You should usually call [Builder.groupValue] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun groupValue(groupValue: JsonField<String>) = apply { this.groupValue = groupValue }

            /** Indicates whether the line item is prorated for `SUBSCRIPTION` type product. */
            fun isProrated(isProrated: Boolean) = isProrated(JsonField.of(isProrated))

            /**
             * Sets [Builder.isProrated] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isProrated] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isProrated(isProrated: JsonField<Boolean>) = apply { this.isProrated = isProrated }

            /**
             * Only present for contract invoices and when the `include_list_prices` query parameter
             * is set to true. This will include the list rate for the charge if applicable. Only
             * present for usage and subscription line items.
             */
            fun listPrice(listPrice: Rate) = listPrice(JsonField.of(listPrice))

            /**
             * Sets [Builder.listPrice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.listPrice] with a well-typed [Rate] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun listPrice(listPrice: JsonField<Rate>) = apply { this.listPrice = listPrice }

            fun metadata(metadata: String) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<String>) = apply { this.metadata = metadata }

            /** The end date for the billing period on the invoice. */
            fun netsuiteInvoiceBillingEnd(netsuiteInvoiceBillingEnd: OffsetDateTime) =
                netsuiteInvoiceBillingEnd(JsonField.of(netsuiteInvoiceBillingEnd))

            /**
             * Sets [Builder.netsuiteInvoiceBillingEnd] to an arbitrary JSON value.
             *
             * You should usually call [Builder.netsuiteInvoiceBillingEnd] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun netsuiteInvoiceBillingEnd(netsuiteInvoiceBillingEnd: JsonField<OffsetDateTime>) =
                apply {
                    this.netsuiteInvoiceBillingEnd = netsuiteInvoiceBillingEnd
                }

            /** The start date for the billing period on the invoice. */
            fun netsuiteInvoiceBillingStart(netsuiteInvoiceBillingStart: OffsetDateTime) =
                netsuiteInvoiceBillingStart(JsonField.of(netsuiteInvoiceBillingStart))

            /**
             * Sets [Builder.netsuiteInvoiceBillingStart] to an arbitrary JSON value.
             *
             * You should usually call [Builder.netsuiteInvoiceBillingStart] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun netsuiteInvoiceBillingStart(
                netsuiteInvoiceBillingStart: JsonField<OffsetDateTime>
            ) = apply { this.netsuiteInvoiceBillingStart = netsuiteInvoiceBillingStart }

            fun netsuiteItemId(netsuiteItemId: String) =
                netsuiteItemId(JsonField.of(netsuiteItemId))

            /**
             * Sets [Builder.netsuiteItemId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.netsuiteItemId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun netsuiteItemId(netsuiteItemId: JsonField<String>) = apply {
                this.netsuiteItemId = netsuiteItemId
            }

            /**
             * Present on line items from invoices with type USAGE_CONSOLIDATED. Indicates the
             * original customer, contract, invoice and line item from which this line item was
             * copied.
             */
            fun origin(origin: Origin) = origin(JsonField.of(origin))

            /**
             * Sets [Builder.origin] to an arbitrary JSON value.
             *
             * You should usually call [Builder.origin] with a well-typed [Origin] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun origin(origin: JsonField<Origin>) = apply { this.origin = origin }

            /** Only present for line items paying for a postpaid commit true-up. */
            fun postpaidCommit(postpaidCommit: PostpaidCommit) =
                postpaidCommit(JsonField.of(postpaidCommit))

            /**
             * Sets [Builder.postpaidCommit] to an arbitrary JSON value.
             *
             * You should usually call [Builder.postpaidCommit] with a well-typed [PostpaidCommit]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun postpaidCommit(postpaidCommit: JsonField<PostpaidCommit>) = apply {
                this.postpaidCommit = postpaidCommit
            }

            /**
             * Includes the presentation group values associated with this line item if presentation
             * group keys are used.
             */
            fun presentationGroupValues(presentationGroupValues: PresentationGroupValues) =
                presentationGroupValues(JsonField.of(presentationGroupValues))

            /**
             * Sets [Builder.presentationGroupValues] to an arbitrary JSON value.
             *
             * You should usually call [Builder.presentationGroupValues] with a well-typed
             * [PresentationGroupValues] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun presentationGroupValues(
                presentationGroupValues: JsonField<PresentationGroupValues>
            ) = apply { this.presentationGroupValues = presentationGroupValues }

            /**
             * Includes the pricing group values associated with this line item if dimensional
             * pricing is used.
             */
            fun pricingGroupValues(pricingGroupValues: PricingGroupValues) =
                pricingGroupValues(JsonField.of(pricingGroupValues))

            /**
             * Sets [Builder.pricingGroupValues] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pricingGroupValues] with a well-typed
             * [PricingGroupValues] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun pricingGroupValues(pricingGroupValues: JsonField<PricingGroupValues>) = apply {
                this.pricingGroupValues = pricingGroupValues
            }

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun productCustomFields(productCustomFields: ProductCustomFields) =
                productCustomFields(JsonField.of(productCustomFields))

            /**
             * Sets [Builder.productCustomFields] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productCustomFields] with a well-typed
             * [ProductCustomFields] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun productCustomFields(productCustomFields: JsonField<ProductCustomFields>) = apply {
                this.productCustomFields = productCustomFields
            }

            /** ID of the product associated with the line item. */
            fun productId(productId: String) = productId(JsonField.of(productId))

            /**
             * Sets [Builder.productId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            /** The current product tags associated with the line item's `product_id`. */
            fun productTags(productTags: List<String>) = productTags(JsonField.of(productTags))

            /**
             * Sets [Builder.productTags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productTags] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productTags(productTags: JsonField<List<String>>) = apply {
                this.productTags = productTags.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [productTags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addProductTag(productTag: String) = apply {
                productTags =
                    (productTags ?: JsonField.of(mutableListOf())).also {
                        checkKnown("productTags", it).add(productTag)
                    }
            }

            /**
             * The type of the line item's product. Possible values are `FixedProductListItem` (for
             * `FIXED` type products), `UsageProductListItem` (for `USAGE` type products),
             * `SubscriptionProductListItem` (for `SUBSCRIPTION` type products) or
             * `CompositeProductListItem` (for `COMPOSITE` type products). For scheduled charges,
             * commit and credit payments, the value is `FixedProductListItem`.
             */
            fun productType(productType: String) = productType(JsonField.of(productType))

            /**
             * Sets [Builder.productType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productType(productType: JsonField<String>) = apply {
                this.productType = productType
            }

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun professionalServiceCustomFields(
                professionalServiceCustomFields: ProfessionalServiceCustomFields
            ) = professionalServiceCustomFields(JsonField.of(professionalServiceCustomFields))

            /**
             * Sets [Builder.professionalServiceCustomFields] to an arbitrary JSON value.
             *
             * You should usually call [Builder.professionalServiceCustomFields] with a well-typed
             * [ProfessionalServiceCustomFields] value instead. This method is primarily for setting
             * the field to an undocumented or not yet supported value.
             */
            fun professionalServiceCustomFields(
                professionalServiceCustomFields: JsonField<ProfessionalServiceCustomFields>
            ) = apply { this.professionalServiceCustomFields = professionalServiceCustomFields }

            fun professionalServiceId(professionalServiceId: String) =
                professionalServiceId(JsonField.of(professionalServiceId))

            /**
             * Sets [Builder.professionalServiceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.professionalServiceId] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun professionalServiceId(professionalServiceId: JsonField<String>) = apply {
                this.professionalServiceId = professionalServiceId
            }

            /** The quantity associated with the line item. */
            fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

            /**
             * Sets [Builder.quantity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.quantity] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

            fun resellerType(resellerType: ResellerType) = resellerType(JsonField.of(resellerType))

            /**
             * Sets [Builder.resellerType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resellerType] with a well-typed [ResellerType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun resellerType(resellerType: JsonField<ResellerType>) = apply {
                this.resellerType = resellerType
            }

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun scheduledChargeCustomFields(
                scheduledChargeCustomFields: ScheduledChargeCustomFields
            ) = scheduledChargeCustomFields(JsonField.of(scheduledChargeCustomFields))

            /**
             * Sets [Builder.scheduledChargeCustomFields] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scheduledChargeCustomFields] with a well-typed
             * [ScheduledChargeCustomFields] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun scheduledChargeCustomFields(
                scheduledChargeCustomFields: JsonField<ScheduledChargeCustomFields>
            ) = apply { this.scheduledChargeCustomFields = scheduledChargeCustomFields }

            /** ID of scheduled charge. */
            fun scheduledChargeId(scheduledChargeId: String) =
                scheduledChargeId(JsonField.of(scheduledChargeId))

            /**
             * Sets [Builder.scheduledChargeId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.scheduledChargeId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun scheduledChargeId(scheduledChargeId: JsonField<String>) = apply {
                this.scheduledChargeId = scheduledChargeId
            }

            /** The line item's start date (inclusive). */
            fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

            /**
             * Sets [Builder.startingAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startingAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                this.startingAt = startingAt
            }

            fun subLineItems(subLineItems: List<SubLineItem>) =
                subLineItems(JsonField.of(subLineItems))

            /**
             * Sets [Builder.subLineItems] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subLineItems] with a well-typed `List<SubLineItem>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun subLineItems(subLineItems: JsonField<List<SubLineItem>>) = apply {
                this.subLineItems = subLineItems.map { it.toMutableList() }
            }

            /**
             * Adds a single [SubLineItem] to [subLineItems].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addSubLineItem(subLineItem: SubLineItem) = apply {
                subLineItems =
                    (subLineItems ?: JsonField.of(mutableListOf())).also {
                        checkKnown("subLineItems", it).add(subLineItem)
                    }
            }

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun subscriptionCustomFields(subscriptionCustomFields: SubscriptionCustomFields) =
                subscriptionCustomFields(JsonField.of(subscriptionCustomFields))

            /**
             * Sets [Builder.subscriptionCustomFields] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriptionCustomFields] with a well-typed
             * [SubscriptionCustomFields] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun subscriptionCustomFields(
                subscriptionCustomFields: JsonField<SubscriptionCustomFields>
            ) = apply { this.subscriptionCustomFields = subscriptionCustomFields }

            /**
             * ID of the subscription that this line item is associated with. Only present on line
             * items with product of `SUBSCRIPTION` type.
             */
            fun subscriptionId(subscriptionId: String) =
                subscriptionId(JsonField.of(subscriptionId))

            /**
             * Sets [Builder.subscriptionId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.subscriptionId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun subscriptionId(subscriptionId: JsonField<String>) = apply {
                this.subscriptionId = subscriptionId
            }

            /** Populated if the line item has a tiered price. */
            fun tier(tier: Tier) = tier(JsonField.of(tier))

            /**
             * Sets [Builder.tier] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tier] with a well-typed [Tier] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tier(tier: JsonField<Tier>) = apply { this.tier = tier }

            /** The unit price associated with the line item. */
            fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

            /**
             * Sets [Builder.unitPrice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.unitPrice] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun unitPrice(unitPrice: JsonField<Double>) = apply { this.unitPrice = unitPrice }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [LineItem].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .creditType()
             * .name()
             * .total()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): LineItem =
                LineItem(
                    checkRequired("creditType", creditType),
                    checkRequired("name", name),
                    checkRequired("total", total),
                    checkRequired("type", type),
                    appliedCommitOrCredit,
                    commitCustomFields,
                    commitId,
                    commitNetsuiteItemId,
                    commitNetsuiteSalesOrderId,
                    commitSegmentId,
                    commitType,
                    customFields,
                    discountCustomFields,
                    discountId,
                    endingBefore,
                    groupKey,
                    groupValue,
                    isProrated,
                    listPrice,
                    metadata,
                    netsuiteInvoiceBillingEnd,
                    netsuiteInvoiceBillingStart,
                    netsuiteItemId,
                    origin,
                    postpaidCommit,
                    presentationGroupValues,
                    pricingGroupValues,
                    productCustomFields,
                    productId,
                    (productTags ?: JsonMissing.of()).map { it.toImmutable() },
                    productType,
                    professionalServiceCustomFields,
                    professionalServiceId,
                    quantity,
                    resellerType,
                    scheduledChargeCustomFields,
                    scheduledChargeId,
                    startingAt,
                    (subLineItems ?: JsonMissing.of()).map { it.toImmutable() },
                    subscriptionCustomFields,
                    subscriptionId,
                    tier,
                    unitPrice,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): LineItem = apply {
            if (validated) {
                return@apply
            }

            creditType().validate()
            name()
            total()
            type()
            appliedCommitOrCredit().ifPresent { it.validate() }
            commitCustomFields().ifPresent { it.validate() }
            commitId()
            commitNetsuiteItemId()
            commitNetsuiteSalesOrderId()
            commitSegmentId()
            commitType()
            customFields().ifPresent { it.validate() }
            discountCustomFields().ifPresent { it.validate() }
            discountId()
            endingBefore()
            groupKey()
            groupValue()
            isProrated()
            listPrice().ifPresent { it.validate() }
            metadata()
            netsuiteInvoiceBillingEnd()
            netsuiteInvoiceBillingStart()
            netsuiteItemId()
            origin().ifPresent { it.validate() }
            postpaidCommit().ifPresent { it.validate() }
            presentationGroupValues().ifPresent { it.validate() }
            pricingGroupValues().ifPresent { it.validate() }
            productCustomFields().ifPresent { it.validate() }
            productId()
            productTags()
            productType()
            professionalServiceCustomFields().ifPresent { it.validate() }
            professionalServiceId()
            quantity()
            resellerType().ifPresent { it.validate() }
            scheduledChargeCustomFields().ifPresent { it.validate() }
            scheduledChargeId()
            startingAt()
            subLineItems().ifPresent { it.forEach { it.validate() } }
            subscriptionCustomFields().ifPresent { it.validate() }
            subscriptionId()
            tier().ifPresent { it.validate() }
            unitPrice()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (creditType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (total.asKnown().isPresent) 1 else 0) +
                (if (type.asKnown().isPresent) 1 else 0) +
                (appliedCommitOrCredit.asKnown().getOrNull()?.validity() ?: 0) +
                (commitCustomFields.asKnown().getOrNull()?.validity() ?: 0) +
                (if (commitId.asKnown().isPresent) 1 else 0) +
                (if (commitNetsuiteItemId.asKnown().isPresent) 1 else 0) +
                (if (commitNetsuiteSalesOrderId.asKnown().isPresent) 1 else 0) +
                (if (commitSegmentId.asKnown().isPresent) 1 else 0) +
                (if (commitType.asKnown().isPresent) 1 else 0) +
                (customFields.asKnown().getOrNull()?.validity() ?: 0) +
                (discountCustomFields.asKnown().getOrNull()?.validity() ?: 0) +
                (if (discountId.asKnown().isPresent) 1 else 0) +
                (if (endingBefore.asKnown().isPresent) 1 else 0) +
                (if (groupKey.asKnown().isPresent) 1 else 0) +
                (if (groupValue.asKnown().isPresent) 1 else 0) +
                (if (isProrated.asKnown().isPresent) 1 else 0) +
                (listPrice.asKnown().getOrNull()?.validity() ?: 0) +
                (if (metadata.asKnown().isPresent) 1 else 0) +
                (if (netsuiteInvoiceBillingEnd.asKnown().isPresent) 1 else 0) +
                (if (netsuiteInvoiceBillingStart.asKnown().isPresent) 1 else 0) +
                (if (netsuiteItemId.asKnown().isPresent) 1 else 0) +
                (origin.asKnown().getOrNull()?.validity() ?: 0) +
                (postpaidCommit.asKnown().getOrNull()?.validity() ?: 0) +
                (presentationGroupValues.asKnown().getOrNull()?.validity() ?: 0) +
                (pricingGroupValues.asKnown().getOrNull()?.validity() ?: 0) +
                (productCustomFields.asKnown().getOrNull()?.validity() ?: 0) +
                (if (productId.asKnown().isPresent) 1 else 0) +
                (productTags.asKnown().getOrNull()?.size ?: 0) +
                (if (productType.asKnown().isPresent) 1 else 0) +
                (professionalServiceCustomFields.asKnown().getOrNull()?.validity() ?: 0) +
                (if (professionalServiceId.asKnown().isPresent) 1 else 0) +
                (if (quantity.asKnown().isPresent) 1 else 0) +
                (resellerType.asKnown().getOrNull()?.validity() ?: 0) +
                (scheduledChargeCustomFields.asKnown().getOrNull()?.validity() ?: 0) +
                (if (scheduledChargeId.asKnown().isPresent) 1 else 0) +
                (if (startingAt.asKnown().isPresent) 1 else 0) +
                (subLineItems.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (subscriptionCustomFields.asKnown().getOrNull()?.validity() ?: 0) +
                (if (subscriptionId.asKnown().isPresent) 1 else 0) +
                (tier.asKnown().getOrNull()?.validity() ?: 0) +
                (if (unitPrice.asKnown().isPresent) 1 else 0)

        /**
         * Details about the credit or commit that was applied to this line item. Only present on
         * line items with product of `USAGE`, `SUBSCRIPTION` or `COMPOSITE` types.
         */
        class AppliedCommitOrCredit
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            ) : this(id, type, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [AppliedCommitOrCredit].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AppliedCommitOrCredit]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(appliedCommitOrCredit: AppliedCommitOrCredit) = apply {
                    id = appliedCommitOrCredit.id
                    type = appliedCommitOrCredit.type
                    additionalProperties = appliedCommitOrCredit.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [AppliedCommitOrCredit].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): AppliedCommitOrCredit =
                    AppliedCommitOrCredit(
                        checkRequired("id", id),
                        checkRequired("type", type),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): AppliedCommitOrCredit = apply {
                if (validated) {
                    return@apply
                }

                id()
                type().validate()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (id.asKnown().isPresent) 1 else 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0)

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val PREPAID = of("PREPAID")

                    @JvmField val POSTPAID = of("POSTPAID")

                    @JvmField val CREDIT = of("CREDIT")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    PREPAID,
                    POSTPAID,
                    CREDIT,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    PREPAID,
                    POSTPAID,
                    CREDIT,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        PREPAID -> Value.PREPAID
                        POSTPAID -> Value.POSTPAID
                        CREDIT -> Value.CREDIT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        PREPAID -> Known.PREPAID
                        POSTPAID -> Known.POSTPAID
                        CREDIT -> Known.CREDIT
                        else -> throw MetronomeInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        MetronomeInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Type = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AppliedCommitOrCredit &&
                    id == other.id &&
                    type == other.type &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(id, type, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AppliedCommitOrCredit{id=$id, type=$type, additionalProperties=$additionalProperties}"
        }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        class CommitCustomFields
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [CommitCustomFields].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CommitCustomFields]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(commitCustomFields: CommitCustomFields) = apply {
                    additionalProperties = commitCustomFields.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [CommitCustomFields].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CommitCustomFields =
                    CommitCustomFields(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): CommitCustomFields = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CommitCustomFields &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CommitCustomFields{additionalProperties=$additionalProperties}"
        }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        class CustomFields
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [CustomFields]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CustomFields]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(customFields: CustomFields) = apply {
                    additionalProperties = customFields.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [CustomFields].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): CustomFields = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CustomFields && additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
        }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        class DiscountCustomFields
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [DiscountCustomFields].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [DiscountCustomFields]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(discountCustomFields: DiscountCustomFields) = apply {
                    additionalProperties = discountCustomFields.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [DiscountCustomFields].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): DiscountCustomFields =
                    DiscountCustomFields(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): DiscountCustomFields = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DiscountCustomFields &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DiscountCustomFields{additionalProperties=$additionalProperties}"
        }

        /**
         * Present on line items from invoices with type USAGE_CONSOLIDATED. Indicates the original
         * customer, contract, invoice and line item from which this line item was copied.
         */
        class Origin
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val contractId: JsonField<String>,
            private val customerId: JsonField<String>,
            private val invoiceId: JsonField<String>,
            private val lineItemId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("contract_id")
                @ExcludeMissing
                contractId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("customer_id")
                @ExcludeMissing
                customerId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("invoice_id")
                @ExcludeMissing
                invoiceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line_item_id")
                @ExcludeMissing
                lineItemId: JsonField<String> = JsonMissing.of(),
            ) : this(contractId, customerId, invoiceId, lineItemId, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun contractId(): String = contractId.getRequired("contract_id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun customerId(): String = customerId.getRequired("customer_id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun invoiceId(): String = invoiceId.getRequired("invoice_id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun lineItemId(): String = lineItemId.getRequired("line_item_id")

            /**
             * Returns the raw JSON value of [contractId].
             *
             * Unlike [contractId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("contract_id")
            @ExcludeMissing
            fun _contractId(): JsonField<String> = contractId

            /**
             * Returns the raw JSON value of [customerId].
             *
             * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("customer_id")
            @ExcludeMissing
            fun _customerId(): JsonField<String> = customerId

            /**
             * Returns the raw JSON value of [invoiceId].
             *
             * Unlike [invoiceId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("invoice_id")
            @ExcludeMissing
            fun _invoiceId(): JsonField<String> = invoiceId

            /**
             * Returns the raw JSON value of [lineItemId].
             *
             * Unlike [lineItemId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("line_item_id")
            @ExcludeMissing
            fun _lineItemId(): JsonField<String> = lineItemId

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Origin].
                 *
                 * The following fields are required:
                 * ```java
                 * .contractId()
                 * .customerId()
                 * .invoiceId()
                 * .lineItemId()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Origin]. */
            class Builder internal constructor() {

                private var contractId: JsonField<String>? = null
                private var customerId: JsonField<String>? = null
                private var invoiceId: JsonField<String>? = null
                private var lineItemId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(origin: Origin) = apply {
                    contractId = origin.contractId
                    customerId = origin.customerId
                    invoiceId = origin.invoiceId
                    lineItemId = origin.lineItemId
                    additionalProperties = origin.additionalProperties.toMutableMap()
                }

                fun contractId(contractId: String) = contractId(JsonField.of(contractId))

                /**
                 * Sets [Builder.contractId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.contractId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun contractId(contractId: JsonField<String>) = apply {
                    this.contractId = contractId
                }

                fun customerId(customerId: String) = customerId(JsonField.of(customerId))

                /**
                 * Sets [Builder.customerId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.customerId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun customerId(customerId: JsonField<String>) = apply {
                    this.customerId = customerId
                }

                fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

                /**
                 * Sets [Builder.invoiceId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.invoiceId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

                fun lineItemId(lineItemId: String) = lineItemId(JsonField.of(lineItemId))

                /**
                 * Sets [Builder.lineItemId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.lineItemId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun lineItemId(lineItemId: JsonField<String>) = apply {
                    this.lineItemId = lineItemId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Origin].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .contractId()
                 * .customerId()
                 * .invoiceId()
                 * .lineItemId()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Origin =
                    Origin(
                        checkRequired("contractId", contractId),
                        checkRequired("customerId", customerId),
                        checkRequired("invoiceId", invoiceId),
                        checkRequired("lineItemId", lineItemId),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Origin = apply {
                if (validated) {
                    return@apply
                }

                contractId()
                customerId()
                invoiceId()
                lineItemId()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (contractId.asKnown().isPresent) 1 else 0) +
                    (if (customerId.asKnown().isPresent) 1 else 0) +
                    (if (invoiceId.asKnown().isPresent) 1 else 0) +
                    (if (lineItemId.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Origin &&
                    contractId == other.contractId &&
                    customerId == other.customerId &&
                    invoiceId == other.invoiceId &&
                    lineItemId == other.lineItemId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(contractId, customerId, invoiceId, lineItemId, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Origin{contractId=$contractId, customerId=$customerId, invoiceId=$invoiceId, lineItemId=$lineItemId, additionalProperties=$additionalProperties}"
        }

        /** Only present for line items paying for a postpaid commit true-up. */
        class PostpaidCommit
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val id: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of()
            ) : this(id, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun id(): String = id.getRequired("id")

            /**
             * Returns the raw JSON value of [id].
             *
             * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [PostpaidCommit].
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PostpaidCommit]. */
            class Builder internal constructor() {

                private var id: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(postpaidCommit: PostpaidCommit) = apply {
                    id = postpaidCommit.id
                    additionalProperties = postpaidCommit.additionalProperties.toMutableMap()
                }

                fun id(id: String) = id(JsonField.of(id))

                /**
                 * Sets [Builder.id] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.id] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [PostpaidCommit].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .id()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PostpaidCommit =
                    PostpaidCommit(checkRequired("id", id), additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): PostpaidCommit = apply {
                if (validated) {
                    return@apply
                }

                id()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = (if (id.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PostpaidCommit &&
                    id == other.id &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PostpaidCommit{id=$id, additionalProperties=$additionalProperties}"
        }

        /**
         * Includes the presentation group values associated with this line item if presentation
         * group keys are used.
         */
        class PresentationGroupValues
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [PresentationGroupValues].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PresentationGroupValues]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(presentationGroupValues: PresentationGroupValues) = apply {
                    additionalProperties =
                        presentationGroupValues.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [PresentationGroupValues].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): PresentationGroupValues =
                    PresentationGroupValues(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): PresentationGroupValues = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PresentationGroupValues &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PresentationGroupValues{additionalProperties=$additionalProperties}"
        }

        /**
         * Includes the pricing group values associated with this line item if dimensional pricing
         * is used.
         */
        class PricingGroupValues
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [PricingGroupValues].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PricingGroupValues]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(pricingGroupValues: PricingGroupValues) = apply {
                    additionalProperties = pricingGroupValues.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [PricingGroupValues].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): PricingGroupValues =
                    PricingGroupValues(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): PricingGroupValues = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PricingGroupValues &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PricingGroupValues{additionalProperties=$additionalProperties}"
        }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        class ProductCustomFields
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [ProductCustomFields].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ProductCustomFields]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(productCustomFields: ProductCustomFields) = apply {
                    additionalProperties = productCustomFields.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [ProductCustomFields].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ProductCustomFields =
                    ProductCustomFields(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): ProductCustomFields = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ProductCustomFields &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ProductCustomFields{additionalProperties=$additionalProperties}"
        }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        class ProfessionalServiceCustomFields
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [ProfessionalServiceCustomFields].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ProfessionalServiceCustomFields]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    professionalServiceCustomFields: ProfessionalServiceCustomFields
                ) = apply {
                    additionalProperties =
                        professionalServiceCustomFields.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [ProfessionalServiceCustomFields].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ProfessionalServiceCustomFields =
                    ProfessionalServiceCustomFields(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): ProfessionalServiceCustomFields = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ProfessionalServiceCustomFields &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ProfessionalServiceCustomFields{additionalProperties=$additionalProperties}"
        }

        class ResellerType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val AWS = of("AWS")

                @JvmField val AWS_PRO_SERVICE = of("AWS_PRO_SERVICE")

                @JvmField val GCP = of("GCP")

                @JvmField val GCP_PRO_SERVICE = of("GCP_PRO_SERVICE")

                @JvmStatic fun of(value: String) = ResellerType(JsonField.of(value))
            }

            /** An enum containing [ResellerType]'s known values. */
            enum class Known {
                AWS,
                AWS_PRO_SERVICE,
                GCP,
                GCP_PRO_SERVICE,
            }

            /**
             * An enum containing [ResellerType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ResellerType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AWS,
                AWS_PRO_SERVICE,
                GCP,
                GCP_PRO_SERVICE,
                /**
                 * An enum member indicating that [ResellerType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    AWS -> Value.AWS
                    AWS_PRO_SERVICE -> Value.AWS_PRO_SERVICE
                    GCP -> Value.GCP
                    GCP_PRO_SERVICE -> Value.GCP_PRO_SERVICE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    AWS -> Known.AWS
                    AWS_PRO_SERVICE -> Known.AWS_PRO_SERVICE
                    GCP -> Known.GCP
                    GCP_PRO_SERVICE -> Known.GCP_PRO_SERVICE
                    else -> throw MetronomeInvalidDataException("Unknown ResellerType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): ResellerType = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ResellerType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        class ScheduledChargeCustomFields
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [ScheduledChargeCustomFields].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [ScheduledChargeCustomFields]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(scheduledChargeCustomFields: ScheduledChargeCustomFields) =
                    apply {
                        additionalProperties =
                            scheduledChargeCustomFields.additionalProperties.toMutableMap()
                    }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [ScheduledChargeCustomFields].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): ScheduledChargeCustomFields =
                    ScheduledChargeCustomFields(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): ScheduledChargeCustomFields = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ScheduledChargeCustomFields &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ScheduledChargeCustomFields{additionalProperties=$additionalProperties}"
        }

        class SubLineItem
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val customFields: JsonField<CustomFields>,
            private val name: JsonField<String>,
            private val quantity: JsonField<Double>,
            private val subtotal: JsonField<Double>,
            private val chargeId: JsonField<String>,
            private val creditGrantId: JsonField<String>,
            private val endDate: JsonField<OffsetDateTime>,
            private val price: JsonField<Double>,
            private val startDate: JsonField<OffsetDateTime>,
            private val tierPeriod: JsonField<TierPeriod>,
            private val tiers: JsonField<List<Tier>>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("custom_fields")
                @ExcludeMissing
                customFields: JsonField<CustomFields> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("quantity")
                @ExcludeMissing
                quantity: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("subtotal")
                @ExcludeMissing
                subtotal: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("charge_id")
                @ExcludeMissing
                chargeId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("credit_grant_id")
                @ExcludeMissing
                creditGrantId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("end_date")
                @ExcludeMissing
                endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("price") @ExcludeMissing price: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("start_date")
                @ExcludeMissing
                startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("tier_period")
                @ExcludeMissing
                tierPeriod: JsonField<TierPeriod> = JsonMissing.of(),
                @JsonProperty("tiers")
                @ExcludeMissing
                tiers: JsonField<List<Tier>> = JsonMissing.of(),
            ) : this(
                customFields,
                name,
                quantity,
                subtotal,
                chargeId,
                creditGrantId,
                endDate,
                price,
                startDate,
                tierPeriod,
                tiers,
                mutableMapOf(),
            )

            /**
             * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun customFields(): CustomFields = customFields.getRequired("custom_fields")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun quantity(): Double = quantity.getRequired("quantity")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun subtotal(): Double = subtotal.getRequired("subtotal")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun chargeId(): Optional<String> = chargeId.getOptional("charge_id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun creditGrantId(): Optional<String> = creditGrantId.getOptional("credit_grant_id")

            /**
             * The end date for the charge (for seats charges only).
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun endDate(): Optional<OffsetDateTime> = endDate.getOptional("end_date")

            /**
             * the unit price for this charge, present only if the charge is not tiered and the
             * quantity is nonzero
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun price(): Optional<Double> = price.getOptional("price")

            /**
             * The start date for the charge (for seats charges only).
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun startDate(): Optional<OffsetDateTime> = startDate.getOptional("start_date")

            /**
             * when the current tier started and ends (for tiered charges only)
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun tierPeriod(): Optional<TierPeriod> = tierPeriod.getOptional("tier_period")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun tiers(): Optional<List<Tier>> = tiers.getOptional("tiers")

            /**
             * Returns the raw JSON value of [customFields].
             *
             * Unlike [customFields], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("custom_fields")
            @ExcludeMissing
            fun _customFields(): JsonField<CustomFields> = customFields

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [quantity].
             *
             * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

            /**
             * Returns the raw JSON value of [subtotal].
             *
             * Unlike [subtotal], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("subtotal") @ExcludeMissing fun _subtotal(): JsonField<Double> = subtotal

            /**
             * Returns the raw JSON value of [chargeId].
             *
             * Unlike [chargeId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("charge_id") @ExcludeMissing fun _chargeId(): JsonField<String> = chargeId

            /**
             * Returns the raw JSON value of [creditGrantId].
             *
             * Unlike [creditGrantId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("credit_grant_id")
            @ExcludeMissing
            fun _creditGrantId(): JsonField<String> = creditGrantId

            /**
             * Returns the raw JSON value of [endDate].
             *
             * Unlike [endDate], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("end_date")
            @ExcludeMissing
            fun _endDate(): JsonField<OffsetDateTime> = endDate

            /**
             * Returns the raw JSON value of [price].
             *
             * Unlike [price], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Double> = price

            /**
             * Returns the raw JSON value of [startDate].
             *
             * Unlike [startDate], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("start_date")
            @ExcludeMissing
            fun _startDate(): JsonField<OffsetDateTime> = startDate

            /**
             * Returns the raw JSON value of [tierPeriod].
             *
             * Unlike [tierPeriod], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("tier_period")
            @ExcludeMissing
            fun _tierPeriod(): JsonField<TierPeriod> = tierPeriod

            /**
             * Returns the raw JSON value of [tiers].
             *
             * Unlike [tiers], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tiers") @ExcludeMissing fun _tiers(): JsonField<List<Tier>> = tiers

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [SubLineItem].
                 *
                 * The following fields are required:
                 * ```java
                 * .customFields()
                 * .name()
                 * .quantity()
                 * .subtotal()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [SubLineItem]. */
            class Builder internal constructor() {

                private var customFields: JsonField<CustomFields>? = null
                private var name: JsonField<String>? = null
                private var quantity: JsonField<Double>? = null
                private var subtotal: JsonField<Double>? = null
                private var chargeId: JsonField<String> = JsonMissing.of()
                private var creditGrantId: JsonField<String> = JsonMissing.of()
                private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var price: JsonField<Double> = JsonMissing.of()
                private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var tierPeriod: JsonField<TierPeriod> = JsonMissing.of()
                private var tiers: JsonField<MutableList<Tier>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(subLineItem: SubLineItem) = apply {
                    customFields = subLineItem.customFields
                    name = subLineItem.name
                    quantity = subLineItem.quantity
                    subtotal = subLineItem.subtotal
                    chargeId = subLineItem.chargeId
                    creditGrantId = subLineItem.creditGrantId
                    endDate = subLineItem.endDate
                    price = subLineItem.price
                    startDate = subLineItem.startDate
                    tierPeriod = subLineItem.tierPeriod
                    tiers = subLineItem.tiers.map { it.toMutableList() }
                    additionalProperties = subLineItem.additionalProperties.toMutableMap()
                }

                /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
                fun customFields(customFields: CustomFields) =
                    customFields(JsonField.of(customFields))

                /**
                 * Sets [Builder.customFields] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.customFields] with a well-typed [CustomFields]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun customFields(customFields: JsonField<CustomFields>) = apply {
                    this.customFields = customFields
                }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                /**
                 * Sets [Builder.quantity] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.quantity] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                fun subtotal(subtotal: Double) = subtotal(JsonField.of(subtotal))

                /**
                 * Sets [Builder.subtotal] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.subtotal] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun subtotal(subtotal: JsonField<Double>) = apply { this.subtotal = subtotal }

                fun chargeId(chargeId: String) = chargeId(JsonField.of(chargeId))

                /**
                 * Sets [Builder.chargeId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.chargeId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun chargeId(chargeId: JsonField<String>) = apply { this.chargeId = chargeId }

                fun creditGrantId(creditGrantId: String) =
                    creditGrantId(JsonField.of(creditGrantId))

                /**
                 * Sets [Builder.creditGrantId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.creditGrantId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun creditGrantId(creditGrantId: JsonField<String>) = apply {
                    this.creditGrantId = creditGrantId
                }

                /** The end date for the charge (for seats charges only). */
                fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

                /**
                 * Sets [Builder.endDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.endDate] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

                /**
                 * the unit price for this charge, present only if the charge is not tiered and the
                 * quantity is nonzero
                 */
                fun price(price: Double) = price(JsonField.of(price))

                /**
                 * Sets [Builder.price] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.price] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun price(price: JsonField<Double>) = apply { this.price = price }

                /** The start date for the charge (for seats charges only). */
                fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

                /**
                 * Sets [Builder.startDate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.startDate] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                    this.startDate = startDate
                }

                /** when the current tier started and ends (for tiered charges only) */
                fun tierPeriod(tierPeriod: TierPeriod) = tierPeriod(JsonField.of(tierPeriod))

                /**
                 * Sets [Builder.tierPeriod] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tierPeriod] with a well-typed [TierPeriod] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tierPeriod(tierPeriod: JsonField<TierPeriod>) = apply {
                    this.tierPeriod = tierPeriod
                }

                fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

                /**
                 * Sets [Builder.tiers] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tiers] with a well-typed `List<Tier>` value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun tiers(tiers: JsonField<List<Tier>>) = apply {
                    this.tiers = tiers.map { it.toMutableList() }
                }

                /**
                 * Adds a single [Tier] to [tiers].
                 *
                 * @throws IllegalStateException if the field was previously set to a non-list.
                 */
                fun addTier(tier: Tier) = apply {
                    tiers =
                        (tiers ?: JsonField.of(mutableListOf())).also {
                            checkKnown("tiers", it).add(tier)
                        }
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [SubLineItem].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .customFields()
                 * .name()
                 * .quantity()
                 * .subtotal()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): SubLineItem =
                    SubLineItem(
                        checkRequired("customFields", customFields),
                        checkRequired("name", name),
                        checkRequired("quantity", quantity),
                        checkRequired("subtotal", subtotal),
                        chargeId,
                        creditGrantId,
                        endDate,
                        price,
                        startDate,
                        tierPeriod,
                        (tiers ?: JsonMissing.of()).map { it.toImmutable() },
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): SubLineItem = apply {
                if (validated) {
                    return@apply
                }

                customFields().validate()
                name()
                quantity()
                subtotal()
                chargeId()
                creditGrantId()
                endDate()
                price()
                startDate()
                tierPeriod().ifPresent { it.validate() }
                tiers().ifPresent { it.forEach { it.validate() } }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (customFields.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (if (quantity.asKnown().isPresent) 1 else 0) +
                    (if (subtotal.asKnown().isPresent) 1 else 0) +
                    (if (chargeId.asKnown().isPresent) 1 else 0) +
                    (if (creditGrantId.asKnown().isPresent) 1 else 0) +
                    (if (endDate.asKnown().isPresent) 1 else 0) +
                    (if (price.asKnown().isPresent) 1 else 0) +
                    (if (startDate.asKnown().isPresent) 1 else 0) +
                    (tierPeriod.asKnown().getOrNull()?.validity() ?: 0) +
                    (tiers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            class CustomFields
            @JsonCreator
            private constructor(
                @com.fasterxml.jackson.annotation.JsonValue
                private val additionalProperties: Map<String, JsonValue>
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [CustomFields]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [CustomFields]. */
                class Builder internal constructor() {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(customFields: CustomFields) = apply {
                        additionalProperties = customFields.additionalProperties.toMutableMap()
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [CustomFields].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): CustomFields = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    additionalProperties.count { (_, value) ->
                        !value.isNull() && !value.isMissing()
                    }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is CustomFields &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

                override fun hashCode(): Int = hashCode

                override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
            }

            /** when the current tier started and ends (for tiered charges only) */
            class TierPeriod
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val startingAt: JsonField<OffsetDateTime>,
                private val endingBefore: JsonField<OffsetDateTime>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("starting_at")
                    @ExcludeMissing
                    startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("ending_before")
                    @ExcludeMissing
                    endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
                ) : this(startingAt, endingBefore, mutableMapOf())

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun endingBefore(): Optional<OffsetDateTime> =
                    endingBefore.getOptional("ending_before")

                /**
                 * Returns the raw JSON value of [startingAt].
                 *
                 * Unlike [startingAt], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("starting_at")
                @ExcludeMissing
                fun _startingAt(): JsonField<OffsetDateTime> = startingAt

                /**
                 * Returns the raw JSON value of [endingBefore].
                 *
                 * Unlike [endingBefore], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("ending_before")
                @ExcludeMissing
                fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [TierPeriod].
                     *
                     * The following fields are required:
                     * ```java
                     * .startingAt()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [TierPeriod]. */
                class Builder internal constructor() {

                    private var startingAt: JsonField<OffsetDateTime>? = null
                    private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(tierPeriod: TierPeriod) = apply {
                        startingAt = tierPeriod.startingAt
                        endingBefore = tierPeriod.endingBefore
                        additionalProperties = tierPeriod.additionalProperties.toMutableMap()
                    }

                    fun startingAt(startingAt: OffsetDateTime) =
                        startingAt(JsonField.of(startingAt))

                    /**
                     * Sets [Builder.startingAt] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.startingAt] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                        this.startingAt = startingAt
                    }

                    fun endingBefore(endingBefore: OffsetDateTime) =
                        endingBefore(JsonField.of(endingBefore))

                    /**
                     * Sets [Builder.endingBefore] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.endingBefore] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                        this.endingBefore = endingBefore
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [TierPeriod].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .startingAt()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): TierPeriod =
                        TierPeriod(
                            checkRequired("startingAt", startingAt),
                            endingBefore,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): TierPeriod = apply {
                    if (validated) {
                        return@apply
                    }

                    startingAt()
                    endingBefore()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (startingAt.asKnown().isPresent) 1 else 0) +
                        (if (endingBefore.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is TierPeriod &&
                        startingAt == other.startingAt &&
                        endingBefore == other.endingBefore &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(startingAt, endingBefore, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "TierPeriod{startingAt=$startingAt, endingBefore=$endingBefore, additionalProperties=$additionalProperties}"
            }

            class Tier
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val price: JsonField<Double>,
                private val quantity: JsonField<Double>,
                private val startingAt: JsonField<Double>,
                private val subtotal: JsonField<Double>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("price")
                    @ExcludeMissing
                    price: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("quantity")
                    @ExcludeMissing
                    quantity: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("starting_at")
                    @ExcludeMissing
                    startingAt: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("subtotal")
                    @ExcludeMissing
                    subtotal: JsonField<Double> = JsonMissing.of(),
                ) : this(price, quantity, startingAt, subtotal, mutableMapOf())

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun price(): Double = price.getRequired("price")

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun quantity(): Double = quantity.getRequired("quantity")

                /**
                 * at what metric amount this tier begins
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun startingAt(): Double = startingAt.getRequired("starting_at")

                /**
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun subtotal(): Double = subtotal.getRequired("subtotal")

                /**
                 * Returns the raw JSON value of [price].
                 *
                 * Unlike [price], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Double> = price

                /**
                 * Returns the raw JSON value of [quantity].
                 *
                 * Unlike [quantity], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("quantity")
                @ExcludeMissing
                fun _quantity(): JsonField<Double> = quantity

                /**
                 * Returns the raw JSON value of [startingAt].
                 *
                 * Unlike [startingAt], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("starting_at")
                @ExcludeMissing
                fun _startingAt(): JsonField<Double> = startingAt

                /**
                 * Returns the raw JSON value of [subtotal].
                 *
                 * Unlike [subtotal], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("subtotal")
                @ExcludeMissing
                fun _subtotal(): JsonField<Double> = subtotal

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Tier].
                     *
                     * The following fields are required:
                     * ```java
                     * .price()
                     * .quantity()
                     * .startingAt()
                     * .subtotal()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Tier]. */
                class Builder internal constructor() {

                    private var price: JsonField<Double>? = null
                    private var quantity: JsonField<Double>? = null
                    private var startingAt: JsonField<Double>? = null
                    private var subtotal: JsonField<Double>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(tier: Tier) = apply {
                        price = tier.price
                        quantity = tier.quantity
                        startingAt = tier.startingAt
                        subtotal = tier.subtotal
                        additionalProperties = tier.additionalProperties.toMutableMap()
                    }

                    fun price(price: Double) = price(JsonField.of(price))

                    /**
                     * Sets [Builder.price] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.price] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun price(price: JsonField<Double>) = apply { this.price = price }

                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    /**
                     * Sets [Builder.quantity] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.quantity] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                    /** at what metric amount this tier begins */
                    fun startingAt(startingAt: Double) = startingAt(JsonField.of(startingAt))

                    /**
                     * Sets [Builder.startingAt] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.startingAt] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun startingAt(startingAt: JsonField<Double>) = apply {
                        this.startingAt = startingAt
                    }

                    fun subtotal(subtotal: Double) = subtotal(JsonField.of(subtotal))

                    /**
                     * Sets [Builder.subtotal] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.subtotal] with a well-typed [Double] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun subtotal(subtotal: JsonField<Double>) = apply { this.subtotal = subtotal }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Tier].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .price()
                     * .quantity()
                     * .startingAt()
                     * .subtotal()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Tier =
                        Tier(
                            checkRequired("price", price),
                            checkRequired("quantity", quantity),
                            checkRequired("startingAt", startingAt),
                            checkRequired("subtotal", subtotal),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Tier = apply {
                    if (validated) {
                        return@apply
                    }

                    price()
                    quantity()
                    startingAt()
                    subtotal()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (price.asKnown().isPresent) 1 else 0) +
                        (if (quantity.asKnown().isPresent) 1 else 0) +
                        (if (startingAt.asKnown().isPresent) 1 else 0) +
                        (if (subtotal.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Tier &&
                        price == other.price &&
                        quantity == other.quantity &&
                        startingAt == other.startingAt &&
                        subtotal == other.subtotal &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(price, quantity, startingAt, subtotal, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Tier{price=$price, quantity=$quantity, startingAt=$startingAt, subtotal=$subtotal, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SubLineItem &&
                    customFields == other.customFields &&
                    name == other.name &&
                    quantity == other.quantity &&
                    subtotal == other.subtotal &&
                    chargeId == other.chargeId &&
                    creditGrantId == other.creditGrantId &&
                    endDate == other.endDate &&
                    price == other.price &&
                    startDate == other.startDate &&
                    tierPeriod == other.tierPeriod &&
                    tiers == other.tiers &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    customFields,
                    name,
                    quantity,
                    subtotal,
                    chargeId,
                    creditGrantId,
                    endDate,
                    price,
                    startDate,
                    tierPeriod,
                    tiers,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SubLineItem{customFields=$customFields, name=$name, quantity=$quantity, subtotal=$subtotal, chargeId=$chargeId, creditGrantId=$creditGrantId, endDate=$endDate, price=$price, startDate=$startDate, tierPeriod=$tierPeriod, tiers=$tiers, additionalProperties=$additionalProperties}"
        }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        class SubscriptionCustomFields
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [SubscriptionCustomFields].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [SubscriptionCustomFields]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(subscriptionCustomFields: SubscriptionCustomFields) = apply {
                    additionalProperties =
                        subscriptionCustomFields.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [SubscriptionCustomFields].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): SubscriptionCustomFields =
                    SubscriptionCustomFields(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): SubscriptionCustomFields = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SubscriptionCustomFields &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SubscriptionCustomFields{additionalProperties=$additionalProperties}"
        }

        /** Populated if the line item has a tiered price. */
        class Tier
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val level: JsonField<Double>,
            private val startingAt: JsonField<String>,
            private val size: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("level") @ExcludeMissing level: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("starting_at")
                @ExcludeMissing
                startingAt: JsonField<String> = JsonMissing.of(),
                @JsonProperty("size") @ExcludeMissing size: JsonField<String> = JsonMissing.of(),
            ) : this(level, startingAt, size, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun level(): Double = level.getRequired("level")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun startingAt(): String = startingAt.getRequired("starting_at")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun size(): Optional<String> = size.getOptional("size")

            /**
             * Returns the raw JSON value of [level].
             *
             * Unlike [level], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("level") @ExcludeMissing fun _level(): JsonField<Double> = level

            /**
             * Returns the raw JSON value of [startingAt].
             *
             * Unlike [startingAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("starting_at")
            @ExcludeMissing
            fun _startingAt(): JsonField<String> = startingAt

            /**
             * Returns the raw JSON value of [size].
             *
             * Unlike [size], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("size") @ExcludeMissing fun _size(): JsonField<String> = size

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Tier].
                 *
                 * The following fields are required:
                 * ```java
                 * .level()
                 * .startingAt()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Tier]. */
            class Builder internal constructor() {

                private var level: JsonField<Double>? = null
                private var startingAt: JsonField<String>? = null
                private var size: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(tier: Tier) = apply {
                    level = tier.level
                    startingAt = tier.startingAt
                    size = tier.size
                    additionalProperties = tier.additionalProperties.toMutableMap()
                }

                fun level(level: Double) = level(JsonField.of(level))

                /**
                 * Sets [Builder.level] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.level] with a well-typed [Double] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun level(level: JsonField<Double>) = apply { this.level = level }

                fun startingAt(startingAt: String) = startingAt(JsonField.of(startingAt))

                /**
                 * Sets [Builder.startingAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.startingAt] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun startingAt(startingAt: JsonField<String>) = apply {
                    this.startingAt = startingAt
                }

                fun size(size: String?) = size(JsonField.ofNullable(size))

                /** Alias for calling [Builder.size] with `size.orElse(null)`. */
                fun size(size: Optional<String>) = size(size.getOrNull())

                /**
                 * Sets [Builder.size] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.size] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun size(size: JsonField<String>) = apply { this.size = size }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Tier].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .level()
                 * .startingAt()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Tier =
                    Tier(
                        checkRequired("level", level),
                        checkRequired("startingAt", startingAt),
                        size,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Tier = apply {
                if (validated) {
                    return@apply
                }

                level()
                startingAt()
                size()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (level.asKnown().isPresent) 1 else 0) +
                    (if (startingAt.asKnown().isPresent) 1 else 0) +
                    (if (size.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Tier &&
                    level == other.level &&
                    startingAt == other.startingAt &&
                    size == other.size &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(level, startingAt, size, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Tier{level=$level, startingAt=$startingAt, size=$size, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is LineItem &&
                creditType == other.creditType &&
                name == other.name &&
                total == other.total &&
                type == other.type &&
                appliedCommitOrCredit == other.appliedCommitOrCredit &&
                commitCustomFields == other.commitCustomFields &&
                commitId == other.commitId &&
                commitNetsuiteItemId == other.commitNetsuiteItemId &&
                commitNetsuiteSalesOrderId == other.commitNetsuiteSalesOrderId &&
                commitSegmentId == other.commitSegmentId &&
                commitType == other.commitType &&
                customFields == other.customFields &&
                discountCustomFields == other.discountCustomFields &&
                discountId == other.discountId &&
                endingBefore == other.endingBefore &&
                groupKey == other.groupKey &&
                groupValue == other.groupValue &&
                isProrated == other.isProrated &&
                listPrice == other.listPrice &&
                metadata == other.metadata &&
                netsuiteInvoiceBillingEnd == other.netsuiteInvoiceBillingEnd &&
                netsuiteInvoiceBillingStart == other.netsuiteInvoiceBillingStart &&
                netsuiteItemId == other.netsuiteItemId &&
                origin == other.origin &&
                postpaidCommit == other.postpaidCommit &&
                presentationGroupValues == other.presentationGroupValues &&
                pricingGroupValues == other.pricingGroupValues &&
                productCustomFields == other.productCustomFields &&
                productId == other.productId &&
                productTags == other.productTags &&
                productType == other.productType &&
                professionalServiceCustomFields == other.professionalServiceCustomFields &&
                professionalServiceId == other.professionalServiceId &&
                quantity == other.quantity &&
                resellerType == other.resellerType &&
                scheduledChargeCustomFields == other.scheduledChargeCustomFields &&
                scheduledChargeId == other.scheduledChargeId &&
                startingAt == other.startingAt &&
                subLineItems == other.subLineItems &&
                subscriptionCustomFields == other.subscriptionCustomFields &&
                subscriptionId == other.subscriptionId &&
                tier == other.tier &&
                unitPrice == other.unitPrice &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                creditType,
                name,
                total,
                type,
                appliedCommitOrCredit,
                commitCustomFields,
                commitId,
                commitNetsuiteItemId,
                commitNetsuiteSalesOrderId,
                commitSegmentId,
                commitType,
                customFields,
                discountCustomFields,
                discountId,
                endingBefore,
                groupKey,
                groupValue,
                isProrated,
                listPrice,
                metadata,
                netsuiteInvoiceBillingEnd,
                netsuiteInvoiceBillingStart,
                netsuiteItemId,
                origin,
                postpaidCommit,
                presentationGroupValues,
                pricingGroupValues,
                productCustomFields,
                productId,
                productTags,
                productType,
                professionalServiceCustomFields,
                professionalServiceId,
                quantity,
                resellerType,
                scheduledChargeCustomFields,
                scheduledChargeId,
                startingAt,
                subLineItems,
                subscriptionCustomFields,
                subscriptionId,
                tier,
                unitPrice,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LineItem{creditType=$creditType, name=$name, total=$total, type=$type, appliedCommitOrCredit=$appliedCommitOrCredit, commitCustomFields=$commitCustomFields, commitId=$commitId, commitNetsuiteItemId=$commitNetsuiteItemId, commitNetsuiteSalesOrderId=$commitNetsuiteSalesOrderId, commitSegmentId=$commitSegmentId, commitType=$commitType, customFields=$customFields, discountCustomFields=$discountCustomFields, discountId=$discountId, endingBefore=$endingBefore, groupKey=$groupKey, groupValue=$groupValue, isProrated=$isProrated, listPrice=$listPrice, metadata=$metadata, netsuiteInvoiceBillingEnd=$netsuiteInvoiceBillingEnd, netsuiteInvoiceBillingStart=$netsuiteInvoiceBillingStart, netsuiteItemId=$netsuiteItemId, origin=$origin, postpaidCommit=$postpaidCommit, presentationGroupValues=$presentationGroupValues, pricingGroupValues=$pricingGroupValues, productCustomFields=$productCustomFields, productId=$productId, productTags=$productTags, productType=$productType, professionalServiceCustomFields=$professionalServiceCustomFields, professionalServiceId=$professionalServiceId, quantity=$quantity, resellerType=$resellerType, scheduledChargeCustomFields=$scheduledChargeCustomFields, scheduledChargeId=$scheduledChargeId, startingAt=$startingAt, subLineItems=$subLineItems, subscriptionCustomFields=$subscriptionCustomFields, subscriptionId=$subscriptionId, tier=$tier, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
    }

    class ConstituentInvoice
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val contractId: JsonField<String>,
        private val customerId: JsonField<String>,
        private val invoiceId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("contract_id")
            @ExcludeMissing
            contractId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customer_id")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("invoice_id")
            @ExcludeMissing
            invoiceId: JsonField<String> = JsonMissing.of(),
        ) : this(contractId, customerId, invoiceId, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun contractId(): String = contractId.getRequired("contract_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun invoiceId(): String = invoiceId.getRequired("invoice_id")

        /**
         * Returns the raw JSON value of [contractId].
         *
         * Unlike [contractId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("contract_id")
        @ExcludeMissing
        fun _contractId(): JsonField<String> = contractId

        /**
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        /**
         * Returns the raw JSON value of [invoiceId].
         *
         * Unlike [invoiceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId(): JsonField<String> = invoiceId

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [ConstituentInvoice].
             *
             * The following fields are required:
             * ```java
             * .contractId()
             * .customerId()
             * .invoiceId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ConstituentInvoice]. */
        class Builder internal constructor() {

            private var contractId: JsonField<String>? = null
            private var customerId: JsonField<String>? = null
            private var invoiceId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(constituentInvoice: ConstituentInvoice) = apply {
                contractId = constituentInvoice.contractId
                customerId = constituentInvoice.customerId
                invoiceId = constituentInvoice.invoiceId
                additionalProperties = constituentInvoice.additionalProperties.toMutableMap()
            }

            fun contractId(contractId: String) = contractId(JsonField.of(contractId))

            /**
             * Sets [Builder.contractId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contractId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contractId(contractId: JsonField<String>) = apply { this.contractId = contractId }

            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

            /**
             * Sets [Builder.invoiceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invoiceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [ConstituentInvoice].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .contractId()
             * .customerId()
             * .invoiceId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ConstituentInvoice =
                ConstituentInvoice(
                    checkRequired("contractId", contractId),
                    checkRequired("customerId", customerId),
                    checkRequired("invoiceId", invoiceId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): ConstituentInvoice = apply {
            if (validated) {
                return@apply
            }

            contractId()
            customerId()
            invoiceId()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (contractId.asKnown().isPresent) 1 else 0) +
                (if (customerId.asKnown().isPresent) 1 else 0) +
                (if (invoiceId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ConstituentInvoice &&
                contractId == other.contractId &&
                customerId == other.customerId &&
                invoiceId == other.invoiceId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(contractId, customerId, invoiceId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ConstituentInvoice{contractId=$contractId, customerId=$customerId, invoiceId=$invoiceId, additionalProperties=$additionalProperties}"
    }

    /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
    class ContractCustomFields
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [ContractCustomFields]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ContractCustomFields]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contractCustomFields: ContractCustomFields) = apply {
                additionalProperties = contractCustomFields.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [ContractCustomFields].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): ContractCustomFields =
                ContractCustomFields(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): ContractCustomFields = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ContractCustomFields &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "ContractCustomFields{additionalProperties=$additionalProperties}"
    }

    class CorrectionRecord
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val correctedInvoiceId: JsonField<String>,
        private val memo: JsonField<String>,
        private val reason: JsonField<String>,
        private val correctedExternalInvoice: JsonField<CorrectedExternalInvoice>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("corrected_invoice_id")
            @ExcludeMissing
            correctedInvoiceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("memo") @ExcludeMissing memo: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<String> = JsonMissing.of(),
            @JsonProperty("corrected_external_invoice")
            @ExcludeMissing
            correctedExternalInvoice: JsonField<CorrectedExternalInvoice> = JsonMissing.of(),
        ) : this(correctedInvoiceId, memo, reason, correctedExternalInvoice, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun correctedInvoiceId(): String = correctedInvoiceId.getRequired("corrected_invoice_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun memo(): String = memo.getRequired("memo")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reason(): String = reason.getRequired("reason")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun correctedExternalInvoice(): Optional<CorrectedExternalInvoice> =
            correctedExternalInvoice.getOptional("corrected_external_invoice")

        /**
         * Returns the raw JSON value of [correctedInvoiceId].
         *
         * Unlike [correctedInvoiceId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("corrected_invoice_id")
        @ExcludeMissing
        fun _correctedInvoiceId(): JsonField<String> = correctedInvoiceId

        /**
         * Returns the raw JSON value of [memo].
         *
         * Unlike [memo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("memo") @ExcludeMissing fun _memo(): JsonField<String> = memo

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

        /**
         * Returns the raw JSON value of [correctedExternalInvoice].
         *
         * Unlike [correctedExternalInvoice], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("corrected_external_invoice")
        @ExcludeMissing
        fun _correctedExternalInvoice(): JsonField<CorrectedExternalInvoice> =
            correctedExternalInvoice

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [CorrectionRecord].
             *
             * The following fields are required:
             * ```java
             * .correctedInvoiceId()
             * .memo()
             * .reason()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CorrectionRecord]. */
        class Builder internal constructor() {

            private var correctedInvoiceId: JsonField<String>? = null
            private var memo: JsonField<String>? = null
            private var reason: JsonField<String>? = null
            private var correctedExternalInvoice: JsonField<CorrectedExternalInvoice> =
                JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(correctionRecord: CorrectionRecord) = apply {
                correctedInvoiceId = correctionRecord.correctedInvoiceId
                memo = correctionRecord.memo
                reason = correctionRecord.reason
                correctedExternalInvoice = correctionRecord.correctedExternalInvoice
                additionalProperties = correctionRecord.additionalProperties.toMutableMap()
            }

            fun correctedInvoiceId(correctedInvoiceId: String) =
                correctedInvoiceId(JsonField.of(correctedInvoiceId))

            /**
             * Sets [Builder.correctedInvoiceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.correctedInvoiceId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun correctedInvoiceId(correctedInvoiceId: JsonField<String>) = apply {
                this.correctedInvoiceId = correctedInvoiceId
            }

            fun memo(memo: String) = memo(JsonField.of(memo))

            /**
             * Sets [Builder.memo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.memo] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun memo(memo: JsonField<String>) = apply { this.memo = memo }

            fun reason(reason: String) = reason(JsonField.of(reason))

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

            fun correctedExternalInvoice(correctedExternalInvoice: CorrectedExternalInvoice) =
                correctedExternalInvoice(JsonField.of(correctedExternalInvoice))

            /**
             * Sets [Builder.correctedExternalInvoice] to an arbitrary JSON value.
             *
             * You should usually call [Builder.correctedExternalInvoice] with a well-typed
             * [CorrectedExternalInvoice] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun correctedExternalInvoice(
                correctedExternalInvoice: JsonField<CorrectedExternalInvoice>
            ) = apply { this.correctedExternalInvoice = correctedExternalInvoice }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [CorrectionRecord].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .correctedInvoiceId()
             * .memo()
             * .reason()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CorrectionRecord =
                CorrectionRecord(
                    checkRequired("correctedInvoiceId", correctedInvoiceId),
                    checkRequired("memo", memo),
                    checkRequired("reason", reason),
                    correctedExternalInvoice,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): CorrectionRecord = apply {
            if (validated) {
                return@apply
            }

            correctedInvoiceId()
            memo()
            reason()
            correctedExternalInvoice().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (correctedInvoiceId.asKnown().isPresent) 1 else 0) +
                (if (memo.asKnown().isPresent) 1 else 0) +
                (if (reason.asKnown().isPresent) 1 else 0) +
                (correctedExternalInvoice.asKnown().getOrNull()?.validity() ?: 0)

        class CorrectedExternalInvoice
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val billingProviderType: JsonField<BillingProviderType>,
            private val billingProviderError: JsonField<String>,
            private val externalPaymentId: JsonField<String>,
            private val externalStatus: JsonField<ExternalStatus>,
            private val invoiceId: JsonField<String>,
            private val invoicedSubTotal: JsonField<Double>,
            private val invoicedTotal: JsonField<Double>,
            private val issuedAtTimestamp: JsonField<OffsetDateTime>,
            private val pdfUrl: JsonField<String>,
            private val tax: JsonField<Tax>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("billing_provider_type")
                @ExcludeMissing
                billingProviderType: JsonField<BillingProviderType> = JsonMissing.of(),
                @JsonProperty("billing_provider_error")
                @ExcludeMissing
                billingProviderError: JsonField<String> = JsonMissing.of(),
                @JsonProperty("external_payment_id")
                @ExcludeMissing
                externalPaymentId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("external_status")
                @ExcludeMissing
                externalStatus: JsonField<ExternalStatus> = JsonMissing.of(),
                @JsonProperty("invoice_id")
                @ExcludeMissing
                invoiceId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("invoiced_sub_total")
                @ExcludeMissing
                invoicedSubTotal: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("invoiced_total")
                @ExcludeMissing
                invoicedTotal: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("issued_at_timestamp")
                @ExcludeMissing
                issuedAtTimestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("pdf_url")
                @ExcludeMissing
                pdfUrl: JsonField<String> = JsonMissing.of(),
                @JsonProperty("tax") @ExcludeMissing tax: JsonField<Tax> = JsonMissing.of(),
            ) : this(
                billingProviderType,
                billingProviderError,
                externalPaymentId,
                externalStatus,
                invoiceId,
                invoicedSubTotal,
                invoicedTotal,
                issuedAtTimestamp,
                pdfUrl,
                tax,
                mutableMapOf(),
            )

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun billingProviderType(): BillingProviderType =
                billingProviderType.getRequired("billing_provider_type")

            /**
             * Error message from the billing provider, if available.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun billingProviderError(): Optional<String> =
                billingProviderError.getOptional("billing_provider_error")

            /**
             * The ID of the payment in the external system, if available.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun externalPaymentId(): Optional<String> =
                externalPaymentId.getOptional("external_payment_id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun externalStatus(): Optional<ExternalStatus> =
                externalStatus.getOptional("external_status")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun invoiceId(): Optional<String> = invoiceId.getOptional("invoice_id")

            /**
             * The subtotal amount invoiced, if available from the billing provider.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun invoicedSubTotal(): Optional<Double> =
                invoicedSubTotal.getOptional("invoiced_sub_total")

            /**
             * The total amount invoiced, if available from the billing provider.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun invoicedTotal(): Optional<Double> = invoicedTotal.getOptional("invoiced_total")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun issuedAtTimestamp(): Optional<OffsetDateTime> =
                issuedAtTimestamp.getOptional("issued_at_timestamp")

            /**
             * A URL to the PDF of the invoice, if available from the billing provider.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun pdfUrl(): Optional<String> = pdfUrl.getOptional("pdf_url")

            /**
             * Tax details for the invoice, if available from the billing provider.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun tax(): Optional<Tax> = tax.getOptional("tax")

            /**
             * Returns the raw JSON value of [billingProviderType].
             *
             * Unlike [billingProviderType], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("billing_provider_type")
            @ExcludeMissing
            fun _billingProviderType(): JsonField<BillingProviderType> = billingProviderType

            /**
             * Returns the raw JSON value of [billingProviderError].
             *
             * Unlike [billingProviderError], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("billing_provider_error")
            @ExcludeMissing
            fun _billingProviderError(): JsonField<String> = billingProviderError

            /**
             * Returns the raw JSON value of [externalPaymentId].
             *
             * Unlike [externalPaymentId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("external_payment_id")
            @ExcludeMissing
            fun _externalPaymentId(): JsonField<String> = externalPaymentId

            /**
             * Returns the raw JSON value of [externalStatus].
             *
             * Unlike [externalStatus], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("external_status")
            @ExcludeMissing
            fun _externalStatus(): JsonField<ExternalStatus> = externalStatus

            /**
             * Returns the raw JSON value of [invoiceId].
             *
             * Unlike [invoiceId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("invoice_id")
            @ExcludeMissing
            fun _invoiceId(): JsonField<String> = invoiceId

            /**
             * Returns the raw JSON value of [invoicedSubTotal].
             *
             * Unlike [invoicedSubTotal], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("invoiced_sub_total")
            @ExcludeMissing
            fun _invoicedSubTotal(): JsonField<Double> = invoicedSubTotal

            /**
             * Returns the raw JSON value of [invoicedTotal].
             *
             * Unlike [invoicedTotal], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("invoiced_total")
            @ExcludeMissing
            fun _invoicedTotal(): JsonField<Double> = invoicedTotal

            /**
             * Returns the raw JSON value of [issuedAtTimestamp].
             *
             * Unlike [issuedAtTimestamp], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("issued_at_timestamp")
            @ExcludeMissing
            fun _issuedAtTimestamp(): JsonField<OffsetDateTime> = issuedAtTimestamp

            /**
             * Returns the raw JSON value of [pdfUrl].
             *
             * Unlike [pdfUrl], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("pdf_url") @ExcludeMissing fun _pdfUrl(): JsonField<String> = pdfUrl

            /**
             * Returns the raw JSON value of [tax].
             *
             * Unlike [tax], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("tax") @ExcludeMissing fun _tax(): JsonField<Tax> = tax

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [CorrectedExternalInvoice].
                 *
                 * The following fields are required:
                 * ```java
                 * .billingProviderType()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CorrectedExternalInvoice]. */
            class Builder internal constructor() {

                private var billingProviderType: JsonField<BillingProviderType>? = null
                private var billingProviderError: JsonField<String> = JsonMissing.of()
                private var externalPaymentId: JsonField<String> = JsonMissing.of()
                private var externalStatus: JsonField<ExternalStatus> = JsonMissing.of()
                private var invoiceId: JsonField<String> = JsonMissing.of()
                private var invoicedSubTotal: JsonField<Double> = JsonMissing.of()
                private var invoicedTotal: JsonField<Double> = JsonMissing.of()
                private var issuedAtTimestamp: JsonField<OffsetDateTime> = JsonMissing.of()
                private var pdfUrl: JsonField<String> = JsonMissing.of()
                private var tax: JsonField<Tax> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(correctedExternalInvoice: CorrectedExternalInvoice) = apply {
                    billingProviderType = correctedExternalInvoice.billingProviderType
                    billingProviderError = correctedExternalInvoice.billingProviderError
                    externalPaymentId = correctedExternalInvoice.externalPaymentId
                    externalStatus = correctedExternalInvoice.externalStatus
                    invoiceId = correctedExternalInvoice.invoiceId
                    invoicedSubTotal = correctedExternalInvoice.invoicedSubTotal
                    invoicedTotal = correctedExternalInvoice.invoicedTotal
                    issuedAtTimestamp = correctedExternalInvoice.issuedAtTimestamp
                    pdfUrl = correctedExternalInvoice.pdfUrl
                    tax = correctedExternalInvoice.tax
                    additionalProperties =
                        correctedExternalInvoice.additionalProperties.toMutableMap()
                }

                fun billingProviderType(billingProviderType: BillingProviderType) =
                    billingProviderType(JsonField.of(billingProviderType))

                /**
                 * Sets [Builder.billingProviderType] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billingProviderType] with a well-typed
                 * [BillingProviderType] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun billingProviderType(billingProviderType: JsonField<BillingProviderType>) =
                    apply {
                        this.billingProviderType = billingProviderType
                    }

                /** Error message from the billing provider, if available. */
                fun billingProviderError(billingProviderError: String) =
                    billingProviderError(JsonField.of(billingProviderError))

                /**
                 * Sets [Builder.billingProviderError] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.billingProviderError] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun billingProviderError(billingProviderError: JsonField<String>) = apply {
                    this.billingProviderError = billingProviderError
                }

                /** The ID of the payment in the external system, if available. */
                fun externalPaymentId(externalPaymentId: String) =
                    externalPaymentId(JsonField.of(externalPaymentId))

                /**
                 * Sets [Builder.externalPaymentId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.externalPaymentId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun externalPaymentId(externalPaymentId: JsonField<String>) = apply {
                    this.externalPaymentId = externalPaymentId
                }

                fun externalStatus(externalStatus: ExternalStatus) =
                    externalStatus(JsonField.of(externalStatus))

                /**
                 * Sets [Builder.externalStatus] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.externalStatus] with a well-typed
                 * [ExternalStatus] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun externalStatus(externalStatus: JsonField<ExternalStatus>) = apply {
                    this.externalStatus = externalStatus
                }

                fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

                /**
                 * Sets [Builder.invoiceId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.invoiceId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

                /** The subtotal amount invoiced, if available from the billing provider. */
                fun invoicedSubTotal(invoicedSubTotal: Double) =
                    invoicedSubTotal(JsonField.of(invoicedSubTotal))

                /**
                 * Sets [Builder.invoicedSubTotal] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.invoicedSubTotal] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun invoicedSubTotal(invoicedSubTotal: JsonField<Double>) = apply {
                    this.invoicedSubTotal = invoicedSubTotal
                }

                /** The total amount invoiced, if available from the billing provider. */
                fun invoicedTotal(invoicedTotal: Double) =
                    invoicedTotal(JsonField.of(invoicedTotal))

                /**
                 * Sets [Builder.invoicedTotal] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.invoicedTotal] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun invoicedTotal(invoicedTotal: JsonField<Double>) = apply {
                    this.invoicedTotal = invoicedTotal
                }

                fun issuedAtTimestamp(issuedAtTimestamp: OffsetDateTime) =
                    issuedAtTimestamp(JsonField.of(issuedAtTimestamp))

                /**
                 * Sets [Builder.issuedAtTimestamp] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.issuedAtTimestamp] with a well-typed
                 * [OffsetDateTime] value instead. This method is primarily for setting the field to
                 * an undocumented or not yet supported value.
                 */
                fun issuedAtTimestamp(issuedAtTimestamp: JsonField<OffsetDateTime>) = apply {
                    this.issuedAtTimestamp = issuedAtTimestamp
                }

                /** A URL to the PDF of the invoice, if available from the billing provider. */
                fun pdfUrl(pdfUrl: String) = pdfUrl(JsonField.of(pdfUrl))

                /**
                 * Sets [Builder.pdfUrl] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pdfUrl] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun pdfUrl(pdfUrl: JsonField<String>) = apply { this.pdfUrl = pdfUrl }

                /** Tax details for the invoice, if available from the billing provider. */
                fun tax(tax: Tax) = tax(JsonField.of(tax))

                /**
                 * Sets [Builder.tax] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.tax] with a well-typed [Tax] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun tax(tax: JsonField<Tax>) = apply { this.tax = tax }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [CorrectedExternalInvoice].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .billingProviderType()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): CorrectedExternalInvoice =
                    CorrectedExternalInvoice(
                        checkRequired("billingProviderType", billingProviderType),
                        billingProviderError,
                        externalPaymentId,
                        externalStatus,
                        invoiceId,
                        invoicedSubTotal,
                        invoicedTotal,
                        issuedAtTimestamp,
                        pdfUrl,
                        tax,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): CorrectedExternalInvoice = apply {
                if (validated) {
                    return@apply
                }

                billingProviderType().validate()
                billingProviderError()
                externalPaymentId()
                externalStatus().ifPresent { it.validate() }
                invoiceId()
                invoicedSubTotal()
                invoicedTotal()
                issuedAtTimestamp()
                pdfUrl()
                tax().ifPresent { it.validate() }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (billingProviderType.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (billingProviderError.asKnown().isPresent) 1 else 0) +
                    (if (externalPaymentId.asKnown().isPresent) 1 else 0) +
                    (externalStatus.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (invoiceId.asKnown().isPresent) 1 else 0) +
                    (if (invoicedSubTotal.asKnown().isPresent) 1 else 0) +
                    (if (invoicedTotal.asKnown().isPresent) 1 else 0) +
                    (if (issuedAtTimestamp.asKnown().isPresent) 1 else 0) +
                    (if (pdfUrl.asKnown().isPresent) 1 else 0) +
                    (tax.asKnown().getOrNull()?.validity() ?: 0)

            class BillingProviderType
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val AWS_MARKETPLACE = of("aws_marketplace")

                    @JvmField val STRIPE = of("stripe")

                    @JvmField val NETSUITE = of("netsuite")

                    @JvmField val CUSTOM = of("custom")

                    @JvmField val AZURE_MARKETPLACE = of("azure_marketplace")

                    @JvmField val QUICKBOOKS_ONLINE = of("quickbooks_online")

                    @JvmField val WORKDAY = of("workday")

                    @JvmField val GCP_MARKETPLACE = of("gcp_marketplace")

                    @JvmField val METRONOME = of("metronome")

                    @JvmStatic fun of(value: String) = BillingProviderType(JsonField.of(value))
                }

                /** An enum containing [BillingProviderType]'s known values. */
                enum class Known {
                    AWS_MARKETPLACE,
                    STRIPE,
                    NETSUITE,
                    CUSTOM,
                    AZURE_MARKETPLACE,
                    QUICKBOOKS_ONLINE,
                    WORKDAY,
                    GCP_MARKETPLACE,
                    METRONOME,
                }

                /**
                 * An enum containing [BillingProviderType]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [BillingProviderType] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    AWS_MARKETPLACE,
                    STRIPE,
                    NETSUITE,
                    CUSTOM,
                    AZURE_MARKETPLACE,
                    QUICKBOOKS_ONLINE,
                    WORKDAY,
                    GCP_MARKETPLACE,
                    METRONOME,
                    /**
                     * An enum member indicating that [BillingProviderType] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        AWS_MARKETPLACE -> Value.AWS_MARKETPLACE
                        STRIPE -> Value.STRIPE
                        NETSUITE -> Value.NETSUITE
                        CUSTOM -> Value.CUSTOM
                        AZURE_MARKETPLACE -> Value.AZURE_MARKETPLACE
                        QUICKBOOKS_ONLINE -> Value.QUICKBOOKS_ONLINE
                        WORKDAY -> Value.WORKDAY
                        GCP_MARKETPLACE -> Value.GCP_MARKETPLACE
                        METRONOME -> Value.METRONOME
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        AWS_MARKETPLACE -> Known.AWS_MARKETPLACE
                        STRIPE -> Known.STRIPE
                        NETSUITE -> Known.NETSUITE
                        CUSTOM -> Known.CUSTOM
                        AZURE_MARKETPLACE -> Known.AZURE_MARKETPLACE
                        QUICKBOOKS_ONLINE -> Known.QUICKBOOKS_ONLINE
                        WORKDAY -> Known.WORKDAY
                        GCP_MARKETPLACE -> Known.GCP_MARKETPLACE
                        METRONOME -> Known.METRONOME
                        else ->
                            throw MetronomeInvalidDataException(
                                "Unknown BillingProviderType: $value"
                            )
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        MetronomeInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): BillingProviderType = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is BillingProviderType && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class ExternalStatus
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val DRAFT = of("DRAFT")

                    @JvmField val FINALIZED = of("FINALIZED")

                    @JvmField val PAID = of("PAID")

                    @JvmField val PARTIALLY_PAID = of("PARTIALLY_PAID")

                    @JvmField val UNCOLLECTIBLE = of("UNCOLLECTIBLE")

                    @JvmField val VOID = of("VOID")

                    @JvmField val DELETED = of("DELETED")

                    @JvmField val PAYMENT_FAILED = of("PAYMENT_FAILED")

                    @JvmField val INVALID_REQUEST_ERROR = of("INVALID_REQUEST_ERROR")

                    @JvmField val SKIPPED = of("SKIPPED")

                    @JvmField val SENT = of("SENT")

                    @JvmField val QUEUED = of("QUEUED")

                    @JvmStatic fun of(value: String) = ExternalStatus(JsonField.of(value))
                }

                /** An enum containing [ExternalStatus]'s known values. */
                enum class Known {
                    DRAFT,
                    FINALIZED,
                    PAID,
                    PARTIALLY_PAID,
                    UNCOLLECTIBLE,
                    VOID,
                    DELETED,
                    PAYMENT_FAILED,
                    INVALID_REQUEST_ERROR,
                    SKIPPED,
                    SENT,
                    QUEUED,
                }

                /**
                 * An enum containing [ExternalStatus]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [ExternalStatus] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    DRAFT,
                    FINALIZED,
                    PAID,
                    PARTIALLY_PAID,
                    UNCOLLECTIBLE,
                    VOID,
                    DELETED,
                    PAYMENT_FAILED,
                    INVALID_REQUEST_ERROR,
                    SKIPPED,
                    SENT,
                    QUEUED,
                    /**
                     * An enum member indicating that [ExternalStatus] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        DRAFT -> Value.DRAFT
                        FINALIZED -> Value.FINALIZED
                        PAID -> Value.PAID
                        PARTIALLY_PAID -> Value.PARTIALLY_PAID
                        UNCOLLECTIBLE -> Value.UNCOLLECTIBLE
                        VOID -> Value.VOID
                        DELETED -> Value.DELETED
                        PAYMENT_FAILED -> Value.PAYMENT_FAILED
                        INVALID_REQUEST_ERROR -> Value.INVALID_REQUEST_ERROR
                        SKIPPED -> Value.SKIPPED
                        SENT -> Value.SENT
                        QUEUED -> Value.QUEUED
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        DRAFT -> Known.DRAFT
                        FINALIZED -> Known.FINALIZED
                        PAID -> Known.PAID
                        PARTIALLY_PAID -> Known.PARTIALLY_PAID
                        UNCOLLECTIBLE -> Known.UNCOLLECTIBLE
                        VOID -> Known.VOID
                        DELETED -> Known.DELETED
                        PAYMENT_FAILED -> Known.PAYMENT_FAILED
                        INVALID_REQUEST_ERROR -> Known.INVALID_REQUEST_ERROR
                        SKIPPED -> Known.SKIPPED
                        SENT -> Known.SENT
                        QUEUED -> Known.QUEUED
                        else ->
                            throw MetronomeInvalidDataException("Unknown ExternalStatus: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws MetronomeInvalidDataException if this class instance's value does not
                 *   have the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        MetronomeInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): ExternalStatus = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ExternalStatus && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Tax details for the invoice, if available from the billing provider. */
            class Tax
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val totalTaxAmount: JsonField<Double>,
                private val totalTaxableAmount: JsonField<Double>,
                private val transactionId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("total_tax_amount")
                    @ExcludeMissing
                    totalTaxAmount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("total_taxable_amount")
                    @ExcludeMissing
                    totalTaxableAmount: JsonField<Double> = JsonMissing.of(),
                    @JsonProperty("transaction_id")
                    @ExcludeMissing
                    transactionId: JsonField<String> = JsonMissing.of(),
                ) : this(totalTaxAmount, totalTaxableAmount, transactionId, mutableMapOf())

                /**
                 * The total tax amount applied to the invoice.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun totalTaxAmount(): Optional<Double> =
                    totalTaxAmount.getOptional("total_tax_amount")

                /**
                 * The total taxable amount of the invoice.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun totalTaxableAmount(): Optional<Double> =
                    totalTaxableAmount.getOptional("total_taxable_amount")

                /**
                 * The transaction ID associated with the tax calculation.
                 *
                 * @throws MetronomeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun transactionId(): Optional<String> = transactionId.getOptional("transaction_id")

                /**
                 * Returns the raw JSON value of [totalTaxAmount].
                 *
                 * Unlike [totalTaxAmount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("total_tax_amount")
                @ExcludeMissing
                fun _totalTaxAmount(): JsonField<Double> = totalTaxAmount

                /**
                 * Returns the raw JSON value of [totalTaxableAmount].
                 *
                 * Unlike [totalTaxableAmount], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("total_taxable_amount")
                @ExcludeMissing
                fun _totalTaxableAmount(): JsonField<Double> = totalTaxableAmount

                /**
                 * Returns the raw JSON value of [transactionId].
                 *
                 * Unlike [transactionId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("transaction_id")
                @ExcludeMissing
                fun _transactionId(): JsonField<String> = transactionId

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /** Returns a mutable builder for constructing an instance of [Tax]. */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Tax]. */
                class Builder internal constructor() {

                    private var totalTaxAmount: JsonField<Double> = JsonMissing.of()
                    private var totalTaxableAmount: JsonField<Double> = JsonMissing.of()
                    private var transactionId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(tax: Tax) = apply {
                        totalTaxAmount = tax.totalTaxAmount
                        totalTaxableAmount = tax.totalTaxableAmount
                        transactionId = tax.transactionId
                        additionalProperties = tax.additionalProperties.toMutableMap()
                    }

                    /** The total tax amount applied to the invoice. */
                    fun totalTaxAmount(totalTaxAmount: Double) =
                        totalTaxAmount(JsonField.of(totalTaxAmount))

                    /**
                     * Sets [Builder.totalTaxAmount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.totalTaxAmount] with a well-typed [Double]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun totalTaxAmount(totalTaxAmount: JsonField<Double>) = apply {
                        this.totalTaxAmount = totalTaxAmount
                    }

                    /** The total taxable amount of the invoice. */
                    fun totalTaxableAmount(totalTaxableAmount: Double) =
                        totalTaxableAmount(JsonField.of(totalTaxableAmount))

                    /**
                     * Sets [Builder.totalTaxableAmount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.totalTaxableAmount] with a well-typed
                     * [Double] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun totalTaxableAmount(totalTaxableAmount: JsonField<Double>) = apply {
                        this.totalTaxableAmount = totalTaxableAmount
                    }

                    /** The transaction ID associated with the tax calculation. */
                    fun transactionId(transactionId: String) =
                        transactionId(JsonField.of(transactionId))

                    /**
                     * Sets [Builder.transactionId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.transactionId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun transactionId(transactionId: JsonField<String>) = apply {
                        this.transactionId = transactionId
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Tax].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     */
                    fun build(): Tax =
                        Tax(
                            totalTaxAmount,
                            totalTaxableAmount,
                            transactionId,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws MetronomeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Tax = apply {
                    if (validated) {
                        return@apply
                    }

                    totalTaxAmount()
                    totalTaxableAmount()
                    transactionId()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: MetronomeInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (totalTaxAmount.asKnown().isPresent) 1 else 0) +
                        (if (totalTaxableAmount.asKnown().isPresent) 1 else 0) +
                        (if (transactionId.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Tax &&
                        totalTaxAmount == other.totalTaxAmount &&
                        totalTaxableAmount == other.totalTaxableAmount &&
                        transactionId == other.transactionId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        totalTaxAmount,
                        totalTaxableAmount,
                        transactionId,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Tax{totalTaxAmount=$totalTaxAmount, totalTaxableAmount=$totalTaxableAmount, transactionId=$transactionId, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CorrectedExternalInvoice &&
                    billingProviderType == other.billingProviderType &&
                    billingProviderError == other.billingProviderError &&
                    externalPaymentId == other.externalPaymentId &&
                    externalStatus == other.externalStatus &&
                    invoiceId == other.invoiceId &&
                    invoicedSubTotal == other.invoicedSubTotal &&
                    invoicedTotal == other.invoicedTotal &&
                    issuedAtTimestamp == other.issuedAtTimestamp &&
                    pdfUrl == other.pdfUrl &&
                    tax == other.tax &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    billingProviderType,
                    billingProviderError,
                    externalPaymentId,
                    externalStatus,
                    invoiceId,
                    invoicedSubTotal,
                    invoicedTotal,
                    issuedAtTimestamp,
                    pdfUrl,
                    tax,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CorrectedExternalInvoice{billingProviderType=$billingProviderType, billingProviderError=$billingProviderError, externalPaymentId=$externalPaymentId, externalStatus=$externalStatus, invoiceId=$invoiceId, invoicedSubTotal=$invoicedSubTotal, invoicedTotal=$invoicedTotal, issuedAtTimestamp=$issuedAtTimestamp, pdfUrl=$pdfUrl, tax=$tax, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CorrectionRecord &&
                correctedInvoiceId == other.correctedInvoiceId &&
                memo == other.memo &&
                reason == other.reason &&
                correctedExternalInvoice == other.correctedExternalInvoice &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                correctedInvoiceId,
                memo,
                reason,
                correctedExternalInvoice,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CorrectionRecord{correctedInvoiceId=$correctedInvoiceId, memo=$memo, reason=$reason, correctedExternalInvoice=$correctedExternalInvoice, additionalProperties=$additionalProperties}"
    }

    class CustomFields
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [CustomFields]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CustomFields]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customFields: CustomFields) = apply {
                additionalProperties = customFields.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [CustomFields].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): CustomFields = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CustomFields && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
    }

    /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
    class CustomerCustomFields
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [CustomerCustomFields]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CustomerCustomFields]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customerCustomFields: CustomerCustomFields) = apply {
                additionalProperties = customerCustomFields.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [CustomerCustomFields].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): CustomerCustomFields =
                CustomerCustomFields(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): CustomerCustomFields = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CustomerCustomFields &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "CustomerCustomFields{additionalProperties=$additionalProperties}"
    }

    class ExternalInvoice
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val billingProviderType: JsonField<BillingProviderType>,
        private val billingProviderError: JsonField<String>,
        private val externalPaymentId: JsonField<String>,
        private val externalStatus: JsonField<ExternalStatus>,
        private val invoiceId: JsonField<String>,
        private val invoicedSubTotal: JsonField<Double>,
        private val invoicedTotal: JsonField<Double>,
        private val issuedAtTimestamp: JsonField<OffsetDateTime>,
        private val pdfUrl: JsonField<String>,
        private val tax: JsonField<Tax>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("billing_provider_type")
            @ExcludeMissing
            billingProviderType: JsonField<BillingProviderType> = JsonMissing.of(),
            @JsonProperty("billing_provider_error")
            @ExcludeMissing
            billingProviderError: JsonField<String> = JsonMissing.of(),
            @JsonProperty("external_payment_id")
            @ExcludeMissing
            externalPaymentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("external_status")
            @ExcludeMissing
            externalStatus: JsonField<ExternalStatus> = JsonMissing.of(),
            @JsonProperty("invoice_id")
            @ExcludeMissing
            invoiceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("invoiced_sub_total")
            @ExcludeMissing
            invoicedSubTotal: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("invoiced_total")
            @ExcludeMissing
            invoicedTotal: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("issued_at_timestamp")
            @ExcludeMissing
            issuedAtTimestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("pdf_url") @ExcludeMissing pdfUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tax") @ExcludeMissing tax: JsonField<Tax> = JsonMissing.of(),
        ) : this(
            billingProviderType,
            billingProviderError,
            externalPaymentId,
            externalStatus,
            invoiceId,
            invoicedSubTotal,
            invoicedTotal,
            issuedAtTimestamp,
            pdfUrl,
            tax,
            mutableMapOf(),
        )

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun billingProviderType(): BillingProviderType =
            billingProviderType.getRequired("billing_provider_type")

        /**
         * Error message from the billing provider, if available.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun billingProviderError(): Optional<String> =
            billingProviderError.getOptional("billing_provider_error")

        /**
         * The ID of the payment in the external system, if available.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun externalPaymentId(): Optional<String> =
            externalPaymentId.getOptional("external_payment_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun externalStatus(): Optional<ExternalStatus> =
            externalStatus.getOptional("external_status")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun invoiceId(): Optional<String> = invoiceId.getOptional("invoice_id")

        /**
         * The subtotal amount invoiced, if available from the billing provider.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun invoicedSubTotal(): Optional<Double> =
            invoicedSubTotal.getOptional("invoiced_sub_total")

        /**
         * The total amount invoiced, if available from the billing provider.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun invoicedTotal(): Optional<Double> = invoicedTotal.getOptional("invoiced_total")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun issuedAtTimestamp(): Optional<OffsetDateTime> =
            issuedAtTimestamp.getOptional("issued_at_timestamp")

        /**
         * A URL to the PDF of the invoice, if available from the billing provider.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun pdfUrl(): Optional<String> = pdfUrl.getOptional("pdf_url")

        /**
         * Tax details for the invoice, if available from the billing provider.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun tax(): Optional<Tax> = tax.getOptional("tax")

        /**
         * Returns the raw JSON value of [billingProviderType].
         *
         * Unlike [billingProviderType], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("billing_provider_type")
        @ExcludeMissing
        fun _billingProviderType(): JsonField<BillingProviderType> = billingProviderType

        /**
         * Returns the raw JSON value of [billingProviderError].
         *
         * Unlike [billingProviderError], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("billing_provider_error")
        @ExcludeMissing
        fun _billingProviderError(): JsonField<String> = billingProviderError

        /**
         * Returns the raw JSON value of [externalPaymentId].
         *
         * Unlike [externalPaymentId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("external_payment_id")
        @ExcludeMissing
        fun _externalPaymentId(): JsonField<String> = externalPaymentId

        /**
         * Returns the raw JSON value of [externalStatus].
         *
         * Unlike [externalStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("external_status")
        @ExcludeMissing
        fun _externalStatus(): JsonField<ExternalStatus> = externalStatus

        /**
         * Returns the raw JSON value of [invoiceId].
         *
         * Unlike [invoiceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId(): JsonField<String> = invoiceId

        /**
         * Returns the raw JSON value of [invoicedSubTotal].
         *
         * Unlike [invoicedSubTotal], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("invoiced_sub_total")
        @ExcludeMissing
        fun _invoicedSubTotal(): JsonField<Double> = invoicedSubTotal

        /**
         * Returns the raw JSON value of [invoicedTotal].
         *
         * Unlike [invoicedTotal], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("invoiced_total")
        @ExcludeMissing
        fun _invoicedTotal(): JsonField<Double> = invoicedTotal

        /**
         * Returns the raw JSON value of [issuedAtTimestamp].
         *
         * Unlike [issuedAtTimestamp], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("issued_at_timestamp")
        @ExcludeMissing
        fun _issuedAtTimestamp(): JsonField<OffsetDateTime> = issuedAtTimestamp

        /**
         * Returns the raw JSON value of [pdfUrl].
         *
         * Unlike [pdfUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pdf_url") @ExcludeMissing fun _pdfUrl(): JsonField<String> = pdfUrl

        /**
         * Returns the raw JSON value of [tax].
         *
         * Unlike [tax], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tax") @ExcludeMissing fun _tax(): JsonField<Tax> = tax

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [ExternalInvoice].
             *
             * The following fields are required:
             * ```java
             * .billingProviderType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ExternalInvoice]. */
        class Builder internal constructor() {

            private var billingProviderType: JsonField<BillingProviderType>? = null
            private var billingProviderError: JsonField<String> = JsonMissing.of()
            private var externalPaymentId: JsonField<String> = JsonMissing.of()
            private var externalStatus: JsonField<ExternalStatus> = JsonMissing.of()
            private var invoiceId: JsonField<String> = JsonMissing.of()
            private var invoicedSubTotal: JsonField<Double> = JsonMissing.of()
            private var invoicedTotal: JsonField<Double> = JsonMissing.of()
            private var issuedAtTimestamp: JsonField<OffsetDateTime> = JsonMissing.of()
            private var pdfUrl: JsonField<String> = JsonMissing.of()
            private var tax: JsonField<Tax> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(externalInvoice: ExternalInvoice) = apply {
                billingProviderType = externalInvoice.billingProviderType
                billingProviderError = externalInvoice.billingProviderError
                externalPaymentId = externalInvoice.externalPaymentId
                externalStatus = externalInvoice.externalStatus
                invoiceId = externalInvoice.invoiceId
                invoicedSubTotal = externalInvoice.invoicedSubTotal
                invoicedTotal = externalInvoice.invoicedTotal
                issuedAtTimestamp = externalInvoice.issuedAtTimestamp
                pdfUrl = externalInvoice.pdfUrl
                tax = externalInvoice.tax
                additionalProperties = externalInvoice.additionalProperties.toMutableMap()
            }

            fun billingProviderType(billingProviderType: BillingProviderType) =
                billingProviderType(JsonField.of(billingProviderType))

            /**
             * Sets [Builder.billingProviderType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingProviderType] with a well-typed
             * [BillingProviderType] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun billingProviderType(billingProviderType: JsonField<BillingProviderType>) = apply {
                this.billingProviderType = billingProviderType
            }

            /** Error message from the billing provider, if available. */
            fun billingProviderError(billingProviderError: String) =
                billingProviderError(JsonField.of(billingProviderError))

            /**
             * Sets [Builder.billingProviderError] to an arbitrary JSON value.
             *
             * You should usually call [Builder.billingProviderError] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun billingProviderError(billingProviderError: JsonField<String>) = apply {
                this.billingProviderError = billingProviderError
            }

            /** The ID of the payment in the external system, if available. */
            fun externalPaymentId(externalPaymentId: String) =
                externalPaymentId(JsonField.of(externalPaymentId))

            /**
             * Sets [Builder.externalPaymentId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalPaymentId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun externalPaymentId(externalPaymentId: JsonField<String>) = apply {
                this.externalPaymentId = externalPaymentId
            }

            fun externalStatus(externalStatus: ExternalStatus) =
                externalStatus(JsonField.of(externalStatus))

            /**
             * Sets [Builder.externalStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.externalStatus] with a well-typed [ExternalStatus]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun externalStatus(externalStatus: JsonField<ExternalStatus>) = apply {
                this.externalStatus = externalStatus
            }

            fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

            /**
             * Sets [Builder.invoiceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invoiceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

            /** The subtotal amount invoiced, if available from the billing provider. */
            fun invoicedSubTotal(invoicedSubTotal: Double) =
                invoicedSubTotal(JsonField.of(invoicedSubTotal))

            /**
             * Sets [Builder.invoicedSubTotal] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invoicedSubTotal] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun invoicedSubTotal(invoicedSubTotal: JsonField<Double>) = apply {
                this.invoicedSubTotal = invoicedSubTotal
            }

            /** The total amount invoiced, if available from the billing provider. */
            fun invoicedTotal(invoicedTotal: Double) = invoicedTotal(JsonField.of(invoicedTotal))

            /**
             * Sets [Builder.invoicedTotal] to an arbitrary JSON value.
             *
             * You should usually call [Builder.invoicedTotal] with a well-typed [Double] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun invoicedTotal(invoicedTotal: JsonField<Double>) = apply {
                this.invoicedTotal = invoicedTotal
            }

            fun issuedAtTimestamp(issuedAtTimestamp: OffsetDateTime) =
                issuedAtTimestamp(JsonField.of(issuedAtTimestamp))

            /**
             * Sets [Builder.issuedAtTimestamp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.issuedAtTimestamp] with a well-typed
             * [OffsetDateTime] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun issuedAtTimestamp(issuedAtTimestamp: JsonField<OffsetDateTime>) = apply {
                this.issuedAtTimestamp = issuedAtTimestamp
            }

            /** A URL to the PDF of the invoice, if available from the billing provider. */
            fun pdfUrl(pdfUrl: String) = pdfUrl(JsonField.of(pdfUrl))

            /**
             * Sets [Builder.pdfUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pdfUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pdfUrl(pdfUrl: JsonField<String>) = apply { this.pdfUrl = pdfUrl }

            /** Tax details for the invoice, if available from the billing provider. */
            fun tax(tax: Tax) = tax(JsonField.of(tax))

            /**
             * Sets [Builder.tax] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tax] with a well-typed [Tax] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tax(tax: JsonField<Tax>) = apply { this.tax = tax }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [ExternalInvoice].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .billingProviderType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ExternalInvoice =
                ExternalInvoice(
                    checkRequired("billingProviderType", billingProviderType),
                    billingProviderError,
                    externalPaymentId,
                    externalStatus,
                    invoiceId,
                    invoicedSubTotal,
                    invoicedTotal,
                    issuedAtTimestamp,
                    pdfUrl,
                    tax,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): ExternalInvoice = apply {
            if (validated) {
                return@apply
            }

            billingProviderType().validate()
            billingProviderError()
            externalPaymentId()
            externalStatus().ifPresent { it.validate() }
            invoiceId()
            invoicedSubTotal()
            invoicedTotal()
            issuedAtTimestamp()
            pdfUrl()
            tax().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (billingProviderType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (billingProviderError.asKnown().isPresent) 1 else 0) +
                (if (externalPaymentId.asKnown().isPresent) 1 else 0) +
                (externalStatus.asKnown().getOrNull()?.validity() ?: 0) +
                (if (invoiceId.asKnown().isPresent) 1 else 0) +
                (if (invoicedSubTotal.asKnown().isPresent) 1 else 0) +
                (if (invoicedTotal.asKnown().isPresent) 1 else 0) +
                (if (issuedAtTimestamp.asKnown().isPresent) 1 else 0) +
                (if (pdfUrl.asKnown().isPresent) 1 else 0) +
                (tax.asKnown().getOrNull()?.validity() ?: 0)

        class BillingProviderType
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val AWS_MARKETPLACE = of("aws_marketplace")

                @JvmField val STRIPE = of("stripe")

                @JvmField val NETSUITE = of("netsuite")

                @JvmField val CUSTOM = of("custom")

                @JvmField val AZURE_MARKETPLACE = of("azure_marketplace")

                @JvmField val QUICKBOOKS_ONLINE = of("quickbooks_online")

                @JvmField val WORKDAY = of("workday")

                @JvmField val GCP_MARKETPLACE = of("gcp_marketplace")

                @JvmField val METRONOME = of("metronome")

                @JvmStatic fun of(value: String) = BillingProviderType(JsonField.of(value))
            }

            /** An enum containing [BillingProviderType]'s known values. */
            enum class Known {
                AWS_MARKETPLACE,
                STRIPE,
                NETSUITE,
                CUSTOM,
                AZURE_MARKETPLACE,
                QUICKBOOKS_ONLINE,
                WORKDAY,
                GCP_MARKETPLACE,
                METRONOME,
            }

            /**
             * An enum containing [BillingProviderType]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [BillingProviderType] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AWS_MARKETPLACE,
                STRIPE,
                NETSUITE,
                CUSTOM,
                AZURE_MARKETPLACE,
                QUICKBOOKS_ONLINE,
                WORKDAY,
                GCP_MARKETPLACE,
                METRONOME,
                /**
                 * An enum member indicating that [BillingProviderType] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    AWS_MARKETPLACE -> Value.AWS_MARKETPLACE
                    STRIPE -> Value.STRIPE
                    NETSUITE -> Value.NETSUITE
                    CUSTOM -> Value.CUSTOM
                    AZURE_MARKETPLACE -> Value.AZURE_MARKETPLACE
                    QUICKBOOKS_ONLINE -> Value.QUICKBOOKS_ONLINE
                    WORKDAY -> Value.WORKDAY
                    GCP_MARKETPLACE -> Value.GCP_MARKETPLACE
                    METRONOME -> Value.METRONOME
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    AWS_MARKETPLACE -> Known.AWS_MARKETPLACE
                    STRIPE -> Known.STRIPE
                    NETSUITE -> Known.NETSUITE
                    CUSTOM -> Known.CUSTOM
                    AZURE_MARKETPLACE -> Known.AZURE_MARKETPLACE
                    QUICKBOOKS_ONLINE -> Known.QUICKBOOKS_ONLINE
                    WORKDAY -> Known.WORKDAY
                    GCP_MARKETPLACE -> Known.GCP_MARKETPLACE
                    METRONOME -> Known.METRONOME
                    else ->
                        throw MetronomeInvalidDataException("Unknown BillingProviderType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): BillingProviderType = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is BillingProviderType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class ExternalStatus
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val DRAFT = of("DRAFT")

                @JvmField val FINALIZED = of("FINALIZED")

                @JvmField val PAID = of("PAID")

                @JvmField val PARTIALLY_PAID = of("PARTIALLY_PAID")

                @JvmField val UNCOLLECTIBLE = of("UNCOLLECTIBLE")

                @JvmField val VOID = of("VOID")

                @JvmField val DELETED = of("DELETED")

                @JvmField val PAYMENT_FAILED = of("PAYMENT_FAILED")

                @JvmField val INVALID_REQUEST_ERROR = of("INVALID_REQUEST_ERROR")

                @JvmField val SKIPPED = of("SKIPPED")

                @JvmField val SENT = of("SENT")

                @JvmField val QUEUED = of("QUEUED")

                @JvmStatic fun of(value: String) = ExternalStatus(JsonField.of(value))
            }

            /** An enum containing [ExternalStatus]'s known values. */
            enum class Known {
                DRAFT,
                FINALIZED,
                PAID,
                PARTIALLY_PAID,
                UNCOLLECTIBLE,
                VOID,
                DELETED,
                PAYMENT_FAILED,
                INVALID_REQUEST_ERROR,
                SKIPPED,
                SENT,
                QUEUED,
            }

            /**
             * An enum containing [ExternalStatus]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ExternalStatus] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                DRAFT,
                FINALIZED,
                PAID,
                PARTIALLY_PAID,
                UNCOLLECTIBLE,
                VOID,
                DELETED,
                PAYMENT_FAILED,
                INVALID_REQUEST_ERROR,
                SKIPPED,
                SENT,
                QUEUED,
                /**
                 * An enum member indicating that [ExternalStatus] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    DRAFT -> Value.DRAFT
                    FINALIZED -> Value.FINALIZED
                    PAID -> Value.PAID
                    PARTIALLY_PAID -> Value.PARTIALLY_PAID
                    UNCOLLECTIBLE -> Value.UNCOLLECTIBLE
                    VOID -> Value.VOID
                    DELETED -> Value.DELETED
                    PAYMENT_FAILED -> Value.PAYMENT_FAILED
                    INVALID_REQUEST_ERROR -> Value.INVALID_REQUEST_ERROR
                    SKIPPED -> Value.SKIPPED
                    SENT -> Value.SENT
                    QUEUED -> Value.QUEUED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    DRAFT -> Known.DRAFT
                    FINALIZED -> Known.FINALIZED
                    PAID -> Known.PAID
                    PARTIALLY_PAID -> Known.PARTIALLY_PAID
                    UNCOLLECTIBLE -> Known.UNCOLLECTIBLE
                    VOID -> Known.VOID
                    DELETED -> Known.DELETED
                    PAYMENT_FAILED -> Known.PAYMENT_FAILED
                    INVALID_REQUEST_ERROR -> Known.INVALID_REQUEST_ERROR
                    SKIPPED -> Known.SKIPPED
                    SENT -> Known.SENT
                    QUEUED -> Known.QUEUED
                    else -> throw MetronomeInvalidDataException("Unknown ExternalStatus: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): ExternalStatus = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ExternalStatus && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Tax details for the invoice, if available from the billing provider. */
        class Tax
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val totalTaxAmount: JsonField<Double>,
            private val totalTaxableAmount: JsonField<Double>,
            private val transactionId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("total_tax_amount")
                @ExcludeMissing
                totalTaxAmount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("total_taxable_amount")
                @ExcludeMissing
                totalTaxableAmount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("transaction_id")
                @ExcludeMissing
                transactionId: JsonField<String> = JsonMissing.of(),
            ) : this(totalTaxAmount, totalTaxableAmount, transactionId, mutableMapOf())

            /**
             * The total tax amount applied to the invoice.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun totalTaxAmount(): Optional<Double> = totalTaxAmount.getOptional("total_tax_amount")

            /**
             * The total taxable amount of the invoice.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun totalTaxableAmount(): Optional<Double> =
                totalTaxableAmount.getOptional("total_taxable_amount")

            /**
             * The transaction ID associated with the tax calculation.
             *
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun transactionId(): Optional<String> = transactionId.getOptional("transaction_id")

            /**
             * Returns the raw JSON value of [totalTaxAmount].
             *
             * Unlike [totalTaxAmount], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("total_tax_amount")
            @ExcludeMissing
            fun _totalTaxAmount(): JsonField<Double> = totalTaxAmount

            /**
             * Returns the raw JSON value of [totalTaxableAmount].
             *
             * Unlike [totalTaxableAmount], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("total_taxable_amount")
            @ExcludeMissing
            fun _totalTaxableAmount(): JsonField<Double> = totalTaxableAmount

            /**
             * Returns the raw JSON value of [transactionId].
             *
             * Unlike [transactionId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("transaction_id")
            @ExcludeMissing
            fun _transactionId(): JsonField<String> = transactionId

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [Tax]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Tax]. */
            class Builder internal constructor() {

                private var totalTaxAmount: JsonField<Double> = JsonMissing.of()
                private var totalTaxableAmount: JsonField<Double> = JsonMissing.of()
                private var transactionId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(tax: Tax) = apply {
                    totalTaxAmount = tax.totalTaxAmount
                    totalTaxableAmount = tax.totalTaxableAmount
                    transactionId = tax.transactionId
                    additionalProperties = tax.additionalProperties.toMutableMap()
                }

                /** The total tax amount applied to the invoice. */
                fun totalTaxAmount(totalTaxAmount: Double) =
                    totalTaxAmount(JsonField.of(totalTaxAmount))

                /**
                 * Sets [Builder.totalTaxAmount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.totalTaxAmount] with a well-typed [Double] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun totalTaxAmount(totalTaxAmount: JsonField<Double>) = apply {
                    this.totalTaxAmount = totalTaxAmount
                }

                /** The total taxable amount of the invoice. */
                fun totalTaxableAmount(totalTaxableAmount: Double) =
                    totalTaxableAmount(JsonField.of(totalTaxableAmount))

                /**
                 * Sets [Builder.totalTaxableAmount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.totalTaxableAmount] with a well-typed [Double]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun totalTaxableAmount(totalTaxableAmount: JsonField<Double>) = apply {
                    this.totalTaxableAmount = totalTaxableAmount
                }

                /** The transaction ID associated with the tax calculation. */
                fun transactionId(transactionId: String) =
                    transactionId(JsonField.of(transactionId))

                /**
                 * Sets [Builder.transactionId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.transactionId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun transactionId(transactionId: JsonField<String>) = apply {
                    this.transactionId = transactionId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Tax].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Tax =
                    Tax(
                        totalTaxAmount,
                        totalTaxableAmount,
                        transactionId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Tax = apply {
                if (validated) {
                    return@apply
                }

                totalTaxAmount()
                totalTaxableAmount()
                transactionId()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (totalTaxAmount.asKnown().isPresent) 1 else 0) +
                    (if (totalTaxableAmount.asKnown().isPresent) 1 else 0) +
                    (if (transactionId.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Tax &&
                    totalTaxAmount == other.totalTaxAmount &&
                    totalTaxableAmount == other.totalTaxableAmount &&
                    transactionId == other.transactionId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    totalTaxAmount,
                    totalTaxableAmount,
                    transactionId,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Tax{totalTaxAmount=$totalTaxAmount, totalTaxableAmount=$totalTaxableAmount, transactionId=$transactionId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ExternalInvoice &&
                billingProviderType == other.billingProviderType &&
                billingProviderError == other.billingProviderError &&
                externalPaymentId == other.externalPaymentId &&
                externalStatus == other.externalStatus &&
                invoiceId == other.invoiceId &&
                invoicedSubTotal == other.invoicedSubTotal &&
                invoicedTotal == other.invoicedTotal &&
                issuedAtTimestamp == other.issuedAtTimestamp &&
                pdfUrl == other.pdfUrl &&
                tax == other.tax &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                billingProviderType,
                billingProviderError,
                externalPaymentId,
                externalStatus,
                invoiceId,
                invoicedSubTotal,
                invoicedTotal,
                issuedAtTimestamp,
                pdfUrl,
                tax,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ExternalInvoice{billingProviderType=$billingProviderType, billingProviderError=$billingProviderError, externalPaymentId=$externalPaymentId, externalStatus=$externalStatus, invoiceId=$invoiceId, invoicedSubTotal=$invoicedSubTotal, invoicedTotal=$invoicedTotal, issuedAtTimestamp=$issuedAtTimestamp, pdfUrl=$pdfUrl, tax=$tax, additionalProperties=$additionalProperties}"
    }

    class InvoiceAdjustment
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val creditType: JsonField<CreditTypeData>,
        private val name: JsonField<String>,
        private val total: JsonField<Double>,
        private val creditGrantCustomFields: JsonField<CreditGrantCustomFields>,
        private val creditGrantId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("credit_type")
            @ExcludeMissing
            creditType: JsonField<CreditTypeData> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("total") @ExcludeMissing total: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("credit_grant_custom_fields")
            @ExcludeMissing
            creditGrantCustomFields: JsonField<CreditGrantCustomFields> = JsonMissing.of(),
            @JsonProperty("credit_grant_id")
            @ExcludeMissing
            creditGrantId: JsonField<String> = JsonMissing.of(),
        ) : this(creditType, name, total, creditGrantCustomFields, creditGrantId, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun creditType(): CreditTypeData = creditType.getRequired("credit_type")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun name(): String = name.getRequired("name")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun total(): Double = total.getRequired("total")

        /**
         * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun creditGrantCustomFields(): Optional<CreditGrantCustomFields> =
            creditGrantCustomFields.getOptional("credit_grant_custom_fields")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun creditGrantId(): Optional<String> = creditGrantId.getOptional("credit_grant_id")

        /**
         * Returns the raw JSON value of [creditType].
         *
         * Unlike [creditType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("credit_type")
        @ExcludeMissing
        fun _creditType(): JsonField<CreditTypeData> = creditType

        /**
         * Returns the raw JSON value of [name].
         *
         * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        /**
         * Returns the raw JSON value of [total].
         *
         * Unlike [total], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Double> = total

        /**
         * Returns the raw JSON value of [creditGrantCustomFields].
         *
         * Unlike [creditGrantCustomFields], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("credit_grant_custom_fields")
        @ExcludeMissing
        fun _creditGrantCustomFields(): JsonField<CreditGrantCustomFields> = creditGrantCustomFields

        /**
         * Returns the raw JSON value of [creditGrantId].
         *
         * Unlike [creditGrantId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("credit_grant_id")
        @ExcludeMissing
        fun _creditGrantId(): JsonField<String> = creditGrantId

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [InvoiceAdjustment].
             *
             * The following fields are required:
             * ```java
             * .creditType()
             * .name()
             * .total()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [InvoiceAdjustment]. */
        class Builder internal constructor() {

            private var creditType: JsonField<CreditTypeData>? = null
            private var name: JsonField<String>? = null
            private var total: JsonField<Double>? = null
            private var creditGrantCustomFields: JsonField<CreditGrantCustomFields> =
                JsonMissing.of()
            private var creditGrantId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(invoiceAdjustment: InvoiceAdjustment) = apply {
                creditType = invoiceAdjustment.creditType
                name = invoiceAdjustment.name
                total = invoiceAdjustment.total
                creditGrantCustomFields = invoiceAdjustment.creditGrantCustomFields
                creditGrantId = invoiceAdjustment.creditGrantId
                additionalProperties = invoiceAdjustment.additionalProperties.toMutableMap()
            }

            fun creditType(creditType: CreditTypeData) = creditType(JsonField.of(creditType))

            /**
             * Sets [Builder.creditType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditType] with a well-typed [CreditTypeData] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creditType(creditType: JsonField<CreditTypeData>) = apply {
                this.creditType = creditType
            }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun total(total: Double) = total(JsonField.of(total))

            /**
             * Sets [Builder.total] to an arbitrary JSON value.
             *
             * You should usually call [Builder.total] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun total(total: JsonField<Double>) = apply { this.total = total }

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun creditGrantCustomFields(creditGrantCustomFields: CreditGrantCustomFields) =
                creditGrantCustomFields(JsonField.of(creditGrantCustomFields))

            /**
             * Sets [Builder.creditGrantCustomFields] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditGrantCustomFields] with a well-typed
             * [CreditGrantCustomFields] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun creditGrantCustomFields(
                creditGrantCustomFields: JsonField<CreditGrantCustomFields>
            ) = apply { this.creditGrantCustomFields = creditGrantCustomFields }

            fun creditGrantId(creditGrantId: String) = creditGrantId(JsonField.of(creditGrantId))

            /**
             * Sets [Builder.creditGrantId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.creditGrantId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun creditGrantId(creditGrantId: JsonField<String>) = apply {
                this.creditGrantId = creditGrantId
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [InvoiceAdjustment].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .creditType()
             * .name()
             * .total()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): InvoiceAdjustment =
                InvoiceAdjustment(
                    checkRequired("creditType", creditType),
                    checkRequired("name", name),
                    checkRequired("total", total),
                    creditGrantCustomFields,
                    creditGrantId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): InvoiceAdjustment = apply {
            if (validated) {
                return@apply
            }

            creditType().validate()
            name()
            total()
            creditGrantCustomFields().ifPresent { it.validate() }
            creditGrantId()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (creditType.asKnown().getOrNull()?.validity() ?: 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (total.asKnown().isPresent) 1 else 0) +
                (creditGrantCustomFields.asKnown().getOrNull()?.validity() ?: 0) +
                (if (creditGrantId.asKnown().isPresent) 1 else 0)

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        class CreditGrantCustomFields
        @JsonCreator
        private constructor(
            @com.fasterxml.jackson.annotation.JsonValue
            private val additionalProperties: Map<String, JsonValue>
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [CreditGrantCustomFields].
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [CreditGrantCustomFields]. */
            class Builder internal constructor() {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(creditGrantCustomFields: CreditGrantCustomFields) = apply {
                    additionalProperties =
                        creditGrantCustomFields.additionalProperties.toMutableMap()
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [CreditGrantCustomFields].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): CreditGrantCustomFields =
                    CreditGrantCustomFields(additionalProperties.toImmutable())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): CreditGrantCustomFields = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CreditGrantCustomFields &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreditGrantCustomFields{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is InvoiceAdjustment &&
                creditType == other.creditType &&
                name == other.name &&
                total == other.total &&
                creditGrantCustomFields == other.creditGrantCustomFields &&
                creditGrantId == other.creditGrantId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                creditType,
                name,
                total,
                creditGrantCustomFields,
                creditGrantId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InvoiceAdjustment{creditType=$creditType, name=$name, total=$total, creditGrantCustomFields=$creditGrantCustomFields, creditGrantId=$creditGrantId, additionalProperties=$additionalProperties}"
    }

    /**
     * Required for account hierarchy usage invoices. An object containing the contract and customer
     * UUIDs that pay for this invoice.
     */
    class Payer
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val contractId: JsonField<String>,
        private val customerId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("contract_id")
            @ExcludeMissing
            contractId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customer_id")
            @ExcludeMissing
            customerId: JsonField<String> = JsonMissing.of(),
        ) : this(contractId, customerId, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun contractId(): String = contractId.getRequired("contract_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun customerId(): String = customerId.getRequired("customer_id")

        /**
         * Returns the raw JSON value of [contractId].
         *
         * Unlike [contractId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("contract_id")
        @ExcludeMissing
        fun _contractId(): JsonField<String> = contractId

        /**
         * Returns the raw JSON value of [customerId].
         *
         * Unlike [customerId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Payer].
             *
             * The following fields are required:
             * ```java
             * .contractId()
             * .customerId()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Payer]. */
        class Builder internal constructor() {

            private var contractId: JsonField<String>? = null
            private var customerId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(payer: Payer) = apply {
                contractId = payer.contractId
                customerId = payer.customerId
                additionalProperties = payer.additionalProperties.toMutableMap()
            }

            fun contractId(contractId: String) = contractId(JsonField.of(contractId))

            /**
             * Sets [Builder.contractId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.contractId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun contractId(contractId: JsonField<String>) = apply { this.contractId = contractId }

            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            /**
             * Sets [Builder.customerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Payer].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .contractId()
             * .customerId()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Payer =
                Payer(
                    checkRequired("contractId", contractId),
                    checkRequired("customerId", customerId),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Payer = apply {
            if (validated) {
                return@apply
            }

            contractId()
            customerId()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (contractId.asKnown().isPresent) 1 else 0) +
                (if (customerId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Payer &&
                contractId == other.contractId &&
                customerId == other.customerId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(contractId, customerId, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Payer{contractId=$contractId, customerId=$customerId, additionalProperties=$additionalProperties}"
    }

    /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
    class PlanCustomFields
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [PlanCustomFields]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PlanCustomFields]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(planCustomFields: PlanCustomFields) = apply {
                additionalProperties = planCustomFields.additionalProperties.toMutableMap()
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [PlanCustomFields].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): PlanCustomFields = PlanCustomFields(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): PlanCustomFields = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PlanCustomFields && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "PlanCustomFields{additionalProperties=$additionalProperties}"
    }

    /** Only present for contract invoices with reseller royalties. */
    class ResellerRoyalty
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val fraction: JsonField<String>,
        private val netsuiteResellerId: JsonField<String>,
        private val resellerType: JsonField<ResellerType>,
        private val awsOptions: JsonField<AwsOptions>,
        private val gcpOptions: JsonField<GcpOptions>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("fraction")
            @ExcludeMissing
            fraction: JsonField<String> = JsonMissing.of(),
            @JsonProperty("netsuite_reseller_id")
            @ExcludeMissing
            netsuiteResellerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("reseller_type")
            @ExcludeMissing
            resellerType: JsonField<ResellerType> = JsonMissing.of(),
            @JsonProperty("aws_options")
            @ExcludeMissing
            awsOptions: JsonField<AwsOptions> = JsonMissing.of(),
            @JsonProperty("gcp_options")
            @ExcludeMissing
            gcpOptions: JsonField<GcpOptions> = JsonMissing.of(),
        ) : this(fraction, netsuiteResellerId, resellerType, awsOptions, gcpOptions, mutableMapOf())

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fraction(): String = fraction.getRequired("fraction")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun netsuiteResellerId(): String = netsuiteResellerId.getRequired("netsuite_reseller_id")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun resellerType(): ResellerType = resellerType.getRequired("reseller_type")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun awsOptions(): Optional<AwsOptions> = awsOptions.getOptional("aws_options")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun gcpOptions(): Optional<GcpOptions> = gcpOptions.getOptional("gcp_options")

        /**
         * Returns the raw JSON value of [fraction].
         *
         * Unlike [fraction], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("fraction") @ExcludeMissing fun _fraction(): JsonField<String> = fraction

        /**
         * Returns the raw JSON value of [netsuiteResellerId].
         *
         * Unlike [netsuiteResellerId], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("netsuite_reseller_id")
        @ExcludeMissing
        fun _netsuiteResellerId(): JsonField<String> = netsuiteResellerId

        /**
         * Returns the raw JSON value of [resellerType].
         *
         * Unlike [resellerType], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("reseller_type")
        @ExcludeMissing
        fun _resellerType(): JsonField<ResellerType> = resellerType

        /**
         * Returns the raw JSON value of [awsOptions].
         *
         * Unlike [awsOptions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("aws_options")
        @ExcludeMissing
        fun _awsOptions(): JsonField<AwsOptions> = awsOptions

        /**
         * Returns the raw JSON value of [gcpOptions].
         *
         * Unlike [gcpOptions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("gcp_options")
        @ExcludeMissing
        fun _gcpOptions(): JsonField<GcpOptions> = gcpOptions

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [ResellerRoyalty].
             *
             * The following fields are required:
             * ```java
             * .fraction()
             * .netsuiteResellerId()
             * .resellerType()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [ResellerRoyalty]. */
        class Builder internal constructor() {

            private var fraction: JsonField<String>? = null
            private var netsuiteResellerId: JsonField<String>? = null
            private var resellerType: JsonField<ResellerType>? = null
            private var awsOptions: JsonField<AwsOptions> = JsonMissing.of()
            private var gcpOptions: JsonField<GcpOptions> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(resellerRoyalty: ResellerRoyalty) = apply {
                fraction = resellerRoyalty.fraction
                netsuiteResellerId = resellerRoyalty.netsuiteResellerId
                resellerType = resellerRoyalty.resellerType
                awsOptions = resellerRoyalty.awsOptions
                gcpOptions = resellerRoyalty.gcpOptions
                additionalProperties = resellerRoyalty.additionalProperties.toMutableMap()
            }

            fun fraction(fraction: String) = fraction(JsonField.of(fraction))

            /**
             * Sets [Builder.fraction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fraction] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fraction(fraction: JsonField<String>) = apply { this.fraction = fraction }

            fun netsuiteResellerId(netsuiteResellerId: String) =
                netsuiteResellerId(JsonField.of(netsuiteResellerId))

            /**
             * Sets [Builder.netsuiteResellerId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.netsuiteResellerId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun netsuiteResellerId(netsuiteResellerId: JsonField<String>) = apply {
                this.netsuiteResellerId = netsuiteResellerId
            }

            fun resellerType(resellerType: ResellerType) = resellerType(JsonField.of(resellerType))

            /**
             * Sets [Builder.resellerType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.resellerType] with a well-typed [ResellerType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun resellerType(resellerType: JsonField<ResellerType>) = apply {
                this.resellerType = resellerType
            }

            fun awsOptions(awsOptions: AwsOptions) = awsOptions(JsonField.of(awsOptions))

            /**
             * Sets [Builder.awsOptions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.awsOptions] with a well-typed [AwsOptions] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun awsOptions(awsOptions: JsonField<AwsOptions>) = apply {
                this.awsOptions = awsOptions
            }

            fun gcpOptions(gcpOptions: GcpOptions) = gcpOptions(JsonField.of(gcpOptions))

            /**
             * Sets [Builder.gcpOptions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.gcpOptions] with a well-typed [GcpOptions] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun gcpOptions(gcpOptions: JsonField<GcpOptions>) = apply {
                this.gcpOptions = gcpOptions
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [ResellerRoyalty].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .fraction()
             * .netsuiteResellerId()
             * .resellerType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ResellerRoyalty =
                ResellerRoyalty(
                    checkRequired("fraction", fraction),
                    checkRequired("netsuiteResellerId", netsuiteResellerId),
                    checkRequired("resellerType", resellerType),
                    awsOptions,
                    gcpOptions,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): ResellerRoyalty = apply {
            if (validated) {
                return@apply
            }

            fraction()
            netsuiteResellerId()
            resellerType().validate()
            awsOptions().ifPresent { it.validate() }
            gcpOptions().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (fraction.asKnown().isPresent) 1 else 0) +
                (if (netsuiteResellerId.asKnown().isPresent) 1 else 0) +
                (resellerType.asKnown().getOrNull()?.validity() ?: 0) +
                (awsOptions.asKnown().getOrNull()?.validity() ?: 0) +
                (gcpOptions.asKnown().getOrNull()?.validity() ?: 0)

        class ResellerType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val AWS = of("AWS")

                @JvmField val AWS_PRO_SERVICE = of("AWS_PRO_SERVICE")

                @JvmField val GCP = of("GCP")

                @JvmField val GCP_PRO_SERVICE = of("GCP_PRO_SERVICE")

                @JvmStatic fun of(value: String) = ResellerType(JsonField.of(value))
            }

            /** An enum containing [ResellerType]'s known values. */
            enum class Known {
                AWS,
                AWS_PRO_SERVICE,
                GCP,
                GCP_PRO_SERVICE,
            }

            /**
             * An enum containing [ResellerType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ResellerType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AWS,
                AWS_PRO_SERVICE,
                GCP,
                GCP_PRO_SERVICE,
                /**
                 * An enum member indicating that [ResellerType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    AWS -> Value.AWS
                    AWS_PRO_SERVICE -> Value.AWS_PRO_SERVICE
                    GCP -> Value.GCP
                    GCP_PRO_SERVICE -> Value.GCP_PRO_SERVICE
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws MetronomeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    AWS -> Known.AWS
                    AWS_PRO_SERVICE -> Known.AWS_PRO_SERVICE
                    GCP -> Known.GCP
                    GCP_PRO_SERVICE -> Known.GCP_PRO_SERVICE
                    else -> throw MetronomeInvalidDataException("Unknown ResellerType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws MetronomeInvalidDataException if this class instance's value does not have
             *   the expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    MetronomeInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): ResellerType = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ResellerType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class AwsOptions
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val awsAccountNumber: JsonField<String>,
            private val awsOfferId: JsonField<String>,
            private val awsPayerReferenceId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("aws_account_number")
                @ExcludeMissing
                awsAccountNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("aws_offer_id")
                @ExcludeMissing
                awsOfferId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("aws_payer_reference_id")
                @ExcludeMissing
                awsPayerReferenceId: JsonField<String> = JsonMissing.of(),
            ) : this(awsAccountNumber, awsOfferId, awsPayerReferenceId, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun awsAccountNumber(): Optional<String> =
                awsAccountNumber.getOptional("aws_account_number")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun awsOfferId(): Optional<String> = awsOfferId.getOptional("aws_offer_id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun awsPayerReferenceId(): Optional<String> =
                awsPayerReferenceId.getOptional("aws_payer_reference_id")

            /**
             * Returns the raw JSON value of [awsAccountNumber].
             *
             * Unlike [awsAccountNumber], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("aws_account_number")
            @ExcludeMissing
            fun _awsAccountNumber(): JsonField<String> = awsAccountNumber

            /**
             * Returns the raw JSON value of [awsOfferId].
             *
             * Unlike [awsOfferId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("aws_offer_id")
            @ExcludeMissing
            fun _awsOfferId(): JsonField<String> = awsOfferId

            /**
             * Returns the raw JSON value of [awsPayerReferenceId].
             *
             * Unlike [awsPayerReferenceId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("aws_payer_reference_id")
            @ExcludeMissing
            fun _awsPayerReferenceId(): JsonField<String> = awsPayerReferenceId

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [AwsOptions]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AwsOptions]. */
            class Builder internal constructor() {

                private var awsAccountNumber: JsonField<String> = JsonMissing.of()
                private var awsOfferId: JsonField<String> = JsonMissing.of()
                private var awsPayerReferenceId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(awsOptions: AwsOptions) = apply {
                    awsAccountNumber = awsOptions.awsAccountNumber
                    awsOfferId = awsOptions.awsOfferId
                    awsPayerReferenceId = awsOptions.awsPayerReferenceId
                    additionalProperties = awsOptions.additionalProperties.toMutableMap()
                }

                fun awsAccountNumber(awsAccountNumber: String) =
                    awsAccountNumber(JsonField.of(awsAccountNumber))

                /**
                 * Sets [Builder.awsAccountNumber] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.awsAccountNumber] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun awsAccountNumber(awsAccountNumber: JsonField<String>) = apply {
                    this.awsAccountNumber = awsAccountNumber
                }

                fun awsOfferId(awsOfferId: String) = awsOfferId(JsonField.of(awsOfferId))

                /**
                 * Sets [Builder.awsOfferId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.awsOfferId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun awsOfferId(awsOfferId: JsonField<String>) = apply {
                    this.awsOfferId = awsOfferId
                }

                fun awsPayerReferenceId(awsPayerReferenceId: String) =
                    awsPayerReferenceId(JsonField.of(awsPayerReferenceId))

                /**
                 * Sets [Builder.awsPayerReferenceId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.awsPayerReferenceId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun awsPayerReferenceId(awsPayerReferenceId: JsonField<String>) = apply {
                    this.awsPayerReferenceId = awsPayerReferenceId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [AwsOptions].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): AwsOptions =
                    AwsOptions(
                        awsAccountNumber,
                        awsOfferId,
                        awsPayerReferenceId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): AwsOptions = apply {
                if (validated) {
                    return@apply
                }

                awsAccountNumber()
                awsOfferId()
                awsPayerReferenceId()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (awsAccountNumber.asKnown().isPresent) 1 else 0) +
                    (if (awsOfferId.asKnown().isPresent) 1 else 0) +
                    (if (awsPayerReferenceId.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AwsOptions &&
                    awsAccountNumber == other.awsAccountNumber &&
                    awsOfferId == other.awsOfferId &&
                    awsPayerReferenceId == other.awsPayerReferenceId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    awsAccountNumber,
                    awsOfferId,
                    awsPayerReferenceId,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AwsOptions{awsAccountNumber=$awsAccountNumber, awsOfferId=$awsOfferId, awsPayerReferenceId=$awsPayerReferenceId, additionalProperties=$additionalProperties}"
        }

        class GcpOptions
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val gcpAccountId: JsonField<String>,
            private val gcpOfferId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("gcp_account_id")
                @ExcludeMissing
                gcpAccountId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("gcp_offer_id")
                @ExcludeMissing
                gcpOfferId: JsonField<String> = JsonMissing.of(),
            ) : this(gcpAccountId, gcpOfferId, mutableMapOf())

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun gcpAccountId(): Optional<String> = gcpAccountId.getOptional("gcp_account_id")

            /**
             * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun gcpOfferId(): Optional<String> = gcpOfferId.getOptional("gcp_offer_id")

            /**
             * Returns the raw JSON value of [gcpAccountId].
             *
             * Unlike [gcpAccountId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("gcp_account_id")
            @ExcludeMissing
            fun _gcpAccountId(): JsonField<String> = gcpAccountId

            /**
             * Returns the raw JSON value of [gcpOfferId].
             *
             * Unlike [gcpOfferId], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("gcp_offer_id")
            @ExcludeMissing
            fun _gcpOfferId(): JsonField<String> = gcpOfferId

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /** Returns a mutable builder for constructing an instance of [GcpOptions]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [GcpOptions]. */
            class Builder internal constructor() {

                private var gcpAccountId: JsonField<String> = JsonMissing.of()
                private var gcpOfferId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(gcpOptions: GcpOptions) = apply {
                    gcpAccountId = gcpOptions.gcpAccountId
                    gcpOfferId = gcpOptions.gcpOfferId
                    additionalProperties = gcpOptions.additionalProperties.toMutableMap()
                }

                fun gcpAccountId(gcpAccountId: String) = gcpAccountId(JsonField.of(gcpAccountId))

                /**
                 * Sets [Builder.gcpAccountId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.gcpAccountId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun gcpAccountId(gcpAccountId: JsonField<String>) = apply {
                    this.gcpAccountId = gcpAccountId
                }

                fun gcpOfferId(gcpOfferId: String) = gcpOfferId(JsonField.of(gcpOfferId))

                /**
                 * Sets [Builder.gcpOfferId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.gcpOfferId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun gcpOfferId(gcpOfferId: JsonField<String>) = apply {
                    this.gcpOfferId = gcpOfferId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [GcpOptions].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): GcpOptions =
                    GcpOptions(gcpAccountId, gcpOfferId, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws MetronomeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): GcpOptions = apply {
                if (validated) {
                    return@apply
                }

                gcpAccountId()
                gcpOfferId()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: MetronomeInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (gcpAccountId.asKnown().isPresent) 1 else 0) +
                    (if (gcpOfferId.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is GcpOptions &&
                    gcpAccountId == other.gcpAccountId &&
                    gcpOfferId == other.gcpOfferId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(gcpAccountId, gcpOfferId, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "GcpOptions{gcpAccountId=$gcpAccountId, gcpOfferId=$gcpOfferId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ResellerRoyalty &&
                fraction == other.fraction &&
                netsuiteResellerId == other.netsuiteResellerId &&
                resellerType == other.resellerType &&
                awsOptions == other.awsOptions &&
                gcpOptions == other.gcpOptions &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                fraction,
                netsuiteResellerId,
                resellerType,
                awsOptions,
                gcpOptions,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ResellerRoyalty{fraction=$fraction, netsuiteResellerId=$netsuiteResellerId, resellerType=$resellerType, awsOptions=$awsOptions, gcpOptions=$gcpOptions, additionalProperties=$additionalProperties}"
    }

    class RevenueSystemInvoice
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val revenueSystemExternalEntityType: JsonField<String>,
        private val revenueSystemProvider: JsonField<String>,
        private val syncStatus: JsonField<String>,
        private val errorMessage: JsonField<String>,
        private val revenueSystemExternalEntityId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("revenue_system_external_entity_type")
            @ExcludeMissing
            revenueSystemExternalEntityType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("revenue_system_provider")
            @ExcludeMissing
            revenueSystemProvider: JsonField<String> = JsonMissing.of(),
            @JsonProperty("sync_status")
            @ExcludeMissing
            syncStatus: JsonField<String> = JsonMissing.of(),
            @JsonProperty("error_message")
            @ExcludeMissing
            errorMessage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("revenue_system_external_entity_id")
            @ExcludeMissing
            revenueSystemExternalEntityId: JsonField<String> = JsonMissing.of(),
        ) : this(
            revenueSystemExternalEntityType,
            revenueSystemProvider,
            syncStatus,
            errorMessage,
            revenueSystemExternalEntityId,
            mutableMapOf(),
        )

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun revenueSystemExternalEntityType(): String =
            revenueSystemExternalEntityType.getRequired("revenue_system_external_entity_type")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun revenueSystemProvider(): String =
            revenueSystemProvider.getRequired("revenue_system_provider")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun syncStatus(): String = syncStatus.getRequired("sync_status")

        /**
         * The error message from the revenue system, if available.
         *
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun errorMessage(): Optional<String> = errorMessage.getOptional("error_message")

        /**
         * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun revenueSystemExternalEntityId(): Optional<String> =
            revenueSystemExternalEntityId.getOptional("revenue_system_external_entity_id")

        /**
         * Returns the raw JSON value of [revenueSystemExternalEntityType].
         *
         * Unlike [revenueSystemExternalEntityType], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("revenue_system_external_entity_type")
        @ExcludeMissing
        fun _revenueSystemExternalEntityType(): JsonField<String> = revenueSystemExternalEntityType

        /**
         * Returns the raw JSON value of [revenueSystemProvider].
         *
         * Unlike [revenueSystemProvider], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("revenue_system_provider")
        @ExcludeMissing
        fun _revenueSystemProvider(): JsonField<String> = revenueSystemProvider

        /**
         * Returns the raw JSON value of [syncStatus].
         *
         * Unlike [syncStatus], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sync_status")
        @ExcludeMissing
        fun _syncStatus(): JsonField<String> = syncStatus

        /**
         * Returns the raw JSON value of [errorMessage].
         *
         * Unlike [errorMessage], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("error_message")
        @ExcludeMissing
        fun _errorMessage(): JsonField<String> = errorMessage

        /**
         * Returns the raw JSON value of [revenueSystemExternalEntityId].
         *
         * Unlike [revenueSystemExternalEntityId], this method doesn't throw if the JSON field has
         * an unexpected type.
         */
        @JsonProperty("revenue_system_external_entity_id")
        @ExcludeMissing
        fun _revenueSystemExternalEntityId(): JsonField<String> = revenueSystemExternalEntityId

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [RevenueSystemInvoice].
             *
             * The following fields are required:
             * ```java
             * .revenueSystemExternalEntityType()
             * .revenueSystemProvider()
             * .syncStatus()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [RevenueSystemInvoice]. */
        class Builder internal constructor() {

            private var revenueSystemExternalEntityType: JsonField<String>? = null
            private var revenueSystemProvider: JsonField<String>? = null
            private var syncStatus: JsonField<String>? = null
            private var errorMessage: JsonField<String> = JsonMissing.of()
            private var revenueSystemExternalEntityId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(revenueSystemInvoice: RevenueSystemInvoice) = apply {
                revenueSystemExternalEntityType =
                    revenueSystemInvoice.revenueSystemExternalEntityType
                revenueSystemProvider = revenueSystemInvoice.revenueSystemProvider
                syncStatus = revenueSystemInvoice.syncStatus
                errorMessage = revenueSystemInvoice.errorMessage
                revenueSystemExternalEntityId = revenueSystemInvoice.revenueSystemExternalEntityId
                additionalProperties = revenueSystemInvoice.additionalProperties.toMutableMap()
            }

            fun revenueSystemExternalEntityType(revenueSystemExternalEntityType: String) =
                revenueSystemExternalEntityType(JsonField.of(revenueSystemExternalEntityType))

            /**
             * Sets [Builder.revenueSystemExternalEntityType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.revenueSystemExternalEntityType] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun revenueSystemExternalEntityType(
                revenueSystemExternalEntityType: JsonField<String>
            ) = apply { this.revenueSystemExternalEntityType = revenueSystemExternalEntityType }

            fun revenueSystemProvider(revenueSystemProvider: String) =
                revenueSystemProvider(JsonField.of(revenueSystemProvider))

            /**
             * Sets [Builder.revenueSystemProvider] to an arbitrary JSON value.
             *
             * You should usually call [Builder.revenueSystemProvider] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun revenueSystemProvider(revenueSystemProvider: JsonField<String>) = apply {
                this.revenueSystemProvider = revenueSystemProvider
            }

            fun syncStatus(syncStatus: String) = syncStatus(JsonField.of(syncStatus))

            /**
             * Sets [Builder.syncStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.syncStatus] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun syncStatus(syncStatus: JsonField<String>) = apply { this.syncStatus = syncStatus }

            /** The error message from the revenue system, if available. */
            fun errorMessage(errorMessage: String) = errorMessage(JsonField.of(errorMessage))

            /**
             * Sets [Builder.errorMessage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.errorMessage] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun errorMessage(errorMessage: JsonField<String>) = apply {
                this.errorMessage = errorMessage
            }

            fun revenueSystemExternalEntityId(revenueSystemExternalEntityId: String) =
                revenueSystemExternalEntityId(JsonField.of(revenueSystemExternalEntityId))

            /**
             * Sets [Builder.revenueSystemExternalEntityId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.revenueSystemExternalEntityId] with a well-typed
             * [String] value instead. This method is primarily for setting the field to an
             * undocumented or not yet supported value.
             */
            fun revenueSystemExternalEntityId(revenueSystemExternalEntityId: JsonField<String>) =
                apply {
                    this.revenueSystemExternalEntityId = revenueSystemExternalEntityId
                }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [RevenueSystemInvoice].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .revenueSystemExternalEntityType()
             * .revenueSystemProvider()
             * .syncStatus()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): RevenueSystemInvoice =
                RevenueSystemInvoice(
                    checkRequired(
                        "revenueSystemExternalEntityType",
                        revenueSystemExternalEntityType,
                    ),
                    checkRequired("revenueSystemProvider", revenueSystemProvider),
                    checkRequired("syncStatus", syncStatus),
                    errorMessage,
                    revenueSystemExternalEntityId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws MetronomeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): RevenueSystemInvoice = apply {
            if (validated) {
                return@apply
            }

            revenueSystemExternalEntityType()
            revenueSystemProvider()
            syncStatus()
            errorMessage()
            revenueSystemExternalEntityId()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: MetronomeInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (revenueSystemExternalEntityType.asKnown().isPresent) 1 else 0) +
                (if (revenueSystemProvider.asKnown().isPresent) 1 else 0) +
                (if (syncStatus.asKnown().isPresent) 1 else 0) +
                (if (errorMessage.asKnown().isPresent) 1 else 0) +
                (if (revenueSystemExternalEntityId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RevenueSystemInvoice &&
                revenueSystemExternalEntityType == other.revenueSystemExternalEntityType &&
                revenueSystemProvider == other.revenueSystemProvider &&
                syncStatus == other.syncStatus &&
                errorMessage == other.errorMessage &&
                revenueSystemExternalEntityId == other.revenueSystemExternalEntityId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                revenueSystemExternalEntityType,
                revenueSystemProvider,
                syncStatus,
                errorMessage,
                revenueSystemExternalEntityId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RevenueSystemInvoice{revenueSystemExternalEntityType=$revenueSystemExternalEntityType, revenueSystemProvider=$revenueSystemProvider, syncStatus=$syncStatus, errorMessage=$errorMessage, revenueSystemExternalEntityId=$revenueSystemExternalEntityId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Invoice &&
            id == other.id &&
            creditType == other.creditType &&
            customerId == other.customerId &&
            lineItems == other.lineItems &&
            status == other.status &&
            total == other.total &&
            type == other.type &&
            amendmentId == other.amendmentId &&
            billableStatus == other.billableStatus &&
            constituentInvoices == other.constituentInvoices &&
            contractCustomFields == other.contractCustomFields &&
            contractId == other.contractId &&
            correctionRecord == other.correctionRecord &&
            createdAt == other.createdAt &&
            customFields == other.customFields &&
            customerCustomFields == other.customerCustomFields &&
            endTimestamp == other.endTimestamp &&
            externalInvoice == other.externalInvoice &&
            invoiceAdjustments == other.invoiceAdjustments &&
            issuedAt == other.issuedAt &&
            netPaymentTermsDays == other.netPaymentTermsDays &&
            netsuiteSalesOrderId == other.netsuiteSalesOrderId &&
            payer == other.payer &&
            planCustomFields == other.planCustomFields &&
            planId == other.planId &&
            planName == other.planName &&
            regeneratedFromInvoiceId == other.regeneratedFromInvoiceId &&
            resellerRoyalty == other.resellerRoyalty &&
            revenueSystemInvoices == other.revenueSystemInvoices &&
            salesforceOpportunityId == other.salesforceOpportunityId &&
            startTimestamp == other.startTimestamp &&
            subtotal == other.subtotal &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            creditType,
            customerId,
            lineItems,
            status,
            total,
            type,
            amendmentId,
            billableStatus,
            constituentInvoices,
            contractCustomFields,
            contractId,
            correctionRecord,
            createdAt,
            customFields,
            customerCustomFields,
            endTimestamp,
            externalInvoice,
            invoiceAdjustments,
            issuedAt,
            netPaymentTermsDays,
            netsuiteSalesOrderId,
            payer,
            planCustomFields,
            planId,
            planName,
            regeneratedFromInvoiceId,
            resellerRoyalty,
            revenueSystemInvoices,
            salesforceOpportunityId,
            startTimestamp,
            subtotal,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Invoice{id=$id, creditType=$creditType, customerId=$customerId, lineItems=$lineItems, status=$status, total=$total, type=$type, amendmentId=$amendmentId, billableStatus=$billableStatus, constituentInvoices=$constituentInvoices, contractCustomFields=$contractCustomFields, contractId=$contractId, correctionRecord=$correctionRecord, createdAt=$createdAt, customFields=$customFields, customerCustomFields=$customerCustomFields, endTimestamp=$endTimestamp, externalInvoice=$externalInvoice, invoiceAdjustments=$invoiceAdjustments, issuedAt=$issuedAt, netPaymentTermsDays=$netPaymentTermsDays, netsuiteSalesOrderId=$netsuiteSalesOrderId, payer=$payer, planCustomFields=$planCustomFields, planId=$planId, planName=$planName, regeneratedFromInvoiceId=$regeneratedFromInvoiceId, resellerRoyalty=$resellerRoyalty, revenueSystemInvoices=$revenueSystemInvoices, salesforceOpportunityId=$salesforceOpportunityId, startTimestamp=$startTimestamp, subtotal=$subtotal, additionalProperties=$additionalProperties}"
}
