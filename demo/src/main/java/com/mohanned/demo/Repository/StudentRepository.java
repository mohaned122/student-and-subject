package com.mohanned.demo.Repository;

import com.mohanned.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    Student findByCin(String cin);
    void deleteById(Integer id);
}
