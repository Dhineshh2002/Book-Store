package org.example.Dhinesh.repo;

import org.example.Dhinesh.entity.Book;
import org.hibernate.query.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer> {

   // public List<Book> findAllByYearOfPublishedIn(Set<Integer> yop);
    public List<Book> findAllByYearOfPublishedInAndName(Set<Integer> yop, String name);
    public List<Book> findAllByName(String name);

    @Query(nativeQuery = true, value = "SELECT * FROM bookstore.book WHERE year_of_published IN :yop")
    public List<Book> findAllByYearOfPublishedIn(@Param("yop") Set<Integer> yop);
}
