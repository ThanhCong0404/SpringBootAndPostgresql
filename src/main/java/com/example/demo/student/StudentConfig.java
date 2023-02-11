package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    //CommandLineRunner chi chay duy nhat 1 lan trong suot chuong trinh Spring Boot
    //Fake Date into database
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student A = new Student(
                    "ThanhCong",
                    "Thanhcong04042001@gmail.com",
                    LocalDate.of(2001, Month.APRIL,4)
            );

            Student B = new Student(
                    "BBBBBBBBBB",
                    "BBBBBBBBBB@gmail.com",
                    LocalDate.of(2010, Month.FEBRUARY,6)
            );

            studentRepository.saveAll(
                    List.of(A,B)
            );

        };
    }
}
