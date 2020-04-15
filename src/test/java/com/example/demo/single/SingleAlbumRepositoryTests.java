package com.example.demo.single;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * Created by hseungkim 2020/04/14
 */

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class SingleAlbumRepositoryTests {

    @Autowired
    private SingleAlbumRepository albumRepository;

    @Test
    public void saveTest(){
        albumRepository.save(new SingleAlbum("tester"));

        albumRepository.findAlbumByAuthor("tester");

    }
}