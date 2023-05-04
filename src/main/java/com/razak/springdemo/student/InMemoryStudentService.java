package com.razak.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class InMemoryStudentService implements StudentService
{

    @Override
    public Student save(Student s) {
        return null;
    }

    @Override
    public List<Student> findAllStudents() {
        return List.of(
                new Student(
                        "Jay",
                        "Khan",
                        LocalDate.now(),
                        "razaqyaro@gmail.com",
                        34
                ),
                new Student(
                        "Rahman",
                        "Khan",
                        LocalDate.now(),
                        "razaqyaro@gmail.com",
                        26
                ),
                new Student(
                        "Rahman",
                        "Khan",
                        LocalDate.now(),
                        "razaqyaro@gmail.com",
                        34
                ),
                new Student(
                        "Rahman",
                        "Khan",
                        LocalDate.now(),
                        "razaqyaro@gmail.com",
                        24
                ),
                new Student(
                        "Saed",
                        "Barn",
                        LocalDate.now(),
                        "reyyo@gmail.com",
                        34
                ),
                new Student(
                        "Kwamena",
                        "Attoh",
                        LocalDate.now(),
                        "aro@gmail.com",
                        56
                )
        );
    }

    @Override
    public Student findByEmail(String email) {
        return null;
    }

    @Override
    public Student update(Student s) {
        return null;
    }

    @Override
    public void delete(String email) {

    }
}
