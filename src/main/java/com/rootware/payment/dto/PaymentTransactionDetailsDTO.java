package com.rootware.payment.dto;

import java.math.BigDecimal;
import java.sql.Date;

/**
 * Data Transfer Object for payment transaction details.
 * This class encapsulates all the information related to a payment transaction
 * and is used for transferring payment data between different layers of the application.
 */
public class PaymentTransactionDetailsDTO {

    private Long epayTransId;
    private Long epayInstanceId;
    private String accountNumber;
    private Long serviceTypeId;
    private BigDecimal transAmount;
    private BigDecimal transValue;
    private String invoiceNo;
    private Date processDate;
    private String serviceNumber;
    private String idType;
    private String recipientId;
    private String recipientIdType;
    private String notificationNumber;
    private String processStatus;
    private String serviceCategory;
    private String reasonCode;
    private String nativeReasonCode;
    private String systemPostingStatus;
    private Date pmtReceivedDate;
    private String comments;
    private String backendSystem;
    private String postingStatusCode;
    private String internalBillCategory;
    private Boolean vatApplied;
    private BigDecimal postedAmount;
    private BigDecimal appliedAmount;
    private Long productId;

    /**
     * Gets the electronic payment transaction ID.
     *
     * @return The electronic payment transaction ID
     */
    public Long getEpayTransId() {
        return epayTransId;
    }

    /**
     * Sets the electronic payment transaction ID.
     *
     * @param epayTransId The electronic payment transaction ID to set
     */
    public void setEpayTransId(Long epayTransId) {
        this.epayTransId = epayTransId;
    }

    /**
     * Gets the electronic payment instance ID.
     *
     * @return The electronic payment instance ID
     */
    public Long getEpayInstanceId() {
        return epayInstanceId;
    }

    /**
     * Sets the electronic payment instance ID.
     *
     * @param epayInstanceId The electronic payment instance ID to set
     */
    public void setEpayInstanceId(Long epayInstanceId) {
        this.epayInstanceId = epayInstanceId;
    }

    /**
     * Gets the account number.
     *
     * @return The account number
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the account number.
     *
     * @param accountNumber The account number to set
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Gets the service type ID.
     *
     * @return The service type ID
     */
    public Long getServiceTypeId() {
        return serviceTypeId;
    }

    /**
     * Sets the service type ID.
     *
     * @param serviceTypeId The service type ID to set
     */
    public void setServiceTypeId(Long serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    /**
     * Gets the transaction amount.
     *
     * @return The transaction amount
     */
    public BigDecimal getTransAmount() {
        return transAmount;
    }

    /**
     * Sets the transaction amount.
     *
     * @param transAmount The transaction amount to set
     */
    public void setTransAmount(BigDecimal transAmount) {
        this.transAmount = transAmount;
    }

    /**
     * Gets the transaction value.
     *
     * @return The transaction value
     */
    public BigDecimal getTransValue() {
        return transValue;
    }

    /**
     * Sets the transaction value.
     *
     * @param transValue The transaction value to set
     */
    public void setTransValue(BigDecimal transValue) {
        this.transValue = transValue;
    }

    /**
     * Gets the invoice number.
     *
     * @return The invoice number
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * Sets the invoice number.
     *
     * @param invoiceNo The invoice number to set
     */
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    /**
     * Gets the process date.
     *
     * @return The process date
     */
    public Date getProcessDate() {
        return processDate;
    }

    /**
     * Sets the process date.
     *
     * @param processDate The process date to set
     */
    public void setProcessDate(Date processDate) {
        this.processDate = processDate;
    }

    /**
     * Gets the service number.
     *
     * @return The service number
     */
    public String getServiceNumber() {
        return serviceNumber;
    }

    /**
     * Sets the service number.
     *
     * @param serviceNumber The service number to set
     */
    public void setServiceNumber(String serviceNumber) {
        this.serviceNumber = serviceNumber;
    }

    /**
     * Gets the ID type.
     *
     * @return The ID type
     */
    public String getIdType() {
        return idType;
    }

    /**
     * Sets the ID type.
     *
     * @param idType The ID type to set
     */
    public void setIdType(String idType) {
        this.idType = idType;
    }

    /**
     * Gets the recipient ID.
     *
     * @return The recipient ID
     */
    public String getRecipientId() {
        return recipientId;
    }

    /**
     * Sets the recipient ID.
     *
     * @param recipientId The recipient ID to set
     */
    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }

    /**
     * Gets the recipient ID type.
     *
     * @return The recipient ID type
     */
    public String getRecipientIdType() {
        return recipientIdType;
    }

    /**
     * Sets the recipient ID type.
     *
     * @param recipientIdType The recipient ID type to set
     */
    public void setRecipientIdType(String recipientIdType) {
        this.recipientIdType = recipientIdType;
    }

    /**
     * Gets the notification number.
     *
     * @return The notification number
     */
    public String getNotificationNumber() {
        return notificationNumber;
    }

    /**
     * Sets the notification number.
     *
     * @param notificationNumber The notification number to set
     */
    public void setNotificationNumber(String notificationNumber) {
        this.notificationNumber = notificationNumber;
    }

    /**
     * Gets the process status.
     *
     * @return The process status
     */
    public String getProcessStatus() {
        return processStatus;
    }

    /**
     * Sets the process status.
     *
     * @param processStatus The process status to set
     */
    public void setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
    }

    /**
     * Gets the service category.
     *
     * @return The service category
     */
    public String getServiceCategory() {
        return serviceCategory;
    }

    /**
     * Sets the service category.
     *
     * @param serviceCategory The service category to set
     */
    public void setServiceCategory(String serviceCategory) {
        this.serviceCategory = serviceCategory;
    }

    /**
     * Gets the reason code.
     *
     * @return The reason code
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the reason code.
     *
     * @param reasonCode The reason code to set
     */
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * Gets the native reason code.
     *
     * @return The native reason code
     */
    public String getNativeReasonCode() {
        return nativeReasonCode;
    }

    /**
     * Sets the native reason code.
     *
     * @param nativeReasonCode The native reason code to set
     */
    public void setNativeReasonCode(String nativeReasonCode) {
        this.nativeReasonCode = nativeReasonCode;
    }

    /**
     * Gets the system posting status.
     *
     * @return The system posting status
     */
    public String getSystemPostingStatus() {
        return systemPostingStatus;
    }

    /**
     * Sets the system posting status.
     *
     * @param systemPostingStatus The system posting status to set
     */
    public void setSystemPostingStatus(String systemPostingStatus) {
        this.systemPostingStatus = systemPostingStatus;
    }

    /**
     * Gets the payment received date.
     *
     * @return The payment received date
     */
    public Date getPmtReceivedDate() {
        return pmtReceivedDate;
    }

    /**
     * Sets the payment received date.
     *
     * @param pmtReceivedDate The payment received date to set
     */
    public void setPmtReceivedDate(Date pmtReceivedDate) {
        this.pmtReceivedDate = pmtReceivedDate;
    }

    /**
     * Gets the comments.
     *
     * @return The comments
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the comments.
     *
     * @param comments The comments to set
     */
    public void setComments(String comments) {
        this.comments = comments;
    }

    /**
     * Gets the backend system.
     *
     * @return The backend system
     */
    public String getBackendSystem() {
        return backendSystem;
    }

    /**
     * Sets the backend system.
     *
     * @param backendSystem The backend system to set
     */
    public void setBackendSystem(String backendSystem) {
        this.backendSystem = backendSystem;
    }

    /**
     * Gets the posting status code.
     *
     * @return The posting status code
     */
    public String getPostingStatusCode() {
        return postingStatusCode;
    }

    /**
     * Sets the posting status code.
     *
     * @param postingStatusCode The posting status code to set
     */
    public void setPostingStatusCode(String postingStatusCode) {
        this.postingStatusCode = postingStatusCode;
    }

    /**
     * Gets the internal bill category.
     *
     * @return The internal bill category
     */
    public String getInternalBillCategory() {
        return internalBillCategory;
    }

    /**
     * Sets the internal bill category.
     *
     * @param internalBillCategory The internal bill category to set
     */
    public void setInternalBillCategory(String internalBillCategory) {
        this.internalBillCategory = internalBillCategory;
    }

    /**
     * Gets whether VAT is applied.
     *
     * @return True if VAT is applied, false otherwise
     */
    public Boolean getVatApplied() {
        return vatApplied;
    }

    /**
     * Sets whether VAT is applied.
     *
     * @param vatApplied True if VAT is applied, false otherwise
     */
    public void setVatApplied(Boolean vatApplied) {
        this.vatApplied = vatApplied;
    }

    /**
     * Gets the posted amount.
     *
     * @return The posted amount
     */
    public BigDecimal getPostedAmount() {
        return postedAmount;
    }

    /**
     * Sets the posted amount.
     *
     * @param postedAmount The posted amount to set
     */
    public void setPostedAmount(BigDecimal postedAmount) {
        this.postedAmount = postedAmount;
    }

    /**
     * Gets the applied amount.
     *
     * @return The applied amount
     */
    public BigDecimal getAppliedAmount() {
        return appliedAmount;
    }

    /**
     * Sets the applied amount.
     *
     * @param appliedAmount The applied amount to set
     */
    public void setAppliedAmount(BigDecimal appliedAmount) {
        this.appliedAmount = appliedAmount;
    }

    /**
     * Gets the product ID.
     *
     * @return The product ID
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * Sets the product ID.
     *
     * @param productId The product ID to set
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

}