package com.sandeep.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="TRANSACTION")
public class TransactionTbl extends BaseModel {

    @Column(name="transaction_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long transactionId;
    @Column(name="account_id")
    private Long accountId;
    @Enumerated(EnumType.STRING)
    @Column(name="TRANSACTION_TYPE")
    private TransientType transactionType;
    @Column(name="amount")
    private BigDecimal amount;
    @Column(name="INITIAL_BALANCE")
    private BigDecimal initialAmount;
    @Column(name="CLOSING_BALANCE")
    private BigDecimal closingAmount;
    @Column(name="note")
    private String note;

    @ManyToOne
    @JoinColumn(name = "account_id",nullable = false,insertable = false,updatable = false)
    private Account account;

    public Account getAccount() {
        return account;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public TransientType getTransactionType() {
        return transactionType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public BigDecimal getInitialAmount() {
        return initialAmount;
    }

    public BigDecimal getClosingAmount() {
        return closingAmount;
    }

    public String getNote() {
        return note;
    }
}
