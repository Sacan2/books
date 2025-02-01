package com.java.book.library.books;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table
public class Book {
    private String title;
    private String genre;
    private int price;
    private String author;

}
