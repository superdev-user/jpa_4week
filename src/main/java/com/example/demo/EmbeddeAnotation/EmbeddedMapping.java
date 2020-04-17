package com.example.demo.EmbeddeAnotation;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by hseungkim 2020/04/16
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class EmbeddedMapping {

    @EmbeddedId
    Embedded embedded;

    private String name;
}