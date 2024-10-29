// File generated from our OpenAPI spec by Stainless.

package com.metronome.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.metronome.api.core.Enum
import com.metronome.api.core.ExcludeMissing
import com.metronome.api.core.JsonField
import com.metronome.api.core.JsonMissing
import com.metronome.api.core.JsonValue
import com.metronome.api.core.NoAutoDetect
import com.metronome.api.core.toUnmodifiable
import com.metronome.api.errors.MetronomeInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = Invoice.Builder::class)
@NoAutoDetect
class Invoice
private constructor(
    private val id: JsonField<String>,
    private val customerId: JsonField<String>,
    private val customerCustomFields: JsonField<CustomerCustomFields>,
    private val netsuiteSalesOrderId: JsonField<String>,
    private val salesforceOpportunityId: JsonField<String>,
    private val netPaymentTermsDays: JsonField<Double>,
    private val creditType: JsonField<CreditTypeData>,
    private val invoiceAdjustments: JsonField<List<InvoiceAdjustment>>,
    private val lineItems: JsonField<List<LineItem>>,
    private val startTimestamp: JsonField<OffsetDateTime>,
    private val endTimestamp: JsonField<OffsetDateTime>,
    private val issuedAt: JsonField<OffsetDateTime>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val status: JsonField<String>,
    private val subtotal: JsonField<Double>,
    private val total: JsonField<Double>,
    private val type: JsonField<String>,
    private val externalInvoice: JsonField<ExternalInvoice>,
    private val planId: JsonField<String>,
    private val planName: JsonField<String>,
    private val planCustomFields: JsonField<PlanCustomFields>,
    private val contractId: JsonField<String>,
    private val contractCustomFields: JsonField<ContractCustomFields>,
    private val amendmentId: JsonField<String>,
    private val correctionRecord: JsonField<CorrectionRecord>,
    private val resellerRoyalty: JsonField<ResellerRoyalty>,
    private val customFields: JsonField<CustomFields>,
    private val billableStatus: JsonField<BillableStatus>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun id(): String = id.getRequired("id")

    fun customerId(): String = customerId.getRequired("customer_id")

    fun customerCustomFields(): Optional<CustomerCustomFields> =
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

    fun invoiceAdjustments(): Optional<List<InvoiceAdjustment>> =
        Optional.ofNullable(invoiceAdjustments.getNullable("invoice_adjustments"))

    fun lineItems(): List<LineItem> = lineItems.getRequired("line_items")

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

    fun externalInvoice(): Optional<ExternalInvoice> =
        Optional.ofNullable(externalInvoice.getNullable("external_invoice"))

    fun planId(): Optional<String> = Optional.ofNullable(planId.getNullable("plan_id"))

    fun planName(): Optional<String> = Optional.ofNullable(planName.getNullable("plan_name"))

    fun planCustomFields(): Optional<PlanCustomFields> =
        Optional.ofNullable(planCustomFields.getNullable("plan_custom_fields"))

    fun contractId(): Optional<String> = Optional.ofNullable(contractId.getNullable("contract_id"))

    fun contractCustomFields(): Optional<ContractCustomFields> =
        Optional.ofNullable(contractCustomFields.getNullable("contract_custom_fields"))

    fun amendmentId(): Optional<String> =
        Optional.ofNullable(amendmentId.getNullable("amendment_id"))

    fun correctionRecord(): Optional<CorrectionRecord> =
        Optional.ofNullable(correctionRecord.getNullable("correction_record"))

    /** only present for beta contract invoices with reseller royalties */
    fun resellerRoyalty(): Optional<ResellerRoyalty> =
        Optional.ofNullable(resellerRoyalty.getNullable("reseller_royalty"))

    fun customFields(): Optional<CustomFields> =
        Optional.ofNullable(customFields.getNullable("custom_fields"))

    /** This field's availability is dependent on your client's configuration. */
    fun billableStatus(): Optional<BillableStatus> =
        Optional.ofNullable(billableStatus.getNullable("billable_status"))

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

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Invoice = apply {
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
        private var customerCustomFields: JsonField<CustomerCustomFields> = JsonMissing.of()
        private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
        private var salesforceOpportunityId: JsonField<String> = JsonMissing.of()
        private var netPaymentTermsDays: JsonField<Double> = JsonMissing.of()
        private var creditType: JsonField<CreditTypeData> = JsonMissing.of()
        private var invoiceAdjustments: JsonField<List<InvoiceAdjustment>> = JsonMissing.of()
        private var lineItems: JsonField<List<LineItem>> = JsonMissing.of()
        private var startTimestamp: JsonField<OffsetDateTime> = JsonMissing.of()
        private var endTimestamp: JsonField<OffsetDateTime> = JsonMissing.of()
        private var issuedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var subtotal: JsonField<Double> = JsonMissing.of()
        private var total: JsonField<Double> = JsonMissing.of()
        private var type: JsonField<String> = JsonMissing.of()
        private var externalInvoice: JsonField<ExternalInvoice> = JsonMissing.of()
        private var planId: JsonField<String> = JsonMissing.of()
        private var planName: JsonField<String> = JsonMissing.of()
        private var planCustomFields: JsonField<PlanCustomFields> = JsonMissing.of()
        private var contractId: JsonField<String> = JsonMissing.of()
        private var contractCustomFields: JsonField<ContractCustomFields> = JsonMissing.of()
        private var amendmentId: JsonField<String> = JsonMissing.of()
        private var correctionRecord: JsonField<CorrectionRecord> = JsonMissing.of()
        private var resellerRoyalty: JsonField<ResellerRoyalty> = JsonMissing.of()
        private var customFields: JsonField<CustomFields> = JsonMissing.of()
        private var billableStatus: JsonField<BillableStatus> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(invoice: Invoice) = apply {
            this.id = invoice.id
            this.customerId = invoice.customerId
            this.customerCustomFields = invoice.customerCustomFields
            this.netsuiteSalesOrderId = invoice.netsuiteSalesOrderId
            this.salesforceOpportunityId = invoice.salesforceOpportunityId
            this.netPaymentTermsDays = invoice.netPaymentTermsDays
            this.creditType = invoice.creditType
            this.invoiceAdjustments = invoice.invoiceAdjustments
            this.lineItems = invoice.lineItems
            this.startTimestamp = invoice.startTimestamp
            this.endTimestamp = invoice.endTimestamp
            this.issuedAt = invoice.issuedAt
            this.createdAt = invoice.createdAt
            this.status = invoice.status
            this.subtotal = invoice.subtotal
            this.total = invoice.total
            this.type = invoice.type
            this.externalInvoice = invoice.externalInvoice
            this.planId = invoice.planId
            this.planName = invoice.planName
            this.planCustomFields = invoice.planCustomFields
            this.contractId = invoice.contractId
            this.contractCustomFields = invoice.contractCustomFields
            this.amendmentId = invoice.amendmentId
            this.correctionRecord = invoice.correctionRecord
            this.resellerRoyalty = invoice.resellerRoyalty
            this.customFields = invoice.customFields
            this.billableStatus = invoice.billableStatus
            additionalProperties(invoice.additionalProperties)
        }

        fun id(id: String) = id(JsonField.of(id))

        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        fun customerId(customerId: String) = customerId(JsonField.of(customerId))

        @JsonProperty("customer_id")
        @ExcludeMissing
        fun customerId(customerId: JsonField<String>) = apply { this.customerId = customerId }

        fun customerCustomFields(customerCustomFields: CustomerCustomFields) =
            customerCustomFields(JsonField.of(customerCustomFields))

        @JsonProperty("customer_custom_fields")
        @ExcludeMissing
        fun customerCustomFields(customerCustomFields: JsonField<CustomerCustomFields>) = apply {
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

        fun invoiceAdjustments(invoiceAdjustments: List<InvoiceAdjustment>) =
            invoiceAdjustments(JsonField.of(invoiceAdjustments))

        @JsonProperty("invoice_adjustments")
        @ExcludeMissing
        fun invoiceAdjustments(invoiceAdjustments: JsonField<List<InvoiceAdjustment>>) = apply {
            this.invoiceAdjustments = invoiceAdjustments
        }

        fun lineItems(lineItems: List<LineItem>) = lineItems(JsonField.of(lineItems))

        @JsonProperty("line_items")
        @ExcludeMissing
        fun lineItems(lineItems: JsonField<List<LineItem>>) = apply { this.lineItems = lineItems }

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

        fun externalInvoice(externalInvoice: ExternalInvoice) =
            externalInvoice(JsonField.of(externalInvoice))

        @JsonProperty("external_invoice")
        @ExcludeMissing
        fun externalInvoice(externalInvoice: JsonField<ExternalInvoice>) = apply {
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

        fun planCustomFields(planCustomFields: PlanCustomFields) =
            planCustomFields(JsonField.of(planCustomFields))

        @JsonProperty("plan_custom_fields")
        @ExcludeMissing
        fun planCustomFields(planCustomFields: JsonField<PlanCustomFields>) = apply {
            this.planCustomFields = planCustomFields
        }

        fun contractId(contractId: String) = contractId(JsonField.of(contractId))

        @JsonProperty("contract_id")
        @ExcludeMissing
        fun contractId(contractId: JsonField<String>) = apply { this.contractId = contractId }

        fun contractCustomFields(contractCustomFields: ContractCustomFields) =
            contractCustomFields(JsonField.of(contractCustomFields))

        @JsonProperty("contract_custom_fields")
        @ExcludeMissing
        fun contractCustomFields(contractCustomFields: JsonField<ContractCustomFields>) = apply {
            this.contractCustomFields = contractCustomFields
        }

        fun amendmentId(amendmentId: String) = amendmentId(JsonField.of(amendmentId))

        @JsonProperty("amendment_id")
        @ExcludeMissing
        fun amendmentId(amendmentId: JsonField<String>) = apply { this.amendmentId = amendmentId }

        fun correctionRecord(correctionRecord: CorrectionRecord) =
            correctionRecord(JsonField.of(correctionRecord))

        @JsonProperty("correction_record")
        @ExcludeMissing
        fun correctionRecord(correctionRecord: JsonField<CorrectionRecord>) = apply {
            this.correctionRecord = correctionRecord
        }

        /** only present for beta contract invoices with reseller royalties */
        fun resellerRoyalty(resellerRoyalty: ResellerRoyalty) =
            resellerRoyalty(JsonField.of(resellerRoyalty))

        /** only present for beta contract invoices with reseller royalties */
        @JsonProperty("reseller_royalty")
        @ExcludeMissing
        fun resellerRoyalty(resellerRoyalty: JsonField<ResellerRoyalty>) = apply {
            this.resellerRoyalty = resellerRoyalty
        }

        fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

        @JsonProperty("custom_fields")
        @ExcludeMissing
        fun customFields(customFields: JsonField<CustomFields>) = apply {
            this.customFields = customFields
        }

        /** This field's availability is dependent on your client's configuration. */
        fun billableStatus(billableStatus: BillableStatus) =
            billableStatus(JsonField.of(billableStatus))

        /** This field's availability is dependent on your client's configuration. */
        @JsonProperty("billable_status")
        @ExcludeMissing
        fun billableStatus(billableStatus: JsonField<BillableStatus>) = apply {
            this.billableStatus = billableStatus
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): Invoice =
            Invoice(
                id,
                customerId,
                customerCustomFields,
                netsuiteSalesOrderId,
                salesforceOpportunityId,
                netPaymentTermsDays,
                creditType,
                invoiceAdjustments.map { it.toUnmodifiable() },
                lineItems.map { it.toUnmodifiable() },
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
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = LineItem.Builder::class)
    @NoAutoDetect
    class LineItem
    private constructor(
        private val name: JsonField<String>,
        private val groupKey: JsonField<String>,
        private val groupValue: JsonField<String>,
        private val quantity: JsonField<Double>,
        private val total: JsonField<Double>,
        private val unitPrice: JsonField<Double>,
        private val listPrice: JsonField<Rate>,
        private val productId: JsonField<String>,
        private val productCustomFields: JsonField<ProductCustomFields>,
        private val productType: JsonField<String>,
        private val netsuiteItemId: JsonField<String>,
        private val isProrated: JsonField<Boolean>,
        private val creditType: JsonField<CreditTypeData>,
        private val startingAt: JsonField<OffsetDateTime>,
        private val endingBefore: JsonField<OffsetDateTime>,
        private val commitId: JsonField<String>,
        private val commitCustomFields: JsonField<CommitCustomFields>,
        private val commitSegmentId: JsonField<String>,
        private val commitType: JsonField<String>,
        private val commitNetsuiteSalesOrderId: JsonField<String>,
        private val commitNetsuiteItemId: JsonField<String>,
        private val postpaidCommit: JsonField<PostpaidCommit>,
        private val resellerType: JsonField<ResellerType>,
        private val subLineItems: JsonField<List<SubLineItem>>,
        private val customFields: JsonField<CustomFields>,
        private val pricingGroupValues: JsonField<PricingGroupValues>,
        private val presentationGroupValues: JsonField<PresentationGroupValues>,
        private val metadata: JsonField<String>,
        private val netsuiteInvoiceBillingStart: JsonField<OffsetDateTime>,
        private val netsuiteInvoiceBillingEnd: JsonField<OffsetDateTime>,
        private val professionalServiceId: JsonField<String>,
        private val professionalServiceCustomFields: JsonField<ProfessionalServiceCustomFields>,
        private val scheduledChargeId: JsonField<String>,
        private val scheduledChargeCustomFields: JsonField<ScheduledChargeCustomFields>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun name(): String = name.getRequired("name")

        fun groupKey(): Optional<String> = Optional.ofNullable(groupKey.getNullable("group_key"))

        fun groupValue(): Optional<String> =
            Optional.ofNullable(groupValue.getNullable("group_value"))

        fun quantity(): Optional<Double> = Optional.ofNullable(quantity.getNullable("quantity"))

        fun total(): Double = total.getRequired("total")

        /** only present for beta contract invoices */
        fun unitPrice(): Optional<Double> = Optional.ofNullable(unitPrice.getNullable("unit_price"))

        /**
         * Only present for contract invoices and when the include_list_prices query parameter is
         * set to true. This will include the list rate for the charge if applicable. Only present
         * for usage and subscription line items.
         */
        fun listPrice(): Optional<Rate> = Optional.ofNullable(listPrice.getNullable("list_price"))

        fun productId(): Optional<String> = Optional.ofNullable(productId.getNullable("product_id"))

        fun productCustomFields(): Optional<ProductCustomFields> =
            Optional.ofNullable(productCustomFields.getNullable("product_custom_fields"))

        fun productType(): Optional<String> =
            Optional.ofNullable(productType.getNullable("product_type"))

        /**
         * only present for beta contract invoices. This field's availability is dependent on your
         * client's configuration.
         */
        fun netsuiteItemId(): Optional<String> =
            Optional.ofNullable(netsuiteItemId.getNullable("netsuite_item_id"))

        /** only present for beta contract invoices */
        fun isProrated(): Optional<Boolean> =
            Optional.ofNullable(isProrated.getNullable("is_prorated"))

        fun creditType(): CreditTypeData = creditType.getRequired("credit_type")

        /** only present for beta contract invoices */
        fun startingAt(): Optional<OffsetDateTime> =
            Optional.ofNullable(startingAt.getNullable("starting_at"))

        /** only present for beta contract invoices */
        fun endingBefore(): Optional<OffsetDateTime> =
            Optional.ofNullable(endingBefore.getNullable("ending_before"))

        /** only present for beta contract invoices */
        fun commitId(): Optional<String> = Optional.ofNullable(commitId.getNullable("commit_id"))

        /** only present for beta contract invoices */
        fun commitCustomFields(): Optional<CommitCustomFields> =
            Optional.ofNullable(commitCustomFields.getNullable("commit_custom_fields"))

        /** only present for beta contract invoices */
        fun commitSegmentId(): Optional<String> =
            Optional.ofNullable(commitSegmentId.getNullable("commit_segment_id"))

        /** only present for beta contract invoices */
        fun commitType(): Optional<String> =
            Optional.ofNullable(commitType.getNullable("commit_type"))

        /**
         * only present for beta contract invoices. This field's availability is dependent on your
         * client's configuration.
         */
        fun commitNetsuiteSalesOrderId(): Optional<String> =
            Optional.ofNullable(
                commitNetsuiteSalesOrderId.getNullable("commit_netsuite_sales_order_id")
            )

        /**
         * only present for beta contract invoices. This field's availability is dependent on your
         * client's configuration.
         */
        fun commitNetsuiteItemId(): Optional<String> =
            Optional.ofNullable(commitNetsuiteItemId.getNullable("commit_netsuite_item_id"))

        /** only present for beta contract invoices */
        fun postpaidCommit(): Optional<PostpaidCommit> =
            Optional.ofNullable(postpaidCommit.getNullable("postpaid_commit"))

        fun resellerType(): Optional<ResellerType> =
            Optional.ofNullable(resellerType.getNullable("reseller_type"))

        fun subLineItems(): Optional<List<SubLineItem>> =
            Optional.ofNullable(subLineItems.getNullable("sub_line_items"))

        fun customFields(): Optional<CustomFields> =
            Optional.ofNullable(customFields.getNullable("custom_fields"))

        /** if pricing groups are used, this will contain the values used to calculate the price */
        fun pricingGroupValues(): Optional<PricingGroupValues> =
            Optional.ofNullable(pricingGroupValues.getNullable("pricing_group_values"))

        /**
         * if presentation groups are used, this will contain the values used to break down the line
         * item
         */
        fun presentationGroupValues(): Optional<PresentationGroupValues> =
            Optional.ofNullable(presentationGroupValues.getNullable("presentation_group_values"))

        fun metadata(): Optional<String> = Optional.ofNullable(metadata.getNullable("metadata"))

        /** The start date for the billing period on the invoice. */
        fun netsuiteInvoiceBillingStart(): Optional<OffsetDateTime> =
            Optional.ofNullable(
                netsuiteInvoiceBillingStart.getNullable("netsuite_invoice_billing_start")
            )

        /** The end date for the billing period on the invoice. */
        fun netsuiteInvoiceBillingEnd(): Optional<OffsetDateTime> =
            Optional.ofNullable(
                netsuiteInvoiceBillingEnd.getNullable("netsuite_invoice_billing_end")
            )

        /** only present for beta contract invoices */
        fun professionalServiceId(): Optional<String> =
            Optional.ofNullable(professionalServiceId.getNullable("professional_service_id"))

        /** only present for beta contract invoices */
        fun professionalServiceCustomFields(): Optional<ProfessionalServiceCustomFields> =
            Optional.ofNullable(
                professionalServiceCustomFields.getNullable("professional_service_custom_fields")
            )

        /** only present for beta contract invoices */
        fun scheduledChargeId(): Optional<String> =
            Optional.ofNullable(scheduledChargeId.getNullable("scheduled_charge_id"))

        fun scheduledChargeCustomFields(): Optional<ScheduledChargeCustomFields> =
            Optional.ofNullable(
                scheduledChargeCustomFields.getNullable("scheduled_charge_custom_fields")
            )

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonProperty("group_key") @ExcludeMissing fun _groupKey() = groupKey

        @JsonProperty("group_value") @ExcludeMissing fun _groupValue() = groupValue

        @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

        @JsonProperty("total") @ExcludeMissing fun _total() = total

        /** only present for beta contract invoices */
        @JsonProperty("unit_price") @ExcludeMissing fun _unitPrice() = unitPrice

        /**
         * Only present for contract invoices and when the include_list_prices query parameter is
         * set to true. This will include the list rate for the charge if applicable. Only present
         * for usage and subscription line items.
         */
        @JsonProperty("list_price") @ExcludeMissing fun _listPrice() = listPrice

        @JsonProperty("product_id") @ExcludeMissing fun _productId() = productId

        @JsonProperty("product_custom_fields")
        @ExcludeMissing
        fun _productCustomFields() = productCustomFields

        @JsonProperty("product_type") @ExcludeMissing fun _productType() = productType

        /**
         * only present for beta contract invoices. This field's availability is dependent on your
         * client's configuration.
         */
        @JsonProperty("netsuite_item_id") @ExcludeMissing fun _netsuiteItemId() = netsuiteItemId

        /** only present for beta contract invoices */
        @JsonProperty("is_prorated") @ExcludeMissing fun _isProrated() = isProrated

        @JsonProperty("credit_type") @ExcludeMissing fun _creditType() = creditType

        /** only present for beta contract invoices */
        @JsonProperty("starting_at") @ExcludeMissing fun _startingAt() = startingAt

        /** only present for beta contract invoices */
        @JsonProperty("ending_before") @ExcludeMissing fun _endingBefore() = endingBefore

        /** only present for beta contract invoices */
        @JsonProperty("commit_id") @ExcludeMissing fun _commitId() = commitId

        /** only present for beta contract invoices */
        @JsonProperty("commit_custom_fields")
        @ExcludeMissing
        fun _commitCustomFields() = commitCustomFields

        /** only present for beta contract invoices */
        @JsonProperty("commit_segment_id") @ExcludeMissing fun _commitSegmentId() = commitSegmentId

        /** only present for beta contract invoices */
        @JsonProperty("commit_type") @ExcludeMissing fun _commitType() = commitType

        /**
         * only present for beta contract invoices. This field's availability is dependent on your
         * client's configuration.
         */
        @JsonProperty("commit_netsuite_sales_order_id")
        @ExcludeMissing
        fun _commitNetsuiteSalesOrderId() = commitNetsuiteSalesOrderId

        /**
         * only present for beta contract invoices. This field's availability is dependent on your
         * client's configuration.
         */
        @JsonProperty("commit_netsuite_item_id")
        @ExcludeMissing
        fun _commitNetsuiteItemId() = commitNetsuiteItemId

        /** only present for beta contract invoices */
        @JsonProperty("postpaid_commit") @ExcludeMissing fun _postpaidCommit() = postpaidCommit

        @JsonProperty("reseller_type") @ExcludeMissing fun _resellerType() = resellerType

        @JsonProperty("sub_line_items") @ExcludeMissing fun _subLineItems() = subLineItems

        @JsonProperty("custom_fields") @ExcludeMissing fun _customFields() = customFields

        /** if pricing groups are used, this will contain the values used to calculate the price */
        @JsonProperty("pricing_group_values")
        @ExcludeMissing
        fun _pricingGroupValues() = pricingGroupValues

        /**
         * if presentation groups are used, this will contain the values used to break down the line
         * item
         */
        @JsonProperty("presentation_group_values")
        @ExcludeMissing
        fun _presentationGroupValues() = presentationGroupValues

        @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

        /** The start date for the billing period on the invoice. */
        @JsonProperty("netsuite_invoice_billing_start")
        @ExcludeMissing
        fun _netsuiteInvoiceBillingStart() = netsuiteInvoiceBillingStart

        /** The end date for the billing period on the invoice. */
        @JsonProperty("netsuite_invoice_billing_end")
        @ExcludeMissing
        fun _netsuiteInvoiceBillingEnd() = netsuiteInvoiceBillingEnd

        /** only present for beta contract invoices */
        @JsonProperty("professional_service_id")
        @ExcludeMissing
        fun _professionalServiceId() = professionalServiceId

        /** only present for beta contract invoices */
        @JsonProperty("professional_service_custom_fields")
        @ExcludeMissing
        fun _professionalServiceCustomFields() = professionalServiceCustomFields

        /** only present for beta contract invoices */
        @JsonProperty("scheduled_charge_id")
        @ExcludeMissing
        fun _scheduledChargeId() = scheduledChargeId

        @JsonProperty("scheduled_charge_custom_fields")
        @ExcludeMissing
        fun _scheduledChargeCustomFields() = scheduledChargeCustomFields

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): LineItem = apply {
            if (!validated) {
                name()
                groupKey()
                groupValue()
                quantity()
                total()
                unitPrice()
                listPrice().map { it.validate() }
                productId()
                productCustomFields().map { it.validate() }
                productType()
                netsuiteItemId()
                isProrated()
                creditType().validate()
                startingAt()
                endingBefore()
                commitId()
                commitCustomFields().map { it.validate() }
                commitSegmentId()
                commitType()
                commitNetsuiteSalesOrderId()
                commitNetsuiteItemId()
                postpaidCommit().map { it.validate() }
                resellerType()
                subLineItems().map { it.forEach { it.validate() } }
                customFields().map { it.validate() }
                pricingGroupValues().map { it.validate() }
                presentationGroupValues().map { it.validate() }
                metadata()
                netsuiteInvoiceBillingStart()
                netsuiteInvoiceBillingEnd()
                professionalServiceId()
                professionalServiceCustomFields().map { it.validate() }
                scheduledChargeId()
                scheduledChargeCustomFields().map { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: JsonField<String> = JsonMissing.of()
            private var groupKey: JsonField<String> = JsonMissing.of()
            private var groupValue: JsonField<String> = JsonMissing.of()
            private var quantity: JsonField<Double> = JsonMissing.of()
            private var total: JsonField<Double> = JsonMissing.of()
            private var unitPrice: JsonField<Double> = JsonMissing.of()
            private var listPrice: JsonField<Rate> = JsonMissing.of()
            private var productId: JsonField<String> = JsonMissing.of()
            private var productCustomFields: JsonField<ProductCustomFields> = JsonMissing.of()
            private var productType: JsonField<String> = JsonMissing.of()
            private var netsuiteItemId: JsonField<String> = JsonMissing.of()
            private var isProrated: JsonField<Boolean> = JsonMissing.of()
            private var creditType: JsonField<CreditTypeData> = JsonMissing.of()
            private var startingAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var commitId: JsonField<String> = JsonMissing.of()
            private var commitCustomFields: JsonField<CommitCustomFields> = JsonMissing.of()
            private var commitSegmentId: JsonField<String> = JsonMissing.of()
            private var commitType: JsonField<String> = JsonMissing.of()
            private var commitNetsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
            private var commitNetsuiteItemId: JsonField<String> = JsonMissing.of()
            private var postpaidCommit: JsonField<PostpaidCommit> = JsonMissing.of()
            private var resellerType: JsonField<ResellerType> = JsonMissing.of()
            private var subLineItems: JsonField<List<SubLineItem>> = JsonMissing.of()
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var pricingGroupValues: JsonField<PricingGroupValues> = JsonMissing.of()
            private var presentationGroupValues: JsonField<PresentationGroupValues> =
                JsonMissing.of()
            private var metadata: JsonField<String> = JsonMissing.of()
            private var netsuiteInvoiceBillingStart: JsonField<OffsetDateTime> = JsonMissing.of()
            private var netsuiteInvoiceBillingEnd: JsonField<OffsetDateTime> = JsonMissing.of()
            private var professionalServiceId: JsonField<String> = JsonMissing.of()
            private var professionalServiceCustomFields:
                JsonField<ProfessionalServiceCustomFields> =
                JsonMissing.of()
            private var scheduledChargeId: JsonField<String> = JsonMissing.of()
            private var scheduledChargeCustomFields: JsonField<ScheduledChargeCustomFields> =
                JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(lineItem: LineItem) = apply {
                this.name = lineItem.name
                this.groupKey = lineItem.groupKey
                this.groupValue = lineItem.groupValue
                this.quantity = lineItem.quantity
                this.total = lineItem.total
                this.unitPrice = lineItem.unitPrice
                this.listPrice = lineItem.listPrice
                this.productId = lineItem.productId
                this.productCustomFields = lineItem.productCustomFields
                this.productType = lineItem.productType
                this.netsuiteItemId = lineItem.netsuiteItemId
                this.isProrated = lineItem.isProrated
                this.creditType = lineItem.creditType
                this.startingAt = lineItem.startingAt
                this.endingBefore = lineItem.endingBefore
                this.commitId = lineItem.commitId
                this.commitCustomFields = lineItem.commitCustomFields
                this.commitSegmentId = lineItem.commitSegmentId
                this.commitType = lineItem.commitType
                this.commitNetsuiteSalesOrderId = lineItem.commitNetsuiteSalesOrderId
                this.commitNetsuiteItemId = lineItem.commitNetsuiteItemId
                this.postpaidCommit = lineItem.postpaidCommit
                this.resellerType = lineItem.resellerType
                this.subLineItems = lineItem.subLineItems
                this.customFields = lineItem.customFields
                this.pricingGroupValues = lineItem.pricingGroupValues
                this.presentationGroupValues = lineItem.presentationGroupValues
                this.metadata = lineItem.metadata
                this.netsuiteInvoiceBillingStart = lineItem.netsuiteInvoiceBillingStart
                this.netsuiteInvoiceBillingEnd = lineItem.netsuiteInvoiceBillingEnd
                this.professionalServiceId = lineItem.professionalServiceId
                this.professionalServiceCustomFields = lineItem.professionalServiceCustomFields
                this.scheduledChargeId = lineItem.scheduledChargeId
                this.scheduledChargeCustomFields = lineItem.scheduledChargeCustomFields
                additionalProperties(lineItem.additionalProperties)
            }

            fun name(name: String) = name(JsonField.of(name))

            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun groupKey(groupKey: String) = groupKey(JsonField.of(groupKey))

            @JsonProperty("group_key")
            @ExcludeMissing
            fun groupKey(groupKey: JsonField<String>) = apply { this.groupKey = groupKey }

            fun groupValue(groupValue: String) = groupValue(JsonField.of(groupValue))

            @JsonProperty("group_value")
            @ExcludeMissing
            fun groupValue(groupValue: JsonField<String>) = apply { this.groupValue = groupValue }

            fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

            @JsonProperty("quantity")
            @ExcludeMissing
            fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

            fun total(total: Double) = total(JsonField.of(total))

            @JsonProperty("total")
            @ExcludeMissing
            fun total(total: JsonField<Double>) = apply { this.total = total }

            /** only present for beta contract invoices */
            fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

            /** only present for beta contract invoices */
            @JsonProperty("unit_price")
            @ExcludeMissing
            fun unitPrice(unitPrice: JsonField<Double>) = apply { this.unitPrice = unitPrice }

            /**
             * Only present for contract invoices and when the include_list_prices query parameter
             * is set to true. This will include the list rate for the charge if applicable. Only
             * present for usage and subscription line items.
             */
            fun listPrice(listPrice: Rate) = listPrice(JsonField.of(listPrice))

            /**
             * Only present for contract invoices and when the include_list_prices query parameter
             * is set to true. This will include the list rate for the charge if applicable. Only
             * present for usage and subscription line items.
             */
            @JsonProperty("list_price")
            @ExcludeMissing
            fun listPrice(listPrice: JsonField<Rate>) = apply { this.listPrice = listPrice }

            fun productId(productId: String) = productId(JsonField.of(productId))

            @JsonProperty("product_id")
            @ExcludeMissing
            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            fun productCustomFields(productCustomFields: ProductCustomFields) =
                productCustomFields(JsonField.of(productCustomFields))

            @JsonProperty("product_custom_fields")
            @ExcludeMissing
            fun productCustomFields(productCustomFields: JsonField<ProductCustomFields>) = apply {
                this.productCustomFields = productCustomFields
            }

            fun productType(productType: String) = productType(JsonField.of(productType))

            @JsonProperty("product_type")
            @ExcludeMissing
            fun productType(productType: JsonField<String>) = apply {
                this.productType = productType
            }

            /**
             * only present for beta contract invoices. This field's availability is dependent on
             * your client's configuration.
             */
            fun netsuiteItemId(netsuiteItemId: String) =
                netsuiteItemId(JsonField.of(netsuiteItemId))

            /**
             * only present for beta contract invoices. This field's availability is dependent on
             * your client's configuration.
             */
            @JsonProperty("netsuite_item_id")
            @ExcludeMissing
            fun netsuiteItemId(netsuiteItemId: JsonField<String>) = apply {
                this.netsuiteItemId = netsuiteItemId
            }

            /** only present for beta contract invoices */
            fun isProrated(isProrated: Boolean) = isProrated(JsonField.of(isProrated))

            /** only present for beta contract invoices */
            @JsonProperty("is_prorated")
            @ExcludeMissing
            fun isProrated(isProrated: JsonField<Boolean>) = apply { this.isProrated = isProrated }

            fun creditType(creditType: CreditTypeData) = creditType(JsonField.of(creditType))

            @JsonProperty("credit_type")
            @ExcludeMissing
            fun creditType(creditType: JsonField<CreditTypeData>) = apply {
                this.creditType = creditType
            }

            /** only present for beta contract invoices */
            fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

            /** only present for beta contract invoices */
            @JsonProperty("starting_at")
            @ExcludeMissing
            fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                this.startingAt = startingAt
            }

            /** only present for beta contract invoices */
            fun endingBefore(endingBefore: OffsetDateTime) =
                endingBefore(JsonField.of(endingBefore))

            /** only present for beta contract invoices */
            @JsonProperty("ending_before")
            @ExcludeMissing
            fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                this.endingBefore = endingBefore
            }

            /** only present for beta contract invoices */
            fun commitId(commitId: String) = commitId(JsonField.of(commitId))

            /** only present for beta contract invoices */
            @JsonProperty("commit_id")
            @ExcludeMissing
            fun commitId(commitId: JsonField<String>) = apply { this.commitId = commitId }

            /** only present for beta contract invoices */
            fun commitCustomFields(commitCustomFields: CommitCustomFields) =
                commitCustomFields(JsonField.of(commitCustomFields))

            /** only present for beta contract invoices */
            @JsonProperty("commit_custom_fields")
            @ExcludeMissing
            fun commitCustomFields(commitCustomFields: JsonField<CommitCustomFields>) = apply {
                this.commitCustomFields = commitCustomFields
            }

            /** only present for beta contract invoices */
            fun commitSegmentId(commitSegmentId: String) =
                commitSegmentId(JsonField.of(commitSegmentId))

            /** only present for beta contract invoices */
            @JsonProperty("commit_segment_id")
            @ExcludeMissing
            fun commitSegmentId(commitSegmentId: JsonField<String>) = apply {
                this.commitSegmentId = commitSegmentId
            }

            /** only present for beta contract invoices */
            fun commitType(commitType: String) = commitType(JsonField.of(commitType))

            /** only present for beta contract invoices */
            @JsonProperty("commit_type")
            @ExcludeMissing
            fun commitType(commitType: JsonField<String>) = apply { this.commitType = commitType }

            /**
             * only present for beta contract invoices. This field's availability is dependent on
             * your client's configuration.
             */
            fun commitNetsuiteSalesOrderId(commitNetsuiteSalesOrderId: String) =
                commitNetsuiteSalesOrderId(JsonField.of(commitNetsuiteSalesOrderId))

            /**
             * only present for beta contract invoices. This field's availability is dependent on
             * your client's configuration.
             */
            @JsonProperty("commit_netsuite_sales_order_id")
            @ExcludeMissing
            fun commitNetsuiteSalesOrderId(commitNetsuiteSalesOrderId: JsonField<String>) = apply {
                this.commitNetsuiteSalesOrderId = commitNetsuiteSalesOrderId
            }

            /**
             * only present for beta contract invoices. This field's availability is dependent on
             * your client's configuration.
             */
            fun commitNetsuiteItemId(commitNetsuiteItemId: String) =
                commitNetsuiteItemId(JsonField.of(commitNetsuiteItemId))

            /**
             * only present for beta contract invoices. This field's availability is dependent on
             * your client's configuration.
             */
            @JsonProperty("commit_netsuite_item_id")
            @ExcludeMissing
            fun commitNetsuiteItemId(commitNetsuiteItemId: JsonField<String>) = apply {
                this.commitNetsuiteItemId = commitNetsuiteItemId
            }

            /** only present for beta contract invoices */
            fun postpaidCommit(postpaidCommit: PostpaidCommit) =
                postpaidCommit(JsonField.of(postpaidCommit))

            /** only present for beta contract invoices */
            @JsonProperty("postpaid_commit")
            @ExcludeMissing
            fun postpaidCommit(postpaidCommit: JsonField<PostpaidCommit>) = apply {
                this.postpaidCommit = postpaidCommit
            }

            fun resellerType(resellerType: ResellerType) = resellerType(JsonField.of(resellerType))

            @JsonProperty("reseller_type")
            @ExcludeMissing
            fun resellerType(resellerType: JsonField<ResellerType>) = apply {
                this.resellerType = resellerType
            }

            fun subLineItems(subLineItems: List<SubLineItem>) =
                subLineItems(JsonField.of(subLineItems))

            @JsonProperty("sub_line_items")
            @ExcludeMissing
            fun subLineItems(subLineItems: JsonField<List<SubLineItem>>) = apply {
                this.subLineItems = subLineItems
            }

            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

            @JsonProperty("custom_fields")
            @ExcludeMissing
            fun customFields(customFields: JsonField<CustomFields>) = apply {
                this.customFields = customFields
            }

            /**
             * if pricing groups are used, this will contain the values used to calculate the price
             */
            fun pricingGroupValues(pricingGroupValues: PricingGroupValues) =
                pricingGroupValues(JsonField.of(pricingGroupValues))

            /**
             * if pricing groups are used, this will contain the values used to calculate the price
             */
            @JsonProperty("pricing_group_values")
            @ExcludeMissing
            fun pricingGroupValues(pricingGroupValues: JsonField<PricingGroupValues>) = apply {
                this.pricingGroupValues = pricingGroupValues
            }

            /**
             * if presentation groups are used, this will contain the values used to break down the
             * line item
             */
            fun presentationGroupValues(presentationGroupValues: PresentationGroupValues) =
                presentationGroupValues(JsonField.of(presentationGroupValues))

            /**
             * if presentation groups are used, this will contain the values used to break down the
             * line item
             */
            @JsonProperty("presentation_group_values")
            @ExcludeMissing
            fun presentationGroupValues(
                presentationGroupValues: JsonField<PresentationGroupValues>
            ) = apply { this.presentationGroupValues = presentationGroupValues }

            fun metadata(metadata: String) = metadata(JsonField.of(metadata))

            @JsonProperty("metadata")
            @ExcludeMissing
            fun metadata(metadata: JsonField<String>) = apply { this.metadata = metadata }

            /** The start date for the billing period on the invoice. */
            fun netsuiteInvoiceBillingStart(netsuiteInvoiceBillingStart: OffsetDateTime) =
                netsuiteInvoiceBillingStart(JsonField.of(netsuiteInvoiceBillingStart))

            /** The start date for the billing period on the invoice. */
            @JsonProperty("netsuite_invoice_billing_start")
            @ExcludeMissing
            fun netsuiteInvoiceBillingStart(
                netsuiteInvoiceBillingStart: JsonField<OffsetDateTime>
            ) = apply { this.netsuiteInvoiceBillingStart = netsuiteInvoiceBillingStart }

            /** The end date for the billing period on the invoice. */
            fun netsuiteInvoiceBillingEnd(netsuiteInvoiceBillingEnd: OffsetDateTime) =
                netsuiteInvoiceBillingEnd(JsonField.of(netsuiteInvoiceBillingEnd))

            /** The end date for the billing period on the invoice. */
            @JsonProperty("netsuite_invoice_billing_end")
            @ExcludeMissing
            fun netsuiteInvoiceBillingEnd(netsuiteInvoiceBillingEnd: JsonField<OffsetDateTime>) =
                apply {
                    this.netsuiteInvoiceBillingEnd = netsuiteInvoiceBillingEnd
                }

            /** only present for beta contract invoices */
            fun professionalServiceId(professionalServiceId: String) =
                professionalServiceId(JsonField.of(professionalServiceId))

            /** only present for beta contract invoices */
            @JsonProperty("professional_service_id")
            @ExcludeMissing
            fun professionalServiceId(professionalServiceId: JsonField<String>) = apply {
                this.professionalServiceId = professionalServiceId
            }

            /** only present for beta contract invoices */
            fun professionalServiceCustomFields(
                professionalServiceCustomFields: ProfessionalServiceCustomFields
            ) = professionalServiceCustomFields(JsonField.of(professionalServiceCustomFields))

            /** only present for beta contract invoices */
            @JsonProperty("professional_service_custom_fields")
            @ExcludeMissing
            fun professionalServiceCustomFields(
                professionalServiceCustomFields: JsonField<ProfessionalServiceCustomFields>
            ) = apply { this.professionalServiceCustomFields = professionalServiceCustomFields }

            /** only present for beta contract invoices */
            fun scheduledChargeId(scheduledChargeId: String) =
                scheduledChargeId(JsonField.of(scheduledChargeId))

            /** only present for beta contract invoices */
            @JsonProperty("scheduled_charge_id")
            @ExcludeMissing
            fun scheduledChargeId(scheduledChargeId: JsonField<String>) = apply {
                this.scheduledChargeId = scheduledChargeId
            }

            fun scheduledChargeCustomFields(
                scheduledChargeCustomFields: ScheduledChargeCustomFields
            ) = scheduledChargeCustomFields(JsonField.of(scheduledChargeCustomFields))

            @JsonProperty("scheduled_charge_custom_fields")
            @ExcludeMissing
            fun scheduledChargeCustomFields(
                scheduledChargeCustomFields: JsonField<ScheduledChargeCustomFields>
            ) = apply { this.scheduledChargeCustomFields = scheduledChargeCustomFields }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): LineItem =
                LineItem(
                    name,
                    groupKey,
                    groupValue,
                    quantity,
                    total,
                    unitPrice,
                    listPrice,
                    productId,
                    productCustomFields,
                    productType,
                    netsuiteItemId,
                    isProrated,
                    creditType,
                    startingAt,
                    endingBefore,
                    commitId,
                    commitCustomFields,
                    commitSegmentId,
                    commitType,
                    commitNetsuiteSalesOrderId,
                    commitNetsuiteItemId,
                    postpaidCommit,
                    resellerType,
                    subLineItems.map { it.toUnmodifiable() },
                    customFields,
                    pricingGroupValues,
                    presentationGroupValues,
                    metadata,
                    netsuiteInvoiceBillingStart,
                    netsuiteInvoiceBillingEnd,
                    professionalServiceId,
                    professionalServiceCustomFields,
                    scheduledChargeId,
                    scheduledChargeCustomFields,
                    additionalProperties.toUnmodifiable(),
                )
        }

        /** only present for beta contract invoices */
        @JsonDeserialize(builder = CommitCustomFields.Builder::class)
        @NoAutoDetect
        class CommitCustomFields
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CommitCustomFields = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(commitCustomFields: CommitCustomFields) = apply {
                    additionalProperties(commitCustomFields.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CommitCustomFields =
                    CommitCustomFields(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CommitCustomFields && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "CommitCustomFields{additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = CustomFields.Builder::class)
        @NoAutoDetect
        class CustomFields
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CustomFields = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(customFields: CustomFields) = apply {
                    additionalProperties(customFields.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CustomFields = CustomFields(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CustomFields && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
        }

        /** only present for beta contract invoices */
        @JsonDeserialize(builder = PostpaidCommit.Builder::class)
        @NoAutoDetect
        class PostpaidCommit
        private constructor(
            private val id: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun id(): String = id.getRequired("id")

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): PostpaidCommit = apply {
                if (!validated) {
                    id()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(postpaidCommit: PostpaidCommit) = apply {
                    this.id = postpaidCommit.id
                    additionalProperties(postpaidCommit.additionalProperties)
                }

                fun id(id: String) = id(JsonField.of(id))

                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): PostpaidCommit =
                    PostpaidCommit(id, additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PostpaidCommit && this.id == other.id && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(id, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "PostpaidCommit{id=$id, additionalProperties=$additionalProperties}"
        }

        /**
         * if presentation groups are used, this will contain the values used to break down the line
         * item
         */
        @JsonDeserialize(builder = PresentationGroupValues.Builder::class)
        @NoAutoDetect
        class PresentationGroupValues
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): PresentationGroupValues = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(presentationGroupValues: PresentationGroupValues) = apply {
                    additionalProperties(presentationGroupValues.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): PresentationGroupValues =
                    PresentationGroupValues(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PresentationGroupValues && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "PresentationGroupValues{additionalProperties=$additionalProperties}"
        }

        /** if pricing groups are used, this will contain the values used to calculate the price */
        @JsonDeserialize(builder = PricingGroupValues.Builder::class)
        @NoAutoDetect
        class PricingGroupValues
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): PricingGroupValues = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(pricingGroupValues: PricingGroupValues) = apply {
                    additionalProperties(pricingGroupValues.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): PricingGroupValues =
                    PricingGroupValues(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PricingGroupValues && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "PricingGroupValues{additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = ProductCustomFields.Builder::class)
        @NoAutoDetect
        class ProductCustomFields
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): ProductCustomFields = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(productCustomFields: ProductCustomFields) = apply {
                    additionalProperties(productCustomFields.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): ProductCustomFields =
                    ProductCustomFields(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ProductCustomFields && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "ProductCustomFields{additionalProperties=$additionalProperties}"
        }

        /** only present for beta contract invoices */
        @JsonDeserialize(builder = ProfessionalServiceCustomFields.Builder::class)
        @NoAutoDetect
        class ProfessionalServiceCustomFields
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): ProfessionalServiceCustomFields = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(
                    professionalServiceCustomFields: ProfessionalServiceCustomFields
                ) = apply {
                    additionalProperties(professionalServiceCustomFields.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): ProfessionalServiceCustomFields =
                    ProfessionalServiceCustomFields(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ProfessionalServiceCustomFields && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "ProfessionalServiceCustomFields{additionalProperties=$additionalProperties}"
        }

        class ResellerType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ResellerType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val AWS = ResellerType(JsonField.of("AWS"))

                @JvmField val AWS_PRO_SERVICE = ResellerType(JsonField.of("AWS_PRO_SERVICE"))

                @JvmField val GCP = ResellerType(JsonField.of("GCP"))

                @JvmField val GCP_PRO_SERVICE = ResellerType(JsonField.of("GCP_PRO_SERVICE"))

                @JvmStatic fun of(value: String) = ResellerType(JsonField.of(value))
            }

            enum class Known {
                AWS,
                AWS_PRO_SERVICE,
                GCP,
                GCP_PRO_SERVICE,
            }

            enum class Value {
                AWS,
                AWS_PRO_SERVICE,
                GCP,
                GCP_PRO_SERVICE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    AWS -> Value.AWS
                    AWS_PRO_SERVICE -> Value.AWS_PRO_SERVICE
                    GCP -> Value.GCP
                    GCP_PRO_SERVICE -> Value.GCP_PRO_SERVICE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    AWS -> Known.AWS
                    AWS_PRO_SERVICE -> Known.AWS_PRO_SERVICE
                    GCP -> Known.GCP
                    GCP_PRO_SERVICE -> Known.GCP_PRO_SERVICE
                    else -> throw MetronomeInvalidDataException("Unknown ResellerType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = ScheduledChargeCustomFields.Builder::class)
        @NoAutoDetect
        class ScheduledChargeCustomFields
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): ScheduledChargeCustomFields = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(scheduledChargeCustomFields: ScheduledChargeCustomFields) =
                    apply {
                        additionalProperties(scheduledChargeCustomFields.additionalProperties)
                    }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): ScheduledChargeCustomFields =
                    ScheduledChargeCustomFields(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ScheduledChargeCustomFields && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "ScheduledChargeCustomFields{additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = SubLineItem.Builder::class)
        @NoAutoDetect
        class SubLineItem
        private constructor(
            private val name: JsonField<String>,
            private val price: JsonField<Double>,
            private val quantity: JsonField<Double>,
            private val subtotal: JsonField<Double>,
            private val chargeId: JsonField<String>,
            private val creditGrantId: JsonField<String>,
            private val tierPeriod: JsonField<TierPeriod>,
            private val tiers: JsonField<List<Tier>>,
            private val customFields: JsonField<CustomFields>,
            private val startDate: JsonField<OffsetDateTime>,
            private val endDate: JsonField<OffsetDateTime>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun name(): String = name.getRequired("name")

            /**
             * the unit price for this charge, present only if the charge is not tiered and the
             * quantity is nonzero
             */
            fun price(): Optional<Double> = Optional.ofNullable(price.getNullable("price"))

            fun quantity(): Double = quantity.getRequired("quantity")

            fun subtotal(): Double = subtotal.getRequired("subtotal")

            fun chargeId(): Optional<String> =
                Optional.ofNullable(chargeId.getNullable("charge_id"))

            fun creditGrantId(): Optional<String> =
                Optional.ofNullable(creditGrantId.getNullable("credit_grant_id"))

            /** when the current tier started and ends (for tiered charges only) */
            fun tierPeriod(): Optional<TierPeriod> =
                Optional.ofNullable(tierPeriod.getNullable("tier_period"))

            fun tiers(): Optional<List<Tier>> = Optional.ofNullable(tiers.getNullable("tiers"))

            fun customFields(): CustomFields = customFields.getRequired("custom_fields")

            /** The start date for the charge (for seats charges only). */
            fun startDate(): Optional<OffsetDateTime> =
                Optional.ofNullable(startDate.getNullable("start_date"))

            /** The end date for the charge (for seats charges only). */
            fun endDate(): Optional<OffsetDateTime> =
                Optional.ofNullable(endDate.getNullable("end_date"))

            @JsonProperty("name") @ExcludeMissing fun _name() = name

            /**
             * the unit price for this charge, present only if the charge is not tiered and the
             * quantity is nonzero
             */
            @JsonProperty("price") @ExcludeMissing fun _price() = price

            @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

            @JsonProperty("subtotal") @ExcludeMissing fun _subtotal() = subtotal

            @JsonProperty("charge_id") @ExcludeMissing fun _chargeId() = chargeId

            @JsonProperty("credit_grant_id") @ExcludeMissing fun _creditGrantId() = creditGrantId

            /** when the current tier started and ends (for tiered charges only) */
            @JsonProperty("tier_period") @ExcludeMissing fun _tierPeriod() = tierPeriod

            @JsonProperty("tiers") @ExcludeMissing fun _tiers() = tiers

            @JsonProperty("custom_fields") @ExcludeMissing fun _customFields() = customFields

            /** The start date for the charge (for seats charges only). */
            @JsonProperty("start_date") @ExcludeMissing fun _startDate() = startDate

            /** The end date for the charge (for seats charges only). */
            @JsonProperty("end_date") @ExcludeMissing fun _endDate() = endDate

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): SubLineItem = apply {
                if (!validated) {
                    name()
                    price()
                    quantity()
                    subtotal()
                    chargeId()
                    creditGrantId()
                    tierPeriod().map { it.validate() }
                    tiers().map { it.forEach { it.validate() } }
                    customFields().validate()
                    startDate()
                    endDate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var name: JsonField<String> = JsonMissing.of()
                private var price: JsonField<Double> = JsonMissing.of()
                private var quantity: JsonField<Double> = JsonMissing.of()
                private var subtotal: JsonField<Double> = JsonMissing.of()
                private var chargeId: JsonField<String> = JsonMissing.of()
                private var creditGrantId: JsonField<String> = JsonMissing.of()
                private var tierPeriod: JsonField<TierPeriod> = JsonMissing.of()
                private var tiers: JsonField<List<Tier>> = JsonMissing.of()
                private var customFields: JsonField<CustomFields> = JsonMissing.of()
                private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(subLineItem: SubLineItem) = apply {
                    this.name = subLineItem.name
                    this.price = subLineItem.price
                    this.quantity = subLineItem.quantity
                    this.subtotal = subLineItem.subtotal
                    this.chargeId = subLineItem.chargeId
                    this.creditGrantId = subLineItem.creditGrantId
                    this.tierPeriod = subLineItem.tierPeriod
                    this.tiers = subLineItem.tiers
                    this.customFields = subLineItem.customFields
                    this.startDate = subLineItem.startDate
                    this.endDate = subLineItem.endDate
                    additionalProperties(subLineItem.additionalProperties)
                }

                fun name(name: String) = name(JsonField.of(name))

                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                /**
                 * the unit price for this charge, present only if the charge is not tiered and the
                 * quantity is nonzero
                 */
                fun price(price: Double) = price(JsonField.of(price))

                /**
                 * the unit price for this charge, present only if the charge is not tiered and the
                 * quantity is nonzero
                 */
                @JsonProperty("price")
                @ExcludeMissing
                fun price(price: JsonField<Double>) = apply { this.price = price }

                fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                @JsonProperty("quantity")
                @ExcludeMissing
                fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                fun subtotal(subtotal: Double) = subtotal(JsonField.of(subtotal))

                @JsonProperty("subtotal")
                @ExcludeMissing
                fun subtotal(subtotal: JsonField<Double>) = apply { this.subtotal = subtotal }

                fun chargeId(chargeId: String) = chargeId(JsonField.of(chargeId))

                @JsonProperty("charge_id")
                @ExcludeMissing
                fun chargeId(chargeId: JsonField<String>) = apply { this.chargeId = chargeId }

                fun creditGrantId(creditGrantId: String) =
                    creditGrantId(JsonField.of(creditGrantId))

                @JsonProperty("credit_grant_id")
                @ExcludeMissing
                fun creditGrantId(creditGrantId: JsonField<String>) = apply {
                    this.creditGrantId = creditGrantId
                }

                /** when the current tier started and ends (for tiered charges only) */
                fun tierPeriod(tierPeriod: TierPeriod) = tierPeriod(JsonField.of(tierPeriod))

                /** when the current tier started and ends (for tiered charges only) */
                @JsonProperty("tier_period")
                @ExcludeMissing
                fun tierPeriod(tierPeriod: JsonField<TierPeriod>) = apply {
                    this.tierPeriod = tierPeriod
                }

                fun tiers(tiers: List<Tier>) = tiers(JsonField.of(tiers))

                @JsonProperty("tiers")
                @ExcludeMissing
                fun tiers(tiers: JsonField<List<Tier>>) = apply { this.tiers = tiers }

                fun customFields(customFields: CustomFields) =
                    customFields(JsonField.of(customFields))

                @JsonProperty("custom_fields")
                @ExcludeMissing
                fun customFields(customFields: JsonField<CustomFields>) = apply {
                    this.customFields = customFields
                }

                /** The start date for the charge (for seats charges only). */
                fun startDate(startDate: OffsetDateTime) = startDate(JsonField.of(startDate))

                /** The start date for the charge (for seats charges only). */
                @JsonProperty("start_date")
                @ExcludeMissing
                fun startDate(startDate: JsonField<OffsetDateTime>) = apply {
                    this.startDate = startDate
                }

                /** The end date for the charge (for seats charges only). */
                fun endDate(endDate: OffsetDateTime) = endDate(JsonField.of(endDate))

                /** The end date for the charge (for seats charges only). */
                @JsonProperty("end_date")
                @ExcludeMissing
                fun endDate(endDate: JsonField<OffsetDateTime>) = apply { this.endDate = endDate }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): SubLineItem =
                    SubLineItem(
                        name,
                        price,
                        quantity,
                        subtotal,
                        chargeId,
                        creditGrantId,
                        tierPeriod,
                        tiers.map { it.toUnmodifiable() },
                        customFields,
                        startDate,
                        endDate,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(builder = CustomFields.Builder::class)
            @NoAutoDetect
            class CustomFields
            private constructor(
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): CustomFields = apply {
                    if (!validated) {
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(customFields: CustomFields) = apply {
                        additionalProperties(customFields.additionalProperties)
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): CustomFields = CustomFields(additionalProperties.toUnmodifiable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is CustomFields && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
            }

            /** when the current tier started and ends (for tiered charges only) */
            @JsonDeserialize(builder = TierPeriod.Builder::class)
            @NoAutoDetect
            class TierPeriod
            private constructor(
                private val startingAt: JsonField<OffsetDateTime>,
                private val endingBefore: JsonField<OffsetDateTime>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun startingAt(): OffsetDateTime = startingAt.getRequired("starting_at")

                fun endingBefore(): Optional<OffsetDateTime> =
                    Optional.ofNullable(endingBefore.getNullable("ending_before"))

                @JsonProperty("starting_at") @ExcludeMissing fun _startingAt() = startingAt

                @JsonProperty("ending_before") @ExcludeMissing fun _endingBefore() = endingBefore

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): TierPeriod = apply {
                    if (!validated) {
                        startingAt()
                        endingBefore()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var startingAt: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(tierPeriod: TierPeriod) = apply {
                        this.startingAt = tierPeriod.startingAt
                        this.endingBefore = tierPeriod.endingBefore
                        additionalProperties(tierPeriod.additionalProperties)
                    }

                    fun startingAt(startingAt: OffsetDateTime) =
                        startingAt(JsonField.of(startingAt))

                    @JsonProperty("starting_at")
                    @ExcludeMissing
                    fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                        this.startingAt = startingAt
                    }

                    fun endingBefore(endingBefore: OffsetDateTime) =
                        endingBefore(JsonField.of(endingBefore))

                    @JsonProperty("ending_before")
                    @ExcludeMissing
                    fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                        this.endingBefore = endingBefore
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): TierPeriod =
                        TierPeriod(
                            startingAt,
                            endingBefore,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is TierPeriod && this.startingAt == other.startingAt && this.endingBefore == other.endingBefore && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(startingAt, endingBefore, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "TierPeriod{startingAt=$startingAt, endingBefore=$endingBefore, additionalProperties=$additionalProperties}"
            }

            @JsonDeserialize(builder = Tier.Builder::class)
            @NoAutoDetect
            class Tier
            private constructor(
                private val startingAt: JsonField<Double>,
                private val quantity: JsonField<Double>,
                private val price: JsonField<Double>,
                private val subtotal: JsonField<Double>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                /** at what metric amount this tier begins */
                fun startingAt(): Double = startingAt.getRequired("starting_at")

                fun quantity(): Double = quantity.getRequired("quantity")

                fun price(): Double = price.getRequired("price")

                fun subtotal(): Double = subtotal.getRequired("subtotal")

                /** at what metric amount this tier begins */
                @JsonProperty("starting_at") @ExcludeMissing fun _startingAt() = startingAt

                @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

                @JsonProperty("price") @ExcludeMissing fun _price() = price

                @JsonProperty("subtotal") @ExcludeMissing fun _subtotal() = subtotal

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Tier = apply {
                    if (!validated) {
                        startingAt()
                        quantity()
                        price()
                        subtotal()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var startingAt: JsonField<Double> = JsonMissing.of()
                    private var quantity: JsonField<Double> = JsonMissing.of()
                    private var price: JsonField<Double> = JsonMissing.of()
                    private var subtotal: JsonField<Double> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(tier: Tier) = apply {
                        this.startingAt = tier.startingAt
                        this.quantity = tier.quantity
                        this.price = tier.price
                        this.subtotal = tier.subtotal
                        additionalProperties(tier.additionalProperties)
                    }

                    /** at what metric amount this tier begins */
                    fun startingAt(startingAt: Double) = startingAt(JsonField.of(startingAt))

                    /** at what metric amount this tier begins */
                    @JsonProperty("starting_at")
                    @ExcludeMissing
                    fun startingAt(startingAt: JsonField<Double>) = apply {
                        this.startingAt = startingAt
                    }

                    fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

                    @JsonProperty("quantity")
                    @ExcludeMissing
                    fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

                    fun price(price: Double) = price(JsonField.of(price))

                    @JsonProperty("price")
                    @ExcludeMissing
                    fun price(price: JsonField<Double>) = apply { this.price = price }

                    fun subtotal(subtotal: Double) = subtotal(JsonField.of(subtotal))

                    @JsonProperty("subtotal")
                    @ExcludeMissing
                    fun subtotal(subtotal: JsonField<Double>) = apply { this.subtotal = subtotal }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): Tier =
                        Tier(
                            startingAt,
                            quantity,
                            price,
                            subtotal,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Tier && this.startingAt == other.startingAt && this.quantity == other.quantity && this.price == other.price && this.subtotal == other.subtotal && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(startingAt, quantity, price, subtotal, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "Tier{startingAt=$startingAt, quantity=$quantity, price=$price, subtotal=$subtotal, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is SubLineItem && this.name == other.name && this.price == other.price && this.quantity == other.quantity && this.subtotal == other.subtotal && this.chargeId == other.chargeId && this.creditGrantId == other.creditGrantId && this.tierPeriod == other.tierPeriod && this.tiers == other.tiers && this.customFields == other.customFields && this.startDate == other.startDate && this.endDate == other.endDate && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(name, price, quantity, subtotal, chargeId, creditGrantId, tierPeriod, tiers, customFields, startDate, endDate, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "SubLineItem{name=$name, price=$price, quantity=$quantity, subtotal=$subtotal, chargeId=$chargeId, creditGrantId=$creditGrantId, tierPeriod=$tierPeriod, tiers=$tiers, customFields=$customFields, startDate=$startDate, endDate=$endDate, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is LineItem && this.name == other.name && this.groupKey == other.groupKey && this.groupValue == other.groupValue && this.quantity == other.quantity && this.total == other.total && this.unitPrice == other.unitPrice && this.listPrice == other.listPrice && this.productId == other.productId && this.productCustomFields == other.productCustomFields && this.productType == other.productType && this.netsuiteItemId == other.netsuiteItemId && this.isProrated == other.isProrated && this.creditType == other.creditType && this.startingAt == other.startingAt && this.endingBefore == other.endingBefore && this.commitId == other.commitId && this.commitCustomFields == other.commitCustomFields && this.commitSegmentId == other.commitSegmentId && this.commitType == other.commitType && this.commitNetsuiteSalesOrderId == other.commitNetsuiteSalesOrderId && this.commitNetsuiteItemId == other.commitNetsuiteItemId && this.postpaidCommit == other.postpaidCommit && this.resellerType == other.resellerType && this.subLineItems == other.subLineItems && this.customFields == other.customFields && this.pricingGroupValues == other.pricingGroupValues && this.presentationGroupValues == other.presentationGroupValues && this.metadata == other.metadata && this.netsuiteInvoiceBillingStart == other.netsuiteInvoiceBillingStart && this.netsuiteInvoiceBillingEnd == other.netsuiteInvoiceBillingEnd && this.professionalServiceId == other.professionalServiceId && this.professionalServiceCustomFields == other.professionalServiceCustomFields && this.scheduledChargeId == other.scheduledChargeId && this.scheduledChargeCustomFields == other.scheduledChargeCustomFields && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(name, groupKey, groupValue, quantity, total, unitPrice, listPrice, productId, productCustomFields, productType, netsuiteItemId, isProrated, creditType, startingAt, endingBefore, commitId, commitCustomFields, commitSegmentId, commitType, commitNetsuiteSalesOrderId, commitNetsuiteItemId, postpaidCommit, resellerType, subLineItems, customFields, pricingGroupValues, presentationGroupValues, metadata, netsuiteInvoiceBillingStart, netsuiteInvoiceBillingEnd, professionalServiceId, professionalServiceCustomFields, scheduledChargeId, scheduledChargeCustomFields, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "LineItem{name=$name, groupKey=$groupKey, groupValue=$groupValue, quantity=$quantity, total=$total, unitPrice=$unitPrice, listPrice=$listPrice, productId=$productId, productCustomFields=$productCustomFields, productType=$productType, netsuiteItemId=$netsuiteItemId, isProrated=$isProrated, creditType=$creditType, startingAt=$startingAt, endingBefore=$endingBefore, commitId=$commitId, commitCustomFields=$commitCustomFields, commitSegmentId=$commitSegmentId, commitType=$commitType, commitNetsuiteSalesOrderId=$commitNetsuiteSalesOrderId, commitNetsuiteItemId=$commitNetsuiteItemId, postpaidCommit=$postpaidCommit, resellerType=$resellerType, subLineItems=$subLineItems, customFields=$customFields, pricingGroupValues=$pricingGroupValues, presentationGroupValues=$presentationGroupValues, metadata=$metadata, netsuiteInvoiceBillingStart=$netsuiteInvoiceBillingStart, netsuiteInvoiceBillingEnd=$netsuiteInvoiceBillingEnd, professionalServiceId=$professionalServiceId, professionalServiceCustomFields=$professionalServiceCustomFields, scheduledChargeId=$scheduledChargeId, scheduledChargeCustomFields=$scheduledChargeCustomFields, additionalProperties=$additionalProperties}"
    }

    class BillableStatus
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BillableStatus && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val BILLABLE = BillableStatus(JsonField.of("billable"))

            @JvmField val UNBILLABLE = BillableStatus(JsonField.of("unbillable"))

            @JvmStatic fun of(value: String) = BillableStatus(JsonField.of(value))
        }

        enum class Known {
            BILLABLE,
            UNBILLABLE,
        }

        enum class Value {
            BILLABLE,
            UNBILLABLE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                BILLABLE -> Value.BILLABLE
                UNBILLABLE -> Value.UNBILLABLE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                BILLABLE -> Known.BILLABLE
                UNBILLABLE -> Known.UNBILLABLE
                else -> throw MetronomeInvalidDataException("Unknown BillableStatus: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(builder = ContractCustomFields.Builder::class)
    @NoAutoDetect
    class ContractCustomFields
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): ContractCustomFields = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(contractCustomFields: ContractCustomFields) = apply {
                additionalProperties(contractCustomFields.additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): ContractCustomFields =
                ContractCustomFields(additionalProperties.toUnmodifiable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ContractCustomFields && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "ContractCustomFields{additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = CorrectionRecord.Builder::class)
    @NoAutoDetect
    class CorrectionRecord
    private constructor(
        private val reason: JsonField<String>,
        private val memo: JsonField<String>,
        private val correctedInvoiceId: JsonField<String>,
        private val correctedExternalInvoice: JsonField<CorrectedExternalInvoice>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun reason(): String = reason.getRequired("reason")

        fun memo(): String = memo.getRequired("memo")

        fun correctedInvoiceId(): String = correctedInvoiceId.getRequired("corrected_invoice_id")

        fun correctedExternalInvoice(): Optional<CorrectedExternalInvoice> =
            Optional.ofNullable(correctedExternalInvoice.getNullable("corrected_external_invoice"))

        @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

        @JsonProperty("memo") @ExcludeMissing fun _memo() = memo

        @JsonProperty("corrected_invoice_id")
        @ExcludeMissing
        fun _correctedInvoiceId() = correctedInvoiceId

        @JsonProperty("corrected_external_invoice")
        @ExcludeMissing
        fun _correctedExternalInvoice() = correctedExternalInvoice

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): CorrectionRecord = apply {
            if (!validated) {
                reason()
                memo()
                correctedInvoiceId()
                correctedExternalInvoice().map { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var reason: JsonField<String> = JsonMissing.of()
            private var memo: JsonField<String> = JsonMissing.of()
            private var correctedInvoiceId: JsonField<String> = JsonMissing.of()
            private var correctedExternalInvoice: JsonField<CorrectedExternalInvoice> =
                JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(correctionRecord: CorrectionRecord) = apply {
                this.reason = correctionRecord.reason
                this.memo = correctionRecord.memo
                this.correctedInvoiceId = correctionRecord.correctedInvoiceId
                this.correctedExternalInvoice = correctionRecord.correctedExternalInvoice
                additionalProperties(correctionRecord.additionalProperties)
            }

            fun reason(reason: String) = reason(JsonField.of(reason))

            @JsonProperty("reason")
            @ExcludeMissing
            fun reason(reason: JsonField<String>) = apply { this.reason = reason }

            fun memo(memo: String) = memo(JsonField.of(memo))

            @JsonProperty("memo")
            @ExcludeMissing
            fun memo(memo: JsonField<String>) = apply { this.memo = memo }

            fun correctedInvoiceId(correctedInvoiceId: String) =
                correctedInvoiceId(JsonField.of(correctedInvoiceId))

            @JsonProperty("corrected_invoice_id")
            @ExcludeMissing
            fun correctedInvoiceId(correctedInvoiceId: JsonField<String>) = apply {
                this.correctedInvoiceId = correctedInvoiceId
            }

            fun correctedExternalInvoice(correctedExternalInvoice: CorrectedExternalInvoice) =
                correctedExternalInvoice(JsonField.of(correctedExternalInvoice))

            @JsonProperty("corrected_external_invoice")
            @ExcludeMissing
            fun correctedExternalInvoice(
                correctedExternalInvoice: JsonField<CorrectedExternalInvoice>
            ) = apply { this.correctedExternalInvoice = correctedExternalInvoice }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): CorrectionRecord =
                CorrectionRecord(
                    reason,
                    memo,
                    correctedInvoiceId,
                    correctedExternalInvoice,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = CorrectedExternalInvoice.Builder::class)
        @NoAutoDetect
        class CorrectedExternalInvoice
        private constructor(
            private val billingProviderType: JsonField<BillingProviderType>,
            private val invoiceId: JsonField<String>,
            private val issuedAtTimestamp: JsonField<OffsetDateTime>,
            private val externalStatus: JsonField<ExternalStatus>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun billingProviderType(): BillingProviderType =
                billingProviderType.getRequired("billing_provider_type")

            fun invoiceId(): Optional<String> =
                Optional.ofNullable(invoiceId.getNullable("invoice_id"))

            fun issuedAtTimestamp(): Optional<OffsetDateTime> =
                Optional.ofNullable(issuedAtTimestamp.getNullable("issued_at_timestamp"))

            fun externalStatus(): Optional<ExternalStatus> =
                Optional.ofNullable(externalStatus.getNullable("external_status"))

            @JsonProperty("billing_provider_type")
            @ExcludeMissing
            fun _billingProviderType() = billingProviderType

            @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId() = invoiceId

            @JsonProperty("issued_at_timestamp")
            @ExcludeMissing
            fun _issuedAtTimestamp() = issuedAtTimestamp

            @JsonProperty("external_status") @ExcludeMissing fun _externalStatus() = externalStatus

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CorrectedExternalInvoice = apply {
                if (!validated) {
                    billingProviderType()
                    invoiceId()
                    issuedAtTimestamp()
                    externalStatus()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var billingProviderType: JsonField<BillingProviderType> = JsonMissing.of()
                private var invoiceId: JsonField<String> = JsonMissing.of()
                private var issuedAtTimestamp: JsonField<OffsetDateTime> = JsonMissing.of()
                private var externalStatus: JsonField<ExternalStatus> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(correctedExternalInvoice: CorrectedExternalInvoice) = apply {
                    this.billingProviderType = correctedExternalInvoice.billingProviderType
                    this.invoiceId = correctedExternalInvoice.invoiceId
                    this.issuedAtTimestamp = correctedExternalInvoice.issuedAtTimestamp
                    this.externalStatus = correctedExternalInvoice.externalStatus
                    additionalProperties(correctedExternalInvoice.additionalProperties)
                }

                fun billingProviderType(billingProviderType: BillingProviderType) =
                    billingProviderType(JsonField.of(billingProviderType))

                @JsonProperty("billing_provider_type")
                @ExcludeMissing
                fun billingProviderType(billingProviderType: JsonField<BillingProviderType>) =
                    apply {
                        this.billingProviderType = billingProviderType
                    }

                fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

                @JsonProperty("invoice_id")
                @ExcludeMissing
                fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

                fun issuedAtTimestamp(issuedAtTimestamp: OffsetDateTime) =
                    issuedAtTimestamp(JsonField.of(issuedAtTimestamp))

                @JsonProperty("issued_at_timestamp")
                @ExcludeMissing
                fun issuedAtTimestamp(issuedAtTimestamp: JsonField<OffsetDateTime>) = apply {
                    this.issuedAtTimestamp = issuedAtTimestamp
                }

                fun externalStatus(externalStatus: ExternalStatus) =
                    externalStatus(JsonField.of(externalStatus))

                @JsonProperty("external_status")
                @ExcludeMissing
                fun externalStatus(externalStatus: JsonField<ExternalStatus>) = apply {
                    this.externalStatus = externalStatus
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CorrectedExternalInvoice =
                    CorrectedExternalInvoice(
                        billingProviderType,
                        invoiceId,
                        issuedAtTimestamp,
                        externalStatus,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class BillingProviderType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is BillingProviderType && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField
                    val AWS_MARKETPLACE = BillingProviderType(JsonField.of("aws_marketplace"))

                    @JvmField val STRIPE = BillingProviderType(JsonField.of("stripe"))

                    @JvmField val NETSUITE = BillingProviderType(JsonField.of("netsuite"))

                    @JvmField val CUSTOM = BillingProviderType(JsonField.of("custom"))

                    @JvmField
                    val AZURE_MARKETPLACE = BillingProviderType(JsonField.of("azure_marketplace"))

                    @JvmField
                    val QUICKBOOKS_ONLINE = BillingProviderType(JsonField.of("quickbooks_online"))

                    @JvmField val WORKDAY = BillingProviderType(JsonField.of("workday"))

                    @JvmField
                    val GCP_MARKETPLACE = BillingProviderType(JsonField.of("gcp_marketplace"))

                    @JvmStatic fun of(value: String) = BillingProviderType(JsonField.of(value))
                }

                enum class Known {
                    AWS_MARKETPLACE,
                    STRIPE,
                    NETSUITE,
                    CUSTOM,
                    AZURE_MARKETPLACE,
                    QUICKBOOKS_ONLINE,
                    WORKDAY,
                    GCP_MARKETPLACE,
                }

                enum class Value {
                    AWS_MARKETPLACE,
                    STRIPE,
                    NETSUITE,
                    CUSTOM,
                    AZURE_MARKETPLACE,
                    QUICKBOOKS_ONLINE,
                    WORKDAY,
                    GCP_MARKETPLACE,
                    _UNKNOWN,
                }

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
                        else -> Value._UNKNOWN
                    }

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
                        else ->
                            throw MetronomeInvalidDataException(
                                "Unknown BillingProviderType: $value"
                            )
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            class ExternalStatus
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ExternalStatus && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val DRAFT = ExternalStatus(JsonField.of("DRAFT"))

                    @JvmField val FINALIZED = ExternalStatus(JsonField.of("FINALIZED"))

                    @JvmField val PAID = ExternalStatus(JsonField.of("PAID"))

                    @JvmField val UNCOLLECTIBLE = ExternalStatus(JsonField.of("UNCOLLECTIBLE"))

                    @JvmField val VOID = ExternalStatus(JsonField.of("VOID"))

                    @JvmField val DELETED = ExternalStatus(JsonField.of("DELETED"))

                    @JvmField val PAYMENT_FAILED = ExternalStatus(JsonField.of("PAYMENT_FAILED"))

                    @JvmField
                    val INVALID_REQUEST_ERROR =
                        ExternalStatus(JsonField.of("INVALID_REQUEST_ERROR"))

                    @JvmField val SKIPPED = ExternalStatus(JsonField.of("SKIPPED"))

                    @JvmField val SENT = ExternalStatus(JsonField.of("SENT"))

                    @JvmField val QUEUED = ExternalStatus(JsonField.of("QUEUED"))

                    @JvmStatic fun of(value: String) = ExternalStatus(JsonField.of(value))
                }

                enum class Known {
                    DRAFT,
                    FINALIZED,
                    PAID,
                    UNCOLLECTIBLE,
                    VOID,
                    DELETED,
                    PAYMENT_FAILED,
                    INVALID_REQUEST_ERROR,
                    SKIPPED,
                    SENT,
                    QUEUED,
                }

                enum class Value {
                    DRAFT,
                    FINALIZED,
                    PAID,
                    UNCOLLECTIBLE,
                    VOID,
                    DELETED,
                    PAYMENT_FAILED,
                    INVALID_REQUEST_ERROR,
                    SKIPPED,
                    SENT,
                    QUEUED,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        DRAFT -> Value.DRAFT
                        FINALIZED -> Value.FINALIZED
                        PAID -> Value.PAID
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

                fun known(): Known =
                    when (this) {
                        DRAFT -> Known.DRAFT
                        FINALIZED -> Known.FINALIZED
                        PAID -> Known.PAID
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

                fun asString(): String = _value().asStringOrThrow()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CorrectedExternalInvoice && this.billingProviderType == other.billingProviderType && this.invoiceId == other.invoiceId && this.issuedAtTimestamp == other.issuedAtTimestamp && this.externalStatus == other.externalStatus && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(billingProviderType, invoiceId, issuedAtTimestamp, externalStatus, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "CorrectedExternalInvoice{billingProviderType=$billingProviderType, invoiceId=$invoiceId, issuedAtTimestamp=$issuedAtTimestamp, externalStatus=$externalStatus, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CorrectionRecord && this.reason == other.reason && this.memo == other.memo && this.correctedInvoiceId == other.correctedInvoiceId && this.correctedExternalInvoice == other.correctedExternalInvoice && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(reason, memo, correctedInvoiceId, correctedExternalInvoice, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "CorrectionRecord{reason=$reason, memo=$memo, correctedInvoiceId=$correctedInvoiceId, correctedExternalInvoice=$correctedExternalInvoice, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = CustomFields.Builder::class)
    @NoAutoDetect
    class CustomFields
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): CustomFields = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customFields: CustomFields) = apply {
                additionalProperties(customFields.additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): CustomFields = CustomFields(additionalProperties.toUnmodifiable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomFields && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "CustomFields{additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = CustomerCustomFields.Builder::class)
    @NoAutoDetect
    class CustomerCustomFields
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): CustomerCustomFields = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(customerCustomFields: CustomerCustomFields) = apply {
                additionalProperties(customerCustomFields.additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): CustomerCustomFields =
                CustomerCustomFields(additionalProperties.toUnmodifiable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CustomerCustomFields && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "CustomerCustomFields{additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = ExternalInvoice.Builder::class)
    @NoAutoDetect
    class ExternalInvoice
    private constructor(
        private val billingProviderType: JsonField<BillingProviderType>,
        private val invoiceId: JsonField<String>,
        private val issuedAtTimestamp: JsonField<OffsetDateTime>,
        private val externalStatus: JsonField<ExternalStatus>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun billingProviderType(): BillingProviderType =
            billingProviderType.getRequired("billing_provider_type")

        fun invoiceId(): Optional<String> = Optional.ofNullable(invoiceId.getNullable("invoice_id"))

        fun issuedAtTimestamp(): Optional<OffsetDateTime> =
            Optional.ofNullable(issuedAtTimestamp.getNullable("issued_at_timestamp"))

        fun externalStatus(): Optional<ExternalStatus> =
            Optional.ofNullable(externalStatus.getNullable("external_status"))

        @JsonProperty("billing_provider_type")
        @ExcludeMissing
        fun _billingProviderType() = billingProviderType

        @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId() = invoiceId

        @JsonProperty("issued_at_timestamp")
        @ExcludeMissing
        fun _issuedAtTimestamp() = issuedAtTimestamp

        @JsonProperty("external_status") @ExcludeMissing fun _externalStatus() = externalStatus

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): ExternalInvoice = apply {
            if (!validated) {
                billingProviderType()
                invoiceId()
                issuedAtTimestamp()
                externalStatus()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var billingProviderType: JsonField<BillingProviderType> = JsonMissing.of()
            private var invoiceId: JsonField<String> = JsonMissing.of()
            private var issuedAtTimestamp: JsonField<OffsetDateTime> = JsonMissing.of()
            private var externalStatus: JsonField<ExternalStatus> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(externalInvoice: ExternalInvoice) = apply {
                this.billingProviderType = externalInvoice.billingProviderType
                this.invoiceId = externalInvoice.invoiceId
                this.issuedAtTimestamp = externalInvoice.issuedAtTimestamp
                this.externalStatus = externalInvoice.externalStatus
                additionalProperties(externalInvoice.additionalProperties)
            }

            fun billingProviderType(billingProviderType: BillingProviderType) =
                billingProviderType(JsonField.of(billingProviderType))

            @JsonProperty("billing_provider_type")
            @ExcludeMissing
            fun billingProviderType(billingProviderType: JsonField<BillingProviderType>) = apply {
                this.billingProviderType = billingProviderType
            }

            fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

            @JsonProperty("invoice_id")
            @ExcludeMissing
            fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

            fun issuedAtTimestamp(issuedAtTimestamp: OffsetDateTime) =
                issuedAtTimestamp(JsonField.of(issuedAtTimestamp))

            @JsonProperty("issued_at_timestamp")
            @ExcludeMissing
            fun issuedAtTimestamp(issuedAtTimestamp: JsonField<OffsetDateTime>) = apply {
                this.issuedAtTimestamp = issuedAtTimestamp
            }

            fun externalStatus(externalStatus: ExternalStatus) =
                externalStatus(JsonField.of(externalStatus))

            @JsonProperty("external_status")
            @ExcludeMissing
            fun externalStatus(externalStatus: JsonField<ExternalStatus>) = apply {
                this.externalStatus = externalStatus
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): ExternalInvoice =
                ExternalInvoice(
                    billingProviderType,
                    invoiceId,
                    issuedAtTimestamp,
                    externalStatus,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class BillingProviderType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is BillingProviderType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val AWS_MARKETPLACE = BillingProviderType(JsonField.of("aws_marketplace"))

                @JvmField val STRIPE = BillingProviderType(JsonField.of("stripe"))

                @JvmField val NETSUITE = BillingProviderType(JsonField.of("netsuite"))

                @JvmField val CUSTOM = BillingProviderType(JsonField.of("custom"))

                @JvmField
                val AZURE_MARKETPLACE = BillingProviderType(JsonField.of("azure_marketplace"))

                @JvmField
                val QUICKBOOKS_ONLINE = BillingProviderType(JsonField.of("quickbooks_online"))

                @JvmField val WORKDAY = BillingProviderType(JsonField.of("workday"))

                @JvmField val GCP_MARKETPLACE = BillingProviderType(JsonField.of("gcp_marketplace"))

                @JvmStatic fun of(value: String) = BillingProviderType(JsonField.of(value))
            }

            enum class Known {
                AWS_MARKETPLACE,
                STRIPE,
                NETSUITE,
                CUSTOM,
                AZURE_MARKETPLACE,
                QUICKBOOKS_ONLINE,
                WORKDAY,
                GCP_MARKETPLACE,
            }

            enum class Value {
                AWS_MARKETPLACE,
                STRIPE,
                NETSUITE,
                CUSTOM,
                AZURE_MARKETPLACE,
                QUICKBOOKS_ONLINE,
                WORKDAY,
                GCP_MARKETPLACE,
                _UNKNOWN,
            }

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
                    else -> Value._UNKNOWN
                }

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
                    else ->
                        throw MetronomeInvalidDataException("Unknown BillingProviderType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class ExternalStatus
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ExternalStatus && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val DRAFT = ExternalStatus(JsonField.of("DRAFT"))

                @JvmField val FINALIZED = ExternalStatus(JsonField.of("FINALIZED"))

                @JvmField val PAID = ExternalStatus(JsonField.of("PAID"))

                @JvmField val UNCOLLECTIBLE = ExternalStatus(JsonField.of("UNCOLLECTIBLE"))

                @JvmField val VOID = ExternalStatus(JsonField.of("VOID"))

                @JvmField val DELETED = ExternalStatus(JsonField.of("DELETED"))

                @JvmField val PAYMENT_FAILED = ExternalStatus(JsonField.of("PAYMENT_FAILED"))

                @JvmField
                val INVALID_REQUEST_ERROR = ExternalStatus(JsonField.of("INVALID_REQUEST_ERROR"))

                @JvmField val SKIPPED = ExternalStatus(JsonField.of("SKIPPED"))

                @JvmField val SENT = ExternalStatus(JsonField.of("SENT"))

                @JvmField val QUEUED = ExternalStatus(JsonField.of("QUEUED"))

                @JvmStatic fun of(value: String) = ExternalStatus(JsonField.of(value))
            }

            enum class Known {
                DRAFT,
                FINALIZED,
                PAID,
                UNCOLLECTIBLE,
                VOID,
                DELETED,
                PAYMENT_FAILED,
                INVALID_REQUEST_ERROR,
                SKIPPED,
                SENT,
                QUEUED,
            }

            enum class Value {
                DRAFT,
                FINALIZED,
                PAID,
                UNCOLLECTIBLE,
                VOID,
                DELETED,
                PAYMENT_FAILED,
                INVALID_REQUEST_ERROR,
                SKIPPED,
                SENT,
                QUEUED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    DRAFT -> Value.DRAFT
                    FINALIZED -> Value.FINALIZED
                    PAID -> Value.PAID
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

            fun known(): Known =
                when (this) {
                    DRAFT -> Known.DRAFT
                    FINALIZED -> Known.FINALIZED
                    PAID -> Known.PAID
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

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExternalInvoice && this.billingProviderType == other.billingProviderType && this.invoiceId == other.invoiceId && this.issuedAtTimestamp == other.issuedAtTimestamp && this.externalStatus == other.externalStatus && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(billingProviderType, invoiceId, issuedAtTimestamp, externalStatus, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ExternalInvoice{billingProviderType=$billingProviderType, invoiceId=$invoiceId, issuedAtTimestamp=$issuedAtTimestamp, externalStatus=$externalStatus, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = InvoiceAdjustment.Builder::class)
    @NoAutoDetect
    class InvoiceAdjustment
    private constructor(
        private val name: JsonField<String>,
        private val total: JsonField<Double>,
        private val creditType: JsonField<CreditTypeData>,
        private val creditGrantId: JsonField<String>,
        private val creditGrantCustomFields: JsonField<CreditGrantCustomFields>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun name(): String = name.getRequired("name")

        fun total(): Double = total.getRequired("total")

        fun creditType(): CreditTypeData = creditType.getRequired("credit_type")

        fun creditGrantId(): Optional<String> =
            Optional.ofNullable(creditGrantId.getNullable("credit_grant_id"))

        fun creditGrantCustomFields(): Optional<CreditGrantCustomFields> =
            Optional.ofNullable(creditGrantCustomFields.getNullable("credit_grant_custom_fields"))

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonProperty("total") @ExcludeMissing fun _total() = total

        @JsonProperty("credit_type") @ExcludeMissing fun _creditType() = creditType

        @JsonProperty("credit_grant_id") @ExcludeMissing fun _creditGrantId() = creditGrantId

        @JsonProperty("credit_grant_custom_fields")
        @ExcludeMissing
        fun _creditGrantCustomFields() = creditGrantCustomFields

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): InvoiceAdjustment = apply {
            if (!validated) {
                name()
                total()
                creditType().validate()
                creditGrantId()
                creditGrantCustomFields().map { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var name: JsonField<String> = JsonMissing.of()
            private var total: JsonField<Double> = JsonMissing.of()
            private var creditType: JsonField<CreditTypeData> = JsonMissing.of()
            private var creditGrantId: JsonField<String> = JsonMissing.of()
            private var creditGrantCustomFields: JsonField<CreditGrantCustomFields> =
                JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(invoiceAdjustment: InvoiceAdjustment) = apply {
                this.name = invoiceAdjustment.name
                this.total = invoiceAdjustment.total
                this.creditType = invoiceAdjustment.creditType
                this.creditGrantId = invoiceAdjustment.creditGrantId
                this.creditGrantCustomFields = invoiceAdjustment.creditGrantCustomFields
                additionalProperties(invoiceAdjustment.additionalProperties)
            }

            fun name(name: String) = name(JsonField.of(name))

            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun total(total: Double) = total(JsonField.of(total))

            @JsonProperty("total")
            @ExcludeMissing
            fun total(total: JsonField<Double>) = apply { this.total = total }

            fun creditType(creditType: CreditTypeData) = creditType(JsonField.of(creditType))

            @JsonProperty("credit_type")
            @ExcludeMissing
            fun creditType(creditType: JsonField<CreditTypeData>) = apply {
                this.creditType = creditType
            }

            fun creditGrantId(creditGrantId: String) = creditGrantId(JsonField.of(creditGrantId))

            @JsonProperty("credit_grant_id")
            @ExcludeMissing
            fun creditGrantId(creditGrantId: JsonField<String>) = apply {
                this.creditGrantId = creditGrantId
            }

            fun creditGrantCustomFields(creditGrantCustomFields: CreditGrantCustomFields) =
                creditGrantCustomFields(JsonField.of(creditGrantCustomFields))

            @JsonProperty("credit_grant_custom_fields")
            @ExcludeMissing
            fun creditGrantCustomFields(
                creditGrantCustomFields: JsonField<CreditGrantCustomFields>
            ) = apply { this.creditGrantCustomFields = creditGrantCustomFields }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): InvoiceAdjustment =
                InvoiceAdjustment(
                    name,
                    total,
                    creditType,
                    creditGrantId,
                    creditGrantCustomFields,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = CreditGrantCustomFields.Builder::class)
        @NoAutoDetect
        class CreditGrantCustomFields
        private constructor(
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CreditGrantCustomFields = apply {
                if (!validated) {
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(creditGrantCustomFields: CreditGrantCustomFields) = apply {
                    additionalProperties(creditGrantCustomFields.additionalProperties)
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CreditGrantCustomFields =
                    CreditGrantCustomFields(additionalProperties.toUnmodifiable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CreditGrantCustomFields && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "CreditGrantCustomFields{additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is InvoiceAdjustment && this.name == other.name && this.total == other.total && this.creditType == other.creditType && this.creditGrantId == other.creditGrantId && this.creditGrantCustomFields == other.creditGrantCustomFields && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(name, total, creditType, creditGrantId, creditGrantCustomFields, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "InvoiceAdjustment{name=$name, total=$total, creditType=$creditType, creditGrantId=$creditGrantId, creditGrantCustomFields=$creditGrantCustomFields, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = PlanCustomFields.Builder::class)
    @NoAutoDetect
    class PlanCustomFields
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): PlanCustomFields = apply {
            if (!validated) {
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(planCustomFields: PlanCustomFields) = apply {
                additionalProperties(planCustomFields.additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): PlanCustomFields = PlanCustomFields(additionalProperties.toUnmodifiable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PlanCustomFields && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "PlanCustomFields{additionalProperties=$additionalProperties}"
    }

    /** only present for beta contract invoices with reseller royalties */
    @JsonDeserialize(builder = ResellerRoyalty.Builder::class)
    @NoAutoDetect
    class ResellerRoyalty
    private constructor(
        private val resellerType: JsonField<ResellerType>,
        private val netsuiteResellerId: JsonField<String>,
        private val fraction: JsonField<String>,
        private val awsOptions: JsonField<AwsOptions>,
        private val gcpOptions: JsonField<GcpOptions>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun resellerType(): ResellerType = resellerType.getRequired("reseller_type")

        fun netsuiteResellerId(): String = netsuiteResellerId.getRequired("netsuite_reseller_id")

        fun fraction(): String = fraction.getRequired("fraction")

        fun awsOptions(): Optional<AwsOptions> =
            Optional.ofNullable(awsOptions.getNullable("aws_options"))

        fun gcpOptions(): Optional<GcpOptions> =
            Optional.ofNullable(gcpOptions.getNullable("gcp_options"))

        @JsonProperty("reseller_type") @ExcludeMissing fun _resellerType() = resellerType

        @JsonProperty("netsuite_reseller_id")
        @ExcludeMissing
        fun _netsuiteResellerId() = netsuiteResellerId

        @JsonProperty("fraction") @ExcludeMissing fun _fraction() = fraction

        @JsonProperty("aws_options") @ExcludeMissing fun _awsOptions() = awsOptions

        @JsonProperty("gcp_options") @ExcludeMissing fun _gcpOptions() = gcpOptions

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): ResellerRoyalty = apply {
            if (!validated) {
                resellerType()
                netsuiteResellerId()
                fraction()
                awsOptions().map { it.validate() }
                gcpOptions().map { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var resellerType: JsonField<ResellerType> = JsonMissing.of()
            private var netsuiteResellerId: JsonField<String> = JsonMissing.of()
            private var fraction: JsonField<String> = JsonMissing.of()
            private var awsOptions: JsonField<AwsOptions> = JsonMissing.of()
            private var gcpOptions: JsonField<GcpOptions> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(resellerRoyalty: ResellerRoyalty) = apply {
                this.resellerType = resellerRoyalty.resellerType
                this.netsuiteResellerId = resellerRoyalty.netsuiteResellerId
                this.fraction = resellerRoyalty.fraction
                this.awsOptions = resellerRoyalty.awsOptions
                this.gcpOptions = resellerRoyalty.gcpOptions
                additionalProperties(resellerRoyalty.additionalProperties)
            }

            fun resellerType(resellerType: ResellerType) = resellerType(JsonField.of(resellerType))

            @JsonProperty("reseller_type")
            @ExcludeMissing
            fun resellerType(resellerType: JsonField<ResellerType>) = apply {
                this.resellerType = resellerType
            }

            fun netsuiteResellerId(netsuiteResellerId: String) =
                netsuiteResellerId(JsonField.of(netsuiteResellerId))

            @JsonProperty("netsuite_reseller_id")
            @ExcludeMissing
            fun netsuiteResellerId(netsuiteResellerId: JsonField<String>) = apply {
                this.netsuiteResellerId = netsuiteResellerId
            }

            fun fraction(fraction: String) = fraction(JsonField.of(fraction))

            @JsonProperty("fraction")
            @ExcludeMissing
            fun fraction(fraction: JsonField<String>) = apply { this.fraction = fraction }

            fun awsOptions(awsOptions: AwsOptions) = awsOptions(JsonField.of(awsOptions))

            @JsonProperty("aws_options")
            @ExcludeMissing
            fun awsOptions(awsOptions: JsonField<AwsOptions>) = apply {
                this.awsOptions = awsOptions
            }

            fun gcpOptions(gcpOptions: GcpOptions) = gcpOptions(JsonField.of(gcpOptions))

            @JsonProperty("gcp_options")
            @ExcludeMissing
            fun gcpOptions(gcpOptions: JsonField<GcpOptions>) = apply {
                this.gcpOptions = gcpOptions
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): ResellerRoyalty =
                ResellerRoyalty(
                    resellerType,
                    netsuiteResellerId,
                    fraction,
                    awsOptions,
                    gcpOptions,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class ResellerType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ResellerType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val AWS = ResellerType(JsonField.of("AWS"))

                @JvmField val AWS_PRO_SERVICE = ResellerType(JsonField.of("AWS_PRO_SERVICE"))

                @JvmField val GCP = ResellerType(JsonField.of("GCP"))

                @JvmField val GCP_PRO_SERVICE = ResellerType(JsonField.of("GCP_PRO_SERVICE"))

                @JvmStatic fun of(value: String) = ResellerType(JsonField.of(value))
            }

            enum class Known {
                AWS,
                AWS_PRO_SERVICE,
                GCP,
                GCP_PRO_SERVICE,
            }

            enum class Value {
                AWS,
                AWS_PRO_SERVICE,
                GCP,
                GCP_PRO_SERVICE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    AWS -> Value.AWS
                    AWS_PRO_SERVICE -> Value.AWS_PRO_SERVICE
                    GCP -> Value.GCP
                    GCP_PRO_SERVICE -> Value.GCP_PRO_SERVICE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    AWS -> Known.AWS
                    AWS_PRO_SERVICE -> Known.AWS_PRO_SERVICE
                    GCP -> Known.GCP
                    GCP_PRO_SERVICE -> Known.GCP_PRO_SERVICE
                    else -> throw MetronomeInvalidDataException("Unknown ResellerType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        @JsonDeserialize(builder = AwsOptions.Builder::class)
        @NoAutoDetect
        class AwsOptions
        private constructor(
            private val awsAccountNumber: JsonField<String>,
            private val awsPayerReferenceId: JsonField<String>,
            private val awsOfferId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun awsAccountNumber(): Optional<String> =
                Optional.ofNullable(awsAccountNumber.getNullable("aws_account_number"))

            fun awsPayerReferenceId(): Optional<String> =
                Optional.ofNullable(awsPayerReferenceId.getNullable("aws_payer_reference_id"))

            fun awsOfferId(): Optional<String> =
                Optional.ofNullable(awsOfferId.getNullable("aws_offer_id"))

            @JsonProperty("aws_account_number")
            @ExcludeMissing
            fun _awsAccountNumber() = awsAccountNumber

            @JsonProperty("aws_payer_reference_id")
            @ExcludeMissing
            fun _awsPayerReferenceId() = awsPayerReferenceId

            @JsonProperty("aws_offer_id") @ExcludeMissing fun _awsOfferId() = awsOfferId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): AwsOptions = apply {
                if (!validated) {
                    awsAccountNumber()
                    awsPayerReferenceId()
                    awsOfferId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var awsAccountNumber: JsonField<String> = JsonMissing.of()
                private var awsPayerReferenceId: JsonField<String> = JsonMissing.of()
                private var awsOfferId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(awsOptions: AwsOptions) = apply {
                    this.awsAccountNumber = awsOptions.awsAccountNumber
                    this.awsPayerReferenceId = awsOptions.awsPayerReferenceId
                    this.awsOfferId = awsOptions.awsOfferId
                    additionalProperties(awsOptions.additionalProperties)
                }

                fun awsAccountNumber(awsAccountNumber: String) =
                    awsAccountNumber(JsonField.of(awsAccountNumber))

                @JsonProperty("aws_account_number")
                @ExcludeMissing
                fun awsAccountNumber(awsAccountNumber: JsonField<String>) = apply {
                    this.awsAccountNumber = awsAccountNumber
                }

                fun awsPayerReferenceId(awsPayerReferenceId: String) =
                    awsPayerReferenceId(JsonField.of(awsPayerReferenceId))

                @JsonProperty("aws_payer_reference_id")
                @ExcludeMissing
                fun awsPayerReferenceId(awsPayerReferenceId: JsonField<String>) = apply {
                    this.awsPayerReferenceId = awsPayerReferenceId
                }

                fun awsOfferId(awsOfferId: String) = awsOfferId(JsonField.of(awsOfferId))

                @JsonProperty("aws_offer_id")
                @ExcludeMissing
                fun awsOfferId(awsOfferId: JsonField<String>) = apply {
                    this.awsOfferId = awsOfferId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): AwsOptions =
                    AwsOptions(
                        awsAccountNumber,
                        awsPayerReferenceId,
                        awsOfferId,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AwsOptions && this.awsAccountNumber == other.awsAccountNumber && this.awsPayerReferenceId == other.awsPayerReferenceId && this.awsOfferId == other.awsOfferId && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(awsAccountNumber, awsPayerReferenceId, awsOfferId, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "AwsOptions{awsAccountNumber=$awsAccountNumber, awsPayerReferenceId=$awsPayerReferenceId, awsOfferId=$awsOfferId, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = GcpOptions.Builder::class)
        @NoAutoDetect
        class GcpOptions
        private constructor(
            private val gcpAccountId: JsonField<String>,
            private val gcpOfferId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun gcpAccountId(): Optional<String> =
                Optional.ofNullable(gcpAccountId.getNullable("gcp_account_id"))

            fun gcpOfferId(): Optional<String> =
                Optional.ofNullable(gcpOfferId.getNullable("gcp_offer_id"))

            @JsonProperty("gcp_account_id") @ExcludeMissing fun _gcpAccountId() = gcpAccountId

            @JsonProperty("gcp_offer_id") @ExcludeMissing fun _gcpOfferId() = gcpOfferId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): GcpOptions = apply {
                if (!validated) {
                    gcpAccountId()
                    gcpOfferId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var gcpAccountId: JsonField<String> = JsonMissing.of()
                private var gcpOfferId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(gcpOptions: GcpOptions) = apply {
                    this.gcpAccountId = gcpOptions.gcpAccountId
                    this.gcpOfferId = gcpOptions.gcpOfferId
                    additionalProperties(gcpOptions.additionalProperties)
                }

                fun gcpAccountId(gcpAccountId: String) = gcpAccountId(JsonField.of(gcpAccountId))

                @JsonProperty("gcp_account_id")
                @ExcludeMissing
                fun gcpAccountId(gcpAccountId: JsonField<String>) = apply {
                    this.gcpAccountId = gcpAccountId
                }

                fun gcpOfferId(gcpOfferId: String) = gcpOfferId(JsonField.of(gcpOfferId))

                @JsonProperty("gcp_offer_id")
                @ExcludeMissing
                fun gcpOfferId(gcpOfferId: JsonField<String>) = apply {
                    this.gcpOfferId = gcpOfferId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): GcpOptions =
                    GcpOptions(
                        gcpAccountId,
                        gcpOfferId,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is GcpOptions && this.gcpAccountId == other.gcpAccountId && this.gcpOfferId == other.gcpOfferId && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(gcpAccountId, gcpOfferId, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "GcpOptions{gcpAccountId=$gcpAccountId, gcpOfferId=$gcpOfferId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ResellerRoyalty && this.resellerType == other.resellerType && this.netsuiteResellerId == other.netsuiteResellerId && this.fraction == other.fraction && this.awsOptions == other.awsOptions && this.gcpOptions == other.gcpOptions && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(resellerType, netsuiteResellerId, fraction, awsOptions, gcpOptions, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ResellerRoyalty{resellerType=$resellerType, netsuiteResellerId=$netsuiteResellerId, fraction=$fraction, awsOptions=$awsOptions, gcpOptions=$gcpOptions, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Invoice && this.id == other.id && this.customerId == other.customerId && this.customerCustomFields == other.customerCustomFields && this.netsuiteSalesOrderId == other.netsuiteSalesOrderId && this.salesforceOpportunityId == other.salesforceOpportunityId && this.netPaymentTermsDays == other.netPaymentTermsDays && this.creditType == other.creditType && this.invoiceAdjustments == other.invoiceAdjustments && this.lineItems == other.lineItems && this.startTimestamp == other.startTimestamp && this.endTimestamp == other.endTimestamp && this.issuedAt == other.issuedAt && this.createdAt == other.createdAt && this.status == other.status && this.subtotal == other.subtotal && this.total == other.total && this.type == other.type && this.externalInvoice == other.externalInvoice && this.planId == other.planId && this.planName == other.planName && this.planCustomFields == other.planCustomFields && this.contractId == other.contractId && this.contractCustomFields == other.contractCustomFields && this.amendmentId == other.amendmentId && this.correctionRecord == other.correctionRecord && this.resellerRoyalty == other.resellerRoyalty && this.customFields == other.customFields && this.billableStatus == other.billableStatus && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(id, customerId, customerCustomFields, netsuiteSalesOrderId, salesforceOpportunityId, netPaymentTermsDays, creditType, invoiceAdjustments, lineItems, startTimestamp, endTimestamp, issuedAt, createdAt, status, subtotal, total, type, externalInvoice, planId, planName, planCustomFields, contractId, contractCustomFields, amendmentId, correctionRecord, resellerRoyalty, customFields, billableStatus, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "Invoice{id=$id, customerId=$customerId, customerCustomFields=$customerCustomFields, netsuiteSalesOrderId=$netsuiteSalesOrderId, salesforceOpportunityId=$salesforceOpportunityId, netPaymentTermsDays=$netPaymentTermsDays, creditType=$creditType, invoiceAdjustments=$invoiceAdjustments, lineItems=$lineItems, startTimestamp=$startTimestamp, endTimestamp=$endTimestamp, issuedAt=$issuedAt, createdAt=$createdAt, status=$status, subtotal=$subtotal, total=$total, type=$type, externalInvoice=$externalInvoice, planId=$planId, planName=$planName, planCustomFields=$planCustomFields, contractId=$contractId, contractCustomFields=$contractCustomFields, amendmentId=$amendmentId, correctionRecord=$correctionRecord, resellerRoyalty=$resellerRoyalty, customFields=$customFields, billableStatus=$billableStatus, additionalProperties=$additionalProperties}"
}
