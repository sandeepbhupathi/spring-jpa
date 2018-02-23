package com.sandeep.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.Formula;

import java.io.Serializable;
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
	@Id
	@Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumns({@JoinColumn(insertable=false,
	updatable=false,referencedColumnName="id",name="id")})
	private List<Address> addreass;

    public Date getRecAge() {
        return recAge;
    }
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @Formula("DATEADD('DAY', 30, crt_dt)")
	private Date recAge;



    public boolean isRecAge() {
        return email!=null ? true : false;
    }


    public void setRecAge(boolean recAge) {
        isRecAge = recAge;
    }

    @Transient
    private boolean isRecAge;



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
