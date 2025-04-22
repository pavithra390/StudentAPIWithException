package com.example.transactionlogger.TransactionEntry;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table
public class EntryPage {
    @Column
    @Id
    private Integer transactionId;
    @Column
    private String storeName;
    @Column
    String purpose;
    @Column
    Integer amount;
    @Column
    String address;


    public EntryPage(Integer transactionId, String storeName, String purpose, Integer amount,String address) {
        this.transactionId = transactionId;
        this.storeName = storeName;
        this.purpose = purpose;
        this.amount = amount;
        this.address = address;
    }

    public EntryPage() {}



    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {

        this.amount = amount;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
