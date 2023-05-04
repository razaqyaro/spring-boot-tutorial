package com.razak.springdemo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

// Controller annotation indicates that the class is a controller component
@RestController // controller annotation - exposing a resource
@RequestMapping("/api/v1/students")  // the parameter is the api resource endpoint
public class StudentController
{

    public StudentController(StudentService service) {
        this.service = service;
    }


    private StudentService service;
    @GetMapping  // Indicate the GET resource. It takes a String parameter which indicates the url
    public List<Student> findAllStudents()
    {
        return service.findAllStudents();
    }
}
