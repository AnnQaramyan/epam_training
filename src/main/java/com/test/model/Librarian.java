package com.test.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Librarian {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private double salary;

    @JsonIgnore
    @JoinColumn(name = "librarian_id")
    @ManyToOne
    private Library libraryId;
}
