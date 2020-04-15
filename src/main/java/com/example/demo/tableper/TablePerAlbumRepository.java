package com.example.demo.tableper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by hseungkim 2020/04/14
 */
@Repository
public interface TablePerAlbumRepository extends JpaRepository<TablePerAlbum, Long> {
    TablePerAlbum findAlbumByAuthor(String author);
}