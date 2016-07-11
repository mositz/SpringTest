package com.mositz.springBoot.repository;

import com.mositz.springBoot.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by zhangxingxing on 16/7/7.
 */
public interface ReadingListRepository extends JpaRepository<Book, Long> {

    List<Book> findByReader(String reader);

}