package com.example.literalura.controller;

import com.example.literalura.entity.Book;
import com.example.literalura.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Year;
import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    @GetMapping("/search")
    public List<Book> searchBooksByTitle(@RequestParam String title) {
        return bookService.searchBooksByTitle(title);
    }

    @GetMapping("/author")
    public List<Book> getBooksByAuthor(@RequestParam String author) {
        return bookService.getBooksByAuthor(author);
    }

    @GetMapping("/language")
    public List<Book> getBooksByLanguage(@RequestParam String language) {
        return bookService.getBooksByLanguage(language);
    }

    @GetMapping("/year")
    public List<Book> getBooksByYear(@RequestParam Year year) {
        return bookService.getBooksByYear(year);
    }

    @PostMapping
    public Book saveBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }
}
