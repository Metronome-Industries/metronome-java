// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.checkRequired
import com.metronome.api.core.immutableEmptyMap
import com.metronome.api.core.toImmutable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class Invoice
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
    private val lineItems: JsonField<List<LineItem>> = JsonMissing.of(),
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
    private val billableStatus: JsonValue = JsonMissing.of(),
    @JsonProperty("constituent_invoices")
    @ExcludeMissing
    private val constituentInvoices: JsonField<List<ConstituentInvoice>> = JsonMissing.of(),
    @JsonProperty("contract_custom_fields")
    @ExcludeMissing
    private val contractCustomFields: JsonField<ContractCustomFields> = JsonMissing.of(),
    @JsonProperty("contract_id")
    @ExcludeMissing
    private val contractId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("correction_record")
    @ExcludeMissing
    private val correctionRecord: JsonField<CorrectionRecord> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("custom_fields")
    @ExcludeMissing
    private val customFields: JsonField<CustomFields> = JsonMissing.of(),
    @JsonProperty("customer_custom_fields")
    @ExcludeMissing
    private val customerCustomFields: JsonField<CustomerCustomFields> = JsonMissing.of(),
    @JsonProperty("end_timestamp")
    @ExcludeMissing
    private val endTimestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("external_invoice")
    @ExcludeMissing
    private val externalInvoice: JsonField<ExternalInvoice> = JsonMissing.of(),
    @JsonProperty("invoice_adjustments")
    @ExcludeMissing
    private val invoiceAdjustments: JsonField<List<InvoiceAdjustment>> = JsonMissing.of(),
    @JsonProperty("issued_at")
    @ExcludeMissing
    private val issuedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("net_payment_terms_days")
    @ExcludeMissing
    private val netPaymentTermsDays: JsonField<Double> = JsonMissing.of(),
    @JsonProperty("netsuite_sales_order_id")
    @ExcludeMissing
    private val netsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("payer") @ExcludeMissing private val payer: JsonField<Payer> = JsonMissing.of(),
    @JsonProperty("plan_custom_fields")
    @ExcludeMissing
    private val planCustomFields: JsonField<PlanCustomFields> = JsonMissing.of(),
    @JsonProperty("plan_id")
    @ExcludeMissing
    private val planId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("plan_name")
    @ExcludeMissing
    private val planName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("reseller_royalty")
    @ExcludeMissing
    private val resellerRoyalty: JsonField<ResellerRoyalty> = JsonMissing.of(),
    @JsonProperty("revenue_system_invoices")
    @ExcludeMissing
    private val revenueSystemInvoices: JsonField<List<RevenueSystemInvoice>> = JsonMissing.of(),
    @JsonProperty("salesforce_opportunity_id")
    @ExcludeMissing
    private val salesforceOpportunityId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("start_timestamp")
    @ExcludeMissing
    private val startTimestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("subtotal")
    @ExcludeMissing
    private val subtotal: JsonField<Double> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun id(): String = id.getRequired("id")

    fun creditType(): CreditTypeData = creditType.getRequired("credit_type")

    fun customerId(): String = customerId.getRequired("customer_id")

    fun lineItems(): List<LineItem> = lineItems.getRequired("line_items")

    fun status(): String = status.getRequired("status")

    fun total(): Double = total.getRequired("total")

    fun type(): String = type.getRequired("type")

    fun amendmentId(): Optional<String> =
        Optional.ofNullable(amendmentId.getNullable("amendment_id"))

    /** This field's availability is dependent on your client's configuration. */
    @JsonProperty("billable_status")
    @ExcludeMissing
    fun _billableStatus(): JsonValue = billableStatus

    /**
     * Required on invoices with type USAGE_CONSOLIDATED. List of constituent invoices that were
     * consolidated to create this invoice.
     */
    fun constituentInvoices(): Optional<List<ConstituentInvoice>> =
        Optional.ofNullable(constituentInvoices.getNullable("constituent_invoices"))

    /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
    fun contractCustomFields(): Optional<ContractCustomFields> =
        Optional.ofNullable(contractCustomFields.getNullable("contract_custom_fields"))

    fun contractId(): Optional<String> = Optional.ofNullable(contractId.getNullable("contract_id"))

    fun correctionRecord(): Optional<CorrectionRecord> =
        Optional.ofNullable(correctionRecord.getNullable("correction_record"))

    /** When the invoice was created (UTC). This field is present for correction invoices only. */
    fun createdAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(createdAt.getNullable("created_at"))

    fun customFields(): Optional<CustomFields> =
        Optional.ofNullable(customFields.getNullable("custom_fields"))

    /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
    fun customerCustomFields(): Optional<CustomerCustomFields> =
        Optional.ofNullable(customerCustomFields.getNullable("customer_custom_fields"))

    /** End of the usage period this invoice covers (UTC) */
    fun endTimestamp(): Optional<OffsetDateTime> =
        Optional.ofNullable(endTimestamp.getNullable("end_timestamp"))

    fun externalInvoice(): Optional<ExternalInvoice> =
        Optional.ofNullable(externalInvoice.getNullable("external_invoice"))

    fun invoiceAdjustments(): Optional<List<InvoiceAdjustment>> =
        Optional.ofNullable(invoiceAdjustments.getNullable("invoice_adjustments"))

    /** When the invoice was issued (UTC) */
    fun issuedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(issuedAt.getNullable("issued_at"))

    fun netPaymentTermsDays(): Optional<Double> =
        Optional.ofNullable(netPaymentTermsDays.getNullable("net_payment_terms_days"))

    /** This field's availability is dependent on your client's configuration. */
    fun netsuiteSalesOrderId(): Optional<String> =
        Optional.ofNullable(netsuiteSalesOrderId.getNullable("netsuite_sales_order_id"))

    /**
     * Required for account hierarchy usage invoices. An object containing the contract and customer
     * UUIDs that pay for this invoice.
     */
    fun payer(): Optional<Payer> = Optional.ofNullable(payer.getNullable("payer"))

    /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
    fun planCustomFields(): Optional<PlanCustomFields> =
        Optional.ofNullable(planCustomFields.getNullable("plan_custom_fields"))

    fun planId(): Optional<String> = Optional.ofNullable(planId.getNullable("plan_id"))

    fun planName(): Optional<String> = Optional.ofNullable(planName.getNullable("plan_name"))

    /** Only present for contract invoices with reseller royalties. */
    fun resellerRoyalty(): Optional<ResellerRoyalty> =
        Optional.ofNullable(resellerRoyalty.getNullable("reseller_royalty"))

    fun revenueSystemInvoices(): Optional<List<RevenueSystemInvoice>> =
        Optional.ofNullable(revenueSystemInvoices.getNullable("revenue_system_invoices"))

    /** This field's availability is dependent on your client's configuration. */
    fun salesforceOpportunityId(): Optional<String> =
        Optional.ofNullable(salesforceOpportunityId.getNullable("salesforce_opportunity_id"))

    /** Beginning of the usage period this invoice covers (UTC) */
    fun startTimestamp(): Optional<OffsetDateTime> =
        Optional.ofNullable(startTimestamp.getNullable("start_timestamp"))

    fun subtotal(): Optional<Double> = Optional.ofNullable(subtotal.getNullable("subtotal"))

    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    @JsonProperty("credit_type")
    @ExcludeMissing
    fun _creditType(): JsonField<CreditTypeData> = creditType

    @JsonProperty("customer_id") @ExcludeMissing fun _customerId(): JsonField<String> = customerId

    @JsonProperty("line_items")
    @ExcludeMissing
    fun _lineItems(): JsonField<List<LineItem>> = lineItems

    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<String> = status

    @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Double> = total

    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

    @JsonProperty("amendment_id")
    @ExcludeMissing
    fun _amendmentId(): JsonField<String> = amendmentId

    /**
     * Required on invoices with type USAGE_CONSOLIDATED. List of constituent invoices that were
     * consolidated to create this invoice.
     */
    @JsonProperty("constituent_invoices")
    @ExcludeMissing
    fun _constituentInvoices(): JsonField<List<ConstituentInvoice>> = constituentInvoices

    /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
    @JsonProperty("contract_custom_fields")
    @ExcludeMissing
    fun _contractCustomFields(): JsonField<ContractCustomFields> = contractCustomFields

    @JsonProperty("contract_id") @ExcludeMissing fun _contractId(): JsonField<String> = contractId

    @JsonProperty("correction_record")
    @ExcludeMissing
    fun _correctionRecord(): JsonField<CorrectionRecord> = correctionRecord

    /** When the invoice was created (UTC). This field is present for correction invoices only. */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    @JsonProperty("custom_fields")
    @ExcludeMissing
    fun _customFields(): JsonField<CustomFields> = customFields

    /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
    @JsonProperty("customer_custom_fields")
    @ExcludeMissing
    fun _customerCustomFields(): JsonField<CustomerCustomFields> = customerCustomFields

    /** End of the usage period this invoice covers (UTC) */
    @JsonProperty("end_timestamp")
    @ExcludeMissing
    fun _endTimestamp(): JsonField<OffsetDateTime> = endTimestamp

    @JsonProperty("external_invoice")
    @ExcludeMissing
    fun _externalInvoice(): JsonField<ExternalInvoice> = externalInvoice

    @JsonProperty("invoice_adjustments")
    @ExcludeMissing
    fun _invoiceAdjustments(): JsonField<List<InvoiceAdjustment>> = invoiceAdjustments

    /** When the invoice was issued (UTC) */
    @JsonProperty("issued_at") @ExcludeMissing fun _issuedAt(): JsonField<OffsetDateTime> = issuedAt

    @JsonProperty("net_payment_terms_days")
    @ExcludeMissing
    fun _netPaymentTermsDays(): JsonField<Double> = netPaymentTermsDays

    /** This field's availability is dependent on your client's configuration. */
    @JsonProperty("netsuite_sales_order_id")
    @ExcludeMissing
    fun _netsuiteSalesOrderId(): JsonField<String> = netsuiteSalesOrderId

    /**
     * Required for account hierarchy usage invoices. An object containing the contract and customer
     * UUIDs that pay for this invoice.
     */
    @JsonProperty("payer") @ExcludeMissing fun _payer(): JsonField<Payer> = payer

    /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
    @JsonProperty("plan_custom_fields")
    @ExcludeMissing
    fun _planCustomFields(): JsonField<PlanCustomFields> = planCustomFields

    @JsonProperty("plan_id") @ExcludeMissing fun _planId(): JsonField<String> = planId

    @JsonProperty("plan_name") @ExcludeMissing fun _planName(): JsonField<String> = planName

    /** Only present for contract invoices with reseller royalties. */
    @JsonProperty("reseller_royalty")
    @ExcludeMissing
    fun _resellerRoyalty(): JsonField<ResellerRoyalty> = resellerRoyalty

    @JsonProperty("revenue_system_invoices")
    @ExcludeMissing
    fun _revenueSystemInvoices(): JsonField<List<RevenueSystemInvoice>> = revenueSystemInvoices

    /** This field's availability is dependent on your client's configuration. */
    @JsonProperty("salesforce_opportunity_id")
    @ExcludeMissing
    fun _salesforceOpportunityId(): JsonField<String> = salesforceOpportunityId

    /** Beginning of the usage period this invoice covers (UTC) */
    @JsonProperty("start_timestamp")
    @ExcludeMissing
    fun _startTimestamp(): JsonField<OffsetDateTime> = startTimestamp

    @JsonProperty("subtotal") @ExcludeMissing fun _subtotal(): JsonField<Double> = subtotal

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

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
        resellerRoyalty().ifPresent { it.validate() }
        revenueSystemInvoices().ifPresent { it.forEach { it.validate() } }
        salesforceOpportunityId()
        startTimestamp()
        subtotal()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

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
            resellerRoyalty = invoice.resellerRoyalty
            revenueSystemInvoices = invoice.revenueSystemInvoices.map { it.toMutableList() }
            salesforceOpportunityId = invoice.salesforceOpportunityId
            startTimestamp = invoice.startTimestamp
            subtotal = invoice.subtotal
            additionalProperties = invoice.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        fun id(id: JsonField<String>) = apply { this.id = id }

        fun creditType(creditType: CreditTypeData) = creditType(JsonField.of(creditType))

        fun creditType(creditType: JsonField<CreditTypeData>) = apply {
            this.creditType = creditType
        }

        fun customerId(customerId: String) = customerId(JsonField.of(customerId))

        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        fun lineItems(lineItems: List<LineItem>) = lineItems(JsonField.of(lineItems))

        fun lineItems(lineItems: JsonField<List<LineItem>>) = apply {
            this.lineItems = lineItems.map { it.toMutableList() }
        }

        fun addLineItem(lineItem: LineItem) = apply {
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
         * Required on invoices with type USAGE_CONSOLIDATED. List of constituent invoices that were
         * consolidated to create this invoice.
         */
        fun constituentInvoices(constituentInvoices: JsonField<List<ConstituentInvoice>>) = apply {
            this.constituentInvoices = constituentInvoices.map { it.toMutableList() }
        }

        /**
         * Required on invoices with type USAGE_CONSOLIDATED. List of constituent invoices that were
         * consolidated to create this invoice.
         */
        fun addConstituentInvoice(constituentInvoice: ConstituentInvoice) = apply {
            constituentInvoices =
                (constituentInvoices ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(constituentInvoice)
                }
        }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun contractCustomFields(contractCustomFields: ContractCustomFields) =
            contractCustomFields(JsonField.of(contractCustomFields))

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun contractCustomFields(contractCustomFields: JsonField<ContractCustomFields>) = apply {
            this.contractCustomFields = contractCustomFields
        }

        fun contractId(contractId: String) = contractId(JsonField.of(contractId))

        fun contractId(contractId: JsonField<String>) = apply { this.contractId = contractId }

        fun correctionRecord(correctionRecord: CorrectionRecord) =
            correctionRecord(JsonField.of(correctionRecord))

        fun correctionRecord(correctionRecord: JsonField<CorrectionRecord>) = apply {
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

        fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

        fun customFields(customFields: JsonField<CustomFields>) = apply {
            this.customFields = customFields
        }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun customerCustomFields(customerCustomFields: CustomerCustomFields) =
            customerCustomFields(JsonField.of(customerCustomFields))

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun customerCustomFields(customerCustomFields: JsonField<CustomerCustomFields>) = apply {
            this.customerCustomFields = customerCustomFields
        }

        /** End of the usage period this invoice covers (UTC) */
        fun endTimestamp(endTimestamp: OffsetDateTime) = endTimestamp(JsonField.of(endTimestamp))

        /** End of the usage period this invoice covers (UTC) */
        fun endTimestamp(endTimestamp: JsonField<OffsetDateTime>) = apply {
            this.endTimestamp = endTimestamp
        }

        fun externalInvoice(externalInvoice: ExternalInvoice?) =
            externalInvoice(JsonField.ofNullable(externalInvoice))

        fun externalInvoice(externalInvoice: Optional<ExternalInvoice>) =
            externalInvoice(externalInvoice.orElse(null))

        fun externalInvoice(externalInvoice: JsonField<ExternalInvoice>) = apply {
            this.externalInvoice = externalInvoice
        }

        fun invoiceAdjustments(invoiceAdjustments: List<InvoiceAdjustment>) =
            invoiceAdjustments(JsonField.of(invoiceAdjustments))

        fun invoiceAdjustments(invoiceAdjustments: JsonField<List<InvoiceAdjustment>>) = apply {
            this.invoiceAdjustments = invoiceAdjustments.map { it.toMutableList() }
        }

        fun addInvoiceAdjustment(invoiceAdjustment: InvoiceAdjustment) = apply {
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

        /**
         * Required for account hierarchy usage invoices. An object containing the contract and
         * customer UUIDs that pay for this invoice.
         */
        fun payer(payer: Payer) = payer(JsonField.of(payer))

        /**
         * Required for account hierarchy usage invoices. An object containing the contract and
         * customer UUIDs that pay for this invoice.
         */
        fun payer(payer: JsonField<Payer>) = apply { this.payer = payer }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun planCustomFields(planCustomFields: PlanCustomFields) =
            planCustomFields(JsonField.of(planCustomFields))

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun planCustomFields(planCustomFields: JsonField<PlanCustomFields>) = apply {
            this.planCustomFields = planCustomFields
        }

        fun planId(planId: String) = planId(JsonField.of(planId))

        fun planId(planId: JsonField<String>) = apply { this.planId = planId }

        fun planName(planName: String) = planName(JsonField.of(planName))

        fun planName(planName: JsonField<String>) = apply { this.planName = planName }

        /** Only present for contract invoices with reseller royalties. */
        fun resellerRoyalty(resellerRoyalty: ResellerRoyalty) =
            resellerRoyalty(JsonField.of(resellerRoyalty))

        /** Only present for contract invoices with reseller royalties. */
        fun resellerRoyalty(resellerRoyalty: JsonField<ResellerRoyalty>) = apply {
            this.resellerRoyalty = resellerRoyalty
        }

        fun revenueSystemInvoices(revenueSystemInvoices: List<RevenueSystemInvoice>?) =
            revenueSystemInvoices(JsonField.ofNullable(revenueSystemInvoices))

        fun revenueSystemInvoices(revenueSystemInvoices: Optional<List<RevenueSystemInvoice>>) =
            revenueSystemInvoices(revenueSystemInvoices.orElse(null))

        fun revenueSystemInvoices(revenueSystemInvoices: JsonField<List<RevenueSystemInvoice>>) =
            apply {
                this.revenueSystemInvoices = revenueSystemInvoices.map { it.toMutableList() }
            }

        fun addRevenueSystemInvoice(revenueSystemInvoice: RevenueSystemInvoice) = apply {
            revenueSystemInvoices =
                (revenueSystemInvoices ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(revenueSystemInvoice)
                }
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
                resellerRoyalty,
                (revenueSystemInvoices ?: JsonMissing.of()).map { it.toImmutable() },
                salesforceOpportunityId,
                startTimestamp,
                subtotal,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class LineItem
    @JsonCreator
    private constructor(
        @JsonProperty("credit_type")
        @ExcludeMissing
        private val creditType: JsonField<CreditTypeData> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total")
        @ExcludeMissing
        private val total: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("type")
        @ExcludeMissing
        private val type: JsonField<String> = JsonMissing.of(),
        @JsonProperty("applied_commit_or_credit")
        @ExcludeMissing
        private val appliedCommitOrCredit: JsonField<AppliedCommitOrCredit> = JsonMissing.of(),
        @JsonProperty("commit_custom_fields")
        @ExcludeMissing
        private val commitCustomFields: JsonField<CommitCustomFields> = JsonMissing.of(),
        @JsonProperty("commit_id")
        @ExcludeMissing
        private val commitId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("commit_netsuite_item_id")
        @ExcludeMissing
        private val commitNetsuiteItemId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("commit_netsuite_sales_order_id")
        @ExcludeMissing
        private val commitNetsuiteSalesOrderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("commit_segment_id")
        @ExcludeMissing
        private val commitSegmentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("commit_type")
        @ExcludeMissing
        private val commitType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("custom_fields")
        @ExcludeMissing
        private val customFields: JsonField<CustomFields> = JsonMissing.of(),
        @JsonProperty("discount_custom_fields")
        @ExcludeMissing
        private val discountCustomFields: JsonField<DiscountCustomFields> = JsonMissing.of(),
        @JsonProperty("discount_id")
        @ExcludeMissing
        private val discountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ending_before")
        @ExcludeMissing
        private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("group_key")
        @ExcludeMissing
        private val groupKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("group_value")
        @ExcludeMissing
        private val groupValue: JsonField<String> = JsonMissing.of(),
        @JsonProperty("is_prorated")
        @ExcludeMissing
        private val isProrated: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("list_price")
        @ExcludeMissing
        private val listPrice: JsonField<Rate> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<String> = JsonMissing.of(),
        @JsonProperty("netsuite_invoice_billing_end")
        @ExcludeMissing
        private val netsuiteInvoiceBillingEnd: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("netsuite_invoice_billing_start")
        @ExcludeMissing
        private val netsuiteInvoiceBillingStart: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("netsuite_item_id")
        @ExcludeMissing
        private val netsuiteItemId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("origin")
        @ExcludeMissing
        private val origin: JsonField<Origin> = JsonMissing.of(),
        @JsonProperty("postpaid_commit")
        @ExcludeMissing
        private val postpaidCommit: JsonField<PostpaidCommit> = JsonMissing.of(),
        @JsonProperty("presentation_group_values")
        @ExcludeMissing
        private val presentationGroupValues: JsonField<PresentationGroupValues> = JsonMissing.of(),
        @JsonProperty("pricing_group_values")
        @ExcludeMissing
        private val pricingGroupValues: JsonField<PricingGroupValues> = JsonMissing.of(),
        @JsonProperty("product_custom_fields")
        @ExcludeMissing
        private val productCustomFields: JsonField<ProductCustomFields> = JsonMissing.of(),
        @JsonProperty("product_id")
        @ExcludeMissing
        private val productId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("product_tags")
        @ExcludeMissing
        private val productTags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("product_type")
        @ExcludeMissing
        private val productType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("professional_service_custom_fields")
        @ExcludeMissing
        private val professionalServiceCustomFields: JsonField<ProfessionalServiceCustomFields> =
            JsonMissing.of(),
        @JsonProperty("professional_service_id")
        @ExcludeMissing
        private val professionalServiceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("quantity")
        @ExcludeMissing
        private val quantity: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("reseller_type")
        @ExcludeMissing
        private val resellerType: JsonField<ResellerType> = JsonMissing.of(),
        @JsonProperty("scheduled_charge_custom_fields")
        @ExcludeMissing
        private val scheduledChargeCustomFields: JsonField<ScheduledChargeCustomFields> =
            JsonMissing.of(),
        @JsonProperty("scheduled_charge_id")
        @ExcludeMissing
        private val scheduledChargeId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("starting_at")
        @ExcludeMissing
        private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("sub_line_items")
        @ExcludeMissing
        private val subLineItems: JsonField<List<SubLineItem>> = JsonMissing.of(),
        @JsonProperty("subscription_custom_fields")
        @ExcludeMissing
        private val subscriptionCustomFields: JsonField<SubscriptionCustomFields> =
            JsonMissing.of(),
        @JsonProperty("subscription_id")
        @ExcludeMissing
        private val subscriptionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tier") @ExcludeMissing private val tier: JsonField<Tier> = JsonMissing.of(),
        @JsonProperty("unit_price")
        @ExcludeMissing
        private val unitPrice: JsonField<Double> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun creditType(): CreditTypeData = creditType.getRequired("credit_type")

        fun name(): String = name.getRequired("name")

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
         */
        fun type(): String = type.getRequired("type")

        /**
         * Details about the credit or commit that was applied to this line item. Only present on
         * line items with product of `USAGE`, `SUBSCRIPTION` or `COMPOSITE` types.
         */
        fun appliedCommitOrCredit(): Optional<AppliedCommitOrCredit> =
            Optional.ofNullable(appliedCommitOrCredit.getNullable("applied_commit_or_credit"))

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun commitCustomFields(): Optional<CommitCustomFields> =
            Optional.ofNullable(commitCustomFields.getNullable("commit_custom_fields"))

        /**
         * For line items with product of `USAGE`, `SUBSCRIPTION`, or `COMPOSITE` types, the ID of
         * the credit or commit that was applied to this line item. For line items with product type
         * of `FIXED`, the ID of the prepaid or postpaid commit that is being paid for.
         */
        fun commitId(): Optional<String> = Optional.ofNullable(commitId.getNullable("commit_id"))

        fun commitNetsuiteItemId(): Optional<String> =
            Optional.ofNullable(commitNetsuiteItemId.getNullable("commit_netsuite_item_id"))

        fun commitNetsuiteSalesOrderId(): Optional<String> =
            Optional.ofNullable(
                commitNetsuiteSalesOrderId.getNullable("commit_netsuite_sales_order_id")
            )

        fun commitSegmentId(): Optional<String> =
            Optional.ofNullable(commitSegmentId.getNullable("commit_segment_id"))

        /**
         * `PrepaidCommit` (for commit types `PREPAID` and `CREDIT`) or `PostpaidCommit` (for commit
         * type `POSTPAID`).
         */
        fun commitType(): Optional<String> =
            Optional.ofNullable(commitType.getNullable("commit_type"))

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun customFields(): Optional<CustomFields> =
            Optional.ofNullable(customFields.getNullable("custom_fields"))

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun discountCustomFields(): Optional<DiscountCustomFields> =
            Optional.ofNullable(discountCustomFields.getNullable("discount_custom_fields"))

        /** ID of the discount applied to this line item. */
        fun discountId(): Optional<String> =
            Optional.ofNullable(discountId.getNullable("discount_id"))

        /** The line item's end date (exclusive). */
        fun endingBefore(): Optional<OffsetDateTime> =
            Optional.ofNullable(endingBefore.getNullable("ending_before"))

        fun groupKey(): Optional<String> = Optional.ofNullable(groupKey.getNullable("group_key"))

        fun groupValue(): Optional<String> =
            Optional.ofNullable(groupValue.getNullable("group_value"))

        /** Indicates whether the line item is prorated for `SUBSCRIPTION` type product. */
        fun isProrated(): Optional<Boolean> =
            Optional.ofNullable(isProrated.getNullable("is_prorated"))

        /**
         * Only present for contract invoices and when the `include_list_prices` query parameter is
         * set to true. This will include the list rate for the charge if applicable. Only present
         * for usage and subscription line items.
         */
        fun listPrice(): Optional<Rate> = Optional.ofNullable(listPrice.getNullable("list_price"))

        fun metadata(): Optional<String> = Optional.ofNullable(metadata.getNullable("metadata"))

        /** The end date for the billing period on the invoice. */
        fun netsuiteInvoiceBillingEnd(): Optional<OffsetDateTime> =
            Optional.ofNullable(
                netsuiteInvoiceBillingEnd.getNullable("netsuite_invoice_billing_end")
            )

        /** The start date for the billing period on the invoice. */
        fun netsuiteInvoiceBillingStart(): Optional<OffsetDateTime> =
            Optional.ofNullable(
                netsuiteInvoiceBillingStart.getNullable("netsuite_invoice_billing_start")
            )

        fun netsuiteItemId(): Optional<String> =
            Optional.ofNullable(netsuiteItemId.getNullable("netsuite_item_id"))

        /**
         * Present on line items from invoices with type USAGE_CONSOLIDATED. Indicates the original
         * customer, contract, invoice and line item from which this line item was copied.
         */
        fun origin(): Optional<Origin> = Optional.ofNullable(origin.getNullable("origin"))

        /** Only present for line items paying for a postpaid commit true-up. */
        fun postpaidCommit(): Optional<PostpaidCommit> =
            Optional.ofNullable(postpaidCommit.getNullable("postpaid_commit"))

        /**
         * Includes the presentation group values associated with this line item if presentation
         * group keys are used.
         */
        fun presentationGroupValues(): Optional<PresentationGroupValues> =
            Optional.ofNullable(presentationGroupValues.getNullable("presentation_group_values"))

        /**
         * Includes the pricing group values associated with this line item if dimensional pricing
         * is used.
         */
        fun pricingGroupValues(): Optional<PricingGroupValues> =
            Optional.ofNullable(pricingGroupValues.getNullable("pricing_group_values"))

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun productCustomFields(): Optional<ProductCustomFields> =
            Optional.ofNullable(productCustomFields.getNullable("product_custom_fields"))

        /** ID of the product associated with the line item. */
        fun productId(): Optional<String> = Optional.ofNullable(productId.getNullable("product_id"))

        /** The current product tags associated with the line item's `product_id`. */
        fun productTags(): Optional<List<String>> =
            Optional.ofNullable(productTags.getNullable("product_tags"))

        /**
         * The type of the line item's product. Possible values are `FixedProductListItem` (for
         * `FIXED` type products), `UsageProductListItem` (for `USAGE` type products),
         * `SubscriptionProductListItem` (for `SUBSCRIPTION` type products) or
         * `CompositeProductListItem` (for `COMPOSITE` type products). For scheduled charges, commit
         * and credit payments, the value is `FixedProductListItem`.
         */
        fun productType(): Optional<String> =
            Optional.ofNullable(productType.getNullable("product_type"))

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun professionalServiceCustomFields(): Optional<ProfessionalServiceCustomFields> =
            Optional.ofNullable(
                professionalServiceCustomFields.getNullable("professional_service_custom_fields")
            )

        fun professionalServiceId(): Optional<String> =
            Optional.ofNullable(professionalServiceId.getNullable("professional_service_id"))

        /** The quantity associated with the line item. */
        fun quantity(): Optional<Double> = Optional.ofNullable(quantity.getNullable("quantity"))

        fun resellerType(): Optional<ResellerType> =
            Optional.ofNullable(resellerType.getNullable("reseller_type"))

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun scheduledChargeCustomFields(): Optional<ScheduledChargeCustomFields> =
            Optional.ofNullable(
                scheduledChargeCustomFields.getNullable("scheduled_charge_custom_fields")
            )

        /** ID of scheduled charge. */
        fun scheduledChargeId(): Optional<String> =
            Optional.ofNullable(scheduledChargeId.getNullable("scheduled_charge_id"))

        /** The line item's start date (inclusive). */
        fun startingAt(): Optional<OffsetDateTime> =
            Optional.ofNullable(startingAt.getNullable("starting_at"))

        fun subLineItems(): Optional<List<SubLineItem>> =
            Optional.ofNullable(subLineItems.getNullable("sub_line_items"))

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun subscriptionCustomFields(): Optional<SubscriptionCustomFields> =
            Optional.ofNullable(subscriptionCustomFields.getNullable("subscription_custom_fields"))

        /**
         * ID of the subscription that this line item is associated with. Only present on line items
         * with product of `SUBSCRIPTION` type.
         */
        fun subscriptionId(): Optional<String> =
            Optional.ofNullable(subscriptionId.getNullable("subscription_id"))

        /** Populated if the line item has a tiered price. */
        fun tier(): Optional<Tier> = Optional.ofNullable(tier.getNullable("tier"))

        /** The unit price associated with the line item. */
        fun unitPrice(): Optional<Double> = Optional.ofNullable(unitPrice.getNullable("unit_price"))

        @JsonProperty("credit_type")
        @ExcludeMissing
        fun _creditType(): JsonField<CreditTypeData> = creditType

        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Double> = total

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
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<String> = type

        /**
         * Details about the credit or commit that was applied to this line item. Only present on
         * line items with product of `USAGE`, `SUBSCRIPTION` or `COMPOSITE` types.
         */
        @JsonProperty("applied_commit_or_credit")
        @ExcludeMissing
        fun _appliedCommitOrCredit(): JsonField<AppliedCommitOrCredit> = appliedCommitOrCredit

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        @JsonProperty("commit_custom_fields")
        @ExcludeMissing
        fun _commitCustomFields(): JsonField<CommitCustomFields> = commitCustomFields

        /**
         * For line items with product of `USAGE`, `SUBSCRIPTION`, or `COMPOSITE` types, the ID of
         * the credit or commit that was applied to this line item. For line items with product type
         * of `FIXED`, the ID of the prepaid or postpaid commit that is being paid for.
         */
        @JsonProperty("commit_id") @ExcludeMissing fun _commitId(): JsonField<String> = commitId

        @JsonProperty("commit_netsuite_item_id")
        @ExcludeMissing
        fun _commitNetsuiteItemId(): JsonField<String> = commitNetsuiteItemId

        @JsonProperty("commit_netsuite_sales_order_id")
        @ExcludeMissing
        fun _commitNetsuiteSalesOrderId(): JsonField<String> = commitNetsuiteSalesOrderId

        @JsonProperty("commit_segment_id")
        @ExcludeMissing
        fun _commitSegmentId(): JsonField<String> = commitSegmentId

        /**
         * `PrepaidCommit` (for commit types `PREPAID` and `CREDIT`) or `PostpaidCommit` (for commit
         * type `POSTPAID`).
         */
        @JsonProperty("commit_type")
        @ExcludeMissing
        fun _commitType(): JsonField<String> = commitType

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun _customFields(): JsonField<CustomFields> = customFields

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        @JsonProperty("discount_custom_fields")
        @ExcludeMissing
        fun _discountCustomFields(): JsonField<DiscountCustomFields> = discountCustomFields

        /** ID of the discount applied to this line item. */
        @JsonProperty("discount_id")
        @ExcludeMissing
        fun _discountId(): JsonField<String> = discountId

        /** The line item's end date (exclusive). */
        @JsonProperty("ending_before")
        @ExcludeMissing
        fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

        @JsonProperty("group_key") @ExcludeMissing fun _groupKey(): JsonField<String> = groupKey

        @JsonProperty("group_value")
        @ExcludeMissing
        fun _groupValue(): JsonField<String> = groupValue

        /** Indicates whether the line item is prorated for `SUBSCRIPTION` type product. */
        @JsonProperty("is_prorated")
        @ExcludeMissing
        fun _isProrated(): JsonField<Boolean> = isProrated

        /**
         * Only present for contract invoices and when the `include_list_prices` query parameter is
         * set to true. This will include the list rate for the charge if applicable. Only present
         * for usage and subscription line items.
         */
        @JsonProperty("list_price") @ExcludeMissing fun _listPrice(): JsonField<Rate> = listPrice

        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<String> = metadata

        /** The end date for the billing period on the invoice. */
        @JsonProperty("netsuite_invoice_billing_end")
        @ExcludeMissing
        fun _netsuiteInvoiceBillingEnd(): JsonField<OffsetDateTime> = netsuiteInvoiceBillingEnd

        /** The start date for the billing period on the invoice. */
        @JsonProperty("netsuite_invoice_billing_start")
        @ExcludeMissing
        fun _netsuiteInvoiceBillingStart(): JsonField<OffsetDateTime> = netsuiteInvoiceBillingStart

        @JsonProperty("netsuite_item_id")
        @ExcludeMissing
        fun _netsuiteItemId(): JsonField<String> = netsuiteItemId

        /**
         * Present on line items from invoices with type USAGE_CONSOLIDATED. Indicates the original
         * customer, contract, invoice and line item from which this line item was copied.
         */
        @JsonProperty("origin") @ExcludeMissing fun _origin(): JsonField<Origin> = origin

        /** Only present for line items paying for a postpaid commit true-up. */
        @JsonProperty("postpaid_commit")
        @ExcludeMissing
        fun _postpaidCommit(): JsonField<PostpaidCommit> = postpaidCommit

        /**
         * Includes the presentation group values associated with this line item if presentation
         * group keys are used.
         */
        @JsonProperty("presentation_group_values")
        @ExcludeMissing
        fun _presentationGroupValues(): JsonField<PresentationGroupValues> = presentationGroupValues

        /**
         * Includes the pricing group values associated with this line item if dimensional pricing
         * is used.
         */
        @JsonProperty("pricing_group_values")
        @ExcludeMissing
        fun _pricingGroupValues(): JsonField<PricingGroupValues> = pricingGroupValues

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        @JsonProperty("product_custom_fields")
        @ExcludeMissing
        fun _productCustomFields(): JsonField<ProductCustomFields> = productCustomFields

        /** ID of the product associated with the line item. */
        @JsonProperty("product_id") @ExcludeMissing fun _productId(): JsonField<String> = productId

        /** The current product tags associated with the line item's `product_id`. */
        @JsonProperty("product_tags")
        @ExcludeMissing
        fun _productTags(): JsonField<List<String>> = productTags

        /**
         * The type of the line item's product. Possible values are `FixedProductListItem` (for
         * `FIXED` type products), `UsageProductListItem` (for `USAGE` type products),
         * `SubscriptionProductListItem` (for `SUBSCRIPTION` type products) or
         * `CompositeProductListItem` (for `COMPOSITE` type products). For scheduled charges, commit
         * and credit payments, the value is `FixedProductListItem`.
         */
        @JsonProperty("product_type")
        @ExcludeMissing
        fun _productType(): JsonField<String> = productType

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        @JsonProperty("professional_service_custom_fields")
        @ExcludeMissing
        fun _professionalServiceCustomFields(): JsonField<ProfessionalServiceCustomFields> =
            professionalServiceCustomFields

        @JsonProperty("professional_service_id")
        @ExcludeMissing
        fun _professionalServiceId(): JsonField<String> = professionalServiceId

        /** The quantity associated with the line item. */
        @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

        @JsonProperty("reseller_type")
        @ExcludeMissing
        fun _resellerType(): JsonField<ResellerType> = resellerType

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        @JsonProperty("scheduled_charge_custom_fields")
        @ExcludeMissing
        fun _scheduledChargeCustomFields(): JsonField<ScheduledChargeCustomFields> =
            scheduledChargeCustomFields

        /** ID of scheduled charge. */
        @JsonProperty("scheduled_charge_id")
        @ExcludeMissing
        fun _scheduledChargeId(): JsonField<String> = scheduledChargeId

        /** The line item's start date (inclusive). */
        @JsonProperty("starting_at")
        @ExcludeMissing
        fun _startingAt(): JsonField<OffsetDateTime> = startingAt

        @JsonProperty("sub_line_items")
        @ExcludeMissing
        fun _subLineItems(): JsonField<List<SubLineItem>> = subLineItems

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        @JsonProperty("subscription_custom_fields")
        @ExcludeMissing
        fun _subscriptionCustomFields(): JsonField<SubscriptionCustomFields> =
            subscriptionCustomFields

        /**
         * ID of the subscription that this line item is associated with. Only present on line items
         * with product of `SUBSCRIPTION` type.
         */
        @JsonProperty("subscription_id")
        @ExcludeMissing
        fun _subscriptionId(): JsonField<String> = subscriptionId

        /** Populated if the line item has a tiered price. */
        @JsonProperty("tier") @ExcludeMissing fun _tier(): JsonField<Tier> = tier

        /** The unit price associated with the line item. */
        @JsonProperty("unit_price") @ExcludeMissing fun _unitPrice(): JsonField<Double> = unitPrice

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

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
            resellerType()
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

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun creditType(creditType: JsonField<CreditTypeData>) = apply {
                this.creditType = creditType
            }

            fun name(name: String) = name(JsonField.of(name))

            fun name(name: JsonField<String>) = apply { this.name = name }

            fun total(total: Double) = total(JsonField.of(total))

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
            fun type(type: JsonField<String>) = apply { this.type = type }

            /**
             * Details about the credit or commit that was applied to this line item. Only present
             * on line items with product of `USAGE`, `SUBSCRIPTION` or `COMPOSITE` types.
             */
            fun appliedCommitOrCredit(appliedCommitOrCredit: AppliedCommitOrCredit) =
                appliedCommitOrCredit(JsonField.of(appliedCommitOrCredit))

            /**
             * Details about the credit or commit that was applied to this line item. Only present
             * on line items with product of `USAGE`, `SUBSCRIPTION` or `COMPOSITE` types.
             */
            fun appliedCommitOrCredit(appliedCommitOrCredit: JsonField<AppliedCommitOrCredit>) =
                apply {
                    this.appliedCommitOrCredit = appliedCommitOrCredit
                }

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun commitCustomFields(commitCustomFields: CommitCustomFields) =
                commitCustomFields(JsonField.of(commitCustomFields))

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
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
             * For line items with product of `USAGE`, `SUBSCRIPTION`, or `COMPOSITE` types, the ID
             * of the credit or commit that was applied to this line item. For line items with
             * product type of `FIXED`, the ID of the prepaid or postpaid commit that is being paid
             * for.
             */
            fun commitId(commitId: JsonField<String>) = apply { this.commitId = commitId }

            fun commitNetsuiteItemId(commitNetsuiteItemId: String) =
                commitNetsuiteItemId(JsonField.of(commitNetsuiteItemId))

            fun commitNetsuiteItemId(commitNetsuiteItemId: JsonField<String>) = apply {
                this.commitNetsuiteItemId = commitNetsuiteItemId
            }

            fun commitNetsuiteSalesOrderId(commitNetsuiteSalesOrderId: String) =
                commitNetsuiteSalesOrderId(JsonField.of(commitNetsuiteSalesOrderId))

            fun commitNetsuiteSalesOrderId(commitNetsuiteSalesOrderId: JsonField<String>) = apply {
                this.commitNetsuiteSalesOrderId = commitNetsuiteSalesOrderId
            }

            fun commitSegmentId(commitSegmentId: String) =
                commitSegmentId(JsonField.of(commitSegmentId))

            fun commitSegmentId(commitSegmentId: JsonField<String>) = apply {
                this.commitSegmentId = commitSegmentId
            }

            /**
             * `PrepaidCommit` (for commit types `PREPAID` and `CREDIT`) or `PostpaidCommit` (for
             * commit type `POSTPAID`).
             */
            fun commitType(commitType: String) = commitType(JsonField.of(commitType))

            /**
             * `PrepaidCommit` (for commit types `PREPAID` and `CREDIT`) or `PostpaidCommit` (for
             * commit type `POSTPAID`).
             */
            fun commitType(commitType: JsonField<String>) = apply { this.commitType = commitType }

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun customFields(customFields: JsonField<CustomFields>) = apply {
                this.customFields = customFields
            }

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun discountCustomFields(discountCustomFields: DiscountCustomFields) =
                discountCustomFields(JsonField.of(discountCustomFields))

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun discountCustomFields(discountCustomFields: JsonField<DiscountCustomFields>) =
                apply {
                    this.discountCustomFields = discountCustomFields
                }

            /** ID of the discount applied to this line item. */
            fun discountId(discountId: String) = discountId(JsonField.of(discountId))

            /** ID of the discount applied to this line item. */
            fun discountId(discountId: JsonField<String>) = apply { this.discountId = discountId }

            /** The line item's end date (exclusive). */
            fun endingBefore(endingBefore: OffsetDateTime) =
                endingBefore(JsonField.of(endingBefore))

            /** The line item's end date (exclusive). */
            fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                this.endingBefore = endingBefore
            }

            fun groupKey(groupKey: String) = groupKey(JsonField.of(groupKey))

            fun groupKey(groupKey: JsonField<String>) = apply { this.groupKey = groupKey }

            fun groupValue(groupValue: String?) = groupValue(JsonField.ofNullable(groupValue))

            fun groupValue(groupValue: Optional<String>) = groupValue(groupValue.orElse(null))

            fun groupValue(groupValue: JsonField<String>) = apply { this.groupValue = groupValue }

            /** Indicates whether the line item is prorated for `SUBSCRIPTION` type product. */
            fun isProrated(isProrated: Boolean) = isProrated(JsonField.of(isProrated))

            /** Indicates whether the line item is prorated for `SUBSCRIPTION` type product. */
            fun isProrated(isProrated: JsonField<Boolean>) = apply { this.isProrated = isProrated }

            /**
             * Only present for contract invoices and when the `include_list_prices` query parameter
             * is set to true. This will include the list rate for the charge if applicable. Only
             * present for usage and subscription line items.
             */
            fun listPrice(listPrice: Rate) = listPrice(JsonField.of(listPrice))

            /**
             * Only present for contract invoices and when the `include_list_prices` query parameter
             * is set to true. This will include the list rate for the charge if applicable. Only
             * present for usage and subscription line items.
             */
            fun listPrice(listPrice: JsonField<Rate>) = apply { this.listPrice = listPrice }

            fun metadata(metadata: String) = metadata(JsonField.of(metadata))

            fun metadata(metadata: JsonField<String>) = apply { this.metadata = metadata }

            /** The end date for the billing period on the invoice. */
            fun netsuiteInvoiceBillingEnd(netsuiteInvoiceBillingEnd: OffsetDateTime) =
                netsuiteInvoiceBillingEnd(JsonField.of(netsuiteInvoiceBillingEnd))

            /** The end date for the billing period on the invoice. */
            fun netsuiteInvoiceBillingEnd(netsuiteInvoiceBillingEnd: JsonField<OffsetDateTime>) =
                apply {
                    this.netsuiteInvoiceBillingEnd = netsuiteInvoiceBillingEnd
                }

            /** The start date for the billing period on the invoice. */
            fun netsuiteInvoiceBillingStart(netsuiteInvoiceBillingStart: OffsetDateTime) =
                netsuiteInvoiceBillingStart(JsonField.of(netsuiteInvoiceBillingStart))

            /** The start date for the billing period on the invoice. */
            fun netsuiteInvoiceBillingStart(
                netsuiteInvoiceBillingStart: JsonField<OffsetDateTime>
            ) = apply { this.netsuiteInvoiceBillingStart = netsuiteInvoiceBillingStart }

            fun netsuiteItemId(netsuiteItemId: String) =
                netsuiteItemId(JsonField.of(netsuiteItemId))

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
             * Present on line items from invoices with type USAGE_CONSOLIDATED. Indicates the
             * original customer, contract, invoice and line item from which this line item was
             * copied.
             */
            fun origin(origin: JsonField<Origin>) = apply { this.origin = origin }

            /** Only present for line items paying for a postpaid commit true-up. */
            fun postpaidCommit(postpaidCommit: PostpaidCommit) =
                postpaidCommit(JsonField.of(postpaidCommit))

            /** Only present for line items paying for a postpaid commit true-up. */
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
             * Includes the presentation group values associated with this line item if presentation
             * group keys are used.
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
             * Includes the pricing group values associated with this line item if dimensional
             * pricing is used.
             */
            fun pricingGroupValues(pricingGroupValues: JsonField<PricingGroupValues>) = apply {
                this.pricingGroupValues = pricingGroupValues
            }

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun productCustomFields(productCustomFields: ProductCustomFields) =
                productCustomFields(JsonField.of(productCustomFields))

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun productCustomFields(productCustomFields: JsonField<ProductCustomFields>) = apply {
                this.productCustomFields = productCustomFields
            }

            /** ID of the product associated with the line item. */
            fun productId(productId: String) = productId(JsonField.of(productId))

            /** ID of the product associated with the line item. */
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            /** The current product tags associated with the line item's `product_id`. */
            fun productTags(productTags: List<String>) = productTags(JsonField.of(productTags))

            /** The current product tags associated with the line item's `product_id`. */
            fun productTags(productTags: JsonField<List<String>>) = apply {
                this.productTags = productTags.map { it.toMutableList() }
            }

            /** The current product tags associated with the line item's `product_id`. */
            fun addProductTag(productTag: String) = apply {
                productTags =
                    (productTags ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(productTag)
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
             * The type of the line item's product. Possible values are `FixedProductListItem` (for
             * `FIXED` type products), `UsageProductListItem` (for `USAGE` type products),
             * `SubscriptionProductListItem` (for `SUBSCRIPTION` type products) or
             * `CompositeProductListItem` (for `COMPOSITE` type products). For scheduled charges,
             * commit and credit payments, the value is `FixedProductListItem`.
             */
            fun productType(productType: JsonField<String>) = apply {
                this.productType = productType
            }

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun professionalServiceCustomFields(
                professionalServiceCustomFields: ProfessionalServiceCustomFields
            ) = professionalServiceCustomFields(JsonField.of(professionalServiceCustomFields))

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun professionalServiceCustomFields(
                professionalServiceCustomFields: JsonField<ProfessionalServiceCustomFields>
            ) = apply { this.professionalServiceCustomFields = professionalServiceCustomFields }

            fun professionalServiceId(professionalServiceId: String) =
                professionalServiceId(JsonField.of(professionalServiceId))

            fun professionalServiceId(professionalServiceId: JsonField<String>) = apply {
                this.professionalServiceId = professionalServiceId
            }

            /** The quantity associated with the line item. */
            fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

            /** The quantity associated with the line item. */
            fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

            fun resellerType(resellerType: ResellerType) = resellerType(JsonField.of(resellerType))

            fun resellerType(resellerType: JsonField<ResellerType>) = apply {
                this.resellerType = resellerType
            }

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun scheduledChargeCustomFields(
                scheduledChargeCustomFields: ScheduledChargeCustomFields
            ) = scheduledChargeCustomFields(JsonField.of(scheduledChargeCustomFields))

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun scheduledChargeCustomFields(
                scheduledChargeCustomFields: JsonField<ScheduledChargeCustomFields>
            ) = apply { this.scheduledChargeCustomFields = scheduledChargeCustomFields }

            /** ID of scheduled charge. */
            fun scheduledChargeId(scheduledChargeId: String) =
                scheduledChargeId(JsonField.of(scheduledChargeId))

            /** ID of scheduled charge. */
            fun scheduledChargeId(scheduledChargeId: JsonField<String>) = apply {
                this.scheduledChargeId = scheduledChargeId
            }

            /** The line item's start date (inclusive). */
            fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

            /** The line item's start date (inclusive). */
            fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                this.startingAt = startingAt
            }

            fun subLineItems(subLineItems: List<SubLineItem>) =
                subLineItems(JsonField.of(subLineItems))

            fun subLineItems(subLineItems: JsonField<List<SubLineItem>>) = apply {
                this.subLineItems = subLineItems.map { it.toMutableList() }
            }

            fun addSubLineItem(subLineItem: SubLineItem) = apply {
                subLineItems =
                    (subLineItems ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(subLineItem)
                    }
            }

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun subscriptionCustomFields(subscriptionCustomFields: SubscriptionCustomFields) =
                subscriptionCustomFields(JsonField.of(subscriptionCustomFields))

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
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
             * ID of the subscription that this line item is associated with. Only present on line
             * items with product of `SUBSCRIPTION` type.
             */
            fun subscriptionId(subscriptionId: JsonField<String>) = apply {
                this.subscriptionId = subscriptionId
            }

            /** Populated if the line item has a tiered price. */
            fun tier(tier: Tier) = tier(JsonField.of(tier))

            /** Populated if the line item has a tiered price. */
            fun tier(tier: JsonField<Tier>) = apply { this.tier = tier }

            /** The unit price associated with the line item. */
            fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

            /** The unit price associated with the line item. */
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
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * Details about the credit or commit that was applied to this line item. Only present on
         * line items with product of `USAGE`, `SUBSCRIPTION` or `COMPOSITE` types.
         */
        @NoAutoDetect
        class AppliedCommitOrCredit
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            fun type(): Type = type.getRequired("type")

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): AppliedCommitOrCredit = apply {
                if (validated) {
                    return@apply
                }

                id()
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun id(id: JsonField<String>) = apply { this.id = id }

                fun type(type: Type) = type(JsonField.of(type))

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

                fun build(): AppliedCommitOrCredit =
                    AppliedCommitOrCredit(
                        checkRequired("id", id),
                        checkRequired("type", type),
                        additionalProperties.toImmutable(),
                    )
            }

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AppliedCommitOrCredit && id == other.id && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AppliedCommitOrCredit{id=$id, type=$type, additionalProperties=$additionalProperties}"
        }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        @NoAutoDetect
        class CommitCustomFields
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CommitCustomFields = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun build(): CommitCustomFields =
                    CommitCustomFields(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CommitCustomFields && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CommitCustomFields{additionalProperties=$additionalProperties}"
        }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        @NoAutoDetect
        class CustomFields
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CustomFields = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CustomFields && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
        }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        @NoAutoDetect
        class DiscountCustomFields
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): DiscountCustomFields = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun build(): DiscountCustomFields =
                    DiscountCustomFields(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DiscountCustomFields && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "DiscountCustomFields{additionalProperties=$additionalProperties}"
        }

        /**
         * Present on line items from invoices with type USAGE_CONSOLIDATED. Indicates the original
         * customer, contract, invoice and line item from which this line item was copied.
         */
        @NoAutoDetect
        class Origin
        @JsonCreator
        private constructor(
            @JsonProperty("contract_id")
            @ExcludeMissing
            private val contractId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("customer_id")
            @ExcludeMissing
            private val customerId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("invoice_id")
            @ExcludeMissing
            private val invoiceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("line_item_id")
            @ExcludeMissing
            private val lineItemId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun contractId(): String = contractId.getRequired("contract_id")

            fun customerId(): String = customerId.getRequired("customer_id")

            fun invoiceId(): String = invoiceId.getRequired("invoice_id")

            fun lineItemId(): String = lineItemId.getRequired("line_item_id")

            @JsonProperty("contract_id")
            @ExcludeMissing
            fun _contractId(): JsonField<String> = contractId

            @JsonProperty("customer_id")
            @ExcludeMissing
            fun _customerId(): JsonField<String> = customerId

            @JsonProperty("invoice_id")
            @ExcludeMissing
            fun _invoiceId(): JsonField<String> = invoiceId

            @JsonProperty("line_item_id")
            @ExcludeMissing
            fun _lineItemId(): JsonField<String> = lineItemId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

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

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun contractId(contractId: JsonField<String>) = apply {
                    this.contractId = contractId
                }

                fun customerId(customerId: String) = customerId(JsonField.of(customerId))

                fun customerId(customerId: JsonField<String>) = apply {
                    this.customerId = customerId
                }

                fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

                fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

                fun lineItemId(lineItemId: String) = lineItemId(JsonField.of(lineItemId))

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

                fun build(): Origin =
                    Origin(
                        checkRequired("contractId", contractId),
                        checkRequired("customerId", customerId),
                        checkRequired("invoiceId", invoiceId),
                        checkRequired("lineItemId", lineItemId),
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Origin && contractId == other.contractId && customerId == other.customerId && invoiceId == other.invoiceId && lineItemId == other.lineItemId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(contractId, customerId, invoiceId, lineItemId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Origin{contractId=$contractId, customerId=$customerId, invoiceId=$invoiceId, lineItemId=$lineItemId, additionalProperties=$additionalProperties}"
        }

        /** Only present for line items paying for a postpaid commit true-up. */
        @NoAutoDetect
        class PostpaidCommit
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun id(): String = id.getRequired("id")

            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PostpaidCommit = apply {
                if (validated) {
                    return@apply
                }

                id()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun build(): PostpaidCommit =
                    PostpaidCommit(checkRequired("id", id), additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PostpaidCommit && id == other.id && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PostpaidCommit{id=$id, additionalProperties=$additionalProperties}"
        }

        /**
         * Includes the presentation group values associated with this line item if presentation
         * group keys are used.
         */
        @NoAutoDetect
        class PresentationGroupValues
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PresentationGroupValues = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun build(): PresentationGroupValues =
                    PresentationGroupValues(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PresentationGroupValues && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PresentationGroupValues{additionalProperties=$additionalProperties}"
        }

        /**
         * Includes the pricing group values associated with this line item if dimensional pricing
         * is used.
         */
        @NoAutoDetect
        class PricingGroupValues
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PricingGroupValues = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun build(): PricingGroupValues =
                    PricingGroupValues(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PricingGroupValues && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PricingGroupValues{additionalProperties=$additionalProperties}"
        }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        @NoAutoDetect
        class ProductCustomFields
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): ProductCustomFields = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun build(): ProductCustomFields =
                    ProductCustomFields(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ProductCustomFields && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ProductCustomFields{additionalProperties=$additionalProperties}"
        }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        @NoAutoDetect
        class ProfessionalServiceCustomFields
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): ProfessionalServiceCustomFields = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun build(): ProfessionalServiceCustomFields =
                    ProfessionalServiceCustomFields(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ProfessionalServiceCustomFields && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ResellerType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        @NoAutoDetect
        class ScheduledChargeCustomFields
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): ScheduledChargeCustomFields = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun build(): ScheduledChargeCustomFields =
                    ScheduledChargeCustomFields(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ScheduledChargeCustomFields && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ScheduledChargeCustomFields{additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class SubLineItem
        @JsonCreator
        private constructor(
            @JsonProperty("custom_fields")
            @ExcludeMissing
            private val customFields: JsonField<CustomFields> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("quantity")
            @ExcludeMissing
            private val quantity: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("subtotal")
            @ExcludeMissing
            private val subtotal: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("charge_id")
            @ExcludeMissing
            private val chargeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("credit_grant_id")
            @ExcludeMissing
            private val creditGrantId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("end_date")
            @ExcludeMissing
            private val endDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("price")
            @ExcludeMissing
            private val price: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("start_date")
            @ExcludeMissing
            private val startDate: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("tier_period")
            @ExcludeMissing
            private val tierPeriod: JsonField<TierPeriod> = JsonMissing.of(),
            @JsonProperty("tiers")
            @ExcludeMissing
            private val tiers: JsonField<List<Tier>> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun customFields(): CustomFields = customFields.getRequired("custom_fields")

            fun name(): String = name.getRequired("name")

            fun quantity(): Double = quantity.getRequired("quantity")

            fun subtotal(): Double = subtotal.getRequired("subtotal")

            fun chargeId(): Optional<String> =
                Optional.ofNullable(chargeId.getNullable("charge_id"))

            fun creditGrantId(): Optional<String> =
                Optional.ofNullable(creditGrantId.getNullable("credit_grant_id"))

            /** The end date for the charge (for seats charges only). */
            fun endDate(): Optional<OffsetDateTime> =
                Optional.ofNullable(endDate.getNullable("end_date"))

            /**
             * the unit price for this charge, present only if the charge is not tiered and the
             * quantity is nonzero
             */
            fun price(): Optional<Double> = Optional.ofNullable(price.getNullable("price"))

            /** The start date for the charge (for seats charges only). */
            fun startDate(): Optional<OffsetDateTime> =
                Optional.ofNullable(startDate.getNullable("start_date"))

            /** when the current tier started and ends (for tiered charges only) */
            fun tierPeriod(): Optional<TierPeriod> =
                Optional.ofNullable(tierPeriod.getNullable("tier_period"))

            fun tiers(): Optional<List<Tier>> = Optional.ofNullable(tiers.getNullable("tiers"))

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            @JsonProperty("custom_fields")
            @ExcludeMissing
            fun _customFields(): JsonField<CustomFields> = customFields

            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonProperty("quantity") @ExcludeMissing fun _quantity(): JsonField<Double> = quantity

            @JsonProperty("subtotal") @ExcludeMissing fun _subtotal(): JsonField<Double> = subtotal

            @JsonProperty("charge_id") @ExcludeMissing fun _chargeId(): JsonField<String> = chargeId

            @JsonProperty("credit_grant_id")
            @ExcludeMissing
            fun _creditGrantId(): JsonField<String> = creditGrantId

            /** The end date for the charge (for seats charges only). */
            @JsonProperty("end_date")
            @ExcludeMissing
            fun _endDate(): JsonField<OffsetDateTime> = endDate

            /**
             * the unit price for this charge, present only if the charge is not tiered and the
             * quantity is nonzero
             */
            @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Double> = price

            /** The start date for the charge (for seats charges only). */
            @JsonProperty("start_date")
            @ExcludeMissing
            fun _startDate(): JsonField<OffsetDateTime> = startDate

            /** when the current tier started and ends (for tiered charges only) */
            @JsonProperty("tier_period")
            @ExcludeMissing
            fun _tierPeriod(): JsonField<TierPeriod> = tierPeriod

            @JsonProperty("tiers") @ExcludeMissing fun _tiers(): JsonField<List<Tier>> = tiers

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

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

            fun toBuilder() = Builder().from(this)

            companion object {

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

                /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
                fun customFields(customFields: JsonField<CustomFields>) = apply {
                    this.customFields = customFields
                }

                fun name(name: String) = name(JsonField.of(name))

                fun name(name: JsonField<String>) = apply { this.name = name }

                fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                fun subtotal(subtotal: Double) = subtotal(JsonField.of(subtotal))

                fun subtotal(subtotal: JsonField<Double>) = apply { this.subtotal = subtotal }

                fun chargeId(chargeId: String) = chargeId(JsonField.of(chargeId))

                fun chargeId(chargeId: JsonField<String>) = apply { this.chargeId = chargeId }

                fun creditGrantId(creditGrantId: String) =
                    creditGrantId(JsonField.of(creditGrantId))

                fun creditGrantId(creditGrantId: JsonField<String>) = apply {
                    this.creditGrantId = creditGrantId
                }

                /** The end date for the charge (for seats charges only). */
                fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

                /** The end date for the charge (for seats charges only). */
                fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

                /**
                 * the unit price for this charge, present only if the charge is not tiered and the
                 * quantity is nonzero
                 */
                fun price(price: Double) = price(JsonField.of(price))

                /**
                 * the unit price for this charge, present only if the charge is not tiered and the
                 * quantity is nonzero
                 */
                fun price(price: JsonField<Double>) = apply { this.price = price }

                /** The start date for the charge (for seats charges only). */
                fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

                /** The start date for the charge (for seats charges only). */
                fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                    this.startDate = startDate
                }

                /** when the current tier started and ends (for tiered charges only) */
                fun tierPeriod(tierPeriod: TierPeriod) = tierPeriod(JsonField.of(tierPeriod))

                /** when the current tier started and ends (for tiered charges only) */
                fun tierPeriod(tierPeriod: JsonField<TierPeriod>) = apply {
                    this.tierPeriod = tierPeriod
                }

                fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

                fun tiers(tiers: JsonField<List<Tier>>) = apply {
                    this.tiers = tiers.map { it.toMutableList() }
                }

                fun addTier(tier: Tier) = apply {
                    tiers =
                        (tiers ?: JsonField.of(mutableListOf())).apply {
                            asKnown()
                                .orElseThrow {
                                    IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    )
                                }
                                .add(tier)
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
                        additionalProperties.toImmutable(),
                    )
            }

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            @NoAutoDetect
            class CustomFields
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): CustomFields = apply {
                    if (validated) {
                        return@apply
                    }

                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

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

                    fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is CustomFields && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
            }

            /** when the current tier started and ends (for tiered charges only) */
            @NoAutoDetect
            class TierPeriod
            @JsonCreator
            private constructor(
                @JsonProperty("starting_at")
                @ExcludeMissing
                private val startingAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("ending_before")
                @ExcludeMissing
                private val endingBefore: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

                fun endingBefore(): Optional<OffsetDateTime> =
                    Optional.ofNullable(endingBefore.getNullable("ending_before"))

                @JsonProperty("starting_at")
                @ExcludeMissing
                fun _startingAt(): JsonField<OffsetDateTime> = startingAt

                @JsonProperty("ending_before")
                @ExcludeMissing
                fun _endingBefore(): JsonField<OffsetDateTime> = endingBefore

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): TierPeriod = apply {
                    if (validated) {
                        return@apply
                    }

                    startingAt()
                    endingBefore()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

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

                    fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                        this.startingAt = startingAt
                    }

                    fun endingBefore(endingBefore: OffsetDateTime) =
                        endingBefore(JsonField.of(endingBefore))

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

                    fun build(): TierPeriod =
                        TierPeriod(
                            checkRequired("startingAt", startingAt),
                            endingBefore,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is TierPeriod && startingAt == other.startingAt && endingBefore == other.endingBefore && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(startingAt, endingBefore, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "TierPeriod{startingAt=$startingAt, endingBefore=$endingBefore, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class Tier
            @JsonCreator
            private constructor(
                @JsonProperty("price")
                @ExcludeMissing
                private val price: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("quantity")
                @ExcludeMissing
                private val quantity: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("starting_at")
                @ExcludeMissing
                private val startingAt: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("subtotal")
                @ExcludeMissing
                private val subtotal: JsonField<Double> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                fun price(): Double = price.getRequired("price")

                fun quantity(): Double = quantity.getRequired("quantity")

                /** at what metric amount this tier begins */
                fun startingAt(): Double = startingAt.getRequired("starting_at")

                fun subtotal(): Double = subtotal.getRequired("subtotal")

                @JsonProperty("price") @ExcludeMissing fun _price(): JsonField<Double> = price

                @JsonProperty("quantity")
                @ExcludeMissing
                fun _quantity(): JsonField<Double> = quantity

                /** at what metric amount this tier begins */
                @JsonProperty("starting_at")
                @ExcludeMissing
                fun _startingAt(): JsonField<Double> = startingAt

                @JsonProperty("subtotal")
                @ExcludeMissing
                fun _subtotal(): JsonField<Double> = subtotal

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

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

                fun toBuilder() = Builder().from(this)

                companion object {

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

                    fun price(price: JsonField<Double>) = apply { this.price = price }

                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                    /** at what metric amount this tier begins */
                    fun startingAt(startingAt: Double) = startingAt(JsonField.of(startingAt))

                    /** at what metric amount this tier begins */
                    fun startingAt(startingAt: JsonField<Double>) = apply {
                        this.startingAt = startingAt
                    }

                    fun subtotal(subtotal: Double) = subtotal(JsonField.of(subtotal))

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

                    fun build(): Tier =
                        Tier(
                            checkRequired("price", price),
                            checkRequired("quantity", quantity),
                            checkRequired("startingAt", startingAt),
                            checkRequired("subtotal", subtotal),
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Tier && price == other.price && quantity == other.quantity && startingAt == other.startingAt && subtotal == other.subtotal && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(price, quantity, startingAt, subtotal, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Tier{price=$price, quantity=$quantity, startingAt=$startingAt, subtotal=$subtotal, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is SubLineItem && customFields == other.customFields && name == other.name && quantity == other.quantity && subtotal == other.subtotal && chargeId == other.chargeId && creditGrantId == other.creditGrantId && endDate == other.endDate && price == other.price && startDate == other.startDate && tierPeriod == other.tierPeriod && tiers == other.tiers && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(customFields, name, quantity, subtotal, chargeId, creditGrantId, endDate, price, startDate, tierPeriod, tiers, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SubLineItem{customFields=$customFields, name=$name, quantity=$quantity, subtotal=$subtotal, chargeId=$chargeId, creditGrantId=$creditGrantId, endDate=$endDate, price=$price, startDate=$startDate, tierPeriod=$tierPeriod, tiers=$tiers, additionalProperties=$additionalProperties}"
        }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        @NoAutoDetect
        class SubscriptionCustomFields
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): SubscriptionCustomFields = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun build(): SubscriptionCustomFields =
                    SubscriptionCustomFields(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is SubscriptionCustomFields && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SubscriptionCustomFields{additionalProperties=$additionalProperties}"
        }

        /** Populated if the line item has a tiered price. */
        @NoAutoDetect
        class Tier
        @JsonCreator
        private constructor(
            @JsonProperty("level")
            @ExcludeMissing
            private val level: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("starting_at")
            @ExcludeMissing
            private val startingAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("size")
            @ExcludeMissing
            private val size: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun level(): Double = level.getRequired("level")

            fun startingAt(): String = startingAt.getRequired("starting_at")

            fun size(): Optional<String> = Optional.ofNullable(size.getNullable("size"))

            @JsonProperty("level") @ExcludeMissing fun _level(): JsonField<Double> = level

            @JsonProperty("starting_at")
            @ExcludeMissing
            fun _startingAt(): JsonField<String> = startingAt

            @JsonProperty("size") @ExcludeMissing fun _size(): JsonField<String> = size

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Tier = apply {
                if (validated) {
                    return@apply
                }

                level()
                startingAt()
                size()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun level(level: JsonField<Double>) = apply { this.level = level }

                fun startingAt(startingAt: String) = startingAt(JsonField.of(startingAt))

                fun startingAt(startingAt: JsonField<String>) = apply {
                    this.startingAt = startingAt
                }

                fun size(size: String?) = size(JsonField.ofNullable(size))

                fun size(size: Optional<String>) = size(size.orElse(null))

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

                fun build(): Tier =
                    Tier(
                        checkRequired("level", level),
                        checkRequired("startingAt", startingAt),
                        size,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Tier && level == other.level && startingAt == other.startingAt && size == other.size && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(level, startingAt, size, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Tier{level=$level, startingAt=$startingAt, size=$size, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LineItem && creditType == other.creditType && name == other.name && total == other.total && type == other.type && appliedCommitOrCredit == other.appliedCommitOrCredit && commitCustomFields == other.commitCustomFields && commitId == other.commitId && commitNetsuiteItemId == other.commitNetsuiteItemId && commitNetsuiteSalesOrderId == other.commitNetsuiteSalesOrderId && commitSegmentId == other.commitSegmentId && commitType == other.commitType && customFields == other.customFields && discountCustomFields == other.discountCustomFields && discountId == other.discountId && endingBefore == other.endingBefore && groupKey == other.groupKey && groupValue == other.groupValue && isProrated == other.isProrated && listPrice == other.listPrice && metadata == other.metadata && netsuiteInvoiceBillingEnd == other.netsuiteInvoiceBillingEnd && netsuiteInvoiceBillingStart == other.netsuiteInvoiceBillingStart && netsuiteItemId == other.netsuiteItemId && origin == other.origin && postpaidCommit == other.postpaidCommit && presentationGroupValues == other.presentationGroupValues && pricingGroupValues == other.pricingGroupValues && productCustomFields == other.productCustomFields && productId == other.productId && productTags == other.productTags && productType == other.productType && professionalServiceCustomFields == other.professionalServiceCustomFields && professionalServiceId == other.professionalServiceId && quantity == other.quantity && resellerType == other.resellerType && scheduledChargeCustomFields == other.scheduledChargeCustomFields && scheduledChargeId == other.scheduledChargeId && startingAt == other.startingAt && subLineItems == other.subLineItems && subscriptionCustomFields == other.subscriptionCustomFields && subscriptionId == other.subscriptionId && tier == other.tier && unitPrice == other.unitPrice && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(creditType, name, total, type, appliedCommitOrCredit, commitCustomFields, commitId, commitNetsuiteItemId, commitNetsuiteSalesOrderId, commitSegmentId, commitType, customFields, discountCustomFields, discountId, endingBefore, groupKey, groupValue, isProrated, listPrice, metadata, netsuiteInvoiceBillingEnd, netsuiteInvoiceBillingStart, netsuiteItemId, origin, postpaidCommit, presentationGroupValues, pricingGroupValues, productCustomFields, productId, productTags, productType, professionalServiceCustomFields, professionalServiceId, quantity, resellerType, scheduledChargeCustomFields, scheduledChargeId, startingAt, subLineItems, subscriptionCustomFields, subscriptionId, tier, unitPrice, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LineItem{creditType=$creditType, name=$name, total=$total, type=$type, appliedCommitOrCredit=$appliedCommitOrCredit, commitCustomFields=$commitCustomFields, commitId=$commitId, commitNetsuiteItemId=$commitNetsuiteItemId, commitNetsuiteSalesOrderId=$commitNetsuiteSalesOrderId, commitSegmentId=$commitSegmentId, commitType=$commitType, customFields=$customFields, discountCustomFields=$discountCustomFields, discountId=$discountId, endingBefore=$endingBefore, groupKey=$groupKey, groupValue=$groupValue, isProrated=$isProrated, listPrice=$listPrice, metadata=$metadata, netsuiteInvoiceBillingEnd=$netsuiteInvoiceBillingEnd, netsuiteInvoiceBillingStart=$netsuiteInvoiceBillingStart, netsuiteItemId=$netsuiteItemId, origin=$origin, postpaidCommit=$postpaidCommit, presentationGroupValues=$presentationGroupValues, pricingGroupValues=$pricingGroupValues, productCustomFields=$productCustomFields, productId=$productId, productTags=$productTags, productType=$productType, professionalServiceCustomFields=$professionalServiceCustomFields, professionalServiceId=$professionalServiceId, quantity=$quantity, resellerType=$resellerType, scheduledChargeCustomFields=$scheduledChargeCustomFields, scheduledChargeId=$scheduledChargeId, startingAt=$startingAt, subLineItems=$subLineItems, subscriptionCustomFields=$subscriptionCustomFields, subscriptionId=$subscriptionId, tier=$tier, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class ConstituentInvoice
    @JsonCreator
    private constructor(
        @JsonProperty("contract_id")
        @ExcludeMissing
        private val contractId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer_id")
        @ExcludeMissing
        private val customerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("invoice_id")
        @ExcludeMissing
        private val invoiceId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun contractId(): String = contractId.getRequired("contract_id")

        fun customerId(): String = customerId.getRequired("customer_id")

        fun invoiceId(): String = invoiceId.getRequired("invoice_id")

        @JsonProperty("contract_id")
        @ExcludeMissing
        fun _contractId(): JsonField<String> = contractId

        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId(): JsonField<String> = invoiceId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ConstituentInvoice = apply {
            if (validated) {
                return@apply
            }

            contractId()
            customerId()
            invoiceId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun contractId(contractId: JsonField<String>) = apply { this.contractId = contractId }

            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

            fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

            fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

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

            fun build(): ConstituentInvoice =
                ConstituentInvoice(
                    checkRequired("contractId", contractId),
                    checkRequired("customerId", customerId),
                    checkRequired("invoiceId", invoiceId),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ConstituentInvoice && contractId == other.contractId && customerId == other.customerId && invoiceId == other.invoiceId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(contractId, customerId, invoiceId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ConstituentInvoice{contractId=$contractId, customerId=$customerId, invoiceId=$invoiceId, additionalProperties=$additionalProperties}"
    }

    /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
    @NoAutoDetect
    class ContractCustomFields
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ContractCustomFields = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun build(): ContractCustomFields =
                ContractCustomFields(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ContractCustomFields && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "ContractCustomFields{additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class CorrectionRecord
    @JsonCreator
    private constructor(
        @JsonProperty("corrected_invoice_id")
        @ExcludeMissing
        private val correctedInvoiceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("memo")
        @ExcludeMissing
        private val memo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reason")
        @ExcludeMissing
        private val reason: JsonField<String> = JsonMissing.of(),
        @JsonProperty("corrected_external_invoice")
        @ExcludeMissing
        private val correctedExternalInvoice: JsonField<CorrectedExternalInvoice> =
            JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun correctedInvoiceId(): String = correctedInvoiceId.getRequired("corrected_invoice_id")

        fun memo(): String = memo.getRequired("memo")

        fun reason(): String = reason.getRequired("reason")

        fun correctedExternalInvoice(): Optional<CorrectedExternalInvoice> =
            Optional.ofNullable(correctedExternalInvoice.getNullable("corrected_external_invoice"))

        @JsonProperty("corrected_invoice_id")
        @ExcludeMissing
        fun _correctedInvoiceId(): JsonField<String> = correctedInvoiceId

        @JsonProperty("memo") @ExcludeMissing fun _memo(): JsonField<String> = memo

        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<String> = reason

        @JsonProperty("corrected_external_invoice")
        @ExcludeMissing
        fun _correctedExternalInvoice(): JsonField<CorrectedExternalInvoice> =
            correctedExternalInvoice

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

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

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun correctedInvoiceId(correctedInvoiceId: JsonField<String>) = apply {
                this.correctedInvoiceId = correctedInvoiceId
            }

            fun memo(memo: String) = memo(JsonField.of(memo))

            fun memo(memo: JsonField<String>) = apply { this.memo = memo }

            fun reason(reason: String) = reason(JsonField.of(reason))

            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

            fun correctedExternalInvoice(correctedExternalInvoice: CorrectedExternalInvoice) =
                correctedExternalInvoice(JsonField.of(correctedExternalInvoice))

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

            fun build(): CorrectionRecord =
                CorrectionRecord(
                    checkRequired("correctedInvoiceId", correctedInvoiceId),
                    checkRequired("memo", memo),
                    checkRequired("reason", reason),
                    correctedExternalInvoice,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class CorrectedExternalInvoice
        @JsonCreator
        private constructor(
            @JsonProperty("billing_provider_type")
            @ExcludeMissing
            private val billingProviderType: JsonField<BillingProviderType> = JsonMissing.of(),
            @JsonProperty("billing_provider_error")
            @ExcludeMissing
            private val billingProviderError: JsonField<String> = JsonMissing.of(),
            @JsonProperty("external_payment_id")
            @ExcludeMissing
            private val externalPaymentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("external_status")
            @ExcludeMissing
            private val externalStatus: JsonField<ExternalStatus> = JsonMissing.of(),
            @JsonProperty("invoice_id")
            @ExcludeMissing
            private val invoiceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("invoiced_sub_total")
            @ExcludeMissing
            private val invoicedSubTotal: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("invoiced_total")
            @ExcludeMissing
            private val invoicedTotal: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("issued_at_timestamp")
            @ExcludeMissing
            private val issuedAtTimestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("pdf_url")
            @ExcludeMissing
            private val pdfUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tax") @ExcludeMissing private val tax: JsonField<Tax> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun billingProviderType(): BillingProviderType =
                billingProviderType.getRequired("billing_provider_type")

            /** Error message from the billing provider, if available. */
            fun billingProviderError(): Optional<String> =
                Optional.ofNullable(billingProviderError.getNullable("billing_provider_error"))

            /** The ID of the payment in the external system, if available. */
            fun externalPaymentId(): Optional<String> =
                Optional.ofNullable(externalPaymentId.getNullable("external_payment_id"))

            fun externalStatus(): Optional<ExternalStatus> =
                Optional.ofNullable(externalStatus.getNullable("external_status"))

            fun invoiceId(): Optional<String> =
                Optional.ofNullable(invoiceId.getNullable("invoice_id"))

            /** The subtotal amount invoiced, if available from the billing provider. */
            fun invoicedSubTotal(): Optional<Double> =
                Optional.ofNullable(invoicedSubTotal.getNullable("invoiced_sub_total"))

            /** The total amount invoiced, if available from the billing provider. */
            fun invoicedTotal(): Optional<Double> =
                Optional.ofNullable(invoicedTotal.getNullable("invoiced_total"))

            fun issuedAtTimestamp(): Optional<OffsetDateTime> =
                Optional.ofNullable(issuedAtTimestamp.getNullable("issued_at_timestamp"))

            /** A URL to the PDF of the invoice, if available from the billing provider. */
            fun pdfUrl(): Optional<String> = Optional.ofNullable(pdfUrl.getNullable("pdf_url"))

            /** Tax details for the invoice, if available from the billing provider. */
            fun tax(): Optional<Tax> = Optional.ofNullable(tax.getNullable("tax"))

            @JsonProperty("billing_provider_type")
            @ExcludeMissing
            fun _billingProviderType(): JsonField<BillingProviderType> = billingProviderType

            /** Error message from the billing provider, if available. */
            @JsonProperty("billing_provider_error")
            @ExcludeMissing
            fun _billingProviderError(): JsonField<String> = billingProviderError

            /** The ID of the payment in the external system, if available. */
            @JsonProperty("external_payment_id")
            @ExcludeMissing
            fun _externalPaymentId(): JsonField<String> = externalPaymentId

            @JsonProperty("external_status")
            @ExcludeMissing
            fun _externalStatus(): JsonField<ExternalStatus> = externalStatus

            @JsonProperty("invoice_id")
            @ExcludeMissing
            fun _invoiceId(): JsonField<String> = invoiceId

            /** The subtotal amount invoiced, if available from the billing provider. */
            @JsonProperty("invoiced_sub_total")
            @ExcludeMissing
            fun _invoicedSubTotal(): JsonField<Double> = invoicedSubTotal

            /** The total amount invoiced, if available from the billing provider. */
            @JsonProperty("invoiced_total")
            @ExcludeMissing
            fun _invoicedTotal(): JsonField<Double> = invoicedTotal

            @JsonProperty("issued_at_timestamp")
            @ExcludeMissing
            fun _issuedAtTimestamp(): JsonField<OffsetDateTime> = issuedAtTimestamp

            /** A URL to the PDF of the invoice, if available from the billing provider. */
            @JsonProperty("pdf_url") @ExcludeMissing fun _pdfUrl(): JsonField<String> = pdfUrl

            /** Tax details for the invoice, if available from the billing provider. */
            @JsonProperty("tax") @ExcludeMissing fun _tax(): JsonField<Tax> = tax

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CorrectedExternalInvoice = apply {
                if (validated) {
                    return@apply
                }

                billingProviderType()
                billingProviderError()
                externalPaymentId()
                externalStatus()
                invoiceId()
                invoicedSubTotal()
                invoicedTotal()
                issuedAtTimestamp()
                pdfUrl()
                tax().ifPresent { it.validate() }
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun billingProviderType(billingProviderType: JsonField<BillingProviderType>) =
                    apply {
                        this.billingProviderType = billingProviderType
                    }

                /** Error message from the billing provider, if available. */
                fun billingProviderError(billingProviderError: String) =
                    billingProviderError(JsonField.of(billingProviderError))

                /** Error message from the billing provider, if available. */
                fun billingProviderError(billingProviderError: JsonField<String>) = apply {
                    this.billingProviderError = billingProviderError
                }

                /** The ID of the payment in the external system, if available. */
                fun externalPaymentId(externalPaymentId: String) =
                    externalPaymentId(JsonField.of(externalPaymentId))

                /** The ID of the payment in the external system, if available. */
                fun externalPaymentId(externalPaymentId: JsonField<String>) = apply {
                    this.externalPaymentId = externalPaymentId
                }

                fun externalStatus(externalStatus: ExternalStatus) =
                    externalStatus(JsonField.of(externalStatus))

                fun externalStatus(externalStatus: JsonField<ExternalStatus>) = apply {
                    this.externalStatus = externalStatus
                }

                fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

                fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

                /** The subtotal amount invoiced, if available from the billing provider. */
                fun invoicedSubTotal(invoicedSubTotal: Double) =
                    invoicedSubTotal(JsonField.of(invoicedSubTotal))

                /** The subtotal amount invoiced, if available from the billing provider. */
                fun invoicedSubTotal(invoicedSubTotal: JsonField<Double>) = apply {
                    this.invoicedSubTotal = invoicedSubTotal
                }

                /** The total amount invoiced, if available from the billing provider. */
                fun invoicedTotal(invoicedTotal: Double) =
                    invoicedTotal(JsonField.of(invoicedTotal))

                /** The total amount invoiced, if available from the billing provider. */
                fun invoicedTotal(invoicedTotal: JsonField<Double>) = apply {
                    this.invoicedTotal = invoicedTotal
                }

                fun issuedAtTimestamp(issuedAtTimestamp: OffsetDateTime) =
                    issuedAtTimestamp(JsonField.of(issuedAtTimestamp))

                fun issuedAtTimestamp(issuedAtTimestamp: JsonField<OffsetDateTime>) = apply {
                    this.issuedAtTimestamp = issuedAtTimestamp
                }

                /** A URL to the PDF of the invoice, if available from the billing provider. */
                fun pdfUrl(pdfUrl: String) = pdfUrl(JsonField.of(pdfUrl))

                /** A URL to the PDF of the invoice, if available from the billing provider. */
                fun pdfUrl(pdfUrl: JsonField<String>) = apply { this.pdfUrl = pdfUrl }

                /** Tax details for the invoice, if available from the billing provider. */
                fun tax(tax: Tax) = tax(JsonField.of(tax))

                /** Tax details for the invoice, if available from the billing provider. */
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
                        additionalProperties.toImmutable(),
                    )
            }

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is BillingProviderType && value == other.value /* spotless:on */
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ExternalStatus && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Tax details for the invoice, if available from the billing provider. */
            @NoAutoDetect
            class Tax
            @JsonCreator
            private constructor(
                @JsonProperty("total_tax_amount")
                @ExcludeMissing
                private val totalTaxAmount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("total_taxable_amount")
                @ExcludeMissing
                private val totalTaxableAmount: JsonField<Double> = JsonMissing.of(),
                @JsonProperty("transaction_id")
                @ExcludeMissing
                private val transactionId: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** The total tax amount applied to the invoice. */
                fun totalTaxAmount(): Optional<Double> =
                    Optional.ofNullable(totalTaxAmount.getNullable("total_tax_amount"))

                /** The total taxable amount of the invoice. */
                fun totalTaxableAmount(): Optional<Double> =
                    Optional.ofNullable(totalTaxableAmount.getNullable("total_taxable_amount"))

                /** The transaction ID associated with the tax calculation. */
                fun transactionId(): Optional<String> =
                    Optional.ofNullable(transactionId.getNullable("transaction_id"))

                /** The total tax amount applied to the invoice. */
                @JsonProperty("total_tax_amount")
                @ExcludeMissing
                fun _totalTaxAmount(): JsonField<Double> = totalTaxAmount

                /** The total taxable amount of the invoice. */
                @JsonProperty("total_taxable_amount")
                @ExcludeMissing
                fun _totalTaxableAmount(): JsonField<Double> = totalTaxableAmount

                /** The transaction ID associated with the tax calculation. */
                @JsonProperty("transaction_id")
                @ExcludeMissing
                fun _transactionId(): JsonField<String> = transactionId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Tax = apply {
                    if (validated) {
                        return@apply
                    }

                    totalTaxAmount()
                    totalTaxableAmount()
                    transactionId()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

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

                    /** The total tax amount applied to the invoice. */
                    fun totalTaxAmount(totalTaxAmount: JsonField<Double>) = apply {
                        this.totalTaxAmount = totalTaxAmount
                    }

                    /** The total taxable amount of the invoice. */
                    fun totalTaxableAmount(totalTaxableAmount: Double) =
                        totalTaxableAmount(JsonField.of(totalTaxableAmount))

                    /** The total taxable amount of the invoice. */
                    fun totalTaxableAmount(totalTaxableAmount: JsonField<Double>) = apply {
                        this.totalTaxableAmount = totalTaxableAmount
                    }

                    /** The transaction ID associated with the tax calculation. */
                    fun transactionId(transactionId: String) =
                        transactionId(JsonField.of(transactionId))

                    /** The transaction ID associated with the tax calculation. */
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

                    fun build(): Tax =
                        Tax(
                            totalTaxAmount,
                            totalTaxableAmount,
                            transactionId,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Tax && totalTaxAmount == other.totalTaxAmount && totalTaxableAmount == other.totalTaxableAmount && transactionId == other.transactionId && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(totalTaxAmount, totalTaxableAmount, transactionId, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Tax{totalTaxAmount=$totalTaxAmount, totalTaxableAmount=$totalTaxableAmount, transactionId=$transactionId, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CorrectedExternalInvoice && billingProviderType == other.billingProviderType && billingProviderError == other.billingProviderError && externalPaymentId == other.externalPaymentId && externalStatus == other.externalStatus && invoiceId == other.invoiceId && invoicedSubTotal == other.invoicedSubTotal && invoicedTotal == other.invoicedTotal && issuedAtTimestamp == other.issuedAtTimestamp && pdfUrl == other.pdfUrl && tax == other.tax && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(billingProviderType, billingProviderError, externalPaymentId, externalStatus, invoiceId, invoicedSubTotal, invoicedTotal, issuedAtTimestamp, pdfUrl, tax, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CorrectedExternalInvoice{billingProviderType=$billingProviderType, billingProviderError=$billingProviderError, externalPaymentId=$externalPaymentId, externalStatus=$externalStatus, invoiceId=$invoiceId, invoicedSubTotal=$invoicedSubTotal, invoicedTotal=$invoicedTotal, issuedAtTimestamp=$issuedAtTimestamp, pdfUrl=$pdfUrl, tax=$tax, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CorrectionRecord && correctedInvoiceId == other.correctedInvoiceId && memo == other.memo && reason == other.reason && correctedExternalInvoice == other.correctedExternalInvoice && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(correctedInvoiceId, memo, reason, correctedExternalInvoice, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CorrectionRecord{correctedInvoiceId=$correctedInvoiceId, memo=$memo, reason=$reason, correctedExternalInvoice=$correctedExternalInvoice, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class CustomFields
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CustomFields = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun build(): CustomFields = CustomFields(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomFields && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
    }

    /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
    @NoAutoDetect
    class CustomerCustomFields
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CustomerCustomFields = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun build(): CustomerCustomFields =
                CustomerCustomFields(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomerCustomFields && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "CustomerCustomFields{additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class ExternalInvoice
    @JsonCreator
    private constructor(
        @JsonProperty("billing_provider_type")
        @ExcludeMissing
        private val billingProviderType: JsonField<BillingProviderType> = JsonMissing.of(),
        @JsonProperty("billing_provider_error")
        @ExcludeMissing
        private val billingProviderError: JsonField<String> = JsonMissing.of(),
        @JsonProperty("external_payment_id")
        @ExcludeMissing
        private val externalPaymentId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("external_status")
        @ExcludeMissing
        private val externalStatus: JsonField<ExternalStatus> = JsonMissing.of(),
        @JsonProperty("invoice_id")
        @ExcludeMissing
        private val invoiceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("invoiced_sub_total")
        @ExcludeMissing
        private val invoicedSubTotal: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("invoiced_total")
        @ExcludeMissing
        private val invoicedTotal: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("issued_at_timestamp")
        @ExcludeMissing
        private val issuedAtTimestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("pdf_url")
        @ExcludeMissing
        private val pdfUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tax") @ExcludeMissing private val tax: JsonField<Tax> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun billingProviderType(): BillingProviderType =
            billingProviderType.getRequired("billing_provider_type")

        /** Error message from the billing provider, if available. */
        fun billingProviderError(): Optional<String> =
            Optional.ofNullable(billingProviderError.getNullable("billing_provider_error"))

        /** The ID of the payment in the external system, if available. */
        fun externalPaymentId(): Optional<String> =
            Optional.ofNullable(externalPaymentId.getNullable("external_payment_id"))

        fun externalStatus(): Optional<ExternalStatus> =
            Optional.ofNullable(externalStatus.getNullable("external_status"))

        fun invoiceId(): Optional<String> = Optional.ofNullable(invoiceId.getNullable("invoice_id"))

        /** The subtotal amount invoiced, if available from the billing provider. */
        fun invoicedSubTotal(): Optional<Double> =
            Optional.ofNullable(invoicedSubTotal.getNullable("invoiced_sub_total"))

        /** The total amount invoiced, if available from the billing provider. */
        fun invoicedTotal(): Optional<Double> =
            Optional.ofNullable(invoicedTotal.getNullable("invoiced_total"))

        fun issuedAtTimestamp(): Optional<OffsetDateTime> =
            Optional.ofNullable(issuedAtTimestamp.getNullable("issued_at_timestamp"))

        /** A URL to the PDF of the invoice, if available from the billing provider. */
        fun pdfUrl(): Optional<String> = Optional.ofNullable(pdfUrl.getNullable("pdf_url"))

        /** Tax details for the invoice, if available from the billing provider. */
        fun tax(): Optional<Tax> = Optional.ofNullable(tax.getNullable("tax"))

        @JsonProperty("billing_provider_type")
        @ExcludeMissing
        fun _billingProviderType(): JsonField<BillingProviderType> = billingProviderType

        /** Error message from the billing provider, if available. */
        @JsonProperty("billing_provider_error")
        @ExcludeMissing
        fun _billingProviderError(): JsonField<String> = billingProviderError

        /** The ID of the payment in the external system, if available. */
        @JsonProperty("external_payment_id")
        @ExcludeMissing
        fun _externalPaymentId(): JsonField<String> = externalPaymentId

        @JsonProperty("external_status")
        @ExcludeMissing
        fun _externalStatus(): JsonField<ExternalStatus> = externalStatus

        @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId(): JsonField<String> = invoiceId

        /** The subtotal amount invoiced, if available from the billing provider. */
        @JsonProperty("invoiced_sub_total")
        @ExcludeMissing
        fun _invoicedSubTotal(): JsonField<Double> = invoicedSubTotal

        /** The total amount invoiced, if available from the billing provider. */
        @JsonProperty("invoiced_total")
        @ExcludeMissing
        fun _invoicedTotal(): JsonField<Double> = invoicedTotal

        @JsonProperty("issued_at_timestamp")
        @ExcludeMissing
        fun _issuedAtTimestamp(): JsonField<OffsetDateTime> = issuedAtTimestamp

        /** A URL to the PDF of the invoice, if available from the billing provider. */
        @JsonProperty("pdf_url") @ExcludeMissing fun _pdfUrl(): JsonField<String> = pdfUrl

        /** Tax details for the invoice, if available from the billing provider. */
        @JsonProperty("tax") @ExcludeMissing fun _tax(): JsonField<Tax> = tax

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ExternalInvoice = apply {
            if (validated) {
                return@apply
            }

            billingProviderType()
            billingProviderError()
            externalPaymentId()
            externalStatus()
            invoiceId()
            invoicedSubTotal()
            invoicedTotal()
            issuedAtTimestamp()
            pdfUrl()
            tax().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun billingProviderType(billingProviderType: JsonField<BillingProviderType>) = apply {
                this.billingProviderType = billingProviderType
            }

            /** Error message from the billing provider, if available. */
            fun billingProviderError(billingProviderError: String) =
                billingProviderError(JsonField.of(billingProviderError))

            /** Error message from the billing provider, if available. */
            fun billingProviderError(billingProviderError: JsonField<String>) = apply {
                this.billingProviderError = billingProviderError
            }

            /** The ID of the payment in the external system, if available. */
            fun externalPaymentId(externalPaymentId: String) =
                externalPaymentId(JsonField.of(externalPaymentId))

            /** The ID of the payment in the external system, if available. */
            fun externalPaymentId(externalPaymentId: JsonField<String>) = apply {
                this.externalPaymentId = externalPaymentId
            }

            fun externalStatus(externalStatus: ExternalStatus) =
                externalStatus(JsonField.of(externalStatus))

            fun externalStatus(externalStatus: JsonField<ExternalStatus>) = apply {
                this.externalStatus = externalStatus
            }

            fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

            fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

            /** The subtotal amount invoiced, if available from the billing provider. */
            fun invoicedSubTotal(invoicedSubTotal: Double) =
                invoicedSubTotal(JsonField.of(invoicedSubTotal))

            /** The subtotal amount invoiced, if available from the billing provider. */
            fun invoicedSubTotal(invoicedSubTotal: JsonField<Double>) = apply {
                this.invoicedSubTotal = invoicedSubTotal
            }

            /** The total amount invoiced, if available from the billing provider. */
            fun invoicedTotal(invoicedTotal: Double) = invoicedTotal(JsonField.of(invoicedTotal))

            /** The total amount invoiced, if available from the billing provider. */
            fun invoicedTotal(invoicedTotal: JsonField<Double>) = apply {
                this.invoicedTotal = invoicedTotal
            }

            fun issuedAtTimestamp(issuedAtTimestamp: OffsetDateTime) =
                issuedAtTimestamp(JsonField.of(issuedAtTimestamp))

            fun issuedAtTimestamp(issuedAtTimestamp: JsonField<OffsetDateTime>) = apply {
                this.issuedAtTimestamp = issuedAtTimestamp
            }

            /** A URL to the PDF of the invoice, if available from the billing provider. */
            fun pdfUrl(pdfUrl: String) = pdfUrl(JsonField.of(pdfUrl))

            /** A URL to the PDF of the invoice, if available from the billing provider. */
            fun pdfUrl(pdfUrl: JsonField<String>) = apply { this.pdfUrl = pdfUrl }

            /** Tax details for the invoice, if available from the billing provider. */
            fun tax(tax: Tax) = tax(JsonField.of(tax))

            /** Tax details for the invoice, if available from the billing provider. */
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
                    additionalProperties.toImmutable(),
                )
        }

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingProviderType && value == other.value /* spotless:on */
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ExternalStatus && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Tax details for the invoice, if available from the billing provider. */
        @NoAutoDetect
        class Tax
        @JsonCreator
        private constructor(
            @JsonProperty("total_tax_amount")
            @ExcludeMissing
            private val totalTaxAmount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("total_taxable_amount")
            @ExcludeMissing
            private val totalTaxableAmount: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("transaction_id")
            @ExcludeMissing
            private val transactionId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The total tax amount applied to the invoice. */
            fun totalTaxAmount(): Optional<Double> =
                Optional.ofNullable(totalTaxAmount.getNullable("total_tax_amount"))

            /** The total taxable amount of the invoice. */
            fun totalTaxableAmount(): Optional<Double> =
                Optional.ofNullable(totalTaxableAmount.getNullable("total_taxable_amount"))

            /** The transaction ID associated with the tax calculation. */
            fun transactionId(): Optional<String> =
                Optional.ofNullable(transactionId.getNullable("transaction_id"))

            /** The total tax amount applied to the invoice. */
            @JsonProperty("total_tax_amount")
            @ExcludeMissing
            fun _totalTaxAmount(): JsonField<Double> = totalTaxAmount

            /** The total taxable amount of the invoice. */
            @JsonProperty("total_taxable_amount")
            @ExcludeMissing
            fun _totalTaxableAmount(): JsonField<Double> = totalTaxableAmount

            /** The transaction ID associated with the tax calculation. */
            @JsonProperty("transaction_id")
            @ExcludeMissing
            fun _transactionId(): JsonField<String> = transactionId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Tax = apply {
                if (validated) {
                    return@apply
                }

                totalTaxAmount()
                totalTaxableAmount()
                transactionId()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                /** The total tax amount applied to the invoice. */
                fun totalTaxAmount(totalTaxAmount: JsonField<Double>) = apply {
                    this.totalTaxAmount = totalTaxAmount
                }

                /** The total taxable amount of the invoice. */
                fun totalTaxableAmount(totalTaxableAmount: Double) =
                    totalTaxableAmount(JsonField.of(totalTaxableAmount))

                /** The total taxable amount of the invoice. */
                fun totalTaxableAmount(totalTaxableAmount: JsonField<Double>) = apply {
                    this.totalTaxableAmount = totalTaxableAmount
                }

                /** The transaction ID associated with the tax calculation. */
                fun transactionId(transactionId: String) =
                    transactionId(JsonField.of(transactionId))

                /** The transaction ID associated with the tax calculation. */
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

                fun build(): Tax =
                    Tax(
                        totalTaxAmount,
                        totalTaxableAmount,
                        transactionId,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Tax && totalTaxAmount == other.totalTaxAmount && totalTaxableAmount == other.totalTaxableAmount && transactionId == other.transactionId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(totalTaxAmount, totalTaxableAmount, transactionId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Tax{totalTaxAmount=$totalTaxAmount, totalTaxableAmount=$totalTaxableAmount, transactionId=$transactionId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExternalInvoice && billingProviderType == other.billingProviderType && billingProviderError == other.billingProviderError && externalPaymentId == other.externalPaymentId && externalStatus == other.externalStatus && invoiceId == other.invoiceId && invoicedSubTotal == other.invoicedSubTotal && invoicedTotal == other.invoicedTotal && issuedAtTimestamp == other.issuedAtTimestamp && pdfUrl == other.pdfUrl && tax == other.tax && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(billingProviderType, billingProviderError, externalPaymentId, externalStatus, invoiceId, invoicedSubTotal, invoicedTotal, issuedAtTimestamp, pdfUrl, tax, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ExternalInvoice{billingProviderType=$billingProviderType, billingProviderError=$billingProviderError, externalPaymentId=$externalPaymentId, externalStatus=$externalStatus, invoiceId=$invoiceId, invoicedSubTotal=$invoicedSubTotal, invoicedTotal=$invoicedTotal, issuedAtTimestamp=$issuedAtTimestamp, pdfUrl=$pdfUrl, tax=$tax, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class InvoiceAdjustment
    @JsonCreator
    private constructor(
        @JsonProperty("credit_type")
        @ExcludeMissing
        private val creditType: JsonField<CreditTypeData> = JsonMissing.of(),
        @JsonProperty("name")
        @ExcludeMissing
        private val name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total")
        @ExcludeMissing
        private val total: JsonField<Double> = JsonMissing.of(),
        @JsonProperty("credit_grant_custom_fields")
        @ExcludeMissing
        private val creditGrantCustomFields: JsonField<CreditGrantCustomFields> = JsonMissing.of(),
        @JsonProperty("credit_grant_id")
        @ExcludeMissing
        private val creditGrantId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun creditType(): CreditTypeData = creditType.getRequired("credit_type")

        fun name(): String = name.getRequired("name")

        fun total(): Double = total.getRequired("total")

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        fun creditGrantCustomFields(): Optional<CreditGrantCustomFields> =
            Optional.ofNullable(creditGrantCustomFields.getNullable("credit_grant_custom_fields"))

        fun creditGrantId(): Optional<String> =
            Optional.ofNullable(creditGrantId.getNullable("credit_grant_id"))

        @JsonProperty("credit_type")
        @ExcludeMissing
        fun _creditType(): JsonField<CreditTypeData> = creditType

        @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

        @JsonProperty("total") @ExcludeMissing fun _total(): JsonField<Double> = total

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        @JsonProperty("credit_grant_custom_fields")
        @ExcludeMissing
        fun _creditGrantCustomFields(): JsonField<CreditGrantCustomFields> = creditGrantCustomFields

        @JsonProperty("credit_grant_id")
        @ExcludeMissing
        fun _creditGrantId(): JsonField<String> = creditGrantId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

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

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun creditType(creditType: JsonField<CreditTypeData>) = apply {
                this.creditType = creditType
            }

            fun name(name: String) = name(JsonField.of(name))

            fun name(name: JsonField<String>) = apply { this.name = name }

            fun total(total: Double) = total(JsonField.of(total))

            fun total(total: JsonField<Double>) = apply { this.total = total }

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun creditGrantCustomFields(creditGrantCustomFields: CreditGrantCustomFields) =
                creditGrantCustomFields(JsonField.of(creditGrantCustomFields))

            /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
            fun creditGrantCustomFields(
                creditGrantCustomFields: JsonField<CreditGrantCustomFields>
            ) = apply { this.creditGrantCustomFields = creditGrantCustomFields }

            fun creditGrantId(creditGrantId: String) = creditGrantId(JsonField.of(creditGrantId))

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

            fun build(): InvoiceAdjustment =
                InvoiceAdjustment(
                    checkRequired("creditType", creditType),
                    checkRequired("name", name),
                    checkRequired("total", total),
                    creditGrantCustomFields,
                    creditGrantId,
                    additionalProperties.toImmutable(),
                )
        }

        /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
        @NoAutoDetect
        class CreditGrantCustomFields
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CreditGrantCustomFields = apply {
                if (validated) {
                    return@apply
                }

                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun build(): CreditGrantCustomFields =
                    CreditGrantCustomFields(additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CreditGrantCustomFields && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CreditGrantCustomFields{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InvoiceAdjustment && creditType == other.creditType && name == other.name && total == other.total && creditGrantCustomFields == other.creditGrantCustomFields && creditGrantId == other.creditGrantId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(creditType, name, total, creditGrantCustomFields, creditGrantId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InvoiceAdjustment{creditType=$creditType, name=$name, total=$total, creditGrantCustomFields=$creditGrantCustomFields, creditGrantId=$creditGrantId, additionalProperties=$additionalProperties}"
    }

    /**
     * Required for account hierarchy usage invoices. An object containing the contract and customer
     * UUIDs that pay for this invoice.
     */
    @NoAutoDetect
    class Payer
    @JsonCreator
    private constructor(
        @JsonProperty("contract_id")
        @ExcludeMissing
        private val contractId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("customer_id")
        @ExcludeMissing
        private val customerId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun contractId(): String = contractId.getRequired("contract_id")

        fun customerId(): String = customerId.getRequired("customer_id")

        @JsonProperty("contract_id")
        @ExcludeMissing
        fun _contractId(): JsonField<String> = contractId

        @JsonProperty("customer_id")
        @ExcludeMissing
        fun _customerId(): JsonField<String> = customerId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Payer = apply {
            if (validated) {
                return@apply
            }

            contractId()
            customerId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun contractId(contractId: JsonField<String>) = apply { this.contractId = contractId }

            fun customerId(customerId: String) = customerId(JsonField.of(customerId))

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

            fun build(): Payer =
                Payer(
                    checkRequired("contractId", contractId),
                    checkRequired("customerId", customerId),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Payer && contractId == other.contractId && customerId == other.customerId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(contractId, customerId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Payer{contractId=$contractId, customerId=$customerId, additionalProperties=$additionalProperties}"
    }

    /** Custom fields to be added eg. { "key1": "value1", "key2": "value2" } */
    @NoAutoDetect
    class PlanCustomFields
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PlanCustomFields = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun build(): PlanCustomFields = PlanCustomFields(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PlanCustomFields && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "PlanCustomFields{additionalProperties=$additionalProperties}"
    }

    /** Only present for contract invoices with reseller royalties. */
    @NoAutoDetect
    class ResellerRoyalty
    @JsonCreator
    private constructor(
        @JsonProperty("fraction")
        @ExcludeMissing
        private val fraction: JsonField<String> = JsonMissing.of(),
        @JsonProperty("netsuite_reseller_id")
        @ExcludeMissing
        private val netsuiteResellerId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("reseller_type")
        @ExcludeMissing
        private val resellerType: JsonField<ResellerType> = JsonMissing.of(),
        @JsonProperty("aws_options")
        @ExcludeMissing
        private val awsOptions: JsonField<AwsOptions> = JsonMissing.of(),
        @JsonProperty("gcp_options")
        @ExcludeMissing
        private val gcpOptions: JsonField<GcpOptions> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun fraction(): String = fraction.getRequired("fraction")

        fun netsuiteResellerId(): String = netsuiteResellerId.getRequired("netsuite_reseller_id")

        fun resellerType(): ResellerType = resellerType.getRequired("reseller_type")

        fun awsOptions(): Optional<AwsOptions> =
            Optional.ofNullable(awsOptions.getNullable("aws_options"))

        fun gcpOptions(): Optional<GcpOptions> =
            Optional.ofNullable(gcpOptions.getNullable("gcp_options"))

        @JsonProperty("fraction") @ExcludeMissing fun _fraction(): JsonField<String> = fraction

        @JsonProperty("netsuite_reseller_id")
        @ExcludeMissing
        fun _netsuiteResellerId(): JsonField<String> = netsuiteResellerId

        @JsonProperty("reseller_type")
        @ExcludeMissing
        fun _resellerType(): JsonField<ResellerType> = resellerType

        @JsonProperty("aws_options")
        @ExcludeMissing
        fun _awsOptions(): JsonField<AwsOptions> = awsOptions

        @JsonProperty("gcp_options")
        @ExcludeMissing
        fun _gcpOptions(): JsonField<GcpOptions> = gcpOptions

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ResellerRoyalty = apply {
            if (validated) {
                return@apply
            }

            fraction()
            netsuiteResellerId()
            resellerType()
            awsOptions().ifPresent { it.validate() }
            gcpOptions().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun fraction(fraction: JsonField<String>) = apply { this.fraction = fraction }

            fun netsuiteResellerId(netsuiteResellerId: String) =
                netsuiteResellerId(JsonField.of(netsuiteResellerId))

            fun netsuiteResellerId(netsuiteResellerId: JsonField<String>) = apply {
                this.netsuiteResellerId = netsuiteResellerId
            }

            fun resellerType(resellerType: ResellerType) = resellerType(JsonField.of(resellerType))

            fun resellerType(resellerType: JsonField<ResellerType>) = apply {
                this.resellerType = resellerType
            }

            fun awsOptions(awsOptions: AwsOptions) = awsOptions(JsonField.of(awsOptions))

            fun awsOptions(awsOptions: JsonField<AwsOptions>) = apply {
                this.awsOptions = awsOptions
            }

            fun gcpOptions(gcpOptions: GcpOptions) = gcpOptions(JsonField.of(gcpOptions))

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

            fun build(): ResellerRoyalty =
                ResellerRoyalty(
                    checkRequired("fraction", fraction),
                    checkRequired("netsuiteResellerId", netsuiteResellerId),
                    checkRequired("resellerType", resellerType),
                    awsOptions,
                    gcpOptions,
                    additionalProperties.toImmutable(),
                )
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ResellerType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class AwsOptions
        @JsonCreator
        private constructor(
            @JsonProperty("aws_account_number")
            @ExcludeMissing
            private val awsAccountNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("aws_offer_id")
            @ExcludeMissing
            private val awsOfferId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("aws_payer_reference_id")
            @ExcludeMissing
            private val awsPayerReferenceId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun awsAccountNumber(): Optional<String> =
                Optional.ofNullable(awsAccountNumber.getNullable("aws_account_number"))

            fun awsOfferId(): Optional<String> =
                Optional.ofNullable(awsOfferId.getNullable("aws_offer_id"))

            fun awsPayerReferenceId(): Optional<String> =
                Optional.ofNullable(awsPayerReferenceId.getNullable("aws_payer_reference_id"))

            @JsonProperty("aws_account_number")
            @ExcludeMissing
            fun _awsAccountNumber(): JsonField<String> = awsAccountNumber

            @JsonProperty("aws_offer_id")
            @ExcludeMissing
            fun _awsOfferId(): JsonField<String> = awsOfferId

            @JsonProperty("aws_payer_reference_id")
            @ExcludeMissing
            fun _awsPayerReferenceId(): JsonField<String> = awsPayerReferenceId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): AwsOptions = apply {
                if (validated) {
                    return@apply
                }

                awsAccountNumber()
                awsOfferId()
                awsPayerReferenceId()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun awsAccountNumber(awsAccountNumber: JsonField<String>) = apply {
                    this.awsAccountNumber = awsAccountNumber
                }

                fun awsOfferId(awsOfferId: String) = awsOfferId(JsonField.of(awsOfferId))

                fun awsOfferId(awsOfferId: JsonField<String>) = apply {
                    this.awsOfferId = awsOfferId
                }

                fun awsPayerReferenceId(awsPayerReferenceId: String) =
                    awsPayerReferenceId(JsonField.of(awsPayerReferenceId))

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

                fun build(): AwsOptions =
                    AwsOptions(
                        awsAccountNumber,
                        awsOfferId,
                        awsPayerReferenceId,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AwsOptions && awsAccountNumber == other.awsAccountNumber && awsOfferId == other.awsOfferId && awsPayerReferenceId == other.awsPayerReferenceId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(awsAccountNumber, awsOfferId, awsPayerReferenceId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AwsOptions{awsAccountNumber=$awsAccountNumber, awsOfferId=$awsOfferId, awsPayerReferenceId=$awsPayerReferenceId, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class GcpOptions
        @JsonCreator
        private constructor(
            @JsonProperty("gcp_account_id")
            @ExcludeMissing
            private val gcpAccountId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("gcp_offer_id")
            @ExcludeMissing
            private val gcpOfferId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun gcpAccountId(): Optional<String> =
                Optional.ofNullable(gcpAccountId.getNullable("gcp_account_id"))

            fun gcpOfferId(): Optional<String> =
                Optional.ofNullable(gcpOfferId.getNullable("gcp_offer_id"))

            @JsonProperty("gcp_account_id")
            @ExcludeMissing
            fun _gcpAccountId(): JsonField<String> = gcpAccountId

            @JsonProperty("gcp_offer_id")
            @ExcludeMissing
            fun _gcpOfferId(): JsonField<String> = gcpOfferId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): GcpOptions = apply {
                if (validated) {
                    return@apply
                }

                gcpAccountId()
                gcpOfferId()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun gcpAccountId(gcpAccountId: JsonField<String>) = apply {
                    this.gcpAccountId = gcpAccountId
                }

                fun gcpOfferId(gcpOfferId: String) = gcpOfferId(JsonField.of(gcpOfferId))

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

                fun build(): GcpOptions =
                    GcpOptions(gcpAccountId, gcpOfferId, additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is GcpOptions && gcpAccountId == other.gcpAccountId && gcpOfferId == other.gcpOfferId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(gcpAccountId, gcpOfferId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "GcpOptions{gcpAccountId=$gcpAccountId, gcpOfferId=$gcpOfferId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ResellerRoyalty && fraction == other.fraction && netsuiteResellerId == other.netsuiteResellerId && resellerType == other.resellerType && awsOptions == other.awsOptions && gcpOptions == other.gcpOptions && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(fraction, netsuiteResellerId, resellerType, awsOptions, gcpOptions, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ResellerRoyalty{fraction=$fraction, netsuiteResellerId=$netsuiteResellerId, resellerType=$resellerType, awsOptions=$awsOptions, gcpOptions=$gcpOptions, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class RevenueSystemInvoice
    @JsonCreator
    private constructor(
        @JsonProperty("revenue_system_external_entity_type")
        @ExcludeMissing
        private val revenueSystemExternalEntityType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("revenue_system_provider")
        @ExcludeMissing
        private val revenueSystemProvider: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sync_status")
        @ExcludeMissing
        private val syncStatus: JsonField<String> = JsonMissing.of(),
        @JsonProperty("error_message")
        @ExcludeMissing
        private val errorMessage: JsonField<String> = JsonMissing.of(),
        @JsonProperty("revenue_system_external_entity_id")
        @ExcludeMissing
        private val revenueSystemExternalEntityId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun revenueSystemExternalEntityType(): String =
            revenueSystemExternalEntityType.getRequired("revenue_system_external_entity_type")

        fun revenueSystemProvider(): String =
            revenueSystemProvider.getRequired("revenue_system_provider")

        fun syncStatus(): String = syncStatus.getRequired("sync_status")

        /** The error message from the revenue system, if available. */
        fun errorMessage(): Optional<String> =
            Optional.ofNullable(errorMessage.getNullable("error_message"))

        fun revenueSystemExternalEntityId(): Optional<String> =
            Optional.ofNullable(
                revenueSystemExternalEntityId.getNullable("revenue_system_external_entity_id")
            )

        @JsonProperty("revenue_system_external_entity_type")
        @ExcludeMissing
        fun _revenueSystemExternalEntityType(): JsonField<String> = revenueSystemExternalEntityType

        @JsonProperty("revenue_system_provider")
        @ExcludeMissing
        fun _revenueSystemProvider(): JsonField<String> = revenueSystemProvider

        @JsonProperty("sync_status")
        @ExcludeMissing
        fun _syncStatus(): JsonField<String> = syncStatus

        /** The error message from the revenue system, if available. */
        @JsonProperty("error_message")
        @ExcludeMissing
        fun _errorMessage(): JsonField<String> = errorMessage

        @JsonProperty("revenue_system_external_entity_id")
        @ExcludeMissing
        fun _revenueSystemExternalEntityId(): JsonField<String> = revenueSystemExternalEntityId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

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

        fun toBuilder() = Builder().from(this)

        companion object {

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

            fun revenueSystemExternalEntityType(
                revenueSystemExternalEntityType: JsonField<String>
            ) = apply { this.revenueSystemExternalEntityType = revenueSystemExternalEntityType }

            fun revenueSystemProvider(revenueSystemProvider: String) =
                revenueSystemProvider(JsonField.of(revenueSystemProvider))

            fun revenueSystemProvider(revenueSystemProvider: JsonField<String>) = apply {
                this.revenueSystemProvider = revenueSystemProvider
            }

            fun syncStatus(syncStatus: String) = syncStatus(JsonField.of(syncStatus))

            fun syncStatus(syncStatus: JsonField<String>) = apply { this.syncStatus = syncStatus }

            /** The error message from the revenue system, if available. */
            fun errorMessage(errorMessage: String) = errorMessage(JsonField.of(errorMessage))

            /** The error message from the revenue system, if available. */
            fun errorMessage(errorMessage: JsonField<String>) = apply {
                this.errorMessage = errorMessage
            }

            fun revenueSystemExternalEntityId(revenueSystemExternalEntityId: String) =
                revenueSystemExternalEntityId(JsonField.of(revenueSystemExternalEntityId))

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
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RevenueSystemInvoice && revenueSystemExternalEntityType == other.revenueSystemExternalEntityType && revenueSystemProvider == other.revenueSystemProvider && syncStatus == other.syncStatus && errorMessage == other.errorMessage && revenueSystemExternalEntityId == other.revenueSystemExternalEntityId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(revenueSystemExternalEntityType, revenueSystemProvider, syncStatus, errorMessage, revenueSystemExternalEntityId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "RevenueSystemInvoice{revenueSystemExternalEntityType=$revenueSystemExternalEntityType, revenueSystemProvider=$revenueSystemProvider, syncStatus=$syncStatus, errorMessage=$errorMessage, revenueSystemExternalEntityId=$revenueSystemExternalEntityId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Invoice && id == other.id && creditType == other.creditType && customerId == other.customerId && lineItems == other.lineItems && status == other.status && total == other.total && type == other.type && amendmentId == other.amendmentId && billableStatus == other.billableStatus && constituentInvoices == other.constituentInvoices && contractCustomFields == other.contractCustomFields && contractId == other.contractId && correctionRecord == other.correctionRecord && createdAt == other.createdAt && customFields == other.customFields && customerCustomFields == other.customerCustomFields && endTimestamp == other.endTimestamp && externalInvoice == other.externalInvoice && invoiceAdjustments == other.invoiceAdjustments && issuedAt == other.issuedAt && netPaymentTermsDays == other.netPaymentTermsDays && netsuiteSalesOrderId == other.netsuiteSalesOrderId && payer == other.payer && planCustomFields == other.planCustomFields && planId == other.planId && planName == other.planName && resellerRoyalty == other.resellerRoyalty && revenueSystemInvoices == other.revenueSystemInvoices && salesforceOpportunityId == other.salesforceOpportunityId && startTimestamp == other.startTimestamp && subtotal == other.subtotal && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, creditType, customerId, lineItems, status, total, type, amendmentId, billableStatus, constituentInvoices, contractCustomFields, contractId, correctionRecord, createdAt, customFields, customerCustomFields, endTimestamp, externalInvoice, invoiceAdjustments, issuedAt, netPaymentTermsDays, netsuiteSalesOrderId, payer, planCustomFields, planId, planName, resellerRoyalty, revenueSystemInvoices, salesforceOpportunityId, startTimestamp, subtotal, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Invoice{id=$id, creditType=$creditType, customerId=$customerId, lineItems=$lineItems, status=$status, total=$total, type=$type, amendmentId=$amendmentId, billableStatus=$billableStatus, constituentInvoices=$constituentInvoices, contractCustomFields=$contractCustomFields, contractId=$contractId, correctionRecord=$correctionRecord, createdAt=$createdAt, customFields=$customFields, customerCustomFields=$customerCustomFields, endTimestamp=$endTimestamp, externalInvoice=$externalInvoice, invoiceAdjustments=$invoiceAdjustments, issuedAt=$issuedAt, netPaymentTermsDays=$netPaymentTermsDays, netsuiteSalesOrderId=$netsuiteSalesOrderId, payer=$payer, planCustomFields=$planCustomFields, planId=$planId, planName=$planName, resellerRoyalty=$resellerRoyalty, revenueSystemInvoices=$revenueSystemInvoices, salesforceOpportunityId=$salesforceOpportunityId, startTimestamp=$startTimestamp, subtotal=$subtotal, additionalProperties=$additionalProperties}"
}
