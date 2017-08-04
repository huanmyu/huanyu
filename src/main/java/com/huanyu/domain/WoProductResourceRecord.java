package com.huanyu.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class WoProductResourceRecord implements Serializable {

    private static final long serialVersionUID = -2175922367802870822L;

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String productNO;

    @Column
    private String username;

    public WoProductResourceRecord() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductNO() {
        return productNO;
    }

    public void setProductNO(String productNO) {
        this.productNO = productNO;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
