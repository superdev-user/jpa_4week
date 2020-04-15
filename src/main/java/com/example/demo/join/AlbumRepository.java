package com.example.demo.join;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by hseungkim 2020/04/14
 */
@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {
    Album findAlbumByAuthor(String author);
}