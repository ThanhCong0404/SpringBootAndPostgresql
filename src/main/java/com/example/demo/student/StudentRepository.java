package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    // Query để cụ thể hơn hành động truy vấn database , Spring hỗ trợ auto by name function (Optional here)
    //@Query("Select s from student s where s.email = ?1")
    Optional<Student> findStudentByEmail(String email);
}
