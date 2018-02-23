package com.sandeep.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BankAddress {
    @Column(name="address_line1")
    private String addressLine1;

    @Column(name="address_line2")
    private String addressLine2;

    @Column(name="city")
    private String city;

    @Column(name="zip")
    private String zip;

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getCity() {
        return city;
    }

    public String getZip() {
        return zip;
    }
}
