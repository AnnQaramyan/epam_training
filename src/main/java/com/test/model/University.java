package com.test.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int universityId;

    @Column
    private String name;

    @Column
    private int year;


   /* @OneToMany
    @JoinColumn(name = "student_id")
    private List<Student> students;

    @OneToOne
    @JoinColumn(name = "library_id")
    private Library library;*/
}
