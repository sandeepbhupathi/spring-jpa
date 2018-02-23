package com.sandeep.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.Formula;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="user_sa")
public class User extends BaseModel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    // 1.Auto : detects based on DB
    // 2. sequence : specific to DB like ORA
    // 3. Table : supported by all DB's, when separate table is maintained for incrementing ID's
    //4 IDENTITY : increments id sequence with min value and number to be incremented for each id

	@Id
	@Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;

    @Transient // when variable is declared which is not part of table
    private boolean isRecAge;

    //when you group set of columns into a separate class then use this annotation
    @Embedded
    @AttributeOverrides({@AttributeOverride(name="addressLine1",column = @Column(name="user_address_line1")),
                         @AttributeOverride(name="addressLine2",column = @Column(name="user_address_line2"))})
	private BankAddress bankAddress = new BankAddress();;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumns({@JoinColumn(insertable=false,
	updatable=false,referencedColumnName="id",name="id")})
	private List<Address> addreass;


    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Formula("DATEADD('DAY', 30, crt_dt)")
    //hibernate specific annotation, when you want to execute a DB functions with query us it
	private Date recAge;

    public Date getRecAge() {
        return recAge;
    }

    public BankAddress getBankAddress() {
        return bankAddress;
    }

    public boolean isRecAge() {
        return email!=null ? true : false;
    }


    public void setRecAge(boolean recAge) {
        isRecAge = recAge;
    }

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public List<Address> getAddreass() {
		return addreass;
	}


}
