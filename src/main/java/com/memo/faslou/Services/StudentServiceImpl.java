package com.memo.faslou.Services;

import com.memo.faslou.Entities.Student;
import com.memo.faslou.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student Update(Student student) {
        Student student1 = studentRepository.getById(student.getId());
        return studentRepository.save(student1);
    }

    @Override
    public Student getOneStudent(String id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
