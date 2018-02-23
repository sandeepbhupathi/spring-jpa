package com.sandeep.model;

import javax.annotation.Generated;
import javax.persistence.*;
import java.util.*;

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

    //Use Element collection when you have set of data mapped to same id's go either with list or map
    @ElementCollection
    @CollectionTable(name="bank_contacts",joinColumns = @JoinColumn(name = "id"))
    @Column(name="contact_name")
    private List<String> contactList = new ArrayList<>();

    @ElementCollection
    @CollectionTable(name="bank_contacts",joinColumns = @JoinColumn(name="id"))
    @Column(name="contact_name")
    @MapKeyColumn(name="position_type")
    private Map<String,String> contactMap = new HashMap<>();

    @OneToOne(mappedBy = "bank")
    private Credentials credentials;

   /* public Credentials getCredentials() {
        return credentials;
    }*/

    public Map<String, String> getContactMap() {
        return contactMap;
    }


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
