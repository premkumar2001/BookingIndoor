package com.example.BookingIndoor.Model;

import javax.persistence.*;

@Entity
@Table(name="customerreglog")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String f_name;
    private String l_name;
    @Column(unique = true)
    private String mailId;
    private String mobNo;
    private String password;

    public UserModel() {
    }

    public UserModel(Integer id, String f_name, String l_name, String mailId, String mobNo, String password) {
        this.id = id;
        this.f_name = f_name;
        this.l_name = l_name;

        this.mailId = mailId;
        this.mobNo = mobNo;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
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


}
