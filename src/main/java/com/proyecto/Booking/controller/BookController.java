package com.proyecto.Booking.controller;

import com.proyecto.Booking.persistence.entities.Book;
import com.proyecto.Booking.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/create")
    public void create(@RequestBody Book book){

        bookService.saveBook(book);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Book>>getAll(){

        return ResponseEntity.ok(bookService.getAllBooks());
    }


}
