package com.memo.faslou.Services;

import com.memo.faslou.Entities.Student;

import java.util.List;

public interface StudentService {
    Student save (Student student);

    Student Update(Student student);

    Student getOneStudent(String id);

    List<Student> getAllStudents();

}
