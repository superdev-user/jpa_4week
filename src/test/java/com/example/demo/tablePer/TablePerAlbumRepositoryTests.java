package com.example.demo.tablePer;

import com.example.demo.single.SingleAlbum;
import com.example.demo.single.SingleAlbumRepository;
import com.example.demo.tableper.TablePerAlbum;
import com.example.demo.tableper.TablePerAlbumRepository;
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
public class TablePerAlbumRepositoryTests {

    @Autowired
    private TablePerAlbumRepository albumRepository;

    @Test
    public void saveTest(){
        albumRepository.save(new TablePerAlbum("tester"));

        albumRepository.findAlbumByAuthor("tester");

    }
}