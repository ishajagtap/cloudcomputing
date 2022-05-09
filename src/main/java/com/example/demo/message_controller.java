package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class message_controller {
	
	@Autowired
	message_repository resp;
	
	
	
	@PostMapping("/message")
	public String poostmessage(@RequestBody message msg ) {
		resp.save(msg);
		return "message saved";
		}
	@GetMapping("/message")
	public  List<message> getmessage() {
		List<message>list= resp.findAll();
		return list;
		}
	
	

}
