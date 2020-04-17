package com.example.demo.IdClassMapping;

import com.example.demo.IdClass.IdClassMapping;
import com.example.demo.IdClass.IdClassMappingRepository;
import com.example.demo.IdClass.ParentId;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


/**
 * Created by hseungkim 2020/04/16
 */

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class EmbeddedMappingRepositoryTests {

    @Autowired
    private IdClassMappingRepository idClassMappingRepository;

    @Test
    public void test(){
        String id1 = "tester1";
        String id2 = "id2";
        String name = "khs";
        idClassMappingRepository.save(new IdClassMapping(id1, id2,name));
        Optional<IdClassMapping> result = idClassMappingRepository.findById(new ParentId(id1, id2));
        assertThat(result.get().getName()).isEqualTo(name);
    }

    @Test
    public void successTest(){
        // hashcode, equals 제거시 오류 발생
        ParentId parentId1 = new ParentId("test1", "test2");
        ParentId parentId2 = new ParentId("test1", "test2");
        assertThat(parentId1).isEqualTo(parentId2);
    }
}
