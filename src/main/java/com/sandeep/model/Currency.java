package com.sandeep.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.sandeep.model.id.CurrencyId;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="CURRENCY")
@IdClass(CurrencyId.class)
@JsonIgnoreProperties(ignoreUnknown=true)
public class Currency {
    @Id
    @Column(name = "name")
    private String name;
    @Id
    @Column(name="country_name")
    private String countryName;
    @Column(name="symbol")
    private String symbol;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumns({
        @JoinColumn(name="name",referencedColumnName = "name"),
        @JoinColumn(name="country_name",referencedColumnName = "country_name")
    })
    private List<Market> marketList;

    public List<Market> getMarketList() {
        return marketList;
    }

    public String getName() {
        return name;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getSymbol() {
        return symbol;
    }
}
