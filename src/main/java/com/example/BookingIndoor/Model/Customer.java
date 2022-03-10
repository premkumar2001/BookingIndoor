package com.example.BookingIndoor.Model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Customer implements UserDetails {

    private Integer id;
    private String name;
    private String mailId;
    private String mobNo;
    private String password;
    private List<GrantedAuthority> authorities;

    public Customer(){}
    public Customer(User am){
        this.id=am.getId();
        this.name=am.getName();
        this.mailId= am.getMailId();
        this.mobNo=am.getMobNo();
        this.password= am.getPassword();
        this.authorities=Arrays.stream(am.getRoles().split(",")).map(SimpleGrantedAuthority::new).collect(Collectors.toList());
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
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