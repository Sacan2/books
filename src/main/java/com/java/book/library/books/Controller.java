package com.java.book.library.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {

    private final BookRepository bookRepository;

    @Autowired
    public Controller(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping(path = "get")
    public String getMapper() {
        return "Test Hello";
    }

    @PostMapping(path = "post")
    public String postMapper(@RequestBody Book book) {
        bookRepository.save(book);  // Speichert das Buch in der DB
        return "Book with title '" + book.getTitle() + "' saved!";
    }

    // GET-Request, der alle Bücher aus der Datenbank abruft
    @GetMapping(path = "books")
    public List<Book> getAllBooks() {
        return bookRepository.findAll();  // Gibt eine Liste von Büchern zurück
    }
}
