package com.example.demo;

import com.example.demo.join.Album;
import com.example.demo.join.AlbumRepository;
import com.example.demo.join.ItemRepository;
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
public class AlbumRepositoryTests {

    @Autowired
    private AlbumRepository albumRepository;

    @Autowired
    private ItemRepository itemRepository;

    @Test
    public void saveTest(){
        Album album = new Album("test");
        album.setName("name");
        itemRepository.save(album);
        itemRepository.findAll();
    }
}