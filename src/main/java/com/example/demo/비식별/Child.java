package com.example.demo.비식별;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Created by hseungkim 2020/04/17
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Child {
    @Id
    private String childId;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Parent parent;
}