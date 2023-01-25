package com.simple.api.operation.controller;

import org.springframework.web.bind.annotation.RestController;
import com.simple.api.operation.entity.Student;
import com.simple.api.operation.service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class StudentController {
	@Autowired
    private StudentService studentService;

    
    @PostMapping("/saveStudent")
	public Student saveStudent(@RequestBody Student student) {
    	studentService.saveStudent(student);
		return student;
    }
	@GetMapping("/findStudentbyid/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		return studentService.getStudentById(studentId);
	}
    
    
    @GetMapping("/getAllStudents")
    public List<Student>getStudents(Student student) {
		return studentService.getAllStudents(student);
		   
	  }
    
   
    
    @DeleteMapping("/deleteStudentbyId/{studentId}")
	public String deleteStudent(@PathVariable int studentId) {
    	studentService.deleteStudent(studentId);
		return "StudentId with StudentId : " + studentId + " deleted successfully";
	}
    
    @PutMapping("/updatestudent")
    public Student updateStudent(@RequestBody Student student){
    	studentService.saveOrUpdate(student);
    	return student;
       
    }
   
    
  
}



