package com.example.demo.비식별;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


/**
 * Created by hseungkim 2020/04/16
 */

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class ParentRepositoryTests {

    @Autowired
    private ParentRepository parentRepository;

    @Test
    public void test(){
        parentRepository.save(new Parent("test"));
    }

}
