package com.razak.springdemo.student;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Table(name = "students_db")
public class Student
{
    @Id
    @GeneratedValue
    private Integer id;
    private String firstname;
    private String lastname;
    private LocalDate dateOfBirth;
    @Column(unique = true)
    private String email;
    @Transient
    private int age;

    public Student(String firstnameIn, String lastnameIn, LocalDate dateOfBirthIn, String emailIn, int ageIn)
    {
        this.firstname = firstnameIn;
        this.lastname = lastnameIn;
        this.dateOfBirth = dateOfBirthIn;
        this.email = emailIn;
        this.age = ageIn;
    }

    public Student(){

    }
    public String getFirstname()
    {
        return firstname;
    }

    public String getLastname()
    {
        return lastname;
    }

    public LocalDate getDate()
    {
        return dateOfBirth;
    }

    public String getEmail()
    {
        return email;
    }

    public int getAge()
    {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }
    public void setFirstname(String firstnameIn)
    {
        this.firstname = firstnameIn;
    }
    public void setLastname(String lastnameIn)
    {
        this.lastname = lastnameIn;
    }

    public void setDateOfBirth(LocalDate dateOfBirthIn)
    {
        this.dateOfBirth = dateOfBirthIn;
    }

    public void setEmail(String emailIn)
    {
        this.email = emailIn;
    }

    public void setAge(int ageIn)
    {
        this.age = ageIn;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public Integer getId()
    {
        return id;
    }


}
