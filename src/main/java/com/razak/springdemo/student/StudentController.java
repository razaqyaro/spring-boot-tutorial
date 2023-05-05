package com.razak.springdemo.student;


import org.springframework.web.bind.annotation.*;

import java.util.List;

// Controller annotation indicates that the class is a controller component
@RestController // controller annotation - exposing a resource
@RequestMapping("/api/v1/students")  // the parameter is the api resource endpoint
public class StudentController
{
    private StudentService service;

    public StudentController(StudentService serviceIn)
    {
        this.service = serviceIn;
    }
    @PostMapping
    public Student save(@RequestBody Student student)
    {
        return service.save(student);
    }

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable("email") String email)
    {
        return service.findByEmail(email);
    }
    @GetMapping  // Indicate the GET resource. It takes a String parameter which indicates the url
    public List<Student> findAllStudents()
    {
        return service.findAllStudents();
    }
    @PutMapping
    public Student updateStudent(@RequestBody Student student)
    {
        return service.update(student);
    }

    @DeleteMapping("/{email}")
    public void delete(@PathVariable("email") String email)
    {
        service.delete(email);
    }
}
