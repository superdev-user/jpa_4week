package com.example.demo.tableper;

import javax.persistence.*;

/**
 * Created by hseungkim 2020/04/14
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // 1
@DiscriminatorColumn(name = "DTYPE") // 2
public abstract class TablePerItem {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private int price;
}