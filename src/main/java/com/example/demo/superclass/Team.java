package com.example.demo.superclass;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Created by hseungkim 2020/04/16
 */
@Entity
@AttributeOverride(name = "id", column = @Column(name = "TEAM_ID")) // 2
public class Team extends BaseEntity {
}
