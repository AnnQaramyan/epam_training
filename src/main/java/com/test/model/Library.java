package com.test.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Table(name = "library")
@Entity
public class Library {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private String section;

    @Column
    private int foundationYear;

    @JsonIgnore
    @OneToOne(mappedBy = "library_id")
    private University university_id;

   @OneToMany(mappedBy = "library_id")
   private List<Librarian> librarianId;

}
