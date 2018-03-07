package com.cbs.edu.spring_web_app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Entity
public abstract class AbstractEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Integer id;
}
