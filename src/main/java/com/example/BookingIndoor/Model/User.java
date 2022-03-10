package com.example.BookingIndoor.Model;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;
    @Column(unique = true)
    private String mailId;
    @Column(unique = true)
    private String mobNo;
    private String password;
    private String roles;


    public User() {
    }

    public User(String name, String mailId, String mobNo, String password,String roles) {
        this.id = id;
        this.name = name;
        this.mailId = mailId;
        this.mobNo = mobNo;
        this.password = password;
        this.roles=roles;
    }

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

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
}
