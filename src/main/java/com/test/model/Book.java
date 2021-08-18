package com.test.model;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String title;

    @Column
    private  String author;

    @Column
    private String genre;

    @Column
    private int year;

    @Column
    private String language;




}
