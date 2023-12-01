package com.mohanned.demo.service;

import com.mohanned.demo.Repository.InMemoryStudentDao;
import com.mohanned.demo.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service("im")
public class InMemoryStudentService implements StudentService{

    private InMemoryStudentDao dao;

    public InMemoryStudentService(InMemoryStudentDao dao) {
        this.dao = dao;
    }

    @Override
    public Student save(Student s) {
        return this.dao.save(s);
    }

    @Override
    public List<Student> findAllStudent(){
        return dao.findAllStudent();
    }

    @Override
    public Student FindByCin(String cin) {

        return dao.FindByCin(cin);
    }

    @Override
    public void delete(Integer id) {
        dao.delete(String.valueOf(id));
    }

    @Override
    public Student update(Student s) {

        return dao.update(s);
    }
}
