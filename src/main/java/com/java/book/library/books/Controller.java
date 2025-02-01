package com.java.book.library.books;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(path = "api/get")
    String getMapper(){
        return "Test Hello";
    }

    @PostMapping(path = "api/post")
    String postMapper(@RequestParam String name){
        return name;
    }
}
