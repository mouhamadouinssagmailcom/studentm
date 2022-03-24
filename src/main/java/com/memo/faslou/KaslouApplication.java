package com.memo.faslou;

import com.memo.faslou.Entities.Student;
import com.memo.faslou.Services.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KaslouApplication {

    public static void main(String[] args) {
        SpringApplication.run(KaslouApplication.class, args);
    }

    @Bean
    CommandLineRunner start(StudentService studentService) {
        return args -> {
            studentService.save(new Student("C001", "dama", "fall", "77777889", "pathe@gmailcom", "malika", "l3"));
            studentService.save(new Student("C002", "fatu", "ndiaye", "57777889", "demba@gmailcom", "dakar", "master"));
            studentService.save(new Student("C003", "mama", "diop", "77777889", "fasss@gmailcom", "yeumbeul", "doctorat"));

        };

    }


}
