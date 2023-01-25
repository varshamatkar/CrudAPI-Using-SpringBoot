package com.simple.api.operation.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.simple.api.operation.entity.Student;



@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}