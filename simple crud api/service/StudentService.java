package com.simple.api.operation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import com.simple.api.operation.entity.Student;
import com.simple.api.operation.repository.StudentRepository;

@Service
public class StudentService {
	 @Autowired
	    private StudentRepository studentRepository;
	    
	   
	 public Student saveStudent(Student student) {
	        return studentRepository.save(student);
	    }
	   
	 
	 public Student getStudentById(int studentId) {
	        Optional<Student> optionalstudent = studentRepository.findById(studentId);
	        if ( optionalstudent.isPresent()) {
	            return  optionalstudent.get();
	        }
	        else {
	        	System.out.println("No record found"); 
	        }
	        return null;
	    }
	    
	   
	 public List<Student>getAllStudents(Student student) {
			return studentRepository.findAll();
		}
	    
	 
	  
	  public void updateStudent(Student student,int studentId) {
	    	studentRepository.save(student);
	    }
	    
	    
	    
	    public void saveOrUpdate(Student student)   {  
	    	studentRepository.save(student); 
	    }  
	   
	    
	    public void deleteStudent(int studentId) {
	    	studentRepository.deleteById(studentId);
	    }
	    
	  
	  }
	


