package com.razak.springdemo.student;
import java.time.LocalDate;
public class Student
{
    public Student(String firstname, String lastname, LocalDate dateOfBirth, String email, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.age = age;
    }

    public Student(){

    }

    private String firstname;
    private String lastname;
    private LocalDate dateOfBirth;

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
        return age;
    }

    private String email;
    private int age;


}
