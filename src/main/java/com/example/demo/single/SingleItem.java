package com.example.demo.single;

import javax.persistence.*;

/**
 * Created by hseungkim 2020/04/14
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // 1
@DiscriminatorColumn(name = "DTYPE") // 2
public abstract class SingleItem {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private int price;
}