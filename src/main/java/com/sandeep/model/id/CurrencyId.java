package com.sandeep.model.id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown=true)
public class CurrencyId implements Serializable{

    private String name;
    private String countryName;

    public CurrencyId(){

    }
    public CurrencyId(String name, String countryName) {
        this.name = name;
        this.countryName = countryName;
    }

    public String getName() {
        return name;
    }

    public String getCountryName() {
        return countryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CurrencyId)) return false;
        CurrencyId that = (CurrencyId) o;
        return Objects.equals(getName(), that.getName()) &&
                Objects.equals(getCountryName(), that.getCountryName());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getCountryName());
    }
}
