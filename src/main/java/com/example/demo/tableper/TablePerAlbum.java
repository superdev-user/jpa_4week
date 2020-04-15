package com.example.demo.tableper;

import lombok.AllArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by hseungkim 2020/04/14
 */
@Entity
@DiscriminatorValue("A") // 3
@AllArgsConstructor
public class TablePerAlbum extends TablePerItem {
    private String author;
}