package com.example.demo.join;

import lombok.AllArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by hseungkim 2020/04/14
 */
@Entity
@DiscriminatorValue("A") // 3
@AllArgsConstructor
public class Album extends Item{
    private String author;
}