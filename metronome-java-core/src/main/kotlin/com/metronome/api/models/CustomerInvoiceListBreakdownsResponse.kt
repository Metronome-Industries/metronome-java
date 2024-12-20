// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = CustomerInvoiceListBreakdownsResponse.Builder::class)
@NoAutoDetect
class CustomerInvoiceListBreakdownsResponse
private constructor(
    private val id: JsonField<String>,
    private val customerId: JsonField<String>,
    private val customerCustomFields: JsonField<Invoice.CustomerCustomFields>,
    private val netsuiteSalesOrderId: JsonField<String>,
    private val salesforceOpportunityId: JsonField<String>,
    private val netPaymentTermsDays: JsonField<Double>,
    private val creditType: JsonField<CreditTypeData>,
    private val invoiceAdjustments: JsonField<List<Invoice.InvoiceAdjustment>>,
    private val lineItems: JsonField<List<Invoice.LineItem>>,
    private val startTimestamp: JsonField<OffsetDateTime>,
    private val endTimestamp: JsonField<OffsetDateTime>,
    private val issuedAt: JsonField<OffsetDateTime>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val status: JsonField<String>,
    private val subtotal: JsonField<Double>,
    private val total: JsonField<Double>,
    private val type: JsonField<String>,
    private val externalInvoice: JsonField<Invoice.ExternalInvoice>,
    private val planId: JsonField<String>,
    private val planName: JsonField<String>,
    private val planCustomFields: JsonField<Invoice.PlanCustomFields>,
    private val contractId: JsonField<String>,
    private val contractCustomFields: JsonField<Invoice.ContractCustomFields>,
    private val amendmentId: JsonField<String>,
    private val correctionRecord: JsonField<Invoice.CorrectionRecord>,
    private val resellerRoyalty: JsonField<Invoice.ResellerRoyalty>,
    private val customFields: JsonField<Invoice.CustomFields>,
    private val billableStatus: JsonField<Invoice.BillableStatus>,
    private val breakdownStartTimestamp: JsonField<OffsetDateTime>,
    private val breakdownEndTimestamp: JsonField<OffsetDateTime>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    fun id(): String = id.getRequired("id")

    fun customerId(): String = customerId.getRequired("customer_id")

    fun customerCustomFields(): Optional<Invoice.CustomerCustomFields> =
        Optional.ofNullable(customerCustomFields.getNullable("customer_custom_fields"))

    /** This field's availability is dependent on your client's configuration. */
    fun netsuiteSalesOrderId(): Optional<String> =
        Optional.ofNullable(netsuiteSalesOrderId.getNullable("netsuite_sales_order_id"))

    /** This field's availability is dependent on your client's configuration. */
    fun salesforceOpportunityId(): Optional<String> =
        Optional.ofNullable(salesforceOpportunityId.getNullable("salesforce_opportunity_id"))

    fun netPaymentTermsDays(): Optional<Double> =
        Optional.ofNullable(netPaymentTermsDays.getNullable("net_payment_terms_days"))

    fun creditType(): CreditTypeData = creditType.getRequired("credit_type")

    fun invoiceAdjustments(): Optional<List<Invoice.InvoiceAdjustment>> =
        Optional.ofNullable(invoiceAdjustments.getNullable("invoice_adjustments"))

    fun lineItems(): List<Invoice.LineItem> = lineItems.getRequired("line_items")

    /** Beginning of the usage period this invoice covers (UTC) */
    fun startTimestamp(): Optional<OffsetDateTime> =
        Optional.ofNullable(startTimestamp.getNullable("start_timestamp"))

    /** End of the usage period this invoice covers (UTC) */
    fun endTimestamp(): Optional<OffsetDateTime> =
        Optional.ofNullable(endTimestamp.getNullable("end_timestamp"))

    /** When the invoice was issued (UTC) */
    fun issuedAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(issuedAt.getNullable("issued_at"))

    /** When the invoice was created (UTC). This field is present for correction invoices only. */
    fun createdAt(): Optional<OffsetDateTime> =
        Optional.ofNullable(createdAt.getNullable("created_at"))

    fun status(): String = status.getRequired("status")

    fun subtotal(): Optional<Double> = Optional.ofNullable(subtotal.getNullable("subtotal"))

    fun total(): Double = total.getRequired("total")

    fun type(): String = type.getRequired("type")

    fun externalInvoice(): Optional<Invoice.ExternalInvoice> =
        Optional.ofNullable(externalInvoice.getNullable("external_invoice"))

    fun planId(): Optional<String> = Optional.ofNullable(planId.getNullable("plan_id"))

    fun planName(): Optional<String> = Optional.ofNullable(planName.getNullable("plan_name"))

    fun planCustomFields(): Optional<Invoice.PlanCustomFields> =
        Optional.ofNullable(planCustomFields.getNullable("plan_custom_fields"))

    fun contractId(): Optional<String> = Optional.ofNullable(contractId.getNullable("contract_id"))

    fun contractCustomFields(): Optional<Invoice.ContractCustomFields> =
        Optional.ofNullable(contractCustomFields.getNullable("contract_custom_fields"))

    fun amendmentId(): Optional<String> =
        Optional.ofNullable(amendmentId.getNullable("amendment_id"))

    fun correctionRecord(): Optional<Invoice.CorrectionRecord> =
        Optional.ofNullable(correctionRecord.getNullable("correction_record"))

    /** only present for beta contract invoices with reseller royalties */
    fun resellerRoyalty(): Optional<Invoice.ResellerRoyalty> =
        Optional.ofNullable(resellerRoyalty.getNullable("reseller_royalty"))

    fun customFields(): Optional<Invoice.CustomFields> =
        Optional.ofNullable(customFields.getNullable("custom_fields"))

    /** This field's availability is dependent on your client's configuration. */
    fun billableStatus(): Optional<Invoice.BillableStatus> =
        Optional.ofNullable(billableStatus.getNullable("billable_status"))

    fun breakdownStartTimestamp(): OffsetDateTime =
        breakdownStartTimestamp.getRequired("breakdown_start_timestamp")

    fun breakdownEndTimestamp(): OffsetDateTime =
        breakdownEndTimestamp.getRequired("breakdown_end_timestamp")

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("customer_id") @ExcludeMissing fun _customerId() = customerId

    @JsonProperty("customer_custom_fields")
    @ExcludeMissing
    fun _customerCustomFields() = customerCustomFields

    /** This field's availability is dependent on your client's configuration. */
    @JsonProperty("netsuite_sales_order_id")
    @ExcludeMissing
    fun _netsuiteSalesOrderId() = netsuiteSalesOrderId

    /** This field's availability is dependent on your client's configuration. */
    @JsonProperty("salesforce_opportunity_id")
    @ExcludeMissing
    fun _salesforceOpportunityId() = salesforceOpportunityId

    @JsonProperty("net_payment_terms_days")
    @ExcludeMissing
    fun _netPaymentTermsDays() = netPaymentTermsDays

    @JsonProperty("credit_type") @ExcludeMissing fun _creditType() = creditType

    @JsonProperty("invoice_adjustments")
    @ExcludeMissing
    fun _invoiceAdjustments() = invoiceAdjustments

    @JsonProperty("line_items") @ExcludeMissing fun _lineItems() = lineItems

    /** Beginning of the usage period this invoice covers (UTC) */
    @JsonProperty("start_timestamp") @ExcludeMissing fun _startTimestamp() = startTimestamp

    /** End of the usage period this invoice covers (UTC) */
    @JsonProperty("end_timestamp") @ExcludeMissing fun _endTimestamp() = endTimestamp

    /** When the invoice was issued (UTC) */
    @JsonProperty("issued_at") @ExcludeMissing fun _issuedAt() = issuedAt

    /** When the invoice was created (UTC). This field is present for correction invoices only. */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("status") @ExcludeMissing fun _status() = status

    @JsonProperty("subtotal") @ExcludeMissing fun _subtotal() = subtotal

    @JsonProperty("total") @ExcludeMissing fun _total() = total

    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonProperty("external_invoice") @ExcludeMissing fun _externalInvoice() = externalInvoice

    @JsonProperty("plan_id") @ExcludeMissing fun _planId() = planId

    @JsonProperty("plan_name") @ExcludeMissing fun _planName() = planName

    @JsonProperty("plan_custom_fields") @ExcludeMissing fun _planCustomFields() = planCustomFields

    @JsonProperty("contract_id") @ExcludeMissing fun _contractId() = contractId

    @JsonProperty("contract_custom_fields")
    @ExcludeMissing
    fun _contractCustomFields() = contractCustomFields

    @JsonProperty("amendment_id") @ExcludeMissing fun _amendmentId() = amendmentId

    @JsonProperty("correction_record") @ExcludeMissing fun _correctionRecord() = correctionRecord

    /** only present for beta contract invoices with reseller royalties */
    @JsonProperty("reseller_royalty") @ExcludeMissing fun _resellerRoyalty() = resellerRoyalty

    @JsonProperty("custom_fields") @ExcludeMissing fun _customFields() = customFields

    /** This field's availability is dependent on your client's configuration. */
    @JsonProperty("billable_status") @ExcludeMissing fun _billableStatus() = billableStatus

    @JsonProperty("breakdown_start_timestamp")
    @ExcludeMissing
    fun _breakdownStartTimestamp() = breakdownStartTimestamp

    @JsonProperty("breakdown_end_timestamp")
    @ExcludeMissing
    fun _breakdownEndTimestamp() = breakdownEndTimestamp

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun toInvoice(): Invoice =
        Invoice.builder()
            .id(id)
            .customerId(customerId)
            .customerCustomFields(customerCustomFields)
            .netsuiteSalesOrderId(netsuiteSalesOrderId)
            .salesforceOpportunityId(salesforceOpportunityId)
            .netPaymentTermsDays(netPaymentTermsDays)
            .creditType(creditType)
            .invoiceAdjustments(invoiceAdjustments)
            .lineItems(lineItems)
            .startTimestamp(startTimestamp)
            .endTimestamp(endTimestamp)
            .issuedAt(issuedAt)
            .createdAt(createdAt)
            .status(status)
            .subtotal(subtotal)
            .total(total)
            .type(type)
            .externalInvoice(externalInvoice)
            .planId(planId)
            .planName(planName)
            .planCustomFields(planCustomFields)
            .contractId(contractId)
            .contractCustomFields(contractCustomFields)
            .amendmentId(amendmentId)
            .correctionRecord(correctionRecord)
            .resellerRoyalty(resellerRoyalty)
            .customFields(customFields)
            .billableStatus(billableStatus)
            .build()

    private var validated: Boolean = false

    fun validate(): CustomerInvoiceListBreakdownsResponse = apply {
        if (!validated) {
            id()
            customerId()
            customerCustomFields().map { it.validate() }
            netsuiteSalesOrderId()
            salesforceOpportunityId()
            netPaymentTermsDays()
            creditType().validate()
            invoiceAdjustments().map { it.forEach { it.validate() } }
            lineItems().forEach { it.validate() }
            startTimestamp()
            endTimestamp()
            issuedAt()
            createdAt()
            status()
            subtotal()
            total()
            type()
            externalInvoice().map { it.validate() }
            planId()
            planName()
            planCustomFields().map { it.validate() }
            contractId()
            contractCustomFields().map { it.validate() }
            amendmentId()
            correctionRecord().map { it.validate() }
            resellerRoyalty().map { it.validate() }
            customFields().map { it.validate() }
            billableStatus()
            breakdownStartTimestamp()
            breakdownEndTimestamp()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var customerId: JsonField<String> = JsonMissing.of()
        private var customerCustomFields: JsonField<Invoice.CustomerCustomFields> = JsonMissing.of()
        private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
        private var salesforceOpportunityId: JsonField<String> = JsonMissing.of()
        private var netPaymentTermsDays: JsonField<Double> = JsonMissing.of()
        private var creditType: JsonField<CreditTypeData> = JsonMissing.of()
        private var invoiceAdjustments: JsonField<List<Invoice.InvoiceAdjustment>> =
            JsonMissing.of()
        private var lineItems: JsonField<List<Invoice.LineItem>> = JsonMissing.of()
        private var startTimestamp: JsonField<OffsetDateTime> = JsonMissing.of()
        private var endTimestamp: JsonField<OffsetDateTime> = JsonMissing.of()
        private var issuedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var subtotal: JsonField<Double> = JsonMissing.of()
        private var total: JsonField<Double> = JsonMissing.of()
        private var type: JsonField<String> = JsonMissing.of()
        private var externalInvoice: JsonField<Invoice.ExternalInvoice> = JsonMissing.of()
        private var planId: JsonField<String> = JsonMissing.of()
        private var planName: JsonField<String> = JsonMissing.of()
        private var planCustomFields: JsonField<Invoice.PlanCustomFields> = JsonMissing.of()
        private var contractId: JsonField<String> = JsonMissing.of()
        private var contractCustomFields: JsonField<Invoice.ContractCustomFields> = JsonMissing.of()
        private var amendmentId: JsonField<String> = JsonMissing.of()
        private var correctionRecord: JsonField<Invoice.CorrectionRecord> = JsonMissing.of()
        private var resellerRoyalty: JsonField<Invoice.ResellerRoyalty> = JsonMissing.of()
        private var customFields: JsonField<Invoice.CustomFields> = JsonMissing.of()
        private var billableStatus: JsonField<Invoice.BillableStatus> = JsonMissing.of()
        private var breakdownStartTimestamp: JsonField<OffsetDateTime> = JsonMissing.of()
        private var breakdownEndTimestamp: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            customerInvoiceListBreakdownsResponse: CustomerInvoiceListBreakdownsResponse
        ) = apply {
            id = customerInvoiceListBreakdownsResponse.id
            customerId = customerInvoiceListBreakdownsResponse.customerId
            customerCustomFields = customerInvoiceListBreakdownsResponse.customerCustomFields
            netsuiteSalesOrderId = customerInvoiceListBreakdownsResponse.netsuiteSalesOrderId
            salesforceOpportunityId = customerInvoiceListBreakdownsResponse.salesforceOpportunityId
            netPaymentTermsDays = customerInvoiceListBreakdownsResponse.netPaymentTermsDays
            creditType = customerInvoiceListBreakdownsResponse.creditType
            invoiceAdjustments = customerInvoiceListBreakdownsResponse.invoiceAdjustments
            lineItems = customerInvoiceListBreakdownsResponse.lineItems
            startTimestamp = customerInvoiceListBreakdownsResponse.startTimestamp
            endTimestamp = customerInvoiceListBreakdownsResponse.endTimestamp
            issuedAt = customerInvoiceListBreakdownsResponse.issuedAt
            createdAt = customerInvoiceListBreakdownsResponse.createdAt
            status = customerInvoiceListBreakdownsResponse.status
            subtotal = customerInvoiceListBreakdownsResponse.subtotal
            total = customerInvoiceListBreakdownsResponse.total
            type = customerInvoiceListBreakdownsResponse.type
            externalInvoice = customerInvoiceListBreakdownsResponse.externalInvoice
            planId = customerInvoiceListBreakdownsResponse.planId
            planName = customerInvoiceListBreakdownsResponse.planName
            planCustomFields = customerInvoiceListBreakdownsResponse.planCustomFields
            contractId = customerInvoiceListBreakdownsResponse.contractId
            contractCustomFields = customerInvoiceListBreakdownsResponse.contractCustomFields
            amendmentId = customerInvoiceListBreakdownsResponse.amendmentId
            correctionRecord = customerInvoiceListBreakdownsResponse.correctionRecord
            resellerRoyalty = customerInvoiceListBreakdownsResponse.resellerRoyalty
            customFields = customerInvoiceListBreakdownsResponse.customFields
            billableStatus = customerInvoiceListBreakdownsResponse.billableStatus
            breakdownStartTimestamp = customerInvoiceListBreakdownsResponse.breakdownStartTimestamp
            breakdownEndTimestamp = customerInvoiceListBreakdownsResponse.breakdownEndTimestamp
            additionalProperties =
                customerInvoiceListBreakdownsResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        fun customerId(customerId: String) = customerId(JsonField.of(customerId))

        @JsonProperty("customer_id")
        @ExcludeMissing
        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        fun customerCustomFields(customerCustomFields: Invoice.CustomerCustomFields) =
            customerCustomFields(JsonField.of(customerCustomFields))

        @JsonProperty("customer_custom_fields")
        @ExcludeMissing
        fun customerCustomFields(customerCustomFields: JsonField<Invoice.CustomerCustomFields>) =
            apply {
                this.customerCustomFields = customerCustomFields
            }

        /** This field's availability is dependent on your client's configuration. */
        fun netsuiteSalesOrderId(netsuiteSalesOrderId: String) =
            netsuiteSalesOrderId(JsonField.of(netsuiteSalesOrderId))

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("netsuite_sales_order_id")
        @ExcludeMissing
        fun netsuiteSalesOrderId(netsuiteSalesOrderId: JsonField<String>) = apply {
            this.netsuiteSalesOrderId = netsuiteSalesOrderId
        }

        /** This field's availability is dependent on your client's configuration. */
        fun salesforceOpportunityId(salesforceOpportunityId: String) =
            salesforceOpportunityId(JsonField.of(salesforceOpportunityId))

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("salesforce_opportunity_id")
        @ExcludeMissing
        fun salesforceOpportunityId(salesforceOpportunityId: JsonField<String>) = apply {
            this.salesforceOpportunityId = salesforceOpportunityId
        }

        fun netPaymentTermsDays(netPaymentTermsDays: Double) =
            netPaymentTermsDays(JsonField.of(netPaymentTermsDays))

        @JsonProperty("net_payment_terms_days")
        @ExcludeMissing
        fun netPaymentTermsDays(netPaymentTermsDays: JsonField<Double>) = apply {
            this.netPaymentTermsDays = netPaymentTermsDays
        }

        fun creditType(creditType: CreditTypeData) = creditType(JsonField.of(creditType))

        @JsonProperty("credit_type")
        @ExcludeMissing
        fun creditType(creditType: JsonField<CreditTypeData>) = apply {
            this.creditType = creditType
        }

        fun invoiceAdjustments(invoiceAdjustments: List<Invoice.InvoiceAdjustment>) =
            invoiceAdjustments(JsonField.of(invoiceAdjustments))

        @JsonProperty("invoice_adjustments")
        @ExcludeMissing
        fun invoiceAdjustments(invoiceAdjustments: JsonField<List<Invoice.InvoiceAdjustment>>) =
            apply {
                this.invoiceAdjustments = invoiceAdjustments
            }

        fun lineItems(lineItems: List<Invoice.LineItem>) = lineItems(JsonField.of(lineItems))

        @JsonProperty("line_items")
        @ExcludeMissing
        fun lineItems(lineItems: JsonField<List<Invoice.LineItem>>) = apply {
            this.lineItems = lineItems
        }

        /** Beginning of the usage period this invoice covers (UTC) */
        fun startTimestamp(startTimestamp: OffsetDateTime) =
            startTimestamp(JsonField.of(startTimestamp))

        /** Beginning of the usage period this invoice covers (UTC) */
        @JsonProperty("start_timestamp")
        @ExcludeMissing
        fun startTimestamp(startTimestamp: JsonField<OffsetDateTime>) = apply {
            this.startTimestamp = startTimestamp
        }

        /** End of the usage period this invoice covers (UTC) */
        fun endTimestamp(endTimestamp: OffsetDateTime) = endTimestamp(JsonField.of(endTimestamp))

        /** End of the usage period this invoice covers (UTC) */
        @JsonProperty("end_timestamp")
        @ExcludeMissing
        fun endTimestamp(endTimestamp: JsonField<OffsetDateTime>) = apply {
            this.endTimestamp = endTimestamp
        }

        /** When the invoice was issued (UTC) */
        fun issuedAt(issuedAt: OffsetDateTime) = issuedAt(JsonField.of(issuedAt))

        /** When the invoice was issued (UTC) */
        @JsonProperty("issued_at")
        @ExcludeMissing
        fun issuedAt(issuedAt: JsonField<OffsetDateTime>) = apply { this.issuedAt = issuedAt }

        /**
         * When the invoice was created (UTC). This field is present for correction invoices only.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * When the invoice was created (UTC). This field is present for correction invoices only.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun status(status: String) = status(JsonField.of(status))

        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<String>) = apply { this.status = status }

        fun subtotal(subtotal: Double) = subtotal(JsonField.of(subtotal))

        @JsonProperty("subtotal")
        @ExcludeMissing
        fun subtotal(subtotal: JsonField<Double>) = apply { this.subtotal = subtotal }

        fun total(total: Double) = total(JsonField.of(total))

        @JsonProperty("total")
        @ExcludeMissing
        fun total(total: JsonField<Double>) = apply { this.total = total }

        fun type(type: String) = type(JsonField.of(type))

        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<String>) = apply { this.type = type }

        fun externalInvoice(externalInvoice: Invoice.ExternalInvoice) =
            externalInvoice(JsonField.of(externalInvoice))

        @JsonProperty("external_invoice")
        @ExcludeMissing
        fun externalInvoice(externalInvoice: JsonField<Invoice.ExternalInvoice>) = apply {
            this.externalInvoice = externalInvoice
        }

        fun planId(planId: String) = planId(JsonField.of(planId))

        @JsonProperty("plan_id")
        @ExcludeMissing
        fun planId(planId: JsonField<String>) = apply { this.planId = planId }

        fun planName(planName: String) = planName(JsonField.of(planName))

        @JsonProperty("plan_name")
        @ExcludeMissing
        fun planName(planName: JsonField<String>) = apply { this.planName = planName }

        fun planCustomFields(planCustomFields: Invoice.PlanCustomFields) =
            planCustomFields(JsonField.of(planCustomFields))

        @JsonProperty("plan_custom_fields")
        @ExcludeMissing
        fun planCustomFields(planCustomFields: JsonField<Invoice.PlanCustomFields>) = apply {
            this.planCustomFields = planCustomFields
        }

        fun contractId(contractId: String) = contractId(JsonField.of(contractId))

        @JsonProperty("contract_id")
        @ExcludeMissing
        fun contractId(contractId: JsonField<String>) = apply { this.contractId = contractId }

        fun contractCustomFields(contractCustomFields: Invoice.ContractCustomFields) =
            contractCustomFields(JsonField.of(contractCustomFields))

        @JsonProperty("contract_custom_fields")
        @ExcludeMissing
        fun contractCustomFields(contractCustomFields: JsonField<Invoice.ContractCustomFields>) =
            apply {
                this.contractCustomFields = contractCustomFields
            }

        fun amendmentId(amendmentId: String) = amendmentId(JsonField.of(amendmentId))

        @JsonProperty("amendment_id")
        @ExcludeMissing
        fun amendmentId(amendmentId: JsonField<String>) = apply { this.amendmentId = amendmentId }

        fun correctionRecord(correctionRecord: Invoice.CorrectionRecord) =
            correctionRecord(JsonField.of(correctionRecord))

        @JsonProperty("correction_record")
        @ExcludeMissing
        fun correctionRecord(correctionRecord: JsonField<Invoice.CorrectionRecord>) = apply {
            this.correctionRecord = correctionRecord
        }

        /** only present for beta contract invoices with reseller royalties */
        fun resellerRoyalty(resellerRoyalty: Invoice.ResellerRoyalty) =
            resellerRoyalty(JsonField.of(resellerRoyalty))

        /** only present for beta contract invoices with reseller royalties */
        @JsonProperty("reseller_royalty")
        @ExcludeMissing
        fun resellerRoyalty(resellerRoyalty: JsonField<Invoice.ResellerRoyalty>) = apply {
            this.resellerRoyalty = resellerRoyalty
        }

        fun customFields(customFields: Invoice.CustomFields) =
            customFields(JsonField.of(customFields))

        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun customFields(customFields: JsonField<Invoice.CustomFields>) = apply {
            this.customFields = customFields
        }

        /** This field's availability is dependent on your client's configuration. */
        fun billableStatus(billableStatus: Invoice.BillableStatus) =
            billableStatus(JsonField.of(billableStatus))

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("billable_status")
        @ExcludeMissing
        fun billableStatus(billableStatus: JsonField<Invoice.BillableStatus>) = apply {
            this.billableStatus = billableStatus
        }

        fun breakdownStartTimestamp(breakdownStartTimestamp: OffsetDateTime) =
            breakdownStartTimestamp(JsonField.of(breakdownStartTimestamp))

        @JsonProperty("breakdown_start_timestamp")
        @ExcludeMissing
        fun breakdownStartTimestamp(breakdownStartTimestamp: JsonField<OffsetDateTime>) = apply {
            this.breakdownStartTimestamp = breakdownStartTimestamp
        }

        fun breakdownEndTimestamp(breakdownEndTimestamp: OffsetDateTime) =
            breakdownEndTimestamp(JsonField.of(breakdownEndTimestamp))

        @JsonProperty("breakdown_end_timestamp")
        @ExcludeMissing
        fun breakdownEndTimestamp(breakdownEndTimestamp: JsonField<OffsetDateTime>) = apply {
            this.breakdownEndTimestamp = breakdownEndTimestamp
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        @JsonAnySetter
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
                id,
                customerId,
                customerCustomFields,
                netsuiteSalesOrderId,
                salesforceOpportunityId,
                netPaymentTermsDays,
                creditType,
                invoiceAdjustments.map { it.toImmutable() },
                lineItems.map { it.toImmutable() },
                startTimestamp,
                endTimestamp,
                issuedAt,
                createdAt,
                status,
                subtotal,
                total,
                type,
                externalInvoice,
                planId,
                planName,
                planCustomFields,
                contractId,
                contractCustomFields,
                amendmentId,
                correctionRecord,
                resellerRoyalty,
                customFields,
                billableStatus,
                breakdownStartTimestamp,
                breakdownEndTimestamp,
                additionalProperties.toImmutable(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CustomerInvoiceListBreakdownsResponse && id == other.id && customerId == other.customerId && customerCustomFields == other.customerCustomFields && netsuiteSalesOrderId == other.netsuiteSalesOrderId && salesforceOpportunityId == other.salesforceOpportunityId && netPaymentTermsDays == other.netPaymentTermsDays && creditType == other.creditType && invoiceAdjustments == other.invoiceAdjustments && lineItems == other.lineItems && startTimestamp == other.startTimestamp && endTimestamp == other.endTimestamp && issuedAt == other.issuedAt && createdAt == other.createdAt && status == other.status && subtotal == other.subtotal && total == other.total && type == other.type && externalInvoice == other.externalInvoice && planId == other.planId && planName == other.planName && planCustomFields == other.planCustomFields && contractId == other.contractId && contractCustomFields == other.contractCustomFields && amendmentId == other.amendmentId && correctionRecord == other.correctionRecord && resellerRoyalty == other.resellerRoyalty && customFields == other.customFields && billableStatus == other.billableStatus && breakdownStartTimestamp == other.breakdownStartTimestamp && breakdownEndTimestamp == other.breakdownEndTimestamp && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, customerId, customerCustomFields, netsuiteSalesOrderId, salesforceOpportunityId, netPaymentTermsDays, creditType, invoiceAdjustments, lineItems, startTimestamp, endTimestamp, issuedAt, createdAt, status, subtotal, total, type, externalInvoice, planId, planName, planCustomFields, contractId, contractCustomFields, amendmentId, correctionRecord, resellerRoyalty, customFields, billableStatus, breakdownStartTimestamp, breakdownEndTimestamp, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CustomerInvoiceListBreakdownsResponse{id=$id, customerId=$customerId, customerCustomFields=$customerCustomFields, netsuiteSalesOrderId=$netsuiteSalesOrderId, salesforceOpportunityId=$salesforceOpportunityId, netPaymentTermsDays=$netPaymentTermsDays, creditType=$creditType, invoiceAdjustments=$invoiceAdjustments, lineItems=$lineItems, startTimestamp=$startTimestamp, endTimestamp=$endTimestamp, issuedAt=$issuedAt, createdAt=$createdAt, status=$status, subtotal=$subtotal, total=$total, type=$type, externalInvoice=$externalInvoice, planId=$planId, planName=$planName, planCustomFields=$planCustomFields, contractId=$contractId, contractCustomFields=$contractCustomFields, amendmentId=$amendmentId, correctionRecord=$correctionRecord, resellerRoyalty=$resellerRoyalty, customFields=$customFields, billableStatus=$billableStatus, breakdownStartTimestamp=$breakdownStartTimestamp, breakdownEndTimestamp=$breakdownEndTimestamp, additionalProperties=$additionalProperties}"
}
