package com.example.demo.join;

import javax.persistence.*;

/**
 * Created by hseungkim 2020/04/14
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED) // 1
@DiscriminatorColumn(name = "DTYPE") // 2
public abstract class Item{
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private int price;
}