package com.example.goodreads;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.goodreads.BookService;
import java.util.*;

@RestController
class BookController{
    BookService bookService = new BookService();

    @GetMapping("/books")
    public ArrayList<Book> getBooks(){
        return bookService.getBooks();
    }

    @GetMapping("/books/{bookId}")
    public Book getBookId(@PathVariable("bookId") int bookId){
        return bookService.getBookbyId(bookId);
    }

}