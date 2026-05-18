// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models.v1.customers.invoices

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.checkKnown
import com.metronome.api.core.checkRequired
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import com.metronome.api.models.CreditTypeData
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class InvoiceListBreakdownsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val creditType: JsonField<CreditTypeData>,
    private val customerId: JsonField<String>,
    private val lineItems: JsonField<List<Invoice.LineItem>>,
    private val status: JsonField<String>,
    private val total: JsonField<Double>,
    private val type: JsonField<String>,
    private val amendmentId: JsonField<String>,
    private val billableStatus: JsonValue,
    private val constituentInvoices: JsonField<List<Invoice.ConstituentInvoice>>,
    private val contractCustomFields: JsonField<Invoice.ContractCustomFields>,
    private val contractId: JsonField<String>,
    private val correctionRecord: JsonField<Invoice.CorrectionRecord>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val customFields: JsonField<Invoice.CustomFields>,
    private val customerCustomFields: JsonField<Invoice.CustomerCustomFields>,
    private val endTimestamp: JsonField<OffsetDateTime>,
    private val externalInvoice: JsonField<Invoice.ExternalInvoice>,
    private val invoiceAdjustments: JsonField<List<Invoice.InvoiceAdjustment>>,
    private val issuedAt: JsonField<OffsetDateTime>,
    private val netPaymentTermsDays: JsonField<Double>,
    private val netsuiteSalesOrderId: JsonField<String>,
    private val payer: JsonField<Invoice.Payer>,
    private val planCustomFields: JsonField<Invoice.PlanCustomFields>,
    private val planId: JsonField<String>,
    private val planName: JsonField<String>,
    private val regeneratedFromInvoiceId: JsonField<String>,
    private val resellerRoyalty: JsonField<Invoice.ResellerRoyalty>,
    private val revenueSystemInvoices: JsonField<List<Invoice.RevenueSystemInvoice>>,
    private val salesforceOpportunityId: JsonField<String>,
    private val startTimestamp: JsonField<OffsetDateTime>,
    private val subtotal: JsonField<Double>,
    private val breakdownEndTimestamp: JsonField<OffsetDateTime>,
    private val breakdownStartTimestamp: JsonField<OffsetDateTime>,
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
        lineItems: JsonField<List<Invoice.LineItem>> = JsonMissing.of(),
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
        constituentInvoices: JsonField<List<Invoice.ConstituentInvoice>> = JsonMissing.of(),
        @JsonProperty("contract_custom_fields")
        @ExcludeMissing
        contractCustomFields: JsonField<Invoice.ContractCustomFields> = JsonMissing.of(),
        @JsonProperty("contract_id")
        @ExcludeMissing
        contractId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("correction_record")
        @ExcludeMissing
        correctionRecord: JsonField<Invoice.CorrectionRecord> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("custom_fields")
        @ExcludeMissing
        customFields: JsonField<Invoice.CustomFields> = JsonMissing.of(),
        @JsonProperty("customer_custom_fields")
        @ExcludeMissing
        customerCustomFields: JsonField<Invoice.CustomerCustomFields> = JsonMissing.of(),
        @JsonProperty("end_timestamp")
        @ExcludeMissing
        endTimestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("external_invoice")
        @ExcludeMissing
        externalInvoice: JsonField<Invoice.ExternalInvoice> = JsonMissing.of(),
        @JsonProperty("invoice_adjustments")
        @ExcludeMissing
        invoiceAdjustments: JsonField<List<Invoice.InvoiceAdjustment>> = JsonMissing.of(),
        @JsonProperty("issued_at")
        @ExcludeMissing
        issuedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("net_payment_terms_days")
        @ExcludeMissing
        netPaymentTermsDays: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("payer") @ExcludeMissing payer: JsonField<Invoice.Payer> = JsonMissing.of(),
        @JsonProperty("plan_custom_fields")
        @ExcludeMissing
        planCustomFields: JsonField<Invoice.PlanCustomFields> = JsonMissing.of(),
        @JsonProperty("plan_id") @ExcludeMissing planId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("plan_name") @ExcludeMissing planName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("regenerated_from_invoice_id")
        @ExcludeMissing
        regeneratedFromInvoiceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reseller_royalty")
        @ExcludeMissing
        resellerRoyalty: JsonField<Invoice.ResellerRoyalty> = JsonMissing.of(),
        @JsonProperty("revenue_system_invoices")
        @ExcludeMissing
        revenueSystemInvoices: JsonField<List<Invoice.RevenueSystemInvoice>> = JsonMissing.of(),
        @JsonProperty("salesforce_opportunity_id")
        @ExcludeMissing
        salesforceOpportunityId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("start_timestamp")
        @ExcludeMissing
        startTimestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("subtotal") @ExcludeMissing subtotal: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("breakdown_end_timestamp")
        @ExcludeMissing
        breakdownEndTimestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("breakdown_start_timestamp")
        @ExcludeMissing
        breakdownStartTimestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
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
        breakdownEndTimestamp,
        breakdownStartTimestamp,
        mutableMapOf(),
    )

    fun toInvoice(): Invoice =
        Invoice.builder()
            .id(id)
            .creditType(creditType)
            .customerId(customerId)
            .lineItems(lineItems)
            .status(status)
            .total(total)
            .type(type)
            .amendmentId(amendmentId)
            .billableStatus(billableStatus)
            .constituentInvoices(constituentInvoices)
            .contractCustomFields(contractCustomFields)
            .contractId(contractId)
            .correctionRecord(correctionRecord)
            .createdAt(createdAt)
            .customFields(customFields)
            .customerCustomFields(customerCustomFields)
            .endTimestamp(endTimestamp)
            .externalInvoice(externalInvoice)
            .invoiceAdjustments(invoiceAdjustments)
            .issuedAt(issuedAt)
            .netPaymentTermsDays(netPaymentTermsDays)
            .netsuiteSalesOrderId(netsuiteSalesOrderId)
            .payer(payer)
            .planCustomFields(planCustomFields)
            .planId(planId)
            .planName(planName)
            .regeneratedFromInvoiceId(regeneratedFromInvoiceId)
            .resellerRoyalty(resellerRoyalty)
            .revenueSystemInvoices(revenueSystemInvoices)
            .salesforceOpportunityId(salesforceOpportunityId)
            .startTimestamp(startTimestamp)
            .subtotal(subtotal)
            .build()

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
    fun lineItems(): List<Invoice.LineItem> = lineItems.getRequired("line_items")

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
     * MyClass myObject = invoiceListBreakdownsResponse.billableStatus().convert(MyClass.class);
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
    fun constituentInvoices(): Optional<List<Invoice.ConstituentInvoice>> =
        constituentInvoices.getOptional("constituent_invoices")

    /**
     * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun contractCustomFields(): Optional<Invoice.ContractCustomFields> =
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
    fun correctionRecord(): Optional<Invoice.CorrectionRecord> =
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
    fun customFields(): Optional<Invoice.CustomFields> = customFields.getOptional("custom_fields")

    /**
     * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customerCustomFields(): Optional<Invoice.CustomerCustomFields> =
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
    fun externalInvoice(): Optional<Invoice.ExternalInvoice> =
        externalInvoice.getOptional("external_invoice")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun invoiceAdjustments(): Optional<List<Invoice.InvoiceAdjustment>> =
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
    fun payer(): Optional<Invoice.Payer> = payer.getOptional("payer")

    /**
     * Custom fields to be added eg. { "key1": "value1", "key2": "value2" }
     *
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun planCustomFields(): Optional<Invoice.PlanCustomFields> =
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
    fun resellerRoyalty(): Optional<Invoice.ResellerRoyalty> =
        resellerRoyalty.getOptional("reseller_royalty")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun revenueSystemInvoices(): Optional<List<Invoice.RevenueSystemInvoice>> =
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
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun breakdownEndTimestamp(): OffsetDateTime =
        breakdownEndTimestamp.getRequired("breakdown_end_timestamp")

    /**
     * @throws MetronomeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun breakdownStartTimestamp(): OffsetDateTime =
        breakdownStartTimestamp.getRequired("breakdown_start_timestamp")

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
    fun _lineItems(): JsonField<List<Invoice.LineItem>> = lineItems

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
    fun _constituentInvoices(): JsonField<List<Invoice.ConstituentInvoice>> = constituentInvoices

    /**
     * Returns the raw JSON value of [contractCustomFields].
     *
     * Unlike [contractCustomFields], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("contract_custom_fields")
    @ExcludeMissing
    fun _contractCustomFields(): JsonField<Invoice.ContractCustomFields> = contractCustomFields

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
    fun _correctionRecord(): JsonField<Invoice.CorrectionRecord> = correctionRecord

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
    fun _customFields(): JsonField<Invoice.CustomFields> = customFields

    /**
     * Returns the raw JSON value of [customerCustomFields].
     *
     * Unlike [customerCustomFields], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("customer_custom_fields")
    @ExcludeMissing
    fun _customerCustomFields(): JsonField<Invoice.CustomerCustomFields> = customerCustomFields

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
    fun _externalInvoice(): JsonField<Invoice.ExternalInvoice> = externalInvoice

    /**
     * Returns the raw JSON value of [invoiceAdjustments].
     *
     * Unlike [invoiceAdjustments], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("invoice_adjustments")
    @ExcludeMissing
    fun _invoiceAdjustments(): JsonField<List<Invoice.InvoiceAdjustment>> = invoiceAdjustments

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
    @JsonProperty("payer") @ExcludeMissing fun _payer(): JsonField<Invoice.Payer> = payer

    /**
     * Returns the raw JSON value of [planCustomFields].
     *
     * Unlike [planCustomFields], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("plan_custom_fields")
    @ExcludeMissing
    fun _planCustomFields(): JsonField<Invoice.PlanCustomFields> = planCustomFields

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
    fun _resellerRoyalty(): JsonField<Invoice.ResellerRoyalty> = resellerRoyalty

    /**
     * Returns the raw JSON value of [revenueSystemInvoices].
     *
     * Unlike [revenueSystemInvoices], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("revenue_system_invoices")
    @ExcludeMissing
    fun _revenueSystemInvoices(): JsonField<List<Invoice.RevenueSystemInvoice>> =
        revenueSystemInvoices

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

    /**
     * Returns the raw JSON value of [breakdownEndTimestamp].
     *
     * Unlike [breakdownEndTimestamp], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("breakdown_end_timestamp")
    @ExcludeMissing
    fun _breakdownEndTimestamp(): JsonField<OffsetDateTime> = breakdownEndTimestamp

    /**
     * Returns the raw JSON value of [breakdownStartTimestamp].
     *
     * Unlike [breakdownStartTimestamp], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("breakdown_start_timestamp")
    @ExcludeMissing
    fun _breakdownStartTimestamp(): JsonField<OffsetDateTime> = breakdownStartTimestamp

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
         * [InvoiceListBreakdownsResponse].
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
         * .breakdownEndTimestamp()
         * .breakdownStartTimestamp()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [InvoiceListBreakdownsResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var creditType: JsonField<CreditTypeData>? = null
        private var customerId: JsonField<String>? = null
        private var lineItems: JsonField<MutableList<Invoice.LineItem>>? = null
        private var status: JsonField<String>? = null
        private var total: JsonField<Double>? = null
        private var type: JsonField<String>? = null
        private var amendmentId: JsonField<String> = JsonMissing.of()
        private var billableStatus: JsonValue = JsonMissing.of()
        private var constituentInvoices: JsonField<MutableList<Invoice.ConstituentInvoice>>? = null
        private var contractCustomFields: JsonField<Invoice.ContractCustomFields> = JsonMissing.of()
        private var contractId: JsonField<String> = JsonMissing.of()
        private var correctionRecord: JsonField<Invoice.CorrectionRecord> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var customFields: JsonField<Invoice.CustomFields> = JsonMissing.of()
        private var customerCustomFields: JsonField<Invoice.CustomerCustomFields> = JsonMissing.of()
        private var endTimestamp: JsonField<OffsetDateTime> = JsonMissing.of()
        private var externalInvoice: JsonField<Invoice.ExternalInvoice> = JsonMissing.of()
        private var invoiceAdjustments: JsonField<MutableList<Invoice.InvoiceAdjustment>>? = null
        private var issuedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var netPaymentTermsDays: JsonField<Double> = JsonMissing.of()
        private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
        private var payer: JsonField<Invoice.Payer> = JsonMissing.of()
        private var planCustomFields: JsonField<Invoice.PlanCustomFields> = JsonMissing.of()
        private var planId: JsonField<String> = JsonMissing.of()
        private var planName: JsonField<String> = JsonMissing.of()
        private var regeneratedFromInvoiceId: JsonField<String> = JsonMissing.of()
        private var resellerRoyalty: JsonField<Invoice.ResellerRoyalty> = JsonMissing.of()
        private var revenueSystemInvoices: JsonField<MutableList<Invoice.RevenueSystemInvoice>>? =
            null
        private var salesforceOpportunityId: JsonField<String> = JsonMissing.of()
        private var startTimestamp: JsonField<OffsetDateTime> = JsonMissing.of()
        private var subtotal: JsonField<Double> = JsonMissing.of()
        private var breakdownEndTimestamp: JsonField<OffsetDateTime>? = null
        private var breakdownStartTimestamp: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(invoiceListBreakdownsResponse: InvoiceListBreakdownsResponse) = apply {
            id = invoiceListBreakdownsResponse.id
            creditType = invoiceListBreakdownsResponse.creditType
            customerId = invoiceListBreakdownsResponse.customerId
            lineItems = invoiceListBreakdownsResponse.lineItems.map { it.toMutableList() }
            status = invoiceListBreakdownsResponse.status
            total = invoiceListBreakdownsResponse.total
            type = invoiceListBreakdownsResponse.type
            amendmentId = invoiceListBreakdownsResponse.amendmentId
            billableStatus = invoiceListBreakdownsResponse.billableStatus
            constituentInvoices =
                invoiceListBreakdownsResponse.constituentInvoices.map { it.toMutableList() }
            contractCustomFields = invoiceListBreakdownsResponse.contractCustomFields
            contractId = invoiceListBreakdownsResponse.contractId
            correctionRecord = invoiceListBreakdownsResponse.correctionRecord
            createdAt = invoiceListBreakdownsResponse.createdAt
            customFields = invoiceListBreakdownsResponse.customFields
            customerCustomFields = invoiceListBreakdownsResponse.customerCustomFields
            endTimestamp = invoiceListBreakdownsResponse.endTimestamp
            externalInvoice = invoiceListBreakdownsResponse.externalInvoice
            invoiceAdjustments =
                invoiceListBreakdownsResponse.invoiceAdjustments.map { it.toMutableList() }
            issuedAt = invoiceListBreakdownsResponse.issuedAt
            netPaymentTermsDays = invoiceListBreakdownsResponse.netPaymentTermsDays
            netsuiteSalesOrderId = invoiceListBreakdownsResponse.netsuiteSalesOrderId
            payer = invoiceListBreakdownsResponse.payer
            planCustomFields = invoiceListBreakdownsResponse.planCustomFields
            planId = invoiceListBreakdownsResponse.planId
            planName = invoiceListBreakdownsResponse.planName
            regeneratedFromInvoiceId = invoiceListBreakdownsResponse.regeneratedFromInvoiceId
            resellerRoyalty = invoiceListBreakdownsResponse.resellerRoyalty
            revenueSystemInvoices =
                invoiceListBreakdownsResponse.revenueSystemInvoices.map { it.toMutableList() }
            salesforceOpportunityId = invoiceListBreakdownsResponse.salesforceOpportunityId
            startTimestamp = invoiceListBreakdownsResponse.startTimestamp
            subtotal = invoiceListBreakdownsResponse.subtotal
            breakdownEndTimestamp = invoiceListBreakdownsResponse.breakdownEndTimestamp
            breakdownStartTimestamp = invoiceListBreakdownsResponse.breakdownStartTimestamp
            additionalProperties = invoiceListBreakdownsResponse.additionalProperties.toMutableMap()
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

        fun lineItems(lineItems: List<Invoice.LineItem>) = lineItems(JsonField.of(lineItems))

        /**
         * Sets [Builder.lineItems] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lineItems] with a well-typed `List<Invoice.LineItem>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun lineItems(lineItems: JsonField<List<Invoice.LineItem>>) = apply {
            this.lineItems = lineItems.map { it.toMutableList() }
        }

        /**
         * Adds a single [Invoice.LineItem] to [lineItems].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addLineItem(lineItem: Invoice.LineItem) = apply {
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
        fun constituentInvoices(constituentInvoices: List<Invoice.ConstituentInvoice>) =
            constituentInvoices(JsonField.of(constituentInvoices))

        /**
         * Sets [Builder.constituentInvoices] to an arbitrary JSON value.
         *
         * You should usually call [Builder.constituentInvoices] with a well-typed
         * `List<Invoice.ConstituentInvoice>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun constituentInvoices(constituentInvoices: JsonField<List<Invoice.ConstituentInvoice>>) =
            apply {
                this.constituentInvoices = constituentInvoices.map { it.toMutableList() }
            }

        /**
         * Adds a single [Invoice.ConstituentInvoice] to [constituentInvoices].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addConstituentInvoice(constituentInvoice: Invoice.ConstituentInvoice) = apply {
            constituentInvoices =
                (constituentInvoices ?: JsonField.of(mutableListOf())).also {
                    checkKnown("constituentInvoices", it).add(constituentInvoice)
                }
        }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun contractCustomFields(contractCustomFields: Invoice.ContractCustomFields) =
            contractCustomFields(JsonField.of(contractCustomFields))

        /**
         * Sets [Builder.contractCustomFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.contractCustomFields] with a well-typed
         * [Invoice.ContractCustomFields] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun contractCustomFields(contractCustomFields: JsonField<Invoice.ContractCustomFields>) =
            apply {
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

        fun correctionRecord(correctionRecord: Invoice.CorrectionRecord) =
            correctionRecord(JsonField.of(correctionRecord))

        /**
         * Sets [Builder.correctionRecord] to an arbitrary JSON value.
         *
         * You should usually call [Builder.correctionRecord] with a well-typed
         * [Invoice.CorrectionRecord] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun correctionRecord(correctionRecord: JsonField<Invoice.CorrectionRecord>) = apply {
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

        fun customFields(customFields: Invoice.CustomFields) =
            customFields(JsonField.of(customFields))

        /**
         * Sets [Builder.customFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customFields] with a well-typed [Invoice.CustomFields]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun customFields(customFields: JsonField<Invoice.CustomFields>) = apply {
            this.customFields = customFields
        }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun customerCustomFields(customerCustomFields: Invoice.CustomerCustomFields) =
            customerCustomFields(JsonField.of(customerCustomFields))

        /**
         * Sets [Builder.customerCustomFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customerCustomFields] with a well-typed
         * [Invoice.CustomerCustomFields] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun customerCustomFields(customerCustomFields: JsonField<Invoice.CustomerCustomFields>) =
            apply {
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

        fun externalInvoice(externalInvoice: Invoice.ExternalInvoice?) =
            externalInvoice(JsonField.ofNullable(externalInvoice))

        /** Alias for calling [Builder.externalInvoice] with `externalInvoice.orElse(null)`. */
        fun externalInvoice(externalInvoice: Optional<Invoice.ExternalInvoice>) =
            externalInvoice(externalInvoice.getOrNull())

        /**
         * Sets [Builder.externalInvoice] to an arbitrary JSON value.
         *
         * You should usually call [Builder.externalInvoice] with a well-typed
         * [Invoice.ExternalInvoice] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun externalInvoice(externalInvoice: JsonField<Invoice.ExternalInvoice>) = apply {
            this.externalInvoice = externalInvoice
        }

        fun invoiceAdjustments(invoiceAdjustments: List<Invoice.InvoiceAdjustment>) =
            invoiceAdjustments(JsonField.of(invoiceAdjustments))

        /**
         * Sets [Builder.invoiceAdjustments] to an arbitrary JSON value.
         *
         * You should usually call [Builder.invoiceAdjustments] with a well-typed
         * `List<Invoice.InvoiceAdjustment>` value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun invoiceAdjustments(invoiceAdjustments: JsonField<List<Invoice.InvoiceAdjustment>>) =
            apply {
                this.invoiceAdjustments = invoiceAdjustments.map { it.toMutableList() }
            }

        /**
         * Adds a single [Invoice.InvoiceAdjustment] to [invoiceAdjustments].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addInvoiceAdjustment(invoiceAdjustment: Invoice.InvoiceAdjustment) = apply {
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
        fun payer(payer: Invoice.Payer) = payer(JsonField.of(payer))

        /**
         * Sets [Builder.payer] to an arbitrary JSON value.
         *
         * You should usually call [Builder.payer] with a well-typed [Invoice.Payer] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun payer(payer: JsonField<Invoice.Payer>) = apply { this.payer = payer }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun planCustomFields(planCustomFields: Invoice.PlanCustomFields) =
            planCustomFields(JsonField.of(planCustomFields))

        /**
         * Sets [Builder.planCustomFields] to an arbitrary JSON value.
         *
         * You should usually call [Builder.planCustomFields] with a well-typed
         * [Invoice.PlanCustomFields] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun planCustomFields(planCustomFields: JsonField<Invoice.PlanCustomFields>) = apply {
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
        fun resellerRoyalty(resellerRoyalty: Invoice.ResellerRoyalty) =
            resellerRoyalty(JsonField.of(resellerRoyalty))

        /**
         * Sets [Builder.resellerRoyalty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.resellerRoyalty] with a well-typed
         * [Invoice.ResellerRoyalty] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun resellerRoyalty(resellerRoyalty: JsonField<Invoice.ResellerRoyalty>) = apply {
            this.resellerRoyalty = resellerRoyalty
        }

        fun revenueSystemInvoices(revenueSystemInvoices: List<Invoice.RevenueSystemInvoice>?) =
            revenueSystemInvoices(JsonField.ofNullable(revenueSystemInvoices))

        /**
         * Alias for calling [Builder.revenueSystemInvoices] with
         * `revenueSystemInvoices.orElse(null)`.
         */
        fun revenueSystemInvoices(
            revenueSystemInvoices: Optional<List<Invoice.RevenueSystemInvoice>>
        ) = revenueSystemInvoices(revenueSystemInvoices.getOrNull())

        /**
         * Sets [Builder.revenueSystemInvoices] to an arbitrary JSON value.
         *
         * You should usually call [Builder.revenueSystemInvoices] with a well-typed
         * `List<Invoice.RevenueSystemInvoice>` value instead. This method is primarily for setting
         * the field to an undocumented or not yet supported value.
         */
        fun revenueSystemInvoices(
            revenueSystemInvoices: JsonField<List<Invoice.RevenueSystemInvoice>>
        ) = apply { this.revenueSystemInvoices = revenueSystemInvoices.map { it.toMutableList() } }

        /**
         * Adds a single [Invoice.RevenueSystemInvoice] to [revenueSystemInvoices].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRevenueSystemInvoice(revenueSystemInvoice: Invoice.RevenueSystemInvoice) = apply {
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

        fun breakdownEndTimestamp(breakdownEndTimestamp: OffsetDateTime) =
            breakdownEndTimestamp(JsonField.of(breakdownEndTimestamp))

        /**
         * Sets [Builder.breakdownEndTimestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.breakdownEndTimestamp] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun breakdownEndTimestamp(breakdownEndTimestamp: JsonField<OffsetDateTime>) = apply {
            this.breakdownEndTimestamp = breakdownEndTimestamp
        }

        fun breakdownStartTimestamp(breakdownStartTimestamp: OffsetDateTime) =
            breakdownStartTimestamp(JsonField.of(breakdownStartTimestamp))

        /**
         * Sets [Builder.breakdownStartTimestamp] to an arbitrary JSON value.
         *
         * You should usually call [Builder.breakdownStartTimestamp] with a well-typed
         * [OffsetDateTime] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun breakdownStartTimestamp(breakdownStartTimestamp: JsonField<OffsetDateTime>) = apply {
            this.breakdownStartTimestamp = breakdownStartTimestamp
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
         * Returns an immutable instance of [InvoiceListBreakdownsResponse].
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
         * .breakdownEndTimestamp()
         * .breakdownStartTimestamp()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): InvoiceListBreakdownsResponse =
            InvoiceListBreakdownsResponse(
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
                checkRequired("breakdownEndTimestamp", breakdownEndTimestamp),
                checkRequired("breakdownStartTimestamp", breakdownStartTimestamp),
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
    fun validate(): InvoiceListBreakdownsResponse = apply {
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
        breakdownEndTimestamp()
        breakdownStartTimestamp()
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
            (if (subtotal.asKnown().isPresent) 1 else 0) +
            (if (breakdownEndTimestamp.asKnown().isPresent) 1 else 0) +
            (if (breakdownStartTimestamp.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InvoiceListBreakdownsResponse &&
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
            breakdownEndTimestamp == other.breakdownEndTimestamp &&
            breakdownStartTimestamp == other.breakdownStartTimestamp &&
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
            breakdownEndTimestamp,
            breakdownStartTimestamp,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "InvoiceListBreakdownsResponse{id=$id, creditType=$creditType, customerId=$customerId, lineItems=$lineItems, status=$status, total=$total, type=$type, amendmentId=$amendmentId, billableStatus=$billableStatus, constituentInvoices=$constituentInvoices, contractCustomFields=$contractCustomFields, contractId=$contractId, correctionRecord=$correctionRecord, createdAt=$createdAt, customFields=$customFields, customerCustomFields=$customerCustomFields, endTimestamp=$endTimestamp, externalInvoice=$externalInvoice, invoiceAdjustments=$invoiceAdjustments, issuedAt=$issuedAt, netPaymentTermsDays=$netPaymentTermsDays, netsuiteSalesOrderId=$netsuiteSalesOrderId, payer=$payer, planCustomFields=$planCustomFields, planId=$planId, planName=$planName, regeneratedFromInvoiceId=$regeneratedFromInvoiceId, resellerRoyalty=$resellerRoyalty, revenueSystemInvoices=$revenueSystemInvoices, salesforceOpportunityId=$salesforceOpportunityId, startTimestamp=$startTimestamp, subtotal=$subtotal, breakdownEndTimestamp=$breakdownEndTimestamp, breakdownStartTimestamp=$breakdownStartTimestamp, additionalProperties=$additionalProperties}"
}
