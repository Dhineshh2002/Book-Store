package org.example.Dhinesh.controller;

import org.example.Dhinesh.entity.Book;
import org.example.Dhinesh.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping ("/books")
    public List<Object> getBooks() {
        return bookService.getBooks();
    }

    @RequestMapping (value = "/books", method = RequestMethod.POST)
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    @RequestMapping (value = "/books/{id}")
    public Optional<Book> getBookById(@PathVariable("id") Integer id) {
        return bookService.getBookById(id);
    }

    @RequestMapping (value = "/books", method = RequestMethod.PUT)
    public Book updateBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }

    @RequestMapping (value = "/books/{id}", method = RequestMethod.DELETE)
    public String deleteBook(@PathVariable Integer id) {
        return (bookService.deleteBook(id));
    }
}
