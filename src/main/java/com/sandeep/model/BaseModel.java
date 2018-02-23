package com.sandeep.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

@MappedSuperclass
public class BaseModel {

    @Column(name="crt_usr_id",length = 30)
    private String createdUserID;
    @Column(name="crt_dt")
    @Temporal(TemporalType.DATE)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm a z")
    private java.util.Date createdTs;
    @Column(name="last_upd_usr_id",length = 30)
    private String lastUpdUserID;

    public void setCreatedUserID(String createdUserID) {
        this.createdUserID = createdUserID;
    }

    public void setCreatedTs(java.util.Date createdTs) {
        this.createdTs = createdTs;
    }

    public void setLastUpdUserID(String lastUpdUserID) {
        this.lastUpdUserID = lastUpdUserID;
    }

    public void setLastUpdTs(Timestamp lastUpdTs) {
        this.lastUpdTs = lastUpdTs;
    }

    @Column(name="last_upd_ts")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm a z")
    private Timestamp lastUpdTs;

    public String getCreatedUserID() {
        return createdUserID;
    }

    public java.util.Date getCreatedTs() {
        return createdTs;
    }

    public String getLastUpdUserID() {
        return lastUpdUserID;
    }

    public Timestamp getLastUpdTs() {
        return lastUpdTs;
    }

    @PrePersist
    public void onCreate(){
        lastUpdTs=new Timestamp(System.currentTimeMillis());
        lastUpdUserID="Sandy";
        createdTs=new Date(System.currentTimeMillis());
        createdUserID="Sandy";
    }
}
