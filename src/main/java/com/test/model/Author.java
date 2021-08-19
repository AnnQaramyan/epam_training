package com.test.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String fullName;

    @ManyToMany(mappedBy = "authorId")
    private List<Book> books;
}
