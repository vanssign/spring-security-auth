package com.example.demo.base.message;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//meh just allow everything for noe
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping(path="messages")
public class MessageController {
	private final MessageService messageService;

	@Autowired
	public MessageController(MessageService messageService){
		this.messageService= messageService;
	}
	//check response entity
    @GetMapping
    public ResponseEntity<List<Message>> displayMessage(){
        return new ResponseEntity<List<Message>>(messageService.getAllMessages(),HttpStatus.CREATED);
    }
	@PostMapping
	public void addMessage(@RequestBody Message message){
		messageService.addMessage(message);
	}
	//wild cards
	@PutMapping(path="{userId}")  //api/v1/users/:userId
	public void updateMessage(@PathVariable Long messageId,@RequestBody Message message){
		messageService.updateMessage(messageId,message.getDisplayMessage());
	}
	@DeleteMapping(path="{messageId}")
	public void deleteMessage(@PathVariable Long messageId){
		messageService.deleteMessage(messageId);
	}

}
