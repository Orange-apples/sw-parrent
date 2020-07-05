package com.galaxy.scw.entity;

import java.io.Serializable;

/**
 * (ScwTags)实体类
 *
 * @author makejava
 * @since 2020-07-04 23:07:32
 */
public class ScwTags implements Serializable {
    private static final long serialVersionUID = 267167779379562023L;
    
    private Integer id;
    
    private String name;
    
    private Integer parrentId;


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

    public Integer getParrentId() {
        return parrentId;
    }

    public void setParrentId(Integer parrentId) {
        this.parrentId = parrentId;
    }

}