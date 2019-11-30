package com.mario21ic.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="Student")
public class Student {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @NotBlank(message="Name is mandatory")
    @Column(name="name")
    private String name;

    @NotBlank(message="Name is mandatory")
    @Column(name="email")
    private String email;

    public Student() {}

    public Student(long id, @NotBlank(message = "Name is mandatory") String name, @NotBlank(message = "Name is mandatory") String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
