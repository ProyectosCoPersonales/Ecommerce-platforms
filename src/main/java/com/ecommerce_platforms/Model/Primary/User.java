package com.ecommerce_platforms.Model.Primary;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.ecommerce_platforms.Model.Secundary.Role;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User implements UserDetails{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100)
    private String codeUser;
    @Column(length = 50)
    private String username;
    @Column(length = 50)
    private String email;
    @Column(columnDefinition = "TEXT")
    private String password;
    @Column(length = 15)
    private String phone;
    @Column(length = 200)
    private String address;
    @Column(columnDefinition = "TEXT")
    private String imgAvatar;
    @Enumerated(EnumType.STRING)
    private Role role;
    @Column(length = 15)
    private String createdTo;
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
       return List.of(new SimpleGrantedAuthority((role.name())));
    }
    @PrePersist
    public void PrePersist(){
        this.codeUser = "USER-"+UUID.randomUUID().toString();
        this.createdTo = LocalDate.now().toString();
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCodeUser() {
        return codeUser;
    }
    public void setCodeUser(String codeUser) {
        this.codeUser = codeUser;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getImgAvatar() {
        return imgAvatar;
    }
    public void setImgAvatar(String imgAvatar) {
        this.imgAvatar = imgAvatar;
    }
    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }
    public User() {
    }

}
