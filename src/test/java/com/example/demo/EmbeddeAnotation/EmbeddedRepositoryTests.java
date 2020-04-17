package com.example.demo.EmbeddeAnotation;

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
public class EmbeddedRepositoryTests {

    @Autowired
    private EmbeddedMappingRepository embeddedMappingRepository;

    @Test
    public void test(){
        // given
        String id1 = "tester1";
        String id2 = "id2";
        String name = "khs";

        // when
        embeddedMappingRepository.save(new EmbeddedMapping(new Embedded(id1, id2), name));
        Optional<EmbeddedMapping> result = embeddedMappingRepository.findById(new Embedded(id1, id2));

        // then
        assertThat(result.get().getName()).isEqualTo(name);

    }
}
