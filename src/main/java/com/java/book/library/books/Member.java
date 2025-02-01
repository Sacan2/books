package com.java.book.library.books;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table
@Entity
public class Member {
    private String uniqueUsername;
    private String email;
    private String address;
    private int phoneNumber;

}
