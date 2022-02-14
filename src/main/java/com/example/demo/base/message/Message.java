package com.example.demo.base.message;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//model
@Entity
@Table
public class Message {
    @Id
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE
    )
    private Long id;
    public Message(){}

    public Message(Long id,String displayMessage){
        this.id=id;
        this.displayMessage=displayMessage;
    }

    public Message(String displayMessage){
        this.displayMessage=displayMessage;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }


    private String displayMessage;
    public String getDisplayMessage() {
        return displayMessage;
    }
    public void setDisplayMessage(String displayMessage) {
        this.displayMessage = displayMessage;
    }
}
