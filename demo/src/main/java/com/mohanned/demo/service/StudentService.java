package com.mohanned.demo.service;

import com.mohanned.demo.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public interface StudentService {
     Student save(Student s);
     List<Student> findAllStudent();
     Student FindByCin(String cin);
     void delete(Integer id);
     Student update(Student s);
}
