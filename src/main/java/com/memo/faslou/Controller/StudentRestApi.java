package com.memo.faslou.Controller;

import com.memo.faslou.Entities.Student;
import com.memo.faslou.Repository.StudentRepository;
import com.memo.faslou.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@Transactional
@RequestMapping("/api/v1")

@CrossOrigin("http://localhost:4200")
public class StudentRestApi {
    private StudentService studentService;
    private StudentRepository studentRepository;

    public StudentRestApi(StudentRepository studentRepository, StudentService studentService) {
        this.studentRepository = studentRepository;
        this.studentService = studentService;
    }


    @GetMapping(path = "/students")
    @PreAuthorize("hasRole('ADMIN')")

    public List<Student> findAllCustomers() {
        return studentService.getAllStudents();

    }

    @GetMapping(path = "/students/{id}")
    public Student getStudent(@PathVariable String id) {
        return studentService.getOneStudent(id);

    }


    @PostMapping(path = "/students")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")

    public Student AddOneStudent(@RequestBody Student student) {
        student.setId(UUID.randomUUID().toString());
        return studentService.save(student);

    }

    @PutMapping("/students/{id}")

    public Student UpdateStudent(@PathVariable String id, @RequestBody Student student) {

        student.setId(id);
        return studentRepository.save(student);
    }

    @DeleteMapping("/students/{id}")
    public void deleteOneStudent(@PathVariable String id) {
        studentRepository.deleteById(id);
    }
}
