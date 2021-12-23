package com.example.retoFuncional.Controller;

import java.util.ArrayList;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.retoFuncional.model.User;

@RestController
public class RestControl {
	private ArrayList<User> lista = new ArrayList<User>();
	
	public RestControl(){
		lista.add(new User("User1", "login1", "pass1"));
		lista.add(new User("User2", "login2", "pass2"));
		lista.add(new User("User3", "login3", "pass3"));
	}
	
	@GetMapping(path="/logear")
	public String login(@RequestParam(value = "username") String login, @RequestParam(value= "password") String passw) {
		var result = lista.stream().filter(p -> p.getNombre().equals(login) && p.getPassword().equals(passw)).collect(Collectors.toList()).get(0);
				
		return "Hola " + result.getNombre();
	}
}
