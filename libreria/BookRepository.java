package com.example.literalura.repository;

import com.example.literalura.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitleContainingIgnoreCase(String title);
    List<Book> findByAuthor(String author);
    List<Book> findByLanguage(String language);
    List<Book> findByPublicationYear(Year year);
}
