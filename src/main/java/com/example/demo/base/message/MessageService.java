package com.example.demo.base.message;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MessageService {
    @Autowired
    MessageRepo messageRepo;
    
    public List<Message> getAllMessages(){
        return messageRepo.findAll();
    }
    public void addMessage(Message message){
        messageRepo.save(message);
    }
    public void deleteMessage(Long id){
        messageRepo.deleteById(id);
    }
    public void updateMessage(Long id, String displayMessage){
        Optional<Message> messageFromRepo = messageRepo.findById(id);
        if(messageFromRepo.isPresent()){
            Message newMsg=messageFromRepo.get();
            newMsg.setDisplayMessage(displayMessage);
            messageRepo.save(newMsg);
        }
    }
}
