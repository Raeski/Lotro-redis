package com.api.lotro.controller;

import com.api.lotro.model.Book;
import com.api.lotro.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping("/books")
    private Book getBooksLotro(){
        return bookService.getBook();
    }
}
