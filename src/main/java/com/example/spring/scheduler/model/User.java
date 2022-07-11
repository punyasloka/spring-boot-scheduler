package com.example.spring.scheduler.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "MyUser")
@ToString
public class User {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
}
