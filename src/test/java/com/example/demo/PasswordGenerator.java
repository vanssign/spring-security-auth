package com.example.demo;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {
 public static void main(String[] args) {
     BCryptPasswordEncoder encoder =new BCryptPasswordEncoder();
     String raw ="vans321";
     String enraw=encoder.encode(raw);
     System.out.println(enraw);

 }   
}
