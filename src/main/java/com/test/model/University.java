package com.test.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private int year;


    @OneToMany(mappedBy = "university_id")
    private List<Student> studentId;

    @OneToOne
    @JoinColumn(name = "university_id")
    Library library_id;
}
