package com.spring.demo.SpringProjectDemo.controller;

import com.spring.demo.SpringProjectDemo.entity.Person;
import com.spring.demo.SpringProjectDemo.repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonRepo personRepo;

    @PostMapping("/save")
    public Person addPerson(@RequestBody Person person) {
        return personRepo.save(person);
    }

    @GetMapping("/getAll")
    public List<Person> findAllPersons() {
        List<Person> findall = personRepo.findAll();
        return findall;
    }
}
