package com.abdala.demo.service.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

  private Long id;
    private   String bio ;
    private LocalDateTime createdAt;
    public String getBio() {
        return bio;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return email;
    }

    public Long getId() {
        return id;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    private   String password ;


    private String Name ;


    private String email ;


    public void setId(Long id){
        this.id=id;
    }
}
