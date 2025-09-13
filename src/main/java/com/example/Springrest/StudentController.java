package com.example.Springrest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    //single student data
    @GetMapping("/student")
    public Student getStudent() {
        return new Student("renuka", "Nandikolla");
    }
    //List of students
    @GetMapping("/students")
   public List<Student> getStudents() {
        return Arrays.asList(
                new Student("renuka", "Nandikolla"),
                new Student("umadevi", "Nandikolla"));
   }
   //List of Students
   @GetMapping("/liststudent")
    public List<Student> getListStudent() {
       List<Student> students = new ArrayList<>();
       students.add(new Student("renuka", "Nandikolla"));
       students.add(new Student("umadevi", "Nandikolla"));
       students.add(new Student("sai", "Nandikolla"));
       return students;
   }
   //pathvariable
    @GetMapping("/student/{name}/{surname}")
    public Student StudentPathVariable(@PathVariable("name") String name,@PathVariable("surname") String surname) {
        return new Student(name, surname);
    }
    //Query Parameter
    @GetMapping("/student/query")
    public Student Studentquery(@RequestParam(name="name") String name,@RequestParam(name="surname") String surname) {
        return new Student(name,surname);
    }



}
