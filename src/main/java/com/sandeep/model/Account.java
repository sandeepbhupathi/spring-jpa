package com.sandeep.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="account")
public class Account extends BaseModel{

    @Id
    @Column(name="account_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long accountID;
    @Column(name="bank_id")
    private Long bankId;
    @Column(name="account_type_id")
    private Long accountType;
    @Column(name="name")
    private String name;
    @Column(name="initial_balance")
    private BigDecimal initialBalance;
    @Column(name="closing_balance")
    private BigDecimal closingBalance;
    @Column(name="open_date")
    private Date openDate;
    @Column(name="close_date")
    private Date closeDate;

    @OneToMany(cascade = CascadeType.ALL/*,fetch = FetchType.LAZY*/)
    @JoinColumn(name="account_id",referencedColumnName = "account_id"/*,nullable = false,insertable = false,updatable = false*/)
    private List<TransactionTbl> aTransient= new ArrayList<>();

    public Long getAccountID() {
        return accountID;
    }

    public Long getBankId() {
        return bankId;
    }

    public Long getAccountType() {
        return accountType;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getInitialBalance() {
        return initialBalance;
    }

    public BigDecimal getClosingBalance() {
        return closingBalance;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public Date getCloseDate() {
        return closeDate;
    }

   /* public List<TransactionTbl> getaTransient() {
        return aTransient;
    }*/
}
