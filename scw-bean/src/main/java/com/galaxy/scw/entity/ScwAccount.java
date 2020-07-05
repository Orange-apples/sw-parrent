package com.galaxy.scw.entity;

import java.io.Serializable;

/**
 * (ScwAccount)实体类
 *
 * @author makejava
 * @since 2020-07-04 23:07:31
 */
public class ScwAccount implements Serializable {
    private static final long serialVersionUID = 601949194075448649L;
    
    private Integer id;
    
    private String username;
    
    private String password;
    
    private String email;
    
    private String phone;
    
    private Integer roleId;
    /**
    * 1为管理员0位普通用户
    */
    private Integer admin;
    /**
    * 0为企业，1为个人
    */
    private Integer state;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getAdmin() {
        return admin;
    }

    public void setAdmin(Integer admin) {
        this.admin = admin;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

}