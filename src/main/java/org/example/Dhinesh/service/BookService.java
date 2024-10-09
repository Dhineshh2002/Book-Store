package org.example.Dhinesh.service;

import org.example.Dhinesh.entity.Book;
import org.example.Dhinesh.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public List<Book> getBooks(Set<Integer> yop, String name) {
        List<Book> books = new ArrayList<>();
        if(yop != null && name != null) {
            return bookRepository.findAllByYearOfPublishedInAndName(yop, name);
        }
        else if(yop != null) {
            return bookRepository.findAllByYearOfPublishedIn(yop);
        }
        else if(name != null) {
            return bookRepository.findAllByName(name);
        } else {
            bookRepository.findAll().forEach(books::add);
            return books;
        }
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
