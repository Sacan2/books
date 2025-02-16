package com.java.book.library.books;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Table
public class Author {
    private String name;
    private String dateOfBirth;
    private int releasedBooks;
}
