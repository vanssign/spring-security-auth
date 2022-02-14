package com.example.demo.base.users.payload;

import lombok.Data;

@Data
public class SignUpDto {
    private String username;
    private String password;
    public SignUpDto(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public SignUpDto() {
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
    
}
