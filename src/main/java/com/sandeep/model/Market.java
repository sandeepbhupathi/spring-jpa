package com.sandeep.model;

import javax.persistence.*;

@Entity
@Table(name = "market")
public class Market {

    @Id
    @Column(name="market_id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "country_name")
    private String countryName;
    @Column(name="market_name")
    private String marketName;

    public Long getId() {
        return id;
    }

    public String getMarketName() {
        return marketName;
    }
}
