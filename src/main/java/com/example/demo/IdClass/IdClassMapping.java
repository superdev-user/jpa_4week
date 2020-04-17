package com.example.demo.IdClass;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

/**
 * Created by hseungkim 2020/04/16
 */
@Entity
@IdClass(ParentId.class)
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class IdClassMapping {
    @Id
    @Column(name = "PARENT_ID1")
    private String id1;

    @Id
    @Column(name = "PARENT_ID2")
    private String id2;

    private String name;
}