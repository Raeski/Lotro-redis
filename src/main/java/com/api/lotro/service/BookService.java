package com.api.lotro.service;

import com.api.lotro.client.LotroClient;
import com.api.lotro.model.Book;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BookService {

    private final LotroClient lotroClient;
/*
    @PostConstruct
    private void test(){
        getBook();
    }

 */

    @Cacheable("book")
    public Book getBook(){
        Book book = lotroClient.getBook();
        return book;
    }

}
