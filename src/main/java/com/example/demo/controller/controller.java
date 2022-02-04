package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.api.person;
import com.example.demo.personService.service;


@RestController
public class controller {
	@Autowired
	service svc;
@GetMapping("/person")
	public List<person> getAllPersons() {
		
		return svc.getPersons();
	}
	@GetMapping(value ="/person/{id}")
	public Optional<person> getPerson(@PathVariable Integer id) {
		return svc.getPerson(id);
	}
	
	@PostMapping(value="/person/newPerson",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public void saveperson(@RequestBody person newPerson) {
		svc.save(newPerson);
	}
	
	@DeleteMapping(value="/person/{id}",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public void delete(@PathVariable int id) {
	svc.delete(id);
	}
	
	@PutMapping(value="/person/newPerson",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public void update(@RequestBody person p) {
	svc.save(p);
	}
	
	@GetMapping("/")
	public String getroot() {
		
		return "Hey there";
	}
	
	
	
}
