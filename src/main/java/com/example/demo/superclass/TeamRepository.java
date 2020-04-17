package com.example.demo.superclass;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by hseungkim 2020/04/14
 */
@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
}