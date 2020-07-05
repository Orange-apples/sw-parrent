package com.galaxy.scw.entity;

import java.io.Serializable;

/**
 * (ScwPrivilege)实体类
 *
 * @author makejava
 * @since 2020-07-04 23:07:32
 */
public class ScwPrivilege implements Serializable {
    private static final long serialVersionUID = 997585868678425136L;
    
    private Integer id;
    
    private String name;


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

}