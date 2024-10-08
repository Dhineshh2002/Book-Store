package org.example.Dhinesh.service;

import org.example.Dhinesh.entity.Book;
import org.example.Dhinesh.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public List<Object> getBooks() {
        List<Object> books = new ArrayList<>();
        bookRepository.findAll().forEach(books::add);
        return books;
    }

    public Book addBook( Book book ) {
        return bookRepository.save(book);
    }

    public Optional<Book> getBookById(Integer id){
        return bookRepository.findById(id);
    }


    public Book updateBook(Book book) {
        return bookRepository.save(book);
    }

    public String deleteBook(Integer id) {
        bookRepository.deleteById(id);
        return "Deleted";
    }
}
