package com.example.BookingIndoor.Model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;

public class CustomerModel implements UserDetails {

    private int id;
    private String f_name;
    private String l_name;
    private String mailId;
    private String mobNo;
    private String password;

    public CustomerModel(UserModel lm) {
        this.id = lm.getId();
        this.f_name = lm.getF_name();
        this.l_name = lm.getL_name();
        this.mailId = lm.getMailId();
        this.mobNo = lm.getMobNo();
        this.password = lm.getPassword();
    }

    public CustomerModel() {
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Arrays.asList(new SimpleGrantedAuthority("ROLE_USER"));
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return mailId;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}