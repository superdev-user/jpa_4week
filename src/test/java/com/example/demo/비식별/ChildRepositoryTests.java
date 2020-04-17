package com.example.demo.비식별;

import com.example.demo.IdClass.IdClassMapping;
import com.example.demo.IdClass.IdClassMappingRepository;
import com.example.demo.IdClass.ParentId;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


/**
 * Created by hseungkim 2020/04/16
 */

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class ChildRepositoryTests {

    @Autowired
    private ChildRepository childRepository;

    @Autowired
    private ParentRepository parentRepository;

    @Test
    public void test(){

        parentRepository.save(new Parent("parent"));
        System.out.println(parentRepository.findAll().size());
        List list  = childRepository.findAll();
        System.out.println(list.size());
        //childRepository.save(new Child("childId1",new Parent("parentId")));
        //childRepository.findAll();
    }

}
