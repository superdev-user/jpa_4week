package com.example.demo.tableper;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * Created by hseungkim 2020/04/14
 */
@Entity
@DiscriminatorValue("M") // 3
@PrimaryKeyJoinColumn(name = "MOVIE_ID")
public class TablePerMovie extends TablePerItem {
    private String director;

    private String actor;
}