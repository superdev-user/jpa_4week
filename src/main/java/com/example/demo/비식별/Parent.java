package com.example.demo.비식별;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by hseungkim 2020/04/17
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Parent {
    @Id
    private String parentId;
}