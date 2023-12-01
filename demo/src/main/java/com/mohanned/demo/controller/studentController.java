package com.mohanned.demo.controller;

import com.mohanned.demo.model.Student;
import com.mohanned.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class studentController {
    private final StudentService service;

    public studentController(
            @Qualifier("db") StudentService service
    ) {
        this.service = service;
    }

    @PostMapping
    public Student save(@RequestBody Student s){
        return  service.save(s);
    }

    @GetMapping
    public List<Student> findAllStudent(){

        return service.findAllStudent();
    }

    @GetMapping("/{cin}")
    public Student findByCin(@PathVariable("cin")  String cin){

        return service.FindByCin(cin);
    }

    @PutMapping
    public  Student updateStudent(@RequestBody Student s){
        return service.update(s);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable("id") Integer id){
        service.delete(id);
    }
}
