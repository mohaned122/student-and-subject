package com.mohanned.demo.service;

import com.mohanned.demo.Repository.StudentRepository;
import com.mohanned.demo.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("db")
public class DBStudentService implements StudentService{

    private final StudentRepository repository;

    public DBStudentService(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Student save(Student s) {
        return repository.save(s);
    }

    @Override
    public List<Student> findAllStudent() {
        return repository.findAll();
    }

    @Override
    public Student FindByCin(String cin) {
        return repository.findByCin(cin);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Student update(Student s) {
        return repository.save(s);
    }
}
