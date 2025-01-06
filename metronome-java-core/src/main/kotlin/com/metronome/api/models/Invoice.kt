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
    private val billableStatus: JsonField<BillableStatus> = JsonMissing.of(),
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
    fun billableStatus(): Optional<BillableStatus> =
        Optional.ofNullable(billableStatus.getNullable("billable_status"))

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

    fun planCustomFields(): Optional<PlanCustomFields> =
        Optional.ofNullable(planCustomFields.getNullable("plan_custom_fields"))

    fun planId(): Optional<String> = Optional.ofNullable(planId.getNullable("plan_id"))

    fun planName(): Optional<String> = Optional.ofNullable(planName.getNullable("plan_name"))

    /** only present for beta contract invoices with reseller royalties */
    fun resellerRoyalty(): Optional<ResellerRoyalty> =
        Optional.ofNullable(resellerRoyalty.getNullable("reseller_royalty"))

    /** This field's availability is dependent on your client's configuration. */
    fun salesforceOpportunityId(): Optional<String> =
        Optional.ofNullable(salesforceOpportunityId.getNullable("salesforce_opportunity_id"))

    /** Beginning of the usage period this invoice covers (UTC) */
    fun startTimestamp(): Optional<OffsetDateTime> =
        Optional.ofNullable(startTimestamp.getNullable("start_timestamp"))

    fun subtotal(): Optional<Double> = Optional.ofNullable(subtotal.getNullable("subtotal"))

    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonProperty("credit_type") @ExcludeMissing fun _creditType() = creditType

    @JsonProperty("customer_id") @ExcludeMissing fun _customerId() = customerId

    @JsonProperty("line_items") @ExcludeMissing fun _lineItems() = lineItems

    @JsonProperty("status") @ExcludeMissing fun _status() = status

    @JsonProperty("total") @ExcludeMissing fun _total() = total

    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonProperty("amendment_id") @ExcludeMissing fun _amendmentId() = amendmentId

    /** This field's availability is dependent on your client's configuration. */
    @JsonProperty("billable_status") @ExcludeMissing fun _billableStatus() = billableStatus

    @JsonProperty("contract_custom_fields")
    @ExcludeMissing
    fun _contractCustomFields() = contractCustomFields

    @JsonProperty("contract_id") @ExcludeMissing fun _contractId() = contractId

    @JsonProperty("correction_record") @ExcludeMissing fun _correctionRecord() = correctionRecord

    /** When the invoice was created (UTC). This field is present for correction invoices only. */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonProperty("custom_fields") @ExcludeMissing fun _customFields() = customFields

    @JsonProperty("customer_custom_fields")
    @ExcludeMissing
    fun _customerCustomFields() = customerCustomFields

    /** End of the usage period this invoice covers (UTC) */
    @JsonProperty("end_timestamp") @ExcludeMissing fun _endTimestamp() = endTimestamp

    @JsonProperty("external_invoice") @ExcludeMissing fun _externalInvoice() = externalInvoice

    @JsonProperty("invoice_adjustments")
    @ExcludeMissing
    fun _invoiceAdjustments() = invoiceAdjustments

    /** When the invoice was issued (UTC) */
    @JsonProperty("issued_at") @ExcludeMissing fun _issuedAt() = issuedAt

    @JsonProperty("net_payment_terms_days")
    @ExcludeMissing
    fun _netPaymentTermsDays() = netPaymentTermsDays

    /** This field's availability is dependent on your client's configuration. */
    @JsonProperty("netsuite_sales_order_id")
    @ExcludeMissing
    fun _netsuiteSalesOrderId() = netsuiteSalesOrderId

    @JsonProperty("plan_custom_fields") @ExcludeMissing fun _planCustomFields() = planCustomFields

    @JsonProperty("plan_id") @ExcludeMissing fun _planId() = planId

    @JsonProperty("plan_name") @ExcludeMissing fun _planName() = planName

    /** only present for beta contract invoices with reseller royalties */
    @JsonProperty("reseller_royalty") @ExcludeMissing fun _resellerRoyalty() = resellerRoyalty

    /** This field's availability is dependent on your client's configuration. */
    @JsonProperty("salesforce_opportunity_id")
    @ExcludeMissing
    fun _salesforceOpportunityId() = salesforceOpportunityId

    /** Beginning of the usage period this invoice covers (UTC) */
    @JsonProperty("start_timestamp") @ExcludeMissing fun _startTimestamp() = startTimestamp

    @JsonProperty("subtotal") @ExcludeMissing fun _subtotal() = subtotal

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Invoice = apply {
        if (!validated) {
            id()
            creditType().validate()
            customerId()
            lineItems().forEach { it.validate() }
            status()
            total()
            type()
            amendmentId()
            billableStatus()
            contractCustomFields().map { it.validate() }
            contractId()
            correctionRecord().map { it.validate() }
            createdAt()
            customFields().map { it.validate() }
            customerCustomFields().map { it.validate() }
            endTimestamp()
            externalInvoice().map { it.validate() }
            invoiceAdjustments().map { it.forEach { it.validate() } }
            issuedAt()
            netPaymentTermsDays()
            netsuiteSalesOrderId()
            planCustomFields().map { it.validate() }
            planId()
            planName()
            resellerRoyalty().map { it.validate() }
            salesforceOpportunityId()
            startTimestamp()
            subtotal()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var creditType: JsonField<CreditTypeData> = JsonMissing.of()
        private var customerId: JsonField<String> = JsonMissing.of()
        private var lineItems: JsonField<List<LineItem>> = JsonMissing.of()
        private var status: JsonField<String> = JsonMissing.of()
        private var total: JsonField<Double> = JsonMissing.of()
        private var type: JsonField<String> = JsonMissing.of()
        private var amendmentId: JsonField<String> = JsonMissing.of()
        private var billableStatus: JsonField<BillableStatus> = JsonMissing.of()
        private var contractCustomFields: JsonField<ContractCustomFields> = JsonMissing.of()
        private var contractId: JsonField<String> = JsonMissing.of()
        private var correctionRecord: JsonField<CorrectionRecord> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var customFields: JsonField<CustomFields> = JsonMissing.of()
        private var customerCustomFields: JsonField<CustomerCustomFields> = JsonMissing.of()
        private var endTimestamp: JsonField<OffsetDateTime> = JsonMissing.of()
        private var externalInvoice: JsonField<ExternalInvoice> = JsonMissing.of()
        private var invoiceAdjustments: JsonField<List<InvoiceAdjustment>> = JsonMissing.of()
        private var issuedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var netPaymentTermsDays: JsonField<Double> = JsonMissing.of()
        private var netsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
        private var planCustomFields: JsonField<PlanCustomFields> = JsonMissing.of()
        private var planId: JsonField<String> = JsonMissing.of()
        private var planName: JsonField<String> = JsonMissing.of()
        private var resellerRoyalty: JsonField<ResellerRoyalty> = JsonMissing.of()
        private var salesforceOpportunityId: JsonField<String> = JsonMissing.of()
        private var startTimestamp: JsonField<OffsetDateTime> = JsonMissing.of()
        private var subtotal: JsonField<Double> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(invoice: Invoice) = apply {
            id = invoice.id
            creditType = invoice.creditType
            customerId = invoice.customerId
            lineItems = invoice.lineItems
            status = invoice.status
            total = invoice.total
            type = invoice.type
            amendmentId = invoice.amendmentId
            billableStatus = invoice.billableStatus
            contractCustomFields = invoice.contractCustomFields
            contractId = invoice.contractId
            correctionRecord = invoice.correctionRecord
            createdAt = invoice.createdAt
            customFields = invoice.customFields
            customerCustomFields = invoice.customerCustomFields
            endTimestamp = invoice.endTimestamp
            externalInvoice = invoice.externalInvoice
            invoiceAdjustments = invoice.invoiceAdjustments
            issuedAt = invoice.issuedAt
            netPaymentTermsDays = invoice.netPaymentTermsDays
            netsuiteSalesOrderId = invoice.netsuiteSalesOrderId
            planCustomFields = invoice.planCustomFields
            planId = invoice.planId
            planName = invoice.planName
            resellerRoyalty = invoice.resellerRoyalty
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

        fun lineItems(lineItems: JsonField<List<LineItem>>) = apply { this.lineItems = lineItems }

        fun status(status: String) = status(JsonField.of(status))

        fun status(status: JsonField<String>) = apply { this.status = status }

        fun total(total: Double) = total(JsonField.of(total))

        fun total(total: JsonField<Double>) = apply { this.total = total }

        fun type(type: String) = type(JsonField.of(type))

        fun type(type: JsonField<String>) = apply { this.type = type }

        fun amendmentId(amendmentId: String) = amendmentId(JsonField.of(amendmentId))

        fun amendmentId(amendmentId: JsonField<String>) = apply { this.amendmentId = amendmentId }

        /** This field's availability is dependent on your client's configuration. */
        fun billableStatus(billableStatus: BillableStatus) =
            billableStatus(JsonField.of(billableStatus))

        /** This field's availability is dependent on your client's configuration. */
        fun billableStatus(billableStatus: JsonField<BillableStatus>) = apply {
            this.billableStatus = billableStatus
        }

        fun contractCustomFields(contractCustomFields: ContractCustomFields) =
            contractCustomFields(JsonField.of(contractCustomFields))

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

        fun customerCustomFields(customerCustomFields: CustomerCustomFields) =
            customerCustomFields(JsonField.of(customerCustomFields))

        fun customerCustomFields(customerCustomFields: JsonField<CustomerCustomFields>) = apply {
            this.customerCustomFields = customerCustomFields
        }

        /** End of the usage period this invoice covers (UTC) */
        fun endTimestamp(endTimestamp: OffsetDateTime) = endTimestamp(JsonField.of(endTimestamp))

        /** End of the usage period this invoice covers (UTC) */
        fun endTimestamp(endTimestamp: JsonField<OffsetDateTime>) = apply {
            this.endTimestamp = endTimestamp
        }

        fun externalInvoice(externalInvoice: ExternalInvoice) =
            externalInvoice(JsonField.of(externalInvoice))

        fun externalInvoice(externalInvoice: JsonField<ExternalInvoice>) = apply {
            this.externalInvoice = externalInvoice
        }

        fun invoiceAdjustments(invoiceAdjustments: List<InvoiceAdjustment>) =
            invoiceAdjustments(JsonField.of(invoiceAdjustments))

        fun invoiceAdjustments(invoiceAdjustments: JsonField<List<InvoiceAdjustment>>) = apply {
            this.invoiceAdjustments = invoiceAdjustments
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

        fun planCustomFields(planCustomFields: PlanCustomFields) =
            planCustomFields(JsonField.of(planCustomFields))

        fun planCustomFields(planCustomFields: JsonField<PlanCustomFields>) = apply {
            this.planCustomFields = planCustomFields
        }

        fun planId(planId: String) = planId(JsonField.of(planId))

        fun planId(planId: JsonField<String>) = apply { this.planId = planId }

        fun planName(planName: String) = planName(JsonField.of(planName))

        fun planName(planName: JsonField<String>) = apply { this.planName = planName }

        /** only present for beta contract invoices with reseller royalties */
        fun resellerRoyalty(resellerRoyalty: ResellerRoyalty) =
            resellerRoyalty(JsonField.of(resellerRoyalty))

        /** only present for beta contract invoices with reseller royalties */
        fun resellerRoyalty(resellerRoyalty: JsonField<ResellerRoyalty>) = apply {
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
                id,
                creditType,
                customerId,
                lineItems.map { it.toImmutable() },
                status,
                total,
                type,
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
                invoiceAdjustments.map { it.toImmutable() },
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

        /** only present for beta contract invoices */
        fun appliedCommitOrCredit(): Optional<AppliedCommitOrCredit> =
            Optional.ofNullable(appliedCommitOrCredit.getNullable("applied_commit_or_credit"))

        /** only present for beta contract invoices */
        fun commitCustomFields(): Optional<CommitCustomFields> =
            Optional.ofNullable(commitCustomFields.getNullable("commit_custom_fields"))

        /** only present for beta contract invoices */
        fun commitId(): Optional<String> = Optional.ofNullable(commitId.getNullable("commit_id"))

        /**
         * only present for beta contract invoices. This field's availability is dependent on your
         * client's configuration.
         */
        fun commitNetsuiteItemId(): Optional<String> =
            Optional.ofNullable(commitNetsuiteItemId.getNullable("commit_netsuite_item_id"))

        /**
         * only present for beta contract invoices. This field's availability is dependent on your
         * client's configuration.
         */
        fun commitNetsuiteSalesOrderId(): Optional<String> =
            Optional.ofNullable(
                commitNetsuiteSalesOrderId.getNullable("commit_netsuite_sales_order_id")
            )

        /** only present for beta contract invoices */
        fun commitSegmentId(): Optional<String> =
            Optional.ofNullable(commitSegmentId.getNullable("commit_segment_id"))

        /** only present for beta contract invoices */
        fun commitType(): Optional<String> =
            Optional.ofNullable(commitType.getNullable("commit_type"))

        fun customFields(): Optional<CustomFields> =
            Optional.ofNullable(customFields.getNullable("custom_fields"))

        /** only present for beta contract invoices */
        fun endingBefore(): Optional<OffsetDateTime> =
            Optional.ofNullable(endingBefore.getNullable("ending_before"))

        fun groupKey(): Optional<String> = Optional.ofNullable(groupKey.getNullable("group_key"))

        fun groupValue(): Optional<String> =
            Optional.ofNullable(groupValue.getNullable("group_value"))

        /** only present for beta contract invoices */
        fun isProrated(): Optional<Boolean> =
            Optional.ofNullable(isProrated.getNullable("is_prorated"))

        /**
         * Only present for contract invoices and when the include_list_prices query parameter is
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

        /**
         * only present for beta contract invoices. This field's availability is dependent on your
         * client's configuration.
         */
        fun netsuiteItemId(): Optional<String> =
            Optional.ofNullable(netsuiteItemId.getNullable("netsuite_item_id"))

        /** only present for beta contract invoices */
        fun postpaidCommit(): Optional<PostpaidCommit> =
            Optional.ofNullable(postpaidCommit.getNullable("postpaid_commit"))

        /**
         * if presentation groups are used, this will contain the values used to break down the line
         * item
         */
        fun presentationGroupValues(): Optional<PresentationGroupValues> =
            Optional.ofNullable(presentationGroupValues.getNullable("presentation_group_values"))

        /** if pricing groups are used, this will contain the values used to calculate the price */
        fun pricingGroupValues(): Optional<PricingGroupValues> =
            Optional.ofNullable(pricingGroupValues.getNullable("pricing_group_values"))

        fun productCustomFields(): Optional<ProductCustomFields> =
            Optional.ofNullable(productCustomFields.getNullable("product_custom_fields"))

        fun productId(): Optional<String> = Optional.ofNullable(productId.getNullable("product_id"))

        fun productType(): Optional<String> =
            Optional.ofNullable(productType.getNullable("product_type"))

        /** only present for beta contract invoices */
        fun professionalServiceCustomFields(): Optional<ProfessionalServiceCustomFields> =
            Optional.ofNullable(
                professionalServiceCustomFields.getNullable("professional_service_custom_fields")
            )

        /** only present for beta contract invoices */
        fun professionalServiceId(): Optional<String> =
            Optional.ofNullable(professionalServiceId.getNullable("professional_service_id"))

        fun quantity(): Optional<Double> = Optional.ofNullable(quantity.getNullable("quantity"))

        fun resellerType(): Optional<ResellerType> =
            Optional.ofNullable(resellerType.getNullable("reseller_type"))

        fun scheduledChargeCustomFields(): Optional<ScheduledChargeCustomFields> =
            Optional.ofNullable(
                scheduledChargeCustomFields.getNullable("scheduled_charge_custom_fields")
            )

        /** only present for beta contract invoices */
        fun scheduledChargeId(): Optional<String> =
            Optional.ofNullable(scheduledChargeId.getNullable("scheduled_charge_id"))

        /** only present for beta contract invoices */
        fun startingAt(): Optional<OffsetDateTime> =
            Optional.ofNullable(startingAt.getNullable("starting_at"))

        fun subLineItems(): Optional<List<SubLineItem>> =
            Optional.ofNullable(subLineItems.getNullable("sub_line_items"))

        fun tier(): Optional<Tier> = Optional.ofNullable(tier.getNullable("tier"))

        /** only present for beta contract invoices */
        fun unitPrice(): Optional<Double> = Optional.ofNullable(unitPrice.getNullable("unit_price"))

        @JsonProperty("credit_type") @ExcludeMissing fun _creditType() = creditType

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonProperty("total") @ExcludeMissing fun _total() = total

        /** only present for beta contract invoices */
        @JsonProperty("applied_commit_or_credit")
        @ExcludeMissing
        fun _appliedCommitOrCredit() = appliedCommitOrCredit

        /** only present for beta contract invoices */
        @JsonProperty("commit_custom_fields")
        @ExcludeMissing
        fun _commitCustomFields() = commitCustomFields

        /** only present for beta contract invoices */
        @JsonProperty("commit_id") @ExcludeMissing fun _commitId() = commitId

        /**
         * only present for beta contract invoices. This field's availability is dependent on your
         * client's configuration.
         */
        @JsonProperty("commit_netsuite_item_id")
        @ExcludeMissing
        fun _commitNetsuiteItemId() = commitNetsuiteItemId

        /**
         * only present for beta contract invoices. This field's availability is dependent on your
         * client's configuration.
         */
        @JsonProperty("commit_netsuite_sales_order_id")
        @ExcludeMissing
        fun _commitNetsuiteSalesOrderId() = commitNetsuiteSalesOrderId

        /** only present for beta contract invoices */
        @JsonProperty("commit_segment_id") @ExcludeMissing fun _commitSegmentId() = commitSegmentId

        /** only present for beta contract invoices */
        @JsonProperty("commit_type") @ExcludeMissing fun _commitType() = commitType

        @JsonProperty("custom_fields") @ExcludeMissing fun _customFields() = customFields

        /** only present for beta contract invoices */
        @JsonProperty("ending_before") @ExcludeMissing fun _endingBefore() = endingBefore

        @JsonProperty("group_key") @ExcludeMissing fun _groupKey() = groupKey

        @JsonProperty("group_value") @ExcludeMissing fun _groupValue() = groupValue

        /** only present for beta contract invoices */
        @JsonProperty("is_prorated") @ExcludeMissing fun _isProrated() = isProrated

        /**
         * Only present for contract invoices and when the include_list_prices query parameter is
         * set to true. This will include the list rate for the charge if applicable. Only present
         * for usage and subscription line items.
         */
        @JsonProperty("list_price") @ExcludeMissing fun _listPrice() = listPrice

        @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

        /** The end date for the billing period on the invoice. */
        @JsonProperty("netsuite_invoice_billing_end")
        @ExcludeMissing
        fun _netsuiteInvoiceBillingEnd() = netsuiteInvoiceBillingEnd

        /** The start date for the billing period on the invoice. */
        @JsonProperty("netsuite_invoice_billing_start")
        @ExcludeMissing
        fun _netsuiteInvoiceBillingStart() = netsuiteInvoiceBillingStart

        /**
         * only present for beta contract invoices. This field's availability is dependent on your
         * client's configuration.
         */
        @JsonProperty("netsuite_item_id") @ExcludeMissing fun _netsuiteItemId() = netsuiteItemId

        /** only present for beta contract invoices */
        @JsonProperty("postpaid_commit") @ExcludeMissing fun _postpaidCommit() = postpaidCommit

        /**
         * if presentation groups are used, this will contain the values used to break down the line
         * item
         */
        @JsonProperty("presentation_group_values")
        @ExcludeMissing
        fun _presentationGroupValues() = presentationGroupValues

        /** if pricing groups are used, this will contain the values used to calculate the price */
        @JsonProperty("pricing_group_values")
        @ExcludeMissing
        fun _pricingGroupValues() = pricingGroupValues

        @JsonProperty("product_custom_fields")
        @ExcludeMissing
        fun _productCustomFields() = productCustomFields

        @JsonProperty("product_id") @ExcludeMissing fun _productId() = productId

        @JsonProperty("product_type") @ExcludeMissing fun _productType() = productType

        /** only present for beta contract invoices */
        @JsonProperty("professional_service_custom_fields")
        @ExcludeMissing
        fun _professionalServiceCustomFields() = professionalServiceCustomFields

        /** only present for beta contract invoices */
        @JsonProperty("professional_service_id")
        @ExcludeMissing
        fun _professionalServiceId() = professionalServiceId

        @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

        @JsonProperty("reseller_type") @ExcludeMissing fun _resellerType() = resellerType

        @JsonProperty("scheduled_charge_custom_fields")
        @ExcludeMissing
        fun _scheduledChargeCustomFields() = scheduledChargeCustomFields

        /** only present for beta contract invoices */
        @JsonProperty("scheduled_charge_id")
        @ExcludeMissing
        fun _scheduledChargeId() = scheduledChargeId

        /** only present for beta contract invoices */
        @JsonProperty("starting_at") @ExcludeMissing fun _startingAt() = startingAt

        @JsonProperty("sub_line_items") @ExcludeMissing fun _subLineItems() = subLineItems

        @JsonProperty("tier") @ExcludeMissing fun _tier() = tier

        /** only present for beta contract invoices */
        @JsonProperty("unit_price") @ExcludeMissing fun _unitPrice() = unitPrice

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): LineItem = apply {
            if (!validated) {
                creditType().validate()
                name()
                total()
                appliedCommitOrCredit().map { it.validate() }
                commitCustomFields().map { it.validate() }
                commitId()
                commitNetsuiteItemId()
                commitNetsuiteSalesOrderId()
                commitSegmentId()
                commitType()
                customFields().map { it.validate() }
                endingBefore()
                groupKey()
                groupValue()
                isProrated()
                listPrice().map { it.validate() }
                metadata()
                netsuiteInvoiceBillingEnd()
                netsuiteInvoiceBillingStart()
                netsuiteItemId()
                postpaidCommit().map { it.validate() }
                presentationGroupValues().map { it.validate() }
                pricingGroupValues().map { it.validate() }
                productCustomFields().map { it.validate() }
                productId()
                productType()
                professionalServiceCustomFields().map { it.validate() }
                professionalServiceId()
                quantity()
                resellerType()
                scheduledChargeCustomFields().map { it.validate() }
                scheduledChargeId()
                startingAt()
                subLineItems().map { it.forEach { it.validate() } }
                tier().map { it.validate() }
                unitPrice()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var creditType: JsonField<CreditTypeData> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var total: JsonField<Double> = JsonMissing.of()
            private var appliedCommitOrCredit: JsonField<AppliedCommitOrCredit> = JsonMissing.of()
            private var commitCustomFields: JsonField<CommitCustomFields> = JsonMissing.of()
            private var commitId: JsonField<String> = JsonMissing.of()
            private var commitNetsuiteItemId: JsonField<String> = JsonMissing.of()
            private var commitNetsuiteSalesOrderId: JsonField<String> = JsonMissing.of()
            private var commitSegmentId: JsonField<String> = JsonMissing.of()
            private var commitType: JsonField<String> = JsonMissing.of()
            private var customFields: JsonField<CustomFields> = JsonMissing.of()
            private var endingBefore: JsonField<OffsetDateTime> = JsonMissing.of()
            private var groupKey: JsonField<String> = JsonMissing.of()
            private var groupValue: JsonField<String> = JsonMissing.of()
            private var isProrated: JsonField<Boolean> = JsonMissing.of()
            private var listPrice: JsonField<Rate> = JsonMissing.of()
            private var metadata: JsonField<String> = JsonMissing.of()
            private var netsuiteInvoiceBillingEnd: JsonField<OffsetDateTime> = JsonMissing.of()
            private var netsuiteInvoiceBillingStart: JsonField<OffsetDateTime> = JsonMissing.of()
            private var netsuiteItemId: JsonField<String> = JsonMissing.of()
            private var postpaidCommit: JsonField<PostpaidCommit> = JsonMissing.of()
            private var presentationGroupValues: JsonField<PresentationGroupValues> =
                JsonMissing.of()
            private var pricingGroupValues: JsonField<PricingGroupValues> = JsonMissing.of()
            private var productCustomFields: JsonField<ProductCustomFields> = JsonMissing.of()
            private var productId: JsonField<String> = JsonMissing.of()
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
            private var subLineItems: JsonField<List<SubLineItem>> = JsonMissing.of()
            private var tier: JsonField<Tier> = JsonMissing.of()
            private var unitPrice: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(lineItem: LineItem) = apply {
                creditType = lineItem.creditType
                name = lineItem.name
                total = lineItem.total
                appliedCommitOrCredit = lineItem.appliedCommitOrCredit
                commitCustomFields = lineItem.commitCustomFields
                commitId = lineItem.commitId
                commitNetsuiteItemId = lineItem.commitNetsuiteItemId
                commitNetsuiteSalesOrderId = lineItem.commitNetsuiteSalesOrderId
                commitSegmentId = lineItem.commitSegmentId
                commitType = lineItem.commitType
                customFields = lineItem.customFields
                endingBefore = lineItem.endingBefore
                groupKey = lineItem.groupKey
                groupValue = lineItem.groupValue
                isProrated = lineItem.isProrated
                listPrice = lineItem.listPrice
                metadata = lineItem.metadata
                netsuiteInvoiceBillingEnd = lineItem.netsuiteInvoiceBillingEnd
                netsuiteInvoiceBillingStart = lineItem.netsuiteInvoiceBillingStart
                netsuiteItemId = lineItem.netsuiteItemId
                postpaidCommit = lineItem.postpaidCommit
                presentationGroupValues = lineItem.presentationGroupValues
                pricingGroupValues = lineItem.pricingGroupValues
                productCustomFields = lineItem.productCustomFields
                productId = lineItem.productId
                productType = lineItem.productType
                professionalServiceCustomFields = lineItem.professionalServiceCustomFields
                professionalServiceId = lineItem.professionalServiceId
                quantity = lineItem.quantity
                resellerType = lineItem.resellerType
                scheduledChargeCustomFields = lineItem.scheduledChargeCustomFields
                scheduledChargeId = lineItem.scheduledChargeId
                startingAt = lineItem.startingAt
                subLineItems = lineItem.subLineItems
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

            /** only present for beta contract invoices */
            fun appliedCommitOrCredit(appliedCommitOrCredit: AppliedCommitOrCredit) =
                appliedCommitOrCredit(JsonField.of(appliedCommitOrCredit))

            /** only present for beta contract invoices */
            fun appliedCommitOrCredit(appliedCommitOrCredit: JsonField<AppliedCommitOrCredit>) =
                apply {
                    this.appliedCommitOrCredit = appliedCommitOrCredit
                }

            /** only present for beta contract invoices */
            fun commitCustomFields(commitCustomFields: CommitCustomFields) =
                commitCustomFields(JsonField.of(commitCustomFields))

            /** only present for beta contract invoices */
            fun commitCustomFields(commitCustomFields: JsonField<CommitCustomFields>) = apply {
                this.commitCustomFields = commitCustomFields
            }

            /** only present for beta contract invoices */
            fun commitId(commitId: String) = commitId(JsonField.of(commitId))

            /** only present for beta contract invoices */
            fun commitId(commitId: JsonField<String>) = apply { this.commitId = commitId }

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
            fun commitNetsuiteItemId(commitNetsuiteItemId: JsonField<String>) = apply {
                this.commitNetsuiteItemId = commitNetsuiteItemId
            }

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
            fun commitNetsuiteSalesOrderId(commitNetsuiteSalesOrderId: JsonField<String>) = apply {
                this.commitNetsuiteSalesOrderId = commitNetsuiteSalesOrderId
            }

            /** only present for beta contract invoices */
            fun commitSegmentId(commitSegmentId: String) =
                commitSegmentId(JsonField.of(commitSegmentId))

            /** only present for beta contract invoices */
            fun commitSegmentId(commitSegmentId: JsonField<String>) = apply {
                this.commitSegmentId = commitSegmentId
            }

            /** only present for beta contract invoices */
            fun commitType(commitType: String) = commitType(JsonField.of(commitType))

            /** only present for beta contract invoices */
            fun commitType(commitType: JsonField<String>) = apply { this.commitType = commitType }

            fun customFields(customFields: CustomFields) = customFields(JsonField.of(customFields))

            fun customFields(customFields: JsonField<CustomFields>) = apply {
                this.customFields = customFields
            }

            /** only present for beta contract invoices */
            fun endingBefore(endingBefore: OffsetDateTime) =
                endingBefore(JsonField.of(endingBefore))

            /** only present for beta contract invoices */
            fun endingBefore(endingBefore: JsonField<OffsetDateTime>) = apply {
                this.endingBefore = endingBefore
            }

            fun groupKey(groupKey: String) = groupKey(JsonField.of(groupKey))

            fun groupKey(groupKey: JsonField<String>) = apply { this.groupKey = groupKey }

            fun groupValue(groupValue: String) = groupValue(JsonField.of(groupValue))

            fun groupValue(groupValue: JsonField<String>) = apply { this.groupValue = groupValue }

            /** only present for beta contract invoices */
            fun isProrated(isProrated: Boolean) = isProrated(JsonField.of(isProrated))

            /** only present for beta contract invoices */
            fun isProrated(isProrated: JsonField<Boolean>) = apply { this.isProrated = isProrated }

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
            fun netsuiteItemId(netsuiteItemId: JsonField<String>) = apply {
                this.netsuiteItemId = netsuiteItemId
            }

            /** only present for beta contract invoices */
            fun postpaidCommit(postpaidCommit: PostpaidCommit) =
                postpaidCommit(JsonField.of(postpaidCommit))

            /** only present for beta contract invoices */
            fun postpaidCommit(postpaidCommit: JsonField<PostpaidCommit>) = apply {
                this.postpaidCommit = postpaidCommit
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
            fun presentationGroupValues(
                presentationGroupValues: JsonField<PresentationGroupValues>
            ) = apply { this.presentationGroupValues = presentationGroupValues }

            /**
             * if pricing groups are used, this will contain the values used to calculate the price
             */
            fun pricingGroupValues(pricingGroupValues: PricingGroupValues) =
                pricingGroupValues(JsonField.of(pricingGroupValues))

            /**
             * if pricing groups are used, this will contain the values used to calculate the price
             */
            fun pricingGroupValues(pricingGroupValues: JsonField<PricingGroupValues>) = apply {
                this.pricingGroupValues = pricingGroupValues
            }

            fun productCustomFields(productCustomFields: ProductCustomFields) =
                productCustomFields(JsonField.of(productCustomFields))

            fun productCustomFields(productCustomFields: JsonField<ProductCustomFields>) = apply {
                this.productCustomFields = productCustomFields
            }

            fun productId(productId: String) = productId(JsonField.of(productId))

            fun productId(productId: JsonField<String>) = apply { this.productId = productId }

            fun productType(productType: String) = productType(JsonField.of(productType))

            fun productType(productType: JsonField<String>) = apply {
                this.productType = productType
            }

            /** only present for beta contract invoices */
            fun professionalServiceCustomFields(
                professionalServiceCustomFields: ProfessionalServiceCustomFields
            ) = professionalServiceCustomFields(JsonField.of(professionalServiceCustomFields))

            /** only present for beta contract invoices */
            fun professionalServiceCustomFields(
                professionalServiceCustomFields: JsonField<ProfessionalServiceCustomFields>
            ) = apply { this.professionalServiceCustomFields = professionalServiceCustomFields }

            /** only present for beta contract invoices */
            fun professionalServiceId(professionalServiceId: String) =
                professionalServiceId(JsonField.of(professionalServiceId))

            /** only present for beta contract invoices */
            fun professionalServiceId(professionalServiceId: JsonField<String>) = apply {
                this.professionalServiceId = professionalServiceId
            }

            fun quantity(quantity: Double) = quantity(JsonField.of(quantity))

            fun quantity(quantity: JsonField<Double>) = apply { this.quantity = quantity }

            fun resellerType(resellerType: ResellerType) = resellerType(JsonField.of(resellerType))

            fun resellerType(resellerType: JsonField<ResellerType>) = apply {
                this.resellerType = resellerType
            }

            fun scheduledChargeCustomFields(
                scheduledChargeCustomFields: ScheduledChargeCustomFields
            ) = scheduledChargeCustomFields(JsonField.of(scheduledChargeCustomFields))

            fun scheduledChargeCustomFields(
                scheduledChargeCustomFields: JsonField<ScheduledChargeCustomFields>
            ) = apply { this.scheduledChargeCustomFields = scheduledChargeCustomFields }

            /** only present for beta contract invoices */
            fun scheduledChargeId(scheduledChargeId: String) =
                scheduledChargeId(JsonField.of(scheduledChargeId))

            /** only present for beta contract invoices */
            fun scheduledChargeId(scheduledChargeId: JsonField<String>) = apply {
                this.scheduledChargeId = scheduledChargeId
            }

            /** only present for beta contract invoices */
            fun startingAt(startingAt: OffsetDateTime) = startingAt(JsonField.of(startingAt))

            /** only present for beta contract invoices */
            fun startingAt(startingAt: JsonField<OffsetDateTime>) = apply {
                this.startingAt = startingAt
            }

            fun subLineItems(subLineItems: List<SubLineItem>) =
                subLineItems(JsonField.of(subLineItems))

            fun subLineItems(subLineItems: JsonField<List<SubLineItem>>) = apply {
                this.subLineItems = subLineItems
            }

            fun tier(tier: Tier) = tier(JsonField.of(tier))

            fun tier(tier: JsonField<Tier>) = apply { this.tier = tier }

            /** only present for beta contract invoices */
            fun unitPrice(unitPrice: Double) = unitPrice(JsonField.of(unitPrice))

            /** only present for beta contract invoices */
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
                    creditType,
                    name,
                    total,
                    appliedCommitOrCredit,
                    commitCustomFields,
                    commitId,
                    commitNetsuiteItemId,
                    commitNetsuiteSalesOrderId,
                    commitSegmentId,
                    commitType,
                    customFields,
                    endingBefore,
                    groupKey,
                    groupValue,
                    isProrated,
                    listPrice,
                    metadata,
                    netsuiteInvoiceBillingEnd,
                    netsuiteInvoiceBillingStart,
                    netsuiteItemId,
                    postpaidCommit,
                    presentationGroupValues,
                    pricingGroupValues,
                    productCustomFields,
                    productId,
                    productType,
                    professionalServiceCustomFields,
                    professionalServiceId,
                    quantity,
                    resellerType,
                    scheduledChargeCustomFields,
                    scheduledChargeId,
                    startingAt,
                    subLineItems.map { it.toImmutable() },
                    tier,
                    unitPrice,
                    additionalProperties.toImmutable(),
                )
        }

        /** only present for beta contract invoices */
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

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): AppliedCommitOrCredit = apply {
                if (!validated) {
                    id()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
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
                        id,
                        type,
                        additionalProperties.toImmutable(),
                    )
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val PREPAID = of("PREPAID")

                    @JvmField val POSTPAID = of("POSTPAID")

                    @JvmField val CREDIT = of("CREDIT")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    PREPAID,
                    POSTPAID,
                    CREDIT,
                }

                enum class Value {
                    PREPAID,
                    POSTPAID,
                    CREDIT,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        PREPAID -> Value.PREPAID
                        POSTPAID -> Value.POSTPAID
                        CREDIT -> Value.CREDIT
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        PREPAID -> Known.PREPAID
                        POSTPAID -> Known.POSTPAID
                        CREDIT -> Known.CREDIT
                        else -> throw MetronomeInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

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

        /** only present for beta contract invoices */
        @NoAutoDetect
        class CommitCustomFields
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

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

        @NoAutoDetect
        class CustomFields
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

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

        /** only present for beta contract invoices */
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

            @JsonProperty("id") @ExcludeMissing fun _id() = id

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

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

                fun build(): PostpaidCommit = PostpaidCommit(id, additionalProperties.toImmutable())
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
         * if presentation groups are used, this will contain the values used to break down the line
         * item
         */
        @NoAutoDetect
        class PresentationGroupValues
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

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

        /** if pricing groups are used, this will contain the values used to calculate the price */
        @NoAutoDetect
        class PricingGroupValues
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

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

        @NoAutoDetect
        class ProductCustomFields
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

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

        /** only present for beta contract invoices */
        @NoAutoDetect
        class ProfessionalServiceCustomFields
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

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

        class ResellerType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val AWS = of("AWS")

                @JvmField val AWS_PRO_SERVICE = of("AWS_PRO_SERVICE")

                @JvmField val GCP = of("GCP")

                @JvmField val GCP_PRO_SERVICE = of("GCP_PRO_SERVICE")

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
        class ScheduledChargeCustomFields
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

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

            @JsonProperty("custom_fields") @ExcludeMissing fun _customFields() = customFields

            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

            @JsonProperty("subtotal") @ExcludeMissing fun _subtotal() = subtotal

            @JsonProperty("charge_id") @ExcludeMissing fun _chargeId() = chargeId

            @JsonProperty("credit_grant_id") @ExcludeMissing fun _creditGrantId() = creditGrantId

            /** The end date for the charge (for seats charges only). */
            @JsonProperty("end_date") @ExcludeMissing fun _endDate() = endDate

            /**
             * the unit price for this charge, present only if the charge is not tiered and the
             * quantity is nonzero
             */
            @JsonProperty("price") @ExcludeMissing fun _price() = price

            /** The start date for the charge (for seats charges only). */
            @JsonProperty("start_date") @ExcludeMissing fun _startDate() = startDate

            /** when the current tier started and ends (for tiered charges only) */
            @JsonProperty("tier_period") @ExcludeMissing fun _tierPeriod() = tierPeriod

            @JsonProperty("tiers") @ExcludeMissing fun _tiers() = tiers

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): SubLineItem = apply {
                if (!validated) {
                    customFields().validate()
                    name()
                    quantity()
                    subtotal()
                    chargeId()
                    creditGrantId()
                    endDate()
                    price()
                    startDate()
                    tierPeriod().map { it.validate() }
                    tiers().map { it.forEach { it.validate() } }
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var customFields: JsonField<CustomFields> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var quantity: JsonField<Double> = JsonMissing.of()
                private var subtotal: JsonField<Double> = JsonMissing.of()
                private var chargeId: JsonField<String> = JsonMissing.of()
                private var creditGrantId: JsonField<String> = JsonMissing.of()
                private var endDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var price: JsonField<Double> = JsonMissing.of()
                private var startDate: JsonField<OffsetDateTime> = JsonMissing.of()
                private var tierPeriod: JsonField<TierPeriod> = JsonMissing.of()
                private var tiers: JsonField<List<Tier>> = JsonMissing.of()
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
                    tiers = subLineItem.tiers
                    additionalProperties = subLineItem.additionalProperties.toMutableMap()
                }

                fun customFields(customFields: CustomFields) =
                    customFields(JsonField.of(customFields))

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

                fun tiers(tiers: JsonField<List<Tier>>) = apply { this.tiers = tiers }

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
                        tiers.map { it.toImmutable() },
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class CustomFields
            @JsonCreator
            private constructor(
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

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

                @JsonProperty("starting_at") @ExcludeMissing fun _startingAt() = startingAt

                @JsonProperty("ending_before") @ExcludeMissing fun _endingBefore() = endingBefore

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

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
                            startingAt,
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

                @JsonProperty("price") @ExcludeMissing fun _price() = price

                @JsonProperty("quantity") @ExcludeMissing fun _quantity() = quantity

                /** at what metric amount this tier begins */
                @JsonProperty("starting_at") @ExcludeMissing fun _startingAt() = startingAt

                @JsonProperty("subtotal") @ExcludeMissing fun _subtotal() = subtotal

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Tier = apply {
                    if (!validated) {
                        price()
                        quantity()
                        startingAt()
                        subtotal()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var price: JsonField<Double> = JsonMissing.of()
                    private var quantity: JsonField<Double> = JsonMissing.of()
                    private var startingAt: JsonField<Double> = JsonMissing.of()
                    private var subtotal: JsonField<Double> = JsonMissing.of()
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
                            price,
                            quantity,
                            startingAt,
                            subtotal,
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

            @JsonProperty("level") @ExcludeMissing fun _level() = level

            @JsonProperty("starting_at") @ExcludeMissing fun _startingAt() = startingAt

            @JsonProperty("size") @ExcludeMissing fun _size() = size

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Tier = apply {
                if (!validated) {
                    level()
                    startingAt()
                    size()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var level: JsonField<Double> = JsonMissing.of()
                private var startingAt: JsonField<String> = JsonMissing.of()
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

                fun size(size: String) = size(JsonField.of(size))

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
                        level,
                        startingAt,
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

            return /* spotless:off */ other is LineItem && creditType == other.creditType && name == other.name && total == other.total && appliedCommitOrCredit == other.appliedCommitOrCredit && commitCustomFields == other.commitCustomFields && commitId == other.commitId && commitNetsuiteItemId == other.commitNetsuiteItemId && commitNetsuiteSalesOrderId == other.commitNetsuiteSalesOrderId && commitSegmentId == other.commitSegmentId && commitType == other.commitType && customFields == other.customFields && endingBefore == other.endingBefore && groupKey == other.groupKey && groupValue == other.groupValue && isProrated == other.isProrated && listPrice == other.listPrice && metadata == other.metadata && netsuiteInvoiceBillingEnd == other.netsuiteInvoiceBillingEnd && netsuiteInvoiceBillingStart == other.netsuiteInvoiceBillingStart && netsuiteItemId == other.netsuiteItemId && postpaidCommit == other.postpaidCommit && presentationGroupValues == other.presentationGroupValues && pricingGroupValues == other.pricingGroupValues && productCustomFields == other.productCustomFields && productId == other.productId && productType == other.productType && professionalServiceCustomFields == other.professionalServiceCustomFields && professionalServiceId == other.professionalServiceId && quantity == other.quantity && resellerType == other.resellerType && scheduledChargeCustomFields == other.scheduledChargeCustomFields && scheduledChargeId == other.scheduledChargeId && startingAt == other.startingAt && subLineItems == other.subLineItems && tier == other.tier && unitPrice == other.unitPrice && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(creditType, name, total, appliedCommitOrCredit, commitCustomFields, commitId, commitNetsuiteItemId, commitNetsuiteSalesOrderId, commitSegmentId, commitType, customFields, endingBefore, groupKey, groupValue, isProrated, listPrice, metadata, netsuiteInvoiceBillingEnd, netsuiteInvoiceBillingStart, netsuiteItemId, postpaidCommit, presentationGroupValues, pricingGroupValues, productCustomFields, productId, productType, professionalServiceCustomFields, professionalServiceId, quantity, resellerType, scheduledChargeCustomFields, scheduledChargeId, startingAt, subLineItems, tier, unitPrice, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "LineItem{creditType=$creditType, name=$name, total=$total, appliedCommitOrCredit=$appliedCommitOrCredit, commitCustomFields=$commitCustomFields, commitId=$commitId, commitNetsuiteItemId=$commitNetsuiteItemId, commitNetsuiteSalesOrderId=$commitNetsuiteSalesOrderId, commitSegmentId=$commitSegmentId, commitType=$commitType, customFields=$customFields, endingBefore=$endingBefore, groupKey=$groupKey, groupValue=$groupValue, isProrated=$isProrated, listPrice=$listPrice, metadata=$metadata, netsuiteInvoiceBillingEnd=$netsuiteInvoiceBillingEnd, netsuiteInvoiceBillingStart=$netsuiteInvoiceBillingStart, netsuiteItemId=$netsuiteItemId, postpaidCommit=$postpaidCommit, presentationGroupValues=$presentationGroupValues, pricingGroupValues=$pricingGroupValues, productCustomFields=$productCustomFields, productId=$productId, productType=$productType, professionalServiceCustomFields=$professionalServiceCustomFields, professionalServiceId=$professionalServiceId, quantity=$quantity, resellerType=$resellerType, scheduledChargeCustomFields=$scheduledChargeCustomFields, scheduledChargeId=$scheduledChargeId, startingAt=$startingAt, subLineItems=$subLineItems, tier=$tier, unitPrice=$unitPrice, additionalProperties=$additionalProperties}"
    }

    class BillableStatus
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val BILLABLE = of("billable")

            @JvmField val UNBILLABLE = of("unbillable")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is BillableStatus && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class ContractCustomFields
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

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
        fun _correctedInvoiceId() = correctedInvoiceId

        @JsonProperty("memo") @ExcludeMissing fun _memo() = memo

        @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

        @JsonProperty("corrected_external_invoice")
        @ExcludeMissing
        fun _correctedExternalInvoice() = correctedExternalInvoice

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CorrectionRecord = apply {
            if (!validated) {
                correctedInvoiceId()
                memo()
                reason()
                correctedExternalInvoice().map { it.validate() }
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var correctedInvoiceId: JsonField<String> = JsonMissing.of()
            private var memo: JsonField<String> = JsonMissing.of()
            private var reason: JsonField<String> = JsonMissing.of()
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
                    correctedInvoiceId,
                    memo,
                    reason,
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
            @JsonProperty("external_status")
            @ExcludeMissing
            private val externalStatus: JsonField<ExternalStatus> = JsonMissing.of(),
            @JsonProperty("invoice_id")
            @ExcludeMissing
            private val invoiceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("issued_at_timestamp")
            @ExcludeMissing
            private val issuedAtTimestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun billingProviderType(): BillingProviderType =
                billingProviderType.getRequired("billing_provider_type")

            fun externalStatus(): Optional<ExternalStatus> =
                Optional.ofNullable(externalStatus.getNullable("external_status"))

            fun invoiceId(): Optional<String> =
                Optional.ofNullable(invoiceId.getNullable("invoice_id"))

            fun issuedAtTimestamp(): Optional<OffsetDateTime> =
                Optional.ofNullable(issuedAtTimestamp.getNullable("issued_at_timestamp"))

            @JsonProperty("billing_provider_type")
            @ExcludeMissing
            fun _billingProviderType() = billingProviderType

            @JsonProperty("external_status") @ExcludeMissing fun _externalStatus() = externalStatus

            @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId() = invoiceId

            @JsonProperty("issued_at_timestamp")
            @ExcludeMissing
            fun _issuedAtTimestamp() = issuedAtTimestamp

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CorrectedExternalInvoice = apply {
                if (!validated) {
                    billingProviderType()
                    externalStatus()
                    invoiceId()
                    issuedAtTimestamp()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var billingProviderType: JsonField<BillingProviderType> = JsonMissing.of()
                private var externalStatus: JsonField<ExternalStatus> = JsonMissing.of()
                private var invoiceId: JsonField<String> = JsonMissing.of()
                private var issuedAtTimestamp: JsonField<OffsetDateTime> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(correctedExternalInvoice: CorrectedExternalInvoice) = apply {
                    billingProviderType = correctedExternalInvoice.billingProviderType
                    externalStatus = correctedExternalInvoice.externalStatus
                    invoiceId = correctedExternalInvoice.invoiceId
                    issuedAtTimestamp = correctedExternalInvoice.issuedAtTimestamp
                    additionalProperties =
                        correctedExternalInvoice.additionalProperties.toMutableMap()
                }

                fun billingProviderType(billingProviderType: BillingProviderType) =
                    billingProviderType(JsonField.of(billingProviderType))

                fun billingProviderType(billingProviderType: JsonField<BillingProviderType>) =
                    apply {
                        this.billingProviderType = billingProviderType
                    }

                fun externalStatus(externalStatus: ExternalStatus) =
                    externalStatus(JsonField.of(externalStatus))

                fun externalStatus(externalStatus: JsonField<ExternalStatus>) = apply {
                    this.externalStatus = externalStatus
                }

                fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

                fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

                fun issuedAtTimestamp(issuedAtTimestamp: OffsetDateTime) =
                    issuedAtTimestamp(JsonField.of(issuedAtTimestamp))

                fun issuedAtTimestamp(issuedAtTimestamp: JsonField<OffsetDateTime>) = apply {
                    this.issuedAtTimestamp = issuedAtTimestamp
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

                fun build(): CorrectedExternalInvoice =
                    CorrectedExternalInvoice(
                        billingProviderType,
                        externalStatus,
                        invoiceId,
                        issuedAtTimestamp,
                        additionalProperties.toImmutable(),
                    )
            }

            class BillingProviderType
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val DRAFT = of("DRAFT")

                    @JvmField val FINALIZED = of("FINALIZED")

                    @JvmField val PAID = of("PAID")

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ExternalStatus && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CorrectedExternalInvoice && billingProviderType == other.billingProviderType && externalStatus == other.externalStatus && invoiceId == other.invoiceId && issuedAtTimestamp == other.issuedAtTimestamp && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(billingProviderType, externalStatus, invoiceId, issuedAtTimestamp, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CorrectedExternalInvoice{billingProviderType=$billingProviderType, externalStatus=$externalStatus, invoiceId=$invoiceId, issuedAtTimestamp=$issuedAtTimestamp, additionalProperties=$additionalProperties}"
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
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

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

    @NoAutoDetect
    class CustomerCustomFields
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

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
        @JsonProperty("external_status")
        @ExcludeMissing
        private val externalStatus: JsonField<ExternalStatus> = JsonMissing.of(),
        @JsonProperty("invoice_id")
        @ExcludeMissing
        private val invoiceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("issued_at_timestamp")
        @ExcludeMissing
        private val issuedAtTimestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun billingProviderType(): BillingProviderType =
            billingProviderType.getRequired("billing_provider_type")

        fun externalStatus(): Optional<ExternalStatus> =
            Optional.ofNullable(externalStatus.getNullable("external_status"))

        fun invoiceId(): Optional<String> = Optional.ofNullable(invoiceId.getNullable("invoice_id"))

        fun issuedAtTimestamp(): Optional<OffsetDateTime> =
            Optional.ofNullable(issuedAtTimestamp.getNullable("issued_at_timestamp"))

        @JsonProperty("billing_provider_type")
        @ExcludeMissing
        fun _billingProviderType() = billingProviderType

        @JsonProperty("external_status") @ExcludeMissing fun _externalStatus() = externalStatus

        @JsonProperty("invoice_id") @ExcludeMissing fun _invoiceId() = invoiceId

        @JsonProperty("issued_at_timestamp")
        @ExcludeMissing
        fun _issuedAtTimestamp() = issuedAtTimestamp

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ExternalInvoice = apply {
            if (!validated) {
                billingProviderType()
                externalStatus()
                invoiceId()
                issuedAtTimestamp()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var billingProviderType: JsonField<BillingProviderType> = JsonMissing.of()
            private var externalStatus: JsonField<ExternalStatus> = JsonMissing.of()
            private var invoiceId: JsonField<String> = JsonMissing.of()
            private var issuedAtTimestamp: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(externalInvoice: ExternalInvoice) = apply {
                billingProviderType = externalInvoice.billingProviderType
                externalStatus = externalInvoice.externalStatus
                invoiceId = externalInvoice.invoiceId
                issuedAtTimestamp = externalInvoice.issuedAtTimestamp
                additionalProperties = externalInvoice.additionalProperties.toMutableMap()
            }

            fun billingProviderType(billingProviderType: BillingProviderType) =
                billingProviderType(JsonField.of(billingProviderType))

            fun billingProviderType(billingProviderType: JsonField<BillingProviderType>) = apply {
                this.billingProviderType = billingProviderType
            }

            fun externalStatus(externalStatus: ExternalStatus) =
                externalStatus(JsonField.of(externalStatus))

            fun externalStatus(externalStatus: JsonField<ExternalStatus>) = apply {
                this.externalStatus = externalStatus
            }

            fun invoiceId(invoiceId: String) = invoiceId(JsonField.of(invoiceId))

            fun invoiceId(invoiceId: JsonField<String>) = apply { this.invoiceId = invoiceId }

            fun issuedAtTimestamp(issuedAtTimestamp: OffsetDateTime) =
                issuedAtTimestamp(JsonField.of(issuedAtTimestamp))

            fun issuedAtTimestamp(issuedAtTimestamp: JsonField<OffsetDateTime>) = apply {
                this.issuedAtTimestamp = issuedAtTimestamp
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

            fun build(): ExternalInvoice =
                ExternalInvoice(
                    billingProviderType,
                    externalStatus,
                    invoiceId,
                    issuedAtTimestamp,
                    additionalProperties.toImmutable(),
                )
        }

        class BillingProviderType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val DRAFT = of("DRAFT")

                @JvmField val FINALIZED = of("FINALIZED")

                @JvmField val PAID = of("PAID")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ExternalStatus && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExternalInvoice && billingProviderType == other.billingProviderType && externalStatus == other.externalStatus && invoiceId == other.invoiceId && issuedAtTimestamp == other.issuedAtTimestamp && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(billingProviderType, externalStatus, invoiceId, issuedAtTimestamp, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ExternalInvoice{billingProviderType=$billingProviderType, externalStatus=$externalStatus, invoiceId=$invoiceId, issuedAtTimestamp=$issuedAtTimestamp, additionalProperties=$additionalProperties}"
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

        fun creditGrantCustomFields(): Optional<CreditGrantCustomFields> =
            Optional.ofNullable(creditGrantCustomFields.getNullable("credit_grant_custom_fields"))

        fun creditGrantId(): Optional<String> =
            Optional.ofNullable(creditGrantId.getNullable("credit_grant_id"))

        @JsonProperty("credit_type") @ExcludeMissing fun _creditType() = creditType

        @JsonProperty("name") @ExcludeMissing fun _name() = name

        @JsonProperty("total") @ExcludeMissing fun _total() = total

        @JsonProperty("credit_grant_custom_fields")
        @ExcludeMissing
        fun _creditGrantCustomFields() = creditGrantCustomFields

        @JsonProperty("credit_grant_id") @ExcludeMissing fun _creditGrantId() = creditGrantId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): InvoiceAdjustment = apply {
            if (!validated) {
                creditType().validate()
                name()
                total()
                creditGrantCustomFields().map { it.validate() }
                creditGrantId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var creditType: JsonField<CreditTypeData> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var total: JsonField<Double> = JsonMissing.of()
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

            fun creditGrantCustomFields(creditGrantCustomFields: CreditGrantCustomFields) =
                creditGrantCustomFields(JsonField.of(creditGrantCustomFields))

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
                    creditType,
                    name,
                    total,
                    creditGrantCustomFields,
                    creditGrantId,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class CreditGrantCustomFields
        @JsonCreator
        private constructor(
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

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

    @NoAutoDetect
    class PlanCustomFields
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

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

    /** only present for beta contract invoices with reseller royalties */
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

        @JsonProperty("fraction") @ExcludeMissing fun _fraction() = fraction

        @JsonProperty("netsuite_reseller_id")
        @ExcludeMissing
        fun _netsuiteResellerId() = netsuiteResellerId

        @JsonProperty("reseller_type") @ExcludeMissing fun _resellerType() = resellerType

        @JsonProperty("aws_options") @ExcludeMissing fun _awsOptions() = awsOptions

        @JsonProperty("gcp_options") @ExcludeMissing fun _gcpOptions() = gcpOptions

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): ResellerRoyalty = apply {
            if (!validated) {
                fraction()
                netsuiteResellerId()
                resellerType()
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

            private var fraction: JsonField<String> = JsonMissing.of()
            private var netsuiteResellerId: JsonField<String> = JsonMissing.of()
            private var resellerType: JsonField<ResellerType> = JsonMissing.of()
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
                    fraction,
                    netsuiteResellerId,
                    resellerType,
                    awsOptions,
                    gcpOptions,
                    additionalProperties.toImmutable(),
                )
        }

        class ResellerType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val AWS = of("AWS")

                @JvmField val AWS_PRO_SERVICE = of("AWS_PRO_SERVICE")

                @JvmField val GCP = of("GCP")

                @JvmField val GCP_PRO_SERVICE = of("GCP_PRO_SERVICE")

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
            fun _awsAccountNumber() = awsAccountNumber

            @JsonProperty("aws_offer_id") @ExcludeMissing fun _awsOfferId() = awsOfferId

            @JsonProperty("aws_payer_reference_id")
            @ExcludeMissing
            fun _awsPayerReferenceId() = awsPayerReferenceId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): AwsOptions = apply {
                if (!validated) {
                    awsAccountNumber()
                    awsOfferId()
                    awsPayerReferenceId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

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

            @JsonProperty("gcp_account_id") @ExcludeMissing fun _gcpAccountId() = gcpAccountId

            @JsonProperty("gcp_offer_id") @ExcludeMissing fun _gcpOfferId() = gcpOfferId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

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
                    GcpOptions(
                        gcpAccountId,
                        gcpOfferId,
                        additionalProperties.toImmutable(),
                    )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Invoice && id == other.id && creditType == other.creditType && customerId == other.customerId && lineItems == other.lineItems && status == other.status && total == other.total && type == other.type && amendmentId == other.amendmentId && billableStatus == other.billableStatus && contractCustomFields == other.contractCustomFields && contractId == other.contractId && correctionRecord == other.correctionRecord && createdAt == other.createdAt && customFields == other.customFields && customerCustomFields == other.customerCustomFields && endTimestamp == other.endTimestamp && externalInvoice == other.externalInvoice && invoiceAdjustments == other.invoiceAdjustments && issuedAt == other.issuedAt && netPaymentTermsDays == other.netPaymentTermsDays && netsuiteSalesOrderId == other.netsuiteSalesOrderId && planCustomFields == other.planCustomFields && planId == other.planId && planName == other.planName && resellerRoyalty == other.resellerRoyalty && salesforceOpportunityId == other.salesforceOpportunityId && startTimestamp == other.startTimestamp && subtotal == other.subtotal && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, creditType, customerId, lineItems, status, total, type, amendmentId, billableStatus, contractCustomFields, contractId, correctionRecord, createdAt, customFields, customerCustomFields, endTimestamp, externalInvoice, invoiceAdjustments, issuedAt, netPaymentTermsDays, netsuiteSalesOrderId, planCustomFields, planId, planName, resellerRoyalty, salesforceOpportunityId, startTimestamp, subtotal, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Invoice{id=$id, creditType=$creditType, customerId=$customerId, lineItems=$lineItems, status=$status, total=$total, type=$type, amendmentId=$amendmentId, billableStatus=$billableStatus, contractCustomFields=$contractCustomFields, contractId=$contractId, correctionRecord=$correctionRecord, createdAt=$createdAt, customFields=$customFields, customerCustomFields=$customerCustomFields, endTimestamp=$endTimestamp, externalInvoice=$externalInvoice, invoiceAdjustments=$invoiceAdjustments, issuedAt=$issuedAt, netPaymentTermsDays=$netPaymentTermsDays, netsuiteSalesOrderId=$netsuiteSalesOrderId, planCustomFields=$planCustomFields, planId=$planId, planName=$planName, resellerRoyalty=$resellerRoyalty, salesforceOpportunityId=$salesforceOpportunityId, startTimestamp=$startTimestamp, subtotal=$subtotal, additionalProperties=$additionalProperties}"
}
