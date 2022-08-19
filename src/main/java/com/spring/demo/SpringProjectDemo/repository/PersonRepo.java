package com.spring.demo.SpringProjectDemo.repository;

import com.spring.demo.SpringProjectDemo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepo extends JpaRepository<Person,Integer> {


}
