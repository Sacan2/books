package com.java.book.library.books;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "books")  // Optional, aber so kannst du den Namen der Tabelle explizit festlegen
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // Der Primärschlüssel für die Tabelle

    private String title;
    private String genre;
    private int price;
    private String author;

    public Book(String name) {

    }
}
