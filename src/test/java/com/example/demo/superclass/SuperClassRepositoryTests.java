package com.example.demo.superclass;

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
public class SuperClassRepositoryTests {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private TeamRepository teamRepository;

    @Test
    public void test(){
        memberRepository.save(new Member("tester"));
        memberRepository.findAll();

        teamRepository.save(new Team());
        teamRepository.findAll();
    }
}
