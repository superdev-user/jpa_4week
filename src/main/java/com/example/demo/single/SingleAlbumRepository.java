package com.example.demo.single;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by hseungkim 2020/04/14
 */
@Repository
public interface SingleAlbumRepository extends JpaRepository<SingleAlbum, Long> {
    SingleAlbum findAlbumByAuthor(String author);
}