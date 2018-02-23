package com.sandeep.model;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="bank")
public class Bank extends BaseModel {
    @Column(name="id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bankId;
    @Column(name="name")
    private String name;
    @Column(name="is_international")
    private boolean is_international;
    @Embedded
    private BankAddress bankAddress = new BankAddress();

    @ElementCollection
    @CollectionTable(name="bank_contacts",joinColumns = @JoinColumn(name = "id"))
    @Column(name="contact_name")
    private List<String> contactList = new ArrayList<>();

    public List<String> getContactList() {
        return contactList;
    }


    public long getBankId() {
        return bankId;
    }

    public String getName() {
        return name;
    }

    public boolean isIs_international() {
        return is_international;
    }

    public BankAddress getBankAddress() {
        return bankAddress;
    }
}
