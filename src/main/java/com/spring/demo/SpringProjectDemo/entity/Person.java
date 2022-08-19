package com.spring.demo.SpringProjectDemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PERSON_TBL")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @Id
    private int personId;
    private String name;
    private int age;

}
