// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class CustomerInvoiceListBreakdownsResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("credit_type")
    @ExcludeMissing
    private val creditType: JsonField<CreditTypeData> = JsonMissing.of(),
    @JsonProperty("customer_id")
    @ExcludeMissing
    private val customerId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("line_items")
    @ExcludeMissing
    private val lineItems: JsonField<List<Invoice.LineItem>> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<String> = JsonMissing.of(),
    @JsonProperty("total") @ExcludeMissing private val total: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<String> = JsonMissing.of(),
    @JsonProperty("amendment_id")
    @ExcludeMissing
    private val amendmentId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("billable_status")
    @ExcludeMissing
    private val billableStatus: JsonField<Invoice.BillableStatus> = JsonMissing.of(),
    @JsonProperty("contract_custom_fields")
    @ExcludeMissing
    private val contractCustomFields: JsonField<Invoice.ContractCustomFields> = JsonMissing.of(),
    @JsonProperty("contract_id")
    @ExcludeMissing
    private val contractId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("correction_record")
    @ExcludeMissing
    private val correctionRecord: JsonField<Invoice.CorrectionRecord> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("custom_fields")
    @ExcludeMissing
    private val customFields: JsonField<Invoice.CustomFields> = JsonMissing.of(),
    @JsonProperty("customer_custom_fields")
    @ExcludeMissing
    private val customerCustomFields: JsonField<Invoice.CustomerCustomFields> = JsonMissing.of(),
    @JsonProperty("end_timestamp")
    @ExcludeMissing
    private val endTimestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("external_invoice")
    @ExcludeMissing
    private val externalInvoice: JsonField<Invoice.ExternalInvoice> = JsonMissing.of(),
    @JsonProperty("invoice_adjustments")
    @ExcludeMissing
    private val invoiceAdjustments: JsonField<List<Invoice.InvoiceAdjustment>> = JsonMissing.of(),
    @JsonProperty("issued_at")
    @ExcludeMissing
    private val issuedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("net_payment_terms_days")
    @ExcludeMissing
    private val netPaymentTermsDays: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("netsuite_sales_order_id")
    @ExcludeMissing
    private val netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("plan_custom_fields")
    @ExcludeMissing
    private val planCustomFields: JsonField<Invoice.PlanCustomFields> = JsonMissing.of(),
    @JsonProperty("plan_id")
    @ExcludeMissing
    private val planId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("plan_name")
    @ExcludeMissing
    private val planName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("reseller_royalty")
    @ExcludeMissing
    private val resellerRoyalty: JsonField<Invoice.ResellerRoyalty> = JsonMissing.of(),
    @JsonProperty("salesforce_opportunity_id")
    @ExcludeMissing
    private val salesforceOpportunityId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("start_timestamp")
    @ExcludeMissing
    private val startTimestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("subtotal")
    @ExcludeMissing
    private val subtotal: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("breakdown_end_timestamp")
    @ExcludeMissing
    private val breakdownEndTimestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("breakdown_start_timestamp")
    @ExcludeMissing
    private val breakdownStartTimestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    fun creditType(): CreditTypeData = creditType.getRequired("credit_type")

    fun customerId(): String = customerId.getRequired("customer_id")

    fun lineItems(): List<Invoice.LineItem> = lineItems.getRequired("line_items")

    fun status(): String = status.getRequired("status")

    fun total(): Double = total.getRequired("total")

    fun type(): String = type.getRequired("type")

    fun amendmentId(): Optional<String> =
        Optional.ofNullable(amendmentId.getNullable("amendment_id"))

    /** This field's availability is dependent on your client's configuration. */
    fun billableStatus(): Optional<Invoice.BillableStatus> =
        Optional.ofNullable(billableStatus.getNullable("billable_status"))

    fun contractCustomFields(): Optional<Invoice.ContractCustomFields> =
        Optional.ofNullable(contractCustomFields.getNullable("contract_custom_fields"))

    fun contractId(): Optional<String> = Optional.ofNullable(contractId.getNullable("contract_id"))

    fun correctionRecord(): Optional<Invoice.CorrectionRecord> =
        Optional.ofNullable(correctionRecord.getNullable("correction_record"))

    /** When the invoice was created (UTC). This field is present for correction invoices only. */
    fun createdAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(createdAt.getNullable("created_at"))

    fun customFields(): Optional<Invoice.CustomFields> =
        Optional.ofNullable(customFields.getNullable("custom_fields"))

    fun customerCustomFields(): Optional<Invoice.CustomerCustomFields> =
        Optional.ofNullable(customerCustomFields.getNullable("customer_custom_fields"))

    /** End of the usage period this invoice covers (UTC) */
    fun endTimestamp(): Optional<OffsetDateTime> =
        Optional.ofNullable(endTimestamp.getNullable("end_timestamp"))

    fun externalInvoice(): Optional<Invoice.ExternalInvoice> =
        Optional.ofNullable(externalInvoice.getNullable("external_invoice"))

    fun invoiceAdjustments(): Optional<List<Invoice.InvoiceAdjustment>> =
        Optional.ofNullable(invoiceAdjustments.getNullable("invoice_adjustments"))

    /** When the invoice was issued (UTC) */
    fun issuedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(issuedAt.getNullable("issued_at"))

    fun netPaymentTermsDays(): Optional<Double> =
        Optional.ofNullable(netPaymentTermsDays.getNullable("net_payment_terms_days"))

    /** This field's availability is dependent on your client's configuration. */
    fun netsuiteSalesOrderId(): Optional<String> =
        Optional.ofNullable(netsuiteSalesOrderId.getNullable("netsuite_sales_order_id"))

    fun planCustomFields(): Optional<Invoice.PlanCustomFields> =
        Optional.ofNullable(planCustomFields.getNullable("plan_custom_fields"))

    fun planId(): Optional<String> = Optional.ofNullable(planId.getNullable("plan_id"))

    fun planName(): Optional<String> = Optional.ofNullable(planName.getNullable("plan_name"))

    /** only present for beta contract invoices with reseller royalties */
    fun resellerRoyalty(): Optional<Invoice.ResellerRoyalty> =
        Optional.ofNullable(resellerRoyalty.getNullable("reseller_royalty"))

    /** This field's availability is dependent on your client's configuration. */
    fun salesforceOpportunityId(): Optional<String> =
        Optional.ofNullable(salesforceOpportunityId.getNullable("salesforce_opportunity_id"))

    /** Beginning of the usage period this invoice covers (UTC) */
    fun startTimestamp(): Optional<OffsetDateTime> =
        Optional.ofNullable(startTimestamp.getNullable("start_timestamp"))

    fun subtotal(): Optional<Double> = Optional.ofNullable(subtotal.getNullable("subtotal"))

    fun breakdownEndTimestamp(): OffsetDateTime =
        breakdownEndTimestamp.getRequired("breakdown_end_timestamp")

    fun breakdownStartTimestamp(): OffsetDateTime =
        breakdownStartTimestamp.getRequired("breakdown_start_timestamp")

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    @JsonProperty("credit_type")
    @ExcludeMissing
    fun _creditType(): JsonField<CreditTypeData> = creditType

    @JsonProperty("customer_id") @ExcludeMissing fun _customerId(): JsonField<String> = customerId

    @JsonProperty("line_items")
    @ExcludeMissing
    fun _lineItems(): JsonField<List<Invoice.LineItem>> = lineItems

    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Double> = total

    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

    @JsonProperty("amendment_id")
    @ExcludeMissing
    fun _amendmentId(): JsonField<String> = amendmentId

    /** This field's availability is dependent on your client's configuration. */
    @JsonProperty("billable_status")
    @ExcludeMissing
    fun _billableStatus(): JsonField<Invoice.BillableStatus> = billableStatus

    @JsonProperty("contract_custom_fields")
    @ExcludeMissing
    fun _contractCustomFields(): JsonField<Invoice.ContractCustomFields> = contractCustomFields

    @JsonProperty("contract_id") @ExcludeMissing fun _contractId(): JsonField<String> = contractId

    @JsonProperty("correction_record")
    @ExcludeMissing
    fun _correctionRecord(): JsonField<Invoice.CorrectionRecord> = correctionRecord

    /** When the invoice was created (UTC). This field is present for correction invoices only. */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    @JsonProperty("custom_fields")
    @ExcludeMissing
    fun _customFields(): JsonField<Invoice.CustomFields> = customFields

    @JsonProperty("customer_custom_fields")
    @ExcludeMissing
    fun _customerCustomFields(): JsonField<Invoice.CustomerCustomFields> = customerCustomFields

    /** End of the usage period this invoice covers (UTC) */
    @JsonProperty("end_timestamp")
    @ExcludeMissing
    fun _endTimestamp(): JsonField<OffsetDateTime> = endTimestamp

    @JsonProperty("external_invoice")
    @ExcludeMissing
    fun _externalInvoice(): JsonField<Invoice.ExternalInvoice> = externalInvoice

    @JsonProperty("invoice_adjustments")
    @ExcludeMissing
    fun _invoiceAdjustments(): JsonField<List<Invoice.InvoiceAdjustment>> = invoiceAdjustments

    /** When the invoice was issued (UTC) */
    @JsonProperty("issued_at") @ExcludeMissing fun _issuedAt(): JsonField<OffsetDateTime> = issuedAt

    @JsonProperty("net_payment_terms_days")
    @ExcludeMissing
    fun _netPaymentTermsDays(): JsonField<Double> = netPaymentTermsDays

    /** This field's availability is dependent on your client's configuration. */
    @JsonProperty("netsuite_sales_order_id")
    @ExcludeMissing
    fun _netsuiteSalesOrderId(): JsonField<String> = netsuiteSalesOrderId

    @JsonProperty("plan_custom_fields")
    @ExcludeMissing
    fun _planCustomFields(): JsonField<Invoice.PlanCustomFields> = planCustomFields

    @JsonProperty("plan_id") @ExcludeMissing fun _planId(): JsonField<String> = planId

    @JsonProperty("plan_name") @ExcludeMissing fun _planName(): JsonField<String> = planName

    /** only present for beta contract invoices with reseller royalties */
    @JsonProperty("reseller_royalty")
    @ExcludeMissing
    fun _resellerRoyalty(): JsonField<Invoice.ResellerRoyalty> = resellerRoyalty

    /** This field's availability is dependent on your client's configuration. */
    @JsonProperty("salesforce_opportunity_id")
    @ExcludeMissing
    fun _salesforceOpportunityId(): JsonField<String> = salesforceOpportunityId

    /** Beginning of the usage period this invoice covers (UTC) */
    @JsonProperty("start_timestamp")
    @ExcludeMissing
    fun _startTimestamp(): JsonField<OffsetDateTime> = startTimestamp

    @JsonProperty("subtotal") @ExcludeMissing fun _subtotal(): JsonField<Double> = subtotal

    @JsonProperty("breakdown_end_timestamp")
    @ExcludeMissing
    fun _breakdownEndTimestamp(): JsonField<OffsetDateTime> = breakdownEndTimestamp

    @JsonProperty("breakdown_start_timestamp")
    @ExcludeMissing
    fun _breakdownStartTimestamp(): JsonField<OffsetDateTime> = breakdownStartTimestamp

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
            .planCustomFields(planCustomFields)
            .planId(planId)
            .planName(planName)
            .resellerRoyalty(resellerRoyalty)
            .salesforceOpportunityId(salesforceOpportunityId)
            .startTimestamp(startTimestamp)
            .subtotal(subtotal)
            .build()

    private var validated: Boolean = false

    fun validate(): CustomerInvoiceListBreakdownsResponse = apply {
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
        billableStatus()
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
        planCustomFields().ifPresent { it.validate() }
        planId()
        planName()
        resellerRoyalty().ifPresent { it.validate() }
        salesforceOpportunityId()
        startTimestamp()
        subtotal()
        breakdownEndTimestamp()
        breakdownStartTimestamp()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String>? = null
        private var creditType: JsonField<CreditTypeData>? = null
        private var customerId: JsonField<String>? = null
        private var lineItems: JsonField<MutableList<Invoice.LineItem>>? = null
        private var status: JsonField<String>? = null
        private var total: JsonField<Double>? = null
        private var type: JsonField<String>? = null
        private var amendmentId: JsonField<String> = JsonMissing.of()
        private var billableStatus: JsonField<Invoice.BillableStatus> = JsonMissing.of()
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
        private var planCustomFields: JsonField<Invoice.PlanCustomFields> = JsonMissing.of()
        private var planId: JsonField<String> = JsonMissing.of()
        private var planName: JsonField<String> = JsonMissing.of()
        private var resellerRoyalty: JsonField<Invoice.ResellerRoyalty> = JsonMissing.of()
        private var salesforceOpportunityId: JsonField<String> = JsonMissing.of()
        private var startTimestamp: JsonField<OffsetDateTime> = JsonMissing.of()
        private var subtotal: JsonField<Double> = JsonMissing.of()
        private var breakdownEndTimestamp: JsonField<OffsetDateTime>? = null
        private var breakdownStartTimestamp: JsonField<OffsetDateTime>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            customerInvoiceListBreakdownsResponse: CustomerInvoiceListBreakdownsResponse
        ) = apply {
            id = customerInvoiceListBreakdownsResponse.id
            creditType = customerInvoiceListBreakdownsResponse.creditType
            customerId = customerInvoiceListBreakdownsResponse.customerId
            lineItems = customerInvoiceListBreakdownsResponse.lineItems.map { it.toMutableList() }
            status = customerInvoiceListBreakdownsResponse.status
            total = customerInvoiceListBreakdownsResponse.total
            type = customerInvoiceListBreakdownsResponse.type
            amendmentId = customerInvoiceListBreakdownsResponse.amendmentId
            billableStatus = customerInvoiceListBreakdownsResponse.billableStatus
            contractCustomFields = customerInvoiceListBreakdownsResponse.contractCustomFields
            contractId = customerInvoiceListBreakdownsResponse.contractId
            correctionRecord = customerInvoiceListBreakdownsResponse.correctionRecord
            createdAt = customerInvoiceListBreakdownsResponse.createdAt
            customFields = customerInvoiceListBreakdownsResponse.customFields
            customerCustomFields = customerInvoiceListBreakdownsResponse.customerCustomFields
            endTimestamp = customerInvoiceListBreakdownsResponse.endTimestamp
            externalInvoice = customerInvoiceListBreakdownsResponse.externalInvoice
            invoiceAdjustments =
                customerInvoiceListBreakdownsResponse.invoiceAdjustments.map { it.toMutableList() }
            issuedAt = customerInvoiceListBreakdownsResponse.issuedAt
            netPaymentTermsDays = customerInvoiceListBreakdownsResponse.netPaymentTermsDays
            netsuiteSalesOrderId = customerInvoiceListBreakdownsResponse.netsuiteSalesOrderId
            planCustomFields = customerInvoiceListBreakdownsResponse.planCustomFields
            planId = customerInvoiceListBreakdownsResponse.planId
            planName = customerInvoiceListBreakdownsResponse.planName
            resellerRoyalty = customerInvoiceListBreakdownsResponse.resellerRoyalty
            salesforceOpportunityId = customerInvoiceListBreakdownsResponse.salesforceOpportunityId
            startTimestamp = customerInvoiceListBreakdownsResponse.startTimestamp
            subtotal = customerInvoiceListBreakdownsResponse.subtotal
            breakdownEndTimestamp = customerInvoiceListBreakdownsResponse.breakdownEndTimestamp
            breakdownStartTimestamp = customerInvoiceListBreakdownsResponse.breakdownStartTimestamp
            additionalProperties =
                customerInvoiceListBreakdownsResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun creditType(creditType: CreditTypeData) = creditType(JsonField.of(creditType))

        fun creditType(creditType: JsonField<CreditTypeData>) = apply {
            this.creditType = creditType
        }

        fun customerId(customerId: String) = customerId(JsonField.of(customerId))

        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        fun lineItems(lineItems: List<Invoice.LineItem>) = lineItems(JsonField.of(lineItems))

        fun lineItems(lineItems: JsonField<List<Invoice.LineItem>>) = apply {
            this.lineItems = lineItems.map { it.toMutableList() }
        }

        fun addLineItem(lineItem: Invoice.LineItem) = apply {
            lineItems =
                (lineItems ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(lineItem)
                }
        }

        fun status(status: String) = status(JsonField.of(status))

        fun status(status: JsonField<String>) = apply { this.status = status }

        fun total(total: Double) = total(JsonField.of(total))

        fun total(total: JsonField<Double>) = apply { this.total = total }

        fun type(type: String) = type(JsonField.of(type))

        fun type(type: JsonField<String>) = apply { this.type = type }

        fun amendmentId(amendmentId: String) = amendmentId(JsonField.of(amendmentId))

        fun amendmentId(amendmentId: JsonField<String>) = apply { this.amendmentId = amendmentId }

        /** This field's availability is dependent on your client's configuration. */
        fun billableStatus(billableStatus: Invoice.BillableStatus) =
            billableStatus(JsonField.of(billableStatus))

        /** This field's availability is dependent on your client's configuration. */
        fun billableStatus(billableStatus: JsonField<Invoice.BillableStatus>) = apply {
            this.billableStatus = billableStatus
        }

        fun contractCustomFields(contractCustomFields: Invoice.ContractCustomFields) =
            contractCustomFields(JsonField.of(contractCustomFields))

        fun contractCustomFields(contractCustomFields: JsonField<Invoice.ContractCustomFields>) =
            apply {
                this.contractCustomFields = contractCustomFields
            }

        fun contractId(contractId: String) = contractId(JsonField.of(contractId))

        fun contractId(contractId: JsonField<String>) = apply { this.contractId = contractId }

        fun correctionRecord(correctionRecord: Invoice.CorrectionRecord) =
            correctionRecord(JsonField.of(correctionRecord))

        fun correctionRecord(correctionRecord: JsonField<Invoice.CorrectionRecord>) = apply {
            this.correctionRecord = correctionRecord
        }

        /**
         * When the invoice was created (UTC). This field is present for correction invoices only.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * When the invoice was created (UTC). This field is present for correction invoices only.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun customFields(customFields: Invoice.CustomFields) =
            customFields(JsonField.of(customFields))

        fun customFields(customFields: JsonField<Invoice.CustomFields>) = apply {
            this.customFields = customFields
        }

        fun customerCustomFields(customerCustomFields: Invoice.CustomerCustomFields) =
            customerCustomFields(JsonField.of(customerCustomFields))

        fun customerCustomFields(customerCustomFields: JsonField<Invoice.CustomerCustomFields>) =
            apply {
                this.customerCustomFields = customerCustomFields
            }

        /** End of the usage period this invoice covers (UTC) */
        fun endTimestamp(endTimestamp: OffsetDateTime) = endTimestamp(JsonField.of(endTimestamp))

        /** End of the usage period this invoice covers (UTC) */
        fun endTimestamp(endTimestamp: JsonField<OffsetDateTime>) = apply {
            this.endTimestamp = endTimestamp
        }

        fun externalInvoice(externalInvoice: Invoice.ExternalInvoice?) =
            externalInvoice(JsonField.ofNullable(externalInvoice))

        fun externalInvoice(externalInvoice: Optional<Invoice.ExternalInvoice>) =
            externalInvoice(externalInvoice.orElse(null))

        fun externalInvoice(externalInvoice: JsonField<Invoice.ExternalInvoice>) = apply {
            this.externalInvoice = externalInvoice
        }

        fun invoiceAdjustments(invoiceAdjustments: List<Invoice.InvoiceAdjustment>) =
            invoiceAdjustments(JsonField.of(invoiceAdjustments))

        fun invoiceAdjustments(invoiceAdjustments: JsonField<List<Invoice.InvoiceAdjustment>>) =
            apply {
                this.invoiceAdjustments = invoiceAdjustments.map { it.toMutableList() }
            }

        fun addInvoiceAdjustment(invoiceAdjustment: Invoice.InvoiceAdjustment) = apply {
            invoiceAdjustments =
                (invoiceAdjustments ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(invoiceAdjustment)
                }
        }

        /** When the invoice was issued (UTC) */
        fun issuedAt(issuedAt: OffsetDateTime) = issuedAt(JsonField.of(issuedAt))

        /** When the invoice was issued (UTC) */
        fun issuedAt(issuedAt: JsonField<OffsetDateTime>) = apply { this.issuedAt = issuedAt }

        fun netPaymentTermsDays(netPaymentTermsDays: Double) =
            netPaymentTermsDays(JsonField.of(netPaymentTermsDays))

        fun netPaymentTermsDays(netPaymentTermsDays: JsonField<Double>) = apply {
            this.netPaymentTermsDays = netPaymentTermsDays
        }

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
            netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
            this.netsuiteSalesOrderId = netsuiteSalesOrderId
        }

        fun planCustomFields(planCustomFields: Invoice.PlanCustomFields) =
            planCustomFields(JsonField.of(planCustomFields))

        fun planCustomFields(planCustomFields: JsonField<Invoice.PlanCustomFields>) = apply {
            this.planCustomFields = planCustomFields
        }

        fun planId(planId: String) = planId(JsonField.of(planId))

        fun planId(planId: JsonField<String>) = apply { this.planId = planId }

        fun planName(planName: String) = planName(JsonField.of(planName))

        fun planName(planName: JsonField<String>) = apply { this.planName = planName }

        /** only present for beta contract invoices with reseller royalties */
        fun resellerRoyalty(resellerRoyalty: Invoice.ResellerRoyalty) =
            resellerRoyalty(JsonField.of(resellerRoyalty))

        /** only present for beta contract invoices with reseller royalties */
        fun resellerRoyalty(resellerRoyalty: JsonField<Invoice.ResellerRoyalty>) = apply {
            this.resellerRoyalty = resellerRoyalty
        }

        /** This field's availability is dependent on your client's configuration. */
        fun salesforceOpportunityId(salesforceOpportunityId: String) =
            salesforceOpportunityId(JsonField.of(salesforceOpportunityId))

        /** This field's availability is dependent on your client's configuration. */
        fun salesforceOpportunityId(salesforceOpportunityId: JsonField<String>) = apply {
            this.salesforceOpportunityId = salesforceOpportunityId
        }

        /** Beginning of the usage period this invoice covers (UTC) */
        fun startTimestamp(startTimestamp: OffsetDateTime) =
            startTimestamp(JsonField.of(startTimestamp))

        /** Beginning of the usage period this invoice covers (UTC) */
        fun startTimestamp(startTimestamp: JsonField<OffsetDateTime>) = apply {
            this.startTimestamp = startTimestamp
        }

        fun subtotal(subtotal: Double) = subtotal(JsonField.of(subtotal))

        fun subtotal(subtotal: JsonField<Double>) = apply { this.subtotal = subtotal }

        fun breakdownEndTimestamp(breakdownEndTimestamp: OffsetDateTime) =
            breakdownEndTimestamp(JsonField.of(breakdownEndTimestamp))

        fun breakdownEndTimestamp(breakdownEndTimestamp: JsonField<OffsetDateTime>) = apply {
            this.breakdownEndTimestamp = breakdownEndTimestamp
        }

        fun breakdownStartTimestamp(breakdownStartTimestamp: OffsetDateTime) =
            breakdownStartTimestamp(JsonField.of(breakdownStartTimestamp))

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

        fun build(): CustomerInvoiceListBreakdownsResponse =
            CustomerInvoiceListBreakdownsResponse(
                checkNotNull(id) { "`id` is required but was not set" },
                checkNotNull(creditType) { "`creditType` is required but was not set" },
                checkNotNull(customerId) { "`customerId` is required but was not set" },
                checkNotNull(lineItems) { "`lineItems` is required but was not set" }
                    .map { it.toImmutable() },
                checkNotNull(status) { "`status` is required but was not set" },
                checkNotNull(total) { "`total` is required but was not set" },
                checkNotNull(type) { "`type` is required but was not set" },
                amendmentId,
                billableStatus,
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
                planCustomFields,
                planId,
                planName,
                resellerRoyalty,
                salesforceOpportunityId,
                startTimestamp,
                subtotal,
                checkNotNull(breakdownEndTimestamp) {
                    "`breakdownEndTimestamp` is required but was not set"
                },
                checkNotNull(breakdownStartTimestamp) {
                    "`breakdownStartTimestamp` is required but was not set"
                },
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerInvoiceListBreakdownsResponse && id == other.id && creditType == other.creditType && customerId == other.customerId && lineItems == other.lineItems && status == other.status && total == other.total && type == other.type && amendmentId == other.amendmentId && billableStatus == other.billableStatus && contractCustomFields == other.contractCustomFields && contractId == other.contractId && correctionRecord == other.correctionRecord && createdAt == other.createdAt && customFields == other.customFields && customerCustomFields == other.customerCustomFields && endTimestamp == other.endTimestamp && externalInvoice == other.externalInvoice && invoiceAdjustments == other.invoiceAdjustments && issuedAt == other.issuedAt && netPaymentTermsDays == other.netPaymentTermsDays && netsuiteSalesOrderId == other.netsuiteSalesOrderId && planCustomFields == other.planCustomFields && planId == other.planId && planName == other.planName && resellerRoyalty == other.resellerRoyalty && salesforceOpportunityId == other.salesforceOpportunityId && startTimestamp == other.startTimestamp && subtotal == other.subtotal && breakdownEndTimestamp == other.breakdownEndTimestamp && breakdownStartTimestamp == other.breakdownStartTimestamp && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, creditType, customerId, lineItems, status, total, type, amendmentId, billableStatus, contractCustomFields, contractId, correctionRecord, createdAt, customFields, customerCustomFields, endTimestamp, externalInvoice, invoiceAdjustments, issuedAt, netPaymentTermsDays, netsuiteSalesOrderId, planCustomFields, planId, planName, resellerRoyalty, salesforceOpportunityId, startTimestamp, subtotal, breakdownEndTimestamp, breakdownStartTimestamp, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomerInvoiceListBreakdownsResponse{id=$id, creditType=$creditType, customerId=$customerId, lineItems=$lineItems, status=$status, total=$total, type=$type, amendmentId=$amendmentId, billableStatus=$billableStatus, contractCustomFields=$contractCustomFields, contractId=$contractId, correctionRecord=$correctionRecord, createdAt=$createdAt, customFields=$customFields, customerCustomFields=$customerCustomFields, endTimestamp=$endTimestamp, externalInvoice=$externalInvoice, invoiceAdjustments=$invoiceAdjustments, issuedAt=$issuedAt, netPaymentTermsDays=$netPaymentTermsDays, netsuiteSalesOrderId=$netsuiteSalesOrderId, planCustomFields=$planCustomFields, planId=$planId, planName=$planName, resellerRoyalty=$resellerRoyalty, salesforceOpportunityId=$salesforceOpportunityId, startTimestamp=$startTimestamp, subtotal=$subtotal, breakdownEndTimestamp=$breakdownEndTimestamp, breakdownStartTimestamp=$breakdownStartTimestamp, additionalProperties=$additionalProperties}"
}
