package com.example.springapplicationcontext;

import org.springframework.beans.factory.annotation.Autowired;

public class BookService {

    //@Autowired // @Autowired 로 빈을 주입받음 @Inject 도 가능
    BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
}
