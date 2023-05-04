package com.razak.springdemo.student;
import java.time.LocalDate;
public class Student
{
    private String firstname;
    private String lastname;
    private LocalDate dateOfBirth;
    private String email;
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
        return age;
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

}
