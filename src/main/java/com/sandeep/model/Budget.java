package com.sandeep.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="BUDGET")
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="budget_id")
    private Long budgetId;
    @Column(name="name")
    private String name;
    @Column(name="max_amount")
    private BigDecimal goalAmount;
    @Column(name="period")
    private String period;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name="BUDGET_TRANSACTION",joinColumns = @JoinColumn(name="budget_id"),
        inverseJoinColumns = @JoinColumn(name="transaction_id"))
    private List<TransactionTbl> transactionTbls=new ArrayList<>();

    public Long getBudgetId() {
        return budgetId;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getGoalAmount() {
        return goalAmount;
    }

    public String getPeriod() {
        return period;
    }

    public List<TransactionTbl> getTransactionTbls() {
        return transactionTbls;
    }

    public void setTransactionTbls(List<TransactionTbl> transactionTbls) {
        this.transactionTbls = transactionTbls;
    }
}
