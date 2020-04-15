package com.example.demo.join;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 * Created by hseungkim 2020/04/14
 */
@Entity
@DiscriminatorValue("M") // 3
@PrimaryKeyJoinColumn(name = "MOVIE_ID")
public class Movie extends Item{
    private String director;

    private String actor;
}