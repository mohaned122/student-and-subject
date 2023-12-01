package com.mohanned.demo.Repository;

import com.mohanned.demo.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryStudentDao {

    public final List<Student> STUDENTS = new ArrayList<Student>();

    public Student save(Student s) {
        STUDENTS.add(s);
        return s;
    }


    public List<Student> findAllStudent(){
        return STUDENTS;
    }


    public Student FindByCin(String cin) {
        return STUDENTS.stream()
                .filter(s -> cin.equals(s.getCin()))
                .findFirst()
                .orElse(null);
    }


    public void delete(String cin) {
        Student s =  FindByCin(cin);
        if(s != null){
            STUDENTS.remove(s);
        }
    }


    public Student update(Student s) {
        var studentIndex = IntStream.range(0,STUDENTS.size())
                .filter(index -> STUDENTS.get(index).getCin().equals(s.getCin()))
                .findFirst()
                .orElse(-1);
        if(studentIndex != -1){
            STUDENTS.set(studentIndex,s);
            return s;
        }
        return  null;
    }
}
