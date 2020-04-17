package com.example.demo.superclass;

import lombok.AllArgsConstructor;

import javax.persistence.Entity;

/**
 * Created by hseungkim 2020/04/16
 */
@Entity
@AllArgsConstructor
public class Member extends BaseEntity {
    private String name;
}
