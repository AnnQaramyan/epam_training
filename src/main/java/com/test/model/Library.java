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
    private int libraryId;

    @Column
    private String name;

    @Column
    private String section;

    @Column
    private int foundationYear;

   /* @JsonIgnore
    @OneToOne
    @JoinColumn(name = "university_id")
    private University university;

   @OneToMany
   @JoinColumn(name = "librarian_id")
   private List<Librarian> librarian;*/

}
