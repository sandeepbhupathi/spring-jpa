package com.sandeep.model;


import javax.persistence.*;

@Entity
@Table(name="credentials")
public class Credentials {
    @Id
    @Column(name = "credentials_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long credentialsId;
    @Column(name="user_name")
    private String userName;
    @Column(name="password")
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="user_id",referencedColumnName = "id")
    private Bank bank;

    public long getCredentialsId() {
        return credentialsId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public Bank getBank() {
        return bank;
    }
}
