package com.galaxy.scw.entity;

import java.io.Serializable;

/**
 * (ScwProject)实体类
 *
 * @author makejava
 * @since 2020-07-04 23:07:32
 */
public class ScwProject implements Serializable {
    private static final long serialVersionUID = 776476407644521713L;
    
    private Integer id;
    
    private String name;
    
    private String context;
    
    private Double totalPrice;
    
    private String totalDays;
    
    private String headPhoto;
    
    private Integer accountId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getTotalDays() {
        return totalDays;
    }

    public void setTotalDays(String totalDays) {
        this.totalDays = totalDays;
    }

    public String getHeadPhoto() {
        return headPhoto;
    }

    public void setHeadPhoto(String headPhoto) {
        this.headPhoto = headPhoto;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

}