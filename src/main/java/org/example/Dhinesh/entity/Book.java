package org.example.Dhinesh.entity;

import jakarta.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    @Column(name = "year_of_published")
    private Integer yearOfPublished;
    @ManyToOne
    @JoinColumn(name = "author", referencedColumnName = "id", nullable = false)
    private Author author;


    public Book() {}

    public Book(Integer id, String name, String description, Integer year, Author author) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.yearOfPublished = year;
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Integer getYearOfPublished() {
        return yearOfPublished;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setYearOfPublished(Integer yearOfPublished) {
        this.yearOfPublished = yearOfPublished;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

}
