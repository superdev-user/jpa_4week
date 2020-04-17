package com.example.demo.비식별;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by hseungkim 2020/04/14
 */
@Repository
public interface ChildRepository extends JpaRepository<Child, Long> {
}