package com.example.demo.single;

import lombok.AllArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by hseungkim 2020/04/14
 */
@Entity
@DiscriminatorValue("A") // 3
@AllArgsConstructor
public class SingleAlbum extends SingleItem {
    private String author;
}