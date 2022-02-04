package com.example.demo.personService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.api.person;
import com.example.demo.repository.repo;

@Service
public class service {
@Autowired
repo repository;
	 public List<person> getPersons(){
		List<person> list =repository.findAll();
		return list;
	 }
	public Optional<person> getPerson(int id) {
		return repository.findById(id);
	
	}
	public void save(person newGuy) {
		repository.save(newGuy);
		
	}
	public void delete(int id) {
		
		repository.deleteById(id);
	}
}



















